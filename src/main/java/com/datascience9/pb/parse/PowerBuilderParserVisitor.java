// Generated from ./src/main/java/com/datascience9/pb/parse/PowerBuilderParser.g4 by ANTLR 4.9.2
package com.datascience9.pb.parse;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PowerBuilderParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PowerBuilderParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#start_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart_rule(PowerBuilderParser.Start_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#body_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody_rule(PowerBuilderParser.Body_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#forward_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForward_decl(PowerBuilderParser.Forward_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#datatype_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatatype_decl(PowerBuilderParser.Datatype_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#type_variables_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_variables_decl(PowerBuilderParser.Type_variables_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#global_variables_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_variables_decl(PowerBuilderParser.Global_variables_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#variable_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_decl(PowerBuilderParser.Variable_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#variable_decl_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_decl_sub(PowerBuilderParser.Variable_decl_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#variable_decl_sub0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_decl_sub0(PowerBuilderParser.Variable_decl_sub0Context ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#variable_decl_sub1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_decl_sub1(PowerBuilderParser.Variable_decl_sub1Context ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#variable_decl_sub2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_decl_sub2(PowerBuilderParser.Variable_decl_sub2Context ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#variable_decl_event}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_decl_event(PowerBuilderParser.Variable_decl_eventContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#decimal_decl_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimal_decl_sub(PowerBuilderParser.Decimal_decl_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#array_decl_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_decl_sub(PowerBuilderParser.Array_decl_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#constant_decl_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_decl_sub(PowerBuilderParser.Constant_decl_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#constant_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_decl(PowerBuilderParser.Constant_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#function_forward_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_forward_decl(PowerBuilderParser.Function_forward_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#function_forward_decl_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_forward_decl_alias(PowerBuilderParser.Function_forward_decl_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#parameter_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_sub(PowerBuilderParser.Parameter_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#parameters_list_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters_list_sub(PowerBuilderParser.Parameters_list_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#functions_forward_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctions_forward_decl(PowerBuilderParser.Functions_forward_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#function_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_body(PowerBuilderParser.Function_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#on_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOn_body(PowerBuilderParser.On_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#event_forward_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent_forward_decl(PowerBuilderParser.Event_forward_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#event_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent_body(PowerBuilderParser.Event_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#access_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccess_type(PowerBuilderParser.Access_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#access_modif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccess_modif(PowerBuilderParser.Access_modifContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#access_modif_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccess_modif_part(PowerBuilderParser.Access_modif_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#scope_modif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScope_modif(PowerBuilderParser.Scope_modifContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(PowerBuilderParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(PowerBuilderParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#expression_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_list(PowerBuilderParser.Expression_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#boolean_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_expression(PowerBuilderParser.Boolean_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#condition_or}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_or(PowerBuilderParser.Condition_orContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#condition_and}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_and(PowerBuilderParser.Condition_andContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#condition_not}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_not(PowerBuilderParser.Condition_notContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#condition_comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_comparison(PowerBuilderParser.Condition_comparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#add_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_expr(PowerBuilderParser.Add_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#mul_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul_expr(PowerBuilderParser.Mul_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#unary_sign_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_sign_expr(PowerBuilderParser.Unary_sign_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(PowerBuilderParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#public_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPublic_statement(PowerBuilderParser.Public_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#throw_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrow_statement(PowerBuilderParser.Throw_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#goto_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoto_statement(PowerBuilderParser.Goto_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#statement_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_sub(PowerBuilderParser.Statement_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#try_catch_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTry_catch_statement(PowerBuilderParser.Try_catch_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#sql_insert_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_insert_statement(PowerBuilderParser.Sql_insert_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#sql_values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_values(PowerBuilderParser.Sql_valuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#sql_delete_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_delete_statement(PowerBuilderParser.Sql_delete_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#sql_select_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_select_statement(PowerBuilderParser.Sql_select_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#sql_update_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_update_statement(PowerBuilderParser.Sql_update_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#sql_connect_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_connect_statement(PowerBuilderParser.Sql_connect_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#set_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_value(PowerBuilderParser.Set_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#where_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere_clause(PowerBuilderParser.Where_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#select_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_clause(PowerBuilderParser.Select_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#sql_commit_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_commit_statement(PowerBuilderParser.Sql_commit_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#execute_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute_statement(PowerBuilderParser.Execute_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#close_sql_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClose_sql_statement(PowerBuilderParser.Close_sql_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#declare_procedure_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_procedure_statement(PowerBuilderParser.Declare_procedure_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#declare_cursor_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_cursor_statement(PowerBuilderParser.Declare_cursor_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#open_cursor_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpen_cursor_statement(PowerBuilderParser.Open_cursor_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#close_cursor_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClose_cursor_statement(PowerBuilderParser.Close_cursor_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#fetch_into_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFetch_into_statement(PowerBuilderParser.Fetch_into_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#prepare_sql_stateent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrepare_sql_stateent(PowerBuilderParser.Prepare_sql_stateentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#increment_decrement_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrement_decrement_statement(PowerBuilderParser.Increment_decrement_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#assignment_rhs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_rhs(PowerBuilderParser.Assignment_rhsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#describe_function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribe_function_call(PowerBuilderParser.Describe_function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#assignment_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_statement(PowerBuilderParser.Assignment_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#variable_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_name(PowerBuilderParser.Variable_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(PowerBuilderParser.Return_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#function_call_expression_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call_expression_sub(PowerBuilderParser.Function_call_expression_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name(PowerBuilderParser.Function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#function_event_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_event_call(PowerBuilderParser.Function_event_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#function_virtual_call_expression_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_virtual_call_expression_sub(PowerBuilderParser.Function_virtual_call_expression_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#open_call_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpen_call_sub(PowerBuilderParser.Open_call_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#close_call_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClose_call_sub(PowerBuilderParser.Close_call_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#function_call_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call_statement(PowerBuilderParser.Function_call_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#ancestor_function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAncestor_function_call(PowerBuilderParser.Ancestor_function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#call_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_statement(PowerBuilderParser.Call_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#super_call_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuper_call_statement(PowerBuilderParser.Super_call_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#ancestor_event_call_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAncestor_event_call_statement(PowerBuilderParser.Ancestor_event_call_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#event_call_statement_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent_call_statement_sub(PowerBuilderParser.Event_call_statement_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#event_call_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent_call_statement(PowerBuilderParser.Event_call_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#create_call_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_call_sub(PowerBuilderParser.Create_call_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#create_call_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_call_statement(PowerBuilderParser.Create_call_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#destroy_call_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDestroy_call_sub(PowerBuilderParser.Destroy_call_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#destroy_call_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDestroy_call_statement(PowerBuilderParser.Destroy_call_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#for_loop_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_loop_statement(PowerBuilderParser.For_loop_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#do_while_loop_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_while_loop_statement(PowerBuilderParser.Do_while_loop_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#do_loop_while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_loop_while_statement(PowerBuilderParser.Do_loop_while_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(PowerBuilderParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#if_simple_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_simple_statement(PowerBuilderParser.If_simple_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#continue_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue_statement(PowerBuilderParser.Continue_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#continue_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue_sub(PowerBuilderParser.Continue_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#post_event}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPost_event(PowerBuilderParser.Post_eventContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#exit_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExit_statement(PowerBuilderParser.Exit_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#choose_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChoose_statement(PowerBuilderParser.Choose_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#choose_case_value_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChoose_case_value_sub(PowerBuilderParser.Choose_case_value_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#choose_case_cond_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChoose_case_cond_sub(PowerBuilderParser.Choose_case_cond_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#choose_case_else_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChoose_case_else_sub(PowerBuilderParser.Choose_case_else_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#label_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel_stat(PowerBuilderParser.Label_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(PowerBuilderParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#string_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_literal(PowerBuilderParser.String_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#identifier_array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier_array(PowerBuilderParser.Identifier_arrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(PowerBuilderParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#identifier_name_ex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier_name_ex(PowerBuilderParser.Identifier_name_exContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#identifier_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier_name(PowerBuilderParser.Identifier_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#atom_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom_sub(PowerBuilderParser.Atom_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#atom_sub_call1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom_sub_call1(PowerBuilderParser.Atom_sub_call1Context ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#atom_sub_member1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom_sub_member1(PowerBuilderParser.Atom_sub_member1Context ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#array_access_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_access_atom(PowerBuilderParser.Array_access_atomContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#data_type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_type_name(PowerBuilderParser.Data_type_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderParser#dataTypeSub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataTypeSub(PowerBuilderParser.DataTypeSubContext ctx);
}