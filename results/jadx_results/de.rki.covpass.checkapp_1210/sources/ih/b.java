package ih;

import gg.a0;
import gg.d0;
import gg.k1;
import gg.q;
import gg.t;
import gg.x1;
/* loaded from: classes3.dex */
public class b extends t {

    /* renamed from: c */
    private gg.c f12625c;

    /* renamed from: d */
    private q f12626d;

    private b(d0 d0Var) {
        if (d0Var.size() == 2) {
            this.f12625c = k1.M(d0Var.G(0));
            this.f12626d = q.E(d0Var.G(1));
            return;
        }
        throw new IllegalArgumentException("Bad sequence size: " + d0Var.size());
    }

    public static b l(Object obj) {
        if (obj instanceof b) {
            return (b) obj;
        }
        if (obj == null) {
            return null;
        }
        return new b(d0.F(obj));
    }

    @Override // gg.t, gg.g
    public a0 b() {
        gg.h hVar = new gg.h(2);
        hVar.a(this.f12625c);
        hVar.a(this.f12626d);
        return new x1(hVar);
    }
}
