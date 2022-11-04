package com.afollestad.date.managers;

import android.widget.TextView;
import com.afollestad.date.managers.DatePickerLayoutManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DatePickerLayoutManager.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/widget/TextView;", "invoke", "com/afollestad/date/managers/DatePickerLayoutManager$setupNavigationViews$1$1"}, k = 3, mv = {1, 1, 15})
/* loaded from: classes2.dex */
public final class DatePickerLayoutManager$setupNavigationViews$$inlined$apply$lambda$1 extends Lambda implements Function1<TextView, Unit> {
    final /* synthetic */ DatePickerLayoutManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatePickerLayoutManager$setupNavigationViews$$inlined$apply$lambda$1(DatePickerLayoutManager datePickerLayoutManager) {
        super(1);
        this.this$0 = datePickerLayoutManager;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(TextView textView) {
        invoke2(textView);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke */
    public final void invoke2(TextView it) {
        Intrinsics.checkParameterIsNotNull(it, "it");
        this.this$0.setMode(DatePickerLayoutManager.Mode.MONTH_LIST);
    }
}
