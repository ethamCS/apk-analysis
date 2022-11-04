package ti;

import java.math.BigInteger;
import ti.e;
/* loaded from: classes3.dex */
public class c {
    public static i a(e eVar, i iVar) {
        if (eVar.l(iVar.i())) {
            return eVar.j(iVar.l(false));
        }
        throw new IllegalArgumentException("Point must be on the same curve");
    }

    public static i b(i iVar) {
        if (iVar.x()) {
            return iVar;
        }
        throw new IllegalStateException("Invalid result");
    }

    private static i c(i iVar, BigInteger bigInteger, i iVar2, BigInteger bigInteger2) {
        i a10;
        i b10;
        e i10 = iVar.i();
        int a11 = m.a(i10);
        if (bigInteger.bitLength() > a11 || bigInteger2.bitLength() > a11) {
            throw new IllegalStateException("fixed-point comb doesn't support scalars larger than the curve order");
        }
        l b11 = m.b(iVar);
        l b12 = m.b(iVar2);
        g a12 = b11.a();
        g a13 = b12.a();
        int c10 = b11.c();
        if (c10 != b12.c()) {
            k kVar = new k();
            a10 = kVar.a(iVar, bigInteger);
            b10 = kVar.a(iVar2, bigInteger2);
        } else {
            int i11 = ((a11 + c10) - 1) / c10;
            i u10 = i10.u();
            int i12 = c10 * i11;
            int[] r10 = bj.n.r(i12, bigInteger);
            int[] r11 = bj.n.r(i12, bigInteger2);
            int i13 = i12 - 1;
            for (int i14 = 0; i14 < i11; i14++) {
                int i15 = 0;
                int i16 = 0;
                for (int i17 = i13 - i14; i17 >= 0; i17 -= i11) {
                    int i18 = i17 >>> 5;
                    int i19 = i17 & 31;
                    int i20 = r10[i18] >>> i19;
                    i15 = ((i15 ^ (i20 >>> 1)) << 1) ^ i20;
                    int i21 = r11[i18] >>> i19;
                    i16 = ((i16 ^ (i21 >>> 1)) << 1) ^ i21;
                }
                u10 = u10.K(a12.c(i15).a(a13.c(i16)));
            }
            a10 = u10.a(b11.b());
            b10 = b12.b();
        }
        return a10.a(b10);
    }

    public static i d(i iVar, BigInteger bigInteger, i iVar2, BigInteger bigInteger2) {
        boolean z10 = false;
        boolean z11 = bigInteger.signum() < 0;
        if (bigInteger2.signum() < 0) {
            z10 = true;
        }
        BigInteger abs = bigInteger.abs();
        BigInteger abs2 = bigInteger2.abs();
        int j10 = x.j(abs.bitLength(), 8);
        int j11 = x.j(abs2.bitLength(), 8);
        w l10 = x.l(iVar, j10, true);
        w l11 = x.l(iVar2, j11, true);
        int a10 = m.a(iVar.i());
        if (z11 || z10 || bigInteger.bitLength() > a10 || bigInteger2.bitLength() > a10 || !l10.h() || !l11.h()) {
            int min = Math.min(8, l10.g());
            int min2 = Math.min(8, l11.g());
            return f(z11 ? l10.d() : l10.c(), z11 ? l10.c() : l10.d(), x.g(min, abs), z10 ? l11.d() : l11.c(), z10 ? l11.c() : l11.d(), x.g(min2, abs2));
        }
        return c(iVar, bigInteger, iVar2, bigInteger2);
    }

    public static i e(xi.a aVar, i iVar, BigInteger bigInteger, BigInteger bigInteger2) {
        boolean z10 = false;
        boolean z11 = bigInteger.signum() < 0;
        if (bigInteger2.signum() < 0) {
            z10 = true;
        }
        BigInteger abs = bigInteger.abs();
        BigInteger abs2 = bigInteger2.abs();
        w l10 = x.l(iVar, x.j(Math.max(abs.bitLength(), abs2.bitLength()), 8), true);
        w m10 = x.m(xi.c.c(aVar, iVar), aVar.a(), l10, true);
        int min = Math.min(8, l10.g());
        int min2 = Math.min(8, m10.g());
        return f(z11 ? l10.d() : l10.c(), z11 ? l10.c() : l10.d(), x.g(min, abs), z10 ? m10.d() : m10.c(), z10 ? m10.c() : m10.d(), x.g(min2, abs2));
    }

