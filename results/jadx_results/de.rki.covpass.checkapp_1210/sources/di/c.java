package di;

import java.math.BigInteger;
import java.security.SecureRandom;
import zh.g1;
/* loaded from: classes3.dex */
public class c implements org.bouncycastle.crypto.n {

    /* renamed from: g */
    private final b f9084g;

    /* renamed from: h */
    private zh.p f9085h;

    /* renamed from: i */
    private SecureRandom f9086i;

    public c() {
        this.f9084g = new q();
    }

    public c(b bVar) {
        this.f9084g = bVar;
    }

    private BigInteger c(BigInteger bigInteger, byte[] bArr) {
        if (bigInteger.bitLength() >= bArr.length * 8) {
            return new BigInteger(1, bArr);
        }
        int bitLength = bigInteger.bitLength() / 8;
        byte[] bArr2 = new byte[bitLength];
        System.arraycopy(bArr, 0, bArr2, 0, bitLength);
        return new BigInteger(1, bArr2);
    }

    private BigInteger d(BigInteger bigInteger, SecureRandom secureRandom) {
        return ak.b.e(7, org.bouncycastle.crypto.l.c(secureRandom)).add(BigInteger.valueOf(128L)).multiply(bigInteger);
    }

    @Override // org.bouncycastle.crypto.m
    public BigInteger[] a(byte[] bArr) {
        zh.r b10 = this.f9085h.b();
        BigInteger c10 = b10.c();
        BigInteger c11 = c(c10, bArr);
        BigInteger c12 = ((zh.s) this.f9085h).c();
        if (this.f9084g.b()) {
            this.f9084g.d(c10, c12, bArr);
        } else {
            this.f9084g.c(c10, this.f9086i);
        }
        BigInteger a10 = this.f9084g.a();
        BigInteger mod = b10.a().modPow(a10.add(d(c10, this.f9086i)), b10.b()).mod(c10);
        return new BigInteger[]{mod, ak.b.j(c10, a10).multiply(c11.add(c12.multiply(mod))).mod(c10)};
    }

    @Override // org.bouncycastle.crypto.m
    public boolean b(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2) {
        zh.r b10 = this.f9085h.b();
        BigInteger c10 = b10.c();
        BigInteger c11 = c(c10, bArr);
        BigInteger valueOf = BigInteger.valueOf(0L);
        if (valueOf.compareTo(bigInteger) >= 0 || c10.compareTo(bigInteger) <= 0 || valueOf.compareTo(bigInteger2) >= 0 || c10.compareTo(bigInteger2) <= 0) {
            return false;
        }
        BigInteger k10 = ak.b.k(c10, bigInteger2);
        BigInteger mod = c11.multiply(k10).mod(c10);
        BigInteger mod2 = bigInteger.multiply(k10).mod(c10);
        BigInteger b11 = b10.b();
        return b10.a().modPow(mod, b11).multiply(((zh.t) this.f9085h).c().modPow(mod2, b11)).mod(b11).mod(c10).equals(bigInteger);
    }

    protected SecureRandom e(boolean z10, SecureRandom secureRandom) {
        if (z10) {
            return org.bouncycastle.crypto.l.c(secureRandom);
        }
        return null;
    }

    @Override // org.bouncycastle.crypto.n
    public BigInteger getOrder() {
        return this.f9085h.b().c();
    }

    @Override // org.bouncycastle.crypto.m
    public void init(boolean z10, org.bouncycastle.crypto.i iVar) {
        SecureRandom secureRandom;
        zh.p pVar;
        if (!z10) {
            pVar = (zh.t) iVar;
        } else if (iVar instanceof g1) {
            g1 g1Var = (g1) iVar;
            this.f9085h = (zh.s) g1Var.a();
            secureRandom = g1Var.b();
            this.f9086i = e(!z10 && !this.f9084g.b(), secureRandom);
        } else {
            pVar = (zh.s) iVar;
        }
        this.f9085h = pVar;
        secureRandom = null;
        this.f9086i = e(!z10 && !this.f9084g.b(), secureRandom);
    }
}
