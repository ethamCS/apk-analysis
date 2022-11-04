package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a();

    /* renamed from: b */
    public int f48b;

    /* renamed from: c */
    public int f49c;

    /* renamed from: d */
    public int f50d;

    /* renamed from: e */
    public int f51e;

    /* renamed from: f */
    public int f52f;

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

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f48b = parcel.readInt();
        this.f50d = parcel.readInt();
        this.f51e = parcel.readInt();
        this.f52f = parcel.readInt();
        this.f49c = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f48b);
        parcel.writeInt(this.f50d);
        parcel.writeInt(this.f51e);
        parcel.writeInt(this.f52f);
        parcel.writeInt(this.f49c);
    }
}
