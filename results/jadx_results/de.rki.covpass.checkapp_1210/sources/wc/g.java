package wc;

import ad.z;
import ae.j;
import hc.e0;
import hc.j0;
import hc.k0;
import hc.t;
import hc.v;
import he.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import ne.n;
import oe.l1;
import oe.m0;
import pd.u;
import ub.c0;
import ub.y0;
import wc.f;
import xc.a1;
import xc.b;
import xc.h0;
import xc.j1;
import xc.m;
import xc.s;
import xc.x;
import xc.y;
import xc.z0;
import yc.g;
import ye.b;
/* loaded from: classes.dex */
public final class g implements zc.a, zc.c {

    /* renamed from: h */
    static final /* synthetic */ oc.k<Object>[] f24754h = {k0.g(new e0(k0.b(g.class), "settings", "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$Settings;")), k0.g(new e0(k0.b(g.class), "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;")), k0.g(new e0(k0.b(g.class), "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;"))};

    /* renamed from: a */
    private final h0 f24755a;

    /* renamed from: b */
    private final wc.d f24756b = wc.d.f24727a;

    /* renamed from: c */
    private final ne.i f24757c;

    /* renamed from: d */
    private final oe.e0 f24758d;

    /* renamed from: e */
    private final ne.i f24759e;

    /* renamed from: f */
    private final ne.a<wd.c, xc.e> f24760f;

    /* renamed from: g */
    private final ne.i f24761g;

    /* loaded from: classes.dex */
    public enum a {
        HIDDEN,
        VISIBLE,
        NOT_CONSIDERED,
        DROP
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24767a;

