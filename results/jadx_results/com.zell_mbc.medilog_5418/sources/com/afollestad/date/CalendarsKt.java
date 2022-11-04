package com.afollestad.date;

import com.afollestad.date.data.DayOfWeek;
import com.afollestad.date.data.DayOfWeekKt;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: Calendars.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\u001a\f\u0010\u0014\u001a\u00020\u0003*\u00020\u0003H\u0001\u001a\f\u0010\u0015\u001a\u00020\u0003*\u00020\u0003H\u0001\"(\u0010\u0002\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\u0000\u001a\u00020\u00018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007\"\u0018\u0010\b\u001a\u00020\t*\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\"(\u0010\f\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\u0000\u001a\u00020\u00018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u0005\"\u0004\b\u000e\u0010\u0007\"\u0015\u0010\u000f\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0005\"(\u0010\u0011\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\u0000\u001a\u00020\u00018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0005\"\u0004\b\u0013\u0010\u0007¨\u0006\u0016"}, d2 = {"value", "", "dayOfMonth", "Ljava/util/Calendar;", "getDayOfMonth", "(Ljava/util/Calendar;)I", "setDayOfMonth", "(Ljava/util/Calendar;I)V", "dayOfWeek", "Lcom/afollestad/date/data/DayOfWeek;", "getDayOfWeek", "(Ljava/util/Calendar;)Lcom/afollestad/date/data/DayOfWeek;", "month", "getMonth", "setMonth", "totalDaysInMonth", "getTotalDaysInMonth", "year", "getYear", "setYear", "decrementMonth", "incrementMonth", "com.afollestad.date-picker"}, k = 2, mv = {1, 1, 15})
/* loaded from: classes2.dex */
public final class CalendarsKt {
    public static final int getYear(Calendar year) {
        Intrinsics.checkParameterIsNotNull(year, "$this$year");
        return year.get(1);
    }

    public static final void setYear(Calendar year, int i) {
        Intrinsics.checkParameterIsNotNull(year, "$this$year");
        year.set(1, i);
    }

    public static final int getMonth(Calendar month) {
        Intrinsics.checkParameterIsNotNull(month, "$this$month");
        return month.get(2);
    }

    public static final void setMonth(Calendar month, int i) {
        Intrinsics.checkParameterIsNotNull(month, "$this$month");
        month.set(2, i);
    }

    public static final int getDayOfMonth(Calendar dayOfMonth) {
        Intrinsics.checkParameterIsNotNull(dayOfMonth, "$this$dayOfMonth");
        return dayOfMonth.get(5);
    }

    public static final void setDayOfMonth(Calendar dayOfMonth, int i) {
        Intrinsics.checkParameterIsNotNull(dayOfMonth, "$this$dayOfMonth");
        dayOfMonth.set(5, i);
    }

    public static final int getTotalDaysInMonth(Calendar totalDaysInMonth) {
        Intrinsics.checkParameterIsNotNull(totalDaysInMonth, "$this$totalDaysInMonth");
        return totalDaysInMonth.getActualMaximum(5);
    }

    public static final Calendar incrementMonth(Calendar incrementMonth) {
        Intrinsics.checkParameterIsNotNull(incrementMonth, "$this$incrementMonth");
        Object clone = incrementMonth.clone();
        if (clone == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.util.Calendar");
        }
        Calendar calendar = (Calendar) clone;
        calendar.add(2, 1);
        calendar.set(5, 1);
        return calendar;
    }

    public static final Calendar decrementMonth(Calendar decrementMonth) {
        Intrinsics.checkParameterIsNotNull(decrementMonth, "$this$decrementMonth");
        Object clone = decrementMonth.clone();
        if (clone == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.util.Calendar");
        }
        Calendar calendar = (Calendar) clone;
        calendar.add(2, -1);
        calendar.set(5, getTotalDaysInMonth(calendar));
        return calendar;
    }

    public static final DayOfWeek getDayOfWeek(Calendar dayOfWeek) {
        Intrinsics.checkParameterIsNotNull(dayOfWeek, "$this$dayOfWeek");
        return DayOfWeekKt.asDayOfWeek(dayOfWeek.get(7));
    }
}
