/*
BSD License
Copyright (c) 2018, Tom Everett
All rights reserved.
Redistribution and use in source and binary forms, with or without
modification, are permitted provided that the following conditions
are met:
1. Redistributions of source code must retain the above copyright
   notice, this list of conditions and the following disclaimer.
2. Redistributions in binary form must reproduce the above copyright
   notice, this list of conditions and the following disclaimer in the
   documentation and/or other materials provided with the distribution.
3. Neither the name of Tom Everett nor the names of its contributors
   may be used to endorse or promote products derived from this software
   without specific prior written permission.
THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
"AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
(INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/

parser grammar PowerBuilderParser;

options { tokenVocab = PowerBuilderLexer; }

start_rule
   : (RELEASE NUMBER SEMI)? body_rule+ EOF
   ;

body_rule
   : datatype_decl
   | access_modif
   | forward_decl
   | type_variables_decl
   | global_variables_decl
   | variable_decl
   | constant_decl
   | function_forward_decl
   | functions_forward_decl
   | function_body
   | on_body
   | event_body
   ;

window_property
   : attribute_name array_decl_sub? LPAREN window_property_attribute_sub* RPAREN
   ;

window_property_attribute_sub
   : ( NULL
     | numeric_atom
     | DQUOTED_STRING
     | DATE
     | TIME
     | attribute_name eq=EQ (attribute_value array_decl_sub? | LPAREN window_property_attribute_sub+ RPAREN)
     ) COMMA?
   ;

attribute_name
   : (identifier_name | TYPE | UPDATE) NUMBER? (DOT (identifier_name | CASE | TYPE | ON | DYNAMIC))*
   ;

attribute_value
   : atom_sub_call1
   | atom_sub_member1
   | MINUS? numeric_atom
   | boolean_atom
   | ENUM
   | DQUOTED_STRING
   | QUOTED_STRING
   | DATE
   | TIME
   | TYPE
   | TO
   | FROM
   | REF
   | NULL
   | OPEN
   | LPAREN LPAREN (expression | dataTypeSub) (COMMA (expression | dataTypeSub))? RPAREN (COMMA LPAREN (expression | dataTypeSub) (COMMA (expression | dataTypeSub))? RPAREN)* RPAREN
   | dataTypeSub (LPAREN NUMBER RPAREN)?
   ;

forward_decl
   : FORWARD (datatype_decl | variable_decl | global_variables_decl)+ END FORWARD
   ;

datatype_decl
   : scope_modif? TYPE identifier_name FROM (identifier_name TICK)? data_type_name (WITHIN identifier_name)? AUTOINSTANTIATE? (DESCRIPTOR DQUOTED_STRING EQ DQUOTED_STRING)?
     (variable_decl | event_forward_decl)*
     END TYPE
   ;
global_type_variables_decl
   : GLOBAL TYPE  variable_name (FROM variable_name)? (variable_decl | public_statement)* END TYPE
   ;

type_variables_decl
   : TYPE VARIABLES (variable_decl | constant_decl | public_statement)* END VARIABLES
   ;

global_variables_decl
   : GLOBAL variable_decl
   | (GLOBAL | SHARED) VARIABLES (variable_decl)* END VARIABLES
   ;

variable_decl
   : access_type? variable_decl_sub SEMI?
   ;

variable_decl_sub
   : data_type_name variable_name (COMMA variable_name)*
   | INDIRECT? access_modif_part? scope_modif?
   variable_decl_sub1 | variable_decl_sub2
   ;

variable_decl_sub1
  : data_type_name assignment_statement (COMMA data_type_name? assignment_statement)*
  ;

variable_decl_sub2
  : data_type_name decimal_decl_sub? identifier_name_ex array_decl_sub ( (EQ)? LCURLY expression_list RCURLY)?
  ;

decimal_decl_sub
   : LCURLY NUMBER RCURLY
   ;

array_decl_sub
   : LBRACE RBRACE
   | LBRACE ((PLUS | MINUS)? NUMBER (TO (PLUS | MINUS)? NUMBER)? (COMMA (PLUS | MINUS)? NUMBER (TO (PLUS | MINUS)? NUMBER)?)*)? RBRACE
   ;

constant_decl_sub
   : CONSTANT variable_decl_sub
   ;

constant_decl
   : constant_decl_sub SEMI?
   ;

function_forward_decl
   : access_modif_part? scope_modif? (FUNCTION data_type_name | SUBROUTINE)
   identifier_name LPAREN parameters_list_sub? RPAREN
   function_forward_decl_alias
   ;

function_forward_decl_alias
  : ALIAS FOR identifier_name LIBRARY (DQUOTED_STRING | QUOTED_STRING)
  | (LIBRARY (DQUOTED_STRING | QUOTED_STRING) (ALIAS FOR (DQUOTED_STRING | QUOTED_STRING))?)?
  | (RPCFUNC ALIAS FOR (DQUOTED_STRING | QUOTED_STRING))? (THROWS identifier_name)?
  ;

parameter_sub
   : READONLY? REF? data_type_name decimal_decl_sub? identifier_name array_decl_sub?
   ;

parameters_list_sub
   : parameter_sub (COMMA parameter_sub)* (COMMA DOTDOTDOT)?
   ;

functions_forward_decl
   : (FORWARD | TYPE) PROTOTYPES function_forward_decl+ END PROTOTYPES
   ;

function_body
   : access_type? scope_modif? (FUNCTION data_type_name | SUBROUTINE) identifier_name LPAREN parameters_list_sub? RPAREN (THROWS identifier_name)?
   (SEMI)? (statement SEMI?)* END (FUNCTION | SUBROUTINE)
   ;

on_body
   : ON identifier (DOT (CREATE | DESTROY) | OPEN | CLOSE)? SEMI? (statement SEMI?)* END ON
   ;

event_forward_decl
   : EVENT (identifier_name | CREATE | DESTROY) identifier_name? (LPAREN parameters_list_sub? RPAREN)?
   | EVENT TYPE data_type_name identifier_name (LPAREN parameters_list_sub? RPAREN)
   ;

event_body
   : EVENT (TYPE data_type_name)? (identifier_name COLONCOLON)? (identifier_name | OPEN | CLOSE) (LPAREN parameters_list_sub? RPAREN)? SEMI
   (statement SEMI?)* END EVENT
   ;

access_type
   : PUBLIC
   | PRIVATE
   | PROTECTED
   ;

access_modif
   : access_type ':'
   ;

access_modif_part
   : PUBLIC
   | PRIVATE
   | PRIVATEREAD
   | PRIVATEWRITE
   | PROTECTED
   | PROTECTEDREAD
   | PROTECTEDWRITE
   ;

scope_modif
   : GLOBAL
   | LOCAL
   ;

expression
   : close_call_sub
   | value
   | variable_name
   | LCURLY (variable_name | value) (COMMA (variable_name | value))*  RCURLY
   | expression (PLUS | MINUS | MULT | DIV | CARAT) expression
   | LPAREN expression RPAREN
   | boolean_expression
   ;

value
  : string_literal
   | ENUM
   | NUMBER
   | TRUE
   | FALSE
  ;

expression_list
   : REF? expression (COMMA REF? expression)*
   ;

boolean_expression
   : unary_sign_expr
   | mul_expr
   | add_expr
   | condition_comparison
   | condition_not
   | condition_and
   | condition_or
   | LPAREN boolean_expression RPAREN
   ;

condition_or
   : condition_and (OR condition_and)*
   | LPAREN condition_or RPAREN
   ;

condition_and
   : condition_not (AND condition_not)*
   | LPAREN condition_and RPAREN
   ;

condition_not
   : NOT? condition_comparison
   | LPAREN condition_not RPAREN
   ;

condition_comparison
   : add_expr ((EQ | GT | LT | GTLT | GTE | LTE) add_expr)?
   | LPAREN condition_comparison RPAREN
   ;

add_expr
   : mul_expr ((MINUS | PLUS) mul_expr)*
   | LPAREN add_expr RPAREN
   ;

mul_expr
   : unary_sign_expr ((MULT | DIV | CARAT) unary_sign_expr)*
   | LPAREN mul_expr RPAREN
   ;

unary_sign_expr
   : (MINUS | PLUS)? (COLON? variable_name | value)
   | function_call_statement
   | LCURLY function_call_statement RCURLY
   | LPAREN unary_sign_expr RPAREN
   | set_value
   ;

statement
   : increment_decrement_statement
   | public_statement
   | if_simple_statement
   | execute_statement
   | DESCRIBE identifier_name
   | assignment_statement
   | try_catch_statement
   | close_sql_statement
   | statement_sub
   | if_statement
   | post_event
   | function_call_statement
   | super_call_statement
   | event_call_statement
   | declare_procedure_statement
   | constant_decl
   | variable_decl
   | super_call_statement
   | do_loop_while_statement
   | do_while_loop_statement
   | create_call_statement
   | destroy_call_statement
   | label_stat
   | throw_stat
   | goto_stat
   | choose_statement
   | return_statement
   | for_loop_statement
   | continue_statement
   | exit_statement
   | sql_insert_statement
   | sql_delete_statement
   | sql_select_statement
   | sql_commit_statement
   | sql_update_statement
   | open_cursor_statement
   | prepare_sql_stateent
   | declare_cursor_statement
   | close_cursor_statement
   | sql_connect_statement
   | fetch_into_statement
   | call_statement
   ;

public_statement
  : (PUBLIC | PROTECTED | PRIVATE) COLON
  ;

statement_sub
   : function_virtual_call_expression_sub
   | function_call_expression_sub
   | return_statement
   | open_call_sub
   | close_call_sub
   | variable_decl_sub
   | super_call_statement
   | create_call_sub
   | destroy_call_sub
   | continue_sub
   | goto_stat
   | assignment_statement
   ;

try_catch_statement
    : TRY
    (statement SEMI?)*
    (
      CATCH LPAREN variable_decl_sub RPAREN
      (statement SEMI?)*
    )*
    (
      FINALLY
      (statement SEMI?)*
    )?
    END TRY
    ;

sql_insert_statement
  : INSERT INTO variable_name LPAREN variable_name (COMMA variable_name)* RPAREN VALUES LPAREN sql_values (COMMA sql_values)* RPAREN SEMI?
  ;

sql_values
  : value
  | COLON variable_name
  ;

sql_delete_statement
  : DELETE FROM variable_name where_clause SEMI?
  ;

sql_select_statement
  : (SELECT | SELECTBLOB) select_clause INTO COLON variable_name (COMMA COLON variable_name)* FROM variable_name (COMMA variable_name)*
  where_clause? (USING variable_name)? SEMI?
  ;

sql_update_statement
  : (UPDATE | UPDATEBLOB) variable_name SET set_value (COMMA set_value)* where_clause?
  ;

 sql_connect_statement
  : (CONNECT | DISCONNECT) USING SQLCA SEMI
  ;

set_value
  : variable_name EQ COLON variable_name
  | variable_name IS NOT? NULL
  ;

where_clause
  : WHERE set_value (COMMA set_value)*
  | WHERE condition_or
  ;

select_clause
  : variable_name (COMMA variable_name)*
  | function_call_statement
  ;

sql_commit_statement
  : COMMIT USING? (SQLCA | variable_name)? SEMI?
  ;

execute_statement
  : EXECUTE variable_name
  | EXECUTE IMMEDIATE COLON variable_name (USING (SQLCA | variable_name))? SEMI
  ;

close_sql_statement
  : CLOSE variable_name SEMI
  ;

declare_procedure_statement
  : DECLARE variable_name PROCEDURE FOR variable_name
  ;

declare_cursor_statement
  : DECLARE variable_name DYNAMIC? CURSOR FOR variable_name SEMI
  ;

open_cursor_statement
  : OPEN DYNAMIC? variable_name
  ;

close_cursor_statement
  : CLOSE variable_name
  ;

fetch_into_statement
  : FETCH variable_name INTO COLON variable_name SEMI?
  ;

prepare_sql_stateent
  : PREPARE variable_name FROM COLON variable_name USING SQLCA SEMI
  ;

increment_decrement_statement
  : variable_name (PLUS PLUS | MINUS MINUS)
  ;

assignment_rhs
  : value
  |expression (COMMA expression)*
  | function_call_statement
  | create_object_function
  | super_call_statement
  | event_call_statement
  ;

assignment_statement
   : AT variable_name EQ COLON variable_name SEMI
   | variable_name (EQ | PLUSEQ | MINUSEQ | MULTEQ | DIVEQ) assignment_rhs SEMI?
   ;

variable_name
  : identifier
  ;

create_object_function
  : CREATE identifier_name
  ;

return_statement
   : RETURN (expression)?
   ;

function_call_expression_sub
   : function_name LPAREN expression_list? RPAREN (DOT function_call_expression_sub)*
   ;

function_name
  : variable_name
  | OPEN
  | CLOSE
  | dataTypeSub
  ;

function_event_call
  : function_name DOT EVENT (POST)? DYNAMIC? function_call_expression_sub
  ;

function_virtual_call_expression_sub
   : identifier_name DOT (DYNAMIC EVENT? | EVENT TRIGGER? DYNAMIC) function_call_expression_sub
   ;

open_call_sub
   : OPEN LPAREN expression_list RPAREN
   ;

close_call_sub
   : CLOSE LPAREN expression_list RPAREN
   | HALT CLOSE
   ;

function_call_statement
   : function_call_expression_sub
   | function_event_call
   | function_virtual_call_expression_sub
   | open_call_sub
   | close_call_sub
   ;

call_statement
  : CALL variable_name (COLONCOLON (CREATE | DESTROY | OPEN | CLOSE | identifier))? SEMI?
  ;

super_call_statement
   : CALL SUPER COLONCOLON (EVENT | CREATE | DESTROY | OPEN | CLOSE | identifier)
   | CALL (identifier_name TICK)? (atom_sub_call1 | atom_sub_member1)
   ;

event_call_statement_sub
   : ((identifier_name DOT (identifier_name DOT)*) | SUPER COLONCOLON)? EVENT function_call_statement?
   ;

event_call_statement
   : event_call_statement_sub
   ;

create_call_sub
   : CREATE USING? (identifier_name DOT)? data_type_name (LPAREN expression_list? RPAREN)?
   ;

create_call_statement
   : create_call_sub
   ;

destroy_call_sub
   : DESTROY expression
   ;

destroy_call_statement
   : destroy_call_sub
   ;

for_loop_statement
   : FOR variable_name EQ expression TO expression (STEP expression)? statement* (NEXT | END FOR)
   ;

do_while_loop_statement
   : DO (WHILE | UNTIL) boolean_expression  (statement SEMI?)* LOOP
   ;

do_loop_while_statement
   : DO statement* LOOP (WHILE | UNTIL) boolean_expression
   ;

if_statement
   : IF boolean_expression THEN  (statement SEMI?)* (ELSEIF boolean_expression THEN  (statement SEMI?)*)* (ELSE  (statement SEMI?)*)? END IF SEMI?
   ;

if_simple_statement
   : IF boolean_expression THEN  (statement SEMI?)
   ;

continue_statement
   : CONTINUE
   ;

continue_sub
   : CONTINUE
   ;

post_event
   : (atom_sub_member1 DOT)? (POST | TRIGGER) EVENT? identifier_name_ex LPAREN expression_list? RPAREN
   ;

exit_statement
   : EXIT
   ;

choose_statement
   : CHOOSE CASE expression ( choose_case_range_sub
                            | choose_case_cond_sub
                            | choose_case_else_sub
                            | choose_case_value_sub)+
     END CHOOSE
   ;

choose_case_value_sub
   : CASE expression (COMMA expression)*  (statement SEMI?)*
   ;

choose_case_cond_sub
   : CASE IS (EQ | GT | LT | GTLT | GTE | LTE) expression  (statement SEMI?)*
   ;

choose_case_range_sub
   : CASE unary_sign_expr TO unary_sign_expr  (statement SEMI?)*
   ;

choose_case_else_sub
   : CASE ELSE  (statement SEMI?)*
   ;

goto_stat
   : GOTO identifier_name
   ;

label_stat
   : identifier_name COLON
   ;

throw_stat
   : THROW expression
   ;

identifier
   : identifier_name_ex (DOT identifier_name_ex)* (identifier_array)? (DOT identifier_name_ex)*
   ;

string_literal
  : (DQUOTED_STRING | QUOTED_STRING) (PLUS (variable_name | DQUOTED_STRING | QUOTED_STRING))*
  ;

identifier_array
  : LBRACE (identifier | value) (COMMA (identifier | value))* RBRACE
  | LBRACE (identifier | function_call_statement)? ((operator)? NUMBER)? RBRACE
  ;

operator: PLUS | MINUS | MULT | DIV;

identifier_name_ex
   : identifier_name
   | SELECT
   | TYPE
   | UPDATE
   | DELETE
   | OPEN
   | CLOSE
   | GOTO
   | INSERT
   | DESCRIBE
   | TIME
   | READONLY
   | SQLCA
   | CREATE
   | VALUES
   | WINDOW
   ;

identifier_name
   : ID
   ;

atom_sub
   : array_access_atom
   | identifier_name (LPAREN expression_list? RPAREN)?
   ;

atom_sub_call1
   : (identifier | DESCRIBE) LPAREN expression_list? RPAREN
   ;

atom_sub_member1
   : identifier
   ;

atom
   : event_call_statement_sub
   | cast_expression
   | atom_sub_member1
   | numeric_atom
   | boolean_atom
   ;

array_access_atom
   : identifier_name LBRACE expression_list RBRACE
   ;

numeric_atom
   : NUMBER
   ;

boolean_atom
   : TRUE
   | FALSE
   ;

cast_expression
   : dataTypeSub LPAREN expression (COMMA expression)* RPAREN
   ;

data_type_name
   : dataTypeSub
   | identifier_name
   ;

dataTypeSub
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
   | REAL
   | STRING
   | TIME_TYPE
   | UNSIGNEDINTEGER
   | UINT
   | UNSIGNEDLONG
   | ULONG
   | WINDOW
   ;
