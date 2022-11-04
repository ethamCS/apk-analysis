package com.afollestad.materialdialogs.input;

import com.afollestad.materialdialogs.MaterialDialog;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: DialogInputExt.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/afollestad/materialdialogs/MaterialDialog;", "invoke"}, k = 3, mv = {1, 1, 16})
/* loaded from: classes2.dex */
public final class DialogInputExtKt$input$2 extends Lambda implements Function1<MaterialDialog, Unit> {
    final /* synthetic */ Function2 $callback;
    final /* synthetic */ MaterialDialog $this_input;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogInputExtKt$input$2(MaterialDialog materialDialog, Function2 function2) {
        super(1);
        this.$this_input = materialDialog;
        this.$callback = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(MaterialDialog materialDialog) {
        invoke2(materialDialog);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke */
    public final void invoke2(MaterialDialog it) {
        Intrinsics.checkParameterIsNotNull(it, "it");
        Function2 function2 = this.$callback;
        MaterialDialog materialDialog = this.$this_input;
        CharSequence text = DialogInputExtKt.getInputField(materialDialog).getText();
        if (text == null) {
            text = "";
        }
        function2.invoke(materialDialog, text);
    }
}