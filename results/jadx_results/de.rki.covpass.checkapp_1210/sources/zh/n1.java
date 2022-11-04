package zh;

import java.math.BigInteger;
/* loaded from: classes3.dex */
public class n1 extends b {

    /* renamed from: x */
    private static final BigInteger f26969x = new BigInteger("8138e8a0fcf3a4e84a771d40fd305d7f4aa59306d7251de54d98af8fe95729a1f73d893fa424cd2edc8636a6c3285e022b0e3866a565ae8108eed8591cd4fe8d2ce86165a978d719ebf647f362d33fca29cd179fb42401cbaf3df0c614056f9c8f3cfd51e474afb6bc6974f78db8aba8e9e517fded658591ab7502bd41849462f", 16);

    /* renamed from: y */
    private static final BigInteger f26970y = BigInteger.valueOf(1);

    /* renamed from: d */
    private BigInteger f26971d;

    /* renamed from: q */
    private BigInteger f26972q;

    public n1(boolean z10, BigInteger bigInteger, BigInteger bigInteger2) {
        super(z10);
        if (z10 || (bigInteger2.intValue() & 1) != 0) {
            this.f26971d = d(bigInteger);
            this.f26972q = bigInteger2;
            return;
        }
        throw new IllegalArgumentException("RSA publicExponent is even");
    }

    private BigInteger d(BigInteger bigInteger) {
        if ((bigInteger.intValue() & 1) != 0) {
            if (ak.m.c("org.bouncycastle.rsa.allow_unsafe_mod") || bigInteger.gcd(f26969x).equals(f26970y)) {
                return bigInteger;
            }
            throw new IllegalArgumentException("RSA modulus has a small prime factor");
        }
        throw new IllegalArgumentException("RSA modulus is even");
    }

    public BigInteger b() {
        return this.f26972q;
    }

    public BigInteger c() {
        return this.f26971d;
    }
}
