package hh;

import gg.x1;
import java.math.BigInteger;
import java.util.Enumeration;
/* loaded from: classes3.dex */
public class q extends gg.t {

    /* renamed from: c */
    gg.q f12025c;

    /* renamed from: d */
    gg.q f12026d;

    /* renamed from: q */
    gg.q f12027q;

    private q(gg.d0 d0Var) {
        if (d0Var.size() != 3) {
            throw new IllegalArgumentException("Bad sequence size: " + d0Var.size());
        }
        Enumeration H = d0Var.H();
        this.f12025c = gg.q.E(H.nextElement());
        this.f12026d = gg.q.E(H.nextElement());
        this.f12027q = gg.q.E(H.nextElement());
    }

    public q(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f12025c = new gg.q(bigInteger);
        this.f12026d = new gg.q(bigInteger2);
        this.f12027q = new gg.q(bigInteger3);
    }

    public static q m(Object obj) {
        if (obj instanceof q) {
            return (q) obj;
        }
        if (obj == null) {
            return null;
        }
        return new q(gg.d0.F(obj));
    }

    @Override // gg.t, gg.g
    public gg.a0 b() {
        gg.h hVar = new gg.h(3);
        hVar.a(this.f12025c);
        hVar.a(this.f12026d);
        hVar.a(this.f12027q);
        return new x1(hVar);
    }

    public BigInteger l() {
        return this.f12027q.F();
    }

    public BigInteger n() {
        return this.f12025c.F();
    }

    public BigInteger o() {
        return this.f12026d.F();
    }
}
