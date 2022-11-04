package xc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public final class g1 {

    /* loaded from: classes.dex */
    public static final class a extends hc.v implements gc.l<m, Boolean> {

        /* renamed from: c */
        public static final a f25542c = new a();

        a() {
            super(1);
        }

        /* renamed from: b */
        public final Boolean invoke(m mVar) {
            hc.t.e(mVar, "it");
            return Boolean.valueOf(mVar instanceof xc.a);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends hc.v implements gc.l<m, Boolean> {

        /* renamed from: c */
        public static final b f25543c = new b();

        b() {
            super(1);
        }

        /* renamed from: b */
        public final Boolean invoke(m mVar) {
            hc.t.e(mVar, "it");
            return Boolean.valueOf(!(mVar instanceof l));
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends hc.v implements gc.l<m, af.h<? extends f1>> {

        /* renamed from: c */
        public static final c f25544c = new c();

        c() {
            super(1);
        }

        /* renamed from: b */
        public final af.h<f1> invoke(m mVar) {
            af.h<f1> M;
            hc.t.e(mVar, "it");
            List<f1> p10 = ((xc.a) mVar).p();
            hc.t.d(p10, "it as CallableDescriptor).typeParameters");
            M = ub.c0.M(p10);
            return M;
        }
    }

    public static final s0 a(oe.e0 e0Var) {
        hc.t.e(e0Var, "<this>");
        h z10 = e0Var.W0().z();
        return b(e0Var, z10 instanceof i ? (i) z10 : null, 0);
    }

    private static final s0 b(oe.e0 e0Var, i iVar, int i10) {
        i iVar2 = null;
        if (iVar == null || qe.k.m(iVar)) {
            return null;
        }
        int size = iVar.A().size() + i10;
        if (!iVar.m0()) {
            if (size != e0Var.U0().size()) {
                ae.d.E(iVar);
            }
            return new s0(iVar, e0Var.U0().subList(i10, e0Var.U0().size()), null);
        }
        List<oe.g1> subList = e0Var.U0().subList(i10, size);
        m b10 = iVar.b();
        if (b10 instanceof i) {
            iVar2 = (i) b10;
        }
        return new s0(iVar, subList, b(e0Var, iVar2, size));
    }

    private static final xc.c c(f1 f1Var, m mVar, int i10) {
        return new xc.c(f1Var, mVar, i10);
    }

    public static final List<f1> d(i iVar) {
        af.h D;
        af.h q10;
        af.h u10;
        List F;
        List<f1> list;
        m mVar;
        List<f1> o02;
        int s10;
        List<f1> o03;
        oe.e1 r10;
        hc.t.e(iVar, "<this>");
        List<f1> A = iVar.A();
        hc.t.d(A, "declaredTypeParameters");
        if (iVar.m0() || (iVar.b() instanceof xc.a)) {
            D = af.p.D(ee.a.m(iVar), a.f25542c);
            q10 = af.p.q(D, b.f25543c);
            u10 = af.p.u(q10, c.f25544c);
            F = af.p.F(u10);
            Iterator<m> it = ee.a.m(iVar).iterator();
            while (true) {
                list = null;
                if (!it.hasNext()) {
                    mVar = null;
                    break;
                }
                mVar = it.next();
                if (mVar instanceof e) {
                    break;
                }
            }
            e eVar = (e) mVar;
            if (eVar != null && (r10 = eVar.r()) != null) {
                list = r10.getParameters();
            }
            if (list == null) {
                list = ub.u.h();
            }
            if (F.isEmpty() && list.isEmpty()) {
                List<f1> A2 = iVar.A();
                hc.t.d(A2, "declaredTypeParameters");
                return A2;
            }
            o02 = ub.c0.o0(F, list);
            s10 = ub.v.s(o02, 10);
            ArrayList arrayList = new ArrayList(s10);
            for (f1 f1Var : o02) {
                hc.t.d(f1Var, "it");
                arrayList.add(c(f1Var, iVar, A.size()));
            }
            o03 = ub.c0.o0(A, arrayList);
            return o03;
        }
        return A;
    }
}
