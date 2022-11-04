package ri;

import java.math.BigInteger;
import java.security.spec.KeySpec;
/* loaded from: classes3.dex */
public class o implements KeySpec {

    /* renamed from: c */
    private BigInteger f21243c;

    /* renamed from: d */
    private BigInteger f21244d;

    /* renamed from: q */
    private BigInteger f21245q;

    /* renamed from: x */
    private BigInteger f21246x;

    public o(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this.f21243c = bigInteger;
        this.f21244d = bigInteger2;
        this.f21245q = bigInteger3;
        this.f21246x = bigInteger4;
    }

    public BigInteger a() {
        return this.f21246x;
    }

    public BigInteger b() {
        return this.f21244d;
    }

    public BigInteger c() {
        return this.f21245q;
    }

    public BigInteger d() {
        return this.f21243c;
    }
}
