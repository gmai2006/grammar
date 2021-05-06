package com.datascience9.sql.parse;

import com.datascience9.mysql.MySqlHelper;
import com.datascience9.mysql.parse.MySqlLexer;
import org.antlr.v4.runtime.Token;

public class MySqlLexerTest {
	public static void main(String[] args) {
		final String query = "select  misth_zpepidom.descepidom, misth_final_ypal_epidom.poso, misth_final_ypal_epidom.notes, sum"
				+ "(misth_final_ypal_epidom.poso) as sum_poso from misth_final_ypal_epidom, misth_zpepidom, misth_final, misth_final_ypal join misth_final_ypal_epidom on misth_final_ypal_epidom.kodepidom = misth_zpepidom.kodepidom join misth_final_ypal_epidom on misth_final_ypal_epidom.kodxrisi = misth_zpepidom.kodxrisi join misth_final_ypal on misth_final_ypal.kodfinal = misth_final_ypal_epidom.kodfinal join misth_final_ypal on misth_final_ypal.kodypal = misth_final_ypal_epidom.kodypal join misth_final_ypal on misth_final_ypal.kodxrisi = misth_final_ypal_epidom.kodxrisi join misth_final on misth_final.kodfinal = misth_final_ypal.kodfinal join misth_final on misth_final.kodxrisi = misth_final_ypal.kodxrisi where misth_final_ypal_epidom.kodxrisi = :arg_kodxrisi and misth_final_ypal_epidom.kodypal = :arg_kodypal and misth_final_ypal.plirdate >= :arg_fromdate and misth_final_ypal.plirdate <= :arg_todate  order by misth_final_ypal_epidom.aa ASC";
		final MySqlLexer lexer = MySqlHelper.getMySqlLexer(query);
		for (Token token = lexer.nextToken(); token.getType() != Token.EOF; token = lexer.nextToken()) {
			System.out.println(token);
		}
	}
}