package j6;

import h6.h;
import java.util.Arrays;
import org.conscrypt.BuildConfig;
import q6.c;
import q6.e;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b */
    private static final String[] f14021b = {"CTRL_PS", " ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "CTRL_LL", "CTRL_ML", "CTRL_DL", "CTRL_BS"};

    /* renamed from: c */
    private static final String[] f14022c = {"CTRL_PS", " ", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "CTRL_US", "CTRL_ML", "CTRL_DL", "CTRL_BS"};

    /* renamed from: d */
    private static final String[] f14023d = {"CTRL_PS", " ", "\u0001", "\u0002", "\u0003", "\u0004", "\u0005", "\u0006", "\u0007", "\b", "\t", "\n", "\u000b", "\f", "\r", "\u001b", "\u001c", "\u001d", "\u001e", "\u001f", "@", "\\", "^", "_", "`", "|", "~", "\u007f", "CTRL_LL", "CTRL_UL", "CTRL_PL", "CTRL_BS"};

    /* renamed from: e */
    private static final String[] f14024e = {BuildConfig.FLAVOR, "\r", "\r\n", ". ", ", ", ": ", "!", "\"", "#", "$", "%", "&", "'", "(", ")", "*", "+", ",", "-", ".", "/", ":", ";", "<", "=", ">", "?", "[", "]", "{", "}", "CTRL_UL"};

    /* renamed from: f */
    private static final String[] f14025f = {"CTRL_PS", " ", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", ",", ".", "CTRL_UL", "CTRL_US"};

    /* renamed from: a */
    private i6.a f14026a;

    /* renamed from: j6.a$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C0199a {

        /* renamed from: a */
        static final /* synthetic */ int[] f14027a;

        static {
            int[] iArr = new int[b.values().length];
            f14027a = iArr;
            try {
                iArr[b.UPPER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14027a[b.LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14027a[b.MIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14027a[b.PUNCT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14027a[b.DIGIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        UPPER,
        LOWER,
        MIXED,
        DIGIT,
        PUNCT,
        BINARY
    }

    static byte[] a(boolean[] zArr) {
        int length = (zArr.length + 7) / 8;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            bArr[i10] = h(zArr, i10 << 3);
        }
        return bArr;
    }

    private boolean[] b(boolean[] zArr) {
        q6.a aVar;
        int i10 = 8;
        if (this.f14026a.d() <= 2) {
            i10 = 6;
            aVar = q6.a.f19675j;
        } else if (this.f14026a.d() <= 8) {
            aVar = q6.a.f19679n;
        } else if (this.f14026a.d() <= 22) {
            i10 = 10;
            aVar = q6.a.f19674i;
        } else {
            i10 = 12;
            aVar = q6.a.f19673h;
        }
        int c10 = this.f14026a.c();
        int length = zArr.length / i10;
        if (length >= c10) {
            int length2 = zArr.length % i10;
            int[] iArr = new int[length];
            int i11 = 0;
            while (i11 < length) {
                iArr[i11] = i(zArr, length2, i10);
                i11++;
                length2 += i10;
            }
            try {
                new c(aVar).a(iArr, length - c10);
                int i12 = (1 << i10) - 1;
                int i13 = 0;
                for (int i14 = 0; i14 < c10; i14++) {
                    int i15 = iArr[i14];
                    if (i15 == 0 || i15 == i12) {
                        throw h.b();
                    }
                    if (i15 == 1 || i15 == i12 - 1) {
                        i13++;
                    }
                }
                boolean[] zArr2 = new boolean[(c10 * i10) - i13];
                int i16 = 0;
                for (int i17 = 0; i17 < c10; i17++) {
                    int i18 = iArr[i17];
                    if (i18 == 1 || i18 == i12 - 1) {
                        Arrays.fill(zArr2, i16, (i16 + i10) - 1, i18 > 1);
                        i16 += i10 - 1;
                    } else {
                        int i19 = i10 - 1;
                        while (i19 >= 0) {
                            int i20 = i16 + 1;
                            zArr2[i16] = ((1 << i19) & i18) != 0;
                            i19--;
                            i16 = i20;
                        }
                    }
                }
                return zArr2;
            } catch (e e10) {
                throw h.c(e10);
            }
        }
        throw h.b();
    }

    private boolean[] d(o6.b bVar) {
        boolean e10 = this.f14026a.e();
        int d10 = this.f14026a.d();
        int i10 = (e10 ? 11 : 14) + (d10 << 2);
        int[] iArr = new int[i10];
        boolean[] zArr = new boolean[j(d10, e10)];
        int i11 = 2;
        if (e10) {
            for (int i12 = 0; i12 < i10; i12++) {
                iArr[i12] = i12;
            }
        } else {
            int i13 = i10 / 2;
            int i14 = ((i10 + 1) + (((i13 - 1) / 15) * 2)) / 2;
            for (int i15 = 0; i15 < i13; i15++) {
                int i16 = (i15 / 15) + i15;
                iArr[(i13 - i15) - 1] = (i14 - i16) - 1;
                iArr[i13 + i15] = i16 + i14 + 1;
            }
        }
        int i17 = 0;
        int i18 = 0;
        while (i17 < d10) {
            int i19 = ((d10 - i17) << i11) + (e10 ? 9 : 12);
            int i20 = i17 << 1;
            int i21 = (i10 - 1) - i20;
            int i22 = 0;
            while (i22 < i19) {
                int i23 = i22 << 1;
                int i24 = 0;
                while (i24 < i11) {
                    int i25 = i20 + i24;
                    int i26 = i20 + i22;
                    zArr[i18 + i23 + i24] = bVar.f(iArr[i25], iArr[i26]);
                    int i27 = iArr[i26];
                    int i28 = i21 - i24;
                    boolean z10 = e10;
                    zArr[(i19 * 2) + i18 + i23 + i24] = bVar.f(i27, iArr[i28]);
                    int i29 = i21 - i22;
                    zArr[(i19 * 4) + i18 + i23 + i24] = bVar.f(iArr[i28], iArr[i29]);
                    zArr[(i19 * 6) + i18 + i23 + i24] = bVar.f(iArr[i29], iArr[i25]);
                    i24++;
                    d10 = d10;
                    e10 = z10;
                    i11 = 2;
                }
                i22++;
                i11 = 2;
            }
            i18 += i19 << 3;
            i17++;
            i11 = 2;
        }
        return zArr;
    }

    private static String e(b bVar, int i10) {
        int i11 = C0199a.f14027a[bVar.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                return f14022c[i10];
            }
            if (i11 == 3) {
                return f14023d[i10];
            }
            if (i11 == 4) {
                return f14024e[i10];
            }
            if (i11 != 5) {
                throw new IllegalStateException("Bad table");
            }
            return f14025f[i10];
        }
        return f14021b[i10];
    }

    private static String f(boolean[] zArr) {
        int length = zArr.length;
        b bVar = b.UPPER;
        StringBuilder sb2 = new StringBuilder(20);
        b bVar2 = bVar;
        int i10 = 0;
        while (i10 < length) {
            if (bVar != b.BINARY) {
                int i11 = bVar == b.DIGIT ? 4 : 5;
                if (length - i10 < i11) {
                    break;
                }
                int i12 = i(zArr, i10, i11);
                i10 += i11;
                String e10 = e(bVar, i12);
                if (e10.startsWith("CTRL_")) {
                    bVar2 = g(e10.charAt(5));
                    if (e10.charAt(6) != 'L') {
                        bVar2 = bVar;
                        bVar = bVar2;
                    }
                } else {
                    sb2.append(e10);
                }
                bVar = bVar2;
            } else if (length - i10 < 5) {
                break;
            } else {
                int i13 = i(zArr, i10, 5);
                i10 += 5;
                if (i13 == 0) {
                    if (length - i10 < 11) {
                        break;
                    }
                    i13 = i(zArr, i10, 11) + 31;
                    i10 += 11;
                }
                int i14 = 0;
                while (true) {
                    if (i14 >= i13) {
                        break;
                    } else if (length - i10 < 8) {
                        i10 = length;
                        break;
                    } else {
                        sb2.append((char) i(zArr, i10, 8));
                        i10 += 8;
                        i14++;
                    }
                }
                bVar = bVar2;
            }
        }
        return sb2.toString();
    }

    private static b g(char c10) {
        return c10 != 'B' ? c10 != 'D' ? c10 != 'P' ? c10 != 'L' ? c10 != 'M' ? b.UPPER : b.MIXED : b.LOWER : b.PUNCT : b.DIGIT : b.BINARY;
    }

    private static byte h(boolean[] zArr, int i10) {
        int length = zArr.length - i10;
        return (byte) (length >= 8 ? i(zArr, i10, 8) : i(zArr, i10, length) << (8 - length));
    }

    private static int i(boolean[] zArr, int i10, int i11) {
        int i12 = 0;
        for (int i13 = i10; i13 < i10 + i11; i13++) {
            i12 <<= 1;
            if (zArr[i13]) {
                i12 |= 1;
            }
        }
        return i12;
    }

    private static int j(int i10, boolean z10) {
        return ((z10 ? 88 : 112) + (i10 << 4)) * i10;
    }

    public o6.e c(i6.a aVar) {
        this.f14026a = aVar;
        boolean[] b10 = b(d(aVar.a()));
        o6.e eVar = new o6.e(a(b10), f(b10), null, null);
        eVar.l(b10.length);
        return eVar;
    }
}
