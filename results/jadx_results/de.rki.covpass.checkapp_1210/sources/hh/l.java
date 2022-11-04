package hh;

import java.math.BigInteger;
/* loaded from: classes3.dex */
public class l extends gg.t {

    /* renamed from: c */
    private BigInteger f11991c;

    public l(BigInteger bigInteger) {
        if (ak.b.f550a.compareTo(bigInteger) <= 0) {
            this.f11991c = bigInteger;
            return;
        }
        throw new IllegalArgumentException("Invalid CRL number : not in (0..MAX)");
    }

    @Override // gg.t, gg.g
    public gg.a0 b() {
        return new gg.q(this.f11991c);
    }

    public BigInteger l() {
        return this.f11991c;
    }

    public String toString() {
        return "CRLNumber: " + l();
    }
}
