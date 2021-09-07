package com.datascience9.pb.parse;

import com.datascience9.pb.PbHelper;
import java.io.InputStream;
import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.tree.ParseTree;

public class PbParserTest {
  public static void main(String[] args) throws Exception {
    InputStream in = PbParserTest.class.getResourceAsStream("/pb/misth_kratapod_desckratapod.srf");
    PowerBuilderParser parser = PbHelper.getParser(in);
    ParseTree tree = parser.start_rule();
    Trees.inspect(tree, parser);
  }
}
