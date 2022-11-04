package com.afollestad.materialdialogs.datetime.internal;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
/* compiled from: WrapContentViewPager.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "child", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 1, 16})
/* loaded from: classes2.dex */
final class WrapContentViewPager$onMeasure$1 extends Lambda implements Function1<View, Unit> {
    final /* synthetic */ Ref.IntRef $maxChildHeight;
    final /* synthetic */ int $widthMeasureSpec;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrapContentViewPager$onMeasure$1(int i, Ref.IntRef intRef) {
        super(1);
        this.$widthMeasureSpec = i;
        this.$maxChildHeight = intRef;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(View view) {
        invoke2(view);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke */
    public final void invoke2(View child) {
        Intrinsics.checkParameterIsNotNull(child, "child");
        child.measure(this.$widthMeasureSpec, View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = child.getMeasuredHeight();
        if (measuredHeight > this.$maxChildHeight.element) {
            this.$maxChildHeight.element = measuredHeight;
        }
    }
}
