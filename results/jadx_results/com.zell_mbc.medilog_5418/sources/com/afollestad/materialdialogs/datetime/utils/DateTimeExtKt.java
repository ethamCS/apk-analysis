package com.afollestad.materialdialogs.datetime.utils;

import android.widget.TimePicker;
import com.afollestad.date.DatePicker;
import java.util.Calendar;
import java.util.GregorianCalendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: DateTimeExt.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\f\u0010\b\u001a\u00020\u0001*\u00020\u0003H\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0005H\u0000\u001a\f\u0010\u0006\u001a\u00020\u0007*\u00020\u0005H\u0000¨\u0006\t"}, d2 = {"isFutureTime", "", "datePicker", "Lcom/afollestad/date/DatePicker;", "timePicker", "Landroid/widget/TimePicker;", "toCalendar", "Ljava/util/Calendar;", "isFutureDate", "datetime"}, k = 2, mv = {1, 1, 16})
/* loaded from: classes2.dex */
public final class DateTimeExtKt {
    public static final boolean isFutureTime(DatePicker datePicker, TimePicker timePicker) {
        Intrinsics.checkParameterIsNotNull(datePicker, "datePicker");
        Intrinsics.checkParameterIsNotNull(timePicker, "timePicker");
        Calendar now = Calendar.getInstance();
        long timeInMillis = toCalendar(datePicker, timePicker).getTimeInMillis();
        Intrinsics.checkExpressionValueIsNotNull(now, "now");
        return timeInMillis >= now.getTimeInMillis();
    }

    public static final boolean isFutureTime(TimePicker isFutureTime) {
        Intrinsics.checkParameterIsNotNull(isFutureTime, "$this$isFutureTime");
        Calendar now = Calendar.getInstance();
        long timeInMillis = toCalendar(isFutureTime).getTimeInMillis();
        Intrinsics.checkExpressionValueIsNotNull(now, "now");
        return timeInMillis >= now.getTimeInMillis();
    }

    public static final boolean isFutureDate(DatePicker isFutureDate) {
        Intrinsics.checkParameterIsNotNull(isFutureDate, "$this$isFutureDate");
        Calendar now = Calendar.getInstance();
        Calendar date = isFutureDate.getDate();
        if (date == null) {
            Intrinsics.throwNpe();
        }
        long timeInMillis = date.getTimeInMillis();
        Intrinsics.checkExpressionValueIsNotNull(now, "now");
        return timeInMillis >= now.getTimeInMillis();
    }

    public static final Calendar toCalendar(TimePicker toCalendar) {
        Intrinsics.checkParameterIsNotNull(toCalendar, "$this$toCalendar");
        Calendar calendar = Calendar.getInstance();
        return new GregorianCalendar(calendar.get(1), calendar.get(2), calendar.get(5), ViewExtKt.hour(toCalendar), ViewExtKt.minute(toCalendar));
    }

    public static final Calendar toCalendar(DatePicker datePicker, TimePicker timePicker) {
        Intrinsics.checkParameterIsNotNull(datePicker, "datePicker");
        Intrinsics.checkParameterIsNotNull(timePicker, "timePicker");
        Calendar date = datePicker.getDate();
        if (date == null) {
            Intrinsics.throwNpe();
        }
        date.set(11, ViewExtKt.hour(timePicker));
        date.set(12, ViewExtKt.minute(timePicker));
        return date;
    }
}
