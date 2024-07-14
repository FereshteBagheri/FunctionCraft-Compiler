grammar FunctionCraft;

program:
    (function | pattern)* main
    ;

function:
    DEF
    name = ID { System.out.println("FunctionDec: " + $name.text); }
    LEFT_PAREN parameter_list? RIGHT_PAREN block END
    ;

lambda_function:
    LAMBDA { System.out.println("Structure: LAMBDA"); }
    LEFT_PAREN parameter_list RIGHT_PAREN LEFT_CUR_BRACKET block RIGHT_CUR_BRACKET
    (LEFT_PAREN argument_list RIGHT_PAREN)?
    ;

parameter_list:
    ID (COMMA ID)* (COMMA default_parameter_list)?
    ;

default_parameter_list:
    LEFT_BRACKET default_parameter (COMMA default_parameter)* RIGHT_BRACKET
    ;

default_parameter:
    ID ASSIGN expression
    ;

argument_list:
    expression (COMMA expression)*
    ;

main:
    DEF
    MAIN { System.out.println("MAIN"); }
    LEFT_PAREN
    RIGHT_PAREN
    block
    END
    ;

pattern:
    PATTERN
    name = ID { System.out.println("PatternDec: " + $name.text); }
    LEFT_PAREN parameter_list RIGHT_PAREN
    (PATTERN_INDENT LEFT_PAREN expression RIGHT_PAREN ASSIGN expression)+
    SEMICOLON
    ;

match:
    ID { System.out.println("Built-In: MATCH"); }
    DOT
    MATCH
    LEFT_PAREN
    argument_list
    RIGHT_PAREN
    ;

block:
    statement* return_stat?
    ;

puts:
    PUTS { System.out.println("Built-In: PUTS"); }
    LEFT_PAREN expression RIGHT_PAREN
    ;

push:
    PUSH { System.out.println("Built-In: PUSH"); }
    LEFT_PAREN expression RIGHT_PAREN
    ;

len:
    LEN { System.out.println("Built-In: LEN"); }
    LEFT_PAREN expression RIGHT_PAREN
    ;

chop:
    CHOP { System.out.println("Built-In: CHOP"); }
    LEFT_PAREN expression RIGHT_PAREN
    ;

chomp:
    CHOMP { System.out.println("Built-In: CHOMP"); }
    LEFT_PAREN expression RIGHT_PAREN
    ;

loop:
    do_loop | for_loop
    ;

do_loop:
    LOOP DO { System.out.println("LOOP: DO"); }
    loop_body END
    ;

loop_body:
    (statement | control_structure)*
    ;

for_loop:
    FOR { System.out.println("LOOP: FOR"); }
    ID IN (list | range | ID) loop_body END
    ;

range:
    LEFT_PAREN INT_LITERAL RANGE_DOT INT_LITERAL RIGHT_PAREN
    ;

list:
    LEFT_BRACKET list_data? RIGHT_BRACKET
    ;

 list_data:
    expression (COMMA expression)*
    ;

list_access:
    ID (LEFT_BRACKET expression RIGHT_BRACKET)+
    ;

control_structure:
    break
    | break_if
    | next
    | next_if
    ;

break:
    BREAK { System.out.println("Control: BREAK"); }
    SEMICOLON
    ;

break_if:
    BREAK { System.out.println("Control: BREAK"); }
    if_condition SEMICOLON
    ;

next:
    NEXT { System.out.println("Control: NEXT"); }
    SEMICOLON
    ;

next_if:
    NEXT { System.out.println("Control: NEXT"); }
    if_condition SEMICOLON
    ;


condition:
    if_condition block (elseif_condition block)* (else_condition block)? END
    ;

if_condition:
    IF { System.out.println("Decision: IF"); }
    LEFT_PAREN expression RIGHT_PAREN
    ;

elseif_condition:
    ELSEIF { System.out.println("Decision: ELSE IF"); }
    LEFT_PAREN expression RIGHT_PAREN
    ;

else_condition:
    ELSE { System.out.println("Decision: ELSE"); }
    ;

return_stat:
    RETURN { System.out.println("RETURN"); }
    expression? SEMICOLON
    ;

function_call:
    ID { System.out.println("Function Call"); }
    LEFT_PAREN argument_list? RIGHT_PAREN
    ;

function_pointer:
    METHOD
    LEFT_PAREN COLON ID RIGHT_PAREN
    ;

assignment:
    name = ID { System.out.println("Assignment: " + $name.text); }
    (ASSIGN | ASSIGN_ADD | ASSIGN_DIV | ASSIGN_MUL | ASSIGN_SUB | ASSIGN_MOD)
    (expression | function_pointer)
    ;

statement:
    (expression
    | assignment
    ) SEMICOLON
    | loop
    | condition
    ;


expression
  : append_expresstion
  ;

