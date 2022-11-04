package b.c.a;

import android.graphics.Bitmap;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes.dex */
public interface j {

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        final InputStream f1298a;

        /* renamed from: b */
        final Bitmap f1299b;

        /* renamed from: c */
        final boolean f1300c;
        final long d;

        public a(InputStream inputStream, boolean z, long j) {
            if (inputStream != null) {
                this.f1298a = inputStream;
                this.f1299b = null;
                this.f1300c = z;
                this.d = j;
                return;
            }
            throw new IllegalArgumentException("Stream may not be null.");
        }

        @Deprecated
        public Bitmap a() {
            return this.f1299b;
        }

        public long b() {
            return this.d;
        }

        public InputStream c() {
            return this.f1298a;
        }
    }

    /* loaded from: classes.dex */
    public static class b extends IOException {

        /* renamed from: b */
        final boolean f1301b;

        /* renamed from: c */
        final int f1302c;

        public b(String str, int i, int i2) {
            super(str);
            this.f1301b = q.a(i);
            this.f1302c = i2;
        }
    }

    a a(Uri uri, int i);
}
