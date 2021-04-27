package com.datascience9.pb.parse;

import com.datascience9.pb.PbHelper;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.DefaultErrorStrategy;

public class ParserTestIt {
  public static void main(String[] args) throws Exception {
    final Path dir = Paths.get("./test_files");
    Predicate<Path> filtered = path -> Files.isRegularFile(path)
        && !path.toString().endsWith(".srd")
        && !path.toString().endsWith(".srm")
        && !path.toString().endsWith(".srj");
    testAllFiles(dir, filtered);
    try (Stream<Path> paths = Files.walk(dir, 2)) {
      System.out.printf("Tested %s files.", paths.filter(filtered).count());
    }
  }

  private static void testAllFiles(Path dir, Predicate<Path> filtered) throws IOException {
    try (Stream<Path> paths = Files.walk(dir, 2)) {
      paths.filter(filtered).sorted().collect(Collectors.toList()).forEach(ParserTestIt::testParser);
    }
  }

  private static void testParser(Path file) {
    System.out.println("Parsing ... " + file);
    try {
      PowerBuilderParser parser = PbHelper.getParser(CharStreams.fromPath(file));
      parser.setErrorHandler(new BailErrorStrategy());
      parser.start_rule();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
