package com.afollestad.date.controllers;

import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* compiled from: DatePickerController.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/util/Calendar;", "invoke"}, k = 3, mv = {1, 1, 15})
/* loaded from: classes2.dex */
final class DatePickerController$setDayOfMonth$2 extends Lambda implements Function0<Calendar> {
    final /* synthetic */ Calendar $calendar;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatePickerController$setDayOfMonth$2(Calendar calendar) {
        super(0);
        this.$calendar = calendar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Calendar invoke() {
        return this.$calendar;
    }
}