    private static i f(i[] iVarArr, i[] iVarArr2, byte[] bArr, i[] iVarArr3, i[] iVarArr4, byte[] bArr2) {
        i iVar;
        int max = Math.max(bArr.length, bArr2.length);
        i u10 = iVarArr[0].i().u();
        int i10 = max - 1;
        int i11 = 0;
        i iVar2 = u10;
        while (i10 >= 0) {
            byte b10 = i10 < bArr.length ? bArr[i10] : (byte) 0;
            byte b11 = i10 < bArr2.length ? bArr2[i10] : (byte) 0;
            if ((b10 | b11) == 0) {
                i11++;
            } else {
                if (b10 != 0) {
                    iVar = u10.a((b10 < 0 ? iVarArr2 : iVarArr)[Math.abs((int) b10) >>> 1]);
                } else {
                    iVar = u10;
                }
                if (b11 != 0) {
                    iVar = iVar.a((b11 < 0 ? iVarArr4 : iVarArr3)[Math.abs((int) b11) >>> 1]);
                }
                if (i11 > 0) {
                    iVar2 = iVar2.I(i11);
                    i11 = 0;
                }
                iVar2 = iVar2.K(iVar);
            }
            i10--;
        }
        return i11 > 0 ? iVar2.I(i11) : iVar2;
    }

    static i g(xi.a aVar, i[] iVarArr, BigInteger[] bigIntegerArr) {
        i[] iVarArr2 = iVarArr;
        int length = iVarArr2.length;
        int i10 = length << 1;
        boolean[] zArr = new boolean[i10];
        w[] wVarArr = new w[i10];
        byte[][] bArr = new byte[i10];
        j a10 = aVar.a();
        int i11 = 0;
        while (i11 < length) {
            int i12 = i11 << 1;
            int i13 = i12 + 1;
            BigInteger bigInteger = bigIntegerArr[i12];
            zArr[i12] = bigInteger.signum() < 0;
            BigInteger abs = bigInteger.abs();
            BigInteger bigInteger2 = bigIntegerArr[i13];
            zArr[i13] = bigInteger2.signum() < 0;
            BigInteger abs2 = bigInteger2.abs();
            int j10 = x.j(Math.max(abs.bitLength(), abs2.bitLength()), 8);
            i iVar = iVarArr2[i11];
            w l10 = x.l(iVar, j10, true);
            w m10 = x.m(xi.c.c(aVar, iVar), a10, l10, true);
            int min = Math.min(8, l10.g());
            int min2 = Math.min(8, m10.g());
            wVarArr[i12] = l10;
            wVarArr[i13] = m10;
            bArr[i12] = x.g(min, abs);
            bArr[i13] = x.g(min2, abs2);
            i11++;
            iVarArr2 = iVarArr;
        }
        return i(zArr, wVarArr, bArr);
    }

