package zg;

import gg.a0;
import gg.d0;
/* loaded from: classes3.dex */
public class k extends gg.t {

    /* renamed from: c */
    private hh.b f26772c;

    private k(d0 d0Var) {
        this.f26772c = hh.b.n(d0Var);
    }

    public k(gg.v vVar, gg.g gVar) {
        this.f26772c = new hh.b(vVar, gVar);
    }

    public static k m(Object obj) {
        if (obj instanceof k) {
            return (k) obj;
        }
        if (obj == null) {
            return null;
        }
        return new k(d0.F(obj));
    }

    @Override // gg.t, gg.g
    public a0 b() {
        return this.f26772c.b();
    }

    public gg.v l() {
        return this.f26772c.l();
    }

    public gg.g n() {
        return this.f26772c.o();
    }
}
