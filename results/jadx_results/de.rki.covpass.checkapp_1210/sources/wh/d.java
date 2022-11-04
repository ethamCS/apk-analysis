package wh;

import ak.h;
import ak.l;
/* loaded from: classes3.dex */
public abstract class d {
    public static byte a(byte[] bArr, byte[] bArr2) {
        int i10 = 0;
        for (int i11 = 0; i11 < 16; i11++) {
            i10 |= bArr[i11] ^ bArr2[i11];
        }
        return (byte) ((((i10 >>> 1) | (i10 & 1)) - 1) >> 31);
    }

    public static void b(long[] jArr, byte[] bArr) {
        l.t(jArr, 0, 2, bArr, 0);
    }

    public static void c(byte[] bArr, long[] jArr) {
        l.d(bArr, 0, jArr, 0, 2);
    }

    public static long[] d(byte[] bArr) {
        long[] jArr = new long[2];
        l.d(bArr, 0, jArr, 0, 2);
        return jArr;
    }

    public static void e(byte[] bArr, byte[] bArr2) {
        for (int i10 = 0; i10 < 16; i10++) {
            bArr2[i10] = bArr[i10];
        }
    }

    public static void f(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
    }

    public static void g(long[] jArr, long[] jArr2) {
        long j10 = jArr[0];
        long j11 = jArr[1];
        long j12 = j10 >> 63;
        jArr2[0] = ((j10 ^ ((-2233785415175766016L) & j12)) << 1) | (j11 >>> 63);
        jArr2[1] = (j11 << 1) | (-j12);
    }

    private static long h(long j10, long j11) {
        long j12 = j10 & 1229782938247303441L;
        long j13 = j10 & 2459565876494606882L;
        long j14 = j10 & 4919131752989213764L;
        long j15 = j10 & (-8608480567731124088L);
        long j16 = j11 & 1229782938247303441L;
        long j17 = j11 & 2459565876494606882L;
        long j18 = j11 & 4919131752989213764L;
        long j19 = j11 & (-8608480567731124088L);
        return (((((j12 * j16) ^ (j13 * j19)) ^ (j14 * j18)) ^ (j15 * j17)) & 1229782938247303441L) | (((((j12 * j17) ^ (j13 * j16)) ^ (j14 * j19)) ^ (j15 * j18)) & 2459565876494606882L) | (((((j12 * j18) ^ (j13 * j17)) ^ (j14 * j16)) ^ (j15 * j19)) & 4919131752989213764L) | (((((j12 * j19) ^ (j13 * j18)) ^ (j14 * j17)) ^ (j15 * j16)) & (-8608480567731124088L));
    }

    public static void i(byte[] bArr, byte[] bArr2) {
        long[] d10 = d(bArr);
        j(d10, d(bArr2));
        b(d10, bArr);
    }

    public static void j(long[] jArr, long[] jArr2) {
        long j10 = jArr[0];
        long j11 = jArr[1];
        long j12 = jArr2[0];
        long j13 = jArr2[1];
        long a10 = h.a(j10);
        long a11 = h.a(j11);
        long a12 = h.a(j12);
        long a13 = h.a(j13);
        long a14 = h.a(h(a10, a12));
        long h10 = h(j10, j12) << 1;
        long a15 = h.a(h(a11, a13));
        long h11 = h(j11, j13) << 1;
        long h12 = ((h(j10 ^ j11, j12 ^ j13) << 1) ^ ((a15 ^ h10) ^ h11)) ^ ((h11 << 62) ^ (h11 << 57));
        long j14 = h12 >>> 7;
        long j15 = (h12 << 57) ^ ((h12 << 63) ^ (h12 << 62));
        jArr[0] = a14 ^ (j14 ^ ((h12 ^ (h12 >>> 1)) ^ (h12 >>> 2)));
        jArr[1] = j15 ^ ((h.a(h(a10 ^ a11, a12 ^ a13)) ^ ((h10 ^ a14) ^ a15)) ^ (((h11 ^ (h11 >>> 1)) ^ (h11 >>> 2)) ^ (h11 >>> 7)));
    }