    static i h(i[] iVarArr, BigInteger[] bigIntegerArr) {
        int length = iVarArr.length;
        boolean[] zArr = new boolean[length];
        w[] wVarArr = new w[length];
        byte[][] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            BigInteger bigInteger = bigIntegerArr[i10];
            zArr[i10] = bigInteger.signum() < 0;
            BigInteger abs = bigInteger.abs();
            w l10 = x.l(iVarArr[i10], x.j(abs.bitLength(), 8), true);
            int min = Math.min(8, l10.g());
            wVarArr[i10] = l10;
            bArr[i10] = x.g(min, abs);
        }
        return i(zArr, wVarArr, bArr);
    }

    private static i i(boolean[] zArr, w[] wVarArr, byte[][] bArr) {
        int length = bArr.length;
        int i10 = 0;
        for (byte[] bArr2 : bArr) {
            i10 = Math.max(i10, bArr2.length);
        }
        i u10 = wVarArr[0].c()[0].i().u();
        int i11 = i10 - 1;
        int i12 = 0;
        i iVar = u10;
        while (i11 >= 0) {
            i iVar2 = u10;
            for (int i13 = 0; i13 < length; i13++) {
                byte[] bArr3 = bArr[i13];
                byte b10 = i11 < bArr3.length ? bArr3[i11] : (byte) 0;
                if (b10 != 0) {
                    int abs = Math.abs((int) b10);
                    w wVar = wVarArr[i13];
                    iVar2 = iVar2.a(((b10 < 0) == zArr[i13] ? wVar.c() : wVar.d())[abs >>> 1]);
                }
            }
            if (iVar2 == u10) {
                i12++;
            } else {
                if (i12 > 0) {
                    iVar = iVar.I(i12);
                    i12 = 0;
                }
                iVar = iVar.K(iVar2);
            }
            i11--;
        }
        return i12 > 0 ? iVar.I(i12) : iVar;
    }

    static i j(i[] iVarArr, BigInteger[] bigIntegerArr, xi.d dVar) {
        BigInteger w9 = iVarArr[0].i().w();
        int length = iVarArr.length;
        int i10 = length << 1;
        BigInteger[] bigIntegerArr2 = new BigInteger[i10];
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            BigInteger[] c10 = dVar.c(bigIntegerArr[i12].mod(w9));
            int i13 = i11 + 1;
            bigIntegerArr2[i11] = c10[0];
            i11 = i13 + 1;
            bigIntegerArr2[i13] = c10[1];
        }
        if (dVar.b()) {
            return g(dVar, iVarArr, bigIntegerArr2);
        }
        i[] iVarArr2 = new i[i10];
        int i14 = 0;
        for (i iVar : iVarArr) {
            i c11 = xi.c.c(dVar, iVar);
            int i15 = i14 + 1;
            iVarArr2[i14] = iVar;
            i14 = i15 + 1;
            iVarArr2[i15] = c11;
        }
        return h(iVarArr2, bigIntegerArr2);
    }

    public static i k(e eVar, i iVar) {
        if (eVar.l(iVar.i())) {
            return eVar.x(iVar);
        }
        throw new IllegalArgumentException("Point must be on the same curve");
    }

    public static boolean l(e eVar) {
        return m(eVar.s());
    }

    public static boolean m(aj.a aVar) {
        return aVar.b() > 1 && aVar.c().equals(d.f22361c) && (aVar instanceof aj.f);
    }

    public static boolean n(e eVar) {
        return o(eVar.s());
    }

    public static boolean o(aj.a aVar) {
        return aVar.b() == 1;
    }

    public static void p(f[] fVarArr, int i10, int i11, f fVar) {
        f[] fVarArr2 = new f[i11];
        int i12 = 0;
        fVarArr2[0] = fVarArr[i10];
        while (true) {
            i12++;
            if (i12 >= i11) {
                break;
            }
            fVarArr2[i12] = fVarArr2[i12 - 1].j(fVarArr[i10 + i12]);
        }
        int i13 = i12 - 1;
        if (fVar != null) {
            fVarArr2[i13] = fVarArr2[i13].j(fVar);
        }
        f g10 = fVarArr2[i13].g();
        while (i13 > 0) {
            int i14 = i13 - 1;
            int i15 = i13 + i10;
            f fVar2 = fVarArr[i15];
            fVarArr[i15] = fVarArr2[i14].j(g10);
            g10 = g10.j(fVar2);
            i13 = i14;
        }
        fVarArr[i10] = g10;
    }

    public static i q(i iVar, BigInteger bigInteger) {
        BigInteger abs = bigInteger.abs();
        i u10 = iVar.i().u();
        int bitLength = abs.bitLength();
        if (bitLength > 0) {
            if (abs.testBit(0)) {
                u10 = iVar;
            }
            for (int i10 = 1; i10 < bitLength; i10++) {
                iVar = iVar.J();
                if (abs.testBit(i10)) {
                    u10 = u10.a(iVar);
                }
            }
        }
        return bigInteger.signum() < 0 ? u10.z() : u10;
    }

    public static i r(i iVar, BigInteger bigInteger, i iVar2, BigInteger bigInteger2) {
        i j10;
        e i10 = iVar.i();
        i k10 = k(i10, iVar2);
        if (!(i10 instanceof e.b) || !((e.b) i10).I()) {
            xi.a r10 = i10.r();
            j10 = r10 instanceof xi.d ? j(new i[]{iVar, k10}, new BigInteger[]{bigInteger, bigInteger2}, (xi.d) r10) : d(iVar, bigInteger, k10, bigInteger2);
        } else {
            j10 = iVar.y(bigInteger).a(k10.y(bigInteger2));
        }
        return b(j10);
    }
}
