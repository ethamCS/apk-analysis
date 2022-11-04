package bj;
/* loaded from: classes3.dex */
public abstract class j {
    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        f.x(iArr, iArr2, iArr3);
        f.w(iArr, 6, iArr2, 6, iArr3, 12);
        int d10 = f.d(iArr3, 6, iArr3, 12);
        int c10 = d10 + f.c(iArr3, 18, iArr3, 12, f.c(iArr3, 0, iArr3, 6, 0) + d10);
        int[] h10 = f.h();
        int[] h11 = f.h();
        boolean z10 = f.l(iArr, 6, iArr, 0, h10, 0) != f.l(iArr2, 6, iArr2, 0, h11, 0);
        int[] j10 = f.j();
        f.x(h10, h11, j10);
        n.f(24, c10 + (z10 ? n.d(12, j10, 0, iArr3, 6) : n.S(12, j10, 0, iArr3, 6)), iArr3, 18);
    }

    public static void b(int[] iArr, int[] iArr2) {
        f.D(iArr, iArr2);
        f.C(iArr, 6, iArr2, 12);
        int d10 = f.d(iArr2, 6, iArr2, 12);
        int c10 = d10 + f.c(iArr2, 18, iArr2, 12, f.c(iArr2, 0, iArr2, 6, 0) + d10);
        int[] h10 = f.h();
        f.l(iArr, 6, iArr, 0, h10, 0);
        int[] j10 = f.j();
        f.D(h10, j10);
        n.f(24, c10 + n.S(12, j10, 0, iArr2, 6), iArr2, 18);
    }
}
