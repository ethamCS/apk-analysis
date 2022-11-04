package yi;

import java.security.SecureRandom;
/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: yi.a$a */
    /* loaded from: classes3.dex */
    public static class C0464a {

        /* renamed from: a */
        private static final C0464a f26301a = new C0464a();

        private C0464a() {
        }
    }

    public static boolean a(byte[] bArr, int i10, byte[] bArr2, int i11, byte[] bArr3, int i12) {
        g(bArr, i10, bArr2, i11, bArr3, i12);
        return !ak.a.a(bArr3, i12, 32);
    }

    private static int b(byte[] bArr, int i10) {
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        return (bArr[i12 + 1] << 24) | (bArr[i10] & 255) | ((bArr[i11] & 255) << 8) | ((bArr[i12] & 255) << 16);
    }

    private static void c(byte[] bArr, int i10, int[] iArr) {
        for (int i11 = 0; i11 < 8; i11++) {
            iArr[i11] = b(bArr, (i11 * 4) + i10);
        }
        iArr[0] = iArr[0] & (-8);
        iArr[7] = iArr[7] & Integer.MAX_VALUE;
        iArr[7] = iArr[7] | 1073741824;
    }

    public static void d(SecureRandom secureRandom, byte[] bArr) {
        secureRandom.nextBytes(bArr);
        bArr[0] = (byte) (bArr[0] & 248);
        bArr[31] = (byte) (bArr[31] & Byte.MAX_VALUE);
        bArr[31] = (byte) (bArr[31] | 64);
    }

    public static void e(byte[] bArr, int i10, byte[] bArr2, int i11) {
        h(bArr, i10, bArr2, i11);
    }

    private static void f(int[] iArr, int[] iArr2) {
        int[] h10 = b.h();
        int[] h11 = b.h();
        b.c(iArr, iArr2, h10, h11);
        b.G(h10, h10);
        b.G(h11, h11);
        b.z(h10, h11, iArr);
        b.I(h10, h11, h10);
        b.y(h10, 121666, iArr2);
        b.a(iArr2, h11, iArr2);
        b.z(iArr2, h10, iArr2);
    }

    public static void g(byte[] bArr, int i10, byte[] bArr2, int i11, byte[] bArr3, int i12) {
        int[] iArr = new int[8];
        c(bArr, i10, iArr);
        int[] h10 = b.h();
        b.k(bArr2, i11, h10);
        int[] h11 = b.h();
        b.g(h10, 0, h11, 0);
        int[] h12 = b.h();
        h12[0] = 1;
        int[] h13 = b.h();
        h13[0] = 1;
        int[] h14 = b.h();
        int[] h15 = b.h();
        int[] h16 = b.h();
        int i13 = 254;
        int i14 = 1;
        while (true) {
            b.c(h13, h14, h15, h13);
            b.c(h11, h12, h14, h11);
            b.z(h15, h11, h15);
            b.z(h13, h14, h13);
            b.G(h14, h14);
            b.G(h11, h11);
            b.I(h14, h11, h16);
            b.y(h16, 121666, h12);
            b.a(h12, h11, h12);
            b.z(h12, h16, h12);
            b.z(h11, h14, h11);
            b.c(h15, h13, h13, h14);
            b.G(h13, h13);
            b.G(h14, h14);
            b.z(h14, h10, h14);
            i13--;
            int i15 = (iArr[i13 >>> 5] >>> (i13 & 31)) & 1;
            int i16 = i14 ^ i15;
            b.j(i16, h11, h13);
            b.j(i16, h12, h14);
            if (i13 < 3) {
                break;
            }
            i14 = i15;
        }
        for (int i17 = 0; i17 < 3; i17++) {
            f(h11, h12);
        }
        b.u(h12, h12);
        b.z(h11, h12, h11);
        b.B(h11);
        b.p(h11, bArr3, i12);
    }

    public static void h(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int[] h10 = b.h();
        int[] h11 = b.h();
        zi.a.R(C0464a.f26301a, bArr, i10, h10, h11);
        b.c(h11, h10, h10, h11);
        b.u(h11, h11);
        b.z(h10, h11, h10);
        b.B(h10);
        b.p(h10, bArr2, i11);
    }
}
