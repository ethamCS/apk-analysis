package androidx.camera.core;

import android.view.Surface;
import androidx.camera.core.k0;
import java.util.concurrent.Executor;
import w.h1;
/* loaded from: classes.dex */
public class o2 implements w.h1 {

    /* renamed from: d */
    private final w.h1 f2425d;

    /* renamed from: e */
    private final Surface f2426e;

    /* renamed from: a */
    private final Object f2422a = new Object();

    /* renamed from: b */
    private int f2423b = 0;

    /* renamed from: c */
    private boolean f2424c = false;

    /* renamed from: f */
    private final k0.a f2427f = new k0.a() { // from class: androidx.camera.core.m2
        @Override // androidx.camera.core.k0.a
        public final void c(n1 n1Var) {
            o2.this.l(n1Var);
        }
    };

    public o2(w.h1 h1Var) {
        this.f2425d = h1Var;
        this.f2426e = h1Var.b();
    }

    public /* synthetic */ void l(n1 n1Var) {
        synchronized (this.f2422a) {
            int i10 = this.f2423b - 1;
            this.f2423b = i10;
            if (this.f2424c && i10 == 0) {
                close();
            }
        }
    }

    public /* synthetic */ void m(h1.a aVar, w.h1 h1Var) {
        aVar.a(this);
    }

    private n1 o(n1 n1Var) {
        if (n1Var != null) {
            this.f2423b++;
            r2 r2Var = new r2(n1Var);
            r2Var.b(this.f2427f);
            return r2Var;
        }
        return null;
    }

    @Override // w.h1
    public int a() {
        int a10;
        synchronized (this.f2422a) {
            a10 = this.f2425d.a();
        }
        return a10;
    }

    @Override // w.h1
    public Surface b() {
        Surface b10;
        synchronized (this.f2422a) {
            b10 = this.f2425d.b();
        }
        return b10;
    }

    @Override // w.h1
    public void close() {
        synchronized (this.f2422a) {
            Surface surface = this.f2426e;
            if (surface != null) {
                surface.release();
            }
            this.f2425d.close();
        }
    }

    @Override // w.h1
    public int d() {
        int d10;
        synchronized (this.f2422a) {
            d10 = this.f2425d.d();
        }
        return d10;
    }

    @Override // w.h1
    public n1 e() {
        n1 o10;
        synchronized (this.f2422a) {
            o10 = o(this.f2425d.e());
        }
        return o10;
    }

    @Override // w.h1
    public int f() {
        int f10;
        synchronized (this.f2422a) {
            f10 = this.f2425d.f();
        }
        return f10;
    }

    @Override // w.h1
    public void g(final h1.a aVar, Executor executor) {
        synchronized (this.f2422a) {
            this.f2425d.g(new h1.a() { // from class: androidx.camera.core.n2
                @Override // w.h1.a
                public final void a(w.h1 h1Var) {
                    o2.this.m(aVar, h1Var);
                }
            }, executor);
        }
    }

    @Override // w.h1
    public void h() {
        synchronized (this.f2422a) {
            this.f2425d.h();
        }
    }

    @Override // w.h1
    public int i() {
        int i10;
        synchronized (this.f2422a) {
            i10 = this.f2425d.i();
        }
        return i10;
    }

    @Override // w.h1
    public n1 j() {
        n1 o10;
        synchronized (this.f2422a) {
            o10 = o(this.f2425d.j());
        }
        return o10;
    }

    public void n() {
        synchronized (this.f2422a) {
            this.f2424c = true;
            this.f2425d.h();
            if (this.f2423b == 0) {
                close();
            }
        }
    }
}
