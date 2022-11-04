package com.afollestad.materialdialogs.input;

import android.content.res.Resources;
import android.graphics.Typeface;
import android.view.View;
import android.widget.EditText;
import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.WhichButton;
import com.afollestad.materialdialogs.actions.DialogActionExtKt;
import com.afollestad.materialdialogs.callbacks.DialogCallbackExtKt;
import com.afollestad.materialdialogs.customview.DialogCustomViewExtKt;
import com.afollestad.materialdialogs.utils.MDUtil;
import com.google.android.material.textfield.TextInputLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: DialogInputExt.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0002H\u0007\u001a\u008d\u0001\u0010\u0005\u001a\u00020\u0002*\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\r\u001a\u00020\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102 \b\u0002\u0010\u0012\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013j\u0002`\u0015H\u0007¢\u0006\u0002\u0010\u0016\u001a\f\u0010\u0017\u001a\u00020\u0004*\u00020\u0002H\u0002\u001a-\u0010\u0018\u001a\u00020\u0014*\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0002\u0010\u0019\u001a-\u0010\u001a\u001a\u00020\u0014*\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0002\u0010\u001b*2\u0010\u001c\"\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013¨\u0006\u0005"}, d2 = {"getInputField", "Landroid/widget/EditText;", "Lcom/afollestad/materialdialogs/MaterialDialog;", "getInputLayout", "Lcom/google/android/material/textfield/TextInputLayout;", "input", "hint", "", "hintRes", "", "prefill", "", "prefillRes", "inputType", "maxLength", "waitForPositiveButton", "", "allowEmpty", "callback", "Lkotlin/Function2;", "", "Lcom/afollestad/materialdialogs/input/InputCallback;", "(Lcom/afollestad/materialdialogs/MaterialDialog;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/CharSequence;Ljava/lang/Integer;ILjava/lang/Integer;ZZLkotlin/jvm/functions/Function2;)Lcom/afollestad/materialdialogs/MaterialDialog;", "lookupInputLayout", "prefillInput", "(Lcom/afollestad/materialdialogs/MaterialDialog;Ljava/lang/CharSequence;Ljava/lang/Integer;Z)V", "styleInput", "(Lcom/afollestad/materialdialogs/MaterialDialog;Ljava/lang/String;Ljava/lang/Integer;I)V", "InputCallback"}, k = 2, mv = {1, 1, 16})
/* loaded from: classes2.dex */
public final class DialogInputExtKt {
    public static final TextInputLayout getInputLayout(MaterialDialog getInputLayout) {
        Intrinsics.checkParameterIsNotNull(getInputLayout, "$this$getInputLayout");
        Object obj = getInputLayout.getConfig().get("[custom_view_input_layout]");
        if (!(obj instanceof TextInputLayout)) {
            obj = null;
        }
        TextInputLayout textInputLayout = (TextInputLayout) obj;
        if (textInputLayout != null) {
            return textInputLayout;
        }
        TextInputLayout lookupInputLayout = lookupInputLayout(getInputLayout);
        getInputLayout.getConfig().put("[custom_view_input_layout]", lookupInputLayout);
        return lookupInputLayout;
    }

    private static final TextInputLayout lookupInputLayout(MaterialDialog materialDialog) {
        View findViewById = DialogCustomViewExtKt.getCustomView(materialDialog).findViewById(R.id.md_input_layout);
        if (!(findViewById instanceof TextInputLayout)) {
            findViewById = null;
        }
        TextInputLayout textInputLayout = (TextInputLayout) findViewById;
        if (textInputLayout != null) {
            return textInputLayout;
        }
        throw new IllegalStateException("You have not setup this dialog as an input dialog.");
    }

    public static final EditText getInputField(MaterialDialog getInputField) {
        Intrinsics.checkParameterIsNotNull(getInputField, "$this$getInputField");
        EditText editText = getInputLayout(getInputField).getEditText();
        if (editText != null) {
            return editText;
        }
        throw new IllegalStateException("You have not setup this dialog as an input dialog.");
    }

    public static /* synthetic */ MaterialDialog input$default(MaterialDialog materialDialog, String str, Integer num, CharSequence charSequence, Integer num2, int i, Integer num3, boolean z, boolean z2, Function2 function2, int i2, Object obj) {
        Function2 function22 = null;
        String str2 = (i2 & 1) != 0 ? null : str;
        Integer num4 = (i2 & 2) != 0 ? null : num;
        CharSequence charSequence2 = (i2 & 4) != 0 ? null : charSequence;
        Integer num5 = (i2 & 8) != 0 ? null : num2;
        boolean z3 = true;
        int i3 = (i2 & 16) != 0 ? 1 : i;
        Integer num6 = (i2 & 32) != 0 ? null : num3;
        if ((i2 & 64) == 0) {
            z3 = z;
        }
        boolean z4 = (i2 & 128) != 0 ? false : z2;
        if ((i2 & 256) == 0) {
            function22 = function2;
        }
        return input(materialDialog, str2, num4, charSequence2, num5, i3, num6, z3, z4, function22);
    }

    public static final MaterialDialog input(MaterialDialog input, String str, Integer num, CharSequence charSequence, Integer num2, int i, Integer num3, boolean z, boolean z2, Function2<? super MaterialDialog, ? super CharSequence, Unit> function2) {
        Intrinsics.checkParameterIsNotNull(input, "$this$input");
        DialogCustomViewExtKt.customView$default(input, Integer.valueOf(R.layout.md_dialog_stub_input), null, false, false, false, false, 62, null);
        DialogCallbackExtKt.onPreShow(input, new DialogInputExtKt$input$1(input));
        if (!DialogActionExtKt.hasActionButtons(input)) {
            MaterialDialog.positiveButton$default(input, 17039370, null, null, 6, null);
        }
        if (function2 != null && z) {
            MaterialDialog.positiveButton$default(input, null, null, new DialogInputExtKt$input$2(input, function2), 3, null);
        }
        prefillInput(input, charSequence, num2, z2);
        styleInput(input, str, num, i);
        if (num3 != null) {
            TextInputLayout inputLayout = getInputLayout(input);
            inputLayout.setCounterEnabled(true);
            inputLayout.setCounterMaxLength(num3.intValue());
            InputUtilExtKt.invalidateInputMaxLength(input, z2);
        }
        MDUtil.INSTANCE.textChanged(getInputField(input), new DialogInputExtKt$input$4(input, z2, num3, z, function2));
        return input;
    }

    private static final void prefillInput(MaterialDialog materialDialog, CharSequence charSequence, Integer num, boolean z) {
        Resources resources = materialDialog.getWindowContext().getResources();
        EditText inputField = getInputField(materialDialog);
        if (charSequence == null) {
            String string = num != null ? resources.getString(num.intValue()) : "";
            Intrinsics.checkExpressionValueIsNotNull(string, "if (prefillRes != null) …tring(prefillRes) else \"\"");
            charSequence = string;
        }
        boolean z2 = true;
        if (charSequence.length() > 0) {
            inputField.setText(charSequence);
            DialogCallbackExtKt.onShow(materialDialog, new DialogInputExtKt$prefillInput$1(inputField, charSequence));
        }
        WhichButton whichButton = WhichButton.POSITIVE;
        if (!z) {
            if (!(charSequence.length() > 0)) {
                z2 = false;
            }
        }
        DialogActionExtKt.setActionButtonEnabled(materialDialog, whichButton, z2);
    }

    private static final void styleInput(MaterialDialog materialDialog, String str, Integer num, int i) {
        Resources resources = materialDialog.getWindowContext().getResources();
        EditText inputField = getInputField(materialDialog);
        TextInputLayout inputLayout = getInputLayout(materialDialog);
        if (str == null) {
            str = num != null ? resources.getString(num.intValue()) : null;
        }
        inputLayout.setHint(str);
        inputField.setInputType(i);
        MDUtil.INSTANCE.maybeSetTextColor(inputField, materialDialog.getWindowContext(), Integer.valueOf(R.attr.md_color_content), Integer.valueOf(R.attr.md_color_hint));
        Typeface bodyFont = materialDialog.getBodyFont();
        if (bodyFont != null) {
            inputField.setTypeface(bodyFont);
        }
    }
}
