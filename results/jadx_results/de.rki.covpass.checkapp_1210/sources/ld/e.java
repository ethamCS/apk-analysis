package ld;

import gc.l;
import hc.t;
import hc.v;
import hd.k;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe.a1;
import oe.b0;
import oe.e0;
import oe.e1;
import oe.f0;
import oe.g0;
import oe.g1;
import oe.i1;
import oe.j1;
import oe.m0;
import oe.r1;
import qe.j;
import tb.p;
import tb.r;
import tb.x;
import uc.h;
import xc.f1;
/* loaded from: classes.dex */
public final class e extends j1 {
    public static final a Companion = new a(null);

    /* renamed from: c */
    private static final ld.a f15940c;

    /* renamed from: d */
    private static final ld.a f15941d;

    /* renamed from: b */
    private final g f15942b;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f15943a;

        static {
            int[] iArr = new int[ld.b.values().length];
            iArr[ld.b.FLEXIBLE_LOWER_BOUND.ordinal()] = 1;
            iArr[ld.b.FLEXIBLE_UPPER_BOUND.ordinal()] = 2;
            iArr[ld.b.INFLEXIBLE.ordinal()] = 3;
            f15943a = iArr;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends v implements l<pe.g, m0> {

        /* renamed from: c */
        final /* synthetic */ xc.e f15944c;

        /* renamed from: d */
        final /* synthetic */ e f15945d;

        /* renamed from: q */
        final /* synthetic */ m0 f15946q;

        /* renamed from: x */
        final /* synthetic */ ld.a f15947x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(xc.e eVar, e eVar2, m0 m0Var, ld.a aVar) {
            super(1);
            this.f15944c = eVar;
            this.f15945d = eVar2;
            this.f15946q = m0Var;
            this.f15947x = aVar;
        }

        /* renamed from: b */
        public final m0 invoke(pe.g gVar) {
            wd.b g10;
            xc.e b10;
            t.e(gVar, "kotlinTypeRefiner");
            xc.e eVar = this.f15944c;
            if (!(eVar instanceof xc.e)) {
                eVar = null;
            }
            if (eVar == null || (g10 = ee.a.g(eVar)) == null || (b10 = gVar.b(g10)) == null || t.a(b10, this.f15944c)) {
                return null;
            }
            return (m0) this.f15945d.l(this.f15946q, b10, this.f15947x).e();
        }
    }

    static {
        k kVar = k.COMMON;
        f15940c = d.d(kVar, false, null, 3, null).i(ld.b.FLEXIBLE_LOWER_BOUND);
        f15941d = d.d(kVar, false, null, 3, null).i(ld.b.FLEXIBLE_UPPER_BOUND);
    }

    public e(g gVar) {
        this.f15942b = gVar == null ? new g(this) : gVar;
    }

    public /* synthetic */ e(g gVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : gVar);
    }

    public static /* synthetic */ g1 k(e eVar, f1 f1Var, ld.a aVar, e0 e0Var, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            e0Var = eVar.f15942b.c(f1Var, true, aVar);
            t.d(e0Var, "typeParameterUpperBoundE…eter, isRaw = true, attr)");
        }
        return eVar.j(f1Var, aVar, e0Var);
    }

    public final r<m0, Boolean> l(m0 m0Var, xc.e eVar, ld.a aVar) {
        int s10;
        Boolean bool;
        List d10;
        if (!m0Var.W0().getParameters().isEmpty()) {
            if (h.c0(m0Var)) {
                g1 g1Var = m0Var.U0().get(0);
                r1 b10 = g1Var.b();
                e0 type = g1Var.getType();
                t.d(type, "componentTypeProjection.type");
                d10 = ub.t.d(new i1(b10, m(type, aVar)));
                m0Var = f0.i(m0Var.V0(), m0Var.W0(), d10, m0Var.X0(), null, 16, null);
            } else if (!g0.a(m0Var)) {
                he.h K = eVar.K(this);
                t.d(K, "declaration.getMemberScope(this)");
                a1 V0 = m0Var.V0();
                e1 r10 = eVar.r();
                t.d(r10, "declaration.typeConstructor");
                List<f1> parameters = eVar.r().getParameters();
                t.d(parameters, "declaration.typeConstructor.parameters");
                s10 = ub.v.s(parameters, 10);
                ArrayList arrayList = new ArrayList(s10);
                for (f1 f1Var : parameters) {
                    t.d(f1Var, "parameter");
                    arrayList.add(k(this, f1Var, aVar, null, 4, null));
                }
                m0Var = f0.k(V0, r10, arrayList, m0Var.X0(), K, new c(eVar, this, m0Var, aVar));
                bool = Boolean.TRUE;
                return x.a(m0Var, bool);
            } else {
                m0Var = qe.k.d(j.ERROR_RAW_TYPE, m0Var.W0().toString());
            }
        }
        bool = Boolean.FALSE;
        return x.a(m0Var, bool);
    }

    private final e0 m(e0 e0Var, ld.a aVar) {
        xc.h z10 = e0Var.W0().z();
        if (z10 instanceof f1) {
            e0 c10 = this.f15942b.c((f1) z10, true, aVar);
            t.d(c10, "typeParameterUpperBoundE…tion, isRaw = true, attr)");
            return m(c10, aVar);
        } else if (!(z10 instanceof xc.e)) {
            throw new IllegalStateException(("Unexpected declaration kind: " + z10).toString());
        } else {
            xc.h z11 = b0.d(e0Var).W0().z();
            if (z11 instanceof xc.e) {
                r<m0, Boolean> l10 = l(b0.c(e0Var), (xc.e) z10, f15940c);
                m0 b10 = l10.b();
                boolean booleanValue = l10.c().booleanValue();
                r<m0, Boolean> l11 = l(b0.d(e0Var), (xc.e) z11, f15941d);
                m0 b11 = l11.b();
                return (booleanValue || l11.c().booleanValue()) ? new f(b10, b11) : f0.d(b10, b11);
            }
            throw new IllegalStateException(("For some reason declaration for upper bound is not a class but \"" + z11 + "\" while for lower it's \"" + z10 + '\"').toString());
        }
    }

    static /* synthetic */ e0 n(e eVar, e0 e0Var, ld.a aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            aVar = new ld.a(k.COMMON, null, false, null, null, 30, null);
        }
        return eVar.m(e0Var, aVar);
    }

    @Override // oe.j1
    public boolean f() {
        return false;
    }

    public final g1 j(f1 f1Var, ld.a aVar, e0 e0Var) {
        t.e(f1Var, "parameter");
        t.e(aVar, "attr");
        t.e(e0Var, "erasedUpperBound");
        int i10 = b.f15943a[aVar.d().ordinal()];
        if (i10 != 1) {
            if (i10 != 2 && i10 != 3) {
                throw new p();
            }
            if (!f1Var.w().g()) {
                return new i1(r1.INVARIANT, ee.a.f(f1Var).H());
            }
            List<f1> parameters = e0Var.W0().getParameters();
            t.d(parameters, "erasedUpperBound.constructor.parameters");
            return parameters.isEmpty() ^ true ? new i1(r1.OUT_VARIANCE, e0Var) : d.b(f1Var, aVar);
        }
        return new i1(r1.INVARIANT, e0Var);
    }

    /* renamed from: o */
    public i1 e(e0 e0Var) {
        t.e(e0Var, "key");
        return new i1(n(this, e0Var, null, 2, null));
    }
}
