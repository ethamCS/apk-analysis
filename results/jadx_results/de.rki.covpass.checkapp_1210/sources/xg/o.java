package xg;

import gg.a0;
import gg.a2;
import gg.d0;
import gg.q;
import gg.t;
import gg.x1;
import hh.v;
import hh.w;
/* loaded from: classes3.dex */
public class o extends t {
    private static final q U3 = new q(0);

    /* renamed from: c */
    q f25649c = U3;

    /* renamed from: d */
    w f25650d;

    /* renamed from: q */
    d0 f25651q;

    /* renamed from: x */
    v f25652x;

    /* renamed from: y */
    boolean f25653y;

    public o(w wVar, d0 d0Var, v vVar) {
        this.f25650d = wVar;
        this.f25651q = d0Var;
        this.f25652x = vVar;
    }

    @Override // gg.t, gg.g
    public a0 b() {
        gg.h hVar = new gg.h(4);
        if (!this.f25649c.s(U3) || this.f25653y) {
            hVar.a(new a2(true, 0, this.f25649c));
        }
        w wVar = this.f25650d;
        if (wVar != null) {
            hVar.a(new a2(true, 1, wVar));
        }
        hVar.a(this.f25651q);
        v vVar = this.f25652x;
        if (vVar != null) {
            hVar.a(new a2(true, 2, vVar));
        }
        return new x1(hVar);
    }
}
