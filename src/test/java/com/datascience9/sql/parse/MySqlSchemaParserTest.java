package com.datascience9.sql.parse;

import com.datascience9.mysql.MySqlHelper;
import com.datascience9.mysql.parse.MySqlParser;
import java.util.logging.Logger;
import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.tree.ParseTree;

public class MySqlSchemaParserTest {
	private final static Logger logger = Logger.getLogger(MySqlSchemaParserTest.class.getName());

	public static void main(String[] args) throws Exception {
		runFromResource("/sql/openpay101.sql");
	}

	private static void runFromResource(String path) {
		MySqlParser parser = MySqlHelper.getMySqlParser(MySqlSchemaParserTest.class.getResourceAsStream(path));
		ParseTree tree = parser.root();
		Trees.inspect(tree, parser);
	}
}