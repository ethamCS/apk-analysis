package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class q implements Parcelable {
    public static final Parcelable.Creator<q> CREATOR = new a();

    /* renamed from: b */
    final String f1108b;

    /* renamed from: c */
    final String f1109c;

    /* renamed from: d */
    final boolean f1110d;

    /* renamed from: e */
    final int f1111e;

    /* renamed from: f */
    final int f1112f;

    /* renamed from: g */
    final String f1113g;

    /* renamed from: h */
    final boolean f1114h;
    final boolean i;
    final boolean j;
    final Bundle k;
    final boolean l;
    final int m;
    Bundle n;

    /* loaded from: classes.dex */
    static class a implements Parcelable.Creator<q> {
        a() {
        }

        /* renamed from: a */
        public q createFromParcel(Parcel parcel) {
            return new q(parcel);
        }

        /* renamed from: b */
        public q[] newArray(int i) {
            return new q[i];
        }
    }

    q(Parcel parcel) {
        this.f1108b = parcel.readString();
        this.f1109c = parcel.readString();
        boolean z = true;
        this.f1110d = parcel.readInt() != 0;
        this.f1111e = parcel.readInt();
        this.f1112f = parcel.readInt();
        this.f1113g = parcel.readString();
        this.f1114h = parcel.readInt() != 0;
        this.i = parcel.readInt() != 0;
        this.j = parcel.readInt() != 0;
        this.k = parcel.readBundle();
        this.l = parcel.readInt() == 0 ? false : z;
        this.n = parcel.readBundle();
        this.m = parcel.readInt();
    }

    public q(Fragment fragment) {
        this.f1108b = fragment.getClass().getName();
        this.f1109c = fragment.f1016f;
        this.f1110d = fragment.n;
        this.f1111e = fragment.w;
        this.f1112f = fragment.x;
        this.f1113g = fragment.y;
        this.f1114h = fragment.B;
        this.i = fragment.m;
        this.j = fragment.A;
        this.k = fragment.f1017g;
        this.l = fragment.z;
        this.m = fragment.Q.ordinal();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f1108b);
        sb.append(" (");
        sb.append(this.f1109c);
        sb.append(")}:");
        if (this.f1110d) {
            sb.append(" fromLayout");
        }
        if (this.f1112f != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f1112f));
        }
        String str = this.f1113g;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f1113g);
        }
        if (this.f1114h) {
            sb.append(" retainInstance");
        }
        if (this.i) {
            sb.append(" removing");
        }
        if (this.j) {
            sb.append(" detached");
        }
        if (this.l) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1108b);
        parcel.writeString(this.f1109c);
        parcel.writeInt(this.f1110d ? 1 : 0);
        parcel.writeInt(this.f1111e);
        parcel.writeInt(this.f1112f);
        parcel.writeString(this.f1113g);
        parcel.writeInt(this.f1114h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeBundle(this.k);
        parcel.writeInt(this.l ? 1 : 0);
        parcel.writeBundle(this.n);
        parcel.writeInt(this.m);
    }
}
