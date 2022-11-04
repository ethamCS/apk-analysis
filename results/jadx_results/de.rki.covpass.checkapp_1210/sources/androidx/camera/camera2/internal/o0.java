package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.camera2.internal.o0;
import androidx.camera.camera2.internal.t;
import androidx.concurrent.futures.c;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import q.a;
import w.k0;
/* loaded from: classes.dex */
public class o0 {

    /* renamed from: a */
    private final t f1881a;

    /* renamed from: b */
    private final u.r f1882b;

    /* renamed from: c */
    private final w.y1 f1883c;

    /* renamed from: d */
    private final Executor f1884d;

    /* renamed from: e */
    private final boolean f1885e;

    /* renamed from: f */
    private int f1886f = 1;

    /* loaded from: classes.dex */
    public static class a implements d {

        /* renamed from: a */
        private final t f1887a;

        /* renamed from: b */
        private final u.l f1888b;

        /* renamed from: c */
        private final int f1889c;

        /* renamed from: d */
        private boolean f1890d = false;

        a(t tVar, int i10, u.l lVar) {
            this.f1887a = tVar;
            this.f1889c = i10;
            this.f1888b = lVar;
        }

        public /* synthetic */ Object f(c.a aVar) {
            this.f1887a.A().K(aVar);
            this.f1888b.b();
            return "AePreCapture";
        }

        @Override // androidx.camera.camera2.internal.o0.d
        public boolean a() {
            return this.f1889c == 0;
        }

        @Override // androidx.camera.camera2.internal.o0.d
        public x5.a<Boolean> b(TotalCaptureResult totalCaptureResult) {
            if (o0.a(this.f1889c, totalCaptureResult)) {
                androidx.camera.core.s1.a("Camera2CapturePipeline", "Trigger AE");
                this.f1890d = true;
                return y.d.a(androidx.concurrent.futures.c.a(new c.AbstractC0023c() { // from class: androidx.camera.camera2.internal.m0
                    @Override // androidx.concurrent.futures.c.AbstractC0023c
                    public final Object a(c.a aVar) {
                        Object f10;
                        f10 = o0.a.this.f(aVar);
                        return f10;
                    }
                })).e(n0.f1853a, x.a.a());
            }
            return y.f.h(Boolean.FALSE);
        }

