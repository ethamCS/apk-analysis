package oe;

import java.util.ArrayDeque;
import java.util.Set;
import oe.d1;
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a */
    public static final c f17919a = new c();

    private c() {
    }

    private final boolean c(d1 d1Var, se.k kVar, se.n nVar) {
        se.p j10 = d1Var.j();
        if (j10.a0(kVar)) {
            return true;
        }
        if (j10.l(kVar)) {
            return false;
        }
        if (d1Var.n() && j10.Y(kVar)) {
            return true;
        }
        return j10.F(j10.c(kVar), nVar);
    }

    private final boolean e(d1 d1Var, se.k kVar, se.k kVar2) {
        se.p j10 = d1Var.j();
        if (f.f17954b) {
            if (!j10.a(kVar) && !j10.k(j10.c(kVar))) {
                d1Var.l(kVar);
            }
            if (!j10.a(kVar2)) {
                d1Var.l(kVar2);
            }
        }
        if (!j10.l(kVar2) && !j10.Q(kVar) && !j10.k0(kVar)) {
            if ((kVar instanceof se.d) && j10.n0((se.d) kVar)) {
                return true;
            }
            c cVar = f17919a;
            if (cVar.a(d1Var, kVar, d1.c.b.f17946a)) {
                return true;
            }
            if (j10.Q(kVar2) || cVar.a(d1Var, kVar2, d1.c.d.f17948a) || j10.h0(kVar)) {
                return false;
            }
            return cVar.b(d1Var, kVar, j10.c(kVar2));
        }
        return true;
    }

    public final boolean a(d1 d1Var, se.k kVar, d1.c cVar) {
        String e02;
        hc.t.e(d1Var, "<this>");
        hc.t.e(kVar, "type");
        hc.t.e(cVar, "supertypesPolicy");
        se.p j10 = d1Var.j();
        if (!((j10.h0(kVar) && !j10.l(kVar)) || j10.Q(kVar))) {
            d1Var.k();
            ArrayDeque<se.k> h10 = d1Var.h();
            hc.t.b(h10);
            Set<se.k> i10 = d1Var.i();
            hc.t.b(i10);
            h10.push(kVar);
            while (!h10.isEmpty()) {
                if (i10.size() > 1000) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Too many supertypes for type: ");
                    sb2.append(kVar);
                    sb2.append(". Supertypes = ");
                    e02 = ub.c0.e0(i10, null, null, null, 0, null, null, 63, null);
                    sb2.append(e02);
                    throw new IllegalStateException(sb2.toString().toString());
                }
                se.k pop = h10.pop();
                hc.t.d(pop, "current");
                if (i10.add(pop)) {
                    d1.c cVar2 = j10.l(pop) ? d1.c.C0280c.f17947a : cVar;
                    if (!(!hc.t.a(cVar2, d1.c.C0280c.f17947a))) {
                        cVar2 = null;
                    }
                    if (cVar2 == null) {
                        continue;
                    } else {
                        se.p j11 = d1Var.j();
                        for (se.i iVar : j11.m0(j11.c(pop))) {
                            se.k a10 = cVar2.a(d1Var, iVar);
                            if ((j10.h0(a10) && !j10.l(a10)) || j10.Q(a10)) {
                                d1Var.e();
                            } else {
                                h10.add(a10);
                            }
                        }
                        continue;
                    }
                }
            }
            d1Var.e();
            return false;
        }
        return true;
    }

    public final boolean b(d1 d1Var, se.k kVar, se.n nVar) {
        String e02;
        hc.t.e(d1Var, "state");
        hc.t.e(kVar, "start");
        hc.t.e(nVar, "end");
        se.p j10 = d1Var.j();
        if (f17919a.c(d1Var, kVar, nVar)) {
            return true;
        }
        d1Var.k();
        ArrayDeque<se.k> h10 = d1Var.h();
        hc.t.b(h10);
        Set<se.k> i10 = d1Var.i();
        hc.t.b(i10);
        h10.push(kVar);
        while (!h10.isEmpty()) {
            if (i10.size() > 1000) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Too many supertypes for type: ");
                sb2.append(kVar);
                sb2.append(". Supertypes = ");
                e02 = ub.c0.e0(i10, null, null, null, 0, null, null, 63, null);
                sb2.append(e02);
                throw new IllegalStateException(sb2.toString().toString());
            }
            se.k pop = h10.pop();
            hc.t.d(pop, "current");
            if (i10.add(pop)) {
                d1.c cVar = j10.l(pop) ? d1.c.C0280c.f17947a : d1.c.b.f17946a;
                if (!(!hc.t.a(cVar, d1.c.C0280c.f17947a))) {
                    cVar = null;
                }
                if (cVar == null) {
                    continue;
                } else {
                    se.p j11 = d1Var.j();
                    for (se.i iVar : j11.m0(j11.c(pop))) {
                        se.k a10 = cVar.a(d1Var, iVar);
                        if (f17919a.c(d1Var, a10, nVar)) {
                            d1Var.e();
                            return true;
                        }
                        h10.add(a10);
                    }
                    continue;
                }
            }
        }
        d1Var.e();
        return false;
    }

    public final boolean d(d1 d1Var, se.k kVar, se.k kVar2) {
        hc.t.e(d1Var, "state");
        hc.t.e(kVar, "subType");
        hc.t.e(kVar2, "superType");
        return e(d1Var, kVar, kVar2);
    }
}
