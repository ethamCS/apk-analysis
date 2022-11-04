package t7;

import java.util.Objects;
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a */
    private static final u7.f f22000a = u7.f.Y(1970);

    /* renamed from: b */
    private static final u7.f f22001b = u7.f.Y(86400);

    /* renamed from: c */
    private static final int[] f22002c = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    /* renamed from: d */
    private static final int[] f22003d = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    /* renamed from: e */
    private static final int[] f22004e = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365};

    /* renamed from: f */
    private static final int[] f22005f = {0, 31, 60, 91, 121, 152, 182, 213, 244, 274, 305, 335, 366};

    public static long A(int i10) {
        long j10;
        long j11;
        long j12 = (32768 & i10) << 48;
        int i11 = (i10 >> 10) & 31;
        int i12 = i10 & 1023;
        if (i11 == 31) {
            j11 = 9218868437227405312L | (i12 << 42);
        } else {
            if (i11 != 0) {
                j10 = (i11 + 1008) << 52;
            } else if (i12 == 0) {
                return j12;
            } else {
                int i13 = i11 + 1;
                while (i12 < 1024) {
                    i12 <<= 1;
                    i13--;
                }
                j10 = (i13 + 1008) << 52;
                i12 &= 1023;
            }
            j11 = j10 | (i12 << 42);
        }
        return j12 | j11;
    }

    public static boolean B(long j10) {
        long j11 = j10 & Long.MAX_VALUE;
        if (j11 == 0) {
            return true;
        }
        if (j11 >= 9218868437227405312L) {
            return false;
        }
        long j12 = j11 >> 52;
        if (j12 >= 1075) {
            return true;
        }
        if (j12 <= 1022) {
            return false;
        }
        long j13 = j11 & 4503599627370495L;
        int i10 = 52 - (((int) j12) - 1023);
        return ((j13 >> i10) << i10) == j13;
    }

    private static boolean C(int i10) {
        int i11 = i10 % 400;
        if (i11 < 0) {
            i11 += 400;
        }
        return (i11 % 4 == 0 && i11 % 100 != 0) || i11 % 400 == 0;
    }

    public static String D(long j10) {
        long j11 = j10;
        if (j11 == Long.MIN_VALUE) {
            return "-9223372036854775808";
        }
        int i10 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
        if (i10 == 0) {
            return "0";
        }
        if (j11 == -2147483648L) {
            return "-2147483648";
        }
        boolean z10 = i10 < 0;
        int i11 = (int) j11;
        if (i11 == j11) {
            char[] cArr = new char[12];
            int i12 = 11;
            if (z10) {
                i11 = -i11;
            }
            while (i11 > 43698) {
                int i13 = i11 / 10;
                cArr[i12] = "0123456789ABCDEF".charAt(i11 - (i13 * 10));
                i12--;
                i11 = i13;
            }
            while (i11 > 9) {
                int i14 = (i11 * 26215) >> 18;
                cArr[i12] = "0123456789ABCDEF".charAt(i11 - (i14 * 10));
                i12--;
                i11 = i14;
            }
            if (i11 != 0) {
                cArr[i12] = "0123456789ABCDEF".charAt(i11);
                i12--;
            }
            if (z10) {
                cArr[i12] = '-';
            } else {
                i12++;
            }
            return new String(cArr, i12, 12 - i12);
        }
        char[] cArr2 = new char[24];
        int i15 = 23;
        if (z10) {
            j11 = -j11;
        }
        while (j11 > 43698) {
            long j12 = j11 / 10;
            cArr2[i15] = "0123456789ABCDEF".charAt((int) (j11 - (10 * j12)));
            i15--;
            j11 = j12;
        }
        while (j11 > 9) {
            long j13 = (26215 * j11) >> 18;
            cArr2[i15] = "0123456789ABCDEF".charAt((int) (j11 - (j13 * 10)));
            i15--;
            j11 = j13;
        }
        if (j11 != 0) {
            cArr2[i15] = "0123456789ABCDEF".charAt((int) j11);
            i15--;
        }
        if (z10) {
            cArr2[i15] = '-';
        } else {
            i15++;
        }
        return new String(cArr2, i15, 24 - i15);
    }

    public static boolean E(String str, String str2) {
        int length = str2.length();
        if (str.length() <= length || !str.substring(0, length).equals(str2)) {
            return false;
        }
        if (str.charAt(length) >= 'a' && str.charAt(length) <= 'z') {
            return false;
        }
        return str.charAt(length) < '0' || str.charAt(length) > '9';
    }

    private static int F(long j10, int i10) {
        long j11 = j10 >> i10;
        int i11 = ((j10 & ((1 << i10) - 1)) > (1 << (i10 - 1)) ? 1 : ((j10 & ((1 << i10) - 1)) == (1 << (i10 - 1)) ? 0 : -1));
        return (i11 > 0 || (i11 == 0 && (j11 & 1) != 0)) ? ((int) j11) + 1 : (int) j11;
    }

    public static long G(int i10) {
        long j10;
        long j11;
        long j12 = ((i10 >> 31) & 1) << 63;
        int i11 = (i10 >> 23) & 255;
        int i12 = i10 & 8388607;
        if (i11 == 255) {
            j11 = 9218868437227405312L | (i12 << 29);
        } else {
            if (i11 != 0) {
                j10 = (i11 + 896) << 52;
            } else if (i12 == 0) {
                return j12;
            } else {
                int i13 = i11 + 1;
                while (i12 < 8388608) {
                    i12 <<= 1;
                    i13--;
                }
                j10 = (i13 + 896) << 52;
                i12 &= 8388607;
            }
            j11 = j10 | (i12 << 29);
        }
        return j12 | j11;
    }

    public static int H(float f10) {
        int floatToRawIntBits = Float.floatToRawIntBits(f10);
        int i10 = (floatToRawIntBits >> 23) & 255;
        int i11 = 8388607 & floatToRawIntBits;
        int i12 = (floatToRawIntBits >> 16) & 32768;
        if (i10 == 255) {
            if ((floatToRawIntBits & 8191) != 0) {
                return -1;
            }
            return i12 + 31744 + (i11 >> 13);
        } else if (i10 == 0) {
            if ((floatToRawIntBits & 8191) != 0) {
                return -1;
            }
            return i12 + (i11 >> 13);
        } else if (i10 <= 102 || i10 >= 143) {
            return -1;
        } else {
            if (i10 > 112) {
                if ((floatToRawIntBits & 8191) != 0) {
                    return -1;
                }
                return i12 + ((i10 - 112) << 10) + (-(i11 >> 13));
            }
            int i13 = 126 - i10;
            int i14 = (1024 >> (145 - i10)) + (i11 >> i13);
            if ((i11 != 0 && i10 == 103) || (floatToRawIntBits & ((1 << i13) - 1)) != 0) {
                return -1;
            }
            return i12 + i14;
        }
    }

    public static int I(float f10) {
        return Float.floatToRawIntBits(f10);
    }

    public static boolean J(String str, byte[] bArr) {
        if (str == null) {
            return bArr == null;
        } else if (bArr == null || str.length() * 3 < bArr.length || bArr.length * 3 < str.length()) {
            return false;
        } else {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int a10 = v7.a.a(str, i10, 1);
                int N = N(bArr, i11);
                if (N == -2) {
                    throw new IllegalStateException("Invalid encoding");
                }
                if (a10 == -1) {
                    return N == -1;
                } else if (a10 != N) {
                    return false;
                } else {
                    if (a10 >= 65536) {
                        i10 += 2;
                        i11 += 4;
                    } else if (a10 >= 2048) {
                        i10++;
                        i11 += 3;
                    } else {
                        i10++;
                        i11 = a10 >= 128 ? i11 + 2 : i11 + 1;
                    }
                }
            }
        }
    }

    public static int K(String str) {
        int a10;
        int i10 = 0;
        int i11 = 2128535065;
        while (i10 != str.length() && (a10 = v7.a.a(str, i10, 1)) >= 0) {
            i11 = (i11 * 31) + a10;
            i10 = a10 >= 65536 ? i10 + 2 : i10 + 1;
        }
        return i11;
    }

    public static String L(u7.f fVar, int[] iArr) {
        Objects.requireNonNull(iArr, "lesserFields");
        if (iArr.length < 7) {
            throw new IllegalArgumentException(" (7) is not less or equal to " + iArr.length);
        } else if (iArr.length < 7) {
            throw new IllegalArgumentException("\"lesserFields\" + \"'s length\" (" + iArr.length + ") is not greater or equal to 7");
        } else if (iArr[6] != 0) {
            throw new UnsupportedOperationException("Local time offsets not supported");
        } else {
            int s12 = fVar.s1();
            if (s12 < 0) {
                throw new IllegalArgumentException("year(" + s12 + ") is not greater or equal to 0");
            } else if (s12 > 9999) {
                throw new IllegalArgumentException("year(" + s12 + ") is not less or equal to 9999");
            } else {
                h(s12, iArr);
                int i10 = iArr[0];
                int i11 = iArr[1];
                int i12 = iArr[2];
                int i13 = iArr[3];
                int i14 = iArr[4];
                int i15 = iArr[5];
                char[] cArr = new char[32];
                cArr[0] = (char) (((s12 / 1000) % 10) + 48);
                cArr[1] = (char) (((s12 / 100) % 10) + 48);
                cArr[2] = (char) (((s12 / 10) % 10) + 48);
                cArr[3] = (char) ((s12 % 10) + 48);
                cArr[4] = '-';
                cArr[5] = (char) (((i10 / 10) % 10) + 48);
                cArr[6] = (char) ((i10 % 10) + 48);
                cArr[7] = '-';
                cArr[8] = (char) (((i11 / 10) % 10) + 48);
                cArr[9] = (char) ((i11 % 10) + 48);
                cArr[10] = 'T';
                cArr[11] = (char) (((i12 / 10) % 10) + 48);
                cArr[12] = (char) ((i12 % 10) + 48);
                cArr[13] = ':';
                cArr[14] = (char) (((i13 / 10) % 10) + 48);
                cArr[15] = (char) ((i13 % 10) + 48);
                cArr[16] = ':';
                cArr[17] = (char) (((i14 / 10) % 10) + 48);
                cArr[18] = (char) ((i14 % 10) + 48);
                int i16 = 20;
                if (i15 > 0) {
                    cArr[19] = '.';
                    int i17 = 100000000;
                    int i18 = 20;
                    while (i17 > 0 && i15 != 0) {
                        int i19 = (i15 / i17) % 10;
                        i15 -= i19 * i17;
                        cArr[i18] = (char) (i19 + 48);
                        i16++;
                        i17 /= 10;
                        i18++;
                    }
                    cArr[i18] = 'Z';
                    i16++;
                } else {
                    cArr[19] = 'Z';
                }
                return new String(cArr, 0, i16);
            }
        }
    }

    public static String M(String str) {
        return (str.length() > 2 && str.charAt(str.length() + (-1)) == '0' && str.charAt(str.length() - 2) == '.') ? str.substring(0, str.length() - 2) : str;
    }

    public static int N(byte[] bArr, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int length = bArr.length;
        int i17 = -1;
        if (i10 < 0 || i10 >= length) {
            return -1;
        }
        int i18 = bArr[i10] & 255;
        if (i18 <= 127) {
            return i18;
        }
        if (i18 >= 194 && i18 <= 223) {
            int i19 = i10 + 1;
            if (i19 < length) {
                i17 = bArr[i19] & 255;
            }
            if (i17 >= 128 && i17 <= 191) {
                return ((i18 - 192) << 6) | (i17 - 128);
            }
            return -2;
        } else if (i18 >= 224 && i18 <= 239) {
            int i20 = i10 + 1;
            if (i20 < length) {
                i16 = i20 + 1;
                i15 = bArr[i20] & 255;
            } else {
                i16 = i20;
                i15 = -1;
            }
            if (i16 < length) {
                i17 = bArr[i16] & 255;
            }
            int i21 = i18 == 224 ? 160 : 128;
            int i22 = i18 == 237 ? 159 : 191;
            if (i15 >= i21 && i15 <= i22 && i17 >= 128 && i17 <= 191) {
                return ((i18 - 224) << 12) | ((i15 - 128) << 6) | (i17 - 128);
            }
            return -2;
        } else {
            if (i18 >= 240 && i18 <= 244) {
                int i23 = i10 + 1;
                if (i23 < length) {
                    i12 = i23 + 1;
                    i11 = bArr[i23] & 255;
                } else {
                    i12 = i23;
                    i11 = -1;
                }
                if (i12 < length) {
                    i13 = i12 + 1;
                    i14 = bArr[i12] & 255;
                } else {
                    i13 = i12;
                    i14 = -1;
                }
                if (i13 < length) {
                    i17 = bArr[i13] & 255;
                }
                int i24 = i18 == 240 ? 144 : 128;
                int i25 = i18 == 244 ? 143 : 191;
                if (i11 >= i24 && i11 <= i25 && i14 >= 128 && i14 <= 191 && i17 >= 128 && i17 <= 191) {
                    return ((i18 - 240) << 18) | ((i11 - 128) << 12) | ((i14 - 128) << 6) | (i17 - 128);
                }
            }
            return -2;
        }
    }

    public static int O(byte[] bArr) {
        int i10 = 0;
        int i11 = 2128535065;
        while (true) {
            int N = N(bArr, i10);
            if (N == -1 || N == -2) {
                return i11;
            }
            i11 = (i11 * 31) + N;
            i10 = N >= 65536 ? i10 + 4 : N >= 2048 ? i10 + 3 : N >= 128 ? i10 + 2 : i10 + 1;
        }
    }

    public static void a(long j10, u7.f[] fVarArr, int[] iArr) {
        int x10 = (int) x(j10, 86400);
        y(f22000a, 1, u7.f.Z(w(j10, 86400) + 1), fVarArr, iArr);
        iArr[2] = x10 / 3600;
        iArr[3] = (x10 % 3600) / 60;
        iArr[4] = x10 % 60;
        iArr[5] = 0;
        iArr[6] = 0;
    }

    public static int b(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2 == null ? 0 : -1;
        } else if (bArr2 == null) {
            return 1;
        } else {
            int min = Math.min(bArr.length, bArr2.length);
            for (int i10 = 0; i10 < min; i10++) {
                if (bArr[i10] != bArr2[i10]) {
                    return bArr[i10] < bArr2[i10] ? -1 : 1;
                }
            }
            if (bArr.length == bArr2.length) {
                return 0;
            }
            return bArr.length < bArr2.length ? -1 : 1;
        }
    }

    public static int c(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2 == null ? 0 : -1;
        } else if (bArr2 == null) {
            return 1;
        } else {
            if (bArr.length != bArr2.length) {
                return bArr.length < bArr2.length ? -1 : 1;
            }
            for (int i10 = 0; i10 < bArr.length; i10++) {
                if (bArr[i10] != bArr2[i10]) {
                    return bArr[i10] < bArr2[i10] ? -1 : 1;
                }
            }
            return 0;
        }
    }

    public static boolean d(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2 == null;
        } else if (bArr2 == null || bArr.length != bArr2.length) {
            return false;
        } else {
            for (int i10 = 0; i10 < bArr.length; i10++) {
                if (bArr[i10] != bArr2[i10]) {
                    return false;
                }
            }
            return true;
        }
    }

    public static int e(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        int length = 589 + bArr.length;
        for (byte b10 : bArr) {
            length = (length * 31) + b10;
        }
        return length;
    }

    public static void f(int[] iArr) {
        Objects.requireNonNull(iArr, "lesserFields");
        if (iArr.length < 7) {
            throw new IllegalArgumentException(" (7) is not less or equal to " + iArr.length);
        } else if (iArr.length < 7) {
            throw new IllegalArgumentException("\"lesserFields\" + \"'s length\" (" + iArr.length + ") is not greater or equal to 7");
        } else if (iArr[0] < 1) {
            throw new IllegalArgumentException("\"month\" (" + iArr[0] + ") is not greater or equal to 1");
        } else if (iArr[0] > 12) {
            throw new IllegalArgumentException("\"month\" (" + iArr[0] + ") is not less or equal to 12");
        } else if (iArr[1] < 1) {
            throw new IllegalArgumentException("\"intDay\" (" + iArr[1] + ") is not greater or equal to 1");
        } else if (iArr[1] > 31) {
            throw new IllegalArgumentException("\"day\" (" + iArr[1] + ") is not less or equal to 31");
        } else if (iArr[1] > f22003d[iArr[0]]) {
            throw new IllegalArgumentException();
        } else {
            if (iArr[2] < 0) {
                throw new IllegalArgumentException("\"hour\" (" + iArr[2] + ") is not greater or equal to 0");
            } else if (iArr[2] > 23) {
                throw new IllegalArgumentException("\"hour\" (" + iArr[2] + ") is not less or equal to 23");
            } else if (iArr[3] < 0) {
                throw new IllegalArgumentException("\"minute\" (" + iArr[3] + ") is not greater or equal to 0");
            } else if (iArr[3] > 59) {
                throw new IllegalArgumentException("\"minute\" (" + iArr[3] + ") is not less or equal to 59");
            } else if (iArr[4] < 0) {
                throw new IllegalArgumentException("\"second\" (" + iArr[4] + ") is not greater or equal to 0");
            } else if (iArr[4] > 59) {
                throw new IllegalArgumentException("\"second\" (" + iArr[4] + ") is not less or equal to 59");
            } else if (iArr[5] < 0) {
                throw new IllegalArgumentException("\"lesserFields[5]\" (" + iArr[5] + ") is not greater or equal to 0");
            } else if (iArr[5] >= 1000000000) {
                throw new IllegalArgumentException("\"lesserFields[5]\" (" + iArr[5] + ") is not less than 1000000000");
            } else if (iArr[6] < -1439) {
                throw new IllegalArgumentException("\"lesserFields[6]\" (" + iArr[6] + ") is not greater or equal to -1439");
            } else if (iArr[6] <= 1439) {
            } else {
                throw new IllegalArgumentException("\"lesserFields[6]\" (" + iArr[6] + ") is not less or equal to 1439");
            }
        }
    }

    public static boolean g(byte[] bArr) {
        int i10 = 0;
        while (true) {
            int N = N(bArr, i10);
            if (N == -1) {
                return true;
            }
            if (N == -2) {
                return false;
            }
            i10 = N >= 65536 ? i10 + 4 : N >= 2048 ? i10 + 3 : N >= 128 ? i10 + 2 : i10 + 1;
        }
    }

    public static void h(int i10, int[] iArr) {
        f(iArr);
        if (iArr[0] == 2 && iArr[1] == 29 && !C(i10)) {
            throw new IllegalArgumentException();
        }
    }

    public static void i(u7.f fVar, int[] iArr) {
        f(iArr);
        if (iArr[0] == 2 && iArr[1] == 29) {
            if (fVar.S0(4).I1() == 0 && (fVar.S0(100).I1() != 0 || fVar.S0(400).I1() == 0)) {
                return;
            }
            throw new IllegalArgumentException();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:147:?, code lost:
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x00d8, code lost:
        r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00da, code lost:
        if (r0 == 0) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00dc, code lost:
        if (r0 >= 0) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00de, code lost:
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x00e3, code lost:
        return r14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int j(java.lang.String r24, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t7.t.j(java.lang.String, java.lang.String):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:?, code lost:
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:?, code lost:
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x008f, code lost:
        r0 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0092, code lost:
        if (r0 == 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0094, code lost:
        if (r0 >= 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x009a, code lost:
        return r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int k(java.lang.String r17, byte[] r18) {
        /*
            Method dump skipped, instructions count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t7.t.k(java.lang.String, byte[]):int");
    }

    public static u7.e l(u7.f fVar, int[] iArr, int[] iArr2) {
        Objects.requireNonNull(fVar, "bigYear");
        Objects.requireNonNull(iArr, "lesserFields");
        if (iArr.length < 7) {
            throw new IllegalArgumentException(" (7) is not less or equal to " + iArr.length);
        } else if (iArr.length < 7) {
            throw new IllegalArgumentException("\"lesserFields\" + \"'s length\" (" + iArr.length + ") is not greater or equal to 7");
        } else {
            Objects.requireNonNull(iArr2, "status");
            if (iArr2.length < 1) {
                throw new IllegalArgumentException("\"status\" + \"'s length\" (" + iArr2.length + ") is not greater or equal to 1");
            } else if (iArr[6] != 0) {
                throw new UnsupportedOperationException("Local time offsets not supported");
            } else {
                u7.f b10 = z(fVar, iArr[0], iArr[1]).J0(24).b(iArr[2]).J0(60).b(iArr[3]).J0(60).b(iArr[4]);
                if (iArr[5] == 0 && b10.p0() <= 64) {
                    iArr2[0] = 0;
                    return u7.e.s(b10);
                }
                double R = u7.d.C(iArr[5]).t(1000000000).d(u7.d.B(b10)).R();
                if (R == Double.POSITIVE_INFINITY || R == Double.NEGATIVE_INFINITY || Double.isNaN(R)) {
                    iArr2[0] = 2;
                    return null;
                }
                iArr2[0] = 1;
                return u7.e.q(R);
            }
        }
    }

    public static boolean m(long j10) {
        return (j10 & Long.MAX_VALUE) < 9218868437227405312L;
    }

    public static boolean n(long j10) {
        return (j10 & Long.MAX_VALUE) > 9218868437227405312L;
    }

    public static String o(long j10) {
        return u7.e.r(j10).J(u7.c.f23185r);
    }

    public static boolean p(long j10) {
        if ((Long.MAX_VALUE & j10) == 0) {
            return true;
        }
        int i10 = (int) ((j10 >> 52) & 2047);
        long j11 = j10 & 4503599627370495L;
        int i11 = i10 - 896;
        if (i10 == 2047) {
            return (j11 & 536870911) == 0;
        } else if (i11 < -23 || i11 >= 255) {
            return false;
        } else {
            if (i11 > 0) {
                return (j11 & 536870911) == 0;
            } else if (i11 != -23) {
                return (j11 & ((1 << (29 - (i11 - 1))) - 1)) == 0;
            } else {
                int i12 = 29 - (i11 - 1);
                return (j11 & ((1 << i12) - 1)) == 0 && F(j11 | 4503599627370496L, i12) != 0;
            }
        }
    }

    public static int q(long j10) {
        int i10 = (int) ((j10 >> 52) & 2047);
        long j11 = 4503599627370495L & j10;
        int i11 = ((int) (j10 >> 48)) & 32768;
        int i12 = i10 - 1008;
        if (i10 == 2047) {
            int i13 = (int) (j11 >> 42);
            if ((j11 & 4398046511103L) != 0) {
                return -1;
            }
            return i11 | 31744 | i13;
        } else if (i12 >= 31 || i12 < -10) {
            return -1;
        } else {
            if (i12 > 0) {
                if ((4398046511103L & j11) != 0) {
                    return -1;
                }
                return i11 | (i12 << 10) | F(j11, 42);
            }
            int i14 = 42 - (i12 - 1);
            int F = F(4503599627370496L | j11, i14);
            if ((i12 == -10 && F == 0) || (j11 & ((1 << i14) - 1)) != 0) {
                return -1;
            }
            return i11 | F;
        }
    }

    public static long r(double d10) {
        return Double.doubleToRawLongBits(d10);
    }

    public static int s(long j10) {
        int F;
        int i10 = (int) ((j10 >> 52) & 2047);
        long j11 = 4503599627370495L & j10;
        int i11 = ((int) (j10 >> 32)) & Integer.MIN_VALUE;
        int i12 = i10 - 896;
        if (i10 == 2047) {
            int i13 = (int) (j11 >> 29);
            if (j11 == 0 || i13 != 0) {
                i11 |= 2139095040;
            } else {
                i13 = 2139095041;
            }
            return i11 | i13;
        } else if (i12 >= 255) {
            return i11 | 2139095040;
        } else {
            if (i12 < -23) {
                return i11;
            }
            if (i12 > 0) {
                i11 |= i12 << 23;
                F = F(j11, 29);
            } else {
                F = F(j11 | 4503599627370496L, 29 - (i12 - 1));
            }
            return i11 | F;
        }
    }

    public static u7.f t(long j10) {
        int i10 = (int) (j10 & 4294967295L);
        int i11 = (int) ((j10 >> 32) & 4294967295L);
        int i12 = (i11 >> 20) & 2047;
        boolean z10 = (i11 >> 31) != 0;
        if (i12 != 2047) {
            int i13 = i11 & 1048575;
            if (i12 == 0) {
                i12++;
            } else {
                i13 |= 1048576;
            }
            if ((i13 | i10) != 0) {
                while ((i10 & 1) == 0) {
                    i10 = (i13 << 31) | ((i10 >> 1) & Integer.MAX_VALUE);
                    i13 >>= 1;
                    i12++;
                }
            }
            int i14 = i12 - 1075;
            u7.f X = u7.f.X(new byte[]{(byte) (i10 & 255), (byte) ((i10 >> 8) & 255), (byte) ((i10 >> 16) & 255), (byte) ((i10 >> 24) & 255), (byte) (i13 & 255), (byte) ((i13 >> 8) & 255), (byte) ((i13 >> 16) & 255), (byte) ((i13 >> 24) & 255), 0}, true);
            if (i14 == 0) {
                return z10 ? X.L0() : X;
            } else if (i14 > 0) {
                u7.f a12 = X.a1(i14);
                return z10 ? a12.L0() : a12;
            } else {
                u7.f c12 = X.c1(-i14);
                return z10 ? c12.L0() : c12;
            }
        }
        throw new ArithmeticException("Value is infinity or NaN");
    }

    public static String u(String str) {
        if (str.length() <= 0 || str.charAt(0) < 'A' || str.charAt(0) > 'Z') {
            return str;
        }
        return ((char) (str.charAt(0) + ' ')) + str.substring(1);
    }

    public static String v(String str) {
        if (str.length() <= 0 || str.charAt(0) < 'a' || str.charAt(0) > 'z') {
            return str;
        }
        return ((char) (str.charAt(0) - ' ')) + str.substring(1);
    }

    private static long w(long j10, int i10) {
        return j10 >= 0 ? j10 / i10 : (-1) - (((-1) - j10) / i10);
    }

    private static long x(long j10, int i10) {
        return j10 - (w(j10, i10) * i10);
    }

    public static void y(u7.f fVar, int i10, u7.f fVar2, u7.f[] fVarArr, int[] iArr) {
        u7.f fVar3;
        int i11;
        int abs;
        int i12;
        int i13 = i10;
        u7.f fVar4 = fVar2;
        if (i13 <= 0 || i13 > 12) {
            throw new IllegalArgumentException("month");
        }
        if (!fVar.B() || !fVar2.B()) {
            if (fVar4.C1(100) > 0) {
                u7.f L = fVar4.L(146097);
                fVar4 = fVar4.n1(L.J0(146097));
                fVar3 = fVar.d(L.J0(400));
            } else {
                fVar3 = fVar;
            }
            if (fVar4.C1(-101) < 0) {
                u7.f L2 = fVar4.a().L(146097);
                fVar4 = fVar4.d(L2.J0(146097));
                fVar3 = fVar3.n1(L2.J0(400));
            }
            int[] iArr2 = (fVar3.S0(4).I1() != 0 || (fVar3.S0(100).I1() == 0 && fVar3.S0(400).I1() != 0)) ? f22002c : f22003d;
            while (true) {
                u7.f Y = u7.f.Y(iArr2[i13]);
                if (fVar4.I1() > 0 && fVar4.compareTo(Y) <= 0) {
                    iArr[0] = i13;
                    iArr[1] = fVar4.s1();
                    fVarArr[0] = fVar3;
                    return;
                }
                if (fVar4.compareTo(Y) > 0) {
                    fVar4 = fVar4.n1(Y);
                    if (i13 == 12) {
                        fVar3 = fVar3.b(1);
                        iArr2 = (fVar3.S0(4).I1() != 0 || (fVar3.S0(100).I1() == 0 && fVar3.S0(400).I1() != 0)) ? f22002c : f22003d;
                        i13 = 1;
                    } else {
                        i13++;
                    }
                }
                if (fVar4.I1() <= 0) {
                    i13--;
                    if (i13 <= 0) {
                        fVar3 = fVar3.b(-1);
                        iArr2 = (fVar3.S0(4).I1() != 0 || (fVar3.S0(100).I1() == 0 && fVar3.S0(400).I1() != 0)) ? f22002c : f22003d;
                        i13 = 12;
                    }
                    fVar4 = fVar4.b(iArr2[i13]);
                }
            }
        } else {
            long s12 = fVar.s1();
            int s13 = fVar2.s1();
            if (s13 > 100) {
                s13 -= (s13 / 146097) * 146097;
                s12 += i12 * 400;
            }
            if (s13 < -101) {
                s13 += 146097 * (s13 == Integer.MIN_VALUE ? 14699 : Math.abs(s13) / 146097);
                s12 -= abs * 400;
            }
            if (s12 == 1970 && i13 == 1 && s13 > 0 && s13 >= 10957) {
                s13 -= 10957;
                s12 = 2000;
            }
            if (s12 == 2000 && i13 == 1 && s13 > 0 && s13 < 35064) {
                s13 += (s13 / 1461) * 1461;
                s12 -= i11 * 4;
            }
            while (s13 > 366) {
                if ((s12 & 3) != 0 || (s12 % 100 == 0 && s12 % 400 != 0)) {
                    s12++;
                    s13 -= 365;
                } else {
                    s12++;
                    s13 -= 366;
                }
            }
            int[] iArr3 = ((s12 & 3) != 0 || (s12 % 100 == 0 && s12 % 400 != 0)) ? f22002c : f22003d;
            while (true) {
                int i14 = iArr3[i13];
                if (s13 > 0 && s13 <= i14) {
                    iArr[0] = i13;
                    iArr[1] = s13;
                    fVarArr[0] = u7.f.Z(s12);
                    return;
                }
                if (s13 > i14) {
                    s13 -= i14;
                    if (i13 == 12) {
                        s12++;
                        iArr3 = ((s12 & 3) != 0 || (s12 % 100 == 0 && s12 % 400 != 0)) ? f22002c : f22003d;
                        i13 = 1;
                    } else {
                        i13++;
                    }
                }
                if (s13 <= 0) {
                    i13--;
                    if (i13 <= 0) {
                        s12--;
                        iArr3 = ((s12 & 3) != 0 || (s12 % 100 == 0 && s12 % 400 != 0)) ? f22002c : f22003d;
                        i13 = 12;
                    }
                    s13 += iArr3[i13];
                }
            }
        }
    }

    public static u7.f z(u7.f fVar, int i10, int i11) {
        int i12;
        u7.f fVar2;
        if (i10 <= 0 || i10 > 12) {
            throw new IllegalArgumentException("month");
        }
        if (i11 <= 0 || i11 > 31) {
            throw new IllegalArgumentException("mday");
        }
        boolean z10 = false;
        u7.f Y = u7.f.Y(0);
        if (fVar.C1(1970) >= 0) {
            if (fVar.S0(4).I1() != 0 || (fVar.S0(100).I1() == 0 && fVar.S0(400).I1() != 0)) {
                z10 = true;
            }
            u7.f Y2 = u7.f.Y(1970);
            if (Y2.b(401).compareTo(fVar) < 0) {
                u7.f l12 = fVar.l1(2);
                Y = Y.d(l12.l1(1970).L(400).J0(146097));
                Y2 = l12.n1(l12.l1(1970).S0(400));
            }
            u7.f d10 = Y.d(fVar.n1(Y2).J0(365)).d(fVar.n1(Y2.S0(4).I1() != 0 ? Y2.b(4 - Y2.S0(4).s1()) : Y2).b(3).L(4));
            if (Y2.S0(100).I1() != 0) {
                Y2 = Y2.b(100 - Y2.S0(100).s1());
            }
            while (Y2.compareTo(fVar) < 0) {
                if (Y2.S0(400).I1() != 0) {
                    d10 = d10.l1(1);
                }
                Y2 = Y2.b(100);
            }
            return d10.b(z10 ? f22004e[i10 - 1] : f22005f[i10 - 1]).b(i11 - 1);
        }
        u7.f Y3 = u7.f.Y(1969);
        u7.f n12 = Y3.n1(fVar);
        if (n12.C1(401) > 0) {
            u7.f L = n12.l1(401).L(400);
            Y = Y.n1(L.J0(146097));
            n12 = n12.n1(L.J0(400));
            Y3 = Y3.n1(L.J0(400));
        }
        u7.f n13 = Y.n1(n12.J0(365));
        int i13 = 1;
        while (Y3.compareTo(fVar) > 0) {
            if (i13 == 1 && Y3.S0(4).I1() == 0) {
                i13 = 4;
            }
            if (Y3.S0(4).I1() == 0 && (Y3.S0(100).I1() != 0 || Y3.S0(400).I1() == 0)) {
                n13 = n13.l1(1);
            }
            Y3 = Y3.l1(i13);
        }
        if (fVar.S0(4).I1() != 0 || (fVar.S0(100).I1() == 0 && fVar.S0(400).I1() != 0)) {
            fVar2 = n13.l1(365 - f22004e[i10]);
            i12 = f22002c[i10];
        } else {
            fVar2 = n13.l1(366 - f22005f[i10]);
            i12 = f22003d[i10];
        }
        return fVar2.l1((i12 - i11) + 1);
    }
}
