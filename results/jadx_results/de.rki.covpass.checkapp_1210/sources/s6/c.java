package s6;

import h6.h;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import org.conscrypt.PSKKeyManager;
/* loaded from: classes.dex */
final class c {

    /* renamed from: b */
    private static final char[] f21479b;

    /* renamed from: d */
    private static final char[] f21481d;

    /* renamed from: a */
    private static final char[] f21478a = {'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    /* renamed from: c */
    private static final char[] f21480c = {'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    /* renamed from: e */
    private static final char[] f21482e = {'`', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '{', '|', '}', '~', 127};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f21483a;

        static {
            int[] iArr = new int[b.values().length];
            f21483a = iArr;
            try {
                iArr[b.C40_ENCODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21483a[b.TEXT_ENCODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21483a[b.ANSIX12_ENCODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21483a[b.EDIFACT_ENCODE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21483a[b.BASE256_ENCODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        PAD_ENCODE,
        ASCII_ENCODE,
        C40_ENCODE,
        TEXT_ENCODE,
        ANSIX12_ENCODE,
        EDIFACT_ENCODE,
        BASE256_ENCODE
    }

    static {
        char[] cArr = {'!', '\"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/', ':', ';', '<', '=', '>', '?', '@', '[', '\\', ']', '^', '_'};
        f21479b = cArr;
        f21481d = cArr;
    }

    public static o6.e a(byte[] bArr) {
        o6.c cVar = new o6.c(bArr);
        StringBuilder sb2 = new StringBuilder(100);
        StringBuilder sb3 = new StringBuilder(0);
        ArrayList arrayList = new ArrayList(1);
        b bVar = b.ASCII_ENCODE;
        do {
            b bVar2 = b.ASCII_ENCODE;
            if (bVar == bVar2) {
                bVar = c(cVar, sb2, sb3);
            } else {
                int i10 = a.f21483a[bVar.ordinal()];
                if (i10 == 1) {
                    e(cVar, sb2);
                } else if (i10 == 2) {
                    g(cVar, sb2);
                } else if (i10 == 3) {
                    b(cVar, sb2);
                } else if (i10 == 4) {
                    f(cVar, sb2);
                } else if (i10 != 5) {
                    throw h.b();
                } else {
                    d(cVar, sb2, arrayList);
                }
                bVar = bVar2;
            }
            if (bVar == b.PAD_ENCODE) {
                break;
            }
        } while (cVar.a() > 0);
        if (sb3.length() > 0) {
            sb2.append((CharSequence) sb3);
        }
        String sb4 = sb2.toString();
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        return new o6.e(bArr, sb4, arrayList, null);
    }

    private static void b(o6.c cVar, StringBuilder sb2) {
        int d10;
        char c10;
        int i10;
        int[] iArr = new int[3];
        while (cVar.a() != 8 && (d10 = cVar.d(8)) != 254) {
            h(d10, cVar.d(8), iArr);
            for (int i11 = 0; i11 < 3; i11++) {
                int i12 = iArr[i11];
                if (i12 == 0) {
                    c10 = '\r';
                } else if (i12 == 1) {
                    c10 = '*';
                } else if (i12 == 2) {
                    c10 = '>';
                } else if (i12 != 3) {
                    if (i12 < 14) {
                        i10 = i12 + 44;
                    } else if (i12 >= 40) {
                        throw h.b();
                    } else {
                        i10 = i12 + 51;
                    }
                    c10 = (char) i10;
                } else {
                    c10 = ' ';
                }
                sb2.append(c10);
            }
            if (cVar.a() <= 0) {
                return;
            }
        }
    }

    private static b c(o6.c cVar, StringBuilder sb2, StringBuilder sb3) {
        String str;
        boolean z10 = false;
        do {
            int d10 = cVar.d(8);
            if (d10 == 0) {
                throw h.b();
            }
            if (d10 > 128) {
                if (d10 != 129) {
                    if (d10 > 229) {
                        switch (d10) {
                            case 230:
                                return b.C40_ENCODE;
                            case 231:
                                return b.BASE256_ENCODE;
                            case 232:
                                sb2.append((char) 29);
                                break;
                            case 233:
                            case 234:
                            case 241:
                                break;
                            case 235:
                                z10 = true;
                                break;
                            case 236:
                                str = "[)>\u001e05\u001d";
                                sb2.append(str);
                                sb3.insert(0, "\u001e\u0004");
                                break;
                            case 237:
                                str = "[)>\u001e06\u001d";
                                sb2.append(str);
                                sb3.insert(0, "\u001e\u0004");
                                break;
                            case 238:
                                return b.ANSIX12_ENCODE;
                            case 239:
                                return b.TEXT_ENCODE;
                            case 240:
                                return b.EDIFACT_ENCODE;
                            default:
                                if (d10 != 254 || cVar.a() != 0) {
                                    throw h.b();
                                }
                                break;
                        }
                    } else {
                        int i10 = d10 - 130;
                        if (i10 < 10) {
                            sb2.append('0');
                        }
                        sb2.append(i10);
                    }
                } else {
                    return b.PAD_ENCODE;
                }
            } else {
                if (z10) {
                    d10 += 128;
                }
                sb2.append((char) (d10 - 1));
                return b.ASCII_ENCODE;
            }
        } while (cVar.a() > 0);
        return b.ASCII_ENCODE;
    }

    private static void d(o6.c cVar, StringBuilder sb2, Collection<byte[]> collection) {
        int c10 = cVar.c() + 1;
        int i10 = c10 + 1;
        int i11 = i(cVar.d(8), c10);
        if (i11 == 0) {
            i11 = cVar.a() / 8;
        } else if (i11 >= 250) {
            i11 = ((i11 - 249) * 250) + i(cVar.d(8), i10);
            i10++;
        }
        if (i11 >= 0) {
            byte[] bArr = new byte[i11];
            int i12 = 0;
            while (i12 < i11) {
                if (cVar.a() < 8) {
                    throw h.b();
                }
                bArr[i12] = (byte) i(cVar.d(8), i10);
                i12++;
                i10++;
            }
            collection.add(bArr);
            try {
                sb2.append(new String(bArr, "ISO8859_1"));
                return;
            } catch (UnsupportedEncodingException e10) {
                throw new IllegalStateException("Platform does not support required encoding: ".concat(String.valueOf(e10)));
            }
        }
        throw h.b();
    }

    private static void e(o6.c cVar, StringBuilder sb2) {
        int d10;
        char c10;
        char c11;
        int i10;
        int[] iArr = new int[3];
        boolean z10 = false;
        int i11 = 0;
        while (cVar.a() != 8 && (d10 = cVar.d(8)) != 254) {
            h(d10, cVar.d(8), iArr);
            for (int i12 = 0; i12 < 3; i12++) {
                int i13 = iArr[i12];
                if (i11 != 0) {
                    if (i11 == 1) {
                        if (z10) {
                            i10 = i13 + 128;
                            c11 = (char) i10;
                            sb2.append(c11);
                            z10 = false;
                        }
                        c10 = (char) i13;
                        sb2.append(c10);
                    } else if (i11 == 2) {
                        char[] cArr = f21479b;
                        if (i13 < cArr.length) {
                            c10 = cArr[i13];
                            if (z10) {
                                c11 = (char) (c10 + 128);
                                sb2.append(c11);
                                z10 = false;
                            }
                        } else if (i13 == 27) {
                            c10 = 29;
                        } else if (i13 != 30) {
                            throw h.b();
                        } else {
                            z10 = true;
                        }
                        sb2.append(c10);
                    } else if (i11 != 3) {
                        throw h.b();
                    } else {
                        if (z10) {
                            i10 = i13 + 224;
                            c11 = (char) i10;
                            sb2.append(c11);
                            z10 = false;
                        } else {
                            i13 += 96;
                            c10 = (char) i13;
                            sb2.append(c10);
                        }
                    }
                    i11 = 0;
                } else if (i13 < 3) {
                    i11 = i13 + 1;
                } else {
                    char[] cArr2 = f21478a;
                    if (i13 >= cArr2.length) {
                        throw h.b();
                    }
                    char c12 = cArr2[i13];
                    if (z10) {
                        sb2.append((char) (c12 + 128));
                        z10 = false;
                    } else {
                        sb2.append(c12);
                    }
                }
            }
            if (cVar.a() <= 0) {
                return;
            }
        }
    }

    private static void f(o6.c cVar, StringBuilder sb2) {
        while (cVar.a() > 16) {
            for (int i10 = 0; i10 < 4; i10++) {
                int d10 = cVar.d(6);
                if (d10 == 31) {
                    int b10 = 8 - cVar.b();
                    if (b10 == 8) {
                        return;
                    }
                    cVar.d(b10);
                    return;
                }
                if ((d10 & 32) == 0) {
                    d10 |= 64;
                }
                sb2.append((char) d10);
            }
            if (cVar.a() <= 0) {
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
        if (r3 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0037, code lost:
        r3 = (char) (r4 + 128);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004c, code lost:
        if (r3 != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void g(o6.c r9, java.lang.StringBuilder r10) {
        /*
            r0 = 3
            int[] r1 = new int[r0]
            r2 = 0
            r3 = r2
            r4 = r3
        L6:
            int r5 = r9.a()
            r6 = 8
            if (r5 != r6) goto Lf
            return
        Lf:
            int r5 = r9.d(r6)
            r7 = 254(0xfe, float:3.56E-43)
            if (r5 != r7) goto L18
            return
        L18:
            int r6 = r9.d(r6)
            h(r5, r6, r1)
            r5 = r2
        L20:
            if (r5 >= r0) goto L93
            r6 = r1[r5]
            if (r4 == 0) goto L71
            r7 = 1
            if (r4 == r7) goto L61
            r8 = 2
            if (r4 == r8) goto L45
            if (r4 != r0) goto L40
            char[] r4 = s6.c.f21482e
            int r7 = r4.length
            if (r6 >= r7) goto L3b
            char r4 = r4[r6]
            if (r3 == 0) goto L6c
        L37:
            int r4 = r4 + 128
            char r3 = (char) r4
            goto L66
        L3b:
            h6.h r9 = h6.h.b()
            throw r9
        L40:
            h6.h r9 = h6.h.b()
            throw r9
        L45:
            char[] r4 = s6.c.f21481d
            int r8 = r4.length
            if (r6 >= r8) goto L4f
            char r4 = r4[r6]
            if (r3 == 0) goto L6c
            goto L37
        L4f:
            r4 = 27
            if (r6 == r4) goto L5e
            r3 = 30
            if (r6 != r3) goto L59
            r3 = r7
            goto L6f
        L59:
            h6.h r9 = h6.h.b()
            throw r9
        L5e:
            r4 = 29
            goto L6c
        L61:
            if (r3 == 0) goto L6b
            int r6 = r6 + 128
            char r3 = (char) r6
        L66:
            r10.append(r3)
            r3 = r2
            goto L6f
        L6b:
            char r4 = (char) r6
        L6c:
            r10.append(r4)
        L6f:
            r4 = r2
            goto L8b
        L71:
            if (r6 >= r0) goto L77
            int r6 = r6 + 1
            r4 = r6
            goto L8b
        L77:
            char[] r7 = s6.c.f21480c
            int r8 = r7.length
            if (r6 >= r8) goto L8e
            char r6 = r7[r6]
            if (r3 == 0) goto L88
            int r6 = r6 + 128
            char r3 = (char) r6
            r10.append(r3)
            r3 = r2
            goto L8b
        L88:
            r10.append(r6)
        L8b:
            int r5 = r5 + 1
            goto L20
        L8e:
            h6.h r9 = h6.h.b()
            throw r9
        L93:
            int r5 = r9.a()
            if (r5 > 0) goto L6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s6.c.g(o6.c, java.lang.StringBuilder):void");
    }

    private static void h(int i10, int i11, int[] iArr) {
        int i12 = ((i10 << 8) + i11) - 1;
        int i13 = i12 / 1600;
        iArr[0] = i13;
        int i14 = i12 - (i13 * 1600);
        int i15 = i14 / 40;
        iArr[1] = i15;
        iArr[2] = i14 - (i15 * 40);
    }

    private static int i(int i10, int i11) {
        int i12 = i10 - (((i11 * 149) % 255) + 1);
        return i12 >= 0 ? i12 : i12 + PSKKeyManager.MAX_KEY_LENGTH_BYTES;
    }
}
