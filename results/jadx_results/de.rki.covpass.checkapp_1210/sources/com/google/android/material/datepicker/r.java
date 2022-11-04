package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;
/* loaded from: classes.dex */
class r {

    /* renamed from: c */
    private static final r f7209c = new r(null, null);

    /* renamed from: a */
    private final Long f7210a;

    /* renamed from: b */
    private final TimeZone f7211b;

    private r(Long l10, TimeZone timeZone) {
        this.f7210a = l10;
        this.f7211b = timeZone;
    }

    public static r c() {
        return f7209c;
    }

    public Calendar a() {
        return b(this.f7211b);
    }

    Calendar b(TimeZone timeZone) {
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l10 = this.f7210a;
        if (l10 != null) {
            calendar.setTimeInMillis(l10.longValue());
        }
        return calendar;
    }
}
