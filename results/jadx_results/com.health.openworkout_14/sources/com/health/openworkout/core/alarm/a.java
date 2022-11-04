package com.health.openworkout.core.alarm;

import java.util.Calendar;
/* loaded from: classes.dex */
public class a implements Comparable<a> {

    /* renamed from: b */
    private final int f3378b;

    /* renamed from: c */
    private final long f3379c;

    public a(int i, long j) {
        this.f3378b = i;
        this.f3379c = j;
    }

    private int a(long j, long j2) {
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        return i == 0 ? 0 : 1;
    }

    private long e() {
        return this.f3379c;
    }

    /* renamed from: b */
    public int compareTo(a aVar) {
        int a2 = a(this.f3378b, aVar.f3378b);
        return a2 == 0 ? a(this.f3379c, aVar.f3379c) : a2;
    }

    public int c() {
        return this.f3378b;
    }

    public Calendar d() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(e());
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(11, calendar.get(11));
        calendar2.set(12, calendar.get(12));
        calendar2.set(13, 0);
        calendar2.set(7, c());
        if (calendar2.before(Calendar.getInstance())) {
            calendar2.add(6, 7);
        }
        return calendar2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f3378b == aVar.f3378b && this.f3379c == aVar.f3379c;
    }

    public int hashCode() {
        long j = this.f3379c;
        return (this.f3378b * 31) + ((int) (j ^ (j >>> 32)));
    }
}
