package wi;

import java.math.BigInteger;
/* loaded from: classes3.dex */
public class k2 {
    public static void a(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr2[6] ^ jArr[6];
    }

    public static void b(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i10 = 0; i10 < 13; i10++) {
            jArr3[i10] = jArr[i10] ^ jArr2[i10];
        }
    }

    public static void c(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
        jArr2[4] = jArr[4];
        jArr2[5] = jArr[5];
        jArr2[6] = jArr[6];
    }

    private static void d(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr2[0] ^ jArr[0];
        jArr2[1] = jArr2[1] ^ jArr[1];
        jArr2[2] = jArr2[2] ^ jArr[2];
        jArr2[3] = jArr2[3] ^ jArr[3];
        jArr2[4] = jArr2[4] ^ jArr[4];
        jArr2[5] = jArr2[5] ^ jArr[5];
        jArr2[6] = jArr2[6] ^ jArr[6];
    }

    public static long[] e(BigInteger bigInteger) {
        return bj.n.s(409, bigInteger);
    }

    public static void f(long[] jArr, long[] jArr2) {
        long[] l10 = bj.n.l(13);
        bj.k.b(jArr, jArr2);
        for (int i10 = 1; i10 < 409; i10 += 2) {
            k(jArr2, l10);
            o(l10, jArr2);
            k(jArr2, l10);
            o(l10, jArr2);
            d(jArr, jArr2);
        }
    }

    protected static void g(long[] jArr) {
        long j10 = jArr[0];
        long j11 = jArr[1];
        long j12 = jArr[2];
        long j13 = jArr[3];
        long j14 = jArr[4];
        long j15 = jArr[5];
        long j16 = jArr[6];
        long j17 = jArr[7];
        long j18 = jArr[8];
        long j19 = jArr[9];
        long j20 = jArr[10];
        long j21 = jArr[11];
        long j22 = jArr[12];
        long j23 = jArr[13];
        jArr[0] = j10 ^ (j11 << 59);
        jArr[1] = (j11 >>> 5) ^ (j12 << 54);
        jArr[2] = (j12 >>> 10) ^ (j13 << 49);
        jArr[3] = (j13 >>> 15) ^ (j14 << 44);
        jArr[4] = (j14 >>> 20) ^ (j15 << 39);
        jArr[5] = (j15 >>> 25) ^ (j16 << 34);
        jArr[6] = (j16 >>> 30) ^ (j17 << 29);
        jArr[7] = (j17 >>> 35) ^ (j18 << 24);
        jArr[8] = (j18 >>> 40) ^ (j19 << 19);
        jArr[9] = (j19 >>> 45) ^ (j20 << 14);
        jArr[10] = (j20 >>> 50) ^ (j21 << 9);
        jArr[11] = ((j21 >>> 55) ^ (j22 << 4)) ^ (j23 << 63);
        jArr[12] = j23 >>> 1;
    }

    protected static void h(long[] jArr, long[] jArr2) {
        long j10 = jArr[0];
        long j11 = jArr[1];
        long j12 = jArr[2];
        long j13 = jArr[3];
        long j14 = jArr[4];
        long j15 = jArr[5];
        long j16 = jArr[6];
        jArr2[0] = j10 & 576460752303423487L;
        jArr2[1] = ((j10 >>> 59) ^ (j11 << 5)) & 576460752303423487L;
        jArr2[2] = ((j11 >>> 54) ^ (j12 << 10)) & 576460752303423487L;
        jArr2[3] = ((j12 >>> 49) ^ (j13 << 15)) & 576460752303423487L;
        jArr2[4] = ((j13 >>> 44) ^ (j14 << 20)) & 576460752303423487L;
        jArr2[5] = ((j14 >>> 39) ^ (j15 << 25)) & 576460752303423487L;
        jArr2[6] = (j15 >>> 34) ^ (j16 << 30);
    }

    protected static void i(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[7];
        long[] jArr5 = new long[7];
        h(jArr, jArr4);
        h(jArr2, jArr5);
        long[] jArr6 = new long[8];
        for (int i10 = 0; i10 < 7; i10++) {
            j(jArr6, jArr4[i10], jArr5[i10], jArr3, i10 << 1);
        }
        long j10 = jArr3[0];
        long j11 = jArr3[1];
        long j12 = j10 ^ jArr3[2];
        jArr3[1] = j12 ^ j11;
        long j13 = j11 ^ jArr3[3];
        long j14 = j12 ^ jArr3[4];
        jArr3[2] = j14 ^ j13;
        long j15 = j13 ^ jArr3[5];
        long j16 = j14 ^ jArr3[6];
        jArr3[3] = j16 ^ j15;
        long j17 = j15 ^ jArr3[7];
        long j18 = j16 ^ jArr3[8];
        jArr3[4] = j18 ^ j17;
        long j19 = j17 ^ jArr3[9];
        long j20 = j18 ^ jArr3[10];
        jArr3[5] = j20 ^ j19;
        long j21 = j19 ^ jArr3[11];
        long j22 = j20 ^ jArr3[12];
        jArr3[6] = j22 ^ j21;
        long j23 = j22 ^ (j21 ^ jArr3[13]);
        jArr3[7] = jArr3[0] ^ j23;
        jArr3[8] = jArr3[1] ^ j23;
        jArr3[9] = jArr3[2] ^ j23;
        jArr3[10] = jArr3[3] ^ j23;
        jArr3[11] = jArr3[4] ^ j23;
        jArr3[12] = jArr3[5] ^ j23;
        jArr3[13] = j23 ^ jArr3[6];
        j(jArr6, jArr4[0] ^ jArr4[1], jArr5[0] ^ jArr5[1], jArr3, 1);
        j(jArr6, jArr4[0] ^ jArr4[2], jArr5[0] ^ jArr5[2], jArr3, 2);
        j(jArr6, jArr4[0] ^ jArr4[3], jArr5[0] ^ jArr5[3], jArr3, 3);
        j(jArr6, jArr4[1] ^ jArr4[2], jArr5[1] ^ jArr5[2], jArr3, 3);
        j(jArr6, jArr4[0] ^ jArr4[4], jArr5[0] ^ jArr5[4], jArr3, 4);
        j(jArr6, jArr4[1] ^ jArr4[3], jArr5[1] ^ jArr5[3], jArr3, 4);
        j(jArr6, jArr4[0] ^ jArr4[5], jArr5[0] ^ jArr5[5], jArr3, 5);
        j(jArr6, jArr4[1] ^ jArr4[4], jArr5[1] ^ jArr5[4], jArr3, 5);
        j(jArr6, jArr4[2] ^ jArr4[3], jArr5[2] ^ jArr5[3], jArr3, 5);
        j(jArr6, jArr4[0] ^ jArr4[6], jArr5[0] ^ jArr5[6], jArr3, 6);
        j(jArr6, jArr4[1] ^ jArr4[5], jArr5[1] ^ jArr5[5], jArr3, 6);
        j(jArr6, jArr4[2] ^ jArr4[4], jArr5[2] ^ jArr5[4], jArr3, 6);
        j(jArr6, jArr4[1] ^ jArr4[6], jArr5[1] ^ jArr5[6], jArr3, 7);
        j(jArr6, jArr4[2] ^ jArr4[5], jArr5[2] ^ jArr5[5], jArr3, 7);
        j(jArr6, jArr4[3] ^ jArr4[4], jArr5[3] ^ jArr5[4], jArr3, 7);
        j(jArr6, jArr4[2] ^ jArr4[6], jArr5[2] ^ jArr5[6], jArr3, 8);
        j(jArr6, jArr4[3] ^ jArr4[5], jArr5[3] ^ jArr5[5], jArr3, 8);
        j(jArr6, jArr4[3] ^ jArr4[6], jArr5[3] ^ jArr5[6], jArr3, 9);
        j(jArr6, jArr4[4] ^ jArr4[5], jArr5[4] ^ jArr5[5], jArr3, 9);
        j(jArr6, jArr4[4] ^ jArr4[6], jArr5[4] ^ jArr5[6], jArr3, 10);
        j(jArr6, jArr4[5] ^ jArr4[6], jArr5[5] ^ jArr5[6], jArr3, 11);
        g(jArr3);
    }

    protected static void j(long[] jArr, long j10, long j11, long[] jArr2, int i10) {
        jArr[1] = j11;
        jArr[2] = jArr[1] << 1;
        jArr[3] = jArr[2] ^ j11;
        jArr[4] = jArr[2] << 1;
        jArr[5] = jArr[4] ^ j11;
        jArr[6] = jArr[3] << 1;
        jArr[7] = jArr[6] ^ j11;
        int i11 = (int) j10;
        long j12 = (jArr[(i11 >>> 3) & 7] << 3) ^ jArr[i11 & 7];
        long j13 = 0;
        int i12 = 54;
        do {
            int i13 = (int) (j10 >>> i12);
            long j14 = jArr[i13 & 7] ^ (jArr[(i13 >>> 3) & 7] << 3);
            j12 ^= j14 << i12;
            j13 ^= j14 >>> (-i12);
            i12 -= 6;
        } while (i12 > 0);
        jArr2[i10] = jArr2[i10] ^ (576460752303423487L & j12);
        int i14 = i10 + 1;
        jArr2[i14] = jArr2[i14] ^ ((j12 >>> 59) ^ (j13 << 5));
    }

    protected static void k(long[] jArr, long[] jArr2) {
        bj.b.c(jArr, 0, 6, jArr2, 0);
        jArr2[12] = bj.b.a((int) jArr[6]);
    }

    public static void l(long[] jArr, long[] jArr2) {
        if (!bj.k.g(jArr)) {
            long[] c10 = bj.k.c();
            long[] c11 = bj.k.c();
            long[] c12 = bj.k.c();
            q(jArr, c10);
            s(c10, 1, c11);
            m(c10, c11, c10);
            s(c11, 1, c11);
            m(c10, c11, c10);
            s(c10, 3, c11);
            m(c10, c11, c10);
            s(c10, 6, c11);
            m(c10, c11, c10);
            s(c10, 12, c11);
            m(c10, c11, c12);
            s(c12, 24, c10);
            s(c10, 24, c11);
            m(c10, c11, c10);
            s(c10, 48, c11);
            m(c10, c11, c10);
            s(c10, 96, c11);
            m(c10, c11, c10);
            s(c10, 192, c11);
            m(c10, c11, c10);
            m(c10, c12, jArr2);
            return;
        }
        throw new IllegalStateException();
    }

    public static void m(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] d10 = bj.k.d();
        i(jArr, jArr2, d10);
        o(d10, jArr3);
    }

    public static void n(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] d10 = bj.k.d();
        i(jArr, jArr2, d10);
        b(jArr3, d10, jArr3);
    }

    public static void o(long[] jArr, long[] jArr2) {
        long j10 = jArr[0];
        long j11 = jArr[1];
        long j12 = jArr[2];
        long j13 = jArr[3];
        long j14 = jArr[4];
        long j15 = jArr[5];
        long j16 = jArr[6];
        long j17 = jArr[7];
        long j18 = jArr[12];
        long j19 = j16 ^ ((j18 >>> 25) ^ (j18 << 62));
        long j20 = j17 ^ (j18 >>> 2);
        long j21 = jArr[11];
        long j22 = j14 ^ (j21 << 39);
        long j23 = (j15 ^ (j18 << 39)) ^ ((j21 >>> 25) ^ (j21 << 62));
        long j24 = j19 ^ (j21 >>> 2);
        long j25 = jArr[10];
        long j26 = j13 ^ (j25 << 39);
        long j27 = j22 ^ ((j25 >>> 25) ^ (j25 << 62));
        long j28 = j23 ^ (j25 >>> 2);
        long j29 = jArr[9];
        long j30 = j12 ^ (j29 << 39);
        long j31 = j26 ^ ((j29 >>> 25) ^ (j29 << 62));
        long j32 = j27 ^ (j29 >>> 2);
        long j33 = jArr[8];
        long j34 = j10 ^ (j20 << 39);
        long j35 = (j30 ^ ((j33 >>> 25) ^ (j33 << 62))) ^ (j20 >>> 2);
        long j36 = j24 >>> 25;
        jArr2[0] = j34 ^ j36;
        long j37 = j36 << 23;
        jArr2[1] = j37 ^ ((j11 ^ (j33 << 39)) ^ ((j20 >>> 25) ^ (j20 << 62)));
        jArr2[2] = j35;
        jArr2[3] = j31 ^ (j33 >>> 2);
        jArr2[4] = j32;
        jArr2[5] = j28;
        jArr2[6] = j24 & 33554431;
    }

    public static void p(long[] jArr, long[] jArr2) {
        long g10 = bj.b.g(jArr[0]);
        long g11 = bj.b.g(jArr[1]);
        long j10 = (g10 & 4294967295L) | (g11 << 32);
        long j11 = (g10 >>> 32) | (g11 & (-4294967296L));
        long g12 = bj.b.g(jArr[2]);
        long g13 = bj.b.g(jArr[3]);
        long j12 = (g12 & 4294967295L) | (g13 << 32);
        long j13 = (g12 >>> 32) | (g13 & (-4294967296L));
        long g14 = bj.b.g(jArr[4]);
        long g15 = bj.b.g(jArr[5]);
        long j14 = (g14 >>> 32) | (g15 & (-4294967296L));
        long g16 = bj.b.g(jArr[6]);
        long j15 = g16 & 4294967295L;
        long j16 = g16 >>> 32;
        jArr2[0] = j10 ^ (j11 << 44);
        jArr2[1] = (j12 ^ (j13 << 44)) ^ (j11 >>> 20);
        jArr2[2] = (((g14 & 4294967295L) | (g15 << 32)) ^ (j14 << 44)) ^ (j13 >>> 20);
        jArr2[3] = (((j16 << 44) ^ j15) ^ (j14 >>> 20)) ^ (j11 << 13);
        jArr2[4] = (j11 >>> 51) ^ ((j16 >>> 20) ^ (j13 << 13));
        jArr2[5] = (j14 << 13) ^ (j13 >>> 51);
        jArr2[6] = (j16 << 13) ^ (j14 >>> 51);
    }

    public static void q(long[] jArr, long[] jArr2) {
        long[] l10 = bj.n.l(13);
        k(jArr, l10);
        o(l10, jArr2);
    }

    public static void r(long[] jArr, long[] jArr2) {
        long[] l10 = bj.n.l(13);
        k(jArr, l10);
        b(jArr2, l10, jArr2);
    }

    public static void s(long[] jArr, int i10, long[] jArr2) {
        long[] l10 = bj.n.l(13);
        k(jArr, l10);
        while (true) {
            o(l10, jArr2);
            i10--;
            if (i10 > 0) {
                k(jArr2, l10);
            } else {
                return;
            }
        }
    }

    public static int t(long[] jArr) {
        return ((int) jArr[0]) & 1;
    }
}
