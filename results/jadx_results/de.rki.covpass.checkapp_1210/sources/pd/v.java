package pd;

import gd.g0;
import java.util.List;
import oe.e0;
import pd.l;
import ub.c0;
import uc.k;
import xc.j1;
import xc.x0;
import xc.z0;
/* loaded from: classes.dex */
public final class v {
    private static final void a(StringBuilder sb2, e0 e0Var) {
        sb2.append(g(e0Var));
    }

    public static final String b(xc.y yVar, boolean z10, boolean z11) {
        String str;
        hc.t.e(yVar, "<this>");
        StringBuilder sb2 = new StringBuilder();
        if (z11) {
            if (yVar instanceof xc.l) {
                str = "<init>";
            } else {
                str = yVar.getName().b();
                hc.t.d(str, "name.asString()");
            }
            sb2.append(str);
        }
        sb2.append("(");
        x0 U = yVar.U();
        if (U != null) {
            e0 type = U.getType();
            hc.t.d(type, "it.type");
            a(sb2, type);
        }
        for (j1 j1Var : yVar.o()) {
            e0 type2 = j1Var.getType();
            hc.t.d(type2, "parameter.type");
            a(sb2, type2);
        }
        sb2.append(")");
        if (z10) {
            if (d.c(yVar)) {
                sb2.append("V");
            } else {
                e0 e10 = yVar.e();
                hc.t.b(e10);
                a(sb2, e10);
            }
        }
        String sb3 = sb2.toString();
        hc.t.d(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public static /* synthetic */ String c(xc.y yVar, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        return b(yVar, z10, z11);
    }

    public static final String d(xc.a aVar) {
        hc.t.e(aVar, "<this>");
        x xVar = x.f19141a;
        if (ae.d.E(aVar)) {
            return null;
        }
        xc.m b10 = aVar.b();
        xc.e eVar = b10 instanceof xc.e ? (xc.e) b10 : null;
        if (eVar == null || eVar.getName().l()) {
            return null;
        }
        xc.a a10 = aVar.a();
        z0 z0Var = a10 instanceof z0 ? (z0) a10 : null;
        if (z0Var != null) {
            return u.a(xVar, eVar, c(z0Var, false, false, 3, null));
        }
        return null;
    }

    public static final boolean e(xc.a aVar) {
        Object s02;
        xc.y k10;
        Object s03;
        hc.t.e(aVar, "f");
        if (!(aVar instanceof xc.y)) {
            return false;
        }
        xc.y yVar = (xc.y) aVar;
        if (!hc.t.a(yVar.getName().b(), "remove") || yVar.o().size() != 1 || g0.h((xc.b) aVar)) {
            return false;
        }
        List<j1> o10 = yVar.a().o();
        hc.t.d(o10, "f.original.valueParameters");
        s02 = c0.s0(o10);
        e0 type = ((j1) s02).getType();
        hc.t.d(type, "f.original.valueParameters.single().type");
        l g10 = g(type);
        fe.e eVar = null;
        l.d dVar = g10 instanceof l.d ? (l.d) g10 : null;
        if (dVar != null) {
            eVar = dVar.i();
        }
        if (eVar != fe.e.INT || (k10 = gd.f.k(yVar)) == null) {
            return false;
        }
        List<j1> o11 = k10.a().o();
        hc.t.d(o11, "overridden.original.valueParameters");
        s03 = c0.s0(o11);
        e0 type2 = ((j1) s03).getType();
        hc.t.d(type2, "overridden.original.valueParameters.single().type");
        l g11 = g(type2);
        xc.m b10 = k10.b();
        hc.t.d(b10, "overridden.containingDeclaration");
        return hc.t.a(ee.a.i(b10), k.a.f23470c0.j()) && (g11 instanceof l.c) && hc.t.a(((l.c) g11).i(), "java/lang/Object");
    }

    public static final String f(xc.e eVar) {
        hc.t.e(eVar, "<this>");
        wc.c cVar = wc.c.f24707a;
        wd.d j10 = ee.a.h(eVar).j();
        hc.t.d(j10, "fqNameSafe.toUnsafe()");
        wd.b n10 = cVar.n(j10);
        if (n10 != null) {
            String f10 = fe.d.b(n10).f();
            hc.t.d(f10, "byClassId(it).internalName");
            return f10;
        }
        return d.b(eVar, null, 2, null);
    }

    public static final l g(e0 e0Var) {
        hc.t.e(e0Var, "<this>");
        return (l) d.e(e0Var, n.f19129a, a0.f19050n, z.f19143a, null, null, 32, null);
    }
}
