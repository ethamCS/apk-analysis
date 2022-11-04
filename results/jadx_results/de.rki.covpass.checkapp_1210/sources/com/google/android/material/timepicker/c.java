package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* loaded from: classes.dex */
public class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();
    int U3;
    int V3;

    /* renamed from: c */
    private final com.google.android.material.timepicker.a f7781c;

    /* renamed from: d */
    private final com.google.android.material.timepicker.a f7782d;

    /* renamed from: q */
    final int f7783q;

    /* renamed from: x */
    int f7784x;

    /* renamed from: y */
    int f7785y;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<c> {
        a() {
        }

        /* renamed from: a */
        public c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        /* renamed from: b */
        public c[] newArray(int i10) {
            return new c[i10];
        }
    }

    public c() {
        this(0);
    }

    public c(int i10) {
        this(0, 0, 10, i10);
    }

    public c(int i10, int i11, int i12, int i13) {
        this.f7784x = i10;
        this.f7785y = i11;
        this.U3 = i12;
        this.f7783q = i13;
        this.V3 = d(i10);
        this.f7781c = new com.google.android.material.timepicker.a(59);
        this.f7782d = new com.google.android.material.timepicker.a(i13 == 1 ? 24 : 12);
    }

    protected c(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }

    public static String a(Resources resources, CharSequence charSequence) {
        return c(resources, charSequence, "%02d");
    }

    public static String c(Resources resources, CharSequence charSequence, String str) {
        return String.format(resources.getConfiguration().locale, str, Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
    }

    private static int d(int i10) {
        return i10 >= 12 ? 1 : 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f7784x == cVar.f7784x && this.f7785y == cVar.f7785y && this.f7783q == cVar.f7783q && this.U3 == cVar.U3;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f7783q), Integer.valueOf(this.f7784x), Integer.valueOf(this.f7785y), Integer.valueOf(this.U3)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f7784x);
        parcel.writeInt(this.f7785y);
        parcel.writeInt(this.U3);
        parcel.writeInt(this.f7783q);
    }
}
