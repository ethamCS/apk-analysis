package h8;

import android.os.Parcel;
import android.os.Parcelable;
import hc.k0;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\r¨\u0006\u0012"}, d2 = {"Lh8/n;", "Lm7/j;", BuildConfig.FLAVOR, "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ltb/e0;", "writeToParcel", "Lf8/j;", "firstCertificateData", "Lf8/j;", "a", "()Lf8/j;", "secondCertificateData", "c", "<init>", "(Lf8/j;Lf8/j;)V", "common-app-covpass-check_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class n extends m7.j {
    public static final Parcelable.Creator<n> CREATOR = new a();

    /* renamed from: d */
    private final f8.j f11512d;

    /* renamed from: q */
    private final f8.j f11513q;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<n> {
        /* renamed from: a */
        public final n createFromParcel(Parcel parcel) {
            hc.t.e(parcel, "parcel");
            Parcelable.Creator<f8.j> creator = f8.j.CREATOR;
            return new n(creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel));
        }

        /* renamed from: b */
        public final n[] newArray(int i10) {
            return new n[i10];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(f8.j jVar, f8.j jVar2) {
        super(k0.b(m.class));
        hc.t.e(jVar, "firstCertificateData");
        this.f11512d = jVar;
        this.f11513q = jVar2;
    }

    public final f8.j a() {
        return this.f11512d;
    }

    public final f8.j c() {
        return this.f11513q;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        hc.t.e(parcel, "out");
        this.f11512d.writeToParcel(parcel, i10);
        f8.j jVar = this.f11513q;
        if (jVar == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        jVar.writeToParcel(parcel, i10);
    }
}
