// Generated from ./src/main/java/com/datascience9/pb/parse/PowerBuilderParser.g4 by ANTLR 4.9.2
package com.datascience9.pb.parse;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PowerBuilderParser}.
 */
public interface PowerBuilderParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#start_rule}.
	 * @param ctx the parse tree
	 */
	void enterStart_rule(PowerBuilderParser.Start_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#start_rule}.
	 * @param ctx the parse tree
	 */
	void exitStart_rule(PowerBuilderParser.Start_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#body_rule}.
	 * @param ctx the parse tree
	 */
	void enterBody_rule(PowerBuilderParser.Body_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#body_rule}.
	 * @param ctx the parse tree
	 */
	void exitBody_rule(PowerBuilderParser.Body_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#forward_decl}.
	 * @param ctx the parse tree
	 */
	void enterForward_decl(PowerBuilderParser.Forward_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#forward_decl}.
	 * @param ctx the parse tree
	 */
	void exitForward_decl(PowerBuilderParser.Forward_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#datatype_decl}.
	 * @param ctx the parse tree
	 */
	void enterDatatype_decl(PowerBuilderParser.Datatype_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#datatype_decl}.
	 * @param ctx the parse tree
	 */
	void exitDatatype_decl(PowerBuilderParser.Datatype_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#type_variables_decl}.
	 * @param ctx the parse tree
	 */
	void enterType_variables_decl(PowerBuilderParser.Type_variables_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#type_variables_decl}.
	 * @param ctx the parse tree
	 */
	void exitType_variables_decl(PowerBuilderParser.Type_variables_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#global_variables_decl}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_variables_decl(PowerBuilderParser.Global_variables_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#global_variables_decl}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_variables_decl(PowerBuilderParser.Global_variables_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#variable_decl}.
	 * @param ctx the parse tree
	 */
	void enterVariable_decl(PowerBuilderParser.Variable_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#variable_decl}.
	 * @param ctx the parse tree
	 */
	void exitVariable_decl(PowerBuilderParser.Variable_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#variable_decl_sub}.
	 * @param ctx the parse tree
	 */
	void enterVariable_decl_sub(PowerBuilderParser.Variable_decl_subContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#variable_decl_sub}.
	 * @param ctx the parse tree
	 */
	void exitVariable_decl_sub(PowerBuilderParser.Variable_decl_subContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#variable_decl_sub0}.
	 * @param ctx the parse tree
	 */
	void enterVariable_decl_sub0(PowerBuilderParser.Variable_decl_sub0Context ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#variable_decl_sub0}.
	 * @param ctx the parse tree
	 */
	void exitVariable_decl_sub0(PowerBuilderParser.Variable_decl_sub0Context ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#variable_decl_sub1}.
	 * @param ctx the parse tree
	 */
	void enterVariable_decl_sub1(PowerBuilderParser.Variable_decl_sub1Context ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#variable_decl_sub1}.
	 * @param ctx the parse tree
	 */
	void exitVariable_decl_sub1(PowerBuilderParser.Variable_decl_sub1Context ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#variable_decl_sub2}.
	 * @param ctx the parse tree
	 */
	void enterVariable_decl_sub2(PowerBuilderParser.Variable_decl_sub2Context ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#variable_decl_sub2}.
	 * @param ctx the parse tree
	 */
	void exitVariable_decl_sub2(PowerBuilderParser.Variable_decl_sub2Context ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#variable_decl_event}.
	 * @param ctx the parse tree
	 */
	void enterVariable_decl_event(PowerBuilderParser.Variable_decl_eventContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#variable_decl_event}.
	 * @param ctx the parse tree
	 */
	void exitVariable_decl_event(PowerBuilderParser.Variable_decl_eventContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#decimal_decl_sub}.
	 * @param ctx the parse tree
	 */
	void enterDecimal_decl_sub(PowerBuilderParser.Decimal_decl_subContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#decimal_decl_sub}.
	 * @param ctx the parse tree
	 */
	void exitDecimal_decl_sub(PowerBuilderParser.Decimal_decl_subContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#array_decl_sub}.
	 * @param ctx the parse tree
	 */
	void enterArray_decl_sub(PowerBuilderParser.Array_decl_subContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#array_decl_sub}.
	 * @param ctx the parse tree
	 */
	void exitArray_decl_sub(PowerBuilderParser.Array_decl_subContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#constant_decl_sub}.
	 * @param ctx the parse tree
	 */
	void enterConstant_decl_sub(PowerBuilderParser.Constant_decl_subContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#constant_decl_sub}.
	 * @param ctx the parse tree
	 */
	void exitConstant_decl_sub(PowerBuilderParser.Constant_decl_subContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#constant_decl}.
	 * @param ctx the parse tree
	 */
	void enterConstant_decl(PowerBuilderParser.Constant_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#constant_decl}.
	 * @param ctx the parse tree
	 */
	void exitConstant_decl(PowerBuilderParser.Constant_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#function_forward_decl}.
	 * @param ctx the parse tree
	 */
	void enterFunction_forward_decl(PowerBuilderParser.Function_forward_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#function_forward_decl}.
	 * @param ctx the parse tree
	 */
	void exitFunction_forward_decl(PowerBuilderParser.Function_forward_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#function_forward_decl_alias}.
	 * @param ctx the parse tree
	 */
	void enterFunction_forward_decl_alias(PowerBuilderParser.Function_forward_decl_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#function_forward_decl_alias}.
	 * @param ctx the parse tree
	 */
	void exitFunction_forward_decl_alias(PowerBuilderParser.Function_forward_decl_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#parameter_sub}.
	 * @param ctx the parse tree
	 */
	void enterParameter_sub(PowerBuilderParser.Parameter_subContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#parameter_sub}.
	 * @param ctx the parse tree
	 */
	void exitParameter_sub(PowerBuilderParser.Parameter_subContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#parameters_list_sub}.
	 * @param ctx the parse tree
	 */
	void enterParameters_list_sub(PowerBuilderParser.Parameters_list_subContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#parameters_list_sub}.
	 * @param ctx the parse tree
	 */
	void exitParameters_list_sub(PowerBuilderParser.Parameters_list_subContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#functions_forward_decl}.
	 * @param ctx the parse tree
	 */
	void enterFunctions_forward_decl(PowerBuilderParser.Functions_forward_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#functions_forward_decl}.
	 * @param ctx the parse tree
	 */
	void exitFunctions_forward_decl(PowerBuilderParser.Functions_forward_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#function_body}.
	 * @param ctx the parse tree
	 */
	void enterFunction_body(PowerBuilderParser.Function_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#function_body}.
	 * @param ctx the parse tree
	 */
	void exitFunction_body(PowerBuilderParser.Function_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#on_body}.
	 * @param ctx the parse tree
	 */
	void enterOn_body(PowerBuilderParser.On_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#on_body}.
	 * @param ctx the parse tree
	 */
	void exitOn_body(PowerBuilderParser.On_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#event_forward_decl}.
	 * @param ctx the parse tree
	 */
	void enterEvent_forward_decl(PowerBuilderParser.Event_forward_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#event_forward_decl}.
	 * @param ctx the parse tree
	 */
	void exitEvent_forward_decl(PowerBuilderParser.Event_forward_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#event_body}.
	 * @param ctx the parse tree
	 */
	void enterEvent_body(PowerBuilderParser.Event_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#event_body}.
	 * @param ctx the parse tree
	 */
	void exitEvent_body(PowerBuilderParser.Event_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#access_type}.
	 * @param ctx the parse tree
	 */
	void enterAccess_type(PowerBuilderParser.Access_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#access_type}.
	 * @param ctx the parse tree
	 */
	void exitAccess_type(PowerBuilderParser.Access_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#access_modif}.
	 * @param ctx the parse tree
	 */
	void enterAccess_modif(PowerBuilderParser.Access_modifContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#access_modif}.
	 * @param ctx the parse tree
	 */
	void exitAccess_modif(PowerBuilderParser.Access_modifContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#access_modif_part}.
	 * @param ctx the parse tree
	 */
	void enterAccess_modif_part(PowerBuilderParser.Access_modif_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#access_modif_part}.
	 * @param ctx the parse tree
	 */
	void exitAccess_modif_part(PowerBuilderParser.Access_modif_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#scope_modif}.
	 * @param ctx the parse tree
	 */
	void enterScope_modif(PowerBuilderParser.Scope_modifContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#scope_modif}.
	 * @param ctx the parse tree
	 */
	void exitScope_modif(PowerBuilderParser.Scope_modifContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(PowerBuilderParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(PowerBuilderParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(PowerBuilderParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(PowerBuilderParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void enterExpression_list(PowerBuilderParser.Expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void exitExpression_list(PowerBuilderParser.Expression_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#boolean_expression}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_expression(PowerBuilderParser.Boolean_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#boolean_expression}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_expression(PowerBuilderParser.Boolean_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#condition_or}.
	 * @param ctx the parse tree
	 */
	void enterCondition_or(PowerBuilderParser.Condition_orContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#condition_or}.
	 * @param ctx the parse tree
	 */
	void exitCondition_or(PowerBuilderParser.Condition_orContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#condition_and}.
	 * @param ctx the parse tree
	 */
	void enterCondition_and(PowerBuilderParser.Condition_andContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#condition_and}.
	 * @param ctx the parse tree
	 */
	void exitCondition_and(PowerBuilderParser.Condition_andContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#condition_not}.
	 * @param ctx the parse tree
	 */
	void enterCondition_not(PowerBuilderParser.Condition_notContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#condition_not}.
	 * @param ctx the parse tree
	 */
	void exitCondition_not(PowerBuilderParser.Condition_notContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#condition_comparison}.
	 * @param ctx the parse tree
	 */
	void enterCondition_comparison(PowerBuilderParser.Condition_comparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#condition_comparison}.
	 * @param ctx the parse tree
	 */
	void exitCondition_comparison(PowerBuilderParser.Condition_comparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#add_expr}.
	 * @param ctx the parse tree
	 */
	void enterAdd_expr(PowerBuilderParser.Add_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#add_expr}.
	 * @param ctx the parse tree
	 */
	void exitAdd_expr(PowerBuilderParser.Add_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#mul_expr}.
	 * @param ctx the parse tree
	 */
	void enterMul_expr(PowerBuilderParser.Mul_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#mul_expr}.
	 * @param ctx the parse tree
	 */
	void exitMul_expr(PowerBuilderParser.Mul_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#unary_sign_expr}.
	 * @param ctx the parse tree
	 */
	void enterUnary_sign_expr(PowerBuilderParser.Unary_sign_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#unary_sign_expr}.
	 * @param ctx the parse tree
	 */
	void exitUnary_sign_expr(PowerBuilderParser.Unary_sign_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(PowerBuilderParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(PowerBuilderParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#public_statement}.
	 * @param ctx the parse tree
	 */
	void enterPublic_statement(PowerBuilderParser.Public_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#public_statement}.
	 * @param ctx the parse tree
	 */
	void exitPublic_statement(PowerBuilderParser.Public_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#throw_statement}.
	 * @param ctx the parse tree
	 */
	void enterThrow_statement(PowerBuilderParser.Throw_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#throw_statement}.
	 * @param ctx the parse tree
	 */
	void exitThrow_statement(PowerBuilderParser.Throw_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#goto_statement}.
	 * @param ctx the parse tree
	 */
	void enterGoto_statement(PowerBuilderParser.Goto_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#goto_statement}.
	 * @param ctx the parse tree
	 */
	void exitGoto_statement(PowerBuilderParser.Goto_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#statement_sub}.
	 * @param ctx the parse tree
	 */
	void enterStatement_sub(PowerBuilderParser.Statement_subContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#statement_sub}.
	 * @param ctx the parse tree
	 */
	void exitStatement_sub(PowerBuilderParser.Statement_subContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#try_catch_statement}.
	 * @param ctx the parse tree
	 */
	void enterTry_catch_statement(PowerBuilderParser.Try_catch_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#try_catch_statement}.
	 * @param ctx the parse tree
	 */
	void exitTry_catch_statement(PowerBuilderParser.Try_catch_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#sql_statement}.
	 * @param ctx the parse tree
	 */
	void enterSql_statement(PowerBuilderParser.Sql_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#sql_statement}.
	 * @param ctx the parse tree
	 */
	void exitSql_statement(PowerBuilderParser.Sql_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#sql_insert_statement}.
	 * @param ctx the parse tree
	 */
	void enterSql_insert_statement(PowerBuilderParser.Sql_insert_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#sql_insert_statement}.
	 * @param ctx the parse tree
	 */
	void exitSql_insert_statement(PowerBuilderParser.Sql_insert_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#sql_values}.
	 * @param ctx the parse tree
	 */
	void enterSql_values(PowerBuilderParser.Sql_valuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#sql_values}.
	 * @param ctx the parse tree
	 */
	void exitSql_values(PowerBuilderParser.Sql_valuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#sql_delete_statement}.
	 * @param ctx the parse tree
	 */
	void enterSql_delete_statement(PowerBuilderParser.Sql_delete_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#sql_delete_statement}.
	 * @param ctx the parse tree
	 */
	void exitSql_delete_statement(PowerBuilderParser.Sql_delete_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#sql_select_statement}.
	 * @param ctx the parse tree
	 */
	void enterSql_select_statement(PowerBuilderParser.Sql_select_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#sql_select_statement}.
	 * @param ctx the parse tree
	 */
	void exitSql_select_statement(PowerBuilderParser.Sql_select_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#sql_update_statement}.
	 * @param ctx the parse tree
	 */
	void enterSql_update_statement(PowerBuilderParser.Sql_update_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#sql_update_statement}.
	 * @param ctx the parse tree
	 */
	void exitSql_update_statement(PowerBuilderParser.Sql_update_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#sql_connect_statement}.
	 * @param ctx the parse tree
	 */
	void enterSql_connect_statement(PowerBuilderParser.Sql_connect_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#sql_connect_statement}.
	 * @param ctx the parse tree
	 */
	void exitSql_connect_statement(PowerBuilderParser.Sql_connect_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#set_value}.
	 * @param ctx the parse tree
	 */
	void enterSet_value(PowerBuilderParser.Set_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#set_value}.
	 * @param ctx the parse tree
	 */
	void exitSet_value(PowerBuilderParser.Set_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void enterWhere_clause(PowerBuilderParser.Where_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void exitWhere_clause(PowerBuilderParser.Where_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#select_clause}.
	 * @param ctx the parse tree
	 */
	void enterSelect_clause(PowerBuilderParser.Select_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#select_clause}.
	 * @param ctx the parse tree
	 */
	void exitSelect_clause(PowerBuilderParser.Select_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#sql_commit_statement}.
	 * @param ctx the parse tree
	 */
	void enterSql_commit_statement(PowerBuilderParser.Sql_commit_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#sql_commit_statement}.
	 * @param ctx the parse tree
	 */
	void exitSql_commit_statement(PowerBuilderParser.Sql_commit_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#execute_statement}.
	 * @param ctx the parse tree
	 */
	void enterExecute_statement(PowerBuilderParser.Execute_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#execute_statement}.
	 * @param ctx the parse tree
	 */
	void exitExecute_statement(PowerBuilderParser.Execute_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#close_sql_statement}.
	 * @param ctx the parse tree
	 */
	void enterClose_sql_statement(PowerBuilderParser.Close_sql_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#close_sql_statement}.
	 * @param ctx the parse tree
	 */
	void exitClose_sql_statement(PowerBuilderParser.Close_sql_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#declare_procedure_statement}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_procedure_statement(PowerBuilderParser.Declare_procedure_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#declare_procedure_statement}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_procedure_statement(PowerBuilderParser.Declare_procedure_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#declare_cursor_statement}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_cursor_statement(PowerBuilderParser.Declare_cursor_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#declare_cursor_statement}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_cursor_statement(PowerBuilderParser.Declare_cursor_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#open_cursor_statement}.
	 * @param ctx the parse tree
	 */
	void enterOpen_cursor_statement(PowerBuilderParser.Open_cursor_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#open_cursor_statement}.
	 * @param ctx the parse tree
	 */
	void exitOpen_cursor_statement(PowerBuilderParser.Open_cursor_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#close_cursor_statement}.
	 * @param ctx the parse tree
	 */
	void enterClose_cursor_statement(PowerBuilderParser.Close_cursor_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#close_cursor_statement}.
	 * @param ctx the parse tree
	 */
	void exitClose_cursor_statement(PowerBuilderParser.Close_cursor_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#fetch_into_statement}.
	 * @param ctx the parse tree
	 */
	void enterFetch_into_statement(PowerBuilderParser.Fetch_into_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#fetch_into_statement}.
	 * @param ctx the parse tree
	 */
	void exitFetch_into_statement(PowerBuilderParser.Fetch_into_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#prepare_sql_stateent}.
	 * @param ctx the parse tree
	 */
	void enterPrepare_sql_stateent(PowerBuilderParser.Prepare_sql_stateentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#prepare_sql_stateent}.
	 * @param ctx the parse tree
	 */
	void exitPrepare_sql_stateent(PowerBuilderParser.Prepare_sql_stateentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#increment_decrement_statement}.
	 * @param ctx the parse tree
	 */
	void enterIncrement_decrement_statement(PowerBuilderParser.Increment_decrement_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#increment_decrement_statement}.
	 * @param ctx the parse tree
	 */
	void exitIncrement_decrement_statement(PowerBuilderParser.Increment_decrement_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#assignment_rhs}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_rhs(PowerBuilderParser.Assignment_rhsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#assignment_rhs}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_rhs(PowerBuilderParser.Assignment_rhsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#describe_function_call}.
	 * @param ctx the parse tree
	 */
	void enterDescribe_function_call(PowerBuilderParser.Describe_function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#describe_function_call}.
	 * @param ctx the parse tree
	 */
	void exitDescribe_function_call(PowerBuilderParser.Describe_function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_statement(PowerBuilderParser.Assignment_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_statement(PowerBuilderParser.Assignment_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#variable_name}.
	 * @param ctx the parse tree
	 */
	void enterVariable_name(PowerBuilderParser.Variable_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#variable_name}.
	 * @param ctx the parse tree
	 */
	void exitVariable_name(PowerBuilderParser.Variable_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(PowerBuilderParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(PowerBuilderParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#function_call_expression_sub}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call_expression_sub(PowerBuilderParser.Function_call_expression_subContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#function_call_expression_sub}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call_expression_sub(PowerBuilderParser.Function_call_expression_subContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(PowerBuilderParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(PowerBuilderParser.Function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#function_event_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_event_call(PowerBuilderParser.Function_event_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#function_event_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_event_call(PowerBuilderParser.Function_event_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#function_virtual_call_expression_sub}.
	 * @param ctx the parse tree
	 */
	void enterFunction_virtual_call_expression_sub(PowerBuilderParser.Function_virtual_call_expression_subContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#function_virtual_call_expression_sub}.
	 * @param ctx the parse tree
	 */
	void exitFunction_virtual_call_expression_sub(PowerBuilderParser.Function_virtual_call_expression_subContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#open_call_sub}.
	 * @param ctx the parse tree
	 */
	void enterOpen_call_sub(PowerBuilderParser.Open_call_subContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#open_call_sub}.
	 * @param ctx the parse tree
	 */
	void exitOpen_call_sub(PowerBuilderParser.Open_call_subContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#close_call_sub}.
	 * @param ctx the parse tree
	 */
	void enterClose_call_sub(PowerBuilderParser.Close_call_subContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#close_call_sub}.
	 * @param ctx the parse tree
	 */
	void exitClose_call_sub(PowerBuilderParser.Close_call_subContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#function_call_statement}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call_statement(PowerBuilderParser.Function_call_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#function_call_statement}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call_statement(PowerBuilderParser.Function_call_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#ancestor_function_call}.
	 * @param ctx the parse tree
	 */
	void enterAncestor_function_call(PowerBuilderParser.Ancestor_function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#ancestor_function_call}.
	 * @param ctx the parse tree
	 */
	void exitAncestor_function_call(PowerBuilderParser.Ancestor_function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#call_statement}.
	 * @param ctx the parse tree
	 */
	void enterCall_statement(PowerBuilderParser.Call_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#call_statement}.
	 * @param ctx the parse tree
	 */
	void exitCall_statement(PowerBuilderParser.Call_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#super_call_statement}.
	 * @param ctx the parse tree
	 */
	void enterSuper_call_statement(PowerBuilderParser.Super_call_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#super_call_statement}.
	 * @param ctx the parse tree
	 */
	void exitSuper_call_statement(PowerBuilderParser.Super_call_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#ancestor_event_call_statement}.
	 * @param ctx the parse tree
	 */
	void enterAncestor_event_call_statement(PowerBuilderParser.Ancestor_event_call_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#ancestor_event_call_statement}.
	 * @param ctx the parse tree
	 */
	void exitAncestor_event_call_statement(PowerBuilderParser.Ancestor_event_call_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#event_call_statement_sub}.
	 * @param ctx the parse tree
	 */
	void enterEvent_call_statement_sub(PowerBuilderParser.Event_call_statement_subContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#event_call_statement_sub}.
	 * @param ctx the parse tree
	 */
	void exitEvent_call_statement_sub(PowerBuilderParser.Event_call_statement_subContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#event_call_statement}.
	 * @param ctx the parse tree
	 */
	void enterEvent_call_statement(PowerBuilderParser.Event_call_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#event_call_statement}.
	 * @param ctx the parse tree
	 */
	void exitEvent_call_statement(PowerBuilderParser.Event_call_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#create_call_sub}.
	 * @param ctx the parse tree
	 */
	void enterCreate_call_sub(PowerBuilderParser.Create_call_subContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#create_call_sub}.
	 * @param ctx the parse tree
	 */
	void exitCreate_call_sub(PowerBuilderParser.Create_call_subContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#create_call_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_call_statement(PowerBuilderParser.Create_call_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#create_call_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_call_statement(PowerBuilderParser.Create_call_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#destroy_call_sub}.
	 * @param ctx the parse tree
	 */
	void enterDestroy_call_sub(PowerBuilderParser.Destroy_call_subContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#destroy_call_sub}.
	 * @param ctx the parse tree
	 */
	void exitDestroy_call_sub(PowerBuilderParser.Destroy_call_subContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#destroy_call_statement}.
	 * @param ctx the parse tree
	 */
	void enterDestroy_call_statement(PowerBuilderParser.Destroy_call_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#destroy_call_statement}.
	 * @param ctx the parse tree
	 */
	void exitDestroy_call_statement(PowerBuilderParser.Destroy_call_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#for_loop_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop_statement(PowerBuilderParser.For_loop_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#for_loop_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop_statement(PowerBuilderParser.For_loop_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#do_while_loop_statement}.
	 * @param ctx the parse tree
	 */
	void enterDo_while_loop_statement(PowerBuilderParser.Do_while_loop_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#do_while_loop_statement}.
	 * @param ctx the parse tree
	 */
	void exitDo_while_loop_statement(PowerBuilderParser.Do_while_loop_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#do_loop_while_statement}.
	 * @param ctx the parse tree
	 */
	void enterDo_loop_while_statement(PowerBuilderParser.Do_loop_while_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#do_loop_while_statement}.
	 * @param ctx the parse tree
	 */
	void exitDo_loop_while_statement(PowerBuilderParser.Do_loop_while_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(PowerBuilderParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(PowerBuilderParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#elseif_statement}.
	 * @param ctx the parse tree
	 */
	void enterElseif_statement(PowerBuilderParser.Elseif_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#elseif_statement}.
	 * @param ctx the parse tree
	 */
	void exitElseif_statement(PowerBuilderParser.Elseif_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#else_statement}.
	 * @param ctx the parse tree
	 */
	void enterElse_statement(PowerBuilderParser.Else_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#else_statement}.
	 * @param ctx the parse tree
	 */
	void exitElse_statement(PowerBuilderParser.Else_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#if_simple_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_simple_statement(PowerBuilderParser.If_simple_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#if_simple_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_simple_statement(PowerBuilderParser.If_simple_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#continue_statement}.
	 * @param ctx the parse tree
	 */
	void enterContinue_statement(PowerBuilderParser.Continue_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#continue_statement}.
	 * @param ctx the parse tree
	 */
	void exitContinue_statement(PowerBuilderParser.Continue_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#continue_sub}.
	 * @param ctx the parse tree
	 */
	void enterContinue_sub(PowerBuilderParser.Continue_subContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#continue_sub}.
	 * @param ctx the parse tree
	 */
	void exitContinue_sub(PowerBuilderParser.Continue_subContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#post_event}.
	 * @param ctx the parse tree
	 */
	void enterPost_event(PowerBuilderParser.Post_eventContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#post_event}.
	 * @param ctx the parse tree
	 */
	void exitPost_event(PowerBuilderParser.Post_eventContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#exit_statement}.
	 * @param ctx the parse tree
	 */
	void enterExit_statement(PowerBuilderParser.Exit_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#exit_statement}.
	 * @param ctx the parse tree
	 */
	void exitExit_statement(PowerBuilderParser.Exit_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#choose_statement}.
	 * @param ctx the parse tree
	 */
	void enterChoose_statement(PowerBuilderParser.Choose_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#choose_statement}.
	 * @param ctx the parse tree
	 */
	void exitChoose_statement(PowerBuilderParser.Choose_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#choose_case_value_sub}.
	 * @param ctx the parse tree
	 */
	void enterChoose_case_value_sub(PowerBuilderParser.Choose_case_value_subContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#choose_case_value_sub}.
	 * @param ctx the parse tree
	 */
	void exitChoose_case_value_sub(PowerBuilderParser.Choose_case_value_subContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#choose_case_cond_sub}.
	 * @param ctx the parse tree
	 */
	void enterChoose_case_cond_sub(PowerBuilderParser.Choose_case_cond_subContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#choose_case_cond_sub}.
	 * @param ctx the parse tree
	 */
	void exitChoose_case_cond_sub(PowerBuilderParser.Choose_case_cond_subContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#choose_case_else_sub}.
	 * @param ctx the parse tree
	 */
	void enterChoose_case_else_sub(PowerBuilderParser.Choose_case_else_subContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#choose_case_else_sub}.
	 * @param ctx the parse tree
	 */
	void exitChoose_case_else_sub(PowerBuilderParser.Choose_case_else_subContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#label_stat}.
	 * @param ctx the parse tree
	 */
	void enterLabel_stat(PowerBuilderParser.Label_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#label_stat}.
	 * @param ctx the parse tree
	 */
	void exitLabel_stat(PowerBuilderParser.Label_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(PowerBuilderParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(PowerBuilderParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#string_literal}.
	 * @param ctx the parse tree
	 */
	void enterString_literal(PowerBuilderParser.String_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#string_literal}.
	 * @param ctx the parse tree
	 */
	void exitString_literal(PowerBuilderParser.String_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#identifier_array}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier_array(PowerBuilderParser.Identifier_arrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#identifier_array}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier_array(PowerBuilderParser.Identifier_arrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(PowerBuilderParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(PowerBuilderParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#identifier_name_ex}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier_name_ex(PowerBuilderParser.Identifier_name_exContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#identifier_name_ex}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier_name_ex(PowerBuilderParser.Identifier_name_exContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#identifier_name}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier_name(PowerBuilderParser.Identifier_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#identifier_name}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier_name(PowerBuilderParser.Identifier_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#bind_param}.
	 * @param ctx the parse tree
	 */
	void enterBind_param(PowerBuilderParser.Bind_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#bind_param}.
	 * @param ctx the parse tree
	 */
	void exitBind_param(PowerBuilderParser.Bind_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#atom_sub}.
	 * @param ctx the parse tree
	 */
	void enterAtom_sub(PowerBuilderParser.Atom_subContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#atom_sub}.
	 * @param ctx the parse tree
	 */
	void exitAtom_sub(PowerBuilderParser.Atom_subContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#atom_sub_call1}.
	 * @param ctx the parse tree
	 */
	void enterAtom_sub_call1(PowerBuilderParser.Atom_sub_call1Context ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#atom_sub_call1}.
	 * @param ctx the parse tree
	 */
	void exitAtom_sub_call1(PowerBuilderParser.Atom_sub_call1Context ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#atom_sub_member1}.
	 * @param ctx the parse tree
	 */
	void enterAtom_sub_member1(PowerBuilderParser.Atom_sub_member1Context ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#atom_sub_member1}.
	 * @param ctx the parse tree
	 */
	void exitAtom_sub_member1(PowerBuilderParser.Atom_sub_member1Context ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#array_access_atom}.
	 * @param ctx the parse tree
	 */
	void enterArray_access_atom(PowerBuilderParser.Array_access_atomContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#array_access_atom}.
	 * @param ctx the parse tree
	 */
	void exitArray_access_atom(PowerBuilderParser.Array_access_atomContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#data_type_name}.
	 * @param ctx the parse tree
	 */
	void enterData_type_name(PowerBuilderParser.Data_type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#data_type_name}.
	 * @param ctx the parse tree
	 */
	void exitData_type_name(PowerBuilderParser.Data_type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderParser#dataTypeSub}.
	 * @param ctx the parse tree
	 */
	void enterDataTypeSub(PowerBuilderParser.DataTypeSubContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderParser#dataTypeSub}.
	 * @param ctx the parse tree
	 */
	void exitDataTypeSub(PowerBuilderParser.DataTypeSubContext ctx);
}