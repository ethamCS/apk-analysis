package fj;

import gg.a0;
import gg.d0;
import gg.q;
import gg.t;
import gg.x1;
/* loaded from: classes3.dex */
public class i extends t {

    /* renamed from: c */
    private final q f10291c;

    /* renamed from: d */
    private final int f10292d;

    /* renamed from: q */
    private final hh.b f10293q;

    public i(int i10, hh.b bVar) {
        this.f10291c = new q(0L);
        this.f10292d = i10;
        this.f10293q = bVar;
    }

    private i(d0 d0Var) {
        this.f10291c = q.E(d0Var.G(0));
        this.f10292d = q.E(d0Var.G(1)).M();
        this.f10293q = hh.b.n(d0Var.G(2));
    }

    public static i m(Object obj) {
        if (obj instanceof i) {
            return (i) obj;
        }
        if (obj == null) {
            return null;
        }
        return new i(d0.F(obj));
    }

    @Override // gg.t, gg.g
    public a0 b() {
        gg.h hVar = new gg.h();
        hVar.a(this.f10291c);
        hVar.a(new q(this.f10292d));
        hVar.a(this.f10293q);
        return new x1(hVar);
    }

    public int l() {
        return this.f10292d;
    }

    public hh.b n() {
        return this.f10293q;
    }
}
