package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.a;
import java.util.Arrays;
/* loaded from: classes.dex */
public class f implements a.c {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* renamed from: b */
    private final long f3054b;

    /* loaded from: classes.dex */
    static class a implements Parcelable.Creator<f> {
        a() {
        }

        /* renamed from: a */
        public f createFromParcel(Parcel parcel) {
            return new f(parcel.readLong(), null);
        }

        /* renamed from: b */
        public f[] newArray(int i) {
            return new f[i];
        }
    }

    private f(long j) {
        this.f3054b = j;
    }

    /* synthetic */ f(long j, a aVar) {
        this(j);
    }

    public static f a(long j) {
        return new f(j);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && this.f3054b == ((f) obj).f3054b;
    }

    @Override // com.google.android.material.datepicker.a.c
    public boolean g(long j) {
        return j >= this.f3054b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f3054b)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f3054b);
    }
}
