package com.fasterxml.jackson.core.io;

import java.math.BigDecimal;
/* loaded from: classes.dex */
public final class NumberInput {
    static final String MIN_LONG_STR_NO_SIGN = String.valueOf(Long.MIN_VALUE).substring(1);
    static final String MAX_LONG_STR = String.valueOf(Long.MAX_VALUE);

    public static boolean inLongRange(String str, boolean z10) {
        String str2 = z10 ? MIN_LONG_STR_NO_SIGN : MAX_LONG_STR;
        int length = str2.length();
        int length2 = str.length();
        if (length2 < length) {
            return true;
        }
        if (length2 > length) {
            return false;
        }
        for (int i10 = 0; i10 < length; i10++) {
            int charAt = str.charAt(i10) - str2.charAt(i10);
            if (charAt != 0) {
                return charAt < 0;
            }
        }
        return true;
    }

    public static boolean inLongRange(char[] cArr, int i10, int i11, boolean z10) {
        String str = z10 ? MIN_LONG_STR_NO_SIGN : MAX_LONG_STR;
        int length = str.length();
        if (i11 < length) {
            return true;
        }
        if (i11 > length) {
            return false;
        }
        for (int i12 = 0; i12 < length; i12++) {
            int charAt = cArr[i10 + i12] - str.charAt(i12);
            if (charAt != 0) {
                return charAt < 0;
            }
        }
        return true;
    }

    public static int parseAsInt(String str, int i10) {
        String trim;
        int length;
        if (str == null || (length = (trim = str.trim()).length()) == 0) {
            return i10;
        }
        int i11 = 0;
        char charAt = trim.charAt(0);
        if (charAt == '+') {
            trim = trim.substring(1);
            length = trim.length();
        } else if (charAt == '-') {
            i11 = 1;
        }
        while (i11 < length) {
            char charAt2 = trim.charAt(i11);
            if (charAt2 > '9' || charAt2 < '0') {
                try {
                    return (int) parseDouble(trim);
                } catch (NumberFormatException unused) {
                    return i10;
                }
            }
            i11++;
        }
        try {
            return Integer.parseInt(trim);
        } catch (NumberFormatException unused2) {
            return i10;
        }
    }

    public static long parseAsLong(String str, long j10) {
        String trim;
        int length;
        if (str == null || (length = (trim = str.trim()).length()) == 0) {
            return j10;
        }
        int i10 = 0;
        char charAt = trim.charAt(0);
        if (charAt == '+') {
            trim = trim.substring(1);
            length = trim.length();
        } else if (charAt == '-') {
            i10 = 1;
        }
        while (i10 < length) {
            char charAt2 = trim.charAt(i10);
            if (charAt2 > '9' || charAt2 < '0') {
                try {
                    return (long) parseDouble(trim);
                } catch (NumberFormatException unused) {
                    return j10;
                }
            }
            i10++;
        }
        try {
            return Long.parseLong(trim);
        } catch (NumberFormatException unused2) {
            return j10;
        }
    }

    public static BigDecimal parseBigDecimal(String str) {
        return BigDecimalParser.parse(str);
    }

    public static BigDecimal parseBigDecimal(char[] cArr) {
        return BigDecimalParser.parse(cArr);
    }

    public static BigDecimal parseBigDecimal(char[] cArr, int i10, int i11) {
        return BigDecimalParser.parse(cArr, i10, i11);
    }

