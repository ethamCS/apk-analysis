package m8;

import android.os.Parcel;
import android.os.Parcelable;
import hc.t;
import kotlin.Metadata;
import m7.k;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lm8/j;", "Lm7/i;", "Lm8/i;", "a", BuildConfig.FLAVOR, "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ltb/e0;", "writeToParcel", "Lm8/c;", "dialogModel", "Lm8/c;", "c", "()Lm8/c;", "<init>", "(Lm8/c;)V", "common-app_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class j implements m7.i {
    public static final Parcelable.Creator<j> CREATOR = new a();

    /* renamed from: c */
    private final c f16455c;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<j> {
        /* renamed from: a */
        public final j createFromParcel(Parcel parcel) {
            t.e(parcel, "parcel");
            return new j((c) parcel.readSerializable());
        }

        /* renamed from: b */
        public final j[] newArray(int i10) {
            return new j[i10];
        }
    }

    public j(c cVar) {
        t.e(cVar, "dialogModel");
        this.f16455c = cVar;
    }

    /* renamed from: a */
    public i b() {
        return (i) k.c(new i(), this);
    }

    public final c c() {
        return this.f16455c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        t.e(parcel, "out");
        parcel.writeSerializable(this.f16455c);
    }
}
