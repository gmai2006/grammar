package com.datascience9.pb.dw.parse;

import com.datascience9.pb.dw.DataWindowParserHelper;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;
import org.antlr.v4.runtime.CharStreams;

public class DataWindowParserTestIt {
  public static void main(String[] args) throws Exception {
    final Path dir = Paths.get("./test_files");
    testAllFiles(dir);
    try (Stream<Path> paths = Files.walk(dir, 2)) {
      System.out.printf("Tested %s files.", paths.filter(f -> f.toString().endsWith(".srd")).count());
    }
  }

  private static void testAllFiles(Path dir) throws IOException {
    try (Stream<Path> paths = Files.walk(dir, 2)) {
      paths.filter(f -> f.toString().endsWith(".srd"))
          .forEach(DataWindowParserTestIt::testParser);
    }
  }

  private static void testParser(Path file) {
    System.out.println("Parsing ... " + file);
    try {
      PowerBuilderDWParser parser = DataWindowParserHelper.getDataWindowParser(CharStreams.fromPath(file));
      parser.start_rule();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
