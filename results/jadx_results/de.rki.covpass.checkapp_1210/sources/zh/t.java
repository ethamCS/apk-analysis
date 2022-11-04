package zh;

import java.math.BigInteger;
/* loaded from: classes3.dex */
public class t extends p {

    /* renamed from: x */
    private static final BigInteger f26998x = BigInteger.valueOf(1);

    /* renamed from: y */
    private static final BigInteger f26999y = BigInteger.valueOf(2);

    /* renamed from: q */
    private BigInteger f27000q;

    public t(BigInteger bigInteger, r rVar) {
        super(false, rVar);
        this.f27000q = d(bigInteger, rVar);
    }

    private BigInteger d(BigInteger bigInteger, r rVar) {
        if (rVar != null) {
            BigInteger bigInteger2 = f26999y;
            if (bigInteger2.compareTo(bigInteger) <= 0 && rVar.b().subtract(bigInteger2).compareTo(bigInteger) >= 0 && f26998x.equals(bigInteger.modPow(rVar.c(), rVar.b()))) {
                return bigInteger;
            }
            throw new IllegalArgumentException("y value does not appear to be in correct group");
        }
        return bigInteger;
    }

    public BigInteger c() {
        return this.f27000q;
    }
}
