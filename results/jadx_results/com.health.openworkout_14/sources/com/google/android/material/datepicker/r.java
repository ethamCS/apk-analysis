package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;
/* loaded from: classes.dex */
class r {

    /* renamed from: c */
    private static final r f3100c = new r(null, null);

    /* renamed from: a */
    private final Long f3101a;

    /* renamed from: b */
    private final TimeZone f3102b;

    private r(Long l, TimeZone timeZone) {
        this.f3101a = l;
        this.f3102b = timeZone;
    }

    public static r c() {
        return f3100c;
    }

    public Calendar a() {
        return b(this.f3102b);
    }

    Calendar b(TimeZone timeZone) {
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l = this.f3101a;
        if (l != null) {
            calendar.setTimeInMillis(l.longValue());
        }
        return calendar;
    }
}
