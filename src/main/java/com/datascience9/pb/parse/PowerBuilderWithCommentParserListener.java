// Generated from ./src/main/java/com/datascience9/pb/parse/PowerBuilderWithCommentParser.g4 by ANTLR 4.9.2
package com.datascience9.pb.parse;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PowerBuilderWithCommentParser}.
 */
public interface PowerBuilderWithCommentParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#start_rule}.
	 * @param ctx the parse tree
	 */
	void enterStart_rule(PowerBuilderWithCommentParser.Start_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#start_rule}.
	 * @param ctx the parse tree
	 */
	void exitStart_rule(PowerBuilderWithCommentParser.Start_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#body_rule_comment}.
	 * @param ctx the parse tree
	 */
	void enterBody_rule_comment(PowerBuilderWithCommentParser.Body_rule_commentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#body_rule_comment}.
	 * @param ctx the parse tree
	 */
	void exitBody_rule_comment(PowerBuilderWithCommentParser.Body_rule_commentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#body_rule}.
	 * @param ctx the parse tree
	 */
	void enterBody_rule(PowerBuilderWithCommentParser.Body_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#body_rule}.
	 * @param ctx the parse tree
	 */
	void exitBody_rule(PowerBuilderWithCommentParser.Body_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#forward_decl}.
	 * @param ctx the parse tree
	 */
	void enterForward_decl(PowerBuilderWithCommentParser.Forward_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#forward_decl}.
	 * @param ctx the parse tree
	 */
	void exitForward_decl(PowerBuilderWithCommentParser.Forward_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#datatype_decl}.
	 * @param ctx the parse tree
	 */
	void enterDatatype_decl(PowerBuilderWithCommentParser.Datatype_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#datatype_decl}.
	 * @param ctx the parse tree
	 */
	void exitDatatype_decl(PowerBuilderWithCommentParser.Datatype_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#type_variables_decl}.
	 * @param ctx the parse tree
	 */
	void enterType_variables_decl(PowerBuilderWithCommentParser.Type_variables_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#type_variables_decl}.
	 * @param ctx the parse tree
	 */
	void exitType_variables_decl(PowerBuilderWithCommentParser.Type_variables_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#global_variables_decl}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_variables_decl(PowerBuilderWithCommentParser.Global_variables_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#global_variables_decl}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_variables_decl(PowerBuilderWithCommentParser.Global_variables_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#variable_decl_comment}.
	 * @param ctx the parse tree
	 */
	void enterVariable_decl_comment(PowerBuilderWithCommentParser.Variable_decl_commentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#variable_decl_comment}.
	 * @param ctx the parse tree
	 */
	void exitVariable_decl_comment(PowerBuilderWithCommentParser.Variable_decl_commentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#variable_decl}.
	 * @param ctx the parse tree
	 */
	void enterVariable_decl(PowerBuilderWithCommentParser.Variable_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#variable_decl}.
	 * @param ctx the parse tree
	 */
	void exitVariable_decl(PowerBuilderWithCommentParser.Variable_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#variable_decl_sub}.
	 * @param ctx the parse tree
	 */
	void enterVariable_decl_sub(PowerBuilderWithCommentParser.Variable_decl_subContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#variable_decl_sub}.
	 * @param ctx the parse tree
	 */
	void exitVariable_decl_sub(PowerBuilderWithCommentParser.Variable_decl_subContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#variable_decl_sub0}.
	 * @param ctx the parse tree
	 */
	void enterVariable_decl_sub0(PowerBuilderWithCommentParser.Variable_decl_sub0Context ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#variable_decl_sub0}.
	 * @param ctx the parse tree
	 */
	void exitVariable_decl_sub0(PowerBuilderWithCommentParser.Variable_decl_sub0Context ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#variable_decl_sub1}.
	 * @param ctx the parse tree
	 */
	void enterVariable_decl_sub1(PowerBuilderWithCommentParser.Variable_decl_sub1Context ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#variable_decl_sub1}.
	 * @param ctx the parse tree
	 */
	void exitVariable_decl_sub1(PowerBuilderWithCommentParser.Variable_decl_sub1Context ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#variable_decl_sub2}.
	 * @param ctx the parse tree
	 */
	void enterVariable_decl_sub2(PowerBuilderWithCommentParser.Variable_decl_sub2Context ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#variable_decl_sub2}.
	 * @param ctx the parse tree
	 */
	void exitVariable_decl_sub2(PowerBuilderWithCommentParser.Variable_decl_sub2Context ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#variable_decl_event}.
	 * @param ctx the parse tree
	 */
	void enterVariable_decl_event(PowerBuilderWithCommentParser.Variable_decl_eventContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#variable_decl_event}.
	 * @param ctx the parse tree
	 */
	void exitVariable_decl_event(PowerBuilderWithCommentParser.Variable_decl_eventContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#decimal_decl_sub}.
	 * @param ctx the parse tree
	 */
	void enterDecimal_decl_sub(PowerBuilderWithCommentParser.Decimal_decl_subContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#decimal_decl_sub}.
	 * @param ctx the parse tree
	 */
	void exitDecimal_decl_sub(PowerBuilderWithCommentParser.Decimal_decl_subContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#array_decl_sub}.
	 * @param ctx the parse tree
	 */
	void enterArray_decl_sub(PowerBuilderWithCommentParser.Array_decl_subContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#array_decl_sub}.
	 * @param ctx the parse tree
	 */
	void exitArray_decl_sub(PowerBuilderWithCommentParser.Array_decl_subContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#constant_decl_sub}.
	 * @param ctx the parse tree
	 */
	void enterConstant_decl_sub(PowerBuilderWithCommentParser.Constant_decl_subContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#constant_decl_sub}.
	 * @param ctx the parse tree
	 */
	void exitConstant_decl_sub(PowerBuilderWithCommentParser.Constant_decl_subContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#constant_decl}.
	 * @param ctx the parse tree
	 */
	void enterConstant_decl(PowerBuilderWithCommentParser.Constant_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#constant_decl}.
	 * @param ctx the parse tree
	 */
	void exitConstant_decl(PowerBuilderWithCommentParser.Constant_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#function_forward_decl}.
	 * @param ctx the parse tree
	 */
	void enterFunction_forward_decl(PowerBuilderWithCommentParser.Function_forward_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#function_forward_decl}.
	 * @param ctx the parse tree
	 */
	void exitFunction_forward_decl(PowerBuilderWithCommentParser.Function_forward_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#function_forward_decl_alias}.
	 * @param ctx the parse tree
	 */
	void enterFunction_forward_decl_alias(PowerBuilderWithCommentParser.Function_forward_decl_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#function_forward_decl_alias}.
	 * @param ctx the parse tree
	 */
	void exitFunction_forward_decl_alias(PowerBuilderWithCommentParser.Function_forward_decl_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#parameter_sub}.
	 * @param ctx the parse tree
	 */
	void enterParameter_sub(PowerBuilderWithCommentParser.Parameter_subContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#parameter_sub}.
	 * @param ctx the parse tree
	 */
	void exitParameter_sub(PowerBuilderWithCommentParser.Parameter_subContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#parameters_list_sub}.
	 * @param ctx the parse tree
	 */
	void enterParameters_list_sub(PowerBuilderWithCommentParser.Parameters_list_subContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#parameters_list_sub}.
	 * @param ctx the parse tree
	 */
	void exitParameters_list_sub(PowerBuilderWithCommentParser.Parameters_list_subContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#functions_forward_decl}.
	 * @param ctx the parse tree
	 */
	void enterFunctions_forward_decl(PowerBuilderWithCommentParser.Functions_forward_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#functions_forward_decl}.
	 * @param ctx the parse tree
	 */
	void exitFunctions_forward_decl(PowerBuilderWithCommentParser.Functions_forward_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#function_body}.
	 * @param ctx the parse tree
	 */
	void enterFunction_body(PowerBuilderWithCommentParser.Function_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#function_body}.
	 * @param ctx the parse tree
	 */
	void exitFunction_body(PowerBuilderWithCommentParser.Function_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#on_body}.
	 * @param ctx the parse tree
	 */
	void enterOn_body(PowerBuilderWithCommentParser.On_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#on_body}.
	 * @param ctx the parse tree
	 */
	void exitOn_body(PowerBuilderWithCommentParser.On_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#event_forward_decl}.
	 * @param ctx the parse tree
	 */
	void enterEvent_forward_decl(PowerBuilderWithCommentParser.Event_forward_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#event_forward_decl}.
	 * @param ctx the parse tree
	 */
	void exitEvent_forward_decl(PowerBuilderWithCommentParser.Event_forward_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#event_body}.
	 * @param ctx the parse tree
	 */
	void enterEvent_body(PowerBuilderWithCommentParser.Event_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#event_body}.
	 * @param ctx the parse tree
	 */
	void exitEvent_body(PowerBuilderWithCommentParser.Event_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#access_type}.
	 * @param ctx the parse tree
	 */
	void enterAccess_type(PowerBuilderWithCommentParser.Access_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#access_type}.
	 * @param ctx the parse tree
	 */
	void exitAccess_type(PowerBuilderWithCommentParser.Access_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#access_modif}.
	 * @param ctx the parse tree
	 */
	void enterAccess_modif(PowerBuilderWithCommentParser.Access_modifContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#access_modif}.
	 * @param ctx the parse tree
	 */
	void exitAccess_modif(PowerBuilderWithCommentParser.Access_modifContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#access_modif_part}.
	 * @param ctx the parse tree
	 */
	void enterAccess_modif_part(PowerBuilderWithCommentParser.Access_modif_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#access_modif_part}.
	 * @param ctx the parse tree
	 */
	void exitAccess_modif_part(PowerBuilderWithCommentParser.Access_modif_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#scope_modif}.
	 * @param ctx the parse tree
	 */
	void enterScope_modif(PowerBuilderWithCommentParser.Scope_modifContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#scope_modif}.
	 * @param ctx the parse tree
	 */
	void exitScope_modif(PowerBuilderWithCommentParser.Scope_modifContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#expression_comment}.
	 * @param ctx the parse tree
	 */
	void enterExpression_comment(PowerBuilderWithCommentParser.Expression_commentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#expression_comment}.
	 * @param ctx the parse tree
	 */
	void exitExpression_comment(PowerBuilderWithCommentParser.Expression_commentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(PowerBuilderWithCommentParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(PowerBuilderWithCommentParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(PowerBuilderWithCommentParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(PowerBuilderWithCommentParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void enterExpression_list(PowerBuilderWithCommentParser.Expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void exitExpression_list(PowerBuilderWithCommentParser.Expression_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#boolean_expression}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_expression(PowerBuilderWithCommentParser.Boolean_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#boolean_expression}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_expression(PowerBuilderWithCommentParser.Boolean_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#condition_or}.
	 * @param ctx the parse tree
	 */
	void enterCondition_or(PowerBuilderWithCommentParser.Condition_orContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#condition_or}.
	 * @param ctx the parse tree
	 */
	void exitCondition_or(PowerBuilderWithCommentParser.Condition_orContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#condition_and}.
	 * @param ctx the parse tree
	 */
	void enterCondition_and(PowerBuilderWithCommentParser.Condition_andContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#condition_and}.
	 * @param ctx the parse tree
	 */
	void exitCondition_and(PowerBuilderWithCommentParser.Condition_andContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#condition_not}.
	 * @param ctx the parse tree
	 */
	void enterCondition_not(PowerBuilderWithCommentParser.Condition_notContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#condition_not}.
	 * @param ctx the parse tree
	 */
	void exitCondition_not(PowerBuilderWithCommentParser.Condition_notContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#condition_comparison}.
	 * @param ctx the parse tree
	 */
	void enterCondition_comparison(PowerBuilderWithCommentParser.Condition_comparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#condition_comparison}.
	 * @param ctx the parse tree
	 */
	void exitCondition_comparison(PowerBuilderWithCommentParser.Condition_comparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#add_expr}.
	 * @param ctx the parse tree
	 */
	void enterAdd_expr(PowerBuilderWithCommentParser.Add_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#add_expr}.
	 * @param ctx the parse tree
	 */
	void exitAdd_expr(PowerBuilderWithCommentParser.Add_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#mul_expr}.
	 * @param ctx the parse tree
	 */
	void enterMul_expr(PowerBuilderWithCommentParser.Mul_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#mul_expr}.
	 * @param ctx the parse tree
	 */
	void exitMul_expr(PowerBuilderWithCommentParser.Mul_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#unary_sign_expr}.
	 * @param ctx the parse tree
	 */
	void enterUnary_sign_expr(PowerBuilderWithCommentParser.Unary_sign_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#unary_sign_expr}.
	 * @param ctx the parse tree
	 */
	void exitUnary_sign_expr(PowerBuilderWithCommentParser.Unary_sign_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#statement_comment}.
	 * @param ctx the parse tree
	 */
	void enterStatement_comment(PowerBuilderWithCommentParser.Statement_commentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#statement_comment}.
	 * @param ctx the parse tree
	 */
	void exitStatement_comment(PowerBuilderWithCommentParser.Statement_commentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(PowerBuilderWithCommentParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(PowerBuilderWithCommentParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#public_statement}.
	 * @param ctx the parse tree
	 */
	void enterPublic_statement(PowerBuilderWithCommentParser.Public_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#public_statement}.
	 * @param ctx the parse tree
	 */
	void exitPublic_statement(PowerBuilderWithCommentParser.Public_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#throw_statement}.
	 * @param ctx the parse tree
	 */
	void enterThrow_statement(PowerBuilderWithCommentParser.Throw_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#throw_statement}.
	 * @param ctx the parse tree
	 */
	void exitThrow_statement(PowerBuilderWithCommentParser.Throw_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#goto_statement}.
	 * @param ctx the parse tree
	 */
	void enterGoto_statement(PowerBuilderWithCommentParser.Goto_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#goto_statement}.
	 * @param ctx the parse tree
	 */
	void exitGoto_statement(PowerBuilderWithCommentParser.Goto_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#statement_sub}.
	 * @param ctx the parse tree
	 */
	void enterStatement_sub(PowerBuilderWithCommentParser.Statement_subContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#statement_sub}.
	 * @param ctx the parse tree
	 */
	void exitStatement_sub(PowerBuilderWithCommentParser.Statement_subContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#try_catch_statement}.
	 * @param ctx the parse tree
	 */
	void enterTry_catch_statement(PowerBuilderWithCommentParser.Try_catch_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#try_catch_statement}.
	 * @param ctx the parse tree
	 */
	void exitTry_catch_statement(PowerBuilderWithCommentParser.Try_catch_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#sql_statement}.
	 * @param ctx the parse tree
	 */
	void enterSql_statement(PowerBuilderWithCommentParser.Sql_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#sql_statement}.
	 * @param ctx the parse tree
	 */
	void exitSql_statement(PowerBuilderWithCommentParser.Sql_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#sql_insert_statement}.
	 * @param ctx the parse tree
	 */
	void enterSql_insert_statement(PowerBuilderWithCommentParser.Sql_insert_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#sql_insert_statement}.
	 * @param ctx the parse tree
	 */
	void exitSql_insert_statement(PowerBuilderWithCommentParser.Sql_insert_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#sql_values}.
	 * @param ctx the parse tree
	 */
	void enterSql_values(PowerBuilderWithCommentParser.Sql_valuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#sql_values}.
	 * @param ctx the parse tree
	 */
	void exitSql_values(PowerBuilderWithCommentParser.Sql_valuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#sql_delete_statement}.
	 * @param ctx the parse tree
	 */
	void enterSql_delete_statement(PowerBuilderWithCommentParser.Sql_delete_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#sql_delete_statement}.
	 * @param ctx the parse tree
	 */
	void exitSql_delete_statement(PowerBuilderWithCommentParser.Sql_delete_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#sql_select_statement}.
	 * @param ctx the parse tree
	 */
	void enterSql_select_statement(PowerBuilderWithCommentParser.Sql_select_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#sql_select_statement}.
	 * @param ctx the parse tree
	 */
	void exitSql_select_statement(PowerBuilderWithCommentParser.Sql_select_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#sql_update_statement}.
	 * @param ctx the parse tree
	 */
	void enterSql_update_statement(PowerBuilderWithCommentParser.Sql_update_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#sql_update_statement}.
	 * @param ctx the parse tree
	 */
	void exitSql_update_statement(PowerBuilderWithCommentParser.Sql_update_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#sql_connect_statement}.
	 * @param ctx the parse tree
	 */
	void enterSql_connect_statement(PowerBuilderWithCommentParser.Sql_connect_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#sql_connect_statement}.
	 * @param ctx the parse tree
	 */
	void exitSql_connect_statement(PowerBuilderWithCommentParser.Sql_connect_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#set_value}.
	 * @param ctx the parse tree
	 */
	void enterSet_value(PowerBuilderWithCommentParser.Set_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#set_value}.
	 * @param ctx the parse tree
	 */
	void exitSet_value(PowerBuilderWithCommentParser.Set_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void enterWhere_clause(PowerBuilderWithCommentParser.Where_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void exitWhere_clause(PowerBuilderWithCommentParser.Where_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#select_clause}.
	 * @param ctx the parse tree
	 */
	void enterSelect_clause(PowerBuilderWithCommentParser.Select_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#select_clause}.
	 * @param ctx the parse tree
	 */
	void exitSelect_clause(PowerBuilderWithCommentParser.Select_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#sql_commit_statement}.
	 * @param ctx the parse tree
	 */
	void enterSql_commit_statement(PowerBuilderWithCommentParser.Sql_commit_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#sql_commit_statement}.
	 * @param ctx the parse tree
	 */
	void exitSql_commit_statement(PowerBuilderWithCommentParser.Sql_commit_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#execute_statement}.
	 * @param ctx the parse tree
	 */
	void enterExecute_statement(PowerBuilderWithCommentParser.Execute_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#execute_statement}.
	 * @param ctx the parse tree
	 */
	void exitExecute_statement(PowerBuilderWithCommentParser.Execute_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#close_sql_statement}.
	 * @param ctx the parse tree
	 */
	void enterClose_sql_statement(PowerBuilderWithCommentParser.Close_sql_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#close_sql_statement}.
	 * @param ctx the parse tree
	 */
	void exitClose_sql_statement(PowerBuilderWithCommentParser.Close_sql_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#declare_procedure_statement}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_procedure_statement(PowerBuilderWithCommentParser.Declare_procedure_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#declare_procedure_statement}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_procedure_statement(PowerBuilderWithCommentParser.Declare_procedure_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#declare_cursor_statement}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_cursor_statement(PowerBuilderWithCommentParser.Declare_cursor_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#declare_cursor_statement}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_cursor_statement(PowerBuilderWithCommentParser.Declare_cursor_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#open_cursor_statement}.
	 * @param ctx the parse tree
	 */
	void enterOpen_cursor_statement(PowerBuilderWithCommentParser.Open_cursor_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#open_cursor_statement}.
	 * @param ctx the parse tree
	 */
	void exitOpen_cursor_statement(PowerBuilderWithCommentParser.Open_cursor_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#close_cursor_statement}.
	 * @param ctx the parse tree
	 */
	void enterClose_cursor_statement(PowerBuilderWithCommentParser.Close_cursor_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#close_cursor_statement}.
	 * @param ctx the parse tree
	 */
	void exitClose_cursor_statement(PowerBuilderWithCommentParser.Close_cursor_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#fetch_into_statement}.
	 * @param ctx the parse tree
	 */
	void enterFetch_into_statement(PowerBuilderWithCommentParser.Fetch_into_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#fetch_into_statement}.
	 * @param ctx the parse tree
	 */
	void exitFetch_into_statement(PowerBuilderWithCommentParser.Fetch_into_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#prepare_sql_stateent}.
	 * @param ctx the parse tree
	 */
	void enterPrepare_sql_stateent(PowerBuilderWithCommentParser.Prepare_sql_stateentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#prepare_sql_stateent}.
	 * @param ctx the parse tree
	 */
	void exitPrepare_sql_stateent(PowerBuilderWithCommentParser.Prepare_sql_stateentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#increment_decrement_statement}.
	 * @param ctx the parse tree
	 */
	void enterIncrement_decrement_statement(PowerBuilderWithCommentParser.Increment_decrement_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#increment_decrement_statement}.
	 * @param ctx the parse tree
	 */
	void exitIncrement_decrement_statement(PowerBuilderWithCommentParser.Increment_decrement_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#assignment_rhs}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_rhs(PowerBuilderWithCommentParser.Assignment_rhsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#assignment_rhs}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_rhs(PowerBuilderWithCommentParser.Assignment_rhsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#describe_function_call}.
	 * @param ctx the parse tree
	 */
	void enterDescribe_function_call(PowerBuilderWithCommentParser.Describe_function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#describe_function_call}.
	 * @param ctx the parse tree
	 */
	void exitDescribe_function_call(PowerBuilderWithCommentParser.Describe_function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_statement(PowerBuilderWithCommentParser.Assignment_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_statement(PowerBuilderWithCommentParser.Assignment_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#variable_name}.
	 * @param ctx the parse tree
	 */
	void enterVariable_name(PowerBuilderWithCommentParser.Variable_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#variable_name}.
	 * @param ctx the parse tree
	 */
	void exitVariable_name(PowerBuilderWithCommentParser.Variable_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(PowerBuilderWithCommentParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(PowerBuilderWithCommentParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#function_call_expression_sub}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call_expression_sub(PowerBuilderWithCommentParser.Function_call_expression_subContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#function_call_expression_sub}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call_expression_sub(PowerBuilderWithCommentParser.Function_call_expression_subContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(PowerBuilderWithCommentParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(PowerBuilderWithCommentParser.Function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#function_event_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_event_call(PowerBuilderWithCommentParser.Function_event_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#function_event_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_event_call(PowerBuilderWithCommentParser.Function_event_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#function_virtual_call_expression_sub}.
	 * @param ctx the parse tree
	 */
	void enterFunction_virtual_call_expression_sub(PowerBuilderWithCommentParser.Function_virtual_call_expression_subContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#function_virtual_call_expression_sub}.
	 * @param ctx the parse tree
	 */
	void exitFunction_virtual_call_expression_sub(PowerBuilderWithCommentParser.Function_virtual_call_expression_subContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#open_call_sub}.
	 * @param ctx the parse tree
	 */
	void enterOpen_call_sub(PowerBuilderWithCommentParser.Open_call_subContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#open_call_sub}.
	 * @param ctx the parse tree
	 */
	void exitOpen_call_sub(PowerBuilderWithCommentParser.Open_call_subContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#close_call_sub}.
	 * @param ctx the parse tree
	 */
	void enterClose_call_sub(PowerBuilderWithCommentParser.Close_call_subContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#close_call_sub}.
	 * @param ctx the parse tree
	 */
	void exitClose_call_sub(PowerBuilderWithCommentParser.Close_call_subContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#function_call_statement}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call_statement(PowerBuilderWithCommentParser.Function_call_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#function_call_statement}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call_statement(PowerBuilderWithCommentParser.Function_call_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#ancestor_function_call}.
	 * @param ctx the parse tree
	 */
	void enterAncestor_function_call(PowerBuilderWithCommentParser.Ancestor_function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#ancestor_function_call}.
	 * @param ctx the parse tree
	 */
	void exitAncestor_function_call(PowerBuilderWithCommentParser.Ancestor_function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#call_statement}.
	 * @param ctx the parse tree
	 */
	void enterCall_statement(PowerBuilderWithCommentParser.Call_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#call_statement}.
	 * @param ctx the parse tree
	 */
	void exitCall_statement(PowerBuilderWithCommentParser.Call_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#super_call_statement}.
	 * @param ctx the parse tree
	 */
	void enterSuper_call_statement(PowerBuilderWithCommentParser.Super_call_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#super_call_statement}.
	 * @param ctx the parse tree
	 */
	void exitSuper_call_statement(PowerBuilderWithCommentParser.Super_call_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#ancestor_event_call_statement}.
	 * @param ctx the parse tree
	 */
	void enterAncestor_event_call_statement(PowerBuilderWithCommentParser.Ancestor_event_call_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#ancestor_event_call_statement}.
	 * @param ctx the parse tree
	 */
	void exitAncestor_event_call_statement(PowerBuilderWithCommentParser.Ancestor_event_call_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#event_call_statement_sub}.
	 * @param ctx the parse tree
	 */
	void enterEvent_call_statement_sub(PowerBuilderWithCommentParser.Event_call_statement_subContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#event_call_statement_sub}.
	 * @param ctx the parse tree
	 */
	void exitEvent_call_statement_sub(PowerBuilderWithCommentParser.Event_call_statement_subContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#event_call_statement}.
	 * @param ctx the parse tree
	 */
	void enterEvent_call_statement(PowerBuilderWithCommentParser.Event_call_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#event_call_statement}.
	 * @param ctx the parse tree
	 */
	void exitEvent_call_statement(PowerBuilderWithCommentParser.Event_call_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#create_call_sub}.
	 * @param ctx the parse tree
	 */
	void enterCreate_call_sub(PowerBuilderWithCommentParser.Create_call_subContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#create_call_sub}.
	 * @param ctx the parse tree
	 */
	void exitCreate_call_sub(PowerBuilderWithCommentParser.Create_call_subContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#create_call_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_call_statement(PowerBuilderWithCommentParser.Create_call_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#create_call_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_call_statement(PowerBuilderWithCommentParser.Create_call_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#destroy_call_sub}.
	 * @param ctx the parse tree
	 */
	void enterDestroy_call_sub(PowerBuilderWithCommentParser.Destroy_call_subContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#destroy_call_sub}.
	 * @param ctx the parse tree
	 */
	void exitDestroy_call_sub(PowerBuilderWithCommentParser.Destroy_call_subContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#destroy_call_statement}.
	 * @param ctx the parse tree
	 */
	void enterDestroy_call_statement(PowerBuilderWithCommentParser.Destroy_call_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#destroy_call_statement}.
	 * @param ctx the parse tree
	 */
	void exitDestroy_call_statement(PowerBuilderWithCommentParser.Destroy_call_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#for_loop_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop_statement(PowerBuilderWithCommentParser.For_loop_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#for_loop_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop_statement(PowerBuilderWithCommentParser.For_loop_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#do_while_loop_statement}.
	 * @param ctx the parse tree
	 */
	void enterDo_while_loop_statement(PowerBuilderWithCommentParser.Do_while_loop_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#do_while_loop_statement}.
	 * @param ctx the parse tree
	 */
	void exitDo_while_loop_statement(PowerBuilderWithCommentParser.Do_while_loop_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#do_loop_while_statement}.
	 * @param ctx the parse tree
	 */
	void enterDo_loop_while_statement(PowerBuilderWithCommentParser.Do_loop_while_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#do_loop_while_statement}.
	 * @param ctx the parse tree
	 */
	void exitDo_loop_while_statement(PowerBuilderWithCommentParser.Do_loop_while_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(PowerBuilderWithCommentParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(PowerBuilderWithCommentParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#elseif_statement}.
	 * @param ctx the parse tree
	 */
	void enterElseif_statement(PowerBuilderWithCommentParser.Elseif_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#elseif_statement}.
	 * @param ctx the parse tree
	 */
	void exitElseif_statement(PowerBuilderWithCommentParser.Elseif_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#else_statement}.
	 * @param ctx the parse tree
	 */
	void enterElse_statement(PowerBuilderWithCommentParser.Else_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#else_statement}.
	 * @param ctx the parse tree
	 */
	void exitElse_statement(PowerBuilderWithCommentParser.Else_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#if_simple_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_simple_statement(PowerBuilderWithCommentParser.If_simple_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#if_simple_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_simple_statement(PowerBuilderWithCommentParser.If_simple_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#continue_statement}.
	 * @param ctx the parse tree
	 */
	void enterContinue_statement(PowerBuilderWithCommentParser.Continue_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#continue_statement}.
	 * @param ctx the parse tree
	 */
	void exitContinue_statement(PowerBuilderWithCommentParser.Continue_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#continue_sub}.
	 * @param ctx the parse tree
	 */
	void enterContinue_sub(PowerBuilderWithCommentParser.Continue_subContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#continue_sub}.
	 * @param ctx the parse tree
	 */
	void exitContinue_sub(PowerBuilderWithCommentParser.Continue_subContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#post_event}.
	 * @param ctx the parse tree
	 */
	void enterPost_event(PowerBuilderWithCommentParser.Post_eventContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#post_event}.
	 * @param ctx the parse tree
	 */
	void exitPost_event(PowerBuilderWithCommentParser.Post_eventContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#exit_statement}.
	 * @param ctx the parse tree
	 */
	void enterExit_statement(PowerBuilderWithCommentParser.Exit_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#exit_statement}.
	 * @param ctx the parse tree
	 */
	void exitExit_statement(PowerBuilderWithCommentParser.Exit_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#choose_statement}.
	 * @param ctx the parse tree
	 */
	void enterChoose_statement(PowerBuilderWithCommentParser.Choose_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#choose_statement}.
	 * @param ctx the parse tree
	 */
	void exitChoose_statement(PowerBuilderWithCommentParser.Choose_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#choose_case_value_sub}.
	 * @param ctx the parse tree
	 */
	void enterChoose_case_value_sub(PowerBuilderWithCommentParser.Choose_case_value_subContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#choose_case_value_sub}.
	 * @param ctx the parse tree
	 */
	void exitChoose_case_value_sub(PowerBuilderWithCommentParser.Choose_case_value_subContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#choose_case_cond_sub}.
	 * @param ctx the parse tree
	 */
	void enterChoose_case_cond_sub(PowerBuilderWithCommentParser.Choose_case_cond_subContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#choose_case_cond_sub}.
	 * @param ctx the parse tree
	 */
	void exitChoose_case_cond_sub(PowerBuilderWithCommentParser.Choose_case_cond_subContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#choose_case_else_sub}.
	 * @param ctx the parse tree
	 */
	void enterChoose_case_else_sub(PowerBuilderWithCommentParser.Choose_case_else_subContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#choose_case_else_sub}.
	 * @param ctx the parse tree
	 */
	void exitChoose_case_else_sub(PowerBuilderWithCommentParser.Choose_case_else_subContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#label_stat}.
	 * @param ctx the parse tree
	 */
	void enterLabel_stat(PowerBuilderWithCommentParser.Label_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#label_stat}.
	 * @param ctx the parse tree
	 */
	void exitLabel_stat(PowerBuilderWithCommentParser.Label_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(PowerBuilderWithCommentParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(PowerBuilderWithCommentParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#string_literal}.
	 * @param ctx the parse tree
	 */
	void enterString_literal(PowerBuilderWithCommentParser.String_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#string_literal}.
	 * @param ctx the parse tree
	 */
	void exitString_literal(PowerBuilderWithCommentParser.String_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#identifier_array}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier_array(PowerBuilderWithCommentParser.Identifier_arrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#identifier_array}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier_array(PowerBuilderWithCommentParser.Identifier_arrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(PowerBuilderWithCommentParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(PowerBuilderWithCommentParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#identifier_name_ex}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier_name_ex(PowerBuilderWithCommentParser.Identifier_name_exContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#identifier_name_ex}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier_name_ex(PowerBuilderWithCommentParser.Identifier_name_exContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#identifier_name}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier_name(PowerBuilderWithCommentParser.Identifier_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#identifier_name}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier_name(PowerBuilderWithCommentParser.Identifier_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#bind_param}.
	 * @param ctx the parse tree
	 */
	void enterBind_param(PowerBuilderWithCommentParser.Bind_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#bind_param}.
	 * @param ctx the parse tree
	 */
	void exitBind_param(PowerBuilderWithCommentParser.Bind_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#atom_sub}.
	 * @param ctx the parse tree
	 */
	void enterAtom_sub(PowerBuilderWithCommentParser.Atom_subContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#atom_sub}.
	 * @param ctx the parse tree
	 */
	void exitAtom_sub(PowerBuilderWithCommentParser.Atom_subContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#atom_sub_call1}.
	 * @param ctx the parse tree
	 */
	void enterAtom_sub_call1(PowerBuilderWithCommentParser.Atom_sub_call1Context ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#atom_sub_call1}.
	 * @param ctx the parse tree
	 */
	void exitAtom_sub_call1(PowerBuilderWithCommentParser.Atom_sub_call1Context ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#atom_sub_member1}.
	 * @param ctx the parse tree
	 */
	void enterAtom_sub_member1(PowerBuilderWithCommentParser.Atom_sub_member1Context ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#atom_sub_member1}.
	 * @param ctx the parse tree
	 */
	void exitAtom_sub_member1(PowerBuilderWithCommentParser.Atom_sub_member1Context ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#array_access_atom}.
	 * @param ctx the parse tree
	 */
	void enterArray_access_atom(PowerBuilderWithCommentParser.Array_access_atomContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#array_access_atom}.
	 * @param ctx the parse tree
	 */
	void exitArray_access_atom(PowerBuilderWithCommentParser.Array_access_atomContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#data_type_name}.
	 * @param ctx the parse tree
	 */
	void enterData_type_name(PowerBuilderWithCommentParser.Data_type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#data_type_name}.
	 * @param ctx the parse tree
	 */
	void exitData_type_name(PowerBuilderWithCommentParser.Data_type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#dataTypeSub}.
	 * @param ctx the parse tree
	 */
	void enterDataTypeSub(PowerBuilderWithCommentParser.DataTypeSubContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#dataTypeSub}.
	 * @param ctx the parse tree
	 */
	void exitDataTypeSub(PowerBuilderWithCommentParser.DataTypeSubContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderWithCommentParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(PowerBuilderWithCommentParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderWithCommentParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(PowerBuilderWithCommentParser.CommentContext ctx);
}