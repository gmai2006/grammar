// Generated from /backup/apps/grammars/src/main/java/com/datascience9/pb/dw/parse/PowerBuilderDWParser.g4 by ANTLR 4.9.1
package com.datascience9.pb.dw.parse;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PowerBuilderDWParser}.
 */
public interface PowerBuilderDWParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PowerBuilderDWParser#start_rule}.
	 * @param ctx the parse tree
	 */
	void enterStart_rule(PowerBuilderDWParser.Start_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderDWParser#start_rule}.
	 * @param ctx the parse tree
	 */
	void exitStart_rule(PowerBuilderDWParser.Start_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderDWParser#data_window_property}.
	 * @param ctx the parse tree
	 */
	void enterData_window_property(PowerBuilderDWParser.Data_window_propertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderDWParser#data_window_property}.
	 * @param ctx the parse tree
	 */
	void exitData_window_property(PowerBuilderDWParser.Data_window_propertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderDWParser#window_property}.
	 * @param ctx the parse tree
	 */
	void enterWindow_property(PowerBuilderDWParser.Window_propertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderDWParser#window_property}.
	 * @param ctx the parse tree
	 */
	void exitWindow_property(PowerBuilderDWParser.Window_propertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderDWParser#prop}.
	 * @param ctx the parse tree
	 */
	void enterProp(PowerBuilderDWParser.PropContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderDWParser#prop}.
	 * @param ctx the parse tree
	 */
	void exitProp(PowerBuilderDWParser.PropContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderDWParser#rhs_list}.
	 * @param ctx the parse tree
	 */
	void enterRhs_list(PowerBuilderDWParser.Rhs_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderDWParser#rhs_list}.
	 * @param ctx the parse tree
	 */
	void exitRhs_list(PowerBuilderDWParser.Rhs_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderDWParser#lhs}.
	 * @param ctx the parse tree
	 */
	void enterLhs(PowerBuilderDWParser.LhsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderDWParser#lhs}.
	 * @param ctx the parse tree
	 */
	void exitLhs(PowerBuilderDWParser.LhsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderDWParser#rhs}.
	 * @param ctx the parse tree
	 */
	void enterRhs(PowerBuilderDWParser.RhsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderDWParser#rhs}.
	 * @param ctx the parse tree
	 */
	void exitRhs(PowerBuilderDWParser.RhsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderDWParser#prop_value}.
	 * @param ctx the parse tree
	 */
	void enterProp_value(PowerBuilderDWParser.Prop_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderDWParser#prop_value}.
	 * @param ctx the parse tree
	 */
	void exitProp_value(PowerBuilderDWParser.Prop_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderDWParser#table_decl}.
	 * @param ctx the parse tree
	 */
	void enterTable_decl(PowerBuilderDWParser.Table_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderDWParser#table_decl}.
	 * @param ctx the parse tree
	 */
	void exitTable_decl(PowerBuilderDWParser.Table_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderDWParser#data_storage}.
	 * @param ctx the parse tree
	 */
	void enterData_storage(PowerBuilderDWParser.Data_storageContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderDWParser#data_storage}.
	 * @param ctx the parse tree
	 */
	void exitData_storage(PowerBuilderDWParser.Data_storageContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderDWParser#table_column}.
	 * @param ctx the parse tree
	 */
	void enterTable_column(PowerBuilderDWParser.Table_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderDWParser#table_column}.
	 * @param ctx the parse tree
	 */
	void exitTable_column(PowerBuilderDWParser.Table_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderDWParser#column_type}.
	 * @param ctx the parse tree
	 */
	void enterColumn_type(PowerBuilderDWParser.Column_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderDWParser#column_type}.
	 * @param ctx the parse tree
	 */
	void exitColumn_type(PowerBuilderDWParser.Column_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderDWParser#retrieve}.
	 * @param ctx the parse tree
	 */
	void enterRetrieve(PowerBuilderDWParser.RetrieveContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderDWParser#retrieve}.
	 * @param ctx the parse tree
	 */
	void exitRetrieve(PowerBuilderDWParser.RetrieveContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderDWParser#update_clause}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_clause(PowerBuilderDWParser.Update_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderDWParser#update_clause}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_clause(PowerBuilderDWParser.Update_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderDWParser#procedure}.
	 * @param ctx the parse tree
	 */
	void enterProcedure(PowerBuilderDWParser.ProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderDWParser#procedure}.
	 * @param ctx the parse tree
	 */
	void exitProcedure(PowerBuilderDWParser.ProcedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderDWParser#argument_clause}.
	 * @param ctx the parse tree
	 */
	void enterArgument_clause(PowerBuilderDWParser.Argument_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderDWParser#argument_clause}.
	 * @param ctx the parse tree
	 */
	void exitArgument_clause(PowerBuilderDWParser.Argument_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderDWParser#argument_attribute}.
	 * @param ctx the parse tree
	 */
	void enterArgument_attribute(PowerBuilderDWParser.Argument_attributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderDWParser#argument_attribute}.
	 * @param ctx the parse tree
	 */
	void exitArgument_attribute(PowerBuilderDWParser.Argument_attributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderDWParser#sort_clause}.
	 * @param ctx the parse tree
	 */
	void enterSort_clause(PowerBuilderDWParser.Sort_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderDWParser#sort_clause}.
	 * @param ctx the parse tree
	 */
	void exitSort_clause(PowerBuilderDWParser.Sort_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderDWParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(PowerBuilderDWParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderDWParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(PowerBuilderDWParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderDWParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(PowerBuilderDWParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderDWParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(PowerBuilderDWParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderDWParser#data_type_sub}.
	 * @param ctx the parse tree
	 */
	void enterData_type_sub(PowerBuilderDWParser.Data_type_subContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderDWParser#data_type_sub}.
	 * @param ctx the parse tree
	 */
	void exitData_type_sub(PowerBuilderDWParser.Data_type_subContext ctx);
	/**
	 * Enter a parse tree produced by {@link PowerBuilderDWParser#data_type_name}.
	 * @param ctx the parse tree
	 */
	void enterData_type_name(PowerBuilderDWParser.Data_type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PowerBuilderDWParser#data_type_name}.
	 * @param ctx the parse tree
	 */
	void exitData_type_name(PowerBuilderDWParser.Data_type_nameContext ctx);
}