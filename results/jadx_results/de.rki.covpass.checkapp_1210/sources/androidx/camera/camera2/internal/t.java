package androidx.camera.camera2.internal;

import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.ArrayMap;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.internal.t;
import androidx.camera.core.m;
import androidx.concurrent.futures.c;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicLong;
import q.a;
import v.j;
import w.c2;
import w.k0;
import w.y;
/* loaded from: classes.dex */
public class t implements w.y {

    /* renamed from: b */
    final b f1963b;

    /* renamed from: c */
    final Executor f1964c;

    /* renamed from: e */
    private final r.z f1966e;

    /* renamed from: f */
    private final y.c f1967f;

    /* renamed from: g */
    private final c2.b f1968g;

    /* renamed from: h */
    private final e2 f1969h;

    /* renamed from: i */
    private final g3 f1970i;

    /* renamed from: j */
    private final f3 f1971j;

    /* renamed from: k */
    private final w1 f1972k;

    /* renamed from: l */
    i3 f1973l;

    /* renamed from: m */
    private final v.g f1974m;

    /* renamed from: n */
    private final o0 f1975n;

    /* renamed from: r */
    private final u.a f1979r;

    /* renamed from: x */
    private final a f1985x;

    /* renamed from: d */
    private final Object f1965d = new Object();

    /* renamed from: o */
    private int f1976o = 0;

    /* renamed from: p */
    private volatile boolean f1977p = false;

    /* renamed from: q */
    private volatile int f1978q = 2;

    /* renamed from: s */
    private final u.b f1980s = new u.b();

    /* renamed from: t */
    private final AtomicLong f1981t = new AtomicLong(0);

    /* renamed from: u */
    private volatile x5.a<Void> f1982u = y.f.h(null);

    /* renamed from: v */
    private int f1983v = 1;

    /* renamed from: w */
    private long f1984w = 0;

    /* loaded from: classes.dex */
    public static final class a extends w.h {

        /* renamed from: a */
        Set<w.h> f1986a = new HashSet();

        /* renamed from: b */
        Map<w.h, Executor> f1987b = new ArrayMap();

        a() {
        }

        @Override // w.h
        public void a() {
            for (final w.h hVar : this.f1986a) {
                try {
                    this.f1987b.get(hVar).execute(new Runnable() { // from class: androidx.camera.camera2.internal.q
                        @Override // java.lang.Runnable
                        public final void run() {
                            w.h.this.a();
                        }
                    });
                } catch (RejectedExecutionException e10) {
                    androidx.camera.core.s1.d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCancelled.", e10);
                }
            }
        }

        @Override // w.h
        public void b(final w.q qVar) {
            for (final w.h hVar : this.f1986a) {
                try {
                    this.f1987b.get(hVar).execute(new Runnable() { // from class: androidx.camera.camera2.internal.s
                        @Override // java.lang.Runnable
                        public final void run() {
                            w.h.this.b(qVar);
                        }
                    });
                } catch (RejectedExecutionException e10) {
                    androidx.camera.core.s1.d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCompleted.", e10);
                }
            }
        }

        @Override // w.h
        public void c(final w.j jVar) {
            for (final w.h hVar : this.f1986a) {
                try {
                    this.f1987b.get(hVar).execute(new Runnable() { // from class: androidx.camera.camera2.internal.r
                        @Override // java.lang.Runnable
                        public final void run() {
                            w.h.this.c(jVar);
                        }
                    });
                } catch (RejectedExecutionException e10) {
                    androidx.camera.core.s1.d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureFailed.", e10);
                }
            }
        }

        void g(Executor executor, w.h hVar) {
            this.f1986a.add(hVar);
            this.f1987b.put(hVar, executor);
        }

