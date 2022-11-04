package androidx.navigation;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.UUID;
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class g implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new a();

    /* renamed from: b */
    private final UUID f1320b;

    /* renamed from: c */
    private final int f1321c;

    /* renamed from: d */
    private final Bundle f1322d;

    /* renamed from: e */
    private final Bundle f1323e;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<g> {
        a() {
        }

        /* renamed from: a */
        public g createFromParcel(Parcel parcel) {
            return new g(parcel);
        }

        /* renamed from: b */
        public g[] newArray(int i) {
            return new g[i];
        }
    }

    g(Parcel parcel) {
        this.f1320b = UUID.fromString(parcel.readString());
        this.f1321c = parcel.readInt();
        this.f1322d = parcel.readBundle(g.class.getClassLoader());
        this.f1323e = parcel.readBundle(g.class.getClassLoader());
    }

    public g(f fVar) {
        this.f1320b = fVar.f1301f;
        this.f1321c = fVar.e().i();
        this.f1322d = fVar.b();
        Bundle bundle = new Bundle();
        this.f1323e = bundle;
        fVar.k(bundle);
    }

    public Bundle a() {
        return this.f1322d;
    }

    public int c() {
        return this.f1321c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Bundle k() {
        return this.f1323e;
    }

    public UUID m() {
        return this.f1320b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1320b.toString());
        parcel.writeInt(this.f1321c);
        parcel.writeBundle(this.f1322d);
        parcel.writeBundle(this.f1323e);
    }
}
