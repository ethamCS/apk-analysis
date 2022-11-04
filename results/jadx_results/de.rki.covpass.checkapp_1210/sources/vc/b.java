package vc;

import hc.t;
import he.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nc.g;
import ne.n;
import oe.e1;
import oe.m0;
import oe.r1;
import tb.e0;
import ub.c0;
import ub.k0;
import ub.u;
import ub.v;
import uc.k;
import wd.f;
import xc.a1;
import xc.d1;
import xc.f1;
import xc.h1;
import xc.l0;
/* loaded from: classes.dex */
public final class b extends ad.a {
    public static final a Companion = new a(null);

    /* renamed from: a4 */
    private static final wd.b f23981a4 = new wd.b(k.f23458r, f.j("Function"));

    /* renamed from: b4 */
    private static final wd.b f23982b4 = new wd.b(k.f23455o, f.j("KFunction"));
    private final l0 U3;
    private final c V3;
    private final int W3;
    private final C0427b X3 = new C0427b();
    private final d Y3;
    private final List<f1> Z3;

    /* renamed from: y */
    private final n f23983y;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: vc.b$b */
    /* loaded from: classes.dex */
    public final class C0427b extends oe.b {

        /* renamed from: vc.b$b$a */
        /* loaded from: classes.dex */
        public /* synthetic */ class a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f23985a;

