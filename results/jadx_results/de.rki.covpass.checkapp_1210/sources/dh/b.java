package dh;

import gg.a0;
import gg.a2;
import gg.d0;
import gg.h;
import gg.j0;
import gg.q;
import gg.t;
import gg.w;
import gg.x1;
import java.math.BigInteger;
/* loaded from: classes3.dex */
public class b extends t {
    w U3;

    /* renamed from: c */
    BigInteger f9044c;

    /* renamed from: d */
    a f9045d;

    /* renamed from: q */
    q f9046q;

    /* renamed from: x */
    w f9047x;

    /* renamed from: y */
    q f9048y;

    private b(d0 d0Var) {
        this.f9044c = BigInteger.valueOf(0L);
        int i10 = 0;
        if (d0Var.G(0) instanceof j0) {
            j0 j0Var = (j0) d0Var.G(0);
            if (!j0Var.S() || j0Var.Q() != 0) {
                throw new IllegalArgumentException("object parse error");
            }
            this.f9044c = q.E(j0Var.e()).G();
            i10 = 1;
        }
        this.f9045d = a.l(d0Var.G(i10));
        int i11 = i10 + 1;
        this.f9046q = q.E(d0Var.G(i11));
        int i12 = i11 + 1;
        this.f9047x = w.E(d0Var.G(i12));
        int i13 = i12 + 1;
        this.f9048y = q.E(d0Var.G(i13));
        this.U3 = w.E(d0Var.G(i13 + 1));
    }

    public static b q(Object obj) {
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
        h hVar = new h(6);
        if (this.f9044c.compareTo(BigInteger.valueOf(0L)) != 0) {
            hVar.a(new a2(true, 0, new q(this.f9044c)));
        }
        hVar.a(this.f9045d);
        hVar.a(this.f9046q);
        hVar.a(this.f9047x);
        hVar.a(this.f9048y);
        hVar.a(this.U3);
        return new x1(hVar);
    }

    public BigInteger l() {
        return this.f9046q.G();
    }

    public byte[] m() {
        return ak.a.h(this.f9047x.F());
    }

    public a n() {
        return this.f9045d;
    }

    public byte[] o() {
        return ak.a.h(this.U3.F());
    }

    public BigInteger r() {
        return this.f9048y.G();
    }
}
