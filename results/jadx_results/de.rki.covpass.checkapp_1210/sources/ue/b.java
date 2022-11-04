package ue;

import be.d;
import gc.l;
import hc.t;
import hc.v;
import java.util.ArrayList;
import java.util.List;
import oe.b0;
import oe.e0;
import oe.e1;
import oe.f0;
import oe.f1;
import oe.g1;
import oe.i1;
import oe.k1;
import oe.l1;
import oe.m0;
import oe.n1;
import oe.p1;
import oe.q1;
import oe.r1;
import tb.p;
import tb.r;
import ub.c0;
import uc.h;
/* loaded from: classes3.dex */
public final class b {

    /* loaded from: classes3.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23598a;

        static {
            int[] iArr = new int[r1.values().length];
            iArr[r1.INVARIANT.ordinal()] = 1;
            iArr[r1.IN_VARIANCE.ordinal()] = 2;
            iArr[r1.OUT_VARIANCE.ordinal()] = 3;
            f23598a = iArr;
        }
    }

    /* renamed from: ue.b$b */
    /* loaded from: classes3.dex */
    public static final class C0418b extends v implements l<q1, Boolean> {

        /* renamed from: c */
        public static final C0418b f23599c = new C0418b();

        C0418b() {
            super(1);
        }

        /* renamed from: b */
        public final Boolean invoke(q1 q1Var) {
            t.d(q1Var, "it");
            return Boolean.valueOf(d.d(q1Var));
        }
    }

    /* loaded from: classes3.dex */
    public static final class c extends f1 {
        c() {
        }

        @Override // oe.f1
        public g1 k(e1 e1Var) {
            t.e(e1Var, "key");
            be.b bVar = e1Var instanceof be.b ? (be.b) e1Var : null;
            if (bVar == null) {
                return null;
            }
            return bVar.b().c() ? new i1(r1.OUT_VARIANCE, bVar.b().getType()) : bVar.b();
        }
    }

