package xg;

import gg.a0;
import gg.d0;
import gg.j0;
import gg.t;
import gg.v;
import gg.w;
import gg.x1;
/* loaded from: classes3.dex */
public class j extends t {

    /* renamed from: c */
    v f25635c;

    /* renamed from: d */
    w f25636d;

    private j(d0 d0Var) {
        this.f25635c = (v) d0Var.G(0);
        this.f25636d = (w) d0Var.G(1);
    }

    public static j l(j0 j0Var, boolean z10) {
        return m(d0.E(j0Var, z10));
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
        gg.h hVar = new gg.h(2);
        hVar.a(this.f25635c);
        hVar.a(this.f25636d);
        return new x1(hVar);
    }

    public w n() {
        return this.f25636d;
    }

    public v o() {
        return this.f25635c;
    }
}
