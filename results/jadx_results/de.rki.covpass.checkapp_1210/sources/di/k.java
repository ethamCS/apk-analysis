package di;

import java.math.BigInteger;
import java.security.SecureRandom;
import zh.g1;
import zh.s0;
import zh.t0;
import zh.u0;
import zh.v0;
/* loaded from: classes3.dex */
public class k implements org.bouncycastle.crypto.n {

    /* renamed from: g */
    s0 f9109g;

    /* renamed from: h */
    SecureRandom f9110h;

    @Override // org.bouncycastle.crypto.m
    public BigInteger[] a(byte[] bArr) {
        BigInteger e10;
        BigInteger bigInteger = new BigInteger(1, ak.a.Q(bArr));
        t0 b10 = this.f9109g.b();
        do {
            e10 = ak.b.e(b10.c().bitLength(), this.f9110h);
        } while (e10.compareTo(b10.c()) >= 0);
        BigInteger mod = b10.a().modPow(e10, b10.b()).mod(b10.c());
        return new BigInteger[]{mod, e10.multiply(bigInteger).add(((u0) this.f9109g).c().multiply(mod)).mod(b10.c())};
    }

    @Override // org.bouncycastle.crypto.m
    public boolean b(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger bigInteger3 = new BigInteger(1, ak.a.Q(bArr));
        t0 b10 = this.f9109g.b();
        BigInteger valueOf = BigInteger.valueOf(0L);
        if (valueOf.compareTo(bigInteger) >= 0 || b10.c().compareTo(bigInteger) <= 0 || valueOf.compareTo(bigInteger2) >= 0 || b10.c().compareTo(bigInteger2) <= 0) {
            return false;
        }
        BigInteger modPow = bigInteger3.modPow(b10.c().subtract(new BigInteger("2")), b10.c());
        return b10.a().modPow(bigInteger2.multiply(modPow).mod(b10.c()), b10.b()).multiply(((v0) this.f9109g).c().modPow(b10.c().subtract(bigInteger).multiply(modPow).mod(b10.c()), b10.b())).mod(b10.b()).mod(b10.c()).equals(bigInteger);
    }

    @Override // org.bouncycastle.crypto.n
    public BigInteger getOrder() {
        return this.f9109g.b().c();
    }

    @Override // org.bouncycastle.crypto.m
    public void init(boolean z10, org.bouncycastle.crypto.i iVar) {
        s0 s0Var;
        if (!z10) {
            s0Var = (v0) iVar;
        } else if (iVar instanceof g1) {
            g1 g1Var = (g1) iVar;
            this.f9110h = g1Var.b();
            this.f9109g = (u0) g1Var.a();
            return;
        } else {
            this.f9110h = org.bouncycastle.crypto.l.b();
            s0Var = (u0) iVar;
        }
        this.f9109g = s0Var;
    }
}
