package zg;

import gg.a0;
import gg.d0;
import gg.t1;
import gg.x1;
import java.math.BigInteger;
/* loaded from: classes3.dex */
public class t extends gg.t {

    /* renamed from: c */
    gg.q f26873c;

    /* renamed from: d */
    gg.w f26874d;

    public t(int i10, byte[] bArr) {
        this.f26873c = new gg.q(i10);
        this.f26874d = new t1(bArr);
    }

    private t(d0 d0Var) {
        gg.g gVar;
        if (d0Var.size() == 1) {
            this.f26873c = null;
            gVar = d0Var.G(0);
        } else {
            this.f26873c = (gg.q) d0Var.G(0);
            gVar = d0Var.G(1);
        }
        this.f26874d = (gg.w) gVar;
    }

    public t(byte[] bArr) {
        this.f26873c = null;
        this.f26874d = new t1(bArr);
    }

    public static t m(Object obj) {
        if (obj instanceof t) {
            return (t) obj;
        }
        if (obj == null) {
            return null;
        }
        return new t(d0.F(obj));
    }

    @Override // gg.t, gg.g
    public a0 b() {
        gg.h hVar = new gg.h(2);
        gg.q qVar = this.f26873c;
        if (qVar != null) {
            hVar.a(qVar);
        }
        hVar.a(this.f26874d);
        return new x1(hVar);
    }

    public byte[] l() {
        return this.f26874d.F();
    }

    public BigInteger n() {
        gg.q qVar = this.f26873c;
        if (qVar == null) {
            return null;
        }
        return qVar.G();
    }
}
