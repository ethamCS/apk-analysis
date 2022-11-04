package x6;

import java.util.Arrays;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class y extends r {

    /* renamed from: d */
    static final int[] f25446d = {1, 1, 1};

    /* renamed from: e */
    static final int[] f25447e = {1, 1, 1, 1, 1};

    /* renamed from: f */
    static final int[] f25448f = {1, 1, 1, 1, 1, 1};

    /* renamed from: g */
    static final int[][] f25449g;

    /* renamed from: h */
    static final int[][] f25450h;

    /* renamed from: a */
    private final StringBuilder f25451a = new StringBuilder(20);

    /* renamed from: b */
    private final x f25452b = new x();

    /* renamed from: c */
    private final m f25453c = new m();

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        f25449g = iArr;
        int[][] iArr2 = new int[20];
        f25450h = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i10 = 10; i10 < 20; i10++) {
            int[] iArr3 = f25449g[i10 - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i11 = 0; i11 < iArr3.length; i11++) {
                iArr4[i11] = iArr3[(iArr3.length - i11) - 1];
            }
            f25450h[i10] = iArr4;
        }
    }

    public static boolean i(CharSequence charSequence) {
        int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        int i10 = length - 1;
        return r(charSequence.subSequence(0, i10)) == Character.digit(charSequence.charAt(i10), 10);
    }

    public static int j(o6.a aVar, int[] iArr, int i10, int[][] iArr2) {
        r.f(aVar, i10, iArr);
        int length = iArr2.length;
        float f10 = 0.48f;
        int i11 = -1;
        for (int i12 = 0; i12 < length; i12++) {
            float e10 = r.e(iArr, iArr2[i12], 0.7f);
            if (e10 < f10) {
                i11 = i12;
                f10 = e10;
            }
        }
        if (i11 >= 0) {
            return i11;
        }
        throw h6.m.b();
    }

    public static int[] n(o6.a aVar, int i10, boolean z10, int[] iArr) {
        return o(aVar, i10, z10, iArr, new int[iArr.length]);
    }

    private static int[] o(o6.a aVar, int i10, boolean z10, int[] iArr, int[] iArr2) {
        int l10 = aVar.l();
        int k10 = z10 ? aVar.k(i10) : aVar.j(i10);
        int length = iArr.length;
        boolean z11 = z10;
        int i11 = 0;
        int i12 = k10;
        while (k10 < l10) {
            if (aVar.h(k10) != z11) {
                iArr2[i11] = iArr2[i11] + 1;
            } else {
                if (i11 != length - 1) {
                    i11++;
                } else if (r.e(iArr2, iArr, 0.7f) < 0.48f) {
                    return new int[]{i12, k10};
                } else {
                    i12 += iArr2[0] + iArr2[1];
                    int i13 = i11 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i13);
                    iArr2[i13] = 0;
                    iArr2[i11] = 0;
                    i11--;
                }
                iArr2[i11] = 1;
                z11 = !z11;
            }
            k10++;
        }
        throw h6.m.b();
    }

    public static int[] p(o6.a aVar) {
        int[] iArr = new int[f25446d.length];
        int[] iArr2 = null;
        boolean z10 = false;
        int i10 = 0;
        while (!z10) {
            int[] iArr3 = f25446d;
            Arrays.fill(iArr, 0, iArr3.length, 0);
            iArr2 = o(aVar, i10, false, iArr3, iArr);
            int i11 = iArr2[0];
            int i12 = iArr2[1];
            int i13 = i11 - (i12 - i11);
            if (i13 >= 0) {
                z10 = aVar.o(i13, i11, false);
            }
            i10 = i12;
        }
        return iArr2;
    }

    public static int r(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        for (int i11 = length - 1; i11 >= 0; i11 -= 2) {
            int charAt = charSequence.charAt(i11) - '0';
            if (charAt < 0 || charAt > 9) {
                throw h6.h.b();
            }
            i10 += charAt;
        }
        int i12 = i10 * 3;
        for (int i13 = length - 2; i13 >= 0; i13 -= 2) {
            int charAt2 = charSequence.charAt(i13) - '0';
            if (charAt2 < 0 || charAt2 > 9) {
                throw h6.h.b();
            }
            i12 += charAt2;
        }
        return (1000 - i12) % 10;
    }

    @Override // x6.r
    public h6.q c(int i10, o6.a aVar, Map<h6.e, ?> map) {
        return m(i10, aVar, p(aVar), map);
    }

    public boolean h(String str) {
        return i(str);
    }

    int[] k(o6.a aVar, int i10) {
        return n(aVar, i10, false, f25446d);
    }

    public abstract int l(o6.a aVar, int[] iArr, StringBuilder sb2);

    public h6.q m(int i10, o6.a aVar, int[] iArr, Map<h6.e, ?> map) {
        int i11;
        String c10;
        int[] iArr2 = null;
        h6.t tVar = map == null ? null : (h6.t) map.get(h6.e.NEED_RESULT_POINT_CALLBACK);
        boolean z10 = true;
        if (tVar != null) {
            tVar.a(new h6.s((iArr[0] + iArr[1]) / 2.0f, i10));
        }
        StringBuilder sb2 = this.f25451a;
        sb2.setLength(0);
        int l10 = l(aVar, iArr, sb2);
        if (tVar != null) {
            tVar.a(new h6.s(l10, i10));
        }
        int[] k10 = k(aVar, l10);
        if (tVar != null) {
            tVar.a(new h6.s((k10[0] + k10[1]) / 2.0f, i10));
        }
        int i12 = k10[1];
        int i13 = (i12 - k10[0]) + i12;
        if (i13 >= aVar.l() || !aVar.o(i12, i13, false)) {
            throw h6.m.b();
        }
        String sb3 = sb2.toString();
        if (sb3.length() < 8) {
            throw h6.h.b();
        }
        if (!h(sb3)) {
            throw h6.d.b();
        }
        h6.a q10 = q();
        float f10 = i10;
        h6.q qVar = new h6.q(sb3, null, new h6.s[]{new h6.s((iArr[1] + iArr[0]) / 2.0f, f10), new h6.s((k10[1] + k10[0]) / 2.0f, f10)}, q10);
        try {
            h6.q a10 = this.f25452b.a(i10, aVar, k10[1]);
            qVar.h(h6.r.UPC_EAN_EXTENSION, a10.f());
            qVar.g(a10.d());
            qVar.a(a10.e());
            i11 = a10.f().length();
        } catch (h6.p unused) {
            i11 = 0;
        }
        if (map != null) {
            iArr2 = (int[]) map.get(h6.e.ALLOWED_EAN_EXTENSIONS);
        }
        if (iArr2 != null) {
            int length = iArr2.length;
            int i14 = 0;
            while (true) {
                if (i14 >= length) {
                    z10 = false;
                    break;
                } else if (i11 == iArr2[i14]) {
                    break;
                } else {
                    i14++;
                }
            }
            if (!z10) {
                throw h6.m.b();
            }
        }
        if ((q10 == h6.a.EAN_13 || q10 == h6.a.UPC_A) && (c10 = this.f25453c.c(sb3)) != null) {
            qVar.h(h6.r.POSSIBLE_COUNTRY, c10);
        }
        return qVar;
    }

    abstract h6.a q();
}
