package bj;
/* loaded from: classes3.dex */
public class b {
    public static long a(int i10) {
        int a10 = a.a(a.a(a.a(a.a(i10, 65280, 8), 15728880, 4), 202116108, 2), 572662306, 1);
        return (((a10 >>> 1) & 1431655765) << 32) | (1431655765 & a10);
    }

    public static void b(long j10, long[] jArr, int i10) {
        long b10 = a.b(a.b(a.b(a.b(a.b(j10, 4294901760L, 16), 280375465148160L, 8), 67555025218437360L, 4), 868082074056920076L, 2), 2459565876494606882L, 1);
        jArr[i10] = b10 & 6148914691236517205L;
        jArr[i10 + 1] = (b10 >>> 1) & 6148914691236517205L;
    }

    public static void c(long[] jArr, int i10, int i11, long[] jArr2, int i12) {
        for (int i13 = 0; i13 < i11; i13++) {
            b(jArr[i10 + i13], jArr2, i12);
            i12 += 2;
        }
    }

    public static void d(long j10, long[] jArr, int i10) {
        long b10 = a.b(a.b(a.b(a.b(a.b(j10, 4294901760L, 16), 280375465148160L, 8), 67555025218437360L, 4), 868082074056920076L, 2), 2459565876494606882L, 1);
        jArr[i10] = b10 & (-6148914691236517206L);
        jArr[i10 + 1] = (b10 << 1) & (-6148914691236517206L);
    }

    public static int e(int i10) {
        int i11 = i10 & 255;
        int i12 = (i11 | (i11 << 4)) & 3855;
        int i13 = (i12 | (i12 << 2)) & 13107;
        return (i13 | (i13 << 1)) & 21845;
    }

    public static int f(int i10) {
        return a.a(a.a(a.a(a.a(i10, 11141290, 7), 52428, 14), 15728880, 4), 65280, 8);
    }

    public static long g(long j10) {
        return a.b(a.b(a.b(a.b(a.b(j10, 2459565876494606882L, 1), 868082074056920076L, 2), 67555025218437360L, 4), 280375465148160L, 8), 4294901760L, 16);
    }
}
