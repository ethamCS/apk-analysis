package v7;

import java.io.OutputStream;
import java.util.Objects;
/* loaded from: classes.dex */
public final class a {
    public static int a(String str, int i10, int i11) {
        int i12;
        Objects.requireNonNull(str, "str");
        if (i10 < str.length() && i10 >= 0) {
            char charAt = str.charAt(i10);
            if ((charAt & 64512) == 55296 && (i12 = i10 + 1) < str.length() && (64512 & str.charAt(i12)) == 56320) {
                return ((charAt & 1023) << 10) + 65536 + (str.charAt(i12) & 1023);
            }
            if ((63488 & charAt) != 55296) {
                return charAt;
            }
            if (i11 == 0) {
                return 65533;
            }
            if (i11 != 1) {
                return -1;
            }
            return charAt;
        }
        return -1;
    }

    public static long b(String str, boolean z10) {
        long j10;
        Objects.requireNonNull(str, "str");
        long j11 = 0;
        int i10 = 0;
        while (i10 < str.length()) {
            char charAt = str.charAt(i10);
            if (charAt <= 127) {
                j10 = 1;
            } else if (charAt <= 2047) {
                j10 = 2;
            } else {
                if (charAt > 55295 && charAt < 57344) {
                    if (charAt <= 56319) {
                        i10++;
                        if (i10 < str.length() && str.charAt(i10) >= 56320 && str.charAt(i10) <= 57343) {
                            j10 = 4;
                        } else if (!z10) {
                            return -1L;
                        } else {
                            j11 += 3;
                            i10--;
                            i10++;
                        }
                    } else if (!z10) {
                        return -1L;
                    }
                }
                j11 += 3;
                i10++;
            }
            j11 += j10;
            i10++;
        }
        return j11;
    }

