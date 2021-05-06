package com.datascience9.mysql;

import com.datascience9.mysql.parse.MySqlLexer;
import com.datascience9.mysql.parse.MySqlParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class MySqlHelper {

  public static MySqlLexer getMySqlLexer(String query) {
    CharStream s = CharStreams.fromString(query);
    return new MySqlLexer(s);
  }

  public static MySqlLexer getMySqlLexer(Path path) {
    CharStream s = null;
    try {
      s = CharStreams.fromPath(path);
    } catch (IOException e) {
      e.printStackTrace();
    }
    return new MySqlLexer(s);
  }

  public static MySqlLexer getMySqlLexer(InputStream in) {
    CharStream s = null;
    try {
      s = CharStreams.fromStream(in);
    } catch (IOException e) {
      e.printStackTrace();
    }
    return new MySqlLexer(s);
  }

  public static MySqlParser getMySqlParser(String query) {
    CommonTokenStream tokens = new CommonTokenStream(getMySqlLexer(query));
    return new MySqlParser(tokens);
  }

  public static MySqlParser getMySqlParser(Path path) {
    CommonTokenStream tokens = new CommonTokenStream(getMySqlLexer(path));
    return new MySqlParser(tokens);
  }

  public static MySqlParser getMySqlParser(InputStream in) {
    CommonTokenStream tokens = new CommonTokenStream(getMySqlLexer(in));
    return new MySqlParser(tokens);
  }
}
