package e.m0.i;

import e.a0;
import e.g0;
import e.i0;
import e.j0;
import f.l;
import java.net.ProtocolException;
/* loaded from: classes.dex */
public final class b implements a0 {

    /* renamed from: a */
    private final boolean f4151a;

    public b(boolean z) {
        this.f4151a = z;
    }

    @Override // e.a0
    public i0 a(a0.a aVar) {
        boolean z;
        i0.a aVar2;
        j0 j0Var;
        g gVar = (g) aVar;
        e.m0.h.d f2 = gVar.f();
        g0 a2 = gVar.a();
        long currentTimeMillis = System.currentTimeMillis();
        f2.p(a2);
        i0.a aVar3 = null;
        if (!f.b(a2.f()) || a2.a() == null) {
            f2.j();
            z = false;
        } else {
            if ("100-continue".equalsIgnoreCase(a2.c("Expect"))) {
                f2.g();
                f2.n();
                aVar3 = f2.l(true);
                z = true;
            } else {
                z = false;
            }
            if (aVar3 != null) {
                f2.j();
                if (!f2.c().n()) {
                    f2.i();
                }
            } else if (a2.a().f()) {
                f2.g();
                a2.a().h(l.a(f2.d(a2, true)));
            } else {
                f.d a3 = l.a(f2.d(a2, false));
                a2.a().h(a3);
                a3.close();
            }
        }
        if (a2.a() == null || !a2.a().f()) {
            f2.f();
        }
        if (!z) {
            f2.n();
        }
        if (aVar3 == null) {
            aVar3 = f2.l(false);
        }
        aVar3.q(a2);
        aVar3.h(f2.c().k());
        aVar3.r(currentTimeMillis);
        aVar3.p(System.currentTimeMillis());
        i0 c2 = aVar3.c();
        int k = c2.k();
        if (k == 100) {
            i0.a l = f2.l(false);
            l.q(a2);
            l.h(f2.c().k());
            l.r(currentTimeMillis);
            l.p(System.currentTimeMillis());
            c2 = l.c();
            k = c2.k();
        }
        f2.m(c2);
        if (!this.f4151a || k != 101) {
            aVar2 = c2.j0();
            j0Var = f2.k(c2);
        } else {
            aVar2 = c2.j0();
            j0Var = e.m0.e.f4065d;
        }
        aVar2.b(j0Var);
        i0 c3 = aVar2.c();
        if ("close".equalsIgnoreCase(c3.m0().c("Connection")) || "close".equalsIgnoreCase(c3.N("Connection"))) {
            f2.i();
        }
        if ((k == 204 || k == 205) && c3.a().I() > 0) {
            throw new ProtocolException("HTTP " + k + " had non-zero Content-Length: " + c3.a().I());
        }
        return c3;
    }
}
