package h8;

import android.os.Parcel;
import android.os.Parcelable;
import hc.k0;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lh8/i;", "Lm7/j;", BuildConfig.FLAVOR, "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ltb/e0;", "writeToParcel", "Lf8/j;", "firstCertificateData", "Lf8/j;", "c", "()Lf8/j;", "secondCertificateData", "d", BuildConfig.FLAVOR, "dateDifferent", "Z", "a", "()Z", "<init>", "(Lf8/j;Lf8/j;Z)V", "common-app-covpass-check_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class i extends m7.j {
    public static final Parcelable.Creator<i> CREATOR = new a();

    /* renamed from: d */
    private final f8.j f11487d;

    /* renamed from: q */
    private final f8.j f11488q;

    /* renamed from: x */
    private final boolean f11489x;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<i> {
        /* renamed from: a */
        public final i createFromParcel(Parcel parcel) {
            hc.t.e(parcel, "parcel");
            Parcelable.Creator<f8.j> creator = f8.j.CREATOR;
            return new i(creator.createFromParcel(parcel), creator.createFromParcel(parcel), parcel.readInt() != 0);
        }

        /* renamed from: b */
        public final i[] newArray(int i10) {
            return new i[i10];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(f8.j jVar, f8.j jVar2, boolean z10) {
        super(k0.b(h.class));
        hc.t.e(jVar, "firstCertificateData");
        hc.t.e(jVar2, "secondCertificateData");
        this.f11487d = jVar;
        this.f11488q = jVar2;
        this.f11489x = z10;
    }

    public final boolean a() {
        return this.f11489x;
    }

    public final f8.j c() {
        return this.f11487d;
    }

    public final f8.j d() {
        return this.f11488q;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        hc.t.e(parcel, "out");
        this.f11487d.writeToParcel(parcel, i10);
        this.f11488q.writeToParcel(parcel, i10);
        parcel.writeInt(this.f11489x ? 1 : 0);
    }
}
