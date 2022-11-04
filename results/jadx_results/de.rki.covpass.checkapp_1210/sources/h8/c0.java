package h8;

import android.os.Parcel;
import android.os.Parcelable;
import hc.k0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lh8/c0;", "Lm7/j;", BuildConfig.FLAVOR, "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ltb/e0;", "writeToParcel", BuildConfig.FLAVOR, "is2gOn", "Z", "a", "()Z", "<init>", "(Z)V", "common-app-covpass-check_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class c0 extends m7.j {
    public static final Parcelable.Creator<c0> CREATOR = new a();

    /* renamed from: d */
    private final boolean f11458d;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<c0> {
        /* renamed from: a */
        public final c0 createFromParcel(Parcel parcel) {
            hc.t.e(parcel, "parcel");
            return new c0(parcel.readInt() != 0);
        }

        /* renamed from: b */
        public final c0[] newArray(int i10) {
            return new c0[i10];
        }
    }

    public c0() {
        this(false, 1, null);
    }

    public c0(boolean z10) {
        super(k0.b(b0.class));
        this.f11458d = z10;
    }

    public /* synthetic */ c0(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10);
    }

    public final boolean a() {
        return this.f11458d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        hc.t.e(parcel, "out");
        parcel.writeInt(this.f11458d ? 1 : 0);
    }
}
