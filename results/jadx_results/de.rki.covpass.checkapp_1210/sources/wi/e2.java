package wi;

import java.math.BigInteger;
/* loaded from: classes3.dex */
public class e2 {

    /* renamed from: a */
    private static final long[] f25140a = {878416384462358536L, 3513665537849438403L, -9076969306111048948L, 585610922974906400L, 34087042};

    public static void a(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr2[4] ^ jArr[4];
    }

    public static void b(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr[6] ^ jArr2[6];
        jArr3[7] = jArr[7] ^ jArr2[7];
        jArr3[8] = jArr2[8] ^ jArr[8];
    }

    public static void c(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
        jArr2[4] = jArr[4];
    }

    private static void d(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr2[0] ^ jArr[0];
        jArr2[1] = jArr2[1] ^ jArr[1];
        jArr2[2] = jArr2[2] ^ jArr[2];
        jArr2[3] = jArr2[3] ^ jArr[3];
        jArr2[4] = jArr2[4] ^ jArr[4];
    }

    public static long[] e(BigInteger bigInteger) {
        return bj.n.s(283, bigInteger);
    }

    public static void f(long[] jArr, long[] jArr2) {
        long[] l10 = bj.n.l(9);
        bj.i.b(jArr, jArr2);
        for (int i10 = 1; i10 < 283; i10 += 2) {
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
        jArr[0] = j10 ^ (j11 << 57);
        jArr[1] = (j11 >>> 7) ^ (j12 << 50);
        jArr[2] = (j12 >>> 14) ^ (j13 << 43);
        jArr[3] = (j13 >>> 21) ^ (j14 << 36);
        jArr[4] = (j14 >>> 28) ^ (j15 << 29);
        jArr[5] = (j15 >>> 35) ^ (j16 << 22);
        jArr[6] = (j16 >>> 42) ^ (j17 << 15);
        jArr[7] = (j17 >>> 49) ^ (j18 << 8);
        jArr[8] = (j18 >>> 56) ^ (j19 << 1);
        jArr[9] = j19 >>> 63;
    }

    protected static void h(long[] jArr, long[] jArr2) {
        long j10 = jArr[0];
        long j11 = jArr[1];
        long j12 = jArr[2];
        long j13 = jArr[3];
        long j14 = jArr[4];
        jArr2[0] = j10 & 144115188075855871L;
        jArr2[1] = ((j10 >>> 57) ^ (j11 << 7)) & 144115188075855871L;
        jArr2[2] = ((j11 >>> 50) ^ (j12 << 14)) & 144115188075855871L;
        jArr2[3] = ((j12 >>> 43) ^ (j13 << 21)) & 144115188075855871L;
        jArr2[4] = (j13 >>> 36) ^ (j14 << 28);
    }

    protected static void i(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[5];
        long[] jArr5 = new long[5];
        h(jArr, jArr4);
        h(jArr2, jArr5);
        long[] jArr6 = new long[26];
        j(jArr3, jArr4[0], jArr5[0], jArr6, 0);
        j(jArr3, jArr4[1], jArr5[1], jArr6, 2);
        j(jArr3, jArr4[2], jArr5[2], jArr6, 4);
        j(jArr3, jArr4[3], jArr5[3], jArr6, 6);
        j(jArr3, jArr4[4], jArr5[4], jArr6, 8);
        long j10 = jArr4[0] ^ jArr4[1];
        long j11 = jArr5[0] ^ jArr5[1];
        long j12 = jArr4[0] ^ jArr4[2];
        long j13 = jArr5[0] ^ jArr5[2];
        long j14 = jArr4[2] ^ jArr4[4];
        long j15 = jArr5[2] ^ jArr5[4];
        long j16 = jArr4[3] ^ jArr4[4];
        long j17 = jArr5[3] ^ jArr5[4];
        j(jArr3, j12 ^ jArr4[3], j13 ^ jArr5[3], jArr6, 18);
        j(jArr3, j14 ^ jArr4[1], j15 ^ jArr5[1], jArr6, 20);
        long j18 = j10 ^ j16;
        long j19 = j11 ^ j17;
        j(jArr3, j18, j19, jArr6, 22);
        j(jArr3, j18 ^ jArr4[2], j19 ^ jArr5[2], jArr6, 24);
        j(jArr3, j10, j11, jArr6, 10);
        j(jArr3, j12, j13, jArr6, 12);
        j(jArr3, j14, j15, jArr6, 14);
        j(jArr3, j16, j17, jArr6, 16);
        jArr3[0] = jArr6[0];
        jArr3[9] = jArr6[9];
        long j20 = jArr6[0] ^ jArr6[1];
        long j21 = jArr6[2] ^ j20;
        long j22 = jArr6[10] ^ j21;
        jArr3[1] = j22;
        long j23 = jArr6[3] ^ jArr6[4];
        long j24 = j21 ^ (j23 ^ (jArr6[11] ^ jArr6[12]));
        jArr3[2] = j24;
        long j25 = j20 ^ j23;
        long j26 = jArr6[5] ^ jArr6[6];
        long j27 = (j25 ^ j26) ^ jArr6[8];
        long j28 = jArr6[13] ^ jArr6[14];
        jArr3[3] = (j27 ^ j28) ^ ((jArr6[18] ^ jArr6[22]) ^ jArr6[24]);
        long j29 = (jArr6[7] ^ jArr6[8]) ^ jArr6[9];
        long j30 = j29 ^ jArr6[17];
        jArr3[8] = j30;
        long j31 = (j29 ^ j26) ^ (jArr6[15] ^ jArr6[16]);
        jArr3[7] = j31;
        long j32 = j22 ^ j31;
        long j33 = (jArr6[19] ^ jArr6[20]) ^ (jArr6[25] ^ jArr6[24]);
        jArr3[4] = (j33 ^ (jArr6[18] ^ jArr6[23])) ^ j32;
        jArr3[5] = ((j24 ^ j30) ^ j33) ^ (jArr6[21] ^ jArr6[22]);
        jArr3[6] = (((((j27 ^ jArr6[0]) ^ jArr6[9]) ^ j28) ^ jArr6[21]) ^ jArr6[23]) ^ jArr6[25];
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
        long j12 = jArr[((int) j10) & 7];
        long j13 = 0;
        int i11 = 48;
        do {
            int i12 = (int) (j10 >>> i11);
            long j14 = (jArr[i12 & 7] ^ (jArr[(i12 >>> 3) & 7] << 3)) ^ (jArr[(i12 >>> 6) & 7] << 6);
            j12 ^= j14 << i11;
            j13 ^= j14 >>> (-i11);
            i11 -= 9;
        } while (i11 > 0);
        jArr2[i10] = 144115188075855871L & j12;
        jArr2[i10 + 1] = (((((j10 & 72198606942111744L) & ((j11 << 7) >> 63)) >>> 8) ^ j13) << 7) ^ (j12 >>> 57);
    }

    protected static void k(long[] jArr, long[] jArr2) {
        bj.b.c(jArr, 0, 4, jArr2, 0);
        jArr2[8] = bj.b.a((int) jArr[4]);
    }

    public static void l(long[] jArr, long[] jArr2) {
        if (!bj.i.g(jArr)) {
            long[] c10 = bj.i.c();
            long[] c11 = bj.i.c();
            q(jArr, c10);
            m(c10, jArr, c10);
            s(c10, 2, c11);
            m(c11, c10, c11);
            s(c11, 4, c10);
            m(c10, c11, c10);
            s(c10, 8, c11);
            m(c11, c10, c11);
            q(c11, c11);
            m(c11, jArr, c11);
            s(c11, 17, c10);
            m(c10, c11, c10);
            q(c10, c10);
            m(c10, jArr, c10);
            s(c10, 35, c11);
            m(c11, c10, c11);
            s(c11, 70, c10);
            m(c10, c11, c10);
            q(c10, c10);
            m(c10, jArr, c10);
            s(c10, 141, c11);
            m(c11, c10, c11);
            q(c11, jArr2);
            return;
        }
        throw new IllegalStateException();
    }

    public static void m(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] d10 = bj.i.d();
        i(jArr, jArr2, d10);
        o(d10, jArr3);
    }

