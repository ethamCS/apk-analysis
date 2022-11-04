package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.w;
import java.util.ArrayList;
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class y implements Parcelable {
    public static final Parcelable.Creator<y> CREATOR = new a();
    ArrayList<String> U3;
    ArrayList<c> V3;
    ArrayList<w.m> W3;

    /* renamed from: c */
    ArrayList<String> f4235c;

    /* renamed from: d */
    ArrayList<String> f4236d;

    /* renamed from: q */
    b[] f4237q;

    /* renamed from: x */
    int f4238x;

    /* renamed from: y */
    String f4239y;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<y> {
        a() {
        }

        /* renamed from: a */
        public y createFromParcel(Parcel parcel) {
            return new y(parcel);
        }

        /* renamed from: b */
        public y[] newArray(int i10) {
            return new y[i10];
        }
    }

    public y() {
        this.f4239y = null;
        this.U3 = new ArrayList<>();
        this.V3 = new ArrayList<>();
    }

    public y(Parcel parcel) {
        this.f4239y = null;
        this.U3 = new ArrayList<>();
        this.V3 = new ArrayList<>();
        this.f4235c = parcel.createStringArrayList();
        this.f4236d = parcel.createStringArrayList();
        this.f4237q = (b[]) parcel.createTypedArray(b.CREATOR);
        this.f4238x = parcel.readInt();
        this.f4239y = parcel.readString();
        this.U3 = parcel.createStringArrayList();
        this.V3 = parcel.createTypedArrayList(c.CREATOR);
        this.W3 = parcel.createTypedArrayList(w.m.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f4235c);
        parcel.writeStringList(this.f4236d);
        parcel.writeTypedArray(this.f4237q, i10);
        parcel.writeInt(this.f4238x);
        parcel.writeString(this.f4239y);
        parcel.writeStringList(this.U3);
        parcel.writeTypedList(this.V3);
        parcel.writeTypedList(this.W3);
    }
}
