package sh;

import java.math.BigInteger;
import java.security.SecureRandom;
/* loaded from: classes3.dex */
public class i implements org.bouncycastle.crypto.c {

    /* renamed from: h */
    private static final BigInteger f21726h = BigInteger.valueOf(1);

    /* renamed from: g */
    private zh.o f21727g;

    private static BigInteger b(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        return bigInteger2.modPow(bigInteger3, bigInteger);
    }

    private static BigInteger c(BigInteger bigInteger, SecureRandom secureRandom) {
        BigInteger f10;
        int bitLength = bigInteger.bitLength() >>> 2;
        do {
            BigInteger bigInteger2 = f21726h;
            f10 = ak.b.f(bigInteger2, bigInteger.subtract(bigInteger2), secureRandom);
        } while (ti.x.h(f10) < bitLength);
        return f10;
    }

    @Override // org.bouncycastle.crypto.c
    public org.bouncycastle.crypto.b a() {
        zh.r c10 = this.f21727g.c();
        BigInteger c11 = c(c10.c(), this.f21727g.a());
        return new org.bouncycastle.crypto.b(new zh.t(b(c10.b(), c10.a(), c11), c10), new zh.s(c11, c10));
    }

    public void d(org.bouncycastle.crypto.w wVar) {
        this.f21727g = (zh.o) wVar;
    }
}
