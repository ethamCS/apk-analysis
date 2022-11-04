package x6;

import java.util.Collection;
import java.util.Collections;
/* loaded from: classes.dex */
public final class l extends z {
    @Override // x6.s
    public boolean[] d(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = str + y.r(str);
            } catch (h6.h e10) {
                throw new IllegalArgumentException(e10);
            }
        } else if (length != 8) {
            throw new IllegalArgumentException("Requested contents should be 7 or 8 digits long, but got ".concat(String.valueOf(length)));
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
        boolean[] zArr = new boolean[67];
        int b10 = s.b(zArr, 0, y.f25446d, true) + 0;
        for (int i10 = 0; i10 <= 3; i10++) {
            b10 += s.b(zArr, b10, y.f25449g[Character.digit(str.charAt(i10), 10)], false);
        }
        int b11 = b10 + s.b(zArr, b10, y.f25447e, false);
        for (int i11 = 4; i11 <= 7; i11++) {
            b11 += s.b(zArr, b11, y.f25449g[Character.digit(str.charAt(i11), 10)], true);
        }
        s.b(zArr, b11, y.f25446d, true);
        return zArr;
    }

    @Override // x6.s
    protected Collection<h6.a> f() {
        return Collections.singleton(h6.a.EAN_8);
    }
}
