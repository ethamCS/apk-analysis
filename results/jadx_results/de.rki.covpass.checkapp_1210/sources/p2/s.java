package p2;
/* loaded from: classes.dex */
public class s {
    private static int a(int i10, int i11, int i12, int i13) {
        return i10 < 10 ? i11 : i10 < 27 ? i12 : i13;
    }

    public static int b(int i10) {
        return a(i10, 9, 11, 13);
    }

    public static int c(int i10) {
        return a(i10, 8, 16, 16);
    }

    public static int d(int i10) {
        return a(i10, 8, 10, 12);
    }

    public static int e(int i10) {
        return a(i10, 10, 12, 14);
    }
}
