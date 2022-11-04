package h8;

import android.os.Parcel;
import android.os.Parcelable;
import hc.k0;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lh8/p;", "Lm7/j;", BuildConfig.FLAVOR, "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ltb/e0;", "writeToParcel", "Lf8/j;", "certificateData", "Lf8/j;", "a", "()Lf8/j;", "<init>", "(Lf8/j;)V", "common-app-covpass-check_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class p extends m7.j {
    public static final Parcelable.Creator<p> CREATOR = new a();

    /* renamed from: d */
    private final f8.j f11521d;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<p> {
        /* renamed from: a */
        public final p createFromParcel(Parcel parcel) {
            hc.t.e(parcel, "parcel");
            return new p(parcel.readInt() == 0 ? null : f8.j.CREATOR.createFromParcel(parcel));
        }

        /* renamed from: b */
        public final p[] newArray(int i10) {
            return new p[i10];
        }
    }

    public p(f8.j jVar) {
        super(k0.b(o.class));
        this.f11521d = jVar;
    }

    public final f8.j a() {
        return this.f11521d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        hc.t.e(parcel, "out");
        f8.j jVar = this.f11521d;
        if (jVar == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        jVar.writeToParcel(parcel, i10);
    }
}
