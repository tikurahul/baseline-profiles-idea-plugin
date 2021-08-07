// This is a generated file. Not intended for manual editing.
package com.rahulrav.baseline.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.rahulrav.baseline.psi.TokenTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.rahulrav.baseline.psi.*;

public class BBasicClassRuleImpl extends ASTWrapperPsiElement implements BBasicClassRule {

  public BBasicClassRuleImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull BVisitor visitor) {
    visitor.visitBasicClassRule(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof BVisitor) accept((BVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public BClassPrefix getClassPrefix() {
    return findNotNullChildByClass(BClassPrefix.class);
  }

  @Override
  @NotNull
  public BPathComponent getPathComponent() {
    return findNotNullChildByClass(BPathComponent.class);
  }

}
