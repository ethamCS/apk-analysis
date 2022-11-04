package uc;

import ad.k0;
import ad.y;
import java.util.ArrayList;
import java.util.List;
import oe.e1;
import oe.f0;
import oe.g1;
import oe.m0;
import oe.r1;
import ub.c0;
import ub.v;
import xc.a1;
import xc.e0;
import xc.f1;
import xc.t;
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a */
    private static final y f23517a;

    static {
        List<f1> d10;
        ad.m mVar = new ad.m(qe.k.f19894a.i(), k.f23450j);
        xc.f fVar = xc.f.INTERFACE;
        wd.f g10 = k.f23453m.g();
        a1 a1Var = a1.f25519a;
        ne.n nVar = ne.f.f16977e;
        y yVar = new y(mVar, fVar, false, false, g10, a1Var, nVar);
        yVar.V0(e0.ABSTRACT);
        yVar.X0(t.f25581e);
        d10 = ub.t.d(k0.a1(yVar, yc.g.Companion.b(), false, r1.IN_VARIANCE, wd.f.j("T"), 0, nVar));
        yVar.W0(d10);
        yVar.T0();
        f23517a = yVar;
    }

    public static final m0 a(oe.e0 e0Var) {
        int s10;
        List d10;
        List p02;
        m0 b10;
        hc.t.e(e0Var, "suspendFunType");
        g.q(e0Var);
        h h10 = te.a.h(e0Var);
        yc.g j10 = e0Var.j();
        oe.e0 j11 = g.j(e0Var);
        List<oe.e0> e10 = g.e(e0Var);
        List<g1> l10 = g.l(e0Var);
        s10 = v.s(l10, 10);
        ArrayList arrayList = new ArrayList(s10);
        for (g1 g1Var : l10) {
            arrayList.add(g1Var.getType());
        }
        oe.a1 h11 = oe.a1.Companion.h();
        e1 r10 = f23517a.r();
        hc.t.d(r10, "FAKE_CONTINUATION_CLASS_DESCRIPTOR.typeConstructor");
        d10 = ub.t.d(te.a.a(g.k(e0Var)));
        p02 = c0.p0(arrayList, f0.i(h11, r10, d10, false, null, 16, null));
        m0 I = te.a.h(e0Var).I();
        hc.t.d(I, "suspendFunType.builtIns.nullableAnyType");
        b10 = g.b(h10, j10, j11, e10, p02, null, I, (r17 & 128) != 0 ? false : false);
        return b10.d1(e0Var.X0());
    }
}
