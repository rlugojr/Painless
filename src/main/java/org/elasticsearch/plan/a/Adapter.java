/*
 * Licensed to Elasticsearch under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.elasticsearch.plan.a;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

import static org.elasticsearch.plan.a.Definition.*;
import static org.elasticsearch.plan.a.PlanAParser.*;

class Adapter {
    static class StatementMetadata {
        final ParserRuleContext source;

        boolean allExit;
        boolean allReturn;
        boolean anyReturn;
        boolean allBreak;
        boolean anyBreak;
        boolean allContinue;
        boolean anyContinue;

        private StatementMetadata(final ParserRuleContext source) {
            this.source = source;

            allExit = false;
            allReturn = false;
            anyReturn = false;
            allBreak = false;
            anyBreak = false;
            allContinue = false;
            anyContinue = false;
        }
    }

    static class ExpressionMetadata {
        final ParserRuleContext source;

        boolean statement;

        Object preConst;
        Object postConst;
        boolean isNull;

        Type to;
        Type from;
        Object promotion;
        boolean explicit;

        Cast cast;

        private ExpressionMetadata(final ParserRuleContext source) {
            this.source = source;

            statement = false;

            preConst = null;
            postConst = null;
            isNull = false;

            to = null;
            from = null;
            promotion = null;
            explicit = false;

            cast = null;
        }
    }

    static class ExternalMetadata {
        final ParserRuleContext source;

        boolean read;
        ParserRuleContext storeExpr;
        int token;
        boolean pre;
        boolean post;

        int scope;
        Type current;
        boolean statik;
        boolean statement;

        private ExternalMetadata(final ParserRuleContext source) {
            this.source = source;

            read = false;
            storeExpr = null;
            token = 0;
            pre = false;
            post = false;

            scope = 0;
            current = null;
            statik = false;
            statement = false;
        }
    }

    static class ExtNodeMetadata {
        final ParserRuleContext parent;
        final ParserRuleContext source;

        Object target;
        boolean last;

        Type type;
        Type promote;

        Cast castFrom;
        Cast castTo;

        private ExtNodeMetadata(final ParserRuleContext parent, final ParserRuleContext source) {
            this.parent = parent;
            this.source = source;

            target = null;
            last = false;

            type = null;
            promote = null;

            castFrom = null;
            castTo = null;
        }
    }

    static class Branch {
        final ParserRuleContext source;

        Label begin;
        Label end;
        Label tru;
        Label fals;

        private Branch(final ParserRuleContext source) {
            this.source = source;

            begin = null;
            end = null;
            tru = null;
            fals = null;
        }
    }

    static String error(final ParserRuleContext ctx) {
        return "Error [" + ctx.getStart().getLine() + ":" + ctx.getStart().getCharPositionInLine() + "]: ";
    }

    final Definition definition;
    final String source;
    final ParserRuleContext root;

    private final Map<ParserRuleContext, StatementMetadata> statementMetadata;
    private final Map<ParserRuleContext, ExpressionMetadata> expressionMetadata;
    private final Map<ParserRuleContext, ExternalMetadata> externalMetadata;
    private final Map<ParserRuleContext, ExtNodeMetadata> extNodeMetadata;

    private final Map<ParserRuleContext, Branch> branches;
    private final Deque<Branch> jumps;
    private final Set<ParserRuleContext> strings;
    
    final CompilerSettings settings;

    Adapter(final Definition definition, final String source, final ParserRuleContext root, CompilerSettings settings) {
        this.definition = definition;
        this.source = source;
        this.root = root;
        this.settings = settings;

        statementMetadata = new HashMap<>();
        expressionMetadata = new HashMap<>();
        externalMetadata = new HashMap<>();
        extNodeMetadata = new HashMap<>();

        branches = new HashMap<>();
        jumps = new ArrayDeque<>();
        strings = new HashSet<>();
    }

    StatementMetadata createStatementMetadata(final ParserRuleContext source) {
        final StatementMetadata sourcesmd = new StatementMetadata(source);
        statementMetadata.put(source, sourcesmd);

        return sourcesmd;
    }

    StatementMetadata getStatementMetadata(final ParserRuleContext source) {
        final StatementMetadata sourcesmd = statementMetadata.get(source);

        if (sourcesmd == null) {
            throw new IllegalStateException(error(source) + "Statement metadata does not exist at" +
                    " the parse node with text [" + source.getText() + "].");
        }

        return sourcesmd;
    }

    ExpressionContext updateExpressionTree(ExpressionContext source) {
        if (source instanceof PrecedenceContext) {
            final ParserRuleContext parent = source.getParent();
            int index = 0;

            for (final ParseTree child : parent.children) {
                if (child == source) {
                    break;
                }

                ++index;
            }

            while (source instanceof PrecedenceContext) {
                source = ((PrecedenceContext)source).expression();
            }

            parent.children.set(index, source);
        }

        return source;
    }

    ExpressionMetadata createExpressionMetadata(ParserRuleContext source) {
        final ExpressionMetadata sourceemd = new ExpressionMetadata(source);
        expressionMetadata.put(source, sourceemd);

        return sourceemd;
    }
    
    ExpressionMetadata getExpressionMetadata(final ParserRuleContext source) {
        final ExpressionMetadata sourceemd = expressionMetadata.get(source);

        if (sourceemd == null) {
            throw new IllegalStateException(error(source) + "Expression metadata does not exist at" +
                    " the parse node with text [" + source.getText() + "].");
        }

        return sourceemd;
    }

    ExternalMetadata createExternalMetadata(final ParserRuleContext source) {
        final ExternalMetadata sourceemd = new ExternalMetadata(source);
        externalMetadata.put(source, sourceemd);

        return sourceemd;
    }

    ExternalMetadata getExternalMetadata(final ParserRuleContext source) {
        final ExternalMetadata sourceemd = externalMetadata.get(source);

        if (sourceemd == null) {
            throw new IllegalStateException(error(source) + "External metadata does not exist at" +
                    " the parse node with text [" + source.getText() + "].");
        }

        return sourceemd;
    }

    ExtNodeMetadata createExtNodeMetadata(final ParserRuleContext parent, final ParserRuleContext source) {
        final ExtNodeMetadata sourceemd = new ExtNodeMetadata(parent, source);
        extNodeMetadata.put(source, sourceemd);

        return sourceemd;
    }

    ExtNodeMetadata getExtNodeMetadata(final ParserRuleContext source) {
        final ExtNodeMetadata sourceemd = extNodeMetadata.get(source);

        if (sourceemd == null) {
            throw new IllegalStateException(error(source) + "External metadata does not exist at" +
                    " the parse node with text [" + source.getText() + "].");
        }

        return sourceemd;
    }

    Branch markBranch(final ParserRuleContext source, final ParserRuleContext... nodes) {
        final Branch branch = new Branch(source);

        for (final ParserRuleContext node : nodes) {
            branches.put(node, branch);
        }

        return branch;
    }

    void copyBranch(final Branch branch, final ParserRuleContext... nodes) {
        for (final ParserRuleContext node : nodes) {
            branches.put(node, branch);
        }
    }

    Branch getBranch(final ParserRuleContext source) {
        return branches.get(source);
    }

    void checkWriteBranch(final MethodVisitor visitor, final ParserRuleContext source) {
        final Branch branch = getBranch(source);

        if (branch != null) {
            if (branch.tru != null) {
                visitor.visitJumpInsn(Opcodes.IFNE, branch.tru);
            } else if (branch.fals != null) {
                visitor.visitJumpInsn(Opcodes.IFEQ, branch.fals);
            }
        }
    }

    void pushJump(final Branch branch) {
        jumps.push(branch);
    }

    Branch peekJump() {
        return jumps.peek();
    }

    void popJump() {
        jumps.pop();
    }

    void markStrings(final ParserRuleContext node) {
        strings.add(node);
    }

    void unmarkStrings(final ParserRuleContext node) {
        strings.remove(node);
    }

    boolean getStrings(final ParserRuleContext node) {
        return strings.contains(node);
    }
}
