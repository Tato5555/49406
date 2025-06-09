grammar Analizador;

programa       : instruccion+ EOF ;
instruccion    : variar ';' | asignacion ';' | salida ';' ;

variar         : 'variar' variable 'desde' expresion 'hasta' expresion ('con paso' expresion)? 'hacer' bloque 'fin_variar' ;
bloque         : instruccion* ;

asignacion     : variable '<-' expresion ;
salida         : 'escribir' expresion ;

expresion      : termino (('+' | '-' | '*' | '/') termino)* ;
termino        : numero | variable | '(' expresion ')' ;

variable       : IDENTIFICADOR ;

IDENTIFICADOR  : LETRA (LETRA | DIGITO | '_')* ;
fragment LETRA : [a-zA-Z] ;

DIGITO         : [0-9]+ ;

numero         : DIGITO ;

WS             : [ \t\r\n]+ -> skip ;
