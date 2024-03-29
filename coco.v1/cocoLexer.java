// Generated from coco.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class cocoLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, ID=9, 
		WHITESPACE=10, COMMENT=11, JAVACODE=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "ID", 
			"WHITESPACE", "COMMENT", "JAVACODE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'DATA'", "'WITH'", "'='", "';'", "'|'", "'('", "')'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "ID", "WHITESPACE", 
			"COMMENT", "JAVACODE"
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


	public cocoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "coco.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\16S\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\7\n\64\n\n\f\n\16\n\67"+
		"\13\n\3\13\6\13:\n\13\r\13\16\13;\3\13\3\13\3\f\3\f\3\f\3\f\7\fD\n\f\f"+
		"\f\16\fG\13\f\3\f\3\f\3\r\3\r\7\rM\n\r\f\r\16\rP\13\r\3\r\3\r\2\2\16\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\3\2\7\5\2C\\a"+
		"ac|\b\2\62;>>@@C\\aac|\5\2\13\f\17\17\"\"\3\2\f\f\4\2``\u0080\u0080\2"+
		"V\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\3\33\3\2\2\2\5 \3\2\2\2\7%\3\2\2\2\t\'\3\2\2\2\13)\3\2\2"+
		"\2\r+\3\2\2\2\17-\3\2\2\2\21/\3\2\2\2\23\61\3\2\2\2\259\3\2\2\2\27?\3"+
		"\2\2\2\31J\3\2\2\2\33\34\7F\2\2\34\35\7C\2\2\35\36\7V\2\2\36\37\7C\2\2"+
		"\37\4\3\2\2\2 !\7Y\2\2!\"\7K\2\2\"#\7V\2\2#$\7J\2\2$\6\3\2\2\2%&\7?\2"+
		"\2&\b\3\2\2\2\'(\7=\2\2(\n\3\2\2\2)*\7~\2\2*\f\3\2\2\2+,\7*\2\2,\16\3"+
		"\2\2\2-.\7+\2\2.\20\3\2\2\2/\60\7.\2\2\60\22\3\2\2\2\61\65\t\2\2\2\62"+
		"\64\t\3\2\2\63\62\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66"+
		"\24\3\2\2\2\67\65\3\2\2\28:\t\4\2\298\3\2\2\2:;\3\2\2\2;9\3\2\2\2;<\3"+
		"\2\2\2<=\3\2\2\2=>\b\13\2\2>\26\3\2\2\2?@\7\61\2\2@A\7\61\2\2AE\3\2\2"+
		"\2BD\n\5\2\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FH\3\2\2\2GE\3\2\2"+
		"\2HI\b\f\2\2I\30\3\2\2\2JN\7\u0080\2\2KM\n\6\2\2LK\3\2\2\2MP\3\2\2\2N"+
		"L\3\2\2\2NO\3\2\2\2OQ\3\2\2\2PN\3\2\2\2QR\7`\2\2R\32\3\2\2\2\7\2\65;E"+
		"N\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}