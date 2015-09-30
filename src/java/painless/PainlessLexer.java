// Generated from src/java/painless/Painless.g4 by ANTLR 4.5
package painless;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PainlessLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, LBRACK=2, RBRACK=3, LBRACE=4, RBRACE=5, LP=6, RP=7, ASSIGN=8, DOT=9, 
		COMMA=10, SEMICOLON=11, IF=12, ELSE=13, WHILE=14, DO=15, FOR=16, CONTINUE=17, 
		BREAK=18, RETURN=19, BOOLNOT=20, BWNOT=21, MUL=22, DIV=23, REM=24, ADD=25, 
		SUB=26, LSH=27, RSH=28, USH=29, LT=30, LTE=31, GT=32, GTE=33, EQ=34, NE=35, 
		BWAND=36, BWXOR=37, BWOR=38, BOOLAND=39, BOOLOR=40, COND=41, COLON=42, 
		OCTAL=43, HEX=44, INTEGER=45, DECIMAL=46, STRING=47, CHAR=48, TRUE=49, 
		FALSE=50, NULL=51, VOID=52, ID=53;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"WS", "LBRACK", "RBRACK", "LBRACE", "RBRACE", "LP", "RP", "ASSIGN", "DOT", 
		"COMMA", "SEMICOLON", "IF", "ELSE", "WHILE", "DO", "FOR", "CONTINUE", 
		"BREAK", "RETURN", "BOOLNOT", "BWNOT", "MUL", "DIV", "REM", "ADD", "SUB", 
		"LSH", "RSH", "USH", "LT", "LTE", "GT", "GTE", "EQ", "NE", "BWAND", "BWXOR", 
		"BWOR", "BOOLAND", "BOOLOR", "COND", "COLON", "OCTAL", "HEX", "INTEGER", 
		"DECIMAL", "STRING", "CHAR", "TRUE", "FALSE", "NULL", "VOID", "ID"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'{'", "'}'", "'['", "']'", "'('", "')'", "'='", "'.'", "','", 
		"';'", "'if'", "'else'", "'while'", "'do'", "'for'", "'continue'", "'break'", 
		"'return'", "'!'", "'~'", "'*'", "'/'", "'%'", "'+'", "'-'", "'<<'", "'>>'", 
		"'>>>'", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='", "'&'", "'^'", "'|'", 
		"'&&'", "'||'", "'?'", "':'", null, null, null, null, null, null, "'true'", 
		"'false'", "'null'", "'void'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "LBRACK", "RBRACK", "LBRACE", "RBRACE", "LP", "RP", "ASSIGN", 
		"DOT", "COMMA", "SEMICOLON", "IF", "ELSE", "WHILE", "DO", "FOR", "CONTINUE", 
		"BREAK", "RETURN", "BOOLNOT", "BWNOT", "MUL", "DIV", "REM", "ADD", "SUB", 
		"LSH", "RSH", "USH", "LT", "LTE", "GT", "GTE", "EQ", "NE", "BWAND", "BWXOR", 
		"BWOR", "BOOLAND", "BOOLOR", "COND", "COLON", "OCTAL", "HEX", "INTEGER", 
		"DECIMAL", "STRING", "CHAR", "TRUE", "FALSE", "NULL", "VOID", "ID"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public PainlessLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Painless.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\67\u0161\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\3\2\6\2o\n\2\r\2\16\2p\3\2\3\2\3\3\3\3\3\4\3"+
		"\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3 \3 \3 "+
		"\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3(\3)\3"+
		")\3)\3*\3*\3+\3+\3,\3,\6,\u00ee\n,\r,\16,\u00ef\3,\5,\u00f3\n,\3-\3-\3"+
		"-\6-\u00f8\n-\r-\16-\u00f9\3-\5-\u00fd\n-\3.\3.\3.\7.\u0102\n.\f.\16."+
		"\u0105\13.\5.\u0107\n.\3.\5.\u010a\n.\3/\3/\3/\7/\u010f\n/\f/\16/\u0112"+
		"\13/\5/\u0114\n/\3/\3/\7/\u0118\n/\f/\16/\u011b\13/\5/\u011d\n/\3/\3/"+
		"\6/\u0121\n/\r/\16/\u0122\5/\u0125\n/\3/\3/\5/\u0129\n/\3/\6/\u012c\n"+
		"/\r/\16/\u012d\5/\u0130\n/\3/\5/\u0133\n/\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\7\60\u013b\n\60\f\60\16\60\u013e\13\60\3\60\3\60\3\61\3\61\3\61\3\61"+
		"\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64"+
		"\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\66\3\66\7\66\u015d\n\66\f\66\16"+
		"\66\u0160\13\66\3\u013c\2\67\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61"+
		"a\62c\63e\64g\65i\66k\67\3\2\17\5\2\13\f\17\17\"\"\3\2\629\4\2NNnn\4\2"+
		"ZZzz\5\2\62;CHch\3\2\63;\3\2\62;\4\2GGgg\4\2--//\4\2HHhh\4\2$$^^\5\2C"+
		"\\aac|\6\2\62;C\\aac|\u0176\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C"+
		"\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2"+
		"\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2"+
		"\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i"+
		"\3\2\2\2\2k\3\2\2\2\3n\3\2\2\2\5t\3\2\2\2\7v\3\2\2\2\tx\3\2\2\2\13z\3"+
		"\2\2\2\r|\3\2\2\2\17~\3\2\2\2\21\u0080\3\2\2\2\23\u0082\3\2\2\2\25\u0084"+
		"\3\2\2\2\27\u0086\3\2\2\2\31\u0088\3\2\2\2\33\u008b\3\2\2\2\35\u0090\3"+
		"\2\2\2\37\u0096\3\2\2\2!\u0099\3\2\2\2#\u009d\3\2\2\2%\u00a6\3\2\2\2\'"+
		"\u00ac\3\2\2\2)\u00b3\3\2\2\2+\u00b5\3\2\2\2-\u00b7\3\2\2\2/\u00b9\3\2"+
		"\2\2\61\u00bb\3\2\2\2\63\u00bd\3\2\2\2\65\u00bf\3\2\2\2\67\u00c1\3\2\2"+
		"\29\u00c4\3\2\2\2;\u00c7\3\2\2\2=\u00cb\3\2\2\2?\u00cd\3\2\2\2A\u00d0"+
		"\3\2\2\2C\u00d2\3\2\2\2E\u00d5\3\2\2\2G\u00d8\3\2\2\2I\u00db\3\2\2\2K"+
		"\u00dd\3\2\2\2M\u00df\3\2\2\2O\u00e1\3\2\2\2Q\u00e4\3\2\2\2S\u00e7\3\2"+
		"\2\2U\u00e9\3\2\2\2W\u00eb\3\2\2\2Y\u00f4\3\2\2\2[\u0106\3\2\2\2]\u0124"+
		"\3\2\2\2_\u0134\3\2\2\2a\u0141\3\2\2\2c\u0145\3\2\2\2e\u014a\3\2\2\2g"+
		"\u0150\3\2\2\2i\u0155\3\2\2\2k\u015a\3\2\2\2mo\t\2\2\2nm\3\2\2\2op\3\2"+
		"\2\2pn\3\2\2\2pq\3\2\2\2qr\3\2\2\2rs\b\2\2\2s\4\3\2\2\2tu\7}\2\2u\6\3"+
		"\2\2\2vw\7\177\2\2w\b\3\2\2\2xy\7]\2\2y\n\3\2\2\2z{\7_\2\2{\f\3\2\2\2"+
		"|}\7*\2\2}\16\3\2\2\2~\177\7+\2\2\177\20\3\2\2\2\u0080\u0081\7?\2\2\u0081"+
		"\22\3\2\2\2\u0082\u0083\7\60\2\2\u0083\24\3\2\2\2\u0084\u0085\7.\2\2\u0085"+
		"\26\3\2\2\2\u0086\u0087\7=\2\2\u0087\30\3\2\2\2\u0088\u0089\7k\2\2\u0089"+
		"\u008a\7h\2\2\u008a\32\3\2\2\2\u008b\u008c\7g\2\2\u008c\u008d\7n\2\2\u008d"+
		"\u008e\7u\2\2\u008e\u008f\7g\2\2\u008f\34\3\2\2\2\u0090\u0091\7y\2\2\u0091"+
		"\u0092\7j\2\2\u0092\u0093\7k\2\2\u0093\u0094\7n\2\2\u0094\u0095\7g\2\2"+
		"\u0095\36\3\2\2\2\u0096\u0097\7f\2\2\u0097\u0098\7q\2\2\u0098 \3\2\2\2"+
		"\u0099\u009a\7h\2\2\u009a\u009b\7q\2\2\u009b\u009c\7t\2\2\u009c\"\3\2"+
		"\2\2\u009d\u009e\7e\2\2\u009e\u009f\7q\2\2\u009f\u00a0\7p\2\2\u00a0\u00a1"+
		"\7v\2\2\u00a1\u00a2\7k\2\2\u00a2\u00a3\7p\2\2\u00a3\u00a4\7w\2\2\u00a4"+
		"\u00a5\7g\2\2\u00a5$\3\2\2\2\u00a6\u00a7\7d\2\2\u00a7\u00a8\7t\2\2\u00a8"+
		"\u00a9\7g\2\2\u00a9\u00aa\7c\2\2\u00aa\u00ab\7m\2\2\u00ab&\3\2\2\2\u00ac"+
		"\u00ad\7t\2\2\u00ad\u00ae\7g\2\2\u00ae\u00af\7v\2\2\u00af\u00b0\7w\2\2"+
		"\u00b0\u00b1\7t\2\2\u00b1\u00b2\7p\2\2\u00b2(\3\2\2\2\u00b3\u00b4\7#\2"+
		"\2\u00b4*\3\2\2\2\u00b5\u00b6\7\u0080\2\2\u00b6,\3\2\2\2\u00b7\u00b8\7"+
		",\2\2\u00b8.\3\2\2\2\u00b9\u00ba\7\61\2\2\u00ba\60\3\2\2\2\u00bb\u00bc"+
		"\7\'\2\2\u00bc\62\3\2\2\2\u00bd\u00be\7-\2\2\u00be\64\3\2\2\2\u00bf\u00c0"+
		"\7/\2\2\u00c0\66\3\2\2\2\u00c1\u00c2\7>\2\2\u00c2\u00c3\7>\2\2\u00c38"+
		"\3\2\2\2\u00c4\u00c5\7@\2\2\u00c5\u00c6\7@\2\2\u00c6:\3\2\2\2\u00c7\u00c8"+
		"\7@\2\2\u00c8\u00c9\7@\2\2\u00c9\u00ca\7@\2\2\u00ca<\3\2\2\2\u00cb\u00cc"+
		"\7>\2\2\u00cc>\3\2\2\2\u00cd\u00ce\7>\2\2\u00ce\u00cf\7?\2\2\u00cf@\3"+
		"\2\2\2\u00d0\u00d1\7@\2\2\u00d1B\3\2\2\2\u00d2\u00d3\7@\2\2\u00d3\u00d4"+
		"\7?\2\2\u00d4D\3\2\2\2\u00d5\u00d6\7?\2\2\u00d6\u00d7\7?\2\2\u00d7F\3"+
		"\2\2\2\u00d8\u00d9\7#\2\2\u00d9\u00da\7?\2\2\u00daH\3\2\2\2\u00db\u00dc"+
		"\7(\2\2\u00dcJ\3\2\2\2\u00dd\u00de\7`\2\2\u00deL\3\2\2\2\u00df\u00e0\7"+
		"~\2\2\u00e0N\3\2\2\2\u00e1\u00e2\7(\2\2\u00e2\u00e3\7(\2\2\u00e3P\3\2"+
		"\2\2\u00e4\u00e5\7~\2\2\u00e5\u00e6\7~\2\2\u00e6R\3\2\2\2\u00e7\u00e8"+
		"\7A\2\2\u00e8T\3\2\2\2\u00e9\u00ea\7<\2\2\u00eaV\3\2\2\2\u00eb\u00ed\7"+
		"\62\2\2\u00ec\u00ee\t\3\2\2\u00ed\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef"+
		"\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00f3\t\4"+
		"\2\2\u00f2\u00f1\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3X\3\2\2\2\u00f4\u00f5"+
		"\7\62\2\2\u00f5\u00f7\t\5\2\2\u00f6\u00f8\t\6\2\2\u00f7\u00f6\3\2\2\2"+
		"\u00f8\u00f9\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fc"+
		"\3\2\2\2\u00fb\u00fd\t\4\2\2\u00fc\u00fb\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd"+
		"Z\3\2\2\2\u00fe\u0107\7\62\2\2\u00ff\u0103\t\7\2\2\u0100\u0102\t\b\2\2"+
		"\u0101\u0100\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104"+
		"\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u00fe\3\2\2\2\u0106"+
		"\u00ff\3\2\2\2\u0107\u0109\3\2\2\2\u0108\u010a\t\4\2\2\u0109\u0108\3\2"+
		"\2\2\u0109\u010a\3\2\2\2\u010a\\\3\2\2\2\u010b\u0114\7\62\2\2\u010c\u0110"+
		"\t\7\2\2\u010d\u010f\t\b\2\2\u010e\u010d\3\2\2\2\u010f\u0112\3\2\2\2\u0110"+
		"\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110\3\2"+
		"\2\2\u0113\u010b\3\2\2\2\u0113\u010c\3\2\2\2\u0114\u011c\3\2\2\2\u0115"+
		"\u0119\7\60\2\2\u0116\u0118\t\b\2\2\u0117\u0116\3\2\2\2\u0118\u011b\3"+
		"\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011d\3\2\2\2\u011b"+
		"\u0119\3\2\2\2\u011c\u0115\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u0125\3\2"+
		"\2\2\u011e\u0120\7\60\2\2\u011f\u0121\t\b\2\2\u0120\u011f\3\2\2\2\u0121"+
		"\u0122\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0125\3\2"+
		"\2\2\u0124\u0113\3\2\2\2\u0124\u011e\3\2\2\2\u0125\u012f\3\2\2\2\u0126"+
		"\u0128\t\t\2\2\u0127\u0129\t\n\2\2\u0128\u0127\3\2\2\2\u0128\u0129\3\2"+
		"\2\2\u0129\u012b\3\2\2\2\u012a\u012c\t\b\2\2\u012b\u012a\3\2\2\2\u012c"+
		"\u012d\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u0130\3\2"+
		"\2\2\u012f\u0126\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0132\3\2\2\2\u0131"+
		"\u0133\t\13\2\2\u0132\u0131\3\2\2\2\u0132\u0133\3\2\2\2\u0133^\3\2\2\2"+
		"\u0134\u013c\7$\2\2\u0135\u0136\7^\2\2\u0136\u013b\7$\2\2\u0137\u0138"+
		"\7^\2\2\u0138\u013b\7^\2\2\u0139\u013b\n\f\2\2\u013a\u0135\3\2\2\2\u013a"+
		"\u0137\3\2\2\2\u013a\u0139\3\2\2\2\u013b\u013e\3\2\2\2\u013c\u013d\3\2"+
		"\2\2\u013c\u013a\3\2\2\2\u013d\u013f\3\2\2\2\u013e\u013c\3\2\2\2\u013f"+
		"\u0140\7$\2\2\u0140`\3\2\2\2\u0141\u0142\7)\2\2\u0142\u0143\13\2\2\2\u0143"+
		"\u0144\7)\2\2\u0144b\3\2\2\2\u0145\u0146\7v\2\2\u0146\u0147\7t\2\2\u0147"+
		"\u0148\7w\2\2\u0148\u0149\7g\2\2\u0149d\3\2\2\2\u014a\u014b\7h\2\2\u014b"+
		"\u014c\7c\2\2\u014c\u014d\7n\2\2\u014d\u014e\7u\2\2\u014e\u014f\7g\2\2"+
		"\u014ff\3\2\2\2\u0150\u0151\7p\2\2\u0151\u0152\7w\2\2\u0152\u0153\7n\2"+
		"\2\u0153\u0154\7n\2\2\u0154h\3\2\2\2\u0155\u0156\7x\2\2\u0156\u0157\7"+
		"q\2\2\u0157\u0158\7k\2\2\u0158\u0159\7f\2\2\u0159j\3\2\2\2\u015a\u015e"+
		"\t\r\2\2\u015b\u015d\t\16\2\2\u015c\u015b\3\2\2\2\u015d\u0160\3\2\2\2"+
		"\u015e\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015fl\3\2\2\2\u0160\u015e\3"+
		"\2\2\2\30\2p\u00ef\u00f2\u00f9\u00fc\u0103\u0106\u0109\u0110\u0113\u0119"+
		"\u011c\u0122\u0124\u0128\u012d\u012f\u0132\u013a\u013c\u015e\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}