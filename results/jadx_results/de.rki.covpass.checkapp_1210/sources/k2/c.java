package k2;

import h3.d;
import java.util.List;
import ok.g;
/* loaded from: classes.dex */
public class c implements d {

    /* renamed from: a */
    h3.d f14578a;

    /* renamed from: b */
    g3.c f14579b;

    public c(b bVar) {
        h3.d dVar = new h3.d();
        this.f14578a = dVar;
        dVar.M(bVar.f14577y);
        this.f14578a.I(bVar.X3);
        this.f14578a.K(bVar.f14574q);
        this.f14578a.L(bVar.f14573d);
        this.f14578a.G(bVar.U3);
        this.f14578a.D(bVar.f14575x);
        this.f14578a.O(bVar.W3);
        this.f14578a.F(bVar.V3);
        this.f14578a.E(bVar.Y3);
        this.f14578a.J(bVar.Z3);
        this.f14578a.H(bVar.f14572c);
        int i10 = bVar.f14576a4;
        if (i10 > 0) {
            this.f14579b = new g3.c(bVar.f14572c, i10);
        }
    }

    @Override // k2.d
    public void a(int i10) {
        this.f14578a.L(i10);
    }

    @Override // k2.d
    public int b() {
        return this.f14578a.n();
    }

    @Override // k2.d
    public void c(boolean z10) {
        this.f14578a.D(z10);
    }

    @Override // k2.d
    public boolean d() {
        return this.f14578a.r();
    }

    @Override // k2.d
    public void e(int i10) {
        this.f14578a.K(i10);
    }

    @Override // k2.d
    public boolean f(List<ka.c> list, g gVar) {
        d.a m10;
        if (this.f14578a.w(list) && (m10 = this.f14578a.m()) != null) {
            gVar.k(m10.f11223a);
            g3.c cVar = this.f14579b;
            return cVar == null || cVar.e(list, gVar);
        }
        return false;
    }
}
