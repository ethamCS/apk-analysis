package xh;
/* loaded from: classes3.dex */
public class b {
    public static void a(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr2[1] ^ jArr[1];
    }

    public static void b(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
    }

    public static boolean c(long[] jArr, long[] jArr2) {
        return ((jArr2[1] ^ jArr[1]) | ((jArr[0] ^ jArr2[0]) | 0)) == 0;
    }

    public static void d(long[] jArr, long[] jArr2) {
        long j10 = jArr[0];
        long j11 = jArr[1];
        jArr2[0] = ((j11 >> 63) & 135) ^ (j10 << 1);
        jArr2[1] = (j10 >>> 63) | (j11 << 1);
    }

    public static void e(long[] jArr, long[] jArr2) {
        long j10 = jArr[0];
        long j11 = jArr[1];
        long j12 = j11 >>> 56;
        jArr2[0] = (j12 << 7) ^ ((((j10 << 8) ^ j12) ^ (j12 << 1)) ^ (j12 << 2));
        jArr2[1] = (j10 >>> 56) | (j11 << 8);
    }
}
