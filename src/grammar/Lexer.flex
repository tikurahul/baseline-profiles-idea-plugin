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

EOL=\R
WHITE_SPACE=\s+

SLASH=[/]
SEMI=";"
AP=[\[]
WILDCARD=[*]
HY=[\-]
GT=[>]
LP=[(]
RP=[)]
COMMENT=[#]
SPACE=[\s]
ID=[a-zA-Z_$0-9?]
NEWLINE=\r?\n

%%
<YYINITIAL> {
  {SLASH}            { return SLASH; }
  {SEMI}             { return SEMI; }
  {AP}               { return AP; }
  {WILDCARD}         { return WILDCARD; }
  {HY}               { return HY; }
  {GT}               { return GT; }
  {LP}               { return LP; }
  {RP}               { return RP; }
  {COMMENT}          { return COMMENT; }
  {ID}               { return ID; }
  {SPACE}            { return SPACE; }
  {NEWLINE}          { return NEWLINE; }
  {WHITE_SPACE}      { return WHITE_SPACE; }
}

[^] { return BAD_CHARACTER; }
