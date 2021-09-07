package com.datascience9.pb;

import com.datascience9.pb.parse.PowerBuilderWithCommentLexer;
import com.datascience9.pb.parse.PowerBuilderWithCommentParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class PbWithCommentHelper {

  private PbWithCommentHelper() {}

  public static PowerBuilderWithCommentLexer getLexer(Path path) throws IOException {
    try {
      CharStream s = CharStreams.fromPath(path);
      return new PowerBuilderWithCommentLexer(s);
    } catch (IOException ex) {
      throw new IOException(ex);
    }
  }

  public static PowerBuilderWithCommentLexer getLexer(InputStream in) throws IOException {
    try {
      CharStream s = CharStreams.fromStream(in);
      return new PowerBuilderWithCommentLexer(s);
    } catch (IOException ex) {
      throw new IOException(ex);
    }
  }

  public static PowerBuilderWithCommentLexer getLexer(String str) {
      return new PowerBuilderWithCommentLexer(CharStreams.fromString(str));

  }

  public static PowerBuilderWithCommentLexer getLexer(CharStream s) {
    return new PowerBuilderWithCommentLexer(s);
  }


  public static PowerBuilderWithCommentParser getParser(Path path) throws IOException {
    try {
      CommonTokenStream tokens = new CommonTokenStream(getLexer(path));
      return new PowerBuilderWithCommentParser(tokens);
    } catch (IOException ex) {
      throw new IOException(ex);
    }
  }

  public static PowerBuilderWithCommentParser getParser(InputStream in) throws IOException {
    try {
      CommonTokenStream tokens = new CommonTokenStream(getLexer(in));
      return new PowerBuilderWithCommentParser(tokens);
    } catch (IOException ex) {
      throw new IOException(ex);
    }
  }

  public static PowerBuilderWithCommentParser getParser(CharStream s) {
    CommonTokenStream tokens = new CommonTokenStream(getLexer(s));
    return new PowerBuilderWithCommentParser(tokens);
  }
}
