package xg;

import gg.a0;
import gg.a2;
import gg.d0;
import gg.j0;
import gg.k1;
import gg.t;
import gg.x1;
/* loaded from: classes3.dex */
public class a extends t {

    /* renamed from: c */
    private k f25608c;

    /* renamed from: d */
    private hh.b f25609d;

    /* renamed from: q */
    private k1 f25610q;

    /* renamed from: x */
    private d0 f25611x;

    private a(d0 d0Var) {
        this.f25608c = k.l(d0Var.G(0));
        this.f25609d = hh.b.n(d0Var.G(1));
        this.f25610q = (k1) d0Var.G(2);
        if (d0Var.size() > 3) {
            this.f25611x = d0.E((j0) d0Var.G(3), true);
        }
    }

    public static a m(Object obj) {
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
        gg.h hVar = new gg.h(4);
        hVar.a(this.f25608c);
        hVar.a(this.f25609d);
        hVar.a(this.f25610q);
        d0 d0Var = this.f25611x;
        if (d0Var != null) {
            hVar.a(new a2(true, 0, d0Var));
        }
        return new x1(hVar);
    }

    public d0 l() {
        return this.f25611x;
    }

    public k1 n() {
        return this.f25610q;
    }

    public hh.b o() {
        return this.f25609d;
    }

    public k q() {
        return this.f25608c;
    }
}
