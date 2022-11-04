package h7;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import o6.l;
/* loaded from: classes.dex */
final class d {

    /* renamed from: a */
    private static final char[] f11386a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:".toCharArray();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f11387a;

        static {
            int[] iArr = new int[h.values().length];
            f11387a = iArr;
            try {
                iArr[h.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11387a[h.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11387a[h.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11387a[h.KANJI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11387a[h.TERMINATOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11387a[h.FNC1_FIRST_POSITION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f11387a[h.FNC1_SECOND_POSITION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f11387a[h.STRUCTURED_APPEND.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f11387a[h.ECI.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f11387a[h.HANZI.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static o6.e a(byte[] bArr, j jVar, f fVar, Map<h6.e, ?> map) {
        h hVar;
        o6.c cVar = new o6.c(bArr);
        StringBuilder sb2 = new StringBuilder(50);
        boolean z10 = true;
        ArrayList arrayList = new ArrayList(1);
        boolean z11 = false;
        int i10 = -1;
        int i11 = -1;
        o6.d dVar = null;
        while (true) {
            try {
                h b10 = cVar.a() < 4 ? h.TERMINATOR : h.b(cVar.d(4));
                int[] iArr = a.f11387a;
                switch (iArr[b10.ordinal()]) {
                    case 5:
                        hVar = b10;
                        break;
                    case 6:
                    case 7:
                        z11 = z10;
                        hVar = b10;
                        break;
                    case 8:
                        if (cVar.a() < 16) {
                            throw h6.h.b();
                        }
                        int d10 = cVar.d(8);
                        i11 = cVar.d(8);
                        i10 = d10;
                        hVar = b10;
                        break;
                    case 9:
                        dVar = o6.d.g(g(cVar));
                        if (dVar == null) {
                            throw h6.h.b();
                        }
                        hVar = b10;
                        break;
                    case 10:
                        int d11 = cVar.d(4);
                        int d12 = cVar.d(b10.h(jVar));
                        if (d11 == z10) {
                            d(cVar, sb2, d12);
                        }
                        hVar = b10;
                        break;
                    default:
                        int d13 = cVar.d(b10.h(jVar));
                        int i12 = iArr[b10.ordinal()];
                        if (i12 == z10) {
                            hVar = b10;
                            f(cVar, sb2, d13);
                            break;
                        } else if (i12 == 2) {
                            hVar = b10;
                            b(cVar, sb2, d13, z11);
                            break;
                        } else if (i12 == 3) {
                            hVar = b10;
                            c(cVar, sb2, d13, dVar, arrayList, map);
                            break;
                        } else if (i12 != 4) {
                            throw h6.h.b();
                        } else {
                            e(cVar, sb2, d13);
                            hVar = b10;
                            break;
                        }
                }
                if (hVar == h.TERMINATOR) {
                    return new o6.e(bArr, sb2.toString(), arrayList.isEmpty() ? null : arrayList, fVar == null ? null : fVar.toString(), i10, i11);
                }
                z10 = true;
            } catch (IllegalArgumentException unused) {
                throw h6.h.b();
            }
        }
    }

    private static void b(o6.c cVar, StringBuilder sb2, int i10, boolean z10) {
        while (i10 > 1) {
            if (cVar.a() < 11) {
                throw h6.h.b();
            }
            int d10 = cVar.d(11);
            sb2.append(h(d10 / 45));
            sb2.append(h(d10 % 45));
            i10 -= 2;
        }
        if (i10 == 1) {
            if (cVar.a() < 6) {
                throw h6.h.b();
            }
            sb2.append(h(cVar.d(6)));
        }
        if (z10) {
            for (int length = sb2.length(); length < sb2.length(); length++) {
                if (sb2.charAt(length) == '%') {
                    if (length < sb2.length() - 1) {
                        int i11 = length + 1;
                        if (sb2.charAt(i11) == '%') {
                            sb2.deleteCharAt(i11);
                        }
                    }
                    sb2.setCharAt(length, (char) 29);
                }
            }
        }
    }

    private static void c(o6.c cVar, StringBuilder sb2, int i10, o6.d dVar, Collection<byte[]> collection, Map<h6.e, ?> map) {
        if ((i10 << 3) <= cVar.a()) {
            byte[] bArr = new byte[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                bArr[i11] = (byte) cVar.d(8);
            }
            try {
                sb2.append(new String(bArr, dVar == null ? l.a(bArr, map) : dVar.name()));
                collection.add(bArr);
                return;
            } catch (UnsupportedEncodingException unused) {
                throw h6.h.b();
            }
        }
        throw h6.h.b();
    }

    private static void d(o6.c cVar, StringBuilder sb2, int i10) {
        if (i10 * 13 <= cVar.a()) {
            byte[] bArr = new byte[i10 * 2];
            int i11 = 0;
            while (i10 > 0) {
                int d10 = cVar.d(13);
                int i12 = (d10 % 96) | ((d10 / 96) << 8);
                int i13 = i12 + (i12 < 2560 ? 41377 : 42657);
                bArr[i11] = (byte) (i13 >> 8);
                bArr[i11 + 1] = (byte) i13;
                i11 += 2;
                i10--;
            }
            try {
                sb2.append(new String(bArr, "GB2312"));
                return;
            } catch (UnsupportedEncodingException unused) {
                throw h6.h.b();
            }
        }
        throw h6.h.b();
    }

    private static void e(o6.c cVar, StringBuilder sb2, int i10) {
        if (i10 * 13 <= cVar.a()) {
            byte[] bArr = new byte[i10 * 2];
            int i11 = 0;
            while (i10 > 0) {
                int d10 = cVar.d(13);
                int i12 = (d10 % 192) | ((d10 / 192) << 8);
                int i13 = i12 + (i12 < 7936 ? 33088 : 49472);
                bArr[i11] = (byte) (i13 >> 8);
                bArr[i11 + 1] = (byte) i13;
                i11 += 2;
                i10--;
            }
            try {
                sb2.append(new String(bArr, "SJIS"));
                return;
            } catch (UnsupportedEncodingException unused) {
                throw h6.h.b();
            }
        }
        throw h6.h.b();
    }

    private static void f(o6.c cVar, StringBuilder sb2, int i10) {
        while (i10 >= 3) {
            if (cVar.a() < 10) {
                throw h6.h.b();
            }
            int d10 = cVar.d(10);
            if (d10 >= 1000) {
                throw h6.h.b();
            }
            sb2.append(h(d10 / 100));
            sb2.append(h((d10 / 10) % 10));
            sb2.append(h(d10 % 10));
            i10 -= 3;
        }
        if (i10 == 2) {
            if (cVar.a() < 7) {
                throw h6.h.b();
            }
            int d11 = cVar.d(7);
            if (d11 >= 100) {
                throw h6.h.b();
            }
            sb2.append(h(d11 / 10));
            sb2.append(h(d11 % 10));
        } else if (i10 != 1) {
        } else {
            if (cVar.a() < 4) {
                throw h6.h.b();
            }
            int d12 = cVar.d(4);
            if (d12 >= 10) {
                throw h6.h.b();
            }
            sb2.append(h(d12));
        }
    }

    private static int g(o6.c cVar) {
        int d10 = cVar.d(8);
        if ((d10 & 128) == 0) {
            return d10 & 127;
        }
        if ((d10 & 192) == 128) {
            return cVar.d(8) | ((d10 & 63) << 8);
        }
        if ((d10 & 224) != 192) {
            throw h6.h.b();
        }
        return cVar.d(16) | ((d10 & 31) << 16);
    }

    private static char h(int i10) {
        char[] cArr = f11386a;
        if (i10 < cArr.length) {
            return cArr[i10];
        }
        throw h6.h.b();
    }
}
