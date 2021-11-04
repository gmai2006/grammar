package com.datascience9.postgres.parse;

import com.datascience9.postgres.PostgresHelper;
import java.io.InputStream;
import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.tree.ParseTree;

public class ParserTest {
  public static void main(String[] args) {
    InputStream in = ParserTest.class.getResourceAsStream("/postgres/alter_table.sql");
    PostgreSQLParser parser = PostgresHelper.getParser(in);
    ParseTree tree = parser.root();
    Trees.inspect(tree, parser);
  }
}
