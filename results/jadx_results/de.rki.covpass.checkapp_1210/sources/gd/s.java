package gd;

import ae.e;
import gd.h0;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pd.l;
import xc.j1;
/* loaded from: classes.dex */
public final class s implements ae.e {
    public static final a Companion = new a(null);

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean b(xc.y yVar) {
            Object s02;
            if (yVar.o().size() != 1) {
                return false;
            }
            xc.m b10 = yVar.b();
            xc.e eVar = null;
            xc.e eVar2 = b10 instanceof xc.e ? (xc.e) b10 : null;
            if (eVar2 == null) {
                return false;
            }
            List<j1> o10 = yVar.o();
            hc.t.d(o10, "f.valueParameters");
            s02 = ub.c0.s0(o10);
            xc.h z10 = ((j1) s02).getType().W0().z();
            if (z10 instanceof xc.e) {
                eVar = (xc.e) z10;
            }
            if (eVar == null) {
                return false;
            }
            return uc.h.q0(eVar2) && hc.t.a(ee.a.h(eVar2), ee.a.h(eVar));
        }

        private final pd.l c(xc.y yVar, j1 j1Var) {
            oe.e0 e0Var;
            if (pd.v.e(yVar) || b(yVar)) {
                oe.e0 type = j1Var.getType();
                hc.t.d(type, "valueParameterDescriptor.type");
                e0Var = te.a.t(type);
            } else {
                e0Var = j1Var.getType();
                hc.t.d(e0Var, "valueParameterDescriptor.type");
            }
            return pd.v.g(e0Var);
        }

        public final boolean a(xc.a aVar, xc.a aVar2) {
            List<tb.r> M0;
            hc.t.e(aVar, "superDescriptor");
            hc.t.e(aVar2, "subDescriptor");
            if ((aVar2 instanceof id.e) && (aVar instanceof xc.y)) {
                id.e eVar = (id.e) aVar2;
                eVar.o().size();
                xc.y yVar = (xc.y) aVar;
                yVar.o().size();
                List<j1> o10 = eVar.z0().o();
                hc.t.d(o10, "subDescriptor.original.valueParameters");
                List<j1> o11 = yVar.a().o();
                hc.t.d(o11, "superDescriptor.original.valueParameters");
                M0 = ub.c0.M0(o10, o11);
                for (tb.r rVar : M0) {
                    j1 j1Var = (j1) rVar.b();
                    j1 j1Var2 = (j1) rVar.c();
                    hc.t.d(j1Var, "subParameter");
                    boolean z10 = c((xc.y) aVar2, j1Var) instanceof l.d;
                    hc.t.d(j1Var2, "superParameter");
                    if (z10 != (c(yVar, j1Var2) instanceof l.d)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    private final boolean c(xc.a aVar, xc.a aVar2, xc.e eVar) {
        if ((aVar instanceof xc.b) && (aVar2 instanceof xc.y) && !uc.h.f0(aVar2)) {
            f fVar = f.f10690m;
            xc.y yVar = (xc.y) aVar2;
            wd.f name = yVar.getName();
            hc.t.d(name, "subDescriptor.name");
            if (!fVar.l(name)) {
                h0.a aVar3 = h0.Companion;
                wd.f name2 = yVar.getName();
                hc.t.d(name2, "subDescriptor.name");
                if (!aVar3.k(name2)) {
                    return false;
                }
            }
            xc.b e10 = g0.e((xc.b) aVar);
            boolean z10 = aVar instanceof xc.y;
            xc.y yVar2 = z10 ? (xc.y) aVar : null;
            if ((!(yVar2 != null && yVar.r0() == yVar2.r0())) && (e10 == null || !yVar.r0())) {
                return true;
            }
            if ((eVar instanceof id.c) && yVar.G() == null && e10 != null && !g0.f(eVar, e10)) {
                if ((e10 instanceof xc.y) && z10 && f.k((xc.y) e10) != null) {
                    String c10 = pd.v.c(yVar, false, false, 2, null);
                    xc.y a10 = ((xc.y) aVar).a();
                    hc.t.d(a10, "superDescriptor.original");
                    if (hc.t.a(c10, pd.v.c(a10, false, false, 2, null))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // ae.e
    public e.b a(xc.a aVar, xc.a aVar2, xc.e eVar) {
        hc.t.e(aVar, "superDescriptor");
        hc.t.e(aVar2, "subDescriptor");
        if (!c(aVar, aVar2, eVar) && !Companion.a(aVar, aVar2)) {
            return e.b.UNKNOWN;
        }
        return e.b.INCOMPATIBLE;
    }

    @Override // ae.e
    public e.a b() {
        return e.a.CONFLICTS_ONLY;
    }
}
