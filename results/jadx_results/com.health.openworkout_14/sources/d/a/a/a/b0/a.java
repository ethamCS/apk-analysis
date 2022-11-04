package d.a.a.a.b0;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import b.d.g;
/* loaded from: classes.dex */
public class a extends b.i.a.a {
    public static final Parcelable.Creator<a> CREATOR = new C0099a();

    /* renamed from: d */
    public final g<String, Bundle> f3626d;

    /* renamed from: d.a.a.a.b0.a$a */
    /* loaded from: classes.dex */
    static class C0099a implements Parcelable.ClassLoaderCreator<a> {
        C0099a() {
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
        public a[] newArray(int i) {
            return new a[i];
        }
    }

    private a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f3626d = new g<>(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f3626d.put(strArr[i], bundleArr[i]);
        }
    }

    /* synthetic */ a(Parcel parcel, ClassLoader classLoader, C0099a c0099a) {
        this(parcel, classLoader);
    }

    public a(Parcelable parcelable) {
        super(parcelable);
        this.f3626d = new g<>();
    }

    public String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.f3626d + "}";
    }

    @Override // b.i.a.a, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        int size = this.f3626d.size();
        parcel.writeInt(size);
        String[] strArr = new String[size];
        Bundle[] bundleArr = new Bundle[size];
        for (int i2 = 0; i2 < size; i2++) {
            strArr[i2] = this.f3626d.i(i2);
            bundleArr[i2] = this.f3626d.m(i2);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }
}
