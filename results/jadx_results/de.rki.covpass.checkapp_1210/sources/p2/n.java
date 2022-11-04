package p2;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import org.conscrypt.BuildConfig;
import p2.g;
/* loaded from: classes.dex */
public class n {

    /* renamed from: h */
    static final CharsetEncoder f18820h = Charset.forName("ISO-8859-1").newEncoder();

    /* renamed from: d */
    String f18824d;

    /* renamed from: e */
    String f18825e;

    /* renamed from: f */
    public String f18826f;

    /* renamed from: a */
    public g.d f18821a = g.d.NONE;

    /* renamed from: b */
    public final StringBuilder f18822b = new StringBuilder();

    /* renamed from: c */
    public String f18823c = BuildConfig.FLAVOR;

    /* renamed from: g */
    PrintStream f18827g = null;

    public n(String str, String str2) {
        this.f18824d = str;
        this.f18826f = str2;
    }

    public static byte e(int i10) {
        int i11 = 0;
        for (int i12 = 0; i12 < 8; i12++) {
            i11 = (i11 << 1) | (i10 & 1);
            i10 >>= 1;
        }
        return (byte) i11;
    }

    public static void f(ok.i iVar) {
        g(iVar.f18613a, iVar.f18614b);
    }

    public static void g(byte[] bArr, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            bArr[i11] = e(bArr[i11] & 255);
        }
    }

    private String h(byte[] bArr) {
        String str = this.f18825e;
        if (str != null) {
            return str;
        }
        String str2 = this.f18824d;
        return str2 != null ? str2 : a.b(bArr) ? "UTF8" : this.f18826f;
    }

    public static char i(int i10) {
        if (i10 < 0 || i10 >= 45) {
            throw new RuntimeException("Value out of range. value=" + i10);
        }
        return "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:".charAt(i10);
    }

    public int a(d dVar, int i10, int i11) {
        int c10 = dVar.c(i10, i11, true);
        int i12 = i10 + i11;
        while (true) {
            if (c10 >= 2) {
                int i13 = dVar.f18743b;
                int i14 = i12 + 11;
                if (i13 < i14) {
                    PrintStream printStream = this.f18827g;
                    if (printStream != null) {
                        printStream.printf("overflow: alphanumeric data.size=%d\n", Integer.valueOf(i13));
                    }
                } else {
                    int c11 = dVar.c(i12, 11, true);
                    int i15 = c11 / 45;
                    this.f18822b.append(i(i15));
                    this.f18822b.append(i(c11 - (i15 * 45)));
                    c10 -= 2;
                    i12 = i14;
                }
            } else if (c10 != 1) {
                return i12;
            } else {
                int i16 = i12 + 6;
                if (dVar.f18743b >= i16) {
                    this.f18822b.append(i(dVar.c(i12, 6, true)));
                    return i16;
                }
            }
        }
        this.f18821a = g.d.MESSAGE_OVERFLOW;
        return -1;
    }

    public int b(d dVar, int i10, int i11) {
        g.d dVar2;
        int c10 = dVar.c(i10, i11, true);
        int i12 = i10 + i11;
        int i13 = c10 * 8;
        int i14 = dVar.f18743b;
        if (i13 > i14 - i12) {
            PrintStream printStream = this.f18827g;
            if (printStream != null) {
                printStream.printf("overflow: byte data.size=%d\n", Integer.valueOf(i14));
            }
            dVar2 = g.d.MESSAGE_OVERFLOW;
        } else {
            byte[] bArr = new byte[c10];
            for (int i15 = 0; i15 < c10; i15++) {
                bArr[i15] = (byte) dVar.c(i12, 8, true);
                i12 += 8;
            }
            String h10 = h(bArr);
            this.f18823c = h10;
            try {
                if (h10.equalsIgnoreCase("binary")) {
                    StringBuilder sb2 = this.f18822b;
                    sb2.ensureCapacity(sb2.length() + c10);
                    for (int i16 = 0; i16 < c10; i16++) {
                        this.f18822b.append((char) (bArr[i16] & 255));
                    }
                } else {
                    this.f18822b.append(new String(bArr, this.f18823c));
                }
                return i12;
            } catch (UnsupportedEncodingException unused) {
                dVar2 = g.d.STRING_ENCODING_UNAVAILABLE;
            }
        }
        this.f18821a = dVar2;
        return -1;
    }

    public int c(d dVar, int i10, int i11) {
        g.d dVar2;
        int c10 = dVar.c(i10, i11, true);
        int i12 = i10 + i11;
        byte[] bArr = new byte[c10 * 2];
        int i13 = 0;
        while (true) {
            if (i13 >= c10) {
                try {
                    this.f18822b.append(new String(bArr, "Shift_JIS"));
                    return i12;
                } catch (UnsupportedEncodingException unused) {
                    dVar2 = g.d.KANJI_UNAVAILABLE;
                    this.f18821a = dVar2;
                    return -1;
                }
            }
            int i14 = dVar.f18743b;
            int i15 = i12 + 13;
            if (i14 < i15) {
                PrintStream printStream = this.f18827g;
                if (printStream != null) {
                    printStream.printf("overflow: kanji data.size=%d\n", Integer.valueOf(i14));
                }
                dVar2 = g.d.MESSAGE_OVERFLOW;
            } else {
                int c11 = dVar.c(i12, 13, true);
                int i16 = (c11 % 192) | ((c11 / 192) << 8);
                int i17 = i16 + (i16 < 7936 ? 33088 : 49472);
                int i18 = i13 * 2;
                bArr[i18] = (byte) (i17 >> 8);
                bArr[i18 + 1] = (byte) i17;
                i13++;
                i12 = i15;
            }
        }
    }

    public int d(d dVar, int i10, int i11) {
        int i12;
        int c10;
        int c11 = dVar.c(i10, i11, true);
        int i13 = i10 + i11;
        while (true) {
            if (c11 >= 3) {
                int i14 = dVar.f18743b;
                int i15 = i13 + 10;
                if (i14 < i15) {
                    PrintStream printStream = this.f18827g;
                    if (printStream != null) {
                        printStream.printf("overflow: numeric data.size=%d\n", Integer.valueOf(i14));
                    }
                } else {
                    int c12 = dVar.c(i13, 10, true);
                    int i16 = c12 / 100;
                    int i17 = c12 - (i16 * 100);
                    int i18 = i17 / 10;
                    this.f18822b.append((char) (i16 + 48));
                    this.f18822b.append((char) (i18 + 48));
                    this.f18822b.append((char) ((i17 - (i18 * 10)) + 48));
                    c11 -= 3;
                    i13 = i15;
                }
            } else if (c11 == 2) {
                i12 = i13 + 7;
                if (dVar.f18743b >= i12) {
                    int c13 = dVar.c(i13, 7, true);
                    int i19 = c13 / 10;
                    c10 = c13 - (i19 * 10);
                    this.f18822b.append((char) (i19 + 48));
                    this.f18822b.append((char) (c10 + 48));
                    return i12;
                }
            } else if (c11 != 1) {
                return i13;
            } else {
                i12 = i13 + 4;
                if (dVar.f18743b >= i12) {
                    c10 = dVar.c(i13, 4, true);
                    this.f18822b.append((char) (c10 + 48));
                    return i12;
                }
            }
        }
        this.f18821a = g.d.MESSAGE_OVERFLOW;
        return -1;
    }
}
