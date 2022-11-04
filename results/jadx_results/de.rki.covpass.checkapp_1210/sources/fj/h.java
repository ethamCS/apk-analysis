package fj;

import gg.a0;
import gg.d0;
import gg.q;
import gg.t;
import gg.x1;
/* loaded from: classes3.dex */
public class h extends t {

    /* renamed from: c */
    private final q f10289c;

    /* renamed from: d */
    private final hh.b f10290d;

    private h(d0 d0Var) {
        this.f10289c = q.E(d0Var.G(0));
        this.f10290d = hh.b.n(d0Var.G(1));
    }

    public h(hh.b bVar) {
        this.f10289c = new q(0L);
        this.f10290d = bVar;
    }

    public static final h l(Object obj) {
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
        gg.h hVar = new gg.h();
        hVar.a(this.f10289c);
        hVar.a(this.f10290d);
        return new x1(hVar);
    }

    public hh.b m() {
        return this.f10290d;
    }
}
