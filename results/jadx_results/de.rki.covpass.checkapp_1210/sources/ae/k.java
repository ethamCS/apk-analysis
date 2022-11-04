package ae;

import hc.t;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import oe.d1;
import oe.e0;
import oe.e1;
import pe.b;
import pe.e;
import se.u;
/* loaded from: classes3.dex */
public final class k implements pe.b {

    /* renamed from: a */
    private final Map<e1, e1> f464a;

    /* renamed from: b */
    private final e.a f465b;

    /* renamed from: c */
    private final pe.g f466c;

    /* renamed from: d */
    private final pe.f f467d;

    /* renamed from: e */
    private final gc.p<e0, e0, Boolean> f468e;

    /* loaded from: classes3.dex */
    public static final class a extends d1 {

        /* renamed from: k */
        final /* synthetic */ k f469k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z10, boolean z11, k kVar, pe.f fVar, pe.g gVar) {
            super(z10, z11, true, kVar, fVar, gVar);
            this.f469k = kVar;
        }

        @Override // oe.d1
        public boolean f(se.i iVar, se.i iVar2) {
            t.e(iVar, "subType");
            t.e(iVar2, "superType");
            if (iVar instanceof e0) {
                if (!(iVar2 instanceof e0)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                return ((Boolean) this.f469k.f468e.u(iVar, iVar2)).booleanValue();
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(Map<e1, ? extends e1> map, e.a aVar, pe.g gVar, pe.f fVar, gc.p<? super e0, ? super e0, Boolean> pVar) {
        t.e(aVar, "equalityAxioms");
        t.e(gVar, "kotlinTypeRefiner");
        t.e(fVar, "kotlinTypePreparator");
        this.f464a = map;
        this.f465b = aVar;
        this.f466c = gVar;
        this.f467d = fVar;
        this.f468e = pVar;
    }

    private final boolean G0(e1 e1Var, e1 e1Var2) {
        if (this.f465b.a(e1Var, e1Var2)) {
            return true;
        }
        Map<e1, e1> map = this.f464a;
        if (map == null) {
            return false;
        }
        e1 e1Var3 = map.get(e1Var);
        e1 e1Var4 = this.f464a.get(e1Var2);
        if (e1Var3 != null && t.a(e1Var3, e1Var2)) {
            return true;
        }
        return e1Var4 != null && t.a(e1Var4, e1Var);
    }

    @Override // se.p
    public boolean A(se.n nVar) {
        return b.a.N(this, nVar);
    }

    @Override // se.p
    public se.k A0(se.e eVar) {
        return b.a.t0(this, eVar);
    }

    @Override // se.p
    public boolean B(se.i iVar) {
        return b.a.S(this, iVar);
    }

    @Override // se.p
    public se.m B0(se.i iVar) {
        return b.a.j(this, iVar);
    }

    @Override // se.p
    public se.e C(se.k kVar) {
        return b.a.e(this, kVar);
    }

    @Override // se.s
    public boolean C0(se.k kVar, se.k kVar2) {
        return b.a.I(this, kVar, kVar2);
    }

    @Override // oe.m1
    public se.i D(se.i iVar) {
        return b.a.r0(this, iVar);
    }

    @Override // se.p
    public se.n D0(se.i iVar) {
        return b.a.B0(this, iVar);
    }

    @Override // oe.m1
    public uc.i E(se.n nVar) {
        return b.a.w(this, nVar);
    }

    @Override // se.p
    public boolean E0(se.n nVar) {
        return b.a.K(this, nVar);
    }

    @Override // se.p
    public boolean F(se.n nVar, se.n nVar2) {
        t.e(nVar, "c1");
        t.e(nVar2, "c2");
        if (nVar instanceof e1) {
            if (!(nVar2 instanceof e1)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            return b.a.a(this, nVar, nVar2) || G0((e1) nVar, (e1) nVar2);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // se.p
    public List<se.m> G(se.i iVar) {
        return b.a.r(this, iVar);
    }

    @Override // se.p
    public se.m H(se.k kVar, int i10) {
        return b.a.q(this, kVar, i10);
    }

    public d1 H0(boolean z10, boolean z11) {
        if (this.f468e == null) {
            return pe.a.a(z10, z11, this, this.f467d, this.f466c);
        }
        return new a(z10, z11, this, this.f467d, this.f466c);
    }

    @Override // se.p
    public u I(se.m mVar) {
        return b.a.D(this, mVar);
    }

    @Override // se.p
    public se.o J(se.n nVar, int i10) {
        return b.a.t(this, nVar, i10);
    }

    @Override // se.p
    public int K(se.n nVar) {
        return b.a.u0(this, nVar);
    }

    @Override // se.p
    public se.o L(se.t tVar) {
        return b.a.z(this, tVar);
    }

    @Override // se.p
    public se.i M(se.d dVar) {
        return b.a.p0(this, dVar);
    }

    @Override // pe.b
    public se.i N(se.k kVar, se.k kVar2) {
        return b.a.m(this, kVar, kVar2);
    }

    @Override // se.p
    public List<se.i> O(se.o oVar) {
        return b.a.C(this, oVar);
    }

    @Override // se.p
    public boolean P(se.k kVar) {
        return b.a.e0(this, kVar);
    }

    @Override // se.p
    public boolean Q(se.i iVar) {
        return b.a.P(this, iVar);
    }

    @Override // se.p
    public List<se.o> R(se.n nVar) {
        return b.a.u(this, nVar);
    }

    @Override // se.p
    public boolean S(se.o oVar, se.n nVar) {
        return b.a.H(this, oVar, nVar);
    }

    @Override // oe.m1
    public boolean T(se.n nVar) {
        return b.a.T(this, nVar);
    }

    @Override // se.p
    public boolean U(se.n nVar) {
        return b.a.b0(this, nVar);
    }

    @Override // se.p
    public boolean V(se.i iVar) {
        return b.a.c0(this, iVar);
    }

    @Override // oe.m1
    public boolean W(se.i iVar, wd.c cVar) {
        return b.a.F(this, iVar, cVar);
    }

    @Override // se.p
    public se.m X(se.i iVar, int i10) {
        return b.a.p(this, iVar, i10);
    }

    @Override // se.p
    public boolean Y(se.k kVar) {
        return b.a.j0(this, kVar);
    }

    @Override // se.p
    public List<se.k> Z(se.k kVar, se.n nVar) {
        return b.a.n(this, kVar, nVar);
    }

    @Override // pe.b, se.p
    public boolean a(se.k kVar) {
        return b.a.g0(this, kVar);
    }

    @Override // se.p
    public boolean a0(se.i iVar) {
        return b.a.a0(this, iVar);
    }

    @Override // pe.b, se.p
    public se.k b(se.g gVar) {
        return b.a.D0(this, gVar);
    }

    @Override // se.p
    public se.m b0(se.l lVar, int i10) {
        return b.a.o(this, lVar, i10);
    }

    @Override // pe.b, se.p
    public se.n c(se.k kVar) {
        return b.a.C0(this, kVar);
    }

    @Override // se.p
    public boolean c0(se.i iVar) {
        return b.a.X(this, iVar);
    }

    @Override // pe.b, se.p
    public se.k d(se.i iVar) {
        return b.a.i(this, iVar);
    }

    @Override // se.p
    public se.c d0(se.d dVar) {
        return b.a.A0(this, dVar);
    }

    @Override // pe.b, se.p
    public se.k e(se.g gVar) {
        return b.a.n0(this, gVar);
    }

    @Override // se.p
    public boolean e0(se.n nVar) {
        return b.a.V(this, nVar);
    }

    @Override // pe.b, se.p
    public se.k f(se.k kVar, boolean z10) {
        return b.a.G0(this, kVar, z10);
    }

    @Override // se.p
    public boolean f0(se.i iVar) {
        return b.a.G(this, iVar);
    }

    @Override // pe.b, se.p
    public se.d g(se.k kVar) {
        return b.a.d(this, kVar);
    }

    @Override // oe.m1
    public wd.d g0(se.n nVar) {
        return b.a.s(this, nVar);
    }

    @Override // se.p
    public se.f h(se.g gVar) {
        return b.a.f(this, gVar);
    }

    @Override // se.p
    public boolean h0(se.k kVar) {
        return b.a.M(this, kVar);
    }

    @Override // se.p
    public boolean i(se.m mVar) {
        return b.a.i0(this, mVar);
    }

    @Override // se.p
    public d1.c i0(se.k kVar) {
        return b.a.y0(this, kVar);
    }

    @Override // se.p
    public boolean j(se.n nVar) {
        return b.a.O(this, nVar);
    }

    @Override // se.p
    public se.b j0(se.d dVar) {
        return b.a.l(this, dVar);
    }

    @Override // se.p
    public boolean k(se.n nVar) {
        return b.a.W(this, nVar);
    }

    @Override // se.p
    public boolean k0(se.i iVar) {
        return b.a.Z(this, iVar);
    }

    @Override // se.p
    public boolean l(se.k kVar) {
        return b.a.Y(this, kVar);
    }

    @Override // se.p
    public boolean l0(se.i iVar) {
        return b.a.L(this, iVar);
    }

    @Override // se.p
    public boolean m(se.i iVar) {
        return b.a.l0(this, iVar);
    }

    @Override // se.p
    public Collection<se.i> m0(se.n nVar) {
        return b.a.z0(this, nVar);
    }

    @Override // oe.m1
    public se.i n(se.o oVar) {
        return b.a.x(this, oVar);
    }

    @Override // se.p
    public boolean n0(se.d dVar) {
        return b.a.f0(this, dVar);
    }

    @Override // se.p
    public u o(se.o oVar) {
        return b.a.E(this, oVar);
    }

    @Override // se.p
    public se.i o0(se.i iVar, boolean z10) {
        return b.a.F0(this, iVar, z10);
    }

    @Override // oe.m1
    public uc.i p(se.n nVar) {
        return b.a.v(this, nVar);
    }

    @Override // se.p
    public se.i p0(List<? extends se.i> list) {
        return b.a.J(this, list);
    }

    @Override // se.p
    public se.i q(se.m mVar) {
        return b.a.y(this, mVar);
    }

    @Override // se.p
    public se.g q0(se.i iVar) {
        return b.a.g(this, iVar);
    }

    @Override // se.p
    public se.i r(se.i iVar) {
        return b.a.q0(this, iVar);
    }

    @Override // se.p
    public boolean r0(se.n nVar) {
        return b.a.Q(this, nVar);
    }

    @Override // se.p
    public se.m s(se.c cVar) {
        return b.a.w0(this, cVar);
    }

    @Override // oe.m1
    public boolean s0(se.n nVar) {
        return b.a.m0(this, nVar);
    }

    @Override // se.p
    public boolean t(se.k kVar) {
        return b.a.k0(this, kVar);
    }

    @Override // se.p
    public int t0(se.i iVar) {
        return b.a.b(this, iVar);
    }

    @Override // se.p
    public boolean u(se.k kVar) {
        return b.a.U(this, kVar);
    }

    @Override // se.p
    public se.l u0(se.k kVar) {
        return b.a.c(this, kVar);
    }

    @Override // se.p
    public se.o v(se.n nVar) {
        return b.a.A(this, nVar);
    }

    @Override // se.p
    public se.j v0(se.g gVar) {
        return b.a.h(this, gVar);
    }

    @Override // se.p
    public se.k w(se.k kVar, se.b bVar) {
        return b.a.k(this, kVar, bVar);
    }

    @Override // se.p
    public Collection<se.i> w0(se.k kVar) {
        return b.a.v0(this, kVar);
    }

    @Override // se.p
    public se.k x(se.i iVar) {
        return b.a.E0(this, iVar);
    }

    @Override // se.p
    public se.k x0(se.i iVar) {
        return b.a.o0(this, iVar);
    }

    @Override // se.p
    public boolean y(se.d dVar) {
        return b.a.d0(this, dVar);
    }

    @Override // oe.m1
    public se.i y0(se.i iVar) {
        return b.a.B(this, iVar);
    }

    @Override // se.p
    public int z(se.l lVar) {
        return b.a.x0(this, lVar);
    }

    @Override // se.p
    public boolean z0(se.i iVar) {
        return b.a.R(this, iVar);
    }
}
