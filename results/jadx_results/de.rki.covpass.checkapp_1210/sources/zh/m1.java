package zh;

import java.math.BigInteger;
import java.security.SecureRandom;
/* loaded from: classes3.dex */
public class m1 extends org.bouncycastle.crypto.w {

    /* renamed from: c */
    private BigInteger f26962c;

    /* renamed from: d */
    private int f26963d;

    public m1(BigInteger bigInteger, SecureRandom secureRandom, int i10, int i11) {
        super(secureRandom, i10);
        if (i10 >= 12) {
            if (!bigInteger.testBit(0)) {
                throw new IllegalArgumentException("public exponent cannot be even");
            }
            this.f26962c = bigInteger;
            this.f26963d = i11;
            return;
        }
        throw new IllegalArgumentException("key strength too small");
    }

    public int c() {
        return this.f26963d;
    }

    public BigInteger d() {
        return this.f26962c;
    }
}
