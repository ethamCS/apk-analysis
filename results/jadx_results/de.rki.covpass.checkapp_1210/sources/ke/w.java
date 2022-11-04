package ke;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import ke.z;
import td.b;
import ub.q0;
import xc.a;
import xc.a1;
import xc.b;
import xc.e1;
import xc.f1;
import xc.j1;
import xc.l0;
import xc.u0;
import xc.x0;
import xc.z0;
import yc.g;
/* loaded from: classes3.dex */
public final class w {

    /* renamed from: a */
    private final m f15105a;

    /* renamed from: b */
    private final ke.e f15106b;

    /* loaded from: classes3.dex */
    public static final class a extends hc.v implements gc.a<List<? extends yc.c>> {

        /* renamed from: d */
        final /* synthetic */ yd.q f15108d;

        /* renamed from: q */
        final /* synthetic */ ke.b f15109q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(yd.q qVar, ke.b bVar) {
            super(0);
            w.this = r1;
            this.f15108d = qVar;
            this.f15109q = bVar;
        }

        @Override // gc.a
        public final List<? extends yc.c> invoke() {
            List<? extends yc.c> list;
            List<? extends yc.c> h10;
            w wVar = w.this;
            z c10 = wVar.c(wVar.f15105a.e());
            if (c10 != null) {
                w wVar2 = w.this;
                list = ub.c0.F0(wVar2.f15105a.c().d().j(c10, this.f15108d, this.f15109q));
            } else {
                list = null;
            }
            if (list == null) {
                h10 = ub.u.h();
                return h10;
            }
            return list;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends hc.v implements gc.a<List<? extends yc.c>> {

        /* renamed from: d */
        final /* synthetic */ boolean f15111d;

        /* renamed from: q */
        final /* synthetic */ rd.n f15112q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z10, rd.n nVar) {
            super(0);
            w.this = r1;
            this.f15111d = z10;
            this.f15112q = nVar;
        }

        @Override // gc.a
        public final List<? extends yc.c> invoke() {
            List<? extends yc.c> list;
            List<? extends yc.c> h10;
            w wVar = w.this;
            z c10 = wVar.c(wVar.f15105a.e());
            if (c10 != null) {
                boolean z10 = this.f15111d;
                w wVar2 = w.this;
                rd.n nVar = this.f15112q;
                list = ub.c0.F0(z10 ? wVar2.f15105a.c().d().a(c10, nVar) : wVar2.f15105a.c().d().f(c10, nVar));
            } else {
                list = null;
            }
            if (list == null) {
                h10 = ub.u.h();
                return h10;
            }
            return list;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c extends hc.v implements gc.a<List<? extends yc.c>> {

        /* renamed from: d */
        final /* synthetic */ yd.q f15114d;

        /* renamed from: q */
        final /* synthetic */ ke.b f15115q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(yd.q qVar, ke.b bVar) {
            super(0);
            w.this = r1;
            this.f15114d = qVar;
            this.f15115q = bVar;
        }

        @Override // gc.a
        public final List<? extends yc.c> invoke() {
            List<yc.c> list;
            List<? extends yc.c> h10;
            w wVar = w.this;
            z c10 = wVar.c(wVar.f15105a.e());
            if (c10 != null) {
                w wVar2 = w.this;
                list = wVar2.f15105a.c().d().c(c10, this.f15114d, this.f15115q);
            } else {
                list = null;
            }
            if (list == null) {
                h10 = ub.u.h();
                return h10;
            }
            return list;
        }
    }

    /* loaded from: classes3.dex */
    public static final class d extends hc.v implements gc.a<ne.j<? extends ce.g<?>>> {

        /* renamed from: d */
        final /* synthetic */ rd.n f15117d;

        /* renamed from: q */
        final /* synthetic */ me.j f15118q;

        /* loaded from: classes3.dex */
        public static final class a extends hc.v implements gc.a<ce.g<?>> {

            /* renamed from: c */
            final /* synthetic */ w f15119c;

            /* renamed from: d */
            final /* synthetic */ rd.n f15120d;

            /* renamed from: q */
            final /* synthetic */ me.j f15121q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(w wVar, rd.n nVar, me.j jVar) {
                super(0);
                this.f15119c = wVar;
                this.f15120d = nVar;
                this.f15121q = jVar;
            }

            /* renamed from: b */
            public final ce.g<?> invoke() {
                w wVar = this.f15119c;
                z c10 = wVar.c(wVar.f15105a.e());
                hc.t.b(c10);
                ke.c<yc.c, ce.g<?>> d10 = this.f15119c.f15105a.c().d();
                rd.n nVar = this.f15120d;
                oe.e0 e10 = this.f15121q.e();
                hc.t.d(e10, "property.returnType");
                return d10.h(c10, nVar, e10);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(rd.n nVar, me.j jVar) {
            super(0);
            w.this = r1;
            this.f15117d = nVar;
            this.f15118q = jVar;
        }

        /* renamed from: b */
        public final ne.j<ce.g<?>> invoke() {
            return w.this.f15105a.h().f(new a(w.this, this.f15117d, this.f15118q));
        }
    }

    /* loaded from: classes3.dex */
    public static final class e extends hc.v implements gc.a<ne.j<? extends ce.g<?>>> {

        /* renamed from: d */
        final /* synthetic */ rd.n f15123d;

        /* renamed from: q */
        final /* synthetic */ me.j f15124q;

        /* loaded from: classes3.dex */
        public static final class a extends hc.v implements gc.a<ce.g<?>> {

            /* renamed from: c */
            final /* synthetic */ w f15125c;

            /* renamed from: d */
            final /* synthetic */ rd.n f15126d;

            /* renamed from: q */
            final /* synthetic */ me.j f15127q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(w wVar, rd.n nVar, me.j jVar) {
                super(0);
                this.f15125c = wVar;
                this.f15126d = nVar;
                this.f15127q = jVar;
            }

            /* renamed from: b */
            public final ce.g<?> invoke() {
                w wVar = this.f15125c;
                z c10 = wVar.c(wVar.f15105a.e());
                hc.t.b(c10);
                ke.c<yc.c, ce.g<?>> d10 = this.f15125c.f15105a.c().d();
                rd.n nVar = this.f15126d;
                oe.e0 e10 = this.f15127q.e();
                hc.t.d(e10, "property.returnType");
                return d10.e(c10, nVar, e10);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(rd.n nVar, me.j jVar) {
            super(0);
            w.this = r1;
            this.f15123d = nVar;
            this.f15124q = jVar;
        }

        /* renamed from: b */
        public final ne.j<ce.g<?>> invoke() {
            return w.this.f15105a.h().f(new a(w.this, this.f15123d, this.f15124q));
        }
    }

    /* loaded from: classes3.dex */
    public static final class f extends hc.v implements gc.a<List<? extends yc.c>> {
        final /* synthetic */ rd.u U3;

        /* renamed from: d */
        final /* synthetic */ z f15129d;

        /* renamed from: q */
        final /* synthetic */ yd.q f15130q;

        /* renamed from: x */
        final /* synthetic */ ke.b f15131x;

        /* renamed from: y */
        final /* synthetic */ int f15132y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(z zVar, yd.q qVar, ke.b bVar, int i10, rd.u uVar) {
            super(0);
            w.this = r1;
            this.f15129d = zVar;
            this.f15130q = qVar;
            this.f15131x = bVar;
            this.f15132y = i10;
            this.U3 = uVar;
        }

        @Override // gc.a
        public final List<? extends yc.c> invoke() {
            List<? extends yc.c> F0;
            F0 = ub.c0.F0(w.this.f15105a.c().d().g(this.f15129d, this.f15130q, this.f15131x, this.f15132y, this.U3));
            return F0;
        }
    }

    public w(m mVar) {
        hc.t.e(mVar, "c");
        this.f15105a = mVar;
        this.f15106b = new ke.e(mVar.c().p(), mVar.c().q());
    }

    public final z c(xc.m mVar) {
        if (mVar instanceof l0) {
            return new z.b(((l0) mVar).d(), this.f15105a.g(), this.f15105a.j(), this.f15105a.d());
        }
        if (!(mVar instanceof me.d)) {
            return null;
        }
        return ((me.d) mVar).o1();
    }

    private final yc.g d(yd.q qVar, int i10, ke.b bVar) {
        return !td.b.f22194c.d(i10).booleanValue() ? yc.g.Companion.b() : new me.n(this.f15105a.h(), new a(qVar, bVar));
    }

    private final x0 e() {
        xc.m e10 = this.f15105a.e();
        xc.e eVar = e10 instanceof xc.e ? (xc.e) e10 : null;
        if (eVar != null) {
            return eVar.S0();
        }
        return null;
    }

    private final yc.g f(rd.n nVar, boolean z10) {
        return !td.b.f22194c.d(nVar.C0()).booleanValue() ? yc.g.Companion.b() : new me.n(this.f15105a.h(), new b(z10, nVar));
    }

    private final yc.g g(yd.q qVar, ke.b bVar) {
        return new me.a(this.f15105a.h(), new c(qVar, bVar));
    }

    private final void h(me.k kVar, x0 x0Var, x0 x0Var2, List<? extends x0> list, List<? extends f1> list2, List<? extends j1> list3, oe.e0 e0Var, xc.e0 e0Var2, xc.u uVar, Map<? extends a.AbstractC0451a<?>, ?> map) {
        kVar.x1(x0Var, x0Var2, list, list2, list3, e0Var, e0Var2, uVar, map);
    }

    private final int k(int i10) {
        return (i10 & 63) + ((i10 >> 8) << 6);
    }

    private final x0 n(rd.q qVar, m mVar, xc.a aVar) {
        return ae.c.b(aVar, mVar.i().q(qVar), yc.g.Companion.b());
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List<xc.j1> o(java.util.List<rd.u> r26, yd.q r27, ke.b r28) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ke.w.o(java.util.List, yd.q, ke.b):java.util.List");
    }

    public final xc.d i(rd.d dVar, boolean z10) {
        List h10;
        hc.t.e(dVar, "proto");
        xc.m e10 = this.f15105a.e();
        hc.t.c(e10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        xc.e eVar = (xc.e) e10;
        int l02 = dVar.l0();
        ke.b bVar = ke.b.FUNCTION;
        me.c cVar = new me.c(eVar, null, d(dVar, l02, bVar), z10, b.a.DECLARATION, dVar, this.f15105a.g(), this.f15105a.j(), this.f15105a.k(), this.f15105a.d(), null, 1024, null);
        m mVar = this.f15105a;
        h10 = ub.u.h();
        w f10 = m.b(mVar, cVar, h10, null, null, null, null, 60, null).f();
        List<rd.u> o02 = dVar.o0();
        hc.t.d(o02, "proto.valueParameterList");
        cVar.z1(f10.o(o02, dVar, bVar), b0.a(a0.f15009a, td.b.f22195d.d(dVar.l0())));
        cVar.p1(eVar.u());
        cVar.f1(eVar.l0());
        cVar.h1(!td.b.f22205n.d(dVar.l0()).booleanValue());
        return cVar;
    }

    public final z0 j(rd.i iVar) {
        Map<? extends a.AbstractC0451a<?>, ?> h10;
        oe.e0 q10;
        hc.t.e(iVar, "proto");
        int E0 = iVar.U0() ? iVar.E0() : k(iVar.G0());
        ke.b bVar = ke.b.FUNCTION;
        yc.g d10 = d(iVar, E0, bVar);
        yc.g g10 = td.f.d(iVar) ? g(iVar, bVar) : yc.g.Companion.b();
        me.k kVar = new me.k(this.f15105a.e(), null, d10, x.b(this.f15105a.g(), iVar.F0()), b0.b(a0.f15009a, td.b.f22206o.d(E0)), iVar, this.f15105a.g(), this.f15105a.j(), hc.t.a(ee.a.h(this.f15105a.e()).c(x.b(this.f15105a.g(), iVar.F0())), c0.f15026a) ? td.h.Companion.b() : this.f15105a.k(), this.f15105a.d(), null, 1024, null);
        m mVar = this.f15105a;
        List<rd.s> N0 = iVar.N0();
        hc.t.d(N0, "proto.typeParameterList");
        m b10 = m.b(mVar, kVar, N0, null, null, null, null, 60, null);
        rd.q h11 = td.f.h(iVar, this.f15105a.j());
        x0 h12 = (h11 == null || (q10 = b10.i().q(h11)) == null) ? null : ae.c.h(kVar, q10, g10);
        x0 e10 = e();
        List<rd.q> A0 = iVar.A0();
        hc.t.d(A0, "proto.contextReceiverTypeList");
        List<? extends x0> arrayList = new ArrayList<>();
        for (rd.q qVar : A0) {
            hc.t.d(qVar, "it");
            x0 n10 = n(qVar, b10, kVar);
            if (n10 != null) {
                arrayList.add(n10);
            }
        }
        List<f1> j10 = b10.i().j();
        w f10 = b10.f();
        List<rd.u> R0 = iVar.R0();
        hc.t.d(R0, "proto.valueParameterList");
        List<j1> o10 = f10.o(R0, iVar, ke.b.FUNCTION);
        oe.e0 q11 = b10.i().q(td.f.j(iVar, this.f15105a.j()));
        a0 a0Var = a0.f15009a;
        xc.e0 b11 = a0Var.b(td.b.f22196e.d(E0));
        xc.u a10 = b0.a(a0Var, td.b.f22195d.d(E0));
        h10 = q0.h();
        h(kVar, h12, e10, arrayList, j10, o10, q11, b11, a10, h10);
        Boolean d11 = td.b.f22207p.d(E0);
        hc.t.d(d11, "IS_OPERATOR.get(flags)");
        kVar.o1(d11.booleanValue());
        Boolean d12 = td.b.f22208q.d(E0);
        hc.t.d(d12, "IS_INFIX.get(flags)");
        kVar.l1(d12.booleanValue());
        Boolean d13 = td.b.f22211t.d(E0);
        hc.t.d(d13, "IS_EXTERNAL_FUNCTION.get(flags)");
        kVar.g1(d13.booleanValue());
        Boolean d14 = td.b.f22209r.d(E0);
        hc.t.d(d14, "IS_INLINE.get(flags)");
        kVar.n1(d14.booleanValue());
        Boolean d15 = td.b.f22210s.d(E0);
        hc.t.d(d15, "IS_TAILREC.get(flags)");
        kVar.r1(d15.booleanValue());
        Boolean d16 = td.b.f22212u.d(E0);
        hc.t.d(d16, "IS_SUSPEND.get(flags)");
        kVar.q1(d16.booleanValue());
        Boolean d17 = td.b.f22213v.d(E0);
        hc.t.d(d17, "IS_EXPECT_FUNCTION.get(flags)");
        kVar.f1(d17.booleanValue());
        kVar.h1(!td.b.f22214w.d(E0).booleanValue());
        tb.r<a.AbstractC0451a<?>, Object> a11 = this.f15105a.c().h().a(iVar, kVar, this.f15105a.j(), b10.i());
        if (a11 != null) {
            kVar.d1(a11.e(), a11.f());
        }
        return kVar;
    }

    public final u0 l(rd.n nVar) {
        rd.n nVar2;
        yc.g gVar;
        me.j jVar;
        x0 x0Var;
        int s10;
        b.d<rd.x> dVar;
        m mVar;
        b.d<rd.k> dVar2;
        ad.d0 d0Var;
        ad.d0 d0Var2;
        ad.e0 e0Var;
        int i10;
        boolean z10;
        rd.n nVar3;
        me.j jVar2;
        List h10;
        List<rd.u> d10;
        Object s02;
        ad.d0 d0Var3;
        oe.e0 q10;
        hc.t.e(nVar, "proto");
        int C0 = nVar.Q0() ? nVar.C0() : k(nVar.F0());
        xc.m e10 = this.f15105a.e();
        yc.g d11 = d(nVar, C0, ke.b.PROPERTY);
        a0 a0Var = a0.f15009a;
        xc.e0 b10 = a0Var.b(td.b.f22196e.d(C0));
        xc.u a10 = b0.a(a0Var, td.b.f22195d.d(C0));
        Boolean d12 = td.b.f22215x.d(C0);
        hc.t.d(d12, "IS_VAR.get(flags)");
        boolean booleanValue = d12.booleanValue();
        wd.f b11 = x.b(this.f15105a.g(), nVar.E0());
        b.a b12 = b0.b(a0Var, td.b.f22206o.d(C0));
        Boolean d13 = td.b.B.d(C0);
        hc.t.d(d13, "IS_LATEINIT.get(flags)");
        boolean booleanValue2 = d13.booleanValue();
        Boolean d14 = td.b.A.d(C0);
        hc.t.d(d14, "IS_CONST.get(flags)");
        boolean booleanValue3 = d14.booleanValue();
        Boolean d15 = td.b.D.d(C0);
        hc.t.d(d15, "IS_EXTERNAL_PROPERTY.get(flags)");
        boolean booleanValue4 = d15.booleanValue();
        Boolean d16 = td.b.E.d(C0);
        hc.t.d(d16, "IS_DELEGATED.get(flags)");
        boolean booleanValue5 = d16.booleanValue();
        Boolean d17 = td.b.F.d(C0);
        hc.t.d(d17, "IS_EXPECT_PROPERTY.get(flags)");
        me.j jVar3 = new me.j(e10, null, d11, b10, a10, booleanValue, b11, b12, booleanValue2, booleanValue3, booleanValue4, booleanValue5, d17.booleanValue(), nVar, this.f15105a.g(), this.f15105a.j(), this.f15105a.k(), this.f15105a.d());
        m mVar2 = this.f15105a;
        List<rd.s> O0 = nVar.O0();
        hc.t.d(O0, "proto.typeParameterList");
        m b13 = m.b(mVar2, jVar3, O0, null, null, null, null, 60, null);
        Boolean d18 = td.b.f22216y.d(C0);
        hc.t.d(d18, "HAS_GETTER.get(flags)");
        boolean booleanValue6 = d18.booleanValue();
        if (!booleanValue6 || !td.f.e(nVar)) {
            nVar2 = nVar;
            gVar = yc.g.Companion.b();
        } else {
            nVar2 = nVar;
            gVar = g(nVar2, ke.b.PROPERTY_GETTER);
        }
        oe.e0 q11 = b13.i().q(td.f.k(nVar2, this.f15105a.j()));
        List<f1> j10 = b13.i().j();
        x0 e11 = e();
        rd.q i11 = td.f.i(nVar2, this.f15105a.j());
        xc.f fVar = null;
        if (i11 == null || (q10 = b13.i().q(i11)) == null) {
            jVar = jVar3;
            x0Var = null;
        } else {
            jVar = jVar3;
            x0Var = ae.c.h(jVar, q10, gVar);
        }
        List<rd.q> z02 = nVar.z0();
        hc.t.d(z02, "proto.contextReceiverTypeList");
        s10 = ub.v.s(z02, 10);
        ArrayList arrayList = new ArrayList(s10);
        for (rd.q qVar : z02) {
            hc.t.d(qVar, "it");
            arrayList.add(n(qVar, b13, jVar));
        }
        jVar.k1(q11, j10, e11, x0Var, arrayList);
        Boolean d19 = td.b.f22194c.d(C0);
        hc.t.d(d19, "HAS_ANNOTATIONS.get(flags)");
        boolean booleanValue7 = d19.booleanValue();
        b.d<rd.x> dVar3 = td.b.f22195d;
        b.d<rd.k> dVar4 = td.b.f22196e;
        int b14 = td.b.b(booleanValue7, dVar3.d(C0), dVar4.d(C0), false, false, false);
        if (booleanValue6) {
            int D0 = nVar.R0() ? nVar.D0() : b14;
            Boolean d20 = td.b.J.d(D0);
            hc.t.d(d20, "IS_NOT_DEFAULT.get(getterFlags)");
            boolean booleanValue8 = d20.booleanValue();
            Boolean d21 = td.b.K.d(D0);
            hc.t.d(d21, "IS_EXTERNAL_ACCESSOR.get(getterFlags)");
            boolean booleanValue9 = d21.booleanValue();
            Boolean d22 = td.b.L.d(D0);
            hc.t.d(d22, "IS_INLINE_ACCESSOR.get(getterFlags)");
            boolean booleanValue10 = d22.booleanValue();
            yc.g d23 = d(nVar2, D0, ke.b.PROPERTY_GETTER);
            if (booleanValue8) {
                a0 a0Var2 = a0.f15009a;
                mVar = b13;
                dVar2 = dVar4;
                dVar = dVar3;
                d0Var3 = new ad.d0(jVar, d23, a0Var2.b(dVar4.d(D0)), b0.a(a0Var2, dVar3.d(D0)), !booleanValue8, booleanValue9, booleanValue10, jVar.h(), null, a1.f25519a);
            } else {
                dVar = dVar3;
                mVar = b13;
                dVar2 = dVar4;
                d0Var3 = ae.c.d(jVar, d23);
                hc.t.d(d0Var3, "{\n                Descri…nnotations)\n            }");
            }
            d0Var3.Z0(jVar.e());
            d0Var = d0Var3;
        } else {
            dVar = dVar3;
            mVar = b13;
            dVar2 = dVar4;
            d0Var = null;
        }
        Boolean d24 = td.b.f22217z.d(C0);
        hc.t.d(d24, "HAS_SETTER.get(flags)");
        if (d24.booleanValue()) {
            if (nVar.Y0()) {
                b14 = nVar.K0();
            }
            int i12 = b14;
            Boolean d25 = td.b.J.d(i12);
            hc.t.d(d25, "IS_NOT_DEFAULT.get(setterFlags)");
            boolean booleanValue11 = d25.booleanValue();
            Boolean d26 = td.b.K.d(i12);
            hc.t.d(d26, "IS_EXTERNAL_ACCESSOR.get(setterFlags)");
            boolean booleanValue12 = d26.booleanValue();
            Boolean d27 = td.b.L.d(i12);
            hc.t.d(d27, "IS_INLINE_ACCESSOR.get(setterFlags)");
            boolean booleanValue13 = d27.booleanValue();
            ke.b bVar = ke.b.PROPERTY_SETTER;
            yc.g d28 = d(nVar2, i12, bVar);
            if (booleanValue11) {
                a0 a0Var3 = a0.f15009a;
                d0Var2 = d0Var;
                ad.e0 e0Var2 = new ad.e0(jVar, d28, a0Var3.b(dVar2.d(i12)), b0.a(a0Var3, dVar.d(i12)), !booleanValue11, booleanValue12, booleanValue13, jVar.h(), null, a1.f25519a);
                h10 = ub.u.h();
                z10 = true;
                jVar2 = jVar;
                nVar3 = nVar2;
                i10 = C0;
                w f10 = m.b(mVar, e0Var2, h10, null, null, null, null, 60, null).f();
                d10 = ub.t.d(nVar.L0());
                s02 = ub.c0.s0(f10.o(d10, nVar3, bVar));
                e0Var2.a1((j1) s02);
                e0Var = e0Var2;
            } else {
                d0Var2 = d0Var;
                jVar2 = jVar;
                nVar3 = nVar2;
                i10 = C0;
                z10 = true;
                e0Var = ae.c.e(jVar2, d28, yc.g.Companion.b());
                hc.t.d(e0Var, "{\n                Descri…          )\n            }");
            }
        } else {
            d0Var2 = d0Var;
            jVar2 = jVar;
            nVar3 = nVar2;
            i10 = C0;
            z10 = true;
            e0Var = null;
        }
        Boolean d29 = td.b.C.d(i10);
        hc.t.d(d29, "HAS_CONSTANT.get(flags)");
        if (d29.booleanValue()) {
            jVar2.U0(new d(nVar3, jVar2));
        }
        xc.m e12 = this.f15105a.e();
        xc.e eVar = e12 instanceof xc.e ? (xc.e) e12 : null;
        if (eVar != null) {
            fVar = eVar.h();
        }
        if (fVar == xc.f.ANNOTATION_CLASS) {
            jVar2.U0(new e(nVar3, jVar2));
        }
        jVar2.e1(d0Var2, e0Var, new ad.o(f(nVar3, false), jVar2), new ad.o(f(nVar3, z10), jVar2));
        return jVar2;
    }

    public final e1 m(rd.r rVar) {
        int s10;
        hc.t.e(rVar, "proto");
        g.a aVar = yc.g.Companion;
        List<rd.b> s02 = rVar.s0();
        hc.t.d(s02, "proto.annotationList");
        s10 = ub.v.s(s02, 10);
        ArrayList arrayList = new ArrayList(s10);
        for (rd.b bVar : s02) {
            ke.e eVar = this.f15106b;
            hc.t.d(bVar, "it");
            arrayList.add(eVar.a(bVar, this.f15105a.g()));
        }
        me.l lVar = new me.l(this.f15105a.h(), this.f15105a.e(), aVar.a(arrayList), x.b(this.f15105a.g(), rVar.y0()), b0.a(a0.f15009a, td.b.f22195d.d(rVar.x0())), rVar, this.f15105a.g(), this.f15105a.j(), this.f15105a.k(), this.f15105a.d());
        m mVar = this.f15105a;
        List<rd.s> B0 = rVar.B0();
        hc.t.d(B0, "proto.typeParameterList");
        m b10 = m.b(mVar, lVar, B0, null, null, null, null, 60, null);
        lVar.Z0(b10.i().j(), b10.i().l(td.f.o(rVar, this.f15105a.j()), false), b10.i().l(td.f.b(rVar, this.f15105a.j()), false));
        return lVar;
    }
}
