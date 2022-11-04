package org.conscrypt;

import java.util.Objects;
/* loaded from: classes3.dex */
final class Preconditions {
    private Preconditions() {
    }

    private static String badPositionIndex(int i10, int i11, String str) {
        if (i10 < 0) {
            return String.format("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return String.format("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException("negative size: " + i11);
    }

    private static String badPositionIndexes(int i10, int i11, int i12) {
        return (i10 < 0 || i10 > i12) ? badPositionIndex(i10, i12, "start index") : (i11 < 0 || i11 > i12) ? badPositionIndex(i11, i12, "end index") : String.format("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
    }

    public static void checkArgument(boolean z10, String str) {
        if (z10) {
            return;
        }
        throw new IllegalArgumentException(str);
    }

    public static void checkArgument(boolean z10, String str, Object obj) {
        if (z10) {
            return;
        }
        throw new IllegalArgumentException(String.format(str, obj));
    }

    public static <T> T checkNotNull(T t10, String str) {
        Objects.requireNonNull(t10, str);
        return t10;
    }

    public static void checkPositionIndexes(int i10, int i11, int i12) {
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            throw new IndexOutOfBoundsException(badPositionIndexes(i10, i11, i12));
        }
    }
}
