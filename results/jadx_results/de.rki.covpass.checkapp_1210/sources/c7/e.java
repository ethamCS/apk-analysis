package c7;

import java.math.BigInteger;
import java.util.Arrays;
/* loaded from: classes.dex */
final class e {

    /* renamed from: a */
    private static final char[] f6333a = ";<>@[\\]_`~!\r\t,:\n-.$/\"|*()?{}'".toCharArray();

    /* renamed from: b */
    private static final char[] f6334b = "0123456789&\r\t,:#-.$/+%*=^".toCharArray();

    /* renamed from: c */
    private static final BigInteger[] f6335c;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f6336a;

        static {
            int[] iArr = new int[b.values().length];
            f6336a = iArr;
            try {
                iArr[b.ALPHA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6336a[b.LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6336a[b.MIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6336a[b.PUNCT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6336a[b.ALPHA_SHIFT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6336a[b.PUNCT_SHIFT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        ALPHA,
        LOWER,
        MIXED,
        PUNCT,
        ALPHA_SHIFT,
        PUNCT_SHIFT
    }

    static {
        BigInteger[] bigIntegerArr = new BigInteger[16];
        f6335c = bigIntegerArr;
        bigIntegerArr[0] = BigInteger.ONE;
        BigInteger valueOf = BigInteger.valueOf(900L);
        bigIntegerArr[1] = valueOf;
        int i10 = 2;
        while (true) {
            BigInteger[] bigIntegerArr2 = f6335c;
            if (i10 < bigIntegerArr2.length) {
                bigIntegerArr2[i10] = bigIntegerArr2[i10 - 1].multiply(valueOf);
                i10++;
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0045 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0021 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int a(int r16, int[] r17, java.nio.charset.Charset r18, int r19, java.lang.StringBuilder r20) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c7.e.a(int, int[], java.nio.charset.Charset, int, java.lang.StringBuilder):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static o6.e b(int[] r6, java.lang.String r7) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r6.length
            r2 = 1
            int r1 = r1 << r2
            r0.<init>(r1)
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.ISO_8859_1
            r2 = r6[r2]
            b7.c r3 = new b7.c
            r3.<init>()
            r4 = 2
        L12:
            r5 = 0
            r5 = r6[r5]
            if (r4 >= r5) goto L69
            r5 = 913(0x391, float:1.28E-42)
            if (r2 == r5) goto L54
            switch(r2) {
                case 900: goto L4f;
                case 901: goto L4a;
                case 902: goto L45;
                default: goto L1e;
            }
        L1e:
            switch(r2) {
                case 922: goto L40;
                case 923: goto L40;
                case 924: goto L4a;
                case 925: goto L3d;
                case 926: goto L3a;
                case 927: goto L29;
                case 928: goto L24;
                default: goto L21;
            }
        L21:
            int r4 = r4 + (-1)
            goto L4f
        L24:
            int r2 = d(r6, r4, r3)
            goto L5c
        L29:
            int r2 = r4 + 1
            r1 = r6[r4]
            o6.d r1 = o6.d.g(r1)
            java.lang.String r1 = r1.name()
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r1)
            goto L5c
        L3a:
            int r2 = r4 + 2
            goto L5c
        L3d:
            int r2 = r4 + 1
            goto L5c
        L40:
            h6.h r6 = h6.h.b()
            throw r6
        L45:
            int r2 = f(r6, r4, r0)
            goto L5c
        L4a:
            int r2 = a(r2, r6, r1, r4, r0)
            goto L5c
        L4f:
            int r2 = g(r6, r4, r0)
            goto L5c
        L54:
            int r2 = r4 + 1
            r4 = r6[r4]
            char r4 = (char) r4
            r0.append(r4)
        L5c:
            int r4 = r6.length
            if (r2 >= r4) goto L64
            int r4 = r2 + 1
            r2 = r6[r2]
            goto L12
        L64:
            h6.h r6 = h6.h.b()
            throw r6
        L69:
            int r6 = r0.length()
            if (r6 == 0) goto L7d
            o6.e r6 = new o6.e
            java.lang.String r0 = r0.toString()
            r1 = 0
            r6.<init>(r1, r0, r1, r7)
            r6.m(r3)
            return r6
        L7d:
            h6.h r6 = h6.h.b()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: c7.e.b(int[], java.lang.String):o6.e");
    }

    private static String c(int[] iArr, int i10) {
        BigInteger bigInteger = BigInteger.ZERO;
        for (int i11 = 0; i11 < i10; i11++) {
            bigInteger = bigInteger.add(f6335c[(i10 - i11) - 1].multiply(BigInteger.valueOf(iArr[i11])));
        }
        String bigInteger2 = bigInteger.toString();
        if (bigInteger2.charAt(0) == '1') {
            return bigInteger2.substring(1);
        }
        throw h6.h.b();
    }

    static int d(int[] iArr, int i10, b7.c cVar) {
        if (i10 + 2 <= iArr[0]) {
            int[] iArr2 = new int[2];
            int i11 = 0;
            while (i11 < 2) {
                iArr2[i11] = iArr[i10];
                i11++;
                i10++;
            }
            cVar.j(Integer.parseInt(c(iArr2, 2)));
            StringBuilder sb2 = new StringBuilder();
            int g10 = g(iArr, i10, sb2);
            cVar.d(sb2.toString());
            int i12 = iArr[g10] == 923 ? g10 + 1 : -1;
            while (g10 < iArr[0]) {
                int i13 = iArr[g10];
                if (i13 == 922) {
                    g10++;
                    cVar.g(true);
                } else if (i13 != 923) {
                    throw h6.h.b();
                } else {
                    int i14 = g10 + 1;
                    switch (iArr[i14]) {
                        case 0:
                            StringBuilder sb3 = new StringBuilder();
                            g10 = g(iArr, i14 + 1, sb3);
                            cVar.e(sb3.toString());
                            continue;
                        case 1:
                            StringBuilder sb4 = new StringBuilder();
                            g10 = f(iArr, i14 + 1, sb4);
                            cVar.i(Integer.parseInt(sb4.toString()));
                            continue;
                        case 2:
                            StringBuilder sb5 = new StringBuilder();
                            g10 = f(iArr, i14 + 1, sb5);
                            cVar.l(Long.parseLong(sb5.toString()));
                            continue;
                        case 3:
                            StringBuilder sb6 = new StringBuilder();
                            g10 = g(iArr, i14 + 1, sb6);
                            cVar.k(sb6.toString());
                            continue;
                        case 4:
                            StringBuilder sb7 = new StringBuilder();
                            g10 = g(iArr, i14 + 1, sb7);
                            cVar.b(sb7.toString());
                            continue;
                        case 5:
                            StringBuilder sb8 = new StringBuilder();
                            g10 = f(iArr, i14 + 1, sb8);
                            cVar.f(Long.parseLong(sb8.toString()));
                            continue;
                        case 6:
                            StringBuilder sb9 = new StringBuilder();
                            g10 = f(iArr, i14 + 1, sb9);
                            cVar.c(Integer.parseInt(sb9.toString()));
                            continue;
                        default:
                            throw h6.h.b();
                    }
                }
            }
            if (i12 != -1) {
                int i15 = g10 - i12;
                if (cVar.a()) {
                    i15--;
                }
                cVar.h(Arrays.copyOfRange(iArr, i12, i15 + i12));
            }
            return g10;
        }
        throw h6.h.b();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a6 A[PHI: r0 
      PHI: (r0v3 c7.e$b) = (r0v1 c7.e$b), (r0v1 c7.e$b), (r0v4 c7.e$b), (r0v5 c7.e$b), (r0v1 c7.e$b), (r0v1 c7.e$b), (r0v7 c7.e$b), (r0v1 c7.e$b), (r0v8 c7.e$b), (r0v1 c7.e$b), (r0v10 c7.e$b) binds: [B:5:0x001b, B:52:0x00a2, B:50:0x009d, B:49:0x009a, B:46:0x008f, B:38:0x007b, B:33:0x006f, B:30:0x0065, B:31:0x0069, B:23:0x0051, B:18:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void e(int[] r12, int[] r13, int r14, java.lang.StringBuilder r15) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c7.e.e(int[], int[], int, java.lang.StringBuilder):void");
    }

    private static int f(int[] iArr, int i10, StringBuilder sb2) {
        int[] iArr2 = new int[15];
        boolean z10 = false;
        int i11 = 0;
        while (i10 < iArr[0] && !z10) {
            int i12 = i10 + 1;
            int i13 = iArr[i10];
            if (i12 == iArr[0]) {
                z10 = true;
            }
            if (i13 < 900) {
                iArr2[i11] = i13;
                i11++;
            } else {
                if (i13 != 900 && i13 != 901 && i13 != 928) {
                    switch (i13) {
                    }
                }
                i12--;
                z10 = true;
            }
            if ((i11 % 15 == 0 || i13 == 902 || z10) && i11 > 0) {
                sb2.append(c(iArr2, i11));
                i11 = 0;
            }
            i10 = i12;
        }
        return i10;
    }

    private static int g(int[] iArr, int i10, StringBuilder sb2) {
        int[] iArr2 = new int[(iArr[0] - i10) << 1];
        int[] iArr3 = new int[(iArr[0] - i10) << 1];
        boolean z10 = false;
        int i11 = 0;
        while (i10 < iArr[0] && !z10) {
            int i12 = i10 + 1;
            int i13 = iArr[i10];
            if (i13 < 900) {
                iArr2[i11] = i13 / 30;
                iArr2[i11 + 1] = i13 % 30;
                i11 += 2;
            } else if (i13 != 913) {
                if (i13 != 928) {
                    switch (i13) {
                        case 900:
                            iArr2[i11] = 900;
                            i11++;
                            break;
                        case 901:
                        case 902:
                            break;
                        default:
                            switch (i13) {
                            }
                    }
                }
                i10 = i12 - 1;
                z10 = true;
            } else {
                iArr2[i11] = 913;
                i10 = i12 + 1;
                iArr3[i11] = iArr[i12];
                i11++;
            }
            i10 = i12;
        }
        e(iArr2, iArr3, i11, sb2);
        return i10;
    }
}
