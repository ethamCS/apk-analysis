package pe;

import hc.k0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import oe.a1;
import oe.d0;
import oe.e0;
import oe.e1;
import oe.f0;
import oe.g1;
import oe.m0;
import oe.n1;
import oe.p1;
import oe.q1;
import oe.r1;
/* loaded from: classes3.dex */
public abstract class f extends oe.h {

    /* loaded from: classes3.dex */
    public static final class a extends f {

        /* renamed from: a */
        public static final a f19147a = new a();

        private a() {
        }
    }

    /* loaded from: classes3.dex */
    public /* synthetic */ class b extends hc.p implements gc.l<se.i, q1> {
        b(Object obj) {
            super(1, obj);
        }

        @Override // hc.h
        public final oc.f e0() {
            return k0.b(f.class);
        }

        @Override // hc.h
        public final String g0() {
            return "prepareType(Lorg/jetbrains/kotlin/types/model/KotlinTypeMarker;)Lorg/jetbrains/kotlin/types/UnwrappedType;";
        }

        @Override // hc.h, oc.c
        public final String getName() {
            return "prepareType";
        }

        /* renamed from: i0 */
        public final q1 invoke(se.i iVar) {
            hc.t.e(iVar, "p0");
            return ((f) this.f11756d).a(iVar);
        }
    }

    private final m0 c(m0 m0Var) {
        int s10;
        int s11;
        List h10;
        int s12;
        e0 type;
        e1 W0 = m0Var.W0();
        boolean z10 = true;
        boolean z11 = false;
        d0 d0Var = null;
        r5 = null;
        q1 q1Var = null;
        e0 e0Var = null;
        if (W0 instanceof be.c) {
            be.c cVar = (be.c) W0;
            g1 b10 = cVar.b();
            if (b10.b() != r1.IN_VARIANCE) {
                z10 = false;
            }
            if (!z10) {
                b10 = null;
            }
            if (b10 != null && (type = b10.getType()) != null) {
                q1Var = type.Z0();
            }
            q1 q1Var2 = q1Var;
            if (cVar.e() == null) {
                g1 b11 = cVar.b();
                Collection<e0> l10 = cVar.l();
                s12 = ub.v.s(l10, 10);
                ArrayList arrayList = new ArrayList(s12);
                for (e0 e0Var2 : l10) {
                    arrayList.add(e0Var2.Z0());
                }
                cVar.g(new j(b11, arrayList, null, 4, null));
            }
            se.b bVar = se.b.FOR_SUBTYPING;
            j e10 = cVar.e();
            hc.t.b(e10);
            return new i(bVar, e10, q1Var2, m0Var.V0(), m0Var.X0(), false, 32, null);
        } else if (W0 instanceof ce.p) {
            Collection<e0> l11 = ((ce.p) W0).l();
            s11 = ub.v.s(l11, 10);
            ArrayList arrayList2 = new ArrayList(s11);
            for (e0 e0Var3 : l11) {
                e0 p10 = n1.p(e0Var3, m0Var.X0());
                hc.t.d(p10, "makeNullableAsSpecified(it, type.isMarkedNullable)");
                arrayList2.add(p10);
            }
            d0 d0Var2 = new d0(arrayList2);
            a1 V0 = m0Var.V0();
            h10 = ub.u.h();
            return f0.j(V0, d0Var2, h10, false, m0Var.z());
        } else if (!(W0 instanceof d0) || !m0Var.X0()) {
            return m0Var;
        } else {
            d0 d0Var3 = (d0) W0;
            Collection<e0> l12 = d0Var3.l();
            s10 = ub.v.s(l12, 10);
            ArrayList arrayList3 = new ArrayList(s10);
            for (e0 e0Var4 : l12) {
                arrayList3.add(te.a.t(e0Var4));
                z11 = true;
            }
            if (z11) {
                e0 f10 = d0Var3.f();
                if (f10 != null) {
                    e0Var = te.a.t(f10);
                }
                d0Var = new d0(arrayList3).j(e0Var);
            }
            if (d0Var != null) {
                d0Var3 = d0Var;
            }
            return d0Var3.e();
        }
    }

    /* renamed from: b */
    public q1 a(se.i iVar) {
        q1 q1Var;
        hc.t.e(iVar, "type");
        if (iVar instanceof e0) {
            q1 Z0 = ((e0) iVar).Z0();
            if (Z0 instanceof m0) {
                q1Var = c((m0) Z0);
            } else if (!(Z0 instanceof oe.y)) {
                throw new tb.p();
            } else {
                oe.y yVar = (oe.y) Z0;
                m0 c10 = c(yVar.e1());
                m0 c11 = c(yVar.f1());
                q1Var = (c10 == yVar.e1() && c11 == yVar.f1()) ? Z0 : f0.d(c10, c11);
            }
            return p1.c(q1Var, Z0, new b(this));
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}