        @Override // androidx.camera.camera2.internal.o0.d
        public void c() {
            if (this.f1890d) {
                androidx.camera.core.s1.a("Camera2CapturePipeline", "cancel TriggerAePreCapture");
                this.f1887a.A().h(false, true);
                this.f1888b.a();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b implements d {

        /* renamed from: a */
        private final t f1891a;

        /* renamed from: b */
        private boolean f1892b = false;

        b(t tVar) {
            this.f1891a = tVar;
        }

        @Override // androidx.camera.camera2.internal.o0.d
        public boolean a() {
            return true;
        }

        @Override // androidx.camera.camera2.internal.o0.d
        public x5.a<Boolean> b(TotalCaptureResult totalCaptureResult) {
            Integer num;
            x5.a<Boolean> h10 = y.f.h(Boolean.TRUE);
            if (totalCaptureResult == null || (num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)) == null) {
                return h10;
            }
            int intValue = num.intValue();
            if (intValue == 1 || intValue == 2) {
                androidx.camera.core.s1.a("Camera2CapturePipeline", "TriggerAf? AF mode auto");
                Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
                if (num2 != null && num2.intValue() == 0) {
                    androidx.camera.core.s1.a("Camera2CapturePipeline", "Trigger AF");
                    this.f1892b = true;
                    this.f1891a.A().L(null, false);
                }
            }
            return h10;
        }

        @Override // androidx.camera.camera2.internal.o0.d
        public void c() {
            if (this.f1892b) {
                androidx.camera.core.s1.a("Camera2CapturePipeline", "cancel TriggerAF");
                this.f1891a.A().h(true, false);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: i */
        private static final long f1893i;

        /* renamed from: j */
        private static final long f1894j;

        /* renamed from: a */
        private final int f1895a;

        /* renamed from: b */
        private final Executor f1896b;

        /* renamed from: c */
        private final t f1897c;

        /* renamed from: d */
        private final u.l f1898d;

        /* renamed from: e */
        private final boolean f1899e;

        /* renamed from: f */
        private long f1900f = f1893i;

        /* renamed from: g */
        final List<d> f1901g = new ArrayList();

        /* renamed from: h */
        private final d f1902h = new a();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a implements d {
            a() {
                c.this = r1;
            }

            public static /* synthetic */ Boolean e(List list) {
                return Boolean.valueOf(list.contains(Boolean.TRUE));
            }

            @Override // androidx.camera.camera2.internal.o0.d
            public boolean a() {
                for (d dVar : c.this.f1901g) {
                    if (dVar.a()) {
                        return true;
                    }
                }
                return false;
            }

            @Override // androidx.camera.camera2.internal.o0.d
            public x5.a<Boolean> b(TotalCaptureResult totalCaptureResult) {
                ArrayList arrayList = new ArrayList();
                for (d dVar : c.this.f1901g) {
                    arrayList.add(dVar.b(totalCaptureResult));
                }
                return y.f.o(y.f.c(arrayList), v0.f2032a, x.a.a());
            }

            @Override // androidx.camera.camera2.internal.o0.d
            public void c() {
                for (d dVar : c.this.f1901g) {
                    dVar.c();
                }
            }
        }

        /* loaded from: classes.dex */
        public class b extends w.h {

            /* renamed from: a */
            final /* synthetic */ c.a f1904a;

            b(c.a aVar) {
                c.this = r1;
                this.f1904a = aVar;
            }

            @Override // w.h
            public void a() {
                this.f1904a.f(new androidx.camera.core.j1(3, "Capture request is cancelled because camera is closed", null));
            }

            @Override // w.h
            public void b(w.q qVar) {
                this.f1904a.c(null);
            }

            @Override // w.h
            public void c(w.j jVar) {
                this.f1904a.f(new androidx.camera.core.j1(2, "Capture request failed with reason " + jVar.a(), null));
            }
        }

        static {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            f1893i = timeUnit.toNanos(1L);
            f1894j = timeUnit.toNanos(5L);
        }

        c(int i10, Executor executor, t tVar, boolean z10, u.l lVar) {
            this.f1895a = i10;
            this.f1896b = executor;
            this.f1897c = tVar;
            this.f1899e = z10;
            this.f1898d = lVar;
        }

        private void h(k0.a aVar) {
            a.C0313a c0313a = new a.C0313a();
            c0313a.e(CaptureRequest.CONTROL_AE_MODE, 3);
            aVar.e(c0313a.c());
        }

        private void i(k0.a aVar, w.k0 k0Var) {
            int i10 = (this.f1895a != 3 || this.f1899e) ? (k0Var.g() == -1 || k0Var.g() == 5) ? 2 : -1 : 4;
            if (i10 != -1) {
                aVar.p(i10);
            }
        }

        public boolean k(TotalCaptureResult totalCaptureResult) {
            if (totalCaptureResult == null) {
                return false;
            }
            androidx.camera.camera2.internal.e eVar = new androidx.camera.camera2.internal.e(totalCaptureResult);
            boolean z10 = eVar.g() == w.l.OFF || eVar.g() == w.l.UNKNOWN || eVar.h() == w.m.PASSIVE_FOCUSED || eVar.h() == w.m.PASSIVE_NOT_FOCUSED || eVar.h() == w.m.LOCKED_FOCUSED || eVar.h() == w.m.LOCKED_NOT_FOCUSED;
            boolean z11 = eVar.f() == w.k.CONVERGED || eVar.f() == w.k.FLASH_REQUIRED || eVar.f() == w.k.UNKNOWN;
            boolean z12 = eVar.i() == w.n.CONVERGED || eVar.i() == w.n.UNKNOWN;
            androidx.camera.core.s1.a("Camera2CapturePipeline", "checkCaptureResult, AE=" + eVar.f() + " AF =" + eVar.h() + " AWB=" + eVar.i());
            return z10 && z11 && z12;
        }

        public /* synthetic */ x5.a l(int i10, TotalCaptureResult totalCaptureResult) {
            if (o0.a(i10, totalCaptureResult)) {
                q(f1894j);
            }
            return this.f1902h.b(totalCaptureResult);
        }

        public /* synthetic */ x5.a m(Boolean bool) {
            return bool.booleanValue() ? s(this.f1900f, new e.a() { // from class: androidx.camera.camera2.internal.p0
                @Override // androidx.camera.camera2.internal.o0.e.a
                public final boolean a(TotalCaptureResult totalCaptureResult) {
                    boolean k10;
                    k10 = o0.c.this.k(totalCaptureResult);
                    return k10;
                }
            }) : y.f.h(null);
        }

        public /* synthetic */ x5.a n(List list, int i10, TotalCaptureResult totalCaptureResult) {
            return r(list, i10);
        }

        public /* synthetic */ void o() {
            this.f1902h.c();
        }

        public /* synthetic */ Object p(k0.a aVar, c.a aVar2) {
            aVar.c(new b(aVar2));
            return "submitStillCapture";
        }

        private void q(long j10) {
            this.f1900f = j10;
        }

        private x5.a<TotalCaptureResult> s(long j10, e.a aVar) {
            e eVar = new e(j10, aVar);
            this.f1897c.u(eVar);
            return eVar.c();
        }

        void g(d dVar) {
            this.f1901g.add(dVar);
        }

        x5.a<List<Void>> j(final List<w.k0> list, final int i10) {
            x5.a h10 = y.f.h(null);
            if (!this.f1901g.isEmpty()) {
                h10 = y.d.a(this.f1902h.a() ? s(0L, null) : y.f.h(null)).f(new y.a() { // from class: androidx.camera.camera2.internal.t0
                    @Override // y.a
                    public final x5.a apply(Object obj) {
                        x5.a l10;
                        l10 = o0.c.this.l(i10, (TotalCaptureResult) obj);
                        return l10;
                    }
                }, this.f1896b).f(new y.a() { // from class: androidx.camera.camera2.internal.s0
                    @Override // y.a
                    public final x5.a apply(Object obj) {
                        x5.a m10;
                        m10 = o0.c.this.m((Boolean) obj);
                        return m10;
                    }
                }, this.f1896b);
            }
            y.d f10 = y.d.a(h10).f(new y.a() { // from class: androidx.camera.camera2.internal.u0
                @Override // y.a
                public final x5.a apply(Object obj) {
                    x5.a n10;
                    n10 = o0.c.this.n(list, i10, (TotalCaptureResult) obj);
                    return n10;
                }
            }, this.f1896b);
            f10.b(new Runnable() { // from class: androidx.camera.camera2.internal.r0
                @Override // java.lang.Runnable
                public final void run() {
                    o0.c.this.o();
                }
            }, this.f1896b);
            return f10;
        }

        x5.a<List<Void>> r(List<w.k0> list, int i10) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (w.k0 k0Var : list) {
                final k0.a k10 = k0.a.k(k0Var);
                w.q qVar = null;
                if (k0Var.g() == 5) {
                    androidx.camera.core.n1 d10 = this.f1897c.M().d();
                    if (d10 != null && this.f1897c.M().c(d10)) {
                        qVar = w.r.a(d10.I());
                    }
                }
                if (qVar != null) {
                    k10.n(qVar);
                } else {
                    i(k10, k0Var);
                }
                if (this.f1898d.c(i10)) {
                    h(k10);
                }
                arrayList.add(androidx.concurrent.futures.c.a(new c.AbstractC0023c() { // from class: androidx.camera.camera2.internal.q0
                    @Override // androidx.concurrent.futures.c.AbstractC0023c
                    public final Object a(c.a aVar) {
                        Object p10;
                        p10 = o0.c.this.p(k10, aVar);
                        return p10;
                    }
                }));
                arrayList2.add(k10.h());
            }
            this.f1897c.i0(arrayList2);
            return y.f.c(arrayList);
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        boolean a();

        x5.a<Boolean> b(TotalCaptureResult totalCaptureResult);

        void c();
    }

    /* loaded from: classes.dex */
    public static class e implements t.c {

        /* renamed from: a */
        private c.a<TotalCaptureResult> f1906a;

        /* renamed from: c */
        private final long f1908c;

        /* renamed from: d */
        private final a f1909d;

        /* renamed from: b */
        private final x5.a<TotalCaptureResult> f1907b = androidx.concurrent.futures.c.a(new c.AbstractC0023c() { // from class: androidx.camera.camera2.internal.w0
            @Override // androidx.concurrent.futures.c.AbstractC0023c
            public final Object a(c.a aVar) {
                Object d10;
                d10 = o0.e.this.d(aVar);
                return d10;
            }
        });

        /* renamed from: e */
        private volatile Long f1910e = null;

        /* loaded from: classes.dex */
        public interface a {
            boolean a(TotalCaptureResult totalCaptureResult);
        }

        e(long j10, a aVar) {
            this.f1908c = j10;
            this.f1909d = aVar;
        }

        public /* synthetic */ Object d(c.a aVar) {
            this.f1906a = aVar;
            return "waitFor3AResult";
        }

        @Override // androidx.camera.camera2.internal.t.c
        public boolean a(TotalCaptureResult totalCaptureResult) {
            Long l10 = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP);
            if (l10 != null && this.f1910e == null) {
                this.f1910e = l10;
            }
            Long l11 = this.f1910e;
            if (0 == this.f1908c || l11 == null || l10 == null || l10.longValue() - l11.longValue() <= this.f1908c) {
                a aVar = this.f1909d;
                if (aVar != null && !aVar.a(totalCaptureResult)) {
                    return false;
                }
                this.f1906a.c(totalCaptureResult);
                return true;
            }
            this.f1906a.c(null);
            androidx.camera.core.s1.a("Camera2CapturePipeline", "Wait for capture result timeout, current:" + l10 + " first: " + l11);
            return true;
        }

        public x5.a<TotalCaptureResult> c() {
            return this.f1907b;
        }
    }

    /* loaded from: classes.dex */
    public static class f implements d {

        /* renamed from: a */
        private final t f1911a;

        /* renamed from: b */
        private final int f1912b;

        /* renamed from: c */
        private boolean f1913c = false;

        f(t tVar, int i10) {
            this.f1911a = tVar;
            this.f1912b = i10;
        }

        public /* synthetic */ Object f(c.a aVar) {
            this.f1911a.J().g(aVar, true);
            return "TorchOn";
        }

        @Override // androidx.camera.camera2.internal.o0.d
        public boolean a() {
            return this.f1912b == 0;
        }

        @Override // androidx.camera.camera2.internal.o0.d
        public x5.a<Boolean> b(TotalCaptureResult totalCaptureResult) {
            if (o0.a(this.f1912b, totalCaptureResult)) {
                if (!this.f1911a.R()) {
                    androidx.camera.core.s1.a("Camera2CapturePipeline", "Turn on torch");
                    this.f1913c = true;
                    return y.d.a(androidx.concurrent.futures.c.a(new c.AbstractC0023c() { // from class: androidx.camera.camera2.internal.x0
                        @Override // androidx.concurrent.futures.c.AbstractC0023c
                        public final Object a(c.a aVar) {
                            Object f10;
                            f10 = o0.f.this.f(aVar);
                            return f10;
                        }
                    })).e(y0.f2061a, x.a.a());
                }
                androidx.camera.core.s1.a("Camera2CapturePipeline", "Torch already on, not turn on");
            }
            return y.f.h(Boolean.FALSE);
        }

        @Override // androidx.camera.camera2.internal.o0.d
        public void c() {
            if (this.f1913c) {
                this.f1911a.J().g(null, false);
                androidx.camera.core.s1.a("Camera2CapturePipeline", "Turn off torch");
            }
        }
    }

    public o0(t tVar, r.z zVar, w.y1 y1Var, Executor executor) {
        boolean z10 = true;
        this.f1881a = tVar;
        Integer num = (Integer) zVar.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        this.f1885e = (num == null || num.intValue() != 2) ? false : z10;
        this.f1884d = executor;
        this.f1883c = y1Var;
        this.f1882b = new u.r(y1Var);
    }

    static boolean a(int i10, TotalCaptureResult totalCaptureResult) {
        if (i10 == 0) {
            Integer num = totalCaptureResult != null ? (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE) : null;
            return num != null && num.intValue() == 4;
        } else if (i10 == 1) {
            return true;
        } else {
            if (i10 != 2) {
                throw new AssertionError(i10);
            }
            return false;
        }
    }

    private boolean b(int i10) {
        return this.f1882b.a() || this.f1886f == 3 || i10 == 1;
    }

    public void c(int i10) {
        this.f1886f = i10;
    }

    public x5.a<List<Void>> d(List<w.k0> list, int i10, int i11, int i12) {
        u.l lVar = new u.l(this.f1883c);
        c cVar = new c(this.f1886f, this.f1884d, this.f1881a, this.f1885e, lVar);
        if (i10 == 0) {
            cVar.g(new b(this.f1881a));
        }
        cVar.g(b(i12) ? new f(this.f1881a, i11) : new a(this.f1881a, i11, lVar));
        return y.f.j(cVar.j(list, i11));
    }
}
