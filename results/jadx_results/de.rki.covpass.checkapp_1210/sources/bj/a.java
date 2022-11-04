package bj;
/* loaded from: classes3.dex */
public abstract class a {
    public static int a(int i10, int i11, int i12) {
        int i13 = i11 & ((i10 >>> i12) ^ i10);
        return i10 ^ (i13 ^ (i13 << i12));
    }

    public static long b(long j10, long j11, int i10) {
        long j12 = j11 & ((j10 >>> i10) ^ j10);
        return j10 ^ (j12 ^ (j12 << i10));
    }
}
