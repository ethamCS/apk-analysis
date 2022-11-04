package o8;

import android.os.Parcel;
import android.os.Parcelable;
import hc.k0;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lo8/e0;", "Lm7/j;", BuildConfig.FLAVOR, "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ltb/e0;", "writeToParcel", BuildConfig.FLAVOR, "isCovPassCheck", "Z", "a", "()Z", "<init>", "(Z)V", "common-app_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class e0 extends m7.j {
    public static final Parcelable.Creator<e0> CREATOR = new a();

    /* renamed from: d */
    private final boolean f17671d;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<e0> {
        /* renamed from: a */
        public final e0 createFromParcel(Parcel parcel) {
            hc.t.e(parcel, "parcel");
            return new e0(parcel.readInt() != 0);
        }

        /* renamed from: b */
        public final e0[] newArray(int i10) {
            return new e0[i10];
        }
    }

    public e0(boolean z10) {
        super(k0.b(d0.class));
        this.f17671d = z10;
    }

    public final boolean a() {
        return this.f17671d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        hc.t.e(parcel, "out");
        parcel.writeInt(this.f17671d ? 1 : 0);
    }
}
