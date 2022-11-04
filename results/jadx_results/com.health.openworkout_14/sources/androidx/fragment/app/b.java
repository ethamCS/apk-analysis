package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.t;
import androidx.lifecycle.e;
import java.util.ArrayList;
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: b */
    final int[] f1030b;

    /* renamed from: c */
    final ArrayList<String> f1031c;

    /* renamed from: d */
    final int[] f1032d;

    /* renamed from: e */
    final int[] f1033e;

    /* renamed from: f */
    final int f1034f;

    /* renamed from: g */
    final String f1035g;

    /* renamed from: h */
    final int f1036h;
    final int i;
    final CharSequence j;
    final int k;
    final CharSequence l;
    final ArrayList<String> m;
    final ArrayList<String> n;
    final boolean o;

    /* loaded from: classes.dex */
    static class a implements Parcelable.Creator<b> {
        a() {
        }

        /* renamed from: a */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        /* renamed from: b */
        public b[] newArray(int i) {
            return new b[i];
        }
    }

    public b(Parcel parcel) {
        this.f1030b = parcel.createIntArray();
        this.f1031c = parcel.createStringArrayList();
        this.f1032d = parcel.createIntArray();
        this.f1033e = parcel.createIntArray();
        this.f1034f = parcel.readInt();
        this.f1035g = parcel.readString();
        this.f1036h = parcel.readInt();
        this.i = parcel.readInt();
        this.j = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.k = parcel.readInt();
        this.l = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.m = parcel.createStringArrayList();
        this.n = parcel.createStringArrayList();
        this.o = parcel.readInt() != 0;
    }

    public b(androidx.fragment.app.a aVar) {
        int size = aVar.f1121a.size();
        this.f1030b = new int[size * 5];
        if (aVar.f1127g) {
            this.f1031c = new ArrayList<>(size);
            this.f1032d = new int[size];
            this.f1033e = new int[size];
            int i = 0;
            int i2 = 0;
            while (i < size) {
                t.a aVar2 = aVar.f1121a.get(i);
                int i3 = i2 + 1;
                this.f1030b[i2] = aVar2.f1129a;
                ArrayList<String> arrayList = this.f1031c;
                Fragment fragment = aVar2.f1130b;
                arrayList.add(fragment != null ? fragment.f1016f : null);
                int[] iArr = this.f1030b;
                int i4 = i3 + 1;
                iArr[i3] = aVar2.f1131c;
                int i5 = i4 + 1;
                iArr[i4] = aVar2.f1132d;
                int i6 = i5 + 1;
                iArr[i5] = aVar2.f1133e;
                iArr[i6] = aVar2.f1134f;
                this.f1032d[i] = aVar2.f1135g.ordinal();
                this.f1033e[i] = aVar2.f1136h.ordinal();
                i++;
                i2 = i6 + 1;
            }
            this.f1034f = aVar.f1126f;
            this.f1035g = aVar.i;
            this.f1036h = aVar.t;
            this.i = aVar.j;
            this.j = aVar.k;
            this.k = aVar.l;
            this.l = aVar.m;
            this.m = aVar.n;
            this.n = aVar.o;
            this.o = aVar.p;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public androidx.fragment.app.a a(m mVar) {
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(mVar);
        int i = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = this.f1030b;
            if (i >= iArr.length) {
                aVar.f1126f = this.f1034f;
                aVar.i = this.f1035g;
                aVar.t = this.f1036h;
                aVar.f1127g = true;
                aVar.j = this.i;
                aVar.k = this.j;
                aVar.l = this.k;
                aVar.m = this.l;
                aVar.n = this.m;
                aVar.o = this.n;
                aVar.p = this.o;
                aVar.t(1);
                return aVar;
            }
            t.a aVar2 = new t.a();
            int i3 = i + 1;
            aVar2.f1129a = iArr[i];
            if (m.p0(2)) {
                Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i2 + " base fragment #" + this.f1030b[i3]);
            }
            String str = this.f1031c.get(i2);
            aVar2.f1130b = str != null ? mVar.V(str) : null;
            aVar2.f1135g = e.b.values()[this.f1032d[i2]];
            aVar2.f1136h = e.b.values()[this.f1033e[i2]];
            int[] iArr2 = this.f1030b;
            int i4 = i3 + 1;
            int i5 = iArr2[i3];
            aVar2.f1131c = i5;
            int i6 = i4 + 1;
            int i7 = iArr2[i4];
            aVar2.f1132d = i7;
            int i8 = i6 + 1;
            int i9 = iArr2[i6];
            aVar2.f1133e = i9;
            int i10 = iArr2[i8];
            aVar2.f1134f = i10;
            aVar.f1122b = i5;
            aVar.f1123c = i7;
            aVar.f1124d = i9;
            aVar.f1125e = i10;
            aVar.e(aVar2);
            i2++;
            i = i8 + 1;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f1030b);
        parcel.writeStringList(this.f1031c);
        parcel.writeIntArray(this.f1032d);
        parcel.writeIntArray(this.f1033e);
        parcel.writeInt(this.f1034f);
        parcel.writeString(this.f1035g);
        parcel.writeInt(this.f1036h);
        parcel.writeInt(this.i);
        TextUtils.writeToParcel(this.j, parcel, 0);
        parcel.writeInt(this.k);
        TextUtils.writeToParcel(this.l, parcel, 0);
        parcel.writeStringList(this.m);
        parcel.writeStringList(this.n);
        parcel.writeInt(this.o ? 1 : 0);
    }
}
