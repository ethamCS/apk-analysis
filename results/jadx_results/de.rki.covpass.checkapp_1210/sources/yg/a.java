package yg;

import gg.a0;
import gg.d0;
import gg.h;
import gg.q;
import gg.t;
import gg.x1;
import java.math.BigInteger;
import java.util.Enumeration;
/* loaded from: classes3.dex */
public class a extends t {

    /* renamed from: c */
    q f26284c;

    /* renamed from: d */
    q f26285d;

    private a(d0 d0Var) {
        Enumeration H = d0Var.H();
        this.f26284c = (q) H.nextElement();
        this.f26285d = (q) H.nextElement();
    }

    public a(BigInteger bigInteger, BigInteger bigInteger2) {
        this.f26284c = new q(bigInteger);
        this.f26285d = new q(bigInteger2);
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
        h hVar = new h(2);
        hVar.a(this.f26284c);
        hVar.a(this.f26285d);
        return new x1(hVar);
    }

    public BigInteger l() {
        return this.f26285d.F();
    }

    public BigInteger n() {
        return this.f26284c.F();
    }
}
