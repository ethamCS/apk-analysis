package wi;

import java.math.BigInteger;
/* loaded from: classes3.dex */
public class a1 {

    /* renamed from: a */
    private static final long[] f25100a = {2791191049453778211L, 2791191049453778402L, 6};

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
        jArr3[4] = jArr2[4] ^ jArr[4];
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
        return bj.n.s(131, bigInteger);
    }

    public static void f(long[] jArr, long[] jArr2) {
        long[] l10 = bj.n.l(5);
        bj.f.g(jArr, jArr2);
        for (int i10 = 1; i10 < 131; i10 += 2) {
            j(jArr2, l10);
            n(l10, jArr2);
            j(jArr2, l10);
            n(l10, jArr2);
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
        jArr[0] = j10 ^ (j11 << 44);
        jArr[1] = (j11 >>> 20) ^ (j12 << 24);
        jArr[2] = ((j12 >>> 40) ^ (j13 << 4)) ^ (j14 << 48);
        jArr[3] = ((j13 >>> 60) ^ (j15 << 28)) ^ (j14 >>> 16);
        jArr[4] = j15 >>> 36;
        jArr[5] = 0;
    }

    protected static void h(long[] jArr, long[] jArr2, long[] jArr3) {
        long j10 = jArr[0];
        long j11 = jArr[1];
        long j12 = ((jArr[2] << 40) ^ (j11 >>> 24)) & 17592186044415L;
        long j13 = ((j11 << 20) ^ (j10 >>> 44)) & 17592186044415L;
        long j14 = j10 & 17592186044415L;
        long j15 = jArr2[0];
        long j16 = jArr2[1];
        long j17 = ((j16 >>> 24) ^ (jArr2[2] << 40)) & 17592186044415L;
        long j18 = ((j16 << 20) ^ (j15 >>> 44)) & 17592186044415L;
        long j19 = j15 & 17592186044415L;
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
        long j32 = (((j29 ^ j27) ^ (jArr4[3] << 4)) ^ (jArr4[3] << 1)) ^ (j31 >>> 44);
        long j33 = (j30 ^ j25) ^ (j32 >>> 44);
        long j34 = j32 & 17592186044415L;
        long j35 = ((j31 & 17592186044415L) >>> 1) ^ ((j34 & 1) << 43);
        long j36 = j35 ^ (j35 << 1);
        long j37 = j36 ^ (j36 << 2);
        long j38 = j37 ^ (j37 << 4);
        long j39 = j38 ^ (j38 << 8);
        long j40 = j39 ^ (j39 << 16);
        long j41 = (j40 ^ (j40 << 32)) & 17592186044415L;
        long j42 = ((j34 >>> 1) ^ ((j33 & 1) << 43)) ^ (j41 >>> 43);
        long j43 = j42 ^ (j42 << 1);
        long j44 = j43 ^ (j43 << 2);
        long j45 = j44 ^ (j44 << 4);
        long j46 = j45 ^ (j45 << 8);
        long j47 = j46 ^ (j46 << 16);
        long j48 = (j47 ^ (j47 << 32)) & 17592186044415L;
        long j49 = (j33 >>> 1) ^ (j48 >>> 43);
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
        int i11 = (int) j10;
        long j12 = (((jArr[i11 & 7] ^ (jArr[(i11 >>> 3) & 7] << 3)) ^ (jArr[(i11 >>> 6) & 7] << 6)) ^ (jArr[(i11 >>> 9) & 7] << 9)) ^ (jArr[(i11 >>> 12) & 7] << 12);
        long j13 = 0;
        int i12 = 30;
        do {
            int i13 = (int) (j10 >>> i12);
            long j14 = (((jArr[i13 & 7] ^ (jArr[(i13 >>> 3) & 7] << 3)) ^ (jArr[(i13 >>> 6) & 7] << 6)) ^ (jArr[(i13 >>> 9) & 7] << 9)) ^ (jArr[(i13 >>> 12) & 7] << 12);
            j12 ^= j14 << i12;
            j13 ^= j14 >>> (-i12);
            i12 -= 15;
        } while (i12 > 0);
        jArr2[i10] = 17592186044415L & j12;
        jArr2[i10 + 1] = (j12 >>> 44) ^ (j13 << 20);
    }

    protected static void j(long[] jArr, long[] jArr2) {
        bj.b.c(jArr, 0, 2, jArr2, 0);
        jArr2[4] = bj.b.e((int) jArr[2]) & 4294967295L;
    }

    public static void k(long[] jArr, long[] jArr2) {
        if (!bj.f.v(jArr)) {
            long[] i10 = bj.f.i();
            long[] i11 = bj.f.i();
            p(jArr, i10);
            l(i10, jArr, i10);
            r(i10, 2, i11);
            l(i11, i10, i11);
            r(i11, 4, i10);
            l(i10, i11, i10);
            r(i10, 8, i11);
            l(i11, i10, i11);
            r(i11, 16, i10);
            l(i10, i11, i10);
            r(i10, 32, i11);
            l(i11, i10, i11);
            p(i11, i11);
            l(i11, jArr, i11);
            r(i11, 65, i10);
            l(i10, i11, i10);
            p(i10, jArr2);
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
        long j15 = j13 ^ (j14 >>> 59);
        long j16 = j10 ^ ((j15 << 61) ^ (j15 << 63));
        long j17 = (j11 ^ ((j14 << 61) ^ (j14 << 63))) ^ ((((j15 >>> 3) ^ (j15 >>> 1)) ^ j15) ^ (j15 << 5));
        long j18 = (j12 ^ ((((j14 >>> 3) ^ (j14 >>> 1)) ^ j14) ^ (j14 << 5))) ^ (j15 >>> 59);
        long j19 = j18 >>> 3;
        jArr2[0] = (((j16 ^ j19) ^ (j19 << 2)) ^ (j19 << 3)) ^ (j19 << 8);
        jArr2[1] = (j19 >>> 56) ^ j17;
        jArr2[2] = 7 & j18;
    }

    public static void o(long[] jArr, long[] jArr2) {
        long[] i10 = bj.f.i();
        long g10 = bj.b.g(jArr[0]);
        long g11 = bj.b.g(jArr[1]);
        i10[0] = (g10 >>> 32) | (g11 & (-4294967296L));
        long g12 = bj.b.g(jArr[2]);
        long j10 = g12 & 4294967295L;
        i10[1] = g12 >>> 32;
        l(i10, f25100a, jArr2);
        jArr2[0] = jArr2[0] ^ ((g10 & 4294967295L) | (g11 << 32));
        jArr2[1] = jArr2[1] ^ j10;
    }

    public static void p(long[] jArr, long[] jArr2) {
        long[] l10 = bj.n.l(5);
        j(jArr, l10);
        n(l10, jArr2);
    }

    public static void q(long[] jArr, long[] jArr2) {
        long[] l10 = bj.n.l(5);
        j(jArr, l10);
        b(jArr2, l10, jArr2);
    }

    public static void r(long[] jArr, int i10, long[] jArr2) {
        long[] l10 = bj.n.l(5);
        j(jArr, l10);
        while (true) {
            n(l10, jArr2);
            i10--;
            if (i10 > 0) {
                j(jArr2, l10);
            } else {
                return;
            }
        }
    }

    public static int s(long[] jArr) {
        return ((int) ((jArr[0] ^ (jArr[1] >>> 59)) ^ (jArr[2] >>> 1))) & 1;
    }
}
