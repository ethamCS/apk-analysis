package x6;

import java.util.Collection;
import java.util.Collections;
/* loaded from: classes.dex */
public class h extends s {
    private static int h(boolean[] zArr, int i10, int i11) {
        for (int i12 = 0; i12 < 9; i12++) {
            boolean z10 = true;
            int i13 = i10 + i12;
            if (((1 << (8 - i12)) & i11) == 0) {
                z10 = false;
            }
            zArr[i13] = z10;
        }
        return 9;
    }

    private static int i(String str, int i10) {
        int i11 = 0;
        int i12 = 1;
        for (int length = str.length() - 1; length >= 0; length--) {
            i11 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(length)) * i12;
            i12++;
            if (i12 > i10) {
                i12 = 1;
            }
        }
        return i11 % 47;
    }

    static String j(String str) {
        int i10;
        String str2;
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(length << 1);
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = str.charAt(i11);
            if (charAt == 0) {
                str2 = "bU";
            } else {
                if (charAt <= 26) {
                    sb2.append('a');
                    i10 = (charAt + 'A') - 1;
                } else if (charAt <= 31) {
                    sb2.append('b');
                    i10 = (charAt + 'A') - 27;
                } else {
                    if (charAt != ' ' && charAt != '$' && charAt != '%' && charAt != '+') {
                        if (charAt <= ',') {
                            sb2.append('c');
                            i10 = (charAt + 'A') - 33;
                        } else if (charAt > '9') {
                            if (charAt == ':') {
                                str2 = "cZ";
                            } else if (charAt <= '?') {
                                sb2.append('b');
                                i10 = (charAt + 'F') - 59;
                            } else if (charAt == '@') {
                                str2 = "bV";
                            } else if (charAt > 'Z') {
                                if (charAt <= '_') {
                                    sb2.append('b');
                                    i10 = (charAt + 'K') - 91;
                                } else if (charAt == '`') {
                                    str2 = "bW";
                                } else if (charAt <= 'z') {
                                    sb2.append('d');
                                    i10 = (charAt + 'A') - 97;
                                } else if (charAt > 127) {
                                    throw new IllegalArgumentException("Requested content contains a non-encodable character: '" + charAt + "'");
                                } else {
                                    sb2.append('b');
                                    i10 = (charAt + 'P') - 123;
                                }
                            }
                        }
                    }
                    sb2.append(charAt);
                }
                charAt = (char) i10;
                sb2.append(charAt);
            }
            sb2.append(str2);
        }
        return sb2.toString();
    }

    @Override // x6.s
    public boolean[] d(String str) {
        String j10 = j(str);
        int length = j10.length();
        if (length <= 80) {
            boolean[] zArr = new boolean[((j10.length() + 2 + 2) * 9) + 1];
            int h10 = h(zArr, 0, g.f25415e);
            for (int i10 = 0; i10 < length; i10++) {
                h10 += h(zArr, h10, g.f25414d["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(j10.charAt(i10))]);
            }
            int i11 = i(j10, 20);
            int[] iArr = g.f25414d;
            int h11 = h10 + h(zArr, h10, iArr[i11]);
            int h12 = h11 + h(zArr, h11, iArr[i(j10 + "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".charAt(i11), 15)]);
            zArr[h12 + h(zArr, h12, g.f25415e)] = true;
            return zArr;
        }
        throw new IllegalArgumentException("Requested contents should be less than 80 digits long after converting to extended encoding, but got ".concat(String.valueOf(length)));
    }

    @Override // x6.s
    protected Collection<h6.a> f() {
        return Collections.singleton(h6.a.CODE_93);
    }
}
