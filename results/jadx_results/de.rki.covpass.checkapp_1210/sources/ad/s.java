package ad;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import oe.e1;
import oe.j1;
import oe.l1;
import oe.n1;
import oe.r1;
import xc.a1;
import xc.f1;
import xc.h1;
import xc.x0;
/* loaded from: classes.dex */
public class s extends t {
    private e1 U3;

    /* renamed from: c */
    private final t f399c;

    /* renamed from: d */
    private final l1 f400d;

    /* renamed from: q */
    private l1 f401q;

    /* renamed from: x */
    private List<f1> f402x;

    /* renamed from: y */
    private List<f1> f403y;

    /* loaded from: classes.dex */
    public class a implements gc.l<f1, Boolean> {
        a() {
            s.this = r1;
        }

        /* renamed from: a */
        public Boolean invoke(f1 f1Var) {
            return Boolean.valueOf(!f1Var.Y());
        }
    }

    /* loaded from: classes.dex */
    class b implements gc.l<oe.m0, oe.m0> {
        b() {
            s.this = r1;
        }

        /* renamed from: a */
        public oe.m0 invoke(oe.m0 m0Var) {
            return s.this.V0(m0Var);
        }
    }

    public s(t tVar, l1 l1Var) {
        this.f399c = tVar;
        this.f400d = l1Var;
    }

    private l1 T0() {
        List<f1> R;
        if (this.f401q == null) {
            if (this.f400d.k()) {
                this.f401q = this.f400d;
            } else {
                List<f1> parameters = this.f399c.r().getParameters();
                this.f402x = new ArrayList(parameters.size());
                this.f401q = oe.t.b(parameters, this.f400d.j(), this, this.f402x);
                R = ub.c0.R(this.f402x, new a());
                this.f403y = R;
            }
        }
        return this.f401q;
    }

    public oe.m0 V0(oe.m0 m0Var) {
        return (m0Var == null || this.f400d.k()) ? m0Var : (oe.m0) T0().p(m0Var, r1.INVARIANT);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e3 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ void z0(int r15) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ad.s.z0(int):void");
    }

    @Override // xc.e, xc.i
    public List<f1> A() {
        T0();
        List<f1> list = this.f403y;
        if (list == null) {
            z0(30);
        }
        return list;
    }

    @Override // xc.e
    public xc.d A0() {
        return this.f399c.A0();
    }

    @Override // xc.e
    public he.h B0() {
        he.h B0 = this.f399c.B0();
        if (B0 == null) {
            z0(15);
        }
        return B0;
    }

    @Override // xc.e
    public xc.e E0() {
        return this.f399c.E0();
    }

    @Override // xc.d0
    public boolean H() {
        return this.f399c.H();
    }

    @Override // xc.e
    public he.h I0() {
        he.h y02 = y0(ee.a.k(ae.d.g(this.f399c)));
        if (y02 == null) {
            z0(12);
        }
        return y02;
    }

    @Override // xc.e
    public he.h K(j1 j1Var) {
        if (j1Var == null) {
            z0(10);
        }
        he.h e02 = e0(j1Var, ee.a.k(ae.d.g(this)));
        if (e02 == null) {
            z0(11);
        }
        return e02;
    }

    @Override // xc.d0
    public boolean L0() {
        return this.f399c.L0();
    }

    @Override // xc.e
    public boolean N() {
        return this.f399c.N();
    }

    @Override // xc.e
    public List<x0> O0() {
        List<x0> emptyList = Collections.emptyList();
        if (emptyList == null) {
            z0(17);
        }
        return emptyList;
    }

    @Override // xc.e
    public boolean R0() {
        return this.f399c.R0();
    }

    @Override // xc.e
    public x0 S0() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: U0 */
    public xc.e c(l1 l1Var) {
        if (l1Var == null) {
            z0(23);
        }
        return l1Var.k() ? this : new s(this, l1.h(l1Var.j(), T0().j()));
    }

    @Override // xc.e
    public boolean V() {
        return this.f399c.V();
    }

    @Override // xc.e, xc.m, xc.h
    public xc.e a() {
        xc.e a10 = this.f399c.a();
        if (a10 == null) {
            z0(21);
        }
        return a10;
    }

    @Override // xc.e, xc.n, xc.y, xc.l
    public xc.m b() {
        xc.m b10 = this.f399c.b();
        if (b10 == null) {
            z0(22);
        }
        return b10;
    }

