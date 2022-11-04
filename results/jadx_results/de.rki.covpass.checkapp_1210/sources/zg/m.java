package zg;

import gg.a0;
import gg.d0;
import gg.t1;
import gg.x1;
import java.math.BigInteger;
/* loaded from: classes3.dex */
public class m extends gg.t {

    /* renamed from: c */
    gg.q f26777c;

    /* renamed from: d */
    gg.w f26778d;

    private m(d0 d0Var) {
        this.f26778d = (gg.w) d0Var.G(0);
        this.f26777c = (gg.q) d0Var.G(1);
    }

    public m(byte[] bArr, int i10) {
        if (bArr.length == 8) {
            this.f26778d = new t1(bArr);
            this.f26777c = new gg.q(i10);
            return;
        }
        throw new IllegalArgumentException("salt length must be 8");
    }

    public static m l(Object obj) {
        if (obj instanceof m) {
            return (m) obj;
        }
        if (obj == null) {
            return null;
        }
        return new m(d0.F(obj));
    }

    @Override // gg.t, gg.g
    public a0 b() {
        gg.h hVar = new gg.h(2);
        hVar.a(this.f26778d);
        hVar.a(this.f26777c);
        return new x1(hVar);
    }

    public BigInteger m() {
        return this.f26777c.G();
    }

    public byte[] n() {
        return this.f26778d.F();
    }
}