        static {
            int[] iArr = new int[a.values().length];
            iArr[a.HIDDEN.ordinal()] = 1;
            iArr[a.NOT_CONSIDERED.ordinal()] = 2;
            iArr[a.DROP.ordinal()] = 3;
            iArr[a.VISIBLE.ordinal()] = 4;
            f24767a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class c extends v implements gc.a<m0> {

        /* renamed from: d */
        final /* synthetic */ n f24769d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(n nVar) {
            super(0);
            g.this = r1;
            this.f24769d = nVar;
        }

        /* renamed from: b */
        public final m0 invoke() {
            return x.c(g.this.s().a(), wc.e.Companion.a(), new xc.k0(this.f24769d, g.this.s().a())).u();
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends z {
        d(h0 h0Var, wd.c cVar) {
            super(h0Var, cVar);
        }

        /* renamed from: M0 */
        public h.b z() {
            return h.b.f11873a;
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends v implements gc.a<oe.e0> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e() {
            super(0);
            g.this = r1;
        }

        /* renamed from: b */
        public final oe.e0 invoke() {
            m0 i10 = g.this.f24755a.x().i();
            t.d(i10, "moduleDescriptor.builtIns.anyType");
            return i10;
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends v implements gc.a<xc.e> {

        /* renamed from: c */
        final /* synthetic */ kd.f f24771c;

        /* renamed from: d */
        final /* synthetic */ xc.e f24772d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(kd.f fVar, xc.e eVar) {
            super(0);
            this.f24771c = fVar;
            this.f24772d = eVar;
        }

        /* renamed from: b */
        public final xc.e invoke() {
            kd.f fVar = this.f24771c;
            hd.g gVar = hd.g.f11812a;
            t.d(gVar, "EMPTY");
            return fVar.W0(gVar, this.f24772d);
        }
    }

    /* renamed from: wc.g$g */
    /* loaded from: classes.dex */
    static final class C0440g extends v implements gc.l<he.h, Collection<? extends z0>> {

        /* renamed from: c */
        final /* synthetic */ wd.f f24773c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0440g(wd.f fVar) {
            super(1);
            this.f24773c = fVar;
        }

        /* renamed from: b */
        public final Collection<z0> invoke(he.h hVar) {
            t.e(hVar, "it");
            return hVar.b(this.f24773c, fd.d.FROM_BUILTINS);
        }
    }

    /* loaded from: classes.dex */
    public static final class h<N> implements b.c {
        h() {
            g.this = r1;
        }

        /* renamed from: b */
        public final Iterable<xc.e> a(xc.e eVar) {
            Collection<oe.e0> l10 = eVar.r().l();
            t.d(l10, "it.typeConstructor.supertypes");
            g gVar = g.this;
            ArrayList arrayList = new ArrayList();
            for (oe.e0 e0Var : l10) {
                xc.h z10 = e0Var.W0().z();
                kd.f fVar = null;
                xc.h a10 = z10 != null ? z10.a() : null;
                xc.e eVar2 = a10 instanceof xc.e ? (xc.e) a10 : null;
                if (eVar2 != null) {
                    fVar = gVar.p(eVar2);
                }
                if (fVar != null) {
                    arrayList.add(fVar);
                }
            }
            return arrayList;
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends b.AbstractC0460b<xc.e, a> {

        /* renamed from: a */
        final /* synthetic */ String f24775a;

        /* renamed from: b */
        final /* synthetic */ j0<a> f24776b;

        i(String str, j0<a> j0Var) {
            this.f24775a = str;
            this.f24776b = j0Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0044 A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0046 A[ORIG_RETURN, RETURN] */
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean c(xc.e r3) {
            /*
                r2 = this;
                java.lang.String r0 = "javaClassDescriptor"
                hc.t.e(r3, r0)
                pd.x r0 = pd.x.f19141a
                java.lang.String r1 = r2.f24775a
                java.lang.String r3 = pd.u.a(r0, r3, r1)
                wc.i r0 = wc.i.f24780a
                java.util.Set r1 = r0.e()
                boolean r1 = r1.contains(r3)
                if (r1 == 0) goto L20
                hc.j0<wc.g$a> r3 = r2.f24776b
                wc.g$a r0 = wc.g.a.HIDDEN
            L1d:
                r3.f11764c = r0
                goto L3e
            L20:
                java.util.Set r1 = r0.h()
                boolean r1 = r1.contains(r3)
                if (r1 == 0) goto L2f
                hc.j0<wc.g$a> r3 = r2.f24776b
                wc.g$a r0 = wc.g.a.VISIBLE
                goto L1d
            L2f:
                java.util.Set r0 = r0.c()
                boolean r3 = r0.contains(r3)
                if (r3 == 0) goto L3e
                hc.j0<wc.g$a> r3 = r2.f24776b
                wc.g$a r0 = wc.g.a.DROP
                goto L1d
            L3e:
                hc.j0<wc.g$a> r3 = r2.f24776b
                T r3 = r3.f11764c
                if (r3 != 0) goto L46
                r3 = 1
                goto L47
            L46:
                r3 = 0
            L47:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: wc.g.i.c(xc.e):boolean");
        }

        /* renamed from: e */
        public a a() {
            a aVar = this.f24776b.f11764c;
            return aVar == null ? a.NOT_CONSIDERED : aVar;
        }
    }

    /* loaded from: classes.dex */
    public static final class j<N> implements b.c {

        /* renamed from: a */
        public static final j<N> f24777a = new j<>();

        j() {
        }

        /* renamed from: b */
        public final Iterable<xc.b> a(xc.b bVar) {
            return bVar.a().f();
        }
    }

    /* loaded from: classes.dex */
    public static final class k extends v implements gc.l<xc.b, Boolean> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k() {
            super(1);
            g.this = r1;
        }

        /* renamed from: b */
        public final Boolean invoke(xc.b bVar) {
            boolean z10;
            if (bVar.h() == b.a.DECLARATION) {
                wc.d dVar = g.this.f24756b;
                m b10 = bVar.b();
                t.c(b10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                if (dVar.c((xc.e) b10)) {
                    z10 = true;
                    return Boolean.valueOf(z10);
                }
            }
            z10 = false;
            return Boolean.valueOf(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class l extends v implements gc.a<yc.g> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l() {
            super(0);
            g.this = r1;
        }

        /* renamed from: b */
        public final yc.g invoke() {
            List<? extends yc.c> d10;
            yc.c b10 = yc.f.b(g.this.f24755a.x(), "This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version", null, null, 6, null);
            g.a aVar = yc.g.Companion;
            d10 = ub.t.d(b10);
            return aVar.a(d10);
        }
    }

    public g(h0 h0Var, n nVar, gc.a<f.b> aVar) {
        t.e(h0Var, "moduleDescriptor");
        t.e(nVar, "storageManager");
        t.e(aVar, "settingsComputation");
        this.f24755a = h0Var;
        this.f24757c = nVar.d(aVar);
        this.f24758d = k(nVar);
        this.f24759e = nVar.d(new c(nVar));
        this.f24760f = nVar.e();
        this.f24761g = nVar.d(new l());
    }

    private final z0 j(me.d dVar, z0 z0Var) {
        y.a<? extends z0> y10 = z0Var.y();
        y10.g(dVar);
        y10.o(xc.t.f25581e);
        y10.r(dVar.u());
        y10.m(dVar.S0());
        z0 b10 = y10.b();
        t.b(b10);
        return b10;
    }

    private final oe.e0 k(n nVar) {
        List d10;
        Set<xc.d> b10;
        d dVar = new d(this.f24755a, new wd.c("java.io"));
        d10 = ub.t.d(new oe.h0(nVar, new e()));
        ad.h hVar = new ad.h(dVar, wd.f.j("Serializable"), xc.e0.ABSTRACT, xc.f.INTERFACE, d10, a1.f25519a, false, nVar);
        h.b bVar = h.b.f11873a;
        b10 = y0.b();
        hVar.T0(bVar, b10, null);
        m0 u10 = hVar.u();
        t.d(u10, "mockSerializableClass.defaultType");
        return u10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00eb, code lost:
        if (t(r3, r10) != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.Collection<xc.z0> l(xc.e r10, gc.l<? super he.h, ? extends java.util.Collection<? extends xc.z0>> r11) {
        /*
            r9 = this;
            kd.f r0 = r9.p(r10)
            if (r0 != 0) goto Lb
            java.util.List r10 = ub.s.h()
            return r10
        Lb:
            wc.d r1 = r9.f24756b
            wd.c r2 = ee.a.h(r0)
            wc.b$a r3 = wc.b.Companion
            uc.h r3 = r3.a()
            java.util.Collection r1 = r1.g(r2, r3)
            java.lang.Object r2 = ub.s.h0(r1)
            xc.e r2 = (xc.e) r2
            if (r2 != 0) goto L28
            java.util.List r10 = ub.s.h()
            return r10
        L28:
            ye.f$b r3 = ye.f.Companion
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = ub.s.s(r1, r5)
            r4.<init>(r5)
            java.util.Iterator r1 = r1.iterator()
        L39:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L4d
            java.lang.Object r5 = r1.next()
            xc.e r5 = (xc.e) r5
            wd.c r5 = ee.a.h(r5)
            r4.add(r5)
            goto L39
        L4d:
            ye.f r1 = r3.b(r4)
            wc.d r3 = r9.f24756b
            boolean r10 = r3.c(r10)
            ne.a<wd.c, xc.e> r3 = r9.f24760f
            wd.c r4 = ee.a.h(r0)
            wc.g$f r5 = new wc.g$f
            r5.<init>(r0, r2)
            java.lang.Object r0 = r3.a(r4, r5)
            xc.e r0 = (xc.e) r0
            he.h r0 = r0.I0()
            java.lang.String r2 = "fakeJavaClassDescriptor.unsubstitutedMemberScope"
            hc.t.d(r0, r2)
            java.lang.Object r11 = r11.invoke(r0)
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r11 = r11.iterator()
        L80:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto Lf3
            java.lang.Object r2 = r11.next()
            r3 = r2
            xc.z0 r3 = (xc.z0) r3
            xc.b$a r4 = r3.h()
            xc.b$a r5 = xc.b.a.DECLARATION
            r6 = 1
            r7 = 0
            if (r4 == r5) goto L99
        L97:
            r6 = r7
            goto Led
        L99:
            xc.u r4 = r3.g()
            boolean r4 = r4.d()
            if (r4 != 0) goto La4
            goto L97
        La4:
            boolean r4 = uc.h.j0(r3)
            if (r4 == 0) goto Lab
            goto L97
        Lab:
            java.util.Collection r4 = r3.f()
            java.lang.String r5 = "analogueMember.overriddenDescriptors"
            hc.t.d(r4, r5)
            boolean r5 = r4 instanceof java.util.Collection
            if (r5 == 0) goto Lc0
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto Lc0
        Lbe:
            r4 = r7
            goto Le4
        Lc0:
            java.util.Iterator r4 = r4.iterator()
        Lc4:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto Lbe
            java.lang.Object r5 = r4.next()
            xc.y r5 = (xc.y) r5
            xc.m r5 = r5.b()
            java.lang.String r8 = "it.containingDeclaration"
            hc.t.d(r5, r8)
            wd.c r5 = ee.a.h(r5)
            boolean r5 = r1.contains(r5)
            if (r5 == 0) goto Lc4
            r4 = r6
        Le4:
            if (r4 == 0) goto Le7
            goto L97
        Le7:
            boolean r3 = r9.t(r3, r10)
            if (r3 != 0) goto L97
        Led:
            if (r6 == 0) goto L80
            r0.add(r2)
            goto L80
        Lf3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wc.g.l(xc.e, gc.l):java.util.Collection");
    }

    private final m0 m() {
        return (m0) ne.m.a(this.f24759e, this, f24754h[1]);
    }

    private static final boolean n(xc.l lVar, l1 l1Var, xc.l lVar2) {
        return ae.j.x(lVar, lVar2.c(l1Var)) == j.i.a.OVERRIDABLE;
    }

    public final kd.f p(xc.e eVar) {
        wd.b n10;
        wd.c b10;
        if (!uc.h.a0(eVar) && uc.h.A0(eVar)) {
            wd.d i10 = ee.a.i(eVar);
            if (!i10.f() || (n10 = wc.c.f24707a.n(i10)) == null || (b10 = n10.b()) == null) {
                return null;
            }
            xc.e c10 = s.c(s().a(), b10, fd.d.FROM_BUILTINS);
            if (!(c10 instanceof kd.f)) {
                return null;
            }
            return (kd.f) c10;
        }
        return null;
    }

    private final a q(y yVar) {
        List d10;
        m b10 = yVar.b();
        t.c(b10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        String c10 = pd.v.c(yVar, false, false, 3, null);
        j0 j0Var = new j0();
        d10 = ub.t.d((xc.e) b10);
        Object b11 = ye.b.b(d10, new h(), new i(c10, j0Var));
        t.d(b11, "private fun FunctionDesc…ERED\n            })\n    }");
        return (a) b11;
    }

    private final yc.g r() {
        return (yc.g) ne.m.a(this.f24761g, this, f24754h[2]);
    }

    public final f.b s() {
        return (f.b) ne.m.a(this.f24757c, this, f24754h[0]);
    }

    private final boolean t(z0 z0Var, boolean z10) {
        List d10;
        m b10 = z0Var.b();
        t.c(b10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        String c10 = pd.v.c(z0Var, false, false, 3, null);
        if (z10 ^ wc.i.f24780a.f().contains(u.a(pd.x.f19141a, (xc.e) b10, c10))) {
            return true;
        }
        d10 = ub.t.d(z0Var);
        Boolean e10 = ye.b.e(d10, j.f24777a, new k());
        t.d(e10, "private fun SimpleFuncti…scriptor)\n        }\n    }");
        return e10.booleanValue();
    }

    private final boolean u(xc.l lVar, xc.e eVar) {
        Object s02;
        if (lVar.o().size() == 1) {
            List<j1> o10 = lVar.o();
            t.d(o10, "valueParameters");
            s02 = c0.s0(o10);
            xc.h z10 = ((j1) s02).getType().W0().z();
            if (t.a(z10 != null ? ee.a.i(z10) : null, ee.a.i(eVar))) {
                return true;
            }
        }
        return false;
    }

    @Override // zc.a
    public Collection<oe.e0> a(xc.e eVar) {
        List h10;
        List d10;
        List k10;
        t.e(eVar, "classDescriptor");
        wd.d i10 = ee.a.i(eVar);
        wc.i iVar = wc.i.f24780a;
        if (iVar.i(i10)) {
            m0 m10 = m();
            t.d(m10, "cloneableType");
            k10 = ub.u.k(m10, this.f24758d);
            return k10;
        } else if (iVar.j(i10)) {
            d10 = ub.t.d(this.f24758d);
            return d10;
        } else {
            h10 = ub.u.h();
            return h10;
        }
    }

    @Override // zc.a
    public Collection<xc.d> c(xc.e eVar) {
        List h10;
        int s10;
        boolean z10;
        List h11;
        List h12;
        t.e(eVar, "classDescriptor");
        if (eVar.h() != xc.f.CLASS || !s().b()) {
            h10 = ub.u.h();
            return h10;
        }
        kd.f p10 = p(eVar);
        if (p10 == null) {
            h12 = ub.u.h();
            return h12;
        }
        xc.e f10 = wc.d.f(this.f24756b, ee.a.h(p10), wc.b.Companion.a(), null, 4, null);
        if (f10 == null) {
            h11 = ub.u.h();
            return h11;
        }
        l1 c10 = wc.j.a(f10, p10).c();
        List<xc.d> k10 = p10.k();
        ArrayList<xc.d> arrayList = new ArrayList();
        Iterator<T> it = k10.iterator();
        while (true) {
            boolean z11 = false;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            xc.d dVar = (xc.d) next;
            if (dVar.g().d()) {
                Collection<xc.d> k11 = f10.k();
                t.d(k11, "defaultKotlinVersion.constructors");
                if (!(k11 instanceof Collection) || !k11.isEmpty()) {
                    for (xc.d dVar2 : k11) {
                        t.d(dVar2, "it");
                        if (n(dVar2, c10, dVar)) {
                            z10 = false;
                            break;
                        }
                    }
                }
                z10 = true;
                if (z10 && !u(dVar, eVar) && !uc.h.j0(dVar) && !wc.i.f24780a.d().contains(u.a(pd.x.f19141a, p10, pd.v.c(dVar, false, false, 3, null)))) {
                    z11 = true;
                }
            }
            if (z11) {
                arrayList.add(next);
            }
        }
        s10 = ub.v.s(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(s10);
        for (xc.d dVar3 : arrayList) {
            y.a<? extends y> y10 = dVar3.y();
            y10.g(eVar);
            y10.r(eVar.u());
            y10.l();
            y10.i(c10.j());
            if (!wc.i.f24780a.g().contains(u.a(pd.x.f19141a, p10, pd.v.c(dVar3, false, false, 3, null)))) {
                y10.c(r());
            }
            y b10 = y10.b();
            t.c(b10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor");
            arrayList2.add((xc.d) b10);
        }
        return arrayList2;
    }

    @Override // zc.c
    public boolean d(xc.e eVar, z0 z0Var) {
        t.e(eVar, "classDescriptor");
        t.e(z0Var, "functionDescriptor");
        kd.f p10 = p(eVar);
        if (p10 != null && z0Var.j().B(zc.d.a())) {
            if (!s().b()) {
                return false;
            }
            String c10 = pd.v.c(z0Var, false, false, 3, null);
            kd.g I0 = p10.I0();
            wd.f name = z0Var.getName();
            t.d(name, "functionDescriptor.name");
            Collection<z0> b10 = I0.b(name, fd.d.FROM_BUILTINS);
            if (!(b10 instanceof Collection) || !b10.isEmpty()) {
                for (z0 z0Var2 : b10) {
                    if (t.a(pd.v.c(z0Var2, false, false, 3, null), c10)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00fc, code lost:
        if (r2 != 3) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ae A[SYNTHETIC] */
    @Override // zc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Collection<xc.z0> e(wd.f r7, xc.e r8) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wc.g.e(wd.f, xc.e):java.util.Collection");
    }

    /* renamed from: o */
    public Set<wd.f> b(xc.e eVar) {
        Set<wd.f> b10;
        kd.g I0;
        Set<wd.f> c10;
        Set<wd.f> b11;
        t.e(eVar, "classDescriptor");
        if (!s().b()) {
            b11 = y0.b();
            return b11;
        }
        kd.f p10 = p(eVar);
        if (p10 != null && (I0 = p10.I0()) != null && (c10 = I0.c()) != null) {
            return c10;
        }
        b10 = y0.b();
        return b10;
    }
}
