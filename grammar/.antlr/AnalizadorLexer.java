// Generated from c:/Users/usuario/Desktop/Analizador-39568_4/grammar/Analizador.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class AnalizadorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, IDENTIFICADOR=16, 
		DIGITO=17, WS=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "IDENTIFICADOR", 
			"LETRA", "DIGITO", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'variar'", "'desde'", "'hasta'", "'con paso'", "'hacer'", 
			"'fin_variar'", "'<-'", "'escribir'", "'+'", "'-'", "'*'", "'/'", "'('", 
			"')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "IDENTIFICADOR", "DIGITO", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public AnalizadorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Analizador.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0012\u0085\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005"+
		"\u000fs\b\u000f\n\u000f\f\u000fv\t\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0004\u0011{\b\u0011\u000b\u0011\f\u0011|\u0001\u0012\u0004\u0012"+
		"\u0080\b\u0012\u000b\u0012\f\u0012\u0081\u0001\u0012\u0001\u0012\u0000"+
		"\u0000\u0013\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b"+
		"\u000e\u001d\u000f\u001f\u0010!\u0000#\u0011%\u0012\u0001\u0000\u0003"+
		"\u0002\u0000AZaz\u0001\u000009\u0003\u0000\t\n\r\r  \u0088\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000"+
		"\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000"+
		"\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000"+
		"\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000"+
		"\u0000\u0000%\u0001\u0000\u0000\u0000\u0001\'\u0001\u0000\u0000\u0000"+
		"\u0003)\u0001\u0000\u0000\u0000\u00050\u0001\u0000\u0000\u0000\u00076"+
		"\u0001\u0000\u0000\u0000\t<\u0001\u0000\u0000\u0000\u000bE\u0001\u0000"+
		"\u0000\u0000\rK\u0001\u0000\u0000\u0000\u000fV\u0001\u0000\u0000\u0000"+
		"\u0011Y\u0001\u0000\u0000\u0000\u0013b\u0001\u0000\u0000\u0000\u0015d"+
		"\u0001\u0000\u0000\u0000\u0017f\u0001\u0000\u0000\u0000\u0019h\u0001\u0000"+
		"\u0000\u0000\u001bj\u0001\u0000\u0000\u0000\u001dl\u0001\u0000\u0000\u0000"+
		"\u001fn\u0001\u0000\u0000\u0000!w\u0001\u0000\u0000\u0000#z\u0001\u0000"+
		"\u0000\u0000%\u007f\u0001\u0000\u0000\u0000\'(\u0005;\u0000\u0000(\u0002"+
		"\u0001\u0000\u0000\u0000)*\u0005v\u0000\u0000*+\u0005a\u0000\u0000+,\u0005"+
		"r\u0000\u0000,-\u0005i\u0000\u0000-.\u0005a\u0000\u0000./\u0005r\u0000"+
		"\u0000/\u0004\u0001\u0000\u0000\u000001\u0005d\u0000\u000012\u0005e\u0000"+
		"\u000023\u0005s\u0000\u000034\u0005d\u0000\u000045\u0005e\u0000\u0000"+
		"5\u0006\u0001\u0000\u0000\u000067\u0005h\u0000\u000078\u0005a\u0000\u0000"+
		"89\u0005s\u0000\u00009:\u0005t\u0000\u0000:;\u0005a\u0000\u0000;\b\u0001"+
		"\u0000\u0000\u0000<=\u0005c\u0000\u0000=>\u0005o\u0000\u0000>?\u0005n"+
		"\u0000\u0000?@\u0005 \u0000\u0000@A\u0005p\u0000\u0000AB\u0005a\u0000"+
		"\u0000BC\u0005s\u0000\u0000CD\u0005o\u0000\u0000D\n\u0001\u0000\u0000"+
		"\u0000EF\u0005h\u0000\u0000FG\u0005a\u0000\u0000GH\u0005c\u0000\u0000"+
		"HI\u0005e\u0000\u0000IJ\u0005r\u0000\u0000J\f\u0001\u0000\u0000\u0000"+
		"KL\u0005f\u0000\u0000LM\u0005i\u0000\u0000MN\u0005n\u0000\u0000NO\u0005"+
		"_\u0000\u0000OP\u0005v\u0000\u0000PQ\u0005a\u0000\u0000QR\u0005r\u0000"+
		"\u0000RS\u0005i\u0000\u0000ST\u0005a\u0000\u0000TU\u0005r\u0000\u0000"+
		"U\u000e\u0001\u0000\u0000\u0000VW\u0005<\u0000\u0000WX\u0005-\u0000\u0000"+
		"X\u0010\u0001\u0000\u0000\u0000YZ\u0005e\u0000\u0000Z[\u0005s\u0000\u0000"+
		"[\\\u0005c\u0000\u0000\\]\u0005r\u0000\u0000]^\u0005i\u0000\u0000^_\u0005"+
		"b\u0000\u0000_`\u0005i\u0000\u0000`a\u0005r\u0000\u0000a\u0012\u0001\u0000"+
		"\u0000\u0000bc\u0005+\u0000\u0000c\u0014\u0001\u0000\u0000\u0000de\u0005"+
		"-\u0000\u0000e\u0016\u0001\u0000\u0000\u0000fg\u0005*\u0000\u0000g\u0018"+
		"\u0001\u0000\u0000\u0000hi\u0005/\u0000\u0000i\u001a\u0001\u0000\u0000"+
		"\u0000jk\u0005(\u0000\u0000k\u001c\u0001\u0000\u0000\u0000lm\u0005)\u0000"+
		"\u0000m\u001e\u0001\u0000\u0000\u0000nt\u0003!\u0010\u0000os\u0003!\u0010"+
		"\u0000ps\u0003#\u0011\u0000qs\u0005_\u0000\u0000ro\u0001\u0000\u0000\u0000"+
		"rp\u0001\u0000\u0000\u0000rq\u0001\u0000\u0000\u0000sv\u0001\u0000\u0000"+
		"\u0000tr\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000u \u0001\u0000"+
		"\u0000\u0000vt\u0001\u0000\u0000\u0000wx\u0007\u0000\u0000\u0000x\"\u0001"+
		"\u0000\u0000\u0000y{\u0007\u0001\u0000\u0000zy\u0001\u0000\u0000\u0000"+
		"{|\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000"+
		"\u0000}$\u0001\u0000\u0000\u0000~\u0080\u0007\u0002\u0000\u0000\u007f"+
		"~\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u007f"+
		"\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0083"+
		"\u0001\u0000\u0000\u0000\u0083\u0084\u0006\u0012\u0000\u0000\u0084&\u0001"+
		"\u0000\u0000\u0000\u0005\u0000rt|\u0081\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}