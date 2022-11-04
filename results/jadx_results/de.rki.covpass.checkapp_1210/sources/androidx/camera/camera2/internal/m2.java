package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import q.a;
import v.j;
import w.c2;
import w.d2;
import w.o0;
import w.r0;
/* loaded from: classes.dex */
public final class m2 implements r1 {

    /* renamed from: r */
    private static List<w.r0> f1821r = new ArrayList();

    /* renamed from: s */
    private static int f1822s = 0;

    /* renamed from: a */
    private final w.d2 f1823a;

    /* renamed from: b */
    private final j0 f1824b;

    /* renamed from: c */
    final Executor f1825c;

    /* renamed from: d */
    private final ScheduledExecutorService f1826d;

    /* renamed from: g */
    private w.c2 f1829g;

    /* renamed from: h */
    private b1 f1830h;

    /* renamed from: i */
    private w.c2 f1831i;

    /* renamed from: n */
    private final e f1836n;

    /* renamed from: q */
    private int f1839q;

    /* renamed from: f */
    private List<w.r0> f1828f = new ArrayList();

    /* renamed from: j */
    private boolean f1832j = false;

    /* renamed from: l */
    private volatile w.k0 f1834l = null;

    /* renamed from: m */
    volatile boolean f1835m = false;

    /* renamed from: o */
    private v.j f1837o = new j.a().d();

    /* renamed from: p */
    private v.j f1838p = new j.a().d();

    /* renamed from: e */
    private final q1 f1827e = new q1();

    /* renamed from: k */
    private d f1833k = d.UNINITIALIZED;

    /* loaded from: classes.dex */
    public class a implements y.c<Void> {
        a() {
            m2.this = r1;
        }

        @Override // y.c
        public void a(Throwable th2) {
            androidx.camera.core.s1.d("ProcessingCaptureSession", "open session failed ", th2);
            m2.this.close();
        }

        /* renamed from: c */
        public void b(Void r12) {
        }
    }

    /* loaded from: classes.dex */
    public class b implements d2.a {

        /* renamed from: a */
        final /* synthetic */ w.k0 f1841a;

        b(w.k0 k0Var) {
            m2.this = r1;
            this.f1841a = k0Var;
        }
    }