    public static void n(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] d10 = bj.i.d();
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
        long j18 = jArr[8];
        long j19 = j14 ^ ((((j18 >>> 27) ^ (j18 >>> 22)) ^ (j18 >>> 20)) ^ (j18 >>> 15));
        long j20 = j10 ^ ((((j15 << 37) ^ (j15 << 42)) ^ (j15 << 44)) ^ (j15 << 49));
        long j21 = (j11 ^ ((((j16 << 37) ^ (j16 << 42)) ^ (j16 << 44)) ^ (j16 << 49))) ^ ((((j15 >>> 27) ^ (j15 >>> 22)) ^ (j15 >>> 20)) ^ (j15 >>> 15));
        long j22 = j19 >>> 27;
        jArr2[0] = (((j20 ^ j22) ^ (j22 << 5)) ^ (j22 << 7)) ^ (j22 << 12);
        jArr2[1] = j21;
        jArr2[2] = (j12 ^ ((((j17 << 37) ^ (j17 << 42)) ^ (j17 << 44)) ^ (j17 << 49))) ^ ((((j16 >>> 27) ^ (j16 >>> 22)) ^ (j16 >>> 20)) ^ (j16 >>> 15));
        jArr2[3] = (j13 ^ ((((j18 << 37) ^ (j18 << 42)) ^ (j18 << 44)) ^ (j18 << 49))) ^ ((((j17 >>> 27) ^ (j17 >>> 22)) ^ (j17 >>> 20)) ^ (j17 >>> 15));
        jArr2[4] = 134217727 & j19;
    }

    public static void p(long[] jArr, long[] jArr2) {
        long[] c10 = bj.i.c();
        long g10 = bj.b.g(jArr[0]);
        long g11 = bj.b.g(jArr[1]);
        long j10 = (g10 & 4294967295L) | (g11 << 32);
        c10[0] = (g10 >>> 32) | (g11 & (-4294967296L));
        long g12 = bj.b.g(jArr[2]);
        long g13 = bj.b.g(jArr[3]);
        c10[1] = (g12 >>> 32) | ((-4294967296L) & g13);
        long g14 = bj.b.g(jArr[4]);
        c10[2] = g14 >>> 32;
        m(c10, f25140a, jArr2);
        jArr2[0] = jArr2[0] ^ j10;
        jArr2[1] = jArr2[1] ^ ((g12 & 4294967295L) | (g13 << 32));
        jArr2[2] = jArr2[2] ^ (4294967295L & g14);
    }

    public static void q(long[] jArr, long[] jArr2) {
        long[] l10 = bj.n.l(9);
        k(jArr, l10);
        o(l10, jArr2);
    }

    public static void r(long[] jArr, long[] jArr2) {
        long[] l10 = bj.n.l(9);
        k(jArr, l10);
        b(jArr2, l10, jArr2);
    }

    public static void s(long[] jArr, int i10, long[] jArr2) {
        long[] l10 = bj.n.l(9);
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
        return ((int) (jArr[0] ^ (jArr[4] >>> 15))) & 1;
    }
}
