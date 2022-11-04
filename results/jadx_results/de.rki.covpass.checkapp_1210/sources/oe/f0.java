package oe;

import java.util.List;
import oe.x0;
/* loaded from: classes3.dex */
public final class f0 {

    /* renamed from: a */
    public static final f0 f17965a = new f0();

    /* renamed from: b */
    private static final gc.l<pe.g, m0> f17966b = a.f17967c;

    /* loaded from: classes3.dex */
    static final class a extends hc.v implements gc.l {

        /* renamed from: c */
        public static final a f17967c = new a();

        a() {
            super(1);
        }

        /* renamed from: b */
        public final Void invoke(pe.g gVar) {
            hc.t.e(gVar, "<anonymous parameter 0>");
            return null;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a */
        private final m0 f17968a;

        /* renamed from: b */
        private final e1 f17969b;

        public b(m0 m0Var, e1 e1Var) {
            this.f17968a = m0Var;
            this.f17969b = e1Var;
        }

        public final m0 a() {
            return this.f17968a;
        }

        public final e1 b() {
            return this.f17969b;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c extends hc.v implements gc.l<pe.g, m0> {

        /* renamed from: c */
        final /* synthetic */ e1 f17970c;

        /* renamed from: d */
        final /* synthetic */ List<g1> f17971d;

        /* renamed from: q */
        final /* synthetic */ a1 f17972q;

        /* renamed from: x */
        final /* synthetic */ boolean f17973x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(e1 e1Var, List<? extends g1> list, a1 a1Var, boolean z10) {
            super(1);
            this.f17970c = e1Var;
            this.f17971d = list;
            this.f17972q = a1Var;
            this.f17973x = z10;
        }

        /* renamed from: b */
        public final m0 invoke(pe.g gVar) {
            hc.t.e(gVar, "refiner");
            b f10 = f0.f17965a.f(this.f17970c, gVar, this.f17971d);
            if (f10 == null) {
                return null;
            }
            m0 a10 = f10.a();
            if (a10 != null) {
                return a10;
            }
            a1 a1Var = this.f17972q;
            e1 b10 = f10.b();
            hc.t.b(b10);
            return f0.h(a1Var, b10, this.f17971d, this.f17973x, gVar);
        }
    }

    /* loaded from: classes3.dex */
    public static final class d extends hc.v implements gc.l<pe.g, m0> {

        /* renamed from: c */
        final /* synthetic */ e1 f17974c;

        /* renamed from: d */
        final /* synthetic */ List<g1> f17975d;

        /* renamed from: q */
        final /* synthetic */ a1 f17976q;

        /* renamed from: x */
        final /* synthetic */ boolean f17977x;

        /* renamed from: y */
        final /* synthetic */ he.h f17978y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(e1 e1Var, List<? extends g1> list, a1 a1Var, boolean z10, he.h hVar) {
            super(1);
            this.f17974c = e1Var;
            this.f17975d = list;
            this.f17976q = a1Var;
            this.f17977x = z10;
            this.f17978y = hVar;
        }

        /* renamed from: b */
        public final m0 invoke(pe.g gVar) {
            hc.t.e(gVar, "kotlinTypeRefiner");
            b f10 = f0.f17965a.f(this.f17974c, gVar, this.f17975d);
            if (f10 == null) {
                return null;
            }
            m0 a10 = f10.a();
            if (a10 != null) {
                return a10;
            }
            a1 a1Var = this.f17976q;
            e1 b10 = f10.b();
            hc.t.b(b10);
            return f0.j(a1Var, b10, this.f17975d, this.f17977x, this.f17978y);
        }
    }

    private f0() {
    }

    @fc.c
    public static final m0 b(xc.e1 e1Var, List<? extends g1> list) {
        hc.t.e(e1Var, "<this>");
        hc.t.e(list, "arguments");
        return new v0(x0.a.f18058a, false).i(w0.Companion.a(null, e1Var, list), a1.Companion.h());
    }

    private final he.h c(e1 e1Var, List<? extends g1> list, pe.g gVar) {
        xc.h z10 = e1Var.z();
        if (z10 instanceof xc.f1) {
            return ((xc.f1) z10).u().z();
        }
        if (z10 instanceof xc.e) {
            if (gVar == null) {
                gVar = ee.a.k(ee.a.l(z10));
            }
            xc.e eVar = (xc.e) z10;
            return list.isEmpty() ? ad.u.b(eVar, gVar) : ad.u.a(eVar, f1.Companion.b(e1Var, list), gVar);
        } else if (z10 instanceof xc.e1) {
            qe.g gVar2 = qe.g.SCOPE_FOR_ABBREVIATION_TYPE;
            String fVar = ((xc.e1) z10).getName().toString();
            hc.t.d(fVar, "descriptor.name.toString()");
            return qe.k.a(gVar2, true, fVar);
        } else if (e1Var instanceof d0) {
            return ((d0) e1Var).d();
        } else {
            throw new IllegalStateException("Unsupported classifier: " + z10 + " for constructor: " + e1Var);
        }
    }

    @fc.c
    public static final q1 d(m0 m0Var, m0 m0Var2) {
        hc.t.e(m0Var, "lowerBound");
        hc.t.e(m0Var2, "upperBound");
        return hc.t.a(m0Var, m0Var2) ? m0Var : new z(m0Var, m0Var2);
    }

    @fc.c
    public static final m0 e(a1 a1Var, ce.n nVar, boolean z10) {
        List h10;
        hc.t.e(a1Var, "attributes");
        hc.t.e(nVar, "constructor");
        h10 = ub.u.h();
        return j(a1Var, nVar, h10, z10, qe.k.a(qe.g.INTEGER_LITERAL_TYPE_SCOPE, true, "unknown integer literal type"));
    }

    public final b f(e1 e1Var, pe.g gVar, List<? extends g1> list) {
        xc.h f10;
        xc.h z10 = e1Var.z();
        if (z10 == null || (f10 = gVar.f(z10)) == null) {
            return null;
        }
        if (f10 instanceof xc.e1) {
            return new b(b((xc.e1) f10, list), null);
        }
        e1 a10 = f10.r().a(gVar);
        hc.t.d(a10, "descriptor.typeConstruct…refine(kotlinTypeRefiner)");
        return new b(null, a10);
    }

    @fc.c
    public static final m0 g(a1 a1Var, xc.e eVar, List<? extends g1> list) {
        hc.t.e(a1Var, "attributes");
        hc.t.e(eVar, "descriptor");
        hc.t.e(list, "arguments");
        e1 r10 = eVar.r();
        hc.t.d(r10, "descriptor.typeConstructor");
        return i(a1Var, r10, list, false, null, 16, null);
    }

    @fc.c
    public static final m0 h(a1 a1Var, e1 e1Var, List<? extends g1> list, boolean z10, pe.g gVar) {
        hc.t.e(a1Var, "attributes");
        hc.t.e(e1Var, "constructor");
        hc.t.e(list, "arguments");
        if (!a1Var.isEmpty() || !list.isEmpty() || z10 || e1Var.z() == null) {
            return k(a1Var, e1Var, list, z10, f17965a.c(e1Var, list, gVar), new c(e1Var, list, a1Var, z10));
        }
        xc.h z11 = e1Var.z();
        hc.t.b(z11);
        m0 u10 = z11.u();
        hc.t.d(u10, "constructor.declarationDescriptor!!.defaultType");
        return u10;
    }

    public static /* synthetic */ m0 i(a1 a1Var, e1 e1Var, List list, boolean z10, pe.g gVar, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            gVar = null;
        }
        return h(a1Var, e1Var, list, z10, gVar);
    }

    @fc.c
    public static final m0 j(a1 a1Var, e1 e1Var, List<? extends g1> list, boolean z10, he.h hVar) {
        hc.t.e(a1Var, "attributes");
        hc.t.e(e1Var, "constructor");
        hc.t.e(list, "arguments");
        hc.t.e(hVar, "memberScope");
        n0 n0Var = new n0(e1Var, list, z10, hVar, new d(e1Var, list, a1Var, z10, hVar));
        return a1Var.isEmpty() ? n0Var : new o0(n0Var, a1Var);
    }

    @fc.c
    public static final m0 k(a1 a1Var, e1 e1Var, List<? extends g1> list, boolean z10, he.h hVar, gc.l<? super pe.g, ? extends m0> lVar) {
        hc.t.e(a1Var, "attributes");
        hc.t.e(e1Var, "constructor");
        hc.t.e(list, "arguments");
        hc.t.e(hVar, "memberScope");
        hc.t.e(lVar, "refinedTypeFactory");
        n0 n0Var = new n0(e1Var, list, z10, hVar, lVar);
        return a1Var.isEmpty() ? n0Var : new o0(n0Var, a1Var);
    }
}