    public static double parseDouble(String str) {
        if ("2.2250738585072012e-308".equals(str)) {
            return Double.MIN_VALUE;
        }
        return Double.parseDouble(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0075, code lost:
        return java.lang.Integer.parseInt(r9);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int parseInt(java.lang.String r9) {
        /*
            r0 = 0
            char r1 = r9.charAt(r0)
            int r2 = r9.length()
            r3 = 1
            r4 = 45
            if (r1 != r4) goto Lf
            r0 = r3
        Lf:
            r4 = 10
            if (r0 == 0) goto L26
            if (r2 == r3) goto L21
            if (r2 <= r4) goto L18
            goto L21
        L18:
            r1 = 2
            char r3 = r9.charAt(r3)
            r8 = r3
            r3 = r1
            r1 = r8
            goto L2f
        L21:
            int r9 = java.lang.Integer.parseInt(r9)
            return r9
        L26:
            r5 = 9
            if (r2 <= r5) goto L2f
            int r9 = java.lang.Integer.parseInt(r9)
            return r9
        L2f:
            r5 = 57
            if (r1 > r5) goto L84
            r6 = 48
            if (r1 >= r6) goto L38
            goto L84
        L38:
            int r1 = r1 - r6
            if (r3 >= r2) goto L80
            int r7 = r3 + 1
            char r3 = r9.charAt(r3)
            if (r3 > r5) goto L7b
            if (r3 >= r6) goto L46
            goto L7b
        L46:
            int r1 = r1 * 10
            int r3 = r3 - r6
            int r1 = r1 + r3
            if (r7 >= r2) goto L80
            int r3 = r7 + 1
            char r7 = r9.charAt(r7)
            if (r7 > r5) goto L76
            if (r7 >= r6) goto L57
            goto L76
        L57:
            int r1 = r1 * 10
            int r7 = r7 - r6
            int r1 = r1 + r7
            if (r3 >= r2) goto L80
        L5d:
            int r7 = r3 + 1
            char r3 = r9.charAt(r3)
            if (r3 > r5) goto L71
            if (r3 >= r6) goto L68
            goto L71
        L68:
            int r1 = r1 * r4
            int r3 = r3 + (-48)
            int r1 = r1 + r3
            if (r7 < r2) goto L6f
            goto L80
        L6f:
            r3 = r7
            goto L5d
        L71:
            int r9 = java.lang.Integer.parseInt(r9)
            return r9
        L76:
            int r9 = java.lang.Integer.parseInt(r9)
            return r9
        L7b:
            int r9 = java.lang.Integer.parseInt(r9)
            return r9
        L80:
            if (r0 == 0) goto L83
            int r1 = -r1
        L83:
            return r1
        L84:
            int r9 = java.lang.Integer.parseInt(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.io.NumberInput.parseInt(java.lang.String):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int parseInt(char[] cArr, int i10, int i11) {
        int i12 = cArr[(i10 + i11) - 1] - '0';
        switch (i11) {
            case 2:
                break;
            case 3:
                i12 += (cArr[i10] - '0') * 100;
                i10++;
                break;
            case 4:
                i12 += (cArr[i10] - '0') * 1000;
                i10++;
                i12 += (cArr[i10] - '0') * 100;
                i10++;
                break;
            case 5:
                i12 += (cArr[i10] - '0') * 10000;
                i10++;
                i12 += (cArr[i10] - '0') * 1000;
                i10++;
                i12 += (cArr[i10] - '0') * 100;
                i10++;
                break;
            case 6:
                i12 += (cArr[i10] - '0') * 100000;
                i10++;
                i12 += (cArr[i10] - '0') * 10000;
                i10++;
                i12 += (cArr[i10] - '0') * 1000;
                i10++;
                i12 += (cArr[i10] - '0') * 100;
                i10++;
                break;
            case 7:
                i12 += (cArr[i10] - '0') * 1000000;
                i10++;
                i12 += (cArr[i10] - '0') * 100000;
                i10++;
                i12 += (cArr[i10] - '0') * 10000;
                i10++;
                i12 += (cArr[i10] - '0') * 1000;
                i10++;
                i12 += (cArr[i10] - '0') * 100;
                i10++;
                break;
            case 8:
                i12 += (cArr[i10] - '0') * 10000000;
                i10++;
                i12 += (cArr[i10] - '0') * 1000000;
                i10++;
                i12 += (cArr[i10] - '0') * 100000;
                i10++;
                i12 += (cArr[i10] - '0') * 10000;
                i10++;
                i12 += (cArr[i10] - '0') * 1000;
                i10++;
                i12 += (cArr[i10] - '0') * 100;
                i10++;
                break;
            case 9:
                i12 += (cArr[i10] - '0') * 100000000;
                i10++;
                i12 += (cArr[i10] - '0') * 10000000;
                i10++;
                i12 += (cArr[i10] - '0') * 1000000;
                i10++;
                i12 += (cArr[i10] - '0') * 100000;
                i10++;
                i12 += (cArr[i10] - '0') * 10000;
                i10++;
                i12 += (cArr[i10] - '0') * 1000;
                i10++;
                i12 += (cArr[i10] - '0') * 100;
                i10++;
                break;
            default:
                return i12;
        }
        return i12 + ((cArr[i10] - '0') * 10);
    }

    public static long parseLong(String str) {
        return str.length() <= 9 ? parseInt(str) : Long.parseLong(str);
    }

    public static long parseLong(char[] cArr, int i10, int i11) {
        int i12 = i11 - 9;
        return (parseInt(cArr, i10, i12) * 1000000000) + parseInt(cArr, i10 + i12, 9);
    }
}
