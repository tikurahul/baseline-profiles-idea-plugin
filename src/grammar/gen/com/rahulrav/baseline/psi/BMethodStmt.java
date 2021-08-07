// This is a generated file. Not intended for manual editing.
package com.rahulrav.baseline.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface BMethodStmt extends BStatement {

  @NotNull
  BArgumentRule getArgumentRule();

  @NotNull
  BFlags getFlags();

  @NotNull
  BMethodClassRule getMethodClassRule();

  @NotNull
  BMethodName getMethodName();

  @Nullable
  BReturnType getReturnType();

  @NotNull
  PsiElement getNewline();

}
