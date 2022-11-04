package sh;

import java.math.BigInteger;
import java.security.SecureRandom;
/* loaded from: classes3.dex */
class h {

    /* renamed from: a */
    private static final BigInteger f21724a = BigInteger.valueOf(1);

    /* renamed from: b */
    private static final BigInteger f21725b = BigInteger.valueOf(2);

    public static BigInteger[] a(int i10, int i11, SecureRandom secureRandom) {
        int i12 = i10 - 1;
        int i13 = i10 >>> 2;
        while (true) {
            BigInteger g10 = ak.b.g(i12, 2, secureRandom);
            BigInteger add = g10.shiftLeft(1).add(f21724a);
            if (add.isProbablePrime(i11) && (i11 <= 2 || g10.isProbablePrime(i11 - 2))) {
                if (ti.x.h(add) >= i13) {
                    return new BigInteger[]{add, g10};
                }
            }
        }
    }

    public static BigInteger b(BigInteger bigInteger, BigInteger bigInteger2, SecureRandom secureRandom) {
        BigInteger modPow;
        BigInteger subtract = bigInteger.subtract(f21725b);
        do {
            BigInteger bigInteger3 = f21725b;
            modPow = ak.b.f(bigInteger3, subtract, secureRandom).modPow(bigInteger3, bigInteger);
        } while (modPow.equals(f21724a));
        return modPow;
    }
}
