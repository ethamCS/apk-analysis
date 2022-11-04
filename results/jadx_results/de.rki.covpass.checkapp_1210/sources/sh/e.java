package sh;

import java.math.BigInteger;
import java.security.SecureRandom;
/* loaded from: classes3.dex */
class e {

    /* renamed from: a */
    static final e f21716a = new e();

    /* renamed from: b */
    private static final BigInteger f21717b = BigInteger.valueOf(1);

    /* renamed from: c */
    private static final BigInteger f21718c = BigInteger.valueOf(2);

    private e() {
    }

    public BigInteger a(zh.i iVar, SecureRandom secureRandom) {
        BigInteger f10;
        BigInteger bit;
        int d10 = iVar.d();
        if (d10 != 0) {
            int i10 = d10 >>> 2;
            do {
                bit = ak.b.e(d10, secureRandom).setBit(d10 - 1);
            } while (ti.x.h(bit) < i10);
            return bit;
        }
        BigInteger bigInteger = f21718c;
        int e10 = iVar.e();
        BigInteger shiftLeft = e10 != 0 ? f21717b.shiftLeft(e10 - 1) : bigInteger;
        BigInteger g10 = iVar.g();
        if (g10 == null) {
            g10 = iVar.f();
        }
        BigInteger subtract = g10.subtract(bigInteger);
        int bitLength = subtract.bitLength() >>> 2;
        do {
            f10 = ak.b.f(shiftLeft, subtract, secureRandom);
        } while (ti.x.h(f10) < bitLength);
        return f10;
    }

    public BigInteger b(zh.i iVar, BigInteger bigInteger) {
        return iVar.b().modPow(bigInteger, iVar.f());
    }
}
