package ti;

import java.math.BigInteger;
/* loaded from: classes3.dex */
public class v extends b {
    @Override // ti.b
    protected i c(i iVar, BigInteger bigInteger) {
        i iVar2;
        w l10 = x.l(iVar, x.i(bigInteger.bitLength()), true);
        i[] c10 = l10.c();
        i[] d10 = l10.d();
        int g10 = l10.g();
        int[] e10 = x.e(g10, bigInteger);
        i u10 = iVar.i().u();
        int length = e10.length;
        if (length > 1) {
            length--;
            int i10 = e10[length];
            int i11 = i10 >> 16;
            int i12 = i10 & 65535;
            int abs = Math.abs(i11);
            i[] iVarArr = i11 < 0 ? d10 : c10;
            if ((abs << 2) < (1 << g10)) {
                int a10 = 32 - ak.g.a(abs);
                int i13 = g10 - a10;
                iVar2 = iVarArr[((1 << (g10 - 1)) - 1) >>> 1].a(iVarArr[(((abs ^ (1 << (a10 - 1))) << i13) + 1) >>> 1]);
                i12 -= i13;
            } else {
                iVar2 = iVarArr[abs >>> 1];
            }
            u10 = iVar2.I(i12);
        }
        while (length > 0) {
            length--;
            int i14 = e10[length];
            int i15 = i14 >> 16;
            u10 = u10.K((i15 < 0 ? d10 : c10)[Math.abs(i15) >>> 1]).I(i14 & 65535);
        }
        return u10;
    }
}
