package t7;
/* loaded from: classes.dex */
final class d0 {

    /* loaded from: classes.dex */
    public enum a {
        IRIStrict,
        URIStrict,
        IRILenient,
        URILenient,
        IRISurrogateLenient
    }

    public static boolean a(String str) {
        int[] i10 = str == null ? null : i(str, 0, str.length(), a.IRIStrict);
        return i10 != null && i10[0] >= 0;
    }

    private static boolean b(char c10) {
        return (c10 >= 'a' && c10 <= 'f') || (c10 >= 'A' && c10 <= 'F') || (c10 >= '0' && c10 <= '9');
    }

    private static boolean c(int i10) {
        return (i10 >= 97 && i10 <= 122) || (i10 >= 65 && i10 <= 90) || ((i10 >= 48 && i10 <= 57) || (((i10 & 127) == i10 && "-._~!$&'()*+,;=".indexOf((char) i10) >= 0) || ((i10 >= 160 && i10 <= 55295) || ((i10 >= 63744 && i10 <= 64975) || ((i10 >= 65008 && i10 <= 65519) || ((i10 >= 921600 && i10 <= 983037) || (i10 >= 65536 && i10 <= 917501 && (i10 & 65534) != 65534)))))));
    }

    private static boolean d(int i10) {
        return (i10 >= 97 && i10 <= 122) || (i10 >= 65 && i10 <= 90) || ((i10 >= 48 && i10 <= 57) || (((i10 & 127) == i10 && "-._~:!$&'()*+,;=".indexOf((char) i10) >= 0) || ((i10 >= 160 && i10 <= 55295) || ((i10 >= 63744 && i10 <= 64975) || ((i10 >= 65008 && i10 <= 65519) || ((i10 >= 921600 && i10 <= 983037) || (i10 >= 65536 && i10 <= 917501 && (i10 & 65534) != 65534)))))));
    }

    private static boolean e(int i10) {
        return (i10 >= 97 && i10 <= 122) || (i10 >= 65 && i10 <= 90) || ((i10 >= 48 && i10 <= 57) || (((i10 & 127) == i10 && "/?-._~:@!$&'()*+,;=".indexOf((char) i10) >= 0) || ((i10 >= 160 && i10 <= 55295) || ((i10 >= 63744 && i10 <= 64975) || ((i10 >= 65008 && i10 <= 65519) || ((i10 >= 921600 && i10 <= 983037) || (i10 >= 65536 && i10 <= 917501 && (i10 & 65534) != 65534)))))));
    }

    private static boolean f(int i10) {
        return (i10 >= 97 && i10 <= 122) || (i10 >= 65 && i10 <= 90) || ((i10 >= 48 && i10 <= 57) || (((i10 & 127) == i10 && "/-._~:@!$&'()*+,;=".indexOf((char) i10) >= 0) || ((i10 >= 160 && i10 <= 55295) || ((i10 >= 63744 && i10 <= 64975) || ((i10 >= 65008 && i10 <= 65519) || ((i10 >= 921600 && i10 <= 983037) || (i10 >= 65536 && i10 <= 917501 && (i10 & 65534) != 65534)))))));
    }

