// Generated from C:/Users/my asus/Downloads/810100089-810100152/Phase1- Lexical Analayzer/FunctionCraft/src/main/grammar/FunctionCraft.g4 by ANTLR 4.13.1
package main.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class FunctionCraftParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DEF=1, END=2, MAIN=3, RETURN=4, IF=5, ELSE=6, ELSEIF=7, TRUE=8, FALSE=9, 
		CHOP=10, CHOMP=11, PUSH=12, PUTS=13, METHOD=14, LEN=15, LOOP=16, DO=17, 
		FOR=18, IN=19, PATTERN=20, MATCH=21, NEXT=22, BREAK=23, LAMBDA=24, ID=25, 
		INT_LITERAL=26, FLOAT_LITERAL=27, STRING_LITERAL=28, ASSIGN_ADD=29, ASSIGN_SUB=30, 
		ASSIGN_MUL=31, ASSIGN_DIV=32, ASSIGN_MOD=33, ADD=34, SUB=35, MUL=36, DIV=37, 
		MOD=38, ASSIGN=39, EQL=40, NEQ=41, LESS=42, GREATER=43, LEQ=44, GEQ=45, 
		AND=46, OR=47, NOT=48, APPEND=49, INC=50, DEC=51, LEFT_PAREN=52, RIGHT_PAREN=53, 
		LEFT_BRACKET=54, RIGHT_BRACKET=55, LEFT_CUR_BRACKET=56, RIGHT_CUR_BRACKET=57, 
		COMMA=58, RANGE_DOT=59, SEMICOLON=60, COLON=61, DOT=62, COMMENT=63, WS=64, 
		PATTERN_INDENT=65, OTHER=66;
	public static final int
		RULE_program = 0, RULE_function = 1, RULE_lambda_function = 2, RULE_parameter_list = 3, 
		RULE_default_parameter_list = 4, RULE_default_parameter = 5, RULE_argument_list = 6, 
		RULE_main = 7, RULE_pattern = 8, RULE_match = 9, RULE_block = 10, RULE_puts = 11, 
		RULE_push = 12, RULE_len = 13, RULE_chop = 14, RULE_chomp = 15, RULE_loop = 16, 
		RULE_do_loop = 17, RULE_loop_body = 18, RULE_for_loop = 19, RULE_range = 20, 
		RULE_list = 21, RULE_list_data = 22, RULE_list_access = 23, RULE_control_structure = 24, 
		RULE_break = 25, RULE_break_if = 26, RULE_next = 27, RULE_next_if = 28, 
		RULE_condition = 29, RULE_if_condition = 30, RULE_elseif_condition = 31, 
		RULE_else_condition = 32, RULE_return_stat = 33, RULE_function_call = 34, 
		RULE_function_pointer = 35, RULE_assignment = 36, RULE_statement = 37, 
		RULE_expression = 38, RULE_append_expresstion = 39, RULE_append_expression_ = 40, 
		RULE_or_expression = 41, RULE_or_expression_ = 42, RULE_and_expression = 43, 
		RULE_and_expression_ = 44, RULE_eq_expression = 45, RULE_eq_expression_ = 46, 
		RULE_compare_expression = 47, RULE_compare_expression_ = 48, RULE_add_sub_expression = 49, 
		RULE_add_sub_expression_ = 50, RULE_mul_div_expression = 51, RULE_mul_div_expression_ = 52, 
		RULE_unary_expression = 53, RULE_other_expression = 54, RULE_boolean_literal = 55, 
		RULE_literal = 56;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "function", "lambda_function", "parameter_list", "default_parameter_list", 
			"default_parameter", "argument_list", "main", "pattern", "match", "block", 
			"puts", "push", "len", "chop", "chomp", "loop", "do_loop", "loop_body", 
			"for_loop", "range", "list", "list_data", "list_access", "control_structure", 
			"break", "break_if", "next", "next_if", "condition", "if_condition", 
			"elseif_condition", "else_condition", "return_stat", "function_call", 
			"function_pointer", "assignment", "statement", "expression", "append_expresstion", 
			"append_expression_", "or_expression", "or_expression_", "and_expression", 
			"and_expression_", "eq_expression", "eq_expression_", "compare_expression", 
			"compare_expression_", "add_sub_expression", "add_sub_expression_", "mul_div_expression", 
			"mul_div_expression_", "unary_expression", "other_expression", "boolean_literal", 
			"literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'def'", "'end'", "'main'", "'return'", "'if'", "'else'", "'elseif'", 
			"'true'", "'false'", "'chop'", "'chomp'", "'push'", "'puts'", "'method'", 
			"'len'", "'loop'", "'do'", "'for'", "'in'", "'pattern'", "'match'", "'next'", 
			"'break'", "'->'", null, null, null, null, "'+='", "'-='", "'*='", "'/='", 
			"'%='", "'+'", "'-'", "'*'", "'/'", "'%'", "'='", "'=='", "'!='", "'<'", 
			"'>'", "'<='", "'>='", "'&&'", "'||'", "'!'", "'<<'", "'++'", "'--'", 
			"'('", "')'", "'['", "']'", "'{'", "'}'", "','", "'..'", "';'", "':'", 
			"'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DEF", "END", "MAIN", "RETURN", "IF", "ELSE", "ELSEIF", "TRUE", 
			"FALSE", "CHOP", "CHOMP", "PUSH", "PUTS", "METHOD", "LEN", "LOOP", "DO", 
			"FOR", "IN", "PATTERN", "MATCH", "NEXT", "BREAK", "LAMBDA", "ID", "INT_LITERAL", 
			"FLOAT_LITERAL", "STRING_LITERAL", "ASSIGN_ADD", "ASSIGN_SUB", "ASSIGN_MUL", 
			"ASSIGN_DIV", "ASSIGN_MOD", "ADD", "SUB", "MUL", "DIV", "MOD", "ASSIGN", 
			"EQL", "NEQ", "LESS", "GREATER", "LEQ", "GEQ", "AND", "OR", "NOT", "APPEND", 
			"INC", "DEC", "LEFT_PAREN", "RIGHT_PAREN", "LEFT_BRACKET", "RIGHT_BRACKET", 
			"LEFT_CUR_BRACKET", "RIGHT_CUR_BRACKET", "COMMA", "RANGE_DOT", "SEMICOLON", 
			"COLON", "DOT", "COMMENT", "WS", "PATTERN_INDENT", "OTHER"
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
	public String getGrammarFileName() { return "FunctionCraft.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FunctionCraftParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<PatternContext> pattern() {
			return getRuleContexts(PatternContext.class);
		}
		public PatternContext pattern(int i) {
			return getRuleContext(PatternContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(116);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case DEF:
						{
						setState(114);
						function();
						}
						break;
					case PATTERN:
						{
						setState(115);
						pattern();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(120);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(121);
			main();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends ParserRuleContext {
		public Token name;
		public TerminalNode DEF() { return getToken(FunctionCraftParser.DEF, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(FunctionCraftParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(FunctionCraftParser.RIGHT_PAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode END() { return getToken(FunctionCraftParser.END, 0); }
		public TerminalNode ID() { return getToken(FunctionCraftParser.ID, 0); }
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(DEF);
			setState(124);
			((FunctionContext)_localctx).name = match(ID);
			 System.out.println("FunctionDec: " + (((FunctionContext)_localctx).name!=null?((FunctionContext)_localctx).name.getText():null)); 
			setState(126);
			match(LEFT_PAREN);
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(127);
				parameter_list();
				}
			}

			setState(130);
			match(RIGHT_PAREN);
			setState(131);
			block();
			setState(132);
			match(END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Lambda_functionContext extends ParserRuleContext {
		public TerminalNode LAMBDA() { return getToken(FunctionCraftParser.LAMBDA, 0); }
		public List<TerminalNode> LEFT_PAREN() { return getTokens(FunctionCraftParser.LEFT_PAREN); }
		public TerminalNode LEFT_PAREN(int i) {
			return getToken(FunctionCraftParser.LEFT_PAREN, i);
		}
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public List<TerminalNode> RIGHT_PAREN() { return getTokens(FunctionCraftParser.RIGHT_PAREN); }
		public TerminalNode RIGHT_PAREN(int i) {
			return getToken(FunctionCraftParser.RIGHT_PAREN, i);
		}
		public TerminalNode LEFT_CUR_BRACKET() { return getToken(FunctionCraftParser.LEFT_CUR_BRACKET, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode RIGHT_CUR_BRACKET() { return getToken(FunctionCraftParser.RIGHT_CUR_BRACKET, 0); }
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public Lambda_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambda_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterLambda_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitLambda_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitLambda_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lambda_functionContext lambda_function() throws RecognitionException {
		Lambda_functionContext _localctx = new Lambda_functionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_lambda_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(LAMBDA);
			 System.out.println("Structure: LAMBDA"); 
			setState(136);
			match(LEFT_PAREN);
			setState(137);
			parameter_list();
			setState(138);
			match(RIGHT_PAREN);
			setState(139);
			match(LEFT_CUR_BRACKET);
			setState(140);
			block();
			setState(141);
			match(RIGHT_CUR_BRACKET);
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFT_PAREN) {
				{
				setState(142);
				match(LEFT_PAREN);
				setState(143);
				argument_list();
				setState(144);
				match(RIGHT_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Parameter_listContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(FunctionCraftParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(FunctionCraftParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FunctionCraftParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FunctionCraftParser.COMMA, i);
		}
		public Default_parameter_listContext default_parameter_list() {
			return getRuleContext(Default_parameter_listContext.class,0);
		}
		public Parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterParameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitParameter_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitParameter_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_listContext parameter_list() throws RecognitionException {
		Parameter_listContext _localctx = new Parameter_listContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_parameter_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(ID);
			setState(153);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(149);
					match(COMMA);
					setState(150);
					match(ID);
					}
					} 
				}
				setState(155);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(156);
				match(COMMA);
				setState(157);
				default_parameter_list();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Default_parameter_listContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACKET() { return getToken(FunctionCraftParser.LEFT_BRACKET, 0); }
		public List<Default_parameterContext> default_parameter() {
			return getRuleContexts(Default_parameterContext.class);
		}
		public Default_parameterContext default_parameter(int i) {
			return getRuleContext(Default_parameterContext.class,i);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(FunctionCraftParser.RIGHT_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(FunctionCraftParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FunctionCraftParser.COMMA, i);
		}
		public Default_parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterDefault_parameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitDefault_parameter_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitDefault_parameter_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Default_parameter_listContext default_parameter_list() throws RecognitionException {
		Default_parameter_listContext _localctx = new Default_parameter_listContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_default_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(LEFT_BRACKET);
			setState(161);
			default_parameter();
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(162);
				match(COMMA);
				setState(163);
				default_parameter();
				}
				}
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(169);
			match(RIGHT_BRACKET);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Default_parameterContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(FunctionCraftParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(FunctionCraftParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Default_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterDefault_parameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitDefault_parameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitDefault_parameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Default_parameterContext default_parameter() throws RecognitionException {
		Default_parameterContext _localctx = new Default_parameterContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_default_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(ID);
			setState(172);
			match(ASSIGN);
			setState(173);
			expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Argument_listContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FunctionCraftParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FunctionCraftParser.COMMA, i);
		}
		public Argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterArgument_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitArgument_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitArgument_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Argument_listContext argument_list() throws RecognitionException {
		Argument_listContext _localctx = new Argument_listContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_argument_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			expression();
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(176);
				match(COMMA);
				setState(177);
				expression();
				}
				}
				setState(182);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MainContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(FunctionCraftParser.DEF, 0); }
		public TerminalNode MAIN() { return getToken(FunctionCraftParser.MAIN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(FunctionCraftParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(FunctionCraftParser.RIGHT_PAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode END() { return getToken(FunctionCraftParser.END, 0); }
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(DEF);
			setState(184);
			match(MAIN);
			 System.out.println("MAIN"); 
			setState(186);
			match(LEFT_PAREN);
			setState(187);
			match(RIGHT_PAREN);
			setState(188);
			block();
			setState(189);
			match(END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PatternContext extends ParserRuleContext {
		public Token name;
		public TerminalNode PATTERN() { return getToken(FunctionCraftParser.PATTERN, 0); }
		public List<TerminalNode> LEFT_PAREN() { return getTokens(FunctionCraftParser.LEFT_PAREN); }
		public TerminalNode LEFT_PAREN(int i) {
			return getToken(FunctionCraftParser.LEFT_PAREN, i);
		}
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public List<TerminalNode> RIGHT_PAREN() { return getTokens(FunctionCraftParser.RIGHT_PAREN); }
		public TerminalNode RIGHT_PAREN(int i) {
			return getToken(FunctionCraftParser.RIGHT_PAREN, i);
		}
		public TerminalNode SEMICOLON() { return getToken(FunctionCraftParser.SEMICOLON, 0); }
		public TerminalNode ID() { return getToken(FunctionCraftParser.ID, 0); }
		public List<TerminalNode> PATTERN_INDENT() { return getTokens(FunctionCraftParser.PATTERN_INDENT); }
		public TerminalNode PATTERN_INDENT(int i) {
			return getToken(FunctionCraftParser.PATTERN_INDENT, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(FunctionCraftParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(FunctionCraftParser.ASSIGN, i);
		}
		public PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternContext pattern() throws RecognitionException {
		PatternContext _localctx = new PatternContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_pattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(PATTERN);
			setState(192);
			((PatternContext)_localctx).name = match(ID);
			 System.out.println("PatternDec: " + (((PatternContext)_localctx).name!=null?((PatternContext)_localctx).name.getText():null)); 
			setState(194);
			match(LEFT_PAREN);
			setState(195);
			parameter_list();
			setState(196);
			match(RIGHT_PAREN);
			setState(204); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(197);
				match(PATTERN_INDENT);
				setState(198);
				match(LEFT_PAREN);
				setState(199);
				expression();
				setState(200);
				match(RIGHT_PAREN);
				setState(201);
				match(ASSIGN);
				setState(202);
				expression();
				}
				}
				setState(206); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PATTERN_INDENT );
			setState(208);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MatchContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(FunctionCraftParser.ID, 0); }
		public TerminalNode DOT() { return getToken(FunctionCraftParser.DOT, 0); }
		public TerminalNode MATCH() { return getToken(FunctionCraftParser.MATCH, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(FunctionCraftParser.LEFT_PAREN, 0); }
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(FunctionCraftParser.RIGHT_PAREN, 0); }
		public MatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_match; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterMatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitMatch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitMatch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchContext match() throws RecognitionException {
		MatchContext _localctx = new MatchContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_match);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(ID);
			 System.out.println("Built-In: MATCH"); 
			setState(212);
			match(DOT);
			setState(213);
			match(MATCH);
			setState(214);
			match(LEFT_PAREN);
			setState(215);
			argument_list();
			setState(216);
			match(RIGHT_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Return_statContext return_stat() {
			return getRuleContext(Return_statContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 22799507993788192L) != 0)) {
				{
				{
				setState(218);
				statement();
				}
				}
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(224);
				return_stat();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PutsContext extends ParserRuleContext {
		public TerminalNode PUTS() { return getToken(FunctionCraftParser.PUTS, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(FunctionCraftParser.LEFT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(FunctionCraftParser.RIGHT_PAREN, 0); }
		public PutsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_puts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterPuts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitPuts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitPuts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PutsContext puts() throws RecognitionException {
		PutsContext _localctx = new PutsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_puts);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(PUTS);
			 System.out.println("Built-In: PUTS"); 
			setState(229);
			match(LEFT_PAREN);
			setState(230);
			expression();
			setState(231);
			match(RIGHT_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PushContext extends ParserRuleContext {
		public TerminalNode PUSH() { return getToken(FunctionCraftParser.PUSH, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(FunctionCraftParser.LEFT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(FunctionCraftParser.RIGHT_PAREN, 0); }
		public PushContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_push; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterPush(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitPush(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitPush(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PushContext push() throws RecognitionException {
		PushContext _localctx = new PushContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_push);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(PUSH);
			 System.out.println("Built-In: PUSH"); 
			setState(235);
			match(LEFT_PAREN);
			setState(236);
			expression();
			setState(237);
			match(RIGHT_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LenContext extends ParserRuleContext {
		public TerminalNode LEN() { return getToken(FunctionCraftParser.LEN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(FunctionCraftParser.LEFT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(FunctionCraftParser.RIGHT_PAREN, 0); }
		public LenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_len; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterLen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitLen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitLen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LenContext len() throws RecognitionException {
		LenContext _localctx = new LenContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_len);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(LEN);
			 System.out.println("Built-In: LEN"); 
			setState(241);
			match(LEFT_PAREN);
			setState(242);
			expression();
			setState(243);
			match(RIGHT_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ChopContext extends ParserRuleContext {
		public TerminalNode CHOP() { return getToken(FunctionCraftParser.CHOP, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(FunctionCraftParser.LEFT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(FunctionCraftParser.RIGHT_PAREN, 0); }
		public ChopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterChop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitChop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitChop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChopContext chop() throws RecognitionException {
		ChopContext _localctx = new ChopContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_chop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(CHOP);
			 System.out.println("Built-In: CHOP"); 
			setState(247);
			match(LEFT_PAREN);
			setState(248);
			expression();
			setState(249);
			match(RIGHT_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ChompContext extends ParserRuleContext {
		public TerminalNode CHOMP() { return getToken(FunctionCraftParser.CHOMP, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(FunctionCraftParser.LEFT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(FunctionCraftParser.RIGHT_PAREN, 0); }
		public ChompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chomp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterChomp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitChomp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitChomp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChompContext chomp() throws RecognitionException {
		ChompContext _localctx = new ChompContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_chomp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(CHOMP);
			 System.out.println("Built-In: CHOMP"); 
			setState(253);
			match(LEFT_PAREN);
			setState(254);
			expression();
			setState(255);
			match(RIGHT_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LoopContext extends ParserRuleContext {
		public Do_loopContext do_loop() {
			return getRuleContext(Do_loopContext.class,0);
		}
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_loop);
		try {
			setState(259);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOOP:
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				do_loop();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				for_loop();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Do_loopContext extends ParserRuleContext {
		public TerminalNode LOOP() { return getToken(FunctionCraftParser.LOOP, 0); }
		public TerminalNode DO() { return getToken(FunctionCraftParser.DO, 0); }
		public Loop_bodyContext loop_body() {
			return getRuleContext(Loop_bodyContext.class,0);
		}
		public TerminalNode END() { return getToken(FunctionCraftParser.END, 0); }
		public Do_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterDo_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitDo_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitDo_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_loopContext do_loop() throws RecognitionException {
		Do_loopContext _localctx = new Do_loopContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_do_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(LOOP);
			setState(262);
			match(DO);
			 System.out.println("LOOP: DO"); 
			setState(264);
			loop_body();
			setState(265);
			match(END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Loop_bodyContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<Control_structureContext> control_structure() {
			return getRuleContexts(Control_structureContext.class);
		}
		public Control_structureContext control_structure(int i) {
			return getRuleContext(Control_structureContext.class,i);
		}
		public Loop_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterLoop_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitLoop_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitLoop_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Loop_bodyContext loop_body() throws RecognitionException {
		Loop_bodyContext _localctx = new Loop_bodyContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_loop_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 22799508006371104L) != 0)) {
				{
				setState(269);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IF:
				case TRUE:
				case FALSE:
				case CHOP:
				case CHOMP:
				case PUSH:
				case PUTS:
				case METHOD:
				case LEN:
				case LOOP:
				case FOR:
				case LAMBDA:
				case ID:
				case INT_LITERAL:
				case FLOAT_LITERAL:
				case STRING_LITERAL:
				case SUB:
				case NOT:
				case LEFT_PAREN:
				case LEFT_BRACKET:
					{
					setState(267);
					statement();
					}
					break;
				case NEXT:
				case BREAK:
					{
					setState(268);
					control_structure();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(273);
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

	@SuppressWarnings("CheckReturnValue")
	public static class For_loopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(FunctionCraftParser.FOR, 0); }
		public List<TerminalNode> ID() { return getTokens(FunctionCraftParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(FunctionCraftParser.ID, i);
		}
		public TerminalNode IN() { return getToken(FunctionCraftParser.IN, 0); }
		public Loop_bodyContext loop_body() {
			return getRuleContext(Loop_bodyContext.class,0);
		}
		public TerminalNode END() { return getToken(FunctionCraftParser.END, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public For_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterFor_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitFor_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitFor_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_for_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(FOR);
			 System.out.println("LOOP: FOR"); 
			setState(276);
			match(ID);
			setState(277);
			match(IN);
			setState(281);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_BRACKET:
				{
				setState(278);
				list();
				}
				break;
			case LEFT_PAREN:
				{
				setState(279);
				range();
				}
				break;
			case ID:
				{
				setState(280);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(283);
			loop_body();
			setState(284);
			match(END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RangeContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(FunctionCraftParser.LEFT_PAREN, 0); }
		public List<TerminalNode> INT_LITERAL() { return getTokens(FunctionCraftParser.INT_LITERAL); }
		public TerminalNode INT_LITERAL(int i) {
			return getToken(FunctionCraftParser.INT_LITERAL, i);
		}
		public TerminalNode RANGE_DOT() { return getToken(FunctionCraftParser.RANGE_DOT, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(FunctionCraftParser.RIGHT_PAREN, 0); }
		public RangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(LEFT_PAREN);
			setState(287);
			match(INT_LITERAL);
			setState(288);
			match(RANGE_DOT);
			setState(289);
			match(INT_LITERAL);
			setState(290);
			match(RIGHT_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACKET() { return getToken(FunctionCraftParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(FunctionCraftParser.RIGHT_BRACKET, 0); }
		public List_dataContext list_data() {
			return getRuleContext(List_dataContext.class,0);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(LEFT_BRACKET);
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 22799507993460480L) != 0)) {
				{
				setState(293);
				list_data();
				}
			}

			setState(296);
			match(RIGHT_BRACKET);
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

	@SuppressWarnings("CheckReturnValue")
	public static class List_dataContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FunctionCraftParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FunctionCraftParser.COMMA, i);
		}
		public List_dataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_data; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterList_data(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitList_data(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitList_data(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_dataContext list_data() throws RecognitionException {
		List_dataContext _localctx = new List_dataContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_list_data);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			expression();
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(299);
				match(COMMA);
				setState(300);
				expression();
				}
				}
				setState(305);
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

	@SuppressWarnings("CheckReturnValue")
	public static class List_accessContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(FunctionCraftParser.ID, 0); }
		public List<TerminalNode> LEFT_BRACKET() { return getTokens(FunctionCraftParser.LEFT_BRACKET); }
		public TerminalNode LEFT_BRACKET(int i) {
			return getToken(FunctionCraftParser.LEFT_BRACKET, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RIGHT_BRACKET() { return getTokens(FunctionCraftParser.RIGHT_BRACKET); }
		public TerminalNode RIGHT_BRACKET(int i) {
			return getToken(FunctionCraftParser.RIGHT_BRACKET, i);
		}
		public List_accessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_access; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterList_access(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitList_access(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitList_access(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_accessContext list_access() throws RecognitionException {
		List_accessContext _localctx = new List_accessContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_list_access);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(ID);
			setState(311); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(307);
				match(LEFT_BRACKET);
				setState(308);
				expression();
				setState(309);
				match(RIGHT_BRACKET);
				}
				}
				setState(313); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LEFT_BRACKET );
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

	@SuppressWarnings("CheckReturnValue")
	public static class Control_structureContext extends ParserRuleContext {
		public BreakContext break_() {
			return getRuleContext(BreakContext.class,0);
		}
		public Break_ifContext break_if() {
			return getRuleContext(Break_ifContext.class,0);
		}
		public NextContext next() {
			return getRuleContext(NextContext.class,0);
		}
		public Next_ifContext next_if() {
			return getRuleContext(Next_ifContext.class,0);
		}
		public Control_structureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_control_structure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterControl_structure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitControl_structure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitControl_structure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Control_structureContext control_structure() throws RecognitionException {
		Control_structureContext _localctx = new Control_structureContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_control_structure);
		try {
			setState(319);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				break_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(316);
				break_if();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(317);
				next();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(318);
				next_if();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BreakContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(FunctionCraftParser.BREAK, 0); }
		public TerminalNode SEMICOLON() { return getToken(FunctionCraftParser.SEMICOLON, 0); }
		public BreakContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterBreak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitBreak(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitBreak(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakContext break_() throws RecognitionException {
		BreakContext _localctx = new BreakContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_break);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(BREAK);
			 System.out.println("Control: BREAK"); 
			setState(323);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Break_ifContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(FunctionCraftParser.BREAK, 0); }
		public If_conditionContext if_condition() {
			return getRuleContext(If_conditionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(FunctionCraftParser.SEMICOLON, 0); }
		public Break_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterBreak_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitBreak_if(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitBreak_if(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Break_ifContext break_if() throws RecognitionException {
		Break_ifContext _localctx = new Break_ifContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_break_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(BREAK);
			 System.out.println("Control: BREAK"); 
			setState(327);
			if_condition();
			setState(328);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NextContext extends ParserRuleContext {
		public TerminalNode NEXT() { return getToken(FunctionCraftParser.NEXT, 0); }
		public TerminalNode SEMICOLON() { return getToken(FunctionCraftParser.SEMICOLON, 0); }
		public NextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_next; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterNext(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitNext(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitNext(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NextContext next() throws RecognitionException {
		NextContext _localctx = new NextContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_next);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(NEXT);
			 System.out.println("Control: NEXT"); 
			setState(332);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Next_ifContext extends ParserRuleContext {
		public TerminalNode NEXT() { return getToken(FunctionCraftParser.NEXT, 0); }
		public If_conditionContext if_condition() {
			return getRuleContext(If_conditionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(FunctionCraftParser.SEMICOLON, 0); }
		public Next_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_next_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterNext_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitNext_if(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitNext_if(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Next_ifContext next_if() throws RecognitionException {
		Next_ifContext _localctx = new Next_ifContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_next_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(NEXT);
			 System.out.println("Control: NEXT"); 
			setState(336);
			if_condition();
			setState(337);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public If_conditionContext if_condition() {
			return getRuleContext(If_conditionContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode END() { return getToken(FunctionCraftParser.END, 0); }
		public List<Elseif_conditionContext> elseif_condition() {
			return getRuleContexts(Elseif_conditionContext.class);
		}
		public Elseif_conditionContext elseif_condition(int i) {
			return getRuleContext(Elseif_conditionContext.class,i);
		}
		public Else_conditionContext else_condition() {
			return getRuleContext(Else_conditionContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			if_condition();
			setState(340);
			block();
			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(341);
				elseif_condition();
				setState(342);
				block();
				}
				}
				setState(348);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(349);
				else_condition();
				setState(350);
				block();
				}
			}

			setState(354);
			match(END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class If_conditionContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(FunctionCraftParser.IF, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(FunctionCraftParser.LEFT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(FunctionCraftParser.RIGHT_PAREN, 0); }
		public If_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterIf_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitIf_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitIf_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_conditionContext if_condition() throws RecognitionException {
		If_conditionContext _localctx = new If_conditionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_if_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			match(IF);
			 System.out.println("Decision: IF"); 
			setState(358);
			match(LEFT_PAREN);
			setState(359);
			expression();
			setState(360);
			match(RIGHT_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Elseif_conditionContext extends ParserRuleContext {
		public TerminalNode ELSEIF() { return getToken(FunctionCraftParser.ELSEIF, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(FunctionCraftParser.LEFT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(FunctionCraftParser.RIGHT_PAREN, 0); }
		public Elseif_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseif_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterElseif_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitElseif_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitElseif_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Elseif_conditionContext elseif_condition() throws RecognitionException {
		Elseif_conditionContext _localctx = new Elseif_conditionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_elseif_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			match(ELSEIF);
			 System.out.println("Decision: ELSE IF"); 
			setState(364);
			match(LEFT_PAREN);
			setState(365);
			expression();
			setState(366);
			match(RIGHT_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Else_conditionContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(FunctionCraftParser.ELSE, 0); }
		public Else_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterElse_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitElse_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitElse_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_conditionContext else_condition() throws RecognitionException {
		Else_conditionContext _localctx = new Else_conditionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_else_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(ELSE);
			 System.out.println("Decision: ELSE"); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class Return_statContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(FunctionCraftParser.RETURN, 0); }
		public TerminalNode SEMICOLON() { return getToken(FunctionCraftParser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Return_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterReturn_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitReturn_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitReturn_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_statContext return_stat() throws RecognitionException {
		Return_statContext _localctx = new Return_statContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_return_stat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			match(RETURN);
			 System.out.println("RETURN"); 
			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 22799507993460480L) != 0)) {
				{
				setState(373);
				expression();
				}
			}

			setState(376);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(FunctionCraftParser.ID, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(FunctionCraftParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(FunctionCraftParser.RIGHT_PAREN, 0); }
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			match(ID);
			 System.out.println("Function Call"); 
			setState(380);
			match(LEFT_PAREN);
			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 22799507993460480L) != 0)) {
				{
				setState(381);
				argument_list();
				}
			}

			setState(384);
			match(RIGHT_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_pointerContext extends ParserRuleContext {
		public TerminalNode METHOD() { return getToken(FunctionCraftParser.METHOD, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(FunctionCraftParser.LEFT_PAREN, 0); }
		public TerminalNode COLON() { return getToken(FunctionCraftParser.COLON, 0); }
		public TerminalNode ID() { return getToken(FunctionCraftParser.ID, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(FunctionCraftParser.RIGHT_PAREN, 0); }
		public Function_pointerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_pointer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterFunction_pointer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitFunction_pointer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitFunction_pointer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_pointerContext function_pointer() throws RecognitionException {
		Function_pointerContext _localctx = new Function_pointerContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_function_pointer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			match(METHOD);
			setState(387);
			match(LEFT_PAREN);
			setState(388);
			match(COLON);
			setState(389);
			match(ID);
			setState(390);
			match(RIGHT_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public Token name;
		public TerminalNode ID() { return getToken(FunctionCraftParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(FunctionCraftParser.ASSIGN, 0); }
		public TerminalNode ASSIGN_ADD() { return getToken(FunctionCraftParser.ASSIGN_ADD, 0); }
		public TerminalNode ASSIGN_DIV() { return getToken(FunctionCraftParser.ASSIGN_DIV, 0); }
		public TerminalNode ASSIGN_MUL() { return getToken(FunctionCraftParser.ASSIGN_MUL, 0); }
		public TerminalNode ASSIGN_SUB() { return getToken(FunctionCraftParser.ASSIGN_SUB, 0); }
		public TerminalNode ASSIGN_MOD() { return getToken(FunctionCraftParser.ASSIGN_MOD, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Function_pointerContext function_pointer() {
			return getRuleContext(Function_pointerContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			((AssignmentContext)_localctx).name = match(ID);
			 System.out.println("Assignment: " + (((AssignmentContext)_localctx).name!=null?((AssignmentContext)_localctx).name.getText():null)); 
			setState(394);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 566398812160L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(397);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(395);
				expression();
				}
				break;
			case 2:
				{
				setState(396);
				function_pointer();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(FunctionCraftParser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_statement);
		try {
			setState(407);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case CHOP:
			case CHOMP:
			case PUSH:
			case PUTS:
			case METHOD:
			case LEN:
			case LAMBDA:
			case ID:
			case INT_LITERAL:
			case FLOAT_LITERAL:
			case STRING_LITERAL:
			case SUB:
			case NOT:
			case LEFT_PAREN:
			case LEFT_BRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(401);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(399);
					expression();
					}
					break;
				case 2:
					{
					setState(400);
					assignment();
					}
					break;
				}
				setState(403);
				match(SEMICOLON);
				}
				break;
			case LOOP:
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(405);
				loop();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(406);
				condition();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public Append_expresstionContext append_expresstion() {
			return getRuleContext(Append_expresstionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			append_expresstion();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Append_expresstionContext extends ParserRuleContext {
		public Or_expressionContext or_expression() {
			return getRuleContext(Or_expressionContext.class,0);
		}
		public Append_expression_Context append_expression_() {
			return getRuleContext(Append_expression_Context.class,0);
		}
		public Append_expresstionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_append_expresstion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterAppend_expresstion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitAppend_expresstion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitAppend_expresstion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Append_expresstionContext append_expresstion() throws RecognitionException {
		Append_expresstionContext _localctx = new Append_expresstionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_append_expresstion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			or_expression();
			setState(412);
			append_expression_();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Append_expression_Context extends ParserRuleContext {
		public TerminalNode APPEND() { return getToken(FunctionCraftParser.APPEND, 0); }
		public Or_expressionContext or_expression() {
			return getRuleContext(Or_expressionContext.class,0);
		}
		public Append_expression_Context append_expression_() {
			return getRuleContext(Append_expression_Context.class,0);
		}
		public Append_expression_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_append_expression_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterAppend_expression_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitAppend_expression_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitAppend_expression_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Append_expression_Context append_expression_() throws RecognitionException {
		Append_expression_Context _localctx = new Append_expression_Context(_ctx, getState());
		enterRule(_localctx, 80, RULE_append_expression_);
		try {
			setState(420);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case APPEND:
				enterOuterAlt(_localctx, 1);
				{
				setState(414);
				match(APPEND);
				setState(415);
				or_expression();
				setState(416);
				append_expression_();
				System.out.println("Operator: <<");
				}
				break;
			case RIGHT_PAREN:
			case RIGHT_BRACKET:
			case COMMA:
			case SEMICOLON:
			case PATTERN_INDENT:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class Or_expressionContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(FunctionCraftParser.LEFT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(FunctionCraftParser.RIGHT_PAREN, 0); }
		public Or_expression_Context or_expression_() {
			return getRuleContext(Or_expression_Context.class,0);
		}
		public And_expressionContext and_expression() {
			return getRuleContext(And_expressionContext.class,0);
		}
		public Or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterOr_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitOr_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitOr_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Or_expressionContext or_expression() throws RecognitionException {
		Or_expressionContext _localctx = new Or_expressionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_or_expression);
		try {
			setState(428);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(422);
				match(LEFT_PAREN);
				setState(423);
				expression();
				setState(424);
				match(RIGHT_PAREN);
				setState(425);
				or_expression_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(427);
				and_expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Or_expression_Context extends ParserRuleContext {
		public TerminalNode OR() { return getToken(FunctionCraftParser.OR, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(FunctionCraftParser.LEFT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(FunctionCraftParser.RIGHT_PAREN, 0); }
		public Or_expression_Context or_expression_() {
			return getRuleContext(Or_expression_Context.class,0);
		}
		public Or_expression_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or_expression_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterOr_expression_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitOr_expression_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitOr_expression_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Or_expression_Context or_expression_() throws RecognitionException {
		Or_expression_Context _localctx = new Or_expression_Context(_ctx, getState());
		enterRule(_localctx, 84, RULE_or_expression_);
		try {
			setState(438);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OR:
				enterOuterAlt(_localctx, 1);
				{
				setState(430);
				match(OR);
				setState(431);
				match(LEFT_PAREN);
				setState(432);
				expression();
				setState(433);
				match(RIGHT_PAREN);
				setState(434);
				or_expression_();
				System.out.println("Operator: ||");
				}
				break;
			case APPEND:
			case RIGHT_PAREN:
			case RIGHT_BRACKET:
			case COMMA:
			case SEMICOLON:
			case PATTERN_INDENT:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class And_expressionContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(FunctionCraftParser.LEFT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(FunctionCraftParser.RIGHT_PAREN, 0); }
		public And_expression_Context and_expression_() {
			return getRuleContext(And_expression_Context.class,0);
		}
		public Eq_expressionContext eq_expression() {
			return getRuleContext(Eq_expressionContext.class,0);
		}
		public And_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterAnd_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitAnd_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitAnd_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final And_expressionContext and_expression() throws RecognitionException {
		And_expressionContext _localctx = new And_expressionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_and_expression);
		try {
			setState(446);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(440);
				match(LEFT_PAREN);
				setState(441);
				expression();
				setState(442);
				match(RIGHT_PAREN);
				setState(443);
				and_expression_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(445);
				eq_expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class And_expression_Context extends ParserRuleContext {
		public TerminalNode AND() { return getToken(FunctionCraftParser.AND, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(FunctionCraftParser.LEFT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(FunctionCraftParser.RIGHT_PAREN, 0); }
		public And_expression_Context and_expression_() {
			return getRuleContext(And_expression_Context.class,0);
		}
		public And_expression_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_expression_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterAnd_expression_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitAnd_expression_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitAnd_expression_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final And_expression_Context and_expression_() throws RecognitionException {
		And_expression_Context _localctx = new And_expression_Context(_ctx, getState());
		enterRule(_localctx, 88, RULE_and_expression_);
		try {
			setState(456);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(448);
				match(AND);
				setState(449);
				match(LEFT_PAREN);
				setState(450);
				expression();
				setState(451);
				match(RIGHT_PAREN);
				setState(452);
				and_expression_();
				System.out.println("Operator: &&");
				}
				break;
			case APPEND:
			case RIGHT_PAREN:
			case RIGHT_BRACKET:
			case COMMA:
			case SEMICOLON:
			case PATTERN_INDENT:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class Eq_expressionContext extends ParserRuleContext {
		public Compare_expressionContext compare_expression() {
			return getRuleContext(Compare_expressionContext.class,0);
		}
		public Eq_expression_Context eq_expression_() {
			return getRuleContext(Eq_expression_Context.class,0);
		}
		public Eq_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eq_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterEq_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitEq_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitEq_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Eq_expressionContext eq_expression() throws RecognitionException {
		Eq_expressionContext _localctx = new Eq_expressionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_eq_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			compare_expression();
			setState(459);
			eq_expression_();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Eq_expression_Context extends ParserRuleContext {
		public TerminalNode EQL() { return getToken(FunctionCraftParser.EQL, 0); }
		public Compare_expressionContext compare_expression() {
			return getRuleContext(Compare_expressionContext.class,0);
		}
		public Eq_expression_Context eq_expression_() {
			return getRuleContext(Eq_expression_Context.class,0);
		}
		public TerminalNode NEQ() { return getToken(FunctionCraftParser.NEQ, 0); }
		public Eq_expression_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eq_expression_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterEq_expression_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitEq_expression_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitEq_expression_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Eq_expression_Context eq_expression_() throws RecognitionException {
		Eq_expression_Context _localctx = new Eq_expression_Context(_ctx, getState());
		enterRule(_localctx, 92, RULE_eq_expression_);
		try {
			setState(472);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQL:
				enterOuterAlt(_localctx, 1);
				{
				setState(461);
				match(EQL);
				setState(462);
				compare_expression();
				setState(463);
				eq_expression_();
				System.out.println("Operator: ==");
				}
				break;
			case NEQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(466);
				match(NEQ);
				setState(467);
				compare_expression();
				setState(468);
				eq_expression_();
				System.out.println("Operator: !=");
				}
				break;
			case APPEND:
			case RIGHT_PAREN:
			case RIGHT_BRACKET:
			case COMMA:
			case SEMICOLON:
			case PATTERN_INDENT:
				enterOuterAlt(_localctx, 3);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class Compare_expressionContext extends ParserRuleContext {
		public Add_sub_expressionContext add_sub_expression() {
			return getRuleContext(Add_sub_expressionContext.class,0);
		}
		public Compare_expression_Context compare_expression_() {
			return getRuleContext(Compare_expression_Context.class,0);
		}
		public Compare_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compare_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterCompare_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitCompare_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitCompare_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compare_expressionContext compare_expression() throws RecognitionException {
		Compare_expressionContext _localctx = new Compare_expressionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_compare_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			add_sub_expression();
			setState(475);
			compare_expression_();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Compare_expression_Context extends ParserRuleContext {
		public TerminalNode GREATER() { return getToken(FunctionCraftParser.GREATER, 0); }
		public Add_sub_expressionContext add_sub_expression() {
			return getRuleContext(Add_sub_expressionContext.class,0);
		}
		public Compare_expression_Context compare_expression_() {
			return getRuleContext(Compare_expression_Context.class,0);
		}
		public TerminalNode LESS() { return getToken(FunctionCraftParser.LESS, 0); }
		public TerminalNode GEQ() { return getToken(FunctionCraftParser.GEQ, 0); }
		public TerminalNode LEQ() { return getToken(FunctionCraftParser.LEQ, 0); }
		public Compare_expression_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compare_expression_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterCompare_expression_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitCompare_expression_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitCompare_expression_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compare_expression_Context compare_expression_() throws RecognitionException {
		Compare_expression_Context _localctx = new Compare_expression_Context(_ctx, getState());
		enterRule(_localctx, 96, RULE_compare_expression_);
		try {
			setState(498);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GREATER:
				enterOuterAlt(_localctx, 1);
				{
				setState(477);
				match(GREATER);
				setState(478);
				add_sub_expression();
				setState(479);
				compare_expression_();
				System.out.println("Operator: >");
				}
				break;
			case LESS:
				enterOuterAlt(_localctx, 2);
				{
				setState(482);
				match(LESS);
				setState(483);
				add_sub_expression();
				setState(484);
				compare_expression_();
				System.out.println("Operator: <");
				}
				break;
			case GEQ:
				enterOuterAlt(_localctx, 3);
				{
				setState(487);
				match(GEQ);
				setState(488);
				add_sub_expression();
				setState(489);
				compare_expression_();
				System.out.println("Operator: >=");
				}
				break;
			case LEQ:
				enterOuterAlt(_localctx, 4);
				{
				setState(492);
				match(LEQ);
				setState(493);
				add_sub_expression();
				setState(494);
				compare_expression_();
				System.out.println("Operator: <=");
				}
				break;
			case EQL:
			case NEQ:
			case APPEND:
			case RIGHT_PAREN:
			case RIGHT_BRACKET:
			case COMMA:
			case SEMICOLON:
			case PATTERN_INDENT:
				enterOuterAlt(_localctx, 5);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class Add_sub_expressionContext extends ParserRuleContext {
		public Mul_div_expressionContext mul_div_expression() {
			return getRuleContext(Mul_div_expressionContext.class,0);
		}
		public Add_sub_expression_Context add_sub_expression_() {
			return getRuleContext(Add_sub_expression_Context.class,0);
		}
		public Add_sub_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_sub_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterAdd_sub_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitAdd_sub_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitAdd_sub_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Add_sub_expressionContext add_sub_expression() throws RecognitionException {
		Add_sub_expressionContext _localctx = new Add_sub_expressionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_add_sub_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			mul_div_expression();
			setState(501);
			add_sub_expression_();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Add_sub_expression_Context extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(FunctionCraftParser.ADD, 0); }
		public Mul_div_expressionContext mul_div_expression() {
			return getRuleContext(Mul_div_expressionContext.class,0);
		}
		public Add_sub_expression_Context add_sub_expression_() {
			return getRuleContext(Add_sub_expression_Context.class,0);
		}
		public TerminalNode SUB() { return getToken(FunctionCraftParser.SUB, 0); }
		public Add_sub_expression_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_sub_expression_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterAdd_sub_expression_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitAdd_sub_expression_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitAdd_sub_expression_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Add_sub_expression_Context add_sub_expression_() throws RecognitionException {
		Add_sub_expression_Context _localctx = new Add_sub_expression_Context(_ctx, getState());
		enterRule(_localctx, 100, RULE_add_sub_expression_);
		try {
			setState(514);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(503);
				match(ADD);
				setState(504);
				mul_div_expression();
				setState(505);
				add_sub_expression_();
				System.out.println("Operator: +");
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(508);
				match(SUB);
				setState(509);
				mul_div_expression();
				setState(510);
				add_sub_expression_();
				System.out.println("Operator: -");
				}
				break;
			case EQL:
			case NEQ:
			case LESS:
			case GREATER:
			case LEQ:
			case GEQ:
			case APPEND:
			case RIGHT_PAREN:
			case RIGHT_BRACKET:
			case COMMA:
			case SEMICOLON:
			case PATTERN_INDENT:
				enterOuterAlt(_localctx, 3);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class Mul_div_expressionContext extends ParserRuleContext {
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public Mul_div_expression_Context mul_div_expression_() {
			return getRuleContext(Mul_div_expression_Context.class,0);
		}
		public Mul_div_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mul_div_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterMul_div_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitMul_div_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitMul_div_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mul_div_expressionContext mul_div_expression() throws RecognitionException {
		Mul_div_expressionContext _localctx = new Mul_div_expressionContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_mul_div_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			unary_expression();
			setState(517);
			mul_div_expression_();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Mul_div_expression_Context extends ParserRuleContext {
		public TerminalNode MUL() { return getToken(FunctionCraftParser.MUL, 0); }
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public Mul_div_expression_Context mul_div_expression_() {
			return getRuleContext(Mul_div_expression_Context.class,0);
		}
		public TerminalNode DIV() { return getToken(FunctionCraftParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(FunctionCraftParser.MOD, 0); }
		public Mul_div_expression_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mul_div_expression_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterMul_div_expression_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitMul_div_expression_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitMul_div_expression_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mul_div_expression_Context mul_div_expression_() throws RecognitionException {
		Mul_div_expression_Context _localctx = new Mul_div_expression_Context(_ctx, getState());
		enterRule(_localctx, 104, RULE_mul_div_expression_);
		try {
			setState(535);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MUL:
				enterOuterAlt(_localctx, 1);
				{
				setState(519);
				match(MUL);
				setState(520);
				unary_expression();
				setState(521);
				mul_div_expression_();
				System.out.println("Operator: *");
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 2);
				{
				setState(524);
				match(DIV);
				setState(525);
				unary_expression();
				setState(526);
				mul_div_expression_();
				System.out.println("Operator: /");
				}
				break;
			case MOD:
				enterOuterAlt(_localctx, 3);
				{
				setState(529);
				match(MOD);
				setState(530);
				unary_expression();
				setState(531);
				mul_div_expression_();
				System.out.println("Operator: %");
				}
				break;
			case ADD:
			case SUB:
			case EQL:
			case NEQ:
			case LESS:
			case GREATER:
			case LEQ:
			case GEQ:
			case APPEND:
			case RIGHT_PAREN:
			case RIGHT_BRACKET:
			case COMMA:
			case SEMICOLON:
			case PATTERN_INDENT:
				enterOuterAlt(_localctx, 4);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class Unary_expressionContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(FunctionCraftParser.NOT, 0); }
		public Other_expressionContext other_expression() {
			return getRuleContext(Other_expressionContext.class,0);
		}
		public TerminalNode SUB() { return getToken(FunctionCraftParser.SUB, 0); }
		public Unary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterUnary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitUnary_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitUnary_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_expressionContext unary_expression() throws RecognitionException {
		Unary_expressionContext _localctx = new Unary_expressionContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_unary_expression);
		try {
			setState(546);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(537);
				match(NOT);
				setState(538);
				other_expression();
				System.out.println("Operator: !");
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(541);
				match(SUB);
				setState(542);
				other_expression();
				System.out.println("Operator: -");
				}
				break;
			case TRUE:
			case FALSE:
			case CHOP:
			case CHOMP:
			case PUSH:
			case PUTS:
			case METHOD:
			case LEN:
			case LAMBDA:
			case ID:
			case INT_LITERAL:
			case FLOAT_LITERAL:
			case STRING_LITERAL:
			case LEFT_PAREN:
			case LEFT_BRACKET:
				enterOuterAlt(_localctx, 3);
				{
				setState(545);
				other_expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Other_expressionContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(FunctionCraftParser.LEFT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(FunctionCraftParser.RIGHT_PAREN, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public List_accessContext list_access() {
			return getRuleContext(List_accessContext.class,0);
		}
		public TerminalNode ID() { return getToken(FunctionCraftParser.ID, 0); }
		public TerminalNode INC() { return getToken(FunctionCraftParser.INC, 0); }
		public TerminalNode DEC() { return getToken(FunctionCraftParser.DEC, 0); }
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public LenContext len() {
			return getRuleContext(LenContext.class,0);
		}
		public PutsContext puts() {
			return getRuleContext(PutsContext.class,0);
		}
		public PushContext push() {
			return getRuleContext(PushContext.class,0);
		}
		public ChopContext chop() {
			return getRuleContext(ChopContext.class,0);
		}
		public ChompContext chomp() {
			return getRuleContext(ChompContext.class,0);
		}
		public Function_pointerContext function_pointer() {
			return getRuleContext(Function_pointerContext.class,0);
		}
		public MatchContext match() {
			return getRuleContext(MatchContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Lambda_functionContext lambda_function() {
			return getRuleContext(Lambda_functionContext.class,0);
		}
		public Other_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_other_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterOther_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitOther_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitOther_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Other_expressionContext other_expression() throws RecognitionException {
		Other_expressionContext _localctx = new Other_expressionContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_other_expression);
		int _la;
		try {
			setState(571);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(548);
				match(LEFT_PAREN);
				setState(549);
				expression();
				setState(550);
				match(RIGHT_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(552);
				list();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(553);
				list_access();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(556);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(554);
					match(ID);
					}
					break;
				case 2:
					{
					setState(555);
					list_access();
					}
					break;
				}
				setState(559);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INC || _la==DEC) {
					{
					setState(558);
					_la = _input.LA(1);
					if ( !(_la==INC || _la==DEC) ) {
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
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(561);
				function_call();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(562);
				len();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(563);
				puts();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(564);
				push();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(565);
				chop();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(566);
				chomp();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(567);
				function_pointer();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(568);
				match();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(569);
				literal();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(570);
				lambda_function();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Boolean_literalContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(FunctionCraftParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(FunctionCraftParser.FALSE, 0); }
		public Boolean_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterBoolean_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitBoolean_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitBoolean_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_literalContext boolean_literal() throws RecognitionException {
		Boolean_literalContext _localctx = new Boolean_literalContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_boolean_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode INT_LITERAL() { return getToken(FunctionCraftParser.INT_LITERAL, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(FunctionCraftParser.FLOAT_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(FunctionCraftParser.STRING_LITERAL, 0); }
		public Boolean_literalContext boolean_literal() {
			return getRuleContext(Boolean_literalContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_literal);
		try {
			setState(579);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(575);
				match(INT_LITERAL);
				}
				break;
			case FLOAT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(576);
				match(FLOAT_LITERAL);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(577);
				match(STRING_LITERAL);
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(578);
				boolean_literal();
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
		"\u0004\u0001B\u0246\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u0001\u0000\u0001\u0000\u0005\u0000u\b\u0000\n"+
		"\u0000\f\u0000x\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0081\b\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u0093\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0005\u0003\u0098\b\u0003\n\u0003\f\u0003\u009b"+
		"\t\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u009f\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u00a5\b\u0004\n\u0004"+
		"\f\u0004\u00a8\t\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006"+
		"\u00b3\b\u0006\n\u0006\f\u0006\u00b6\t\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0004\b\u00cd\b\b\u000b\b\f\b\u00ce\u0001\b"+
		"\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0005\n\u00dc\b\n\n\n\f\n\u00df\t\n\u0001\n\u0003\n\u00e2\b"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0003\u0010\u0104\b\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0005\u0012\u010e\b\u0012\n\u0012\f\u0012\u0111"+
		"\t\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0003\u0013\u011a\b\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0001\u0015\u0003\u0015\u0127\b\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u012e\b\u0016\n"+
		"\u0016\f\u0016\u0131\t\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0004\u0017\u0138\b\u0017\u000b\u0017\f\u0017\u0139"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0140\b\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d"+
		"\u0159\b\u001d\n\u001d\f\u001d\u015c\t\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0003\u001d\u0161\b\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001"+
		" \u0001!\u0001!\u0001!\u0003!\u0177\b!\u0001!\u0001!\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0003\"\u017f\b\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0001$\u0003$\u018e\b$\u0001"+
		"%\u0001%\u0003%\u0192\b%\u0001%\u0001%\u0001%\u0001%\u0003%\u0198\b%\u0001"+
		"&\u0001&\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0003(\u01a5\b(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0003)\u01ad"+
		"\b)\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0003*\u01b7"+
		"\b*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0003+\u01bf\b+\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0003,\u01c9\b,\u0001-\u0001"+
		"-\u0001-\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001"+
		".\u0001.\u0001.\u0003.\u01d9\b.\u0001/\u0001/\u0001/\u00010\u00010\u0001"+
		"0\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u0001"+
		"0\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00030\u01f3"+
		"\b0\u00011\u00011\u00011\u00012\u00012\u00012\u00012\u00012\u00012\u0001"+
		"2\u00012\u00012\u00012\u00012\u00032\u0203\b2\u00013\u00013\u00013\u0001"+
		"4\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u0001"+
		"4\u00014\u00014\u00014\u00014\u00014\u00034\u0218\b4\u00015\u00015\u0001"+
		"5\u00015\u00015\u00015\u00015\u00015\u00015\u00035\u0223\b5\u00016\u0001"+
		"6\u00016\u00016\u00016\u00016\u00016\u00016\u00036\u022d\b6\u00016\u0003"+
		"6\u0230\b6\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u0001"+
		"6\u00016\u00036\u023c\b6\u00017\u00017\u00018\u00018\u00018\u00018\u0003"+
		"8\u0244\b8\u00018\u0000\u00009\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPR"+
		"TVXZ\\^`bdfhjlnp\u0000\u0003\u0002\u0000\u001d!\'\'\u0001\u000023\u0001"+
		"\u0000\b\t\u024e\u0000v\u0001\u0000\u0000\u0000\u0002{\u0001\u0000\u0000"+
		"\u0000\u0004\u0086\u0001\u0000\u0000\u0000\u0006\u0094\u0001\u0000\u0000"+
		"\u0000\b\u00a0\u0001\u0000\u0000\u0000\n\u00ab\u0001\u0000\u0000\u0000"+
		"\f\u00af\u0001\u0000\u0000\u0000\u000e\u00b7\u0001\u0000\u0000\u0000\u0010"+
		"\u00bf\u0001\u0000\u0000\u0000\u0012\u00d2\u0001\u0000\u0000\u0000\u0014"+
		"\u00dd\u0001\u0000\u0000\u0000\u0016\u00e3\u0001\u0000\u0000\u0000\u0018"+
		"\u00e9\u0001\u0000\u0000\u0000\u001a\u00ef\u0001\u0000\u0000\u0000\u001c"+
		"\u00f5\u0001\u0000\u0000\u0000\u001e\u00fb\u0001\u0000\u0000\u0000 \u0103"+
		"\u0001\u0000\u0000\u0000\"\u0105\u0001\u0000\u0000\u0000$\u010f\u0001"+
		"\u0000\u0000\u0000&\u0112\u0001\u0000\u0000\u0000(\u011e\u0001\u0000\u0000"+
		"\u0000*\u0124\u0001\u0000\u0000\u0000,\u012a\u0001\u0000\u0000\u0000."+
		"\u0132\u0001\u0000\u0000\u00000\u013f\u0001\u0000\u0000\u00002\u0141\u0001"+
		"\u0000\u0000\u00004\u0145\u0001\u0000\u0000\u00006\u014a\u0001\u0000\u0000"+
		"\u00008\u014e\u0001\u0000\u0000\u0000:\u0153\u0001\u0000\u0000\u0000<"+
		"\u0164\u0001\u0000\u0000\u0000>\u016a\u0001\u0000\u0000\u0000@\u0170\u0001"+
		"\u0000\u0000\u0000B\u0173\u0001\u0000\u0000\u0000D\u017a\u0001\u0000\u0000"+
		"\u0000F\u0182\u0001\u0000\u0000\u0000H\u0188\u0001\u0000\u0000\u0000J"+
		"\u0197\u0001\u0000\u0000\u0000L\u0199\u0001\u0000\u0000\u0000N\u019b\u0001"+
		"\u0000\u0000\u0000P\u01a4\u0001\u0000\u0000\u0000R\u01ac\u0001\u0000\u0000"+
		"\u0000T\u01b6\u0001\u0000\u0000\u0000V\u01be\u0001\u0000\u0000\u0000X"+
		"\u01c8\u0001\u0000\u0000\u0000Z\u01ca\u0001\u0000\u0000\u0000\\\u01d8"+
		"\u0001\u0000\u0000\u0000^\u01da\u0001\u0000\u0000\u0000`\u01f2\u0001\u0000"+
		"\u0000\u0000b\u01f4\u0001\u0000\u0000\u0000d\u0202\u0001\u0000\u0000\u0000"+
		"f\u0204\u0001\u0000\u0000\u0000h\u0217\u0001\u0000\u0000\u0000j\u0222"+
		"\u0001\u0000\u0000\u0000l\u023b\u0001\u0000\u0000\u0000n\u023d\u0001\u0000"+
		"\u0000\u0000p\u0243\u0001\u0000\u0000\u0000ru\u0003\u0002\u0001\u0000"+
		"su\u0003\u0010\b\u0000tr\u0001\u0000\u0000\u0000ts\u0001\u0000\u0000\u0000"+
		"ux\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000"+
		"\u0000wy\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000yz\u0003\u000e"+
		"\u0007\u0000z\u0001\u0001\u0000\u0000\u0000{|\u0005\u0001\u0000\u0000"+
		"|}\u0005\u0019\u0000\u0000}~\u0006\u0001\uffff\uffff\u0000~\u0080\u0005"+
		"4\u0000\u0000\u007f\u0081\u0003\u0006\u0003\u0000\u0080\u007f\u0001\u0000"+
		"\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000"+
		"\u0000\u0000\u0082\u0083\u00055\u0000\u0000\u0083\u0084\u0003\u0014\n"+
		"\u0000\u0084\u0085\u0005\u0002\u0000\u0000\u0085\u0003\u0001\u0000\u0000"+
		"\u0000\u0086\u0087\u0005\u0018\u0000\u0000\u0087\u0088\u0006\u0002\uffff"+
		"\uffff\u0000\u0088\u0089\u00054\u0000\u0000\u0089\u008a\u0003\u0006\u0003"+
		"\u0000\u008a\u008b\u00055\u0000\u0000\u008b\u008c\u00058\u0000\u0000\u008c"+
		"\u008d\u0003\u0014\n\u0000\u008d\u0092\u00059\u0000\u0000\u008e\u008f"+
		"\u00054\u0000\u0000\u008f\u0090\u0003\f\u0006\u0000\u0090\u0091\u0005"+
		"5\u0000\u0000\u0091\u0093\u0001\u0000\u0000\u0000\u0092\u008e\u0001\u0000"+
		"\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0005\u0001\u0000"+
		"\u0000\u0000\u0094\u0099\u0005\u0019\u0000\u0000\u0095\u0096\u0005:\u0000"+
		"\u0000\u0096\u0098\u0005\u0019\u0000\u0000\u0097\u0095\u0001\u0000\u0000"+
		"\u0000\u0098\u009b\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000\u0000"+
		"\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u009e\u0001\u0000\u0000"+
		"\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009c\u009d\u0005:\u0000\u0000"+
		"\u009d\u009f\u0003\b\u0004\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009e"+
		"\u009f\u0001\u0000\u0000\u0000\u009f\u0007\u0001\u0000\u0000\u0000\u00a0"+
		"\u00a1\u00056\u0000\u0000\u00a1\u00a6\u0003\n\u0005\u0000\u00a2\u00a3"+
		"\u0005:\u0000\u0000\u00a3\u00a5\u0003\n\u0005\u0000\u00a4\u00a2\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a8\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001"+
		"\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7\u00a9\u0001"+
		"\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005"+
		"7\u0000\u0000\u00aa\t\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005\u0019"+
		"\u0000\u0000\u00ac\u00ad\u0005\'\u0000\u0000\u00ad\u00ae\u0003L&\u0000"+
		"\u00ae\u000b\u0001\u0000\u0000\u0000\u00af\u00b4\u0003L&\u0000\u00b0\u00b1"+
		"\u0005:\u0000\u0000\u00b1\u00b3\u0003L&\u0000\u00b2\u00b0\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b6\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001\u0000"+
		"\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\r\u0001\u0000\u0000"+
		"\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005\u0001\u0000"+
		"\u0000\u00b8\u00b9\u0005\u0003\u0000\u0000\u00b9\u00ba\u0006\u0007\uffff"+
		"\uffff\u0000\u00ba\u00bb\u00054\u0000\u0000\u00bb\u00bc\u00055\u0000\u0000"+
		"\u00bc\u00bd\u0003\u0014\n\u0000\u00bd\u00be\u0005\u0002\u0000\u0000\u00be"+
		"\u000f\u0001\u0000\u0000\u0000\u00bf\u00c0\u0005\u0014\u0000\u0000\u00c0"+
		"\u00c1\u0005\u0019\u0000\u0000\u00c1\u00c2\u0006\b\uffff\uffff\u0000\u00c2"+
		"\u00c3\u00054\u0000\u0000\u00c3\u00c4\u0003\u0006\u0003\u0000\u00c4\u00cc"+
		"\u00055\u0000\u0000\u00c5\u00c6\u0005A\u0000\u0000\u00c6\u00c7\u00054"+
		"\u0000\u0000\u00c7\u00c8\u0003L&\u0000\u00c8\u00c9\u00055\u0000\u0000"+
		"\u00c9\u00ca\u0005\'\u0000\u0000\u00ca\u00cb\u0003L&\u0000\u00cb\u00cd"+
		"\u0001\u0000\u0000\u0000\u00cc\u00c5\u0001\u0000\u0000\u0000\u00cd\u00ce"+
		"\u0001\u0000\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00ce\u00cf"+
		"\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d1"+
		"\u0005<\u0000\u0000\u00d1\u0011\u0001\u0000\u0000\u0000\u00d2\u00d3\u0005"+
		"\u0019\u0000\u0000\u00d3\u00d4\u0006\t\uffff\uffff\u0000\u00d4\u00d5\u0005"+
		">\u0000\u0000\u00d5\u00d6\u0005\u0015\u0000\u0000\u00d6\u00d7\u00054\u0000"+
		"\u0000\u00d7\u00d8\u0003\f\u0006\u0000\u00d8\u00d9\u00055\u0000\u0000"+
		"\u00d9\u0013\u0001\u0000\u0000\u0000\u00da\u00dc\u0003J%\u0000\u00db\u00da"+
		"\u0001\u0000\u0000\u0000\u00dc\u00df\u0001\u0000\u0000\u0000\u00dd\u00db"+
		"\u0001\u0000\u0000\u0000\u00dd\u00de\u0001\u0000\u0000\u0000\u00de\u00e1"+
		"\u0001\u0000\u0000\u0000\u00df\u00dd\u0001\u0000\u0000\u0000\u00e0\u00e2"+
		"\u0003B!\u0000\u00e1\u00e0\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001\u0000"+
		"\u0000\u0000\u00e2\u0015\u0001\u0000\u0000\u0000\u00e3\u00e4\u0005\r\u0000"+
		"\u0000\u00e4\u00e5\u0006\u000b\uffff\uffff\u0000\u00e5\u00e6\u00054\u0000"+
		"\u0000\u00e6\u00e7\u0003L&\u0000\u00e7\u00e8\u00055\u0000\u0000\u00e8"+
		"\u0017\u0001\u0000\u0000\u0000\u00e9\u00ea\u0005\f\u0000\u0000\u00ea\u00eb"+
		"\u0006\f\uffff\uffff\u0000\u00eb\u00ec\u00054\u0000\u0000\u00ec\u00ed"+
		"\u0003L&\u0000\u00ed\u00ee\u00055\u0000\u0000\u00ee\u0019\u0001\u0000"+
		"\u0000\u0000\u00ef\u00f0\u0005\u000f\u0000\u0000\u00f0\u00f1\u0006\r\uffff"+
		"\uffff\u0000\u00f1\u00f2\u00054\u0000\u0000\u00f2\u00f3\u0003L&\u0000"+
		"\u00f3\u00f4\u00055\u0000\u0000\u00f4\u001b\u0001\u0000\u0000\u0000\u00f5"+
		"\u00f6\u0005\n\u0000\u0000\u00f6\u00f7\u0006\u000e\uffff\uffff\u0000\u00f7"+
		"\u00f8\u00054\u0000\u0000\u00f8\u00f9\u0003L&\u0000\u00f9\u00fa\u0005"+
		"5\u0000\u0000\u00fa\u001d\u0001\u0000\u0000\u0000\u00fb\u00fc\u0005\u000b"+
		"\u0000\u0000\u00fc\u00fd\u0006\u000f\uffff\uffff\u0000\u00fd\u00fe\u0005"+
		"4\u0000\u0000\u00fe\u00ff\u0003L&\u0000\u00ff\u0100\u00055\u0000\u0000"+
		"\u0100\u001f\u0001\u0000\u0000\u0000\u0101\u0104\u0003\"\u0011\u0000\u0102"+
		"\u0104\u0003&\u0013\u0000\u0103\u0101\u0001\u0000\u0000\u0000\u0103\u0102"+
		"\u0001\u0000\u0000\u0000\u0104!\u0001\u0000\u0000\u0000\u0105\u0106\u0005"+
		"\u0010\u0000\u0000\u0106\u0107\u0005\u0011\u0000\u0000\u0107\u0108\u0006"+
		"\u0011\uffff\uffff\u0000\u0108\u0109\u0003$\u0012\u0000\u0109\u010a\u0005"+
		"\u0002\u0000\u0000\u010a#\u0001\u0000\u0000\u0000\u010b\u010e\u0003J%"+
		"\u0000\u010c\u010e\u00030\u0018\u0000\u010d\u010b\u0001\u0000\u0000\u0000"+
		"\u010d\u010c\u0001\u0000\u0000\u0000\u010e\u0111\u0001\u0000\u0000\u0000"+
		"\u010f\u010d\u0001\u0000\u0000\u0000\u010f\u0110\u0001\u0000\u0000\u0000"+
		"\u0110%\u0001\u0000\u0000\u0000\u0111\u010f\u0001\u0000\u0000\u0000\u0112"+
		"\u0113\u0005\u0012\u0000\u0000\u0113\u0114\u0006\u0013\uffff\uffff\u0000"+
		"\u0114\u0115\u0005\u0019\u0000\u0000\u0115\u0119\u0005\u0013\u0000\u0000"+
		"\u0116\u011a\u0003*\u0015\u0000\u0117\u011a\u0003(\u0014\u0000\u0118\u011a"+
		"\u0005\u0019\u0000\u0000\u0119\u0116\u0001\u0000\u0000\u0000\u0119\u0117"+
		"\u0001\u0000\u0000\u0000\u0119\u0118\u0001\u0000\u0000\u0000\u011a\u011b"+
		"\u0001\u0000\u0000\u0000\u011b\u011c\u0003$\u0012\u0000\u011c\u011d\u0005"+
		"\u0002\u0000\u0000\u011d\'\u0001\u0000\u0000\u0000\u011e\u011f\u00054"+
		"\u0000\u0000\u011f\u0120\u0005\u001a\u0000\u0000\u0120\u0121\u0005;\u0000"+
		"\u0000\u0121\u0122\u0005\u001a\u0000\u0000\u0122\u0123\u00055\u0000\u0000"+
		"\u0123)\u0001\u0000\u0000\u0000\u0124\u0126\u00056\u0000\u0000\u0125\u0127"+
		"\u0003,\u0016\u0000\u0126\u0125\u0001\u0000\u0000\u0000\u0126\u0127\u0001"+
		"\u0000\u0000\u0000\u0127\u0128\u0001\u0000\u0000\u0000\u0128\u0129\u0005"+
		"7\u0000\u0000\u0129+\u0001\u0000\u0000\u0000\u012a\u012f\u0003L&\u0000"+
		"\u012b\u012c\u0005:\u0000\u0000\u012c\u012e\u0003L&\u0000\u012d\u012b"+
		"\u0001\u0000\u0000\u0000\u012e\u0131\u0001\u0000\u0000\u0000\u012f\u012d"+
		"\u0001\u0000\u0000\u0000\u012f\u0130\u0001\u0000\u0000\u0000\u0130-\u0001"+
		"\u0000\u0000\u0000\u0131\u012f\u0001\u0000\u0000\u0000\u0132\u0137\u0005"+
		"\u0019\u0000\u0000\u0133\u0134\u00056\u0000\u0000\u0134\u0135\u0003L&"+
		"\u0000\u0135\u0136\u00057\u0000\u0000\u0136\u0138\u0001\u0000\u0000\u0000"+
		"\u0137\u0133\u0001\u0000\u0000\u0000\u0138\u0139\u0001\u0000\u0000\u0000"+
		"\u0139\u0137\u0001\u0000\u0000\u0000\u0139\u013a\u0001\u0000\u0000\u0000"+
		"\u013a/\u0001\u0000\u0000\u0000\u013b\u0140\u00032\u0019\u0000\u013c\u0140"+
		"\u00034\u001a\u0000\u013d\u0140\u00036\u001b\u0000\u013e\u0140\u00038"+
		"\u001c\u0000\u013f\u013b\u0001\u0000\u0000\u0000\u013f\u013c\u0001\u0000"+
		"\u0000\u0000\u013f\u013d\u0001\u0000\u0000\u0000\u013f\u013e\u0001\u0000"+
		"\u0000\u0000\u01401\u0001\u0000\u0000\u0000\u0141\u0142\u0005\u0017\u0000"+
		"\u0000\u0142\u0143\u0006\u0019\uffff\uffff\u0000\u0143\u0144\u0005<\u0000"+
		"\u0000\u01443\u0001\u0000\u0000\u0000\u0145\u0146\u0005\u0017\u0000\u0000"+
		"\u0146\u0147\u0006\u001a\uffff\uffff\u0000\u0147\u0148\u0003<\u001e\u0000"+
		"\u0148\u0149\u0005<\u0000\u0000\u01495\u0001\u0000\u0000\u0000\u014a\u014b"+
		"\u0005\u0016\u0000\u0000\u014b\u014c\u0006\u001b\uffff\uffff\u0000\u014c"+
		"\u014d\u0005<\u0000\u0000\u014d7\u0001\u0000\u0000\u0000\u014e\u014f\u0005"+
		"\u0016\u0000\u0000\u014f\u0150\u0006\u001c\uffff\uffff\u0000\u0150\u0151"+
		"\u0003<\u001e\u0000\u0151\u0152\u0005<\u0000\u0000\u01529\u0001\u0000"+
		"\u0000\u0000\u0153\u0154\u0003<\u001e\u0000\u0154\u015a\u0003\u0014\n"+
		"\u0000\u0155\u0156\u0003>\u001f\u0000\u0156\u0157\u0003\u0014\n\u0000"+
		"\u0157\u0159\u0001\u0000\u0000\u0000\u0158\u0155\u0001\u0000\u0000\u0000"+
		"\u0159\u015c\u0001\u0000\u0000\u0000\u015a\u0158\u0001\u0000\u0000\u0000"+
		"\u015a\u015b\u0001\u0000\u0000\u0000\u015b\u0160\u0001\u0000\u0000\u0000"+
		"\u015c\u015a\u0001\u0000\u0000\u0000\u015d\u015e\u0003@ \u0000\u015e\u015f"+
		"\u0003\u0014\n\u0000\u015f\u0161\u0001\u0000\u0000\u0000\u0160\u015d\u0001"+
		"\u0000\u0000\u0000\u0160\u0161\u0001\u0000\u0000\u0000\u0161\u0162\u0001"+
		"\u0000\u0000\u0000\u0162\u0163\u0005\u0002\u0000\u0000\u0163;\u0001\u0000"+
		"\u0000\u0000\u0164\u0165\u0005\u0005\u0000\u0000\u0165\u0166\u0006\u001e"+
		"\uffff\uffff\u0000\u0166\u0167\u00054\u0000\u0000\u0167\u0168\u0003L&"+
		"\u0000\u0168\u0169\u00055\u0000\u0000\u0169=\u0001\u0000\u0000\u0000\u016a"+
		"\u016b\u0005\u0007\u0000\u0000\u016b\u016c\u0006\u001f\uffff\uffff\u0000"+
		"\u016c\u016d\u00054\u0000\u0000\u016d\u016e\u0003L&\u0000\u016e\u016f"+
		"\u00055\u0000\u0000\u016f?\u0001\u0000\u0000\u0000\u0170\u0171\u0005\u0006"+
		"\u0000\u0000\u0171\u0172\u0006 \uffff\uffff\u0000\u0172A\u0001\u0000\u0000"+
		"\u0000\u0173\u0174\u0005\u0004\u0000\u0000\u0174\u0176\u0006!\uffff\uffff"+
		"\u0000\u0175\u0177\u0003L&\u0000\u0176\u0175\u0001\u0000\u0000\u0000\u0176"+
		"\u0177\u0001\u0000\u0000\u0000\u0177\u0178\u0001\u0000\u0000\u0000\u0178"+
		"\u0179\u0005<\u0000\u0000\u0179C\u0001\u0000\u0000\u0000\u017a\u017b\u0005"+
		"\u0019\u0000\u0000\u017b\u017c\u0006\"\uffff\uffff\u0000\u017c\u017e\u0005"+
		"4\u0000\u0000\u017d\u017f\u0003\f\u0006\u0000\u017e\u017d\u0001\u0000"+
		"\u0000\u0000\u017e\u017f\u0001\u0000\u0000\u0000\u017f\u0180\u0001\u0000"+
		"\u0000\u0000\u0180\u0181\u00055\u0000\u0000\u0181E\u0001\u0000\u0000\u0000"+
		"\u0182\u0183\u0005\u000e\u0000\u0000\u0183\u0184\u00054\u0000\u0000\u0184"+
		"\u0185\u0005=\u0000\u0000\u0185\u0186\u0005\u0019\u0000\u0000\u0186\u0187"+
		"\u00055\u0000\u0000\u0187G\u0001\u0000\u0000\u0000\u0188\u0189\u0005\u0019"+
		"\u0000\u0000\u0189\u018a\u0006$\uffff\uffff\u0000\u018a\u018d\u0007\u0000"+
		"\u0000\u0000\u018b\u018e\u0003L&\u0000\u018c\u018e\u0003F#\u0000\u018d"+
		"\u018b\u0001\u0000\u0000\u0000\u018d\u018c\u0001\u0000\u0000\u0000\u018e"+
		"I\u0001\u0000\u0000\u0000\u018f\u0192\u0003L&\u0000\u0190\u0192\u0003"+
		"H$\u0000\u0191\u018f\u0001\u0000\u0000\u0000\u0191\u0190\u0001\u0000\u0000"+
		"\u0000\u0192\u0193\u0001\u0000\u0000\u0000\u0193\u0194\u0005<\u0000\u0000"+
		"\u0194\u0198\u0001\u0000\u0000\u0000\u0195\u0198\u0003 \u0010\u0000\u0196"+
		"\u0198\u0003:\u001d\u0000\u0197\u0191\u0001\u0000\u0000\u0000\u0197\u0195"+
		"\u0001\u0000\u0000\u0000\u0197\u0196\u0001\u0000\u0000\u0000\u0198K\u0001"+
		"\u0000\u0000\u0000\u0199\u019a\u0003N\'\u0000\u019aM\u0001\u0000\u0000"+
		"\u0000\u019b\u019c\u0003R)\u0000\u019c\u019d\u0003P(\u0000\u019dO\u0001"+
		"\u0000\u0000\u0000\u019e\u019f\u00051\u0000\u0000\u019f\u01a0\u0003R)"+
		"\u0000\u01a0\u01a1\u0003P(\u0000\u01a1\u01a2\u0006(\uffff\uffff\u0000"+
		"\u01a2\u01a5\u0001\u0000\u0000\u0000\u01a3\u01a5\u0001\u0000\u0000\u0000"+
		"\u01a4\u019e\u0001\u0000\u0000\u0000\u01a4\u01a3\u0001\u0000\u0000\u0000"+
		"\u01a5Q\u0001\u0000\u0000\u0000\u01a6\u01a7\u00054\u0000\u0000\u01a7\u01a8"+
		"\u0003L&\u0000\u01a8\u01a9\u00055\u0000\u0000\u01a9\u01aa\u0003T*\u0000"+
		"\u01aa\u01ad\u0001\u0000\u0000\u0000\u01ab\u01ad\u0003V+\u0000\u01ac\u01a6"+
		"\u0001\u0000\u0000\u0000\u01ac\u01ab\u0001\u0000\u0000\u0000\u01adS\u0001"+
		"\u0000\u0000\u0000\u01ae\u01af\u0005/\u0000\u0000\u01af\u01b0\u00054\u0000"+
		"\u0000\u01b0\u01b1\u0003L&\u0000\u01b1\u01b2\u00055\u0000\u0000\u01b2"+
		"\u01b3\u0003T*\u0000\u01b3\u01b4\u0006*\uffff\uffff\u0000\u01b4\u01b7"+
		"\u0001\u0000\u0000\u0000\u01b5\u01b7\u0001\u0000\u0000\u0000\u01b6\u01ae"+
		"\u0001\u0000\u0000\u0000\u01b6\u01b5\u0001\u0000\u0000\u0000\u01b7U\u0001"+
		"\u0000\u0000\u0000\u01b8\u01b9\u00054\u0000\u0000\u01b9\u01ba\u0003L&"+
		"\u0000\u01ba\u01bb\u00055\u0000\u0000\u01bb\u01bc\u0003X,\u0000\u01bc"+
		"\u01bf\u0001\u0000\u0000\u0000\u01bd\u01bf\u0003Z-\u0000\u01be\u01b8\u0001"+
		"\u0000\u0000\u0000\u01be\u01bd\u0001\u0000\u0000\u0000\u01bfW\u0001\u0000"+
		"\u0000\u0000\u01c0\u01c1\u0005.\u0000\u0000\u01c1\u01c2\u00054\u0000\u0000"+
		"\u01c2\u01c3\u0003L&\u0000\u01c3\u01c4\u00055\u0000\u0000\u01c4\u01c5"+
		"\u0003X,\u0000\u01c5\u01c6\u0006,\uffff\uffff\u0000\u01c6\u01c9\u0001"+
		"\u0000\u0000\u0000\u01c7\u01c9\u0001\u0000\u0000\u0000\u01c8\u01c0\u0001"+
		"\u0000\u0000\u0000\u01c8\u01c7\u0001\u0000\u0000\u0000\u01c9Y\u0001\u0000"+
		"\u0000\u0000\u01ca\u01cb\u0003^/\u0000\u01cb\u01cc\u0003\\.\u0000\u01cc"+
		"[\u0001\u0000\u0000\u0000\u01cd\u01ce\u0005(\u0000\u0000\u01ce\u01cf\u0003"+
		"^/\u0000\u01cf\u01d0\u0003\\.\u0000\u01d0\u01d1\u0006.\uffff\uffff\u0000"+
		"\u01d1\u01d9\u0001\u0000\u0000\u0000\u01d2\u01d3\u0005)\u0000\u0000\u01d3"+
		"\u01d4\u0003^/\u0000\u01d4\u01d5\u0003\\.\u0000\u01d5\u01d6\u0006.\uffff"+
		"\uffff\u0000\u01d6\u01d9\u0001\u0000\u0000\u0000\u01d7\u01d9\u0001\u0000"+
		"\u0000\u0000\u01d8\u01cd\u0001\u0000\u0000\u0000\u01d8\u01d2\u0001\u0000"+
		"\u0000\u0000\u01d8\u01d7\u0001\u0000\u0000\u0000\u01d9]\u0001\u0000\u0000"+
		"\u0000\u01da\u01db\u0003b1\u0000\u01db\u01dc\u0003`0\u0000\u01dc_\u0001"+
		"\u0000\u0000\u0000\u01dd\u01de\u0005+\u0000\u0000\u01de\u01df\u0003b1"+
		"\u0000\u01df\u01e0\u0003`0\u0000\u01e0\u01e1\u00060\uffff\uffff\u0000"+
		"\u01e1\u01f3\u0001\u0000\u0000\u0000\u01e2\u01e3\u0005*\u0000\u0000\u01e3"+
		"\u01e4\u0003b1\u0000\u01e4\u01e5\u0003`0\u0000\u01e5\u01e6\u00060\uffff"+
		"\uffff\u0000\u01e6\u01f3\u0001\u0000\u0000\u0000\u01e7\u01e8\u0005-\u0000"+
		"\u0000\u01e8\u01e9\u0003b1\u0000\u01e9\u01ea\u0003`0\u0000\u01ea\u01eb"+
		"\u00060\uffff\uffff\u0000\u01eb\u01f3\u0001\u0000\u0000\u0000\u01ec\u01ed"+
		"\u0005,\u0000\u0000\u01ed\u01ee\u0003b1\u0000\u01ee\u01ef\u0003`0\u0000"+
		"\u01ef\u01f0\u00060\uffff\uffff\u0000\u01f0\u01f3\u0001\u0000\u0000\u0000"+
		"\u01f1\u01f3\u0001\u0000\u0000\u0000\u01f2\u01dd\u0001\u0000\u0000\u0000"+
		"\u01f2\u01e2\u0001\u0000\u0000\u0000\u01f2\u01e7\u0001\u0000\u0000\u0000"+
		"\u01f2\u01ec\u0001\u0000\u0000\u0000\u01f2\u01f1\u0001\u0000\u0000\u0000"+
		"\u01f3a\u0001\u0000\u0000\u0000\u01f4\u01f5\u0003f3\u0000\u01f5\u01f6"+
		"\u0003d2\u0000\u01f6c\u0001\u0000\u0000\u0000\u01f7\u01f8\u0005\"\u0000"+
		"\u0000\u01f8\u01f9\u0003f3\u0000\u01f9\u01fa\u0003d2\u0000\u01fa\u01fb"+
		"\u00062\uffff\uffff\u0000\u01fb\u0203\u0001\u0000\u0000\u0000\u01fc\u01fd"+
		"\u0005#\u0000\u0000\u01fd\u01fe\u0003f3\u0000\u01fe\u01ff\u0003d2\u0000"+
		"\u01ff\u0200\u00062\uffff\uffff\u0000\u0200\u0203\u0001\u0000\u0000\u0000"+
		"\u0201\u0203\u0001\u0000\u0000\u0000\u0202\u01f7\u0001\u0000\u0000\u0000"+
		"\u0202\u01fc\u0001\u0000\u0000\u0000\u0202\u0201\u0001\u0000\u0000\u0000"+
		"\u0203e\u0001\u0000\u0000\u0000\u0204\u0205\u0003j5\u0000\u0205\u0206"+
		"\u0003h4\u0000\u0206g\u0001\u0000\u0000\u0000\u0207\u0208\u0005$\u0000"+
		"\u0000\u0208\u0209\u0003j5\u0000\u0209\u020a\u0003h4\u0000\u020a\u020b"+
		"\u00064\uffff\uffff\u0000\u020b\u0218\u0001\u0000\u0000\u0000\u020c\u020d"+
		"\u0005%\u0000\u0000\u020d\u020e\u0003j5\u0000\u020e\u020f\u0003h4\u0000"+
		"\u020f\u0210\u00064\uffff\uffff\u0000\u0210\u0218\u0001\u0000\u0000\u0000"+
		"\u0211\u0212\u0005&\u0000\u0000\u0212\u0213\u0003j5\u0000\u0213\u0214"+
		"\u0003h4\u0000\u0214\u0215\u00064\uffff\uffff\u0000\u0215\u0218\u0001"+
		"\u0000\u0000\u0000\u0216\u0218\u0001\u0000\u0000\u0000\u0217\u0207\u0001"+
		"\u0000\u0000\u0000\u0217\u020c\u0001\u0000\u0000\u0000\u0217\u0211\u0001"+
		"\u0000\u0000\u0000\u0217\u0216\u0001\u0000\u0000\u0000\u0218i\u0001\u0000"+
		"\u0000\u0000\u0219\u021a\u00050\u0000\u0000\u021a\u021b\u0003l6\u0000"+
		"\u021b\u021c\u00065\uffff\uffff\u0000\u021c\u0223\u0001\u0000\u0000\u0000"+
		"\u021d\u021e\u0005#\u0000\u0000\u021e\u021f\u0003l6\u0000\u021f\u0220"+
		"\u00065\uffff\uffff\u0000\u0220\u0223\u0001\u0000\u0000\u0000\u0221\u0223"+
		"\u0003l6\u0000\u0222\u0219\u0001\u0000\u0000\u0000\u0222\u021d\u0001\u0000"+
		"\u0000\u0000\u0222\u0221\u0001\u0000\u0000\u0000\u0223k\u0001\u0000\u0000"+
		"\u0000\u0224\u0225\u00054\u0000\u0000\u0225\u0226\u0003L&\u0000\u0226"+
		"\u0227\u00055\u0000\u0000\u0227\u023c\u0001\u0000\u0000\u0000\u0228\u023c"+
		"\u0003*\u0015\u0000\u0229\u023c\u0003.\u0017\u0000\u022a\u022d\u0005\u0019"+
		"\u0000\u0000\u022b\u022d\u0003.\u0017\u0000\u022c\u022a\u0001\u0000\u0000"+
		"\u0000\u022c\u022b\u0001\u0000\u0000\u0000\u022d\u022f\u0001\u0000\u0000"+
		"\u0000\u022e\u0230\u0007\u0001\u0000\u0000\u022f\u022e\u0001\u0000\u0000"+
		"\u0000\u022f\u0230\u0001\u0000\u0000\u0000\u0230\u023c\u0001\u0000\u0000"+
		"\u0000\u0231\u023c\u0003D\"\u0000\u0232\u023c\u0003\u001a\r\u0000\u0233"+
		"\u023c\u0003\u0016\u000b\u0000\u0234\u023c\u0003\u0018\f\u0000\u0235\u023c"+
		"\u0003\u001c\u000e\u0000\u0236\u023c\u0003\u001e\u000f\u0000\u0237\u023c"+
		"\u0003F#\u0000\u0238\u023c\u0003\u0012\t\u0000\u0239\u023c\u0003p8\u0000"+
		"\u023a\u023c\u0003\u0004\u0002\u0000\u023b\u0224\u0001\u0000\u0000\u0000"+
		"\u023b\u0228\u0001\u0000\u0000\u0000\u023b\u0229\u0001\u0000\u0000\u0000"+
		"\u023b\u022c\u0001\u0000\u0000\u0000\u023b\u0231\u0001\u0000\u0000\u0000"+
		"\u023b\u0232\u0001\u0000\u0000\u0000\u023b\u0233\u0001\u0000\u0000\u0000"+
		"\u023b\u0234\u0001\u0000\u0000\u0000\u023b\u0235\u0001\u0000\u0000\u0000"+
		"\u023b\u0236\u0001\u0000\u0000\u0000\u023b\u0237\u0001\u0000\u0000\u0000"+
		"\u023b\u0238\u0001\u0000\u0000\u0000\u023b\u0239\u0001\u0000\u0000\u0000"+
		"\u023b\u023a\u0001\u0000\u0000\u0000\u023cm\u0001\u0000\u0000\u0000\u023d"+
		"\u023e\u0007\u0002\u0000\u0000\u023eo\u0001\u0000\u0000\u0000\u023f\u0244"+
		"\u0005\u001a\u0000\u0000\u0240\u0244\u0005\u001b\u0000\u0000\u0241\u0244"+
		"\u0005\u001c\u0000\u0000\u0242\u0244\u0003n7\u0000\u0243\u023f\u0001\u0000"+
		"\u0000\u0000\u0243\u0240\u0001\u0000\u0000\u0000\u0243\u0241\u0001\u0000"+
		"\u0000\u0000\u0243\u0242\u0001\u0000\u0000\u0000\u0244q\u0001\u0000\u0000"+
		"\u0000(tv\u0080\u0092\u0099\u009e\u00a6\u00b4\u00ce\u00dd\u00e1\u0103"+
		"\u010d\u010f\u0119\u0126\u012f\u0139\u013f\u015a\u0160\u0176\u017e\u018d"+
		"\u0191\u0197\u01a4\u01ac\u01b6\u01be\u01c8\u01d8\u01f2\u0202\u0217\u0222"+
		"\u022c\u022f\u023b\u0243";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}