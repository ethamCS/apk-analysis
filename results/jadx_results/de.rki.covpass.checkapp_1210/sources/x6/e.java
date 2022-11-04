package x6;

import java.util.Arrays;
import java.util.Map;
/* loaded from: classes.dex */
public final class e extends r {

    /* renamed from: e */
    static final int[] f25408e = {52, 289, 97, 352, 49, 304, 112, 37, 292, 100, 265, 73, 328, 25, 280, 88, 13, 268, 76, 28, 259, 67, 322, 19, 274, 82, 7, 262, 70, 22, 385, 193, 448, 145, 400, 208, 133, 388, 196, 168, 162, 138, 42};

    /* renamed from: a */
    private final boolean f25409a;

    /* renamed from: b */
    private final boolean f25410b;

    /* renamed from: c */
    private final StringBuilder f25411c;

    /* renamed from: d */
    private final int[] f25412d;

    public e() {
        this(false);
    }

    public e(boolean z10) {
        this(z10, false);
    }

    public e(boolean z10, boolean z11) {
        this.f25409a = z10;
        this.f25410b = z11;
        this.f25411c = new StringBuilder(20);
        this.f25412d = new int[9];
    }

    private static String h(CharSequence charSequence) {
        int i10;
        int length = charSequence.length();
        StringBuilder sb2 = new StringBuilder(length);
        int i11 = 0;
        while (i11 < length) {
            char charAt = charSequence.charAt(i11);
            if (charAt == '+' || charAt == '$' || charAt == '%' || charAt == '/') {
                i11++;
                char charAt2 = charSequence.charAt(i11);
                if (charAt != '$') {
                    if (charAt != '%') {
                        if (charAt != '+') {
                            if (charAt == '/') {
                                if (charAt2 >= 'A' && charAt2 <= 'O') {
                                    i10 = charAt2 - ' ';
                                } else if (charAt2 != 'Z') {
                                    throw h6.h.b();
                                } else {
                                    charAt = ':';
                                }
                            }
                            charAt = 0;
                        } else if (charAt2 < 'A' || charAt2 > 'Z') {
                            throw h6.h.b();
                        } else {
                            i10 = charAt2 + ' ';
                        }
                    } else if (charAt2 >= 'A' && charAt2 <= 'E') {
                        i10 = charAt2 - '&';
                    } else if (charAt2 >= 'F' && charAt2 <= 'J') {
                        i10 = charAt2 - 11;
                    } else if (charAt2 >= 'K' && charAt2 <= 'O') {
                        i10 = charAt2 + 16;
                    } else if (charAt2 < 'P' || charAt2 > 'T') {
                        if (charAt2 != 'U') {
                            if (charAt2 == 'V') {
                                charAt = '@';
                            } else if (charAt2 == 'W') {
                                charAt = '`';
                            } else if (charAt2 != 'X' && charAt2 != 'Y' && charAt2 != 'Z') {
                                throw h6.h.b();
                            } else {
                                charAt = 127;
                            }
                        }
                        charAt = 0;
                    } else {
                        i10 = charAt2 + '+';
                    }
                } else if (charAt2 < 'A' || charAt2 > 'Z') {
                    throw h6.h.b();
                } else {
                    i10 = charAt2 - '@';
                }
                charAt = (char) i10;
            }
            sb2.append(charAt);
            i11++;
        }
        return sb2.toString();
    }

    private static int[] i(o6.a aVar, int[] iArr) {
        int l10 = aVar.l();
        int j10 = aVar.j(0);
        int length = iArr.length;
        boolean z10 = false;
        int i10 = 0;
        int i11 = j10;
        while (j10 < l10) {
            if (aVar.h(j10) != z10) {
                iArr[i10] = iArr[i10] + 1;
            } else {
                if (i10 != length - 1) {
                    i10++;
                } else if (k(iArr) == 148 && aVar.o(Math.max(0, i11 - ((j10 - i11) / 2)), i11, false)) {
                    return new int[]{i11, j10};
                } else {
                    i11 += iArr[0] + iArr[1];
                    int i12 = i10 - 1;
                    System.arraycopy(iArr, 2, iArr, 0, i12);
                    iArr[i12] = 0;
                    iArr[i10] = 0;
                    i10--;
                }
                iArr[i10] = 1;
                z10 = !z10;
            }
            j10++;
        }
        throw h6.m.b();
    }

