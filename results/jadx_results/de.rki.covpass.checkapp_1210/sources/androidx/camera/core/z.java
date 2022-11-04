package androidx.camera.core;

import android.os.Handler;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import w.a0;
import w.o0;
import w.p2;
import w.z;
/* loaded from: classes.dex */
public final class z implements z.i<y> {
    static final o0.a<a0.a> A = o0.a.a("camerax.core.appConfig.cameraFactoryProvider", a0.a.class);
    static final o0.a<z.a> B = o0.a.a("camerax.core.appConfig.deviceSurfaceManagerProvider", z.a.class);
    static final o0.a<p2.c> C = o0.a.a("camerax.core.appConfig.useCaseConfigFactoryProvider", p2.c.class);
    static final o0.a<Executor> D = o0.a.a("camerax.core.appConfig.cameraExecutor", Executor.class);
    static final o0.a<Handler> E = o0.a.a("camerax.core.appConfig.schedulerHandler", Handler.class);
    static final o0.a<Integer> F = o0.a.a("camerax.core.appConfig.minimumLoggingLevel", Integer.TYPE);
    static final o0.a<s> G = o0.a.a("camerax.core.appConfig.availableCamerasLimiter", s.class);

    /* renamed from: z */
    private final w.u1 f2577z;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final w.q1 f2578a;

        public a() {
            this(w.q1.L());
        }

        private a(w.q1 q1Var) {
            this.f2578a = q1Var;
            Class cls = (Class) q1Var.a(z.i.f26356w, null);
            if (cls == null || cls.equals(y.class)) {
                e(y.class);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }

        private w.p1 b() {
            return this.f2578a;
        }

        public z a() {
            return new z(w.u1.J(this.f2578a));
        }

        public a c(a0.a aVar) {
            b().g(z.A, aVar);
            return this;
        }

        public a d(z.a aVar) {
            b().g(z.B, aVar);
            return this;
        }

        public a e(Class<y> cls) {
            b().g(z.i.f26356w, cls);
            if (b().a(z.i.f26355v, null) == null) {
                f(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        public a f(String str) {
            b().g(z.i.f26355v, str);
            return this;
        }

        public a g(p2.c cVar) {
            b().g(z.C, cVar);
            return this;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        z getCameraXConfig();
    }

    z(w.u1 u1Var) {
        this.f2577z = u1Var;
    }

    @Override // z.i
    public /* synthetic */ String B(String str) {
        return z.h.a(this, str);
    }

    public s H(s sVar) {
        return (s) this.f2577z.a(G, sVar);
    }

    public Executor I(Executor executor) {
        return (Executor) this.f2577z.a(D, executor);
    }

    public a0.a J(a0.a aVar) {
        return (a0.a) this.f2577z.a(A, aVar);
    }

    public z.a K(z.a aVar) {
        return (z.a) this.f2577z.a(B, aVar);
    }

    public Handler L(Handler handler) {
        return (Handler) this.f2577z.a(E, handler);
    }

    public p2.c M(p2.c cVar) {
        return (p2.c) this.f2577z.a(C, cVar);
    }

    @Override // w.a2, w.o0
    public /* synthetic */ Object a(o0.a aVar, Object obj) {
        return w.z1.g(this, aVar, obj);
    }

    @Override // w.a2, w.o0
    public /* synthetic */ Object b(o0.a aVar) {
        return w.z1.f(this, aVar);
    }

    @Override // w.a2, w.o0
    public /* synthetic */ Set c() {
        return w.z1.e(this);
    }

    @Override // w.a2, w.o0
    public /* synthetic */ o0.c d(o0.a aVar) {
        return w.z1.c(this, aVar);
    }

    @Override // w.a2, w.o0
    public /* synthetic */ boolean e(o0.a aVar) {
        return w.z1.a(this, aVar);
    }

    @Override // w.a2
    public w.o0 k() {
        return this.f2577z;
    }

    @Override // w.o0
    public /* synthetic */ Object t(o0.a aVar, o0.c cVar) {
        return w.z1.h(this, aVar, cVar);
    }

    @Override // w.o0
    public /* synthetic */ void v(String str, o0.b bVar) {
        w.z1.b(this, str, bVar);
    }

    @Override // w.o0
    public /* synthetic */ Set x(o0.a aVar) {
        return w.z1.d(this, aVar);
    }
}
