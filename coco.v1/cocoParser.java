// Generated from coco.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class cocoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, ID=9, 
		WHITESPACE=10, COMMENT=11, JAVACODE=12;
	public static final int
		RULE_start = 0, RULE_dataTypeDef = 1, RULE_alternatives = 2, RULE_alternative = 3, 
		RULE_arguments = 4, RULE_argument = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "dataTypeDef", "alternatives", "alternative", "arguments", "argument"
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

	@Override
	public String getGrammarFileName() { return "coco.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public cocoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public DataTypeDefContext dataTypeDef;
		public List<DataTypeDefContext> dtd = new ArrayList<DataTypeDefContext>();
		public TerminalNode EOF() { return getToken(cocoParser.EOF, 0); }
		public List<DataTypeDefContext> dataTypeDef() {
			return getRuleContexts(DataTypeDefContext.class);
		}
		public DataTypeDefContext dataTypeDef(int i) {
			return getRuleContext(DataTypeDefContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cocoListener ) ((cocoListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cocoListener ) ((cocoListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cocoVisitor ) return ((cocoVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(12);
				((StartContext)_localctx).dataTypeDef = dataTypeDef();
				((StartContext)_localctx).dtd.add(((StartContext)_localctx).dataTypeDef);
				}
				}
				setState(15); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			setState(17);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataTypeDefContext extends ParserRuleContext {
		public Token name;
		public Token fun;
		public AlternativesContext as;
		public TerminalNode ID() { return getToken(cocoParser.ID, 0); }
		public TerminalNode JAVACODE() { return getToken(cocoParser.JAVACODE, 0); }
		public AlternativesContext alternatives() {
			return getRuleContext(AlternativesContext.class,0);
		}
		public DataTypeDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataTypeDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cocoListener ) ((cocoListener)listener).enterDataTypeDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cocoListener ) ((cocoListener)listener).exitDataTypeDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cocoVisitor ) return ((cocoVisitor<? extends T>)visitor).visitDataTypeDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeDefContext dataTypeDef() throws RecognitionException {
		DataTypeDefContext _localctx = new DataTypeDefContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_dataTypeDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			match(T__0);
			setState(20);
			((DataTypeDefContext)_localctx).name = match(ID);
			setState(21);
			match(T__1);
			setState(22);
			((DataTypeDefContext)_localctx).fun = match(JAVACODE);
			setState(23);
			match(T__2);
			setState(24);
			((DataTypeDefContext)_localctx).as = alternatives();
			setState(25);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlternativesContext extends ParserRuleContext {
		public AlternativeContext alternative;
		public List<AlternativeContext> as = new ArrayList<AlternativeContext>();
		public List<AlternativeContext> alternative() {
			return getRuleContexts(AlternativeContext.class);
		}
		public AlternativeContext alternative(int i) {
			return getRuleContext(AlternativeContext.class,i);
		}
		public AlternativesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alternatives; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cocoListener ) ((cocoListener)listener).enterAlternatives(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cocoListener ) ((cocoListener)listener).exitAlternatives(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cocoVisitor ) return ((cocoVisitor<? extends T>)visitor).visitAlternatives(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlternativesContext alternatives() throws RecognitionException {
		AlternativesContext _localctx = new AlternativesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_alternatives);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			((AlternativesContext)_localctx).alternative = alternative();
			((AlternativesContext)_localctx).as.add(((AlternativesContext)_localctx).alternative);
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(28);
				match(T__4);
				setState(29);
				((AlternativesContext)_localctx).alternative = alternative();
				((AlternativesContext)_localctx).as.add(((AlternativesContext)_localctx).alternative);
				}
				}
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlternativeContext extends ParserRuleContext {
		public Token cons;
		public ArgumentsContext as;
		public Token code;
		public TerminalNode ID() { return getToken(cocoParser.ID, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode JAVACODE() { return getToken(cocoParser.JAVACODE, 0); }
		public AlternativeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alternative; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cocoListener ) ((cocoListener)listener).enterAlternative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cocoListener ) ((cocoListener)listener).exitAlternative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cocoVisitor ) return ((cocoVisitor<? extends T>)visitor).visitAlternative(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlternativeContext alternative() throws RecognitionException {
		AlternativeContext _localctx = new AlternativeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_alternative);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			((AlternativeContext)_localctx).cons = match(ID);
			setState(36);
			match(T__5);
			setState(37);
			((AlternativeContext)_localctx).as = arguments();
			setState(38);
			match(T__6);
			setState(39);
			((AlternativeContext)_localctx).code = match(JAVACODE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public ArgumentContext argument;
		public List<ArgumentContext> as = new ArrayList<ArgumentContext>();
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cocoListener ) ((cocoListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cocoListener ) ((cocoListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cocoVisitor ) return ((cocoVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			((ArgumentsContext)_localctx).argument = argument();
			((ArgumentsContext)_localctx).as.add(((ArgumentsContext)_localctx).argument);
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(42);
				match(T__7);
				setState(43);
				((ArgumentsContext)_localctx).argument = argument();
				((ArgumentsContext)_localctx).as.add(((ArgumentsContext)_localctx).argument);
				}
				}
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentContext extends ParserRuleContext {
		public Token type;
		public Token name;
		public List<TerminalNode> ID() { return getTokens(cocoParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(cocoParser.ID, i);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cocoListener ) ((cocoListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cocoListener ) ((cocoListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cocoVisitor ) return ((cocoVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			((ArgumentContext)_localctx).type = match(ID);
			setState(50);
			((ArgumentContext)_localctx).name = match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\16\67\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\6\2\20\n\2\r\2\16\2\21\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\7\4!\n\4\f\4\16\4$\13\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\7\6/\n\6\f\6\16\6\62\13\6\3\7\3\7"+
		"\3\7\3\7\2\2\b\2\4\6\b\n\f\2\2\2\63\2\17\3\2\2\2\4\25\3\2\2\2\6\35\3\2"+
		"\2\2\b%\3\2\2\2\n+\3\2\2\2\f\63\3\2\2\2\16\20\5\4\3\2\17\16\3\2\2\2\20"+
		"\21\3\2\2\2\21\17\3\2\2\2\21\22\3\2\2\2\22\23\3\2\2\2\23\24\7\2\2\3\24"+
		"\3\3\2\2\2\25\26\7\3\2\2\26\27\7\13\2\2\27\30\7\4\2\2\30\31\7\16\2\2\31"+
		"\32\7\5\2\2\32\33\5\6\4\2\33\34\7\6\2\2\34\5\3\2\2\2\35\"\5\b\5\2\36\37"+
		"\7\7\2\2\37!\5\b\5\2 \36\3\2\2\2!$\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#\7\3"+
		"\2\2\2$\"\3\2\2\2%&\7\13\2\2&\'\7\b\2\2\'(\5\n\6\2()\7\t\2\2)*\7\16\2"+
		"\2*\t\3\2\2\2+\60\5\f\7\2,-\7\n\2\2-/\5\f\7\2.,\3\2\2\2/\62\3\2\2\2\60"+
		".\3\2\2\2\60\61\3\2\2\2\61\13\3\2\2\2\62\60\3\2\2\2\63\64\7\13\2\2\64"+
		"\65\7\13\2\2\65\r\3\2\2\2\5\21\"\60";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}