package com.rahulrav.baseline;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static com.rahulrav.baseline.psi.TokenTypes.*;

%%

%{
  public Lexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class Lexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+

COMMENT_P=[#]
ID=[a-zA-Z_$0-9?-]
NEWLINE=\r\n|\r|\n
ANY=.

%%
<YYINITIAL> {
  "/"                { return SLASH; }
  ";"                { return SEMI; }
  "["                { return AP; }
  "*"                { return WILDCARD; }
  "<"                { return LT; }
  ">"                { return GT; }
  "("                { return LP; }
  ")"                { return RP; }
  " "                { return SPACE; }
  "GP"               { return GP; }

  {COMMENT_P}        { return COMMENT_P; }
  {ID}               { return ID; }
  {NEWLINE}          { return NEWLINE; }
  {ANY}              { return ANY; }
}

[^] { return BAD_CHARACTER; }
