package di;

import java.math.BigInteger;
import java.security.SecureRandom;
import zh.b0;
import zh.d0;
import zh.e0;
import zh.g1;
import zh.y;
/* loaded from: classes3.dex */
public class d implements org.bouncycastle.crypto.n {

    /* renamed from: i */
    private static final BigInteger f9087i = BigInteger.valueOf(1);

    /* renamed from: g */
    private b0 f9088g;

    /* renamed from: h */
    private SecureRandom f9089h;

    private static BigInteger d(BigInteger bigInteger, ti.f fVar) {
        return g(fVar.t(), bigInteger.bitLength() - 1);
    }

    private static BigInteger e(BigInteger bigInteger, SecureRandom secureRandom) {
        return ak.b.e(bigInteger.bitLength() - 1, secureRandom);
    }

    private static ti.f f(ti.e eVar, byte[] bArr) {
        return eVar.m(g(new BigInteger(1, ak.a.Q(bArr)), eVar.t()));
    }

    private static BigInteger g(BigInteger bigInteger, int i10) {
        return bigInteger.bitLength() > i10 ? bigInteger.mod(f9087i.shiftLeft(i10)) : bigInteger;
    }

    @Override // org.bouncycastle.crypto.m
    public BigInteger[] a(byte[] bArr) {
        y b10 = this.f9088g.b();
        ti.e a10 = b10.a();
        ti.f f10 = f(a10, bArr);
        if (f10.i()) {
            f10 = a10.m(f9087i);
        }
        BigInteger e10 = b10.e();
        BigInteger c10 = ((d0) this.f9088g).c();
        ti.h c11 = c();
        while (true) {
            BigInteger e11 = e(e10, this.f9089h);
            ti.f f11 = c11.a(b10.b(), e11).A().f();
            if (!f11.i()) {
                BigInteger d10 = d(e10, f10.j(f11));
                if (d10.signum() != 0) {
                    BigInteger mod = d10.multiply(c10).add(e11).mod(e10);
                    if (mod.signum() != 0) {
                        return new BigInteger[]{d10, mod};
                    }
                } else {
                    continue;
                }
            }
        }
    }

    @Override // org.bouncycastle.crypto.m
    public boolean b(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2) {
        if (bigInteger.signum() <= 0 || bigInteger2.signum() <= 0) {
            return false;
        }
        y b10 = this.f9088g.b();
        BigInteger e10 = b10.e();
        if (bigInteger.compareTo(e10) >= 0 || bigInteger2.compareTo(e10) >= 0) {
            return false;
        }
        ti.e a10 = b10.a();
        ti.f f10 = f(a10, bArr);
        if (f10.i()) {
            f10 = a10.m(f9087i);
        }
        ti.i A = ti.c.r(b10.b(), bigInteger2, ((e0) this.f9088g).c(), bigInteger).A();
        return !A.u() && d(e10, f10.j(A.f())).compareTo(bigInteger) == 0;
    }

    protected ti.h c() {
        return new ti.k();
    }

    @Override // org.bouncycastle.crypto.n
    public BigInteger getOrder() {
        return this.f9088g.b().e();
    }

    @Override // org.bouncycastle.crypto.m
    public void init(boolean z10, org.bouncycastle.crypto.i iVar) {
        b0 b0Var;
        if (z10) {
            if (iVar instanceof g1) {
                g1 g1Var = (g1) iVar;
                this.f9089h = g1Var.b();
                iVar = g1Var.a();
            } else {
                this.f9089h = org.bouncycastle.crypto.l.b();
            }
            b0Var = (d0) iVar;
        } else {
            b0Var = (e0) iVar;
        }
        this.f9088g = b0Var;
    }
}
