package com.afollestad.materialdialogs.datetime;

import android.widget.TimePicker;
import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.WhichButton;
import com.afollestad.materialdialogs.actions.DialogActionExtKt;
import com.afollestad.materialdialogs.datetime.utils.DateTimeExtKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: TimePickerExt.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/widget/TimePicker;", "invoke"}, k = 3, mv = {1, 1, 16})
/* loaded from: classes2.dex */
final class TimePickerExtKt$timePicker$changeListener$1 extends Lambda implements Function1<TimePicker, Unit> {
    final /* synthetic */ boolean $requireFutureTime;
    final /* synthetic */ MaterialDialog $this_timePicker;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerExtKt$timePicker$changeListener$1(MaterialDialog materialDialog, boolean z) {
        super(1);
        this.$this_timePicker = materialDialog;
        this.$requireFutureTime = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(TimePicker timePicker) {
        invoke2(timePicker);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke */
    public final void invoke2(TimePicker it) {
        Intrinsics.checkParameterIsNotNull(it, "it");
        DialogActionExtKt.setActionButtonEnabled(this.$this_timePicker, WhichButton.POSITIVE, !this.$requireFutureTime || DateTimeExtKt.isFutureTime(it));
    }
}
