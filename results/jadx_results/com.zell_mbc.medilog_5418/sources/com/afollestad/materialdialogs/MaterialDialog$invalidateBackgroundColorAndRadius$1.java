package com.afollestad.materialdialogs;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: MaterialDialog.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 16})
/* loaded from: classes2.dex */
public final class MaterialDialog$invalidateBackgroundColorAndRadius$1 extends Lambda implements Function0<Float> {
    final /* synthetic */ MaterialDialog this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaterialDialog$invalidateBackgroundColorAndRadius$1(MaterialDialog materialDialog) {
        super(0);
        this.this$0 = materialDialog;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Float, float] */
    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        Context context = this.this$0.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        return context.getResources().getDimension(R.dimen.md_dialog_default_corner_radius);
    }
}
