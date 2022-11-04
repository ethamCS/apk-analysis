package kd;

import gd.a0;
import gd.i0;
import hc.t;
import hc.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import ke.r;
import kotlin.Lazy;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nd.x;
import nd.y;
import oe.e1;
import oe.m0;
import oe.r1;
import ub.c0;
import xc.d1;
import xc.e0;
import xc.f1;
import xc.g1;
import xc.h1;
import xc.k0;
import xc.n1;
import xc.u;
import xc.y0;
/* loaded from: classes.dex */
public final class f extends ad.g implements id.c {
    public static final a Companion = new a(null);

    /* renamed from: m4 */
    private static final Set<String> f14898m4;
    private final jd.g W3;
    private final nd.g X3;
    private final xc.e Y3;
    private final jd.g Z3;

    /* renamed from: a4 */
    private final Lazy f14899a4;

    /* renamed from: b4 */
    private final xc.f f14900b4;

    /* renamed from: c4 */
    private final e0 f14901c4;

    /* renamed from: d4 */
    private final n1 f14902d4;

    /* renamed from: e4 */
    private final boolean f14903e4;

    /* renamed from: f4 */
    private final b f14904f4;

    /* renamed from: g4 */
    private final g f14905g4;

    /* renamed from: h4 */
    private final y0<g> f14906h4;

    /* renamed from: i4 */
    private final he.f f14907i4;

    /* renamed from: j4 */
    private final k f14908j4;

    /* renamed from: k4 */
    private final yc.g f14909k4;

