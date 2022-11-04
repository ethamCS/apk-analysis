package pd;

import java.util.Collection;
import java.util.List;
import oe.m1;
import wc.c;
/* loaded from: classes.dex */
public final class b0 {
    public static final <T> T a(m<T> mVar, T t10, boolean z10) {
        hc.t.e(mVar, "<this>");
        hc.t.e(t10, "possiblyPrimitiveType");
        return z10 ? mVar.d(t10) : t10;
    }

    public static final <T> T b(m1 m1Var, se.i iVar, m<T> mVar, a0 a0Var) {
        uc.i p10;
        hc.t.e(m1Var, "<this>");
        hc.t.e(iVar, "type");
        hc.t.e(mVar, "typeFactory");
        hc.t.e(a0Var, "mode");
        se.n D0 = m1Var.D0(iVar);
        if (!m1Var.A(D0)) {
            return null;
        }
        uc.i E = m1Var.E(D0);
        boolean z10 = true;
        if (E != null) {
            T f10 = mVar.f(E);
            if (!m1Var.V(iVar) && !od.s.c(m1Var, iVar)) {
                z10 = false;
            }
            return (T) a(mVar, f10, z10);
        }
        if (m1Var.p(D0) != null) {
            return mVar.a('[' + fe.e.h(p10).j());
        }
        if (m1Var.s0(D0)) {
            wd.d g02 = m1Var.g0(D0);
            wd.b n10 = g02 != null ? wc.c.f24707a.n(g02) : null;
            if (n10 != null) {
                if (!a0Var.a()) {
                    List<c.a> i10 = wc.c.f24707a.i();
                    if (!(i10 instanceof Collection) || !i10.isEmpty()) {
                        for (c.a aVar : i10) {
                            if (hc.t.a(aVar.d(), n10)) {
                                break;
                            }
                        }
                    }
                    z10 = false;
                    if (z10) {
                        return null;
                    }
                }
                String f11 = fe.d.b(n10).f();
                hc.t.d(f11, "byClassId(classId).internalName");
                return mVar.b(f11);
            }
        }
        return null;
    }
}
