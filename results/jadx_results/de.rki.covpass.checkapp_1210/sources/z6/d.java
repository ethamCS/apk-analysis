package z6;

import androidx.constraintlayout.widget.i;
import e.j;
import h6.e;
import h6.m;
import h6.q;
import h6.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import x6.r;
import y6.f;
/* loaded from: classes.dex */
public final class d extends y6.a {

    /* renamed from: k */
    private static final int[] f26495k = {7, 5, 4, 3, 1};

    /* renamed from: l */
    private static final int[] f26496l = {4, 20, 52, 104, 204};

    /* renamed from: m */
    private static final int[] f26497m = {0, 348, 1388, 2948, 3988};

    /* renamed from: n */
    private static final int[][] f26498n = {new int[]{1, 8, 4, 1}, new int[]{3, 6, 4, 1}, new int[]{3, 4, 6, 1}, new int[]{3, 2, 8, 1}, new int[]{2, 6, 5, 1}, new int[]{2, 2, 9, 1}};

    /* renamed from: o */
    private static final int[][] f26499o = {new int[]{1, 3, 9, 27, 81, 32, 96, 77}, new int[]{20, 60, 180, 118, 143, 7, 21, 63}, new int[]{189, 145, 13, 39, 117, 140, 209, 205}, new int[]{193, 157, 49, 147, 19, 57, 171, 91}, new int[]{62, 186, 136, 197, 169, 85, 44, 132}, new int[]{185, 133, 188, 142, 4, 12, 36, 108}, new int[]{113, 128, 173, 97, 80, 29, 87, 50}, new int[]{150, 28, 84, 41, 123, 158, 52, 156}, new int[]{46, 138, 203, 187, 139, 206, 196, 166}, new int[]{76, 17, 51, 153, 37, 111, 122, 155}, new int[]{43, 129, 176, 106, 107, i.E2, 119, 146}, new int[]{16, 48, 144, 10, 30, 90, 59, 177}, new int[]{109, 116, 137, 200, 178, 112, j.L0, 164}, new int[]{70, 210, 208, 202, 184, 130, 179, 115}, new int[]{134, 191, 151, 31, 93, 68, 204, 190}, new int[]{148, 22, 66, 198, 172, 94, 71, 2}, new int[]{6, 18, 54, 162, 64, 192, 154, 40}, new int[]{120, 149, 25, 75, 14, 42, j.M0, 167}, new int[]{79, 26, 78, 23, 69, 207, 199, 175}, new int[]{103, 98, 83, 38, 114, 131, 182, j.K0}, new int[]{161, 61, 183, 127, 170, 88, 53, 159}, new int[]{55, 165, 73, 8, 24, 72, 5, 15}, new int[]{45, 135, 194, 160, 58, 174, 100, 89}};

