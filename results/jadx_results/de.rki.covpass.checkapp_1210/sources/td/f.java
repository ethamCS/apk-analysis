package td;

import hc.t;
import java.util.ArrayList;
import java.util.List;
import rd.n;
import rd.q;
import rd.r;
import rd.s;
import rd.u;
import ub.v;
/* loaded from: classes.dex */
public final class f {
    public static final q a(q qVar, g gVar) {
        t.e(qVar, "<this>");
        t.e(gVar, "typeTable");
        if (qVar.L0()) {
            return qVar.t0();
        }
        if (!qVar.M0()) {
            return null;
        }
        return gVar.a(qVar.u0());
    }

    public static final q b(r rVar, g gVar) {
        t.e(rVar, "<this>");
        t.e(gVar, "typeTable");
        if (rVar.F0()) {
            q v02 = rVar.v0();
            t.d(v02, "expandedType");
            return v02;
        } else if (!rVar.G0()) {
            throw new IllegalStateException("No expandedType in ProtoBuf.TypeAlias".toString());
        } else {
            return gVar.a(rVar.w0());
        }
    }

    public static final q c(q qVar, g gVar) {
        t.e(qVar, "<this>");
        t.e(gVar, "typeTable");
        if (qVar.Q0()) {
            return qVar.D0();
        }
        if (!qVar.R0()) {
            return null;
        }
        return gVar.a(qVar.E0());
    }

    public static final boolean d(rd.i iVar) {
        t.e(iVar, "<this>");
        return iVar.X0() || iVar.Y0();
    }

    public static final boolean e(n nVar) {
        t.e(nVar, "<this>");
        return nVar.U0() || nVar.V0();
    }

    public static final q f(rd.c cVar, g gVar) {
        t.e(cVar, "<this>");
        t.e(gVar, "typeTable");
        if (cVar.Q1()) {
            return cVar.l1();
        }
        if (!cVar.R1()) {
            return null;
        }
        return gVar.a(cVar.m1());
    }

    public static final q g(q qVar, g gVar) {
        t.e(qVar, "<this>");
        t.e(gVar, "typeTable");
        if (qVar.T0()) {
            return qVar.G0();
        }
        if (!qVar.U0()) {
            return null;
        }
        return gVar.a(qVar.H0());
    }

    public static final q h(rd.i iVar, g gVar) {
        t.e(iVar, "<this>");
        t.e(gVar, "typeTable");
        if (iVar.X0()) {
            return iVar.H0();
        }
        if (!iVar.Y0()) {
            return null;
        }
        return gVar.a(iVar.I0());
    }

    public static final q i(n nVar, g gVar) {
        t.e(nVar, "<this>");
        t.e(gVar, "typeTable");
        if (nVar.U0()) {
            return nVar.G0();
        }
        if (!nVar.V0()) {
            return null;
        }
        return gVar.a(nVar.H0());
    }

    public static final q j(rd.i iVar, g gVar) {
        t.e(iVar, "<this>");
        t.e(gVar, "typeTable");
        if (iVar.Z0()) {
            q J0 = iVar.J0();
            t.d(J0, "returnType");
            return J0;
        } else if (!iVar.a1()) {
            throw new IllegalStateException("No returnType in ProtoBuf.Function".toString());
        } else {
            return gVar.a(iVar.K0());
        }
    }

    public static final q k(n nVar, g gVar) {
        t.e(nVar, "<this>");
        t.e(gVar, "typeTable");
        if (nVar.W0()) {
            q I0 = nVar.I0();
            t.d(I0, "returnType");
            return I0;
        } else if (!nVar.X0()) {
            throw new IllegalStateException("No returnType in ProtoBuf.Property".toString());
        } else {
            return gVar.a(nVar.J0());
        }
    }

    public static final List<q> l(rd.c cVar, g gVar) {
        int s10;
        t.e(cVar, "<this>");
        t.e(gVar, "typeTable");
        List<q> C1 = cVar.C1();
        if (!(!C1.isEmpty())) {
            C1 = null;
        }
        if (C1 == null) {
            List<Integer> B1 = cVar.B1();
            t.d(B1, "supertypeIdList");
            s10 = v.s(B1, 10);
            C1 = new ArrayList<>(s10);
            for (Integer num : B1) {
                t.d(num, "it");
                C1.add(gVar.a(num.intValue()));
            }
        }
        return C1;
    }

    public static final q m(q.b bVar, g gVar) {
        t.e(bVar, "<this>");
        t.e(gVar, "typeTable");
        if (bVar.d0()) {
            return bVar.W();
        }
        if (!bVar.e0()) {
            return null;
        }
        return gVar.a(bVar.b0());
    }

    public static final q n(u uVar, g gVar) {
        t.e(uVar, "<this>");
        t.e(gVar, "typeTable");
        if (uVar.u0()) {
            q o02 = uVar.o0();
            t.d(o02, "type");
            return o02;
        } else if (!uVar.v0()) {
            throw new IllegalStateException("No type in ProtoBuf.ValueParameter".toString());
        } else {
            return gVar.a(uVar.p0());
        }
    }

    public static final q o(r rVar, g gVar) {
        t.e(rVar, "<this>");
        t.e(gVar, "typeTable");
        if (rVar.J0()) {
            q C0 = rVar.C0();
            t.d(C0, "underlyingType");
            return C0;
        } else if (!rVar.K0()) {
            throw new IllegalStateException("No underlyingType in ProtoBuf.TypeAlias".toString());
        } else {
            return gVar.a(rVar.D0());
        }
    }

    public static final List<q> p(s sVar, g gVar) {
        int s10;
        t.e(sVar, "<this>");
        t.e(gVar, "typeTable");
        List<q> u02 = sVar.u0();
        if (!(!u02.isEmpty())) {
            u02 = null;
        }
        if (u02 == null) {
            List<Integer> t02 = sVar.t0();
            t.d(t02, "upperBoundIdList");
            s10 = v.s(t02, 10);
            u02 = new ArrayList<>(s10);
            for (Integer num : t02) {
                t.d(num, "it");
                u02.add(gVar.a(num.intValue()));
            }
        }
        return u02;
    }

    public static final q q(u uVar, g gVar) {
        t.e(uVar, "<this>");
        t.e(gVar, "typeTable");
        if (uVar.w0()) {
            return uVar.q0();
        }
        if (!uVar.x0()) {
            return null;
        }
        return gVar.a(uVar.r0());
    }
}
