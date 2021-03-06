package com.datascience9.pb.parse;

import com.datascience9.pb.PbHelper;
import java.io.IOException;
import java.io.InputStream;
import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Test;

public class ParserFragmentTest {
  @Test
  public void testEventBody() throws IOException {
    InputStream in = PbParserTest.class.getResourceAsStream("/pb/test_event.txt");
    PowerBuilderParser parser = PbHelper.getParser(in);
    parser.setErrorHandler(new BailErrorStrategy());
    parser.event_body();
  }

  @Test
  public void testFunctionCallStmt() throws IOException {
    InputStream in = PbParserTest.class.getResourceAsStream("/pb/test_functionCall.txt");
    PowerBuilderParser parser = PbHelper.getParser(in);
    parser.setErrorHandler(new BailErrorStrategy());
    parser.function_call_statement();
  }

  @Test
  public void testSimpleIfStmt() throws IOException {
    InputStream in = PbParserTest.class.getResourceAsStream("/pb/test_simple_if.txt");
    PowerBuilderParser parser = PbHelper.getParser(in);
    parser.setErrorHandler(new BailErrorStrategy());
    parser.statement();
  }

  @Test
  public void testLexer() {
    InputStream in = PbParserTest.class.getResourceAsStream("/pb/test_string.txt");
    try {
      PowerBuilderLexer lexer = PbHelper.getLexer(in);
      CommonTokenStream tokens = new CommonTokenStream(lexer);
      tokens.fill();
      tokens.getTokens().forEach(token -> System.out.println(token.getText()));
    } catch (IOException ioException) {
      ioException.printStackTrace();
    }
  }
}
