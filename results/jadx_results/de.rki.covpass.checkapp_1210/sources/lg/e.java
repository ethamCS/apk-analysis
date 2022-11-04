package lg;

import gg.a0;
import gg.h;
import gg.q;
import gg.t;
import gg.x1;
import java.math.BigInteger;
/* loaded from: classes3.dex */
public class e extends t {

    /* renamed from: c */
    int f16054c;

    /* renamed from: d */
    q f16055d;

    /* renamed from: q */
    q f16056q;

    /* renamed from: x */
    q f16057x;

    public e(int i10, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f16054c = i10;
        this.f16055d = new q(bigInteger);
        this.f16056q = new q(bigInteger2);
        this.f16057x = new q(bigInteger3);
    }

    @Override // gg.t, gg.g
    public a0 b() {
        h hVar = new h(4);
        hVar.a(new q(this.f16054c));
        hVar.a(this.f16055d);
        hVar.a(this.f16056q);
        hVar.a(this.f16057x);
        return new x1(hVar);
    }

    public BigInteger l() {
        return this.f16057x.F();
    }

    public BigInteger m() {
        return this.f16055d.F();
    }

    public BigInteger n() {
        return this.f16056q.F();
    }
}
