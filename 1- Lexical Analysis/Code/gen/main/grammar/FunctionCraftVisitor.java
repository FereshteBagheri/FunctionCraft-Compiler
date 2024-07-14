// Generated from C:/Users/my asus/Downloads/810100089-810100152/Phase1- Lexical Analayzer/FunctionCraft/src/main/grammar/FunctionCraft.g4 by ANTLR 4.13.1
package main.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FunctionCraftParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FunctionCraftVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(FunctionCraftParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(FunctionCraftParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#lambda_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambda_function(FunctionCraftParser.Lambda_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_list(FunctionCraftParser.Parameter_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#default_parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_parameter_list(FunctionCraftParser.Default_parameter_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#default_parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_parameter(FunctionCraftParser.Default_parameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#argument_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument_list(FunctionCraftParser.Argument_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(FunctionCraftParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern(FunctionCraftParser.PatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#match}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatch(FunctionCraftParser.MatchContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(FunctionCraftParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#puts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPuts(FunctionCraftParser.PutsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#push}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPush(FunctionCraftParser.PushContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#len}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLen(FunctionCraftParser.LenContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#chop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChop(FunctionCraftParser.ChopContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#chomp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChomp(FunctionCraftParser.ChompContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(FunctionCraftParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#do_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_loop(FunctionCraftParser.Do_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#loop_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_body(FunctionCraftParser.Loop_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_loop(FunctionCraftParser.For_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange(FunctionCraftParser.RangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(FunctionCraftParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#list_data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_data(FunctionCraftParser.List_dataContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#list_access}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_access(FunctionCraftParser.List_accessContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#control_structure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControl_structure(FunctionCraftParser.Control_structureContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#break}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak(FunctionCraftParser.BreakContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#break_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_if(FunctionCraftParser.Break_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#next}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNext(FunctionCraftParser.NextContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#next_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNext_if(FunctionCraftParser.Next_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(FunctionCraftParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#if_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_condition(FunctionCraftParser.If_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#elseif_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseif_condition(FunctionCraftParser.Elseif_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#else_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_condition(FunctionCraftParser.Else_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#return_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stat(FunctionCraftParser.Return_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(FunctionCraftParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#function_pointer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_pointer(FunctionCraftParser.Function_pointerContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(FunctionCraftParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(FunctionCraftParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(FunctionCraftParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#append_expresstion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppend_expresstion(FunctionCraftParser.Append_expresstionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#append_expression_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppend_expression_(FunctionCraftParser.Append_expression_Context ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#or_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_expression(FunctionCraftParser.Or_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#or_expression_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_expression_(FunctionCraftParser.Or_expression_Context ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#and_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_expression(FunctionCraftParser.And_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#and_expression_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_expression_(FunctionCraftParser.And_expression_Context ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#eq_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEq_expression(FunctionCraftParser.Eq_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#eq_expression_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEq_expression_(FunctionCraftParser.Eq_expression_Context ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#compare_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompare_expression(FunctionCraftParser.Compare_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#compare_expression_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompare_expression_(FunctionCraftParser.Compare_expression_Context ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#add_sub_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_sub_expression(FunctionCraftParser.Add_sub_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#add_sub_expression_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_sub_expression_(FunctionCraftParser.Add_sub_expression_Context ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#mul_div_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul_div_expression(FunctionCraftParser.Mul_div_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#mul_div_expression_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul_div_expression_(FunctionCraftParser.Mul_div_expression_Context ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#unary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_expression(FunctionCraftParser.Unary_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#other_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOther_expression(FunctionCraftParser.Other_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#boolean_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_literal(FunctionCraftParser.Boolean_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(FunctionCraftParser.LiteralContext ctx);
}