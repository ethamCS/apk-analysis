package yi;

import java.security.SecureRandom;
/* loaded from: classes3.dex */
public abstract class c {

    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        private static final a f26304a = new a();

        private a() {
        }
    }

    public static boolean a(byte[] bArr, int i10, byte[] bArr2, int i11, byte[] bArr3, int i12) {
        g(bArr, i10, bArr2, i11, bArr3, i12);
        return !ak.a.a(bArr3, i12, 56);
    }

    private static int b(byte[] bArr, int i10) {
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        return (bArr[i12 + 1] << 24) | (bArr[i10] & 255) | ((bArr[i11] & 255) << 8) | ((bArr[i12] & 255) << 16);
    }

    private static void c(byte[] bArr, int i10, int[] iArr) {
        for (int i11 = 0; i11 < 14; i11++) {
            iArr[i11] = b(bArr, (i11 * 4) + i10);
        }
        iArr[0] = iArr[0] & (-4);
        iArr[13] = iArr[13] | Integer.MIN_VALUE;
    }

    public static void d(SecureRandom secureRandom, byte[] bArr) {
        secureRandom.nextBytes(bArr);
        bArr[0] = (byte) (bArr[0] & 252);
        bArr[55] = (byte) (bArr[55] | 128);
    }

    public static void e(byte[] bArr, int i10, byte[] bArr2, int i11) {
        h(bArr, i10, bArr2, i11);
    }

    private static void f(int[] iArr, int[] iArr2) {
        int[] g10 = d.g();
        int[] g11 = d.g();
        d.a(iArr, iArr2, g10);
        d.J(iArr, iArr2, g11);
        d.H(g10, g10);
        d.H(g11, g11);
        d.A(g10, g11, iArr);
        d.J(g10, g11, g10);
        d.z(g10, 39082, iArr2);
        d.a(iArr2, g11, iArr2);
        d.A(iArr2, g10, iArr2);
    }

    public static void g(byte[] bArr, int i10, byte[] bArr2, int i11, byte[] bArr3, int i12) {
        int[] iArr = new int[14];
        c(bArr, i10, iArr);
        int[] g10 = d.g();
        d.j(bArr2, i11, g10);
        int[] g11 = d.g();
        d.f(g10, 0, g11, 0);
        int[] g12 = d.g();
        g12[0] = 1;
        int[] g13 = d.g();
        g13[0] = 1;
        int[] g14 = d.g();
        int[] g15 = d.g();
        int[] g16 = d.g();
        int i13 = 447;
        int i14 = 1;
        while (true) {
            d.a(g13, g14, g15);
            d.J(g13, g14, g13);
            d.a(g11, g12, g14);
            d.J(g11, g12, g11);
            d.A(g15, g11, g15);
            d.A(g13, g14, g13);
            d.H(g14, g14);
            d.H(g11, g11);
            d.J(g14, g11, g16);
            d.z(g16, 39082, g12);
            d.a(g12, g11, g12);
            d.A(g12, g16, g12);
            d.A(g11, g14, g11);
            d.J(g15, g13, g14);
            d.a(g15, g13, g13);
            d.H(g13, g13);
            d.H(g14, g14);
            d.A(g14, g10, g14);
            i13--;
            int i15 = (iArr[i13 >>> 5] >>> (i13 & 31)) & 1;
            int i16 = i14 ^ i15;
            d.i(i16, g11, g13);
            d.i(i16, g12, g14);
            if (i13 < 2) {
                break;
            }
            i14 = i15;
        }
        for (int i17 = 0; i17 < 2; i17++) {
            f(g11, g12);
        }
        d.v(g12, g12);
        d.A(g11, g12, g11);
        d.C(g11);
        d.p(g11, bArr3, i12);
    }

    public static void h(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int[] g10 = d.g();
        int[] g11 = d.g();
        zi.b.N(a.f26304a, bArr, i10, g10, g11);
        d.v(g10, g10);
        d.A(g10, g11, g10);
        d.H(g10, g10);
        d.C(g10);
        d.p(g10, bArr2, i11);
    }
}
