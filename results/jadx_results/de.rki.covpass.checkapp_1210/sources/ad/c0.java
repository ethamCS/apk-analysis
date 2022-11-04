package ad;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import oe.j1;
import oe.l1;
import oe.r1;
import xc.a;
import xc.a1;
import xc.b;
import xc.f1;
import xc.t0;
import xc.u0;
import xc.v0;
import xc.w0;
import xc.x0;
/* loaded from: classes.dex */
public class c0 extends n0 implements u0 {
    private final xc.e0 X3;
    private xc.u Y3;
    private Collection<? extends u0> Z3;

    /* renamed from: a4 */
    private final u0 f259a4;

    /* renamed from: b4 */
    private final b.a f260b4;

    /* renamed from: c4 */
    private final boolean f261c4;

    /* renamed from: d4 */
    private final boolean f262d4;

    /* renamed from: e4 */
    private final boolean f263e4;

    /* renamed from: f4 */
    private final boolean f264f4;

    /* renamed from: g4 */
    private final boolean f265g4;

    /* renamed from: h4 */
    private final boolean f266h4;

    /* renamed from: i4 */
    private List<x0> f267i4;

    /* renamed from: j4 */
    private x0 f268j4;

    /* renamed from: k4 */
    private x0 f269k4;

    /* renamed from: l4 */
    private List<f1> f270l4;

    /* renamed from: m4 */
    private d0 f271m4;

    /* renamed from: n4 */
    private w0 f272n4;

    /* renamed from: o4 */
    private boolean f273o4;

    /* renamed from: p4 */
    private xc.w f274p4;

    /* renamed from: q4 */
    private xc.w f275q4;

    /* loaded from: classes.dex */
    public class a {

        /* renamed from: a */
        private xc.m f276a;

        /* renamed from: b */
        private xc.e0 f277b;

        /* renamed from: c */
        private xc.u f278c;

        /* renamed from: f */
        private b.a f281f;

        /* renamed from: i */
        private x0 f284i;

        /* renamed from: k */
        private wd.f f286k;

        /* renamed from: l */
        private oe.e0 f287l;

        /* renamed from: d */
        private u0 f279d = null;

        /* renamed from: e */
        private boolean f280e = false;

        /* renamed from: g */
        private j1 f282g = j1.f18005a;

        /* renamed from: h */
        private boolean f283h = true;

        /* renamed from: j */
        private List<f1> f285j = null;

        public a() {
            c0.this = r3;
            this.f276a = r3.b();
            this.f277b = r3.s();
            this.f278c = r3.g();
            this.f281f = r3.h();
            this.f284i = r3.f268j4;
            this.f286k = r3.getName();
            this.f287l = r3.getType();
        }

