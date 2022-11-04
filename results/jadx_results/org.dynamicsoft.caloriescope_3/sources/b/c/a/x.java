package b.c.a;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.NetworkInfo;
import b.c.a.s;
import java.io.InputStream;
/* loaded from: classes.dex */
public abstract class x {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final s.e f1344a;

        /* renamed from: b */
        private final Bitmap f1345b;

        /* renamed from: c */
        private final InputStream f1346c;
        private final int d;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(Bitmap bitmap, s.e eVar) {
            this(bitmap, null, eVar, 0);
            d0.a(bitmap, "bitmap == null");
        }

        public a(Bitmap bitmap, InputStream inputStream, s.e eVar, int i) {
            boolean z = true;
            if ((inputStream == null ? false : z) ^ (bitmap != null)) {
                this.f1345b = bitmap;
                this.f1346c = inputStream;
                d0.a(eVar, "loadedFrom == null");
                this.f1344a = eVar;
                this.d = i;
                return;
            }
            throw new AssertionError();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(InputStream inputStream, s.e eVar) {
            this(null, inputStream, eVar, 0);
            d0.a(inputStream, "stream == null");
        }

        public Bitmap a() {
            return this.f1345b;
        }

        public int b() {
            return this.d;
        }

        public s.e c() {
            return this.f1344a;
        }

        public InputStream d() {
            return this.f1346c;
        }
    }

    public static void a(int i, int i2, int i3, int i4, BitmapFactory.Options options, v vVar) {
        int i5;
        double d;
        if (i4 > i2 || i3 > i) {
            if (i2 == 0) {
                d = i3 / i;
            } else if (i == 0) {
                d = i4 / i2;
            } else {
                int floor = (int) Math.floor(i4 / i2);
                int floor2 = (int) Math.floor(i3 / i);
                i5 = vVar.k ? Math.max(floor, floor2) : Math.min(floor, floor2);
            }
            i5 = (int) Math.floor(d);
        } else {
            i5 = 1;
        }
        options.inSampleSize = i5;
        options.inJustDecodeBounds = false;
    }

    public static void a(int i, int i2, BitmapFactory.Options options, v vVar) {
        a(i, i2, options.outWidth, options.outHeight, options, vVar);
    }

    public static boolean a(BitmapFactory.Options options) {
        return options != null && options.inJustDecodeBounds;
    }

    public static BitmapFactory.Options b(v vVar) {
        boolean c2 = vVar.c();
        boolean z = vVar.q != null;
        BitmapFactory.Options options = null;
        if (c2 || z) {
            options = new BitmapFactory.Options();
            options.inJustDecodeBounds = c2;
            if (z) {
                options.inPreferredConfig = vVar.q;
            }
        }
        return options;
    }

    public int a() {
        return 0;
    }

    public abstract a a(v vVar, int i);

    public abstract boolean a(v vVar);

    public boolean a(boolean z, NetworkInfo networkInfo) {
        return false;
    }

    public boolean b() {
        return false;
    }
}
