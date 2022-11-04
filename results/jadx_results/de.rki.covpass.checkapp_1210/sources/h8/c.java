package h8;

import android.os.Parcel;
import android.os.Parcelable;
import de.rki.covpass.sdk.cert.models.ExpertModeData;
import hc.k0;
import j$.time.ZonedDateTime;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b!\u0010\"J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0010\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lh8/c;", "Lm7/j;", BuildConfig.FLAVOR, "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ltb/e0;", "writeToParcel", BuildConfig.FLAVOR, "name", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "transliteratedName", "f", "birthDate", "a", "j$/time/ZonedDateTime", "sampleCollection", "Lj$/time/ZonedDateTime;", "e", "()Lj$/time/ZonedDateTime;", "Lde/rki/covpass/sdk/cert/models/ExpertModeData;", "expertModeData", "Lde/rki/covpass/sdk/cert/models/ExpertModeData;", "c", "()Lde/rki/covpass/sdk/cert/models/ExpertModeData;", BuildConfig.FLAVOR, "isGermanCertificate", "Z", "i", "()Z", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/ZonedDateTime;Lde/rki/covpass/sdk/cert/models/ExpertModeData;Z)V", "common-app-covpass-check_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class c extends m7.j {
    public static final Parcelable.Creator<c> CREATOR = new a();
    private final ExpertModeData U3;
    private final boolean V3;

    /* renamed from: d */
    private final String f11454d;

    /* renamed from: q */
    private final String f11455q;

    /* renamed from: x */
    private final String f11456x;

    /* renamed from: y */
    private final ZonedDateTime f11457y;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<c> {
        /* renamed from: a */
        public final c createFromParcel(Parcel parcel) {
            hc.t.e(parcel, "parcel");
            return new c(parcel.readString(), parcel.readString(), parcel.readString(), (ZonedDateTime) parcel.readSerializable(), (ExpertModeData) parcel.readParcelable(c.class.getClassLoader()), parcel.readInt() != 0);
        }

        /* renamed from: b */
        public final c[] newArray(int i10) {
            return new c[i10];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str, String str2, String str3, ZonedDateTime zonedDateTime, ExpertModeData expertModeData, boolean z10) {
        super(k0.b(d.class));
        hc.t.e(str, "name");
        hc.t.e(str2, "transliteratedName");
        hc.t.e(str3, "birthDate");
        this.f11454d = str;
        this.f11455q = str2;
        this.f11456x = str3;
        this.f11457y = zonedDateTime;
        this.U3 = expertModeData;
        this.V3 = z10;
    }

    public final String a() {
        return this.f11456x;
    }

    public final ExpertModeData c() {
        return this.U3;
    }

    public final String d() {
        return this.f11454d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final ZonedDateTime e() {
        return this.f11457y;
    }

    public final String f() {
        return this.f11455q;
    }

    public final boolean i() {
        return this.V3;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        hc.t.e(parcel, "out");
        parcel.writeString(this.f11454d);
        parcel.writeString(this.f11455q);
        parcel.writeString(this.f11456x);
        parcel.writeSerializable(this.f11457y);
        parcel.writeParcelable(this.U3, i10);
        parcel.writeInt(this.V3 ? 1 : 0);
    }
}
