package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0103a();
    private final int U3;

    /* renamed from: c */
    private final l f7107c;

    /* renamed from: d */
    private final l f7108d;

    /* renamed from: q */
    private final c f7109q;

    /* renamed from: x */
    private l f7110x;

    /* renamed from: y */
    private final int f7111y;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.datepicker.a$a */
    /* loaded from: classes.dex */
    public class C0103a implements Parcelable.Creator<a> {
        C0103a() {
        }

        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return new a((l) parcel.readParcelable(l.class.getClassLoader()), (l) parcel.readParcelable(l.class.getClassLoader()), (c) parcel.readParcelable(c.class.getClassLoader()), (l) parcel.readParcelable(l.class.getClassLoader()), null);
        }

        /* renamed from: b */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: e */
        static final long f7112e = s.a(l.d(1900, 0).U3);

        /* renamed from: f */
        static final long f7113f = s.a(l.d(2100, 11).U3);

        /* renamed from: a */
        private long f7114a;

        /* renamed from: b */
        private long f7115b;

        /* renamed from: c */
        private Long f7116c;

        /* renamed from: d */
        private c f7117d;

        public b(a aVar) {
            this.f7114a = f7112e;
            this.f7115b = f7113f;
            this.f7117d = f.a(Long.MIN_VALUE);
            this.f7114a = aVar.f7107c.U3;
            this.f7115b = aVar.f7108d.U3;
            this.f7116c = Long.valueOf(aVar.f7110x.U3);
            this.f7117d = aVar.f7109q;
        }

        public a a() {
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f7117d);
            l l10 = l.l(this.f7114a);
            l l11 = l.l(this.f7115b);
            c cVar = (c) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            Long l12 = this.f7116c;
            return new a(l10, l11, cVar, l12 == null ? null : l.l(l12.longValue()), null);
        }

        public b b(long j10) {
            this.f7116c = Long.valueOf(j10);
            return this;
        }
    }

    /* loaded from: classes.dex */
    public interface c extends Parcelable {
        boolean p(long j10);
    }

    private a(l lVar, l lVar2, c cVar, l lVar3) {
        this.f7107c = lVar;
        this.f7108d = lVar2;
        this.f7110x = lVar3;
        this.f7109q = cVar;
        if (lVar3 == null || lVar.compareTo(lVar3) <= 0) {
            if (lVar3 != null && lVar3.compareTo(lVar2) > 0) {
                throw new IllegalArgumentException("current Month cannot be after end Month");
            }
            this.U3 = lVar.B(lVar2) + 1;
            this.f7111y = (lVar2.f7192q - lVar.f7192q) + 1;
            return;
        }
        throw new IllegalArgumentException("start Month cannot be after current Month");
    }

    /* synthetic */ a(l lVar, l lVar2, c cVar, l lVar3, C0103a c0103a) {
        this(lVar, lVar2, cVar, lVar3);
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
        return this.f7107c.equals(aVar.f7107c) && this.f7108d.equals(aVar.f7108d) && androidx.core.util.c.a(this.f7110x, aVar.f7110x) && this.f7109q.equals(aVar.f7109q);
    }

    public l f(l lVar) {
        return lVar.compareTo(this.f7107c) < 0 ? this.f7107c : lVar.compareTo(this.f7108d) > 0 ? this.f7108d : lVar;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7107c, this.f7108d, this.f7110x, this.f7109q});
    }

    public c i() {
        return this.f7109q;
    }

    public l k() {
        return this.f7108d;
    }

    public int l() {
        return this.U3;
    }

    public l m() {
        return this.f7110x;
    }

    public l n() {
        return this.f7107c;
    }

    public int o() {
        return this.f7111y;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f7107c, 0);
        parcel.writeParcelable(this.f7108d, 0);
        parcel.writeParcelable(this.f7110x, 0);
        parcel.writeParcelable(this.f7109q, 0);
    }
}
