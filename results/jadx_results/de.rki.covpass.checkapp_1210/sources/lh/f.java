package lh;

import ak.m;
import java.math.BigInteger;
import zh.c1;
import zh.d0;
import zh.d1;
import zh.e0;
import zh.y;
/* loaded from: classes3.dex */
public class f implements org.bouncycastle.crypto.d {

    /* renamed from: a */
    c1 f16068a;

    private ti.i c(y yVar, d0 d0Var, d0 d0Var2, e0 e0Var, e0 e0Var2, e0 e0Var3) {
        BigInteger e10 = yVar.e();
        int bitLength = (e10.bitLength() + 1) / 2;
        BigInteger shiftLeft = ti.d.f22360b.shiftLeft(bitLength);
        ti.e a10 = yVar.a();
        ti.i a11 = ti.c.a(a10, e0Var.c());
        ti.i a12 = ti.c.a(a10, e0Var2.c());
        ti.i a13 = ti.c.a(a10, e0Var3.c());
        BigInteger mod = d0Var.c().multiply(a11.f().t().mod(shiftLeft).setBit(bitLength)).add(d0Var2.c()).mod(e10);
        BigInteger bit = a13.f().t().mod(shiftLeft).setBit(bitLength);
        BigInteger mod2 = yVar.c().multiply(mod).mod(e10);
        return ti.c.r(a12, bit.multiply(mod2).mod(e10), a13, mod2);
    }

    @Override // org.bouncycastle.crypto.d
    public int a() {
        return (this.f16068a.c().b().a().t() + 7) / 8;
    }

    @Override // org.bouncycastle.crypto.d
    public BigInteger b(org.bouncycastle.crypto.i iVar) {
        if (!m.c("org.bouncycastle.ec.disable_mqv")) {
            d1 d1Var = (d1) iVar;
            d0 c10 = this.f16068a.c();
            y b10 = c10.b();
            if (!b10.equals(d1Var.b().b())) {
                throw new IllegalStateException("ECMQV public key components have wrong domain parameters");
            }
            ti.i A = c(b10, c10, this.f16068a.a(), this.f16068a.b(), d1Var.b(), d1Var.a()).A();
            if (A.u()) {
                throw new IllegalStateException("Infinity is not a valid agreement value for MQV");
            }
            return A.f().t();
        }
        throw new IllegalStateException("ECMQV explicitly disabled");
    }

    @Override // org.bouncycastle.crypto.d
    public void init(org.bouncycastle.crypto.i iVar) {
        this.f16068a = (c1) iVar;
    }
}
