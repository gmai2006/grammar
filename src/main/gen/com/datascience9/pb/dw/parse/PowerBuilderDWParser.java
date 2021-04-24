// Generated from /backup/apps/grammars/src/main/java/com/datascience9/pb/dw/parse/PowerBuilderDWParser.g4 by ANTLR 4.9.1
package com.datascience9.pb.dw.parse;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PowerBuilderDWParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TABLE=1, COLUMN=2, RETRIEVE=3, PBSELECT=4, VERSION=5, ARGUMENTS=6, SORT=7, 
		ANY=8, BLOB=9, BOOLEAN=10, BYTE=11, CHARACTER=12, CHAR=13, DATA=14, DATE_TYPE=15, 
		DATETIME=16, DECIMAL=17, DEC=18, DOUBLE=19, INTEGER=20, INT=21, LONG=22, 
		LONGLONG=23, NUMBERTYPE=24, REAL=25, STRING=26, TIME_TYPE=27, UNSIGNEDINTEGER=28, 
		UINT=29, UNDERSCORE=30, UNSIGNEDLONG=31, ULONG=32, WINDOW=33, TRUE=34, 
		FALSE=35, GLOBAL=36, SHARED=37, END=38, INDIRECT=39, VARIABLES=40, FORWARD=41, 
		PUBLIC=42, PRIVATE=43, FUNCTION=44, SUBROUTINE=45, READONLY=46, PROTOTYPES=47, 
		TYPE=48, TO=49, FROM=50, REF=51, NULL_=52, UPDATE=53, DYNAMIC=54, WITHIN=55, 
		PRIVATEWRITE=56, PROTECTED=57, PRIVATEREAD=58, PROTECTEDREAD=59, PROTECTEDWRITE=60, 
		LOCAL=61, EVENT=62, OPEN=63, GOTO=64, ELSE=65, IF=66, THEN=67, ELSEIF=68, 
		TRY=69, EXIT=70, CHOOSE=71, IS=72, CONTINUE=73, DO=74, WHILE=75, FOR=76, 
		CLOSE=77, NEXT=78, LOOP=79, UNTIL=80, STEP=81, CATCH=82, FINALLY=83, THROW=84, 
		RELEASE=85, CREATE=86, DESTROY=87, USING=88, POST=89, TRIGGER=90, SELECT=91, 
		DELETE=92, INSERT=93, DESCRIBE=94, RETURN=95, OR=96, AND=97, NOT=98, CALL=99, 
		HALT=100, SUPER=101, LIBRARY=102, SYSTEM=103, RPCFUNC=104, ALIAS=105, 
		THROWS=106, AUTOINSTANTIATE=107, DESCRIPTOR=108, STORAGE=109, PROCEDURE=110, 
		TILDA=111, EQ=112, GT=113, GTE=114, LT=115, LTE=116, GTLT=117, PLUS=118, 
		MINUS=119, PLUSEQ=120, MINUSEQ=121, COLONCOLON=122, MULT=123, DIV=124, 
		MULTEQ=125, DIVEQ=126, CARAT=127, LCURLY=128, RCURLY=129, LBRACE=130, 
		RBRACE=131, BRACES=132, TICK=133, DQUOTED_STRING=134, QUOTED_STRING=135, 
		COMMA=136, SEMI=137, LPAREN=138, RPAREN=139, COLON=140, DQUOTE=141, TQ=142, 
		DOUBLE_PIPE=143, DOTDOTDOT=144, NUMBER=145, DOT=146, DATE=147, TIME=148, 
		BINDPAR=149, ENUM=150, ID=151, EXPORT_HEADER=152, LINE_CONTINUATION=153, 
		SL_COMMENT=154, ML_COMMENT=155, WS=156;
	public static final int
		RULE_start_rule = 0, RULE_data_window_property = 1, RULE_window_property = 2, 
		RULE_prop = 3, RULE_rhs_list = 4, RULE_lhs = 5, RULE_rhs = 6, RULE_prop_value = 7, 
		RULE_table_decl = 8, RULE_data_storage = 9, RULE_table_column = 10, RULE_column_type = 11, 
		RULE_retrieve = 12, RULE_update_clause = 13, RULE_procedure = 14, RULE_argument_clause = 15, 
		RULE_argument_attribute = 16, RULE_sort_clause = 17, RULE_value = 18, 
		RULE_identifier = 19, RULE_data_type_sub = 20, RULE_data_type_name = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"start_rule", "data_window_property", "window_property", "prop", "rhs_list", 
			"lhs", "rhs", "prop_value", "table_decl", "data_storage", "table_column", 
			"column_type", "retrieve", "update_clause", "procedure", "argument_clause", 
			"argument_attribute", "sort_clause", "value", "identifier", "data_type_sub", 
			"data_type_name"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "'~'", "'='", "'>'", "'>='", "'<'", "'<='", "'<>'", 
			"'+'", "'-'", "'+='", "'-='", "'::'", "'*'", "'/'", "'*='", "'/='", "'^'", 
			"'{'", "'}'", "'['", "']'", "'[]'", "'`'", null, null, "','", "';'", 
			"'('", "')'", "':'", "'\"'", "'???'", "'||'", "'...'", null, "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TABLE", "COLUMN", "RETRIEVE", "PBSELECT", "VERSION", "ARGUMENTS", 
			"SORT", "ANY", "BLOB", "BOOLEAN", "BYTE", "CHARACTER", "CHAR", "DATA", 
			"DATE_TYPE", "DATETIME", "DECIMAL", "DEC", "DOUBLE", "INTEGER", "INT", 
			"LONG", "LONGLONG", "NUMBERTYPE", "REAL", "STRING", "TIME_TYPE", "UNSIGNEDINTEGER", 
			"UINT", "UNDERSCORE", "UNSIGNEDLONG", "ULONG", "WINDOW", "TRUE", "FALSE", 
			"GLOBAL", "SHARED", "END", "INDIRECT", "VARIABLES", "FORWARD", "PUBLIC", 
			"PRIVATE", "FUNCTION", "SUBROUTINE", "READONLY", "PROTOTYPES", "TYPE", 
			"TO", "FROM", "REF", "NULL_", "UPDATE", "DYNAMIC", "WITHIN", "PRIVATEWRITE", 
			"PROTECTED", "PRIVATEREAD", "PROTECTEDREAD", "PROTECTEDWRITE", "LOCAL", 
			"EVENT", "OPEN", "GOTO", "ELSE", "IF", "THEN", "ELSEIF", "TRY", "EXIT", 
			"CHOOSE", "IS", "CONTINUE", "DO", "WHILE", "FOR", "CLOSE", "NEXT", "LOOP", 
			"UNTIL", "STEP", "CATCH", "FINALLY", "THROW", "RELEASE", "CREATE", "DESTROY", 
			"USING", "POST", "TRIGGER", "SELECT", "DELETE", "INSERT", "DESCRIBE", 
			"RETURN", "OR", "AND", "NOT", "CALL", "HALT", "SUPER", "LIBRARY", "SYSTEM", 
			"RPCFUNC", "ALIAS", "THROWS", "AUTOINSTANTIATE", "DESCRIPTOR", "STORAGE", 
			"PROCEDURE", "TILDA", "EQ", "GT", "GTE", "LT", "LTE", "GTLT", "PLUS", 
			"MINUS", "PLUSEQ", "MINUSEQ", "COLONCOLON", "MULT", "DIV", "MULTEQ", 
			"DIVEQ", "CARAT", "LCURLY", "RCURLY", "LBRACE", "RBRACE", "BRACES", "TICK", 
			"DQUOTED_STRING", "QUOTED_STRING", "COMMA", "SEMI", "LPAREN", "RPAREN", 
			"COLON", "DQUOTE", "TQ", "DOUBLE_PIPE", "DOTDOTDOT", "NUMBER", "DOT", 
			"DATE", "TIME", "BINDPAR", "ENUM", "ID", "EXPORT_HEADER", "LINE_CONTINUATION", 
			"SL_COMMENT", "ML_COMMENT", "WS"
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
	public String getGrammarFileName() { return "PowerBuilderDWParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PowerBuilderDWParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Start_ruleContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(PowerBuilderDWParser.EOF, 0); }
		public TerminalNode RELEASE() { return getToken(PowerBuilderDWParser.RELEASE, 0); }
		public TerminalNode NUMBER() { return getToken(PowerBuilderDWParser.NUMBER, 0); }
		public TerminalNode SEMI() { return getToken(PowerBuilderDWParser.SEMI, 0); }
		public List<Window_propertyContext> window_property() {
			return getRuleContexts(Window_propertyContext.class);
		}
		public Window_propertyContext window_property(int i) {
			return getRuleContext(Window_propertyContext.class,i);
		}
		public Table_declContext table_decl() {
			return getRuleContext(Table_declContext.class,0);
		}
		public List<Data_window_propertyContext> data_window_property() {
			return getRuleContexts(Data_window_propertyContext.class);
		}
		public Data_window_propertyContext data_window_property(int i) {
			return getRuleContext(Data_window_propertyContext.class,i);
		}
		public Start_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowerBuilderDWParserListener ) ((PowerBuilderDWParserListener)listener).enterStart_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowerBuilderDWParserListener ) ((PowerBuilderDWParserListener)listener).exitStart_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PowerBuilderDWParserVisitor ) return ((PowerBuilderDWParserVisitor<? extends T>)visitor).visitStart_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Start_ruleContext start_rule() throws RecognitionException {
		Start_ruleContext _localctx = new Start_ruleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start_rule);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RELEASE) {
				{
				setState(44);
				match(RELEASE);
				setState(45);
				match(NUMBER);
				setState(46);
				match(SEMI);
				}
			}

			setState(52);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(49);
					window_property();
					}
					} 
				}
				setState(54);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TABLE) {
				{
				setState(55);
				table_decl();
				}
			}

			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COLUMN || _la==DATA || _la==ID) {
				{
				setState(60);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(58);
					data_window_property();
					}
					break;
				case 2:
					{
					setState(59);
					window_property();
					}
					break;
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(65);
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

	public static class Data_window_propertyContext extends ParserRuleContext {
		public TerminalNode DATA() { return getToken(PowerBuilderDWParser.DATA, 0); }
		public TerminalNode LPAREN() { return getToken(PowerBuilderDWParser.LPAREN, 0); }
		public Rhs_listContext rhs_list() {
			return getRuleContext(Rhs_listContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PowerBuilderDWParser.RPAREN, 0); }
		public Data_window_propertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_window_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowerBuilderDWParserListener ) ((PowerBuilderDWParserListener)listener).enterData_window_property(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowerBuilderDWParserListener ) ((PowerBuilderDWParserListener)listener).exitData_window_property(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PowerBuilderDWParserVisitor ) return ((PowerBuilderDWParserVisitor<? extends T>)visitor).visitData_window_property(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Data_window_propertyContext data_window_property() throws RecognitionException {
		Data_window_propertyContext _localctx = new Data_window_propertyContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_data_window_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(DATA);
			setState(68);
			match(LPAREN);
			setState(69);
			rhs_list();
			setState(70);
			match(RPAREN);
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

	public static class Window_propertyContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(PowerBuilderDWParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PowerBuilderDWParser.RPAREN, 0); }
		public List<PropContext> prop() {
			return getRuleContexts(PropContext.class);
		}
		public PropContext prop(int i) {
			return getRuleContext(PropContext.class,i);
		}
		public Window_propertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowerBuilderDWParserListener ) ((PowerBuilderDWParserListener)listener).enterWindow_property(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowerBuilderDWParserListener ) ((PowerBuilderDWParserListener)listener).exitWindow_property(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PowerBuilderDWParserVisitor ) return ((PowerBuilderDWParserVisitor<? extends T>)visitor).visitWindow_property(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Window_propertyContext window_property() throws RecognitionException {
		Window_propertyContext _localctx = new Window_propertyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_window_property);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			identifier();
			setState(73);
			match(LPAREN);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COLUMN) | (1L << DATA) | (1L << UPDATE))) != 0) || _la==ID) {
				{
				{
				setState(74);
				prop();
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
			match(RPAREN);
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

	public static class PropContext extends ParserRuleContext {
		public LhsContext lhs() {
			return getRuleContext(LhsContext.class,0);
		}
		public TerminalNode EQ() { return getToken(PowerBuilderDWParser.EQ, 0); }
		public Rhs_listContext rhs_list() {
			return getRuleContext(Rhs_listContext.class,0);
		}
		public PropContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowerBuilderDWParserListener ) ((PowerBuilderDWParserListener)listener).enterProp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowerBuilderDWParserListener ) ((PowerBuilderDWParserListener)listener).exitProp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PowerBuilderDWParserVisitor ) return ((PowerBuilderDWParserVisitor<? extends T>)visitor).visitProp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropContext prop() throws RecognitionException {
		PropContext _localctx = new PropContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_prop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			lhs();
			setState(83);
			match(EQ);
			setState(84);
			rhs_list();
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

	public static class Rhs_listContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(PowerBuilderDWParser.LPAREN, 0); }
		public Rhs_listContext rhs_list() {
			return getRuleContext(Rhs_listContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PowerBuilderDWParser.RPAREN, 0); }
		public List<RhsContext> rhs() {
			return getRuleContexts(RhsContext.class);
		}
		public RhsContext rhs(int i) {
			return getRuleContext(RhsContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PowerBuilderDWParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PowerBuilderDWParser.COMMA, i);
		}
		public Rhs_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rhs_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowerBuilderDWParserListener ) ((PowerBuilderDWParserListener)listener).enterRhs_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowerBuilderDWParserListener ) ((PowerBuilderDWParserListener)listener).exitRhs_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PowerBuilderDWParserVisitor ) return ((PowerBuilderDWParserVisitor<? extends T>)visitor).visitRhs_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rhs_listContext rhs_list() throws RecognitionException {
		Rhs_listContext _localctx = new Rhs_listContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_rhs_list);
		int _la;
		try {
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				match(LPAREN);
				setState(87);
				rhs_list();
				setState(88);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				rhs();
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(91);
					match(COMMA);
					setState(93);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						setState(92);
						rhs();
						}
						break;
					}
					}
					}
					setState(99);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
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

	public static class LhsContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode UPDATE() { return getToken(PowerBuilderDWParser.UPDATE, 0); }
		public LhsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lhs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowerBuilderDWParserListener ) ((PowerBuilderDWParserListener)listener).enterLhs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowerBuilderDWParserListener ) ((PowerBuilderDWParserListener)listener).exitLhs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PowerBuilderDWParserVisitor ) return ((PowerBuilderDWParserVisitor<? extends T>)visitor).visitLhs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LhsContext lhs() throws RecognitionException {
		LhsContext _localctx = new LhsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_lhs);
		try {
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COLUMN:
			case DATA:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				identifier();
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				match(UPDATE);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class RhsContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(PowerBuilderDWParser.LPAREN, 0); }
		public RhsContext rhs() {
			return getRuleContext(RhsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PowerBuilderDWParser.RPAREN, 0); }
		public TerminalNode NUMBER() { return getToken(PowerBuilderDWParser.NUMBER, 0); }
		public Prop_valueContext prop_value() {
			return getRuleContext(Prop_valueContext.class,0);
		}
		public TerminalNode UPDATE() { return getToken(PowerBuilderDWParser.UPDATE, 0); }
		public TerminalNode ANY() { return getToken(PowerBuilderDWParser.ANY, 0); }
		public TerminalNode COLUMN() { return getToken(PowerBuilderDWParser.COLUMN, 0); }
		public TerminalNode DQUOTED_STRING() { return getToken(PowerBuilderDWParser.DQUOTED_STRING, 0); }
		public TerminalNode DATE() { return getToken(PowerBuilderDWParser.DATE, 0); }
		public RhsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rhs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowerBuilderDWParserListener ) ((PowerBuilderDWParserListener)listener).enterRhs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowerBuilderDWParserListener ) ((PowerBuilderDWParserListener)listener).exitRhs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PowerBuilderDWParserVisitor ) return ((PowerBuilderDWParserVisitor<? extends T>)visitor).visitRhs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RhsContext rhs() throws RecognitionException {
		RhsContext _localctx = new RhsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_rhs);
		try {
			setState(117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				match(LPAREN);
				setState(107);
				rhs();
				setState(108);
				match(RPAREN);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				match(NUMBER);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(111);
				prop_value();
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(112);
				match(UPDATE);
				}
				break;
			case ANY:
				enterOuterAlt(_localctx, 5);
				{
				setState(113);
				match(ANY);
				}
				break;
			case COLUMN:
				enterOuterAlt(_localctx, 6);
				{
				setState(114);
				match(COLUMN);
				}
				break;
			case DQUOTED_STRING:
				enterOuterAlt(_localctx, 7);
				{
				setState(115);
				match(DQUOTED_STRING);
				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 8);
				{
				setState(116);
				match(DATE);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Prop_valueContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PowerBuilderDWParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PowerBuilderDWParser.ID, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(PowerBuilderDWParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(PowerBuilderDWParser.NUMBER, i);
		}
		public List<TerminalNode> DOT() { return getTokens(PowerBuilderDWParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(PowerBuilderDWParser.DOT, i);
		}
		public Prop_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prop_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowerBuilderDWParserListener ) ((PowerBuilderDWParserListener)listener).enterProp_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowerBuilderDWParserListener ) ((PowerBuilderDWParserListener)listener).exitProp_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PowerBuilderDWParserVisitor ) return ((PowerBuilderDWParserVisitor<? extends T>)visitor).visitProp_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Prop_valueContext prop_value() throws RecognitionException {
		Prop_valueContext _localctx = new Prop_valueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_prop_value);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(ID);
			setState(126);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(121);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==DOT) {
						{
						setState(120);
						match(DOT);
						}
					}

					setState(123);
					_la = _input.LA(1);
					if ( !(_la==NUMBER || _la==ID) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(128);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class Table_declContext extends ParserRuleContext {
		public TerminalNode TABLE() { return getToken(PowerBuilderDWParser.TABLE, 0); }
		public TerminalNode LPAREN() { return getToken(PowerBuilderDWParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PowerBuilderDWParser.RPAREN, 0); }
		public List<Table_columnContext> table_column() {
			return getRuleContexts(Table_columnContext.class);
		}
		public Table_columnContext table_column(int i) {
			return getRuleContext(Table_columnContext.class,i);
		}
		public List<RetrieveContext> retrieve() {
			return getRuleContexts(RetrieveContext.class);
		}
		public RetrieveContext retrieve(int i) {
			return getRuleContext(RetrieveContext.class,i);
		}
		public List<ProcedureContext> procedure() {
			return getRuleContexts(ProcedureContext.class);
		}
		public ProcedureContext procedure(int i) {
			return getRuleContext(ProcedureContext.class,i);
		}
		public List<Sort_clauseContext> sort_clause() {
			return getRuleContexts(Sort_clauseContext.class);
		}
		public Sort_clauseContext sort_clause(int i) {
			return getRuleContext(Sort_clauseContext.class,i);
		}
		public List<Data_storageContext> data_storage() {
			return getRuleContexts(Data_storageContext.class);
		}
		public Data_storageContext data_storage(int i) {
			return getRuleContext(Data_storageContext.class,i);
		}
		public List<Update_clauseContext> update_clause() {
			return getRuleContexts(Update_clauseContext.class);
		}
		public Update_clauseContext update_clause(int i) {
			return getRuleContext(Update_clauseContext.class,i);
		}
		public Table_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowerBuilderDWParserListener ) ((PowerBuilderDWParserListener)listener).enterTable_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowerBuilderDWParserListener ) ((PowerBuilderDWParserListener)listener).exitTable_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PowerBuilderDWParserVisitor ) return ((PowerBuilderDWParserVisitor<? extends T>)visitor).visitTable_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_declContext table_decl() throws RecognitionException {
		Table_declContext _localctx = new Table_declContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_table_decl);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(TABLE);
			setState(130);
			match(LPAREN);
			setState(132); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(131);
					table_column();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(134); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COLUMN) | (1L << RETRIEVE) | (1L << SORT) | (1L << DATA) | (1L << UPDATE))) != 0) || _la==PROCEDURE || _la==ID) {
				{
				setState(141);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(136);
					retrieve();
					}
					break;
				case 2:
					{
					setState(137);
					procedure();
					}
					break;
				case 3:
					{
					setState(138);
					sort_clause();
					}
					break;
				case 4:
					{
					setState(139);
					data_storage();
					}
					break;
				case 5:
					{
					setState(140);
					update_clause();
					}
					break;
				}
				}
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(146);
			match(RPAREN);
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

	public static class Data_storageContext extends ParserRuleContext {
		public TerminalNode DATA() { return getToken(PowerBuilderDWParser.DATA, 0); }
		public TerminalNode DOT() { return getToken(PowerBuilderDWParser.DOT, 0); }
		public TerminalNode STORAGE() { return getToken(PowerBuilderDWParser.STORAGE, 0); }
		public TerminalNode EQ() { return getToken(PowerBuilderDWParser.EQ, 0); }
		public TerminalNode ID() { return getToken(PowerBuilderDWParser.ID, 0); }
		public Data_storageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_storage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowerBuilderDWParserListener ) ((PowerBuilderDWParserListener)listener).enterData_storage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowerBuilderDWParserListener ) ((PowerBuilderDWParserListener)listener).exitData_storage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PowerBuilderDWParserVisitor ) return ((PowerBuilderDWParserVisitor<? extends T>)visitor).visitData_storage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Data_storageContext data_storage() throws RecognitionException {
		Data_storageContext _localctx = new Data_storageContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_data_storage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(DATA);
			setState(149);
			match(DOT);
			setState(150);
			match(STORAGE);
			setState(151);
			match(EQ);
			setState(152);
			match(ID);
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

	public static class Table_columnContext extends ParserRuleContext {
		public TerminalNode COLUMN() { return getToken(PowerBuilderDWParser.COLUMN, 0); }
		public TerminalNode EQ() { return getToken(PowerBuilderDWParser.EQ, 0); }
		public TerminalNode LPAREN() { return getToken(PowerBuilderDWParser.LPAREN, 0); }
		public Column_typeContext column_type() {
			return getRuleContext(Column_typeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PowerBuilderDWParser.RPAREN, 0); }
		public List<PropContext> prop() {
			return getRuleContexts(PropContext.class);
		}
		public PropContext prop(int i) {
			return getRuleContext(PropContext.class,i);
		}
		public Table_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowerBuilderDWParserListener ) ((PowerBuilderDWParserListener)listener).enterTable_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowerBuilderDWParserListener ) ((PowerBuilderDWParserListener)listener).exitTable_column(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PowerBuilderDWParserVisitor ) return ((PowerBuilderDWParserVisitor<? extends T>)visitor).visitTable_column(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_columnContext table_column() throws RecognitionException {
		Table_columnContext _localctx = new Table_columnContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_table_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(COLUMN);
			setState(155);
			match(EQ);
			setState(156);
			match(LPAREN);
			setState(157);
			column_type();
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COLUMN) | (1L << DATA) | (1L << UPDATE))) != 0) || _la==ID) {
				{
				{
				setState(158);
				prop();
				}
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(164);
			match(RPAREN);
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

	public static class Column_typeContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(PowerBuilderDWParser.TYPE, 0); }
		public TerminalNode EQ() { return getToken(PowerBuilderDWParser.EQ, 0); }
		public Data_type_nameContext data_type_name() {
			return getRuleContext(Data_type_nameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(PowerBuilderDWParser.LPAREN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PowerBuilderDWParser.RPAREN, 0); }
		public Column_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowerBuilderDWParserListener ) ((PowerBuilderDWParserListener)listener).enterColumn_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowerBuilderDWParserListener ) ((PowerBuilderDWParserListener)listener).exitColumn_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PowerBuilderDWParserVisitor ) return ((PowerBuilderDWParserVisitor<? extends T>)visitor).visitColumn_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_typeContext column_type() throws RecognitionException {
		Column_typeContext _localctx = new Column_typeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_column_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(TYPE);
			setState(167);
			match(EQ);
			setState(168);
			data_type_name();
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(169);
				match(LPAREN);
				setState(170);
				value();
				setState(171);
				match(RPAREN);
				}
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

	public static class RetrieveContext extends ParserRuleContext {
		public TerminalNode RETRIEVE() { return getToken(PowerBuilderDWParser.RETRIEVE, 0); }
		public TerminalNode EQ() { return getToken(PowerBuilderDWParser.EQ, 0); }
		public TerminalNode DQUOTED_STRING() { return getToken(PowerBuilderDWParser.DQUOTED_STRING, 0); }
		public Update_clauseContext update_clause() {
			return getRuleContext(Update_clauseContext.class,0);
		}
		public List<Argument_clauseContext> argument_clause() {
			return getRuleContexts(Argument_clauseContext.class);
		}
		public Argument_clauseContext argument_clause(int i) {
			return getRuleContext(Argument_clauseContext.class,i);
		}
		public List<Sort_clauseContext> sort_clause() {
			return getRuleContexts(Sort_clauseContext.class);
		}
		public Sort_clauseContext sort_clause(int i) {
			return getRuleContext(Sort_clauseContext.class,i);
		}
		public RetrieveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retrieve; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowerBuilderDWParserListener ) ((PowerBuilderDWParserListener)listener).enterRetrieve(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowerBuilderDWParserListener ) ((PowerBuilderDWParserListener)listener).exitRetrieve(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PowerBuilderDWParserVisitor ) return ((PowerBuilderDWParserVisitor<? extends T>)visitor).visitRetrieve(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetrieveContext retrieve() throws RecognitionException {
		RetrieveContext _localctx = new RetrieveContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_retrieve);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(RETRIEVE);
			setState(176);
			match(EQ);
			setState(177);
			match(DQUOTED_STRING);
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(178);
				update_clause();
				}
				break;
			}
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ARGUMENTS) {
				{
				{
				setState(181);
				argument_clause();
				}
				}
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(190);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(187);
					sort_clause();
					}
					} 
				}
				setState(192);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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

	public static class Update_clauseContext extends ParserRuleContext {
		public LhsContext lhs() {
			return getRuleContext(LhsContext.class,0);
		}
		public TerminalNode EQ() { return getToken(PowerBuilderDWParser.EQ, 0); }
		public RhsContext rhs() {
			return getRuleContext(RhsContext.class,0);
		}
		public List<PropContext> prop() {
			return getRuleContexts(PropContext.class);
		}
		public PropContext prop(int i) {
			return getRuleContext(PropContext.class,i);
		}
		public Update_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowerBuilderDWParserListener ) ((PowerBuilderDWParserListener)listener).enterUpdate_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowerBuilderDWParserListener ) ((PowerBuilderDWParserListener)listener).exitUpdate_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PowerBuilderDWParserVisitor ) return ((PowerBuilderDWParserVisitor<? extends T>)visitor).visitUpdate_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_clauseContext update_clause() throws RecognitionException {
		Update_clauseContext _localctx = new Update_clauseContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_update_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			lhs();
			setState(194);
			match(EQ);
			setState(195);
			rhs();
			setState(199);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(196);
					prop();
					}
					} 
				}
				setState(201);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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

	public static class ProcedureContext extends ParserRuleContext {
		public TerminalNode PROCEDURE() { return getToken(PowerBuilderDWParser.PROCEDURE, 0); }
		public TerminalNode EQ() { return getToken(PowerBuilderDWParser.EQ, 0); }
		public TerminalNode DQUOTED_STRING() { return getToken(PowerBuilderDWParser.DQUOTED_STRING, 0); }
		public List<PropContext> prop() {
			return getRuleContexts(PropContext.class);
		}
		public PropContext prop(int i) {
			return getRuleContext(PropContext.class,i);
		}
		public List<Argument_clauseContext> argument_clause() {
			return getRuleContexts(Argument_clauseContext.class);
		}
		public Argument_clauseContext argument_clause(int i) {
			return getRuleContext(Argument_clauseContext.class,i);
		}
		public List<Sort_clauseContext> sort_clause() {
			return getRuleContexts(Sort_clauseContext.class);
		}
		public Sort_clauseContext sort_clause(int i) {
			return getRuleContext(Sort_clauseContext.class,i);
		}
		public ProcedureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowerBuilderDWParserListener ) ((PowerBuilderDWParserListener)listener).enterProcedure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowerBuilderDWParserListener ) ((PowerBuilderDWParserListener)listener).exitProcedure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PowerBuilderDWParserVisitor ) return ((PowerBuilderDWParserVisitor<? extends T>)visitor).visitProcedure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureContext procedure() throws RecognitionException {
		ProcedureContext _localctx = new ProcedureContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_procedure);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(PROCEDURE);
			setState(203);
			match(EQ);
			setState(204);
			match(DQUOTED_STRING);
			setState(208);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(205);
					prop();
					}
					} 
				}
				setState(210);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ARGUMENTS) {
				{
				{
				setState(211);
				argument_clause();
				}
				}
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(220);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(217);
					sort_clause();
					}
					} 
				}
				setState(222);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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

	public static class Argument_clauseContext extends ParserRuleContext {
		public TerminalNode ARGUMENTS() { return getToken(PowerBuilderDWParser.ARGUMENTS, 0); }
		public TerminalNode EQ() { return getToken(PowerBuilderDWParser.EQ, 0); }
		public TerminalNode LPAREN() { return getToken(PowerBuilderDWParser.LPAREN, 0); }
		public List<Argument_attributeContext> argument_attribute() {
			return getRuleContexts(Argument_attributeContext.class);
		}
		public Argument_attributeContext argument_attribute(int i) {
			return getRuleContext(Argument_attributeContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(PowerBuilderDWParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PowerBuilderDWParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PowerBuilderDWParser.COMMA, i);
		}
		public Argument_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowerBuilderDWParserListener ) ((PowerBuilderDWParserListener)listener).enterArgument_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowerBuilderDWParserListener ) ((PowerBuilderDWParserListener)listener).exitArgument_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PowerBuilderDWParserVisitor ) return ((PowerBuilderDWParserVisitor<? extends T>)visitor).visitArgument_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Argument_clauseContext argument_clause() throws RecognitionException {
		Argument_clauseContext _localctx = new Argument_clauseContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_argument_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(ARGUMENTS);
			setState(224);
			match(EQ);
			setState(225);
			match(LPAREN);
			setState(226);
			argument_attribute();
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(227);
				match(COMMA);
				setState(228);
				argument_attribute();
				}
				}
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(234);
			match(RPAREN);
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

	public static class Argument_attributeContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(PowerBuilderDWParser.LPAREN, 0); }
		public TerminalNode DQUOTED_STRING() { return getToken(PowerBuilderDWParser.DQUOTED_STRING, 0); }
		public TerminalNode COMMA() { return getToken(PowerBuilderDWParser.COMMA, 0); }
		public Data_type_nameContext data_type_name() {
			return getRuleContext(Data_type_nameContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PowerBuilderDWParser.RPAREN, 0); }
		public Argument_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowerBuilderDWParserListener ) ((PowerBuilderDWParserListener)listener).enterArgument_attribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowerBuilderDWParserListener ) ((PowerBuilderDWParserListener)listener).exitArgument_attribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PowerBuilderDWParserVisitor ) return ((PowerBuilderDWParserVisitor<? extends T>)visitor).visitArgument_attribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Argument_attributeContext argument_attribute() throws RecognitionException {
		Argument_attributeContext _localctx = new Argument_attributeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_argument_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(LPAREN);
			setState(237);
			match(DQUOTED_STRING);
			setState(238);
			match(COMMA);
			setState(239);
			data_type_name();
			setState(240);
			match(RPAREN);
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

	public static class Sort_clauseContext extends ParserRuleContext {
		public TerminalNode SORT() { return getToken(PowerBuilderDWParser.SORT, 0); }
		public TerminalNode EQ() { return getToken(PowerBuilderDWParser.EQ, 0); }
		public TerminalNode DQUOTED_STRING() { return getToken(PowerBuilderDWParser.DQUOTED_STRING, 0); }
		public Sort_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sort_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowerBuilderDWParserListener ) ((PowerBuilderDWParserListener)listener).enterSort_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowerBuilderDWParserListener ) ((PowerBuilderDWParserListener)listener).exitSort_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PowerBuilderDWParserVisitor ) return ((PowerBuilderDWParserVisitor<? extends T>)visitor).visitSort_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sort_clauseContext sort_clause() throws RecognitionException {
		Sort_clauseContext _localctx = new Sort_clauseContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_sort_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(SORT);
			setState(243);
			match(EQ);
			setState(244);
			match(DQUOTED_STRING);
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

	public static class ValueContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(PowerBuilderDWParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(PowerBuilderDWParser.NUMBER, i);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowerBuilderDWParserListener ) ((PowerBuilderDWParserListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowerBuilderDWParserListener ) ((PowerBuilderDWParserListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PowerBuilderDWParserVisitor ) return ((PowerBuilderDWParserVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(246);
				match(NUMBER);
				}
				}
				setState(249); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER );
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

	public static class IdentifierContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PowerBuilderDWParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PowerBuilderDWParser.ID, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(PowerBuilderDWParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(PowerBuilderDWParser.NUMBER, i);
		}
		public TerminalNode UNDERSCORE() { return getToken(PowerBuilderDWParser.UNDERSCORE, 0); }
		public List<TerminalNode> DOT() { return getTokens(PowerBuilderDWParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(PowerBuilderDWParser.DOT, i);
		}
		public TerminalNode COLUMN() { return getToken(PowerBuilderDWParser.COLUMN, 0); }
		public TerminalNode DATA() { return getToken(PowerBuilderDWParser.DATA, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowerBuilderDWParserListener ) ((PowerBuilderDWParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowerBuilderDWParserListener ) ((PowerBuilderDWParserListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PowerBuilderDWParserVisitor ) return ((PowerBuilderDWParserVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_identifier);
		int _la;
		try {
			setState(270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				match(ID);
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NUMBER) {
					{
					{
					setState(252);
					match(NUMBER);
					}
					}
					setState(257);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				match(ID);
				setState(259);
				match(UNDERSCORE);
				setState(260);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(261);
				match(ID);
				setState(264); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(262);
					match(DOT);
					setState(263);
					match(ID);
					}
					}
					setState(266); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DOT );
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(268);
				match(COLUMN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(269);
				match(DATA);
				}
				break;
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

	public static class Data_type_subContext extends ParserRuleContext {
		public TerminalNode ANY() { return getToken(PowerBuilderDWParser.ANY, 0); }
		public TerminalNode BLOB() { return getToken(PowerBuilderDWParser.BLOB, 0); }
		public TerminalNode BOOLEAN() { return getToken(PowerBuilderDWParser.BOOLEAN, 0); }
		public TerminalNode BYTE() { return getToken(PowerBuilderDWParser.BYTE, 0); }
		public TerminalNode CHARACTER() { return getToken(PowerBuilderDWParser.CHARACTER, 0); }
		public TerminalNode CHAR() { return getToken(PowerBuilderDWParser.CHAR, 0); }
		public TerminalNode DATE_TYPE() { return getToken(PowerBuilderDWParser.DATE_TYPE, 0); }
		public TerminalNode DATETIME() { return getToken(PowerBuilderDWParser.DATETIME, 0); }
		public TerminalNode DECIMAL() { return getToken(PowerBuilderDWParser.DECIMAL, 0); }
		public TerminalNode DEC() { return getToken(PowerBuilderDWParser.DEC, 0); }
		public TerminalNode DOUBLE() { return getToken(PowerBuilderDWParser.DOUBLE, 0); }
		public TerminalNode INTEGER() { return getToken(PowerBuilderDWParser.INTEGER, 0); }
		public TerminalNode INT() { return getToken(PowerBuilderDWParser.INT, 0); }
		public TerminalNode LONG() { return getToken(PowerBuilderDWParser.LONG, 0); }
		public TerminalNode LONGLONG() { return getToken(PowerBuilderDWParser.LONGLONG, 0); }
		public TerminalNode NUMBERTYPE() { return getToken(PowerBuilderDWParser.NUMBERTYPE, 0); }
		public TerminalNode REAL() { return getToken(PowerBuilderDWParser.REAL, 0); }
		public TerminalNode STRING() { return getToken(PowerBuilderDWParser.STRING, 0); }
		public TerminalNode TIME_TYPE() { return getToken(PowerBuilderDWParser.TIME_TYPE, 0); }
		public TerminalNode UNSIGNEDINTEGER() { return getToken(PowerBuilderDWParser.UNSIGNEDINTEGER, 0); }
		public TerminalNode UINT() { return getToken(PowerBuilderDWParser.UINT, 0); }
		public TerminalNode UNSIGNEDLONG() { return getToken(PowerBuilderDWParser.UNSIGNEDLONG, 0); }
		public TerminalNode ULONG() { return getToken(PowerBuilderDWParser.ULONG, 0); }
		public TerminalNode WINDOW() { return getToken(PowerBuilderDWParser.WINDOW, 0); }
		public Data_type_subContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_type_sub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowerBuilderDWParserListener ) ((PowerBuilderDWParserListener)listener).enterData_type_sub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowerBuilderDWParserListener ) ((PowerBuilderDWParserListener)listener).exitData_type_sub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PowerBuilderDWParserVisitor ) return ((PowerBuilderDWParserVisitor<? extends T>)visitor).visitData_type_sub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Data_type_subContext data_type_sub() throws RecognitionException {
		Data_type_subContext _localctx = new Data_type_subContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_data_type_sub);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ANY) | (1L << BLOB) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHARACTER) | (1L << CHAR) | (1L << DATE_TYPE) | (1L << DATETIME) | (1L << DECIMAL) | (1L << DEC) | (1L << DOUBLE) | (1L << INTEGER) | (1L << INT) | (1L << LONG) | (1L << LONGLONG) | (1L << NUMBERTYPE) | (1L << REAL) | (1L << STRING) | (1L << TIME_TYPE) | (1L << UNSIGNEDINTEGER) | (1L << UINT) | (1L << UNSIGNEDLONG) | (1L << ULONG) | (1L << WINDOW))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Data_type_nameContext extends ParserRuleContext {
		public Data_type_subContext data_type_sub() {
			return getRuleContext(Data_type_subContext.class,0);
		}
		public TerminalNode ID() { return getToken(PowerBuilderDWParser.ID, 0); }
		public Data_type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PowerBuilderDWParserListener ) ((PowerBuilderDWParserListener)listener).enterData_type_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PowerBuilderDWParserListener ) ((PowerBuilderDWParserListener)listener).exitData_type_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PowerBuilderDWParserVisitor ) return ((PowerBuilderDWParserVisitor<? extends T>)visitor).visitData_type_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Data_type_nameContext data_type_name() throws RecognitionException {
		Data_type_nameContext _localctx = new Data_type_nameContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_data_type_name);
		try {
			setState(276);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ANY:
			case BLOB:
			case BOOLEAN:
			case BYTE:
			case CHARACTER:
			case CHAR:
			case DATE_TYPE:
			case DATETIME:
			case DECIMAL:
			case DEC:
			case DOUBLE:
			case INTEGER:
			case INT:
			case LONG:
			case LONGLONG:
			case NUMBERTYPE:
			case REAL:
			case STRING:
			case TIME_TYPE:
			case UNSIGNEDINTEGER:
			case UINT:
			case UNSIGNEDLONG:
			case ULONG:
			case WINDOW:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				data_type_sub();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u009e\u0119\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\5\2\62"+
		"\n\2\3\2\7\2\65\n\2\f\2\16\28\13\2\3\2\5\2;\n\2\3\2\3\2\7\2?\n\2\f\2\16"+
		"\2B\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\7\4N\n\4\f\4\16\4Q\13"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6`\n\6\7\6b\n"+
		"\6\f\6\16\6e\13\6\5\6g\n\6\3\7\3\7\5\7k\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\5\bx\n\b\3\t\3\t\5\t|\n\t\3\t\7\t\177\n\t\f\t\16\t"+
		"\u0082\13\t\3\n\3\n\3\n\6\n\u0087\n\n\r\n\16\n\u0088\3\n\3\n\3\n\3\n\3"+
		"\n\7\n\u0090\n\n\f\n\16\n\u0093\13\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\7\f\u00a2\n\f\f\f\16\f\u00a5\13\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00b0\n\r\3\16\3\16\3\16\3\16\5\16\u00b6"+
		"\n\16\3\16\7\16\u00b9\n\16\f\16\16\16\u00bc\13\16\3\16\7\16\u00bf\n\16"+
		"\f\16\16\16\u00c2\13\16\3\17\3\17\3\17\3\17\7\17\u00c8\n\17\f\17\16\17"+
		"\u00cb\13\17\3\20\3\20\3\20\3\20\7\20\u00d1\n\20\f\20\16\20\u00d4\13\20"+
		"\3\20\7\20\u00d7\n\20\f\20\16\20\u00da\13\20\3\20\7\20\u00dd\n\20\f\20"+
		"\16\20\u00e0\13\20\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00e8\n\21\f\21"+
		"\16\21\u00eb\13\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3"+
		"\23\3\23\3\24\6\24\u00fa\n\24\r\24\16\24\u00fb\3\25\3\25\7\25\u0100\n"+
		"\25\f\25\16\25\u0103\13\25\3\25\3\25\3\25\3\25\3\25\3\25\6\25\u010b\n"+
		"\25\r\25\16\25\u010c\3\25\3\25\5\25\u0111\n\25\3\26\3\26\3\27\3\27\5\27"+
		"\u0117\n\27\3\27\2\2\30\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*"+
		",\2\4\4\2\u0093\u0093\u0099\u0099\5\2\n\17\21\37!#\2\u012d\2\61\3\2\2"+
		"\2\4E\3\2\2\2\6J\3\2\2\2\bT\3\2\2\2\nf\3\2\2\2\fj\3\2\2\2\16w\3\2\2\2"+
		"\20y\3\2\2\2\22\u0083\3\2\2\2\24\u0096\3\2\2\2\26\u009c\3\2\2\2\30\u00a8"+
		"\3\2\2\2\32\u00b1\3\2\2\2\34\u00c3\3\2\2\2\36\u00cc\3\2\2\2 \u00e1\3\2"+
		"\2\2\"\u00ee\3\2\2\2$\u00f4\3\2\2\2&\u00f9\3\2\2\2(\u0110\3\2\2\2*\u0112"+
		"\3\2\2\2,\u0116\3\2\2\2./\7W\2\2/\60\7\u0093\2\2\60\62\7\u008b\2\2\61"+
		".\3\2\2\2\61\62\3\2\2\2\62\66\3\2\2\2\63\65\5\6\4\2\64\63\3\2\2\2\658"+
		"\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67:\3\2\2\28\66\3\2\2\29;\5\22\n"+
		"\2:9\3\2\2\2:;\3\2\2\2;@\3\2\2\2<?\5\4\3\2=?\5\6\4\2><\3\2\2\2>=\3\2\2"+
		"\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2AC\3\2\2\2B@\3\2\2\2CD\7\2\2\3D\3\3\2"+
		"\2\2EF\7\20\2\2FG\7\u008c\2\2GH\5\n\6\2HI\7\u008d\2\2I\5\3\2\2\2JK\5("+
		"\25\2KO\7\u008c\2\2LN\5\b\5\2ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2"+
		"PR\3\2\2\2QO\3\2\2\2RS\7\u008d\2\2S\7\3\2\2\2TU\5\f\7\2UV\7r\2\2VW\5\n"+
		"\6\2W\t\3\2\2\2XY\7\u008c\2\2YZ\5\n\6\2Z[\7\u008d\2\2[g\3\2\2\2\\c\5\16"+
		"\b\2]_\7\u008a\2\2^`\5\16\b\2_^\3\2\2\2_`\3\2\2\2`b\3\2\2\2a]\3\2\2\2"+
		"be\3\2\2\2ca\3\2\2\2cd\3\2\2\2dg\3\2\2\2ec\3\2\2\2fX\3\2\2\2f\\\3\2\2"+
		"\2g\13\3\2\2\2hk\5(\25\2ik\7\67\2\2jh\3\2\2\2ji\3\2\2\2k\r\3\2\2\2lm\7"+
		"\u008c\2\2mn\5\16\b\2no\7\u008d\2\2ox\3\2\2\2px\7\u0093\2\2qx\5\20\t\2"+
		"rx\7\67\2\2sx\7\n\2\2tx\7\4\2\2ux\7\u0088\2\2vx\7\u0095\2\2wl\3\2\2\2"+
		"wp\3\2\2\2wq\3\2\2\2wr\3\2\2\2ws\3\2\2\2wt\3\2\2\2wu\3\2\2\2wv\3\2\2\2"+
		"x\17\3\2\2\2y\u0080\7\u0099\2\2z|\7\u0094\2\2{z\3\2\2\2{|\3\2\2\2|}\3"+
		"\2\2\2}\177\t\2\2\2~{\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081"+
		"\3\2\2\2\u0081\21\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0084\7\3\2\2\u0084"+
		"\u0086\7\u008c\2\2\u0085\u0087\5\26\f\2\u0086\u0085\3\2\2\2\u0087\u0088"+
		"\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u0091\3\2\2\2\u008a"+
		"\u0090\5\32\16\2\u008b\u0090\5\36\20\2\u008c\u0090\5$\23\2\u008d\u0090"+
		"\5\24\13\2\u008e\u0090\5\34\17\2\u008f\u008a\3\2\2\2\u008f\u008b\3\2\2"+
		"\2\u008f\u008c\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u008e\3\2\2\2\u0090\u0093"+
		"\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0094\3\2\2\2\u0093"+
		"\u0091\3\2\2\2\u0094\u0095\7\u008d\2\2\u0095\23\3\2\2\2\u0096\u0097\7"+
		"\20\2\2\u0097\u0098\7\u0094\2\2\u0098\u0099\7o\2\2\u0099\u009a\7r\2\2"+
		"\u009a\u009b\7\u0099\2\2\u009b\25\3\2\2\2\u009c\u009d\7\4\2\2\u009d\u009e"+
		"\7r\2\2\u009e\u009f\7\u008c\2\2\u009f\u00a3\5\30\r\2\u00a0\u00a2\5\b\5"+
		"\2\u00a1\u00a0\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4"+
		"\3\2\2\2\u00a4\u00a6\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a7\7\u008d\2"+
		"\2\u00a7\27\3\2\2\2\u00a8\u00a9\7\62\2\2\u00a9\u00aa\7r\2\2\u00aa\u00af"+
		"\5,\27\2\u00ab\u00ac\7\u008c\2\2\u00ac\u00ad\5&\24\2\u00ad\u00ae\7\u008d"+
		"\2\2\u00ae\u00b0\3\2\2\2\u00af\u00ab\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0"+
		"\31\3\2\2\2\u00b1\u00b2\7\5\2\2\u00b2\u00b3\7r\2\2\u00b3\u00b5\7\u0088"+
		"\2\2\u00b4\u00b6\5\34\17\2\u00b5\u00b4\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6"+
		"\u00ba\3\2\2\2\u00b7\u00b9\5 \21\2\u00b8\u00b7\3\2\2\2\u00b9\u00bc\3\2"+
		"\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00c0\3\2\2\2\u00bc"+
		"\u00ba\3\2\2\2\u00bd\u00bf\5$\23\2\u00be\u00bd\3\2\2\2\u00bf\u00c2\3\2"+
		"\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\33\3\2\2\2\u00c2\u00c0"+
		"\3\2\2\2\u00c3\u00c4\5\f\7\2\u00c4\u00c5\7r\2\2\u00c5\u00c9\5\16\b\2\u00c6"+
		"\u00c8\5\b\5\2\u00c7\u00c6\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2"+
		"\2\2\u00c9\u00ca\3\2\2\2\u00ca\35\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00cd"+
		"\7p\2\2\u00cd\u00ce\7r\2\2\u00ce\u00d2\7\u0088\2\2\u00cf\u00d1\5\b\5\2"+
		"\u00d0\u00cf\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3"+
		"\3\2\2\2\u00d3\u00d8\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d7\5 \21\2\u00d6"+
		"\u00d5\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2"+
		"\2\2\u00d9\u00de\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00dd\5$\23\2\u00dc"+
		"\u00db\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2"+
		"\2\2\u00df\37\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e2\7\b\2\2\u00e2\u00e3"+
		"\7r\2\2\u00e3\u00e4\7\u008c\2\2\u00e4\u00e9\5\"\22\2\u00e5\u00e6\7\u008a"+
		"\2\2\u00e6\u00e8\5\"\22\2\u00e7\u00e5\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9"+
		"\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ec\3\2\2\2\u00eb\u00e9\3\2"+
		"\2\2\u00ec\u00ed\7\u008d\2\2\u00ed!\3\2\2\2\u00ee\u00ef\7\u008c\2\2\u00ef"+
		"\u00f0\7\u0088\2\2\u00f0\u00f1\7\u008a\2\2\u00f1\u00f2\5,\27\2\u00f2\u00f3"+
		"\7\u008d\2\2\u00f3#\3\2\2\2\u00f4\u00f5\7\t\2\2\u00f5\u00f6\7r\2\2\u00f6"+
		"\u00f7\7\u0088\2\2\u00f7%\3\2\2\2\u00f8\u00fa\7\u0093\2\2\u00f9\u00f8"+
		"\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc"+
		"\'\3\2\2\2\u00fd\u0101\7\u0099\2\2\u00fe\u0100\7\u0093\2\2\u00ff\u00fe"+
		"\3\2\2\2\u0100\u0103\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102"+
		"\u0111\3\2\2\2\u0103\u0101\3\2\2\2\u0104\u0105\7\u0099\2\2\u0105\u0106"+
		"\7 \2\2\u0106\u0111\7\u0099\2\2\u0107\u010a\7\u0099\2\2\u0108\u0109\7"+
		"\u0094\2\2\u0109\u010b\7\u0099\2\2\u010a\u0108\3\2\2\2\u010b\u010c\3\2"+
		"\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u0111\3\2\2\2\u010e"+
		"\u0111\7\4\2\2\u010f\u0111\7\20\2\2\u0110\u00fd\3\2\2\2\u0110\u0104\3"+
		"\2\2\2\u0110\u0107\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u010f\3\2\2\2\u0111"+
		")\3\2\2\2\u0112\u0113\t\3\2\2\u0113+\3\2\2\2\u0114\u0117\5*\26\2\u0115"+
		"\u0117\7\u0099\2\2\u0116\u0114\3\2\2\2\u0116\u0115\3\2\2\2\u0117-\3\2"+
		"\2\2!\61\66:>@O_cfjw{\u0080\u0088\u008f\u0091\u00a3\u00af\u00b5\u00ba"+
		"\u00c0\u00c9\u00d2\u00d8\u00de\u00e9\u00fb\u0101\u010c\u0110\u0116";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}