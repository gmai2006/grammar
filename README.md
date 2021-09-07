# grammar
ANTLR4 PowerBuilder & DataWindow grammars

## PowerBuilder
- Add a grammar that parse comments
- Fixed the ambiguous HEADER.  Put it into the hidden channel
- Fixed the function call statement that should accept argument types (string literal, primitive data types)
- Simplify the grammar.  Boolean expression is a expression, not the other way around like the implemetation of the version 3 and the ported version.  The generated parse tree should be shorter and clean.
- Add different types of function calls
- Add more test files to unit test
- Add support for embedded SQL
- Add try-catch

## DataWindow
Tested against 120 DataWindow files.
Test files are from [this project](https://github.com/gmai2006/powerbuilder-pbl-dump/tree/master/test)

## MySql
- Support mix case.  No need to use ChangeCase any more
- Add BIND_VAR to handle plSql :<variable_name>
- Test against more 100 Sql files
- Resolve the expression issue with minus minus  condition #1525 (https://github.com/antlr/grammars-v4/issues/1525)
