package xc;

import java.util.List;
import oe.r1;
/* loaded from: classes.dex */
final class c implements f1 {

    /* renamed from: c */
    private final f1 f25527c;

    /* renamed from: d */
    private final m f25528d;

    /* renamed from: q */
    private final int f25529q;

    public c(f1 f1Var, m mVar, int i10) {
        hc.t.e(f1Var, "originalDescriptor");
        hc.t.e(mVar, "declarationDescriptor");
        this.f25527c = f1Var;
        this.f25528d = mVar;
        this.f25529q = i10;
    }

    @Override // xc.f1
    public ne.n M() {
        return this.f25527c.M();
    }

    @Override // xc.f1
    public boolean Y() {
        return true;
    }

    @Override // xc.f1
    public boolean Z() {
        return this.f25527c.Z();
    }

    @Override // xc.f1, xc.h
    public f1 a() {
        f1 a10 = this.f25527c.a();
        hc.t.d(a10, "originalDescriptor.original");
        return a10;
    }

    @Override // xc.n, xc.y, xc.l
    public m b() {
        return this.f25528d;
    }

    @Override // xc.m
    public <R, D> R g0(o<R, D> oVar, D d10) {
        return (R) this.f25527c.g0(oVar, d10);
    }

    @Override // xc.j0
    public wd.f getName() {
        return this.f25527c.getName();
    }

    @Override // xc.f1
    public List<oe.e0> getUpperBounds() {
        return this.f25527c.getUpperBounds();
    }

    @Override // yc.a
    public yc.g j() {
        return this.f25527c.j();
    }

    @Override // xc.f1
    public int l() {
        return this.f25529q + this.f25527c.l();
    }

    @Override // xc.p
    public a1 m() {
        return this.f25527c.m();
    }

    @Override // xc.f1, xc.h
    public oe.e1 r() {
        return this.f25527c.r();
    }

    public String toString() {
        return this.f25527c + "[inner-copy]";
    }

    @Override // xc.h
    public oe.m0 u() {
        return this.f25527c.u();
    }

    @Override // xc.f1
    public r1 w() {
        return this.f25527c.w();
    }
}
