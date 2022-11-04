package v;

import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.camera2.internal.t;
import androidx.camera.core.m;
import androidx.concurrent.futures.c;
import java.util.concurrent.Executor;
import q.a;
import w.o0;
/* loaded from: classes.dex */
public final class g {

    /* renamed from: c */
    private final t f23825c;

    /* renamed from: d */
    final Executor f23826d;

    /* renamed from: g */
    c.a<Void> f23829g;

    /* renamed from: a */
    private boolean f23823a = false;

    /* renamed from: b */
    private boolean f23824b = false;

    /* renamed from: e */
    final Object f23827e = new Object();

    /* renamed from: f */
    private a.C0313a f23828f = new a.C0313a();

    /* renamed from: h */
    private final t.c f23830h = new t.c() { // from class: v.a
        @Override // androidx.camera.camera2.internal.t.c
        public final boolean a(TotalCaptureResult totalCaptureResult) {
            boolean q10;
            q10 = g.this.q(totalCaptureResult);
            return q10;
        }
    };

    public g(t tVar, Executor executor) {
        this.f23825c = tVar;
        this.f23826d = executor;
    }

    private void h(j jVar) {
        synchronized (this.f23827e) {
            for (o0.a aVar : jVar.c()) {
                this.f23828f.a().g(aVar, jVar.b(aVar));
            }
        }
    }

    private void j() {
        synchronized (this.f23827e) {
            this.f23828f = new a.C0313a();
        }
    }

    public /* synthetic */ Object n(final c.a aVar) {
        this.f23826d.execute(new Runnable() { // from class: v.e
            @Override // java.lang.Runnable
            public final void run() {
                g.this.m(aVar);
            }
        });
        return "addCaptureRequestOptions";
    }

    public /* synthetic */ Object p(final c.a aVar) {
        this.f23826d.execute(new Runnable() { // from class: v.d
            @Override // java.lang.Runnable
            public final void run() {
                g.this.o(aVar);
            }
        });
        return "clearCaptureRequestOptions";
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ boolean q(android.hardware.camera2.TotalCaptureResult r3) {
        /*
            r2 = this;
            androidx.concurrent.futures.c$a<java.lang.Void> r0 = r2.f23829g
            r1 = 0
            if (r0 == 0) goto L32
            android.hardware.camera2.CaptureRequest r3 = r3.getRequest()
            java.lang.Object r3 = r3.getTag()
            boolean r0 = r3 instanceof w.j2
            if (r0 == 0) goto L32
            w.j2 r3 = (w.j2) r3
            java.lang.String r0 = "Camera2CameraControl"
            java.lang.Object r3 = r3.c(r0)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 == 0) goto L32
            androidx.concurrent.futures.c$a<java.lang.Void> r0 = r2.f23829g
            int r0 = r0.hashCode()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L32
            androidx.concurrent.futures.c$a<java.lang.Void> r3 = r2.f23829g
            r2.f23829g = r1
            goto L33
        L32:
            r3 = r1
        L33:
            if (r3 == 0) goto L38
            r3.c(r1)
        L38:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: v.g.q(android.hardware.camera2.TotalCaptureResult):boolean");
    }

    /* renamed from: t */
    public void r(boolean z10) {
        if (this.f23823a == z10) {
            return;
        }
        this.f23823a = z10;
        if (z10) {
            if (!this.f23824b) {
                return;
            }
            v();
            return;
        }
        c.a<Void> aVar = this.f23829g;
        if (aVar == null) {
            return;
        }
        aVar.f(new m.a("The camera control has became inactive."));
        this.f23829g = null;
    }

    /* renamed from: u */
    public void o(c.a<Void> aVar) {
        this.f23824b = true;
        c.a<Void> aVar2 = this.f23829g;
        if (aVar2 == null) {
            aVar2 = null;
        }
        this.f23829g = aVar;
        if (this.f23823a) {
            v();
        }
        if (aVar2 != null) {
            aVar2.f(new m.a("Camera2CameraControl was updated with new options."));
        }
    }

    private void v() {
        this.f23825c.j0();
        this.f23824b = false;
    }

    public x5.a<Void> g(j jVar) {
        h(jVar);
        return y.f.j(androidx.concurrent.futures.c.a(new c.AbstractC0023c() { // from class: v.c
            @Override // androidx.concurrent.futures.c.AbstractC0023c
            public final Object a(c.a aVar) {
                Object n10;
                n10 = g.this.n(aVar);
                return n10;
            }
        }));
    }

    public x5.a<Void> i() {
        j();
        return y.f.j(androidx.concurrent.futures.c.a(new c.AbstractC0023c() { // from class: v.b
            @Override // androidx.concurrent.futures.c.AbstractC0023c
            public final Object a(c.a aVar) {
                Object p10;
                p10 = g.this.p(aVar);
                return p10;
            }
        }));
    }

    public q.a k() {
        q.a c10;
        synchronized (this.f23827e) {
            if (this.f23829g != null) {
                this.f23828f.a().g(q.a.F, Integer.valueOf(this.f23829g.hashCode()));
            }
            c10 = this.f23828f.c();
        }
        return c10;
    }

    public t.c l() {
        return this.f23830h;
    }

    public void s(final boolean z10) {
        this.f23826d.execute(new Runnable() { // from class: v.f
            @Override // java.lang.Runnable
            public final void run() {
                g.this.r(z10);
            }
        });
    }
}
