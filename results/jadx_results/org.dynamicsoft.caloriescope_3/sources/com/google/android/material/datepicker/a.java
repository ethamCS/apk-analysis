package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0064a();

    /* renamed from: b */
    private final i f1447b;

    /* renamed from: c */
    private final i f1448c;
    private final i d;
    private final b e;
    private final int f;
    private final int g;

    /* renamed from: com.google.android.material.datepicker.a$a */
    /* loaded from: classes.dex */
    static class C0064a implements Parcelable.Creator<a> {
        C0064a() {
        }

        @Override // android.os.Parcelable.Creator
        public a createFromParcel(Parcel parcel) {
            return new a((i) parcel.readParcelable(i.class.getClassLoader()), (i) parcel.readParcelable(i.class.getClassLoader()), (i) parcel.readParcelable(i.class.getClassLoader()), (b) parcel.readParcelable(b.class.getClassLoader()), null);
        }

        @Override // android.os.Parcelable.Creator
        public a[] newArray(int i) {
            return new a[i];
        }
    }

    /* loaded from: classes.dex */
    public interface b extends Parcelable {
        boolean b(long j);
    }

    private a(i iVar, i iVar2, i iVar3, b bVar) {
        this.f1447b = iVar;
        this.f1448c = iVar2;
        this.d = iVar3;
        this.e = bVar;
        if (iVar.compareTo(iVar3) <= 0) {
            if (iVar3.compareTo(iVar2) > 0) {
                throw new IllegalArgumentException("current Month cannot be after end Month");
            }
            this.g = iVar.b(iVar2) + 1;
            this.f = (iVar2.e - iVar.e) + 1;
            return;
        }
        throw new IllegalArgumentException("start Month cannot be after current Month");
    }

    /* synthetic */ a(i iVar, i iVar2, i iVar3, b bVar, C0064a c0064a) {
        this(iVar, iVar2, iVar3, bVar);
    }

    public b d() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public i e() {
        return this.f1448c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f1447b.equals(aVar.f1447b) && this.f1448c.equals(aVar.f1448c) && this.d.equals(aVar.d) && this.e.equals(aVar.e);
    }

    public int f() {
        return this.g;
    }

    public i g() {
        return this.d;
    }

    public i h() {
        return this.f1447b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1447b, this.f1448c, this.d, this.e});
    }

    public int i() {
        return this.f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f1447b, 0);
        parcel.writeParcelable(this.f1448c, 0);
        parcel.writeParcelable(this.d, 0);
        parcel.writeParcelable(this.e, 0);
    }
}
