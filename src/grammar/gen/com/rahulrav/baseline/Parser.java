// This is a generated file. Not intended for manual editing.
package com.rahulrav.baseline;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.rahulrav.baseline.psi.TokenTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class Parser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, EXTENDS_SETS_);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return root(b, l + 1);
  }

  public static final TokenSet[] EXTENDS_SETS_ = new TokenSet[] {
    create_token_set_(CLASS_STMT, COMMENT_STMT, EMPTY_STMT, METHOD_STMT,
      STATEMENT),
  };

  /* ********************************************************** */
  // match_no_args | match_all_args | LP type (',' type)* RP
  public static boolean argument_rule(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argument_rule")) return false;
    if (!nextTokenIs(b, LP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = match_no_args(b, l + 1);
    if (!r) r = match_all_args(b, l + 1);
    if (!r) r = argument_rule_2(b, l + 1);
    exit_section_(b, m, ARGUMENT_RULE, r);
    return r;
  }

  // LP type (',' type)* RP
  private static boolean argument_rule_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argument_rule_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LP);
    r = r && type(b, l + 1);
    r = r && argument_rule_2_2(b, l + 1);
    r = r && consumeToken(b, RP);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' type)*
  private static boolean argument_rule_2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argument_rule_2_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!argument_rule_2_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "argument_rule_2_2", c)) break;
    }
    return true;
  }

  // ',' type
  private static boolean argument_rule_2_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argument_rule_2_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // AP [ primitives | class_rule ]
  public static boolean array_rule(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_rule")) return false;
    if (!nextTokenIs(b, AP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AP);
    r = r && array_rule_1(b, l + 1);
    exit_section_(b, m, ARRAY_RULE, r);
    return r;
  }

  // [ primitives | class_rule ]
  private static boolean array_rule_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_rule_1")) return false;
    array_rule_1_0(b, l + 1);
    return true;
  }

  // primitives | class_rule
  private static boolean array_rule_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_rule_1_0")) return false;
    boolean r;
    r = primitives(b, l + 1);
    if (!r) r = class_rule(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // HY GT
  public static boolean arrow(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrow")) return false;
    if (!nextTokenIs(b, HY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, HY, GT);
    exit_section_(b, m, ARROW, r);
    return r;
  }

  /* ********************************************************** */
  // class_prefix path_component SEMI
  public static boolean basic_class_rule(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "basic_class_rule")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BASIC_CLASS_RULE, "<basic class rule>");
    r = class_prefix(b, l + 1);
    r = r && path_component(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'L'
  public static boolean class_prefix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_prefix")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CLASS_PREFIX, "<class prefix>");
    r = consumeToken(b, "L");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // [
  //     basic_class_rule |
  //     class_prefix path_component SLASH match_all |
  //     class_prefix path_component SLASH WILDCARD
  // ]
  public static boolean class_rule(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_rule")) return false;
    Marker m = enter_section_(b, l, _NONE_, CLASS_RULE, "<class rule>");
    class_rule_0(b, l + 1);
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // basic_class_rule |
  //     class_prefix path_component SLASH match_all |
  //     class_prefix path_component SLASH WILDCARD
  private static boolean class_rule_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_rule_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = basic_class_rule(b, l + 1);
    if (!r) r = class_rule_0_1(b, l + 1);
    if (!r) r = class_rule_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // class_prefix path_component SLASH match_all
  private static boolean class_rule_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_rule_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = class_prefix(b, l + 1);
    r = r && path_component(b, l + 1);
    r = r && consumeToken(b, SLASH);
    r = r && match_all(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // class_prefix path_component SLASH WILDCARD
  private static boolean class_rule_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_rule_0_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = class_prefix(b, l + 1);
    r = r && path_component(b, l + 1);
    r = r && consumeTokens(b, 0, SLASH, WILDCARD);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // class_rule NEWLINE
  public static boolean class_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_stmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CLASS_STMT, "<class stmt>");
    r = class_rule(b, l + 1);
    r = r && consumeToken(b, NEWLINE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // COMMENT_P (SPACE | ID)* NEWLINE
  public static boolean comment_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comment_stmt")) return false;
    if (!nextTokenIs(b, COMMENT_P)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMENT_P);
    r = r && comment_stmt_1(b, l + 1);
    r = r && consumeToken(b, NEWLINE);
    exit_section_(b, m, COMMENT_STMT, r);
    return r;
  }

  // (SPACE | ID)*
  private static boolean comment_stmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comment_stmt_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!comment_stmt_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "comment_stmt_1", c)) break;
    }
    return true;
  }

  // SPACE | ID
  private static boolean comment_stmt_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comment_stmt_1_0")) return false;
    boolean r;
    r = consumeToken(b, SPACE);
    if (!r) r = consumeToken(b, ID);
    return r;
  }

  /* ********************************************************** */
  // ID+
  public static boolean component(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ID);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, ID)) break;
      if (!empty_element_parsed_guard_(b, "component", c)) break;
    }
    exit_section_(b, m, COMPONENT, r);
    return r;
  }

  /* ********************************************************** */
  // NEWLINE
  public static boolean empty_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "empty_stmt")) return false;
    if (!nextTokenIs(b, NEWLINE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NEWLINE);
    exit_section_(b, m, EMPTY_STMT, r);
    return r;
  }

  /* ********************************************************** */
  // 'HSP' | 'HS' | 'HP' | 'SP' | 'P' | 'S' | 'H'
  public static boolean flags(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "flags")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FLAGS, "<flags>");
    r = consumeToken(b, "HSP");
    if (!r) r = consumeToken(b, "HS");
    if (!r) r = consumeToken(b, "HP");
    if (!r) r = consumeToken(b, "SP");
    if (!r) r = consumeToken(b, "P");
    if (!r) r = consumeToken(b, "S");
    if (!r) r = consumeToken(b, "H");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // WILDCARD WILDCARD
  public static boolean match_all(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "match_all")) return false;
    if (!nextTokenIs(b, WILDCARD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, WILDCARD, WILDCARD);
    exit_section_(b, m, MATCH_ALL, r);
    return r;
  }

  /* ********************************************************** */
  // LP WILDCARD WILDCARD RP
  public static boolean match_all_args(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "match_all_args")) return false;
    if (!nextTokenIs(b, LP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LP, WILDCARD, WILDCARD, RP);
    exit_section_(b, m, MATCH_ALL_ARGS, r);
    return r;
  }

  /* ********************************************************** */
  // LP RP
  public static boolean match_no_args(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "match_no_args")) return false;
    if (!nextTokenIs(b, LP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LP, RP);
    exit_section_(b, m, MATCH_NO_ARGS, r);
    return r;
  }

  /* ********************************************************** */
  // [
  //     class_prefix path_component SEMI arrow |
  //     class_prefix path_component SLASH match_all arrow |
  //     class_prefix path_component SLASH WILDCARD arrow
  // ]
  public static boolean method_class_rule(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_class_rule")) return false;
    Marker m = enter_section_(b, l, _NONE_, METHOD_CLASS_RULE, "<method class rule>");
    method_class_rule_0(b, l + 1);
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // class_prefix path_component SEMI arrow |
  //     class_prefix path_component SLASH match_all arrow |
  //     class_prefix path_component SLASH WILDCARD arrow
  private static boolean method_class_rule_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_class_rule_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = method_class_rule_0_0(b, l + 1);
    if (!r) r = method_class_rule_0_1(b, l + 1);
    if (!r) r = method_class_rule_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // class_prefix path_component SEMI arrow
  private static boolean method_class_rule_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_class_rule_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = class_prefix(b, l + 1);
    r = r && path_component(b, l + 1);
    r = r && consumeToken(b, SEMI);
    r = r && arrow(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // class_prefix path_component SLASH match_all arrow
  private static boolean method_class_rule_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_class_rule_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = class_prefix(b, l + 1);
    r = r && path_component(b, l + 1);
    r = r && consumeToken(b, SLASH);
    r = r && match_all(b, l + 1);
    r = r && arrow(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // class_prefix path_component SLASH WILDCARD arrow
  private static boolean method_class_rule_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_class_rule_0_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = class_prefix(b, l + 1);
    r = r && path_component(b, l + 1);
    r = r && consumeTokens(b, 0, SLASH, WILDCARD);
    r = r && arrow(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // [ID+ WILDCARD ID+ | ID+ WILDCARD]
  public static boolean method_component(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_component")) return false;
    Marker m = enter_section_(b, l, _NONE_, METHOD_COMPONENT, "<method component>");
    method_component_0(b, l + 1);
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // ID+ WILDCARD ID+ | ID+ WILDCARD
  private static boolean method_component_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_component_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = method_component_0_0(b, l + 1);
    if (!r) r = method_component_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ID+ WILDCARD ID+
  private static boolean method_component_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_component_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = method_component_0_0_0(b, l + 1);
    r = r && consumeToken(b, WILDCARD);
    r = r && method_component_0_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ID+
  private static boolean method_component_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_component_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ID);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, ID)) break;
      if (!empty_element_parsed_guard_(b, "method_component_0_0_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ID+
  private static boolean method_component_0_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_component_0_0_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ID);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, ID)) break;
      if (!empty_element_parsed_guard_(b, "method_component_0_0_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ID+ WILDCARD
  private static boolean method_component_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_component_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = method_component_0_1_0(b, l + 1);
    r = r && consumeToken(b, WILDCARD);
    exit_section_(b, m, null, r);
    return r;
  }

  // ID+
  private static boolean method_component_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_component_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ID);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, ID)) break;
      if (!empty_element_parsed_guard_(b, "method_component_0_1_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // match_all | method_component
  public static boolean method_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_name")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, METHOD_NAME, "<method name>");
    r = match_all(b, l + 1);
    if (!r) r = method_component(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // flags method_class_rule method_name argument_rule return_type? NEWLINE
  public static boolean method_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_stmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, METHOD_STMT, "<method stmt>");
    r = flags(b, l + 1);
    r = r && method_class_rule(b, l + 1);
    r = r && method_name(b, l + 1);
    r = r && argument_rule(b, l + 1);
    r = r && method_stmt_4(b, l + 1);
    r = r && consumeToken(b, NEWLINE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // return_type?
  private static boolean method_stmt_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_stmt_4")) return false;
    return_type(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // component ('/'component)*
  public static boolean path_component(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "path_component")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = component(b, l + 1);
    r = r && path_component_1(b, l + 1);
    exit_section_(b, m, PATH_COMPONENT, r);
    return r;
  }

  // ('/'component)*
  private static boolean path_component_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "path_component_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!path_component_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "path_component_1", c)) break;
    }
    return true;
  }

  // '/'component
  private static boolean path_component_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "path_component_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SLASH);
    r = r && component(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'Z' | 'V' | 'B' | 'S' | 'I'| 'L'| 'F'| 'D'
  public static boolean primitives(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primitives")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PRIMITIVES, "<primitives>");
    r = consumeToken(b, "Z");
    if (!r) r = consumeToken(b, "V");
    if (!r) r = consumeToken(b, "B");
    if (!r) r = consumeToken(b, "S");
    if (!r) r = consumeToken(b, "I");
    if (!r) r = consumeToken(b, "L");
    if (!r) r = consumeToken(b, "F");
    if (!r) r = consumeToken(b, "D");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // match_all | type
  public static boolean return_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "return_type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RETURN_TYPE, "<return type>");
    r = match_all(b, l + 1);
    if (!r) r = type(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // statement*
  static boolean root(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root")) return false;
    while (true) {
      int c = current_position_(b);
      if (!statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "root", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // class_stmt
  //     | method_stmt
  //     | empty_stmt
  //     | comment_stmt
  public static boolean statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, STATEMENT, "<statement>");
    r = class_stmt(b, l + 1);
    if (!r) r = method_stmt(b, l + 1);
    if (!r) r = empty_stmt(b, l + 1);
    if (!r) r = comment_stmt(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // array_rule | basic_class_rule | primitives
  public static boolean type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE, "<type>");
    r = array_rule(b, l + 1);
    if (!r) r = basic_class_rule(b, l + 1);
    if (!r) r = primitives(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

}
