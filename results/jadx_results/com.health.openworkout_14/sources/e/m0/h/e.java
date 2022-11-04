package e.m0.h;

import e.a0;
import e.d0;
import e.k0;
import e.m0.h.j;
import e.v;
import java.io.IOException;
import java.net.Socket;
import java.util.List;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a */
    private final k f4106a;

    /* renamed from: b */
    private final e.e f4107b;

    /* renamed from: c */
    private final g f4108c;

    /* renamed from: d */
    private final e.j f4109d;

    /* renamed from: e */
    private final v f4110e;

    /* renamed from: f */
    private j.a f4111f;

    /* renamed from: g */
    private final j f4112g;

    /* renamed from: h */
    private f f4113h;
    private boolean i;
    private k0 j;

    public e(k kVar, g gVar, e.e eVar, e.j jVar, v vVar) {
        this.f4106a = kVar;
        this.f4108c = gVar;
        this.f4107b = eVar;
        this.f4109d = jVar;
        this.f4110e = vVar;
        this.f4112g = new j(eVar, gVar.f4126e, jVar, vVar);
    }

    private f c(int i, int i2, int i3, int i4, boolean z) {
        f fVar;
        Socket socket;
        Socket n;
        f fVar2;
        boolean z2;
        k0 k0Var;
        boolean z3;
        List<k0> list;
        j.a aVar;
        synchronized (this.f4108c) {
            if (this.f4106a.i()) {
                throw new IOException("Canceled");
            }
            this.i = false;
            k kVar = this.f4106a;
            fVar = kVar.i;
            socket = null;
            n = (fVar == null || !fVar.k) ? null : kVar.n();
            k kVar2 = this.f4106a;
            fVar2 = kVar2.i;
            if (fVar2 != null) {
                fVar = null;
            } else {
                fVar2 = null;
            }
            if (fVar2 == null) {
                if (this.f4108c.h(this.f4107b, kVar2, null, false)) {
                    fVar2 = this.f4106a.i;
                    k0Var = null;
                    z2 = true;
                } else {
                    k0Var = this.j;
                    if (k0Var != null) {
                        this.j = null;
                    } else if (g()) {
                        k0Var = this.f4106a.i.q();
                    }
                    z2 = false;
                }
            }
            k0Var = null;
            z2 = false;
        }
        e.m0.e.f(n);
        if (fVar != null) {
            this.f4110e.h(this.f4109d, fVar);
        }
        if (z2) {
            this.f4110e.g(this.f4109d, fVar2);
        }
        if (fVar2 != null) {
            return fVar2;
        }
        if (k0Var != null || ((aVar = this.f4111f) != null && aVar.b())) {
            z3 = false;
        } else {
            this.f4111f = this.f4112g.d();
            z3 = true;
        }
        synchronized (this.f4108c) {
            if (this.f4106a.i()) {
                throw new IOException("Canceled");
            }
            if (z3) {
                list = this.f4111f.a();
                if (this.f4108c.h(this.f4107b, this.f4106a, list, false)) {
                    fVar2 = this.f4106a.i;
                    z2 = true;
                }
            } else {
                list = null;
            }
            if (!z2) {
                if (k0Var == null) {
                    k0Var = this.f4111f.c();
                }
                fVar2 = new f(this.f4108c, k0Var);
                this.f4113h = fVar2;
            }
        }
        if (!z2) {
            fVar2.d(i, i2, i3, i4, z, this.f4109d, this.f4110e);
            this.f4108c.f4126e.a(fVar2.q());
            synchronized (this.f4108c) {
                this.f4113h = null;
                if (this.f4108c.h(this.f4107b, this.f4106a, list, true)) {
                    fVar2.k = true;
                    socket = fVar2.s();
                    fVar2 = this.f4106a.i;
                    this.j = k0Var;
                } else {
                    this.f4108c.g(fVar2);
                    this.f4106a.a(fVar2);
                }
            }
            e.m0.e.f(socket);
        }
        this.f4110e.g(this.f4109d, fVar2);
        return fVar2;
    }

    private f d(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        while (true) {
            f c2 = c(i, i2, i3, i4, z);
            synchronized (this.f4108c) {
                if (c2.m != 0 || c2.n()) {
                    if (c2.m(z2)) {
                        return c2;
                    }
                    c2.p();
                } else {
                    return c2;
                }
            }
        }
    }

    private boolean g() {
        f fVar = this.f4106a.i;
        return fVar != null && fVar.l == 0 && e.m0.e.C(fVar.q().a().l(), this.f4107b.l());
    }

    public f a() {
        return this.f4113h;
    }

    public e.m0.i.c b(d0 d0Var, a0.a aVar, boolean z) {
        try {
            return d(aVar.d(), aVar.e(), aVar.b(), d0Var.v(), d0Var.B(), z).o(d0Var, aVar);
        } catch (i e2) {
            h();
            throw e2;
        } catch (IOException e3) {
            h();
            throw new i(e3);
        }
    }

    public boolean e() {
        synchronized (this.f4108c) {
            boolean z = true;
            if (this.j != null) {
                return true;
            }
            if (g()) {
                this.j = this.f4106a.i.q();
                return true;
            }
            j.a aVar = this.f4111f;
            if ((aVar == null || !aVar.b()) && !this.f4112g.b()) {
                z = false;
            }
            return z;
        }
    }

    public boolean f() {
        boolean z;
        synchronized (this.f4108c) {
            z = this.i;
        }
        return z;
    }

    public void h() {
        synchronized (this.f4108c) {
            this.i = true;
        }
    }
}
