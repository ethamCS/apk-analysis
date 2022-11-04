package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.f0;
import androidx.lifecycle.m;
import java.util.ArrayList;
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();
    final String U3;
    final int V3;
    final int W3;
    final CharSequence X3;
    final int Y3;
    final CharSequence Z3;

    /* renamed from: a4 */
    final ArrayList<String> f3982a4;

    /* renamed from: b4 */
    final ArrayList<String> f3983b4;

    /* renamed from: c */
    final int[] f3984c;

    /* renamed from: c4 */
    final boolean f3985c4;

    /* renamed from: d */
    final ArrayList<String> f3986d;

    /* renamed from: q */
    final int[] f3987q;

    /* renamed from: x */
    final int[] f3988x;

    /* renamed from: y */
    final int f3989y;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<b> {
        a() {
        }

        /* renamed from: a */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        /* renamed from: b */
        public b[] newArray(int i10) {
            return new b[i10];
        }
    }

    b(Parcel parcel) {
        this.f3984c = parcel.createIntArray();
        this.f3986d = parcel.createStringArrayList();
        this.f3987q = parcel.createIntArray();
        this.f3988x = parcel.createIntArray();
        this.f3989y = parcel.readInt();
        this.U3 = parcel.readString();
        this.V3 = parcel.readInt();
        this.W3 = parcel.readInt();
        this.X3 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.Y3 = parcel.readInt();
        this.Z3 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f3982a4 = parcel.createStringArrayList();
        this.f3983b4 = parcel.createStringArrayList();
        this.f3985c4 = parcel.readInt() != 0;
    }

    public b(androidx.fragment.app.a aVar) {
        int size = aVar.f4073c.size();
        this.f3984c = new int[size * 6];
        if (aVar.f4079i) {
            this.f3986d = new ArrayList<>(size);
            this.f3987q = new int[size];
            this.f3988x = new int[size];
            int i10 = 0;
            int i11 = 0;
            while (i10 < size) {
                f0.a aVar2 = aVar.f4073c.get(i10);
                int i12 = i11 + 1;
                this.f3984c[i11] = aVar2.f4090a;
                ArrayList<String> arrayList = this.f3986d;
                Fragment fragment = aVar2.f4091b;
                arrayList.add(fragment != null ? fragment.U3 : null);
                int[] iArr = this.f3984c;
                int i13 = i12 + 1;
                iArr[i12] = aVar2.f4092c ? 1 : 0;
                int i14 = i13 + 1;
                iArr[i13] = aVar2.f4093d;
                int i15 = i14 + 1;
                iArr[i14] = aVar2.f4094e;
                int i16 = i15 + 1;
                iArr[i15] = aVar2.f4095f;
                iArr[i16] = aVar2.f4096g;
                this.f3987q[i10] = aVar2.f4097h.ordinal();
                this.f3988x[i10] = aVar2.f4098i.ordinal();
                i10++;
                i11 = i16 + 1;
            }
            this.f3989y = aVar.f4078h;
            this.U3 = aVar.f4081k;
            this.V3 = aVar.f3980v;
            this.W3 = aVar.f4082l;
            this.X3 = aVar.f4083m;
            this.Y3 = aVar.f4084n;
            this.Z3 = aVar.f4085o;
            this.f3982a4 = aVar.f4086p;
            this.f3983b4 = aVar.f4087q;
            this.f3985c4 = aVar.f4088r;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    private void a(androidx.fragment.app.a aVar) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            boolean z10 = true;
            if (i10 >= this.f3984c.length) {
                aVar.f4078h = this.f3989y;
                aVar.f4081k = this.U3;
                aVar.f4079i = true;
                aVar.f4082l = this.W3;
                aVar.f4083m = this.X3;
                aVar.f4084n = this.Y3;
                aVar.f4085o = this.Z3;
                aVar.f4086p = this.f3982a4;
                aVar.f4087q = this.f3983b4;
                aVar.f4088r = this.f3985c4;
                return;
            }
            f0.a aVar2 = new f0.a();
            int i12 = i10 + 1;
            aVar2.f4090a = this.f3984c[i10];
            if (w.L0(2)) {
                Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i11 + " base fragment #" + this.f3984c[i12]);
            }
            aVar2.f4097h = m.c.values()[this.f3987q[i11]];
            aVar2.f4098i = m.c.values()[this.f3988x[i11]];
            int[] iArr = this.f3984c;
            int i13 = i12 + 1;
            if (iArr[i12] == 0) {
                z10 = false;
            }
            aVar2.f4092c = z10;
            int i14 = i13 + 1;
            int i15 = iArr[i13];
            aVar2.f4093d = i15;
            int i16 = i14 + 1;
            int i17 = iArr[i14];
            aVar2.f4094e = i17;
            int i18 = i16 + 1;
            int i19 = iArr[i16];
            aVar2.f4095f = i19;
            int i20 = iArr[i18];
            aVar2.f4096g = i20;
            aVar.f4074d = i15;
            aVar.f4075e = i17;
            aVar.f4076f = i19;
            aVar.f4077g = i20;
            aVar.f(aVar2);
            i11++;
            i10 = i18 + 1;
        }
    }

    public androidx.fragment.app.a c(w wVar) {
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(wVar);
        a(aVar);
        aVar.f3980v = this.V3;
        for (int i10 = 0; i10 < this.f3986d.size(); i10++) {
            String str = this.f3986d.get(i10);
            if (str != null) {
                aVar.f4073c.get(i10).f4091b = wVar.h0(str);
            }
        }
        aVar.v(1);
        return aVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeIntArray(this.f3984c);
        parcel.writeStringList(this.f3986d);
        parcel.writeIntArray(this.f3987q);
        parcel.writeIntArray(this.f3988x);
        parcel.writeInt(this.f3989y);
        parcel.writeString(this.U3);
        parcel.writeInt(this.V3);
        parcel.writeInt(this.W3);
        TextUtils.writeToParcel(this.X3, parcel, 0);
        parcel.writeInt(this.Y3);
        TextUtils.writeToParcel(this.Z3, parcel, 0);
        parcel.writeStringList(this.f3982a4);
        parcel.writeStringList(this.f3983b4);
        parcel.writeInt(this.f3985c4 ? 1 : 0);
    }
}
