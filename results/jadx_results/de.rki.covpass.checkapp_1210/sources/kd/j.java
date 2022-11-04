package kd;

import ad.l0;
import gd.i0;
import hc.e0;
import hc.k0;
import hc.t;
import hc.v;
import he.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nd.b0;
import nd.n;
import nd.r;
import nd.y;
import oe.n1;
import tb.x;
import ub.c0;
import ub.h0;
import ub.p0;
import ub.q0;
import ub.u;
import xc.a;
import xc.f1;
import xc.j1;
import xc.u0;
import xc.x0;
import xc.z0;
/* loaded from: classes.dex */
public abstract class j extends he.i {

    /* renamed from: l */
    static final /* synthetic */ oc.k<Object>[] f14956l = {k0.g(new e0(k0.b(j.class), "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;")), k0.g(new e0(k0.b(j.class), "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;")), k0.g(new e0(k0.b(j.class), "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;"))};

    /* renamed from: a */
    private final jd.g f14957a;

    /* renamed from: b */
    private final j f14958b;

    /* renamed from: c */
    private final ne.i<Collection<xc.m>> f14959c;

    /* renamed from: d */
    private final ne.i<kd.b> f14960d;

    /* renamed from: e */
    private final ne.g<wd.f, Collection<z0>> f14961e;

    /* renamed from: f */
    private final ne.h<wd.f, u0> f14962f;

    /* renamed from: g */
    private final ne.g<wd.f, Collection<z0>> f14963g;

    /* renamed from: h */
    private final ne.i f14964h;

    /* renamed from: i */
    private final ne.i f14965i;

    /* renamed from: j */
    private final ne.i f14966j;

    /* renamed from: k */
    private final ne.g<wd.f, List<u0>> f14967k;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final oe.e0 f14968a;

        /* renamed from: b */
        private final oe.e0 f14969b;

        /* renamed from: c */
        private final List<j1> f14970c;

        /* renamed from: d */
        private final List<f1> f14971d;

        /* renamed from: e */
        private final boolean f14972e;

        /* renamed from: f */
        private final List<String> f14973f;

        /* JADX WARN: Multi-variable type inference failed */
        public a(oe.e0 e0Var, oe.e0 e0Var2, List<? extends j1> list, List<? extends f1> list2, boolean z10, List<String> list3) {
            t.e(e0Var, "returnType");
            t.e(list, "valueParameters");
            t.e(list2, "typeParameters");
            t.e(list3, "errors");
            this.f14968a = e0Var;
            this.f14969b = e0Var2;
            this.f14970c = list;
            this.f14971d = list2;
            this.f14972e = z10;
            this.f14973f = list3;
        }

        public final List<String> a() {
            return this.f14973f;
        }

        public final boolean b() {
            return this.f14972e;
        }

        public final oe.e0 c() {
            return this.f14969b;
        }

        public final oe.e0 d() {
            return this.f14968a;
        }

        public final List<f1> e() {
            return this.f14971d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return t.a(this.f14968a, aVar.f14968a) && t.a(this.f14969b, aVar.f14969b) && t.a(this.f14970c, aVar.f14970c) && t.a(this.f14971d, aVar.f14971d) && this.f14972e == aVar.f14972e && t.a(this.f14973f, aVar.f14973f);
        }

        public final List<j1> f() {
            return this.f14970c;
        }

        public int hashCode() {
            int hashCode = this.f14968a.hashCode() * 31;
            oe.e0 e0Var = this.f14969b;
            int hashCode2 = (((((hashCode + (e0Var == null ? 0 : e0Var.hashCode())) * 31) + this.f14970c.hashCode()) * 31) + this.f14971d.hashCode()) * 31;
            boolean z10 = this.f14972e;
            if (z10) {
                z10 = true;
            }
            int i10 = z10 ? 1 : 0;
            int i11 = z10 ? 1 : 0;
            return ((hashCode2 + i10) * 31) + this.f14973f.hashCode();
        }

