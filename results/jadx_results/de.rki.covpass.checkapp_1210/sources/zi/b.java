package zi;

import bj.n;
import java.security.SecureRandom;
import java.util.Objects;
import nh.c0;
import org.bouncycastle.crypto.j0;
import org.conscrypt.PSKKeyManager;
import yi.c;
import yi.d;
/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a */
    private static final byte[] f27067a = {83, 105, 103, 69, 100, 52, 52, 56};

    /* renamed from: b */
    private static final int[] f27068b = {-1, -1, -1, -1, -1, -1, -1, -2, -1, -1, -1, -1, -1, -1};

    /* renamed from: c */
    private static final int[] f27069c = {-1420278541, 595116690, -1916432555, 560775794, -1361693040, -1001465015, 2093622249, -1, -1, -1, -1, -1, -1, 1073741823};

    /* renamed from: d */
    private static final int[] f27070d = {118276190, 40534716, 9670182, 135141552, 85017403, 259173222, 68333082, 171784774, 174973732, 15824510, 73756743, 57518561, 94773951, 248652241, 107736333, 82941708};

    /* renamed from: e */
    private static final int[] f27071e = {36764180, 8885695, 130592152, 20104429, 163904957, 30304195, 121295871, 5901357, 125344798, 171541512, 175338348, 209069246, 3626697, 38307682, 24032956, 110359655};

    /* renamed from: f */
    private static final Object f27072f = new Object();

    /* renamed from: g */
    private static C0483b[] f27073g = null;

    /* renamed from: h */
    private static int[] f27074h = null;

    /* renamed from: zi.b$b */
    /* loaded from: classes3.dex */
    public static class C0483b {

        /* renamed from: a */
        int[] f27075a;

        /* renamed from: b */
        int[] f27076b;

        /* renamed from: c */
        int[] f27077c;

        private C0483b() {
            this.f27075a = d.g();
            this.f27076b = d.g();
            this.f27077c = d.g();
        }
    }

    /* loaded from: classes3.dex */
    public static class c {

        /* renamed from: a */
        int[] f27078a;

        /* renamed from: b */
        int[] f27079b;

        private c() {
            this.f27078a = d.g();
            this.f27079b = d.g();
        }
    }

    private static void A(boolean z10, C0483b c0483b, C0483b c0483b2) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] g10 = d.g();
        int[] g11 = d.g();
        int[] g12 = d.g();
        int[] g13 = d.g();
        int[] g14 = d.g();
        int[] g15 = d.g();
        int[] g16 = d.g();
        int[] g17 = d.g();
        if (z10) {
            d.J(c0483b.f27076b, c0483b.f27075a, g17);
            iArr2 = g11;
            iArr3 = g14;
            iArr4 = g15;
            iArr = g16;
        } else {
            d.a(c0483b.f27076b, c0483b.f27075a, g17);
            iArr3 = g11;
            iArr2 = g14;
            iArr = g15;
            iArr4 = g16;
        }
        d.A(c0483b.f27077c, c0483b2.f27077c, g10);
        d.H(g10, g11);
        d.A(c0483b.f27075a, c0483b2.f27075a, g12);
        d.A(c0483b.f27076b, c0483b2.f27076b, g13);
        d.A(g12, g13, g14);
        d.z(g14, 39081, g14);
        d.a(g11, g14, iArr);
        d.J(g11, g14, iArr4);
        d.a(c0483b2.f27075a, c0483b2.f27076b, g14);
        d.A(g17, g14, g17);
        d.a(g13, g12, iArr3);
        d.J(g13, g12, iArr2);
        d.c(iArr3);
        d.J(g17, g11, g17);
        d.A(g17, g10, g17);
        d.A(g14, g10, g14);
        d.A(g15, g17, c0483b2.f27075a);
        d.A(g14, g16, c0483b2.f27076b);
        d.A(g15, g16, c0483b2.f27077c);
    }

    private static C0483b B(C0483b c0483b) {
        C0483b c0483b2 = new C0483b();
        C(c0483b, c0483b2);
        return c0483b2;
    }

    private static void C(C0483b c0483b, C0483b c0483b2) {
        d.f(c0483b.f27075a, 0, c0483b2.f27075a, 0);
        d.f(c0483b.f27076b, 0, c0483b2.f27076b, 0);
        d.f(c0483b.f27077c, 0, c0483b2.f27077c, 0);
    }

    private static void D(C0483b c0483b) {
        int[] g10 = d.g();
        int[] g11 = d.g();
        int[] g12 = d.g();
        int[] g13 = d.g();
        int[] g14 = d.g();
        int[] g15 = d.g();
        d.a(c0483b.f27075a, c0483b.f27076b, g10);
        d.H(g10, g10);
        d.H(c0483b.f27075a, g11);
        d.H(c0483b.f27076b, g12);
        d.a(g11, g12, g13);
        d.c(g13);
        d.H(c0483b.f27077c, g14);
        d.a(g14, g14, g14);
        d.c(g14);
        d.J(g13, g14, g15);
        d.J(g10, g13, g10);
        d.J(g11, g12, g11);
        d.A(g10, g15, c0483b.f27075a);
        d.A(g13, g11, c0483b.f27076b);
        d.A(g13, g15, c0483b.f27077c);
    }

    private static void E(C0483b c0483b) {
        d.D(c0483b.f27077c);
    }

    private static void F(int i10, int i11, c cVar) {
        int i12 = i10 * 16 * 2 * 16;
        for (int i13 = 0; i13 < 16; i13++) {
            int i14 = ((i13 ^ i11) - 1) >> 31;
            d.d(i14, f27074h, i12, cVar.f27078a, 0);
            int i15 = i12 + 16;
            d.d(i14, f27074h, i15, cVar.f27079b, 0);
            i12 = i15 + 16;
        }
    }

    private static C0483b[] G(C0483b c0483b, int i10) {
        C0483b B = B(c0483b);
        D(B);
        C0483b[] c0483bArr = new C0483b[i10];
        c0483bArr[0] = B(c0483b);
        for (int i11 = 1; i11 < i10; i11++) {
            c0483bArr[i11] = B(c0483bArr[i11 - 1]);
            A(false, B, c0483bArr[i11]);
        }
        return c0483bArr;
    }

    private static void H(C0483b c0483b) {
        d.L(c0483b.f27075a);
        d.D(c0483b.f27076b);
        d.D(c0483b.f27077c);
    }

    public static void I() {
        synchronized (f27072f) {
            if (f27074h != null) {
                return;
            }
            C0483b c0483b = new C0483b();
            d.f(f27070d, 0, c0483b.f27075a, 0);
            d.f(f27071e, 0, c0483b.f27076b, 0);
            E(c0483b);
            f27073g = G(c0483b, 32);
            f27074h = d.h(160);
            int i10 = 0;
            for (int i11 = 0; i11 < 5; i11++) {
                C0483b[] c0483bArr = new C0483b[5];
                C0483b c0483b2 = new C0483b();
                H(c0483b2);
                int i12 = 0;
                while (true) {
                    if (i12 >= 5) {
                        break;
                    }
                    A(true, c0483b, c0483b2);
                    D(c0483b);
                    c0483bArr[i12] = B(c0483b);
                    if (i11 + i12 != 8) {
                        for (int i13 = 1; i13 < 18; i13++) {
                            D(c0483b);
                        }
                    }
                    i12++;
                }
                C0483b[] c0483bArr2 = new C0483b[16];
                c0483bArr2[0] = c0483b2;
                int i14 = 1;
                for (int i15 = 0; i15 < 4; i15++) {
                    int i16 = 1 << i15;
                    int i17 = 0;
                    while (i17 < i16) {
                        c0483bArr2[i14] = B(c0483bArr2[i14 - i16]);
                        A(false, c0483bArr[i15], c0483bArr2[i14]);
                        i17++;
                        i14++;
                    }
                }
                int[] h10 = d.h(16);
                int[] g10 = d.g();
                d.f(c0483bArr2[0].f27077c, 0, g10, 0);
                d.f(g10, 0, h10, 0);
                int i18 = 0;
                while (true) {
                    i18++;
                    if (i18 >= 16) {
                        break;
                    }
                    d.A(g10, c0483bArr2[i18].f27077c, g10);
                    d.f(g10, 0, h10, i18 * 16);
                }
                d.w(g10, g10);
                int i19 = i18 - 1;
                int[] g11 = d.g();
                while (i19 > 0) {
                    int i20 = i19 - 1;
                    d.f(h10, i20 * 16, g11, 0);
                    d.A(g11, g10, g11);
                    d.f(g11, 0, h10, i19 * 16);
                    d.A(g10, c0483bArr2[i19].f27077c, g10);
                    i19 = i20;
                }
                d.f(g10, 0, h10, 0);
                for (int i21 = 0; i21 < 16; i21++) {
                    C0483b c0483b3 = c0483bArr2[i21];
                    d.f(h10, i21 * 16, c0483b3.f27077c, 0);
                    int[] iArr = c0483b3.f27075a;
                    d.A(iArr, c0483b3.f27077c, iArr);
                    int[] iArr2 = c0483b3.f27076b;
                    d.A(iArr2, c0483b3.f27077c, iArr2);
                    d.f(c0483b3.f27075a, 0, f27074h, i10);
                    int i22 = i10 + 16;
                    d.f(c0483b3.f27076b, 0, f27074h, i22);
                    i10 = i22 + 16;
                }
            }
        }
    }

    private static void J(byte[] bArr, int i10, byte[] bArr2) {
        System.arraycopy(bArr, i10, bArr2, 0, 56);
        bArr2[0] = (byte) (bArr2[0] & 252);
        bArr2[55] = (byte) (bArr2[55] | 128);
        bArr2[56] = 0;
    }

    private static byte[] K(byte[] bArr) {
        long j10 = (j(bArr, 4) << 4) & 4294967295L;
        long k10 = k(bArr, 7) & 4294967295L;
        long j11 = (j(bArr, 11) << 4) & 4294967295L;
        long k11 = k(bArr, 14) & 4294967295L;
        long j12 = (j(bArr, 18) << 4) & 4294967295L;
        long k12 = k(bArr, 21) & 4294967295L;
        long k13 = k(bArr, 28) & 4294967295L;
        long j13 = (j(bArr, 32) << 4) & 4294967295L;
        long k14 = k(bArr, 35) & 4294967295L;
        long j14 = (j(bArr, 39) << 4) & 4294967295L;
        long k15 = k(bArr, 42) & 4294967295L;
        long j15 = (j(bArr, 46) << 4) & 4294967295L;
        long k16 = k(bArr, 49) & 4294967295L;
        long j16 = (j(bArr, 53) << 4) & 4294967295L;
        long j17 = (j(bArr, 74) << 4) & 4294967295L;
        long k17 = k(bArr, 77) & 4294967295L;
        long j18 = (j(bArr, 81) << 4) & 4294967295L;
        long k18 = k(bArr, 84) & 4294967295L;
        long j19 = (j(bArr, 88) << 4) & 4294967295L;
        long k19 = k(bArr, 91) & 4294967295L;
        long j20 = (j(bArr, 95) << 4) & 4294967295L;
        long k20 = k(bArr, 98) & 4294967295L;
        long j21 = (j(bArr, 102) << 4) & 4294967295L;
        long k21 = k(bArr, 105) & 4294967295L;
        long j22 = (j(bArr, 109) << 4) & 4294967295L;
        long i10 = i(bArr, 112) & 4294967295L;
        long j23 = j22 + (k21 >>> 28);
        long j24 = k21 & 268435455;
        long k22 = (k(bArr, 56) & 4294967295L) + (i10 * 43969588) + (j23 * 30366549);
        long j25 = ((j(bArr, 60) << 4) & 4294967295L) + (i10 * 30366549) + (j23 * 163752818);
        long k23 = (k(bArr, 63) & 4294967295L) + (i10 * 163752818) + (j23 * 258169998);
        long j26 = ((j(bArr, 67) << 4) & 4294967295L) + (i10 * 258169998) + (j23 * 96434764);
        long j27 = k17 + (i10 * 149865618) + (j23 * 550336261);
        long j28 = k16 + (j24 * 43969588);
        long j29 = j21 + (k20 >>> 28);
        long j30 = k20 & 268435455;
        long k24 = (k(bArr, 70) & 4294967295L) + (i10 * 96434764) + (j23 * 227822194) + (j24 * 149865618) + (j29 * 550336261);
        long j31 = k15 + (j30 * 43969588);
        long j32 = j20 + (k19 >>> 28);
        long j33 = k19 & 268435455;
        long j34 = k23 + (j24 * 96434764) + (j29 * 227822194) + (j30 * 149865618) + (j32 * 550336261);
        long j35 = k14 + (j33 * 43969588);
        long j36 = j25 + (j24 * 258169998) + (j29 * 96434764) + (j30 * 227822194) + (j32 * 149865618) + (j33 * 550336261);
        long j37 = j19 + (k18 >>> 28);
        long j38 = j17 + (i10 * 227822194) + (j23 * 149865618) + (j24 * 550336261) + (k24 >>> 28);
        long j39 = j27 + (j38 >>> 28);
        long j40 = j18 + (i10 * 550336261) + (j39 >>> 28);
        long j41 = j39 & 268435455;
        long j42 = (k18 & 268435455) + (j40 >>> 28);
        long j43 = j40 & 268435455;
        long j44 = ((j(bArr, 25) << 4) & 4294967295L) + (j43 * 43969588);
        long j45 = k13 + (j42 * 43969588) + (j43 * 30366549);
        long j46 = j13 + (j37 * 43969588) + (j42 * 30366549) + (j43 * 163752818);
        long j47 = j35 + (j37 * 30366549) + (j42 * 163752818) + (j43 * 258169998);
        long j48 = j14 + (j32 * 43969588) + (j33 * 30366549) + (j37 * 163752818) + (j42 * 258169998) + (j43 * 96434764);
        long j49 = j31 + (j32 * 30366549) + (j33 * 163752818) + (j37 * 258169998) + (j42 * 96434764) + (j43 * 227822194);
        long j50 = j28 + (j29 * 30366549) + (j30 * 163752818) + (j32 * 258169998) + (j33 * 96434764) + (j37 * 227822194) + (j42 * 149865618) + (j43 * 550336261);
        long j51 = k12 + (j41 * 43969588);
        long j52 = j34 + (j36 >>> 28);
        long j53 = j26 + (j24 * 227822194) + (j29 * 149865618) + (j30 * 550336261) + (j52 >>> 28);
        long j54 = (k24 & 268435455) + (j53 >>> 28);
        long j55 = j53 & 268435455;
        long j56 = (j38 & 268435455) + (j54 >>> 28);
        long j57 = j54 & 268435455;
        long j58 = j48 + (j41 * 227822194) + (j56 * 149865618) + (j57 * 550336261);
        long j59 = j47 + (j41 * 96434764) + (j56 * 227822194) + (j57 * 149865618) + (j55 * 550336261);
        long j60 = j16 + (j23 * 43969588) + (j24 * 30366549) + (j29 * 163752818) + (j30 * 258169998) + (j32 * 96434764) + (j33 * 227822194) + (j37 * 149865618) + (j42 * 550336261) + (j50 >>> 28);
        long j61 = k22 + (j24 * 163752818) + (j29 * 258169998) + (j30 * 96434764) + (j32 * 227822194) + (j33 * 149865618) + (j37 * 550336261) + (j60 >>> 28);
        long j62 = j60 & 268435455;
        long j63 = (j36 & 268435455) + (j61 >>> 28);
        long j64 = (j52 & 268435455) + (j63 >>> 28);
        long j65 = j63 & 268435455;
        long j66 = k10 + (j64 * 43969588);
        long j67 = j11 + (j55 * 43969588) + (j64 * 30366549);
        long j68 = k11 + (j57 * 43969588) + (j55 * 30366549) + (j64 * 163752818);
        long j69 = j12 + (j56 * 43969588) + (j57 * 30366549) + (j55 * 163752818) + (j64 * 258169998);
        long j70 = j51 + (j56 * 30366549) + (j57 * 163752818) + (j55 * 258169998) + (j64 * 96434764);
        long j71 = j44 + (j41 * 30366549) + (j56 * 163752818) + (j57 * 258169998) + (j55 * 96434764) + (j64 * 227822194);
        long j72 = j46 + (j41 * 258169998) + (j56 * 96434764) + (j57 * 227822194) + (j55 * 149865618) + (j64 * 550336261);
        long j73 = j62 & 67108863;
        long j74 = ((j61 & 268435455) * 4) + (j62 >>> 26) + 1;
        long k25 = (k(bArr, 0) & 4294967295L) + (78101261 * j74);
        long j75 = j66 + (30366549 * j65) + (175155932 * j74);
        long j76 = j67 + (163752818 * j65) + (64542499 * j74);
        long j77 = j68 + (258169998 * j65) + (158326419 * j74);
        long j78 = j69 + (96434764 * j65) + (191173276 * j74);
        long j79 = j71 + (149865618 * j65) + (j74 * 137584065);
        long j80 = j10 + (43969588 * j65) + (141809365 * j74) + (k25 >>> 28);
        long j81 = j75 + (j80 >>> 28);
        long j82 = j76 + (j81 >>> 28);
        long j83 = j77 + (j82 >>> 28);
        long j84 = j78 + (j83 >>> 28);
        long j85 = j83 & 268435455;
        long j86 = j70 + (227822194 * j65) + (104575268 * j74) + (j84 >>> 28);
        long j87 = j84 & 268435455;
        long j88 = j79 + (j86 >>> 28);
        long j89 = j45 + (j41 * 163752818) + (j56 * 258169998) + (j57 * 96434764) + (j55 * 227822194) + (j64 * 149865618) + (j65 * 550336261) + (j88 >>> 28);
        long j90 = j88 & 268435455;
        long j91 = j72 + (j89 >>> 28);
        long j92 = j89 & 268435455;
        long j93 = j59 + (j91 >>> 28);
        long j94 = j58 + (j93 >>> 28);
        long j95 = j49 + (j41 * 149865618) + (j56 * 550336261) + (j94 >>> 28);
        long j96 = j94 & 268435455;
        long j97 = j15 + (j29 * 43969588) + (j30 * 30366549) + (j32 * 163752818) + (j33 * 258169998) + (j37 * 96434764) + (j42 * 227822194) + (j43 * 149865618) + (j41 * 550336261) + (j95 >>> 28);
        long j98 = (j50 & 268435455) + (j97 >>> 28);
        long j99 = j73 + (j98 >>> 28);
        long j100 = (j99 >>> 26) - 1;
        long j101 = (k25 & 268435455) - (j100 & 78101261);
        long j102 = ((j80 & 268435455) - (j100 & 141809365)) + (j101 >> 28);
        long j103 = ((j81 & 268435455) - (j100 & 175155932)) + (j102 >> 28);
        long j104 = ((j82 & 268435455) - (j100 & 64542499)) + (j103 >> 28);
        long j105 = j103 & 268435455;
        long j106 = (j85 - (j100 & 158326419)) + (j104 >> 28);
        long j107 = (j87 - (j100 & 191173276)) + (j106 >> 28);
        long j108 = j106 & 268435455;
        long j109 = ((j86 & 268435455) - (j100 & 104575268)) + (j107 >> 28);
        long j110 = j107 & 268435455;
        long j111 = (j90 - (j100 & 137584065)) + (j109 >> 28);
        long j112 = j92 + (j111 >> 28);
        long j113 = j111 & 268435455;
        long j114 = (j91 & 268435455) + (j112 >> 28);
        long j115 = (j93 & 268435455) + (j114 >> 28);
        long j116 = j96 + (j115 >> 28);
        long j117 = (j95 & 268435455) + (j116 >> 28);
        long j118 = (j97 & 268435455) + (j117 >> 28);
        long j119 = (j98 & 268435455) + (j118 >> 28);
        byte[] bArr2 = new byte[57];
        r(((j102 & 268435455) << 28) | (j101 & 268435455), bArr2, 0);
        r(((j104 & 268435455) << 28) | j105, bArr2, 7);
        r(j108 | (j110 << 28), bArr2, 14);
        r((j109 & 268435455) | (j113 << 28), bArr2, 21);
        r((j112 & 268435455) | ((j114 & 268435455) << 28), bArr2, 28);
        r((j115 & 268435455) | ((j116 & 268435455) << 28), bArr2, 35);
        r((j117 & 268435455) | ((j118 & 268435455) << 28), bArr2, 42);
        r((((j99 & 67108863) + (j119 >> 28)) << 28) | (j119 & 268435455), bArr2, 49);
        return bArr2;
    }

    private static void L(byte[] bArr, C0483b c0483b) {
        I();
        int[] iArr = new int[15];
        n(bArr, 0, iArr);
        iArr[14] = n.h(14, (~iArr[0]) & 1, iArr, f27069c, iArr) + 4;
        n.F(15, iArr, 0);
        c cVar = new c();
        H(c0483b);
        int i10 = 17;
        while (true) {
            int i11 = i10;
            for (int i12 = 0; i12 < 5; i12++) {
                int i13 = 0;
                for (int i14 = 0; i14 < 5; i14++) {
                    i13 = (i13 & (~(1 << i14))) ^ ((iArr[i11 >>> 5] >>> (i11 & 31)) << i14);
                    i11 += 18;
                }
                int i15 = (i13 >>> 4) & 1;
                F(i12, ((-i15) ^ i13) & 15, cVar);
                d.e(i15, cVar.f27078a);
                z(cVar, c0483b);
            }
            i10--;
            if (i10 < 0) {
                return;
            }
            D(c0483b);
        }
    }

    private static void M(byte[] bArr, byte[] bArr2, int i10) {
        C0483b c0483b = new C0483b();
        L(bArr, c0483b);
        if (s(c0483b, bArr2, i10) != 0) {
            return;
        }
        throw new IllegalStateException();
    }

    public static void N(c.a aVar, byte[] bArr, int i10, int[] iArr, int[] iArr2) {
        Objects.requireNonNull(aVar, "This method is only for use by X448");
        byte[] bArr2 = new byte[57];
        J(bArr, i10, bArr2);
        C0483b c0483b = new C0483b();
        L(bArr2, c0483b);
        if (d(c0483b.f27075a, c0483b.f27076b, c0483b.f27077c) != 0) {
            d.f(c0483b.f27075a, 0, iArr, 0);
            d.f(c0483b.f27076b, 0, iArr2, 0);
            return;
        }
        throw new IllegalStateException();
    }

    private static void O(int[] iArr, int[] iArr2, C0483b c0483b, C0483b c0483b2) {
        I();
        byte[] v10 = v(iArr, 7);
        byte[] v11 = v(iArr2, 5);
        C0483b[] G = G(c0483b, 8);
        H(c0483b2);
        int i10 = 446;
        while (true) {
            byte b10 = v10[i10];
            boolean z10 = false;
            if (b10 != 0) {
                int i11 = b10 >> 31;
                A(i11 != 0, f27073g[(b10 ^ i11) >>> 1], c0483b2);
            }
            byte b11 = v11[i10];
            if (b11 != 0) {
                int i12 = b11 >> 31;
                int i13 = (b11 ^ i12) >>> 1;
                if (i12 != 0) {
                    z10 = true;
                }
                A(z10, G[i13], c0483b2);
            }
            i10--;
            if (i10 < 0) {
                return;
            }
            D(c0483b2);
        }
    }

    public static void P(byte[] bArr, int i10, byte[] bArr2, int i11, byte[] bArr3, byte[] bArr4, int i12, int i13, byte[] bArr5, int i14) {
        x(bArr, i10, bArr2, i11, bArr3, (byte) 0, bArr4, i12, i13, bArr5, i14);
    }

    public static void Q(byte[] bArr, int i10, byte[] bArr2, int i11, byte[] bArr3, byte[] bArr4, int i12, byte[] bArr5, int i13) {
        x(bArr, i10, bArr2, i11, bArr3, (byte) 1, bArr4, i12, 64, bArr5, i13);
    }

    public static boolean R(byte[] bArr, int i10, byte[] bArr2, int i11, byte[] bArr3, byte[] bArr4, int i12, int i13) {
        return y(bArr, i10, bArr2, i11, bArr3, (byte) 0, bArr4, i12, i13);
    }

    private static byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int[] iArr = new int[28];
        n(bArr, 0, iArr);
        int[] iArr2 = new int[14];
        n(bArr2, 0, iArr2);
        int[] iArr3 = new int[14];
        n(bArr3, 0, iArr3);
        n.D(14, iArr2, iArr3, iArr);
        byte[] bArr4 = new byte[114];
        for (int i10 = 0; i10 < 28; i10++) {
            q(iArr[i10], bArr4, i10 * 4);
        }
        return K(bArr4);
    }

    private static boolean b(byte[] bArr) {
        return bArr != null && bArr.length < 256;
    }

    private static int c(int[] iArr, int[] iArr2) {
        int[] g10 = d.g();
        int[] g11 = d.g();
        int[] g12 = d.g();
        d.H(iArr, g11);
        d.H(iArr2, g12);
        d.A(g11, g12, g10);
        d.a(g11, g12, g11);
        d.z(g10, 39081, g10);
        d.K(g10);
        d.a(g10, g11, g10);
        d.C(g10);
        return d.x(g10);
    }

    private static int d(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] g10 = d.g();
        int[] g11 = d.g();
        int[] g12 = d.g();
        int[] g13 = d.g();
        d.H(iArr, g11);
        d.H(iArr2, g12);
        d.H(iArr3, g13);
        d.A(g11, g12, g10);
        d.a(g11, g12, g11);
        d.A(g11, g13, g11);
        d.H(g13, g13);
        d.z(g10, 39081, g10);
        d.J(g10, g13, g10);
        d.a(g10, g11, g10);
        d.C(g10);
        return d.x(g10);
    }

    private static boolean e(byte[] bArr) {
        if ((bArr[56] & Byte.MAX_VALUE) != 0) {
            return false;
        }
        int[] iArr = new int[14];
        l(bArr, 0, iArr, 0, 14);
        return !n.u(14, iArr, f27068b);
    }

    private static boolean f(byte[] bArr, int[] iArr) {
        if (bArr[56] != 0) {
            return false;
        }
        n(bArr, 0, iArr);
        return !n.u(14, iArr, f27069c);
    }

    private static byte[] g(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return bArr2;
    }

    private static j0 h() {
        return new c0((int) PSKKeyManager.MAX_KEY_LENGTH_BYTES);
    }

    private static int i(byte[] bArr, int i10) {
        return ((bArr[i10 + 1] & 255) << 8) | (bArr[i10] & 255);
    }

    private static int j(byte[] bArr, int i10) {
        int i11 = i10 + 1;
        return ((bArr[i11 + 1] & 255) << 16) | (bArr[i10] & 255) | ((bArr[i11] & 255) << 8);
    }

    private static int k(byte[] bArr, int i10) {
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        return (bArr[i12 + 1] << 24) | (bArr[i10] & 255) | ((bArr[i11] & 255) << 8) | ((bArr[i12] & 255) << 16);
    }

    private static void l(byte[] bArr, int i10, int[] iArr, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            iArr[i11 + i13] = k(bArr, (i13 * 4) + i10);
        }
    }

    private static boolean m(byte[] bArr, int i10, boolean z10, C0483b c0483b) {
        byte[] g10 = g(bArr, i10, 57);
        boolean z11 = false;
        if (!e(g10)) {
            return false;
        }
        int i11 = (g10[56] & 128) >>> 7;
        g10[56] = (byte) (g10[56] & Byte.MAX_VALUE);
        d.j(g10, 0, c0483b.f27076b);
        int[] g11 = d.g();
        int[] g12 = d.g();
        d.H(c0483b.f27076b, g11);
        d.z(g11, 39081, g12);
        d.B(g11, g11);
        d.b(g11);
        d.b(g12);
        if (!d.I(g11, g12, c0483b.f27075a)) {
            return false;
        }
        d.C(c0483b.f27075a);
        if (i11 == 1 && d.y(c0483b.f27075a)) {
            return false;
        }
        int[] iArr = c0483b.f27075a;
        if (i11 != (iArr[0] & 1)) {
            z11 = true;
        }
        if (z10 ^ z11) {
            d.B(iArr, iArr);
        }
        E(c0483b);
        return true;
    }

    private static void n(byte[] bArr, int i10, int[] iArr) {
        l(bArr, i10, iArr, 0, 14);
    }

    private static void o(j0 j0Var, byte b10, byte[] bArr) {
        byte[] bArr2 = f27067a;
        int length = bArr2.length;
        int i10 = length + 2;
        int length2 = bArr.length + i10;
        byte[] bArr3 = new byte[length2];
        System.arraycopy(bArr2, 0, bArr3, 0, length);
        bArr3[length] = b10;
        bArr3[length + 1] = (byte) bArr.length;
        System.arraycopy(bArr, 0, bArr3, i10, bArr.length);
        j0Var.update(bArr3, 0, length2);
    }

    private static void p(int i10, byte[] bArr, int i11) {
        bArr[i11] = (byte) i10;
        int i12 = i11 + 1;
        bArr[i12] = (byte) (i10 >>> 8);
        bArr[i12 + 1] = (byte) (i10 >>> 16);
    }

    private static void q(int i10, byte[] bArr, int i11) {
        bArr[i11] = (byte) i10;
        int i12 = i11 + 1;
        bArr[i12] = (byte) (i10 >>> 8);
        int i13 = i12 + 1;
        bArr[i13] = (byte) (i10 >>> 16);
        bArr[i13 + 1] = (byte) (i10 >>> 24);
    }

    private static void r(long j10, byte[] bArr, int i10) {
        q((int) j10, bArr, i10);
        p((int) (j10 >>> 32), bArr, i10 + 4);
    }

    private static int s(C0483b c0483b, byte[] bArr, int i10) {
        int[] g10 = d.g();
        int[] g11 = d.g();
        d.v(c0483b.f27077c, g11);
        d.A(c0483b.f27075a, g11, g10);
        d.A(c0483b.f27076b, g11, g11);
        d.C(g10);
        d.C(g11);
        int c10 = c(g10, g11);
        d.p(g11, bArr, i10);
        bArr[(i10 + 57) - 1] = (byte) ((g10[0] & 1) << 7);
        return c10;
    }

    public static void t(SecureRandom secureRandom, byte[] bArr) {
        secureRandom.nextBytes(bArr);
    }

    public static void u(byte[] bArr, int i10, byte[] bArr2, int i11) {
        j0 h10 = h();
        byte[] bArr3 = new byte[114];
        h10.update(bArr, i10, 57);
        h10.c(bArr3, 0, 114);
        byte[] bArr4 = new byte[57];
        J(bArr3, 0, bArr4);
        M(bArr4, bArr2, i11);
    }

    private static byte[] v(int[] iArr, int i10) {
        int[] iArr2 = new int[28];
        int i11 = 0;
        int i12 = 14;
        int i13 = 28;
        int i14 = 0;
        while (true) {
            i12--;
            if (i12 < 0) {
                break;
            }
            int i15 = iArr[i12];
            int i16 = i13 - 1;
            iArr2[i16] = (i14 << 16) | (i15 >>> 16);
            i13 = i16 - 1;
            iArr2[i13] = i15;
            i14 = i15;
        }
        byte[] bArr = new byte[447];
        int i17 = 32 - i10;
        int i18 = 0;
        int i19 = 0;
        while (i11 < 28) {
            int i20 = iArr2[i11];
            while (i18 < 16) {
                int i21 = i20 >>> i18;
                if ((i21 & 1) == i19) {
                    i18++;
                } else {
                    int i22 = (i21 | 1) << i17;
                    bArr[(i11 << 4) + i18] = (byte) (i22 >> i17);
                    i18 += i10;
                    i19 = i22 >>> 31;
                }
            }
            i11++;
            i18 -= 16;
        }
        return bArr;
    }

    private static void w(j0 j0Var, byte[] bArr, byte[] bArr2, byte[] bArr3, int i10, byte[] bArr4, byte b10, byte[] bArr5, int i11, int i12, byte[] bArr6, int i13) {
        o(j0Var, b10, bArr4);
        j0Var.update(bArr, 57, 57);
        j0Var.update(bArr5, i11, i12);
        j0Var.c(bArr, 0, bArr.length);
        byte[] K = K(bArr);
        byte[] bArr7 = new byte[57];
        M(K, bArr7, 0);
        o(j0Var, b10, bArr4);
        j0Var.update(bArr7, 0, 57);
        j0Var.update(bArr3, i10, 57);
        j0Var.update(bArr5, i11, i12);
        j0Var.c(bArr, 0, bArr.length);
        byte[] a10 = a(K, K(bArr), bArr2);
        System.arraycopy(bArr7, 0, bArr6, i13, 57);
        System.arraycopy(a10, 0, bArr6, i13 + 57, 57);
    }

    private static void x(byte[] bArr, int i10, byte[] bArr2, int i11, byte[] bArr3, byte b10, byte[] bArr4, int i12, int i13, byte[] bArr5, int i14) {
        if (b(bArr3)) {
            j0 h10 = h();
            byte[] bArr6 = new byte[114];
            h10.update(bArr, i10, 57);
            h10.c(bArr6, 0, 114);
            byte[] bArr7 = new byte[57];
            J(bArr6, 0, bArr7);
            w(h10, bArr6, bArr7, bArr2, i11, bArr3, b10, bArr4, i12, i13, bArr5, i14);
            return;
        }
        throw new IllegalArgumentException("ctx");
    }

    private static boolean y(byte[] bArr, int i10, byte[] bArr2, int i11, byte[] bArr3, byte b10, byte[] bArr4, int i12, int i13) {
        if (b(bArr3)) {
            byte[] g10 = g(bArr, i10, 57);
            byte[] g11 = g(bArr, i10 + 57, 57);
            if (!e(g10)) {
                return false;
            }
            int[] iArr = new int[14];
            if (!f(g11, iArr)) {
                return false;
            }
            C0483b c0483b = new C0483b();
            if (!m(bArr2, i11, true, c0483b)) {
                return false;
            }
            j0 h10 = h();
            byte[] bArr5 = new byte[114];
            o(h10, b10, bArr3);
            h10.update(g10, 0, 57);
            h10.update(bArr2, i11, 57);
            h10.update(bArr4, i12, i13);
            h10.c(bArr5, 0, 114);
            int[] iArr2 = new int[14];
            n(K(bArr5), 0, iArr2);
            C0483b c0483b2 = new C0483b();
            O(iArr, iArr2, c0483b, c0483b2);
            byte[] bArr6 = new byte[57];
            return s(c0483b2, bArr6, 0) != 0 && ak.a.c(bArr6, g10);
        }
        throw new IllegalArgumentException("ctx");
    }

    private static void z(c cVar, C0483b c0483b) {
        int[] g10 = d.g();
        int[] g11 = d.g();
        int[] g12 = d.g();
        int[] g13 = d.g();
        int[] g14 = d.g();
        int[] g15 = d.g();
        int[] g16 = d.g();
        d.H(c0483b.f27077c, g10);
        d.A(cVar.f27078a, c0483b.f27075a, g11);
        d.A(cVar.f27079b, c0483b.f27076b, g12);
        d.A(g11, g12, g13);
        d.z(g13, 39081, g13);
        d.a(g10, g13, g14);
        d.J(g10, g13, g15);
        d.a(cVar.f27078a, cVar.f27079b, g10);
        d.a(c0483b.f27075a, c0483b.f27076b, g13);
        d.A(g10, g13, g16);
        d.a(g12, g11, g10);
        d.J(g12, g11, g13);
        d.c(g10);
        d.J(g16, g10, g16);
        d.A(g16, c0483b.f27077c, g16);
        d.A(g13, c0483b.f27077c, g13);
        d.A(g14, g16, c0483b.f27075a);
        d.A(g13, g15, c0483b.f27076b);
        d.A(g14, g15, c0483b.f27077c);
    }
}