    @Override // ad.t
    public he.h e0(j1 j1Var, pe.g gVar) {
        if (j1Var == null) {
            z0(5);
        }
        if (gVar == null) {
            z0(6);
        }
        he.h e02 = this.f399c.e0(j1Var, gVar);
        if (this.f400d.k()) {
            if (e02 == null) {
                z0(7);
            }
            return e02;
        }
        return new he.m(e02, T0());
    }

    @Override // xc.e, xc.q, xc.d0
    public xc.u g() {
        xc.u g10 = this.f399c.g();
        if (g10 == null) {
            z0(27);
        }
        return g10;
    }

    @Override // xc.m
    public <R, D> R g0(xc.o<R, D> oVar, D d10) {
        return oVar.d(this, d10);
    }

    @Override // xc.j0
    public wd.f getName() {
        wd.f name = this.f399c.getName();
        if (name == null) {
            z0(20);
        }
        return name;
    }

    @Override // xc.e
    public xc.f h() {
        xc.f h10 = this.f399c.h();
        if (h10 == null) {
            z0(25);
        }
        return h10;
    }

    @Override // xc.e
    public boolean isInline() {
        return this.f399c.isInline();
    }

    @Override // yc.a
    public yc.g j() {
        yc.g j10 = this.f399c.j();
        if (j10 == null) {
            z0(19);
        }
        return j10;
    }

    @Override // xc.e
    public boolean j0() {
        return this.f399c.j0();
    }

    @Override // xc.e
    public Collection<xc.d> k() {
        Collection<xc.d> k10 = this.f399c.k();
        ArrayList arrayList = new ArrayList(k10.size());
        for (xc.d dVar : k10) {
            arrayList.add(((xc.d) dVar.y().k(dVar.a()).t(dVar.s()).o(dVar.g()).e(dVar.h()).q(false).b()).c(T0()));
        }
        return arrayList;
    }

    @Override // xc.d0
    public boolean l0() {
        return this.f399c.l0();
    }

    @Override // xc.p
    public a1 m() {
        a1 a1Var = a1.f25519a;
        if (a1Var == null) {
            z0(29);
        }
        return a1Var;
    }

    @Override // xc.i
    public boolean m0() {
        return this.f399c.m0();
    }

    @Override // xc.h
    public e1 r() {
        e1 r10 = this.f399c.r();
        if (this.f400d.k()) {
            if (r10 == null) {
                z0(0);
            }
            return r10;
        }
        if (this.U3 == null) {
            l1 T0 = T0();
            Collection<oe.e0> l10 = r10.l();
            ArrayList arrayList = new ArrayList(l10.size());
            for (oe.e0 e0Var : l10) {
                arrayList.add(T0.p(e0Var, r1.INVARIANT));
            }
            this.U3 = new oe.l(this, this.f402x, arrayList, ne.f.f16977e);
        }
        e1 e1Var = this.U3;
        if (e1Var == null) {
            z0(1);
        }
        return e1Var;
    }

    @Override // xc.e, xc.d0
    public xc.e0 s() {
        xc.e0 s10 = this.f399c.s();
        if (s10 == null) {
            z0(26);
        }
        return s10;
    }

    @Override // xc.e, xc.h
    public oe.m0 u() {
        oe.m0 j10 = oe.f0.j(oe.o.f18029a.a(j(), null, null), r(), n1.g(r().getParameters()), false, I0());
        if (j10 == null) {
            z0(16);
        }
        return j10;
    }

    @Override // xc.e
    public Collection<xc.e> v() {
        Collection<xc.e> v10 = this.f399c.v();
        if (v10 == null) {
            z0(31);
        }
        return v10;
    }

    @Override // xc.e
    public he.h w0() {
        he.h w02 = this.f399c.w0();
        if (w02 == null) {
            z0(28);
        }
        return w02;
    }

    @Override // xc.e
    public h1<oe.m0> x0() {
        h1<oe.m0> x02 = this.f399c.x0();
        if (x02 == null) {
            return null;
        }
        return x02.b(new b());
    }

    @Override // ad.t
    public he.h y0(pe.g gVar) {
        if (gVar == null) {
            z0(13);
        }
        he.h y02 = this.f399c.y0(gVar);
        if (this.f400d.k()) {
            if (y02 == null) {
                z0(14);
            }
            return y02;
        }
        return new he.m(y02, T0());
    }
}
