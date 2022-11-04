package zg;

import gg.a0;
import gg.a1;
import gg.d0;
/* loaded from: classes3.dex */
public class r extends gg.t implements q {

    /* renamed from: c */
    private f f26866c;

    /* renamed from: d */
    private l f26867d;

    private r(d0 d0Var) {
        this.f26867d = null;
        if (gg.q.E(d0Var.G(0)).H(3)) {
            this.f26866c = f.n(d0Var.G(1));
            if (d0Var.size() != 3) {
                return;
            }
            this.f26867d = l.l(d0Var.G(2));
            return;
        }
        throw new IllegalArgumentException("wrong version for PFX PDU");
    }

    public r(f fVar, l lVar) {
        this.f26866c = fVar;
        this.f26867d = lVar;
    }

    public static r m(Object obj) {
        if (obj instanceof r) {
            return (r) obj;
        }
        if (obj == null) {
            return null;
        }
        return new r(d0.F(obj));
    }

    @Override // gg.t, gg.g
    public a0 b() {
        gg.h hVar = new gg.h(3);
        hVar.a(new gg.q(3L));
        hVar.a(this.f26866c);
        l lVar = this.f26867d;
        if (lVar != null) {
            hVar.a(lVar);
        }
        return new a1(hVar);
    }

    public f l() {
        return this.f26866c;
    }

    public l n() {
        return this.f26867d;
    }
}
