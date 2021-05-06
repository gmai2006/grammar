package com.datascience9.sql.parse;

import com.datascience9.mysql.MySqlHelper;
import com.datascience9.mysql.parse.MySqlParser;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.antlr.v4.runtime.BailErrorStrategy;

public class MySqlParserTestIt {
  public static void main(String[] args) throws Exception {
    final Path dir = Paths.get("./sql_test_files");
    Predicate<Path> filtered = path -> Files.isRegularFile(path) && path.toString().endsWith(".sql");
    testAllFiles(dir, filtered);
    try (Stream<Path> paths = Files.walk(dir, 2)) {
      System.out.printf("Tested %s files.", paths.filter(filtered).count());
    }
  }

  private static void testAllFiles(Path dir, Predicate<Path> filtered) throws IOException {
    try (Stream<Path> paths = Files.walk(dir, 2)) {
      paths.filter(filtered).sorted().collect(Collectors.toList()).forEach(MySqlParserTestIt::testParser);
    }
  }

  private static void testParser(Path file) {
    System.out.println("Parsing ... " + file);
    MySqlParser parser = MySqlHelper.getMySqlParser(file);
    parser.setErrorHandler(new BailErrorStrategy());
    parser.root();
  }
}
