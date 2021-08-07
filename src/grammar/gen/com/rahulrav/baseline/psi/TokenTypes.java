// This is a generated file. Not intended for manual editing.
package com.rahulrav.baseline.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.rahulrav.baseline.psi.impl.*;

public interface TokenTypes {

  IElementType ARGUMENT_RULE = new Element("ARGUMENT_RULE");
  IElementType ARRAY_RULE = new Element("ARRAY_RULE");
  IElementType ARROW = new Element("ARROW");
  IElementType BASIC_CLASS_RULE = new Element("BASIC_CLASS_RULE");
  IElementType CLASS_PREFIX = new Element("CLASS_PREFIX");
  IElementType CLASS_RULE = new Element("CLASS_RULE");
  IElementType CLASS_STMT = new Element("CLASS_STMT");
  IElementType COMMENT_STMT = new Element("COMMENT_STMT");
  IElementType COMPONENT = new Element("COMPONENT");
  IElementType EMPTY_STMT = new Element("EMPTY_STMT");
  IElementType FLAGS = new Element("FLAGS");
  IElementType MATCH_ALL = new Element("MATCH_ALL");
  IElementType MATCH_ALL_ARGS = new Element("MATCH_ALL_ARGS");
  IElementType MATCH_NO_ARGS = new Element("MATCH_NO_ARGS");
  IElementType METHOD_CLASS_RULE = new Element("METHOD_CLASS_RULE");
  IElementType METHOD_COMPONENT = new Element("METHOD_COMPONENT");
  IElementType METHOD_NAME = new Element("METHOD_NAME");
  IElementType METHOD_STMT = new Element("METHOD_STMT");
  IElementType PATH_COMPONENT = new Element("PATH_COMPONENT");
  IElementType PRIMITIVES = new Element("PRIMITIVES");
  IElementType RETURN_TYPE = new Element("RETURN_TYPE");
  IElementType STATEMENT = new Element("STATEMENT");
  IElementType TYPE = new Element("TYPE");

  IElementType AP = new Token("[");
  IElementType COMMENT = new Token("#");
  IElementType GT = new Token(">");
  IElementType HY = new Token("-");
  IElementType ID = new Token("ID");
  IElementType LP = new Token("(");
  IElementType NEWLINE = new Token("NEWLINE");
  IElementType RP = new Token(")");
  IElementType SEMI = new Token(";");
  IElementType SLASH = new Token("/");
  IElementType SPACE = new Token(" ");
  IElementType WILDCARD = new Token("*");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ARGUMENT_RULE) {
        return new BArgumentRuleImpl(node);
      }
      else if (type == ARRAY_RULE) {
        return new BArrayRuleImpl(node);
      }
      else if (type == ARROW) {
        return new BArrowImpl(node);
      }
      else if (type == BASIC_CLASS_RULE) {
        return new BBasicClassRuleImpl(node);
      }
      else if (type == CLASS_PREFIX) {
        return new BClassPrefixImpl(node);
      }
      else if (type == CLASS_RULE) {
        return new BClassRuleImpl(node);
      }
      else if (type == CLASS_STMT) {
        return new BClassStmtImpl(node);
      }
      else if (type == COMMENT_STMT) {
        return new BCommentStmtImpl(node);
      }
      else if (type == COMPONENT) {
        return new BComponentImpl(node);
      }
      else if (type == EMPTY_STMT) {
        return new BEmptyStmtImpl(node);
      }
      else if (type == FLAGS) {
        return new BFlagsImpl(node);
      }
      else if (type == MATCH_ALL) {
        return new BMatchAllImpl(node);
      }
      else if (type == MATCH_ALL_ARGS) {
        return new BMatchAllArgsImpl(node);
      }
      else if (type == MATCH_NO_ARGS) {
        return new BMatchNoArgsImpl(node);
      }
      else if (type == METHOD_CLASS_RULE) {
        return new BMethodClassRuleImpl(node);
      }
      else if (type == METHOD_COMPONENT) {
        return new BMethodComponentImpl(node);
      }
      else if (type == METHOD_NAME) {
        return new BMethodNameImpl(node);
      }
      else if (type == METHOD_STMT) {
        return new BMethodStmtImpl(node);
      }
      else if (type == PATH_COMPONENT) {
        return new BPathComponentImpl(node);
      }
      else if (type == PRIMITIVES) {
        return new BPrimitivesImpl(node);
      }
      else if (type == RETURN_TYPE) {
        return new BReturnTypeImpl(node);
      }
      else if (type == TYPE) {
        return new BTypeImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
