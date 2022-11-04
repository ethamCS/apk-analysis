package rh;

import ak.l;
import java.math.BigInteger;
import org.bouncycastle.crypto.e;
/* loaded from: classes3.dex */
class d {

    /* renamed from: a */
    protected static final double f21214a = Math.log(2.0d);

    /* renamed from: b */
    protected static final double f21215b = Math.pow(2.0d, 96.0d);

    protected static short[] A(e eVar, int i10, byte[] bArr, short[] sArr, int i11, int i12) {
        int i13 = i12 / 2;
        int i14 = i12 - i13;
        short[] sArr2 = new short[i14];
        short[] sArr3 = new short[i13];
        System.arraycopy(sArr, i11, sArr2, 0, i14);
        System.arraycopy(sArr, i11 + i14, sArr3, 0, i13);
        return m(eVar, i10, bArr, i12, i13, i14, sArr2, sArr3);
    }

    protected static byte[] B(e eVar, int i10, byte[] bArr, byte[] bArr2, int i11, int i12) {
        int i13 = i12 / 2;
        int i14 = i12 - i13;
        return J(s(eVar, i10, bArr, i12, i13, i14, K(bArr2, i11, i14), K(bArr2, i11 + i14, i13)));
    }

    protected static short[] C(e eVar, int i10, byte[] bArr, short[] sArr, int i11, int i12) {
        int i13 = i12 / 2;
        int i14 = i12 - i13;
        short[] sArr2 = new short[i14];
        short[] sArr3 = new short[i13];
        System.arraycopy(sArr, i11, sArr2, 0, i14);
        System.arraycopy(sArr, i11 + i14, sArr3, 0, i13);
        return s(eVar, i10, bArr, i12, i13, i14, sArr2, sArr3);
    }

    protected static BigInteger D(BigInteger bigInteger, short[] sArr) {
        BigInteger bigInteger2 = ak.b.f550a;
        for (short s10 : sArr) {
            bigInteger2 = bigInteger2.multiply(bigInteger).add(BigInteger.valueOf(s10 & 65535));
        }
        return bigInteger2;
    }

    protected static BigInteger E(byte[] bArr, int i10, int i11) {
        return new BigInteger(1, ak.a.w(bArr, i10, i11 + i10));
    }

    protected static byte[] F(e eVar, byte[] bArr) {
        if (bArr.length % 16 == 0) {
            int length = bArr.length / 16;
            byte[] bArr2 = new byte[16];
            for (int i10 = 0; i10 < length; i10++) {
                L(bArr, i10 * 16, bArr2, 0, 16);
                eVar.a(bArr2, 0, bArr2, 0);
            }
            return bArr2;
        }
        throw new IllegalArgumentException();
    }

    protected static void G(byte[] bArr) {
        int length = bArr.length / 2;
        int length2 = bArr.length - 1;
        for (int i10 = 0; i10 < length; i10++) {
            byte b10 = bArr[i10];
            int i11 = length2 - i10;
            bArr[i10] = bArr[i11];
            bArr[i11] = b10;
        }
    }

    protected static void H(short[] sArr) {
        int length = sArr.length / 2;
        int length2 = sArr.length - 1;
        for (int i10 = 0; i10 < length; i10++) {
            short s10 = sArr[i10];
            int i11 = length2 - i10;
            sArr[i10] = sArr[i11];
            sArr[i11] = s10;
        }
    }

