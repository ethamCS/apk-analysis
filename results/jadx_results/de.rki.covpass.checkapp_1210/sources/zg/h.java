package zg;

import gg.a0;
import gg.a1;
import gg.d0;
import gg.e1;
import gg.j0;
/* loaded from: classes3.dex */
public class h extends gg.t {

    /* renamed from: c */
    d0 f26768c;

    private h(d0 d0Var) {
        if (((gg.q) d0Var.G(0)).H(0)) {
            this.f26768c = d0.F(d0Var.G(1));
            return;
        }
        throw new IllegalArgumentException("sequence not version 0");
    }

    public h(gg.v vVar, hh.b bVar, gg.g gVar) {
        gg.h hVar = new gg.h(3);
        hVar.a(vVar);
        hVar.a(bVar.b());
        hVar.a(new e1(false, 0, gVar));
        this.f26768c = new a1(hVar);
    }

    public static h n(Object obj) {
        if (obj instanceof h) {
            return (h) obj;
        }
        if (obj == null) {
            return null;
        }
        return new h(d0.F(obj));
    }

    @Override // gg.t, gg.g
    public a0 b() {
        gg.h hVar = new gg.h(2);
        hVar.a(new gg.q(0L));
        hVar.a(this.f26768c);
        return new a1(hVar);
    }

    public gg.w l() {
        if (this.f26768c.size() == 3) {
            return gg.w.D(j0.N(this.f26768c.G(2)), false);
        }
        return null;
    }

    public hh.b m() {
        return hh.b.n(this.f26768c.G(1));
    }
}
