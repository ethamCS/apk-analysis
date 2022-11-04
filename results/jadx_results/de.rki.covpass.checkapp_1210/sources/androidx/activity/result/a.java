package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0011a();

    /* renamed from: c */
    private final int f628c;

    /* renamed from: d */
    private final Intent f629d;

    /* renamed from: androidx.activity.result.a$a */
    /* loaded from: classes.dex */
    class C0011a implements Parcelable.Creator<a> {
        C0011a() {
        }

        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        /* renamed from: b */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a(int i10, Intent intent) {
        this.f628c = i10;
        this.f629d = intent;
    }

    a(Parcel parcel) {
        this.f628c = parcel.readInt();
        this.f629d = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }

    public static String d(int i10) {
        return i10 != -1 ? i10 != 0 ? String.valueOf(i10) : "RESULT_CANCELED" : "RESULT_OK";
    }

    public Intent a() {
        return this.f629d;
    }

    public int c() {
        return this.f628c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + d(this.f628c) + ", data=" + this.f629d + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f628c);
        parcel.writeInt(this.f629d == null ? 0 : 1);
        Intent intent = this.f629d;
        if (intent != null) {
            intent.writeToParcel(parcel, i10);
        }
    }
}
