package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a();

    /* renamed from: a */
    public int f120a;

    /* renamed from: b */
    public int f121b;

    /* renamed from: c */
    public int f122c;

    /* renamed from: d */
    public int f123d;

    /* renamed from: e */
    public int f124e;

    /* loaded from: classes.dex */
    static class a implements Parcelable.Creator<ParcelableVolumeInfo> {
        a() {
        }

        /* renamed from: a */
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        /* renamed from: b */
        public ParcelableVolumeInfo[] newArray(int i) {
            return new ParcelableVolumeInfo[i];
        }
    }

    public ParcelableVolumeInfo(int i, int i2, int i3, int i4, int i5) {
        this.f120a = i;
        this.f121b = i2;
        this.f122c = i3;
        this.f123d = i4;
        this.f124e = i5;
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f120a = parcel.readInt();
        this.f122c = parcel.readInt();
        this.f123d = parcel.readInt();
        this.f124e = parcel.readInt();
        this.f121b = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f120a);
        parcel.writeInt(this.f122c);
        parcel.writeInt(this.f123d);
        parcel.writeInt(this.f124e);
        parcel.writeInt(this.f121b);
    }
}
