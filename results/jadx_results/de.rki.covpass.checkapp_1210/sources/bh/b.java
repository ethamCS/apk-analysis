package bh;

import gg.a0;
import gg.a2;
import gg.d0;
import gg.g;
import gg.h;
import gg.j0;
import gg.q;
import gg.t;
import gg.t1;
import gg.w;
import gg.x1;
import java.math.BigInteger;
import java.util.Enumeration;
/* loaded from: classes3.dex */
public class b extends t {

    /* renamed from: c */
    private d0 f6033c;

    public b(d0 d0Var) {
        this.f6033c = d0Var;
    }

    public b(BigInteger bigInteger, gg.c cVar, g gVar) {
        byte[] c10 = ak.b.c(bigInteger);
        h hVar = new h(4);
        hVar.a(new q(1L));
        hVar.a(new t1(c10));
        if (gVar != null) {
            hVar.a(new a2(true, 0, gVar));
        }
        if (cVar != null) {
            hVar.a(new a2(true, 1, cVar));
            hVar.a(new a2(true, 1, cVar));
        }
        this.f6033c = new x1(hVar);
    }

    public b(BigInteger bigInteger, g gVar) {
        this(bigInteger, null, gVar);
    }

    private a0 m(int i10) {
        Enumeration H = this.f6033c.H();
        while (H.hasMoreElements()) {
            g gVar = (g) H.nextElement();
            if (gVar instanceof j0) {
                j0 j0Var = (j0) gVar;
                if (j0Var.Q() == i10) {
                    return j0Var.O().b();
                }
            }
        }
        return null;
    }

    @Override // gg.t, gg.g
    public a0 b() {
        return this.f6033c;
    }

    public BigInteger l() {
        return new BigInteger(1, ((w) this.f6033c.G(1)).F());
    }

    public gg.c n() {
        return (gg.c) m(1);
    }
}
