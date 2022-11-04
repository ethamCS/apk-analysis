package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.camera2.internal.a3;
import androidx.camera.camera2.internal.o2;
import androidx.concurrent.futures.c;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import w.r0;
/* loaded from: classes.dex */
public class u2 extends o2.a implements o2, a3.b {

    /* renamed from: b */
    final t1 f2011b;

    /* renamed from: c */
    final Handler f2012c;

    /* renamed from: d */
    final Executor f2013d;

    /* renamed from: e */
    private final ScheduledExecutorService f2014e;

    /* renamed from: f */
    o2.a f2015f;

    /* renamed from: g */
    r.g f2016g;

    /* renamed from: h */
    x5.a<Void> f2017h;

    /* renamed from: i */
    c.a<Void> f2018i;

    /* renamed from: j */
    private x5.a<List<Surface>> f2019j;

    /* renamed from: a */
    final Object f2010a = new Object();

    /* renamed from: k */
    private List<w.r0> f2020k = null;

    /* renamed from: l */
    private boolean f2021l = false;

    /* renamed from: m */
    private boolean f2022m = false;

    /* renamed from: n */
    private boolean f2023n = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements y.c<Void> {
        a() {
            u2.this = r1;
        }

        @Override // y.c
        public void a(Throwable th2) {
            u2.this.b();
            u2 u2Var = u2.this;
            u2Var.f2011b.j(u2Var);
        }

        /* renamed from: c */
        public void b(Void r12) {
        }
    }

