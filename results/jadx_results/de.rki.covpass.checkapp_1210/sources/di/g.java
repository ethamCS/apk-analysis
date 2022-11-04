package di;

import java.math.BigInteger;
import java.security.SecureRandom;
import zh.b0;
import zh.d0;
import zh.e0;
import zh.g1;
import zh.y;
/* loaded from: classes3.dex */
public class g implements org.bouncycastle.crypto.n {

    /* renamed from: g */
    b0 f9095g;

    /* renamed from: h */
    SecureRandom f9096h;

    @Override // org.bouncycastle.crypto.m
    public BigInteger[] a(byte[] bArr) {
        BigInteger bigInteger = new BigInteger(1, ak.a.Q(bArr));
        y b10 = this.f9095g.b();
        BigInteger e10 = b10.e();
        BigInteger c10 = ((d0) this.f9095g).c();
        ti.h c11 = c();
        while (true) {
            BigInteger e11 = ak.b.e(e10.bitLength(), this.f9096h);
            BigInteger bigInteger2 = ti.d.f22359a;
            if (!e11.equals(bigInteger2)) {
                BigInteger mod = c11.a(b10.b(), e11).A().f().t().mod(e10);
                if (!mod.equals(bigInteger2)) {
                    BigInteger mod2 = e11.multiply(bigInteger).add(c10.multiply(mod)).mod(e10);
                    if (!mod2.equals(bigInteger2)) {
                        return new BigInteger[]{mod, mod2};
                    }
                } else {
                    continue;
                }
            }
        }
    }

    @Override // org.bouncycastle.crypto.m
    public boolean b(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger bigInteger3 = new BigInteger(1, ak.a.Q(bArr));
        BigInteger e10 = this.f9095g.b().e();
        BigInteger bigInteger4 = ti.d.f22360b;
        if (bigInteger.compareTo(bigInteger4) < 0 || bigInteger.compareTo(e10) >= 0 || bigInteger2.compareTo(bigInteger4) < 0 || bigInteger2.compareTo(e10) >= 0) {
            return false;
        }
        BigInteger k10 = ak.b.k(e10, bigInteger3);
        ti.i A = ti.c.r(this.f9095g.b().b(), bigInteger2.multiply(k10).mod(e10), ((e0) this.f9095g).c(), e10.subtract(bigInteger).multiply(k10).mod(e10)).A();
        if (!A.u()) {
            return A.f().t().mod(e10).equals(bigInteger);
        }
        return false;
    }

    protected ti.h c() {
        return new ti.k();
    }

    @Override // org.bouncycastle.crypto.n
    public BigInteger getOrder() {
        return this.f9095g.b().e();
    }

    @Override // org.bouncycastle.crypto.m
    public void init(boolean z10, org.bouncycastle.crypto.i iVar) {
        b0 b0Var;
        if (!z10) {
            b0Var = (e0) iVar;
        } else if (iVar instanceof g1) {
            g1 g1Var = (g1) iVar;
            this.f9096h = g1Var.b();
            this.f9095g = (d0) g1Var.a();
            return;
        } else {
            this.f9096h = org.bouncycastle.crypto.l.b();
            b0Var = (d0) iVar;
        }
        this.f9095g = b0Var;
    }
}
