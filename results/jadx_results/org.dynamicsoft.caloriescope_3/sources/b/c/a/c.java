package b.c.a;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.NetworkInfo;
import b.c.a.j;
import b.c.a.r;
import b.c.a.s;
import b.c.a.x;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public class c implements Runnable {
    private static final Object u = new Object();
    private static final ThreadLocal<StringBuilder> v = new a();
    private static final AtomicInteger w = new AtomicInteger();
    private static final x x = new b();

    /* renamed from: b */
    final int f1276b = w.incrementAndGet();

    /* renamed from: c */
    final s f1277c;
    final i d;
    final b.c.a.d e;
    final z f;
    final String g;
    final v h;
    final int i;
    int j;
    final x k;
    b.c.a.a l;
    List<b.c.a.a> m;
    Bitmap n;
    Future<?> o;
    s.e p;
    Exception q;
    int r;
    int s;
    s.f t;

    /* loaded from: classes.dex */
    static class a extends ThreadLocal<StringBuilder> {
        a() {
        }

        @Override // java.lang.ThreadLocal
        public StringBuilder initialValue() {
            return new StringBuilder("Picasso-");
        }
    }

    /* loaded from: classes.dex */
    static class b extends x {
        b() {
        }

        @Override // b.c.a.x
        public x.a a(v vVar, int i) {
            throw new IllegalStateException("Unrecognized type of request: " + vVar);
        }

        @Override // b.c.a.x
        public boolean a(v vVar) {
            return true;
        }
    }

    /* renamed from: b.c.a.c$c */
    /* loaded from: classes.dex */
    public static class RunnableC0057c implements Runnable {

        /* renamed from: b */
        final /* synthetic */ b0 f1278b;

        /* renamed from: c */
        final /* synthetic */ RuntimeException f1279c;

        RunnableC0057c(b0 b0Var, RuntimeException runtimeException) {
            this.f1278b = b0Var;
            this.f1279c = runtimeException;
        }

        @Override // java.lang.Runnable
        public void run() {
            throw new RuntimeException("Transformation " + this.f1278b.a() + " crashed with exception.", this.f1279c);
        }
    }

    /* loaded from: classes.dex */
    public static class d implements Runnable {

        /* renamed from: b */
        final /* synthetic */ StringBuilder f1280b;

        d(StringBuilder sb) {
            this.f1280b = sb;
        }

        @Override // java.lang.Runnable
        public void run() {
            throw new NullPointerException(this.f1280b.toString());
        }
    }

    /* loaded from: classes.dex */
    public static class e implements Runnable {

        /* renamed from: b */
        final /* synthetic */ b0 f1281b;

        e(b0 b0Var) {
            this.f1281b = b0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            throw new IllegalStateException("Transformation " + this.f1281b.a() + " returned input Bitmap but recycled it.");
        }
    }

    /* loaded from: classes.dex */
    public static class f implements Runnable {

        /* renamed from: b */
        final /* synthetic */ b0 f1282b;

        f(b0 b0Var) {
            this.f1282b = b0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            throw new IllegalStateException("Transformation " + this.f1282b.a() + " mutated input Bitmap but failed to recycle the original.");
        }
    }

    c(s sVar, i iVar, b.c.a.d dVar, z zVar, b.c.a.a aVar, x xVar) {
        this.f1277c = sVar;
        this.d = iVar;
        this.e = dVar;
        this.f = zVar;
        this.l = aVar;
        this.g = aVar.c();
        this.h = aVar.h();
        this.t = aVar.g();
        this.i = aVar.d();
        this.j = aVar.e();
        this.k = xVar;
        this.s = xVar.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static android.graphics.Bitmap a(b.c.a.v r13, android.graphics.Bitmap r14, int r15) {
        /*
            Method dump skipped, instructions count: 197
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b.c.a.c.a(b.c.a.v, android.graphics.Bitmap, int):android.graphics.Bitmap");
    }

    static Bitmap a(InputStream inputStream, v vVar) {
        n nVar = new n(inputStream);
        long a2 = nVar.a(65536);
        BitmapFactory.Options b2 = x.b(vVar);
        boolean a3 = x.a(b2);
        boolean b3 = d0.b(nVar);
        nVar.a(a2);
        if (b3) {
            byte[] c2 = d0.c(nVar);
            if (a3) {
                BitmapFactory.decodeByteArray(c2, 0, c2.length, b2);
                x.a(vVar.h, vVar.i, b2, vVar);
            }
            return BitmapFactory.decodeByteArray(c2, 0, c2.length, b2);
        }
        if (a3) {
            BitmapFactory.decodeStream(nVar, null, b2);
            x.a(vVar.h, vVar.i, b2, vVar);
            nVar.a(a2);
        }
        Bitmap decodeStream = BitmapFactory.decodeStream(nVar, null, b2);
        if (decodeStream == null) {
            throw new IOException("Failed to decode stream.");
        }
        return decodeStream;
    }

    static Bitmap a(List<b0> list, Bitmap bitmap) {
        int size = list.size();
        int i = 0;
        while (i < size) {
            b0 b0Var = list.get(i);
            try {
                Bitmap a2 = b0Var.a(bitmap);
                if (a2 == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Transformation ");
                    sb.append(b0Var.a());
                    sb.append(" returned null after ");
                    sb.append(i);
                    sb.append(" previous transformation(s).\n\nTransformation list:\n");
                    for (b0 b0Var2 : list) {
                        sb.append(b0Var2.a());
                        sb.append('\n');
                    }
                    s.p.post(new d(sb));
                    return null;
                } else if (a2 == bitmap && bitmap.isRecycled()) {
                    s.p.post(new e(b0Var));
                    return null;
                } else if (a2 != bitmap && !bitmap.isRecycled()) {
                    s.p.post(new f(b0Var));
                    return null;
                } else {
                    i++;
                    bitmap = a2;
                }
            } catch (RuntimeException e2) {
                s.p.post(new RunnableC0057c(b0Var, e2));
                return null;
            }
        }
        return bitmap;
    }

    public static c a(s sVar, i iVar, b.c.a.d dVar, z zVar, b.c.a.a aVar) {
        v h = aVar.h();
        List<x> a2 = sVar.a();
        int size = a2.size();
        for (int i = 0; i < size; i++) {
            x xVar = a2.get(i);
            if (xVar.a(h)) {
                return new c(sVar, iVar, dVar, zVar, aVar, xVar);
            }
        }
        return new c(sVar, iVar, dVar, zVar, aVar, x);
    }

    static void a(v vVar) {
        String a2 = vVar.a();
        StringBuilder sb = v.get();
        sb.ensureCapacity(a2.length() + 8);
        sb.replace(8, sb.length(), a2);
        Thread.currentThread().setName(sb.toString());
    }

    private static boolean a(boolean z, int i, int i2, int i3, int i4) {
        return !z || i > i3 || i2 > i4;
    }

    private s.f o() {
        s.f fVar = s.f.LOW;
        List<b.c.a.a> list = this.m;
        boolean z = true;
        boolean z2 = list != null && !list.isEmpty();
        if (this.l == null && !z2) {
            z = false;
        }
        if (!z) {
            return fVar;
        }
        b.c.a.a aVar = this.l;
        if (aVar != null) {
            fVar = aVar.g();
        }
        if (z2) {
            int size = this.m.size();
            for (int i = 0; i < size; i++) {
                s.f g = this.m.get(i).g();
                if (g.ordinal() > fVar.ordinal()) {
                    fVar = g;
                }
            }
        }
        return fVar;
    }

    public void a(b.c.a.a aVar) {
        String str;
        String str2;
        boolean z = this.f1277c.n;
        v vVar = aVar.f1268b;
        if (this.l != null) {
            if (this.m == null) {
                this.m = new ArrayList(3);
            }
            this.m.add(aVar);
            if (z) {
                d0.a("Hunter", "joined", vVar.d(), d0.a(this, "to "));
            }
            s.f g = aVar.g();
            if (g.ordinal() <= this.t.ordinal()) {
                return;
            }
            this.t = g;
            return;
        }
        this.l = aVar;
        if (!z) {
            return;
        }
        List<b.c.a.a> list = this.m;
        if (list == null || list.isEmpty()) {
            str = vVar.d();
            str2 = "to empty hunter";
        } else {
            str = vVar.d();
            str2 = d0.a(this, "to ");
        }
        d0.a("Hunter", "joined", str, str2);
    }

    public boolean a() {
        Future<?> future;
        if (this.l == null) {
            List<b.c.a.a> list = this.m;
            return (list == null || list.isEmpty()) && (future = this.o) != null && future.cancel(false);
        }
        return false;
    }

    public boolean a(boolean z, NetworkInfo networkInfo) {
        if (!(this.s > 0)) {
            return false;
        }
        this.s--;
        return this.k.a(z, networkInfo);
    }

    public b.c.a.a b() {
        return this.l;
    }

    public void b(b.c.a.a aVar) {
        boolean z;
        if (this.l == aVar) {
            this.l = null;
            z = true;
        } else {
            List<b.c.a.a> list = this.m;
            z = list != null ? list.remove(aVar) : false;
        }
        if (z && aVar.g() == this.t) {
            this.t = o();
        }
        if (this.f1277c.n) {
            d0.a("Hunter", "removed", aVar.f1268b.d(), d0.a(this, "from "));
        }
    }

    public List<b.c.a.a> c() {
        return this.m;
    }

    public v d() {
        return this.h;
    }

    public Exception e() {
        return this.q;
    }

    public String f() {
        return this.g;
    }

    public s.e g() {
        return this.p;
    }

    public int h() {
        return this.i;
    }

    public s i() {
        return this.f1277c;
    }

    public s.f j() {
        return this.t;
    }

    public Bitmap k() {
        return this.n;
    }

    Bitmap l() {
        Bitmap bitmap;
        if (p.a(this.i)) {
            bitmap = this.e.a(this.g);
            if (bitmap != null) {
                this.f.b();
                this.p = s.e.MEMORY;
                if (this.f1277c.n) {
                    d0.a("Hunter", "decoded", this.h.d(), "from cache");
                }
                return bitmap;
            }
        } else {
            bitmap = null;
        }
        this.h.f1337c = this.s == 0 ? q.OFFLINE.f1314b : this.j;
        x.a a2 = this.k.a(this.h, this.j);
        if (a2 != null) {
            this.p = a2.c();
            this.r = a2.b();
            bitmap = a2.a();
            if (bitmap == null) {
                InputStream d2 = a2.d();
                try {
                    Bitmap a3 = a(d2, this.h);
                    d0.a(d2);
                    bitmap = a3;
                } catch (Throwable th) {
                    d0.a(d2);
                    throw th;
                }
            }
        }
        if (bitmap != null) {
            if (this.f1277c.n) {
                d0.a("Hunter", "decoded", this.h.d());
            }
            this.f.a(bitmap);
            if (this.h.f() || this.r != 0) {
                synchronized (u) {
                    if (this.h.e() || this.r != 0) {
                        bitmap = a(this.h, bitmap, this.r);
                        if (this.f1277c.n) {
                            d0.a("Hunter", "transformed", this.h.d());
                        }
                    }
                    if (this.h.b()) {
                        bitmap = a(this.h.g, bitmap);
                        if (this.f1277c.n) {
                            d0.a("Hunter", "transformed", this.h.d(), "from custom transformations");
                        }
                    }
                }
                if (bitmap != null) {
                    this.f.b(bitmap);
                }
            }
        }
        return bitmap;
    }

    public boolean m() {
        Future<?> future = this.o;
        return future != null && future.isCancelled();
    }

    public boolean n() {
        return this.k.b();
    }

    @Override // java.lang.Runnable
    public void run() {
        i iVar;
        i iVar2;
        try {
            try {
                try {
                    a(this.h);
                    if (this.f1277c.n) {
                        d0.a("Hunter", "executing", d0.a(this));
                    }
                    Bitmap l = l();
                    this.n = l;
                    if (l == null) {
                        this.d.b(this);
                    } else {
                        this.d.a(this);
                    }
                } catch (j.b e2) {
                    if (!e2.f1301b || e2.f1302c != 504) {
                        this.q = e2;
                    }
                    iVar = this.d;
                    iVar.b(this);
                } catch (OutOfMemoryError e3) {
                    StringWriter stringWriter = new StringWriter();
                    this.f.a().a(new PrintWriter(stringWriter));
                    this.q = new RuntimeException(stringWriter.toString(), e3);
                    iVar = this.d;
                    iVar.b(this);
                }
            } catch (r.a e4) {
                this.q = e4;
                iVar2 = this.d;
                iVar2.c(this);
            } catch (IOException e5) {
                this.q = e5;
                iVar2 = this.d;
                iVar2.c(this);
            } catch (Exception e6) {
                this.q = e6;
                iVar = this.d;
                iVar.b(this);
            }
        } finally {
            Thread.currentThread().setName("Picasso-Idle");
        }
    }
}
