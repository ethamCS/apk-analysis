package di;

import java.math.BigInteger;
import java.security.SecureRandom;
import zh.b0;
import zh.d0;
import zh.e0;
import zh.g1;
import zh.y;
/* loaded from: classes3.dex */
public class e implements ti.d, org.bouncycastle.crypto.n {

    /* renamed from: g */
    private final b f9090g;

    /* renamed from: h */
    private b0 f9091h;

    /* renamed from: i */
    private SecureRandom f9092i;

    public e() {
        this.f9090g = new q();
    }

    public e(b bVar) {
        this.f9090g = bVar;
    }

    @Override // org.bouncycastle.crypto.m
    public BigInteger[] a(byte[] bArr) {
        y b10 = this.f9091h.b();
        BigInteger e10 = b10.e();
        BigInteger c10 = c(e10, bArr);
        BigInteger c11 = ((d0) this.f9091h).c();
        if (this.f9090g.b()) {
            this.f9090g.d(e10, c11, bArr);
        } else {
            this.f9090g.c(e10, this.f9092i);
        }
        ti.h d10 = d();
        while (true) {
            BigInteger a10 = this.f9090g.a();
            BigInteger mod = d10.a(b10.b(), a10).A().f().t().mod(e10);
            BigInteger bigInteger = ti.d.f22359a;
            if (!mod.equals(bigInteger)) {
                BigInteger mod2 = ak.b.j(e10, a10).multiply(c10.add(c11.multiply(mod))).mod(e10);
                if (!mod2.equals(bigInteger)) {
                    return new BigInteger[]{mod, mod2};
                }
            }
        }
    }

    @Override // org.bouncycastle.crypto.m
    public boolean b(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger p10;
        ti.f e10;
        y b10 = this.f9091h.b();
        BigInteger e11 = b10.e();
        BigInteger c10 = c(e11, bArr);
        BigInteger bigInteger3 = ti.d.f22360b;
        if (bigInteger.compareTo(bigInteger3) < 0 || bigInteger.compareTo(e11) >= 0 || bigInteger2.compareTo(bigInteger3) < 0 || bigInteger2.compareTo(e11) >= 0) {
            return false;
        }
        BigInteger k10 = ak.b.k(e11, bigInteger2);
        ti.i r10 = ti.c.r(b10.b(), c10.multiply(k10).mod(e11), ((e0) this.f9091h).c(), bigInteger.multiply(k10).mod(e11));
        if (r10.u()) {
            return false;
        }
        ti.e i10 = r10.i();
        if (i10 == null || (p10 = i10.p()) == null || p10.compareTo(ti.d.f22364f) > 0 || (e10 = e(i10.q(), r10)) == null || e10.i()) {
            return r10.A().f().t().mod(e11).equals(bigInteger);
        }
        ti.f q10 = r10.q();
        while (i10.y(bigInteger)) {
            if (i10.m(bigInteger).j(e10).equals(q10)) {
                return true;
            }
            bigInteger = bigInteger.add(e11);
        }
        return false;
    }

    protected BigInteger c(BigInteger bigInteger, byte[] bArr) {
        int bitLength = bigInteger.bitLength();
        int length = bArr.length * 8;
        BigInteger bigInteger2 = new BigInteger(1, bArr);
        return bitLength < length ? bigInteger2.shiftRight(length - bitLength) : bigInteger2;
    }

    protected ti.h d() {
        return new ti.k();
    }

    protected ti.f e(int i10, ti.i iVar) {
        if (i10 != 1) {
            if (i10 == 2 || i10 == 3 || i10 == 4) {
                return iVar.s(0).o();
            }
            if (i10 != 6 && i10 != 7) {
                return null;
            }
        }
        return iVar.s(0);
    }

    protected SecureRandom f(boolean z10, SecureRandom secureRandom) {
        if (z10) {
            return org.bouncycastle.crypto.l.c(secureRandom);
        }
        return null;
    }

    @Override // org.bouncycastle.crypto.n
    public BigInteger getOrder() {
        return this.f9091h.b().e();
    }

    @Override // org.bouncycastle.crypto.m
    public void init(boolean z10, org.bouncycastle.crypto.i iVar) {
        SecureRandom secureRandom;
        b0 b0Var;
        if (!z10) {
            b0Var = (e0) iVar;
        } else if (iVar instanceof g1) {
            g1 g1Var = (g1) iVar;
            this.f9091h = (d0) g1Var.a();
            secureRandom = g1Var.b();
            this.f9092i = f(!z10 && !this.f9090g.b(), secureRandom);
        } else {
            b0Var = (d0) iVar;
        }
        this.f9091h = b0Var;
        secureRandom = null;
        this.f9092i = f(!z10 && !this.f9090g.b(), secureRandom);
    }
}
