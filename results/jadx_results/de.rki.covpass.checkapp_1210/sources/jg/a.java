package jg;

import gg.a0;
import gg.a1;
import gg.d0;
import gg.e1;
import gg.g;
import gg.h;
import gg.j0;
import gg.t;
import gg.v;
/* loaded from: classes3.dex */
public class a extends t {

    /* renamed from: c */
    private v f14350c;

    /* renamed from: d */
    private g f14351d;

    private a(d0 d0Var) {
        if (d0Var.size() < 1 || d0Var.size() > 2) {
            throw new IllegalArgumentException("Bad sequence size: " + d0Var.size());
        }
        this.f14350c = (v) d0Var.G(0);
        if (d0Var.size() <= 1) {
            return;
        }
        j0 j0Var = (j0) d0Var.G(1);
        if (!j0Var.S() || j0Var.Q() != 0) {
            throw new IllegalArgumentException("Bad tag for 'content'");
        }
        this.f14351d = j0Var.O();
    }

    public static a l(Object obj) {
        if (obj instanceof a) {
            return (a) obj;
        }
        if (obj == null) {
            return null;
        }
        return new a(d0.F(obj));
    }

    @Override // gg.t, gg.g
    public a0 b() {
        h hVar = new h(2);
        hVar.a(this.f14350c);
        g gVar = this.f14351d;
        if (gVar != null) {
            hVar.a(new e1(0, gVar));
        }
        return new a1(hVar);
    }
}
