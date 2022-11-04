package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.n;
import androidx.lifecycle.e;
import java.util.ArrayList;
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: b */
    final int[] f892b;

    /* renamed from: c */
    final ArrayList<String> f893c;
    final int[] d;
    final int[] e;
    final int f;
    final int g;
    final String h;
    final int i;
    final int j;
    final CharSequence k;
    final int l;
    final CharSequence m;
    final ArrayList<String> n;
    final ArrayList<String> o;
    final boolean p;

    /* loaded from: classes.dex */
    static class a implements Parcelable.Creator<b> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public b[] newArray(int i) {
            return new b[i];
        }
    }

    public b(Parcel parcel) {
        this.f892b = parcel.createIntArray();
        this.f893c = parcel.createStringArrayList();
        this.d = parcel.createIntArray();
        this.e = parcel.createIntArray();
        this.f = parcel.readInt();
        this.g = parcel.readInt();
        this.h = parcel.readString();
        this.i = parcel.readInt();
        this.j = parcel.readInt();
        this.k = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.l = parcel.readInt();
        this.m = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.n = parcel.createStringArrayList();
        this.o = parcel.createStringArrayList();
        this.p = parcel.readInt() != 0;
    }

    public b(androidx.fragment.app.a aVar) {
        int size = aVar.f929a.size();
        this.f892b = new int[size * 5];
        if (aVar.h) {
            this.f893c = new ArrayList<>(size);
            this.d = new int[size];
            this.e = new int[size];
            int i = 0;
            int i2 = 0;
            while (i < size) {
                n.a aVar2 = aVar.f929a.get(i);
                int i3 = i2 + 1;
                this.f892b[i2] = aVar2.f932a;
                ArrayList<String> arrayList = this.f893c;
                Fragment fragment = aVar2.f933b;
                arrayList.add(fragment != null ? fragment.f : null);
                int[] iArr = this.f892b;
                int i4 = i3 + 1;
                iArr[i3] = aVar2.f934c;
                int i5 = i4 + 1;
                iArr[i4] = aVar2.d;
                int i6 = i5 + 1;
                iArr[i5] = aVar2.e;
                iArr[i6] = aVar2.f;
                this.d[i] = aVar2.g.ordinal();
                this.e[i] = aVar2.h.ordinal();
                i++;
                i2 = i6 + 1;
            }
            this.f = aVar.f;
            this.g = aVar.g;
            this.h = aVar.i;
            this.i = aVar.t;
            this.j = aVar.j;
            this.k = aVar.k;
            this.l = aVar.l;
            this.m = aVar.m;
            this.n = aVar.n;
            this.o = aVar.o;
            this.p = aVar.p;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public androidx.fragment.app.a a(j jVar) {
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(jVar);
        int i = 0;
        int i2 = 0;
        while (i < this.f892b.length) {
            n.a aVar2 = new n.a();
            int i3 = i + 1;
            aVar2.f932a = this.f892b[i];
            if (j.I) {
                Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i2 + " base fragment #" + this.f892b[i3]);
            }
            String str = this.f893c.get(i2);
            aVar2.f933b = str != null ? jVar.h.get(str) : null;
            aVar2.g = e.b.values()[this.d[i2]];
            aVar2.h = e.b.values()[this.e[i2]];
            int[] iArr = this.f892b;
            int i4 = i3 + 1;
            int i5 = iArr[i3];
            aVar2.f934c = i5;
            int i6 = i4 + 1;
            int i7 = iArr[i4];
            aVar2.d = i7;
            int i8 = i6 + 1;
            int i9 = iArr[i6];
            aVar2.e = i9;
            int i10 = iArr[i8];
            aVar2.f = i10;
            aVar.f930b = i5;
            aVar.f931c = i7;
            aVar.d = i9;
            aVar.e = i10;
            aVar.a(aVar2);
            i2++;
            i = i8 + 1;
        }
        aVar.f = this.f;
        aVar.g = this.g;
        aVar.i = this.h;
        aVar.t = this.i;
        aVar.h = true;
        aVar.j = this.j;
        aVar.k = this.k;
        aVar.l = this.l;
        aVar.m = this.m;
        aVar.n = this.n;
        aVar.o = this.o;
        aVar.p = this.p;
        aVar.a(1);
        return aVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f892b);
        parcel.writeStringList(this.f893c);
        parcel.writeIntArray(this.d);
        parcel.writeIntArray(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        parcel.writeString(this.h);
        parcel.writeInt(this.i);
        parcel.writeInt(this.j);
        TextUtils.writeToParcel(this.k, parcel, 0);
        parcel.writeInt(this.l);
        TextUtils.writeToParcel(this.m, parcel, 0);
        parcel.writeStringList(this.n);
        parcel.writeStringList(this.o);
        parcel.writeInt(this.p ? 1 : 0);
    }
}