    /* renamed from: p */
    private static final int[][] f26500p = {new int[]{0, 0}, new int[]{0, 1, 1}, new int[]{0, 2, 1, 3}, new int[]{0, 4, 1, 3, 2}, new int[]{0, 4, 1, 3, 3, 5}, new int[]{0, 4, 1, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 2, 3, 3}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 4}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 3, 3, 4, 4, 5, 5}};

    /* renamed from: g */
    private final List<b> f26501g = new ArrayList(11);

    /* renamed from: h */
    private final List<c> f26502h = new ArrayList();

    /* renamed from: i */
    private final int[] f26503i = new int[2];

    /* renamed from: j */
    private boolean f26504j;

    private static boolean A(y6.c cVar, boolean z10, boolean z11) {
        return cVar.c() != 0 || !z10 || !z11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0043, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean B(java.lang.Iterable<z6.b> r7, java.lang.Iterable<z6.c> r8) {
        /*
            java.util.Iterator r8 = r8.iterator()
        L4:
            boolean r0 = r8.hasNext()
            r1 = 0
            if (r0 == 0) goto L46
            java.lang.Object r0 = r8.next()
            z6.c r0 = (z6.c) r0
            java.util.Iterator r2 = r7.iterator()
        L15:
            boolean r3 = r2.hasNext()
            r4 = 1
            if (r3 == 0) goto L42
            java.lang.Object r3 = r2.next()
            z6.b r3 = (z6.b) r3
            java.util.List r5 = r0.a()
            java.util.Iterator r5 = r5.iterator()
        L2a:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L3e
            java.lang.Object r6 = r5.next()
            z6.b r6 = (z6.b) r6
            boolean r6 = r3.equals(r6)
            if (r6 == 0) goto L2a
            r3 = r4
            goto L3f
        L3e:
            r3 = r1
        L3f:
            if (r3 != 0) goto L15
            goto L43
        L42:
            r1 = r4
        L43:
            if (r1 == 0) goto L4
            return r4
        L46:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: z6.d.B(java.lang.Iterable, java.lang.Iterable):boolean");
    }

    private static boolean C(List<b> list) {
        int[][] iArr;
        boolean z10;
        for (int[] iArr2 : f26500p) {
            if (list.size() <= iArr2.length) {
                int i10 = 0;
                while (true) {
                    if (i10 >= list.size()) {
                        z10 = true;
                        break;
                    } else if (list.get(i10).a().c() != iArr2[i10]) {
                        z10 = false;
                        break;
                    } else {
                        i10++;
                    }
                }
                if (z10) {
                    return true;
                }
            }
        }
        return false;
    }

    private y6.c D(o6.a aVar, int i10, boolean z10) {
        int i11;
        int i12;
        int i13;
        if (z10) {
            int i14 = this.f26503i[0] - 1;
            while (i14 >= 0 && !aVar.h(i14)) {
                i14--;
            }
            int i15 = i14 + 1;
            int[] iArr = this.f26503i;
            i13 = iArr[0] - i15;
            i11 = iArr[1];
            i12 = i15;
        } else {
            int[] iArr2 = this.f26503i;
            int i16 = iArr2[0];
            int k10 = aVar.k(iArr2[1] + 1);
            i11 = k10;
            i12 = i16;
            i13 = k10 - this.f26503i[1];
        }
        int[] j10 = j();
        System.arraycopy(j10, 0, j10, 1, j10.length - 1);
        j10[0] = i13;
        try {
            return new y6.c(y6.a.q(j10, f26498n), new int[]{i12, i11}, i12, i11, i10);
        } catch (m unused) {
            return null;
        }
    }

    private static void E(Collection<b> collection, Collection<c> collection2) {
        Iterator<c> it = collection2.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next.a().size() != collection.size()) {
                boolean z10 = true;
                Iterator<b> it2 = next.a().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!collection.contains(it2.next())) {
                            z10 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (z10) {
                    it.remove();
                }
            }
        }
    }

    private static void G(int[] iArr) {
        int length = iArr.length;
        for (int i10 = 0; i10 < length / 2; i10++) {
            int i11 = iArr[i10];
            int i12 = (length - i10) - 1;
            iArr[i10] = iArr[i12];
            iArr[i12] = i11;
        }
    }

    private void H(int i10) {
        boolean z10;
        int i11 = 0;
        boolean z11 = false;
        while (true) {
            if (i11 >= this.f26502h.size()) {
                z10 = false;
                break;
            }
            c cVar = this.f26502h.get(i11);
            if (cVar.b() > i10) {
                z10 = cVar.c(this.f26501g);
                break;
            } else {
                z11 = cVar.c(this.f26501g);
                i11++;
            }
        }
        if (z10 || z11 || B(this.f26501g, this.f26502h)) {
            return;
        }
        this.f26502h.add(i11, new c(this.f26501g, i10, false));
        E(this.f26501g, this.f26502h);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void r(int r11) {
        /*
            Method dump skipped, instructions count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z6.d.r(int):void");
    }

    private boolean s() {
        b bVar = this.f26501g.get(0);
        y6.b b10 = bVar.b();
        y6.b c10 = bVar.c();
        if (c10 == null) {
            return false;
        }
        int a10 = c10.a();
        int i10 = 2;
        for (int i11 = 1; i11 < this.f26501g.size(); i11++) {
            b bVar2 = this.f26501g.get(i11);
            a10 += bVar2.b().a();
            i10++;
            y6.b c11 = bVar2.c();
            if (c11 != null) {
                a10 += c11.a();
                i10++;
            }
        }
        return ((i10 + (-4)) * 211) + (a10 % 211) == b10.b();
    }

    private List<b> t(List<c> list, int i10) {
        while (i10 < this.f26502h.size()) {
            c cVar = this.f26502h.get(i10);
            this.f26501g.clear();
            for (c cVar2 : list) {
                this.f26501g.addAll(cVar2.a());
            }
            this.f26501g.addAll(cVar.a());
            if (C(this.f26501g)) {
                if (s()) {
                    return this.f26501g;
                }
                ArrayList arrayList = new ArrayList(list);
                arrayList.add(cVar);
                try {
                    return t(arrayList, i10 + 1);
                } catch (m unused) {
                    continue;
                }
            }
            i10++;
        }
        throw m.b();
    }

    private List<b> u(boolean z10) {
        List<b> list = null;
        if (this.f26502h.size() > 25) {
            this.f26502h.clear();
            return null;
        }
        this.f26501g.clear();
        if (z10) {
            Collections.reverse(this.f26502h);
        }
        try {
            list = t(new ArrayList(), 0);
        } catch (m unused) {
        }
        if (z10) {
            Collections.reverse(this.f26502h);
        }
        return list;
    }

    static q v(List<b> list) {
        String d10 = a7.j.a(a.a(list)).d();
        s[] a10 = list.get(0).a().a();
        s[] a11 = list.get(list.size() - 1).a().a();
        return new q(d10, null, new s[]{a10[0], a10[1], a11[0], a11[1]}, h6.a.RSS_EXPANDED);
    }

    private void y(o6.a aVar, List<b> list, int i10) {
        int[] j10 = j();
        j10[0] = 0;
        j10[1] = 0;
        j10[2] = 0;
        j10[3] = 0;
        int l10 = aVar.l();
        if (i10 < 0) {
            i10 = list.isEmpty() ? 0 : list.get(list.size() - 1).a().b()[1];
        }
        boolean z10 = list.size() % 2 != 0;
        if (this.f26504j) {
            z10 = !z10;
        }
        boolean z11 = false;
        while (i10 < l10) {
            z11 = !aVar.h(i10);
            if (!z11) {
                break;
            }
            i10++;
        }
        int i11 = 0;
        boolean z12 = z11;
        int i12 = i10;
        while (i10 < l10) {
            if (aVar.h(i10) != z12) {
                j10[i11] = j10[i11] + 1;
            } else {
                if (i11 == 3) {
                    if (z10) {
                        G(j10);
                    }
                    if (y6.a.p(j10)) {
                        int[] iArr = this.f26503i;
                        iArr[0] = i12;
                        iArr[1] = i10;
                        return;
                    }
                    if (z10) {
                        G(j10);
                    }
                    i12 += j10[0] + j10[1];
                    j10[0] = j10[2];
                    j10[1] = j10[3];
                    j10[2] = 0;
                    j10[3] = 0;
                    i11--;
                } else {
                    i11++;
                }
                j10[i11] = 1;
                z12 = !z12;
            }
            i10++;
        }
        throw m.b();
    }

    private static int z(o6.a aVar, int i10) {
        return aVar.h(i10) ? aVar.j(aVar.k(i10)) : aVar.k(aVar.j(i10));
    }

    b F(o6.a aVar, List<b> list, int i10) {
        y6.c D;
        y6.b bVar;
        boolean z10 = list.size() % 2 == 0;
        if (this.f26504j) {
            z10 = !z10;
        }
        int i11 = -1;
        boolean z11 = true;
        do {
            y(aVar, list, i11);
            D = D(aVar, i10, z10);
            if (D == null) {
                i11 = z(aVar, this.f26503i[0]);
                continue;
            } else {
                z11 = false;
                continue;
            }
        } while (z11);
        y6.b w9 = w(aVar, D, z10, true);
        if (list.isEmpty() || !list.get(list.size() - 1).d()) {
            try {
                bVar = w(aVar, D, z10, false);
            } catch (m unused) {
                bVar = null;
            }
            return new b(w9, bVar, D);
        }
        throw m.b();
    }

    @Override // x6.r
    public q c(int i10, o6.a aVar, Map<e, ?> map) {
        this.f26501g.clear();
        this.f26504j = false;
        try {
            return v(x(i10, aVar));
        } catch (m unused) {
            this.f26501g.clear();
            this.f26504j = true;
            return v(x(i10, aVar));
        }
    }

    @Override // x6.r, h6.o
    public void reset() {
        this.f26501g.clear();
        this.f26502h.clear();
    }

    y6.b w(o6.a aVar, y6.c cVar, boolean z10, boolean z11) {
        int[] i10 = i();
        Arrays.fill(i10, 0);
        int[] b10 = cVar.b();
        if (z11) {
            r.g(aVar, b10[0], i10);
        } else {
            r.f(aVar, b10[1], i10);
            int i11 = 0;
            for (int length = i10.length - 1; i11 < length; length--) {
                int i12 = i10[i11];
                i10[i11] = i10[length];
                i10[length] = i12;
                i11++;
            }
        }
        float d10 = p6.a.d(i10) / 17.0f;
        float f10 = (cVar.b()[1] - cVar.b()[0]) / 15.0f;
        if (Math.abs(d10 - f10) / f10 <= 0.3f) {
            int[] m10 = m();
            int[] k10 = k();
            float[] n10 = n();
            float[] l10 = l();
            for (int i13 = 0; i13 < i10.length; i13++) {
                float f11 = (i10[i13] * 1.0f) / d10;
                int i14 = (int) (0.5f + f11);
                if (i14 <= 0) {
                    if (f11 < 0.3f) {
                        throw m.b();
                    }
                    i14 = 1;
                } else if (i14 > 8) {
                    if (f11 > 8.7f) {
                        throw m.b();
                    }
                    i14 = 8;
                }
                int i15 = i13 / 2;
                if ((i13 & 1) == 0) {
                    m10[i15] = i14;
                    n10[i15] = f11 - i14;
                } else {
                    k10[i15] = i14;
                    l10[i15] = f11 - i14;
                }
            }
            r(17);
            int c10 = (((cVar.c() * 4) + (z10 ? 0 : 2)) + (!z11 ? 1 : 0)) - 1;
            int i16 = 0;
            int i17 = 0;
            for (int length2 = m10.length - 1; length2 >= 0; length2--) {
                if (A(cVar, z10, z11)) {
                    i16 += m10[length2] * f26499o[c10][length2 * 2];
                }
                i17 += m10[length2];
            }
            int i18 = 0;
            for (int length3 = k10.length - 1; length3 >= 0; length3--) {
                if (A(cVar, z10, z11)) {
                    i18 += k10[length3] * f26499o[c10][(length3 * 2) + 1];
                }
            }
            int i19 = i16 + i18;
            if ((i17 & 1) != 0 || i17 > 13 || i17 < 4) {
                throw m.b();
            }
            int i20 = (13 - i17) / 2;
            int i21 = f26495k[i20];
            return new y6.b((f.b(m10, i21, true) * f26496l[i20]) + f.b(k10, 9 - i21, false) + f26497m[i20], i19);
        }
        throw m.b();
    }

    List<b> x(int i10, o6.a aVar) {
        boolean z10 = false;
        while (!z10) {
            try {
                List<b> list = this.f26501g;
                list.add(F(aVar, list, i10));
            } catch (m e10) {
                if (this.f26501g.isEmpty()) {
                    throw e10;
                }
                z10 = true;
            }
        }
        if (s()) {
            return this.f26501g;
        }
        boolean z11 = !this.f26502h.isEmpty();
        H(i10);
        if (z11) {
            List<b> u10 = u(false);
            if (u10 != null) {
                return u10;
            }
            List<b> u11 = u(true);
            if (u11 != null) {
                return u11;
            }
        }
        throw m.b();
    }
}
