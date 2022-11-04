package ih;

import gg.a0;
import gg.d0;
import gg.q;
import gg.t;
import gg.x1;
import java.math.BigInteger;
import java.util.Enumeration;
/* loaded from: classes3.dex */
public class c extends t {

    /* renamed from: c */
    private final q f12627c;

    /* renamed from: d */
    private final q f12628d;

    /* renamed from: q */
    private final q f12629q;

    /* renamed from: x */
    private final q f12630x;

    /* renamed from: y */
    private final e f12631y;

    private c(d0 d0Var) {
        if (d0Var.size() < 3 || d0Var.size() > 5) {
            throw new IllegalArgumentException("Bad sequence size: " + d0Var.size());
        }
        Enumeration H = d0Var.H();
        this.f12627c = q.E(H.nextElement());
        this.f12628d = q.E(H.nextElement());
        this.f12629q = q.E(H.nextElement());
        gg.g o10 = o(H);
        if (o10 == null || !(o10 instanceof q)) {
            this.f12630x = null;
        } else {
            this.f12630x = q.E(o10);
            o10 = o(H);
        }
        if (o10 != null) {
            this.f12631y = e.l(o10.b());
        } else {
            this.f12631y = null;
        }
    }

    public c(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, e eVar) {
        if (bigInteger != null) {
            if (bigInteger2 == null) {
                throw new IllegalArgumentException("'g' cannot be null");
            }
            if (bigInteger3 == null) {
                throw new IllegalArgumentException("'q' cannot be null");
            }
            this.f12627c = new q(bigInteger);
            this.f12628d = new q(bigInteger2);
            this.f12629q = new q(bigInteger3);
            this.f12630x = bigInteger4 != null ? new q(bigInteger4) : null;
            this.f12631y = eVar;
            return;
        }
        throw new IllegalArgumentException("'p' cannot be null");
    }

    public static c m(Object obj) {
        if (obj instanceof c) {
            return (c) obj;
        }
        if (obj == null) {
            return null;
        }
        return new c(d0.F(obj));
    }

    private static gg.g o(Enumeration enumeration) {
        if (enumeration.hasMoreElements()) {
            return (gg.g) enumeration.nextElement();
        }
        return null;
    }

    @Override // gg.t, gg.g
    public a0 b() {
        gg.h hVar = new gg.h(5);
        hVar.a(this.f12627c);
        hVar.a(this.f12628d);
        hVar.a(this.f12629q);
        q qVar = this.f12630x;
        if (qVar != null) {
            hVar.a(qVar);
        }
        e eVar = this.f12631y;
        if (eVar != null) {
            hVar.a(eVar);
        }
        return new x1(hVar);
    }

    public BigInteger l() {
        return this.f12628d.F();
    }

    public BigInteger n() {
        q qVar = this.f12630x;
        if (qVar == null) {
            return null;
        }
        return qVar.F();
    }

    public BigInteger q() {
        return this.f12627c.F();
    }

    public BigInteger r() {
        return this.f12629q.F();
    }

    public e s() {
        return this.f12631y;
    }
}
