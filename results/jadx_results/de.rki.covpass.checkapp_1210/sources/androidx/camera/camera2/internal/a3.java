package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.camera2.internal.o2;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes.dex */
public final class a3 {

    /* renamed from: a */
    private final b f1607a;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private final Executor f1608a;

        /* renamed from: b */
        private final ScheduledExecutorService f1609b;

        /* renamed from: c */
        private final Handler f1610c;

        /* renamed from: d */
        private final t1 f1611d;

        /* renamed from: e */
        private final w.y1 f1612e;

        /* renamed from: f */
        private final w.y1 f1613f;

        /* renamed from: g */
        private final boolean f1614g;

        public a(Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler, t1 t1Var, w.y1 y1Var, w.y1 y1Var2) {
            this.f1608a = executor;
            this.f1609b = scheduledExecutorService;
            this.f1610c = handler;
            this.f1611d = t1Var;
            this.f1612e = y1Var;
            this.f1613f = y1Var2;
            this.f1614g = new u.h(y1Var, y1Var2).b() || new u.u(y1Var).i() || new u.g(y1Var2).d();
        }

        public a3 a() {
            return new a3(this.f1614g ? new z2(this.f1612e, this.f1613f, this.f1611d, this.f1608a, this.f1609b, this.f1610c) : new u2(this.f1611d, this.f1608a, this.f1609b, this.f1610c));
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        Executor c();

        s.g d(int i10, List<s.b> list, o2.a aVar);

        x5.a<List<Surface>> f(List<w.r0> list, long j10);

        x5.a<Void> l(CameraDevice cameraDevice, s.g gVar, List<w.r0> list);

        boolean stop();
    }

    a3(b bVar) {
        this.f1607a = bVar;
    }

    public s.g a(int i10, List<s.b> list, o2.a aVar) {
        return this.f1607a.d(i10, list, aVar);
    }

    public Executor b() {
        return this.f1607a.c();
    }

    public x5.a<Void> c(CameraDevice cameraDevice, s.g gVar, List<w.r0> list) {
        return this.f1607a.l(cameraDevice, gVar, list);
    }

    public x5.a<List<Surface>> d(List<w.r0> list, long j10) {
        return this.f1607a.f(list, j10);
    }

    public boolean e() {
        return this.f1607a.stop();
    }
}
