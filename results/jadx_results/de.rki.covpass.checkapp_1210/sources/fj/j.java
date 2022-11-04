package fj;

import gg.a0;
import gg.d0;
import gg.q;
import gg.t;
import gg.x1;
/* loaded from: classes3.dex */
public class j extends t {

    /* renamed from: c */
    private final q f10294c;

    /* renamed from: d */
    private final int f10295d;

    /* renamed from: q */
    private final int f10296q;

    /* renamed from: x */
    private final hh.b f10297x;

    public j(int i10, int i11, hh.b bVar) {
        this.f10294c = new q(0L);
        this.f10295d = i10;
        this.f10296q = i11;
        this.f10297x = bVar;
    }

    private j(d0 d0Var) {
        this.f10294c = q.E(d0Var.G(0));
        this.f10295d = q.E(d0Var.G(1)).M();
        this.f10296q = q.E(d0Var.G(2)).M();
        this.f10297x = hh.b.n(d0Var.G(3));
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
        gg.h hVar = new gg.h();
        hVar.a(this.f10294c);
        hVar.a(new q(this.f10295d));
        hVar.a(new q(this.f10296q));
        hVar.a(this.f10297x);
        return new x1(hVar);
    }

    public int l() {
        return this.f10295d;
    }

    public int n() {
        return this.f10296q;
    }

    public hh.b o() {
        return this.f10297x;
    }
}
