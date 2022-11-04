package zg;

import gg.a0;
import gg.a2;
import gg.d0;
import gg.j0;
import gg.r1;
import gg.x1;
import java.math.BigInteger;
/* loaded from: classes3.dex */
public class x extends gg.t {
    public static final hh.b U3;
    public static final gg.q V3 = new gg.q(20);
    public static final gg.q W3 = new gg.q(1);

    /* renamed from: y */
    public static final hh.b f26887y;

    /* renamed from: c */
    private hh.b f26888c;

    /* renamed from: d */
    private hh.b f26889d;

    /* renamed from: q */
    private gg.q f26890q;

    /* renamed from: x */
    private gg.q f26891x;

    static {
        hh.b bVar = new hh.b(yg.b.f26294i, r1.f10880d);
        f26887y = bVar;
        U3 = new hh.b(q.f26806g1, bVar);
    }

    public x() {
        this.f26888c = f26887y;
        this.f26889d = U3;
        this.f26890q = V3;
        this.f26891x = W3;
    }

    private x(d0 d0Var) {
        this.f26888c = f26887y;
        this.f26889d = U3;
        this.f26890q = V3;
        this.f26891x = W3;
        for (int i10 = 0; i10 != d0Var.size(); i10++) {
            j0 j0Var = (j0) d0Var.G(i10);
            int Q = j0Var.Q();
            if (Q == 0) {
                this.f26888c = hh.b.m(j0Var, true);
            } else if (Q == 1) {
                this.f26889d = hh.b.m(j0Var, true);
            } else if (Q == 2) {
                this.f26890q = gg.q.D(j0Var, true);
            } else if (Q != 3) {
                throw new IllegalArgumentException("unknown tag");
            } else {
                this.f26891x = gg.q.D(j0Var, true);
            }
        }
    }

    public x(hh.b bVar, hh.b bVar2, gg.q qVar, gg.q qVar2) {
        this.f26888c = bVar;
        this.f26889d = bVar2;
        this.f26890q = qVar;
        this.f26891x = qVar2;
    }

    public static x m(Object obj) {
        if (obj instanceof x) {
            return (x) obj;
        }
        if (obj == null) {
            return null;
        }
        return new x(d0.F(obj));
    }

    @Override // gg.t, gg.g
    public a0 b() {
        gg.h hVar = new gg.h(4);
        if (!this.f26888c.equals(f26887y)) {
            hVar.a(new a2(true, 0, this.f26888c));
        }
        if (!this.f26889d.equals(U3)) {
            hVar.a(new a2(true, 1, this.f26889d));
        }
        if (!this.f26890q.s(V3)) {
            hVar.a(new a2(true, 2, this.f26890q));
        }
        if (!this.f26891x.s(W3)) {
            hVar.a(new a2(true, 3, this.f26891x));
        }
        return new x1(hVar);
    }

    public hh.b l() {
        return this.f26888c;
    }

    public hh.b n() {
        return this.f26889d;
    }

    public BigInteger o() {
        return this.f26890q.G();
    }

    public BigInteger q() {
        return this.f26891x.G();
    }
}
