package org.conscrypt;
/* loaded from: classes3.dex */
final class ArrayUtils {
    private ArrayUtils() {
    }

    public static void checkOffsetAndCount(int i10, int i11, int i12) {
        if ((i11 | i12) < 0 || i11 > i10 || i10 - i11 < i12) {
            throw new ArrayIndexOutOfBoundsException("length=" + i10 + "; regionStart=" + i11 + "; regionLength=" + i12);
        }
    }
}
