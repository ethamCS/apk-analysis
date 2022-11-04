package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import androidx.camera.camera2.internal.b3;
import androidx.camera.camera2.internal.e1;
import androidx.camera.camera2.internal.o2;
import androidx.concurrent.futures.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import w.k0;
import w.o0;
/* loaded from: classes.dex */
public final class q1 implements r1 {

    /* renamed from: e */
    a3 f1931e;

    /* renamed from: f */
    o2 f1932f;

    /* renamed from: g */
    w.c2 f1933g;

    /* renamed from: l */
    d f1938l;

    /* renamed from: m */
    x5.a<Void> f1939m;

    /* renamed from: n */
    c.a<Void> f1940n;

    /* renamed from: a */
    final Object f1927a = new Object();

    /* renamed from: b */
    private final List<w.k0> f1928b = new ArrayList();

    /* renamed from: c */
    private final CameraCaptureSession.CaptureCallback f1929c = new a();

    /* renamed from: h */
    w.o0 f1934h = w.u1.I();

    /* renamed from: i */
    q.c f1935i = q.c.e();

    /* renamed from: j */
    private final Map<w.r0, Surface> f1936j = new HashMap();

    /* renamed from: k */
    List<w.r0> f1937k = Collections.emptyList();

    /* renamed from: o */
    final u.o f1941o = new u.o();

    /* renamed from: d */
    private final e f1930d = new e();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends CameraCaptureSession.CaptureCallback {
        a() {
            q1.this = r1;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        }
    }

    /* loaded from: classes.dex */
    public class b implements y.c<Void> {
        b() {
            q1.this = r1;
        }

