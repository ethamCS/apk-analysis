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

    /* renamed from: a */
    final int f125a;

    /* renamed from: b */
    final long f126b;

    /* renamed from: c */
    final long f127c;

    /* renamed from: d */
    final float f128d;

    /* renamed from: e */
    final long f129e;
    final int f;
    final CharSequence g;
    final long h;
    List<CustomAction> i;
    final long j;
    final Bundle k;
    private Object l;

    /* loaded from: classes.dex */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();

        /* renamed from: a */
        private final String f130a;

        /* renamed from: b */
        private final CharSequence f131b;

        /* renamed from: c */
        private final int f132c;

        /* renamed from: d */
        private final Bundle f133d;

        /* renamed from: e */
        private Object f134e;

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
            this.f130a = parcel.readString();
            this.f131b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f132c = parcel.readInt();
            this.f133d = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.f130a = str;
            this.f131b = charSequence;
            this.f132c = i;
            this.f133d = bundle;
        }

        public static CustomAction a(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            CustomAction customAction = new CustomAction(g.a.a(obj), g.a.d(obj), g.a.c(obj), g.a.b(obj));
            customAction.f134e = obj;
            return customAction;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + ((Object) this.f131b) + ", mIcon=" + this.f132c + ", mExtras=" + this.f133d;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f130a);
            TextUtils.writeToParcel(this.f131b, parcel, i);
            parcel.writeInt(this.f132c);
            parcel.writeBundle(this.f133d);
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

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private final List<CustomAction> f135a;

        /* renamed from: b */
        private int f136b;

        /* renamed from: c */
        private long f137c;

        /* renamed from: d */
        private long f138d;

        /* renamed from: e */
        private float f139e;
        private long f;
        private int g;
        private CharSequence h;
        private long i;
        private long j;
        private Bundle k;

        public b(PlaybackStateCompat playbackStateCompat) {
            ArrayList arrayList = new ArrayList();
            this.f135a = arrayList;
            this.j = -1L;
            this.f136b = playbackStateCompat.f125a;
            this.f137c = playbackStateCompat.f126b;
            this.f139e = playbackStateCompat.f128d;
            this.i = playbackStateCompat.h;
            this.f138d = playbackStateCompat.f127c;
            this.f = playbackStateCompat.f129e;
            this.g = playbackStateCompat.f;
            this.h = playbackStateCompat.g;
            List<CustomAction> list = playbackStateCompat.i;
            if (list != null) {
                arrayList.addAll(list);
            }
            this.j = playbackStateCompat.j;
            this.k = playbackStateCompat.k;
        }

        public PlaybackStateCompat a() {
            return new PlaybackStateCompat(this.f136b, this.f137c, this.f138d, this.f139e, this.f, this.g, this.h, this.i, this.f135a, this.j, this.k);
        }

        public b b(int i, long j, float f, long j2) {
            this.f136b = i;
            this.f137c = j;
            this.i = j2;
            this.f139e = f;
            return this;
        }
    }

    PlaybackStateCompat(int i, long j, long j2, float f, long j3, int i2, CharSequence charSequence, long j4, List<CustomAction> list, long j5, Bundle bundle) {
        this.f125a = i;
        this.f126b = j;
        this.f127c = j2;
        this.f128d = f;
        this.f129e = j3;
        this.f = i2;
        this.g = charSequence;
        this.h = j4;
        this.i = new ArrayList(list);
        this.j = j5;
        this.k = bundle;
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f125a = parcel.readInt();
        this.f126b = parcel.readLong();
        this.f128d = parcel.readFloat();
        this.h = parcel.readLong();
        this.f127c = parcel.readLong();
        this.f129e = parcel.readLong();
        this.g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.i = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.j = parcel.readLong();
        this.k = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f = parcel.readInt();
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
        playbackStateCompat.l = obj;
        return playbackStateCompat;
    }

    public long b() {
        return this.f129e;
    }

    public long c() {
        return this.h;
    }

    public float d() {
        return this.f128d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long e() {
        return this.f126b;
    }

    public int f() {
        return this.f125a;
    }

    public String toString() {
        return "PlaybackState {state=" + this.f125a + ", position=" + this.f126b + ", buffered position=" + this.f127c + ", speed=" + this.f128d + ", updated=" + this.h + ", actions=" + this.f129e + ", error code=" + this.f + ", error message=" + this.g + ", custom actions=" + this.i + ", active item id=" + this.j + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f125a);
        parcel.writeLong(this.f126b);
        parcel.writeFloat(this.f128d);
        parcel.writeLong(this.h);
        parcel.writeLong(this.f127c);
        parcel.writeLong(this.f129e);
        TextUtils.writeToParcel(this.g, parcel, i);
        parcel.writeTypedList(this.i);
        parcel.writeLong(this.j);
        parcel.writeBundle(this.k);
        parcel.writeInt(this.f);
    }
}
