package android.support.v4.media.session;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.g;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();

    /* renamed from: b */
    final int f53b;

    /* renamed from: c */
    final long f54c;

    /* renamed from: d */
    final long f55d;

    /* renamed from: e */
    final float f56e;

    /* renamed from: f */
    final long f57f;

    /* renamed from: g */
    final int f58g;

    /* renamed from: h */
    final CharSequence f59h;
    final long i;
    List<CustomAction> j;
    final long k;
    final Bundle l;
    private Object m;

    /* loaded from: classes.dex */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();

        /* renamed from: b */
        private final String f60b;

        /* renamed from: c */
        private final CharSequence f61c;

        /* renamed from: d */
        private final int f62d;

        /* renamed from: e */
        private final Bundle f63e;

        /* renamed from: f */
        private Object f64f;

        /* loaded from: classes.dex */
        static class a implements Parcelable.Creator<CustomAction> {
            a() {
            }

            /* renamed from: a */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            /* renamed from: b */
            public CustomAction[] newArray(int i) {
                return new CustomAction[i];
            }
        }

        CustomAction(Parcel parcel) {
            this.f60b = parcel.readString();
            this.f61c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f62d = parcel.readInt();
            this.f63e = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.f60b = str;
            this.f61c = charSequence;
            this.f62d = i;
            this.f63e = bundle;
        }

        public static CustomAction a(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            CustomAction customAction = new CustomAction(g.a.a(obj), g.a.d(obj), g.a.c(obj), g.a.b(obj));
            customAction.f64f = obj;
            return customAction;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + ((Object) this.f61c) + ", mIcon=" + this.f62d + ", mExtras=" + this.f63e;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f60b);
            TextUtils.writeToParcel(this.f61c, parcel, i);
            parcel.writeInt(this.f62d);
            parcel.writeBundle(this.f63e);
        }
    }

    /* loaded from: classes.dex */
    static class a implements Parcelable.Creator<PlaybackStateCompat> {
        a() {
        }

        /* renamed from: a */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        /* renamed from: b */
        public PlaybackStateCompat[] newArray(int i) {
            return new PlaybackStateCompat[i];
        }
    }

    PlaybackStateCompat(int i, long j, long j2, float f2, long j3, int i2, CharSequence charSequence, long j4, List<CustomAction> list, long j5, Bundle bundle) {
        this.f53b = i;
        this.f54c = j;
        this.f55d = j2;
        this.f56e = f2;
        this.f57f = j3;
        this.f58g = i2;
        this.f59h = charSequence;
        this.i = j4;
        this.j = new ArrayList(list);
        this.k = j5;
        this.l = bundle;
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f53b = parcel.readInt();
        this.f54c = parcel.readLong();
        this.f56e = parcel.readFloat();
        this.i = parcel.readLong();
        this.f55d = parcel.readLong();
        this.f57f = parcel.readLong();
        this.f59h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.j = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.k = parcel.readLong();
        this.l = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f58g = parcel.readInt();
    }

    public static PlaybackStateCompat a(Object obj) {
        ArrayList arrayList;
        int i = Build.VERSION.SDK_INT;
        Bundle bundle = null;
        if (obj == null || i < 21) {
            return null;
        }
        List<Object> d2 = g.d(obj);
        if (d2 != null) {
            ArrayList arrayList2 = new ArrayList(d2.size());
            for (Object obj2 : d2) {
                arrayList2.add(CustomAction.a(obj2));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        if (i >= 22) {
            bundle = h.a(obj);
        }
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(g.i(obj), g.h(obj), g.c(obj), g.g(obj), g.a(obj), 0, g.e(obj), g.f(obj), arrayList, g.b(obj), bundle);
        playbackStateCompat.m = obj;
        return playbackStateCompat;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PlaybackState {state=" + this.f53b + ", position=" + this.f54c + ", buffered position=" + this.f55d + ", speed=" + this.f56e + ", updated=" + this.i + ", actions=" + this.f57f + ", error code=" + this.f58g + ", error message=" + this.f59h + ", custom actions=" + this.j + ", active item id=" + this.k + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f53b);
        parcel.writeLong(this.f54c);
        parcel.writeFloat(this.f56e);
        parcel.writeLong(this.i);
        parcel.writeLong(this.f55d);
        parcel.writeLong(this.f57f);
        TextUtils.writeToParcel(this.f59h, parcel, i);
        parcel.writeTypedList(this.j);
        parcel.writeLong(this.k);
        parcel.writeBundle(this.l);
        parcel.writeInt(this.f58g);
    }
}