append_expresstion
  : or_expression append_expression_
  ;

append_expression_
  : APPEND or_expression append_expression_ {System.out.println("Operator: <<");}
  |
  ;

or_expression
  : LEFT_PAREN expression RIGHT_PAREN or_expression_
  | and_expression
  ;

or_expression_
  : OR LEFT_PAREN expression RIGHT_PAREN or_expression_ {System.out.println("Operator: ||");}
  |
  ;

and_expression
  : LEFT_PAREN expression RIGHT_PAREN and_expression_
  | eq_expression
  ;

and_expression_
  : AND LEFT_PAREN expression RIGHT_PAREN and_expression_ {System.out.println("Operator: &&");}
  |
  ;

eq_expression
  : compare_expression eq_expression_
  ;

eq_expression_
  : EQL compare_expression eq_expression_  {System.out.println("Operator: ==");}
  | NEQ compare_expression eq_expression_  {System.out.println("Operator: !=");}
  |
  ;

compare_expression
  : add_sub_expression compare_expression_
  ;

compare_expression_
  : GREATER add_sub_expression compare_expression_  {System.out.println("Operator: >");}
  | LESS add_sub_expression compare_expression_  {System.out.println("Operator: <");}
  | GEQ add_sub_expression compare_expression_  {System.out.println("Operator: >=");}
  | LEQ add_sub_expression compare_expression_  {System.out.println("Operator: <=");}
  |
  ;

add_sub_expression
  : mul_div_expression add_sub_expression_
  ;

add_sub_expression_
  : ADD mul_div_expression add_sub_expression_  {System.out.println("Operator: +");}
  | SUB mul_div_expression add_sub_expression_  {System.out.println("Operator: -");}
  |
  ;

mul_div_expression
  : unary_expression mul_div_expression_
  ;

mul_div_expression_
  : MUL unary_expression mul_div_expression_  {System.out.println("Operator: *");}
  | DIV unary_expression mul_div_expression_  {System.out.println("Operator: /");}
  | MOD unary_expression mul_div_expression_  {System.out.println("Operator: %");}
  |
  ;

unary_expression
  : NOT other_expression  {System.out.println("Operator: !");}
  | SUB other_expression  {System.out.println("Operator: -");}
  | other_expression
  ;

other_expression
  : LEFT_PAREN expression RIGHT_PAREN
  | list
  | list_access
  | (ID | list_access) (INC | DEC)?
  | function_call
  | len
  | puts
  | push
  | chop
  | chomp
  | function_pointer
  | match
  | literal
  | lambda_function
  ;

boolean_literal:
    TRUE | FALSE
    ;

  literal: INT_LITERAL | FLOAT_LITERAL |
      STRING_LITERAL | boolean_literal ;


//Lexer

DEF : 'def';
END : 'end';
MAIN : 'main';
RETURN : 'return';
IF : 'if';
ELSE : 'else';
ELSEIF : 'elseif';
TRUE : 'true';
FALSE : 'false';
CHOP : 'chop';
CHOMP : 'chomp';
PUSH : 'push';
PUTS : 'puts';
METHOD : 'method';
LEN : 'len';
LOOP : 'loop';
DO : 'do';
FOR : 'for';
IN : 'in';
PATTERN: 'pattern';
MATCH : 'match';
NEXT : 'next';
BREAK : 'break';
LAMBDA : '->';

ID : [a-zA-Z_][a-zA-Z0-9_]*;
INT_LITERAL : '0' | [1-9][0-9]*;
FLOAT_LITERAL : INT_LITERAL '.' [0-9]+;
STRING_LITERAL : '"' (~["\r\n])* '"';

ASSIGN_ADD : '+=';
ASSIGN_SUB : '-=';
ASSIGN_MUL : '*=';
ASSIGN_DIV : '/=';
ASSIGN_MOD : '%=';
ADD : '+';
SUB : '-';
MUL : '*';
DIV : '/';
MOD : '%';
ASSIGN : '=';
EQL : '==';
NEQ : '!=';
LESS : '<';
GREATER : '>';
LEQ : '<=';
GEQ : '>=';
AND : '&&';
OR : '||';
NOT : '!';
APPEND: '<<';
INC: '++';
DEC: '--';

LEFT_PAREN : '(';
RIGHT_PAREN : ')';
LEFT_BRACKET : '[';
RIGHT_BRACKET : ']';
LEFT_CUR_BRACKET: '{';
RIGHT_CUR_BRACKET: '}';
COMMA : ',';
RANGE_DOT : '..';
SEMICOLON : ';';
COLON: ':';
DOT: '.';

COMMENT : ('#' ~[\r\n]* | 'begin=' .*? 'end=') -> skip;
WS : [ \t\n\r]+ -> skip;
PATTERN_INDENT:  ('\r'?'\n')('\t|' | '    |');
OTHER : .;