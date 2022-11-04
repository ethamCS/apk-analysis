package u5;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import i0.g;
/* loaded from: classes.dex */
public class a extends v0.a {
    public static final Parcelable.Creator<a> CREATOR = new C0400a();

    /* renamed from: q */
    public final g<String, Bundle> f23131q;

    /* renamed from: u5.a$a */
    /* loaded from: classes.dex */
    class C0400a implements Parcelable.ClassLoaderCreator<a> {
        C0400a() {
        }

        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel, null, null);
        }

        /* renamed from: b */
        public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new a(parcel, classLoader, null);
        }

        /* renamed from: c */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    private a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f23131q = new g<>(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            this.f23131q.put(strArr[i10], bundleArr[i10]);
        }
    }

    /* synthetic */ a(Parcel parcel, ClassLoader classLoader, C0400a c0400a) {
        this(parcel, classLoader);
    }

    public a(Parcelable parcelable) {
        super(parcelable);
        this.f23131q = new g<>();
    }

    public String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.f23131q + "}";
    }

    @Override // v0.a, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        int size = this.f23131q.size();
        parcel.writeInt(size);
        String[] strArr = new String[size];
        Bundle[] bundleArr = new Bundle[size];
        for (int i11 = 0; i11 < size; i11++) {
            strArr[i11] = this.f23131q.j(i11);
            bundleArr[i11] = this.f23131q.n(i11);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }
}