    public static final ue.a<e0> a(e0 e0Var) {
        List<r> M0;
        Object obj;
        t.e(e0Var, "type");
        if (b0.b(e0Var)) {
            ue.a<e0> a10 = a(b0.c(e0Var));
            ue.a<e0> a11 = a(b0.d(e0Var));
            return new ue.a<>(p1.b(f0.d(b0.c(a10.c()), b0.d(a11.c())), e0Var), p1.b(f0.d(b0.c(a10.d()), b0.d(a11.d())), e0Var));
        }
        e1 W0 = e0Var.W0();
        if (d.d(e0Var)) {
            t.c(W0, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.calls.inference.CapturedTypeConstructor");
            g1 b10 = ((be.b) W0).b();
            e0 type = b10.getType();
            t.d(type, "typeProjection.type");
            e0 b11 = b(type, e0Var);
            int i10 = a.f23598a[b10.b().ordinal()];
            if (i10 == 2) {
                m0 I = te.a.h(e0Var).I();
                t.d(I, "type.builtIns.nullableAnyType");
                return new ue.a<>(b11, I);
            } else if (i10 != 3) {
                throw new AssertionError("Only nontrivial projections should have been captured, not: " + b10);
            } else {
                m0 H = te.a.h(e0Var).H();
                t.d(H, "type.builtIns.nothingType");
                return new ue.a<>(b(H, e0Var), b11);
            }
        } else if (e0Var.U0().isEmpty() || e0Var.U0().size() != W0.getParameters().size()) {
            return new ue.a<>(e0Var, e0Var);
        } else {
            ArrayList<ue.c> arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            List<g1> U0 = e0Var.U0();
            List<xc.f1> parameters = W0.getParameters();
            t.d(parameters, "typeConstructor.parameters");
            M0 = c0.M0(U0, parameters);
            for (r rVar : M0) {
                g1 g1Var = (g1) rVar.b();
                xc.f1 f1Var = (xc.f1) rVar.c();
                t.d(f1Var, "typeParameter");
                ue.c g10 = g(g1Var, f1Var);
                if (g1Var.c()) {
                    arrayList.add(g10);
                } else {
                    ue.a<ue.c> d10 = d(g10);
                    g10 = d10.b();
                    arrayList.add(d10.a());
                }
                arrayList2.add(g10);
            }
            boolean z10 = true;
            if (!arrayList.isEmpty()) {
                for (ue.c cVar : arrayList) {
                    if (!cVar.d()) {
                        break;
                    }
                }
            }
            z10 = false;
            if (z10) {
                obj = te.a.h(e0Var).H();
                t.d(obj, "type.builtIns.nothingType");
            } else {
                obj = e(e0Var, arrayList);
            }
            return new ue.a<>(obj, e(e0Var, arrayList2));
        }
    }

    private static final e0 b(e0 e0Var, e0 e0Var2) {
        e0 q10 = n1.q(e0Var, e0Var2.X0());
        t.d(q10, "makeNullableIfNeeded(this, type.isMarkedNullable)");
        return q10;
    }

    public static final g1 c(g1 g1Var, boolean z10) {
        if (g1Var == null) {
            return null;
        }
        if (g1Var.c()) {
            return g1Var;
        }
        e0 type = g1Var.getType();
        t.d(type, "typeProjection.type");
        if (!n1.c(type, C0418b.f23599c)) {
            return g1Var;
        }
        r1 b10 = g1Var.b();
        t.d(b10, "typeProjection.projectionKind");
        return b10 == r1.OUT_VARIANCE ? new i1(b10, a(type).d()) : z10 ? new i1(b10, a(type).c()) : f(g1Var);
    }

    private static final ue.a<ue.c> d(ue.c cVar) {
        ue.a<e0> a10 = a(cVar.a());
        ue.a<e0> a11 = a(cVar.b());
        return new ue.a<>(new ue.c(cVar.c(), a10.b(), a11.a()), new ue.c(cVar.c(), a10.a(), a11.b()));
    }

    private static final e0 e(e0 e0Var, List<ue.c> list) {
        int s10;
        e0Var.U0().size();
        list.size();
        s10 = ub.v.s(list, 10);
        ArrayList arrayList = new ArrayList(s10);
        for (ue.c cVar : list) {
            arrayList.add(h(cVar));
        }
        return k1.e(e0Var, arrayList, null, null, 6, null);
    }

    private static final g1 f(g1 g1Var) {
        l1 g10 = l1.g(new c());
        t.d(g10, "create(object : TypeCons…ojection\n        }\n    })");
        return g10.t(g1Var);
    }

    private static final ue.c g(g1 g1Var, xc.f1 f1Var) {
        int i10 = a.f23598a[l1.c(f1Var.w(), g1Var).ordinal()];
        if (i10 == 1) {
            e0 type = g1Var.getType();
            t.d(type, "type");
            e0 type2 = g1Var.getType();
            t.d(type2, "type");
            return new ue.c(f1Var, type, type2);
        } else if (i10 == 2) {
            e0 type3 = g1Var.getType();
            t.d(type3, "type");
            m0 I = ee.a.f(f1Var).I();
            t.d(I, "typeParameter.builtIns.nullableAnyType");
            return new ue.c(f1Var, type3, I);
        } else if (i10 != 3) {
            throw new p();
        } else {
            m0 H = ee.a.f(f1Var).H();
            t.d(H, "typeParameter.builtIns.nothingType");
            e0 type4 = g1Var.getType();
            t.d(type4, "type");
            return new ue.c(f1Var, H, type4);
        }
    }

    private static final g1 h(ue.c cVar) {
        cVar.d();
        if (!t.a(cVar.a(), cVar.b())) {
            r1 w9 = cVar.c().w();
            r1 r1Var = r1.IN_VARIANCE;
            if (w9 != r1Var) {
                if ((!h.m0(cVar.a()) || cVar.c().w() == r1Var) && h.o0(cVar.b())) {
                    return new i1(i(cVar, r1Var), cVar.a());
                }
                return new i1(i(cVar, r1.OUT_VARIANCE), cVar.b());
            }
        }
        return new i1(cVar.a());
    }

    private static final r1 i(ue.c cVar, r1 r1Var) {
        return r1Var == cVar.c().w() ? r1.INVARIANT : r1Var;
    }
}
