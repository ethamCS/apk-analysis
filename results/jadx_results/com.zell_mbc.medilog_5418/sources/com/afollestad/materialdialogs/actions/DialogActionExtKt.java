package com.afollestad.materialdialogs.actions;

import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.WhichButton;
import com.afollestad.materialdialogs.internal.button.DialogActionButton;
import com.afollestad.materialdialogs.internal.button.DialogActionButtonLayout;
import com.afollestad.materialdialogs.utils.ViewsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: DialogActionExt.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\n\u0010\u0007\u001a\u00020\u0006*\u00020\u0002\u001a\u001a\u0010\b\u001a\u00020\t*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0006¨\u0006\u000b"}, d2 = {"getActionButton", "Lcom/afollestad/materialdialogs/internal/button/DialogActionButton;", "Lcom/afollestad/materialdialogs/MaterialDialog;", "which", "Lcom/afollestad/materialdialogs/WhichButton;", "hasActionButton", "", "hasActionButtons", "setActionButtonEnabled", "", "enabled", "core"}, k = 2, mv = {1, 1, 16})
/* loaded from: classes2.dex */
public final class DialogActionExtKt {
    public static final boolean hasActionButtons(MaterialDialog hasActionButtons) {
        DialogActionButton[] visibleButtons;
        Intrinsics.checkParameterIsNotNull(hasActionButtons, "$this$hasActionButtons");
        DialogActionButtonLayout buttonsLayout = hasActionButtons.getView().getButtonsLayout();
        boolean z = false;
        if (buttonsLayout == null || (visibleButtons = buttonsLayout.getVisibleButtons()) == null) {
            return false;
        }
        if (visibleButtons.length == 0) {
            z = true;
        }
        return !z;
    }

    public static final boolean hasActionButton(MaterialDialog hasActionButton, WhichButton which) {
        Intrinsics.checkParameterIsNotNull(hasActionButton, "$this$hasActionButton");
        Intrinsics.checkParameterIsNotNull(which, "which");
        return ViewsKt.isVisible(getActionButton(hasActionButton, which));
    }

    public static final DialogActionButton getActionButton(MaterialDialog getActionButton, WhichButton which) {
        DialogActionButton[] actionButtons;
        DialogActionButton dialogActionButton;
        Intrinsics.checkParameterIsNotNull(getActionButton, "$this$getActionButton");
        Intrinsics.checkParameterIsNotNull(which, "which");
        DialogActionButtonLayout buttonsLayout = getActionButton.getView().getButtonsLayout();
        if (buttonsLayout == null || (actionButtons = buttonsLayout.getActionButtons()) == null || (dialogActionButton = actionButtons[which.getIndex()]) == null) {
            throw new IllegalStateException("The dialog does not have an attached buttons layout.");
        }
        return dialogActionButton;
    }

    public static final void setActionButtonEnabled(MaterialDialog setActionButtonEnabled, WhichButton which, boolean z) {
        Intrinsics.checkParameterIsNotNull(setActionButtonEnabled, "$this$setActionButtonEnabled");
        Intrinsics.checkParameterIsNotNull(which, "which");
        getActionButton(setActionButtonEnabled, which).setEnabled(z);
    }
}
