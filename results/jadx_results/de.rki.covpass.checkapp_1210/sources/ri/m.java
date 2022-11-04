package ri;

import java.math.BigInteger;
import java.security.spec.KeySpec;
/* loaded from: classes3.dex */
public class m implements KeySpec {

    /* renamed from: c */
    private BigInteger f21236c;

    /* renamed from: d */
    private BigInteger f21237d;

    /* renamed from: q */
    private BigInteger f21238q;

    /* renamed from: x */
    private BigInteger f21239x;

    public m(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this.f21236c = bigInteger;
        this.f21237d = bigInteger2;
        this.f21238q = bigInteger3;
        this.f21239x = bigInteger4;
    }

    public BigInteger a() {
        return this.f21239x;
    }

    public BigInteger b() {
        return this.f21237d;
    }

    public BigInteger c() {
        return this.f21238q;
    }

    public BigInteger d() {
        return this.f21236c;
    }
}