    public static String c(byte[] bArr, boolean z10) {
        Objects.requireNonNull(bArr, "bytes");
        StringBuilder sb2 = new StringBuilder();
        if (e(bArr, 0, bArr.length, sb2, z10) == 0) {
            return sb2.toString();
        }
        throw new IllegalArgumentException("Invalid UTF-8");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0038, code lost:
        if (r9 == 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
        if (r23 == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
        r22.append((char) 65533);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0040, code lost:
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0041, code lost:
        return r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int d(java.io.InputStream r20, int r21, java.lang.StringBuilder r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v7.a.d(java.io.InputStream, int, java.lang.StringBuilder, boolean):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0097, code lost:
        if (r14 < r8) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0099, code lost:
        if (r14 <= r9) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x009c, code lost:
        r10 = r10 + 1;
        r11 = r11 + ((r14 - 128) << ((r7 - r10) * 6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00a7, code lost:
        if (r10 == r7) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ae, code lost:
        if (r11 > 65535) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00b0, code lost:
        r4 = (char) r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00b2, code lost:
        r11 = r11 - 65536;
        r19.append((char) ((r11 >> 10) + 55296));
        r4 = (char) ((r11 & 1023) + 56320);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00c6, code lost:
        r19.append(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00cb, code lost:
        if (r20 == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00cd, code lost:
        r1 = r1 - 1;
        r19.append((char) 65533);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d4, code lost:
        return -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int e(byte[] r16, int r17, int r18, java.lang.StringBuilder r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v7.a.e(byte[], int, int, java.lang.StringBuilder, boolean):int");
    }

    public static String f(String str) {
        boolean z10;
        if (str == null) {
            return null;
        }
        int length = str.length();
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                z10 = false;
                break;
            }
            char charAt = str.charAt(i10);
            if (charAt >= 'A' && charAt <= 'Z') {
                z10 = true;
                break;
            }
            i10++;
        }
        if (!z10) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < length; i11++) {
            char charAt2 = str.charAt(i11);
            if (charAt2 >= 'A' && charAt2 <= 'Z') {
                charAt2 = (char) (charAt2 + ' ');
            }
            sb2.append(charAt2);
        }
        return sb2.toString();
    }

    public static int g(String str, int i10, int i11, OutputStream outputStream, boolean z10) {
        return h(str, i10, i11, outputStream, z10, false);
    }

    public static int h(String str, int i10, int i11, OutputStream outputStream, boolean z10, boolean z11) {
        int i12;
        int i13;
        int i14;
        int i15;
        Objects.requireNonNull(outputStream, "stream");
        Objects.requireNonNull(str, "str");
        if (i10 < 0) {
            throw new IllegalArgumentException("offset(" + i10 + ") is less than 0");
        } else if (i10 > str.length()) {
            throw new IllegalArgumentException("offset(" + i10 + ") is more than " + str.length());
        } else if (i11 < 0) {
            throw new IllegalArgumentException("length(" + i11 + ") is less than 0");
        } else if (i11 > str.length()) {
            throw new IllegalArgumentException("length(" + i11 + ") is more than " + str.length());
        } else if (str.length() - i10 < i11) {
            throw new IllegalArgumentException("str.length() minus offset(" + (str.length() - i10) + ") is less than " + i11);
        } else if (i11 == 0) {
            return 0;
        } else {
            int min = Math.min(4096, i11);
            if (min < 4096) {
                min = Math.min(4096, min * 3);
            }
            byte[] bArr = new byte[min];
            int i16 = i11 + i10;
            int i17 = 0;
            while (true) {
                if (i10 >= i16) {
                    i12 = 0;
                    break;
                }
                int charAt = str.charAt(i10);
                if (charAt <= 127) {
                    if (z11) {
                        if (charAt == 13 && ((i15 = i10 + 1) >= i16 || str.charAt(i15) != '\n')) {
                            if (i17 + 2 > 4096) {
                                outputStream.write(bArr, 0, i17);
                                i17 = 0;
                            }
                            int i18 = i17 + 1;
                            bArr[i17] = 13;
                            i17 = i18 + 1;
                            bArr[i18] = 10;
                        } else if (charAt == 13) {
                            if (i17 + 2 > 4096) {
                                outputStream.write(bArr, 0, i17);
                                i17 = 0;
                            }
                            int i19 = i17 + 1;
                            bArr[i17] = 13;
                            i17 = i19 + 1;
                            bArr[i19] = 10;
                            i10++;
                        } else if (charAt == 10) {
                            if (i17 + 2 > 4096) {
                                outputStream.write(bArr, 0, i17);
                                i17 = 0;
                            }
                            int i20 = i17 + 1;
                            bArr[i17] = 13;
                            i17 = i20 + 1;
                            bArr[i20] = 10;
                        }
                        i10++;
                    }
                    if (i17 >= 4096) {
                        outputStream.write(bArr, 0, i17);
                        i17 = 0;
                    }
                    i13 = i17 + 1;
                    bArr[i17] = (byte) charAt;
                    i17 = i13;
                    i10++;
                } else {
                    if (charAt <= 2047) {
                        if (i17 + 2 > 4096) {
                            outputStream.write(bArr, 0, i17);
                            i17 = 0;
                        }
                        int i21 = i17 + 1;
                        bArr[i17] = (byte) (((charAt >> 6) & 31) | 192);
                        i17 = i21 + 1;
                        bArr[i21] = (byte) ((charAt & 63) | 128);
                    } else {
                        if ((charAt & 64512) == 55296 && (i14 = i10 + 1) < i16 && (64512 & str.charAt(i14)) == 56320) {
                            charAt = ((charAt & 1023) << 10) + 65536 + (str.charAt(i14) & 1023);
                            i10 = i14;
                        } else if ((63488 & charAt) == 55296) {
                            if (!z10) {
                                i12 = -1;
                                break;
                            }
                            charAt = 65533;
                        }
                        if (charAt <= 65535) {
                            if (i17 + 3 > 4096) {
                                outputStream.write(bArr, 0, i17);
                                i17 = 0;
                            }
                            int i22 = i17 + 1;
                            bArr[i17] = (byte) (((charAt >> 12) & 15) | 224);
                            int i23 = i22 + 1;
                            bArr[i22] = (byte) (((charAt >> 6) & 63) | 128);
                            i13 = i23 + 1;
                            bArr[i23] = (byte) ((charAt & 63) | 128);
                            i17 = i13;
                        } else {
                            if (i17 + 4 > 4096) {
                                outputStream.write(bArr, 0, i17);
                                i17 = 0;
                            }
                            int i24 = i17 + 1;
                            bArr[i17] = (byte) (((charAt >> 18) & 7) | 240);
                            int i25 = i24 + 1;
                            bArr[i24] = (byte) (((charAt >> 12) & 63) | 128);
                            int i26 = i25 + 1;
                            bArr[i25] = (byte) (((charAt >> 6) & 63) | 128);
                            i17 = i26 + 1;
                            bArr[i26] = (byte) ((charAt & 63) | 128);
                        }
                    }
                    i10++;
                }
            }
            outputStream.write(bArr, 0, i17);
            return i12;
        }
    }

    public static int i(String str, OutputStream outputStream, boolean z10) {
        Objects.requireNonNull(str, "str");
        return g(str, 0, str.length(), outputStream, z10);
    }
}
