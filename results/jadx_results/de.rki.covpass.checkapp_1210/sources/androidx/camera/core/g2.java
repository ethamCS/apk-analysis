package androidx.camera.core;

import android.media.ImageReader;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.g2;
import androidx.concurrent.futures.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import w.h1;
/* loaded from: classes.dex */
public class g2 implements w.h1 {

    /* renamed from: g */
    final w.h1 f2239g;

    /* renamed from: h */
    final w.h1 f2240h;

    /* renamed from: i */
    h1.a f2241i;

    /* renamed from: j */
    Executor f2242j;

    /* renamed from: k */
    c.a<Void> f2243k;

    /* renamed from: l */
    private x5.a<Void> f2244l;

    /* renamed from: m */
    final Executor f2245m;

    /* renamed from: n */
    final w.l0 f2246n;

    /* renamed from: o */
    private final x5.a<Void> f2247o;

    /* renamed from: t */
    f f2252t;

    /* renamed from: u */
    Executor f2253u;

    /* renamed from: a */
    final Object f2233a = new Object();

    /* renamed from: b */
    private h1.a f2234b = new a();

    /* renamed from: c */
    private h1.a f2235c = new b();

    /* renamed from: d */
    private y.c<List<n1>> f2236d = new c();

    /* renamed from: e */
    boolean f2237e = false;

    /* renamed from: f */
    boolean f2238f = false;

    /* renamed from: p */
    private String f2248p = new String();

    /* renamed from: q */
    q2 f2249q = new q2(Collections.emptyList(), this.f2248p);

    /* renamed from: r */
    private final List<Integer> f2250r = new ArrayList();

    /* renamed from: s */
    private x5.a<List<n1>> f2251s = y.f.h(new ArrayList());

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements h1.a {
        a() {
            g2.this = r1;
        }

        @Override // w.h1.a
        public void a(w.h1 h1Var) {
            g2.this.r(h1Var);
        }
    }

    /* loaded from: classes.dex */
    public class b implements h1.a {
        b() {
            g2.this = r1;
        }

        public /* synthetic */ void c(h1.a aVar) {
            aVar.a(g2.this);
        }

