package com.rahulrav.baseline;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static generated.GeneratedTypes.*;

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

ID=[a-zA-Z_$0-9?]
NEWLINE=\r?\n

%%
<YYINITIAL> {

  "/"                { return SLASH; }
  ";"                { return SEMI; }
  "["                { return AP; }
  "*"                { return WILDCARD; }
  "-"                { return HY; }
  ">"                { return GT; }
  "("                { return LP; }
  ")"                { return RP; }
  "#"                { return COMMENT; }
  " "                { return SPACE; }

  {ID}               { return ID; }
  {NEWLINE}          { return NEWLINE; }

}

[^] { return BAD_CHARACTER; }
