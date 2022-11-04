package wi;

import java.math.BigInteger;
/* loaded from: classes3.dex */
public class q2 {

    /* renamed from: a */
    private static final long[] f25251a = {3161836309350906777L, -7642453882179322845L, -3821226941089661423L, 7312758566309945096L, -556661012383879292L, 8945041530681231562L, -4750851271514160027L, 6847946401097695794L, 541669439031730457L};

    private static void a(long[] jArr, int i10, long[] jArr2, int i11, long[] jArr3, int i12) {
        for (int i13 = 0; i13 < 9; i13++) {
            jArr3[i12 + i13] = jArr[i10 + i13] ^ jArr2[i11 + i13];
        }
    }

    public static void b(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i10 = 0; i10 < 9; i10++) {
            jArr3[i10] = jArr[i10] ^ jArr2[i10];
        }
    }

    private static void c(long[] jArr, int i10, long[] jArr2, int i11, long[] jArr3, int i12) {
        for (int i13 = 0; i13 < 9; i13++) {
            int i14 = i12 + i13;
            jArr3[i14] = jArr3[i14] ^ (jArr[i10 + i13] ^ jArr2[i11 + i13]);
        }
    }

    public static void d(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i10 = 0; i10 < 9; i10++) {
            jArr3[i10] = jArr3[i10] ^ (jArr[i10] ^ jArr2[i10]);
        }
    }

    public static void e(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i10 = 0; i10 < 18; i10++) {
            jArr3[i10] = jArr[i10] ^ jArr2[i10];
        }
    }

    public static void f(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        for (int i10 = 1; i10 < 9; i10++) {
            jArr2[i10] = jArr[i10];
        }
    }

    private static void g(long[] jArr, long[] jArr2) {
        for (int i10 = 0; i10 < 9; i10++) {
            jArr2[i10] = jArr2[i10] ^ jArr[i10];
        }
    }

    public static long[] h(BigInteger bigInteger) {
        return bj.n.s(571, bigInteger);
    }

    public static void i(long[] jArr, long[] jArr2) {
        long[] d10 = bj.m.d();
        bj.m.b(jArr, jArr2);
        for (int i10 = 1; i10 < 571; i10 += 2) {
            m(jArr2, d10);
            t(d10, jArr2);
            m(jArr2, d10);
            t(d10, jArr2);
            g(jArr, jArr2);
        }
    }

    protected static void j(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[16];
        for (int i10 = 0; i10 < 9; i10++) {
            l(jArr4, jArr[i10], jArr2[i10], jArr3, i10 << 1);
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
        long j23 = j21 ^ jArr3[13];
        long j24 = j22 ^ jArr3[14];
        jArr3[7] = j24 ^ j23;
        long j25 = j23 ^ jArr3[15];
        long j26 = j24 ^ jArr3[16];
        jArr3[8] = j26 ^ j25;
        long j27 = j26 ^ (j25 ^ jArr3[17]);
        jArr3[9] = jArr3[0] ^ j27;
        jArr3[10] = jArr3[1] ^ j27;
        jArr3[11] = jArr3[2] ^ j27;
        jArr3[12] = jArr3[3] ^ j27;
        jArr3[13] = jArr3[4] ^ j27;
        jArr3[14] = jArr3[5] ^ j27;
        jArr3[15] = jArr3[6] ^ j27;
        jArr3[16] = jArr3[7] ^ j27;
        jArr3[17] = jArr3[8] ^ j27;
        l(jArr4, jArr[0] ^ jArr[1], jArr2[0] ^ jArr2[1], jArr3, 1);
        l(jArr4, jArr[0] ^ jArr[2], jArr2[0] ^ jArr2[2], jArr3, 2);
        l(jArr4, jArr[0] ^ jArr[3], jArr2[0] ^ jArr2[3], jArr3, 3);
        l(jArr4, jArr[1] ^ jArr[2], jArr2[1] ^ jArr2[2], jArr3, 3);
        l(jArr4, jArr[0] ^ jArr[4], jArr2[0] ^ jArr2[4], jArr3, 4);
        l(jArr4, jArr[1] ^ jArr[3], jArr2[1] ^ jArr2[3], jArr3, 4);
        l(jArr4, jArr[0] ^ jArr[5], jArr2[0] ^ jArr2[5], jArr3, 5);
        l(jArr4, jArr[1] ^ jArr[4], jArr2[1] ^ jArr2[4], jArr3, 5);
        l(jArr4, jArr[2] ^ jArr[3], jArr2[2] ^ jArr2[3], jArr3, 5);
        l(jArr4, jArr[0] ^ jArr[6], jArr2[0] ^ jArr2[6], jArr3, 6);
        l(jArr4, jArr[1] ^ jArr[5], jArr2[1] ^ jArr2[5], jArr3, 6);
        l(jArr4, jArr[2] ^ jArr[4], jArr2[2] ^ jArr2[4], jArr3, 6);
        l(jArr4, jArr[0] ^ jArr[7], jArr2[0] ^ jArr2[7], jArr3, 7);
        l(jArr4, jArr[1] ^ jArr[6], jArr2[1] ^ jArr2[6], jArr3, 7);
        l(jArr4, jArr[2] ^ jArr[5], jArr2[2] ^ jArr2[5], jArr3, 7);
        l(jArr4, jArr[3] ^ jArr[4], jArr2[3] ^ jArr2[4], jArr3, 7);
        l(jArr4, jArr[0] ^ jArr[8], jArr2[0] ^ jArr2[8], jArr3, 8);
        l(jArr4, jArr[1] ^ jArr[7], jArr2[1] ^ jArr2[7], jArr3, 8);
        l(jArr4, jArr[2] ^ jArr[6], jArr2[2] ^ jArr2[6], jArr3, 8);
        l(jArr4, jArr[3] ^ jArr[5], jArr2[3] ^ jArr2[5], jArr3, 8);
        l(jArr4, jArr[1] ^ jArr[8], jArr2[1] ^ jArr2[8], jArr3, 9);
        l(jArr4, jArr[2] ^ jArr[7], jArr2[2] ^ jArr2[7], jArr3, 9);
        l(jArr4, jArr[3] ^ jArr[6], jArr2[3] ^ jArr2[6], jArr3, 9);
        l(jArr4, jArr[4] ^ jArr[5], jArr2[4] ^ jArr2[5], jArr3, 9);
        l(jArr4, jArr[2] ^ jArr[8], jArr2[2] ^ jArr2[8], jArr3, 10);
        l(jArr4, jArr[3] ^ jArr[7], jArr2[3] ^ jArr2[7], jArr3, 10);
        l(jArr4, jArr[4] ^ jArr[6], jArr2[4] ^ jArr2[6], jArr3, 10);
        l(jArr4, jArr[3] ^ jArr[8], jArr2[3] ^ jArr2[8], jArr3, 11);
        l(jArr4, jArr[4] ^ jArr[7], jArr2[4] ^ jArr2[7], jArr3, 11);
        l(jArr4, jArr[5] ^ jArr[6], jArr2[5] ^ jArr2[6], jArr3, 11);
        l(jArr4, jArr[4] ^ jArr[8], jArr2[4] ^ jArr2[8], jArr3, 12);
        l(jArr4, jArr[5] ^ jArr[7], jArr2[5] ^ jArr2[7], jArr3, 12);
        l(jArr4, jArr[5] ^ jArr[8], jArr2[5] ^ jArr2[8], jArr3, 13);
        l(jArr4, jArr[6] ^ jArr[7], jArr2[6] ^ jArr2[7], jArr3, 13);
        l(jArr4, jArr[6] ^ jArr[8], jArr2[6] ^ jArr2[8], jArr3, 14);
        l(jArr4, jArr[7] ^ jArr[8], jArr2[7] ^ jArr2[8], jArr3, 15);
    }

    protected static void k(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i10 = 56; i10 >= 0; i10 -= 8) {
            for (int i11 = 1; i11 < 9; i11 += 2) {
                int i12 = (int) (jArr[i11] >>> i10);
                c(jArr2, (i12 & 15) * 9, jArr2, (((i12 >>> 4) & 15) + 16) * 9, jArr3, i11 - 1);
            }
            bj.n.O(16, jArr3, 0, 8, 0L);
        }
        for (int i13 = 56; i13 >= 0; i13 -= 8) {
            for (int i14 = 0; i14 < 9; i14 += 2) {
                int i15 = (int) (jArr[i14] >>> i13);
                c(jArr2, (i15 & 15) * 9, jArr2, (((i15 >>> 4) & 15) + 16) * 9, jArr3, i14);
            }
            if (i13 > 0) {
                bj.n.O(18, jArr3, 0, 8, 0L);
            }
        }
    }

    protected static void l(long[] jArr, long j10, long j11, long[] jArr2, int i10) {
        long j12 = j10;
        jArr[1] = j11;
        for (int i11 = 2; i11 < 16; i11 += 2) {
            jArr[i11] = jArr[i11 >>> 1] << 1;
            jArr[i11 + 1] = jArr[i11] ^ j11;
        }
        int i12 = (int) j12;
        long j13 = 0;
        long j14 = jArr[i12 & 15] ^ (jArr[(i12 >>> 4) & 15] << 4);
        int i13 = 56;
        do {
            int i14 = (int) (j12 >>> i13);
            long j15 = jArr[i14 & 15] ^ (jArr[(i14 >>> 4) & 15] << 4);
            j14 ^= j15 << i13;
            j13 ^= j15 >>> (-i13);
            i13 -= 8;
        } while (i13 > 0);
        for (int i15 = 0; i15 < 7; i15++) {
            j12 = (j12 & (-72340172838076674L)) >>> 1;
            j13 ^= ((j11 << i15) >> 63) & j12;
        }
        jArr2[i10] = jArr2[i10] ^ j14;
        int i16 = i10 + 1;
        jArr2[i16] = jArr2[i16] ^ j13;
    }

    protected static void m(long[] jArr, long[] jArr2) {
        bj.b.c(jArr, 0, 9, jArr2, 0);
    }

    public static void n(long[] jArr, long[] jArr2) {
        if (!bj.m.g(jArr)) {
            long[] c10 = bj.m.c();
            long[] c11 = bj.m.c();
            long[] c12 = bj.m.c();
            w(jArr, c12);
            w(c12, c10);
            w(c10, c11);
            o(c10, c11, c10);
            y(c10, 2, c11);
            o(c10, c11, c10);
            o(c10, c12, c10);
            y(c10, 5, c11);
            o(c10, c11, c10);
            y(c11, 5, c11);
            o(c10, c11, c10);
            y(c10, 15, c11);
            o(c10, c11, c12);
            y(c12, 30, c10);
            y(c10, 30, c11);
            o(c10, c11, c10);
            y(c10, 60, c11);
            o(c10, c11, c10);
            y(c11, 60, c11);
            o(c10, c11, c10);
            y(c10, 180, c11);
            o(c10, c11, c10);
            y(c11, 180, c11);
            o(c10, c11, c10);
            o(c10, c12, jArr2);
            return;
        }
        throw new IllegalStateException();
    }

    public static void o(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] d10 = bj.m.d();
        j(jArr, jArr2, d10);
        t(d10, jArr3);
    }

    public static void p(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] d10 = bj.m.d();
        j(jArr, jArr2, d10);
        e(jArr3, d10, jArr3);
    }

    public static void q(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] d10 = bj.m.d();
        k(jArr, jArr2, d10);
        t(d10, jArr3);
    }

    public static void r(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] d10 = bj.m.d();
        k(jArr, jArr2, d10);
        e(jArr3, d10, jArr3);
    }

    public static long[] s(long[] jArr) {
        long[] jArr2 = new long[288];
        int i10 = 0;
        System.arraycopy(jArr, 0, jArr2, 9, 9);
        int i11 = 7;
        while (i11 > 0) {
            int i12 = i10 + 18;
            bj.n.L(9, jArr2, i12 >>> 1, 0L, jArr2, i12);
            u(jArr2, i12);
            a(jArr2, 9, jArr2, i12, jArr2, i12 + 9);
            i11--;
            i10 = i12;
        }
        bj.n.P(144, jArr2, 0, 4, 0L, jArr2, 144);
        return jArr2;
    }

    public static void t(long[] jArr, long[] jArr2) {
        long j10 = jArr[9];
        long j11 = jArr[17];
        long j12 = (((j10 ^ (j11 >>> 59)) ^ (j11 >>> 57)) ^ (j11 >>> 54)) ^ (j11 >>> 49);
        long j13 = (j11 << 15) ^ (((jArr[8] ^ (j11 << 5)) ^ (j11 << 7)) ^ (j11 << 10));
        for (int i10 = 16; i10 >= 10; i10--) {
            long j14 = jArr[i10];
            jArr2[i10 - 8] = (((j13 ^ (j14 >>> 59)) ^ (j14 >>> 57)) ^ (j14 >>> 54)) ^ (j14 >>> 49);
            j13 = (((jArr[i10 - 9] ^ (j14 << 5)) ^ (j14 << 7)) ^ (j14 << 10)) ^ (j14 << 15);
        }
        jArr2[1] = (((j13 ^ (j12 >>> 59)) ^ (j12 >>> 57)) ^ (j12 >>> 54)) ^ (j12 >>> 49);
        long j15 = (j12 << 15) ^ (((jArr[0] ^ (j12 << 5)) ^ (j12 << 7)) ^ (j12 << 10));
        long j16 = jArr2[8];
        long j17 = j16 >>> 59;
        jArr2[0] = (((j15 ^ j17) ^ (j17 << 2)) ^ (j17 << 5)) ^ (j17 << 10);
        jArr2[8] = 576460752303423487L & j16;
    }

    public static void u(long[] jArr, int i10) {
        int i11 = i10 + 8;
        long j10 = jArr[i11];
        long j11 = j10 >>> 59;
        jArr[i10] = ((j11 << 10) ^ (((j11 << 2) ^ j11) ^ (j11 << 5))) ^ jArr[i10];
        jArr[i11] = j10 & 576460752303423487L;
    }

    public static void v(long[] jArr, long[] jArr2) {
        long[] c10 = bj.m.c();
        long[] c11 = bj.m.c();
        int i10 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            int i12 = i10 + 1;
            long g10 = bj.b.g(jArr[i10]);
            i10 = i12 + 1;
            long g11 = bj.b.g(jArr[i12]);
            c10[i11] = (4294967295L & g10) | (g11 << 32);
            c11[i11] = (g10 >>> 32) | ((-4294967296L) & g11);
        }
        long g12 = bj.b.g(jArr[i10]);
        c10[4] = 4294967295L & g12;
        c11[4] = g12 >>> 32;
        o(c11, f25251a, jArr2);
        b(jArr2, c10, jArr2);
    }

    public static void w(long[] jArr, long[] jArr2) {
        long[] d10 = bj.m.d();
        m(jArr, d10);
        t(d10, jArr2);
    }

    public static void x(long[] jArr, long[] jArr2) {
        long[] d10 = bj.m.d();
        m(jArr, d10);
        e(jArr2, d10, jArr2);
    }

    public static void y(long[] jArr, int i10, long[] jArr2) {
        long[] d10 = bj.m.d();
        m(jArr, d10);
        while (true) {
            t(d10, jArr2);
            i10--;
            if (i10 > 0) {
                m(jArr2, d10);
            } else {
                return;
            }
        }
    }

    public static int z(long[] jArr) {
        return ((int) ((jArr[0] ^ (jArr[8] >>> 49)) ^ (jArr[8] >>> 57))) & 1;
    }
}