    /* renamed from: l4 */
    private final ne.i<List<f1>> f14910l4;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public final class b extends oe.b {

        /* renamed from: d */
        private final ne.i<List<f1>> f14911d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static final class a extends v implements gc.a<List<? extends f1>> {

            /* renamed from: c */
            final /* synthetic */ f f14913c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(f fVar) {
                super(0);
                this.f14913c = fVar;
            }

            @Override // gc.a
            public final List<? extends f1> invoke() {
                return g1.d(this.f14913c);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b() {
            super(r3.Z3.e());
            f.this = r3;
            this.f14911d = r3.Z3.e().d(new a(r3));
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0019, code lost:
            if ((!r0.d() && r0.i(uc.k.f23457q)) != false) goto L12;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final oe.e0 u() {
            /*
                r8 = this;
                wd.c r0 = r8.v()
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L1c
                boolean r3 = r0.d()
                if (r3 != 0) goto L18
                wd.f r3 = uc.k.f23457q
                boolean r3 = r0.i(r3)
                if (r3 == 0) goto L18
                r3 = r1
                goto L19
            L18:
                r3 = 0
            L19:
                if (r3 == 0) goto L1c
                goto L1d
            L1c:
                r0 = r2
            L1d:
                if (r0 != 0) goto L2e
                gd.m r3 = gd.m.f10735a
                kd.f r4 = kd.f.this
                wd.c r4 = ee.a.h(r4)
                wd.c r3 = r3.b(r4)
                if (r3 != 0) goto L2f
                return r2
            L2e:
                r3 = r0
            L2f:
                kd.f r4 = kd.f.this
                jd.g r4 = kd.f.U0(r4)
                xc.h0 r4 = r4.d()
                fd.d r5 = fd.d.FROM_JAVA_LOADER
                xc.e r3 = ee.a.r(r4, r3, r5)
                if (r3 != 0) goto L42
                return r2
            L42:
                oe.e1 r4 = r3.r()
                java.util.List r4 = r4.getParameters()
                int r4 = r4.size()
                kd.f r5 = kd.f.this
                oe.e1 r5 = r5.r()
                java.util.List r5 = r5.getParameters()
                java.lang.String r6 = "getTypeConstructor().parameters"
                hc.t.d(r5, r6)
                int r6 = r5.size()
                r7 = 10
                if (r6 != r4) goto L8d
                java.util.ArrayList r0 = new java.util.ArrayList
                int r1 = ub.s.s(r5, r7)
                r0.<init>(r1)
                java.util.Iterator r1 = r5.iterator()
            L72:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto Lc7
                java.lang.Object r2 = r1.next()
                xc.f1 r2 = (xc.f1) r2
                oe.i1 r4 = new oe.i1
                oe.r1 r5 = oe.r1.INVARIANT
                oe.m0 r2 = r2.u()
                r4.<init>(r5, r2)
                r0.add(r4)
                goto L72
            L8d:
                if (r6 != r1) goto Ld2
                if (r4 <= r1) goto Ld2
                if (r0 != 0) goto Ld2
                oe.i1 r0 = new oe.i1
                oe.r1 r2 = oe.r1.INVARIANT
                java.lang.Object r5 = ub.s.s0(r5)
                xc.f1 r5 = (xc.f1) r5
                oe.m0 r5 = r5.u()
                r0.<init>(r2, r5)
                nc.g r2 = new nc.g
                r2.<init>(r1, r4)
                java.util.ArrayList r1 = new java.util.ArrayList
                int r4 = ub.s.s(r2, r7)
                r1.<init>(r4)
                java.util.Iterator r2 = r2.iterator()
            Lb6:
                boolean r4 = r2.hasNext()
                if (r4 == 0) goto Lc6
                r4 = r2
                ub.k0 r4 = (ub.k0) r4
                r4.b()
                r1.add(r0)
                goto Lb6
            Lc6:
                r0 = r1
            Lc7:
                oe.a1$a r1 = oe.a1.Companion
                oe.a1 r1 = r1.h()
                oe.m0 r0 = oe.f0.g(r1, r3, r0)
                return r0
            Ld2:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: kd.f.b.u():oe.e0");
        }

        private final wd.c v() {
            Object t02;
            String str;
            yc.g j10 = f.this.j();
            wd.c cVar = a0.f10648q;
            t.d(cVar, "PURELY_IMPLEMENTS_ANNOTATION");
            yc.c h10 = j10.h(cVar);
            if (h10 == null) {
                return null;
            }
            t02 = c0.t0(h10.b().values());
            ce.v vVar = t02 instanceof ce.v ? (ce.v) t02 : null;
            if (vVar != null && (str = (String) vVar.b()) != null && wd.e.e(str)) {
                return new wd.c(str);
            }
            return null;
        }

        @Override // oe.e1
        public List<f1> getParameters() {
            return this.f14911d.invoke();
        }

        @Override // oe.g
        protected Collection<oe.e0> i() {
            Object obj;
            List d10;
            List F0;
            int s10;
            Collection<nd.j> l10 = f.this.Y0().l();
            ArrayList arrayList = new ArrayList(l10.size());
            ArrayList<x> arrayList2 = new ArrayList(0);
            oe.e0 u10 = u();
            Iterator<nd.j> it = l10.iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    break;
                }
                nd.j next = it.next();
                oe.e0 h10 = f.this.Z3.a().r().h(f.this.Z3.g().o(next, ld.d.d(hd.k.SUPERTYPE, false, null, 3, null)), f.this.Z3);
                if (h10.W0().z() instanceof k0.b) {
                    arrayList2.add(next);
                }
                e1 W0 = h10.W0();
                if (u10 != null) {
                    obj = u10.W0();
                }
                if (!t.a(W0, obj) && !uc.h.b0(h10)) {
                    arrayList.add(h10);
                }
            }
            xc.e eVar = f.this.Y3;
            if (eVar != null) {
                obj = wc.j.a(eVar, f.this).c().p(eVar.u(), r1.INVARIANT);
            }
            ye.a.a(arrayList, obj);
            ye.a.a(arrayList, u10);
            if (!arrayList2.isEmpty()) {
                r c10 = f.this.Z3.a().c();
                xc.e z10 = z();
                s10 = ub.v.s(arrayList2, 10);
                ArrayList arrayList3 = new ArrayList(s10);
                for (x xVar : arrayList2) {
                    t.c(xVar, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.structure.JavaClassifierType");
                    arrayList3.add(((nd.j) xVar).D());
                }
                c10.b(z10, arrayList3);
            }
            if (!arrayList.isEmpty()) {
                F0 = c0.F0(arrayList);
                return F0;
            }
            d10 = ub.t.d(f.this.Z3.d().x().i());
            return d10;
        }

        @Override // oe.g
        protected d1 n() {
            return f.this.Z3.a().v();
        }

        @Override // oe.b
        /* renamed from: t */
        public xc.e z() {
            return f.this;
        }

        public String toString() {
            String b10 = f.this.getName().b();
            t.d(b10, "name.asString()");
            return b10;
        }

        @Override // oe.e1
        public boolean y() {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class c extends v implements gc.a<List<? extends f1>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c() {
            super(0);
            f.this = r1;
        }

        @Override // gc.a
        public final List<? extends f1> invoke() {
            int s10;
            List<y> p10 = f.this.Y0().p();
            f fVar = f.this;
            s10 = ub.v.s(p10, 10);
            ArrayList arrayList = new ArrayList(s10);
            for (y yVar : p10) {
                f1 a10 = fVar.Z3.f().a(yVar);
                if (a10 == null) {
                    throw new AssertionError("Parameter " + yVar + " surely belongs to class " + fVar.Y0() + ", so it must be resolved");
                }
                arrayList.add(a10);
            }
            return arrayList;
        }
    }

    /* loaded from: classes.dex */
    public static final class d<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            int a10;
            a10 = wb.b.a(ee.a.h((xc.e) t10).b(), ee.a.h((xc.e) t11).b());
            return a10;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class e extends v implements gc.a<List<? extends nd.a>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e() {
            super(0);
            f.this = r1;
        }

        @Override // gc.a
        public final List<? extends nd.a> invoke() {
            wd.b g10 = ee.a.g(f.this);
            if (g10 != null) {
                return f.this.a1().a().f().a(g10);
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: kd.f$f */
    /* loaded from: classes.dex */
    public static final class C0219f extends v implements gc.l<pe.g, g> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0219f() {
            super(1);
            f.this = r1;
        }

        /* renamed from: b */
        public final g invoke(pe.g gVar) {
            t.e(gVar, "it");
            jd.g gVar2 = f.this.Z3;
            f fVar = f.this;
            return new g(gVar2, fVar, fVar.Y0(), f.this.Y3 != null, f.this.f14905g4);
        }
    }

    static {
        Set<String> e10;
        e10 = ub.y0.e("equals", "hashCode", "getClass", "wait", "notify", "notifyAll", "toString");
        f14898m4 = e10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(jd.g gVar, xc.m mVar, nd.g gVar2, xc.e eVar) {
        super(gVar.e(), mVar, gVar2.getName(), gVar.a().t().a(gVar2), false);
        Lazy a10;
        e0 e0Var;
        t.e(gVar, "outerContext");
        t.e(mVar, "containingDeclaration");
        t.e(gVar2, "jClass");
        this.W3 = gVar;
        this.X3 = gVar2;
        this.Y3 = eVar;
        jd.g d10 = jd.a.d(gVar, this, gVar2, 0, 4, null);
        this.Z3 = d10;
        d10.a().h().c(gVar2, this);
        gVar2.J();
        a10 = tb.m.a(new e());
        this.f14899a4 = a10;
        this.f14900b4 = gVar2.E() ? xc.f.ANNOTATION_CLASS : gVar2.H() ? xc.f.INTERFACE : gVar2.s() ? xc.f.ENUM_CLASS : xc.f.CLASS;
        if (gVar2.E() || gVar2.s()) {
            e0Var = e0.FINAL;
        } else {
            e0Var = e0.Companion.a(gVar2.z(), gVar2.z() || gVar2.I() || gVar2.H(), !gVar2.B());
        }
        this.f14901c4 = e0Var;
        this.f14902d4 = gVar2.g();
        this.f14903e4 = gVar2.q() != null && !gVar2.m();
        this.f14904f4 = new b();
        g gVar3 = new g(d10, this, gVar2, eVar != null, null, 16, null);
        this.f14905g4 = gVar3;
        this.f14906h4 = y0.Companion.a(this, d10.e(), d10.a().k().c(), new C0219f());
        this.f14907i4 = new he.f(gVar3);
        this.f14908j4 = new k(d10, gVar2, this);
        this.f14909k4 = jd.e.a(d10, gVar2);
        this.f14910l4 = d10.e().d(new c());
    }

    public /* synthetic */ f(jd.g gVar, xc.m mVar, nd.g gVar2, xc.e eVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(gVar, mVar, gVar2, (i10 & 8) != 0 ? null : eVar);
    }

    @Override // xc.e, xc.i
    public List<f1> A() {
        return this.f14910l4.invoke();
    }

    @Override // xc.e
    public xc.d A0() {
        return null;
    }

    @Override // xc.e
    public he.h B0() {
        return this.f14908j4;
    }

    @Override // xc.e
    public xc.e E0() {
        return null;
    }

    @Override // xc.d0
    public boolean L0() {
        return false;
    }

    @Override // xc.e
    public boolean N() {
        return false;
    }

    @Override // xc.e
    public boolean R0() {
        return false;
    }

    @Override // xc.e
    public boolean V() {
        return false;
    }

    public final f W0(hd.g gVar, xc.e eVar) {
        t.e(gVar, "javaResolverCache");
        jd.g gVar2 = this.Z3;
        jd.g i10 = jd.a.i(gVar2, gVar2.a().x(gVar));
        xc.m b10 = b();
        t.d(b10, "containingDeclaration");
        return new f(i10, b10, this.X3, eVar);
    }

    /* renamed from: X0 */
    public List<xc.d> k() {
        return this.f14905g4.w0().invoke();
    }

    public final nd.g Y0() {
        return this.X3;
    }

    public final List<nd.a> Z0() {
        return (List) this.f14899a4.getValue();
    }

    public final jd.g a1() {
        return this.W3;
    }

    /* renamed from: b1 */
    public g I0() {
        he.h I0 = super.I0();
        t.c(I0, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope");
        return (g) I0;
    }

    /* renamed from: c1 */
    public g y0(pe.g gVar) {
        t.e(gVar, "kotlinTypeRefiner");
        return this.f14906h4.c(gVar);
    }

    @Override // xc.e, xc.q, xc.d0
    public u g() {
        if (!t.a(this.f14902d4, xc.t.f25577a) || this.X3.q() != null) {
            return i0.c(this.f14902d4);
        }
        u uVar = gd.r.f10745a;
        t.d(uVar, "{\n            JavaDescri…KAGE_VISIBILITY\n        }");
        return uVar;
    }

    @Override // xc.e
    public xc.f h() {
        return this.f14900b4;
    }

    @Override // xc.e
    public boolean isInline() {
        return false;
    }

    @Override // yc.a
    public yc.g j() {
        return this.f14909k4;
    }

    @Override // xc.e
    public boolean j0() {
        return false;
    }

    @Override // xc.d0
    public boolean l0() {
        return false;
    }

    @Override // xc.i
    public boolean m0() {
        return this.f14903e4;
    }

    @Override // xc.h
    public e1 r() {
        return this.f14904f4;
    }

    @Override // xc.e, xc.d0
    public e0 s() {
        return this.f14901c4;
    }

    public String toString() {
        return "Lazy Java class " + ee.a.i(this);
    }

    @Override // xc.e
    public Collection<xc.e> v() {
        List h10;
        List w02;
        if (this.f14901c4 != e0.SEALED) {
            h10 = ub.u.h();
            return h10;
        }
        ld.a d10 = ld.d.d(hd.k.COMMON, false, null, 3, null);
        Collection<nd.j> Q = this.X3.Q();
        ArrayList arrayList = new ArrayList();
        for (nd.j jVar : Q) {
            xc.h z10 = this.Z3.g().o(jVar, d10).W0().z();
            xc.e eVar = z10 instanceof xc.e ? (xc.e) z10 : null;
            if (eVar != null) {
                arrayList.add(eVar);
            }
        }
        w02 = c0.w0(arrayList, new d());
        return w02;
    }

    @Override // ad.a, xc.e
    public he.h w0() {
        return this.f14907i4;
    }

    @Override // xc.e
    public h1<m0> x0() {
        return null;
    }
}
