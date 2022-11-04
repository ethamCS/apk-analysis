package zg;

import gg.a0;
import gg.d0;
import gg.x1;
import java.math.BigInteger;
import java.util.Enumeration;
/* loaded from: classes3.dex */
public class w extends gg.t {

    /* renamed from: c */
    private BigInteger f26885c;

    /* renamed from: d */
    private BigInteger f26886d;

    private w(d0 d0Var) {
        if (d0Var.size() == 2) {
            Enumeration H = d0Var.H();
            this.f26885c = gg.q.E(H.nextElement()).F();
            this.f26886d = gg.q.E(H.nextElement()).F();
            return;
        }
        throw new IllegalArgumentException("Bad sequence size: " + d0Var.size());
    }

    public w(BigInteger bigInteger, BigInteger bigInteger2) {
        this.f26885c = bigInteger;
        this.f26886d = bigInteger2;
    }

    public static w l(Object obj) {
        if (obj instanceof w) {
            return (w) obj;
        }
        if (obj == null) {
            return null;
        }
        return new w(d0.F(obj));
    }

    @Override // gg.t, gg.g
    public a0 b() {
        gg.h hVar = new gg.h(2);
        hVar.a(new gg.q(m()));
        hVar.a(new gg.q(n()));
        return new x1(hVar);
    }

    public BigInteger m() {
        return this.f26885c;
    }

    public BigInteger n() {
        return this.f26886d;
    }
}
