package di;

import gg.a0;
import gg.d0;
import gg.x1;
import java.math.BigInteger;
/* loaded from: classes3.dex */
public class s implements a {

    /* renamed from: a */
    public static final s f9152a = new s();

    @Override // di.a
    public BigInteger[] a(BigInteger bigInteger, byte[] bArr) {
        d0 d0Var = (d0) a0.u(bArr);
        if (d0Var.size() == 2) {
            BigInteger d10 = d(bigInteger, d0Var, 0);
            BigInteger d11 = d(bigInteger, d0Var, 1);
            if (ak.a.c(b(bigInteger, d10, d11), bArr)) {
                return new BigInteger[]{d10, d11};
            }
        }
        throw new IllegalArgumentException("Malformed signature");
    }

    @Override // di.a
    public byte[] b(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        gg.h hVar = new gg.h();
        e(bigInteger, hVar, bigInteger2);
        e(bigInteger, hVar, bigInteger3);
        return new x1(hVar).k("DER");
    }

    protected BigInteger c(BigInteger bigInteger, BigInteger bigInteger2) {
        if (bigInteger2.signum() < 0 || (bigInteger != null && bigInteger2.compareTo(bigInteger) >= 0)) {
            throw new IllegalArgumentException("Value out of range");
        }
        return bigInteger2;
    }

    protected BigInteger d(BigInteger bigInteger, d0 d0Var, int i10) {
        return c(bigInteger, ((gg.q) d0Var.G(i10)).G());
    }

    protected void e(BigInteger bigInteger, gg.h hVar, BigInteger bigInteger2) {
        hVar.a(new gg.q(c(bigInteger, bigInteger2)));
    }
}
