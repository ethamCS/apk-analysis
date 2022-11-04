package c3;
/* loaded from: classes.dex */
public class c {
    public static int a(int[] iArr, int i10) {
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += iArr[i12];
        }
        return i11;
    }

    public static double b(int[] iArr, int i10) {
        return c(iArr, a(iArr, i10), i10);
    }

    public static double c(int[] iArr, int i10, int i11) {
        double d10 = 0.0d;
        for (int i12 = 0; i12 < i11; i12++) {
            d10 += iArr[i12] * i12;
        }
        return d10 / i10;
    }
}
