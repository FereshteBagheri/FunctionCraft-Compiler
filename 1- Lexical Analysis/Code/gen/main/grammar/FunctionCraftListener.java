// Generated from C:/Users/my asus/Downloads/810100089-810100152/Phase1- Lexical Analayzer/FunctionCraft/src/main/grammar/FunctionCraft.g4 by ANTLR 4.13.1
package main.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FunctionCraftParser}.
 */
public interface FunctionCraftListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(FunctionCraftParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(FunctionCraftParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(FunctionCraftParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(FunctionCraftParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#lambda_function}.
	 * @param ctx the parse tree
	 */
	void enterLambda_function(FunctionCraftParser.Lambda_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#lambda_function}.
	 * @param ctx the parse tree
	 */
	void exitLambda_function(FunctionCraftParser.Lambda_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterParameter_list(FunctionCraftParser.Parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitParameter_list(FunctionCraftParser.Parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#default_parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterDefault_parameter_list(FunctionCraftParser.Default_parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#default_parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitDefault_parameter_list(FunctionCraftParser.Default_parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#default_parameter}.
	 * @param ctx the parse tree
	 */
	void enterDefault_parameter(FunctionCraftParser.Default_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#default_parameter}.
	 * @param ctx the parse tree
	 */
	void exitDefault_parameter(FunctionCraftParser.Default_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void enterArgument_list(FunctionCraftParser.Argument_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void exitArgument_list(FunctionCraftParser.Argument_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(FunctionCraftParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(FunctionCraftParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterPattern(FunctionCraftParser.PatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitPattern(FunctionCraftParser.PatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#match}.
	 * @param ctx the parse tree
	 */
	void enterMatch(FunctionCraftParser.MatchContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#match}.
	 * @param ctx the parse tree
	 */
	void exitMatch(FunctionCraftParser.MatchContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(FunctionCraftParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(FunctionCraftParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#puts}.
	 * @param ctx the parse tree
	 */
	void enterPuts(FunctionCraftParser.PutsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#puts}.
	 * @param ctx the parse tree
	 */
	void exitPuts(FunctionCraftParser.PutsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#push}.
	 * @param ctx the parse tree
	 */
	void enterPush(FunctionCraftParser.PushContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#push}.
	 * @param ctx the parse tree
	 */
	void exitPush(FunctionCraftParser.PushContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#len}.
	 * @param ctx the parse tree
	 */
	void enterLen(FunctionCraftParser.LenContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#len}.
	 * @param ctx the parse tree
	 */
	void exitLen(FunctionCraftParser.LenContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#chop}.
	 * @param ctx the parse tree
	 */
	void enterChop(FunctionCraftParser.ChopContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#chop}.
	 * @param ctx the parse tree
	 */
	void exitChop(FunctionCraftParser.ChopContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#chomp}.
	 * @param ctx the parse tree
	 */
	void enterChomp(FunctionCraftParser.ChompContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#chomp}.
	 * @param ctx the parse tree
	 */
	void exitChomp(FunctionCraftParser.ChompContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(FunctionCraftParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(FunctionCraftParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#do_loop}.
	 * @param ctx the parse tree
	 */
	void enterDo_loop(FunctionCraftParser.Do_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#do_loop}.
	 * @param ctx the parse tree
	 */
	void exitDo_loop(FunctionCraftParser.Do_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#loop_body}.
	 * @param ctx the parse tree
	 */
	void enterLoop_body(FunctionCraftParser.Loop_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#loop_body}.
	 * @param ctx the parse tree
	 */
	void exitLoop_body(FunctionCraftParser.Loop_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop(FunctionCraftParser.For_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop(FunctionCraftParser.For_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#range}.
	 * @param ctx the parse tree
	 */
	void enterRange(FunctionCraftParser.RangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#range}.
	 * @param ctx the parse tree
	 */
	void exitRange(FunctionCraftParser.RangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(FunctionCraftParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(FunctionCraftParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#list_data}.
	 * @param ctx the parse tree
	 */
	void enterList_data(FunctionCraftParser.List_dataContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#list_data}.
	 * @param ctx the parse tree
	 */
	void exitList_data(FunctionCraftParser.List_dataContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#list_access}.
	 * @param ctx the parse tree
	 */
	void enterList_access(FunctionCraftParser.List_accessContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#list_access}.
	 * @param ctx the parse tree
	 */
	void exitList_access(FunctionCraftParser.List_accessContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#control_structure}.
	 * @param ctx the parse tree
	 */
	void enterControl_structure(FunctionCraftParser.Control_structureContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#control_structure}.
	 * @param ctx the parse tree
	 */
	void exitControl_structure(FunctionCraftParser.Control_structureContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#break}.
	 * @param ctx the parse tree
	 */
	void enterBreak(FunctionCraftParser.BreakContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#break}.
	 * @param ctx the parse tree
	 */
	void exitBreak(FunctionCraftParser.BreakContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#break_if}.
	 * @param ctx the parse tree
	 */
	void enterBreak_if(FunctionCraftParser.Break_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#break_if}.
	 * @param ctx the parse tree
	 */
	void exitBreak_if(FunctionCraftParser.Break_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#next}.
	 * @param ctx the parse tree
	 */
	void enterNext(FunctionCraftParser.NextContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#next}.
	 * @param ctx the parse tree
	 */
	void exitNext(FunctionCraftParser.NextContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#next_if}.
	 * @param ctx the parse tree
	 */
	void enterNext_if(FunctionCraftParser.Next_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#next_if}.
	 * @param ctx the parse tree
	 */
	void exitNext_if(FunctionCraftParser.Next_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(FunctionCraftParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(FunctionCraftParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#if_condition}.
	 * @param ctx the parse tree
	 */
	void enterIf_condition(FunctionCraftParser.If_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#if_condition}.
	 * @param ctx the parse tree
	 */
	void exitIf_condition(FunctionCraftParser.If_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#elseif_condition}.
	 * @param ctx the parse tree
	 */
	void enterElseif_condition(FunctionCraftParser.Elseif_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#elseif_condition}.
	 * @param ctx the parse tree
	 */
	void exitElseif_condition(FunctionCraftParser.Elseif_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#else_condition}.
	 * @param ctx the parse tree
	 */
	void enterElse_condition(FunctionCraftParser.Else_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#else_condition}.
	 * @param ctx the parse tree
	 */
	void exitElse_condition(FunctionCraftParser.Else_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#return_stat}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stat(FunctionCraftParser.Return_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#return_stat}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stat(FunctionCraftParser.Return_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(FunctionCraftParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(FunctionCraftParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#function_pointer}.
	 * @param ctx the parse tree
	 */
	void enterFunction_pointer(FunctionCraftParser.Function_pointerContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#function_pointer}.
	 * @param ctx the parse tree
	 */
	void exitFunction_pointer(FunctionCraftParser.Function_pointerContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(FunctionCraftParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(FunctionCraftParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(FunctionCraftParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(FunctionCraftParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(FunctionCraftParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(FunctionCraftParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#append_expresstion}.
	 * @param ctx the parse tree
	 */
	void enterAppend_expresstion(FunctionCraftParser.Append_expresstionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#append_expresstion}.
	 * @param ctx the parse tree
	 */
	void exitAppend_expresstion(FunctionCraftParser.Append_expresstionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#append_expression_}.
	 * @param ctx the parse tree
	 */
	void enterAppend_expression_(FunctionCraftParser.Append_expression_Context ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#append_expression_}.
	 * @param ctx the parse tree
	 */
	void exitAppend_expression_(FunctionCraftParser.Append_expression_Context ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#or_expression}.
	 * @param ctx the parse tree
	 */
	void enterOr_expression(FunctionCraftParser.Or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#or_expression}.
	 * @param ctx the parse tree
	 */
	void exitOr_expression(FunctionCraftParser.Or_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#or_expression_}.
	 * @param ctx the parse tree
	 */
	void enterOr_expression_(FunctionCraftParser.Or_expression_Context ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#or_expression_}.
	 * @param ctx the parse tree
	 */
	void exitOr_expression_(FunctionCraftParser.Or_expression_Context ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#and_expression}.
	 * @param ctx the parse tree
	 */
	void enterAnd_expression(FunctionCraftParser.And_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#and_expression}.
	 * @param ctx the parse tree
	 */
	void exitAnd_expression(FunctionCraftParser.And_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#and_expression_}.
	 * @param ctx the parse tree
	 */
	void enterAnd_expression_(FunctionCraftParser.And_expression_Context ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#and_expression_}.
	 * @param ctx the parse tree
	 */
	void exitAnd_expression_(FunctionCraftParser.And_expression_Context ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#eq_expression}.
	 * @param ctx the parse tree
	 */
	void enterEq_expression(FunctionCraftParser.Eq_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#eq_expression}.
	 * @param ctx the parse tree
	 */
	void exitEq_expression(FunctionCraftParser.Eq_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#eq_expression_}.
	 * @param ctx the parse tree
	 */
	void enterEq_expression_(FunctionCraftParser.Eq_expression_Context ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#eq_expression_}.
	 * @param ctx the parse tree
	 */
	void exitEq_expression_(FunctionCraftParser.Eq_expression_Context ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#compare_expression}.
	 * @param ctx the parse tree
	 */
	void enterCompare_expression(FunctionCraftParser.Compare_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#compare_expression}.
	 * @param ctx the parse tree
	 */
	void exitCompare_expression(FunctionCraftParser.Compare_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#compare_expression_}.
	 * @param ctx the parse tree
	 */
	void enterCompare_expression_(FunctionCraftParser.Compare_expression_Context ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#compare_expression_}.
	 * @param ctx the parse tree
	 */
	void exitCompare_expression_(FunctionCraftParser.Compare_expression_Context ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#add_sub_expression}.
	 * @param ctx the parse tree
	 */
	void enterAdd_sub_expression(FunctionCraftParser.Add_sub_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#add_sub_expression}.
	 * @param ctx the parse tree
	 */
	void exitAdd_sub_expression(FunctionCraftParser.Add_sub_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#add_sub_expression_}.
	 * @param ctx the parse tree
	 */
	void enterAdd_sub_expression_(FunctionCraftParser.Add_sub_expression_Context ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#add_sub_expression_}.
	 * @param ctx the parse tree
	 */
	void exitAdd_sub_expression_(FunctionCraftParser.Add_sub_expression_Context ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#mul_div_expression}.
	 * @param ctx the parse tree
	 */
	void enterMul_div_expression(FunctionCraftParser.Mul_div_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#mul_div_expression}.
	 * @param ctx the parse tree
	 */
	void exitMul_div_expression(FunctionCraftParser.Mul_div_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#mul_div_expression_}.
	 * @param ctx the parse tree
	 */
	void enterMul_div_expression_(FunctionCraftParser.Mul_div_expression_Context ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#mul_div_expression_}.
	 * @param ctx the parse tree
	 */
	void exitMul_div_expression_(FunctionCraftParser.Mul_div_expression_Context ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void enterUnary_expression(FunctionCraftParser.Unary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void exitUnary_expression(FunctionCraftParser.Unary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#other_expression}.
	 * @param ctx the parse tree
	 */
	void enterOther_expression(FunctionCraftParser.Other_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#other_expression}.
	 * @param ctx the parse tree
	 */
	void exitOther_expression(FunctionCraftParser.Other_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#boolean_literal}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_literal(FunctionCraftParser.Boolean_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#boolean_literal}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_literal(FunctionCraftParser.Boolean_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(FunctionCraftParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(FunctionCraftParser.LiteralContext ctx);
}