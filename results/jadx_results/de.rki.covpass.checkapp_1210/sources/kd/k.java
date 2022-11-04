package kd;

import af.p;
import hc.t;
import hc.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import nd.q;
import oe.e0;
import ub.c0;
import ub.u;
import ub.y0;
import ub.z;
import xc.u0;
import xc.z0;
import ye.b;
/* loaded from: classes.dex */
public final class k extends l {

    /* renamed from: m */
    private final nd.g f14992m;

    /* renamed from: n */
    private final f f14993n;

    /* loaded from: classes.dex */
    public static final class a extends v implements gc.l<q, Boolean> {

        /* renamed from: c */
        public static final a f14994c = new a();

        a() {
            super(1);
        }

        /* renamed from: b */
        public final Boolean invoke(q qVar) {
            t.e(qVar, "it");
            return Boolean.valueOf(qVar.m());
        }
    }

    /* loaded from: classes.dex */
    static final class b extends v implements gc.l<he.h, Collection<? extends u0>> {

        /* renamed from: c */
        final /* synthetic */ wd.f f14995c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(wd.f fVar) {
            super(1);
            this.f14995c = fVar;
        }

        /* renamed from: b */
        public final Collection<? extends u0> invoke(he.h hVar) {
            t.e(hVar, "it");
            return hVar.a(this.f14995c, fd.d.WHEN_GET_SUPER_MEMBERS);
        }
    }

    /* loaded from: classes.dex */
    static final class c extends v implements gc.l<he.h, Collection<? extends wd.f>> {

        /* renamed from: c */
        public static final c f14996c = new c();

        c() {
            super(1);
        }

        /* renamed from: b */
        public final Collection<wd.f> invoke(he.h hVar) {
            t.e(hVar, "it");
            return hVar.d();
        }
    }

    /* loaded from: classes.dex */
    public static final class d<N> implements b.c {

        /* renamed from: a */
        public static final d<N> f14997a = new d<>();

        /* loaded from: classes.dex */
        public static final class a extends v implements gc.l<e0, xc.e> {

            /* renamed from: c */
            public static final a f14998c = new a();

            a() {
                super(1);
            }

            /* renamed from: b */
            public final xc.e invoke(e0 e0Var) {
                xc.h z10 = e0Var.W0().z();
                if (z10 instanceof xc.e) {
                    return (xc.e) z10;
                }
                return null;
            }
        }

        d() {
        }

