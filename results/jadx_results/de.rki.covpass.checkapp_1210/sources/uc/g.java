package uc;

import ce.v;
import hc.t;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import oe.b1;
import oe.e0;
import oe.f0;
import oe.g1;
import oe.m0;
import tb.x;
import ub.c0;
import ub.p0;
import ub.q0;
import ub.u;
import uc.k;
import vc.c;
import yc.g;
/* loaded from: classes.dex */
public final class g {
    public static final int a(e0 e0Var) {
        Object i10;
        t.e(e0Var, "<this>");
        yc.c h10 = e0Var.j().h(k.a.D);
        if (h10 == null) {
            return 0;
        }
        i10 = q0.i(h10.b(), k.f23449i);
        ce.g gVar = (ce.g) i10;
        t.c(gVar, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.constants.IntValue");
        return ((ce.m) gVar).b().intValue();
    }

    public static final m0 b(h hVar, yc.g gVar, e0 e0Var, List<? extends e0> list, List<? extends e0> list2, List<wd.f> list3, e0 e0Var2, boolean z10) {
        t.e(hVar, "builtIns");
        t.e(gVar, "annotations");
        t.e(list, "contextReceiverTypes");
        t.e(list2, "parameterTypes");
        t.e(e0Var2, "returnType");
        List<g1> g10 = g(e0Var, list, list2, list3, e0Var2, hVar);
        xc.e f10 = f(hVar, list2.size() + list.size() + (e0Var == null ? 0 : 1), z10);
        if (e0Var != null) {
            gVar = t(gVar, hVar);
        }
        if (!list.isEmpty()) {
            gVar = s(gVar, hVar, list.size());
        }
        return f0.g(b1.b(gVar), f10, g10);
    }

    public static final wd.f d(e0 e0Var) {
        Object t02;
        String str;
        t.e(e0Var, "<this>");
        yc.c h10 = e0Var.j().h(k.a.E);
        if (h10 == null) {
            return null;
        }
        t02 = c0.t0(h10.b().values());
        v vVar = t02 instanceof v ? (v) t02 : null;
        if (vVar != null && (str = (String) vVar.b()) != null) {
            if (!wd.f.m(str)) {
                str = null;
            }
            if (str != null) {
                return wd.f.j(str);
            }
        }
        return null;
    }

    public static final List<e0> e(e0 e0Var) {
        int s10;
        List<e0> h10;
        t.e(e0Var, "<this>");
        o(e0Var);
        int a10 = a(e0Var);
        if (a10 == 0) {
            h10 = u.h();
            return h10;
        }
        List<g1> subList = e0Var.U0().subList(0, a10);
        s10 = ub.v.s(subList, 10);
        ArrayList arrayList = new ArrayList(s10);
        for (g1 g1Var : subList) {
            e0 type = g1Var.getType();
            t.d(type, "it.type");
            arrayList.add(type);
        }
        return arrayList;
    }

    public static final xc.e f(h hVar, int i10, boolean z10) {
        t.e(hVar, "builtIns");
        xc.e X = z10 ? hVar.X(i10) : hVar.C(i10);
        t.d(X, "if (isSuspendFunction) b…tFunction(parameterCount)");
        return X;
    }

    public static final List<g1> g(e0 e0Var, List<? extends e0> list, List<? extends e0> list2, List<wd.f> list3, e0 e0Var2, h hVar) {
        int s10;
        wd.f fVar;
        Map e10;
        List<? extends yc.c> n02;
        t.e(list, "contextReceiverTypes");
        t.e(list2, "parameterTypes");
        t.e(e0Var2, "returnType");
        t.e(hVar, "builtIns");
        int i10 = 0;
        ArrayList arrayList = new ArrayList(list2.size() + list.size() + (e0Var != null ? 1 : 0) + 1);
        s10 = ub.v.s(list, 10);
        ArrayList arrayList2 = new ArrayList(s10);
        for (e0 e0Var3 : list) {
            arrayList2.add(te.a.a(e0Var3));
        }
        arrayList.addAll(arrayList2);
        ye.a.a(arrayList, e0Var != null ? te.a.a(e0Var) : null);
        for (Object obj : list2) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                u.r();
            }
            e0 e0Var4 = (e0) obj;
            if (list3 == null || (fVar = list3.get(i10)) == null || fVar.l()) {
                fVar = null;
            }
            if (fVar != null) {
                wd.c cVar = k.a.E;
                wd.f j10 = wd.f.j("name");
                String b10 = fVar.b();
                t.d(b10, "name.asString()");
                e10 = p0.e(x.a(j10, new v(b10)));
                yc.j jVar = new yc.j(hVar, cVar, e10);
                g.a aVar = yc.g.Companion;
                n02 = c0.n0(e0Var4.j(), jVar);
                e0Var4 = te.a.u(e0Var4, aVar.a(n02));
            }
            arrayList.add(te.a.a(e0Var4));
            i10 = i11;
        }
        arrayList.add(te.a.a(e0Var2));
        return arrayList;
    }

    private static final vc.c h(wd.d dVar) {
        if (!dVar.f() || dVar.e()) {
            return null;
        }
        c.a aVar = vc.c.Companion;
        String b10 = dVar.i().b();
        t.d(b10, "shortName().asString()");
        wd.c e10 = dVar.l().e();
        t.d(e10, "toSafe().parent()");
        return aVar.b(b10, e10);
    }

    public static final vc.c i(xc.m mVar) {
        t.e(mVar, "<this>");
        if ((mVar instanceof xc.e) && h.A0(mVar)) {
            return h(ee.a.i(mVar));
        }
        return null;
    }

    public static final e0 j(e0 e0Var) {
        t.e(e0Var, "<this>");
        o(e0Var);
        if (!r(e0Var)) {
            return null;
        }
        return e0Var.U0().get(a(e0Var)).getType();
    }

    public static final e0 k(e0 e0Var) {
        Object g02;
        t.e(e0Var, "<this>");
        o(e0Var);
        g02 = c0.g0(e0Var.U0());
        e0 type = ((g1) g02).getType();
        t.d(type, "arguments.last().type");
        return type;
    }

    public static final List<g1> l(e0 e0Var) {
        t.e(e0Var, "<this>");
        o(e0Var);
        List<g1> U0 = e0Var.U0();
        return U0.subList(a(e0Var) + (m(e0Var) ? 1 : 0), U0.size() - 1);
    }

    public static final boolean m(e0 e0Var) {
        t.e(e0Var, "<this>");
        return o(e0Var) && r(e0Var);
    }

    public static final boolean n(xc.m mVar) {
        t.e(mVar, "<this>");
        vc.c i10 = i(mVar);
        return i10 == vc.c.Function || i10 == vc.c.SuspendFunction;
    }

    public static final boolean o(e0 e0Var) {
        t.e(e0Var, "<this>");
        xc.h z10 = e0Var.W0().z();
        return z10 != null && n(z10);
    }

    public static final boolean p(e0 e0Var) {
        t.e(e0Var, "<this>");
        xc.h z10 = e0Var.W0().z();
        return (z10 != null ? i(z10) : null) == vc.c.Function;
    }

    public static final boolean q(e0 e0Var) {
        t.e(e0Var, "<this>");
        xc.h z10 = e0Var.W0().z();
        return (z10 != null ? i(z10) : null) == vc.c.SuspendFunction;
    }

    private static final boolean r(e0 e0Var) {
        return e0Var.j().h(k.a.C) != null;
    }

    public static final yc.g s(yc.g gVar, h hVar, int i10) {
        Map e10;
        List<? extends yc.c> n02;
        t.e(gVar, "<this>");
        t.e(hVar, "builtIns");
        wd.c cVar = k.a.D;
        if (gVar.B(cVar)) {
            return gVar;
        }
        g.a aVar = yc.g.Companion;
        e10 = p0.e(x.a(k.f23449i, new ce.m(i10)));
        n02 = c0.n0(gVar, new yc.j(hVar, cVar, e10));
        return aVar.a(n02);
    }

    public static final yc.g t(yc.g gVar, h hVar) {
        Map h10;
        List<? extends yc.c> n02;
        t.e(gVar, "<this>");
        t.e(hVar, "builtIns");
        wd.c cVar = k.a.C;
        if (gVar.B(cVar)) {
            return gVar;
        }
        g.a aVar = yc.g.Companion;
        h10 = q0.h();
        n02 = c0.n0(gVar, new yc.j(hVar, cVar, h10));
        return aVar.a(n02);
    }
}