    /* loaded from: classes.dex */
    class b extends CameraCaptureSession.StateCallback {
        b() {
            u2.this = r1;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onActive(CameraCaptureSession cameraCaptureSession) {
            u2.this.A(cameraCaptureSession);
            u2 u2Var = u2.this;
            u2Var.n(u2Var);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
            u2.this.A(cameraCaptureSession);
            u2 u2Var = u2.this;
            u2Var.o(u2Var);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onClosed(CameraCaptureSession cameraCaptureSession) {
            u2.this.A(cameraCaptureSession);
            u2 u2Var = u2.this;
            u2Var.p(u2Var);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            c.a<Void> aVar;
            try {
                u2.this.A(cameraCaptureSession);
                u2 u2Var = u2.this;
                u2Var.q(u2Var);
                synchronized (u2.this.f2010a) {
                    androidx.core.util.h.h(u2.this.f2018i, "OpenCaptureSession completer should not null");
                    u2 u2Var2 = u2.this;
                    aVar = u2Var2.f2018i;
                    u2Var2.f2018i = null;
                }
                aVar.f(new IllegalStateException("onConfigureFailed"));
            } catch (Throwable th2) {
                synchronized (u2.this.f2010a) {
                    androidx.core.util.h.h(u2.this.f2018i, "OpenCaptureSession completer should not null");
                    u2 u2Var3 = u2.this;
                    c.a<Void> aVar2 = u2Var3.f2018i;
                    u2Var3.f2018i = null;
                    aVar2.f(new IllegalStateException("onConfigureFailed"));
                    throw th2;
                }
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            c.a<Void> aVar;
            try {
                u2.this.A(cameraCaptureSession);
                u2 u2Var = u2.this;
                u2Var.r(u2Var);
                synchronized (u2.this.f2010a) {
                    androidx.core.util.h.h(u2.this.f2018i, "OpenCaptureSession completer should not null");
                    u2 u2Var2 = u2.this;
                    aVar = u2Var2.f2018i;
                    u2Var2.f2018i = null;
                }
                aVar.c(null);
            } catch (Throwable th2) {
                synchronized (u2.this.f2010a) {
                    androidx.core.util.h.h(u2.this.f2018i, "OpenCaptureSession completer should not null");
                    u2 u2Var3 = u2.this;
                    c.a<Void> aVar2 = u2Var3.f2018i;
                    u2Var3.f2018i = null;
                    aVar2.c(null);
                    throw th2;
                }
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onReady(CameraCaptureSession cameraCaptureSession) {
            u2.this.A(cameraCaptureSession);
            u2 u2Var = u2.this;
            u2Var.s(u2Var);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
            u2.this.A(cameraCaptureSession);
            u2 u2Var = u2.this;
            u2Var.u(u2Var, surface);
        }
    }

    public u2(t1 t1Var, Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        this.f2011b = t1Var;
        this.f2012c = handler;
        this.f2013d = executor;
        this.f2014e = scheduledExecutorService;
    }

    public /* synthetic */ void D() {
        t(this);
    }

    public /* synthetic */ void E(o2 o2Var) {
        this.f2011b.h(this);
        t(o2Var);
        this.f2015f.p(o2Var);
    }

    public /* synthetic */ void F(o2 o2Var) {
        this.f2015f.t(o2Var);
    }

    public /* synthetic */ Object G(List list, r.a0 a0Var, s.g gVar, c.a aVar) {
        String str;
        synchronized (this.f2010a) {
            B(list);
            androidx.core.util.h.j(this.f2018i == null, "The openCaptureSessionCompleter can only set once!");
            this.f2018i = aVar;
            a0Var.a(gVar);
            str = "openCaptureSession[session=" + this + "]";
        }
        return str;
    }

    public /* synthetic */ x5.a H(List list, List list2) {
        androidx.camera.core.s1.a("SyncCaptureSessionBase", "[" + this + "] getSurface...done");
        return list2.contains(null) ? y.f.f(new r0.a("Surface closed", (w.r0) list.get(list2.indexOf(null)))) : list2.isEmpty() ? y.f.f(new IllegalArgumentException("Unable to open capture session without surfaces")) : y.f.h(list2);
    }

    void A(CameraCaptureSession cameraCaptureSession) {
        if (this.f2016g == null) {
            this.f2016g = r.g.d(cameraCaptureSession, this.f2012c);
        }
    }

    void B(List<w.r0> list) {
        synchronized (this.f2010a) {
            I();
            w.w0.f(list);
            this.f2020k = list;
        }
    }

    public boolean C() {
        boolean z10;
        synchronized (this.f2010a) {
            z10 = this.f2017h != null;
        }
        return z10;
    }

    void I() {
        synchronized (this.f2010a) {
            List<w.r0> list = this.f2020k;
            if (list != null) {
                w.w0.e(list);
                this.f2020k = null;
            }
        }
    }

    @Override // androidx.camera.camera2.internal.o2
    public o2.a a() {
        return this;
    }

    @Override // androidx.camera.camera2.internal.o2
    public void b() {
        I();
    }

    @Override // androidx.camera.camera2.internal.a3.b
    public Executor c() {
        return this.f2013d;
    }

    @Override // androidx.camera.camera2.internal.o2
    public void close() {
        androidx.core.util.h.h(this.f2016g, "Need to call openCaptureSession before using this API.");
        this.f2011b.i(this);
        this.f2016g.c().close();
        c().execute(new Runnable() { // from class: androidx.camera.camera2.internal.q2
            @Override // java.lang.Runnable
            public final void run() {
                u2.this.D();
            }
        });
    }

    @Override // androidx.camera.camera2.internal.a3.b
    public s.g d(int i10, List<s.b> list, o2.a aVar) {
        this.f2015f = aVar;
        return new s.g(i10, list, c(), new b());
    }

    @Override // androidx.camera.camera2.internal.o2
    public void e() {
        androidx.core.util.h.h(this.f2016g, "Need to call openCaptureSession before using this API.");
        this.f2016g.c().stopRepeating();
    }

    @Override // androidx.camera.camera2.internal.a3.b
    public x5.a<List<Surface>> f(final List<w.r0> list, long j10) {
        synchronized (this.f2010a) {
            if (this.f2022m) {
                return y.f.f(new CancellationException("Opener is disabled"));
            }
            y.d f10 = y.d.a(w.w0.k(list, false, j10, c(), this.f2014e)).f(new y.a() { // from class: androidx.camera.camera2.internal.t2
                @Override // y.a
                public final x5.a apply(Object obj) {
                    x5.a H;
                    H = u2.this.H(list, (List) obj);
                    return H;
                }
            }, c());
            this.f2019j = f10;
            return y.f.j(f10);
        }
    }

    @Override // androidx.camera.camera2.internal.o2
    public int g(List<CaptureRequest> list, CameraCaptureSession.CaptureCallback captureCallback) {
        androidx.core.util.h.h(this.f2016g, "Need to call openCaptureSession before using this API.");
        return this.f2016g.a(list, c(), captureCallback);
    }

    @Override // androidx.camera.camera2.internal.o2
    public x5.a<Void> h() {
        return y.f.h(null);
    }

    @Override // androidx.camera.camera2.internal.o2
    public r.g i() {
        androidx.core.util.h.g(this.f2016g);
        return this.f2016g;
    }

    @Override // androidx.camera.camera2.internal.o2
    public void j() {
        androidx.core.util.h.h(this.f2016g, "Need to call openCaptureSession before using this API.");
        this.f2016g.c().abortCaptures();
    }

    @Override // androidx.camera.camera2.internal.o2
    public CameraDevice k() {
        androidx.core.util.h.g(this.f2016g);
        return this.f2016g.c().getDevice();
    }

    @Override // androidx.camera.camera2.internal.a3.b
    public x5.a<Void> l(CameraDevice cameraDevice, final s.g gVar, final List<w.r0> list) {
        synchronized (this.f2010a) {
            if (this.f2022m) {
                return y.f.f(new CancellationException("Opener is disabled"));
            }
            this.f2011b.l(this);
            final r.a0 b10 = r.a0.b(cameraDevice, this.f2012c);
            x5.a<Void> a10 = androidx.concurrent.futures.c.a(new c.AbstractC0023c() { // from class: androidx.camera.camera2.internal.p2
                @Override // androidx.concurrent.futures.c.AbstractC0023c
                public final Object a(c.a aVar) {
                    Object G;
                    G = u2.this.G(list, b10, gVar, aVar);
                    return G;
                }
            });
            this.f2017h = a10;
            y.f.b(a10, new a(), x.a.a());
            return y.f.j(this.f2017h);
        }
    }

    @Override // androidx.camera.camera2.internal.o2
    public int m(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        androidx.core.util.h.h(this.f2016g, "Need to call openCaptureSession before using this API.");
        return this.f2016g.b(captureRequest, c(), captureCallback);
    }

    @Override // androidx.camera.camera2.internal.o2.a
    public void n(o2 o2Var) {
        this.f2015f.n(o2Var);
    }

    @Override // androidx.camera.camera2.internal.o2.a
    public void o(o2 o2Var) {
        this.f2015f.o(o2Var);
    }

    @Override // androidx.camera.camera2.internal.o2.a
    public void p(final o2 o2Var) {
        x5.a<Void> aVar;
        synchronized (this.f2010a) {
            if (!this.f2021l) {
                this.f2021l = true;
                androidx.core.util.h.h(this.f2017h, "Need to call openCaptureSession before using this API.");
                aVar = this.f2017h;
            } else {
                aVar = null;
            }
        }
        b();
        if (aVar != null) {
            aVar.b(new Runnable() { // from class: androidx.camera.camera2.internal.s2
                @Override // java.lang.Runnable
                public final void run() {
                    u2.this.E(o2Var);
                }
            }, x.a.a());
        }
    }

    @Override // androidx.camera.camera2.internal.o2.a
    public void q(o2 o2Var) {
        b();
        this.f2011b.j(this);
        this.f2015f.q(o2Var);
    }

    @Override // androidx.camera.camera2.internal.o2.a
    public void r(o2 o2Var) {
        this.f2011b.k(this);
        this.f2015f.r(o2Var);
    }

    @Override // androidx.camera.camera2.internal.o2.a
    public void s(o2 o2Var) {
        this.f2015f.s(o2Var);
    }

    @Override // androidx.camera.camera2.internal.a3.b
    public boolean stop() {
        boolean z10;
        x5.a<List<Surface>> aVar = null;
        try {
            synchronized (this.f2010a) {
                if (!this.f2022m) {
                    x5.a<List<Surface>> aVar2 = this.f2019j;
                    if (aVar2 != null) {
                        aVar = aVar2;
                    }
                    this.f2022m = true;
                }
                z10 = !C();
            }
            return z10;
        } finally {
            if (aVar != null) {
                aVar.cancel(true);
            }
        }
    }

    @Override // androidx.camera.camera2.internal.o2.a
    public void t(final o2 o2Var) {
        x5.a<Void> aVar;
        synchronized (this.f2010a) {
            if (!this.f2023n) {
                this.f2023n = true;
                androidx.core.util.h.h(this.f2017h, "Need to call openCaptureSession before using this API.");
                aVar = this.f2017h;
            } else {
                aVar = null;
            }
        }
        if (aVar != null) {
            aVar.b(new Runnable() { // from class: androidx.camera.camera2.internal.r2
                @Override // java.lang.Runnable
                public final void run() {
                    u2.this.F(o2Var);
                }
            }, x.a.a());
        }
    }

    @Override // androidx.camera.camera2.internal.o2.a
    public void u(o2 o2Var, Surface surface) {
        this.f2015f.u(o2Var, surface);
    }
}
