package com.afollestad.date.data.snapshot;

import com.afollestad.date.CalendarsKt;
import java.util.Calendar;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: MonthSnapshot.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0001\u001a\f\u0010\u0005\u001a\u00020\u0002*\u00020\u0001H\u0001¨\u0006\u0006"}, d2 = {"asCalendar", "Ljava/util/Calendar;", "Lcom/afollestad/date/data/snapshot/MonthSnapshot;", "day", "", "snapshotMonth", "com.afollestad.date-picker"}, k = 2, mv = {1, 1, 15})
/* loaded from: classes2.dex */
public final class MonthSnapshotKt {
    public static final MonthSnapshot snapshotMonth(Calendar snapshotMonth) {
        Intrinsics.checkParameterIsNotNull(snapshotMonth, "$this$snapshotMonth");
        return new MonthSnapshot(CalendarsKt.getMonth(snapshotMonth), CalendarsKt.getYear(snapshotMonth));
    }

    public static final Calendar asCalendar(MonthSnapshot asCalendar, int i) {
        Intrinsics.checkParameterIsNotNull(asCalendar, "$this$asCalendar");
        Calendar calendar = Calendar.getInstance(Locale.getDefault());
        Intrinsics.checkExpressionValueIsNotNull(calendar, "this");
        CalendarsKt.setYear(calendar, asCalendar.getYear());
        CalendarsKt.setMonth(calendar, asCalendar.getMonth());
        CalendarsKt.setDayOfMonth(calendar, i);
        Intrinsics.checkExpressionValueIsNotNull(calendar, "Calendar.getInstance(Loc….dayOfMonth = day\n      }");
        return calendar;
    }
}
