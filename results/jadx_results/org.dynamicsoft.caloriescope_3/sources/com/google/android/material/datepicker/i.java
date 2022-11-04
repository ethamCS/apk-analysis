package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
/* loaded from: classes.dex */
public final class i implements Comparable<i>, Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new a();

    /* renamed from: b */
    private final Calendar f1473b;

    /* renamed from: c */
    private final String f1474c;
    final int d;
    final int e;
    final int f;
    final int g;

    /* loaded from: classes.dex */
    static class a implements Parcelable.Creator<i> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public i createFromParcel(Parcel parcel) {
            return i.a(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public i[] newArray(int i) {
            return new i[i];
        }
    }

    private i(Calendar calendar) {
        calendar.set(5, 1);
        Calendar a2 = o.a(calendar);
        this.f1473b = a2;
        this.d = a2.get(2);
        this.e = this.f1473b.get(1);
        this.f = this.f1473b.getMaximum(7);
        this.g = this.f1473b.getActualMaximum(5);
        this.f1474c = o.e().format(this.f1473b.getTime());
        this.f1473b.getTimeInMillis();
    }

    public static i a(int i, int i2) {
        Calendar d = o.d();
        d.set(1, i);
        d.set(2, i2);
        return new i(d);
    }

    public static i g() {
        return new i(o.b());
    }

    /* renamed from: a */
    public int compareTo(i iVar) {
        return this.f1473b.compareTo(iVar.f1473b);
    }

    public long a(int i) {
        Calendar a2 = o.a(this.f1473b);
        a2.set(5, i);
        return a2.getTimeInMillis();
    }

    public int b(i iVar) {
        if (this.f1473b instanceof GregorianCalendar) {
            return ((iVar.e - this.e) * 12) + (iVar.d - this.d);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    public i b(int i) {
        Calendar a2 = o.a(this.f1473b);
        a2.add(2, i);
        return new i(a2);
    }

    public int d() {
        int firstDayOfWeek = this.f1473b.get(7) - this.f1473b.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.f : firstDayOfWeek;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String e() {
        return this.f1474c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.d == iVar.d && this.e == iVar.e;
    }

    public long f() {
        return this.f1473b.getTimeInMillis();
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.d), Integer.valueOf(this.e)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.e);
        parcel.writeInt(this.d);
    }
}
