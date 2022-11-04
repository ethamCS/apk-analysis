package tg;

import gg.a0;
import gg.d0;
import gg.h;
import gg.q;
import gg.t;
import gg.t1;
import gg.w;
import gg.x1;
import java.math.BigInteger;
/* loaded from: classes3.dex */
public class f extends t {

    /* renamed from: c */
    private final byte[] f22347c;

    /* renamed from: d */
    private final BigInteger f22348d;

    /* renamed from: q */
    private final BigInteger f22349q;

    /* renamed from: x */
    private final BigInteger f22350x;

    /* renamed from: y */
    private final BigInteger f22351y;

    private f(d0 d0Var) {
        if (d0Var.size() != 4 && d0Var.size() != 5) {
            throw new IllegalArgumentException("invalid sequence: size = " + d0Var.size());
        }
        this.f22347c = ak.a.h(w.E(d0Var.G(0)).F());
        this.f22348d = q.E(d0Var.G(1)).G();
        this.f22349q = q.E(d0Var.G(2)).G();
        this.f22350x = q.E(d0Var.G(3)).G();
        this.f22351y = d0Var.size() == 5 ? q.E(d0Var.G(4)).G() : null;
    }

    public f(byte[] bArr, int i10, int i11, int i12, int i13) {
        this(bArr, BigInteger.valueOf(i10), BigInteger.valueOf(i11), BigInteger.valueOf(i12), BigInteger.valueOf(i13));
    }

    public f(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this.f22347c = ak.a.h(bArr);
        this.f22348d = bigInteger;
        this.f22349q = bigInteger2;
        this.f22350x = bigInteger3;
        this.f22351y = bigInteger4;
    }

    public static f n(Object obj) {
        if (obj instanceof f) {
            return (f) obj;
        }
        if (obj == null) {
            return null;
        }
        return new f(d0.F(obj));
    }

    @Override // gg.t, gg.g
    public a0 b() {
        h hVar = new h(5);
        hVar.a(new t1(this.f22347c));
        hVar.a(new q(this.f22348d));
        hVar.a(new q(this.f22349q));
        hVar.a(new q(this.f22350x));
        if (this.f22351y != null) {
            hVar.a(new q(this.f22351y));
        }
        return new x1(hVar);
    }

    public BigInteger l() {
        return this.f22349q;
    }

    public BigInteger m() {
        return this.f22348d;
    }

    public BigInteger o() {
        return this.f22351y;
    }

    public BigInteger q() {
        return this.f22350x;
    }

    public byte[] r() {
        return ak.a.h(this.f22347c);
    }
}
