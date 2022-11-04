package b.c.a;

import android.graphics.Bitmap;
import android.net.Uri;
import b.c.a.s;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class v {
    private static final long s = TimeUnit.SECONDS.toNanos(5);

    /* renamed from: a */
    int f1335a;

    /* renamed from: b */
    long f1336b;

    /* renamed from: c */
    int f1337c;
    public final Uri d;
    public final int e;
    public final String f;
    public final List<b0> g;
    public final int h;
    public final int i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final float m;
    public final float n;
    public final float o;
    public final boolean p;
    public final Bitmap.Config q;
    public final s.f r;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private Uri f1338a;

        /* renamed from: b */
        private int f1339b;

        /* renamed from: c */
        private String f1340c;
        private int d;
        private int e;
        private boolean f;
        private boolean g;
        private boolean h;
        private float i;
        private float j;
        private float k;
        private boolean l;
        private List<b0> m;
        private Bitmap.Config n;
        private s.f o;

        public b(Uri uri, int i, Bitmap.Config config) {
            this.f1338a = uri;
            this.f1339b = i;
            this.n = config;
        }

        public b a(int i, int i2) {
            if (i >= 0) {
                if (i2 < 0) {
                    throw new IllegalArgumentException("Height must be positive number or 0.");
                }
                if (i2 == 0 && i == 0) {
                    throw new IllegalArgumentException("At least one dimension has to be positive number.");
                }
                this.d = i;
                this.e = i2;
                return this;
            }
            throw new IllegalArgumentException("Width must be positive number or 0.");
        }

        public v a() {
            if (!this.g || !this.f) {
                if (this.f && this.d == 0 && this.e == 0) {
                    throw new IllegalStateException("Center crop requires calling resize with positive width and height.");
                }
                if (this.g && this.d == 0 && this.e == 0) {
                    throw new IllegalStateException("Center inside requires calling resize with positive width and height.");
                }
                if (this.o == null) {
                    this.o = s.f.NORMAL;
                }
                return new v(this.f1338a, this.f1339b, this.f1340c, this.m, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.n, this.o);
            }
            throw new IllegalStateException("Center crop and center inside can not be used together.");
        }

        public boolean b() {
            return (this.f1338a == null && this.f1339b == 0) ? false : true;
        }

        public boolean c() {
            return (this.d == 0 && this.e == 0) ? false : true;
        }
    }

    private v(Uri uri, int i, String str, List<b0> list, int i2, int i3, boolean z, boolean z2, boolean z3, float f, float f2, float f3, boolean z4, Bitmap.Config config, s.f fVar) {
        this.d = uri;
        this.e = i;
        this.f = str;
        this.g = list == null ? null : Collections.unmodifiableList(list);
        this.h = i2;
        this.i = i3;
        this.j = z;
        this.k = z2;
        this.l = z3;
        this.m = f;
        this.n = f2;
        this.o = f3;
        this.p = z4;
        this.q = config;
        this.r = fVar;
    }

    public String a() {
        Uri uri = this.d;
        return uri != null ? String.valueOf(uri.getPath()) : Integer.toHexString(this.e);
    }

    public boolean b() {
        return this.g != null;
    }

    public boolean c() {
        return (this.h == 0 && this.i == 0) ? false : true;
    }

    public String d() {
        StringBuilder sb;
        long nanoTime = System.nanoTime() - this.f1336b;
        if (nanoTime > s) {
            sb = new StringBuilder();
            sb.append(g());
            sb.append('+');
            sb.append(TimeUnit.NANOSECONDS.toSeconds(nanoTime));
            sb.append('s');
        } else {
            sb = new StringBuilder();
            sb.append(g());
            sb.append('+');
            sb.append(TimeUnit.NANOSECONDS.toMillis(nanoTime));
            sb.append("ms");
        }
        return sb.toString();
    }

    public boolean e() {
        return c() || this.m != 0.0f;
    }

    public boolean f() {
        return e() || b();
    }

    public String g() {
        return "[R" + this.f1335a + ']';
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Request{");
        int i = this.e;
        if (i > 0) {
            sb.append(i);
        } else {
            sb.append(this.d);
        }
        List<b0> list = this.g;
        if (list != null && !list.isEmpty()) {
            for (b0 b0Var : this.g) {
                sb.append(' ');
                sb.append(b0Var.a());
            }
        }
        if (this.f != null) {
            sb.append(" stableKey(");
            sb.append(this.f);
            sb.append(')');
        }
        if (this.h > 0) {
            sb.append(" resize(");
            sb.append(this.h);
            sb.append(',');
            sb.append(this.i);
            sb.append(')');
        }
        if (this.j) {
            sb.append(" centerCrop");
        }
        if (this.k) {
            sb.append(" centerInside");
        }
        if (this.m != 0.0f) {
            sb.append(" rotation(");
            sb.append(this.m);
            if (this.p) {
                sb.append(" @ ");
                sb.append(this.n);
                sb.append(',');
                sb.append(this.o);
            }
            sb.append(')');
        }
        if (this.q != null) {
            sb.append(' ');
            sb.append(this.q);
        }
        sb.append('}');
        return sb.toString();
    }
}
