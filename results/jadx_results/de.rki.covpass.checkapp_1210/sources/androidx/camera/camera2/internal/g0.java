package androidx.camera.camera2.internal;

import android.annotation.SuppressLint;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Rational;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.internal.a3;
import androidx.camera.camera2.internal.g0;
import androidx.camera.core.t;
import androidx.concurrent.futures.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import w.c2;
import w.d0;
import w.g0;
import w.k0;
import w.r0;
import w.y;
/* loaded from: classes.dex */
public final class g0 implements w.d0 {
    private final w.n1<d0.a> U3;
    private final i1 V3;
    private final t W3;
    private final g X3;
    final j0 Y3;
    CameraDevice Z3;

    /* renamed from: c */
    private final w.m2 f1703c;

    /* renamed from: d */
    private final r.m0 f1705d;

    /* renamed from: d4 */
    c.a<Void> f1706d4;

    /* renamed from: f4 */
    private final d f1708f4;

    /* renamed from: g4 */
    private final w.g0 f1709g4;

    /* renamed from: i4 */
    private h2 f1711i4;

    /* renamed from: j4 */
    private final t1 f1712j4;

    /* renamed from: k4 */
    private final a3.a f1713k4;

    /* renamed from: m4 */
    private w.t f1715m4;

    /* renamed from: o4 */
    private w.d2 f1717o4;

    /* renamed from: q */
    private final Executor f1719q;

    /* renamed from: q4 */
    private final v1 f1720q4;

    /* renamed from: x */
    private final ScheduledExecutorService f1721x;

    /* renamed from: y */
    volatile f f1722y = f.INITIALIZED;

    /* renamed from: a4 */
    int f1701a4 = 0;

    /* renamed from: c4 */
    final AtomicInteger f1704c4 = new AtomicInteger(0);

    /* renamed from: e4 */
    final Map<r1, x5.a<Void>> f1707e4 = new LinkedHashMap();

    /* renamed from: h4 */
    final Set<q1> f1710h4 = new HashSet();

    /* renamed from: l4 */
    private final Set<String> f1714l4 = new HashSet();

    /* renamed from: n4 */
    final Object f1716n4 = new Object();

    /* renamed from: p4 */
    boolean f1718p4 = false;

    /* renamed from: b4 */
    r1 f1702b4 = W();

    /* loaded from: classes.dex */
    public class a implements y.c<Void> {

        /* renamed from: a */
        final /* synthetic */ r1 f1723a;

        a(r1 r1Var) {
            g0.this = r1;
            this.f1723a = r1Var;
        }

        @Override // y.c
        public void a(Throwable th2) {
        }

        /* renamed from: c */
        public void b(Void r22) {
            CameraDevice cameraDevice;
            g0.this.f1707e4.remove(this.f1723a);
            int i10 = c.f1726a[g0.this.f1722y.ordinal()];
            if (i10 != 3) {
                if (i10 != 6) {
                    if (i10 != 7) {
                        return;
                    }
                } else if (g0.this.f1701a4 == 0) {
                    return;
                }
            }
            if (!g0.this.L() || (cameraDevice = g0.this.Z3) == null) {
                return;
            }
            r.a.a(cameraDevice);
            g0.this.Z3 = null;
        }
    }

    /* loaded from: classes.dex */
    public class b implements y.c<Void> {
        b() {
            g0.this = r1;
        }

        @Override // y.c
        public void a(Throwable th2) {
            if (th2 instanceof r0.a) {
                w.c2 G = g0.this.G(((r0.a) th2).b());
                if (G == null) {
                    return;
                }
                g0.this.c0(G);
            } else if (th2 instanceof CancellationException) {
                g0.this.E("Unable to configure camera cancelled");
            } else {
                f fVar = g0.this.f1722y;
                f fVar2 = f.OPENED;
                if (fVar == fVar2) {
                    g0.this.i0(fVar2, t.a.b(4, th2));
                }
                if (th2 instanceof CameraAccessException) {
                    g0 g0Var = g0.this;
                    g0Var.E("Unable to configure camera due to " + th2.getMessage());
                } else if (!(th2 instanceof TimeoutException)) {
                } else {
                    androidx.camera.core.s1.c("Camera2CameraImpl", "Unable to configure camera " + g0.this.Y3.c() + ", timeout!");
                }
            }
        }

        /* renamed from: c */
        public void b(Void r12) {
        }
    }

