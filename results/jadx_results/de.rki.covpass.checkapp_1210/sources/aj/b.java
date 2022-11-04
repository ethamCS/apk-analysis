package aj;

import java.math.BigInteger;
/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a */
    static final a f542a = new g(BigInteger.valueOf(2));

    /* renamed from: b */
    static final a f543b = new g(BigInteger.valueOf(3));

    public static f a(int[] iArr) {
        if (iArr[0] == 0) {
            for (int i10 = 1; i10 < iArr.length; i10++) {
                if (iArr[i10] <= iArr[i10 - 1]) {
                    throw new IllegalArgumentException("Polynomial exponents must be monotonically increasing");
                }
            }
            return new d(f542a, new c(iArr));
        }
        throw new IllegalArgumentException("Irreducible polynomials in GF(2) must have constant term");
    }

    public static a b(BigInteger bigInteger) {
        int bitLength = bigInteger.bitLength();
        if (bigInteger.signum() <= 0 || bitLength < 2) {
            throw new IllegalArgumentException("'characteristic' must be >= 2");
        }
        if (bitLength < 3) {
            int intValue = bigInteger.intValue();
            if (intValue == 2) {
                return f542a;
            }
            if (intValue == 3) {
                return f543b;
            }
        }
        return new g(bigInteger);
    }
}
