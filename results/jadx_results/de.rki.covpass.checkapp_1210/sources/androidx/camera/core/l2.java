package androidx.camera.core;

import android.os.Handler;
import android.os.Looper;
import android.util.Size;
import android.view.Surface;
import java.util.concurrent.ScheduledExecutorService;
import w.h1;
/* loaded from: classes.dex */
public final class l2 extends w.r0 {

    /* renamed from: n */
    private final h1.a f2394n;

    /* renamed from: p */
    private final Size f2396p;

    /* renamed from: q */
    final v1 f2397q;

    /* renamed from: r */
    final Surface f2398r;

    /* renamed from: s */
    private final Handler f2399s;

    /* renamed from: t */
    final w.m0 f2400t;

    /* renamed from: u */
    final w.l0 f2401u;

    /* renamed from: v */
    private final w.h f2402v;

    /* renamed from: w */
    private final w.r0 f2403w;

    /* renamed from: x */
    private String f2404x;

    /* renamed from: m */
    final Object f2393m = new Object();

    /* renamed from: o */
    boolean f2395o = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements y.c<Surface> {
        a() {
            l2.this = r1;
        }

        @Override // y.c
        public void a(Throwable th2) {
            s1.d("ProcessingSurfaceTextur", "Failed to extract Listenable<Surface>.", th2);
        }

        /* renamed from: c */
        public void b(Surface surface) {
            synchronized (l2.this.f2393m) {
                l2.this.f2401u.c(surface, 1);
            }
        }
    }

    public l2(int i10, int i11, int i12, Handler handler, w.m0 m0Var, w.l0 l0Var, w.r0 r0Var, String str) {
        super(new Size(i10, i11), i12);
        h1.a aVar = new h1.a() { // from class: androidx.camera.core.k2
            @Override // w.h1.a
            public final void a(w.h1 h1Var) {
                l2.this.t(h1Var);
            }
        };
        this.f2394n = aVar;
        Size size = new Size(i10, i11);
        this.f2396p = size;
        if (handler != null) {
            this.f2399s = handler;
        } else {
            Looper myLooper = Looper.myLooper();
            if (myLooper == null) {
                throw new IllegalStateException("Creating a ProcessingSurface requires a non-null Handler, or be created  on a thread with a Looper.");
            }
            this.f2399s = new Handler(myLooper);
        }
        ScheduledExecutorService e10 = x.a.e(this.f2399s);
        v1 v1Var = new v1(i10, i11, i12, 2);
        this.f2397q = v1Var;
        v1Var.g(aVar, e10);
        this.f2398r = v1Var.b();
        this.f2402v = v1Var.p();
        this.f2401u = l0Var;
        l0Var.b(size);
        this.f2400t = m0Var;
        this.f2403w = r0Var;
        this.f2404x = str;
        y.f.b(r0Var.h(), new a(), x.a.a());
        i().b(new Runnable() { // from class: androidx.camera.core.j2
            @Override // java.lang.Runnable
            public final void run() {
                l2.this.u();
            }
        }, x.a.a());
    }

    public /* synthetic */ void t(w.h1 h1Var) {
        synchronized (this.f2393m) {
            s(h1Var);
        }
    }

    public void u() {
        synchronized (this.f2393m) {
            if (this.f2395o) {
                return;
            }
            this.f2397q.close();
            this.f2398r.release();
            this.f2403w.c();
            this.f2395o = true;
        }
    }

    @Override // w.r0
    public x5.a<Surface> n() {
        x5.a<Surface> h10;
        synchronized (this.f2393m) {
            h10 = y.f.h(this.f2398r);
        }
        return h10;
    }

    public w.h r() {
        w.h hVar;
        synchronized (this.f2393m) {
            if (this.f2395o) {
                throw new IllegalStateException("ProcessingSurface already released!");
            }
            hVar = this.f2402v;
        }
        return hVar;
    }

    void s(w.h1 h1Var) {
        if (this.f2395o) {
            return;
        }
        n1 n1Var = null;
        try {
            n1Var = h1Var.j();
        } catch (IllegalStateException e10) {
            s1.d("ProcessingSurfaceTextur", "Failed to acquire next image.", e10);
        }
        if (n1Var == null) {
            return;
        }
        k1 I = n1Var.I();
        if (I == null) {
            n1Var.close();
            return;
        }
        Integer num = (Integer) I.a().c(this.f2404x);
        if (num == null) {
            n1Var.close();
        } else if (this.f2400t.getId() == num.intValue()) {
            w.f2 f2Var = new w.f2(n1Var, this.f2404x);
            this.f2401u.a(f2Var);
            f2Var.c();
        } else {
            s1.k("ProcessingSurfaceTextur", "ImageProxyBundle does not contain this id: " + num);
            n1Var.close();
        }
    }
}