        /* renamed from: b */
        public final Iterable<xc.e> a(xc.e eVar) {
            af.h M;
            af.h A;
            Iterable<xc.e> m10;
            Collection<e0> l10 = eVar.r().l();
            t.d(l10, "it.typeConstructor.supertypes");
            M = c0.M(l10);
            A = p.A(M, a.f14998c);
            m10 = p.m(A);
            return m10;
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends b.AbstractC0460b<xc.e, tb.e0> {

        /* renamed from: a */
        final /* synthetic */ xc.e f14999a;

        /* renamed from: b */
        final /* synthetic */ Set<R> f15000b;

        /* renamed from: c */
        final /* synthetic */ gc.l<he.h, Collection<R>> f15001c;

        /* JADX WARN: Multi-variable type inference failed */
        e(xc.e eVar, Set<R> set, gc.l<? super he.h, ? extends Collection<? extends R>> lVar) {
            this.f14999a = eVar;
            this.f15000b = set;
            this.f15001c = lVar;
        }

        @Override // ye.b.d
        public /* bridge */ /* synthetic */ Object a() {
            e();
            return tb.e0.f22152a;
        }

        /* renamed from: d */
        public boolean c(xc.e eVar) {
            t.e(eVar, "current");
            if (eVar == this.f14999a) {
                return true;
            }
            he.h B0 = eVar.B0();
            t.d(B0, "current.staticScope");
            if (!(B0 instanceof l)) {
                return true;
            }
            this.f15000b.addAll((Collection) this.f15001c.invoke(B0));
            return false;
        }

        public void e() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(jd.g gVar, nd.g gVar2, f fVar) {
        super(gVar);
        t.e(gVar, "c");
        t.e(gVar2, "jClass");
        t.e(fVar, "ownerDescriptor");
        this.f14992m = gVar2;
        this.f14993n = fVar;
    }

    private final <R> Set<R> N(xc.e eVar, Set<R> set, gc.l<? super he.h, ? extends Collection<? extends R>> lVar) {
        List d10;
        d10 = ub.t.d(eVar);
        ye.b.b(d10, d.f14997a, new e(eVar, set, lVar));
        return set;
    }

    private final u0 P(u0 u0Var) {
        int s10;
        List O;
        Object s02;
        if (u0Var.h().b()) {
            return u0Var;
        }
        Collection<? extends u0> f10 = u0Var.f();
        t.d(f10, "this.overriddenDescriptors");
        s10 = ub.v.s(f10, 10);
        ArrayList arrayList = new ArrayList(s10);
        for (u0 u0Var2 : f10) {
            t.d(u0Var2, "it");
            arrayList.add(P(u0Var2));
        }
        O = c0.O(arrayList);
        s02 = c0.s0(O);
        return (u0) s02;
    }

    private final Set<z0> Q(wd.f fVar, xc.e eVar) {
        Set<z0> J0;
        Set<z0> b10;
        k b11 = id.h.b(eVar);
        if (b11 == null) {
            b10 = y0.b();
            return b10;
        }
        J0 = c0.J0(b11.b(fVar, fd.d.WHEN_GET_SUPER_MEMBERS));
        return J0;
    }

    /* renamed from: M */
    public kd.a p() {
        return new kd.a(this.f14992m, a.f14994c);
    }

    /* renamed from: O */
    public f C() {
        return this.f14993n;
    }

    @Override // he.i, he.k
    public xc.h f(wd.f fVar, fd.b bVar) {
        t.e(fVar, "name");
        t.e(bVar, "location");
        return null;
    }

    @Override // kd.j
    protected Set<wd.f> l(he.d dVar, gc.l<? super wd.f, Boolean> lVar) {
        Set<wd.f> b10;
        t.e(dVar, "kindFilter");
        b10 = y0.b();
        return b10;
    }

    @Override // kd.j
    protected Set<wd.f> n(he.d dVar, gc.l<? super wd.f, Boolean> lVar) {
        Set<wd.f> I0;
        List k10;
        t.e(dVar, "kindFilter");
        I0 = c0.I0(y().invoke().c());
        k b10 = id.h.b(C());
        Set<wd.f> c10 = b10 != null ? b10.c() : null;
        if (c10 == null) {
            c10 = y0.b();
        }
        I0.addAll(c10);
        if (this.f14992m.s()) {
            k10 = u.k(uc.k.f23445e, uc.k.f23444d);
            I0.addAll(k10);
        }
        I0.addAll(w().a().w().c(C()));
        return I0;
    }

    @Override // kd.j
    protected void o(Collection<z0> collection, wd.f fVar) {
        t.e(collection, "result");
        t.e(fVar, "name");
        w().a().w().a(C(), fVar, collection);
    }

    @Override // kd.j
    protected void r(Collection<z0> collection, wd.f fVar) {
        z0 g10;
        String str;
        t.e(collection, "result");
        t.e(fVar, "name");
        Collection<? extends z0> e10 = hd.a.e(fVar, Q(fVar, C()), collection, C(), w().a().c(), w().a().k().a());
        t.d(e10, "resolveOverridesForStati….overridingUtil\n        )");
        collection.addAll(e10);
        if (this.f14992m.s()) {
            if (t.a(fVar, uc.k.f23445e)) {
                g10 = ae.c.f(C());
                str = "createEnumValueOfMethod(ownerDescriptor)";
            } else if (!t.a(fVar, uc.k.f23444d)) {
                return;
            } else {
                g10 = ae.c.g(C());
                str = "createEnumValuesMethod(ownerDescriptor)";
            }
            t.d(g10, str);
            collection.add(g10);
        }
    }

    @Override // kd.l, kd.j
    protected void s(wd.f fVar, Collection<u0> collection) {
        t.e(fVar, "name");
        t.e(collection, "result");
        Set N = N(C(), new LinkedHashSet(), new b(fVar));
        if (!collection.isEmpty()) {
            Collection<? extends u0> e10 = hd.a.e(fVar, N, collection, C(), w().a().c(), w().a().k().a());
            t.d(e10, "resolveOverridesForStati…ingUtil\n                )");
            collection.addAll(e10);
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : N) {
            u0 P = P((u0) obj);
            Object obj2 = linkedHashMap.get(P);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(P, obj2);
            }
            ((List) obj2).add(obj);
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Collection e11 = hd.a.e(fVar, (Collection) entry.getValue(), collection, C(), w().a().c(), w().a().k().a());
            t.d(e11, "resolveOverridesForStati…ingUtil\n                )");
            z.x(arrayList, e11);
        }
        collection.addAll(arrayList);
    }

    @Override // kd.j
    protected Set<wd.f> t(he.d dVar, gc.l<? super wd.f, Boolean> lVar) {
        Set<wd.f> I0;
        t.e(dVar, "kindFilter");
        I0 = c0.I0(y().invoke().f());
        N(C(), I0, c.f14996c);
        return I0;
    }
}
