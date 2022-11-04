package e.m0.h;

import e.a0;
import e.d0;
import e.g0;
import e.l;
import e.v;
import e.z;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a */
    private final d0 f4141a;

    /* renamed from: b */
    private final g f4142b;

    /* renamed from: c */
    private final e.j f4143c;

    /* renamed from: d */
    private final v f4144d;

    /* renamed from: e */
    private final f.a f4145e;
    @Nullable

    /* renamed from: f */
    private Object f4146f;

    /* renamed from: g */
    private g0 f4147g;

    /* renamed from: h */
    private e f4148h;
    public f i;
    @Nullable
    private d j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends f.a {
        a() {
            k.this = r1;
        }

        @Override // f.a
        protected void t() {
            k.this.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends WeakReference<k> {

        /* renamed from: a */
        final Object f4149a;

        b(k kVar, Object obj) {
            super(kVar);
            this.f4149a = obj;
        }
    }

    public k(d0 d0Var, e.j jVar) {
        a aVar = new a();
        this.f4145e = aVar;
        this.f4141a = d0Var;
        this.f4142b = e.m0.c.f4060a.h(d0Var.h());
        this.f4143c = jVar;
        this.f4144d = d0Var.n().a(jVar);
        aVar.g(d0Var.e(), TimeUnit.MILLISECONDS);
    }

    private e.e e(z zVar) {
        l lVar;
        HostnameVerifier hostnameVerifier;
        SSLSocketFactory sSLSocketFactory;
        if (zVar.n()) {
            SSLSocketFactory D = this.f4141a.D();
            hostnameVerifier = this.f4141a.q();
            sSLSocketFactory = D;
            lVar = this.f4141a.f();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            lVar = null;
        }
        return new e.e(zVar.m(), zVar.y(), this.f4141a.m(), this.f4141a.C(), sSLSocketFactory, hostnameVerifier, lVar, this.f4141a.y(), this.f4141a.x(), this.f4141a.w(), this.f4141a.i(), this.f4141a.z());
    }

    @Nullable
    private IOException j(@Nullable IOException iOException, boolean z) {
        f fVar;
        Socket n;
        boolean z2;
        boolean z3;
        synchronized (this.f4142b) {
            if (z) {
                if (this.j != null) {
                    throw new IllegalStateException("cannot release connection while it is in use");
                }
            }
            fVar = this.i;
            n = (fVar == null || this.j != null || (!z && !this.o)) ? null : n();
            if (this.i != null) {
                fVar = null;
            }
            z2 = true;
            z3 = this.o && this.j == null;
        }
        e.m0.e.f(n);
        if (fVar != null) {
            this.f4144d.h(this.f4143c, fVar);
        }
        if (z3) {
            if (iOException == null) {
                z2 = false;
            }
            iOException = q(iOException);
            v vVar = this.f4144d;
            e.j jVar = this.f4143c;
            if (z2) {
                vVar.b(jVar, iOException);
            } else {
                vVar.a(jVar);
            }
        }
        return iOException;
    }

    @Nullable
    private IOException q(@Nullable IOException iOException) {
        if (!this.n && this.f4145e.n()) {
            InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
            return interruptedIOException;
        }
        return iOException;
    }

    public void a(f fVar) {
        if (this.i == null) {
            this.i = fVar;
            fVar.p.add(new b(this, this.f4146f));
            return;
        }
        throw new IllegalStateException();
    }

    public void b() {
        this.f4146f = e.m0.l.f.j().m("response.body().close()");
        this.f4144d.c(this.f4143c);
    }

    public boolean c() {
        return this.f4148h.f() && this.f4148h.e();
    }

    public void d() {
        d dVar;
        f a2;
        synchronized (this.f4142b) {
            this.m = true;
            dVar = this.j;
            e eVar = this.f4148h;
            a2 = (eVar == null || eVar.a() == null) ? this.i : this.f4148h.a();
        }
        if (dVar != null) {
            dVar.b();
        } else if (a2 == null) {
        } else {
            a2.c();
        }
    }

    public void f() {
        synchronized (this.f4142b) {
            if (this.o) {
                throw new IllegalStateException();
            }
            this.j = null;
        }
    }

    @Nullable
    public IOException g(d dVar, boolean z, boolean z2, @Nullable IOException iOException) {
        boolean z3;
        synchronized (this.f4142b) {
            d dVar2 = this.j;
            if (dVar != dVar2) {
                return iOException;
            }
            boolean z4 = true;
            if (z) {
                z3 = !this.k;
                this.k = true;
            } else {
                z3 = false;
            }
            if (z2) {
                if (!this.l) {
                    z3 = true;
                }
                this.l = true;
            }
            if (!this.k || !this.l || !z3) {
                z4 = false;
            } else {
                dVar2.c().m++;
                this.j = null;
            }
            return z4 ? j(iOException, false) : iOException;
        }
    }

    public boolean h() {
        boolean z;
        synchronized (this.f4142b) {
            z = this.j != null;
        }
        return z;
    }

    public boolean i() {
        boolean z;
        synchronized (this.f4142b) {
            z = this.m;
        }
        return z;
    }

    public d k(a0.a aVar, boolean z) {
        synchronized (this.f4142b) {
            if (this.o) {
                throw new IllegalStateException("released");
            }
            if (this.j != null) {
                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
            }
        }
        d dVar = new d(this, this.f4143c, this.f4144d, this.f4148h, this.f4148h.b(this.f4141a, aVar, z));
        synchronized (this.f4142b) {
            this.j = dVar;
            this.k = false;
            this.l = false;
        }
        return dVar;
    }

    @Nullable
    public IOException l(@Nullable IOException iOException) {
        synchronized (this.f4142b) {
            this.o = true;
        }
        return j(iOException, false);
    }

    public void m(g0 g0Var) {
        g0 g0Var2 = this.f4147g;
        if (g0Var2 != null) {
            if (e.m0.e.C(g0Var2.i(), g0Var.i()) && this.f4148h.e()) {
                return;
            }
            if (this.j != null) {
                throw new IllegalStateException();
            }
            if (this.f4148h != null) {
                j(null, true);
                this.f4148h = null;
            }
        }
        this.f4147g = g0Var;
        this.f4148h = new e(this, this.f4142b, e(g0Var.i()), this.f4143c, this.f4144d);
    }

    @Nullable
    public Socket n() {
        int i = 0;
        int size = this.i.p.size();
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (this.i.p.get(i).get() == this) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            f fVar = this.i;
            fVar.p.remove(i);
            this.i = null;
            if (!fVar.p.isEmpty()) {
                return null;
            }
            fVar.q = System.nanoTime();
            if (!this.f4142b.c(fVar)) {
                return null;
            }
            return fVar.s();
        }
        throw new IllegalStateException();
    }

    public void o() {
        if (!this.n) {
            this.n = true;
            this.f4145e.n();
            return;
        }
        throw new IllegalStateException();
    }

    public void p() {
        this.f4145e.k();
    }
}
