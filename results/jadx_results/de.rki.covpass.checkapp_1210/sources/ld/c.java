package ld;

import hc.t;
import hc.v;
import java.util.ArrayList;
import java.util.List;
import jd.k;
import nd.a0;
import nd.i;
import nd.j;
import nd.x;
import nd.y;
import oe.a1;
import oe.b1;
import oe.e0;
import oe.e1;
import oe.f0;
import oe.g1;
import oe.h0;
import oe.i1;
import oe.m0;
import oe.r1;
import ub.c0;
import xc.f1;
import xc.h;
import xc.k0;
import yc.g;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a */
    private final jd.g f15930a;

    /* renamed from: b */
    private final k f15931b;

    /* renamed from: c */
    private final g f15932c;

    /* renamed from: d */
    private final e f15933d;

    /* loaded from: classes.dex */
    public static final class a extends v implements gc.a<e0> {

        /* renamed from: d */
        final /* synthetic */ f1 f15935d;

        /* renamed from: q */
        final /* synthetic */ j f15936q;

        /* renamed from: x */
        final /* synthetic */ ld.a f15937x;

        /* renamed from: y */
        final /* synthetic */ e1 f15938y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(f1 f1Var, j jVar, ld.a aVar, e1 e1Var) {
            super(0);
            c.this = r1;
            this.f15935d = f1Var;
            this.f15936q = jVar;
            this.f15937x = aVar;
            this.f15938y = e1Var;
        }

        /* renamed from: b */
        public final e0 invoke() {
            g gVar = c.this.f15932c;
            f1 f1Var = this.f15935d;
            boolean V = this.f15936q.V();
            ld.a aVar = this.f15937x;
            h z10 = this.f15938y.z();
            e0 c10 = gVar.c(f1Var, V, aVar.h(z10 != null ? z10.u() : null));
            t.d(c10, "typeParameterUpperBoundE…efaultType)\n            )");
            return c10;
        }
    }

    public c(jd.g gVar, k kVar) {
        t.e(gVar, "c");
        t.e(kVar, "typeParameterResolver");
        this.f15930a = gVar;
        this.f15931b = kVar;
        g gVar2 = new g(null, 1, null);
        this.f15932c = gVar2;
        this.f15933d = new e(gVar2);
    }

    private final boolean b(j jVar, xc.e eVar) {
        Object i02;
        Object i03;
        r1 w9;
        i02 = c0.i0(jVar.A());
        if (!a0.a((x) i02)) {
            return false;
        }
        List<f1> parameters = wc.d.f24727a.b(eVar).r().getParameters();
        t.d(parameters, "JavaToKotlinClassMapper.…ypeConstructor.parameters");
        i03 = c0.i0(parameters);
        f1 f1Var = (f1) i03;
        return (f1Var == null || (w9 = f1Var.w()) == null || w9 == r1.OUT_VARIANCE) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0020, code lost:
        if ((!r0.isEmpty()) != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List<oe.g1> c(nd.j r7, ld.a r8, oe.e1 r9) {
        /*
            r6 = this;
            boolean r0 = r7.V()
            java.lang.String r1 = "constructor.parameters"
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L25
            java.util.List r0 = r7.A()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L23
            java.util.List r0 = r9.getParameters()
            hc.t.d(r0, r1)
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r3
            if (r0 == 0) goto L23
            goto L25
        L23:
            r0 = r2
            goto L26
        L25:
            r0 = r3
        L26:
            java.util.List r4 = r9.getParameters()
            hc.t.d(r4, r1)
            if (r0 == 0) goto L34
            java.util.List r7 = r6.d(r7, r4, r9, r8)
            return r7
        L34:
            int r8 = r4.size()
            java.util.List r9 = r7.A()
            int r9 = r9.size()
            r0 = 10
            if (r8 == r9) goto L82
            java.util.ArrayList r7 = new java.util.ArrayList
            int r8 = ub.s.s(r4, r0)
            r7.<init>(r8)
            java.util.Iterator r8 = r4.iterator()
        L51:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L7d
            java.lang.Object r9 = r8.next()
            xc.f1 r9 = (xc.f1) r9
            oe.i1 r0 = new oe.i1
            qe.j r1 = qe.j.MISSED_TYPE_ARGUMENT_FOR_TYPE_PARAMETER
            java.lang.String[] r4 = new java.lang.String[r3]
            wd.f r9 = r9.getName()
            java.lang.String r9 = r9.b()
            java.lang.String r5 = "p.name.asString()"
            hc.t.d(r9, r5)
            r4[r2] = r9
            qe.h r9 = qe.k.d(r1, r4)
            r0.<init>(r9)
            r7.add(r0)
            goto L51
        L7d:
            java.util.List r7 = ub.s.F0(r7)
            return r7
        L82:
            java.util.List r7 = r7.A()
            java.lang.Iterable r7 = ub.s.L0(r7)
            java.util.ArrayList r8 = new java.util.ArrayList
            int r9 = ub.s.s(r7, r0)
            r8.<init>(r9)
            java.util.Iterator r7 = r7.iterator()
        L97:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto Lcb
            java.lang.Object r9 = r7.next()
            ub.h0 r9 = (ub.h0) r9
            int r0 = r9.a()
            java.lang.Object r9 = r9.b()
            nd.x r9 = (nd.x) r9
            r4.size()
            java.lang.Object r0 = r4.get(r0)
            xc.f1 r0 = (xc.f1) r0
            hd.k r1 = hd.k.COMMON
            r3 = 3
            r5 = 0
            ld.a r1 = ld.d.d(r1, r2, r5, r3, r5)
            java.lang.String r3 = "parameter"
            hc.t.d(r0, r3)
            oe.g1 r9 = r6.p(r9, r1, r0)
            r8.add(r9)
            goto L97
        Lcb:
            java.util.List r7 = ub.s.F0(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ld.c.c(nd.j, ld.a, oe.e1):java.util.List");
    }

    private final List<g1> d(j jVar, List<? extends f1> list, e1 e1Var, ld.a aVar) {
        int s10;
        g1 g1Var;
        s10 = ub.v.s(list, 10);
        ArrayList arrayList = new ArrayList(s10);
        for (f1 f1Var : list) {
            if (te.a.k(f1Var, null, aVar.f())) {
                g1Var = d.b(f1Var, aVar);
            } else {
                g1Var = this.f15933d.j(f1Var, jVar.V() ? aVar : aVar.i(b.INFLEXIBLE), new h0(this.f15930a.e(), new a(f1Var, jVar, aVar, e1Var)));
            }
            arrayList.add(g1Var);
        }
        return arrayList;
    }

    private final m0 e(j jVar, ld.a aVar, m0 m0Var) {
        a1 a1Var;
        if (m0Var == null || (a1Var = m0Var.V0()) == null) {
            a1Var = b1.b(new jd.d(this.f15930a, jVar, false, 4, null));
        }
        a1 a1Var2 = a1Var;
        e1 f10 = f(jVar, aVar);
        e1 e1Var = null;
        if (f10 == null) {
            return null;
        }
        boolean i10 = i(aVar);
        if (m0Var != null) {
            e1Var = m0Var.W0();
        }
        return (!t.a(e1Var, f10) || jVar.V() || !i10) ? f0.i(a1Var2, f10, c(jVar, aVar, f10), i10, null, 16, null) : m0Var.d1(true);
    }

    private final e1 f(j jVar, ld.a aVar) {
        e1 r10;
        i f10 = jVar.f();
        if (f10 == null) {
            return g(jVar);
        }
        if (!(f10 instanceof nd.g)) {
            if (f10 instanceof y) {
                f1 a10 = this.f15931b.a((y) f10);
                if (a10 == null) {
                    return null;
                }
                return a10.r();
            }
            throw new IllegalStateException("Unknown classifier kind: " + f10);
        }
        nd.g gVar = (nd.g) f10;
        wd.c d10 = gVar.d();
        if (d10 != null) {
            xc.e j10 = j(jVar, aVar, d10);
            if (j10 == null) {
                j10 = this.f15930a.a().n().a(gVar);
            }
            return (j10 == null || (r10 = j10.r()) == null) ? g(jVar) : r10;
        }
        throw new AssertionError("Class type should have a FQ name: " + f10);
    }

    private final e1 g(j jVar) {
        List<Integer> d10;
        wd.b m10 = wd.b.m(new wd.c(jVar.W()));
        t.d(m10, "topLevel(FqName(javaType.classifierQualifiedName))");
        k0 q10 = this.f15930a.a().b().d().q();
        d10 = ub.t.d(0);
        e1 r10 = q10.d(m10, d10).r();
        t.d(r10, "c.components.deserialize…istOf(0)).typeConstructor");
        return r10;
    }

    private final boolean h(r1 r1Var, f1 f1Var) {
        return (f1Var.w() == r1.INVARIANT || r1Var == f1Var.w()) ? false : true;
    }

    private final boolean i(ld.a aVar) {
        return (aVar.d() == b.FLEXIBLE_LOWER_BOUND || aVar.g() || aVar.e() == hd.k.SUPERTYPE) ? false : true;
    }

    private final xc.e j(j jVar, ld.a aVar, wd.c cVar) {
        wd.c cVar2;
        if (aVar.g()) {
            cVar2 = d.f15939a;
            if (t.a(cVar, cVar2)) {
                return this.f15930a.a().p().c();
            }
        }
        wc.d dVar = wc.d.f24727a;
        xc.e f10 = wc.d.f(dVar, cVar, this.f15930a.d().x(), null, 4, null);
        if (f10 == null) {
            return null;
        }
        return (!dVar.d(f10) || !(aVar.d() == b.FLEXIBLE_LOWER_BOUND || aVar.e() == hd.k.SUPERTYPE || b(jVar, f10))) ? f10 : dVar.b(f10);
    }

    public static /* synthetic */ e0 l(c cVar, nd.f fVar, ld.a aVar, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return cVar.k(fVar, aVar, z10);
    }

    private final e0 m(j jVar, ld.a aVar) {
        m0 e10;
        boolean z10 = !aVar.g() && aVar.e() != hd.k.SUPERTYPE;
        boolean V = jVar.V();
        if (!V && !z10) {
            m0 e11 = e(jVar, aVar, null);
            return e11 != null ? e11 : n(jVar);
        }
        m0 e12 = e(jVar, aVar.i(b.FLEXIBLE_LOWER_BOUND), null);
        if (e12 != null && (e10 = e(jVar, aVar.i(b.FLEXIBLE_UPPER_BOUND), e12)) != null) {
            return V ? new f(e12, e10) : f0.d(e12, e10);
        }
        return n(jVar);
    }

    private static final qe.h n(j jVar) {
        return qe.k.d(qe.j.UNRESOLVED_JAVA_CLASS, jVar.D());
    }

    private final g1 p(x xVar, ld.a aVar, f1 f1Var) {
        if (xVar instanceof nd.c0) {
            nd.c0 c0Var = (nd.c0) xVar;
            x t10 = c0Var.t();
            r1 r1Var = c0Var.K() ? r1.OUT_VARIANCE : r1.IN_VARIANCE;
            return (t10 == null || h(r1Var, f1Var)) ? d.b(f1Var, aVar) : te.a.e(o(t10, d.d(hd.k.COMMON, false, null, 3, null)), r1Var, f1Var);
        }
        return new i1(r1.INVARIANT, o(xVar, aVar));
    }

    public final e0 k(nd.f fVar, ld.a aVar, boolean z10) {
        List<? extends yc.c> m02;
        t.e(fVar, "arrayType");
        t.e(aVar, "attr");
        x w9 = fVar.w();
        nd.v vVar = w9 instanceof nd.v ? (nd.v) w9 : null;
        uc.i type = vVar != null ? vVar.getType() : null;
        jd.d dVar = new jd.d(this.f15930a, fVar, true);
        if (type != null) {
            m0 O = this.f15930a.d().x().O(type);
            t.d(O, "c.module.builtIns.getPri…KotlinType(primitiveType)");
            g.a aVar2 = yc.g.Companion;
            m02 = c0.m0(dVar, O.j());
            te.a.u(O, aVar2.a(m02));
            return aVar.g() ? O : f0.d(O, O.d1(true));
        }
        e0 o10 = o(w9, d.d(hd.k.COMMON, aVar.g(), null, 2, null));
        if (aVar.g()) {
            m0 m10 = this.f15930a.d().x().m(z10 ? r1.OUT_VARIANCE : r1.INVARIANT, o10, dVar);
            t.d(m10, "c.module.builtIns.getArr…mponentType, annotations)");
            return m10;
        }
        m0 m11 = this.f15930a.d().x().m(r1.INVARIANT, o10, dVar);
        t.d(m11, "c.module.builtIns.getArr…mponentType, annotations)");
        return f0.d(m11, this.f15930a.d().x().m(r1.OUT_VARIANCE, o10, dVar).d1(true));
    }

    public final e0 o(x xVar, ld.a aVar) {
        e0 o10;
        t.e(aVar, "attr");
        if (xVar instanceof nd.v) {
            uc.i type = ((nd.v) xVar).getType();
            m0 R = type != null ? this.f15930a.d().x().R(type) : this.f15930a.d().x().Z();
            t.d(R, "{\n                val pr…ns.unitType\n            }");
            return R;
        } else if (xVar instanceof j) {
            return m((j) xVar, aVar);
        } else {
            if (xVar instanceof nd.f) {
                return l(this, (nd.f) xVar, aVar, false, 4, null);
            }
            if (xVar instanceof nd.c0) {
                x t10 = ((nd.c0) xVar).t();
                if (t10 != null && (o10 = o(t10, aVar)) != null) {
                    return o10;
                }
            } else if (xVar != null) {
                throw new UnsupportedOperationException("Unsupported type: " + xVar);
            }
            m0 y10 = this.f15930a.d().x().y();
            t.d(y10, "c.module.builtIns.defaultBound");
            return y10;
        }
    }
}
