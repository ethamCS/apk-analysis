package xg;

import gg.a0;
import gg.a2;
import gg.d0;
import gg.j0;
import gg.t;
import gg.x1;
/* loaded from: classes3.dex */
public class f extends t {

    /* renamed from: c */
    g f25629c;

    /* renamed from: d */
    j f25630d;

    private f(d0 d0Var) {
        this.f25629c = g.l(d0Var.G(0));
        if (d0Var.size() == 2) {
            this.f25630d = j.l((j0) d0Var.G(1), true);
        }
    }

    public static f l(Object obj) {
        if (obj instanceof f) {
            return (f) obj;
        }
        if (obj == null) {
            return null;
        }
        return new f(d0.F(obj));
    }

    @Override // gg.t, gg.g
    public a0 b() {
        gg.h hVar = new gg.h(2);
        hVar.a(this.f25629c);
        j jVar = this.f25630d;
        if (jVar != null) {
            hVar.a(new a2(true, 0, jVar));
        }
        return new x1(hVar);
    }

    public j m() {
        return this.f25630d;
    }

    public g n() {
        return this.f25629c;
    }
}