        @Override // w.h1.a
        public void a(w.h1 h1Var) {
            final h1.a aVar;
            Executor executor;
            synchronized (g2.this.f2233a) {
                g2 g2Var = g2.this;
                aVar = g2Var.f2241i;
                executor = g2Var.f2242j;
                g2Var.f2249q.e();
                g2.this.x();
            }
            if (aVar != null) {
                if (executor != null) {
                    executor.execute(new Runnable() { // from class: androidx.camera.core.h2
                        @Override // java.lang.Runnable
                        public final void run() {
                            g2.b.this.c(aVar);
                        }
                    });
                } else {
                    aVar.a(g2.this);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements y.c<List<n1>> {
        c() {
            g2.this = r1;
        }

        public static /* synthetic */ void d(f fVar, Exception exc) {
            fVar.a(exc.getMessage(), exc.getCause());
        }

        @Override // y.c
        public void a(Throwable th2) {
        }

        /* renamed from: e */
        public void b(List<n1> list) {
            g2 g2Var;
            synchronized (g2.this.f2233a) {
                g2 g2Var2 = g2.this;
                if (g2Var2.f2237e) {
                    return;
                }
                g2Var2.f2238f = true;
                q2 q2Var = g2Var2.f2249q;
                final f fVar = g2Var2.f2252t;
                Executor executor = g2Var2.f2253u;
                try {
                    g2Var2.f2246n.a(q2Var);
                } catch (Exception e10) {
                    synchronized (g2.this.f2233a) {
                        g2.this.f2249q.e();
                        if (fVar != null && executor != null) {
                            executor.execute(new Runnable() { // from class: androidx.camera.core.i2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    g2.c.d(g2.f.this, e10);
                                }
                            });
                        }
                    }
                }
                synchronized (g2.this.f2233a) {
                    g2Var = g2.this;
                    g2Var.f2238f = false;
                }
                g2Var.n();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d extends w.h {
        d() {
            g2.this = r1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: a */
        protected final w.h1 f2258a;

        /* renamed from: b */
        protected final w.j0 f2259b;

        /* renamed from: c */
        protected final w.l0 f2260c;

        /* renamed from: d */
        protected int f2261d;

        /* renamed from: e */
        protected Executor f2262e;

        public e(int i10, int i11, int i12, int i13, w.j0 j0Var, w.l0 l0Var) {
            this(new v1(i10, i11, i12, i13), j0Var, l0Var);
        }

        public e(w.h1 h1Var, w.j0 j0Var, w.l0 l0Var) {
            this.f2262e = Executors.newSingleThreadExecutor();
            this.f2258a = h1Var;
            this.f2259b = j0Var;
            this.f2260c = l0Var;
            this.f2261d = h1Var.f();
        }

        public g2 a() {
            return new g2(this);
        }

        public e b(int i10) {
            this.f2261d = i10;
            return this;
        }

        public e c(Executor executor) {
            this.f2262e = executor;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public interface f {
        void a(String str, Throwable th2);
    }

    g2(e eVar) {
        if (eVar.f2258a.i() >= eVar.f2259b.a().size()) {
            w.h1 h1Var = eVar.f2258a;
            this.f2239g = h1Var;
            int d10 = h1Var.d();
            int a10 = h1Var.a();
            int i10 = eVar.f2261d;
            if (i10 == 256) {
                d10 = ((int) (d10 * a10 * 1.5f)) + 64000;
                a10 = 1;
            }
            androidx.camera.core.d dVar = new androidx.camera.core.d(ImageReader.newInstance(d10, a10, i10, h1Var.i()));
            this.f2240h = dVar;
            this.f2245m = eVar.f2262e;
            w.l0 l0Var = eVar.f2260c;
            this.f2246n = l0Var;
            l0Var.c(dVar.b(), eVar.f2261d);
            l0Var.b(new Size(h1Var.d(), h1Var.a()));
            this.f2247o = l0Var.d();
            v(eVar.f2259b);
            return;
        }
        throw new IllegalArgumentException("MetadataImageReader is smaller than CaptureBundle.");
    }

    private void m() {
        synchronized (this.f2233a) {
            if (!this.f2251s.isDone()) {
                this.f2251s.cancel(true);
            }
            this.f2249q.e();
        }
    }

    public /* synthetic */ void s(c.a aVar) {
        m();
        if (aVar != null) {
            aVar.c(null);
        }
    }

    public static /* synthetic */ Void t(Void r02) {
        return null;
    }

    public /* synthetic */ Object u(c.a aVar) {
        synchronized (this.f2233a) {
            this.f2243k = aVar;
        }
        return "ProcessingImageReader-close";
    }

    @Override // w.h1
    public int a() {
        int a10;
        synchronized (this.f2233a) {
            a10 = this.f2239g.a();
        }
        return a10;
    }

    @Override // w.h1
    public Surface b() {
        Surface b10;
        synchronized (this.f2233a) {
            b10 = this.f2239g.b();
        }
        return b10;
    }

    @Override // w.h1
    public void close() {
        synchronized (this.f2233a) {
            if (this.f2237e) {
                return;
            }
            this.f2239g.h();
            this.f2240h.h();
            this.f2237e = true;
            this.f2246n.close();
            n();
        }
    }

    @Override // w.h1
    public int d() {
        int d10;
        synchronized (this.f2233a) {
            d10 = this.f2239g.d();
        }
        return d10;
    }

    @Override // w.h1
    public n1 e() {
        n1 e10;
        synchronized (this.f2233a) {
            e10 = this.f2240h.e();
        }
        return e10;
    }

    @Override // w.h1
    public int f() {
        int f10;
        synchronized (this.f2233a) {
            f10 = this.f2240h.f();
        }
        return f10;
    }

    @Override // w.h1
    public void g(h1.a aVar, Executor executor) {
        synchronized (this.f2233a) {
            this.f2241i = (h1.a) androidx.core.util.h.g(aVar);
            this.f2242j = (Executor) androidx.core.util.h.g(executor);
            this.f2239g.g(this.f2234b, executor);
            this.f2240h.g(this.f2235c, executor);
        }
    }

    @Override // w.h1
    public void h() {
        synchronized (this.f2233a) {
            this.f2241i = null;
            this.f2242j = null;
            this.f2239g.h();
            this.f2240h.h();
            if (!this.f2238f) {
                this.f2249q.d();
            }
        }
    }

    @Override // w.h1
    public int i() {
        int i10;
        synchronized (this.f2233a) {
            i10 = this.f2239g.i();
        }
        return i10;
    }

    @Override // w.h1
    public n1 j() {
        n1 j10;
        synchronized (this.f2233a) {
            j10 = this.f2240h.j();
        }
        return j10;
    }

    void n() {
        boolean z10;
        boolean z11;
        final c.a<Void> aVar;
        synchronized (this.f2233a) {
            z10 = this.f2237e;
            z11 = this.f2238f;
            aVar = this.f2243k;
            if (z10 && !z11) {
                this.f2239g.close();
                this.f2249q.d();
                this.f2240h.close();
            }
        }
        if (!z10 || z11) {
            return;
        }
        this.f2247o.b(new Runnable() { // from class: androidx.camera.core.e2
            @Override // java.lang.Runnable
            public final void run() {
                g2.this.s(aVar);
            }
        }, x.a.a());
    }

    public w.h o() {
        synchronized (this.f2233a) {
            w.h1 h1Var = this.f2239g;
            if (h1Var instanceof v1) {
                return ((v1) h1Var).p();
            }
            return new d();
        }
    }

    public x5.a<Void> p() {
        x5.a<Void> aVar;
        synchronized (this.f2233a) {
            if (!this.f2237e || this.f2238f) {
                if (this.f2244l == null) {
                    this.f2244l = androidx.concurrent.futures.c.a(new c.AbstractC0023c() { // from class: androidx.camera.core.d2
                        @Override // androidx.concurrent.futures.c.AbstractC0023c
                        public final Object a(c.a aVar2) {
                            Object u10;
                            u10 = g2.this.u(aVar2);
                            return u10;
                        }
                    });
                }
                aVar = y.f.j(this.f2244l);
            } else {
                aVar = y.f.o(this.f2247o, f2.f2175a, x.a.a());
            }
        }
        return aVar;
    }

    public String q() {
        return this.f2248p;
    }

    void r(w.h1 h1Var) {
        synchronized (this.f2233a) {
            if (this.f2237e) {
                return;
            }
            try {
                n1 j10 = h1Var.j();
                if (j10 != null) {
                    Integer num = (Integer) j10.I().a().c(this.f2248p);
                    if (!this.f2250r.contains(num)) {
                        s1.k("ProcessingImageReader", "ImageProxyBundle does not contain this id: " + num);
                        j10.close();
                    } else {
                        this.f2249q.c(j10);
                    }
                }
            } catch (IllegalStateException e10) {
                s1.d("ProcessingImageReader", "Failed to acquire latest image.", e10);
            }
        }
    }

    public void v(w.j0 j0Var) {
        synchronized (this.f2233a) {
            if (this.f2237e) {
                return;
            }
            m();
            if (j0Var.a() != null) {
                if (this.f2239g.i() < j0Var.a().size()) {
                    throw new IllegalArgumentException("CaptureBundle is larger than InputImageReader.");
                }
                this.f2250r.clear();
                for (w.m0 m0Var : j0Var.a()) {
                    if (m0Var != null) {
                        this.f2250r.add(Integer.valueOf(m0Var.getId()));
                    }
                }
            }
            String num = Integer.toString(j0Var.hashCode());
            this.f2248p = num;
            this.f2249q = new q2(this.f2250r, num);
            x();
        }
    }

    public void w(Executor executor, f fVar) {
        synchronized (this.f2233a) {
            this.f2253u = executor;
            this.f2252t = fVar;
        }
    }

    void x() {
        ArrayList arrayList = new ArrayList();
        for (Integer num : this.f2250r) {
            arrayList.add(this.f2249q.a(num.intValue()));
        }
        this.f2251s = y.f.c(arrayList);
        y.f.b(y.f.c(arrayList), this.f2236d, this.f2245m);
    }
}
