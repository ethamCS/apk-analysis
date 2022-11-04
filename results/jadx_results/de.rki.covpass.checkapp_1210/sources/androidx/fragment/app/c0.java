package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.m;
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class c0 implements Parcelable {
    public static final Parcelable.Creator<c0> CREATOR = new a();
    final String U3;
    final boolean V3;
    final boolean W3;
    final boolean X3;
    final Bundle Y3;
    final boolean Z3;

    /* renamed from: a4 */
    final int f3992a4;

    /* renamed from: b4 */
    Bundle f3993b4;

    /* renamed from: c */
    final String f3994c;

    /* renamed from: d */
    final String f3995d;

    /* renamed from: q */
    final boolean f3996q;

    /* renamed from: x */
    final int f3997x;

    /* renamed from: y */
    final int f3998y;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<c0> {
        a() {
        }

        /* renamed from: a */
        public c0 createFromParcel(Parcel parcel) {
            return new c0(parcel);
        }

        /* renamed from: b */
        public c0[] newArray(int i10) {
            return new c0[i10];
        }
    }

    c0(Parcel parcel) {
        this.f3994c = parcel.readString();
        this.f3995d = parcel.readString();
        boolean z10 = true;
        this.f3996q = parcel.readInt() != 0;
        this.f3997x = parcel.readInt();
        this.f3998y = parcel.readInt();
        this.U3 = parcel.readString();
        this.V3 = parcel.readInt() != 0;
        this.W3 = parcel.readInt() != 0;
        this.X3 = parcel.readInt() != 0;
        this.Y3 = parcel.readBundle();
        this.Z3 = parcel.readInt() == 0 ? false : z10;
        this.f3993b4 = parcel.readBundle();
        this.f3992a4 = parcel.readInt();
    }

    public c0(Fragment fragment) {
        this.f3994c = fragment.getClass().getName();
        this.f3995d = fragment.U3;
        this.f3996q = fragment.f3906d4;
        this.f3997x = fragment.f3915m4;
        this.f3998y = fragment.f3916n4;
        this.U3 = fragment.f3917o4;
        this.V3 = fragment.f3921r4;
        this.W3 = fragment.f3902b4;
        this.X3 = fragment.f3920q4;
        this.Y3 = fragment.V3;
        this.Z3 = fragment.f3918p4;
        this.f3992a4 = fragment.G4.ordinal();
    }

    public Fragment a(n nVar, ClassLoader classLoader) {
        Fragment a10 = nVar.a(classLoader, this.f3994c);
        Bundle bundle = this.Y3;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a10.Y1(this.Y3);
        a10.U3 = this.f3995d;
        a10.f3906d4 = this.f3996q;
        a10.f3908f4 = true;
        a10.f3915m4 = this.f3997x;
        a10.f3916n4 = this.f3998y;
        a10.f3917o4 = this.U3;
        a10.f3921r4 = this.V3;
        a10.f3902b4 = this.W3;
        a10.f3920q4 = this.X3;
        a10.f3918p4 = this.Z3;
        a10.G4 = m.c.values()[this.f3992a4];
        Bundle bundle2 = this.f3993b4;
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        a10.f3905d = bundle2;
        return a10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentState{");
        sb2.append(this.f3994c);
        sb2.append(" (");
        sb2.append(this.f3995d);
        sb2.append(")}:");
        if (this.f3996q) {
            sb2.append(" fromLayout");
        }
        if (this.f3998y != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.f3998y));
        }
        String str = this.U3;
        if (str != null && !str.isEmpty()) {
            sb2.append(" tag=");
            sb2.append(this.U3);
        }
        if (this.V3) {
            sb2.append(" retainInstance");
        }
        if (this.W3) {
            sb2.append(" removing");
        }
        if (this.X3) {
            sb2.append(" detached");
        }
        if (this.Z3) {
            sb2.append(" hidden");
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f3994c);
        parcel.writeString(this.f3995d);
        parcel.writeInt(this.f3996q ? 1 : 0);
        parcel.writeInt(this.f3997x);
        parcel.writeInt(this.f3998y);
        parcel.writeString(this.U3);
        parcel.writeInt(this.V3 ? 1 : 0);
        parcel.writeInt(this.W3 ? 1 : 0);
        parcel.writeInt(this.X3 ? 1 : 0);
        parcel.writeBundle(this.Y3);
        parcel.writeInt(this.Z3 ? 1 : 0);
        parcel.writeBundle(this.f3993b4);
        parcel.writeInt(this.f3992a4);
    }
}
