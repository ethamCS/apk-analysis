package e7;

import h6.c;
import h6.e;
import h6.s;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    private static final int[] f9504a = {0, 4, 1, 5};

    /* renamed from: b */
    private static final int[] f9505b = {6, 2, 7, 3};

    /* renamed from: c */
    private static final int[] f9506c = {8, 1, 1, 1, 1, 1, 1, 3};

    /* renamed from: d */
    private static final int[] f9507d = {7, 1, 1, 3, 1, 1, 1, 2, 1};

    private static void a(s[] sVarArr, s[] sVarArr2, int[] iArr) {
        for (int i10 = 0; i10 < iArr.length; i10++) {
            sVarArr[iArr[i10]] = sVarArr2[i10];
        }
    }

    public static b b(c cVar, Map<e, ?> map, boolean z10) {
        o6.b a10 = cVar.a();
        List<s[]> c10 = c(z10, a10);
        if (c10.isEmpty()) {
            a10 = a10.clone();
            a10.m();
            c10 = c(z10, a10);
        }
        return new b(a10, c10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
        if (r5 == 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
        r4 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
        if (r4.hasNext() == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
        r5 = (h6.s[]) r4.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
        if (r5[1] == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
        r3 = (int) java.lang.Math.max(r3, r5[1].d());
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
        if (r5[3] == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
        r3 = java.lang.Math.max(r3, (int) r5[3].d());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.List<h6.s[]> c(boolean r8, o6.b r9) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 1
            r2 = 0
            r3 = r2
            r4 = r3
        L9:
            r5 = r4
        La:
            int r6 = r9.i()
            if (r3 >= r6) goto L79
            h6.s[] r4 = f(r9, r3, r4)
            r6 = r4[r2]
            if (r6 != 0) goto L53
            r6 = 3
            r7 = r4[r6]
            if (r7 != 0) goto L53
            if (r5 == 0) goto L79
            java.util.Iterator r4 = r0.iterator()
        L23:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L4f
            java.lang.Object r5 = r4.next()
            h6.s[] r5 = (h6.s[]) r5
            r7 = r5[r1]
            if (r7 == 0) goto L3f
            float r3 = (float) r3
            r7 = r5[r1]
            float r7 = r7.d()
            float r3 = java.lang.Math.max(r3, r7)
            int r3 = (int) r3
        L3f:
            r7 = r5[r6]
            if (r7 == 0) goto L23
            r5 = r5[r6]
            float r5 = r5.d()
            int r5 = (int) r5
            int r3 = java.lang.Math.max(r3, r5)
            goto L23
        L4f:
            int r3 = r3 + 5
            r4 = r2
            goto L9
        L53:
            r0.add(r4)
            if (r8 == 0) goto L79
            r3 = 2
            r5 = r4[r3]
            if (r5 == 0) goto L67
            r5 = r4[r3]
            float r5 = r5.c()
            int r5 = (int) r5
            r3 = r4[r3]
            goto L71
        L67:
            r3 = 4
            r5 = r4[r3]
            float r5 = r5.c()
            int r5 = (int) r5
            r3 = r4[r3]
        L71:
            float r3 = r3.d()
            int r3 = (int) r3
            r4 = r5
            r5 = r1
            goto La
        L79:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.a.c(boolean, o6.b):java.util.List");
    }

    private static int[] d(o6.b bVar, int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        Arrays.fill(iArr2, 0, iArr2.length, 0);
        int i13 = 0;
        while (bVar.f(i10, i11) && i10 > 0) {
            int i14 = i13 + 1;
            if (i13 >= 3) {
                break;
            }
            i10--;
            i13 = i14;
        }
        int length = iArr.length;
        int i15 = i10;
        int i16 = 0;
        boolean z10 = false;
        while (i10 < i12) {
            if (bVar.f(i10, i11) != z10) {
                iArr2[i16] = iArr2[i16] + 1;
            } else {
                if (i16 != length - 1) {
                    i16++;
                } else if (g(iArr2, iArr) < 0.42f) {
                    return new int[]{i15, i10};
                } else {
                    i15 += iArr2[0] + iArr2[1];
                    int i17 = i16 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i17);
                    iArr2[i17] = 0;
                    iArr2[i16] = 0;
                    i16--;
                }
                iArr2[i16] = 1;
                z10 = !z10;
            }
            i10++;
        }
        if (i16 != length - 1 || g(iArr2, iArr) >= 0.42f) {
            return null;
        }
        return new int[]{i15, i10 - 1};
    }

    private static s[] e(o6.b bVar, int i10, int i11, int i12, int i13, int[] iArr) {
        boolean z10;
        int i14;
        int i15;
        s[] sVarArr = new s[4];
        int[] iArr2 = new int[iArr.length];
        int i16 = i12;
        while (true) {
            if (i16 >= i10) {
                z10 = false;
                break;
            }
            int[] d10 = d(bVar, i13, i16, i11, iArr, iArr2);
            if (d10 != null) {
                int i17 = i16;
                int[] iArr3 = d10;
                int i18 = i17;
                while (true) {
                    if (i18 <= 0) {
                        i15 = i18;
                        break;
                    }
                    int i19 = i18 - 1;
                    int[] d11 = d(bVar, i13, i19, i11, iArr, iArr2);
                    if (d11 == null) {
                        i15 = i19 + 1;
                        break;
                    }
                    iArr3 = d11;
                    i18 = i19;
                }
                float f10 = i15;
                sVarArr[0] = new s(iArr3[0], f10);
                sVarArr[1] = new s(iArr3[1], f10);
                z10 = true;
                i16 = i15;
            } else {
                i16 += 5;
            }
        }
        int i20 = i16 + 1;
        if (z10) {
            int[] iArr4 = {(int) sVarArr[0].c(), (int) sVarArr[1].c()};
            int i21 = i20;
            int i22 = 0;
            while (true) {
                if (i21 >= i10) {
                    i14 = i22;
                    break;
                }
                i14 = i22;
                int[] d12 = d(bVar, iArr4[0], i21, i11, iArr, iArr2);
                if (d12 != null && Math.abs(iArr4[0] - d12[0]) < 5 && Math.abs(iArr4[1] - d12[1]) < 5) {
                    iArr4 = d12;
                    i22 = 0;
                } else if (i14 > 25) {
                    break;
                } else {
                    i22 = i14 + 1;
                }
                i21++;
            }
            i20 = i21 - (i14 + 1);
            float f11 = i20;
            sVarArr[2] = new s(iArr4[0], f11);
            sVarArr[3] = new s(iArr4[1], f11);
        }
        if (i20 - i16 < 10) {
            Arrays.fill(sVarArr, (Object) null);
        }
        return sVarArr;
    }

    private static s[] f(o6.b bVar, int i10, int i11) {
        int i12 = bVar.i();
        int l10 = bVar.l();
        s[] sVarArr = new s[8];
        a(sVarArr, e(bVar, i12, l10, i10, i11, f9506c), f9504a);
        if (sVarArr[4] != null) {
            i11 = (int) sVarArr[4].c();
            i10 = (int) sVarArr[4].d();
        }
        a(sVarArr, e(bVar, i12, l10, i10, i11, f9507d), f9505b);
        return sVarArr;
    }

    private static float g(int[] iArr, int[] iArr2) {
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            i10 += iArr[i12];
            i11 += iArr2[i12];
        }
        if (i10 < i11) {
            return Float.POSITIVE_INFINITY;
        }
        float f10 = i10;
        float f11 = f10 / i11;
        float f12 = 0.8f * f11;
        float f13 = 0.0f;
        for (int i13 = 0; i13 < length; i13++) {
            float f14 = iArr2[i13] * f11;
            float f15 = iArr[i13];
            float f16 = f15 > f14 ? f15 - f14 : f14 - f15;
            if (f16 > f12) {
                return Float.POSITIVE_INFINITY;
            }
            f13 += f16;
        }
        return f13 / f10;
    }
}
