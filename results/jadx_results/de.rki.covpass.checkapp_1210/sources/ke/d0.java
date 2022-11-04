package ke;

import hc.k0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import oe.a1;
import oe.e1;
import oe.f0;
import oe.g1;
import oe.i1;
import oe.m0;
import oe.r0;
import oe.r1;
import oe.s0;
import oe.y0;
import oe.z0;
import org.conscrypt.BuildConfig;
import rd.q;
import ub.q0;
import xc.f1;
/* loaded from: classes3.dex */
public final class d0 {

    /* renamed from: a */
    private final m f15031a;

    /* renamed from: b */
    private final d0 f15032b;

    /* renamed from: c */
    private final String f15033c;

    /* renamed from: d */
    private final String f15034d;

    /* renamed from: e */
    private final gc.l<Integer, xc.h> f15035e;

    /* renamed from: f */
    private final gc.l<Integer, xc.h> f15036f;

    /* renamed from: g */
    private final Map<Integer, f1> f15037g;

    /* loaded from: classes3.dex */
    public static final class a extends hc.v implements gc.l<Integer, xc.h> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a() {
            super(1);
            d0.this = r1;
        }

        public final xc.h b(int i10) {
            return d0.this.d(i10);
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ xc.h invoke(Integer num) {
            return b(num.intValue());
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends hc.v implements gc.a<List<? extends yc.c>> {

        /* renamed from: d */
        final /* synthetic */ rd.q f15040d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(rd.q qVar) {
            super(0);
            d0.this = r1;
            this.f15040d = qVar;
        }

        @Override // gc.a
        public final List<? extends yc.c> invoke() {
            return d0.this.f15031a.c().d().b(this.f15040d, d0.this.f15031a.g());
        }
    }

    /* loaded from: classes3.dex */
    public static final class c extends hc.v implements gc.l<Integer, xc.h> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c() {
            super(1);
            d0.this = r1;
        }

        public final xc.h b(int i10) {
            return d0.this.f(i10);
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ xc.h invoke(Integer num) {
            return b(num.intValue());
        }
    }

    /* loaded from: classes3.dex */
    public /* synthetic */ class d extends hc.p implements gc.l<wd.b, wd.b> {
        public static final d Y3 = new d();

        d() {
            super(1);
        }

        @Override // hc.h
        public final oc.f e0() {
            return k0.b(wd.b.class);
        }

        @Override // hc.h
        public final String g0() {
            return "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;";
        }

        @Override // hc.h, oc.c
        public final String getName() {
            return "getOuterClassId";
        }

        /* renamed from: i0 */
        public final wd.b invoke(wd.b bVar) {
            hc.t.e(bVar, "p0");
            return bVar.g();
        }
    }

    /* loaded from: classes3.dex */
    public static final class e extends hc.v implements gc.l<rd.q, rd.q> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e() {
            super(1);
            d0.this = r1;
        }

        /* renamed from: b */
        public final rd.q invoke(rd.q qVar) {
            hc.t.e(qVar, "it");
            return td.f.g(qVar, d0.this.f15031a.j());
        }
    }

    /* loaded from: classes3.dex */
    public static final class f extends hc.v implements gc.l<rd.q, Integer> {

        /* renamed from: c */
        public static final f f15043c = new f();

        f() {
            super(1);
        }

        /* renamed from: b */
        public final Integer invoke(rd.q qVar) {
            hc.t.e(qVar, "it");
            return Integer.valueOf(qVar.w0());
        }
    }

    public d0(m mVar, d0 d0Var, List<rd.s> list, String str, String str2) {
        Map<Integer, f1> map;
        hc.t.e(mVar, "c");
        hc.t.e(list, "typeParameterProtos");
        hc.t.e(str, "debugName");
        hc.t.e(str2, "containerPresentableName");
        this.f15031a = mVar;
        this.f15032b = d0Var;
        this.f15033c = str;
        this.f15034d = str2;
        this.f15035e = mVar.h().i(new a());
        this.f15036f = mVar.h().i(new c());
        if (list.isEmpty()) {
            map = q0.h();
        } else {
            map = new LinkedHashMap<>();
            int i10 = 0;
            for (rd.s sVar : list) {
                map.put(Integer.valueOf(sVar.o0()), new me.m(this.f15031a, sVar, i10));
                i10++;
            }
        }
        this.f15037g = map;
    }

    public final xc.h d(int i10) {
        wd.b a10 = x.a(this.f15031a.g(), i10);
        return a10.k() ? this.f15031a.c().b(a10) : xc.x.b(this.f15031a.c().p(), a10);
    }

    private final m0 e(int i10) {
        if (x.a(this.f15031a.g(), i10).k()) {
            return this.f15031a.c().n().a();
        }
        return null;
    }

    public final xc.h f(int i10) {
        wd.b a10 = x.a(this.f15031a.g(), i10);
        if (a10.k()) {
            return null;
        }
        return xc.x.d(this.f15031a.c().p(), a10);
    }

    private final m0 g(oe.e0 e0Var, oe.e0 e0Var2) {
        List<g1> Q;
        int s10;
        uc.h h10 = te.a.h(e0Var);
        yc.g j10 = e0Var.j();
        oe.e0 j11 = uc.g.j(e0Var);
        List<oe.e0> e10 = uc.g.e(e0Var);
        Q = ub.c0.Q(uc.g.l(e0Var), 1);
        s10 = ub.v.s(Q, 10);
        ArrayList arrayList = new ArrayList(s10);
        for (g1 g1Var : Q) {
            arrayList.add(g1Var.getType());
        }
        return uc.g.b(h10, j10, j11, e10, arrayList, null, e0Var2, true).d1(e0Var.X0());
    }

    private final m0 h(a1 a1Var, e1 e1Var, List<? extends g1> list, boolean z10) {
        int size;
        int size2 = e1Var.getParameters().size() - list.size();
        m0 m0Var = null;
        if (size2 == 0) {
            m0Var = i(a1Var, e1Var, list, z10);
        } else if (size2 == 1 && (size = list.size() - 1) >= 0) {
            e1 r10 = e1Var.x().X(size).r();
            hc.t.d(r10, "functionTypeConstructor.…on(arity).typeConstructor");
            m0Var = f0.i(a1Var, r10, list, z10, null, 16, null);
        }
        return m0Var == null ? qe.k.f19894a.f(qe.j.INCONSISTENT_SUSPEND_FUNCTION, list, e1Var, new String[0]) : m0Var;
    }

    private final m0 i(a1 a1Var, e1 e1Var, List<? extends g1> list, boolean z10) {
        m0 i10 = f0.i(a1Var, e1Var, list, z10, null, 16, null);
        if (!uc.g.p(i10)) {
            return null;
        }
        return p(i10);
    }

    private final f1 k(int i10) {
        f1 f1Var = this.f15037g.get(Integer.valueOf(i10));
        if (f1Var == null) {
            d0 d0Var = this.f15032b;
            if (d0Var == null) {
                return null;
            }
            return d0Var.k(i10);
        }
        return f1Var;
    }

    private static final List<q.b> m(rd.q qVar, d0 d0Var) {
        List<q.b> o02;
        List<q.b> x02 = qVar.x0();
        hc.t.d(x02, "argumentList");
        rd.q g10 = td.f.g(qVar, d0Var.f15031a.j());
        List<q.b> m10 = g10 != null ? m(g10, d0Var) : null;
        if (m10 == null) {
            m10 = ub.u.h();
        }
        o02 = ub.c0.o0(x02, m10);
        return o02;
    }

    public static /* synthetic */ m0 n(d0 d0Var, rd.q qVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return d0Var.l(qVar, z10);
    }

    private final a1 o(List<? extends z0> list, yc.g gVar, e1 e1Var, xc.m mVar) {
        int s10;
        List<? extends y0<?>> u10;
        s10 = ub.v.s(list, 10);
        ArrayList arrayList = new ArrayList(s10);
        for (z0 z0Var : list) {
            arrayList.add(z0Var.a(gVar, e1Var, mVar));
        }
        u10 = ub.v.u(arrayList);
        return a1.Companion.g(u10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
        if (hc.t.a(r2, r3) == false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final oe.m0 p(oe.e0 r6) {
        /*
            r5 = this;
            java.util.List r0 = uc.g.l(r6)
            java.lang.Object r0 = ub.s.i0(r0)
            oe.g1 r0 = (oe.g1) r0
            r1 = 0
            if (r0 == 0) goto L76
            oe.e0 r0 = r0.getType()
            if (r0 != 0) goto L14
            goto L76
        L14:
            oe.e1 r2 = r0.W0()
            xc.h r2 = r2.z()
            if (r2 == 0) goto L23
            wd.c r2 = ee.a.h(r2)
            goto L24
        L23:
            r2 = r1
        L24:
            java.util.List r3 = r0.U0()
            int r3 = r3.size()
            r4 = 1
            if (r3 != r4) goto L73
            wd.c r3 = uc.k.f23453m
            boolean r3 = hc.t.a(r2, r3)
            if (r3 != 0) goto L42
            wd.c r3 = ke.e0.a()
            boolean r2 = hc.t.a(r2, r3)
            if (r2 != 0) goto L42
            goto L73
        L42:
            java.util.List r0 = r0.U0()
            java.lang.Object r0 = ub.s.s0(r0)
            oe.g1 r0 = (oe.g1) r0
            oe.e0 r0 = r0.getType()
            java.lang.String r2 = "continuationArgumentType.arguments.single().type"
            hc.t.d(r0, r2)
            ke.m r2 = r5.f15031a
            xc.m r2 = r2.e()
            boolean r3 = r2 instanceof xc.a
            if (r3 != 0) goto L60
            r2 = r1
        L60:
            xc.a r2 = (xc.a) r2
            if (r2 == 0) goto L68
            wd.c r1 = ee.a.d(r2)
        L68:
            wd.c r2 = ke.c0.f15026a
            boolean r1 = hc.t.a(r1, r2)
            oe.m0 r6 = r5.g(r6, r0)
            return r6
        L73:
            oe.m0 r6 = (oe.m0) r6
            return r6
        L76:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ke.d0.p(oe.e0):oe.m0");
    }

    private final g1 r(f1 f1Var, q.b bVar) {
        if (bVar.V() == q.b.c.STAR) {
            return f1Var == null ? new r0(this.f15031a.c().p().x()) : new s0(f1Var);
        }
        a0 a0Var = a0.f15009a;
        q.b.c V = bVar.V();
        hc.t.d(V, "typeArgumentProto.projection");
        r1 c10 = a0Var.c(V);
        rd.q m10 = td.f.m(bVar, this.f15031a.j());
        return m10 == null ? new i1(qe.k.d(qe.j.NO_RECORDED_TYPE, bVar.toString())) : new i1(c10, q(m10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object] */
    private final e1 s(rd.q qVar) {
        xc.h hVar;
        int I0;
        ?? r42;
        if (qVar.N0()) {
            hVar = this.f15035e.invoke(Integer.valueOf(qVar.y0()));
            if (hVar == null) {
                I0 = qVar.y0();
                hVar = t(this, qVar, I0);
            }
            e1 r10 = hVar.r();
            hc.t.d(r10, "classifier.typeConstructor");
            return r10;
        }
        if (qVar.W0()) {
            hVar = k(qVar.J0());
            if (hVar == null) {
                return qe.k.f19894a.e(qe.j.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER, String.valueOf(qVar.J0()), this.f15034d);
            }
        } else if (qVar.X0()) {
            String string = this.f15031a.g().getString(qVar.K0());
            Iterator it = j().iterator();
            while (true) {
                if (!it.hasNext()) {
                    r42 = 0;
                    break;
                }
                r42 = it.next();
                if (hc.t.a(((f1) r42).getName().b(), string)) {
                    break;
                }
            }
            hVar = (f1) r42;
            if (hVar == null) {
                return qe.k.f19894a.e(qe.j.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER_BY_NAME, string, this.f15031a.e().toString());
            }
        } else if (!qVar.V0()) {
            return qe.k.f19894a.e(qe.j.UNKNOWN_TYPE, new String[0]);
        } else {
            hVar = this.f15036f.invoke(Integer.valueOf(qVar.I0()));
            if (hVar == null) {
                I0 = qVar.I0();
                hVar = t(this, qVar, I0);
            }
        }
        e1 r102 = hVar.r();
        hc.t.d(r102, "classifier.typeConstructor");
        return r102;
    }

    private static final xc.e t(d0 d0Var, rd.q qVar, int i10) {
        af.h k10;
        af.h z10;
        List<Integer> G;
        af.h k11;
        int o10;
        wd.b a10 = x.a(d0Var.f15031a.g(), i10);
        k10 = af.n.k(qVar, new e());
        z10 = af.p.z(k10, f.f15043c);
        G = af.p.G(z10);
        k11 = af.n.k(a10, d.Y3);
        o10 = af.p.o(k11);
        while (G.size() < o10) {
            G.add(0);
        }
        return d0Var.f15031a.c().q().d(a10, G);
    }

    public final List<f1> j() {
        List<f1> F0;
        F0 = ub.c0.F0(this.f15037g.values());
        return F0;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final oe.m0 l(rd.q r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ke.d0.l(rd.q, boolean):oe.m0");
    }

    public final oe.e0 q(rd.q qVar) {
        hc.t.e(qVar, "proto");
        if (qVar.P0()) {
            String string = this.f15031a.g().getString(qVar.C0());
            m0 n10 = n(this, qVar, false, 2, null);
            rd.q c10 = td.f.c(qVar, this.f15031a.j());
            hc.t.b(c10);
            return this.f15031a.c().l().a(qVar, string, n10, n(this, c10, false, 2, null));
        }
        return l(qVar, true);
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f15033c);
        if (this.f15032b == null) {
            str = BuildConfig.FLAVOR;
        } else {
            str = ". Child of " + this.f15032b.f15033c;
        }
        sb2.append(str);
        return sb2.toString();
    }
}
