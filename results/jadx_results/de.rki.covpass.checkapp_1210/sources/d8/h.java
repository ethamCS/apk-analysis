package d8;

import android.os.Parcel;
import android.os.Parcelable;
import hc.k0;
import hc.t;
import kotlin.Metadata;
import m7.j;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001¨\u0006\u000b"}, d2 = {"Ld8/h;", "Lm7/j;", BuildConfig.FLAVOR, "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ltb/e0;", "writeToParcel", "<init>", "()V", "common-app-covpass-check_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class h extends j {
    public static final Parcelable.Creator<h> CREATOR = new a();

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<h> {
        /* renamed from: a */
        public final h createFromParcel(Parcel parcel) {
            t.e(parcel, "parcel");
            parcel.readInt();
            return new h();
        }

        /* renamed from: b */
        public final h[] newArray(int i10) {
            return new h[i10];
        }
    }

    public h() {
        super(k0.b(g.class));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        t.e(parcel, "out");
        parcel.writeInt(1);
    }
}
