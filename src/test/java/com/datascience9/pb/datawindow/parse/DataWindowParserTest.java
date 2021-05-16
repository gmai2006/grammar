package com.datascience9.pb.datawindow.parse;

import com.datascience9.pb.datawindow.DataWindowParserHelper;
import java.io.IOException;
import java.io.InputStream;
import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Test;

public class DataWindowParserTest {
  public static void main(String[] args) throws Exception {
    InputStream in = DataWindowParserTest.class.getResourceAsStream("/datawindow/sprn_analisi_krat_foros.srd");
    PowerBuilderDWParser parser = DataWindowParserHelper.getDataWindowParser(in);
    ParseTree tree = parser.start_rule();
    Trees.inspect(tree, parser);
  }

  @Test
  public void testLexer() {
    InputStream in = DataWindowParserTest.class.getResourceAsStream("/datawindow/sprn_analisi_krat_foros.srd");
    try {
      PowerBuilderDWLexer lexer = DataWindowParserHelper.getDataWindowLexer(in);
      CommonTokenStream tokens = new CommonTokenStream(lexer);
      tokens.fill();

      for (Token token : tokens.getTokens()) {
        System.out.println(token.getText());
      }
    } catch (IOException ioException) {
      ioException.printStackTrace();
    }

  }
}
