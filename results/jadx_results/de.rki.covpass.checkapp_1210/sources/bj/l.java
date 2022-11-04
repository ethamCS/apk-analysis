package bj;
/* loaded from: classes3.dex */
public abstract class l {
    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        h.y(iArr, iArr2, iArr3);
        h.x(iArr, 8, iArr2, 8, iArr3, 16);
        int e10 = h.e(iArr3, 8, iArr3, 16);
        int c10 = e10 + h.c(iArr3, 24, iArr3, 16, h.c(iArr3, 0, iArr3, 8, 0) + e10);
        int[] i10 = h.i();
        int[] i11 = h.i();
        boolean z10 = h.m(iArr, 8, iArr, 0, i10, 0) != h.m(iArr2, 8, iArr2, 0, i11, 0);
        int[] k10 = h.k();
        h.y(i10, i11, k10);
        n.f(32, c10 + (z10 ? n.d(16, k10, 0, iArr3, 8) : n.S(16, k10, 0, iArr3, 8)), iArr3, 24);
    }

    public static void b(int[] iArr, int[] iArr2) {
        h.F(iArr, iArr2);
        h.E(iArr, 8, iArr2, 16);
        int e10 = h.e(iArr2, 8, iArr2, 16);
        int c10 = e10 + h.c(iArr2, 24, iArr2, 16, h.c(iArr2, 0, iArr2, 8, 0) + e10);
        int[] i10 = h.i();
        h.m(iArr, 8, iArr, 0, i10, 0);
        int[] k10 = h.k();
        h.F(i10, k10);
        n.f(32, c10 + n.S(16, k10, 0, iArr2, 8), iArr2, 24);
    }
}
