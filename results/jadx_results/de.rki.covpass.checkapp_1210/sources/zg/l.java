package zg;

import gg.a0;
import gg.d0;
import gg.t1;
import gg.x1;
import java.math.BigInteger;
/* loaded from: classes3.dex */
public class l extends gg.t {

    /* renamed from: x */
    private static final BigInteger f26773x = BigInteger.valueOf(1);

    /* renamed from: c */
    hh.r f26774c;

    /* renamed from: d */
    byte[] f26775d;

    /* renamed from: q */
    BigInteger f26776q;

    private l(d0 d0Var) {
        this.f26774c = hh.r.n(d0Var.G(0));
        this.f26775d = ak.a.h(gg.w.E(d0Var.G(1)).F());
        this.f26776q = d0Var.size() == 3 ? gg.q.E(d0Var.G(2)).G() : f26773x;
    }

    public l(hh.r rVar, byte[] bArr, int i10) {
        this.f26774c = rVar;
        this.f26775d = ak.a.h(bArr);
        this.f26776q = BigInteger.valueOf(i10);
    }

    public static l l(Object obj) {
        if (obj instanceof l) {
            return (l) obj;
        }
        if (obj == null) {
            return null;
        }
        return new l(d0.F(obj));
    }

    @Override // gg.t, gg.g
    public a0 b() {
        gg.h hVar = new gg.h(3);
        hVar.a(this.f26774c);
        hVar.a(new t1(this.f26775d));
        if (!this.f26776q.equals(f26773x)) {
            hVar.a(new gg.q(this.f26776q));
        }
        return new x1(hVar);
    }

    public BigInteger m() {
        return this.f26776q;
    }

    public hh.r n() {
        return this.f26774c;
    }

    public byte[] o() {
        return ak.a.h(this.f26775d);
    }
}
