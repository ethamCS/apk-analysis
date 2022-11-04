package oe;
/* loaded from: classes3.dex */
public final class a0 extends y implements o1 {

    /* renamed from: x */
    private final y f17916x;

    /* renamed from: y */
    private final e0 f17917y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(y yVar, e0 e0Var) {
        super(yVar.e1(), yVar.f1());
        hc.t.e(yVar, "origin");
        hc.t.e(e0Var, "enhancement");
        this.f17916x = yVar;
        this.f17917y = e0Var;
    }

    @Override // oe.q1
    public q1 a1(boolean z10) {
        return p1.d(M0().a1(z10), e0().Z0().a1(z10));
    }

    @Override // oe.q1
    public q1 c1(a1 a1Var) {
        hc.t.e(a1Var, "newAttributes");
        return p1.d(M0().c1(a1Var), e0());
    }

    @Override // oe.y
    public m0 d1() {
        return M0().d1();
    }

    @Override // oe.o1
    public e0 e0() {
        return this.f17917y;
    }

    @Override // oe.y
    public String g1(zd.c cVar, zd.f fVar) {
        hc.t.e(cVar, "renderer");
        hc.t.e(fVar, "options");
        return fVar.k() ? cVar.w(e0()) : M0().g1(cVar, fVar);
    }

    /* renamed from: h1 */
    public y M0() {
        return this.f17916x;
    }

    /* renamed from: i1 */
    public a0 b1(pe.g gVar) {
        hc.t.e(gVar, "kotlinTypeRefiner");
        e0 h10 = gVar.h(M0());
        hc.t.c(h10, "null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType");
        return new a0((y) h10, gVar.h(e0()));
    }

    @Override // oe.y
    public String toString() {
        return "[@EnhancedForWarnings(" + e0() + ")] " + M0();
    }
}
