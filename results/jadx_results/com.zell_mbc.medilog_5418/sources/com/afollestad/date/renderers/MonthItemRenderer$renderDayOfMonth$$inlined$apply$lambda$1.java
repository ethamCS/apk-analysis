package com.afollestad.date.renderers;

import android.widget.TextView;
import com.afollestad.date.data.MonthItem;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: MonthItemRenderer.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/widget/TextView;", "invoke", "com/afollestad/date/renderers/MonthItemRenderer$renderDayOfMonth$4$1"}, k = 3, mv = {1, 1, 15})
/* loaded from: classes2.dex */
public final class MonthItemRenderer$renderDayOfMonth$$inlined$apply$lambda$1 extends Lambda implements Function1<TextView, Unit> {
    final /* synthetic */ MonthItem.DayOfMonth $dayOfMonth$inlined;
    final /* synthetic */ Function1 $onSelection$inlined;
    final /* synthetic */ MonthItemRenderer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MonthItemRenderer$renderDayOfMonth$$inlined$apply$lambda$1(MonthItemRenderer monthItemRenderer, Function1 function1, MonthItem.DayOfMonth dayOfMonth) {
        super(1);
        this.this$0 = monthItemRenderer;
        this.$onSelection$inlined = function1;
        this.$dayOfMonth$inlined = dayOfMonth;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(TextView textView) {
        invoke2(textView);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke */
    public final void invoke2(TextView it) {
        Intrinsics.checkParameterIsNotNull(it, "it");
        this.$onSelection$inlined.invoke(this.$dayOfMonth$inlined);
    }
}
