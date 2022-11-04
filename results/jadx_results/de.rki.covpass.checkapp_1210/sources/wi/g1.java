package wi;

import java.math.BigInteger;
/* loaded from: classes3.dex */
public class g1 {

    /* renamed from: a */
    private static final long[] f25153a = {-5270498306774157648L, 5270498306774195053L, 19634136210L};

    public static void a(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr2[2] ^ jArr[2];
    }

    public static void b(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr2[5] ^ jArr[5];
    }

    public static void c(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
    }

    private static void d(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr2[0] ^ jArr[0];
        jArr2[1] = jArr2[1] ^ jArr[1];
        jArr2[2] = jArr2[2] ^ jArr[2];
    }

    public static long[] e(BigInteger bigInteger) {
        return bj.n.s(163, bigInteger);
    }

    public static void f(long[] jArr, long[] jArr2) {
        long[] k10 = bj.f.k();
        bj.f.g(jArr, jArr2);
        for (int i10 = 1; i10 < 163; i10 += 2) {
            j(jArr2, k10);
            n(k10, jArr2);
            j(jArr2, k10);
            n(k10, jArr2);
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
        jArr[0] = j10 ^ (j11 << 55);
        jArr[1] = (j11 >>> 9) ^ (j12 << 46);
        jArr[2] = (j12 >>> 18) ^ (j13 << 37);
        jArr[3] = (j13 >>> 27) ^ (j14 << 28);
        jArr[4] = (j14 >>> 36) ^ (j15 << 19);
        jArr[5] = j15 >>> 45;
    }

    protected static void h(long[] jArr, long[] jArr2, long[] jArr3) {
        long j10 = jArr[0];
        long j11 = jArr[1];
        long j12 = (j11 >>> 46) ^ (jArr[2] << 18);
        long j13 = ((j11 << 9) ^ (j10 >>> 55)) & 36028797018963967L;
        long j14 = j10 & 36028797018963967L;
        long j15 = jArr2[0];
        long j16 = jArr2[1];
        long j17 = (j16 >>> 46) ^ (jArr2[2] << 18);
        long j18 = ((j16 << 9) ^ (j15 >>> 55)) & 36028797018963967L;
        long j19 = j15 & 36028797018963967L;
        long[] jArr4 = new long[10];
        i(jArr3, j14, j19, jArr4, 0);
        i(jArr3, j12, j17, jArr4, 2);
        long j20 = (j14 ^ j13) ^ j12;
        long j21 = (j19 ^ j18) ^ j17;
        i(jArr3, j20, j21, jArr4, 4);
        long j22 = (j13 << 1) ^ (j12 << 2);
        long j23 = (j18 << 1) ^ (j17 << 2);
        i(jArr3, j14 ^ j22, j19 ^ j23, jArr4, 6);
        i(jArr3, j20 ^ j22, j21 ^ j23, jArr4, 8);
        long j24 = jArr4[6] ^ jArr4[8];
        long j25 = jArr4[7] ^ jArr4[9];
        long j26 = (j24 << 1) ^ jArr4[6];
        long j27 = (j24 ^ (j25 << 1)) ^ jArr4[7];
        long j28 = jArr4[0];
        long j29 = (jArr4[1] ^ jArr4[0]) ^ jArr4[4];
        long j30 = jArr4[1] ^ jArr4[5];
        long j31 = ((j28 ^ j26) ^ (jArr4[2] << 4)) ^ (jArr4[2] << 1);
        long j32 = (((j29 ^ j27) ^ (jArr4[3] << 4)) ^ (jArr4[3] << 1)) ^ (j31 >>> 55);
        long j33 = (j30 ^ j25) ^ (j32 >>> 55);
        long j34 = j32 & 36028797018963967L;
        long j35 = ((j31 & 36028797018963967L) >>> 1) ^ ((j34 & 1) << 54);
        long j36 = j35 ^ (j35 << 1);
        long j37 = j36 ^ (j36 << 2);
        long j38 = j37 ^ (j37 << 4);
        long j39 = j38 ^ (j38 << 8);
        long j40 = j39 ^ (j39 << 16);
        long j41 = (j40 ^ (j40 << 32)) & 36028797018963967L;
        long j42 = ((j34 >>> 1) ^ ((j33 & 1) << 54)) ^ (j41 >>> 54);
        long j43 = j42 ^ (j42 << 1);
        long j44 = j43 ^ (j43 << 2);
        long j45 = j44 ^ (j44 << 4);
        long j46 = j45 ^ (j45 << 8);
        long j47 = j46 ^ (j46 << 16);
        long j48 = (j47 ^ (j47 << 32)) & 36028797018963967L;
        long j49 = (j33 >>> 1) ^ (j48 >>> 54);
        long j50 = j49 ^ (j49 << 1);
        long j51 = j50 ^ (j50 << 2);
        long j52 = j51 ^ (j51 << 4);
        long j53 = j52 ^ (j52 << 8);
        long j54 = j53 ^ (j53 << 16);
        long j55 = j54 ^ (j54 << 32);
        jArr3[0] = j28;
        jArr3[1] = (j29 ^ j41) ^ jArr4[2];
        jArr3[2] = ((j30 ^ j48) ^ j41) ^ jArr4[3];
        jArr3[3] = j48 ^ j55;
        jArr3[4] = jArr4[2] ^ j55;
        jArr3[5] = jArr4[3];
        g(jArr3);
    }

    protected static void i(long[] jArr, long j10, long j11, long[] jArr2, int i10) {
        jArr[1] = j11;
        jArr[2] = jArr[1] << 1;
        jArr[3] = jArr[2] ^ j11;
        jArr[4] = jArr[2] << 1;
        jArr[5] = jArr[4] ^ j11;
        jArr[6] = jArr[3] << 1;
        jArr[7] = jArr[6] ^ j11;
        long j12 = jArr[((int) j10) & 3];
        long j13 = 0;
        int i11 = 47;
        do {
            int i12 = (int) (j10 >>> i11);
            long j14 = (jArr[i12 & 7] ^ (jArr[(i12 >>> 3) & 7] << 3)) ^ (jArr[(i12 >>> 6) & 7] << 6);
            j12 ^= j14 << i11;
            j13 ^= j14 >>> (-i11);
            i11 -= 9;
        } while (i11 > 0);
        jArr2[i10] = 36028797018963967L & j12;
        jArr2[i10 + 1] = (j12 >>> 55) ^ (j13 << 9);
    }

    protected static void j(long[] jArr, long[] jArr2) {
        bj.b.c(jArr, 0, 3, jArr2, 0);
    }

    public static void k(long[] jArr, long[] jArr2) {
        if (!bj.f.v(jArr)) {
            long[] i10 = bj.f.i();
            long[] i11 = bj.f.i();
            p(jArr, i10);
            r(i10, 1, i11);
            l(i10, i11, i10);
            r(i11, 1, i11);
            l(i10, i11, i10);
            r(i10, 3, i11);
            l(i10, i11, i10);
            r(i11, 3, i11);
            l(i10, i11, i10);
            r(i10, 9, i11);
            l(i10, i11, i10);
            r(i11, 9, i11);
            l(i10, i11, i10);
            r(i10, 27, i11);
            l(i10, i11, i10);
            r(i11, 27, i11);
            l(i10, i11, i10);
            r(i10, 81, i11);
            l(i10, i11, jArr2);
            return;
        }
        throw new IllegalStateException();
    }

    public static void l(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[8];
        h(jArr, jArr2, jArr4);
        n(jArr4, jArr3);
    }

    public static void m(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[8];
        h(jArr, jArr2, jArr4);
        b(jArr3, jArr4, jArr3);
    }

    public static void n(long[] jArr, long[] jArr2) {
        long j10 = jArr[0];
        long j11 = jArr[1];
        long j12 = jArr[2];
        long j13 = jArr[3];
        long j14 = jArr[4];
        long j15 = jArr[5];
        long j16 = j13 ^ ((((j15 >>> 35) ^ (j15 >>> 32)) ^ (j15 >>> 29)) ^ (j15 >>> 28));
        long j17 = j11 ^ ((((j14 << 29) ^ (j14 << 32)) ^ (j14 << 35)) ^ (j14 << 36));
        long j18 = (j12 ^ ((((j15 << 29) ^ (j15 << 32)) ^ (j15 << 35)) ^ (j15 << 36))) ^ ((j14 >>> 28) ^ (((j14 >>> 35) ^ (j14 >>> 32)) ^ (j14 >>> 29)));
        long j19 = j10 ^ ((((j16 << 29) ^ (j16 << 32)) ^ (j16 << 35)) ^ (j16 << 36));
        long j20 = j17 ^ ((j16 >>> 28) ^ (((j16 >>> 35) ^ (j16 >>> 32)) ^ (j16 >>> 29)));
        long j21 = j18 >>> 35;
        jArr2[0] = (((j19 ^ j21) ^ (j21 << 3)) ^ (j21 << 6)) ^ (j21 << 7);
        jArr2[1] = j20;
        jArr2[2] = 34359738367L & j18;
    }

    public static void o(long[] jArr, long[] jArr2) {
        long[] i10 = bj.f.i();
        long g10 = bj.b.g(jArr[0]);
        long g11 = bj.b.g(jArr[1]);
        i10[0] = (g10 >>> 32) | (g11 & (-4294967296L));
        long g12 = bj.b.g(jArr[2]);
        long j10 = g12 & 4294967295L;
        i10[1] = g12 >>> 32;
        l(i10, f25153a, jArr2);
        jArr2[0] = jArr2[0] ^ ((g10 & 4294967295L) | (g11 << 32));
        jArr2[1] = jArr2[1] ^ j10;
    }

    public static void p(long[] jArr, long[] jArr2) {
        long[] k10 = bj.f.k();
        j(jArr, k10);
        n(k10, jArr2);
    }

    public static void q(long[] jArr, long[] jArr2) {
        long[] k10 = bj.f.k();
        j(jArr, k10);
        b(jArr2, k10, jArr2);
    }

    public static void r(long[] jArr, int i10, long[] jArr2) {
        long[] k10 = bj.f.k();
        j(jArr, k10);
        while (true) {
            n(k10, jArr2);
            i10--;
            if (i10 > 0) {
                j(jArr2, k10);
            } else {
                return;
            }
        }
    }

    public static int s(long[] jArr) {
        return ((int) (jArr[0] ^ (jArr[2] >>> 29))) & 1;
    }
}
