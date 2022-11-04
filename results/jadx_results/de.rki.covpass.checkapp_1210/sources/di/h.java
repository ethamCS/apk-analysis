package di;

import java.math.BigInteger;
import java.security.SecureRandom;
import zh.a0;
import zh.b0;
import zh.d0;
import zh.e0;
import zh.g1;
/* loaded from: classes3.dex */
public class h implements org.bouncycastle.crypto.n {

    /* renamed from: g */
    private boolean f9097g;

    /* renamed from: h */
    private b0 f9098h;

    /* renamed from: i */
    private SecureRandom f9099i;

    private BigInteger c(e0 e0Var, BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger e10 = e0Var.b().e();
        if (bigInteger.compareTo(ti.d.f22360b) < 0 || bigInteger.compareTo(e10) >= 0 || bigInteger2.compareTo(ti.d.f22359a) < 0 || bigInteger2.compareTo(e10) >= 0) {
            return null;
        }
        ti.i A = ti.c.r(e0Var.b().b(), bigInteger2, e0Var.c(), bigInteger).A();
        if (!A.u()) {
            return bigInteger.subtract(A.f().t()).mod(e10);
        }
        return null;
    }

    @Override // org.bouncycastle.crypto.m
    public BigInteger[] a(byte[] bArr) {
        org.bouncycastle.crypto.b a10;
        BigInteger mod;
        if (this.f9097g) {
            BigInteger order = getOrder();
            BigInteger bigInteger = new BigInteger(1, bArr);
            d0 d0Var = (d0) this.f9098h;
            if (bigInteger.compareTo(order) >= 0) {
                throw new org.bouncycastle.crypto.o("input too large for ECNR key");
            }
            do {
                sh.l lVar = new sh.l();
                lVar.c(new a0(d0Var.b(), this.f9099i));
                a10 = lVar.a();
                mod = ((e0) a10.b()).c().f().t().add(bigInteger).mod(order);
            } while (mod.equals(ti.d.f22359a));
            return new BigInteger[]{mod, ((d0) a10.a()).c().subtract(mod.multiply(d0Var.c())).mod(order)};
        }
        throw new IllegalStateException("not initialised for signing");
    }

    @Override // org.bouncycastle.crypto.m
    public boolean b(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2) {
        if (!this.f9097g) {
            e0 e0Var = (e0) this.f9098h;
            BigInteger e10 = e0Var.b().e();
            int bitLength = e10.bitLength();
            BigInteger bigInteger3 = new BigInteger(1, bArr);
            if (bigInteger3.bitLength() > bitLength) {
                throw new org.bouncycastle.crypto.o("input too large for ECNR key.");
            }
            BigInteger c10 = c(e0Var, bigInteger, bigInteger2);
            return c10 != null && c10.equals(bigInteger3.mod(e10));
        }
        throw new IllegalStateException("not initialised for verifying");
    }

    @Override // org.bouncycastle.crypto.n
    public BigInteger getOrder() {
        return this.f9098h.b().e();
    }

    @Override // org.bouncycastle.crypto.m
    public void init(boolean z10, org.bouncycastle.crypto.i iVar) {
        b0 b0Var;
        this.f9097g = z10;
        if (!z10) {
            b0Var = (e0) iVar;
        } else if (iVar instanceof g1) {
            g1 g1Var = (g1) iVar;
            this.f9099i = g1Var.b();
            this.f9098h = (d0) g1Var.a();
            return;
        } else {
            this.f9099i = org.bouncycastle.crypto.l.b();
            b0Var = (d0) iVar;
        }
        this.f9098h = b0Var;
    }
}
