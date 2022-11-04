package ak;
/* loaded from: classes3.dex */
public abstract class l {
    public static void A(short s10, byte[] bArr, int i10) {
        bArr[i10] = (byte) (s10 >>> 8);
        bArr[i10 + 1] = (byte) s10;
    }

    public static void B(short s10, byte[] bArr, int i10) {
        bArr[i10] = (byte) s10;
        bArr[i10 + 1] = (byte) (s10 >>> 8);
    }

    public static int a(byte[] bArr, int i10) {
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        return (bArr[i12 + 1] & 255) | (bArr[i10] << 24) | ((bArr[i11] & 255) << 16) | ((bArr[i12] & 255) << 8);
    }

    public static void b(byte[] bArr, int i10, int[] iArr, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            iArr[i11 + i13] = a(bArr, i10);
            i10 += 4;
        }
    }

    public static long c(byte[] bArr, int i10) {
        int a10 = a(bArr, i10);
        return (a(bArr, i10 + 4) & 4294967295L) | ((a10 & 4294967295L) << 32);
    }

    public static void d(byte[] bArr, int i10, long[] jArr, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            jArr[i11 + i13] = c(bArr, i10);
            i10 += 8;
        }
    }

    public static short e(byte[] bArr, int i10) {
        return (short) ((bArr[i10 + 1] & 255) | ((bArr[i10] & 255) << 8));
    }

    public static void f(int i10, byte[] bArr, int i11) {
        bArr[i11] = (byte) (i10 >>> 24);
        int i12 = i11 + 1;
        bArr[i12] = (byte) (i10 >>> 16);
        int i13 = i12 + 1;
        bArr[i13] = (byte) (i10 >>> 8);
        bArr[i13 + 1] = (byte) i10;
    }

    public static void g(int[] iArr, byte[] bArr, int i10) {
        for (int i11 : iArr) {
            f(i11, bArr, i10);
            i10 += 4;
        }
    }

    public static byte[] h(int i10) {
        byte[] bArr = new byte[4];
        f(i10, bArr, 0);
        return bArr;
    }

    public static void i(int i10, byte[] bArr, int i11) {
        bArr[i11] = (byte) i10;
        int i12 = i11 + 1;
        bArr[i12] = (byte) (i10 >>> 8);
        int i13 = i12 + 1;
        bArr[i13] = (byte) (i10 >>> 16);
        bArr[i13 + 1] = (byte) (i10 >>> 24);
    }

    public static void j(int[] iArr, byte[] bArr, int i10) {
        for (int i11 : iArr) {
            i(i11, bArr, i10);
            i10 += 4;
        }
    }

    public static byte[] k(int i10) {
        byte[] bArr = new byte[4];
        i(i10, bArr, 0);
        return bArr;
    }

    public static int l(byte[] bArr, int i10) {
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        return (bArr[i12 + 1] << 24) | (bArr[i10] & 255) | ((bArr[i11] & 255) << 8) | ((bArr[i12] & 255) << 16);
    }

    public static void m(byte[] bArr, int i10, int[] iArr) {
        for (int i11 = 0; i11 < iArr.length; i11++) {
            iArr[i11] = l(bArr, i10);
            i10 += 4;
        }
    }

    public static void n(byte[] bArr, int i10, int[] iArr, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            iArr[i11 + i13] = l(bArr, i10);
            i10 += 4;
        }
    }

    public static int[] o(byte[] bArr, int i10, int i11) {
        int[] iArr = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            iArr[i12] = l(bArr, i10);
            i10 += 4;
        }
        return iArr;
    }

    public static long p(byte[] bArr, int i10) {
        return ((l(bArr, i10 + 4) & 4294967295L) << 32) | (l(bArr, i10) & 4294967295L);
    }

    public static void q(byte[] bArr, int i10, long[] jArr) {
        for (int i11 = 0; i11 < jArr.length; i11++) {
            jArr[i11] = p(bArr, i10);
            i10 += 8;
        }
    }

    public static short r(byte[] bArr, int i10) {
        return (short) (((bArr[i10 + 1] & 255) << 8) | (bArr[i10] & 255));
    }

    public static void s(long j10, byte[] bArr, int i10) {
        f((int) (j10 >>> 32), bArr, i10);
        f((int) (j10 & 4294967295L), bArr, i10 + 4);
    }

    public static void t(long[] jArr, int i10, int i11, byte[] bArr, int i12) {
        for (int i13 = 0; i13 < i11; i13++) {
            s(jArr[i10 + i13], bArr, i12);
            i12 += 8;
        }
    }

    public static byte[] u(long j10) {
        byte[] bArr = new byte[8];
        s(j10, bArr, 0);
        return bArr;
    }

    public static void v(long j10, byte[] bArr, int i10) {
        i((int) (4294967295L & j10), bArr, i10);
        i((int) (j10 >>> 32), bArr, i10 + 4);
    }

    public static void w(long[] jArr, int i10, int i11, byte[] bArr, int i12) {
        for (int i13 = 0; i13 < i11; i13++) {
            v(jArr[i10 + i13], bArr, i12);
            i12 += 8;
        }
    }

    public static void x(long[] jArr, byte[] bArr, int i10) {
        for (long j10 : jArr) {
            v(j10, bArr, i10);
            i10 += 8;
        }
    }

    public static byte[] y(long j10) {
        byte[] bArr = new byte[8];
        v(j10, bArr, 0);
        return bArr;
    }

    public static byte[] z(long[] jArr) {
        byte[] bArr = new byte[jArr.length * 8];
        x(jArr, bArr, 0);
        return bArr;
    }
}
