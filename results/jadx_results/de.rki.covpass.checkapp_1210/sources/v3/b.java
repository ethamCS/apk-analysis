package v3;
/* loaded from: classes.dex */
public class b {
    public static int a(int i10, int i11, int i12) {
        int i13 = i10 + i11;
        return i13 < 0 ? i12 + i13 : i13 % i12;
    }

    public static int b(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        return i13 < 0 ? i13 + i12 : i13;
    }

    public static int c(int i10, int i11, int i12) {
        int i13 = i10 - i11;
        return i13 < 0 ? i12 + i13 : i13;
    }

    public static int d(int i10, int i11, int i12) {
        return (i10 + i11) % i12;
    }
}