    /* loaded from: classes.dex */
    public static /* synthetic */ class c {

        /* renamed from: a */
        static final /* synthetic */ int[] f1726a;

        static {
            int[] iArr = new int[f.values().length];
            f1726a = iArr;
            try {
                iArr[f.INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1726a[f.PENDING_OPEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1726a[f.CLOSING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1726a[f.OPENED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1726a[f.OPENING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1726a[f.REOPENING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1726a[f.RELEASING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1726a[f.RELEASED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* loaded from: classes.dex */
    public final class d extends CameraManager.AvailabilityCallback implements g0.b {

        /* renamed from: a */
        private final String f1727a;

        /* renamed from: b */
        private boolean f1728b = true;

        d(String str) {
            g0.this = r1;
            this.f1727a = str;
        }

        @Override // w.g0.b
        public void a() {
            if (g0.this.f1722y == f.PENDING_OPEN) {
                g0.this.p0(false);
            }
        }

        boolean b() {
            return this.f1728b;
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAvailable(String str) {
            if (!this.f1727a.equals(str)) {
                return;
            }
            this.f1728b = true;
            if (g0.this.f1722y != f.PENDING_OPEN) {
                return;
            }
            g0.this.p0(false);
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraUnavailable(String str) {
            if (!this.f1727a.equals(str)) {
                return;
            }
            this.f1728b = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class e implements y.c {
        e() {
            g0.this = r1;
        }

        @Override // w.y.c
        public void a() {
            g0.this.q0();
        }

        @Override // w.y.c
        public void b(List<w.k0> list) {
            g0.this.k0((List) androidx.core.util.h.g(list));
        }
    }

    /* loaded from: classes.dex */
    public enum f {
        INITIALIZED,
        PENDING_OPEN,
        OPENING,
        OPENED,
        CLOSING,
        REOPENING,
        RELEASING,
        RELEASED
    }

    /* loaded from: classes.dex */
    public final class g extends CameraDevice.StateCallback {

        /* renamed from: a */
        private final Executor f1736a;

        /* renamed from: b */
        private final ScheduledExecutorService f1737b;

        /* renamed from: c */
        private b f1738c;

        /* renamed from: d */
        ScheduledFuture<?> f1739d;

        /* renamed from: e */
        private final a f1740e = new a();

        /* loaded from: classes.dex */
        public class a {

            /* renamed from: a */
            private long f1742a = -1;

            a() {
                g.this = r3;
            }

            boolean a() {
                if (b() >= ((long) d())) {
                    e();
                    return false;
                }
                return true;
            }

            long b() {
                long uptimeMillis = SystemClock.uptimeMillis();
                if (this.f1742a == -1) {
                    this.f1742a = uptimeMillis;
                }
                return uptimeMillis - this.f1742a;
            }

            int c() {
                if (!g.this.f()) {
                    return 700;
                }
                long b10 = b();
                if (b10 <= 120000) {
                    return 1000;
                }
                return b10 <= 300000 ? 2000 : 4000;
            }

            int d() {
                return !g.this.f() ? 10000 : 1800000;
            }

            void e() {
                this.f1742a = -1L;
            }
        }

        /* loaded from: classes.dex */
        public class b implements Runnable {

            /* renamed from: c */
            private Executor f1744c;

            /* renamed from: d */
            private boolean f1745d = false;

            b(Executor executor) {
                g.this = r1;
                this.f1744c = executor;
            }

            public /* synthetic */ void c() {
                if (!this.f1745d) {
                    androidx.core.util.h.i(g0.this.f1722y == f.REOPENING);
                    if (g.this.f()) {
                        g0.this.o0(true);
                    } else {
                        g0.this.p0(true);
                    }
                }
            }

            void b() {
                this.f1745d = true;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f1744c.execute(new Runnable() { // from class: androidx.camera.camera2.internal.h0
                    @Override // java.lang.Runnable
                    public final void run() {
                        g0.g.b.this.c();
                    }
                });
            }
        }

        g(Executor executor, ScheduledExecutorService scheduledExecutorService) {
            g0.this = r1;
            this.f1736a = executor;
            this.f1737b = scheduledExecutorService;
        }

        private void b(CameraDevice cameraDevice, int i10) {
            boolean z10 = g0.this.f1722y == f.OPENING || g0.this.f1722y == f.OPENED || g0.this.f1722y == f.REOPENING;
            androidx.core.util.h.j(z10, "Attempt to handle open error from non open state: " + g0.this.f1722y);
            if (i10 == 1 || i10 == 2 || i10 == 4) {
                androidx.camera.core.s1.a("Camera2CameraImpl", String.format("Attempt to reopen camera[%s] after error[%s]", cameraDevice.getId(), g0.I(i10)));
                c(i10);
                return;
            }
            androidx.camera.core.s1.c("Camera2CameraImpl", "Error observed on open (or opening) camera device " + cameraDevice.getId() + ": " + g0.I(i10) + " closing camera.");
            g0.this.i0(f.CLOSING, t.a.a(i10 == 3 ? 5 : 6));
            g0.this.A(false);
        }

        private void c(int i10) {
            int i11 = 1;
            androidx.core.util.h.j(g0.this.f1701a4 != 0, "Can only reopen camera device after error if the camera device is actually in an error state.");
            if (i10 == 1) {
                i11 = 2;
            } else if (i10 != 2) {
                i11 = 3;
            }
            g0.this.i0(f.REOPENING, t.a.a(i11));
            g0.this.A(false);
        }

        boolean a() {
            if (this.f1739d != null) {
                g0 g0Var = g0.this;
                g0Var.E("Cancelling scheduled re-open: " + this.f1738c);
                this.f1738c.b();
                this.f1738c = null;
                this.f1739d.cancel(false);
                this.f1739d = null;
                return true;
            }
            return false;
        }

        void d() {
            this.f1740e.e();
        }

        void e() {
            boolean z10 = true;
            androidx.core.util.h.i(this.f1738c == null);
            if (this.f1739d != null) {
                z10 = false;
            }
            androidx.core.util.h.i(z10);
            if (!this.f1740e.a()) {
                androidx.camera.core.s1.c("Camera2CameraImpl", "Camera reopening attempted for " + this.f1740e.d() + "ms without success.");
                g0.this.j0(f.PENDING_OPEN, null, false);
                return;
            }
            this.f1738c = new b(this.f1736a);
            g0.this.E("Attempting camera re-open in " + this.f1740e.c() + "ms: " + this.f1738c + " activeResuming = " + g0.this.f1718p4);
            this.f1739d = this.f1737b.schedule(this.f1738c, (long) this.f1740e.c(), TimeUnit.MILLISECONDS);
        }

        boolean f() {
            int i10;
            g0 g0Var = g0.this;
            return g0Var.f1718p4 && ((i10 = g0Var.f1701a4) == 1 || i10 == 2);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
            g0.this.E("CameraDevice.onClosed()");
            boolean z10 = g0.this.Z3 == null;
            androidx.core.util.h.j(z10, "Unexpected onClose callback on camera device: " + cameraDevice);
            int i10 = c.f1726a[g0.this.f1722y.ordinal()];
            if (i10 != 3) {
                if (i10 == 6) {
                    g0 g0Var = g0.this;
                    if (g0Var.f1701a4 == 0) {
                        g0Var.p0(false);
                        return;
                    }
                    g0Var.E("Camera closed due to error: " + g0.I(g0.this.f1701a4));
                    e();
                    return;
                } else if (i10 != 7) {
                    throw new IllegalStateException("Camera closed while in state: " + g0.this.f1722y);
                }
            }
            androidx.core.util.h.i(g0.this.L());
            g0.this.H();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            g0.this.E("CameraDevice.onDisconnected()");
            onError(cameraDevice, 1);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i10) {
            g0 g0Var = g0.this;
            g0Var.Z3 = cameraDevice;
            g0Var.f1701a4 = i10;
            int i11 = c.f1726a[g0Var.f1722y.ordinal()];
            if (i11 != 3) {
                if (i11 == 4 || i11 == 5 || i11 == 6) {
                    androidx.camera.core.s1.a("Camera2CameraImpl", String.format("CameraDevice.onError(): %s failed with %s while in %s state. Will attempt recovering from error.", cameraDevice.getId(), g0.I(i10), g0.this.f1722y.name()));
                    b(cameraDevice, i10);
                    return;
                } else if (i11 != 7) {
                    throw new IllegalStateException("onError() should not be possible from state: " + g0.this.f1722y);
                }
            }
            androidx.camera.core.s1.c("Camera2CameraImpl", String.format("CameraDevice.onError(): %s failed with %s while in %s state. Will finish closing camera.", cameraDevice.getId(), g0.I(i10), g0.this.f1722y.name()));
            g0.this.A(false);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
            g0.this.E("CameraDevice.onOpened()");
            g0 g0Var = g0.this;
            g0Var.Z3 = cameraDevice;
            g0Var.f1701a4 = 0;
            d();
            int i10 = c.f1726a[g0.this.f1722y.ordinal()];
            if (i10 != 3) {
                if (i10 == 5 || i10 == 6) {
                    g0.this.h0(f.OPENED);
                    g0.this.a0();
                    return;
                } else if (i10 != 7) {
                    throw new IllegalStateException("onOpened() should not be possible from state: " + g0.this.f1722y);
                }
            }
            androidx.core.util.h.i(g0.this.L());
            g0.this.Z3.close();
            g0.this.Z3 = null;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class h {
        static h a(String str, Class<?> cls, w.c2 c2Var, Size size) {
            return new androidx.camera.camera2.internal.b(str, cls, c2Var, size);
        }

        static h b(androidx.camera.core.c3 c3Var) {
            return a(g0.J(c3Var), c3Var.getClass(), c3Var.l(), c3Var.c());
        }

        public abstract w.c2 c();

        public abstract Size d();

        public abstract String e();

        public abstract Class<?> f();
    }

    public g0(r.m0 m0Var, String str, j0 j0Var, w.g0 g0Var, Executor executor, Handler handler, v1 v1Var) {
        w.n1<d0.a> n1Var = new w.n1<>();
        this.U3 = n1Var;
        this.f1705d = m0Var;
        this.f1709g4 = g0Var;
        ScheduledExecutorService e10 = x.a.e(handler);
        this.f1721x = e10;
        Executor f10 = x.a.f(executor);
        this.f1719q = f10;
        this.X3 = new g(f10, e10);
        this.f1703c = new w.m2(str);
        n1Var.g(d0.a.CLOSED);
        i1 i1Var = new i1(g0Var);
        this.V3 = i1Var;
        t1 t1Var = new t1(f10);
        this.f1712j4 = t1Var;
        this.f1720q4 = v1Var;
        try {
            t tVar = new t(m0Var.c(str), e10, f10, new e(), j0Var.h());
            this.W3 = tVar;
            this.Y3 = j0Var;
            j0Var.l(tVar);
            j0Var.o(i1Var.a());
            this.f1713k4 = new a3.a(f10, e10, handler, t1Var, j0Var.h(), t.l.b());
            d dVar = new d(str);
            this.f1708f4 = dVar;
            g0Var.e(this, f10, dVar);
            m0Var.f(f10, dVar);
        } catch (r.f e11) {
            throw j1.a(e11);
        }
    }

    private void B() {
        E("Closing camera.");
        int i10 = c.f1726a[this.f1722y.ordinal()];
        boolean z10 = false;
        if (i10 == 2) {
            if (this.Z3 == null) {
                z10 = true;
            }
            androidx.core.util.h.i(z10);
            h0(f.INITIALIZED);
        } else if (i10 == 4) {
            h0(f.CLOSING);
            A(false);
        } else if (i10 != 5 && i10 != 6) {
            E("close() ignored due to being in state: " + this.f1722y);
        } else {
            boolean a10 = this.X3.a();
            h0(f.CLOSING);
            if (!a10) {
                return;
            }
            androidx.core.util.h.i(L());
            H();
        }
    }

    private void C(boolean z10) {
        final q1 q1Var = new q1();
        this.f1710h4.add(q1Var);
        g0(z10);
        final SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(640, 480);
        final Surface surface = new Surface(surfaceTexture);
        final Runnable runnable = new Runnable() { // from class: androidx.camera.camera2.internal.w
            @Override // java.lang.Runnable
            public final void run() {
                g0.N(surface, surfaceTexture);
            }
        };
        c2.b bVar = new c2.b();
        final w.i1 i1Var = new w.i1(surface);
        bVar.h(i1Var);
        bVar.s(1);
        E("Start configAndClose.");
        q1Var.f(bVar.m(), (CameraDevice) androidx.core.util.h.g(this.Z3), this.f1713k4.a()).b(new Runnable() { // from class: androidx.camera.camera2.internal.x
            @Override // java.lang.Runnable
            public final void run() {
                g0.this.O(q1Var, i1Var, runnable);
            }
        }, this.f1719q);
    }

    private CameraDevice.StateCallback D() {
        ArrayList arrayList = new ArrayList(this.f1703c.e().b().b());
        arrayList.add(this.f1712j4.c());
        arrayList.add(this.X3);
        return g1.a(arrayList);
    }

    private void F(String str, Throwable th2) {
        androidx.camera.core.s1.b("Camera2CameraImpl", String.format("{%s} %s", toString(), str), th2);
    }

    static String I(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? "UNKNOWN ERROR" : "ERROR_CAMERA_SERVICE" : "ERROR_CAMERA_DEVICE" : "ERROR_CAMERA_DISABLED" : "ERROR_MAX_CAMERAS_IN_USE" : "ERROR_CAMERA_IN_USE" : "ERROR_NONE";
    }

    static String J(androidx.camera.core.c3 c3Var) {
        return c3Var.j() + c3Var.hashCode();
    }

    private boolean K() {
        return ((j0) i()).k() == 2;
    }

    public /* synthetic */ void M(List list) {
        try {
            m0(list);
        } finally {
            this.W3.w();
        }
    }

    public static /* synthetic */ void N(Surface surface, SurfaceTexture surfaceTexture) {
        surface.release();
        surfaceTexture.release();
    }

    public /* synthetic */ void Q(String str, w.c2 c2Var) {
        E("Use case " + str + " ACTIVE");
        this.f1703c.m(str, c2Var);
        this.f1703c.q(str, c2Var);
        q0();
    }

    public /* synthetic */ void R(String str) {
        E("Use case " + str + " INACTIVE");
        this.f1703c.p(str);
        q0();
    }

    public /* synthetic */ void S(String str, w.c2 c2Var) {
        E("Use case " + str + " RESET");
        this.f1703c.q(str, c2Var);
        g0(false);
        q0();
        if (this.f1722y == f.OPENED) {
            a0();
        }
    }

    public /* synthetic */ void T(String str, w.c2 c2Var) {
        E("Use case " + str + " UPDATED");
        this.f1703c.q(str, c2Var);
        q0();
    }

    public static /* synthetic */ void U(c2.c cVar, w.c2 c2Var) {
        cVar.a(c2Var, c2.e.SESSION_ERROR_SURFACE_NEEDS_RESET);
    }

    public /* synthetic */ void V(boolean z10) {
        this.f1718p4 = z10;
        if (!z10 || this.f1722y != f.PENDING_OPEN) {
            return;
        }
        o0(false);
    }

    private r1 W() {
        synchronized (this.f1716n4) {
            if (this.f1717o4 == null) {
                return new q1();
            }
            return new m2(this.f1717o4, this.Y3, this.f1719q, this.f1721x);
        }
    }

    private void X(List<androidx.camera.core.c3> list) {
        for (androidx.camera.core.c3 c3Var : list) {
            String J = J(c3Var);
            if (!this.f1714l4.contains(J)) {
                this.f1714l4.add(J);
                c3Var.C();
            }
        }
    }

    private void Y(List<androidx.camera.core.c3> list) {
        for (androidx.camera.core.c3 c3Var : list) {
            String J = J(c3Var);
            if (this.f1714l4.contains(J)) {
                c3Var.D();
                this.f1714l4.remove(J);
            }
        }
    }

    @SuppressLint({"MissingPermission"})
    private void Z(boolean z10) {
        if (!z10) {
            this.X3.d();
        }
        this.X3.a();
        E("Opening camera.");
        h0(f.OPENING);
        try {
            this.f1705d.e(this.Y3.c(), this.f1719q, D());
        } catch (SecurityException e10) {
            E("Unable to open camera due to " + e10.getMessage());
            h0(f.REOPENING);
            this.X3.e();
        } catch (r.f e11) {
            E("Unable to open camera due to " + e11.getMessage());
            if (e11.f() != 10001) {
                return;
            }
            i0(f.INITIALIZED, t.a.b(7, e11));
        }
    }

    private void b0() {
        int i10 = c.f1726a[this.f1722y.ordinal()];
        boolean z10 = false;
        if (i10 == 1 || i10 == 2) {
            o0(false);
        } else if (i10 != 3) {
            E("open() ignored due to being in state: " + this.f1722y);
        } else {
            h0(f.REOPENING);
            if (L() || this.f1701a4 != 0) {
                return;
            }
            if (this.Z3 != null) {
                z10 = true;
            }
            androidx.core.util.h.j(z10, "Camera Device should be open if session close is not complete");
            h0(f.OPENED);
            a0();
        }
    }

    private void f0() {
        if (this.f1711i4 != null) {
            w.m2 m2Var = this.f1703c;
            m2Var.o(this.f1711i4.c() + this.f1711i4.hashCode());
            w.m2 m2Var2 = this.f1703c;
            m2Var2.p(this.f1711i4.c() + this.f1711i4.hashCode());
            this.f1711i4.b();
            this.f1711i4 = null;
        }
    }

    private Collection<h> l0(Collection<androidx.camera.core.c3> collection) {
        ArrayList arrayList = new ArrayList();
        for (androidx.camera.core.c3 c3Var : collection) {
            arrayList.add(h.b(c3Var));
        }
        return arrayList;
    }

    private void m0(Collection<h> collection) {
        Size d10;
        boolean isEmpty = this.f1703c.f().isEmpty();
        ArrayList arrayList = new ArrayList();
        Rational rational = null;
        for (h hVar : collection) {
            if (!this.f1703c.i(hVar.e())) {
                this.f1703c.n(hVar.e(), hVar.c());
                arrayList.add(hVar.e());
                if (hVar.f() == androidx.camera.core.c2.class && (d10 = hVar.d()) != null) {
                    rational = new Rational(d10.getWidth(), d10.getHeight());
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        E("Use cases [" + TextUtils.join(", ", arrayList) + "] now ATTACHED");
        if (isEmpty) {
            this.W3.f0(true);
            this.W3.N();
        }
        y();
        q0();
        g0(false);
        if (this.f1722y == f.OPENED) {
            a0();
        } else {
            b0();
        }
        if (rational == null) {
            return;
        }
        this.W3.g0(rational);
    }

    /* renamed from: n0 */
    public void P(Collection<h> collection) {
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (h hVar : collection) {
            if (this.f1703c.i(hVar.e())) {
                this.f1703c.l(hVar.e());
                arrayList.add(hVar.e());
                if (hVar.f() == androidx.camera.core.c2.class) {
                    z10 = true;
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        E("Use cases [" + TextUtils.join(", ", arrayList) + "] now DETACHED for camera");
        if (z10) {
            this.W3.g0(null);
        }
        y();
        if (this.f1703c.f().isEmpty()) {
            this.W3.w();
            g0(false);
            this.W3.f0(false);
            this.f1702b4 = W();
            B();
            return;
        }
        q0();
        g0(false);
        if (this.f1722y != f.OPENED) {
            return;
        }
        a0();
    }

    private void x() {
        if (this.f1711i4 != null) {
            w.m2 m2Var = this.f1703c;
            m2Var.n(this.f1711i4.c() + this.f1711i4.hashCode(), this.f1711i4.e());
            w.m2 m2Var2 = this.f1703c;
            m2Var2.m(this.f1711i4.c() + this.f1711i4.hashCode(), this.f1711i4.e());
        }
    }

    private void y() {
        w.c2 b10 = this.f1703c.e().b();
        w.k0 g10 = b10.g();
        int size = g10.e().size();
        int size2 = b10.j().size();
        if (!b10.j().isEmpty()) {
            if (g10.e().isEmpty()) {
                if (this.f1711i4 == null) {
                    this.f1711i4 = new h2(this.Y3.i(), this.f1720q4);
                }
                x();
            } else if ((size2 == 1 && size == 1) || size >= 2) {
                f0();
            } else {
                androidx.camera.core.s1.a("Camera2CameraImpl", "mMeteringRepeating is ATTACHED, SessionConfig Surfaces: " + size2 + ", CaptureConfig Surfaces: " + size);
            }
        }
    }

    private boolean z(k0.a aVar) {
        String str;
        if (!aVar.l().isEmpty()) {
            str = "The capture config builder already has surface inside.";
        } else {
            for (w.c2 c2Var : this.f1703c.d()) {
                List<w.r0> e10 = c2Var.g().e();
                if (!e10.isEmpty()) {
                    for (w.r0 r0Var : e10) {
                        aVar.f(r0Var);
                    }
                }
            }
            if (!aVar.l().isEmpty()) {
                return true;
            }
            str = "Unable to find a repeating surface to attach to CaptureConfig";
        }
        androidx.camera.core.s1.k("Camera2CameraImpl", str);
        return false;
    }

    void A(boolean z10) {
        boolean z11 = this.f1722y == f.CLOSING || this.f1722y == f.RELEASING || (this.f1722y == f.REOPENING && this.f1701a4 != 0);
        androidx.core.util.h.j(z11, "closeCamera should only be called in a CLOSING, RELEASING or REOPENING (with error) state. Current state: " + this.f1722y + " (error: " + I(this.f1701a4) + ")");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 <= 23 || i10 >= 29 || !K() || this.f1701a4 != 0) {
            g0(z10);
        } else {
            C(z10);
        }
        this.f1702b4.e();
    }

    void E(String str) {
        F(str, null);
    }

    w.c2 G(w.r0 r0Var) {
        for (w.c2 c2Var : this.f1703c.f()) {
            if (c2Var.j().contains(r0Var)) {
                return c2Var;
            }
        }
        return null;
    }

    void H() {
        androidx.core.util.h.i(this.f1722y == f.RELEASING || this.f1722y == f.CLOSING);
        androidx.core.util.h.i(this.f1707e4.isEmpty());
        this.Z3 = null;
        if (this.f1722y == f.CLOSING) {
            h0(f.INITIALIZED);
            return;
        }
        this.f1705d.g(this.f1708f4);
        h0(f.RELEASED);
        c.a<Void> aVar = this.f1706d4;
        if (aVar == null) {
            return;
        }
        aVar.c(null);
        this.f1706d4 = null;
    }

    boolean L() {
        return this.f1707e4.isEmpty() && this.f1710h4.isEmpty();
    }

    @Override // w.d0, androidx.camera.core.k
    public /* synthetic */ androidx.camera.core.r a() {
        return w.c0.b(this);
    }

    void a0() {
        androidx.core.util.h.i(this.f1722y == f.OPENED);
        c2.f e10 = this.f1703c.e();
        if (!e10.d()) {
            E("Unable to create capture session due to conflicting configurations");
        } else {
            y.f.b(this.f1702b4.f(e10.b(), (CameraDevice) androidx.core.util.h.g(this.Z3), this.f1713k4.a()), new b(), this.f1719q);
        }
    }

    @Override // w.d0
    public void b(final boolean z10) {
        this.f1719q.execute(new Runnable() { // from class: androidx.camera.camera2.internal.e0
            @Override // java.lang.Runnable
            public final void run() {
                g0.this.V(z10);
            }
        });
    }

    @Override // androidx.camera.core.c3.d
    public void c(androidx.camera.core.c3 c3Var) {
        androidx.core.util.h.g(c3Var);
        final String J = J(c3Var);
        final w.c2 l10 = c3Var.l();
        this.f1719q.execute(new Runnable() { // from class: androidx.camera.camera2.internal.a0
            @Override // java.lang.Runnable
            public final void run() {
                g0.this.Q(J, l10);
            }
        });
    }

    void c0(final w.c2 c2Var) {
        ScheduledExecutorService d10 = x.a.d();
        List<c2.c> c10 = c2Var.c();
        if (!c10.isEmpty()) {
            final c2.c cVar = c10.get(0);
            F("Posting surface closed", new Throwable());
            d10.execute(new Runnable() { // from class: androidx.camera.camera2.internal.f0
                @Override // java.lang.Runnable
                public final void run() {
                    g0.U(c2.c.this, c2Var);
                }
            });
        }
    }

    @Override // androidx.camera.core.k
    public /* synthetic */ androidx.camera.core.m d() {
        return w.c0.a(this);
    }

    /* renamed from: d0 */
    public void O(q1 q1Var, w.r0 r0Var, Runnable runnable) {
        this.f1710h4.remove(q1Var);
        x5.a<Void> e02 = e0(q1Var, false);
        r0Var.c();
        y.f.n(Arrays.asList(e02, r0Var.i())).b(runnable, x.a.a());
    }

    @Override // w.d0
    public void e(Collection<androidx.camera.core.c3> collection) {
        ArrayList arrayList = new ArrayList(collection);
        if (arrayList.isEmpty()) {
            return;
        }
        this.W3.N();
        X(new ArrayList(arrayList));
        final ArrayList arrayList2 = new ArrayList(l0(arrayList));
        try {
            this.f1719q.execute(new Runnable() { // from class: androidx.camera.camera2.internal.c0
                @Override // java.lang.Runnable
                public final void run() {
                    g0.this.M(arrayList2);
                }
            });
        } catch (RejectedExecutionException e10) {
            F("Unable to attach use cases.", e10);
            this.W3.w();
        }
    }

    x5.a<Void> e0(r1 r1Var, boolean z10) {
        r1Var.close();
        x5.a<Void> a10 = r1Var.a(z10);
        E("Releasing session in state " + this.f1722y.name());
        this.f1707e4.put(r1Var, a10);
        y.f.b(a10, new a(r1Var), x.a.a());
        return a10;
    }

    @Override // androidx.camera.core.c3.d
    public void f(androidx.camera.core.c3 c3Var) {
        androidx.core.util.h.g(c3Var);
        final String J = J(c3Var);
        final w.c2 l10 = c3Var.l();
        this.f1719q.execute(new Runnable() { // from class: androidx.camera.camera2.internal.b0
            @Override // java.lang.Runnable
            public final void run() {
                g0.this.S(J, l10);
            }
        });
    }

    @Override // w.d0
    public void g(Collection<androidx.camera.core.c3> collection) {
        ArrayList arrayList = new ArrayList(collection);
        if (arrayList.isEmpty()) {
            return;
        }
        final ArrayList arrayList2 = new ArrayList(l0(arrayList));
        Y(new ArrayList(arrayList));
        this.f1719q.execute(new Runnable() { // from class: androidx.camera.camera2.internal.d0
            @Override // java.lang.Runnable
            public final void run() {
                g0.this.P(arrayList2);
            }
        });
    }

    void g0(boolean z10) {
        androidx.core.util.h.i(this.f1702b4 != null);
        E("Resetting Capture Session");
        r1 r1Var = this.f1702b4;
        w.c2 d10 = r1Var.d();
        List<w.k0> b10 = r1Var.b();
        r1 W = W();
        this.f1702b4 = W;
        W.g(d10);
        this.f1702b4.c(b10);
        e0(r1Var, z10);
    }

    @Override // w.d0
    public void h(w.t tVar) {
        if (tVar == null) {
            tVar = w.x.a();
        }
        w.d2 p10 = tVar.p(null);
        this.f1715m4 = tVar;
        synchronized (this.f1716n4) {
            this.f1717o4 = p10;
        }
        m().b(tVar.C().booleanValue());
    }

    void h0(f fVar) {
        i0(fVar, null);
    }

    @Override // w.d0
    public w.b0 i() {
        return this.Y3;
    }

    void i0(f fVar, t.a aVar) {
        j0(fVar, aVar, true);
    }

    @Override // androidx.camera.core.c3.d
    public void j(androidx.camera.core.c3 c3Var) {
        androidx.core.util.h.g(c3Var);
        final String J = J(c3Var);
        this.f1719q.execute(new Runnable() { // from class: androidx.camera.camera2.internal.y
            @Override // java.lang.Runnable
            public final void run() {
                g0.this.R(J);
            }
        });
    }

    void j0(f fVar, t.a aVar, boolean z10) {
        d0.a aVar2;
        E("Transitioning camera internal state: " + this.f1722y + " --> " + fVar);
        this.f1722y = fVar;
        switch (c.f1726a[fVar.ordinal()]) {
            case 1:
                aVar2 = d0.a.CLOSED;
                break;
            case 2:
                aVar2 = d0.a.PENDING_OPEN;
                break;
            case 3:
                aVar2 = d0.a.CLOSING;
                break;
            case 4:
                aVar2 = d0.a.OPEN;
                break;
            case 5:
            case 6:
                aVar2 = d0.a.OPENING;
                break;
            case 7:
                aVar2 = d0.a.RELEASING;
                break;
            case 8:
                aVar2 = d0.a.RELEASED;
                break;
            default:
                throw new IllegalStateException("Unknown state: " + fVar);
        }
        this.f1709g4.c(this, aVar2, z10);
        this.U3.g(aVar2);
        this.V3.c(aVar2, aVar);
    }

    @Override // androidx.camera.core.c3.d
    public void k(androidx.camera.core.c3 c3Var) {
        androidx.core.util.h.g(c3Var);
        final String J = J(c3Var);
        final w.c2 l10 = c3Var.l();
        this.f1719q.execute(new Runnable() { // from class: androidx.camera.camera2.internal.z
            @Override // java.lang.Runnable
            public final void run() {
                g0.this.T(J, l10);
            }
        });
    }

    void k0(List<w.k0> list) {
        ArrayList arrayList = new ArrayList();
        for (w.k0 k0Var : list) {
            k0.a k10 = k0.a.k(k0Var);
            if (k0Var.g() == 5 && k0Var.c() != null) {
                k10.n(k0Var.c());
            }
            if (!k0Var.e().isEmpty() || !k0Var.h() || z(k10)) {
                arrayList.add(k10.h());
            }
        }
        E("Issue capture request");
        this.f1702b4.c(arrayList);
    }

    @Override // w.d0
    public w.s1<d0.a> l() {
        return this.U3;
    }

    @Override // w.d0
    public w.y m() {
        return this.W3;
    }

    void o0(boolean z10) {
        E("Attempting to force open the camera.");
        if (this.f1709g4.f(this)) {
            Z(z10);
            return;
        }
        E("No cameras available. Waiting for available camera before opening camera.");
        h0(f.PENDING_OPEN);
    }

    void p0(boolean z10) {
        E("Attempting to open the camera.");
        if (this.f1708f4.b() && this.f1709g4.f(this)) {
            Z(z10);
            return;
        }
        E("No cameras available. Waiting for available camera before opening camera.");
        h0(f.PENDING_OPEN);
    }

    void q0() {
        c2.f c10 = this.f1703c.c();
        if (!c10.d()) {
            this.W3.e0();
            this.f1702b4.g(this.W3.E());
            return;
        }
        this.W3.h0(c10.b().k());
        c10.a(this.W3.E());
        this.f1702b4.g(c10.b());
    }

    public String toString() {
        return String.format(Locale.US, "Camera@%x[id=%s]", Integer.valueOf(hashCode()), this.Y3.c());
    }
}
