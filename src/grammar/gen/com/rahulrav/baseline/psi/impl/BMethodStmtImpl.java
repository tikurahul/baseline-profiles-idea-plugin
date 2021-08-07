// This is a generated file. Not intended for manual editing.
package com.rahulrav.baseline.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.rahulrav.baseline.psi.TokenTypes.*;
import com.rahulrav.baseline.psi.*;

public class BMethodStmtImpl extends BStatementImpl implements BMethodStmt {

  public BMethodStmtImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull BVisitor visitor) {
    visitor.visitMethodStmt(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof BVisitor) accept((BVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public BArgumentRule getArgumentRule() {
    return findNotNullChildByClass(BArgumentRule.class);
  }

  @Override
  @NotNull
  public BFlags getFlags() {
    return findNotNullChildByClass(BFlags.class);
  }

  @Override
  @NotNull
  public BMethodClassRule getMethodClassRule() {
    return findNotNullChildByClass(BMethodClassRule.class);
  }

  @Override
  @NotNull
  public BMethodName getMethodName() {
    return findNotNullChildByClass(BMethodName.class);
  }

  @Override
  @Nullable
  public BReturnType getReturnType() {
    return findChildByClass(BReturnType.class);
  }

  @Override
  @NotNull
  public PsiElement getNewline() {
    return findNotNullChildByType(NEWLINE);
  }

}
