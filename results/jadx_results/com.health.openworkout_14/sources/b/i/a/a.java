package b.i.a;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public abstract class a implements Parcelable {

    /* renamed from: b */
    private final Parcelable f2605b;

    /* renamed from: c */
    public static final a f2604c = new C0056a();
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* renamed from: b.i.a.a$a */
    /* loaded from: classes.dex */
    class C0056a extends a {
        C0056a() {
            super((C0056a) null);
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
                return a.f2604c;
            }
            throw new IllegalStateException("superState must be null");
        }

        /* renamed from: c */
        public a[] newArray(int i) {
            return new a[i];
        }
    }

    private a() {
        this.f2605b = null;
    }

    public a(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f2605b = readParcelable == null ? f2604c : readParcelable;
    }

    public a(Parcelable parcelable) {
        if (parcelable != null) {
            this.f2605b = parcelable == f2604c ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    /* synthetic */ a(C0056a c0056a) {
        this();
    }

    public final Parcelable a() {
        return this.f2605b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f2605b, i);
    }
}
