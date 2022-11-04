package h8;

import android.os.Parcel;
import android.os.Parcelable;
import de.rki.covpass.sdk.cert.models.ExpertModeData;
import hc.k0;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0010\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lh8/y;", "Lm7/j;", BuildConfig.FLAVOR, "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ltb/e0;", "writeToParcel", BuildConfig.FLAVOR, "name", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "transliteratedName", "e", "birthDate", "a", "Lde/rki/covpass/sdk/cert/models/ExpertModeData;", "expertModeData", "Lde/rki/covpass/sdk/cert/models/ExpertModeData;", "c", "()Lde/rki/covpass/sdk/cert/models/ExpertModeData;", BuildConfig.FLAVOR, "isGermanCertificate", "Z", "f", "()Z", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lde/rki/covpass/sdk/cert/models/ExpertModeData;Z)V", "common-app-covpass-check_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class y extends m7.j {
    public static final Parcelable.Creator<y> CREATOR = new a();
    private final boolean U3;

    /* renamed from: d */
    private final String f11586d;

    /* renamed from: q */
    private final String f11587q;

    /* renamed from: x */
    private final String f11588x;

    /* renamed from: y */
    private final ExpertModeData f11589y;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<y> {
        /* renamed from: a */
        public final y createFromParcel(Parcel parcel) {
            hc.t.e(parcel, "parcel");
            return new y(parcel.readString(), parcel.readString(), parcel.readString(), (ExpertModeData) parcel.readParcelable(y.class.getClassLoader()), parcel.readInt() != 0);
        }

        /* renamed from: b */
        public final y[] newArray(int i10) {
            return new y[i10];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(String str, String str2, String str3, ExpertModeData expertModeData, boolean z10) {
        super(k0.b(x.class));
        hc.t.e(str, "name");
        hc.t.e(str2, "transliteratedName");
        hc.t.e(str3, "birthDate");
        this.f11586d = str;
        this.f11587q = str2;
        this.f11588x = str3;
        this.f11589y = expertModeData;
        this.U3 = z10;
    }

    public final String a() {
        return this.f11588x;
    }

    public final ExpertModeData c() {
        return this.f11589y;
    }

    public final String d() {
        return this.f11586d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f11587q;
    }

    public final boolean f() {
        return this.U3;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        hc.t.e(parcel, "out");
        parcel.writeString(this.f11586d);
        parcel.writeString(this.f11587q);
        parcel.writeString(this.f11588x);
        parcel.writeParcelable(this.f11589y, i10);
        parcel.writeInt(this.U3 ? 1 : 0);
    }
}
