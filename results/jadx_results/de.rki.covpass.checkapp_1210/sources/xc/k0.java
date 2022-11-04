package xc;

import he.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import oe.r1;
/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a */
    private final ne.n f25548a;

    /* renamed from: b */
    private final h0 f25549b;

    /* renamed from: c */
    private final ne.g<wd.c, l0> f25550c;

    /* renamed from: d */
    private final ne.g<a, e> f25551d;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final wd.b f25552a;

        /* renamed from: b */
        private final List<Integer> f25553b;

        public a(wd.b bVar, List<Integer> list) {
            hc.t.e(bVar, "classId");
            hc.t.e(list, "typeParametersCount");
            this.f25552a = bVar;
            this.f25553b = list;
        }

        public final wd.b a() {
            return this.f25552a;
        }

        public final List<Integer> b() {
            return this.f25553b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return hc.t.a(this.f25552a, aVar.f25552a) && hc.t.a(this.f25553b, aVar.f25553b);
        }

        public int hashCode() {
            return (this.f25552a.hashCode() * 31) + this.f25553b.hashCode();
        }

        public String toString() {
            return "ClassRequest(classId=" + this.f25552a + ", typeParametersCount=" + this.f25553b + ')';
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends ad.g {
        private final boolean W3;
        private final List<f1> X3;
        private final oe.l Y3;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ne.n nVar, m mVar, wd.f fVar, boolean z10, int i10) {
            super(nVar, mVar, fVar, a1.f25519a, false);
            nc.g i11;
            int s10;
            Set a10;
            hc.t.e(nVar, "storageManager");
            hc.t.e(mVar, "container");
            hc.t.e(fVar, "name");
            this.W3 = z10;
            i11 = nc.m.i(0, i10);
            s10 = ub.v.s(i11, 10);
            ArrayList arrayList = new ArrayList(s10);
            Iterator<Integer> it = i11.iterator();
            while (it.hasNext()) {
                int b10 = ((ub.k0) it).b();
                yc.g b11 = yc.g.Companion.b();
                r1 r1Var = r1.INVARIANT;
                StringBuilder sb2 = new StringBuilder();
                sb2.append('T');
                sb2.append(b10);
                arrayList.add(ad.k0.a1(this, b11, false, r1Var, wd.f.j(sb2.toString()), b10, nVar));
            }
            this.X3 = arrayList;
            List<f1> d10 = g1.d(this);
            a10 = ub.x0.a(ee.a.l(this).x().i());
            this.Y3 = new oe.l(this, d10, a10, nVar);
        }

        @Override // xc.e, xc.i
        public List<f1> A() {
            return this.X3;
        }

        @Override // xc.e
        public xc.d A0() {
            return null;
        }

        @Override // xc.e
        public e E0() {
            return null;
        }

        @Override // ad.g, xc.d0
        public boolean H() {
            return false;
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

        /* renamed from: T0 */
        public h.b B0() {
            return h.b.f11873a;
        }

        /* renamed from: U0 */
        public oe.l r() {
            return this.Y3;
        }

        @Override // xc.e
        public boolean V() {
            return false;
        }

        /* renamed from: V0 */
        public h.b y0(pe.g gVar) {
            hc.t.e(gVar, "kotlinTypeRefiner");
            return h.b.f11873a;
        }

        @Override // xc.e, xc.q, xc.d0
        public u g() {
            u uVar = t.f25581e;
            hc.t.d(uVar, "PUBLIC");
            return uVar;
        }

        @Override // xc.e
        public f h() {
            return f.CLASS;
        }

        @Override // xc.e
        public boolean isInline() {
            return false;
        }

        @Override // yc.a
        public yc.g j() {
            return yc.g.Companion.b();
        }

        @Override // xc.e
        public boolean j0() {
            return false;
        }

        @Override // xc.e
        public Collection<xc.d> k() {
            Set b10;
            b10 = ub.y0.b();
            return b10;
        }

        @Override // xc.d0
        public boolean l0() {
            return false;
        }

        @Override // xc.i
        public boolean m0() {
            return this.W3;
        }

        @Override // xc.e, xc.d0
        public e0 s() {
            return e0.FINAL;
        }

        public String toString() {
            return "class " + getName() + " (not found)";
        }

        @Override // xc.e
        public Collection<e> v() {
            List h10;
            h10 = ub.u.h();
            return h10;
        }

        @Override // xc.e
        public h1<oe.m0> x0() {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class c extends hc.v implements gc.l<a, e> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c() {
            super(1);
            k0.this = r1;
        }

        /* JADX WARN: Code restructure failed: missing block: B:7:0x0024, code lost:
            if (r1 != null) goto L9;
         */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final xc.e invoke(xc.k0.a r9) {
            /*
                r8 = this;
                java.lang.String r0 = "<name for destructuring parameter 0>"
                hc.t.e(r9, r0)
                wd.b r0 = r9.a()
                java.util.List r9 = r9.b()
                boolean r1 = r0.k()
                if (r1 != 0) goto L66
                wd.b r1 = r0.g()
                if (r1 == 0) goto L27
                xc.k0 r2 = xc.k0.this
                r3 = 1
                java.util.List r3 = ub.s.P(r9, r3)
                xc.e r1 = r2.d(r1, r3)
                if (r1 == 0) goto L27
                goto L3c
            L27:
                xc.k0 r1 = xc.k0.this
                ne.g r1 = xc.k0.b(r1)
                wd.c r2 = r0.h()
                java.lang.String r3 = "classId.packageFqName"
                hc.t.d(r2, r3)
                java.lang.Object r1 = r1.invoke(r2)
                xc.g r1 = (xc.g) r1
            L3c:
                r4 = r1
                boolean r6 = r0.l()
                xc.k0$b r1 = new xc.k0$b
                xc.k0 r2 = xc.k0.this
                ne.n r3 = xc.k0.c(r2)
                wd.f r5 = r0.j()
                java.lang.String r0 = "classId.shortClassName"
                hc.t.d(r5, r0)
                java.lang.Object r9 = ub.s.X(r9)
                java.lang.Integer r9 = (java.lang.Integer) r9
                if (r9 == 0) goto L5f
                int r9 = r9.intValue()
                goto L60
            L5f:
                r9 = 0
            L60:
                r7 = r9
                r2 = r1
                r2.<init>(r3, r4, r5, r6, r7)
                return r1
            L66:
                java.lang.UnsupportedOperationException r9 = new java.lang.UnsupportedOperationException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Unresolved local class: "
                r1.append(r2)
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                r9.<init>(r0)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: xc.k0.c.invoke(xc.k0$a):xc.e");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class d extends hc.v implements gc.l<wd.c, l0> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d() {
            super(1);
            k0.this = r1;
        }

        /* renamed from: b */
        public final l0 invoke(wd.c cVar) {
            hc.t.e(cVar, "fqName");
            return new ad.m(k0.this.f25549b, cVar);
        }
    }

    public k0(ne.n nVar, h0 h0Var) {
        hc.t.e(nVar, "storageManager");
        hc.t.e(h0Var, "module");
        this.f25548a = nVar;
        this.f25549b = h0Var;
        this.f25550c = nVar.b(new d());
        this.f25551d = nVar.b(new c());
    }

    public final e d(wd.b bVar, List<Integer> list) {
        hc.t.e(bVar, "classId");
        hc.t.e(list, "typeParametersCount");
        return this.f25551d.invoke(new a(bVar, list));
    }
}
