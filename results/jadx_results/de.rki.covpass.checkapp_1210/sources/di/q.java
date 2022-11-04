package di;

import java.math.BigInteger;
import java.security.SecureRandom;
/* loaded from: classes3.dex */
public class q implements b {

    /* renamed from: c */
    private static final BigInteger f9142c = BigInteger.valueOf(0);

    /* renamed from: a */
    private BigInteger f9143a;

    /* renamed from: b */
    private SecureRandom f9144b;

    @Override // di.b
    public BigInteger a() {
        int bitLength = this.f9143a.bitLength();
        while (true) {
            BigInteger e10 = ak.b.e(bitLength, this.f9144b);
            if (!e10.equals(f9142c) && e10.compareTo(this.f9143a) < 0) {
                return e10;
            }
        }
    }

    @Override // di.b
    public boolean b() {
        return false;
    }

    @Override // di.b
    public void c(BigInteger bigInteger, SecureRandom secureRandom) {
        this.f9143a = bigInteger;
        this.f9144b = secureRandom;
    }

    @Override // di.b
    public void d(BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        throw new IllegalStateException("Operation not supported");
    }
}
