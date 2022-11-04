package zi;

import bj.h;
import bj.n;
import java.security.SecureRandom;
import java.util.Objects;
import nh.a0;
import org.bouncycastle.crypto.r;
import yi.a;
/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a */
    private static final byte[] f27042a = {83, 105, 103, 69, 100, 50, 53, 53, 49, 57, 32, 110, 111, 32, 69, 100, 50, 53, 53, 49, 57, 32, 99, 111, 108, 108, 105, 115, 105, 111, 110, 115};

    /* renamed from: b */
    private static final int[] f27043b = {-19, -1, -1, -1, -1, -1, -1, Integer.MAX_VALUE};

    /* renamed from: c */
    private static final int[] f27044c = {1559614445, 1477600026, -1560830762, 350157278, 0, 0, 0, 268435456};

    /* renamed from: d */
    private static final int[] f27045d = {52811034, 25909283, 8072341, 50637101, 13785486, 30858332, 20483199, 20966410, 43936626, 4379245};

    /* renamed from: e */
    private static final int[] f27046e = {40265304, 26843545, 6710886, 53687091, 13421772, 40265318, 26843545, 6710886, 53687091, 13421772};

    /* renamed from: f */
    private static final int[] f27047f = {56195235, 47411844, 25868126, 40503822, 57364, 58321048, 30416477, 31930572, 57760639, 10749657};

    /* renamed from: g */
    private static final int[] f27048g = {45281625, 27714825, 18181821, 13898781, 114729, 49533232, 60832955, 30306712, 48412415, 4722099};

    /* renamed from: h */
    private static final int[] f27049h = {23454386, 55429651, 2809210, 27797563, 229458, 31957600, 54557047, 27058993, 29715967, 9444199};

    /* renamed from: i */
    private static final Object f27050i = new Object();

    /* renamed from: j */
    private static d[] f27051j = null;

    /* renamed from: k */
    private static int[] f27052k = null;

    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a */
        int[] f27053a;

        /* renamed from: b */
        int[] f27054b;

        /* renamed from: c */
        int[] f27055c;

        /* renamed from: d */
        int[] f27056d;

        /* renamed from: e */
        int[] f27057e;

        private b() {
            this.f27053a = yi.b.h();
            this.f27054b = yi.b.h();
            this.f27055c = yi.b.h();
            this.f27056d = yi.b.h();
            this.f27057e = yi.b.h();
        }
    }

    /* loaded from: classes3.dex */
    public static class c {

        /* renamed from: a */
        int[] f27058a;

        /* renamed from: b */
        int[] f27059b;

        private c() {
            this.f27058a = yi.b.h();
            this.f27059b = yi.b.h();
        }
    }

    /* loaded from: classes3.dex */
    public static class d {

        /* renamed from: a */
        int[] f27060a;

        /* renamed from: b */
        int[] f27061b;

        /* renamed from: c */
        int[] f27062c;

        /* renamed from: d */
        int[] f27063d;

        private d() {
            this.f27060a = yi.b.h();
            this.f27061b = yi.b.h();
            this.f27062c = yi.b.h();
            this.f27063d = yi.b.h();
        }
    }

    /* loaded from: classes3.dex */
    public static class e {

        /* renamed from: a */
        int[] f27064a;

        /* renamed from: b */
        int[] f27065b;

        /* renamed from: c */
        int[] f27066c;

        private e() {
            this.f27064a = yi.b.h();
            this.f27065b = yi.b.h();
            this.f27066c = yi.b.h();
        }
    }

    private static void A(boolean z10, d dVar, d dVar2, d dVar3) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] h10 = yi.b.h();
        int[] h11 = yi.b.h();
        int[] h12 = yi.b.h();
        int[] h13 = yi.b.h();
        int[] h14 = yi.b.h();
        int[] h15 = yi.b.h();
        int[] h16 = yi.b.h();
        int[] h17 = yi.b.h();
        if (z10) {
            iArr4 = h12;
            iArr3 = h13;
            iArr2 = h15;
            iArr = h16;
        } else {
            iArr3 = h12;
            iArr4 = h13;
            iArr = h15;
            iArr2 = h16;
        }
        yi.b.c(dVar.f27061b, dVar.f27060a, h11, h10);
        yi.b.c(dVar2.f27061b, dVar2.f27060a, iArr4, iArr3);
        yi.b.z(h10, h12, h10);
        yi.b.z(h11, h13, h11);
        yi.b.z(dVar.f27063d, dVar2.f27063d, h12);
        yi.b.z(h12, f27048g, h12);
        yi.b.z(dVar.f27062c, dVar2.f27062c, h13);
        yi.b.a(h13, h13, h13);
        yi.b.c(h11, h10, h17, h14);
        yi.b.c(h13, h12, iArr2, iArr);
        yi.b.d(iArr2);
        yi.b.z(h14, h15, dVar3.f27060a);
        yi.b.z(h16, h17, dVar3.f27061b);
        yi.b.z(h15, h16, dVar3.f27062c);
        yi.b.z(h14, h17, dVar3.f27063d);
    }

    private static d B(b bVar) {
        d dVar = new d();
        yi.b.g(bVar.f27053a, 0, dVar.f27060a, 0);
        yi.b.g(bVar.f27054b, 0, dVar.f27061b, 0);
        yi.b.g(bVar.f27055c, 0, dVar.f27062c, 0);
        yi.b.z(bVar.f27056d, bVar.f27057e, dVar.f27063d);
        return dVar;
    }

    private static d C(c cVar) {
        d dVar = new d();
        yi.b.g(cVar.f27058a, 0, dVar.f27060a, 0);
        yi.b.g(cVar.f27059b, 0, dVar.f27061b, 0);
        H(dVar);
        return dVar;
    }

    private static d D(d dVar) {
        d dVar2 = new d();
        E(dVar, dVar2);
        return dVar2;
    }

    private static void E(d dVar, d dVar2) {
        yi.b.g(dVar.f27060a, 0, dVar2.f27060a, 0);
        yi.b.g(dVar.f27061b, 0, dVar2.f27061b, 0);
        yi.b.g(dVar.f27062c, 0, dVar2.f27062c, 0);
        yi.b.g(dVar.f27063d, 0, dVar2.f27063d, 0);
    }

    private static void F(b bVar) {
        int[] h10 = yi.b.h();
        int[] h11 = yi.b.h();
        int[] h12 = yi.b.h();
        int[] iArr = bVar.f27056d;
        int[] h13 = yi.b.h();
        int[] h14 = yi.b.h();
        int[] iArr2 = bVar.f27057e;
        yi.b.G(bVar.f27053a, h10);
        yi.b.G(bVar.f27054b, h11);
        yi.b.G(bVar.f27055c, h12);
        yi.b.a(h12, h12, h12);
        yi.b.c(h10, h11, iArr2, h14);
        yi.b.a(bVar.f27053a, bVar.f27054b, iArr);
        yi.b.G(iArr, iArr);
        yi.b.I(iArr2, iArr, iArr);
        yi.b.a(h12, h14, h13);
        yi.b.d(h13);
        yi.b.z(iArr, h13, bVar.f27053a);
        yi.b.z(h14, iArr2, bVar.f27054b);
        yi.b.z(h13, h14, bVar.f27055c);
    }

    private static void G(b bVar) {
        yi.b.C(bVar.f27055c);
        yi.b.g(bVar.f27053a, 0, bVar.f27056d, 0);
        yi.b.g(bVar.f27054b, 0, bVar.f27057e, 0);
    }

    private static void H(d dVar) {
        yi.b.C(dVar.f27062c);
        yi.b.z(dVar.f27060a, dVar.f27061b, dVar.f27063d);
    }

    private static void I(int i10, int i11, e eVar) {
        int i12 = i10 * 8 * 3 * 10;
        for (int i13 = 0; i13 < 8; i13++) {
            int i14 = ((i13 ^ i11) - 1) >> 31;
            yi.b.e(i14, f27052k, i12, eVar.f27064a, 0);
            int i15 = i12 + 10;
            yi.b.e(i14, f27052k, i15, eVar.f27065b, 0);
            int i16 = i15 + 10;
            yi.b.e(i14, f27052k, i16, eVar.f27066c, 0);
            i12 = i16 + 10;
        }
    }

    private static d[] J(d dVar, int i10) {
        d dVar2 = new d();
        A(false, dVar, dVar, dVar2);
        d[] dVarArr = new d[i10];
        dVarArr[0] = D(dVar);
        for (int i11 = 1; i11 < i10; i11++) {
            d dVar3 = dVarArr[i11 - 1];
            d dVar4 = new d();
            dVarArr[i11] = dVar4;
            A(false, dVar3, dVar2, dVar4);
        }
        return dVarArr;
    }

    private static void K(b bVar) {
        yi.b.K(bVar.f27053a);
        yi.b.C(bVar.f27054b);
        yi.b.C(bVar.f27055c);
        yi.b.K(bVar.f27056d);
        yi.b.C(bVar.f27057e);
    }

    private static void L(d dVar) {
        yi.b.K(dVar.f27060a);
        yi.b.C(dVar.f27061b);
        yi.b.C(dVar.f27062c);
        yi.b.K(dVar.f27063d);
    }

    public static void M() {
        int i10;
        synchronized (f27050i) {
            if (f27052k != null) {
                return;
            }
            d dVar = new d();
            int[] iArr = f27045d;
            yi.b.g(iArr, 0, dVar.f27060a, 0);
            int[] iArr2 = f27046e;
            yi.b.g(iArr2, 0, dVar.f27061b, 0);
            H(dVar);
            f27051j = J(dVar, 32);
            b bVar = new b();
            yi.b.g(iArr, 0, bVar.f27053a, 0);
            yi.b.g(iArr2, 0, bVar.f27054b, 0);
            G(bVar);
            f27052k = yi.b.i(192);
            int i11 = 0;
            for (int i12 = 0; i12 < 8; i12++) {
                d[] dVarArr = new d[4];
                d dVar2 = new d();
                L(dVar2);
                int i13 = 0;
                while (true) {
                    i10 = 1;
                    if (i13 >= 4) {
                        break;
                    }
                    A(true, dVar2, B(bVar), dVar2);
                    F(bVar);
                    dVarArr[i13] = B(bVar);
                    if (i12 + i13 != 10) {
                        while (i10 < 8) {
                            F(bVar);
                            i10++;
                        }
                    }
                    i13++;
                }
                d[] dVarArr2 = new d[8];
                dVarArr2[0] = dVar2;
                int i14 = 0;
                int i15 = 1;
                while (i14 < 3) {
                    int i16 = i10 << i14;
                    int i17 = 0;
                    while (i17 < i16) {
                        d dVar3 = dVarArr2[i15 - i16];
                        d dVar4 = dVarArr[i14];
                        d dVar5 = new d();
                        dVarArr2[i15] = dVar5;
                        A(false, dVar3, dVar4, dVar5);
                        i17++;
                        i15++;
                    }
                    i14++;
                    i10 = 1;
                }
                int[] i18 = yi.b.i(8);
                int[] h10 = yi.b.h();
                yi.b.g(dVarArr2[0].f27062c, 0, h10, 0);
                yi.b.g(h10, 0, i18, 0);
                int i19 = 0;
                while (true) {
                    i19++;
                    if (i19 >= 8) {
                        break;
                    }
                    yi.b.z(h10, dVarArr2[i19].f27062c, h10);
                    yi.b.g(h10, 0, i18, i19 * 10);
                }
                yi.b.a(h10, h10, h10);
                yi.b.v(h10, h10);
                int i20 = i19 - 1;
                int[] h11 = yi.b.h();
                while (i20 > 0) {
                    int i21 = i20 - 1;
                    yi.b.g(i18, i21 * 10, h11, 0);
                    yi.b.z(h11, h10, h11);
                    yi.b.g(h11, 0, i18, i20 * 10);
                    yi.b.z(h10, dVarArr2[i20].f27062c, h10);
                    i20 = i21;
                }
                yi.b.g(h10, 0, i18, 0);
                for (int i22 = 0; i22 < 8; i22++) {
                    d dVar6 = dVarArr2[i22];
                    int[] h12 = yi.b.h();
                    int[] h13 = yi.b.h();
                    yi.b.g(i18, i22 * 10, h13, 0);
                    yi.b.z(dVar6.f27060a, h13, h12);
                    yi.b.z(dVar6.f27061b, h13, h13);
                    e eVar = new e();
                    yi.b.c(h13, h12, eVar.f27064a, eVar.f27065b);
                    yi.b.z(h12, h13, eVar.f27066c);
                    int[] iArr3 = eVar.f27066c;
                    yi.b.z(iArr3, f27049h, iArr3);
                    yi.b.B(eVar.f27064a);
                    yi.b.B(eVar.f27065b);
                    yi.b.g(eVar.f27064a, 0, f27052k, i11);
                    int i23 = i11 + 10;
                    yi.b.g(eVar.f27065b, 0, f27052k, i23);
                    int i24 = i23 + 10;
                    yi.b.g(eVar.f27066c, 0, f27052k, i24);
                    i11 = i24 + 10;
                }
            }
        }
    }

    private static void N(byte[] bArr, int i10, byte[] bArr2) {
        System.arraycopy(bArr, i10, bArr2, 0, 32);
        bArr2[0] = (byte) (bArr2[0] & 248);
        bArr2[31] = (byte) (bArr2[31] & Byte.MAX_VALUE);
        bArr2[31] = (byte) (bArr2[31] | 64);
    }

    private static byte[] O(byte[] bArr) {
        long i10 = (i(bArr, 4) << 4) & 4294967295L;
        long j10 = j(bArr, 7) & 4294967295L;
        long i11 = (i(bArr, 11) << 4) & 4294967295L;
        long j11 = j(bArr, 14) & 4294967295L;
        long i12 = (i(bArr, 18) << 4) & 4294967295L;
        long j12 = j(bArr, 21) & 4294967295L;
        long j13 = j(bArr, 28) & 4294967295L;
        long j14 = j(bArr, 49) & 4294967295L;
        long i13 = (i(bArr, 53) << 4) & 4294967295L;
        long j15 = j(bArr, 56) & 4294967295L;
        long i14 = (i(bArr, 60) << 4) & 4294967295L;
        long j16 = bArr[63] & 255;
        long i15 = ((i(bArr, 46) << 4) & 4294967295L) - (j16 * 5343);
        long j17 = i14 + (j15 >> 28);
        long j18 = j15 & 268435455;
        long i16 = (((i(bArr, 32) << 4) & 4294967295L) - (j16 * (-50998291))) - (j17 * 19280294);
        long j19 = ((j(bArr, 35) & 4294967295L) - (j16 * 19280294)) - (j17 * 127719000);
        long j20 = ((j(bArr, 42) & 4294967295L) - (j16 * (-6428113))) - (j17 * 5343);
        long i17 = ((((i(bArr, 39) << 4) & 4294967295L) - (j16 * 127719000)) - (j17 * (-6428113))) - (j18 * 5343);
        long j21 = i13 + (j14 >> 28);
        long j22 = j14 & 268435455;
        long j23 = (j19 - (j18 * (-6428113))) - (j21 * 5343);
        long j24 = ((i16 - (j18 * 127719000)) - (j21 * (-6428113))) - (j22 * 5343);
        long j25 = i15 + (j20 >> 28);
        long j26 = (j20 & 268435455) + (i17 >> 28);
        long j27 = (j11 - (j25 * (-50998291))) - (j26 * 19280294);
        long j28 = ((i12 - (j22 * (-50998291))) - (j25 * 19280294)) - (j26 * 127719000);
        long i18 = ((((((i(bArr, 25) << 4) & 4294967295L) - (j18 * (-50998291))) - (j21 * 19280294)) - (j22 * 127719000)) - (j25 * (-6428113))) - (j26 * 5343);
        long j29 = (i17 & 268435455) + (j23 >> 28);
        long j30 = (i11 - (j26 * (-50998291))) - (j29 * 19280294);
        long j31 = j27 - (j29 * 127719000);
        long j32 = ((((j12 - (j21 * (-50998291))) - (j22 * 19280294)) - (j25 * 127719000)) - (j26 * (-6428113))) - (j29 * 5343);
        long j33 = (j23 & 268435455) + (j24 >> 28);
        long j34 = j24 & 268435455;
        long j35 = i10 - (j33 * (-50998291));
        long j36 = (j10 - (j29 * (-50998291))) - (j33 * 19280294);
        long j37 = j30 - (j33 * 127719000);
        long j38 = j31 - (j33 * (-6428113));
        long j39 = (j28 - (j29 * (-6428113))) - (j33 * 5343);
        long j40 = (((((j13 - (j17 * (-50998291))) - (j18 * 19280294)) - (j21 * 127719000)) - (j22 * (-6428113))) - (j25 * 5343)) + (i18 >> 28);
        long j41 = j40 & 268435455;
        long j42 = j41 >>> 27;
        long j43 = j34 + (j40 >> 28) + j42;
        long j44 = (j(bArr, 0) & 4294967295L) - (j43 * (-50998291));
        long j45 = (j35 - (j43 * 19280294)) + (j44 >> 28);
        long j46 = j44 & 268435455;
        long j47 = (j36 - (j43 * 127719000)) + (j45 >> 28);
        long j48 = (j37 - (j43 * (-6428113))) + (j47 >> 28);
        long j49 = (j38 - (j43 * 5343)) + (j48 >> 28);
        long j50 = j39 + (j49 >> 28);
        long j51 = j49 & 268435455;
        long j52 = j32 + (j50 >> 28);
        long j53 = (i18 & 268435455) + (j52 >> 28);
        long j54 = j41 + (j53 >> 28);
        long j55 = (j54 >> 28) - j42;
        long j56 = j46 + (j55 & (-50998291));
        long j57 = (j45 & 268435455) + (j55 & 19280294) + (j56 >> 28);
        long j58 = (j47 & 268435455) + (j55 & 127719000) + (j57 >> 28);
        long j59 = (j48 & 268435455) + (j55 & (-6428113)) + (j58 >> 28);
        long j60 = j51 + (j55 & 5343) + (j59 >> 28);
        long j61 = (j50 & 268435455) + (j60 >> 28);
        long j62 = (j52 & 268435455) + (j61 >> 28);
        long j63 = (j53 & 268435455) + (j62 >> 28);
        byte[] bArr2 = new byte[32];
        q((j56 & 268435455) | ((j57 & 268435455) << 28), bArr2, 0);
        q(((j59 & 268435455) << 28) | (j58 & 268435455), bArr2, 7);
        q((j60 & 268435455) | ((j61 & 268435455) << 28), bArr2, 14);
        q((j62 & 268435455) | ((j63 & 268435455) << 28), bArr2, 21);
        p((int) ((j54 & 268435455) + (j63 >> 28)), bArr2, 28);
        return bArr2;
    }

    private static void P(byte[] bArr, b bVar) {
        M();
        int[] iArr = new int[8];
        m(bArr, 0, iArr);
        n.h(8, (~iArr[0]) & 1, iArr, f27044c, iArr);
        n.F(8, iArr, 1);
        for (int i10 = 0; i10 < 8; i10++) {
            iArr[i10] = bj.b.f(iArr[i10]);
        }
        e eVar = new e();
        K(bVar);
        int i11 = 28;
        while (true) {
            for (int i12 = 0; i12 < 8; i12++) {
                int i13 = iArr[i12] >>> i11;
                int i14 = (i13 >>> 3) & 1;
                I(i12, (i13 ^ (-i14)) & 7, eVar);
                yi.b.j(i14, eVar.f27064a, eVar.f27065b);
                yi.b.f(i14, eVar.f27066c);
                y(eVar, bVar);
            }
            i11 -= 4;
            if (i11 < 0) {
                return;
            }
            F(bVar);
        }
    }

    private static void Q(byte[] bArr, byte[] bArr2, int i10) {
        b bVar = new b();
        P(bArr, bVar);
        if (r(bVar, bArr2, i10) != 0) {
            return;
        }
        throw new IllegalStateException();
    }

    public static void R(a.C0464a c0464a, byte[] bArr, int i10, int[] iArr, int[] iArr2) {
        Objects.requireNonNull(c0464a, "This method is only for use by X25519");
        byte[] bArr2 = new byte[32];
        N(bArr, i10, bArr2);
        b bVar = new b();
        P(bArr2, bVar);
        if (d(bVar.f27053a, bVar.f27054b, bVar.f27055c) != 0) {
            yi.b.g(bVar.f27054b, 0, iArr, 0);
            yi.b.g(bVar.f27055c, 0, iArr2, 0);
            return;
        }
        throw new IllegalStateException();
    }

    private static void S(int[] iArr, int[] iArr2, c cVar, b bVar) {
        M();
        byte[] u10 = u(iArr, 7);
        byte[] u11 = u(iArr2, 5);
        d[] J = J(C(cVar), 8);
        K(bVar);
        int i10 = 252;
        while (true) {
            byte b10 = u10[i10];
            boolean z10 = false;
            if (b10 != 0) {
                int i11 = b10 >> 31;
                z(i11 != 0, f27051j[(b10 ^ i11) >>> 1], bVar);
            }
            byte b11 = u11[i10];
            if (b11 != 0) {
                int i12 = b11 >> 31;
                int i13 = (b11 ^ i12) >>> 1;
                if (i12 != 0) {
                    z10 = true;
                }
                z(z10, J[i13], bVar);
            }
            i10--;
            if (i10 < 0) {
                return;
            }
            F(bVar);
        }
    }

    public static void T(byte[] bArr, int i10, byte[] bArr2, int i11, byte[] bArr3, int i12, int i13, byte[] bArr4, int i14) {
        w(bArr, i10, bArr2, i11, null, (byte) 0, bArr3, i12, i13, bArr4, i14);
    }

    public static void U(byte[] bArr, int i10, byte[] bArr2, int i11, byte[] bArr3, byte[] bArr4, int i12, int i13, byte[] bArr5, int i14) {
        w(bArr, i10, bArr2, i11, bArr3, (byte) 0, bArr4, i12, i13, bArr5, i14);
    }

    public static void V(byte[] bArr, int i10, byte[] bArr2, int i11, byte[] bArr3, byte[] bArr4, int i12, byte[] bArr5, int i13) {
        w(bArr, i10, bArr2, i11, bArr3, (byte) 1, bArr4, i12, 64, bArr5, i13);
    }

    public static boolean W(byte[] bArr, int i10, byte[] bArr2, int i11, byte[] bArr3, int i12, int i13) {
        return x(bArr, i10, bArr2, i11, null, (byte) 0, bArr3, i12, i13);
    }

    private static byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int[] iArr = new int[16];
        m(bArr, 0, iArr);
        int[] iArr2 = new int[8];
        m(bArr2, 0, iArr2);
        int[] iArr3 = new int[8];
        m(bArr3, 0, iArr3);
        h.C(iArr2, iArr3, iArr);
        byte[] bArr4 = new byte[64];
        for (int i10 = 0; i10 < 16; i10++) {
            p(iArr[i10], bArr4, i10 * 4);
        }
        return O(bArr4);
    }

    private static boolean b(byte[] bArr, byte b10) {
        return (bArr == null && b10 == 0) || (bArr != null && bArr.length < 256);
    }

    private static int c(int[] iArr, int[] iArr2) {
        int[] h10 = yi.b.h();
        int[] h11 = yi.b.h();
        int[] h12 = yi.b.h();
        yi.b.G(iArr, h11);
        yi.b.G(iArr2, h12);
        yi.b.z(h11, h12, h10);
        yi.b.I(h12, h11, h12);
        yi.b.z(h10, f27047f, h10);
        yi.b.b(h10);
        yi.b.I(h10, h12, h10);
        yi.b.B(h10);
        return yi.b.w(h10);
    }

    private static int d(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] h10 = yi.b.h();
        int[] h11 = yi.b.h();
        int[] h12 = yi.b.h();
        int[] h13 = yi.b.h();
        yi.b.G(iArr, h11);
        yi.b.G(iArr2, h12);
        yi.b.G(iArr3, h13);
        yi.b.z(h11, h12, h10);
        yi.b.I(h12, h11, h12);
        yi.b.z(h12, h13, h12);
        yi.b.G(h13, h13);
        yi.b.z(h10, f27047f, h10);
        yi.b.a(h10, h13, h10);
        yi.b.I(h10, h12, h10);
        yi.b.B(h10);
        return yi.b.w(h10);
    }

    private static boolean e(byte[] bArr) {
        int[] iArr = new int[8];
        k(bArr, 0, iArr, 0, 8);
        iArr[7] = iArr[7] & Integer.MAX_VALUE;
        return !h.s(iArr, f27043b);
    }

    private static boolean f(byte[] bArr, int[] iArr) {
        m(bArr, 0, iArr);
        return !h.s(iArr, f27044c);
    }

    private static byte[] g(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return bArr2;
    }

    private static r h() {
        return new a0();
    }

    private static int i(byte[] bArr, int i10) {
        int i11 = i10 + 1;
        return ((bArr[i11 + 1] & 255) << 16) | (bArr[i10] & 255) | ((bArr[i11] & 255) << 8);
    }

    private static int j(byte[] bArr, int i10) {
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        return (bArr[i12 + 1] << 24) | (bArr[i10] & 255) | ((bArr[i11] & 255) << 8) | ((bArr[i12] & 255) << 16);
    }

    private static void k(byte[] bArr, int i10, int[] iArr, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            iArr[i11 + i13] = j(bArr, (i13 * 4) + i10);
        }
    }

    private static boolean l(byte[] bArr, int i10, boolean z10, c cVar) {
        byte[] g10 = g(bArr, i10, 32);
        boolean z11 = false;
        if (!e(g10)) {
            return false;
        }
        int i11 = (g10[31] & 128) >>> 7;
        g10[31] = (byte) (g10[31] & Byte.MAX_VALUE);
        yi.b.k(g10, 0, cVar.f27059b);
        int[] h10 = yi.b.h();
        int[] h11 = yi.b.h();
        yi.b.G(cVar.f27059b, h10);
        yi.b.z(f27047f, h10, h11);
        yi.b.J(h10);
        yi.b.b(h11);
        if (!yi.b.H(h10, h11, cVar.f27058a)) {
            return false;
        }
        yi.b.B(cVar.f27058a);
        if (i11 == 1 && yi.b.x(cVar.f27058a)) {
            return false;
        }
        int[] iArr = cVar.f27058a;
        if (i11 != (iArr[0] & 1)) {
            z11 = true;
        }
        if (z10 ^ z11) {
            yi.b.A(iArr, iArr);
        }
        return true;
    }

    private static void m(byte[] bArr, int i10, int[] iArr) {
        k(bArr, i10, iArr, 0, 8);
    }

    private static void n(r rVar, byte b10, byte[] bArr) {
        if (bArr != null) {
            byte[] bArr2 = f27042a;
            int length = bArr2.length;
            int i10 = length + 2;
            int length2 = bArr.length + i10;
            byte[] bArr3 = new byte[length2];
            System.arraycopy(bArr2, 0, bArr3, 0, length);
            bArr3[length] = b10;
            bArr3[length + 1] = (byte) bArr.length;
            System.arraycopy(bArr, 0, bArr3, i10, bArr.length);
            rVar.update(bArr3, 0, length2);
        }
    }

    private static void o(int i10, byte[] bArr, int i11) {
        bArr[i11] = (byte) i10;
        int i12 = i11 + 1;
        bArr[i12] = (byte) (i10 >>> 8);
        bArr[i12 + 1] = (byte) (i10 >>> 16);
    }

    private static void p(int i10, byte[] bArr, int i11) {
        bArr[i11] = (byte) i10;
        int i12 = i11 + 1;
        bArr[i12] = (byte) (i10 >>> 8);
        int i13 = i12 + 1;
        bArr[i13] = (byte) (i10 >>> 16);
        bArr[i13 + 1] = (byte) (i10 >>> 24);
    }

    private static void q(long j10, byte[] bArr, int i10) {
        p((int) j10, bArr, i10);
        o((int) (j10 >>> 32), bArr, i10 + 4);
    }

    private static int r(b bVar, byte[] bArr, int i10) {
        int[] h10 = yi.b.h();
        int[] h11 = yi.b.h();
        yi.b.u(bVar.f27055c, h11);
        yi.b.z(bVar.f27053a, h11, h10);
        yi.b.z(bVar.f27054b, h11, h11);
        yi.b.B(h10);
        yi.b.B(h11);
        int c10 = c(h10, h11);
        yi.b.p(h11, bArr, i10);
        int i11 = (i10 + 32) - 1;
        bArr[i11] = (byte) (((h10[0] & 1) << 7) | bArr[i11]);
        return c10;
    }

    public static void s(SecureRandom secureRandom, byte[] bArr) {
        secureRandom.nextBytes(bArr);
    }

    public static void t(byte[] bArr, int i10, byte[] bArr2, int i11) {
        r h10 = h();
        byte[] bArr3 = new byte[h10.getDigestSize()];
        h10.update(bArr, i10, 32);
        h10.doFinal(bArr3, 0);
        byte[] bArr4 = new byte[32];
        N(bArr3, 0, bArr4);
        Q(bArr4, bArr2, i11);
    }

    private static byte[] u(int[] iArr, int i10) {
        int[] iArr2 = new int[16];
        int i11 = 0;
        int i12 = 8;
        int i13 = 16;
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
        byte[] bArr = new byte[253];
        int i17 = 32 - i10;
        int i18 = 0;
        int i19 = 0;
        while (i11 < 16) {
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

    private static void v(r rVar, byte[] bArr, byte[] bArr2, byte[] bArr3, int i10, byte[] bArr4, byte b10, byte[] bArr5, int i11, int i12, byte[] bArr6, int i13) {
        n(rVar, b10, bArr4);
        rVar.update(bArr, 32, 32);
        rVar.update(bArr5, i11, i12);
        rVar.doFinal(bArr, 0);
        byte[] O = O(bArr);
        byte[] bArr7 = new byte[32];
        Q(O, bArr7, 0);
        n(rVar, b10, bArr4);
        rVar.update(bArr7, 0, 32);
        rVar.update(bArr3, i10, 32);
        rVar.update(bArr5, i11, i12);
        rVar.doFinal(bArr, 0);
        byte[] a10 = a(O, O(bArr), bArr2);
        System.arraycopy(bArr7, 0, bArr6, i13, 32);
        System.arraycopy(a10, 0, bArr6, i13 + 32, 32);
    }

    private static void w(byte[] bArr, int i10, byte[] bArr2, int i11, byte[] bArr3, byte b10, byte[] bArr4, int i12, int i13, byte[] bArr5, int i14) {
        if (b(bArr3, b10)) {
            r h10 = h();
            byte[] bArr6 = new byte[h10.getDigestSize()];
            h10.update(bArr, i10, 32);
            h10.doFinal(bArr6, 0);
            byte[] bArr7 = new byte[32];
            N(bArr6, 0, bArr7);
            v(h10, bArr6, bArr7, bArr2, i11, bArr3, b10, bArr4, i12, i13, bArr5, i14);
            return;
        }
        throw new IllegalArgumentException("ctx");
    }

    private static boolean x(byte[] bArr, int i10, byte[] bArr2, int i11, byte[] bArr3, byte b10, byte[] bArr4, int i12, int i13) {
        if (b(bArr3, b10)) {
            byte[] g10 = g(bArr, i10, 32);
            byte[] g11 = g(bArr, i10 + 32, 32);
            if (!e(g10)) {
                return false;
            }
            int[] iArr = new int[8];
            if (!f(g11, iArr)) {
                return false;
            }
            c cVar = new c();
            if (!l(bArr2, i11, true, cVar)) {
                return false;
            }
            r h10 = h();
            byte[] bArr5 = new byte[h10.getDigestSize()];
            n(h10, b10, bArr3);
            h10.update(g10, 0, 32);
            h10.update(bArr2, i11, 32);
            h10.update(bArr4, i12, i13);
            h10.doFinal(bArr5, 0);
            int[] iArr2 = new int[8];
            m(O(bArr5), 0, iArr2);
            b bVar = new b();
            S(iArr, iArr2, cVar, bVar);
            byte[] bArr6 = new byte[32];
            return r(bVar, bArr6, 0) != 0 && ak.a.c(bArr6, g10);
        }
        throw new IllegalArgumentException("ctx");
    }

    private static void y(e eVar, b bVar) {
        int[] h10 = yi.b.h();
        int[] h11 = yi.b.h();
        int[] h12 = yi.b.h();
        int[] iArr = bVar.f27056d;
        int[] h13 = yi.b.h();
        int[] h14 = yi.b.h();
        int[] iArr2 = bVar.f27057e;
        yi.b.c(bVar.f27054b, bVar.f27053a, h11, h10);
        yi.b.z(h10, eVar.f27065b, h10);
        yi.b.z(h11, eVar.f27064a, h11);
        yi.b.z(bVar.f27056d, bVar.f27057e, h12);
        yi.b.z(h12, eVar.f27066c, h12);
        yi.b.c(h11, h10, iArr2, iArr);
        yi.b.c(bVar.f27055c, h12, h14, h13);
        yi.b.d(h14);
        yi.b.z(iArr, h13, bVar.f27053a);
        yi.b.z(h14, iArr2, bVar.f27054b);
        yi.b.z(h13, h14, bVar.f27055c);
    }

    private static void z(boolean z10, d dVar, b bVar) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] h10 = yi.b.h();
        int[] h11 = yi.b.h();
        int[] h12 = yi.b.h();
        int[] h13 = yi.b.h();
        int[] iArr5 = bVar.f27056d;
        int[] h14 = yi.b.h();
        int[] h15 = yi.b.h();
        int[] iArr6 = bVar.f27057e;
        if (z10) {
            iArr = h12;
            iArr4 = h13;
            iArr3 = h14;
            iArr2 = h15;
        } else {
            iArr4 = h12;
            iArr = h13;
            iArr2 = h14;
            iArr3 = h15;
        }
        yi.b.c(bVar.f27054b, bVar.f27053a, h11, h10);
        yi.b.c(dVar.f27061b, dVar.f27060a, iArr, iArr4);
        yi.b.z(h10, h12, h10);
        yi.b.z(h11, h13, h11);
        yi.b.z(bVar.f27056d, bVar.f27057e, h12);
        yi.b.z(h12, dVar.f27063d, h12);
        yi.b.z(h12, f27048g, h12);
        yi.b.z(bVar.f27055c, dVar.f27062c, h13);
        yi.b.a(h13, h13, h13);
        yi.b.c(h11, h10, iArr6, iArr5);
        yi.b.c(h13, h12, iArr3, iArr2);
        yi.b.d(iArr3);
        yi.b.z(iArr5, h14, bVar.f27053a);
        yi.b.z(h15, iArr6, bVar.f27054b);
        yi.b.z(h14, h15, bVar.f27055c);
    }
}