    private static char j(int i10) {
        int i11 = 0;
        while (true) {
            int[] iArr = f25408e;
            if (i11 >= iArr.length) {
                if (i10 != 148) {
                    throw h6.m.b();
                }
                return '*';
            } else if (iArr[i11] == i10) {
                return "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(i11);
            } else {
                i11++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002f, code lost:
        if (r1 >= r0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0031, code lost:
        if (r4 <= 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0033, code lost:
        r2 = r10[r1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
        if (r2 <= r3) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0037, code lost:
        r4 = r4 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003b, code lost:
        if ((r2 << 1) < r6) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003d, code lost:
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003e, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0041, code lost:
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int k(int[] r10) {
        /*
            int r0 = r10.length
            r1 = 0
            r2 = r1
        L3:
            r3 = 2147483647(0x7fffffff, float:NaN)
            int r4 = r10.length
            r5 = r1
        L8:
            if (r5 >= r4) goto L14
            r6 = r10[r5]
            if (r6 >= r3) goto L11
            if (r6 <= r2) goto L11
            r3 = r6
        L11:
            int r5 = r5 + 1
            goto L8
        L14:
            r2 = r1
            r4 = r2
            r5 = r4
            r6 = r5
        L18:
            if (r2 >= r0) goto L2b
            r7 = r10[r2]
            if (r7 <= r3) goto L28
            int r8 = r0 + (-1)
            int r8 = r8 - r2
            r9 = 1
            int r8 = r9 << r8
            r5 = r5 | r8
            int r4 = r4 + 1
            int r6 = r6 + r7
        L28:
            int r2 = r2 + 1
            goto L18
        L2b:
            r2 = 3
            r7 = -1
            if (r4 != r2) goto L42
        L2f:
            if (r1 >= r0) goto L41
            if (r4 <= 0) goto L41
            r2 = r10[r1]
            if (r2 <= r3) goto L3e
            int r4 = r4 + (-1)
            int r2 = r2 << 1
            if (r2 < r6) goto L3e
            return r7
        L3e:
            int r1 = r1 + 1
            goto L2f
        L41:
            return r5
        L42:
            if (r4 > r2) goto L45
            return r7
        L45:
            r2 = r3
            goto L3
        */
        throw new UnsupportedOperationException("Method not decompiled: x6.e.k(int[]):int");
    }

    @Override // x6.r
    public h6.q c(int i10, o6.a aVar, Map<h6.e, ?> map) {
        int[] i11;
        int[] iArr = this.f25412d;
        Arrays.fill(iArr, 0);
        StringBuilder sb2 = this.f25411c;
        sb2.setLength(0);
        int j10 = aVar.j(i(aVar, iArr)[1]);
        int l10 = aVar.l();
        while (true) {
            r.f(aVar, j10, iArr);
            int k10 = k(iArr);
            if (k10 >= 0) {
                char j11 = j(k10);
                sb2.append(j11);
                int i12 = j10;
                for (int i13 : iArr) {
                    i12 += i13;
                }
                int j12 = aVar.j(i12);
                if (j11 == '*') {
                    sb2.setLength(sb2.length() - 1);
                    int i14 = 0;
                    for (int i15 : iArr) {
                        i14 += i15;
                    }
                    int i16 = (j12 - j10) - i14;
                    if (j12 != l10 && (i16 << 1) < i14) {
                        throw h6.m.b();
                    }
                    if (this.f25409a) {
                        int length = sb2.length() - 1;
                        int i17 = 0;
                        for (int i18 = 0; i18 < length; i18++) {
                            i17 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(this.f25411c.charAt(i18));
                        }
                        if (sb2.charAt(length) != "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(i17 % 43)) {
                            throw h6.d.b();
                        }
                        sb2.setLength(length);
                    }
                    if (sb2.length() == 0) {
                        throw h6.m.b();
                    }
                    float f10 = i10;
                    return new h6.q(this.f25410b ? h(sb2) : sb2.toString(), null, new h6.s[]{new h6.s((i11[1] + i11[0]) / 2.0f, f10), new h6.s(j10 + (i14 / 2.0f), f10)}, h6.a.CODE_39);
                }
                j10 = j12;
            } else {
                throw h6.m.b();
            }
        }
    }
}
