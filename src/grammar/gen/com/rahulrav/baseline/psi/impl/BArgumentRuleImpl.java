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

public class BArgumentRuleImpl extends ASTWrapperPsiElement implements BArgumentRule {

  public BArgumentRuleImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull BVisitor visitor) {
    visitor.visitArgumentRule(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof BVisitor) accept((BVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public BMatchAllArgs getMatchAllArgs() {
    return findChildByClass(BMatchAllArgs.class);
  }

  @Override
  @Nullable
  public BMatchNoArgs getMatchNoArgs() {
    return findChildByClass(BMatchNoArgs.class);
  }

  @Override
  @NotNull
  public List<BType> getTypeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, BType.class);
  }

}
