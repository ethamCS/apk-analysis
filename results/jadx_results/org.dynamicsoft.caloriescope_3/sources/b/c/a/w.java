package b.c.a;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import b.c.a.s;
import b.c.a.v;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public class w {
    private static final AtomicInteger m = new AtomicInteger();

    /* renamed from: a */
    private final s f1341a;

    /* renamed from: b */
    private final v.b f1342b;

    /* renamed from: c */
    private boolean f1343c;
    private boolean d;
    private boolean e = true;
    private int f;
    private int g;
    private int h;
    private int i;
    private Drawable j;
    private Drawable k;
    private Object l;

    public w(s sVar, Uri uri, int i) {
        if (!sVar.o) {
            this.f1341a = sVar;
            this.f1342b = new v.b(uri, i, sVar.l);
            return;
        }
        throw new IllegalStateException("Picasso instance already shut down. Cannot submit new requests.");
    }

    private v a(long j) {
        int andIncrement = m.getAndIncrement();
        v a2 = this.f1342b.a();
        a2.f1335a = andIncrement;
        a2.f1336b = j;
        boolean z = this.f1341a.n;
        if (z) {
            d0.a("Main", "created", a2.g(), a2.toString());
        }
        this.f1341a.a(a2);
        if (a2 != a2) {
            a2.f1335a = andIncrement;
            a2.f1336b = j;
            if (z) {
                String d = a2.d();
                d0.a("Main", "changed", d, "into " + a2);
            }
        }
        return a2;
    }

    private Drawable b() {
        return this.f != 0 ? this.f1341a.e.getResources().getDrawable(this.f) : this.j;
    }

    public w a() {
        this.d = false;
        return this;
    }

    public w a(int i) {
        if (i != 0) {
            if (this.k != null) {
                throw new IllegalStateException("Error image already set.");
            }
            this.g = i;
            return this;
        }
        throw new IllegalArgumentException("Error image resource invalid.");
    }

    public w a(int i, int i2) {
        this.f1342b.a(i, i2);
        return this;
    }

    public void a(ImageView imageView) {
        a(imageView, (e) null);
    }

    public void a(ImageView imageView, e eVar) {
        Bitmap b2;
        long nanoTime = System.nanoTime();
        d0.a();
        if (imageView != null) {
            if (!this.f1342b.b()) {
                this.f1341a.a(imageView);
                if (!this.e) {
                    return;
                }
                t.a(imageView, b());
                return;
            }
            if (this.d) {
                if (this.f1342b.c()) {
                    throw new IllegalStateException("Fit cannot be used with resize.");
                }
                int width = imageView.getWidth();
                int height = imageView.getHeight();
                if (width == 0 || height == 0) {
                    if (this.e) {
                        t.a(imageView, b());
                    }
                    this.f1341a.a(imageView, new h(this, imageView, eVar));
                    return;
                }
                this.f1342b.a(width, height);
            }
            v a2 = a(nanoTime);
            String a3 = d0.a(a2);
            if (!p.a(this.h) || (b2 = this.f1341a.b(a3)) == null) {
                if (this.e) {
                    t.a(imageView, b());
                }
                this.f1341a.a((a) new l(this.f1341a, imageView, a2, this.h, this.i, this.g, this.k, a3, this.l, eVar, this.f1343c));
                return;
            }
            this.f1341a.a(imageView);
            s sVar = this.f1341a;
            t.a(imageView, sVar.e, b2, s.e.MEMORY, this.f1343c, sVar.m);
            if (this.f1341a.n) {
                String g = a2.g();
                d0.a("Main", "completed", g, "from " + s.e.MEMORY);
            }
            if (eVar == null) {
                return;
            }
            eVar.a();
            return;
        }
        throw new IllegalArgumentException("Target must not be null.");
    }
}
