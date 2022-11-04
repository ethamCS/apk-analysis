package j7;

import h6.v;
import h7.h;
import h7.j;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a */
    private static final int[] f14038a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f14039a;

        static {
            int[] iArr = new int[h.values().length];
            f14039a = iArr;
            try {
                iArr[h.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14039a[h.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14039a[h.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14039a[h.KANJI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static void a(String str, o6.a aVar, String str2) {
        try {
            for (byte b10 : str.getBytes(str2)) {
                aVar.d(b10, 8);
            }
        } catch (UnsupportedEncodingException e10) {
            throw new v(e10);
        }
    }

    static void b(CharSequence charSequence, o6.a aVar) {
        int length = charSequence.length();
        int i10 = 0;
        while (i10 < length) {
            int p10 = p(charSequence.charAt(i10));
            if (p10 == -1) {
                throw new v();
            }
            int i11 = i10 + 1;
            if (i11 < length) {
                int p11 = p(charSequence.charAt(i11));
                if (p11 == -1) {
                    throw new v();
                }
                aVar.d((p10 * 45) + p11, 11);
                i10 += 2;
            } else {
                aVar.d(p10, 6);
                i10 = i11;
            }
        }
    }

    static void c(String str, h hVar, o6.a aVar, String str2) {
        int i10 = a.f14039a[hVar.ordinal()];
        if (i10 == 1) {
            h(str, aVar);
        } else if (i10 == 2) {
            b(str, aVar);
        } else if (i10 == 3) {
            a(str, aVar, str2);
        } else if (i10 != 4) {
            throw new v("Invalid mode: ".concat(String.valueOf(hVar)));
        } else {
            e(str, aVar);
        }
    }

    private static void d(o6.d dVar, o6.a aVar) {
        aVar.d(h.ECI.g(), 4);
        aVar.d(dVar.h(), 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003c A[LOOP:0: B:6:0x000f->B:19:0x003c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static void e(java.lang.String r6, o6.a r7) {
        /*
            java.lang.String r0 = "Shift_JIS"
            byte[] r6 = r6.getBytes(r0)     // Catch: java.io.UnsupportedEncodingException -> L5c
            int r0 = r6.length
            int r0 = r0 % 2
            if (r0 != 0) goto L54
            int r0 = r6.length
            int r0 = r0 + (-1)
            r1 = 0
        Lf:
            if (r1 >= r0) goto L53
            r2 = r6[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r1 + 1
            r3 = r6[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            r2 = r2 | r3
            r3 = 33088(0x8140, float:4.6366E-41)
            r4 = -1
            if (r2 < r3) goto L2b
            r5 = 40956(0x9ffc, float:5.7392E-41)
            if (r2 > r5) goto L2b
        L29:
            int r2 = r2 - r3
            goto L3a
        L2b:
            r3 = 57408(0xe040, float:8.0446E-41)
            if (r2 < r3) goto L39
            r3 = 60351(0xebbf, float:8.457E-41)
            if (r2 > r3) goto L39
            r3 = 49472(0xc140, float:6.9325E-41)
            goto L29
        L39:
            r2 = r4
        L3a:
            if (r2 == r4) goto L4b
            int r3 = r2 >> 8
            int r3 = r3 * 192
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r3 + r2
            r2 = 13
            r7.d(r3, r2)
            int r1 = r1 + 2
            goto Lf
        L4b:
            h6.v r6 = new h6.v
            java.lang.String r7 = "Invalid byte sequence"
            r6.<init>(r7)
            throw r6
        L53:
            return
        L54:
            h6.v r6 = new h6.v
            java.lang.String r7 = "Kanji byte size not even"
            r6.<init>(r7)
            throw r6
        L5c:
            r6 = move-exception
            h6.v r7 = new h6.v
            r7.<init>(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: j7.c.e(java.lang.String, o6.a):void");
    }

    static void f(int i10, j jVar, h hVar, o6.a aVar) {
        int h10 = hVar.h(jVar);
        int i11 = 1 << h10;
        if (i10 < i11) {
            aVar.d(i10, h10);
            return;
        }
        throw new v(i10 + " is bigger than " + (i11 - 1));
    }

    static void g(h hVar, o6.a aVar) {
        aVar.d(hVar.g(), 4);
    }

    static void h(CharSequence charSequence, o6.a aVar) {
        int length = charSequence.length();
        int i10 = 0;
        while (i10 < length) {
            int charAt = charSequence.charAt(i10) - '0';
            int i11 = i10 + 2;
            if (i11 < length) {
                aVar.d((charAt * 100) + ((charSequence.charAt(i10 + 1) - '0') * 10) + (charSequence.charAt(i11) - '0'), 10);
                i10 += 3;
            } else {
                i10++;
                if (i10 < length) {
                    aVar.d((charAt * 10) + (charSequence.charAt(i10) - '0'), 7);
                    i10 = i11;
                } else {
                    aVar.d(charAt, 4);
                }
            }
        }
    }

    private static int i(h hVar, o6.a aVar, o6.a aVar2, j jVar) {
        return aVar.l() + hVar.h(jVar) + aVar2.l();
    }

    private static int j(b bVar) {
        return d.a(bVar) + d.c(bVar) + d.d(bVar) + d.e(bVar);
    }

    private static int k(o6.a aVar, h7.f fVar, j jVar, b bVar) {
        int i10 = Integer.MAX_VALUE;
        int i11 = -1;
        for (int i12 = 0; i12 < 8; i12++) {
            e.a(aVar, fVar, jVar, i12, bVar);
            int j10 = j(bVar);
            if (j10 < i10) {
                i11 = i12;
                i10 = j10;
            }
        }
        return i11;
    }

    private static h l(String str, String str2) {
        if (!"Shift_JIS".equals(str2) || !s(str)) {
            boolean z10 = false;
            boolean z11 = false;
            for (int i10 = 0; i10 < str.length(); i10++) {
                char charAt = str.charAt(i10);
                if (charAt >= '0' && charAt <= '9') {
                    z11 = true;
                } else if (p(charAt) == -1) {
                    return h.BYTE;
                } else {
                    z10 = true;
                }
            }
            return z10 ? h.ALPHANUMERIC : z11 ? h.NUMERIC : h.BYTE;
        }
        return h.KANJI;
    }

    private static j m(int i10, h7.f fVar) {
        for (int i11 = 1; i11 <= 40; i11++) {
            j i12 = j.i(i11);
            if (v(i10, i12, fVar)) {
                return i12;
            }
        }
        throw new v("Data too big");
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00fc, code lost:
        if (j7.f.b(r9) != false) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static j7.f n(java.lang.String r7, h7.f r8, java.util.Map<h6.g, ?> r9) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j7.c.n(java.lang.String, h7.f, java.util.Map):j7.f");
    }

    static byte[] o(byte[] bArr, int i10) {
        int length = bArr.length;
        int[] iArr = new int[length + i10];
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = bArr[i11] & 255;
        }
        new q6.d(q6.a.f19677l).b(iArr, i10);
        byte[] bArr2 = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr2[i12] = (byte) iArr[length + i12];
        }
        return bArr2;
    }

    static int p(int i10) {
        int[] iArr = f14038a;
        if (i10 < iArr.length) {
            return iArr[i10];
        }
        return -1;
    }

    static void q(int i10, int i11, int i12, int i13, int[] iArr, int[] iArr2) {
        if (i13 < i12) {
            int i14 = i10 % i12;
            int i15 = i12 - i14;
            int i16 = i10 / i12;
            int i17 = i16 + 1;
            int i18 = i11 / i12;
            int i19 = i18 + 1;
            int i20 = i16 - i18;
            int i21 = i17 - i19;
            if (i20 != i21) {
                throw new v("EC bytes mismatch");
            }
            if (i12 != i15 + i14) {
                throw new v("RS blocks mismatch");
            }
            if (i10 != ((i18 + i20) * i15) + ((i19 + i21) * i14)) {
                throw new v("Total bytes mismatch");
            }
            if (i13 < i15) {
                iArr[0] = i18;
                iArr2[0] = i20;
                return;
            }
            iArr[0] = i19;
            iArr2[0] = i21;
            return;
        }
        throw new v("Block ID too large");
    }

    static o6.a r(o6.a aVar, int i10, int i11, int i12) {
        if (aVar.m() == i11) {
            ArrayList<j7.a> arrayList = new ArrayList(i12);
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < i12; i16++) {
                int[] iArr = new int[1];
                int[] iArr2 = new int[1];
                q(i10, i11, i12, i16, iArr, iArr2);
                int i17 = iArr[0];
                byte[] bArr = new byte[i17];
                aVar.w(i13 << 3, bArr, 0, i17);
                byte[] o10 = o(bArr, iArr2[0]);
                arrayList.add(new j7.a(bArr, o10));
                i14 = Math.max(i14, i17);
                i15 = Math.max(i15, o10.length);
                i13 += iArr[0];
            }
            if (i11 != i13) {
                throw new v("Data bytes does not match offset");
            }
            o6.a aVar2 = new o6.a();
            for (int i18 = 0; i18 < i14; i18++) {
                for (j7.a aVar3 : arrayList) {
                    byte[] a10 = aVar3.a();
                    if (i18 < a10.length) {
                        aVar2.d(a10[i18], 8);
                    }
                }
            }
            for (int i19 = 0; i19 < i15; i19++) {
                for (j7.a aVar4 : arrayList) {
                    byte[] b10 = aVar4.b();
                    if (i19 < b10.length) {
                        aVar2.d(b10[i19], 8);
                    }
                }
            }
            if (i10 == aVar2.m()) {
                return aVar2;
            }
            throw new v("Interleaving error: " + i10 + " and " + aVar2.m() + " differ.");
        }
        throw new v("Number of bits and data bytes does not match");
    }

    private static boolean s(String str) {
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            if (length % 2 != 0) {
                return false;
            }
            for (int i10 = 0; i10 < length; i10 += 2) {
                int i11 = bytes[i10] & 255;
                if ((i11 < 129 || i11 > 159) && (i11 < 224 || i11 > 235)) {
                    return false;
                }
            }
            return true;
        } catch (UnsupportedEncodingException unused) {
            return false;
        }
    }

    private static j t(h7.f fVar, h hVar, o6.a aVar, o6.a aVar2) {
        return m(i(hVar, aVar, aVar2, m(i(hVar, aVar, aVar2, j.i(1)), fVar)), fVar);
    }

    static void u(int i10, o6.a aVar) {
        int i11 = i10 << 3;
        if (aVar.l() > i11) {
            throw new v("data bits cannot fit in the QR Code" + aVar.l() + " > " + i11);
        }
        for (int i12 = 0; i12 < 4 && aVar.l() < i11; i12++) {
            aVar.a(false);
        }
        int l10 = aVar.l() & 7;
        if (l10 > 0) {
            while (l10 < 8) {
                aVar.a(false);
                l10++;
            }
        }
        int m10 = i10 - aVar.m();
        for (int i13 = 0; i13 < m10; i13++) {
            aVar.d((i13 & 1) == 0 ? 236 : 17, 8);
        }
        if (aVar.l() != i11) {
            throw new v("Bits size does not equal capacity");
        }
    }

    private static boolean v(int i10, j jVar, h7.f fVar) {
        return jVar.h() - jVar.f(fVar).d() >= (i10 + 7) / 8;
    }
}
