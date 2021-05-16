// Generated from ./src/main/java/com/datascience9/pb/datawindow/parse/PowerBuilderDWParser.g4 by ANTLR 4.9.2
package com.datascience9.pb.datawindow.parse;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PowerBuilderDWParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PowerBuilderDWParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PowerBuilderDWParser#start_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart_rule(PowerBuilderDWParser.Start_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderDWParser#data_window_property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_window_property(PowerBuilderDWParser.Data_window_propertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderDWParser#window_property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_property(PowerBuilderDWParser.Window_propertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderDWParser#prop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProp(PowerBuilderDWParser.PropContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderDWParser#rhs_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRhs_list(PowerBuilderDWParser.Rhs_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderDWParser#lhs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLhs(PowerBuilderDWParser.LhsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderDWParser#rhs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRhs(PowerBuilderDWParser.RhsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderDWParser#prop_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProp_value(PowerBuilderDWParser.Prop_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderDWParser#table_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_decl(PowerBuilderDWParser.Table_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderDWParser#data_storage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_storage(PowerBuilderDWParser.Data_storageContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderDWParser#table_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_column(PowerBuilderDWParser.Table_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderDWParser#column_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_type(PowerBuilderDWParser.Column_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderDWParser#retrieve}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetrieve(PowerBuilderDWParser.RetrieveContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderDWParser#update_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_clause(PowerBuilderDWParser.Update_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderDWParser#procedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure(PowerBuilderDWParser.ProcedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderDWParser#argument_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument_clause(PowerBuilderDWParser.Argument_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderDWParser#argument_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument_attribute(PowerBuilderDWParser.Argument_attributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderDWParser#sort_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSort_clause(PowerBuilderDWParser.Sort_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderDWParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(PowerBuilderDWParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderDWParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(PowerBuilderDWParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderDWParser#data_type_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_type_sub(PowerBuilderDWParser.Data_type_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link PowerBuilderDWParser#data_type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_type_name(PowerBuilderDWParser.Data_type_nameContext ctx);
}