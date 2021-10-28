package com.datascience9.postgres;

import com.datascience9.postgres.parse.PostgreSQLLexer;
import com.datascience9.postgres.parse.PostgreSQLParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class PostgresHelper {

  public static PostgreSQLLexer getLexer(String query) {
    CharStream s = CharStreams.fromString(query);
    return new PostgreSQLLexer(s);
  }

  public static PostgreSQLLexer getLexer(Path path) {
    CharStream s = null;
    try {
      s = CharStreams.fromPath(path);
    } catch (IOException e) {
      e.printStackTrace();
    }
    return new PostgreSQLLexer(s);
  }

  public static PostgreSQLLexer getLexer(InputStream in) {
    CharStream s = null;
    try {
      s = CharStreams.fromStream(in);
    } catch (IOException e) {
      e.printStackTrace();
    }
    return new PostgreSQLLexer(s);
  }

  public static PostgreSQLParser getParser(String query) {
    CommonTokenStream tokens = new CommonTokenStream(getLexer(query));
    return new PostgreSQLParser(tokens);
  }

  public static PostgreSQLParser getParser(Path path) {
    CommonTokenStream tokens = new CommonTokenStream(getLexer(path));
    return new PostgreSQLParser(tokens);
  }

  public static PostgreSQLParser getParser(InputStream in) {
    CommonTokenStream tokens = new CommonTokenStream(getLexer(in));
    return new PostgreSQLParser(tokens);
  }
}
