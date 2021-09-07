package com.datascience9.pb.datawindow;

import com.datascience9.pb.datawindow.parse.PowerBuilderDWLexer;
import com.datascience9.pb.datawindow.parse.PowerBuilderDWParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class DataWindowParserHelper {

  private DataWindowParserHelper() {}

  public static PowerBuilderDWLexer getDataWindowLexer(Path path) throws IOException {
    try {
      CharStream s = CharStreams.fromPath(path);
      return new PowerBuilderDWLexer(s);
    } catch (IOException ex) {
      throw new IOException(ex);
    }
  }

  public static PowerBuilderDWLexer getDataWindowLexer(InputStream in) throws IOException {
    try {
      CharStream s = CharStreams.fromStream(in);
      return new PowerBuilderDWLexer(s);
    } catch (IOException ex) {
      throw new IOException(ex);
    }
  }

  public static PowerBuilderDWLexer getDataWindowLexer(CharStream s) {
    return new PowerBuilderDWLexer(s);
  }


  public static PowerBuilderDWParser getDataWindowParser(Path path) throws IOException {
    try {
      CommonTokenStream tokens = new CommonTokenStream(getDataWindowLexer(path));
      return new PowerBuilderDWParser(tokens);
    } catch (IOException ex) {
      throw new IOException(ex);
    }
  }

  public static PowerBuilderDWParser getDataWindowParser(InputStream in) throws IOException {
    try {
      CommonTokenStream tokens = new CommonTokenStream(getDataWindowLexer(in));
      return new PowerBuilderDWParser(tokens);
    } catch (IOException ex) {
      throw new IOException(ex);
    }
  }

  public static PowerBuilderDWParser getDataWindowParser(CharStream s) {
    CommonTokenStream tokens = new CommonTokenStream(getDataWindowLexer(s));
    return new PowerBuilderDWParser(tokens);
  }
}