    /* loaded from: classes.dex */
    public static /* synthetic */ class c {

        /* renamed from: a */
        static final /* synthetic */ int[] f1843a;

        static {
            int[] iArr = new int[d.values().length];
            f1843a = iArr;
            try {
                iArr[d.UNINITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1843a[d.SESSION_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1843a[d.ON_CAPTURE_SESSION_STARTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1843a[d.ON_CAPTURE_SESSION_ENDED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1843a[d.CLOSED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum d {
        UNINITIALIZED,
        SESSION_INITIALIZED,
        ON_CAPTURE_SESSION_STARTED,
        ON_CAPTURE_SESSION_ENDED,
        CLOSED
    }

    /* loaded from: classes.dex */
    public static class e implements d2.a {

        /* renamed from: a */
        private List<w.h> f1849a = Collections.emptyList();

        /* renamed from: b */
        private final Executor f1850b;

        e(Executor executor) {
            this.f1850b = executor;
        }
    }

    public m2(w.d2 d2Var, j0 j0Var, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.f1839q = 0;
        this.f1823a = d2Var;
        this.f1824b = j0Var;
        this.f1825c = executor;
        this.f1826d = scheduledExecutorService;
        this.f1836n = new e(executor);
        int i10 = f1822s;
        f1822s = i10 + 1;
        this.f1839q = i10;
        androidx.camera.core.s1.a("ProcessingCaptureSession", "New ProcessingCaptureSession (id=" + this.f1839q + ")");
    }

    private static void l(List<w.k0> list) {
        for (w.k0 k0Var : list) {
            for (w.h hVar : k0Var.b()) {
                hVar.a();
            }
        }
    }

    private static List<w.e2> m(List<w.r0> list) {
        ArrayList arrayList = new ArrayList();
        for (w.r0 r0Var : list) {
            androidx.core.util.h.b(r0Var instanceof w.e2, "Surface must be SessionProcessorSurface");
            arrayList.add((w.e2) r0Var);
        }
        return arrayList;
    }

    private boolean n(List<w.k0> list) {
        if (list.isEmpty()) {
            return false;
        }
        for (w.k0 k0Var : list) {
            if (k0Var.g() != 2) {
                return false;
            }
        }
        return true;
    }

    public /* synthetic */ void o() {
        w.w0.e(this.f1828f);
    }

    public static /* synthetic */ void p(w.r0 r0Var) {
        f1821r.remove(r0Var);
    }

    public /* synthetic */ x5.a q(w.c2 c2Var, CameraDevice cameraDevice, a3 a3Var, List list) {
        androidx.camera.core.s1.a("ProcessingCaptureSession", "-- getSurfaces done, start init (id=" + this.f1839q + ")");
        if (this.f1833k == d.CLOSED) {
            return y.f.f(new IllegalStateException("SessionProcessorCaptureSession is closed."));
        }
        w.v1 v1Var = null;
        if (list.contains(null)) {
            return y.f.f(new r0.a("Surface closed", c2Var.j().get(list.indexOf(null))));
        }
        try {
            w.w0.f(this.f1828f);
            w.v1 v1Var2 = null;
            w.v1 v1Var3 = null;
            for (int i10 = 0; i10 < c2Var.j().size(); i10++) {
                w.r0 r0Var = c2Var.j().get(i10);
                if (Objects.equals(r0Var.e(), androidx.camera.core.c2.class)) {
                    v1Var = w.v1.a(r0Var.h().get(), new Size(r0Var.f().getWidth(), r0Var.f().getHeight()), r0Var.g());
                } else if (Objects.equals(r0Var.e(), androidx.camera.core.g1.class)) {
                    v1Var2 = w.v1.a(r0Var.h().get(), new Size(r0Var.f().getWidth(), r0Var.f().getHeight()), r0Var.g());
                } else if (Objects.equals(r0Var.e(), androidx.camera.core.p0.class)) {
                    v1Var3 = w.v1.a(r0Var.h().get(), new Size(r0Var.f().getWidth(), r0Var.f().getHeight()), r0Var.g());
                }
            }
            this.f1833k = d.SESSION_INITIALIZED;
            androidx.camera.core.s1.k("ProcessingCaptureSession", "== initSession (id=" + this.f1839q + ")");
            w.c2 a10 = this.f1823a.a(this.f1824b, v1Var, v1Var2, v1Var3);
            this.f1831i = a10;
            a10.j().get(0).i().b(new Runnable() { // from class: androidx.camera.camera2.internal.i2
                @Override // java.lang.Runnable
                public final void run() {
                    m2.this.o();
                }
            }, x.a.a());
            for (final w.r0 r0Var2 : this.f1831i.j()) {
                f1821r.add(r0Var2);
                r0Var2.i().b(new Runnable() { // from class: androidx.camera.camera2.internal.j2
                    @Override // java.lang.Runnable
                    public final void run() {
                        m2.p(w.r0.this);
                    }
                }, this.f1825c);
            }
            c2.f fVar = new c2.f();
            fVar.a(c2Var);
            fVar.c();
            fVar.a(this.f1831i);
            androidx.core.util.h.b(fVar.d(), "Cannot transform the SessionConfig");
            x5.a<Void> f10 = this.f1827e.f(fVar.b(), (CameraDevice) androidx.core.util.h.g(cameraDevice), a3Var);
            y.f.b(f10, new a(), this.f1825c);
            return f10;
        } catch (r0.a e10) {
            return y.f.f(e10);
        }
    }

    public /* synthetic */ Void r(Void r12) {
        s(this.f1827e);
        return null;
    }

    private void t(v.j jVar, v.j jVar2) {
        a.C0313a c0313a = new a.C0313a();
        c0313a.d(jVar);
        c0313a.d(jVar2);
        this.f1823a.d(c0313a.c());
    }

    @Override // androidx.camera.camera2.internal.r1
    public x5.a<Void> a(boolean z10) {
        androidx.core.util.h.j(this.f1833k == d.CLOSED, "release() can only be called in CLOSED state");
        androidx.camera.core.s1.a("ProcessingCaptureSession", "release (id=" + this.f1839q + ")");
        return this.f1827e.a(z10);
    }

    @Override // androidx.camera.camera2.internal.r1
    public List<w.k0> b() {
        return this.f1834l != null ? Arrays.asList(this.f1834l) : Collections.emptyList();
    }

    @Override // androidx.camera.camera2.internal.r1
    public void c(List<w.k0> list) {
        if (list.isEmpty()) {
            return;
        }
        if (list.size() > 1 || !n(list)) {
            l(list);
        } else if (this.f1834l != null || this.f1835m) {
            l(list);
        } else {
            w.k0 k0Var = list.get(0);
            androidx.camera.core.s1.a("ProcessingCaptureSession", "issueCaptureRequests (id=" + this.f1839q + ") + state =" + this.f1833k);
            int i10 = c.f1843a[this.f1833k.ordinal()];
            if (i10 == 1 || i10 == 2) {
                this.f1834l = k0Var;
            } else if (i10 != 3) {
                if (i10 != 4 && i10 != 5) {
                    return;
                }
                androidx.camera.core.s1.a("ProcessingCaptureSession", "Run issueCaptureRequests in wrong state, state = " + this.f1833k);
                l(list);
            } else {
                this.f1835m = true;
                j.a e10 = j.a.e(k0Var.d());
                w.o0 d10 = k0Var.d();
                o0.a<Integer> aVar = w.k0.f24491h;
                if (d10.e(aVar)) {
                    e10.g(CaptureRequest.JPEG_ORIENTATION, (Integer) k0Var.d().b(aVar));
                }
                w.o0 d11 = k0Var.d();
                o0.a<Integer> aVar2 = w.k0.f24492i;
                if (d11.e(aVar2)) {
                    e10.g(CaptureRequest.JPEG_QUALITY, Byte.valueOf(((Integer) k0Var.d().b(aVar2)).byteValue()));
                }
                v.j d12 = e10.d();
                this.f1838p = d12;
                t(this.f1837o, d12);
                this.f1823a.e(new b(k0Var));
            }
        }
    }

    @Override // androidx.camera.camera2.internal.r1
    public void close() {
        androidx.camera.core.s1.a("ProcessingCaptureSession", "close (id=" + this.f1839q + ") state=" + this.f1833k);
        int i10 = c.f1843a[this.f1833k.ordinal()];
        if (i10 != 2) {
            if (i10 == 3) {
                this.f1823a.f();
                b1 b1Var = this.f1830h;
                if (b1Var != null) {
                    b1Var.a();
                }
                this.f1833k = d.ON_CAPTURE_SESSION_ENDED;
            } else if (i10 != 4) {
                if (i10 == 5) {
                    return;
                }
                this.f1833k = d.CLOSED;
                this.f1827e.close();
            }
        }
        this.f1823a.g();
        this.f1833k = d.CLOSED;
        this.f1827e.close();
    }

    @Override // androidx.camera.camera2.internal.r1
    public w.c2 d() {
        return this.f1829g;
    }

    @Override // androidx.camera.camera2.internal.r1
    public void e() {
        androidx.camera.core.s1.a("ProcessingCaptureSession", "cancelIssuedCaptureRequests (id=" + this.f1839q + ")");
        if (this.f1834l != null) {
            for (w.h hVar : this.f1834l.b()) {
                hVar.a();
            }
            this.f1834l = null;
        }
    }

    @Override // androidx.camera.camera2.internal.r1
    public x5.a<Void> f(final w.c2 c2Var, final CameraDevice cameraDevice, final a3 a3Var) {
        boolean z10 = this.f1833k == d.UNINITIALIZED;
        androidx.core.util.h.b(z10, "Invalid state state:" + this.f1833k);
        androidx.core.util.h.b(c2Var.j().isEmpty() ^ true, "SessionConfig contains no surfaces");
        androidx.camera.core.s1.a("ProcessingCaptureSession", "open (id=" + this.f1839q + ")");
        List<w.r0> j10 = c2Var.j();
        this.f1828f = j10;
        return y.d.a(w.w0.k(j10, false, 5000L, this.f1825c, this.f1826d)).f(new y.a() { // from class: androidx.camera.camera2.internal.l2
            @Override // y.a
            public final x5.a apply(Object obj) {
                x5.a q10;
                q10 = m2.this.q(c2Var, cameraDevice, a3Var, (List) obj);
                return q10;
            }
        }, this.f1825c).e(new o.a() { // from class: androidx.camera.camera2.internal.k2
            @Override // o.a
            public final Object apply(Object obj) {
                Void r10;
                r10 = m2.this.r((Void) obj);
                return r10;
            }
        }, this.f1825c);
    }

    @Override // androidx.camera.camera2.internal.r1
    public void g(w.c2 c2Var) {
        androidx.camera.core.s1.a("ProcessingCaptureSession", "setSessionConfig (id=" + this.f1839q + ")");
        this.f1829g = c2Var;
        if (c2Var == null) {
            return;
        }
        b1 b1Var = this.f1830h;
        if (b1Var != null) {
            b1Var.b(c2Var);
        }
        if (this.f1833k != d.ON_CAPTURE_SESSION_STARTED) {
            return;
        }
        v.j d10 = j.a.e(c2Var.d()).d();
        this.f1837o = d10;
        t(d10, this.f1838p);
        if (this.f1832j) {
            return;
        }
        this.f1823a.b(this.f1836n);
        this.f1832j = true;
    }

    void s(q1 q1Var) {
        boolean z10 = this.f1833k == d.SESSION_INITIALIZED;
        androidx.core.util.h.b(z10, "Invalid state state:" + this.f1833k);
        b1 b1Var = new b1(q1Var, m(this.f1831i.j()));
        this.f1830h = b1Var;
        this.f1823a.c(b1Var);
        this.f1833k = d.ON_CAPTURE_SESSION_STARTED;
        w.c2 c2Var = this.f1829g;
        if (c2Var != null) {
            g(c2Var);
        }
        if (this.f1834l != null) {
            List<w.k0> asList = Arrays.asList(this.f1834l);
            this.f1834l = null;
            c(asList);
        }
    }
}
