package xg;

import gg.a0;
import gg.a2;
import gg.d0;
import gg.j0;
import gg.t;
import gg.x1;
/* loaded from: classes3.dex */
public class l extends t {

    /* renamed from: c */
    private gg.m f25642c;

    /* renamed from: d */
    private hh.m f25643d;

    private l(d0 d0Var) {
        this.f25642c = gg.m.J(d0Var.G(0));
        if (d0Var.size() > 1) {
            this.f25643d = hh.m.l(gg.i.D((j0) d0Var.G(1), true));
        }
    }

    public static l l(j0 j0Var, boolean z10) {
        return m(d0.E(j0Var, z10));
    }

    public static l m(Object obj) {
        if (obj instanceof l) {
            return (l) obj;
        }
        if (obj == null) {
            return null;
        }
        return new l(d0.F(obj));
    }

    @Override // gg.t, gg.g
    public a0 b() {
        gg.h hVar = new gg.h(2);
        hVar.a(this.f25642c);
        hh.m mVar = this.f25643d;
        if (mVar != null) {
            hVar.a(new a2(true, 0, mVar));
        }
        return new x1(hVar);
    }

    public hh.m n() {
        return this.f25643d;
    }

    public gg.m o() {
        return this.f25642c;
    }
}
