package com.datascience9.postgres.parse;

import com.datascience9.postgres.PostgresHelper;
import java.io.InputStream;
import java.util.List;
import org.antlr.v4.runtime.Token;

public class LexerTest {
  public static void main(String[] args) throws Exception {
    InputStream in = LexerTest.class.getResourceAsStream("/postgres/brin.sql");
    PostgreSQLLexer lexer = PostgresHelper.getLexer(in);
    List<? extends Token> tokens = lexer.getAllTokens();
    tokens.forEach(System.out::println);
  }
}
