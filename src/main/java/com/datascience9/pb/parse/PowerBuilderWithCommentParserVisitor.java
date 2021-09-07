// Generated from ./src/main/java/com/datascience9/pb/parse/PowerBuilderWithCommentParser.g4 by ANTLR 4.9.2
package com.datascience9.pb.parse;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PowerBuilderWithCommentParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PowerBuilderWithCommentParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#start_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart_rule(PowerBuilderWithCommentParser.Start_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#body_rule_comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody_rule_comment(PowerBuilderWithCommentParser.Body_rule_commentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#body_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody_rule(PowerBuilderWithCommentParser.Body_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#forward_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForward_decl(PowerBuilderWithCommentParser.Forward_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#datatype_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatatype_decl(PowerBuilderWithCommentParser.Datatype_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#type_variables_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_variables_decl(PowerBuilderWithCommentParser.Type_variables_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#global_variables_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_variables_decl(PowerBuilderWithCommentParser.Global_variables_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#variable_decl_comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_decl_comment(PowerBuilderWithCommentParser.Variable_decl_commentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#variable_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_decl(PowerBuilderWithCommentParser.Variable_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#variable_decl_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_decl_sub(PowerBuilderWithCommentParser.Variable_decl_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#variable_decl_sub0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_decl_sub0(PowerBuilderWithCommentParser.Variable_decl_sub0Context ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#variable_decl_sub1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_decl_sub1(PowerBuilderWithCommentParser.Variable_decl_sub1Context ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#variable_decl_sub2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_decl_sub2(PowerBuilderWithCommentParser.Variable_decl_sub2Context ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#variable_decl_event}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_decl_event(PowerBuilderWithCommentParser.Variable_decl_eventContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#decimal_decl_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimal_decl_sub(PowerBuilderWithCommentParser.Decimal_decl_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#array_decl_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_decl_sub(PowerBuilderWithCommentParser.Array_decl_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#constant_decl_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_decl_sub(PowerBuilderWithCommentParser.Constant_decl_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#constant_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_decl(PowerBuilderWithCommentParser.Constant_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#function_forward_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_forward_decl(PowerBuilderWithCommentParser.Function_forward_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#function_forward_decl_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_forward_decl_alias(PowerBuilderWithCommentParser.Function_forward_decl_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#parameter_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_sub(PowerBuilderWithCommentParser.Parameter_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#parameters_list_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters_list_sub(PowerBuilderWithCommentParser.Parameters_list_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#functions_forward_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctions_forward_decl(PowerBuilderWithCommentParser.Functions_forward_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#function_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_body(PowerBuilderWithCommentParser.Function_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#on_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOn_body(PowerBuilderWithCommentParser.On_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#event_forward_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent_forward_decl(PowerBuilderWithCommentParser.Event_forward_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#event_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent_body(PowerBuilderWithCommentParser.Event_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#access_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccess_type(PowerBuilderWithCommentParser.Access_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#access_modif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccess_modif(PowerBuilderWithCommentParser.Access_modifContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#access_modif_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccess_modif_part(PowerBuilderWithCommentParser.Access_modif_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#scope_modif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScope_modif(PowerBuilderWithCommentParser.Scope_modifContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#expression_comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_comment(PowerBuilderWithCommentParser.Expression_commentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(PowerBuilderWithCommentParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(PowerBuilderWithCommentParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#expression_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_list(PowerBuilderWithCommentParser.Expression_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#boolean_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_expression(PowerBuilderWithCommentParser.Boolean_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#condition_or}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_or(PowerBuilderWithCommentParser.Condition_orContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#condition_and}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_and(PowerBuilderWithCommentParser.Condition_andContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#condition_not}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_not(PowerBuilderWithCommentParser.Condition_notContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#condition_comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_comparison(PowerBuilderWithCommentParser.Condition_comparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#add_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_expr(PowerBuilderWithCommentParser.Add_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#mul_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul_expr(PowerBuilderWithCommentParser.Mul_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#unary_sign_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_sign_expr(PowerBuilderWithCommentParser.Unary_sign_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#statement_comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_comment(PowerBuilderWithCommentParser.Statement_commentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(PowerBuilderWithCommentParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#public_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPublic_statement(PowerBuilderWithCommentParser.Public_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#throw_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrow_statement(PowerBuilderWithCommentParser.Throw_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#goto_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoto_statement(PowerBuilderWithCommentParser.Goto_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#statement_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_sub(PowerBuilderWithCommentParser.Statement_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#try_catch_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTry_catch_statement(PowerBuilderWithCommentParser.Try_catch_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#sql_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_statement(PowerBuilderWithCommentParser.Sql_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#sql_insert_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_insert_statement(PowerBuilderWithCommentParser.Sql_insert_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#sql_values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_values(PowerBuilderWithCommentParser.Sql_valuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#sql_delete_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_delete_statement(PowerBuilderWithCommentParser.Sql_delete_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#sql_select_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_select_statement(PowerBuilderWithCommentParser.Sql_select_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#sql_update_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_update_statement(PowerBuilderWithCommentParser.Sql_update_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#sql_connect_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_connect_statement(PowerBuilderWithCommentParser.Sql_connect_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#set_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_value(PowerBuilderWithCommentParser.Set_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#where_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere_clause(PowerBuilderWithCommentParser.Where_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#select_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_clause(PowerBuilderWithCommentParser.Select_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#sql_commit_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_commit_statement(PowerBuilderWithCommentParser.Sql_commit_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#execute_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute_statement(PowerBuilderWithCommentParser.Execute_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#close_sql_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClose_sql_statement(PowerBuilderWithCommentParser.Close_sql_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#declare_procedure_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_procedure_statement(PowerBuilderWithCommentParser.Declare_procedure_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#declare_cursor_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_cursor_statement(PowerBuilderWithCommentParser.Declare_cursor_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#open_cursor_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpen_cursor_statement(PowerBuilderWithCommentParser.Open_cursor_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#close_cursor_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClose_cursor_statement(PowerBuilderWithCommentParser.Close_cursor_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#fetch_into_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFetch_into_statement(PowerBuilderWithCommentParser.Fetch_into_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#prepare_sql_stateent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrepare_sql_stateent(PowerBuilderWithCommentParser.Prepare_sql_stateentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#increment_decrement_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrement_decrement_statement(PowerBuilderWithCommentParser.Increment_decrement_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#assignment_rhs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_rhs(PowerBuilderWithCommentParser.Assignment_rhsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#describe_function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribe_function_call(PowerBuilderWithCommentParser.Describe_function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#assignment_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_statement(PowerBuilderWithCommentParser.Assignment_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#variable_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_name(PowerBuilderWithCommentParser.Variable_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(PowerBuilderWithCommentParser.Return_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#function_call_expression_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call_expression_sub(PowerBuilderWithCommentParser.Function_call_expression_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name(PowerBuilderWithCommentParser.Function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#function_event_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_event_call(PowerBuilderWithCommentParser.Function_event_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#function_virtual_call_expression_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_virtual_call_expression_sub(PowerBuilderWithCommentParser.Function_virtual_call_expression_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#open_call_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpen_call_sub(PowerBuilderWithCommentParser.Open_call_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#close_call_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClose_call_sub(PowerBuilderWithCommentParser.Close_call_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#function_call_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call_statement(PowerBuilderWithCommentParser.Function_call_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#ancestor_function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAncestor_function_call(PowerBuilderWithCommentParser.Ancestor_function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#call_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_statement(PowerBuilderWithCommentParser.Call_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#super_call_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuper_call_statement(PowerBuilderWithCommentParser.Super_call_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#ancestor_event_call_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAncestor_event_call_statement(PowerBuilderWithCommentParser.Ancestor_event_call_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#event_call_statement_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent_call_statement_sub(PowerBuilderWithCommentParser.Event_call_statement_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#event_call_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent_call_statement(PowerBuilderWithCommentParser.Event_call_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#create_call_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_call_sub(PowerBuilderWithCommentParser.Create_call_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#create_call_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_call_statement(PowerBuilderWithCommentParser.Create_call_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#destroy_call_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDestroy_call_sub(PowerBuilderWithCommentParser.Destroy_call_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#destroy_call_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDestroy_call_statement(PowerBuilderWithCommentParser.Destroy_call_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#for_loop_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_loop_statement(PowerBuilderWithCommentParser.For_loop_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#do_while_loop_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_while_loop_statement(PowerBuilderWithCommentParser.Do_while_loop_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#do_loop_while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_loop_while_statement(PowerBuilderWithCommentParser.Do_loop_while_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(PowerBuilderWithCommentParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#elseif_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseif_statement(PowerBuilderWithCommentParser.Elseif_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#else_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_statement(PowerBuilderWithCommentParser.Else_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#if_simple_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_simple_statement(PowerBuilderWithCommentParser.If_simple_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#continue_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue_statement(PowerBuilderWithCommentParser.Continue_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#continue_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue_sub(PowerBuilderWithCommentParser.Continue_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#post_event}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPost_event(PowerBuilderWithCommentParser.Post_eventContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#exit_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExit_statement(PowerBuilderWithCommentParser.Exit_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#choose_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChoose_statement(PowerBuilderWithCommentParser.Choose_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#choose_case_value_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChoose_case_value_sub(PowerBuilderWithCommentParser.Choose_case_value_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#choose_case_cond_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChoose_case_cond_sub(PowerBuilderWithCommentParser.Choose_case_cond_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#choose_case_else_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChoose_case_else_sub(PowerBuilderWithCommentParser.Choose_case_else_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#label_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel_stat(PowerBuilderWithCommentParser.Label_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(PowerBuilderWithCommentParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#string_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_literal(PowerBuilderWithCommentParser.String_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#identifier_array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier_array(PowerBuilderWithCommentParser.Identifier_arrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(PowerBuilderWithCommentParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#identifier_name_ex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier_name_ex(PowerBuilderWithCommentParser.Identifier_name_exContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#identifier_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier_name(PowerBuilderWithCommentParser.Identifier_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#bind_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBind_param(PowerBuilderWithCommentParser.Bind_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#atom_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom_sub(PowerBuilderWithCommentParser.Atom_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#atom_sub_call1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom_sub_call1(PowerBuilderWithCommentParser.Atom_sub_call1Context ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#atom_sub_member1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom_sub_member1(PowerBuilderWithCommentParser.Atom_sub_member1Context ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#array_access_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_access_atom(PowerBuilderWithCommentParser.Array_access_atomContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#data_type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_type_name(PowerBuilderWithCommentParser.Data_type_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#dataTypeSub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataTypeSub(PowerBuilderWithCommentParser.DataTypeSubContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderWithCommentParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(PowerBuilderWithCommentParser.CommentContext ctx);
}