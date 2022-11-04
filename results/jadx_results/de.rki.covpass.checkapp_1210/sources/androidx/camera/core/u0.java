package androidx.camera.core;

import androidx.camera.core.k0;
import androidx.camera.core.u0;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class u0 extends s0 {

    /* renamed from: u */
    final Executor f2502u;

    /* renamed from: v */
    private final Object f2503v = new Object();

    /* renamed from: w */
    n1 f2504w;

    /* renamed from: x */
    private b f2505x;

    /* loaded from: classes.dex */
    public class a implements y.c<Void> {

        /* renamed from: a */
        final /* synthetic */ b f2506a;

        a(b bVar) {
            u0.this = r1;
            this.f2506a = bVar;
        }

        @Override // y.c
        public void a(Throwable th2) {
            this.f2506a.close();
        }

        /* renamed from: c */
        public void b(Void r12) {
        }
    }

    /* loaded from: classes.dex */
    public static class b extends k0 {

        /* renamed from: q */
        final WeakReference<u0> f2508q;

        b(n1 n1Var, u0 u0Var) {
            super(n1Var);
            this.f2508q = new WeakReference<>(u0Var);
            b(new k0.a() { // from class: androidx.camera.core.v0
                @Override // androidx.camera.core.k0.a
                public final void c(n1 n1Var2) {
                    u0.b.this.j(n1Var2);
                }
            });
        }

        public /* synthetic */ void j(n1 n1Var) {
            final u0 u0Var = this.f2508q.get();
            if (u0Var != null) {
                u0Var.f2502u.execute(new Runnable() { // from class: androidx.camera.core.w0
                    @Override // java.lang.Runnable
                    public final void run() {
                        u0.this.A();
                    }
                });
            }
        }
    }

    public u0(Executor executor) {
        this.f2502u = executor;
    }

    public void A() {
        synchronized (this.f2503v) {
            this.f2505x = null;
            n1 n1Var = this.f2504w;
            if (n1Var != null) {
                this.f2504w = null;
                p(n1Var);
            }
        }
    }

    @Override // androidx.camera.core.s0
    n1 d(w.h1 h1Var) {
        return h1Var.e();
    }

    @Override // androidx.camera.core.s0
    public void g() {
        synchronized (this.f2503v) {
            n1 n1Var = this.f2504w;
            if (n1Var != null) {
                n1Var.close();
                this.f2504w = null;
            }
        }
    }

    @Override // androidx.camera.core.s0
    void p(n1 n1Var) {
        synchronized (this.f2503v) {
            if (!this.f2486s) {
                n1Var.close();
            } else if (this.f2505x == null) {
                b bVar = new b(n1Var, this);
                this.f2505x = bVar;
                y.f.b(e(bVar), new a(bVar), x.a.a());
            } else {
                if (n1Var.I().c() <= this.f2505x.I().c()) {
                    n1Var.close();
                } else {
                    n1 n1Var2 = this.f2504w;
                    if (n1Var2 != null) {
                        n1Var2.close();
                    }
                    this.f2504w = n1Var;
                }
            }
        }
    }
}
