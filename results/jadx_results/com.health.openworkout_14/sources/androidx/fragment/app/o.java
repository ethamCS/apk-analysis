package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class o implements Parcelable {
    public static final Parcelable.Creator<o> CREATOR = new a();

    /* renamed from: b */
    ArrayList<q> f1096b;

    /* renamed from: c */
    ArrayList<String> f1097c;

    /* renamed from: d */
    b[] f1098d;

    /* renamed from: e */
    int f1099e;

    /* renamed from: f */
    String f1100f;

    /* loaded from: classes.dex */
    static class a implements Parcelable.Creator<o> {
        a() {
        }

        /* renamed from: a */
        public o createFromParcel(Parcel parcel) {
            return new o(parcel);
        }

        /* renamed from: b */
        public o[] newArray(int i) {
            return new o[i];
        }
    }

    public o() {
        this.f1100f = null;
    }

    public o(Parcel parcel) {
        this.f1100f = null;
        this.f1096b = parcel.createTypedArrayList(q.CREATOR);
        this.f1097c = parcel.createStringArrayList();
        this.f1098d = (b[]) parcel.createTypedArray(b.CREATOR);
        this.f1099e = parcel.readInt();
        this.f1100f = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f1096b);
        parcel.writeStringList(this.f1097c);
        parcel.writeTypedArray(this.f1098d, i);
        parcel.writeInt(this.f1099e);
        parcel.writeString(this.f1100f);
    }
}
