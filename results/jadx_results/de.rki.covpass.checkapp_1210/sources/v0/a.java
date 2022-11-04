package v0;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public abstract class a implements Parcelable {

    /* renamed from: c */
    private final Parcelable f23837c;

    /* renamed from: d */
    public static final a f23836d = new C0420a();
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* renamed from: v0.a$a */
    /* loaded from: classes.dex */
    class C0420a extends a {
        C0420a() {
            super((C0420a) null);
        }
    }

    /* loaded from: classes.dex */
    class b implements Parcelable.ClassLoaderCreator<a> {
        b() {
        }

        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        /* renamed from: b */
        public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return a.f23836d;
            }
            throw new IllegalStateException("superState must be null");
        }

        /* renamed from: c */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    private a() {
        this.f23837c = null;
    }

    public a(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f23837c = readParcelable == null ? f23836d : readParcelable;
    }

    public a(Parcelable parcelable) {
        if (parcelable != null) {
            this.f23837c = parcelable == f23836d ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    /* synthetic */ a(C0420a c0420a) {
        this();
    }

    public final Parcelable a() {
        return this.f23837c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f23837c, i10);
    }
}
