package ti;

import java.math.BigInteger;
/* loaded from: classes3.dex */
public class k extends b {
    @Override // ti.b
    protected i c(i iVar, BigInteger bigInteger) {
        int a10;
        e i10 = iVar.i();
        if (bigInteger.bitLength() <= m.a(i10)) {
            l b10 = m.b(iVar);
            g a11 = b10.a();
            int c10 = b10.c();
            int i11 = ((a10 + c10) - 1) / c10;
            i u10 = i10.u();
            int i12 = c10 * i11;
            int[] r10 = bj.n.r(i12, bigInteger);
            int i13 = i12 - 1;
            for (int i14 = 0; i14 < i11; i14++) {
                int i15 = 0;
                for (int i16 = i13 - i14; i16 >= 0; i16 -= i11) {
                    int i17 = r10[i16 >>> 5] >>> (i16 & 31);
                    i15 = ((i15 ^ (i17 >>> 1)) << 1) ^ i17;
                }
                u10 = u10.K(a11.a(i15));
            }
            return u10.a(b10.b());
        }
        throw new IllegalStateException("fixed-point comb doesn't support scalars larger than the curve order");
    }
}
