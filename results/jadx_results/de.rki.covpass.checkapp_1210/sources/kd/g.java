package kd;

import ad.d0;
import ad.l0;
import ae.j;
import gd.a0;
import gd.g0;
import gd.h0;
import gd.i0;
import gd.o;
import gd.s;
import gd.z;
import hc.k0;
import hc.p;
import hc.t;
import hc.v;
import hd.j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kd.j;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nd.n;
import nd.q;
import nd.r;
import nd.w;
import nd.x;
import oe.e0;
import oe.n1;
import ub.c0;
import ub.p0;
import ub.u;
import xc.f1;
import xc.j1;
import xc.u0;
import xc.v0;
import xc.x0;
import xc.y;
import xc.z0;
import ye.f;
/* loaded from: classes.dex */
public final class g extends kd.j {

    /* renamed from: m */
    private final xc.e f14917m;

    /* renamed from: n */
    private final nd.g f14918n;

    /* renamed from: o */
    private final boolean f14919o;

    /* renamed from: p */
    private final ne.i<List<xc.d>> f14920p;

    /* renamed from: q */
    private final ne.i<Set<wd.f>> f14921q;

    /* renamed from: r */
    private final ne.i<Map<wd.f, n>> f14922r;

    /* renamed from: s */
    private final ne.h<wd.f, ad.g> f14923s;

    /* loaded from: classes.dex */
    public static final class a extends v implements gc.l<q, Boolean> {

        /* renamed from: c */
        public static final a f14924c = new a();

        a() {
            super(1);
        }

        /* renamed from: b */
        public final Boolean invoke(q qVar) {
            t.e(qVar, "it");
            return Boolean.valueOf(!qVar.m());
        }
    }

    /* loaded from: classes.dex */
    /* synthetic */ class b extends p implements gc.l<wd.f, Collection<? extends z0>> {
        b(Object obj) {
            super(1, obj);
        }

        @Override // hc.h
        public final oc.f e0() {
            return k0.b(g.class);
        }

        @Override // hc.h
        public final String g0() {
            return "searchMethodsByNameWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
        }

        @Override // hc.h, oc.c
        public final String getName() {
            return "searchMethodsByNameWithoutBuiltinMagic";
        }

        /* renamed from: i0 */
        public final Collection<z0> invoke(wd.f fVar) {
            t.e(fVar, "p0");
            return ((g) this.f11756d).I0(fVar);
        }
    }

    /* loaded from: classes.dex */
    /* synthetic */ class c extends p implements gc.l<wd.f, Collection<? extends z0>> {
        c(Object obj) {
            super(1, obj);
        }

        @Override // hc.h
        public final oc.f e0() {
            return k0.b(g.class);
        }

        @Override // hc.h
        public final String g0() {
            return "searchMethodsInSupertypesWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
        }

        @Override // hc.h, oc.c
        public final String getName() {
            return "searchMethodsInSupertypesWithoutBuiltinMagic";
        }

        /* renamed from: i0 */
        public final Collection<z0> invoke(wd.f fVar) {
            t.e(fVar, "p0");
            return ((g) this.f11756d).J0(fVar);
        }
    }

    /* loaded from: classes.dex */
    static final class d extends v implements gc.l<wd.f, Collection<? extends z0>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d() {
            super(1);
            g.this = r1;
        }

