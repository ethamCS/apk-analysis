package p2;
/* loaded from: classes.dex */
public class b {
    public static int a(int i10, int i11, int i12, int i13) {
        int i14 = 0;
        while (i11 > 0) {
            if ((i11 & 1) != 0) {
                i14 ^= i10;
            }
            i11 >>= 1;
            i10 <<= 1;
            if (i10 >= i13) {
                i10 ^= i12;
            }
        }
        return i14;
    }

    public static int b(int i10, int i11) {
        return i10 ^ i11;
    }
}
