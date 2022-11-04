package h8;

import android.os.Parcel;
import android.os.Parcelable;
import de.rki.covpass.sdk.cert.models.ExpertModeData;
import hc.k0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0014\u0010\r¨\u0006\u0017"}, d2 = {"Lh8/t;", "Lm7/j;", BuildConfig.FLAVOR, "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ltb/e0;", "writeToParcel", BuildConfig.FLAVOR, "is2gOn", "Z", "c", "()Z", "Lde/rki/covpass/sdk/cert/models/ExpertModeData;", "expertModeData", "Lde/rki/covpass/sdk/cert/models/ExpertModeData;", "a", "()Lde/rki/covpass/sdk/cert/models/ExpertModeData;", "isGermanCertificate", "d", "<init>", "(ZLde/rki/covpass/sdk/cert/models/ExpertModeData;Z)V", "common-app-covpass-check_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class t extends m7.j {
    public static final Parcelable.Creator<t> CREATOR = new a();

    /* renamed from: d */
    private final boolean f11543d;

    /* renamed from: q */
    private final ExpertModeData f11544q;

    /* renamed from: x */
    private final boolean f11545x;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<t> {
        /* renamed from: a */
        public final t createFromParcel(Parcel parcel) {
            hc.t.e(parcel, "parcel");
            boolean z10 = true;
            boolean z11 = parcel.readInt() != 0;
            ExpertModeData expertModeData = (ExpertModeData) parcel.readParcelable(t.class.getClassLoader());
            if (parcel.readInt() == 0) {
                z10 = false;
            }
            return new t(z11, expertModeData, z10);
        }

        /* renamed from: b */
        public final t[] newArray(int i10) {
            return new t[i10];
        }
    }

    public t() {
        this(false, null, false, 7, null);
    }

    public t(boolean z10, ExpertModeData expertModeData, boolean z11) {
        super(k0.b(s.class));
        this.f11543d = z10;
        this.f11544q = expertModeData;
        this.f11545x = z11;
    }

    public /* synthetic */ t(boolean z10, ExpertModeData expertModeData, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? null : expertModeData, (i10 & 4) != 0 ? false : z11);
    }

    public final ExpertModeData a() {
        return this.f11544q;
    }

    public final boolean c() {
        return this.f11543d;
    }

    public final boolean d() {
        return this.f11545x;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        hc.t.e(parcel, "out");
        parcel.writeInt(this.f11543d ? 1 : 0);
        parcel.writeParcelable(this.f11544q, i10);
        parcel.writeInt(this.f11545x ? 1 : 0);
    }
}
