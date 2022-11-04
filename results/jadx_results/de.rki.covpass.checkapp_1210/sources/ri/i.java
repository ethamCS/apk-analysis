package ri;

import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;
/* loaded from: classes3.dex */
public class i implements AlgorithmParameterSpec {

    /* renamed from: a */
    private BigInteger f21228a;

    /* renamed from: b */
    private BigInteger f21229b;

    public i(BigInteger bigInteger, BigInteger bigInteger2) {
        this.f21228a = bigInteger;
        this.f21229b = bigInteger2;
    }

    public BigInteger a() {
        return this.f21229b;
    }

    public BigInteger b() {
        return this.f21228a;
    }
}
