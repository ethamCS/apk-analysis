package com.afollestad.date.managers;

import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: DatePickerLayoutManager.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/widget/ImageView;", "invoke"}, k = 3, mv = {1, 1, 15})
/* loaded from: classes2.dex */
final class DatePickerLayoutManager$onNavigate$1 extends Lambda implements Function1<ImageView, Unit> {
    final /* synthetic */ Function0 $onGoToPrevious;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatePickerLayoutManager$onNavigate$1(Function0 function0) {
        super(1);
        this.$onGoToPrevious = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ImageView imageView) {
        invoke2(imageView);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke */
    public final void invoke2(ImageView it) {
        Intrinsics.checkParameterIsNotNull(it, "it");
        this.$onGoToPrevious.invoke();
    }
}
