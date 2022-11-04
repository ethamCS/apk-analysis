package x6;

import java.util.Map;
/* loaded from: classes.dex */
public final class n extends r {

    /* renamed from: b */
    private static final int[] f25423b = {6, 8, 10, 12, 14};

    /* renamed from: c */
    private static final int[] f25424c = {1, 1, 1, 1};

    /* renamed from: d */
    private static final int[][] f25425d = {new int[]{1, 1, 2}, new int[]{1, 1, 3}};

    /* renamed from: e */
    private static final int[][] f25426e = {new int[]{1, 1, 2, 2, 1}, new int[]{2, 1, 1, 1, 2}, new int[]{1, 2, 1, 1, 2}, new int[]{2, 2, 1, 1, 1}, new int[]{1, 1, 2, 1, 2}, new int[]{2, 1, 2, 1, 1}, new int[]{1, 2, 2, 1, 1}, new int[]{1, 1, 1, 2, 2}, new int[]{2, 1, 1, 2, 1}, new int[]{1, 2, 1, 2, 1}, new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    /* renamed from: a */
    private int f25427a = -1;

    private static int h(int[] iArr) {
        int length = f25426e.length;
        float f10 = 0.38f;
        int i10 = -1;
        for (int i11 = 0; i11 < length; i11++) {
            float e10 = r.e(iArr, f25426e[i11], 0.5f);
            if (e10 < f10) {
                i10 = i11;
                f10 = e10;
            } else if (e10 == f10) {
                i10 = -1;
            }
        }
        if (i10 >= 0) {
            return i10 % 10;
        }
        throw h6.m.b();
    }

    private int[] i(o6.a aVar) {
        int[] iArr;
        int i10;
        aVar.q();
        try {
            try {
                iArr = l(aVar, m(aVar), f25425d[0]);
            } catch (h6.m unused) {
                iArr = l(aVar, i10, f25425d[1]);
            }
            n(aVar, iArr[0]);
            int i11 = iArr[0];
            iArr[0] = aVar.l() - iArr[1];
            iArr[1] = aVar.l() - i11;
            return iArr;
        } finally {
            aVar.q();
        }
    }

    private static void j(o6.a aVar, int i10, int i11, StringBuilder sb2) {
        int[] iArr = new int[10];
        int[] iArr2 = new int[5];
        int[] iArr3 = new int[5];
        while (i10 < i11) {
            r.f(aVar, i10, iArr);
            for (int i12 = 0; i12 < 5; i12++) {
                int i13 = i12 * 2;
                iArr2[i12] = iArr[i13];
                iArr3[i12] = iArr[i13 + 1];
            }
            sb2.append((char) (h(iArr2) + 48));
            sb2.append((char) (h(iArr3) + 48));
            for (int i14 = 0; i14 < 10; i14++) {
                i10 += iArr[i14];
            }
        }
    }

    private int[] k(o6.a aVar) {
        int[] l10 = l(aVar, m(aVar), f25424c);
        this.f25427a = (l10[1] - l10[0]) / 4;
        n(aVar, l10[0]);
        return l10;
    }

    private static int[] l(o6.a aVar, int i10, int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int l10 = aVar.l();
        int i11 = i10;
        boolean z10 = false;
        int i12 = 0;
        while (i10 < l10) {
            if (aVar.h(i10) != z10) {
                iArr2[i12] = iArr2[i12] + 1;
            } else {
                if (i12 != length - 1) {
                    i12++;
                } else if (r.e(iArr2, iArr, 0.5f) < 0.38f) {
                    return new int[]{i11, i10};
                } else {
                    i11 += iArr2[0] + iArr2[1];
                    int i13 = i12 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i13);
                    iArr2[i13] = 0;
                    iArr2[i12] = 0;
                    i12--;
                }
                iArr2[i12] = 1;
                z10 = !z10;
            }
            i10++;
        }
        throw h6.m.b();
    }

    private static int m(o6.a aVar) {
        int l10 = aVar.l();
        int j10 = aVar.j(0);
        if (j10 != l10) {
            return j10;
        }
        throw h6.m.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void n(o6.a r3, int r4) {
        /*
            r2 = this;
            int r0 = r2.f25427a
            int r0 = r0 * 10
            int r0 = java.lang.Math.min(r0, r4)
            int r4 = r4 + (-1)
        La:
            if (r0 <= 0) goto L19
            if (r4 < 0) goto L19
            boolean r1 = r3.h(r4)
            if (r1 != 0) goto L19
            int r0 = r0 + (-1)
            int r4 = r4 + (-1)
            goto La
        L19:
            if (r0 != 0) goto L1c
            return
        L1c:
            h6.m r3 = h6.m.b()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: x6.n.n(o6.a, int):void");
    }

    @Override // x6.r
    public h6.q c(int i10, o6.a aVar, Map<h6.e, ?> map) {
        boolean z10;
        int[] k10 = k(aVar);
        int[] i11 = i(aVar);
        StringBuilder sb2 = new StringBuilder(20);
        j(aVar, k10[1], i11[0], sb2);
        String sb3 = sb2.toString();
        int[] iArr = map != null ? (int[]) map.get(h6.e.ALLOWED_LENGTHS) : null;
        if (iArr == null) {
            iArr = f25423b;
        }
        int length = sb3.length();
        int length2 = iArr.length;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            if (i12 >= length2) {
                z10 = false;
                break;
            }
            int i14 = iArr[i12];
            if (length == i14) {
                z10 = true;
                break;
            }
            if (i14 > i13) {
                i13 = i14;
            }
            i12++;
        }
        if (!z10 && length > i13) {
            z10 = true;
        }
        if (z10) {
            float f10 = i10;
            return new h6.q(sb3, null, new h6.s[]{new h6.s(k10[1], f10), new h6.s(i11[0], f10)}, h6.a.ITF);
        }
        throw h6.h.b();
    }
}
