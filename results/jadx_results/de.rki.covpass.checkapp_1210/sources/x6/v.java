package x6;

import java.util.EnumMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a */
    private final int[] f25438a = new int[4];

    /* renamed from: b */
    private final StringBuilder f25439b = new StringBuilder();

    private int a(o6.a aVar, int[] iArr, StringBuilder sb2) {
        int[] iArr2 = this.f25438a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int l10 = aVar.l();
        int i10 = iArr[1];
        int i11 = 0;
        for (int i12 = 0; i12 < 2 && i10 < l10; i12++) {
            int j10 = y.j(aVar, iArr2, i10, y.f25450h);
            sb2.append((char) ((j10 % 10) + 48));
            for (int i13 : iArr2) {
                i10 += i13;
            }
            if (j10 >= 10) {
                i11 |= 1 << (1 - i12);
            }
            if (i12 != 1) {
                i10 = aVar.k(aVar.j(i10));
            }
        }
        if (sb2.length() == 2) {
            if (Integer.parseInt(sb2.toString()) % 4 != i11) {
                throw h6.m.b();
            }
            return i10;
        }
        throw h6.m.b();
    }

    private static Map<h6.r, Object> c(String str) {
        if (str.length() != 2) {
            return null;
        }
        EnumMap enumMap = new EnumMap(h6.r.class);
        enumMap.put((EnumMap) h6.r.ISSUE_NUMBER, (h6.r) Integer.valueOf(str));
        return enumMap;
    }

    public h6.q b(int i10, o6.a aVar, int[] iArr) {
        StringBuilder sb2 = this.f25439b;
        sb2.setLength(0);
        int a10 = a(aVar, iArr, sb2);
        String sb3 = sb2.toString();
        Map<h6.r, Object> c10 = c(sb3);
        float f10 = i10;
        h6.q qVar = new h6.q(sb3, null, new h6.s[]{new h6.s((iArr[0] + iArr[1]) / 2.0f, f10), new h6.s(a10, f10)}, h6.a.UPC_EAN_EXTENSION);
        if (c10 != null) {
            qVar.g(c10);
        }
        return qVar;
    }
}
