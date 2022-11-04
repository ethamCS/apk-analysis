package zg;

import gg.a0;
import gg.d0;
import gg.x1;
import java.math.BigInteger;
import java.util.Enumeration;
/* loaded from: classes3.dex */
public class g extends gg.t {

    /* renamed from: c */
    gg.q f26765c;

    /* renamed from: d */
    gg.q f26766d;

    /* renamed from: q */
    gg.q f26767q;

    private g(d0 d0Var) {
        Enumeration H = d0Var.H();
        this.f26765c = gg.q.E(H.nextElement());
        this.f26766d = gg.q.E(H.nextElement());
        this.f26767q = H.hasMoreElements() ? (gg.q) H.nextElement() : null;
    }

    public g(BigInteger bigInteger, BigInteger bigInteger2, int i10) {
        this.f26765c = new gg.q(bigInteger);
        this.f26766d = new gg.q(bigInteger2);
        this.f26767q = i10 != 0 ? new gg.q(i10) : null;
    }

    public static g m(Object obj) {
        if (obj instanceof g) {
            return (g) obj;
        }
        if (obj == null) {
            return null;
        }
        return new g(d0.F(obj));
    }

    @Override // gg.t, gg.g
    public a0 b() {
        gg.h hVar = new gg.h(3);
        hVar.a(this.f26765c);
        hVar.a(this.f26766d);
        if (n() != null) {
            hVar.a(this.f26767q);
        }
        return new x1(hVar);
    }

    public BigInteger l() {
        return this.f26766d.F();
    }

    public BigInteger n() {
        gg.q qVar = this.f26767q;
        if (qVar == null) {
            return null;
        }
        return qVar.F();
    }

    public BigInteger o() {
        return this.f26765c.F();
    }
}
