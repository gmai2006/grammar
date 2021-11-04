# grammar
ANTLR4 PowerBuilder, DataWindow, MySql, and PostgreSQL grammars

## PowerBuilder
There are two versions of PB: (1) general and (2) grammar that supports comments extraction.

To generate parser and lexer for PB no support for comment run: **gradle generatePb**
To generate parser and lexer for PB that supports comment run: **gradle generatePbWithComment**
To test all run: gradle **testPb**
To test all run: gradle **testPbWithComments**

- Add a grammar that parse comments
- Fixed the ambiguous HEADER.  Put it into the hidden channel
- Fixed the function call statement that should accept argument types (string literal, primitive data types)
- Simplify the grammar.  Boolean expression is a expression, not the other way around like the implemetation of the version 3 and the ported version.  The generated parse tree should be shorter and clean.
- Add different types of function calls
- Add more test files to unit test
- Add support for embedded SQL
- Add try-catch
- Add comments

## DataWindow
To generate parser and lexer run: **gradle generatePostgres**
Tested against 120 DataWindow files.
Test files are from [this project](https://github.com/gmai2006/powerbuilder-pbl-dump/tree/master/test)

## MySql
To generate parser and lexer run: **gradle generateMySql**
To test all run: gradle **testMySql**
- Support mix case.  No need to use ChangeCase any more
- Add BIND_VAR to handle plSql :<variable_name>
- Test against more 100 Sql files
- Resolve the expression issue with minus minus  condition #1525 (https://github.com/antlr/grammars-v4/issues/1525)
# PostgreSQL
To generate parser and lexer run: **gradle generatePostgres**
To test all run: gradle **testPostgres**
- A modified version from the ANTLR4 repo, which should be language agnostic
- Replace all recursive rules with iterative rules (list: list item => item+) => reduce the parsetree size
- Replace or epsilon rules with optional => remove all the empty node on the parse tree
- Add a base class for the Lexer per kaby76