        /* renamed from: b */
        public final Collection<z0> invoke(wd.f fVar) {
            t.e(fVar, "it");
            return g.this.I0(fVar);
        }
    }

    /* loaded from: classes.dex */
    static final class e extends v implements gc.l<wd.f, Collection<? extends z0>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e() {
            super(1);
            g.this = r1;
        }

        /* renamed from: b */
        public final Collection<z0> invoke(wd.f fVar) {
            t.e(fVar, "it");
            return g.this.J0(fVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class f extends v implements gc.a<List<? extends xc.d>> {

        /* renamed from: d */
        final /* synthetic */ jd.g f14928d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(jd.g gVar) {
            super(0);
            g.this = r1;
            this.f14928d = gVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List] */
        @Override // gc.a
        public final List<? extends xc.d> invoke() {
            List<? extends xc.d> F0;
            ?? l10;
            Collection<nd.k> k10 = g.this.f14918n.k();
            ArrayList<xc.d> arrayList = new ArrayList(k10.size());
            for (nd.k kVar : k10) {
                arrayList.add(g.this.G0(kVar));
            }
            if (g.this.f14918n.L()) {
                xc.d e02 = g.this.e0();
                boolean z10 = false;
                String c10 = pd.v.c(e02, false, false, 2, null);
                if (!arrayList.isEmpty()) {
                    for (xc.d dVar : arrayList) {
                        if (t.a(pd.v.c(dVar, false, false, 2, null), c10)) {
                            break;
                        }
                    }
                }
                z10 = true;
                if (z10) {
                    arrayList.add(e02);
                    this.f14928d.a().h().d(g.this.f14918n, e02);
                }
            }
            this.f14928d.a().w().b(g.this.C(), arrayList);
            od.l r10 = this.f14928d.a().r();
            jd.g gVar = this.f14928d;
            g gVar2 = g.this;
            boolean isEmpty = arrayList.isEmpty();
            ArrayList arrayList2 = arrayList;
            if (isEmpty) {
                l10 = u.l(gVar2.d0());
                arrayList2 = l10;
            }
            F0 = c0.F0(r10.g(gVar, arrayList2));
            return F0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: kd.g$g */
    /* loaded from: classes.dex */
    public static final class C0220g extends v implements gc.a<Map<wd.f, ? extends n>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0220g() {
            super(0);
            g.this = r1;
        }

        /* renamed from: b */
        public final Map<wd.f, n> invoke() {
            int s10;
            int d10;
            int b10;
            Collection<n> x10 = g.this.f14918n.x();
            ArrayList arrayList = new ArrayList();
            for (Object obj : x10) {
                if (((n) obj).C()) {
                    arrayList.add(obj);
                }
            }
            s10 = ub.v.s(arrayList, 10);
            d10 = p0.d(s10);
            b10 = nc.m.b(d10, 16);
            LinkedHashMap linkedHashMap = new LinkedHashMap(b10);
            for (Object obj2 : arrayList) {
                linkedHashMap.put(((n) obj2).getName(), obj2);
            }
            return linkedHashMap;
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends v implements gc.l<wd.f, Collection<? extends z0>> {

        /* renamed from: c */
        final /* synthetic */ z0 f14930c;

        /* renamed from: d */
        final /* synthetic */ g f14931d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(z0 z0Var, g gVar) {
            super(1);
            this.f14930c = z0Var;
            this.f14931d = gVar;
        }

        /* renamed from: b */
        public final Collection<z0> invoke(wd.f fVar) {
            List o02;
            List d10;
            t.e(fVar, "accessorName");
            if (t.a(this.f14930c.getName(), fVar)) {
                d10 = ub.t.d(this.f14930c);
                return d10;
            }
            o02 = c0.o0(this.f14931d.I0(fVar), this.f14931d.J0(fVar));
            return o02;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class i extends v implements gc.a<Set<? extends wd.f>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i() {
            super(0);
            g.this = r1;
        }

        /* renamed from: b */
        public final Set<wd.f> invoke() {
            Set<wd.f> J0;
            J0 = c0.J0(g.this.f14918n.M());
            return J0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class j extends v implements gc.l<wd.f, ad.g> {

        /* renamed from: d */
        final /* synthetic */ jd.g f14934d;

        /* loaded from: classes.dex */
        public static final class a extends v implements gc.a<Set<? extends wd.f>> {

            /* renamed from: c */
            final /* synthetic */ g f14935c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(g gVar) {
                super(0);
                this.f14935c = gVar;
            }

            /* renamed from: b */
            public final Set<wd.f> invoke() {
                Set<wd.f> h10;
                h10 = ub.z0.h(this.f14935c.c(), this.f14935c.d());
                return h10;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(jd.g gVar) {
            super(1);
            g.this = r1;
            this.f14934d = gVar;
        }

        /* renamed from: b */
        public final ad.g invoke(wd.f fVar) {
            t.e(fVar, "name");
            if (!((Set) g.this.f14921q.invoke()).contains(fVar)) {
                n nVar = (n) ((Map) g.this.f14922r.invoke()).get(fVar);
                if (nVar == null) {
                    return null;
                }
                return ad.n.U0(this.f14934d.e(), g.this.C(), fVar, this.f14934d.e().d(new a(g.this)), jd.e.a(this.f14934d, nVar), this.f14934d.a().t().a(nVar));
            }
            o d10 = this.f14934d.a().d();
            wd.b g10 = ee.a.g(g.this.C());
            t.b(g10);
            wd.b d11 = g10.d(fVar);
            t.d(d11, "ownerDescriptor.classId!…createNestedClassId(name)");
            nd.g c10 = d10.c(new o.b(d11, null, g.this.f14918n, 2, null));
            if (c10 == null) {
                return null;
            }
            jd.g gVar = this.f14934d;
            kd.f fVar2 = new kd.f(gVar, g.this.C(), c10, null, 8, null);
            gVar.a().e().a(fVar2);
            return fVar2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(jd.g gVar, xc.e eVar, nd.g gVar2, boolean z10, g gVar3) {
        super(gVar, gVar3);
        t.e(gVar, "c");
        t.e(eVar, "ownerDescriptor");
        t.e(gVar2, "jClass");
        this.f14917m = eVar;
        this.f14918n = gVar2;
        this.f14919o = z10;
        this.f14920p = gVar.e().d(new f(gVar));
        this.f14921q = gVar.e().d(new i());
        this.f14922r = gVar.e().d(new C0220g());
        this.f14923s = gVar.e().i(new j(gVar));
    }

    public /* synthetic */ g(jd.g gVar, xc.e eVar, nd.g gVar2, boolean z10, g gVar3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(gVar, eVar, gVar2, z10, (i10 & 16) != 0 ? null : gVar3);
    }

    private final boolean A0(z0 z0Var, y yVar) {
        String c10 = pd.v.c(z0Var, false, false, 2, null);
        y a10 = yVar.a();
        t.d(a10, "builtinWithErasedParameters.original");
        return t.a(c10, pd.v.c(a10, false, false, 2, null)) && !o0(z0Var, yVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
        if (gd.z.d(r4) == false) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0074 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean B0(xc.z0 r7) {
        /*
            r6 = this;
            wd.f r0 = r7.getName()
            java.lang.String r1 = "function.name"
            hc.t.d(r0, r1)
            java.util.List r0 = gd.e0.a(r0)
            boolean r1 = r0 instanceof java.util.Collection
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1b
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L1b
        L19:
            r0 = r3
            goto L78
        L1b:
            java.util.Iterator r0 = r0.iterator()
        L1f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L19
            java.lang.Object r1 = r0.next()
            wd.f r1 = (wd.f) r1
            java.util.Set r1 = r6.z0(r1)
            boolean r4 = r1 instanceof java.util.Collection
            if (r4 == 0) goto L3b
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto L3b
        L39:
            r1 = r3
            goto L75
        L3b:
            java.util.Iterator r1 = r1.iterator()
        L3f:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L39
            java.lang.Object r4 = r1.next()
            xc.u0 r4 = (xc.u0) r4
            kd.g$h r5 = new kd.g$h
            r5.<init>(r7, r6)
            boolean r5 = r6.n0(r4, r5)
            if (r5 == 0) goto L71
            boolean r4 = r4.Q()
            if (r4 != 0) goto L6f
            wd.f r4 = r7.getName()
            java.lang.String r4 = r4.b()
            java.lang.String r5 = "function.name.asString()"
            hc.t.d(r4, r5)
            boolean r4 = gd.z.d(r4)
            if (r4 != 0) goto L71
        L6f:
            r4 = r2
            goto L72
        L71:
            r4 = r3
        L72:
            if (r4 == 0) goto L3f
            r1 = r2
        L75:
            if (r1 == 0) goto L1f
            r0 = r2
        L78:
            if (r0 == 0) goto L7b
            return r3
        L7b:
            boolean r0 = r6.p0(r7)
            if (r0 != 0) goto L8e
            boolean r0 = r6.K0(r7)
            if (r0 != 0) goto L8e
            boolean r7 = r6.r0(r7)
            if (r7 != 0) goto L8e
            goto L8f
        L8e:
            r2 = r3
        L8f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kd.g.B0(xc.z0):boolean");
    }

    private final z0 C0(z0 z0Var, gc.l<? super wd.f, ? extends Collection<? extends z0>> lVar, Collection<? extends z0> collection) {
        z0 g02;
        y k10 = gd.f.k(z0Var);
        if (k10 == null || (g02 = g0(k10, lVar)) == null) {
            return null;
        }
        if (!B0(g02)) {
            g02 = null;
        }
        if (g02 == null) {
            return null;
        }
        return f0(g02, k10, collection);
    }

    private final z0 D0(z0 z0Var, gc.l<? super wd.f, ? extends Collection<? extends z0>> lVar, wd.f fVar, Collection<? extends z0> collection) {
        z0 z0Var2 = (z0) g0.d(z0Var);
        if (z0Var2 == null) {
            return null;
        }
        String b10 = g0.b(z0Var2);
        t.b(b10);
        wd.f j10 = wd.f.j(b10);
        t.d(j10, "identifier(nameInJava)");
        for (z0 z0Var3 : lVar.invoke(j10)) {
            z0 l02 = l0(z0Var3, fVar);
            if (q0(z0Var2, l02)) {
                return f0(l02, z0Var2, collection);
            }
        }
        return null;
    }

    private final z0 E0(z0 z0Var, gc.l<? super wd.f, ? extends Collection<? extends z0>> lVar) {
        if (!z0Var.s0()) {
            return null;
        }
        wd.f name = z0Var.getName();
        t.d(name, "descriptor.name");
        for (z0 z0Var2 : lVar.invoke(name)) {
            z0 m02 = m0(z0Var2);
            if (m02 == null || !o0(m02, z0Var)) {
                m02 = null;
                continue;
            }
            if (m02 != null) {
                return m02;
            }
        }
        return null;
    }

    public final id.b G0(nd.k kVar) {
        int s10;
        List<f1> o02;
        xc.e C = C();
        id.b C1 = id.b.C1(C, jd.e.a(w(), kVar), false, w().a().t().a(kVar));
        t.d(C1, "createJavaConstructor(\n …ce(constructor)\n        )");
        jd.g e10 = jd.a.e(w(), C1, kVar, C.A().size());
        j.b K = K(e10, C1, kVar.o());
        List<f1> A = C.A();
        t.d(A, "classDescriptor.declaredTypeParameters");
        List<nd.y> p10 = kVar.p();
        s10 = ub.v.s(p10, 10);
        ArrayList arrayList = new ArrayList(s10);
        for (nd.y yVar : p10) {
            f1 a10 = e10.f().a(yVar);
            t.b(a10);
            arrayList.add(a10);
        }
        o02 = c0.o0(A, arrayList);
        C1.A1(K.a(), i0.c(kVar.g()), o02);
        C1.h1(false);
        C1.i1(K.b());
        C1.p1(C.u());
        e10.a().h().d(kVar, C1);
        return C1;
    }

    private final id.e H0(w wVar) {
        List<x0> h10;
        List<? extends f1> h11;
        List<j1> h12;
        id.e y12 = id.e.y1(C(), jd.e.a(w(), wVar), wVar.getName(), w().a().t().a(wVar), true);
        t.d(y12, "createJavaMethod(\n      …omponent), true\n        )");
        e0 o10 = w().g().o(wVar.getType(), ld.d.d(hd.k.COMMON, false, null, 2, null));
        x0 z10 = z();
        h10 = u.h();
        h11 = u.h();
        h12 = u.h();
        y12.x1(null, z10, h10, h11, h12, o10, xc.e0.Companion.a(false, false, true), xc.t.f25581e, null);
        y12.B1(false, false);
        w().a().h().b(wVar, y12);
        return y12;
    }

    public final Collection<z0> I0(wd.f fVar) {
        int s10;
        Collection<r> a10 = y().invoke().a(fVar);
        s10 = ub.v.s(a10, 10);
        ArrayList arrayList = new ArrayList(s10);
        for (r rVar : a10) {
            arrayList.add(I(rVar));
        }
        return arrayList;
    }

    public final Collection<z0> J0(wd.f fVar) {
        Set<z0> x02 = x0(fVar);
        ArrayList arrayList = new ArrayList();
        for (Object obj : x02) {
            z0 z0Var = (z0) obj;
            if (!(g0.a(z0Var) || gd.f.k(z0Var) != null)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final boolean K0(z0 z0Var) {
        gd.f fVar = gd.f.f10690m;
        wd.f name = z0Var.getName();
        t.d(name, "name");
        if (!fVar.l(name)) {
            return false;
        }
        wd.f name2 = z0Var.getName();
        t.d(name2, "name");
        Set<z0> x02 = x0(name2);
        ArrayList<y> arrayList = new ArrayList();
        for (z0 z0Var2 : x02) {
            y k10 = gd.f.k(z0Var2);
            if (k10 != null) {
                arrayList.add(k10);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        for (y yVar : arrayList) {
            if (A0(z0Var, yVar)) {
                return true;
            }
        }
        return false;
    }

    private final void U(List<j1> list, xc.l lVar, int i10, r rVar, e0 e0Var, e0 e0Var2) {
        yc.g b10 = yc.g.Companion.b();
        wd.f name = rVar.getName();
        e0 n10 = n1.n(e0Var);
        t.d(n10, "makeNotNullable(returnType)");
        list.add(new l0(lVar, null, i10, b10, name, n10, rVar.N(), false, false, e0Var2 != null ? n1.n(e0Var2) : null, w().a().t().a(rVar)));
    }

    private final void V(Collection<z0> collection, wd.f fVar, Collection<? extends z0> collection2, boolean z10) {
        List o02;
        int s10;
        Collection<? extends z0> d10 = hd.a.d(fVar, collection2, collection, C(), w().a().c(), w().a().k().a());
        t.d(d10, "resolveOverridesForNonSt….overridingUtil\n        )");
        if (!z10) {
            collection.addAll(d10);
            return;
        }
        o02 = c0.o0(collection, d10);
        s10 = ub.v.s(d10, 10);
        ArrayList arrayList = new ArrayList(s10);
        for (z0 z0Var : d10) {
            z0 z0Var2 = (z0) g0.e(z0Var);
            t.d(z0Var, "resolvedOverride");
            if (z0Var2 != null) {
                z0Var = f0(z0Var, z0Var2, o02);
            }
            arrayList.add(z0Var);
        }
        collection.addAll(arrayList);
    }

    private final void W(wd.f fVar, Collection<? extends z0> collection, Collection<? extends z0> collection2, Collection<z0> collection3, gc.l<? super wd.f, ? extends Collection<? extends z0>> lVar) {
        for (z0 z0Var : collection2) {
            ye.a.a(collection3, D0(z0Var, lVar, fVar, collection));
            ye.a.a(collection3, C0(z0Var, lVar, collection));
            ye.a.a(collection3, E0(z0Var, lVar));
        }
    }

    private final void X(Set<? extends u0> set, Collection<u0> collection, Set<u0> set2, gc.l<? super wd.f, ? extends Collection<? extends z0>> lVar) {
        for (u0 u0Var : set) {
            id.f h02 = h0(u0Var, lVar);
            if (h02 != null) {
                collection.add(h02);
                if (set2 == null) {
                    return;
                }
                set2.add(u0Var);
                return;
            }
        }
    }

    private final void Y(wd.f fVar, Collection<u0> collection) {
        Object t02;
        t02 = c0.t0(y().invoke().a(fVar));
        r rVar = (r) t02;
        if (rVar == null) {
            return;
        }
        collection.add(j0(this, rVar, null, xc.e0.FINAL, 2, null));
    }

    private final Collection<e0> b0() {
        if (this.f14919o) {
            Collection<e0> l10 = C().r().l();
            t.d(l10, "ownerDescriptor.typeConstructor.supertypes");
            return l10;
        }
        return w().a().k().c().g(C());
    }

    private final List<j1> c0(ad.f fVar) {
        Object X;
        tb.r rVar;
        Collection<r> O = this.f14918n.O();
        ArrayList arrayList = new ArrayList(O.size());
        int i10 = 1;
        ld.a d10 = ld.d.d(hd.k.COMMON, true, null, 2, null);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : O) {
            if (t.a(((r) obj).getName(), a0.f10634c)) {
                arrayList2.add(obj);
            } else {
                arrayList3.add(obj);
            }
        }
        tb.r rVar2 = new tb.r(arrayList2, arrayList3);
        List list = (List) rVar2.b();
        List<r> list2 = (List) rVar2.c();
        list.size();
        X = c0.X(list);
        r rVar3 = (r) X;
        if (rVar3 != null) {
            x e10 = rVar3.e();
            if (e10 instanceof nd.f) {
                nd.f fVar2 = (nd.f) e10;
                rVar = new tb.r(w().g().k(fVar2, d10, true), w().g().o(fVar2.w(), d10));
            } else {
                rVar = new tb.r(w().g().o(e10, d10), null);
            }
            U(arrayList, fVar, 0, rVar3, (e0) rVar.b(), (e0) rVar.c());
        }
        int i11 = 0;
        if (rVar3 == null) {
            i10 = 0;
        }
        for (r rVar4 : list2) {
            U(arrayList, fVar, i11 + i10, rVar4, w().g().o(rVar4.e(), d10), null);
            i11++;
        }
        return arrayList;
    }

    public final xc.d d0() {
        boolean E = this.f14918n.E();
        if ((this.f14918n.H() || !this.f14918n.P()) && !E) {
            return null;
        }
        xc.e C = C();
        id.b C1 = id.b.C1(C, yc.g.Companion.b(), true, w().a().t().a(this.f14918n));
        t.d(C1, "createJavaConstructor(\n ….source(jClass)\n        )");
        List<j1> c02 = E ? c0(C1) : Collections.emptyList();
        C1.i1(false);
        C1.z1(c02, v0(C));
        C1.h1(true);
        C1.p1(C.u());
        w().a().h().d(this.f14918n, C1);
        return C1;
    }

    public final xc.d e0() {
        xc.e C = C();
        id.b C1 = id.b.C1(C, yc.g.Companion.b(), true, w().a().t().a(this.f14918n));
        t.d(C1, "createJavaConstructor(\n ….source(jClass)\n        )");
        List<j1> k02 = k0(C1);
        C1.i1(false);
        C1.z1(k02, v0(C));
        C1.h1(false);
        C1.p1(C.u());
        return C1;
    }

    private final z0 f0(z0 z0Var, xc.a aVar, Collection<? extends z0> collection) {
        boolean z10;
        boolean z11 = false;
        if (!(collection instanceof Collection) || !collection.isEmpty()) {
            for (z0 z0Var2 : collection) {
                if (t.a(z0Var, z0Var2) || z0Var2.G() != null || !o0(z0Var2, aVar)) {
                    z10 = false;
                    continue;
                } else {
                    z10 = true;
                    continue;
                }
                if (z10) {
                    break;
                }
            }
        }
        z11 = true;
        if (z11) {
            return z0Var;
        }
        z0 b10 = z0Var.y().j().b();
        t.b(b10);
        return b10;
    }

    private final z0 g0(y yVar, gc.l<? super wd.f, ? extends Collection<? extends z0>> lVar) {
        Object obj;
        int s10;
        wd.f name = yVar.getName();
        t.d(name, "overridden.name");
        Iterator<T> it = lVar.invoke(name).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (A0((z0) obj, yVar)) {
                break;
            }
        }
        z0 z0Var = (z0) obj;
        if (z0Var != null) {
            y.a<? extends z0> y10 = z0Var.y();
            List<j1> o10 = yVar.o();
            t.d(o10, "overridden.valueParameters");
            s10 = ub.v.s(o10, 10);
            ArrayList arrayList = new ArrayList(s10);
            for (j1 j1Var : o10) {
                arrayList.add(j1Var.getType());
            }
            List<j1> o11 = z0Var.o();
            t.d(o11, "override.valueParameters");
            y10.f(id.h.a(arrayList, o11, yVar));
            y10.u();
            y10.l();
            y10.d(id.e.f12493w4, Boolean.TRUE);
            return y10.b();
        }
        return null;
    }

    private final id.f h0(u0 u0Var, gc.l<? super wd.f, ? extends Collection<? extends z0>> lVar) {
        z0 z0Var;
        List<? extends f1> h10;
        List<x0> h11;
        Object X;
        ad.e0 e0Var = null;
        if (!n0(u0Var, lVar)) {
            return null;
        }
        z0 t02 = t0(u0Var, lVar);
        t.b(t02);
        if (u0Var.Q()) {
            z0Var = u0(u0Var, lVar);
            t.b(z0Var);
        } else {
            z0Var = null;
        }
        if (z0Var != null) {
            z0Var.s();
            t02.s();
        }
        id.d dVar = new id.d(C(), t02, z0Var, u0Var);
        e0 e10 = t02.e();
        t.b(e10);
        h10 = u.h();
        x0 z10 = z();
        h11 = u.h();
        dVar.k1(e10, h10, z10, null, h11);
        d0 j10 = ae.c.j(dVar, t02.j(), false, false, false, t02.m());
        j10.W0(t02);
        j10.Z0(dVar.getType());
        t.d(j10, "createGetter(\n          …escriptor.type)\n        }");
        if (z0Var != null) {
            List<j1> o10 = z0Var.o();
            t.d(o10, "setterMethod.valueParameters");
            X = c0.X(o10);
            j1 j1Var = (j1) X;
            if (j1Var == null) {
                throw new AssertionError("No parameter found for " + z0Var);
            }
            e0Var = ae.c.l(dVar, z0Var.j(), j1Var.j(), false, false, false, z0Var.g(), z0Var.m());
            e0Var.W0(z0Var);
        }
        dVar.d1(j10, e0Var);
        return dVar;
    }

    private final id.f i0(r rVar, e0 e0Var, xc.e0 e0Var2) {
        List<? extends f1> h10;
        List<x0> h11;
        id.f o12 = id.f.o1(C(), jd.e.a(w(), rVar), e0Var2, i0.c(rVar.g()), false, rVar.getName(), w().a().t().a(rVar), false);
        t.d(o12, "create(\n            owne…inal = */ false\n        )");
        d0 d10 = ae.c.d(o12, yc.g.Companion.b());
        t.d(d10, "createDefaultGetter(prop…iptor, Annotations.EMPTY)");
        o12.d1(d10, null);
        e0 q10 = e0Var == null ? q(rVar, jd.a.f(w(), o12, rVar, 0, 4, null)) : e0Var;
        h10 = u.h();
        x0 z10 = z();
        h11 = u.h();
        o12.k1(q10, h10, z10, null, h11);
        d10.Z0(q10);
        return o12;
    }

    static /* synthetic */ id.f j0(g gVar, r rVar, e0 e0Var, xc.e0 e0Var2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            e0Var = null;
        }
        return gVar.i0(rVar, e0Var, e0Var2);
    }

    private final List<j1> k0(ad.f fVar) {
        Collection<w> u10 = this.f14918n.u();
        ArrayList arrayList = new ArrayList(u10.size());
        e0 e0Var = null;
        ld.a d10 = ld.d.d(hd.k.COMMON, false, null, 2, null);
        int i10 = 0;
        for (w wVar : u10) {
            int i11 = i10 + 1;
            e0 o10 = w().g().o(wVar.getType(), d10);
            arrayList.add(new l0(fVar, null, i10, yc.g.Companion.b(), wVar.getName(), o10, false, false, false, wVar.b() ? w().a().m().x().k(o10) : e0Var, w().a().t().a(wVar)));
            i10 = i11;
            e0Var = null;
        }
        return arrayList;
    }

    private final z0 l0(z0 z0Var, wd.f fVar) {
        y.a<? extends z0> y10 = z0Var.y();
        y10.n(fVar);
        y10.u();
        y10.l();
        z0 b10 = y10.b();
        t.b(b10);
        return b10;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final xc.z0 m0(xc.z0 r6) {
        /*
            r5 = this;
            java.util.List r0 = r6.o()
            java.lang.String r1 = "valueParameters"
            hc.t.d(r0, r1)
            java.lang.Object r0 = ub.s.i0(r0)
            xc.j1 r0 = (xc.j1) r0
            r2 = 0
            if (r0 == 0) goto L7e
            oe.e0 r3 = r0.getType()
            oe.e1 r3 = r3.W0()
            xc.h r3 = r3.z()
            if (r3 == 0) goto L35
            wd.d r3 = ee.a.i(r3)
            if (r3 == 0) goto L35
            boolean r4 = r3.f()
            if (r4 == 0) goto L2d
            goto L2e
        L2d:
            r3 = r2
        L2e:
            if (r3 == 0) goto L35
            wd.c r3 = r3.l()
            goto L36
        L35:
            r3 = r2
        L36:
            wd.c r4 = uc.k.f23453m
            boolean r3 = hc.t.a(r3, r4)
            if (r3 == 0) goto L3f
            goto L40
        L3f:
            r0 = r2
        L40:
            if (r0 != 0) goto L43
            goto L7e
        L43:
            xc.y$a r2 = r6.y()
            java.util.List r6 = r6.o()
            hc.t.d(r6, r1)
            r1 = 1
            java.util.List r6 = ub.s.Q(r6, r1)
            xc.y$a r6 = r2.f(r6)
            oe.e0 r0 = r0.getType()
            java.util.List r0 = r0.U0()
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            oe.g1 r0 = (oe.g1) r0
            oe.e0 r0 = r0.getType()
            xc.y$a r6 = r6.r(r0)
            xc.y r6 = r6.b()
            xc.z0 r6 = (xc.z0) r6
            r0 = r6
            ad.g0 r0 = (ad.g0) r0
            if (r0 != 0) goto L7a
            goto L7d
        L7a:
            r0.q1(r1)
        L7d:
            return r6
        L7e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kd.g.m0(xc.z0):xc.z0");
    }

    private final boolean n0(u0 u0Var, gc.l<? super wd.f, ? extends Collection<? extends z0>> lVar) {
        if (kd.c.a(u0Var)) {
            return false;
        }
        z0 t02 = t0(u0Var, lVar);
        z0 u02 = u0(u0Var, lVar);
        if (t02 == null) {
            return false;
        }
        if (!u0Var.Q()) {
            return true;
        }
        return u02 != null && u02.s() == t02.s();
    }

    private final boolean o0(xc.a aVar, xc.a aVar2) {
        j.i.a c10 = ae.j.f444f.F(aVar2, aVar, true).c();
        t.d(c10, "DEFAULT.isOverridableByW…iptor, this, true).result");
        return c10 == j.i.a.OVERRIDABLE && !s.Companion.a(aVar2, aVar);
    }

    private final boolean p0(z0 z0Var) {
        h0.a aVar = h0.Companion;
        wd.f name = z0Var.getName();
        t.d(name, "name");
        wd.f b10 = aVar.b(name);
        if (b10 == null) {
            return false;
        }
        Set<z0> x02 = x0(b10);
        ArrayList<z0> arrayList = new ArrayList();
        for (Object obj : x02) {
            if (g0.a((z0) obj)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        z0 l02 = l0(z0Var, b10);
        if (arrayList.isEmpty()) {
            return false;
        }
        for (z0 z0Var2 : arrayList) {
            if (q0(z0Var2, l02)) {
                return true;
            }
        }
        return false;
    }

    private final boolean q0(z0 z0Var, y yVar) {
        if (gd.e.f10688m.k(z0Var)) {
            yVar = yVar.a();
        }
        t.d(yVar, "if (superDescriptor.isRe…iginal else subDescriptor");
        return o0(yVar, z0Var);
    }

    private final boolean r0(z0 z0Var) {
        boolean z10;
        z0 m02 = m0(z0Var);
        if (m02 == null) {
            return false;
        }
        wd.f name = z0Var.getName();
        t.d(name, "name");
        Set<z0> x02 = x0(name);
        if ((x02 instanceof Collection) && x02.isEmpty()) {
            return false;
        }
        for (z0 z0Var2 : x02) {
            if (!z0Var2.s0() || !o0(m02, z0Var2)) {
                z10 = false;
                continue;
            } else {
                z10 = true;
                continue;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    private final z0 s0(u0 u0Var, String str, gc.l<? super wd.f, ? extends Collection<? extends z0>> lVar) {
        z0 z0Var;
        wd.f j10 = wd.f.j(str);
        t.d(j10, "identifier(getterName)");
        Iterator<T> it = lVar.invoke(j10).iterator();
        do {
            z0Var = null;
            if (!it.hasNext()) {
                break;
            }
            z0 z0Var2 = (z0) it.next();
            if (z0Var2.o().size() == 0) {
                pe.e eVar = pe.e.f19146a;
                e0 e10 = z0Var2.e();
                if (e10 == null ? false : eVar.d(e10, u0Var.getType())) {
                    z0Var = z0Var2;
                    continue;
                } else {
                    continue;
                }
            }
        } while (z0Var == null);
        return z0Var;
    }

    private final z0 t0(u0 u0Var, gc.l<? super wd.f, ? extends Collection<? extends z0>> lVar) {
        v0 i10 = u0Var.i();
        String str = null;
        v0 v0Var = i10 != null ? (v0) g0.d(i10) : null;
        if (v0Var != null) {
            str = gd.i.f10730a.a(v0Var);
        }
        if (str == null || g0.f(C(), v0Var)) {
            String b10 = u0Var.getName().b();
            t.d(b10, "name.asString()");
            return s0(u0Var, z.b(b10), lVar);
        }
        return s0(u0Var, str, lVar);
    }

    private final z0 u0(u0 u0Var, gc.l<? super wd.f, ? extends Collection<? extends z0>> lVar) {
        z0 z0Var;
        e0 e10;
        Object s02;
        String b10 = u0Var.getName().b();
        t.d(b10, "name.asString()");
        wd.f j10 = wd.f.j(z.e(b10));
        t.d(j10, "identifier(JvmAbi.setterName(name.asString()))");
        Iterator<T> it = lVar.invoke(j10).iterator();
        do {
            z0Var = null;
            if (!it.hasNext()) {
                break;
            }
            z0 z0Var2 = (z0) it.next();
            if (z0Var2.o().size() == 1 && (e10 = z0Var2.e()) != null && uc.h.B0(e10)) {
                pe.e eVar = pe.e.f19146a;
                List<j1> o10 = z0Var2.o();
                t.d(o10, "descriptor.valueParameters");
                s02 = c0.s0(o10);
                if (eVar.b(((j1) s02).getType(), u0Var.getType())) {
                    z0Var = z0Var2;
                    continue;
                } else {
                    continue;
                }
            }
        } while (z0Var == null);
        return z0Var;
    }

    private final xc.u v0(xc.e eVar) {
        xc.u g10 = eVar.g();
        t.d(g10, "classDescriptor.visibility");
        if (t.a(g10, gd.r.f10746b)) {
            xc.u uVar = gd.r.f10747c;
            t.d(uVar, "PROTECTED_AND_PACKAGE");
            return uVar;
        }
        return g10;
    }

    private final Set<z0> x0(wd.f fVar) {
        Collection<e0> b02 = b0();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (e0 e0Var : b02) {
            ub.z.x(linkedHashSet, e0Var.z().b(fVar, fd.d.WHEN_GET_SUPER_MEMBERS));
        }
        return linkedHashSet;
    }

    private final Set<u0> z0(wd.f fVar) {
        Set<u0> J0;
        int s10;
        Collection<e0> b02 = b0();
        ArrayList arrayList = new ArrayList();
        for (e0 e0Var : b02) {
            Collection<? extends u0> a10 = e0Var.z().a(fVar, fd.d.WHEN_GET_SUPER_MEMBERS);
            s10 = ub.v.s(a10, 10);
            ArrayList arrayList2 = new ArrayList(s10);
            for (u0 u0Var : a10) {
                arrayList2.add(u0Var);
            }
            ub.z.x(arrayList, arrayList2);
        }
        J0 = c0.J0(arrayList);
        return J0;
    }

    public void F0(wd.f fVar, fd.b bVar) {
        t.e(fVar, "name");
        t.e(bVar, "location");
        ed.a.a(w().a().l(), bVar, C(), fVar);
    }

    @Override // kd.j
    protected boolean G(id.e eVar) {
        t.e(eVar, "<this>");
        if (this.f14918n.E()) {
            return false;
        }
        return B0(eVar);
    }

    @Override // kd.j
    protected j.a H(r rVar, List<? extends f1> list, e0 e0Var, List<? extends j1> list2) {
        t.e(rVar, "method");
        t.e(list, "methodTypeParameters");
        t.e(e0Var, "returnType");
        t.e(list2, "valueParameters");
        j.b a10 = w().a().s().a(rVar, C(), e0Var, null, list2, list);
        t.d(a10, "c.components.signaturePr…dTypeParameters\n        )");
        e0 d10 = a10.d();
        t.d(d10, "propagated.returnType");
        e0 c10 = a10.c();
        List<j1> f10 = a10.f();
        t.d(f10, "propagated.valueParameters");
        List<f1> e10 = a10.e();
        t.d(e10, "propagated.typeParameters");
        boolean g10 = a10.g();
        List<String> b10 = a10.b();
        t.d(b10, "propagated.errors");
        return new j.a(d10, c10, f10, e10, g10, b10);
    }

    /* renamed from: Z */
    public LinkedHashSet<wd.f> n(he.d dVar, gc.l<? super wd.f, Boolean> lVar) {
        t.e(dVar, "kindFilter");
        Collection<e0> l10 = C().r().l();
        t.d(l10, "ownerDescriptor.typeConstructor.supertypes");
        LinkedHashSet<wd.f> linkedHashSet = new LinkedHashSet<>();
        for (e0 e0Var : l10) {
            ub.z.x(linkedHashSet, e0Var.z().c());
        }
        linkedHashSet.addAll(y().invoke().c());
        linkedHashSet.addAll(y().invoke().e());
        linkedHashSet.addAll(l(dVar, lVar));
        linkedHashSet.addAll(w().a().w().d(C()));
        return linkedHashSet;
    }

    @Override // kd.j, he.i, he.h
    public Collection<u0> a(wd.f fVar, fd.b bVar) {
        t.e(fVar, "name");
        t.e(bVar, "location");
        F0(fVar, bVar);
        return super.a(fVar, bVar);
    }

    /* renamed from: a0 */
    public kd.a p() {
        return new kd.a(this.f14918n, a.f14924c);
    }

    @Override // kd.j, he.i, he.h
    public Collection<z0> b(wd.f fVar, fd.b bVar) {
        t.e(fVar, "name");
        t.e(bVar, "location");
        F0(fVar, bVar);
        return super.b(fVar, bVar);
    }

    @Override // he.i, he.k
    public xc.h f(wd.f fVar, fd.b bVar) {
        ne.h<wd.f, ad.g> hVar;
        ad.g invoke;
        t.e(fVar, "name");
        t.e(bVar, "location");
        F0(fVar, bVar);
        g gVar = (g) B();
        return (gVar == null || (hVar = gVar.f14923s) == null || (invoke = hVar.invoke(fVar)) == null) ? this.f14923s.invoke(fVar) : invoke;
    }

    @Override // kd.j
    protected Set<wd.f> l(he.d dVar, gc.l<? super wd.f, Boolean> lVar) {
        Set<wd.f> h10;
        t.e(dVar, "kindFilter");
        h10 = ub.z0.h(this.f14921q.invoke(), this.f14922r.invoke().keySet());
        return h10;
    }

    @Override // kd.j
    protected void o(Collection<z0> collection, wd.f fVar) {
        t.e(collection, "result");
        t.e(fVar, "name");
        if (this.f14918n.L() && y().invoke().d(fVar) != null) {
            boolean z10 = true;
            if (!collection.isEmpty()) {
                Iterator<T> it = collection.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((z0) it.next()).o().isEmpty()) {
                            z10 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (z10) {
                w d10 = y().invoke().d(fVar);
                t.b(d10);
                collection.add(H0(d10));
            }
        }
        w().a().w().e(C(), fVar, collection);
    }

    @Override // kd.j
    protected void r(Collection<z0> collection, wd.f fVar) {
        List h10;
        List o02;
        boolean z10;
        t.e(collection, "result");
        t.e(fVar, "name");
        Set<z0> x02 = x0(fVar);
        if (!h0.Companion.k(fVar) && !gd.f.f10690m.l(fVar)) {
            if (!(x02 instanceof Collection) || !x02.isEmpty()) {
                for (y yVar : x02) {
                    if (yVar.s0()) {
                        z10 = false;
                        break;
                    }
                }
            }
            z10 = true;
            if (z10) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : x02) {
                    if (B0((z0) obj)) {
                        arrayList.add(obj);
                    }
                }
                V(collection, fVar, arrayList, false);
                return;
            }
        }
        ye.f a10 = ye.f.Companion.a();
        h10 = u.h();
        Collection<? extends z0> d10 = hd.a.d(fVar, x02, h10, C(), ke.r.f15098a, w().a().k().a());
        t.d(d10, "resolveOverridesForNonSt….overridingUtil\n        )");
        W(fVar, collection, d10, collection, new b(this));
        W(fVar, collection, d10, a10, new c(this));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : x02) {
            if (B0((z0) obj2)) {
                arrayList2.add(obj2);
            }
        }
        o02 = c0.o0(arrayList2, a10);
        V(collection, fVar, o02, true);
    }

    @Override // kd.j
    protected void s(wd.f fVar, Collection<u0> collection) {
        Set<? extends u0> f10;
        Set h10;
        t.e(fVar, "name");
        t.e(collection, "result");
        if (this.f14918n.E()) {
            Y(fVar, collection);
        }
        Set<u0> z02 = z0(fVar);
        if (z02.isEmpty()) {
            return;
        }
        f.b bVar = ye.f.Companion;
        ye.f a10 = bVar.a();
        ye.f a11 = bVar.a();
        X(z02, collection, a10, new d());
        f10 = ub.z0.f(z02, a10);
        X(f10, a11, null, new e());
        h10 = ub.z0.h(z02, a11);
        Collection<? extends u0> d10 = hd.a.d(fVar, h10, collection, C(), w().a().c(), w().a().k().a());
        t.d(d10, "resolveOverridesForNonSt…rridingUtil\n            )");
        collection.addAll(d10);
    }

    @Override // kd.j
    protected Set<wd.f> t(he.d dVar, gc.l<? super wd.f, Boolean> lVar) {
        t.e(dVar, "kindFilter");
        if (this.f14918n.E()) {
            return c();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(y().invoke().f());
        Collection<e0> l10 = C().r().l();
        t.d(l10, "ownerDescriptor.typeConstructor.supertypes");
        for (e0 e0Var : l10) {
            ub.z.x(linkedHashSet, e0Var.z().d());
        }
        return linkedHashSet;
    }

    @Override // kd.j
    public String toString() {
        return "Lazy Java member scope for " + this.f14918n.d();
    }

    public final ne.i<List<xc.d>> w0() {
        return this.f14920p;
    }

    /* renamed from: y0 */
    public xc.e C() {
        return this.f14917m;
    }

    @Override // kd.j
    protected x0 z() {
        return ae.d.l(C());
    }
}