    private static boolean g(int i10) {
        return (i10 >= 97 && i10 <= 122) || (i10 >= 65 && i10 <= 90) || ((i10 >= 48 && i10 <= 57) || (((i10 & 127) == i10 && "/?-._~:@!$&'()*+,;=".indexOf((char) i10) >= 0) || ((i10 >= 160 && i10 <= 55295) || ((i10 >= 57344 && i10 <= 64975) || ((i10 >= 65008 && i10 <= 65519) || (i10 >= 65536 && i10 <= 1114109 && (i10 & 65534) != 65534 && (i10 < 917504 || i10 > 921599)))))));
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x0163, code lost:
        r5 = r17;
        r8 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x01c5, code lost:
        if (r14 <= 255) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x01c8, code lost:
        r10[r15] = r14;
        r15 = r15 + 1;
        r9 = 4;
        r12 = '.';
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int h(java.lang.String r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 671
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t7.d0.h(java.lang.String, int, int):int");
    }

    public static int[] i(String str, int i10, int i11, a aVar) {
        boolean z10;
        char c10;
        int i12;
        char c11;
        int i13;
        if (str == null) {
            return null;
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("offset (" + i10 + ") is less than 0");
        } else if (i10 > str.length()) {
            throw new IllegalArgumentException("offset (" + i10 + ") is more than " + str.length());
        } else if (i11 < 0) {
            throw new IllegalArgumentException("length (" + i11 + ") is less than 0");
        } else if (i11 > str.length()) {
            throw new IllegalArgumentException("length (" + i11 + ") is more than " + str.length());
        } else if (str.length() - i10 < i11) {
            throw new IllegalArgumentException("s's length minus " + i10 + " (" + (str.length() - i10) + ") is less than " + i11);
        } else {
            int[] iArr = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
            char c12 = 0;
            if (i11 == 0) {
                iArr[4] = 0;
                iArr[5] = 0;
                return iArr;
            }
            char c13 = 1;
            boolean z11 = aVar == a.URILenient || aVar == a.URIStrict;
            boolean z12 = aVar == a.URIStrict || aVar == a.IRIStrict;
            int i14 = i11 + i10;
            int i15 = i10;
            while (i15 < i14) {
                char charAt = str.charAt(i15);
                if (i15 > i10 && charAt == ':') {
                    iArr[c12] = i10;
                    iArr[c13] = i15;
                    i15++;
                    break;
                } else if ((z12 && i15 == i10 && ((charAt < 'a' || charAt > 'z') && (charAt < 'A' || charAt > 'Z'))) || ((z12 && i15 > i10 && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && ((charAt < '0' || charAt > '9') && charAt != '+' && charAt != '-' && charAt != '.')))) || (!z12 && (charAt == '#' || charAt == ':' || charAt == '?' || charAt == '/')))) {
                    break;
                } else {
                    i15++;
                    c12 = 0;
                    c13 = 1;
                }
            }
            c13 = 0;
            if (c13 == 0) {
                i15 = i10;
            }
            int i16 = i15 + 2;
            char c14 = 64512;
            if (i16 <= i14 && str.charAt(i15) == '/' && str.charAt(i15 + 1) == '/') {
                iArr[2] = i16;
                iArr[3] = i14;
                i15 = i16;
                char c15 = 0;
                while (i15 < i14) {
                    int charAt2 = str.charAt(i15);
                    if (z11 && charAt2 >= 128) {
                        return null;
                    }
                    if ((charAt2 & c14) == 55296 && (i13 = i15 + 1) < i14 && (str.charAt(i13) & c14) == 56320) {
                        charAt2 = ((charAt2 & 1023) << 10) + 65536 + (str.charAt(i13) & 1023);
                        i15 = i13;
                    } else if ((63488 & charAt2) == 55296) {
                        if (aVar != a.IRISurrogateLenient) {
                            return null;
                        }
                        charAt2 = 65533;
                    }
                    if (charAt2 != 37 || (!(c15 == 0 || c15 == 1) || !z12)) {
                        if (c15 == 0) {
                            if (charAt2 != 47 && charAt2 != 63 && charAt2 != 35) {
                                if (z12 && charAt2 == 64) {
                                    i15++;
                                    c14 = 64512;
                                    c15 = 1;
                                } else if (z12 && d(charAt2) && (i15 = i15 + 1) != i14) {
                                }
                            }
                            i15 = i16;
                            c14 = 64512;
                            c15 = 1;
                        } else if (c15 == 1) {
                            if (charAt2 == 47 || charAt2 == 63 || charAt2 == 35) {
                                iArr[3] = i15;
                                break;
                            }
                            if (z12) {
                                if (charAt2 == 91) {
                                    i15 = h(str, i15 + 1, i14);
                                    if (i15 < 0) {
                                        return null;
                                    }
                                } else if (charAt2 == 58) {
                                    i15++;
                                    c11 = 3;
                                    c15 = 2;
                                    c14 = 64512;
                                } else if (!c(charAt2)) {
                                    return null;
                                }
                            }
                            i15++;
                        } else if (c15 == 2) {
                            if (charAt2 == 47 || charAt2 == 63 || charAt2 == 35) {
                                iArr[3] = i15;
                                break;
                            }
                            if (charAt2 < 48 || charAt2 > 57) {
                                return null;
                            }
                            i15++;
                        }
                        c11 = 3;
                        c14 = 64512;
                    } else {
                        int i17 = i15 + 2;
                        if (i17 >= i14 || !b(str.charAt(i15 + 1)) || !b(str.charAt(i17))) {
                            return null;
                        }
                        i15 += 3;
                    }
                    c14 = 64512;
                }
            }
            if (i15 == i10) {
                c10 = 4;
                z10 = true;
            } else {
                c10 = 4;
                z10 = false;
            }
            iArr[c10] = i15;
            iArr[5] = i14;
            char c16 = 0;
            boolean z13 = false;
            boolean z14 = false;
            while (i15 < i14) {
                int charAt3 = str.charAt(i15);
                if (z11 && charAt3 >= 128) {
                    return null;
                }
                if ((charAt3 & 64512) == 55296 && (i12 = i15 + 1) < i14 && (str.charAt(i12) & 64512) == 56320) {
                    charAt3 = ((charAt3 & 1023) << 10) + 65536 + (str.charAt(i12) & 1023);
                    i15 = i12;
                } else if ((63488 & charAt3) == 55296) {
                    return null;
                }
                if (charAt3 != 37 || !z12) {
                    if (c16 == 0) {
                        if (charAt3 == 58 && z10) {
                            z13 = true;
                        } else if (charAt3 == 47 && z10 && !z14) {
                            if (z12 && z13) {
                                return null;
                            }
                            z14 = true;
                        }
                        if (charAt3 == 63) {
                            iArr[5] = i15;
                            iArr[6] = i15 + 1;
                            iArr[7] = i14;
                            c16 = 1;
                        } else if (charAt3 == 35) {
                            iArr[5] = i15;
                            iArr[8] = i15 + 1;
                            iArr[9] = i14;
                            c16 = 2;
                        } else if (z12 && !f(charAt3)) {
                            return null;
                        }
                    } else if (c16 == 1) {
                        if (charAt3 == 35) {
                            iArr[7] = i15;
                            iArr[8] = i15 + 1;
                            iArr[9] = i14;
                            c16 = 2;
                        } else if (z12 && !g(charAt3)) {
                            return null;
                        }
                    } else if (c16 != 2) {
                        continue;
                    } else if (z12 && !e(charAt3)) {
                        return null;
                    } else {
                        i15++;
                    }
                    i15++;
                } else {
                    int i18 = i15 + 2;
                    if (i18 >= i14 || !b(str.charAt(i15 + 1)) || !b(str.charAt(i18))) {
                        return null;
                    }
                    i15 += 3;
                }
            }
            if (z12 && z10 && z13 && !z14) {
                return null;
            }
            return iArr;
        }
    }

    private static int j(char c10) {
        if (c10 < '0' || c10 > '9') {
            if (c10 >= 'A' && c10 <= 'F') {
                return (c10 + '\n') - 65;
            }
            if (c10 >= 'a' && c10 <= 'f') {
                return (c10 + '\n') - 97;
            }
            return 1;
        }
        return c10 - '0';
    }
}