        private static /* synthetic */ void a(int i10) {
            String str = (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 5 || i10 == 7 || i10 == 9 || i10 == 11 || i10 == 19 || i10 == 13 || i10 == 14 || i10 == 16 || i10 == 17) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i10 == 1 || i10 == 2 || i10 == 3 || i10 == 5 || i10 == 7 || i10 == 9 || i10 == 11 || i10 == 19 || i10 == 13 || i10 == 14 || i10 == 16 || i10 == 17) ? 2 : 3];
            switch (i10) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 13:
                case 14:
                case 16:
                case 17:
                case 19:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
                    break;
                case 4:
                    objArr[0] = "type";
                    break;
                case 6:
                    objArr[0] = "modality";
                    break;
                case 8:
                    objArr[0] = "visibility";
                    break;
                case 10:
                    objArr[0] = "kind";
                    break;
                case 12:
                    objArr[0] = "typeParameters";
                    break;
                case 15:
                    objArr[0] = "substitution";
                    break;
                case 18:
                    objArr[0] = "name";
                    break;
                default:
                    objArr[0] = "owner";
                    break;
            }
            if (i10 == 1) {
                objArr[1] = "setOwner";
            } else if (i10 == 2) {
                objArr[1] = "setOriginal";
            } else if (i10 == 3) {
                objArr[1] = "setPreserveSourceElement";
            } else if (i10 == 5) {
                objArr[1] = "setReturnType";
            } else if (i10 == 7) {
                objArr[1] = "setModality";
            } else if (i10 == 9) {
                objArr[1] = "setVisibility";
            } else if (i10 == 11) {
                objArr[1] = "setKind";
            } else if (i10 == 19) {
                objArr[1] = "setName";
            } else if (i10 == 13) {
                objArr[1] = "setTypeParameters";
            } else if (i10 == 14) {
                objArr[1] = "setDispatchReceiverParameter";
            } else if (i10 == 16) {
                objArr[1] = "setSubstitution";
            } else if (i10 != 17) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
            } else {
                objArr[1] = "setCopyOverrides";
            }
            switch (i10) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 13:
                case 14:
                case 16:
                case 17:
                case 19:
                    break;
                case 4:
                    objArr[2] = "setReturnType";
                    break;
                case 6:
                    objArr[2] = "setModality";
                    break;
                case 8:
                    objArr[2] = "setVisibility";
                    break;
                case 10:
                    objArr[2] = "setKind";
                    break;
                case 12:
                    objArr[2] = "setTypeParameters";
                    break;
                case 15:
                    objArr[2] = "setSubstitution";
                    break;
                case 18:
                    objArr[2] = "setName";
                    break;
                default:
                    objArr[2] = "setOwner";
                    break;
            }
            String format = String.format(str, objArr);
            if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 5 || i10 == 7 || i10 == 9 || i10 == 11 || i10 == 19 || i10 == 13 || i10 == 14 || i10 == 16 || i10 == 17) {
                throw new IllegalStateException(format);
            }
        }

        public u0 n() {
            return c0.this.Z0(this);
        }

        v0 o() {
            u0 u0Var = this.f279d;
            if (u0Var == null) {
                return null;
            }
            return u0Var.i();
        }

        w0 p() {
            u0 u0Var = this.f279d;
            if (u0Var == null) {
                return null;
            }
            return u0Var.n();
        }

        public a q(boolean z10) {
            this.f283h = z10;
            return this;
        }

        public a r(b.a aVar) {
            if (aVar == null) {
                a(10);
            }
            this.f281f = aVar;
            return this;
        }

        public a s(xc.e0 e0Var) {
            if (e0Var == null) {
                a(6);
            }
            this.f277b = e0Var;
            return this;
        }

        public a t(xc.b bVar) {
            this.f279d = (u0) bVar;
            return this;
        }

        public a u(xc.m mVar) {
            if (mVar == null) {
                a(0);
            }
            this.f276a = mVar;
            return this;
        }

        public a v(j1 j1Var) {
            if (j1Var == null) {
                a(15);
            }
            this.f282g = j1Var;
            return this;
        }

        public a w(xc.u uVar) {
            if (uVar == null) {
                a(8);
            }
            this.f278c = uVar;
            return this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(xc.m mVar, u0 u0Var, yc.g gVar, xc.e0 e0Var, xc.u uVar, boolean z10, wd.f fVar, b.a aVar, a1 a1Var, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        super(mVar, gVar, fVar, null, z10, a1Var);
        if (mVar == null) {
            e0(0);
        }
        if (gVar == null) {
            e0(1);
        }
        if (e0Var == null) {
            e0(2);
        }
        if (uVar == null) {
            e0(3);
        }
        if (fVar == null) {
            e0(4);
        }
        if (aVar == null) {
            e0(5);
        }
        if (a1Var == null) {
            e0(6);
        }
        this.Z3 = null;
        this.f267i4 = Collections.emptyList();
        this.X3 = e0Var;
        this.Y3 = uVar;
        this.f259a4 = u0Var == null ? this : u0Var;
        this.f260b4 = aVar;
        this.f261c4 = z11;
        this.f262d4 = z12;
        this.f263e4 = z13;
        this.f264f4 = z14;
        this.f265g4 = z15;
        this.f266h4 = z16;
    }

    public static c0 X0(xc.m mVar, yc.g gVar, xc.e0 e0Var, xc.u uVar, boolean z10, wd.f fVar, b.a aVar, a1 a1Var, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        if (mVar == null) {
            e0(7);
        }
        if (gVar == null) {
            e0(8);
        }
        if (e0Var == null) {
            e0(9);
        }
        if (uVar == null) {
            e0(10);
        }
        if (fVar == null) {
            e0(11);
        }
        if (aVar == null) {
            e0(12);
        }
        if (a1Var == null) {
            e0(13);
        }
        return new c0(mVar, null, gVar, e0Var, uVar, z10, fVar, aVar, a1Var, z11, z12, z13, z14, z15, z16);
    }

    private a1 b1(boolean z10, u0 u0Var) {
        a1 a1Var;
        if (z10) {
            if (u0Var == null) {
                u0Var = z0();
            }
            a1Var = u0Var.m();
        } else {
            a1Var = a1.f25519a;
        }
        if (a1Var == null) {
            e0(28);
        }
        return a1Var;
    }

    private static xc.y c1(l1 l1Var, t0 t0Var) {
        if (l1Var == null) {
            e0(30);
        }
        if (t0Var == null) {
            e0(31);
        }
        if (t0Var.G() != null) {
            return t0Var.G().c(l1Var);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x011e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ void e0(int r11) {
        /*
            Method dump skipped, instructions count: 538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ad.c0.e0(int):void");
    }

    private static xc.u h1(xc.u uVar, b.a aVar) {
        return (aVar != b.a.FAKE_OVERRIDE || !xc.t.g(uVar.f())) ? uVar : xc.t.f25584h;
    }

    private static x0 m1(l1 l1Var, u0 u0Var, x0 x0Var) {
        oe.e0 p10 = l1Var.p(x0Var.getType(), r1.IN_VARIANCE);
        if (p10 == null) {
            return null;
        }
        return new f0(u0Var, new ie.c(u0Var, p10, x0Var.getValue()), x0Var.j());
    }

    private static x0 n1(l1 l1Var, u0 u0Var, x0 x0Var) {
        oe.e0 p10 = l1Var.p(x0Var.getType(), r1.IN_VARIANCE);
        if (p10 == null) {
            return null;
        }
        return new f0(u0Var, new ie.d(u0Var, p10, x0Var.getValue()), x0Var.j());
    }

    @Override // xc.u0
    public List<t0> B() {
        ArrayList arrayList = new ArrayList(2);
        d0 d0Var = this.f271m4;
        if (d0Var != null) {
            arrayList.add(d0Var);
        }
        w0 w0Var = this.f272n4;
        if (w0Var != null) {
            arrayList.add(w0Var);
        }
        return arrayList;
    }

    @Override // xc.a
    public <V> V D(a.AbstractC0451a<V> abstractC0451a) {
        return null;
    }

    @Override // xc.d0
    public boolean H() {
        return this.f265g4;
    }

    @Override // ad.m0, xc.a
    public x0 J() {
        return this.f268j4;
    }

    @Override // xc.d0
    public boolean L0() {
        return this.f264f4;
    }

    @Override // xc.k1
    public boolean P() {
        return this.f262d4;
    }

    @Override // ad.m0, xc.a
    public x0 U() {
        return this.f269k4;
    }

    @Override // xc.u0
    public xc.w W() {
        return this.f275q4;
    }

    /* renamed from: W0 */
    public u0 n0(xc.m mVar, xc.e0 e0Var, xc.u uVar, b.a aVar, boolean z10) {
        u0 n10 = g1().u(mVar).t(null).s(e0Var).w(uVar).r(aVar).q(z10).n();
        if (n10 == null) {
            e0(42);
        }
        return n10;
    }

    protected c0 Y0(xc.m mVar, xc.e0 e0Var, xc.u uVar, u0 u0Var, b.a aVar, wd.f fVar, a1 a1Var) {
        if (mVar == null) {
            e0(32);
        }
        if (e0Var == null) {
            e0(33);
        }
        if (uVar == null) {
            e0(34);
        }
        if (aVar == null) {
            e0(35);
        }
        if (fVar == null) {
            e0(36);
        }
        if (a1Var == null) {
            e0(37);
        }
        return new c0(mVar, u0Var, j(), e0Var, uVar, Q(), fVar, aVar, a1Var, h0(), P(), l0(), L0(), H(), q0());
    }

    protected u0 Z0(a aVar) {
        x0 x0Var;
        gc.a<ne.j<ce.g<?>>> aVar2;
        if (aVar == null) {
            e0(29);
        }
        c0 Y0 = Y0(aVar.f276a, aVar.f277b, aVar.f278c, aVar.f279d, aVar.f281f, aVar.f286k, b1(aVar.f280e, aVar.f279d));
        List<f1> p10 = aVar.f285j == null ? p() : aVar.f285j;
        ArrayList arrayList = new ArrayList(p10.size());
        l1 b10 = oe.t.b(p10, aVar.f282g, Y0, arrayList);
        oe.e0 e0Var = aVar.f287l;
        oe.e0 p11 = b10.p(e0Var, r1.OUT_VARIANCE);
        o oVar = null;
        if (p11 == null) {
            return null;
        }
        oe.e0 p12 = b10.p(e0Var, r1.IN_VARIANCE);
        if (p12 != null) {
            Y0.i1(p12);
        }
        x0 x0Var2 = aVar.f284i;
        if (x0Var2 != null) {
            x0 c10 = x0Var2.c(b10);
            if (c10 == null) {
                return null;
            }
            x0Var = c10;
        } else {
            x0Var = null;
        }
        x0 x0Var3 = this.f269k4;
        x0 n12 = x0Var3 != null ? n1(b10, Y0, x0Var3) : null;
        ArrayList arrayList2 = new ArrayList();
        for (x0 x0Var4 : this.f267i4) {
            x0 m12 = m1(b10, Y0, x0Var4);
            if (m12 != null) {
                arrayList2.add(m12);
            }
        }
        Y0.k1(p11, arrayList, x0Var, n12, arrayList2);
        d0 d0Var = this.f271m4 == null ? null : new d0(Y0, this.f271m4.j(), aVar.f277b, h1(this.f271m4.g(), aVar.f281f), this.f271m4.F0(), this.f271m4.H(), this.f271m4.isInline(), aVar.f281f, aVar.o(), a1.f25519a);
        if (d0Var != null) {
            oe.e0 e10 = this.f271m4.e();
            d0Var.W0(c1(b10, this.f271m4));
            d0Var.Z0(e10 != null ? b10.p(e10, r1.OUT_VARIANCE) : null);
        }
        e0 e0Var2 = this.f272n4 == null ? null : new e0(Y0, this.f272n4.j(), aVar.f277b, h1(this.f272n4.g(), aVar.f281f), this.f272n4.F0(), this.f272n4.H(), this.f272n4.isInline(), aVar.f281f, aVar.p(), a1.f25519a);
        if (e0Var2 != null) {
            List<xc.j1> Y02 = p.Y0(e0Var2, this.f272n4.o(), b10, false, false, null);
            if (Y02 == null) {
                Y0.j1(true);
                Y02 = Collections.singletonList(e0.Y0(e0Var2, ee.a.f(aVar.f276a).H(), this.f272n4.o().get(0).j()));
            }
            if (Y02.size() != 1) {
                throw new IllegalStateException();
            }
            e0Var2.W0(c1(b10, this.f272n4));
            e0Var2.a1(Y02.get(0));
        }
        xc.w wVar = this.f274p4;
        o oVar2 = wVar == null ? null : new o(wVar.j(), Y0);
        xc.w wVar2 = this.f275q4;
        if (wVar2 != null) {
            oVar = new o(wVar2.j(), Y0);
        }
        Y0.e1(d0Var, e0Var2, oVar2, oVar);
        if (aVar.f283h) {
            ye.f a10 = ye.f.a();
            for (u0 u0Var : f()) {
                a10.add(u0Var.c(b10));
            }
            Y0.t0(a10);
        }
        if (P() && (aVar2 = this.W3) != null) {
            Y0.T0(this.V3, aVar2);
        }
        return Y0;
    }

    @Override // ad.k, ad.j, xc.m, xc.h
    /* renamed from: a */
    public u0 z0() {
        u0 u0Var = this.f259a4;
        u0 a10 = u0Var == this ? this : u0Var.a();
        if (a10 == null) {
            e0(38);
        }
        return a10;
    }

    /* renamed from: a1 */
    public d0 i() {
        return this.f271m4;
    }

    @Override // xc.c1
    public xc.a c(l1 l1Var) {
        if (l1Var == null) {
            e0(27);
        }
        return l1Var.k() ? this : g1().v(l1Var.j()).t(z0()).n();
    }

    @Override // xc.u0
    public xc.w c0() {
        return this.f274p4;
    }

    @Override // xc.a
    public List<x0> d0() {
        List<x0> list = this.f267i4;
        if (list == null) {
            e0(22);
        }
        return list;
    }

    public void d1(d0 d0Var, w0 w0Var) {
        e1(d0Var, w0Var, null, null);
    }

    @Override // ad.m0, xc.a
    public oe.e0 e() {
        oe.e0 type = getType();
        if (type == null) {
            e0(23);
        }
        return type;
    }

    public void e1(d0 d0Var, w0 w0Var, xc.w wVar, xc.w wVar2) {
        this.f271m4 = d0Var;
        this.f272n4 = w0Var;
        this.f274p4 = wVar;
        this.f275q4 = wVar2;
    }

    @Override // xc.a
    public Collection<? extends u0> f() {
        Collection<? extends u0> collection = this.Z3;
        if (collection == null) {
            collection = Collections.emptyList();
        }
        if (collection == null) {
            e0(41);
        }
        return collection;
    }

    public boolean f1() {
        return this.f273o4;
    }

    @Override // xc.q, xc.d0
    public xc.u g() {
        xc.u uVar = this.Y3;
        if (uVar == null) {
            e0(25);
        }
        return uVar;
    }

    @Override // xc.m
    public <R, D> R g0(xc.o<R, D> oVar, D d10) {
        return oVar.j(this, d10);
    }

    public a g1() {
        return new a();
    }

    @Override // xc.b
    public b.a h() {
        b.a aVar = this.f260b4;
        if (aVar == null) {
            e0(39);
        }
        return aVar;
    }

    @Override // xc.k1
    public boolean h0() {
        return this.f261c4;
    }

    public void i1(oe.e0 e0Var) {
        if (e0Var == null) {
            e0(14);
        }
    }

    public void j1(boolean z10) {
        this.f273o4 = z10;
    }

    public void k1(oe.e0 e0Var, List<? extends f1> list, x0 x0Var, x0 x0Var2, List<x0> list2) {
        if (e0Var == null) {
            e0(17);
        }
        if (list == null) {
            e0(18);
        }
        if (list2 == null) {
            e0(19);
        }
        M0(e0Var);
        this.f270l4 = new ArrayList(list);
        this.f269k4 = x0Var2;
        this.f268j4 = x0Var;
        this.f267i4 = list2;
    }

    @Override // xc.d0
    public boolean l0() {
        return this.f263e4;
    }

    public void l1(xc.u uVar) {
        if (uVar == null) {
            e0(20);
        }
        this.Y3 = uVar;
    }

    @Override // xc.u0
    public w0 n() {
        return this.f272n4;
    }

    @Override // ad.m0, xc.a
    public List<f1> p() {
        List<f1> list = this.f270l4;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("typeParameters == null for " + toString());
    }

    @Override // xc.l1
    public boolean q0() {
        return this.f266h4;
    }

    @Override // xc.d0
    public xc.e0 s() {
        xc.e0 e0Var = this.X3;
        if (e0Var == null) {
            e0(24);
        }
        return e0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xc.b
    public void t0(Collection<? extends xc.b> collection) {
        if (collection == 0) {
            e0(40);
        }
        this.Z3 = collection;
    }
}