    public static void k(long[] jArr, long[] jArr2) {
        long j10 = jArr[0];
        long j11 = jArr[1];
        long j12 = j11 << 57;
        jArr2[0] = (j12 >>> 7) ^ ((((j10 >>> 7) ^ j12) ^ (j12 >>> 1)) ^ (j12 >>> 2));
        jArr2[1] = (j10 << 57) | (j11 >>> 7);
    }

    public static long[] l() {
        return new long[]{Long.MIN_VALUE};
    }

    public static void m(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[4];
        bj.b.d(jArr[0], jArr3, 0);
        bj.b.d(jArr[1], jArr3, 2);
        long j10 = jArr3[0];
        long j11 = jArr3[1];
        long j12 = jArr3[2];
        long j13 = jArr3[3];
        long j14 = j12 ^ ((j13 << 57) ^ ((j13 << 63) ^ (j13 << 62)));
        long j15 = j10 ^ ((((j14 >>> 1) ^ j14) ^ (j14 >>> 2)) ^ (j14 >>> 7));
        jArr2[0] = j15;
        jArr2[1] = (j11 ^ ((((j13 >>> 1) ^ j13) ^ (j13 >>> 2)) ^ (j13 >>> 7))) ^ ((j14 << 57) ^ ((j14 << 63) ^ (j14 << 62)));
    }

    public static void n(byte[] bArr, int i10, byte[] bArr2, int i11, int i12) {
        while (true) {
            i12--;
            if (i12 >= 0) {
                int i13 = i10 + i12;
                bArr[i13] = (byte) (bArr[i13] ^ bArr2[i11 + i12]);
            } else {
                return;
            }
        }
    }

    public static void o(byte[] bArr, int i10, byte[] bArr2, int i11, byte[] bArr3, int i12) {
        int i13 = 0;
        do {
            bArr3[i12 + i13] = (byte) (bArr[i10 + i13] ^ bArr2[i11 + i13]);
            int i14 = i13 + 1;
            bArr3[i12 + i14] = (byte) (bArr[i10 + i14] ^ bArr2[i11 + i14]);
            int i15 = i14 + 1;
            bArr3[i12 + i15] = (byte) (bArr[i10 + i15] ^ bArr2[i11 + i15]);
            int i16 = i15 + 1;
            bArr3[i12 + i16] = (byte) (bArr[i10 + i16] ^ bArr2[i11 + i16]);
            i13 = i16 + 1;
        } while (i13 < 16);
    }

    public static void p(byte[] bArr, byte[] bArr2) {
        int i10 = 0;
        do {
            bArr[i10] = (byte) (bArr[i10] ^ bArr2[i10]);
            int i11 = i10 + 1;
            bArr[i11] = (byte) (bArr[i11] ^ bArr2[i11]);
            int i12 = i11 + 1;
            bArr[i12] = (byte) (bArr[i12] ^ bArr2[i12]);
            int i13 = i12 + 1;
            bArr[i13] = (byte) (bArr[i13] ^ bArr2[i13]);
            i10 = i13 + 1;
        } while (i10 < 16);
    }

    public static void q(byte[] bArr, byte[] bArr2, int i10) {
        int i11 = 0;
        do {
            bArr[i11] = (byte) (bArr[i11] ^ bArr2[i10 + i11]);
            int i12 = i11 + 1;
            bArr[i12] = (byte) (bArr[i12] ^ bArr2[i10 + i12]);
            int i13 = i12 + 1;
            bArr[i13] = (byte) (bArr[i13] ^ bArr2[i10 + i13]);
            int i14 = i13 + 1;
            bArr[i14] = (byte) (bArr[i14] ^ bArr2[i10 + i14]);
            i11 = i14 + 1;
        } while (i11 < 16);
    }

    public static void r(byte[] bArr, byte[] bArr2, int i10, int i11) {
        while (true) {
            i11--;
            if (i11 >= 0) {
                bArr[i11] = (byte) (bArr[i11] ^ bArr2[i10 + i11]);
            } else {
                return;
            }
        }
    }

    public static void s(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr2[1] ^ jArr[1];
    }
}
