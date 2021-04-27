package com.datascience9.pb;

import com.datascience9.pb.parse.PowerBuilderLexer;
import com.datascience9.pb.parse.PowerBuilderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Pattern;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class PbHelper {
  public static final Pattern DATE_PATTERN = Pattern.compile("[0-9]{4}-[0-9]{2}-[0-9]{2}");
  public static final Pattern TIME_PATTERN = Pattern.compile("[0-9]{2}:[0-9]{2}:[0-9]{2}");
  public static final Pattern DATETIME_PATTERN = Pattern.compile("DATETIME[(][0-9]{4}-[0-9]{2}-[0-9]{2},[0-9]{2}:[0-9]{2}:[0-9]{2}[)]");

  public static String convertPbDate2JsDate(String val) {
    return "new Date(" + val.replace("-", ",") + ")";
  }

  public static String convertPbTime2JsDate(String val) {
    return "new Date(1900,01,01," + val.replace(":", ",") + ")";
  }

  public static String convertPbDateTime2JsDate(String val) {
    return "new Date" + val.replace("DATETIME", "")
        .replace("-", ",")
        .replace(":", ",");
  }

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

  /**
   * Check if the meta file is enum.
   * @param path - the source.
   * @return true if it is enum.  Otherwise, return false.
   */
  public static boolean isEnumFile(Path path) {
    String content = readFile(path);
    return (content.contains("enumerated"));
  }

  /**
   * Map variables whose name is reserved keywords.
   * @param s
   * @return
   */
  public static String mapReservedKeywords(String s) {
    switch (s) {
      case "default":
        return "default1";
      case "boolean":
        return "boolean1";
      case "integer":
        return "integer1";
      case "double":
        return "double1";
      case "long":
        return "long1";
      case "private":
        return "private1";
      case "public":
        return "public1";
      case "protected":
        return "protected1";
      case "new":
        return "new1";
      case "class":
        return "class1";
      case "byte":
        return "byte1";
      case "int":
        return "int1";
      case "char":
        return "char1";
      default:
        return s.replace("[", "").replace("]", "").replace("!", "");
    }
  }

  private static String readFile(Path path) {
    byte[] encoded = new byte[0];
    try {
      encoded = Files.readAllBytes(path);
    } catch (IOException ioException) {
      ioException.printStackTrace();
    }
    return new String(encoded, Charset.defaultCharset());
  }
}
