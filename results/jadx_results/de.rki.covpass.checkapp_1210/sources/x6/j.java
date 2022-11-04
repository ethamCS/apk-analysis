package x6;

import java.util.Collection;
import java.util.Collections;
/* loaded from: classes.dex */
public final class j extends z {
    @Override // x6.s
    public boolean[] d(String str) {
        int length = str.length();
        if (length == 12) {
            try {
                str = str + y.r(str);
            } catch (h6.h e10) {
                throw new IllegalArgumentException(e10);
            }
        } else if (length != 13) {
            throw new IllegalArgumentException("Requested contents should be 12 or 13 digits long, but got ".concat(String.valueOf(length)));
        } else {
            try {
                if (!y.i(str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (h6.h unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        }
        s.c(str);
        int i10 = i.f25418j[Character.digit(str.charAt(0), 10)];
        boolean[] zArr = new boolean[95];
        int b10 = s.b(zArr, 0, y.f25446d, true) + 0;
        for (int i11 = 1; i11 <= 6; i11++) {
            int digit = Character.digit(str.charAt(i11), 10);
            if (((i10 >> (6 - i11)) & 1) == 1) {
                digit += 10;
            }
            b10 += s.b(zArr, b10, y.f25450h[digit], false);
        }
        int b11 = b10 + s.b(zArr, b10, y.f25447e, false);
        for (int i12 = 7; i12 <= 12; i12++) {
            b11 += s.b(zArr, b11, y.f25449g[Character.digit(str.charAt(i12), 10)], true);
        }
        s.b(zArr, b11, y.f25446d, true);
        return zArr;
    }

    @Override // x6.s
    protected Collection<h6.a> f() {
        return Collections.singleton(h6.a.EAN_13);
    }
}
