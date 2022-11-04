package zg;

import gg.a0;
import gg.d0;
/* loaded from: classes3.dex */
public class j extends gg.t {

    /* renamed from: c */
    private hh.b f26771c;

    private j(d0 d0Var) {
        this.f26771c = hh.b.n(d0Var);
    }

    public j(gg.v vVar) {
        this.f26771c = new hh.b(vVar);
    }

    public j(gg.v vVar, gg.g gVar) {
        this.f26771c = new hh.b(vVar, gVar);
    }

    public static j m(Object obj) {
        if (obj instanceof j) {
            return (j) obj;
        }
        if (obj == null) {
            return null;
        }
        return new j(d0.F(obj));
    }

    @Override // gg.t, gg.g
    public a0 b() {
        return this.f26771c.b();
    }

    public gg.v l() {
        return this.f26771c.l();
    }

    public gg.g n() {
        return this.f26771c.o();
    }
}
