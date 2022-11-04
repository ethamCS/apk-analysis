package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import u.g;
import u.u;
/* loaded from: classes.dex */
public class z2 extends u2 {

    /* renamed from: o */
    private final Object f2072o = new Object();

    /* renamed from: p */
    private List<w.r0> f2073p;

    /* renamed from: q */
    x5.a<Void> f2074q;

    /* renamed from: r */
    private final u.h f2075r;

    /* renamed from: s */
    private final u.u f2076s;

    /* renamed from: t */
    private final u.g f2077t;

    public z2(w.y1 y1Var, w.y1 y1Var2, t1 t1Var, Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        super(t1Var, executor, scheduledExecutorService, handler);
        this.f2075r = new u.h(y1Var, y1Var2);
        this.f2076s = new u.u(y1Var);
        this.f2077t = new u.g(y1Var2);
    }

    public /* synthetic */ void O() {
        N("Session call super.close()");
        super.close();
    }

    public /* synthetic */ void P(o2 o2Var) {
        super.r(o2Var);
    }

    public /* synthetic */ x5.a Q(CameraDevice cameraDevice, s.g gVar, List list) {
        return super.l(cameraDevice, gVar, list);
    }

    public /* synthetic */ int R(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        return super.m(captureRequest, captureCallback);
    }

    void N(String str) {
        androidx.camera.core.s1.a("SyncCaptureSessionImpl", "[" + this + "] " + str);
    }

    @Override // androidx.camera.camera2.internal.u2, androidx.camera.camera2.internal.o2
    public void close() {
        N("Session call close()");
        this.f2076s.f();
        this.f2076s.c().b(new Runnable() { // from class: androidx.camera.camera2.internal.v2
            @Override // java.lang.Runnable
            public final void run() {
                z2.this.O();
            }
        }, c());
    }

    @Override // androidx.camera.camera2.internal.u2, androidx.camera.camera2.internal.a3.b
    public x5.a<List<Surface>> f(List<w.r0> list, long j10) {
        x5.a<List<Surface>> f10;
        synchronized (this.f2072o) {
            this.f2073p = list;
            f10 = super.f(list, j10);
        }
        return f10;
    }

    @Override // androidx.camera.camera2.internal.u2, androidx.camera.camera2.internal.o2
    public x5.a<Void> h() {
        return this.f2076s.c();
    }

    @Override // androidx.camera.camera2.internal.u2, androidx.camera.camera2.internal.a3.b
    public x5.a<Void> l(CameraDevice cameraDevice, s.g gVar, List<w.r0> list) {
        x5.a<Void> j10;
        synchronized (this.f2072o) {
            x5.a<Void> g10 = this.f2076s.g(cameraDevice, gVar, list, this.f2011b.e(), new u.b() { // from class: androidx.camera.camera2.internal.x2
                @Override // u.u.b
                public final x5.a a(CameraDevice cameraDevice2, s.g gVar2, List list2) {
                    x5.a Q;
                    Q = z2.this.Q(cameraDevice2, gVar2, list2);
                    return Q;
                }
            });
            this.f2074q = g10;
            j10 = y.f.j(g10);
        }
        return j10;
    }

    @Override // androidx.camera.camera2.internal.u2, androidx.camera.camera2.internal.o2
    public int m(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f2076s.h(captureRequest, captureCallback, new u.c() { // from class: androidx.camera.camera2.internal.y2
            @Override // u.u.c
            public final int a(CaptureRequest captureRequest2, CameraCaptureSession.CaptureCallback captureCallback2) {
                int R;
                R = z2.this.R(captureRequest2, captureCallback2);
                return R;
            }
        });
    }

    @Override // androidx.camera.camera2.internal.u2, androidx.camera.camera2.internal.o2.a
    public void p(o2 o2Var) {
        synchronized (this.f2072o) {
            this.f2075r.a(this.f2073p);
        }
        N("onClosed()");
        super.p(o2Var);
    }

    @Override // androidx.camera.camera2.internal.u2, androidx.camera.camera2.internal.o2.a
    public void r(o2 o2Var) {
        N("Session onConfigured()");
        this.f2077t.c(o2Var, this.f2011b.f(), this.f2011b.d(), new g.a() { // from class: androidx.camera.camera2.internal.w2
            @Override // u.g.a
            public final void a(o2 o2Var2) {
                z2.this.P(o2Var2);
            }
        });
    }

    @Override // androidx.camera.camera2.internal.u2, androidx.camera.camera2.internal.a3.b
    public boolean stop() {
        boolean stop;
        synchronized (this.f2072o) {
            if (C()) {
                this.f2075r.a(this.f2073p);
            } else {
                x5.a<Void> aVar = this.f2074q;
                if (aVar != null) {
                    aVar.cancel(true);
                }
            }
            stop = super.stop();
        }
        return stop;
    }
}
