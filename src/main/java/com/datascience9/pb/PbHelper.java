package com.datascience9.pb;

import com.datascience9.pb.parse.PowerBuilderLexer;
import com.datascience9.pb.parse.PowerBuilderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.util.regex.Pattern;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class PbHelper {
  public static PowerBuilderLexer getLexer(Path path) throws IOException {
    try {
      CharStream s = CharStreams.fromPath(path);
      return new PowerBuilderLexer(s);
    } catch (IOException ex) {
      throw new IOException(ex);
    }
  }

  public static PowerBuilderLexer getLexer(InputStream in) throws IOException {
    try {
      CharStream s = CharStreams.fromStream(in);
      return new PowerBuilderLexer(s);
    } catch (IOException ex) {
      throw new IOException(ex);
    }
  }

  public static PowerBuilderLexer getLexer(String str) {
      return new PowerBuilderLexer(CharStreams.fromString(str));

  }

  public static PowerBuilderLexer getLexer(CharStream s) {
    return new PowerBuilderLexer(s);
  }


  public static PowerBuilderParser getParser(Path path) throws IOException {
    try {
      CommonTokenStream tokens = new CommonTokenStream(getLexer(path));
      return new PowerBuilderParser(tokens);
    } catch (IOException ex) {
      throw new IOException(ex);
    }
  }

  public static PowerBuilderParser getParser(InputStream in) throws IOException {
    try {
      CommonTokenStream tokens = new CommonTokenStream(getLexer(in));
      return new PowerBuilderParser(tokens);
    } catch (IOException ex) {
      throw new IOException(ex);
    }
  }

  public static PowerBuilderParser getParser(CharStream s) {
    CommonTokenStream tokens = new CommonTokenStream(getLexer(s));
    return new PowerBuilderParser(tokens);
  }
}
