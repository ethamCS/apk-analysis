package e8;

import android.os.Parcel;
import android.os.Parcelable;
import de.rki.covpass.sdk.cert.models.ExpertModeData;
import hc.k0;
import hc.t;
import kotlin.Metadata;
import m7.j;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Le8/f;", "Lm7/j;", BuildConfig.FLAVOR, "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ltb/e0;", "writeToParcel", "Lde/rki/covpass/sdk/cert/models/ExpertModeData;", "revocationExportData", "Lde/rki/covpass/sdk/cert/models/ExpertModeData;", "a", "()Lde/rki/covpass/sdk/cert/models/ExpertModeData;", BuildConfig.FLAVOR, "isGermanCertificate", "Z", "c", "()Z", "<init>", "(Lde/rki/covpass/sdk/cert/models/ExpertModeData;Z)V", "common-app-covpass-check_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class f extends j {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* renamed from: d */
    private final ExpertModeData f9530d;

    /* renamed from: q */
    private final boolean f9531q;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<f> {
        /* renamed from: a */
        public final f createFromParcel(Parcel parcel) {
            t.e(parcel, "parcel");
            return new f((ExpertModeData) parcel.readParcelable(f.class.getClassLoader()), parcel.readInt() != 0);
        }

        /* renamed from: b */
        public final f[] newArray(int i10) {
            return new f[i10];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ExpertModeData expertModeData, boolean z10) {
        super(k0.b(e.class));
        t.e(expertModeData, "revocationExportData");
        this.f9530d = expertModeData;
        this.f9531q = z10;
    }

    public final ExpertModeData a() {
        return this.f9530d;
    }

    public final boolean c() {
        return this.f9531q;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        t.e(parcel, "out");
        parcel.writeParcelable(this.f9530d, i10);
        parcel.writeInt(this.f9531q ? 1 : 0);
    }
}
