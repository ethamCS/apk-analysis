package com.afollestad.materialdialogs.internal.main;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: DialogScrollView.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/afollestad/materialdialogs/internal/main/DialogScrollView;", "invoke"}, k = 3, mv = {1, 1, 16})
/* loaded from: classes2.dex */
final class DialogScrollView$onAttachedToWindow$1 extends Lambda implements Function1<DialogScrollView, Unit> {
    public static final DialogScrollView$onAttachedToWindow$1 INSTANCE = new DialogScrollView$onAttachedToWindow$1();

    DialogScrollView$onAttachedToWindow$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(DialogScrollView dialogScrollView) {
        invoke2(dialogScrollView);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke */
    public final void invoke2(DialogScrollView receiver) {
        Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        receiver.invalidateDividers();
        receiver.invalidateOverScroll();
    }
}