    protected static void I(BigInteger bigInteger, BigInteger bigInteger2, int i10, short[] sArr, int i11) {
        if (bigInteger2.signum() >= 0) {
            for (int i12 = 1; i12 <= i10; i12++) {
                BigInteger[] divideAndRemainder = bigInteger2.divideAndRemainder(bigInteger);
                sArr[(i11 + i10) - i12] = (short) divideAndRemainder[1].intValue();
                bigInteger2 = divideAndRemainder[0];
            }
            if (bigInteger2.signum() != 0) {
                throw new IllegalArgumentException();
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    private static byte[] J(short[] sArr) {
        int length = sArr.length;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 != length; i10++) {
            bArr[i10] = (byte) sArr[i10];
        }
        return bArr;
    }

    private static short[] K(byte[] bArr, int i10, int i11) {
        short[] sArr = new short[i11];
        for (int i12 = 0; i12 != i11; i12++) {
            sArr[i12] = (short) (bArr[i10 + i12] & 255);
        }
        return sArr;
    }

    protected static void L(byte[] bArr, int i10, byte[] bArr2, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = i11 + i13;
            bArr2[i14] = (byte) (bArr2[i14] ^ bArr[i10 + i13]);
        }
    }

    protected static BigInteger[] a(BigInteger bigInteger, int i10, int i11) {
        BigInteger[] bigIntegerArr = {bigInteger.pow(i10), bigIntegerArr[0]};
        if (i11 != i10) {
            bigIntegerArr[1] = bigIntegerArr[1].multiply(bigInteger);
        }
        return bigIntegerArr;
    }

    protected static byte[] b(int i10, byte b10, int i11, int i12) {
        byte[] bArr = {1, 2, 1, 0, (byte) (i10 >> 8), (byte) i10, 10, b10};
        l.f(i11, bArr, 8);
        l.f(i12, bArr, 12);
        return bArr;
    }

    protected static byte[] c(byte[] bArr) {
        return new byte[]{bArr[0], bArr[1], bArr[2], (byte) (bArr[3] & 240), bArr[4], bArr[5], bArr[6], (byte) (bArr[3] << 4)};
    }

    protected static BigInteger d(e eVar, BigInteger bigInteger, byte[] bArr, int i10, int i11, int i12, byte[] bArr2, short[] sArr) {
        int length = bArr.length;
        byte[] c10 = ak.b.c(D(bigInteger, sArr));
        int i13 = ((-(length + i10 + 1)) & 15) + length;
        int i14 = i13 + 1 + i10;
        byte[] bArr3 = new byte[i14];
        System.arraycopy(bArr, 0, bArr3, 0, length);
        bArr3[i13] = (byte) i12;
        System.arraycopy(c10, 0, bArr3, i14 - c10.length, c10.length);
        byte[] F = F(eVar, ak.a.p(bArr2, bArr3));
        if (i11 > 16) {
            int i15 = ((i11 + 16) - 1) / 16;
            byte[] bArr4 = new byte[i15 * 16];
            System.arraycopy(F, 0, bArr4, 0, 16);
            byte[] bArr5 = new byte[4];
            for (int i16 = 1; i16 < i15; i16++) {
                int i17 = i16 * 16;
                System.arraycopy(F, 0, bArr4, i17, 16);
                l.f(i16, bArr5, 0);
                L(bArr5, 0, bArr4, (i17 + 16) - 4, 4);
                eVar.a(bArr4, i17, bArr4, i17);
            }
            F = bArr4;
        }
        return E(F, 0, i11);
    }

    protected static BigInteger e(e eVar, BigInteger bigInteger, byte[] bArr, int i10, int i11, short[] sArr) {
        byte[] bArr2 = new byte[16];
        l.f(i11, bArr2, 0);
        L(bArr, i10, bArr2, 0, 4);
        byte[] c10 = ak.b.c(D(bigInteger, sArr));
        if (16 - c10.length >= 4) {
            System.arraycopy(c10, 0, bArr2, 16 - c10.length, c10.length);
            G(bArr2);
            eVar.a(bArr2, 0, bArr2, 0);
            G(bArr2);
            return E(bArr2, 0, 16);
        }
        throw new IllegalStateException("input out of range");
    }

    protected static void f(e eVar, boolean z10, int i10, byte[] bArr, int i11, int i12) {
        h(eVar);
        if (i10 < 2 || i10 > 256) {
            throw new IllegalArgumentException();
        }
        i(z10, i10, bArr, i11, i12);
    }

    protected static void g(e eVar, boolean z10, int i10, short[] sArr, int i11, int i12) {
        h(eVar);
        if (i10 < 2 || i10 > 65536) {
            throw new IllegalArgumentException();
        }
        j(z10, i10, sArr, i11, i12);
    }

    protected static void h(e eVar) {
        if (16 == eVar.b()) {
            return;
        }
        throw new IllegalArgumentException();
    }

    protected static void i(boolean z10, int i10, byte[] bArr, int i11, int i12) {
        k(z10, i10, i12);
        for (int i13 = 0; i13 < i12; i13++) {
            if ((bArr[i11 + i13] & 255) >= i10) {
                throw new IllegalArgumentException("input data outside of radix");
            }
        }
    }

    protected static void j(boolean z10, int i10, short[] sArr, int i11, int i12) {
        k(z10, i10, i12);
        for (int i13 = 0; i13 < i12; i13++) {
            if ((sArr[i11 + i13] & 65535) >= i10) {
                throw new IllegalArgumentException("input data outside of radix");
            }
        }
    }

    private static void k(boolean z10, int i10, int i11) {
        int floor;
        if (i11 >= 2) {
            double d10 = i10;
            if (Math.pow(d10, i11) >= 1000000.0d) {
                if (z10 || i11 <= (floor = ((int) Math.floor(Math.log(f21215b) / Math.log(d10))) * 2)) {
                    return;
                }
                throw new IllegalArgumentException("maximum input length is " + floor);
            }
        }
        throw new IllegalArgumentException("input too short");
    }

    static short[] l(e eVar, int i10, byte[] bArr, int i11, int i12, int i13, short[] sArr, short[] sArr2) {
        int length = bArr.length;
        int ceil = (((int) Math.ceil((Math.log(i10) * i13) / f21214a)) + 7) / 8;
        int i14 = (((ceil + 3) / 4) * 4) + 4;
        byte[] b10 = b(i10, (byte) i12, i11, length);
        BigInteger valueOf = BigInteger.valueOf(i10);
        BigInteger[] a10 = a(valueOf, i12, i13);
        short[] sArr3 = sArr;
        short[] sArr4 = sArr2;
        int i15 = i12;
        int i16 = 9;
        while (i16 >= 0) {
            short[] sArr5 = sArr4;
            sArr4 = sArr3;
            i15 = i11 - i15;
            I(valueOf, D(valueOf, sArr5).subtract(d(eVar, valueOf, bArr, ceil, i14, i16, b10, sArr4)).mod(a10[i16 & 1]), i15, sArr5, 0);
            i16--;
            sArr3 = sArr5;
        }
        return ak.a.s(sArr3, sArr4);
    }

    private static short[] m(e eVar, int i10, byte[] bArr, int i11, int i12, int i13, short[] sArr, short[] sArr2) {
        BigInteger valueOf = BigInteger.valueOf(i10);
        int i14 = i13;
        BigInteger[] a10 = a(valueOf, i12, i14);
        H(sArr);
        H(sArr2);
        short[] sArr3 = sArr;
        short[] sArr4 = sArr2;
        int i15 = 7;
        while (i15 >= 0) {
            int i16 = i11 - i14;
            int i17 = i15 & 1;
            I(valueOf, D(valueOf, sArr4).subtract(e(eVar, valueOf, bArr, 4 - (i17 * 4), i15, sArr3)).mod(a10[1 - i17]), i16, sArr4, 0);
            i15--;
            i14 = i16;
            short[] sArr5 = sArr4;
            sArr4 = sArr3;
            sArr3 = sArr5;
        }
        H(sArr3);
        H(sArr4);
        return ak.a.s(sArr3, sArr4);
    }

    public static byte[] n(e eVar, int i10, byte[] bArr, byte[] bArr2, int i11, int i12) {
        f(eVar, true, i10, bArr2, i11, i12);
        int i13 = i12 / 2;
        int i14 = i12 - i13;
        return J(l(eVar, i10, bArr, i12, i13, i14, K(bArr2, i11, i13), K(bArr2, i11 + i13, i14)));
    }

    public static short[] o(e eVar, int i10, byte[] bArr, short[] sArr, int i11, int i12) {
        g(eVar, true, i10, sArr, i11, i12);
        int i13 = i12 / 2;
        int i14 = i12 - i13;
        short[] sArr2 = new short[i13];
        short[] sArr3 = new short[i14];
        System.arraycopy(sArr, i11, sArr2, 0, i13);
        System.arraycopy(sArr, i11 + i13, sArr3, 0, i14);
        return l(eVar, i10, bArr, i12, i13, i14, sArr2, sArr3);
    }

    public static byte[] p(e eVar, int i10, byte[] bArr, byte[] bArr2, int i11, int i12) {
        f(eVar, false, i10, bArr2, i11, i12);
        if (bArr.length == 7) {
            return z(eVar, i10, c(bArr), bArr2, i11, i12);
        }
        throw new IllegalArgumentException("tweak should be 56 bits");
    }

    public static short[] q(e eVar, int i10, byte[] bArr, short[] sArr, int i11, int i12) {
        g(eVar, false, i10, sArr, i11, i12);
        if (bArr.length == 7) {
            return A(eVar, i10, c(bArr), sArr, i11, i12);
        }
        throw new IllegalArgumentException("tweak should be 56 bits");
    }

    private static short[] r(e eVar, int i10, byte[] bArr, int i11, int i12, int i13, short[] sArr, short[] sArr2) {
        int length = bArr.length;
        int ceil = (((int) Math.ceil((Math.log(i10) * i13) / f21214a)) + 7) / 8;
        int i14 = (((ceil + 3) / 4) * 4) + 4;
        byte[] b10 = b(i10, (byte) i12, i11, length);
        BigInteger valueOf = BigInteger.valueOf(i10);
        BigInteger[] a10 = a(valueOf, i12, i13);
        short[] sArr3 = sArr;
        short[] sArr4 = sArr2;
        int i15 = i13;
        int i16 = 0;
        while (i16 < 10) {
            int i17 = i16;
            short[] sArr5 = sArr3;
            sArr3 = sArr4;
            BigInteger d10 = d(eVar, valueOf, bArr, ceil, i14, i16, b10, sArr3);
            int i18 = i11 - i15;
            I(valueOf, D(valueOf, sArr5).add(d10).mod(a10[i17 & 1]), i18, sArr5, 0);
            i16 = i17 + 1;
            i15 = i18;
            sArr4 = sArr5;
        }
        return ak.a.s(sArr3, sArr4);
    }

    private static short[] s(e eVar, int i10, byte[] bArr, int i11, int i12, int i13, short[] sArr, short[] sArr2) {
        BigInteger valueOf = BigInteger.valueOf(i10);
        int i14 = i12;
        BigInteger[] a10 = a(valueOf, i14, i13);
        H(sArr);
        H(sArr2);
        short[] sArr3 = sArr;
        short[] sArr4 = sArr2;
        int i15 = 0;
        while (i15 < 8) {
            i14 = i11 - i14;
            int i16 = i15 & 1;
            I(valueOf, D(valueOf, sArr3).add(e(eVar, valueOf, bArr, 4 - (i16 * 4), i15, sArr4)).mod(a10[1 - i16]), i14, sArr3, 0);
            i15++;
            short[] sArr5 = sArr4;
            sArr4 = sArr3;
            sArr3 = sArr5;
        }
        H(sArr3);
        H(sArr4);
        return ak.a.s(sArr3, sArr4);
    }

    public static byte[] t(e eVar, int i10, byte[] bArr, byte[] bArr2, int i11, int i12) {
        f(eVar, true, i10, bArr2, i11, i12);
        int i13 = i12 / 2;
        int i14 = i12 - i13;
        return J(r(eVar, i10, bArr, i12, i13, i14, K(bArr2, i11, i13), K(bArr2, i11 + i13, i14)));
    }

    public static short[] u(e eVar, int i10, byte[] bArr, short[] sArr, int i11, int i12) {
        g(eVar, true, i10, sArr, i11, i12);
        int i13 = i12 / 2;
        int i14 = i12 - i13;
        short[] sArr2 = new short[i13];
        short[] sArr3 = new short[i14];
        System.arraycopy(sArr, i11, sArr2, 0, i13);
        System.arraycopy(sArr, i11 + i13, sArr3, 0, i14);
        return r(eVar, i10, bArr, i12, i13, i14, sArr2, sArr3);
    }

    static byte[] v(e eVar, int i10, byte[] bArr, byte[] bArr2, int i11, int i12) {
        f(eVar, false, i10, bArr2, i11, i12);
        if (bArr.length == 8) {
            return B(eVar, i10, bArr, bArr2, i11, i12);
        }
        throw new IllegalArgumentException();
    }

    public static byte[] w(e eVar, int i10, byte[] bArr, byte[] bArr2, int i11, int i12) {
        f(eVar, false, i10, bArr2, i11, i12);
        if (bArr.length == 7) {
            return v(eVar, i10, c(bArr), bArr2, i11, i12);
        }
        throw new IllegalArgumentException("tweak should be 56 bits");
    }

    public static short[] x(e eVar, int i10, byte[] bArr, short[] sArr, int i11, int i12) {
        g(eVar, false, i10, sArr, i11, i12);
        if (bArr.length == 7) {
            return y(eVar, i10, c(bArr), sArr, i11, i12);
        }
        throw new IllegalArgumentException("tweak should be 56 bits");
    }

    static short[] y(e eVar, int i10, byte[] bArr, short[] sArr, int i11, int i12) {
        g(eVar, false, i10, sArr, i11, i12);
        if (bArr.length == 8) {
            return C(eVar, i10, bArr, sArr, i11, i12);
        }
        throw new IllegalArgumentException();
    }

    protected static byte[] z(e eVar, int i10, byte[] bArr, byte[] bArr2, int i11, int i12) {
        int i13 = i12 / 2;
        int i14 = i12 - i13;
        return J(m(eVar, i10, bArr, i12, i13, i14, K(bArr2, i11, i14), K(bArr2, i11 + i14, i13)));
    }
}
