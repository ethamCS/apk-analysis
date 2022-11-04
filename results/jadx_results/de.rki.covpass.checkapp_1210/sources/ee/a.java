package ee;

import af.n;
import gc.l;
import hc.j0;
import hc.k0;
import hc.p;
import hc.t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import oe.e0;
import oe.m0;
import pe.g;
import pe.x;
import ub.u;
import ub.v;
import wd.f;
import xc.h;
import xc.h0;
import xc.h1;
import xc.i;
import xc.j1;
import xc.l0;
import xc.m;
import xc.t0;
import xc.u0;
import xc.z;
import ye.b;
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a */
    private static final f f9549a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ee.a$a */
    /* loaded from: classes3.dex */
    public static final class C0140a<N> implements b.c {

        /* renamed from: a */
        public static final C0140a<N> f9550a = new C0140a<>();

        C0140a() {
        }

        /* renamed from: b */
        public final Iterable<j1> a(j1 j1Var) {
            int s10;
            Collection<j1> f10 = j1Var.f();
            s10 = v.s(f10, 10);
            ArrayList arrayList = new ArrayList(s10);
            for (j1 j1Var2 : f10) {
                arrayList.add(j1Var2.a());
            }
            return arrayList;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public /* synthetic */ class b extends p implements l<j1, Boolean> {
        public static final b Y3 = new b();

        b() {
            super(1);
        }

        @Override // hc.h
        public final oc.f e0() {
            return k0.b(j1.class);
        }

        @Override // hc.h
        public final String g0() {
            return "declaresDefaultValue()Z";
        }

        @Override // hc.h, oc.c
        public final String getName() {
            return "declaresDefaultValue";
        }

        /* renamed from: i0 */
        public final Boolean invoke(j1 j1Var) {
            t.e(j1Var, "p0");
            return Boolean.valueOf(j1Var.k0());
        }
    }

    /* loaded from: classes3.dex */
    public static final class c<N> implements b.c {

        /* renamed from: a */
        final /* synthetic */ boolean f9551a;

        c(boolean z10) {
            this.f9551a = z10;
        }

        /* renamed from: b */
        public final Iterable<xc.b> a(xc.b bVar) {
            List h10;
            Collection<? extends xc.b> collection = null;
            if (this.f9551a) {
                bVar = bVar != null ? bVar.a() : null;
            }
            if (bVar != null) {
                collection = bVar.f();
            }
            if (collection == null) {
                h10 = u.h();
                return h10;
            }
            return collection;
        }
    }

    /* loaded from: classes3.dex */
    public static final class d extends b.AbstractC0460b<xc.b, xc.b> {

        /* renamed from: a */
        final /* synthetic */ j0<xc.b> f9552a;

        /* renamed from: b */
        final /* synthetic */ l<xc.b, Boolean> f9553b;

        /* JADX WARN: Multi-variable type inference failed */
        d(j0<xc.b> j0Var, l<? super xc.b, Boolean> lVar) {
            this.f9552a = j0Var;
            this.f9553b = lVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: d */
        public void b(xc.b bVar) {
            t.e(bVar, "current");
            if (this.f9552a.f11764c != null || !this.f9553b.invoke(bVar).booleanValue()) {
                return;
            }
            this.f9552a.f11764c = bVar;
        }

        /* renamed from: e */
        public boolean c(xc.b bVar) {
            t.e(bVar, "current");
            return this.f9552a.f11764c == null;
        }

        /* renamed from: f */
        public xc.b a() {
            return this.f9552a.f11764c;
        }
    }

    /* loaded from: classes3.dex */
    public static final class e extends hc.v implements l<m, m> {

        /* renamed from: c */
        public static final e f9554c = new e();

        e() {
            super(1);
        }

        /* renamed from: b */
        public final m invoke(m mVar) {
            t.e(mVar, "it");
            return mVar.b();
        }
    }

    static {
        f j10 = f.j("value");
        t.d(j10, "identifier(\"value\")");
        f9549a = j10;
    }

    public static final boolean a(j1 j1Var) {
        List d10;
        t.e(j1Var, "<this>");
        d10 = ub.t.d(j1Var);
        Boolean e10 = ye.b.e(d10, C0140a.f9550a, b.Y3);
        t.d(e10, "ifAny(\n        listOf(th…eclaresDefaultValue\n    )");
        return e10.booleanValue();
    }

    public static final xc.b b(xc.b bVar, boolean z10, l<? super xc.b, Boolean> lVar) {
        List d10;
        t.e(bVar, "<this>");
        t.e(lVar, "predicate");
        j0 j0Var = new j0();
        d10 = ub.t.d(bVar);
        return (xc.b) ye.b.b(d10, new c(z10), new d(j0Var, lVar));
    }

    public static /* synthetic */ xc.b c(xc.b bVar, boolean z10, l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return b(bVar, z10, lVar);
    }

    public static final wd.c d(m mVar) {
        t.e(mVar, "<this>");
        wd.d i10 = i(mVar);
        if (!i10.f()) {
            i10 = null;
        }
        if (i10 != null) {
            return i10.l();
        }
        return null;
    }

    public static final xc.e e(yc.c cVar) {
        t.e(cVar, "<this>");
        h z10 = cVar.getType().W0().z();
        if (z10 instanceof xc.e) {
            return (xc.e) z10;
        }
        return null;
    }

    public static final uc.h f(m mVar) {
        t.e(mVar, "<this>");
        return l(mVar).x();
    }

    public static final wd.b g(h hVar) {
        m b10;
        wd.b g10;
        if (hVar == null || (b10 = hVar.b()) == null) {
            return null;
        }
        if (b10 instanceof l0) {
            return new wd.b(((l0) b10).d(), hVar.getName());
        }
        if ((b10 instanceof i) && (g10 = g((h) b10)) != null) {
            return g10.d(hVar.getName());
        }
        return null;
    }

    public static final wd.c h(m mVar) {
        t.e(mVar, "<this>");
        wd.c n10 = ae.d.n(mVar);
        t.d(n10, "getFqNameSafe(this)");
        return n10;
    }

    public static final wd.d i(m mVar) {
        t.e(mVar, "<this>");
        wd.d m10 = ae.d.m(mVar);
        t.d(m10, "getFqName(this)");
        return m10;
    }

    public static final z<m0> j(xc.e eVar) {
        h1<m0> x02 = eVar != null ? eVar.x0() : null;
        if (x02 instanceof z) {
            return (z) x02;
        }
        return null;
    }

    public static final g k(h0 h0Var) {
        t.e(h0Var, "<this>");
        pe.p pVar = (pe.p) h0Var.o0(pe.h.a());
        x xVar = pVar != null ? (x) pVar.a() : null;
        return xVar instanceof x.a ? ((x.a) xVar).b() : g.a.f19148a;
    }

    public static final h0 l(m mVar) {
        t.e(mVar, "<this>");
        h0 g10 = ae.d.g(mVar);
        t.d(g10, "getContainingModule(this)");
        return g10;
    }

    public static final af.h<m> m(m mVar) {
        af.h<m> p10;
        t.e(mVar, "<this>");
        p10 = af.p.p(n(mVar), 1);
        return p10;
    }

    public static final af.h<m> n(m mVar) {
        af.h<m> k10;
        t.e(mVar, "<this>");
        k10 = n.k(mVar, e.f9554c);
        return k10;
    }

    public static final xc.b o(xc.b bVar) {
        t.e(bVar, "<this>");
        if (bVar instanceof t0) {
            u0 C0 = ((t0) bVar).C0();
            t.d(C0, "correspondingProperty");
            return C0;
        }
        return bVar;
    }

    public static final xc.e p(xc.e eVar) {
        t.e(eVar, "<this>");
        for (e0 e0Var : eVar.u().W0().l()) {
            if (!uc.h.b0(e0Var)) {
                h z10 = e0Var.W0().z();
                if (ae.d.w(z10)) {
                    t.c(z10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    return (xc.e) z10;
                }
            }
        }
        return null;
    }

    public static final boolean q(h0 h0Var) {
        x xVar;
        t.e(h0Var, "<this>");
        pe.p pVar = (pe.p) h0Var.o0(pe.h.a());
        return (pVar == null || (xVar = (x) pVar.a()) == null || !xVar.a()) ? false : true;
    }

    public static final xc.e r(h0 h0Var, wd.c cVar, fd.b bVar) {
        t.e(h0Var, "<this>");
        t.e(cVar, "topLevelClassFqName");
        t.e(bVar, "location");
        cVar.d();
        wd.c e10 = cVar.e();
        t.d(e10, "topLevelClassFqName.parent()");
        he.h z10 = h0Var.F(e10).z();
        f g10 = cVar.g();
        t.d(g10, "topLevelClassFqName.shortName()");
        h f10 = z10.f(g10, bVar);
        if (f10 instanceof xc.e) {
            return (xc.e) f10;
        }
        return null;
    }
}