            static {
                int[] iArr = new int[c.values().length];
                iArr[c.Function.ordinal()] = 1;
                iArr[c.KFunction.ordinal()] = 2;
                iArr[c.SuspendFunction.ordinal()] = 3;
                iArr[c.KSuspendFunction.ordinal()] = 4;
                f23985a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0427b() {
            super(r1.f23983y);
            b.this = r1;
        }

        @Override // oe.e1
        public List<f1> getParameters() {
            return b.this.Z3;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x008c  */
        @Override // oe.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        protected java.util.Collection<oe.e0> i() {
            /*
                r9 = this;
                vc.b r0 = vc.b.this
                vc.c r0 = r0.d1()
                int[] r1 = vc.b.C0427b.a.f23985a
                int r0 = r0.ordinal()
                r0 = r1[r0]
                r1 = 1
                if (r0 == r1) goto L65
                r2 = 0
                r3 = 2
                if (r0 == r3) goto L43
                r4 = 3
                if (r0 == r4) goto L65
                r4 = 4
                if (r0 != r4) goto L3d
                wd.b[] r0 = new wd.b[r3]
                wd.b r3 = vc.b.W0()
                r0[r2] = r3
                wd.b r2 = new wd.b
                wd.c r3 = uc.k.f23450j
                vc.c r4 = vc.c.SuspendFunction
                vc.b r5 = vc.b.this
                int r5 = r5.Z0()
                wd.f r4 = r4.j(r5)
                r2.<init>(r3, r4)
                r0[r1] = r2
                java.util.List r0 = ub.s.k(r0)
                goto L6d
            L3d:
                tb.p r0 = new tb.p
                r0.<init>()
                throw r0
            L43:
                wd.b[] r0 = new wd.b[r3]
                wd.b r3 = vc.b.W0()
                r0[r2] = r3
                wd.b r2 = new wd.b
                wd.c r3 = uc.k.f23458r
                vc.c r4 = vc.c.Function
                vc.b r5 = vc.b.this
                int r5 = r5.Z0()
                wd.f r4 = r4.j(r5)
                r2.<init>(r3, r4)
                r0[r1] = r2
                java.util.List r0 = ub.s.k(r0)
                goto L6d
            L65:
                wd.b r0 = vc.b.V0()
                java.util.List r0 = ub.s.d(r0)
            L6d:
                vc.b r1 = vc.b.this
                xc.l0 r1 = vc.b.U0(r1)
                xc.h0 r1 = r1.b()
                java.util.ArrayList r2 = new java.util.ArrayList
                r3 = 10
                int r4 = ub.s.s(r0, r3)
                r2.<init>(r4)
                java.util.Iterator r0 = r0.iterator()
            L86:
                boolean r4 = r0.hasNext()
                if (r4 == 0) goto L100
                java.lang.Object r4 = r0.next()
                wd.b r4 = (wd.b) r4
                xc.e r5 = xc.x.a(r1, r4)
                if (r5 == 0) goto Le0
                java.util.List r4 = r9.getParameters()
                oe.e1 r6 = r5.r()
                java.util.List r6 = r6.getParameters()
                int r6 = r6.size()
                java.util.List r4 = ub.s.z0(r4, r6)
                java.util.ArrayList r6 = new java.util.ArrayList
                int r7 = ub.s.s(r4, r3)
                r6.<init>(r7)
                java.util.Iterator r4 = r4.iterator()
            Lb9:
                boolean r7 = r4.hasNext()
                if (r7 == 0) goto Ld2
                java.lang.Object r7 = r4.next()
                xc.f1 r7 = (xc.f1) r7
                oe.i1 r8 = new oe.i1
                oe.m0 r7 = r7.u()
                r8.<init>(r7)
                r6.add(r8)
                goto Lb9
            Ld2:
                oe.a1$a r4 = oe.a1.Companion
                oe.a1 r4 = r4.h()
                oe.m0 r4 = oe.f0.g(r4, r5, r6)
                r2.add(r4)
                goto L86
            Le0:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Built-in class "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r2 = " not found"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L100:
                java.util.List r0 = ub.s.F0(r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: vc.b.C0427b.i():java.util.Collection");
        }

        @Override // oe.g
        protected d1 n() {
            return d1.a.f25530a;
        }

        public String toString() {
            return z().toString();
        }

        /* renamed from: u */
        public b z() {
            return b.this;
        }

        @Override // oe.e1
        public boolean y() {
            return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(n nVar, l0 l0Var, c cVar, int i10) {
        super(nVar, cVar.j(i10));
        int s10;
        List<f1> F0;
        t.e(nVar, "storageManager");
        t.e(l0Var, "containingDeclaration");
        t.e(cVar, "functionKind");
        this.f23983y = nVar;
        this.U3 = l0Var;
        this.V3 = cVar;
        this.W3 = i10;
        this.Y3 = new d(nVar, this);
        ArrayList arrayList = new ArrayList();
        g gVar = new g(1, i10);
        s10 = v.s(gVar, 10);
        ArrayList arrayList2 = new ArrayList(s10);
        Iterator<Integer> it = gVar.iterator();
        while (it.hasNext()) {
            int b10 = ((k0) it).b();
            r1 r1Var = r1.IN_VARIANCE;
            StringBuilder sb2 = new StringBuilder();
            sb2.append('P');
            sb2.append(b10);
            T0(arrayList, this, r1Var, sb2.toString());
            arrayList2.add(e0.f22152a);
        }
        T0(arrayList, this, r1.OUT_VARIANCE, "R");
        F0 = c0.F0(arrayList);
        this.Z3 = F0;
    }

    private static final void T0(ArrayList<f1> arrayList, b bVar, r1 r1Var, String str) {
        arrayList.add(ad.k0.a1(bVar, yc.g.Companion.b(), false, r1Var, f.j(str), arrayList.size(), bVar.f23983y));
    }

    @Override // xc.e, xc.i
    public List<f1> A() {
        return this.Z3;
    }

    @Override // xc.e
    public /* bridge */ /* synthetic */ xc.d A0() {
        return (xc.d) h1();
    }

    @Override // xc.e
    public /* bridge */ /* synthetic */ xc.e E0() {
        return (xc.e) a1();
    }

    @Override // xc.d0
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

    @Override // xc.e
    public boolean V() {
        return false;
    }

    public final int Z0() {
        return this.W3;
    }

    public Void a1() {
        return null;
    }

    /* renamed from: b1 */
    public List<xc.d> k() {
        List<xc.d> h10;
        h10 = u.h();
        return h10;
    }

    /* renamed from: c1 */
    public l0 b() {
        return this.U3;
    }

    public final c d1() {
        return this.V3;
    }

    /* renamed from: e1 */
    public List<xc.e> v() {
        List<xc.e> h10;
        h10 = u.h();
        return h10;
    }

    /* renamed from: f1 */
    public h.b B0() {
        return h.b.f11873a;
    }

    @Override // xc.e, xc.q, xc.d0
    public xc.u g() {
        xc.u uVar = xc.t.f25581e;
        t.d(uVar, "PUBLIC");
        return uVar;
    }

    /* renamed from: g1 */
    public d y0(pe.g gVar) {
        t.e(gVar, "kotlinTypeRefiner");
        return this.Y3;
    }

    @Override // xc.e
    public xc.f h() {
        return xc.f.INTERFACE;
    }

    public Void h1() {
        return null;
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

    @Override // xc.d0
    public boolean l0() {
        return false;
    }

    @Override // xc.p
    public a1 m() {
        a1 a1Var = a1.f25519a;
        t.d(a1Var, "NO_SOURCE");
        return a1Var;
    }

    @Override // xc.i
    public boolean m0() {
        return false;
    }

    @Override // xc.h
    public e1 r() {
        return this.X3;
    }

    @Override // xc.e, xc.d0
    public xc.e0 s() {
        return xc.e0.ABSTRACT;
    }

    public String toString() {
        String b10 = getName().b();
        t.d(b10, "name.asString()");
        return b10;
    }

    @Override // xc.e
    public h1<m0> x0() {
        return null;
    }
}
