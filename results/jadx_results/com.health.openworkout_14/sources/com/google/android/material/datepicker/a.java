package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0072a();

    /* renamed from: b */
    private final l f3028b;

    /* renamed from: c */
    private final l f3029c;

    /* renamed from: d */
    private final l f3030d;

    /* renamed from: e */
    private final c f3031e;

    /* renamed from: f */
    private final int f3032f;

    /* renamed from: g */
    private final int f3033g;

    /* renamed from: com.google.android.material.datepicker.a$a */
    /* loaded from: classes.dex */
    public static class C0072a implements Parcelable.Creator<a> {
        C0072a() {
        }

        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return new a((l) parcel.readParcelable(l.class.getClassLoader()), (l) parcel.readParcelable(l.class.getClassLoader()), (l) parcel.readParcelable(l.class.getClassLoader()), (c) parcel.readParcelable(c.class.getClassLoader()), null);
        }

        /* renamed from: b */
        public a[] newArray(int i) {
            return new a[i];
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: e */
        static final long f3034e = s.a(l.c(1900, 0).f3088h);

        /* renamed from: f */
        static final long f3035f = s.a(l.c(2100, 11).f3088h);

        /* renamed from: a */
        private long f3036a;

        /* renamed from: b */
        private long f3037b;

        /* renamed from: c */
        private Long f3038c;

        /* renamed from: d */
        private c f3039d;

        public b(a aVar) {
            this.f3036a = f3034e;
            this.f3037b = f3035f;
            this.f3039d = f.a(Long.MIN_VALUE);
            this.f3036a = aVar.f3028b.f3088h;
            this.f3037b = aVar.f3029c.f3088h;
            this.f3038c = Long.valueOf(aVar.f3030d.f3088h);
            this.f3039d = aVar.f3031e;
        }

        public a a() {
            if (this.f3038c == null) {
                long a2 = i.a2();
                long j = this.f3036a;
                if (j > a2 || a2 > this.f3037b) {
                    a2 = j;
                }
                this.f3038c = Long.valueOf(a2);
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f3039d);
            return new a(l.k(this.f3036a), l.k(this.f3037b), l.k(this.f3038c.longValue()), (c) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY"), null);
        }

        public b b(long j) {
            this.f3038c = Long.valueOf(j);
            return this;
        }
    }

    /* loaded from: classes.dex */
    public interface c extends Parcelable {
        boolean g(long j);
    }

    private a(l lVar, l lVar2, l lVar3, c cVar) {
        this.f3028b = lVar;
        this.f3029c = lVar2;
        this.f3030d = lVar3;
        this.f3031e = cVar;
        if (lVar.compareTo(lVar3) <= 0) {
            if (lVar3.compareTo(lVar2) > 0) {
                throw new IllegalArgumentException("current Month cannot be after end Month");
            }
            this.f3033g = lVar.s(lVar2) + 1;
            this.f3032f = (lVar2.f3085e - lVar.f3085e) + 1;
            return;
        }
        throw new IllegalArgumentException("start Month cannot be after current Month");
    }

    /* synthetic */ a(l lVar, l lVar2, l lVar3, c cVar, C0072a c0072a) {
        this(lVar, lVar2, lVar3, cVar);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f3028b.equals(aVar.f3028b) && this.f3029c.equals(aVar.f3029c) && this.f3030d.equals(aVar.f3030d) && this.f3031e.equals(aVar.f3031e);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3028b, this.f3029c, this.f3030d, this.f3031e});
    }

    public l n(l lVar) {
        return lVar.compareTo(this.f3028b) < 0 ? this.f3028b : lVar.compareTo(this.f3029c) > 0 ? this.f3029c : lVar;
    }

    public c o() {
        return this.f3031e;
    }

    public l p() {
        return this.f3029c;
    }

    public int q() {
        return this.f3033g;
    }

    public l r() {
        return this.f3030d;
    }

    public l s() {
        return this.f3028b;
    }

    public int t() {
        return this.f3032f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f3028b, 0);
        parcel.writeParcelable(this.f3029c, 0);
        parcel.writeParcelable(this.f3030d, 0);
        parcel.writeParcelable(this.f3031e, 0);
    }
}
