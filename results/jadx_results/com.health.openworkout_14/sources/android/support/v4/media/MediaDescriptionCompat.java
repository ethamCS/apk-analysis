package android.support.v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.d;
import android.support.v4.media.e;
import android.text.TextUtils;
/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a();

    /* renamed from: b */
    private final String f17b;

    /* renamed from: c */
    private final CharSequence f18c;

    /* renamed from: d */
    private final CharSequence f19d;

    /* renamed from: e */
    private final CharSequence f20e;

    /* renamed from: f */
    private final Bitmap f21f;

    /* renamed from: g */
    private final Uri f22g;

    /* renamed from: h */
    private final Bundle f23h;
    private final Uri i;
    private Object j;

    /* loaded from: classes.dex */
    static class a implements Parcelable.Creator<MediaDescriptionCompat> {
        a() {
        }

        /* renamed from: a */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return Build.VERSION.SDK_INT < 21 ? new MediaDescriptionCompat(parcel) : MediaDescriptionCompat.a(d.a(parcel));
        }

        /* renamed from: b */
        public MediaDescriptionCompat[] newArray(int i) {
            return new MediaDescriptionCompat[i];
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private String f24a;

        /* renamed from: b */
        private CharSequence f25b;

        /* renamed from: c */
        private CharSequence f26c;

        /* renamed from: d */
        private CharSequence f27d;

        /* renamed from: e */
        private Bitmap f28e;

        /* renamed from: f */
        private Uri f29f;

        /* renamed from: g */
        private Bundle f30g;

        /* renamed from: h */
        private Uri f31h;

        public MediaDescriptionCompat a() {
            return new MediaDescriptionCompat(this.f24a, this.f25b, this.f26c, this.f27d, this.f28e, this.f29f, this.f30g, this.f31h);
        }

        public b b(CharSequence charSequence) {
            this.f27d = charSequence;
            return this;
        }

        public b c(Bundle bundle) {
            this.f30g = bundle;
            return this;
        }

        public b d(Bitmap bitmap) {
            this.f28e = bitmap;
            return this;
        }

        public b e(Uri uri) {
            this.f29f = uri;
            return this;
        }

        public b f(String str) {
            this.f24a = str;
            return this;
        }

        public b g(Uri uri) {
            this.f31h = uri;
            return this;
        }

        public b h(CharSequence charSequence) {
            this.f26c = charSequence;
            return this;
        }

        public b i(CharSequence charSequence) {
            this.f25b = charSequence;
            return this;
        }
    }

    MediaDescriptionCompat(Parcel parcel) {
        this.f17b = parcel.readString();
        this.f18c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f19d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f20e = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        ClassLoader classLoader = MediaDescriptionCompat.class.getClassLoader();
        this.f21f = (Bitmap) parcel.readParcelable(classLoader);
        this.f22g = (Uri) parcel.readParcelable(classLoader);
        this.f23h = parcel.readBundle(classLoader);
        this.i = (Uri) parcel.readParcelable(classLoader);
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f17b = str;
        this.f18c = charSequence;
        this.f19d = charSequence2;
        this.f20e = charSequence3;
        this.f21f = bitmap;
        this.f22g = uri;
        this.f23h = bundle;
        this.i = uri2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.support.v4.media.MediaDescriptionCompat a(java.lang.Object r9) {
        /*
            r0 = 0
            if (r9 == 0) goto L7e
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r1 < r2) goto L7e
            android.support.v4.media.MediaDescriptionCompat$b r2 = new android.support.v4.media.MediaDescriptionCompat$b
            r2.<init>()
            java.lang.String r3 = android.support.v4.media.d.f(r9)
            r2.f(r3)
            java.lang.CharSequence r3 = android.support.v4.media.d.h(r9)
            r2.i(r3)
            java.lang.CharSequence r3 = android.support.v4.media.d.g(r9)
            r2.h(r3)
            java.lang.CharSequence r3 = android.support.v4.media.d.b(r9)
            r2.b(r3)
            android.graphics.Bitmap r3 = android.support.v4.media.d.d(r9)
            r2.d(r3)
            android.net.Uri r3 = android.support.v4.media.d.e(r9)
            r2.e(r3)
            android.os.Bundle r3 = android.support.v4.media.d.c(r9)
            java.lang.String r4 = "android.support.v4.media.description.MEDIA_URI"
            if (r3 == 0) goto L4a
            android.support.v4.media.session.MediaSessionCompat.a(r3)
            android.os.Parcelable r5 = r3.getParcelable(r4)
            android.net.Uri r5 = (android.net.Uri) r5
            goto L4b
        L4a:
            r5 = r0
        L4b:
            if (r5 == 0) goto L63
            java.lang.String r6 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r7 = r3.containsKey(r6)
            if (r7 == 0) goto L5d
            int r7 = r3.size()
            r8 = 2
            if (r7 != r8) goto L5d
            goto L64
        L5d:
            r3.remove(r4)
            r3.remove(r6)
        L63:
            r0 = r3
        L64:
            r2.c(r0)
            if (r5 == 0) goto L6d
            r2.g(r5)
            goto L78
        L6d:
            r0 = 23
            if (r1 < r0) goto L78
            android.net.Uri r0 = android.support.v4.media.e.a(r9)
            r2.g(r0)
        L78:
            android.support.v4.media.MediaDescriptionCompat r0 = r2.a()
            r0.j = r9
        L7e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaDescriptionCompat.a(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    public Object c() {
        int i;
        Object obj = this.j;
        if (obj != null || (i = Build.VERSION.SDK_INT) < 21) {
            return obj;
        }
        Object b2 = d.a.b();
        d.a.g(b2, this.f17b);
        d.a.i(b2, this.f18c);
        d.a.h(b2, this.f19d);
        d.a.c(b2, this.f20e);
        d.a.e(b2, this.f21f);
        d.a.f(b2, this.f22g);
        Bundle bundle = this.f23h;
        if (i < 23 && this.i != null) {
            if (bundle == null) {
                bundle = new Bundle();
                bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
            }
            bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.i);
        }
        d.a.d(b2, bundle);
        if (i >= 23) {
            e.a.a(b2, this.i);
        }
        Object a2 = d.a.a(b2);
        this.j = a2;
        return a2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return ((Object) this.f18c) + ", " + ((Object) this.f19d) + ", " + ((Object) this.f20e);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            d.i(c(), parcel, i);
            return;
        }
        parcel.writeString(this.f17b);
        TextUtils.writeToParcel(this.f18c, parcel, i);
        TextUtils.writeToParcel(this.f19d, parcel, i);
        TextUtils.writeToParcel(this.f20e, parcel, i);
        parcel.writeParcelable(this.f21f, i);
        parcel.writeParcelable(this.f22g, i);
        parcel.writeBundle(this.f23h);
        parcel.writeParcelable(this.i, i);
    }
}