        @Override // y.c
        public void a(Throwable th2) {
            synchronized (q1.this.f1927a) {
                q1.this.f1931e.e();
                int i10 = c.f1944a[q1.this.f1938l.ordinal()];
                if ((i10 == 4 || i10 == 6 || i10 == 7) && !(th2 instanceof CancellationException)) {
                    androidx.camera.core.s1.l("CaptureSession", "Opening session with fail " + q1.this.f1938l, th2);
                    q1.this.l();
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
        static final /* synthetic */ int[] f1944a;

        static {
            int[] iArr = new int[d.values().length];
            f1944a = iArr;
            try {
                iArr[d.UNINITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1944a[d.INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1944a[d.GET_SURFACE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1944a[d.OPENING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1944a[d.OPENED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1944a[d.CLOSED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1944a[d.RELEASING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1944a[d.RELEASED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum d {
        UNINITIALIZED,
        INITIALIZED,
        GET_SURFACE,
        OPENING,
        OPENED,
        CLOSED,
        RELEASING,
        RELEASED
    }

    /* loaded from: classes.dex */
    public final class e extends o2.a {
        e() {
            q1.this = r1;
        }

        @Override // androidx.camera.camera2.internal.o2.a
        public void q(o2 o2Var) {
            synchronized (q1.this.f1927a) {
                switch (c.f1944a[q1.this.f1938l.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 5:
                        throw new IllegalStateException("onConfigureFailed() should not be possible in state: " + q1.this.f1938l);
                    case 4:
                    case 6:
                    case 7:
                        q1.this.l();
                        break;
                    case 8:
                        androidx.camera.core.s1.a("CaptureSession", "ConfigureFailed callback after change to RELEASED state");
                        break;
                }
                androidx.camera.core.s1.c("CaptureSession", "CameraCaptureSession.onConfigureFailed() " + q1.this.f1938l);
            }
        }

        @Override // androidx.camera.camera2.internal.o2.a
        public void r(o2 o2Var) {
            synchronized (q1.this.f1927a) {
                switch (c.f1944a[q1.this.f1938l.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 5:
                    case 8:
                        throw new IllegalStateException("onConfigured() should not be possible in state: " + q1.this.f1938l);
                    case 4:
                        q1 q1Var = q1.this;
                        q1Var.f1938l = d.OPENED;
                        q1Var.f1932f = o2Var;
                        if (q1Var.f1933g != null) {
                            List<w.k0> b10 = q1Var.f1935i.d().b();
                            if (!b10.isEmpty()) {
                                q1 q1Var2 = q1.this;
                                q1Var2.m(q1Var2.u(b10));
                            }
                        }
                        androidx.camera.core.s1.a("CaptureSession", "Attempting to send capture request onConfigured");
                        q1 q1Var3 = q1.this;
                        q1Var3.o(q1Var3.f1933g);
                        q1.this.n();
                        break;
                    case 6:
                        q1.this.f1932f = o2Var;
                        break;
                    case 7:
                        o2Var.close();
                        break;
                }
                androidx.camera.core.s1.a("CaptureSession", "CameraCaptureSession.onConfigured() mState=" + q1.this.f1938l);
            }
        }

        @Override // androidx.camera.camera2.internal.o2.a
        public void s(o2 o2Var) {
            synchronized (q1.this.f1927a) {
                if (c.f1944a[q1.this.f1938l.ordinal()] == 1) {
                    throw new IllegalStateException("onReady() should not be possible in state: " + q1.this.f1938l);
                }
                androidx.camera.core.s1.a("CaptureSession", "CameraCaptureSession.onReady() " + q1.this.f1938l);
            }
        }

        @Override // androidx.camera.camera2.internal.o2.a
        public void t(o2 o2Var) {
            synchronized (q1.this.f1927a) {
                if (q1.this.f1938l == d.UNINITIALIZED) {
                    throw new IllegalStateException("onSessionFinished() should not be possible in state: " + q1.this.f1938l);
                }
                androidx.camera.core.s1.a("CaptureSession", "onSessionFinished()");
                q1.this.l();
            }
        }
    }

    public q1() {
        this.f1938l = d.UNINITIALIZED;
        this.f1938l = d.INITIALIZED;
    }

    private CameraCaptureSession.CaptureCallback k(List<w.h> list, CameraCaptureSession.CaptureCallback... captureCallbackArr) {
        ArrayList arrayList = new ArrayList(list.size() + captureCallbackArr.length);
        for (w.h hVar : list) {
            arrayList.add(m1.a(hVar));
        }
        Collections.addAll(arrayList, captureCallbackArr);
        return k0.a(arrayList);
    }

    public /* synthetic */ void p(CameraCaptureSession cameraCaptureSession, int i10, boolean z10) {
        synchronized (this.f1927a) {
            if (this.f1938l == d.OPENED) {
                o(this.f1933g);
            }
        }
    }

    public /* synthetic */ Object r(c.a aVar) {
        String str;
        synchronized (this.f1927a) {
            androidx.core.util.h.j(this.f1940n == null, "Release completer expected to be null");
            this.f1940n = aVar;
            str = "Release[session=" + this + "]";
        }
        return str;
    }

    private static w.o0 s(List<w.k0> list) {
        w.q1 L = w.q1.L();
        for (w.k0 k0Var : list) {
            w.o0 d10 = k0Var.d();
            for (o0.a<?> aVar : d10.c()) {
                Object a10 = d10.a(aVar, null);
                if (L.e(aVar)) {
                    Object a11 = L.a(aVar, null);
                    if (!Objects.equals(a11, a10)) {
                        androidx.camera.core.s1.a("CaptureSession", "Detect conflicting option " + aVar.c() + " : " + a10 + " != " + a11);
                    }
                } else {
                    L.g(aVar, a10);
                }
            }
        }
        return L;
    }

    /* renamed from: t */
    public x5.a<Void> q(List<Surface> list, w.c2 c2Var, CameraDevice cameraDevice) {
        synchronized (this.f1927a) {
            int i10 = c.f1944a[this.f1938l.ordinal()];
            if (i10 != 1 && i10 != 2) {
                if (i10 == 3) {
                    this.f1936j.clear();
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        this.f1936j.put(this.f1937k.get(i11), list.get(i11));
                    }
                    ArrayList<Surface> arrayList = new ArrayList(new LinkedHashSet(list));
                    this.f1938l = d.OPENING;
                    androidx.camera.core.s1.a("CaptureSession", "Opening capture session.");
                    o2.a v10 = b3.v(this.f1930d, new b3.a(c2Var.h()));
                    q.a aVar = new q.a(c2Var.d());
                    q.c I = aVar.I(q.c.e());
                    this.f1935i = I;
                    List<w.k0> c10 = I.d().c();
                    k0.a k10 = k0.a.k(c2Var.g());
                    for (w.k0 k0Var : c10) {
                        k10.e(k0Var.d());
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (Surface surface : arrayList) {
                        s.b bVar = new s.b(surface);
                        bVar.c(aVar.N(null));
                        arrayList2.add(bVar);
                    }
                    s.g a10 = this.f1931e.a(0, arrayList2, v10);
                    try {
                        CaptureRequest c11 = z0.c(k10.h(), cameraDevice);
                        if (c11 != null) {
                            a10.f(c11);
                        }
                        return this.f1931e.c(cameraDevice, a10, this.f1937k);
                    } catch (CameraAccessException e10) {
                        return y.f.f(e10);
                    }
                } else if (i10 != 5) {
                    return y.f.f(new CancellationException("openCaptureSession() not execute in state: " + this.f1938l));
                }
            }
            return y.f.f(new IllegalStateException("openCaptureSession() should not be possible in state: " + this.f1938l));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004d A[Catch: all -> 0x00a6, TryCatch #1 {, blocks: (B:4:0x0003, B:5:0x000d, B:7:0x0012, B:10:0x0018, B:12:0x001d, B:13:0x0024, B:14:0x0029, B:16:0x004d, B:17:0x0051, B:19:0x0055, B:20:0x0060, B:21:0x0062, B:23:0x0064, B:24:0x0081, B:25:0x0086, B:26:0x009e, B:27:0x009f), top: B:35:0x0003, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0055 A[Catch: all -> 0x00a6, TryCatch #1 {, blocks: (B:4:0x0003, B:5:0x000d, B:7:0x0012, B:10:0x0018, B:12:0x001d, B:13:0x0024, B:14:0x0029, B:16:0x004d, B:17:0x0051, B:19:0x0055, B:20:0x0060, B:21:0x0062, B:23:0x0064, B:24:0x0081, B:25:0x0086, B:26:0x009e, B:27:0x009f), top: B:35:0x0003, inners: #0 }] */
    @Override // androidx.camera.camera2.internal.r1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public x5.a<java.lang.Void> a(boolean r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f1927a
            monitor-enter(r0)
            int[] r1 = androidx.camera.camera2.internal.q1.c.f1944a     // Catch: java.lang.Throwable -> La6
            androidx.camera.camera2.internal.q1$d r2 = r3.f1938l     // Catch: java.lang.Throwable -> La6
            int r2 = r2.ordinal()     // Catch: java.lang.Throwable -> La6
            r1 = r1[r2]     // Catch: java.lang.Throwable -> La6
            switch(r1) {
                case 1: goto L86;
                case 2: goto L81;
                case 3: goto L64;
                case 4: goto L29;
                case 5: goto L12;
                case 6: goto L12;
                case 7: goto L51;
                default: goto L10;
            }     // Catch: java.lang.Throwable -> La6
        L10:
            goto L9f
        L12:
            androidx.camera.camera2.internal.o2 r1 = r3.f1932f     // Catch: java.lang.Throwable -> La6
            if (r1 == 0) goto L29
            if (r4 == 0) goto L24
            r1.j()     // Catch: android.hardware.camera2.CameraAccessException -> L1c java.lang.Throwable -> La6
            goto L24
        L1c:
            r4 = move-exception
            java.lang.String r1 = "CaptureSession"
            java.lang.String r2 = "Unable to abort captures."
            androidx.camera.core.s1.d(r1, r2, r4)     // Catch: java.lang.Throwable -> La6
        L24:
            androidx.camera.camera2.internal.o2 r4 = r3.f1932f     // Catch: java.lang.Throwable -> La6
            r4.close()     // Catch: java.lang.Throwable -> La6
        L29:
            androidx.camera.camera2.internal.q1$d r4 = androidx.camera.camera2.internal.q1.d.RELEASING     // Catch: java.lang.Throwable -> La6
            r3.f1938l = r4     // Catch: java.lang.Throwable -> La6
            androidx.camera.camera2.internal.a3 r4 = r3.f1931e     // Catch: java.lang.Throwable -> La6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La6
            r1.<init>()     // Catch: java.lang.Throwable -> La6
            java.lang.String r2 = "The Opener shouldn't null in state:"
            r1.append(r2)     // Catch: java.lang.Throwable -> La6
            androidx.camera.camera2.internal.q1$d r2 = r3.f1938l     // Catch: java.lang.Throwable -> La6
            r1.append(r2)     // Catch: java.lang.Throwable -> La6
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> La6
            androidx.core.util.h.h(r4, r1)     // Catch: java.lang.Throwable -> La6
            androidx.camera.camera2.internal.a3 r4 = r3.f1931e     // Catch: java.lang.Throwable -> La6
            boolean r4 = r4.e()     // Catch: java.lang.Throwable -> La6
            if (r4 == 0) goto L51
            r3.l()     // Catch: java.lang.Throwable -> La6
            goto L9f
        L51:
            x5.a<java.lang.Void> r4 = r3.f1939m     // Catch: java.lang.Throwable -> La6
            if (r4 != 0) goto L60
            androidx.camera.camera2.internal.o1 r4 = new androidx.camera.camera2.internal.o1     // Catch: java.lang.Throwable -> La6
            r4.<init>()     // Catch: java.lang.Throwable -> La6
            x5.a r4 = androidx.concurrent.futures.c.a(r4)     // Catch: java.lang.Throwable -> La6
            r3.f1939m = r4     // Catch: java.lang.Throwable -> La6
        L60:
            x5.a<java.lang.Void> r4 = r3.f1939m     // Catch: java.lang.Throwable -> La6
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La6
            return r4
        L64:
            androidx.camera.camera2.internal.a3 r4 = r3.f1931e     // Catch: java.lang.Throwable -> La6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La6
            r1.<init>()     // Catch: java.lang.Throwable -> La6
            java.lang.String r2 = "The Opener shouldn't null in state:"
            r1.append(r2)     // Catch: java.lang.Throwable -> La6
            androidx.camera.camera2.internal.q1$d r2 = r3.f1938l     // Catch: java.lang.Throwable -> La6
            r1.append(r2)     // Catch: java.lang.Throwable -> La6
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> La6
            androidx.core.util.h.h(r4, r1)     // Catch: java.lang.Throwable -> La6
            androidx.camera.camera2.internal.a3 r4 = r3.f1931e     // Catch: java.lang.Throwable -> La6
            r4.e()     // Catch: java.lang.Throwable -> La6
        L81:
            androidx.camera.camera2.internal.q1$d r4 = androidx.camera.camera2.internal.q1.d.RELEASED     // Catch: java.lang.Throwable -> La6
            r3.f1938l = r4     // Catch: java.lang.Throwable -> La6
            goto L9f
        L86:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> La6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La6
            r1.<init>()     // Catch: java.lang.Throwable -> La6
            java.lang.String r2 = "release() should not be possible in state: "
            r1.append(r2)     // Catch: java.lang.Throwable -> La6
            androidx.camera.camera2.internal.q1$d r2 = r3.f1938l     // Catch: java.lang.Throwable -> La6
            r1.append(r2)     // Catch: java.lang.Throwable -> La6
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> La6
            r4.<init>(r1)     // Catch: java.lang.Throwable -> La6
            throw r4     // Catch: java.lang.Throwable -> La6
        L9f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La6
            r4 = 0
            x5.a r4 = y.f.h(r4)
            return r4
        La6:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La6
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.internal.q1.a(boolean):x5.a");
    }

    @Override // androidx.camera.camera2.internal.r1
    public List<w.k0> b() {
        List<w.k0> unmodifiableList;
        synchronized (this.f1927a) {
            unmodifiableList = Collections.unmodifiableList(this.f1928b);
        }
        return unmodifiableList;
    }

    @Override // androidx.camera.camera2.internal.r1
    public void c(List<w.k0> list) {
        synchronized (this.f1927a) {
            switch (c.f1944a[this.f1938l.ordinal()]) {
                case 1:
                    throw new IllegalStateException("issueCaptureRequests() should not be possible in state: " + this.f1938l);
                case 2:
                case 3:
                case 4:
                    this.f1928b.addAll(list);
                    break;
                case 5:
                    this.f1928b.addAll(list);
                    n();
                    break;
                case 6:
                case 7:
                case 8:
                    throw new IllegalStateException("Cannot issue capture request on a closed/released session.");
            }
        }
    }

    @Override // androidx.camera.camera2.internal.r1
    public void close() {
        synchronized (this.f1927a) {
            int i10 = c.f1944a[this.f1938l.ordinal()];
            if (i10 == 1) {
                throw new IllegalStateException("close() should not be possible in state: " + this.f1938l);
            }
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 == 5) {
                            if (this.f1933g != null) {
                                List<w.k0> a10 = this.f1935i.d().a();
                                if (!a10.isEmpty()) {
                                    try {
                                        c(u(a10));
                                    } catch (IllegalStateException e10) {
                                        androidx.camera.core.s1.d("CaptureSession", "Unable to issue the request before close the capture session", e10);
                                    }
                                }
                            }
                        }
                    }
                    a3 a3Var = this.f1931e;
                    androidx.core.util.h.h(a3Var, "The Opener shouldn't null in state:" + this.f1938l);
                    this.f1931e.e();
                    this.f1938l = d.CLOSED;
                    this.f1933g = null;
                } else {
                    a3 a3Var2 = this.f1931e;
                    androidx.core.util.h.h(a3Var2, "The Opener shouldn't null in state:" + this.f1938l);
                    this.f1931e.e();
                }
            }
            this.f1938l = d.RELEASED;
        }
    }

    @Override // androidx.camera.camera2.internal.r1
    public w.c2 d() {
        w.c2 c2Var;
        synchronized (this.f1927a) {
            c2Var = this.f1933g;
        }
        return c2Var;
    }

    @Override // androidx.camera.camera2.internal.r1
    public void e() {
        ArrayList<w.k0> arrayList;
        synchronized (this.f1927a) {
            if (!this.f1928b.isEmpty()) {
                arrayList = new ArrayList(this.f1928b);
                this.f1928b.clear();
            } else {
                arrayList = null;
            }
        }
        if (arrayList != null) {
            for (w.k0 k0Var : arrayList) {
                for (w.h hVar : k0Var.b()) {
                    hVar.a();
                }
            }
        }
    }

    @Override // androidx.camera.camera2.internal.r1
    public x5.a<Void> f(final w.c2 c2Var, final CameraDevice cameraDevice, a3 a3Var) {
        synchronized (this.f1927a) {
            if (c.f1944a[this.f1938l.ordinal()] == 2) {
                this.f1938l = d.GET_SURFACE;
                ArrayList arrayList = new ArrayList(c2Var.j());
                this.f1937k = arrayList;
                this.f1931e = a3Var;
                y.d f10 = y.d.a(a3Var.d(arrayList, 5000L)).f(new y.a() { // from class: androidx.camera.camera2.internal.p1
                    @Override // y.a
                    public final x5.a apply(Object obj) {
                        x5.a q10;
                        q10 = q1.this.q(c2Var, cameraDevice, (List) obj);
                        return q10;
                    }
                }, this.f1931e.b());
                y.f.b(f10, new b(), this.f1931e.b());
                return y.f.j(f10);
            }
            androidx.camera.core.s1.c("CaptureSession", "Open not allowed in state: " + this.f1938l);
            return y.f.f(new IllegalStateException("open() should not allow the state: " + this.f1938l));
        }
    }

    @Override // androidx.camera.camera2.internal.r1
    public void g(w.c2 c2Var) {
        synchronized (this.f1927a) {
            switch (c.f1944a[this.f1938l.ordinal()]) {
                case 1:
                    throw new IllegalStateException("setSessionConfig() should not be possible in state: " + this.f1938l);
                case 2:
                case 3:
                case 4:
                    this.f1933g = c2Var;
                    break;
                case 5:
                    this.f1933g = c2Var;
                    if (c2Var != null) {
                        if (this.f1936j.keySet().containsAll(c2Var.j())) {
                            androidx.camera.core.s1.a("CaptureSession", "Attempting to submit CaptureRequest after setting");
                            o(this.f1933g);
                            break;
                        } else {
                            androidx.camera.core.s1.c("CaptureSession", "Does not have the proper configured lists");
                            return;
                        }
                    } else {
                        return;
                    }
                case 6:
                case 7:
                case 8:
                    throw new IllegalStateException("Session configuration cannot be set on a closed/released session.");
            }
        }
    }

    void l() {
        d dVar = this.f1938l;
        d dVar2 = d.RELEASED;
        if (dVar == dVar2) {
            androidx.camera.core.s1.a("CaptureSession", "Skipping finishClose due to being state RELEASED.");
            return;
        }
        this.f1938l = dVar2;
        this.f1932f = null;
        c.a<Void> aVar = this.f1940n;
        if (aVar == null) {
            return;
        }
        aVar.c(null);
        this.f1940n = null;
    }

    int m(List<w.k0> list) {
        e1 e1Var;
        ArrayList arrayList;
        boolean z10;
        boolean z11;
        synchronized (this.f1927a) {
            if (list.isEmpty()) {
                return -1;
            }
            try {
                e1Var = new e1();
                arrayList = new ArrayList();
                androidx.camera.core.s1.a("CaptureSession", "Issuing capture request.");
                z10 = false;
                for (w.k0 k0Var : list) {
                    if (k0Var.e().isEmpty()) {
                        androidx.camera.core.s1.a("CaptureSession", "Skipping issuing empty capture request.");
                    } else {
                        Iterator<w.r0> it = k0Var.e().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z11 = true;
                                break;
                            }
                            w.r0 next = it.next();
                            if (!this.f1936j.containsKey(next)) {
                                androidx.camera.core.s1.a("CaptureSession", "Skipping capture request with invalid surface: " + next);
                                z11 = false;
                                break;
                            }
                        }
                        if (z11) {
                            if (k0Var.g() == 2) {
                                z10 = true;
                            }
                            k0.a k10 = k0.a.k(k0Var);
                            if (k0Var.g() == 5 && k0Var.c() != null) {
                                k10.n(k0Var.c());
                            }
                            w.c2 c2Var = this.f1933g;
                            if (c2Var != null) {
                                k10.e(c2Var.g().d());
                            }
                            k10.e(this.f1934h);
                            k10.e(k0Var.d());
                            CaptureRequest b10 = z0.b(k10.h(), this.f1932f.k(), this.f1936j);
                            if (b10 == null) {
                                androidx.camera.core.s1.a("CaptureSession", "Skipping issuing request without surface.");
                                return -1;
                            }
                            ArrayList arrayList2 = new ArrayList();
                            for (w.h hVar : k0Var.b()) {
                                m1.b(hVar, arrayList2);
                            }
                            e1Var.a(b10, arrayList2);
                            arrayList.add(b10);
                        }
                    }
                }
            } catch (CameraAccessException e10) {
                androidx.camera.core.s1.c("CaptureSession", "Unable to access camera: " + e10.getMessage());
                Thread.dumpStack();
            }
            if (arrayList.isEmpty()) {
                androidx.camera.core.s1.a("CaptureSession", "Skipping issuing burst request due to no valid request elements");
                return -1;
            }
            if (this.f1941o.a(arrayList, z10)) {
                this.f1932f.e();
                e1Var.c(new e1.a() { // from class: androidx.camera.camera2.internal.n1
                    @Override // androidx.camera.camera2.internal.e1.a
                    public final void a(CameraCaptureSession cameraCaptureSession, int i10, boolean z12) {
                        q1.this.p(cameraCaptureSession, i10, z12);
                    }
                });
            }
            return this.f1932f.g(arrayList, e1Var);
        }
    }

    void n() {
        if (this.f1928b.isEmpty()) {
            return;
        }
        try {
            m(this.f1928b);
        } finally {
            this.f1928b.clear();
        }
    }

    int o(w.c2 c2Var) {
        synchronized (this.f1927a) {
            if (c2Var == null) {
                androidx.camera.core.s1.a("CaptureSession", "Skipping issueRepeatingCaptureRequests for no configuration case.");
                return -1;
            }
            w.k0 g10 = c2Var.g();
            if (g10.e().isEmpty()) {
                androidx.camera.core.s1.a("CaptureSession", "Skipping issueRepeatingCaptureRequests for no surface.");
                try {
                    this.f1932f.e();
                } catch (CameraAccessException e10) {
                    androidx.camera.core.s1.c("CaptureSession", "Unable to access camera: " + e10.getMessage());
                    Thread.dumpStack();
                }
                return -1;
            }
            try {
                androidx.camera.core.s1.a("CaptureSession", "Issuing request for session.");
                k0.a k10 = k0.a.k(g10);
                w.o0 s10 = s(this.f1935i.d().d());
                this.f1934h = s10;
                k10.e(s10);
                CaptureRequest b10 = z0.b(k10.h(), this.f1932f.k(), this.f1936j);
                if (b10 == null) {
                    androidx.camera.core.s1.a("CaptureSession", "Skipping issuing empty request for session.");
                    return -1;
                }
                return this.f1932f.m(b10, k(g10.b(), this.f1929c));
            } catch (CameraAccessException e11) {
                androidx.camera.core.s1.c("CaptureSession", "Unable to access camera: " + e11.getMessage());
                Thread.dumpStack();
                return -1;
            }
        }
    }

    List<w.k0> u(List<w.k0> list) {
        ArrayList arrayList = new ArrayList();
        for (w.k0 k0Var : list) {
            k0.a k10 = k0.a.k(k0Var);
            k10.p(1);
            for (w.r0 r0Var : this.f1933g.g().e()) {
                k10.f(r0Var);
            }
            arrayList.add(k10.h());
        }
        return arrayList;
    }
}
