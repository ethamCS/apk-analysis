package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
/* loaded from: classes.dex */
public final class l implements Comparable<l>, Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new a();

    /* renamed from: b */
    private final Calendar f3082b;

    /* renamed from: c */
    private final String f3083c;

    /* renamed from: d */
    final int f3084d;

    /* renamed from: e */
    final int f3085e;

    /* renamed from: f */
    final int f3086f;

    /* renamed from: g */
    final int f3087g;

    /* renamed from: h */
    final long f3088h;

    /* loaded from: classes.dex */
    static class a implements Parcelable.Creator<l> {
        a() {
        }

        /* renamed from: a */
        public l createFromParcel(Parcel parcel) {
            return l.c(parcel.readInt(), parcel.readInt());
        }

        /* renamed from: b */
        public l[] newArray(int i) {
            return new l[i];
        }
    }

    private l(Calendar calendar) {
        calendar.set(5, 1);
        Calendar d2 = s.d(calendar);
        this.f3082b = d2;
        this.f3084d = d2.get(2);
        this.f3085e = d2.get(1);
        this.f3086f = d2.getMaximum(7);
        this.f3087g = d2.getActualMaximum(5);
        this.f3083c = s.o().format(d2.getTime());
        this.f3088h = d2.getTimeInMillis();
    }

    public static l c(int i, int i2) {
        Calendar l = s.l();
        l.set(1, i);
        l.set(2, i2);
        return new l(l);
    }

    public static l k(long j) {
        Calendar l = s.l();
        l.setTimeInMillis(j);
        return new l(l);
    }

    public static l m() {
        return new l(s.j());
    }

    /* renamed from: a */
    public int compareTo(l lVar) {
        return this.f3082b.compareTo(lVar.f3082b);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f3084d == lVar.f3084d && this.f3085e == lVar.f3085e;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3084d), Integer.valueOf(this.f3085e)});
    }

    public int n() {
        int firstDayOfWeek = this.f3082b.get(7) - this.f3082b.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.f3086f : firstDayOfWeek;
    }

    public long o(int i) {
        Calendar d2 = s.d(this.f3082b);
        d2.set(5, i);
        return d2.getTimeInMillis();
    }

    public String p() {
        return this.f3083c;
    }

    public long q() {
        return this.f3082b.getTimeInMillis();
    }

    public l r(int i) {
        Calendar d2 = s.d(this.f3082b);
        d2.add(2, i);
        return new l(d2);
    }

    public int s(l lVar) {
        if (this.f3082b instanceof GregorianCalendar) {
            return ((lVar.f3085e - this.f3085e) * 12) + (lVar.f3084d - this.f3084d);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f3085e);
        parcel.writeInt(this.f3084d);
    }
}
