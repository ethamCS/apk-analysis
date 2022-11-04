package zg;

import gg.a0;
import gg.d0;
import gg.t1;
import gg.x1;
import java.math.BigInteger;
/* loaded from: classes3.dex */
public class p extends gg.t {

    /* renamed from: c */
    gg.q f26786c;

    /* renamed from: d */
    gg.w f26787d;

    private p(d0 d0Var) {
        this.f26787d = (gg.w) d0Var.G(0);
        this.f26786c = gg.q.E(d0Var.G(1));
    }

    public p(byte[] bArr, int i10) {
        this.f26787d = new t1(bArr);
        this.f26786c = new gg.q(i10);
    }

    public static p m(Object obj) {
        if (obj instanceof p) {
            return (p) obj;
        }
        if (obj == null) {
            return null;
        }
        return new p(d0.F(obj));
    }

    @Override // gg.t, gg.g
    public a0 b() {
        gg.h hVar = new gg.h(2);
        hVar.a(this.f26787d);
        hVar.a(this.f26786c);
        return new x1(hVar);
    }

    public byte[] l() {
        return this.f26787d.F();
    }

    public BigInteger n() {
        return this.f26786c.G();
    }
}