        void k(w.h hVar) {
            this.f1986a.remove(hVar);
            this.f1987b.remove(hVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends CameraCaptureSession.CaptureCallback {

        /* renamed from: a */
        final Set<c> f1988a = new HashSet();

        /* renamed from: b */
        private final Executor f1989b;

        b(Executor executor) {
            this.f1989b = executor;
        }

        public /* synthetic */ void c(TotalCaptureResult totalCaptureResult) {
            HashSet hashSet = new HashSet();
            for (c cVar : this.f1988a) {
                if (cVar.a(totalCaptureResult)) {
                    hashSet.add(cVar);
                }
            }
            if (!hashSet.isEmpty()) {
                this.f1988a.removeAll(hashSet);
            }
        }

        void b(c cVar) {
            this.f1988a.add(cVar);
        }

        void d(c cVar) {
            this.f1988a.remove(cVar);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, final TotalCaptureResult totalCaptureResult) {
            this.f1989b.execute(new Runnable() { // from class: androidx.camera.camera2.internal.u
                @Override // java.lang.Runnable
                public final void run() {
                    t.b.this.c(totalCaptureResult);
                }
            });
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        boolean a(TotalCaptureResult totalCaptureResult);
    }

    public t(r.z zVar, ScheduledExecutorService scheduledExecutorService, Executor executor, y.c cVar, w.y1 y1Var) {
        c2.b bVar = new c2.b();
        this.f1968g = bVar;
        a aVar = new a();
        this.f1985x = aVar;
        this.f1966e = zVar;
        this.f1967f = cVar;
        this.f1964c = executor;
        b bVar2 = new b(executor);
        this.f1963b = bVar2;
        bVar.s(this.f1983v);
        bVar.i(l1.d(bVar2));
        bVar.i(aVar);
        this.f1972k = new w1(this, zVar, executor);
        this.f1969h = new e2(this, scheduledExecutorService, executor, y1Var);
        this.f1970i = new g3(this, zVar, executor);
        this.f1971j = new f3(this, zVar, executor);
        this.f1973l = new l3(zVar);
        this.f1979r = new u.a(y1Var);
        this.f1974m = new v.g(this, executor);
        this.f1975n = new o0(this, zVar, y1Var, executor);
        executor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.k
            @Override // java.lang.Runnable
            public final void run() {
                t.this.V();
            }
        });
    }

    private int I(int i10) {
        int[] iArr = (int[]) this.f1966e.a(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        return P(i10, iArr) ? i10 : P(1, iArr) ? 1 : 0;
    }

    private boolean O() {
        return K() > 0;
    }

    private boolean P(int i10, int[] iArr) {
        for (int i11 : iArr) {
            if (i10 == i11) {
                return true;
            }
        }
        return false;
    }

    public static boolean Q(TotalCaptureResult totalCaptureResult, long j10) {
        Long l10;
        if (totalCaptureResult.getRequest() == null) {
            return false;
        }
        Object tag = totalCaptureResult.getRequest().getTag();
        return (tag instanceof w.j2) && (l10 = (Long) ((w.j2) tag).c("CameraControlSessionUpdateId")) != null && l10.longValue() >= j10;
    }

    public static /* synthetic */ void S() {
    }

    public /* synthetic */ void T(Executor executor, w.h hVar) {
        this.f1985x.g(executor, hVar);
    }

    public static /* synthetic */ void U() {
    }

    public /* synthetic */ void V() {
        u(this.f1974m.l());
    }

    public /* synthetic */ void W(w.h hVar) {
        this.f1985x.k(hVar);
    }

    public /* synthetic */ x5.a X(List list, int i10, int i11, int i12, Void r52) {
        return this.f1975n.d(list, i10, i11, i12);
    }

    public /* synthetic */ void Y(c.a aVar) {
        y.f.k(m0(l0()), aVar);
    }

    public /* synthetic */ Object Z(final c.a aVar) {
        this.f1964c.execute(new Runnable() { // from class: androidx.camera.camera2.internal.l
            @Override // java.lang.Runnable
            public final void run() {
                t.this.Y(aVar);
            }
        });
        return "updateSessionConfigAsync";
    }

    public static /* synthetic */ boolean a0(long j10, c.a aVar, TotalCaptureResult totalCaptureResult) {
        if (Q(totalCaptureResult, j10)) {
            aVar.c(null);
            return true;
        }
        return false;
    }

    public /* synthetic */ Object b0(final long j10, final c.a aVar) {
        u(new c() { // from class: androidx.camera.camera2.internal.f
            @Override // androidx.camera.camera2.internal.t.c
            public final boolean a(TotalCaptureResult totalCaptureResult) {
                boolean a02;
                a02 = t.a0(j10, aVar, totalCaptureResult);
                return a02;
            }
        });
        return "waitForSessionUpdateId:" + j10;
    }

    private x5.a<Void> m0(final long j10) {
        return androidx.concurrent.futures.c.a(new c.AbstractC0023c() { // from class: androidx.camera.camera2.internal.i
            @Override // androidx.concurrent.futures.c.AbstractC0023c
            public final Object a(c.a aVar) {
                Object b02;
                b02 = t.this.b0(j10, aVar);
                return b02;
            }
        });
    }

    public e2 A() {
        return this.f1969h;
    }

    public int B() {
        Integer num = (Integer) this.f1966e.a(CameraCharacteristics.CONTROL_MAX_REGIONS_AE);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public int C() {
        Integer num = (Integer) this.f1966e.a(CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public int D() {
        Integer num = (Integer) this.f1966e.a(CameraCharacteristics.CONTROL_MAX_REGIONS_AWB);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public w.c2 E() {
        this.f1968g.s(this.f1983v);
        this.f1968g.q(F());
        Object K = this.f1974m.k().K(null);
        if (K != null && (K instanceof Integer)) {
            this.f1968g.l("Camera2CameraControl", K);
        }
        this.f1968g.l("CameraControlSessionUpdateId", Long.valueOf(this.f1984w));
        return this.f1968g.m();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0070 A[LOOP:0: B:12:0x006a->B:14:0x0070, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    w.o0 F() {
        /*
            r7 = this;
            q.a$a r0 = new q.a$a
            r0.<init>()
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_MODE
            r2 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r0.e(r1, r3)
            androidx.camera.camera2.internal.e2 r1 = r7.f1969h
            r1.g(r0)
            u.a r1 = r7.f1979r
            r1.a(r0)
            androidx.camera.camera2.internal.g3 r1 = r7.f1970i
            r1.a(r0)
            boolean r1 = r7.f1977p
            r3 = 2
            if (r1 == 0) goto L2d
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.FLASH_MODE
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.e(r1, r3)
            goto L33
        L2d:
            int r1 = r7.f1978q
            if (r1 == 0) goto L37
            if (r1 == r2) goto L35
        L33:
            r1 = r2
            goto L3d
        L35:
            r1 = 3
            goto L3d
        L37:
            u.b r1 = r7.f1980s
            int r1 = r1.a(r3)
        L3d:
            android.hardware.camera2.CaptureRequest$Key r3 = android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE
            int r1 = r7.G(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.e(r3, r1)
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_AWB_MODE
            int r2 = r7.I(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.e(r1, r2)
            androidx.camera.camera2.internal.w1 r1 = r7.f1972k
            r1.c(r0)
            v.g r1 = r7.f1974m
            q.a r1 = r1.k()
            java.util.Set r2 = r1.c()
            java.util.Iterator r2 = r2.iterator()
        L6a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L84
            java.lang.Object r3 = r2.next()
            w.o0$a r3 = (w.o0.a) r3
            w.p1 r4 = r0.a()
            w.o0$c r5 = w.o0.c.ALWAYS_OVERRIDE
            java.lang.Object r6 = r1.b(r3)
            r4.G(r3, r5, r6)
            goto L6a
        L84:
            q.a r0 = r0.c()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.internal.t.F():w.o0");
    }

    public int G(int i10) {
        int[] iArr = (int[]) this.f1966e.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        return P(i10, iArr) ? i10 : P(1, iArr) ? 1 : 0;
    }

    public int H(int i10) {
        int[] iArr = (int[]) this.f1966e.a(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (P(i10, iArr)) {
            return i10;
        }
        if (P(4, iArr)) {
            return 4;
        }
        return P(1, iArr) ? 1 : 0;
    }

    public f3 J() {
        return this.f1971j;
    }

    int K() {
        int i10;
        synchronized (this.f1965d) {
            i10 = this.f1976o;
        }
        return i10;
    }

    public g3 L() {
        return this.f1970i;
    }

    public i3 M() {
        return this.f1973l;
    }

    public void N() {
        synchronized (this.f1965d) {
            this.f1976o++;
        }
    }

    public boolean R() {
        return this.f1977p;
    }

    @Override // w.y
    public void a(Size size, c2.b bVar) {
        this.f1973l.a(size, bVar);
    }

    @Override // w.y
    public void b(boolean z10) {
        this.f1973l.b(z10);
    }

    @Override // w.y
    public w.o0 c() {
        return this.f1974m.k();
    }

    public void c0(c cVar) {
        this.f1963b.d(cVar);
    }

    @Override // w.y
    public x5.a<List<Void>> d(final List<w.k0> list, final int i10, final int i11) {
        if (!O()) {
            androidx.camera.core.s1.k("Camera2CameraControlImp", "Camera is not active.");
            return y.f.f(new m.a("Camera is not active."));
        }
        final int z10 = z();
        return y.d.a(this.f1982u).f(new y.a() { // from class: androidx.camera.camera2.internal.g
            @Override // y.a
            public final x5.a apply(Object obj) {
                x5.a X;
                X = t.this.X(list, i10, z10, i11, (Void) obj);
                return X;
            }
        }, this.f1964c);
    }

    public void d0(final w.h hVar) {
        this.f1964c.execute(new Runnable() { // from class: androidx.camera.camera2.internal.n
            @Override // java.lang.Runnable
            public final void run() {
                t.this.W(hVar);
            }
        });
    }

    @Override // w.y
    public void e() {
        this.f1974m.i().b(o.f1880c, x.a.a());
    }

    public void e0() {
        h0(1);
    }

    @Override // w.y
    public void f(w.o0 o0Var) {
        this.f1974m.g(j.a.e(o0Var).d()).b(p.f1915c, x.a.a());
    }

    public void f0(boolean z10) {
        this.f1969h.E(z10);
        this.f1970i.g(z10);
        this.f1971j.j(z10);
        this.f1972k.b(z10);
        this.f1974m.s(z10);
    }

    @Override // w.y
    public Rect g() {
        return (Rect) androidx.core.util.h.g((Rect) this.f1966e.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE));
    }

    public void g0(Rational rational) {
        this.f1969h.F(rational);
    }

    @Override // w.y
    public void h(int i10) {
        if (!O()) {
            androidx.camera.core.s1.k("Camera2CameraControlImp", "Camera is not active.");
            return;
        }
        this.f1978q = i10;
        this.f1982u = k0();
    }

    public void h0(int i10) {
        this.f1983v = i10;
        this.f1969h.G(i10);
        this.f1975n.c(this.f1983v);
    }

    @Override // androidx.camera.core.m
    public x5.a<androidx.camera.core.j0> i(androidx.camera.core.i0 i0Var) {
        return !O() ? y.f.f(new m.a("Camera is not active.")) : y.f.j(this.f1969h.I(i0Var));
    }

    public void i0(List<w.k0> list) {
        this.f1967f.b(list);
    }

    @Override // androidx.camera.core.m
    public x5.a<Void> j(boolean z10) {
        return !O() ? y.f.f(new m.a("Camera is not active.")) : y.f.j(this.f1971j.d(z10));
    }

    public void j0() {
        this.f1964c.execute(new Runnable() { // from class: androidx.camera.camera2.internal.j
            @Override // java.lang.Runnable
            public final void run() {
                t.this.l0();
            }
        });
    }

    x5.a<Void> k0() {
        return y.f.j(androidx.concurrent.futures.c.a(new c.AbstractC0023c() { // from class: androidx.camera.camera2.internal.h
            @Override // androidx.concurrent.futures.c.AbstractC0023c
            public final Object a(c.a aVar) {
                Object Z;
                Z = t.this.Z(aVar);
                return Z;
            }
        }));
    }

    public long l0() {
        this.f1984w = this.f1981t.getAndIncrement();
        this.f1967f.a();
        return this.f1984w;
    }

    public void u(c cVar) {
        this.f1963b.b(cVar);
    }

    public void v(final Executor executor, final w.h hVar) {
        this.f1964c.execute(new Runnable() { // from class: androidx.camera.camera2.internal.m
            @Override // java.lang.Runnable
            public final void run() {
                t.this.T(executor, hVar);
            }
        });
    }

    public void w() {
        synchronized (this.f1965d) {
            int i10 = this.f1976o;
            if (i10 == 0) {
                throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
            }
            this.f1976o = i10 - 1;
        }
    }

    public void x(boolean z10) {
        this.f1977p = z10;
        if (!z10) {
            k0.a aVar = new k0.a();
            aVar.p(this.f1983v);
            aVar.q(true);
            a.C0313a c0313a = new a.C0313a();
            c0313a.e(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(G(1)));
            c0313a.e(CaptureRequest.FLASH_MODE, 0);
            aVar.e(c0313a.c());
            i0(Collections.singletonList(aVar.h()));
        }
        l0();
    }

    public Rect y() {
        return this.f1970i.c();
    }

    public int z() {
        return this.f1978q;
    }
}
