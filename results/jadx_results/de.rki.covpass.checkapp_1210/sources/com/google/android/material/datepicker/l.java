package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
/* loaded from: classes.dex */
public final class l implements Comparable<l>, Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new a();
    final long U3;
    private String V3;

    /* renamed from: c */
    private final Calendar f7190c;

    /* renamed from: d */
    final int f7191d;

    /* renamed from: q */
    final int f7192q;

    /* renamed from: x */
    final int f7193x;

    /* renamed from: y */
    final int f7194y;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<l> {
        a() {
        }

        /* renamed from: a */
        public l createFromParcel(Parcel parcel) {
            return l.d(parcel.readInt(), parcel.readInt());
        }

        /* renamed from: b */
        public l[] newArray(int i10) {
            return new l[i10];
        }
    }

    private l(Calendar calendar) {
        calendar.set(5, 1);
        Calendar d10 = s.d(calendar);
        this.f7190c = d10;
        this.f7191d = d10.get(2);
        this.f7192q = d10.get(1);
        this.f7193x = d10.getMaximum(7);
        this.f7194y = d10.getActualMaximum(5);
        this.U3 = d10.getTimeInMillis();
    }

    public static l d(int i10, int i11) {
        Calendar k10 = s.k();
        k10.set(1, i10);
        k10.set(2, i11);
        return new l(k10);
    }

    public static l l(long j10) {
        Calendar k10 = s.k();
        k10.setTimeInMillis(j10);
        return new l(k10);
    }

    public static l m() {
        return new l(s.i());
    }

    public l A(int i10) {
        Calendar d10 = s.d(this.f7190c);
        d10.add(2, i10);
        return new l(d10);
    }

    public int B(l lVar) {
        if (this.f7190c instanceof GregorianCalendar) {
            return ((lVar.f7192q - this.f7192q) * 12) + (lVar.f7191d - this.f7191d);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    /* renamed from: a */
    public int compareTo(l lVar) {
        return this.f7190c.compareTo(lVar.f7190c);
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
        return this.f7191d == lVar.f7191d && this.f7192q == lVar.f7192q;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f7191d), Integer.valueOf(this.f7192q)});
    }

    public int o() {
        int firstDayOfWeek = this.f7190c.get(7) - this.f7190c.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.f7193x : firstDayOfWeek;
    }

    public long q(int i10) {
        Calendar d10 = s.d(this.f7190c);
        d10.set(5, i10);
        return d10.getTimeInMillis();
    }

    public int w(long j10) {
        Calendar d10 = s.d(this.f7190c);
        d10.setTimeInMillis(j10);
        return d10.get(5);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f7192q);
        parcel.writeInt(this.f7191d);
    }

    public String y() {
        if (this.V3 == null) {
            this.V3 = e.c(this.f7190c.getTimeInMillis());
        }
        return this.V3;
    }

    public long z() {
        return this.f7190c.getTimeInMillis();
    }
}
