package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.r;
import com.google.android.material.internal.h;
/* loaded from: classes.dex */
public class d implements m {

    /* renamed from: b */
    private g f1423b;

    /* renamed from: c */
    private c f1424c;
    private boolean d = false;
    private int e;

    /* loaded from: classes.dex */
    public static class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C0062a();

        /* renamed from: b */
        int f1425b;

        /* renamed from: c */
        h f1426c;

        /* renamed from: com.google.android.material.bottomnavigation.d$a$a */
        /* loaded from: classes.dex */
        static class C0062a implements Parcelable.Creator<a> {
            C0062a() {
            }

            @Override // android.os.Parcelable.Creator
            public a createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public a[] newArray(int i) {
                return new a[i];
            }
        }

        a() {
        }

        a(Parcel parcel) {
            this.f1425b = parcel.readInt();
            this.f1426c = (h) parcel.readParcelable(a.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f1425b);
            parcel.writeParcelable(this.f1426c, 0);
        }
    }

    public void a(int i) {
        this.e = i;
    }

    @Override // androidx.appcompat.view.menu.m
    public void a(Context context, g gVar) {
        this.f1423b = gVar;
        this.f1424c.a(gVar);
    }

    @Override // androidx.appcompat.view.menu.m
    public void a(Parcelable parcelable) {
        if (parcelable instanceof a) {
            a aVar = (a) parcelable;
            this.f1424c.b(aVar.f1425b);
            this.f1424c.setBadgeDrawables(b.a.a.a.n.b.a(this.f1424c.getContext(), aVar.f1426c));
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public void a(g gVar, boolean z) {
    }

    @Override // androidx.appcompat.view.menu.m
    public void a(m.a aVar) {
    }

    public void a(c cVar) {
        this.f1424c = cVar;
    }

    @Override // androidx.appcompat.view.menu.m
    public void a(boolean z) {
        if (this.d) {
            return;
        }
        if (z) {
            this.f1424c.a();
        } else {
            this.f1424c.c();
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean a(g gVar, i iVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean a(r rVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public int b() {
        return this.e;
    }

    public void b(boolean z) {
        this.d = z;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean b(g gVar, i iVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean c() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public Parcelable f() {
        a aVar = new a();
        aVar.f1425b = this.f1424c.getSelectedItemId();
        aVar.f1426c = b.a.a.a.n.b.a(this.f1424c.getBadgeDrawables());
        return aVar;
    }
}
