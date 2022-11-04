package u6;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class j {
    public static int a(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        int i11 = 0;
        if (i10 < length) {
            loop0: while (true) {
                char charAt = charSequence.charAt(i10);
                while (f(charAt) && i10 < length) {
                    i11++;
                    i10++;
                    if (i10 < length) {
                        break;
                    }
                }
            }
        }
        return i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String b(java.lang.String r7, u6.l r8, h6.f r9, h6.f r10) {
        /*
            r0 = 6
            u6.g[] r0 = new u6.g[r0]
            u6.a r1 = new u6.a
            r1.<init>()
            r2 = 0
            r0[r2] = r1
            u6.c r1 = new u6.c
            r1.<init>()
            r3 = 1
            r0[r3] = r1
            u6.m r1 = new u6.m
            r1.<init>()
            r4 = 2
            r0[r4] = r1
            u6.n r1 = new u6.n
            r1.<init>()
            r5 = 3
            r0[r5] = r1
            u6.f r1 = new u6.f
            r1.<init>()
            r5 = 4
            r0[r5] = r1
            u6.b r1 = new u6.b
            r1.<init>()
            r6 = 5
            r0[r6] = r1
            u6.h r1 = new u6.h
            r1.<init>(r7)
            r1.n(r8)
            r1.l(r9, r10)
            java.lang.String r8 = "[)>\u001e05\u001d"
            boolean r8 = r7.startsWith(r8)
            java.lang.String r9 = "\u001e\u0004"
            if (r8 == 0) goto L5d
            boolean r8 = r7.endsWith(r9)
            if (r8 == 0) goto L5d
            r7 = 236(0xec, float:3.31E-43)
        L50:
            r1.r(r7)
            r1.m(r4)
            int r7 = r1.f23141f
            int r7 = r7 + 7
            r1.f23141f = r7
            goto L6e
        L5d:
            java.lang.String r8 = "[)>\u001e06\u001d"
            boolean r8 = r7.startsWith(r8)
            if (r8 == 0) goto L6e
            boolean r7 = r7.endsWith(r9)
            if (r7 == 0) goto L6e
            r7 = 237(0xed, float:3.32E-43)
            goto L50
        L6e:
            boolean r7 = r1.i()
            if (r7 == 0) goto L87
            r7 = r0[r2]
            r7.a(r1)
            int r7 = r1.e()
            if (r7 < 0) goto L6e
            int r2 = r1.e()
            r1.j()
            goto L6e
        L87:
            int r7 = r1.a()
            r1.p()
            u6.k r8 = r1.g()
            int r8 = r8.a()
            if (r7 >= r8) goto La3
            if (r2 == 0) goto La3
            if (r2 == r6) goto La3
            if (r2 == r5) goto La3
            r7 = 254(0xfe, float:3.56E-43)
            r1.r(r7)
        La3:
            java.lang.StringBuilder r7 = r1.b()
            int r9 = r7.length()
            if (r9 >= r8) goto Lb2
            r9 = 129(0x81, float:1.81E-43)
        Laf:
            r7.append(r9)
        Lb2:
            int r9 = r7.length()
            if (r9 >= r8) goto Lc2
            int r9 = r7.length()
            int r9 = r9 + r3
            char r9 = o(r9)
            goto Laf
        Lc2:
            java.lang.StringBuilder r7 = r1.b()
            java.lang.String r7 = r7.toString()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: u6.j.b(java.lang.String, u6.l, h6.f, h6.f):java.lang.String");
    }

    private static int c(float[] fArr, int[] iArr, int i10, byte[] bArr) {
        Arrays.fill(bArr, (byte) 0);
        for (int i11 = 0; i11 < 6; i11++) {
            iArr[i11] = (int) Math.ceil(fArr[i11]);
            int i12 = iArr[i11];
            if (i10 > i12) {
                Arrays.fill(bArr, (byte) 0);
                i10 = i12;
            }
            if (i10 == i12) {
                bArr[i11] = (byte) (bArr[i11] + 1);
            }
        }
        return i10;
    }

    private static int d(byte[] bArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < 6; i11++) {
            i10 += bArr[i11];
        }
        return i10;
    }

    public static void e(char c10) {
        String hexString;
        throw new IllegalArgumentException("Illegal character: " + c10 + " (0x" + ("0000".substring(0, 4 - hexString.length()) + Integer.toHexString(c10)) + ')');
    }

    public static boolean f(char c10) {
        return c10 >= '0' && c10 <= '9';
    }

    public static boolean g(char c10) {
        return c10 >= 128 && c10 <= 255;
    }

    private static boolean h(char c10) {
        if (c10 != ' ') {
            if (c10 >= '0' && c10 <= '9') {
                return true;
            }
            return c10 >= 'A' && c10 <= 'Z';
        }
        return true;
    }

    private static boolean i(char c10) {
        return c10 >= ' ' && c10 <= '^';
    }

    private static boolean j(char c10) {
        if (c10 != ' ') {
            if (c10 >= '0' && c10 <= '9') {
                return true;
            }
            return c10 >= 'a' && c10 <= 'z';
        }
        return true;
    }

    private static boolean k(char c10) {
        if (m(c10) || c10 == ' ') {
            return true;
        }
        if (c10 >= '0' && c10 <= '9') {
            return true;
        }
        return c10 >= 'A' && c10 <= 'Z';
    }

    private static boolean l(char c10) {
        return false;
    }

    private static boolean m(char c10) {
        return c10 == '\r' || c10 == '*' || c10 == '>';
    }

    public static int n(CharSequence charSequence, int i10, int i11) {
        char c10;
        if (i10 >= charSequence.length()) {
            return i11;
        }
        float[] fArr = new float[6];
        if (i11 == 0) {
            // fill-array-data instruction
            fArr[0] = 0.0f;
            fArr[1] = 1.0f;
            fArr[2] = 1.0f;
            fArr[3] = 1.0f;
            fArr[4] = 1.0f;
            fArr[5] = 1.25f;
        } else {
            // fill-array-data instruction
            fArr[0] = 1.0f;
            fArr[1] = 2.0f;
            fArr[2] = 2.0f;
            fArr[3] = 2.0f;
            fArr[4] = 2.0f;
            fArr[5] = 2.25f;
            fArr[i11] = 0.0f;
        }
        int i12 = 0;
        while (true) {
            int i13 = i10 + i12;
            if (i13 == charSequence.length()) {
                byte[] bArr = new byte[6];
                int[] iArr = new int[6];
                int c11 = c(fArr, iArr, Integer.MAX_VALUE, bArr);
                int d10 = d(bArr);
                if (iArr[0] == c11) {
                    return 0;
                }
                if (d10 == 1 && bArr[5] > 0) {
                    return 5;
                }
                if (d10 == 1 && bArr[4] > 0) {
                    return 4;
                }
                if (d10 == 1 && bArr[2] > 0) {
                    return 2;
                }
                return (d10 != 1 || bArr[3] <= 0) ? 1 : 3;
            }
            char charAt = charSequence.charAt(i13);
            i12++;
            if (f(charAt)) {
                fArr[0] = fArr[0] + 0.5f;
            } else if (g(charAt)) {
                fArr[0] = (float) Math.ceil(fArr[0]);
                fArr[0] = fArr[0] + 2.0f;
            } else {
                fArr[0] = (float) Math.ceil(fArr[0]);
                fArr[0] = fArr[0] + 1.0f;
            }
            if (h(charAt)) {
                fArr[1] = fArr[1] + 0.6666667f;
            } else if (g(charAt)) {
                fArr[1] = fArr[1] + 2.6666667f;
            } else {
                fArr[1] = fArr[1] + 1.3333334f;
            }
            if (j(charAt)) {
                fArr[2] = fArr[2] + 0.6666667f;
            } else if (g(charAt)) {
                fArr[2] = fArr[2] + 2.6666667f;
            } else {
                fArr[2] = fArr[2] + 1.3333334f;
            }
            if (k(charAt)) {
                fArr[3] = fArr[3] + 0.6666667f;
            } else if (g(charAt)) {
                fArr[3] = fArr[3] + 4.3333335f;
            } else {
                fArr[3] = fArr[3] + 3.3333333f;
            }
            if (i(charAt)) {
                fArr[4] = fArr[4] + 0.75f;
            } else if (g(charAt)) {
                fArr[4] = fArr[4] + 4.25f;
            } else {
                fArr[4] = fArr[4] + 3.25f;
            }
            if (l(charAt)) {
                c10 = 5;
                fArr[5] = fArr[5] + 4.0f;
            } else {
                c10 = 5;
                fArr[5] = fArr[5] + 1.0f;
            }
            if (i12 >= 4) {
                int[] iArr2 = new int[6];
                byte[] bArr2 = new byte[6];
                c(fArr, iArr2, Integer.MAX_VALUE, bArr2);
                int d11 = d(bArr2);
                if (iArr2[0] < iArr2[c10] && iArr2[0] < iArr2[1] && iArr2[0] < iArr2[2] && iArr2[0] < iArr2[3] && iArr2[0] < iArr2[4]) {
                    return 0;
                }
                if (iArr2[5] < iArr2[0] || bArr2[1] + bArr2[2] + bArr2[3] + bArr2[4] == 0) {
                    return 5;
                }
                if (d11 == 1 && bArr2[4] > 0) {
                    return 4;
                }
                if (d11 == 1 && bArr2[2] > 0) {
                    return 2;
                }
                if (d11 == 1 && bArr2[3] > 0) {
                    return 3;
                }
                if (iArr2[1] + 1 < iArr2[0] && iArr2[1] + 1 < iArr2[5] && iArr2[1] + 1 < iArr2[4] && iArr2[1] + 1 < iArr2[2]) {
                    if (iArr2[1] < iArr2[3]) {
                        return 1;
                    }
                    if (iArr2[1] == iArr2[3]) {
                        for (int i14 = i10 + i12 + 1; i14 < charSequence.length(); i14++) {
                            char charAt2 = charSequence.charAt(i14);
                            if (m(charAt2)) {
                                return 3;
                            }
                            if (!k(charAt2)) {
                                break;
                            }
                        }
                        return 1;
                    }
                }
            }
        }
    }

    private static char o(int i10) {
        int i11 = ((i10 * 149) % 253) + 1 + 129;
        if (i11 > 254) {
            i11 -= 254;
        }
        return (char) i11;
    }
}
