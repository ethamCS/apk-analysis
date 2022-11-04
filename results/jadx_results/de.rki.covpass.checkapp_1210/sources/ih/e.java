package ih;

import gg.a0;
import gg.d0;
import gg.k1;
import gg.q;
import gg.t;
import gg.x1;
import java.math.BigInteger;
/* loaded from: classes3.dex */
public class e extends t {

    /* renamed from: c */
    private gg.c f12632c;

    /* renamed from: d */
    private q f12633d;

    private e(d0 d0Var) {
        if (d0Var.size() == 2) {
            this.f12632c = gg.c.F(d0Var.G(0));
            this.f12633d = q.E(d0Var.G(1));
            return;
        }
        throw new IllegalArgumentException("Bad sequence size: " + d0Var.size());
    }

    public e(byte[] bArr, int i10) {
        if (bArr != null) {
            this.f12632c = new k1(bArr);
            this.f12633d = new q(i10);
            return;
        }
        throw new IllegalArgumentException("'seed' cannot be null");
    }

    public static e l(Object obj) {
        if (obj instanceof e) {
            return (e) obj;
        }
        if (obj == null) {
            return null;
        }
        return new e(d0.F(obj));
    }

    @Override // gg.t, gg.g
    public a0 b() {
        gg.h hVar = new gg.h(2);
        hVar.a(this.f12632c);
        hVar.a(this.f12633d);
        return new x1(hVar);
    }

    public BigInteger m() {
        return this.f12633d.F();
    }

    public byte[] n() {
        return this.f12632c.D();
    }
}
