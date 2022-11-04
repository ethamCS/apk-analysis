package f8;

import android.os.Parcel;
import android.os.Parcelable;
import hc.t;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0004\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003HÖ\u0001j\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lf8/i;", BuildConfig.FLAVOR, "Landroid/os/Parcelable;", BuildConfig.FLAVOR, "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ltb/e0;", "writeToParcel", "<init>", "(Ljava/lang/String;I)V", "Booster", "Vaccination", "Recovery", "PcrTest", "AntigenTest", "NullCertificateOrUnknown", "common-app-covpass-check_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public enum i implements Parcelable {
    Booster,
    Vaccination,
    Recovery,
    PcrTest,
    AntigenTest,
    NullCertificateOrUnknown;
    
    public static final Parcelable.Creator<i> CREATOR = new Parcelable.Creator<i>() { // from class: f8.i.a
        /* renamed from: a */
        public final i createFromParcel(Parcel parcel) {
            t.e(parcel, "parcel");
            return i.valueOf(parcel.readString());
        }

        /* renamed from: b */
        public final i[] newArray(int i10) {
            return new i[i10];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        t.e(parcel, "out");
        parcel.writeString(name());
    }
}
