package u7;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class g {
    private static f a(String str, int i10, int i11, int i12, boolean z10, boolean z11) {
        int i13 = i12 - i11;
        if (i13 > 72) {
            int i14 = (i13 / 2) + i11;
            f a10 = a(str, i10, i11, i14, false, z11);
            f a11 = a(str, i10, i14, i12, false, z11);
            int i15 = i12 - i14;
            f d10 = (i10 == 10 ? q.q(a10, i15).a1(i15) : i10 == 5 ? q.q(a10, i15) : a10.K0(f.Y(i10).N0(i15))).d(a11);
            return z10 ? d10.L0() : d10;
        }
        return c(str, i10, i11, i12, z10, z11);
    }

    public static f b(String str, int i10, int i11, int i12, boolean z10) {
        boolean z11;
        int i13 = i11;
        if (i10 < 2) {
            if (!z10) {
                return null;
            }
            throw new IllegalArgumentException("radix(" + i10 + ") is less than 2");
        } else if (i10 > 36) {
            if (!z10) {
                return null;
            }
            throw new IllegalArgumentException("radix(" + i10 + ") is more than 36");
        } else if (i13 < 0) {
            if (!z10) {
                return null;
            }
            throw new IllegalArgumentException("index(" + i13 + ") is less than 0");
        } else if (i13 > str.length()) {
            if (!z10) {
                return null;
            }
            throw new IllegalArgumentException("index(" + i13 + ") is more than " + str.length());
        } else if (i12 < 0) {
            if (!z10) {
                return null;
            }
            throw new IllegalArgumentException("endIndex(" + i12 + ") is less than 0");
        } else if (i12 > str.length()) {
            if (!z10) {
                return null;
            }
            throw new IllegalArgumentException("endIndex(" + i12 + ") is more than " + str.length());
        } else if (i12 < i13) {
            if (!z10) {
                return null;
            }
            throw new IllegalArgumentException("endIndex(" + i12 + ") is less than " + i13);
        } else if (i13 == i12) {
            if (z10) {
                throw new NumberFormatException("No digits");
            }
            return null;
        } else {
            if (str.charAt(i13) == '-') {
                i13++;
                if (i13 == i12) {
                    if (z10) {
                        throw new NumberFormatException("No digits");
                    }
                    return null;
                }
                z11 = true;
            } else {
                z11 = false;
            }
            while (i13 < i12 && str.charAt(i13) == '0') {
                i13++;
            }
            int i14 = i12 - i13;
            if (i14 == 0) {
                return f.Y(0);
            }
            int[] iArr = f.f23223x;
            if (i10 != 16) {
                if (i10 != 2) {
                    return a(str, i10, i13, i12, z11, z10);
                }
                int i15 = i14 & 15;
                int i16 = i14 >> 4;
                if (i15 != 0) {
                    i16++;
                }
                short[] sArr = new short[i16];
                int i17 = i16 - 1;
                if (i15 != 0) {
                    int i18 = 0;
                    for (int i19 = 0; i19 < i15; i19++) {
                        int i20 = i18 << 1;
                        char charAt = str.charAt(i13 + i19);
                        int i21 = charAt == '0' ? 0 : charAt == '1' ? 1 : 2;
                        if (i21 >= 2) {
                            if (z10) {
                                throw new NumberFormatException("Illegal character found");
                            }
                            return null;
                        }
                        i18 = i20 | i21;
                    }
                    sArr[i17] = (short) i18;
                    i17--;
                    i13 += i15;
                }
                while (i13 < i12) {
                    int i22 = i13 + 15;
                    int i23 = 0;
                    for (int i24 = 0; i24 < 16; i24++) {
                        char charAt2 = str.charAt(i22);
                        int i25 = charAt2 == '0' ? 0 : charAt2 == '1' ? 1 : 2;
                        if (i25 >= 2) {
                            if (z10) {
                                throw new NumberFormatException("Illegal character found");
                            }
                            return null;
                        }
                        i22--;
                        i23 |= i25 << i24;
                    }
                    i13 += 16;
                    sArr[i17] = (short) i23;
                    i17--;
                }
                int H = f.H(sArr);
                return H == 0 ? f.Y(0) : new f(H, sArr, z11);
            }
            int i26 = i14 & 3;
            int i27 = i14 >> 2;
            if (i26 != 0) {
                i27++;
            }
            short[] sArr2 = new short[i27];
            int i28 = i27 - 1;
            if (i26 != 0) {
                int i29 = 0;
                for (int i30 = 0; i30 < i26; i30++) {
                    int i31 = i29 << 4;
                    char charAt3 = str.charAt(i13 + i30);
                    int i32 = charAt3 >= 128 ? 36 : iArr[charAt3];
                    if (i32 >= 16) {
                        if (z10) {
                            throw new NumberFormatException("Illegal character found");
                        }
                        return null;
                    }
                    i29 = i31 | i32;
                }
                sArr2[i28] = (short) i29;
                i28--;
                i13 += i26;
            }
            while (i13 < i12) {
                char charAt4 = str.charAt(i13 + 3);
                int i33 = charAt4 >= 128 ? 36 : iArr[charAt4];
                if (i33 >= 16) {
                    if (z10) {
                        throw new NumberFormatException("Illegal character found");
                    }
                    return null;
                }
                char charAt5 = str.charAt(i13 + 2);
                int i34 = charAt5 >= 128 ? 36 : iArr[charAt5];
                if (i34 >= 16) {
                    if (z10) {
                        throw new NumberFormatException("Illegal character found");
                    }
                    return null;
                }
                int i35 = i33 | (i34 << 4);
                char charAt6 = str.charAt(i13 + 1);
                int i36 = charAt6 >= 128 ? 36 : iArr[charAt6];
                if (i36 >= 16) {
                    if (z10) {
                        throw new NumberFormatException("Illegal character found");
                    }
                    return null;
                }
                int i37 = i35 | (i36 << 8);
                char charAt7 = str.charAt(i13);
                int i38 = charAt7 >= 128 ? 36 : iArr[charAt7];
                if (i38 >= 16) {
                    if (z10) {
                        throw new NumberFormatException("Illegal character found");
                    }
                    return null;
                }
                i13 += 4;
                sArr2[i28] = (short) (i37 | (i38 << 12));
                i28--;
            }
            int H2 = f.H(sArr2);
            return H2 == 0 ? f.Y(0) : new f(H2, sArr2, z11);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
        if (r28 != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
        throw new java.lang.NumberFormatException("Illegal character found");
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x007e, code lost:
        if (r28 != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0080, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0086, code lost:
        throw new java.lang.NumberFormatException("Illegal character found");
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0167, code lost:
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static u7.f c(java.lang.String r23, int r24, int r25, int r26, boolean r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 655
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.g.c(java.lang.String, int, int, int, boolean, boolean):u7.f");
    }
}
