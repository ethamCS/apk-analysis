package ig;

import gg.a0;
import gg.b2;
import gg.d0;
import gg.m;
import gg.m0;
import gg.o1;
import gg.q;
import gg.t;
import gg.x1;
import java.math.BigInteger;
import java.util.Date;
/* loaded from: classes3.dex */
public class h extends t {
    private final String U3;

    /* renamed from: c */
    private final BigInteger f12605c;

    /* renamed from: d */
    private final hh.b f12606d;

    /* renamed from: q */
    private final m f12607q;

    /* renamed from: x */
    private final m f12608x;

    /* renamed from: y */
    private final f f12609y;

    private h(d0 d0Var) {
        this.f12605c = q.E(d0Var.G(0)).G();
        this.f12606d = hh.b.n(d0Var.G(1));
        this.f12607q = m.J(d0Var.G(2));
        this.f12608x = m.J(d0Var.G(3));
        this.f12609y = f.l(d0Var.G(4));
        this.U3 = d0Var.size() == 6 ? m0.D(d0Var.G(5)).c() : null;
    }

    public h(hh.b bVar, Date date, Date date2, f fVar, String str) {
        this.f12605c = BigInteger.valueOf(1L);
        this.f12606d = bVar;
        this.f12607q = new o1(date);
        this.f12608x = new o1(date2);
        this.f12609y = fVar;
        this.U3 = str;
    }

    public static h m(Object obj) {
        if (obj instanceof h) {
            return (h) obj;
        }
        if (obj == null) {
            return null;
        }
        return new h(d0.F(obj));
    }

    @Override // gg.t, gg.g
    public a0 b() {
        gg.h hVar = new gg.h(6);
        hVar.a(new q(this.f12605c));
        hVar.a(this.f12606d);
        hVar.a(this.f12607q);
        hVar.a(this.f12608x);
        hVar.a(this.f12609y);
        if (this.U3 != null) {
            hVar.a(new b2(this.U3));
        }
        return new x1(hVar);
    }

    public m l() {
        return this.f12607q;
    }

    public hh.b n() {
        return this.f12606d;
    }

    public m o() {
        return this.f12608x;
    }

    public f q() {
        return this.f12609y;
    }
}
