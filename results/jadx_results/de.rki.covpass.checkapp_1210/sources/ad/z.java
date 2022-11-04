package ad;

import xc.a1;
/* loaded from: classes.dex */
public abstract class z extends k implements xc.l0 {
    private final String U3;

    /* renamed from: y */
    private final wd.c f420y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(xc.h0 h0Var, wd.c cVar) {
        super(h0Var, yc.g.Companion.b(), cVar.h(), a1.f25519a);
        hc.t.e(h0Var, "module");
        hc.t.e(cVar, "fqName");
        this.f420y = cVar;
        this.U3 = "package " + cVar + " of " + h0Var;
    }

    @Override // ad.k, xc.m, xc.n, xc.y, xc.l
    public xc.h0 b() {
        xc.m b10 = super.b();
        hc.t.c(b10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ModuleDescriptor");
        return (xc.h0) b10;
    }

    @Override // xc.l0
    public final wd.c d() {
        return this.f420y;
    }

    @Override // xc.m
    public <R, D> R g0(xc.o<R, D> oVar, D d10) {
        hc.t.e(oVar, "visitor");
        return oVar.a(this, d10);
    }

    @Override // ad.k, xc.p
    public a1 m() {
        a1 a1Var = a1.f25519a;
        hc.t.d(a1Var, "NO_SOURCE");
        return a1Var;
    }

    @Override // ad.j
    public String toString() {
        return this.U3;
    }
}
