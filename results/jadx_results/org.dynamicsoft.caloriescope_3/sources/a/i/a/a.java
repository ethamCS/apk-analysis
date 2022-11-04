package a.i.a;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public abstract class a implements Parcelable {

    /* renamed from: b */
    private final Parcelable f308b;

    /* renamed from: c */
    public static final a f307c = new C0019a();
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* renamed from: a.i.a.a$a */
    /* loaded from: classes.dex */
    static class C0019a extends a {
        C0019a() {
            super((C0019a) null);
        }
    }

    /* loaded from: classes.dex */
    static class b implements Parcelable.ClassLoaderCreator<a> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        public a createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, (ClassLoader) null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return a.f307c;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        public a[] newArray(int i) {
            return new a[i];
        }
    }

    private a() {
        this.f308b = null;
    }

    /* synthetic */ a(C0019a c0019a) {
        this();
    }

    public a(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f308b = readParcelable == null ? f307c : readParcelable;
    }

    public a(Parcelable parcelable) {
        if (parcelable != null) {
            this.f308b = parcelable == f307c ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public final Parcelable d() {
        return this.f308b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f308b, i);
    }
}