        public String toString() {
            return "MethodSignatureData(returnType=" + this.f14968a + ", receiverType=" + this.f14969b + ", valueParameters=" + this.f14970c + ", typeParameters=" + this.f14971d + ", hasStableParameterNames=" + this.f14972e + ", errors=" + this.f14973f + ')';
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private final List<j1> f14974a;

        /* renamed from: b */
        private final boolean f14975b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(List<? extends j1> list, boolean z10) {
            t.e(list, "descriptors");
            this.f14974a = list;
            this.f14975b = z10;
        }

        public final List<j1> a() {
            return this.f14974a;
        }

        public final boolean b() {
            return this.f14975b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class c extends v implements gc.a<Collection<? extends xc.m>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c() {
            super(0);
            j.this = r1;
        }

        /* renamed from: b */
        public final Collection<xc.m> invoke() {
            return j.this.m(he.d.f11845n, he.h.Companion.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class d extends v implements gc.a<Set<? extends wd.f>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d() {
            super(0);
            j.this = r1;
        }

        /* renamed from: b */
        public final Set<wd.f> invoke() {
            return j.this.l(he.d.f11850s, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class e extends v implements gc.l<wd.f, u0> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e() {
            super(1);
            j.this = r1;
        }

        /* renamed from: b */
        public final u0 invoke(wd.f fVar) {
            t.e(fVar, "name");
            if (j.this.B() != null) {
                return (u0) j.this.B().f14962f.invoke(fVar);
            }
            n b10 = j.this.y().invoke().b(fVar);
            if (b10 != null && !b10.C()) {
                return j.this.J(b10);
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class f extends v implements gc.l<wd.f, Collection<? extends z0>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f() {
            super(1);
            j.this = r1;
        }

        /* renamed from: b */
        public final Collection<z0> invoke(wd.f fVar) {
            t.e(fVar, "name");
            if (j.this.B() != null) {
                return (Collection) j.this.B().f14961e.invoke(fVar);
            }
            ArrayList arrayList = new ArrayList();
            for (r rVar : j.this.y().invoke().a(fVar)) {
                id.e I = j.this.I(rVar);
                if (j.this.G(I)) {
                    j.this.w().a().h().b(rVar, I);
                    arrayList.add(I);
                }
            }
            j.this.o(arrayList, fVar);
            return arrayList;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class g extends v implements gc.a<kd.b> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g() {
            super(0);
            j.this = r1;
        }

        /* renamed from: b */
        public final kd.b invoke() {
            return j.this.p();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class h extends v implements gc.a<Set<? extends wd.f>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h() {
            super(0);
            j.this = r1;
        }

        /* renamed from: b */
        public final Set<wd.f> invoke() {
            return j.this.n(he.d.f11852u, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class i extends v implements gc.l<wd.f, Collection<? extends z0>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i() {
            super(1);
            j.this = r1;
        }

        /* renamed from: b */
        public final Collection<z0> invoke(wd.f fVar) {
            List F0;
            t.e(fVar, "name");
            LinkedHashSet linkedHashSet = new LinkedHashSet((Collection) j.this.f14961e.invoke(fVar));
            j.this.L(linkedHashSet);
            j.this.r(linkedHashSet, fVar);
            F0 = c0.F0(j.this.w().a().r().g(j.this.w(), linkedHashSet));
            return F0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: kd.j$j */
    /* loaded from: classes.dex */
    public static final class C0222j extends v implements gc.l<wd.f, List<? extends u0>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0222j() {
            super(1);
            j.this = r1;
        }

        /* renamed from: b */
        public final List<u0> invoke(wd.f fVar) {
            List<u0> F0;
            List<u0> F02;
            t.e(fVar, "name");
            ArrayList arrayList = new ArrayList();
            ye.a.a(arrayList, j.this.f14962f.invoke(fVar));
            j.this.s(fVar, arrayList);
            if (ae.d.t(j.this.C())) {
                F02 = c0.F0(arrayList);
                return F02;
            }
            F0 = c0.F0(j.this.w().a().r().g(j.this.w(), arrayList));
            return F0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class k extends v implements gc.a<Set<? extends wd.f>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k() {
            super(0);
            j.this = r1;
        }

        /* renamed from: b */
        public final Set<wd.f> invoke() {
            return j.this.t(he.d.f11853v, null);
        }
    }

    /* loaded from: classes.dex */
    public static final class l extends v implements gc.a<ne.j<? extends ce.g<?>>> {

        /* renamed from: d */
        final /* synthetic */ n f14986d;

        /* renamed from: q */
        final /* synthetic */ ad.c0 f14987q;

        /* loaded from: classes.dex */
        public static final class a extends v implements gc.a<ce.g<?>> {

            /* renamed from: c */
            final /* synthetic */ j f14988c;

            /* renamed from: d */
            final /* synthetic */ n f14989d;

            /* renamed from: q */
            final /* synthetic */ ad.c0 f14990q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(j jVar, n nVar, ad.c0 c0Var) {
                super(0);
                this.f14988c = jVar;
                this.f14989d = nVar;
                this.f14990q = c0Var;
            }

            /* renamed from: b */
            public final ce.g<?> invoke() {
                return this.f14988c.w().a().g().a(this.f14989d, this.f14990q);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(n nVar, ad.c0 c0Var) {
            super(0);
            j.this = r1;
            this.f14986d = nVar;
            this.f14987q = c0Var;
        }

        /* renamed from: b */
        public final ne.j<ce.g<?>> invoke() {
            return j.this.w().e().f(new a(j.this, this.f14986d, this.f14987q));
        }
    }

    /* loaded from: classes.dex */
    public static final class m extends v implements gc.l<z0, xc.a> {

        /* renamed from: c */
        public static final m f14991c = new m();

        m() {
            super(1);
        }

        /* renamed from: b */
        public final xc.a invoke(z0 z0Var) {
            t.e(z0Var, "$this$selectMostSpecificInEachOverridableGroup");
            return z0Var;
        }
    }

    public j(jd.g gVar, j jVar) {
        List h10;
        t.e(gVar, "c");
        this.f14957a = gVar;
        this.f14958b = jVar;
        ne.n e10 = gVar.e();
        c cVar = new c();
        h10 = u.h();
        this.f14959c = e10.g(cVar, h10);
        this.f14960d = gVar.e().d(new g());
        this.f14961e = gVar.e().b(new f());
        this.f14962f = gVar.e().i(new e());
        this.f14963g = gVar.e().b(new i());
        this.f14964h = gVar.e().d(new h());
        this.f14965i = gVar.e().d(new k());
        this.f14966j = gVar.e().d(new d());
        this.f14967k = gVar.e().b(new C0222j());
    }

    public /* synthetic */ j(jd.g gVar, j jVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(gVar, (i10 & 2) != 0 ? null : jVar);
    }

    private final Set<wd.f> A() {
        return (Set) ne.m.a(this.f14964h, this, f14956l[0]);
    }

    private final Set<wd.f> D() {
        return (Set) ne.m.a(this.f14965i, this, f14956l[1]);
    }

    private final oe.e0 E(n nVar) {
        boolean z10 = false;
        oe.e0 o10 = this.f14957a.g().o(nVar.getType(), ld.d.d(hd.k.COMMON, false, null, 3, null));
        if ((uc.h.r0(o10) || uc.h.u0(o10)) && F(nVar) && nVar.R()) {
            z10 = true;
        }
        if (z10) {
            oe.e0 n10 = n1.n(o10);
            t.d(n10, "makeNotNullable(propertyType)");
            return n10;
        }
        return o10;
    }

    private final boolean F(n nVar) {
        return nVar.B() && nVar.m();
    }

    public final u0 J(n nVar) {
        List<? extends f1> h10;
        List<x0> h11;
        ad.c0 u10 = u(nVar);
        u10.e1(null, null, null, null);
        oe.e0 E = E(nVar);
        h10 = u.h();
        x0 z10 = z();
        h11 = u.h();
        u10.k1(E, h10, z10, null, h11);
        if (ae.d.K(u10, u10.getType())) {
            u10.U0(new l(nVar, u10));
        }
        this.f14957a.a().h().a(nVar, u10);
        return u10;
    }

    public final void L(Set<z0> set) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : set) {
            String c10 = pd.v.c((z0) obj, false, false, 2, null);
            Object obj2 = linkedHashMap.get(c10);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(c10, obj2);
            }
            ((List) obj2).add(obj);
        }
        for (List list : linkedHashMap.values()) {
            if (list.size() != 1) {
                Collection<? extends z0> a10 = ae.l.a(list, m.f14991c);
                set.removeAll(list);
                set.addAll(a10);
            }
        }
    }

    private final ad.c0 u(n nVar) {
        id.f o12 = id.f.o1(C(), jd.e.a(this.f14957a, nVar), xc.e0.FINAL, i0.c(nVar.g()), !nVar.B(), nVar.getName(), this.f14957a.a().t().a(nVar), F(nVar));
        t.d(o12, "create(\n            owne…d.isFinalStatic\n        )");
        return o12;
    }

    private final Set<wd.f> x() {
        return (Set) ne.m.a(this.f14966j, this, f14956l[2]);
    }

    public final j B() {
        return this.f14958b;
    }

    protected abstract xc.m C();

    protected boolean G(id.e eVar) {
        t.e(eVar, "<this>");
        return true;
    }

    protected abstract a H(r rVar, List<? extends f1> list, oe.e0 e0Var, List<? extends j1> list2);

    public final id.e I(r rVar) {
        int s10;
        List<x0> h10;
        Map<? extends a.AbstractC0451a<?>, ?> map;
        Object V;
        t.e(rVar, "method");
        id.e y12 = id.e.y1(C(), jd.e.a(this.f14957a, rVar), rVar.getName(), this.f14957a.a().t().a(rVar), this.f14960d.invoke().d(rVar.getName()) != null && rVar.o().isEmpty());
        t.d(y12, "createJavaMethod(\n      …eters.isEmpty()\n        )");
        jd.g f10 = jd.a.f(this.f14957a, y12, rVar, 0, 4, null);
        List<y> p10 = rVar.p();
        s10 = ub.v.s(p10, 10);
        List<? extends f1> arrayList = new ArrayList<>(s10);
        for (y yVar : p10) {
            f1 a10 = f10.f().a(yVar);
            t.b(a10);
            arrayList.add(a10);
        }
        b K = K(f10, y12, rVar.o());
        a H = H(rVar, arrayList, q(rVar, f10), K.a());
        oe.e0 c10 = H.c();
        x0 h11 = c10 != null ? ae.c.h(y12, c10, yc.g.Companion.b()) : null;
        x0 z10 = z();
        h10 = u.h();
        List<f1> e10 = H.e();
        List<j1> f11 = H.f();
        oe.e0 d10 = H.d();
        xc.e0 a11 = xc.e0.Companion.a(false, rVar.I(), !rVar.B());
        xc.u c11 = i0.c(rVar.g());
        if (H.c() != null) {
            a.AbstractC0451a<j1> abstractC0451a = id.e.f12492v4;
            V = c0.V(K.a());
            map = p0.e(x.a(abstractC0451a, V));
        } else {
            map = q0.h();
        }
        y12.x1(h11, z10, h10, e10, f11, d10, a11, c11, map);
        y12.B1(H.b(), K.b());
        if (!H.a().isEmpty()) {
            f10.a().s().b(y12, H.a());
        }
        return y12;
    }

    public final b K(jd.g gVar, xc.y yVar, List<? extends b0> list) {
        Iterable<h0> L0;
        int s10;
        List F0;
        tb.r rVar;
        wd.f fVar;
        jd.g gVar2 = gVar;
        t.e(gVar2, "c");
        t.e(yVar, "function");
        t.e(list, "jValueParameters");
        L0 = c0.L0(list);
        s10 = ub.v.s(L0, 10);
        ArrayList arrayList = new ArrayList(s10);
        boolean z10 = false;
        boolean z11 = false;
        for (h0 h0Var : L0) {
            int a10 = h0Var.a();
            b0 b0Var = (b0) h0Var.b();
            yc.g a11 = jd.e.a(gVar2, b0Var);
            nd.f fVar2 = null;
            ld.a d10 = ld.d.d(hd.k.COMMON, z10, null, 3, null);
            if (b0Var.b()) {
                nd.x type = b0Var.getType();
                if (type instanceof nd.f) {
                    fVar2 = (nd.f) type;
                }
                if (fVar2 == null) {
                    throw new AssertionError("Vararg parameter should be an array: " + b0Var);
                }
                oe.e0 k10 = gVar.g().k(fVar2, d10, true);
                rVar = x.a(k10, gVar.d().x().k(k10));
            } else {
                rVar = x.a(gVar.g().o(b0Var.getType(), d10), null);
            }
            oe.e0 e0Var = (oe.e0) rVar.b();
            oe.e0 e0Var2 = (oe.e0) rVar.c();
            if (!t.a(yVar.getName().b(), "equals") || list.size() != 1 || !t.a(gVar.d().x().I(), e0Var)) {
                fVar = b0Var.getName();
                if (fVar == null) {
                    z11 = true;
                }
                if (fVar == null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append('p');
                    sb2.append(a10);
                    fVar = wd.f.j(sb2.toString());
                    t.d(fVar, "identifier(\"p$index\")");
                }
            } else {
                fVar = wd.f.j("other");
            }
            wd.f fVar3 = fVar;
            t.d(fVar3, "if (function.name.asStri…(\"p$index\")\n            }");
            ArrayList arrayList2 = arrayList;
            arrayList2.add(new l0(yVar, null, a10, a11, fVar3, e0Var, false, false, false, e0Var2, gVar.a().t().a(b0Var)));
            arrayList = arrayList2;
            z11 = z11;
            z10 = z10;
            gVar2 = gVar;
        }
        F0 = c0.F0(arrayList);
        return new b(F0, z11);
    }

    @Override // he.i, he.h
    public Collection<u0> a(wd.f fVar, fd.b bVar) {
        List h10;
        t.e(fVar, "name");
        t.e(bVar, "location");
        if (!d().contains(fVar)) {
            h10 = u.h();
            return h10;
        }
        return this.f14967k.invoke(fVar);
    }

    @Override // he.i, he.h
    public Collection<z0> b(wd.f fVar, fd.b bVar) {
        List h10;
        t.e(fVar, "name");
        t.e(bVar, "location");
        if (!c().contains(fVar)) {
            h10 = u.h();
            return h10;
        }
        return this.f14963g.invoke(fVar);
    }

    @Override // he.i, he.h
    public Set<wd.f> c() {
        return A();
    }

    @Override // he.i, he.h
    public Set<wd.f> d() {
        return D();
    }

    @Override // he.i, he.k
    public Collection<xc.m> e(he.d dVar, gc.l<? super wd.f, Boolean> lVar) {
        t.e(dVar, "kindFilter");
        t.e(lVar, "nameFilter");
        return this.f14959c.invoke();
    }

    @Override // he.i, he.h
    public Set<wd.f> g() {
        return x();
    }

    protected abstract Set<wd.f> l(he.d dVar, gc.l<? super wd.f, Boolean> lVar);

    protected final List<xc.m> m(he.d dVar, gc.l<? super wd.f, Boolean> lVar) {
        List<xc.m> F0;
        t.e(dVar, "kindFilter");
        t.e(lVar, "nameFilter");
        fd.d dVar2 = fd.d.WHEN_GET_ALL_DESCRIPTORS;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (dVar.a(he.d.Companion.c())) {
            for (wd.f fVar : l(dVar, lVar)) {
                if (lVar.invoke(fVar).booleanValue()) {
                    ye.a.a(linkedHashSet, f(fVar, dVar2));
                }
            }
        }
        if (dVar.a(he.d.Companion.d()) && !dVar.l().contains(c.a.f11831a)) {
            for (wd.f fVar2 : n(dVar, lVar)) {
                if (lVar.invoke(fVar2).booleanValue()) {
                    linkedHashSet.addAll(b(fVar2, dVar2));
                }
            }
        }
        if (dVar.a(he.d.Companion.i()) && !dVar.l().contains(c.a.f11831a)) {
            for (wd.f fVar3 : t(dVar, lVar)) {
                if (lVar.invoke(fVar3).booleanValue()) {
                    linkedHashSet.addAll(a(fVar3, dVar2));
                }
            }
        }
        F0 = c0.F0(linkedHashSet);
        return F0;
    }

    protected abstract Set<wd.f> n(he.d dVar, gc.l<? super wd.f, Boolean> lVar);

    protected void o(Collection<z0> collection, wd.f fVar) {
        t.e(collection, "result");
        t.e(fVar, "name");
    }

    protected abstract kd.b p();

    public final oe.e0 q(r rVar, jd.g gVar) {
        t.e(rVar, "method");
        t.e(gVar, "c");
        return gVar.g().o(rVar.e(), ld.d.d(hd.k.COMMON, rVar.S().E(), null, 2, null));
    }

    protected abstract void r(Collection<z0> collection, wd.f fVar);

    protected abstract void s(wd.f fVar, Collection<u0> collection);

    protected abstract Set<wd.f> t(he.d dVar, gc.l<? super wd.f, Boolean> lVar);

    public String toString() {
        return "Lazy scope for " + C();
    }

    public final ne.i<Collection<xc.m>> v() {
        return this.f14959c;
    }

    public final jd.g w() {
        return this.f14957a;
    }

    public final ne.i<kd.b> y() {
        return this.f14960d;
    }

    protected abstract x0 z();
}
