package zg;

import gg.a0;
import gg.d0;
import gg.x1;
import java.math.BigInteger;
import java.util.Enumeration;
/* loaded from: classes3.dex */
public class v extends gg.t {
    private BigInteger U3;
    private BigInteger V3;
    private BigInteger W3;
    private BigInteger X3;
    private d0 Y3;

    /* renamed from: c */
    private BigInteger f26880c;

    /* renamed from: d */
    private BigInteger f26881d;

    /* renamed from: q */
    private BigInteger f26882q;

    /* renamed from: x */
    private BigInteger f26883x;

    /* renamed from: y */
    private BigInteger f26884y;

    private v(d0 d0Var) {
        this.Y3 = null;
        Enumeration H = d0Var.H();
        gg.q qVar = (gg.q) H.nextElement();
        int M = qVar.M();
        if (M < 0 || M > 1) {
            throw new IllegalArgumentException("wrong version for RSA private key");
        }
        this.f26880c = qVar.G();
        this.f26881d = ((gg.q) H.nextElement()).G();
        this.f26882q = ((gg.q) H.nextElement()).G();
        this.f26883x = ((gg.q) H.nextElement()).G();
        this.f26884y = ((gg.q) H.nextElement()).G();
        this.U3 = ((gg.q) H.nextElement()).G();
        this.V3 = ((gg.q) H.nextElement()).G();
        this.W3 = ((gg.q) H.nextElement()).G();
        this.X3 = ((gg.q) H.nextElement()).G();
        if (!H.hasMoreElements()) {
            return;
        }
        this.Y3 = (d0) H.nextElement();
    }

    public v(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5, BigInteger bigInteger6, BigInteger bigInteger7, BigInteger bigInteger8) {
        this.Y3 = null;
        this.f26880c = BigInteger.valueOf(0L);
        this.f26881d = bigInteger;
        this.f26882q = bigInteger2;
        this.f26883x = bigInteger3;
        this.f26884y = bigInteger4;
        this.U3 = bigInteger5;
        this.V3 = bigInteger6;
        this.W3 = bigInteger7;
        this.X3 = bigInteger8;
    }

    public static v o(Object obj) {
        if (obj instanceof v) {
            return (v) obj;
        }
        if (obj == null) {
            return null;
        }
        return new v(d0.F(obj));
    }

    @Override // gg.t, gg.g
    public a0 b() {
        gg.h hVar = new gg.h(10);
        hVar.a(new gg.q(this.f26880c));
        hVar.a(new gg.q(q()));
        hVar.a(new gg.q(w()));
        hVar.a(new gg.q(u()));
        hVar.a(new gg.q(r()));
        hVar.a(new gg.q(s()));
        hVar.a(new gg.q(m()));
        hVar.a(new gg.q(n()));
        hVar.a(new gg.q(l()));
        d0 d0Var = this.Y3;
        if (d0Var != null) {
            hVar.a(d0Var);
        }
        return new x1(hVar);
    }

    public BigInteger l() {
        return this.X3;
    }

    public BigInteger m() {
        return this.V3;
    }

    public BigInteger n() {
        return this.W3;
    }

    public BigInteger q() {
        return this.f26881d;
    }

    public BigInteger r() {
        return this.f26884y;
    }

    public BigInteger s() {
        return this.U3;
    }

    public BigInteger u() {
        return this.f26883x;
    }

    public BigInteger w() {
        return this.f26882q;
    }
}
