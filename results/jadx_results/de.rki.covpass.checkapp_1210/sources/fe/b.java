package fe;

import hc.t;
import java.util.Collection;
import java.util.List;
import oe.e0;
import uc.k;
import xc.f1;
import xc.h;
import xc.j1;
import xc.m;
/* loaded from: classes3.dex */
public final class b {
    private static final boolean a(xc.e eVar) {
        return t.a(ee.a.h(eVar), k.f23454n);
    }

    public static final boolean b(e0 e0Var) {
        t.e(e0Var, "<this>");
        h z10 = e0Var.W0().z();
        return z10 != null && c(z10);
    }

    public static final boolean c(m mVar) {
        t.e(mVar, "<this>");
        return ae.f.b(mVar) && !a((xc.e) mVar);
    }

    private static final boolean d(e0 e0Var) {
        h z10 = e0Var.W0().z();
        f1 f1Var = z10 instanceof f1 ? (f1) z10 : null;
        if (f1Var == null) {
            return false;
        }
        return e(te.a.i(f1Var));
    }

    private static final boolean e(e0 e0Var) {
        return b(e0Var) || d(e0Var);
    }

    public static final boolean f(xc.b bVar) {
        t.e(bVar, "descriptor");
        xc.d dVar = bVar instanceof xc.d ? (xc.d) bVar : null;
        if (dVar != null && !xc.t.g(dVar.g())) {
            xc.e T = dVar.T();
            t.d(T, "constructorDescriptor.constructedClass");
            if (ae.f.b(T) || ae.d.G(dVar.T())) {
                return false;
            }
            List<j1> o10 = dVar.o();
            t.d(o10, "constructorDescriptor.valueParameters");
            if ((o10 instanceof Collection) && o10.isEmpty()) {
                return false;
            }
            for (j1 j1Var : o10) {
                e0 type = j1Var.getType();
                t.d(type, "it.type");
                if (e(type)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
