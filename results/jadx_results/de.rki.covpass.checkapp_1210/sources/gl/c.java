package gl;

import rk.f0;
import rk.k;
import rk.m;
import rk.n;
import rk.o;
/* loaded from: classes3.dex */
public class c {
    public static n a(m mVar, n nVar) {
        if (nVar != null) {
            nVar.U(mVar.Z(), mVar.w());
        } else {
            nVar = new n(mVar.f21297d, mVar.f21298q);
        }
        int i10 = 0;
        while (true) {
            int i11 = mVar.f21297d;
            if (i10 < i11) {
                int min = Math.min(mVar.f21299x, i11 - i10);
                int i12 = 0;
                while (true) {
                    int i13 = mVar.f21298q;
                    if (i12 < i13) {
                        int min2 = Math.min(mVar.f21299x, i13 - i12);
                        int i14 = (mVar.f21298q * i10) + (min * i12);
                        int i15 = (nVar.f21298q * i10) + i12;
                        for (int i16 = 0; i16 < min; i16++) {
                            System.arraycopy(mVar.f21296c, i14, nVar.f21296c, i15, min2);
                            i14 += min2;
                            i15 += nVar.f21298q;
                        }
                        i12 += mVar.f21299x;
                    }
                }
                i10 += mVar.f21299x;
            } else {
                return nVar;
            }
        }
    }

    public static n b(o oVar, n nVar) {
        if (nVar == null) {
            nVar = new n(oVar.f21304y, oVar.U3);
        } else {
            nVar.U(oVar.f21304y, oVar.U3);
            nVar.k();
        }
        int i10 = oVar.f21303x[0];
        int i11 = 1;
        while (i11 <= oVar.U3) {
            int i12 = oVar.f21303x[i11];
            while (i10 < i12) {
                nVar.L(oVar.f21302q[i10], i11 - 1, oVar.f21300c[i10]);
                i10++;
            }
            i11++;
            i10 = i12;
        }
        return nVar;
    }

    public static void c(k kVar, k kVar2) {
        if (kVar2 instanceof f0) {
            ((f0) kVar2).U(kVar.Z(), kVar.w());
        } else if (kVar.Z() != kVar2.Z()) {
            throw new IllegalArgumentException("Number of rows do not match");
        } else {
            if (kVar.w() != kVar2.w()) {
                throw new IllegalArgumentException("Number of columns do not match");
            }
        }
        for (int i10 = 0; i10 < kVar.Z(); i10++) {
            for (int i11 = 0; i11 < kVar.w(); i11++) {
                kVar2.L(i10, i11, kVar.l(i10, i11));
            }
        }
    }
}
