

parser grammar PowerBuilderDWParser;

options {
tokenVocab = PowerBuilderDWLexer;
}

start_rule
  : (RELEASE NUMBER SEMI)? window_property* table_decl? (data_window_property | window_property)* EOF
  ;

data_window_property : DATA LPAREN rhs_list RPAREN;

window_property : identifier LPAREN (prop)* RPAREN;

prop
  : lhs EQ rhs_list;

rhs_list: LPAREN rhs_list RPAREN | rhs (COMMA (rhs)? )*;

lhs : identifier | UPDATE;

rhs : LPAREN rhs RPAREN | NUMBER | prop_value | UPDATE |  ANY | COLUMN | DQUOTED_STRING | DATE;

prop_value
  : ID ( (DOT)? (NUMBER | ID) )*
  ;

table_decl
  : TABLE LPAREN (table_column)+ (retrieve | procedure | sort_clause | data_storage| update_clause)*  RPAREN
  ;

data_storage
: DATA DOT STORAGE EQ ID
;

table_column
  : COLUMN EQ LPAREN column_type (prop)* RPAREN
  ;

column_type
  : TYPE EQ data_type_name  ( LPAREN value RPAREN )?
  ;

retrieve
  : RETRIEVE EQ DQUOTED_STRING  (update_clause)? (argument_clause)* (sort_clause)*
  ;

update_clause : lhs EQ rhs (prop)*;

procedure
  : PROCEDURE EQ DQUOTED_STRING (prop)* (argument_clause)* (sort_clause)*
  ;

argument_clause
  : ARGUMENTS EQ LPAREN argument_attribute (COMMA argument_attribute)* RPAREN
  ;

argument_attribute
  : LPAREN DQUOTED_STRING COMMA data_type_name RPAREN
  ;

sort_clause
  : SORT EQ DQUOTED_STRING
  ;

value: (NUMBER)+;

identifier
    :   ID (NUMBER)*
    |   ID UNDERSCORE ID
    |   ID ( DOT ID )+
    | COLUMN
    | DATA
    ;

data_type_sub
    : ANY
       | BLOB
       | BOOLEAN
       | BYTE
       | CHARACTER
       | CHAR
       | DATE_TYPE
       | DATETIME
       | DECIMAL
       | DEC
       | DOUBLE
       | INTEGER
       | INT
       | LONG
       | LONGLONG
       | NUMBERTYPE
       | REAL
       | STRING
       | TIME_TYPE
       | UNSIGNEDINTEGER
       | UINT
       | UNSIGNEDLONG
       | ULONG
       | WINDOW
       ;

data_type_name
    : data_type_sub
    | ID
    ;
