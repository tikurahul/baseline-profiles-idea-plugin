package com.rahulrav.baseline;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static generated.GeneratedTypes.*;

%%

%{
  public _GrammarLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _GrammarLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+

FLAGS=HS?P?|SP?|P
ID=[a-zA-Z_$0-9?]
PRIMITIVES=[ZVBSILFD]
COMMENT=#(.*)?
NEWLINE=\r?\n
SPACE=[\s]

%%
<YYINITIAL> {
  {WHITE_SPACE}      { return WHITE_SPACE; }


  {FLAGS}            { return FLAGS; }
  {ID}               { return ID; }
  {PRIMITIVES}       { return PRIMITIVES; }
  {COMMENT}          { return COMMENT; }
  {NEWLINE}          { return NEWLINE; }
  {SPACE}            { return SPACE; }

}

[^] { return BAD_CHARACTER; }
