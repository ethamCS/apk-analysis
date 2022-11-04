package y6;

import e.j;
import h6.m;
import h6.q;
import h6.s;
import h6.t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import x6.r;
/* loaded from: classes.dex */
public final class e extends a {

    /* renamed from: i */
    private static final int[] f25857i = {1, 10, 34, 70, j.M0};

    /* renamed from: j */
    private static final int[] f25858j = {4, 20, 48, 81};

    /* renamed from: k */
    private static final int[] f25859k = {0, 161, 961, 2015, 2715};

    /* renamed from: l */
    private static final int[] f25860l = {0, 336, 1036, 1516};

    /* renamed from: m */
    private static final int[] f25861m = {8, 6, 4, 3, 1};

    /* renamed from: n */
    private static final int[] f25862n = {2, 4, 6, 8};

    /* renamed from: o */
    private static final int[][] f25863o = {new int[]{3, 8, 2, 1}, new int[]{3, 5, 5, 1}, new int[]{3, 3, 7, 1}, new int[]{3, 1, 9, 1}, new int[]{2, 7, 4, 1}, new int[]{2, 5, 6, 1}, new int[]{2, 3, 8, 1}, new int[]{1, 5, 7, 1}, new int[]{1, 3, 9, 1}};

    /* renamed from: g */
    private final List<d> f25864g = new ArrayList();

    /* renamed from: h */
    private final List<d> f25865h = new ArrayList();

    private static void r(Collection<d> collection, d dVar) {
        if (dVar == null) {
            return;
        }
        boolean z10 = false;
        Iterator<d> it = collection.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            d next = it.next();
            if (next.b() == dVar.b()) {
                next.e();
                z10 = true;
                break;
            }
        }
        if (z10) {
            return;
        }
        collection.add(dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
        if (r1 < 4) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003f, code lost:
        if (r1 < 4) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0041, code lost:
        r5 = false;
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0044, code lost:
        r2 = false;
        r5 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:65:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void s(boolean r10, int r11) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y6.e.s(boolean, int):void");
    }

    private static boolean t(d dVar, d dVar2) {
        int a10 = (dVar.a() + (dVar2.a() * 16)) % 79;
        int c10 = (dVar.d().c() * 9) + dVar2.d().c();
        if (c10 > 72) {
            c10--;
        }
        if (c10 > 8) {
            c10--;
        }
        return a10 == c10;
    }

    private static q u(d dVar, d dVar2) {
        String valueOf = String.valueOf((dVar.b() * 4537077) + dVar2.b());
        StringBuilder sb2 = new StringBuilder(14);
        for (int length = 13 - valueOf.length(); length > 0; length--) {
            sb2.append('0');
        }
        sb2.append(valueOf);
        int i10 = 0;
        for (int i11 = 0; i11 < 13; i11++) {
            int charAt = sb2.charAt(i11) - '0';
            if ((i11 & 1) == 0) {
                charAt *= 3;
            }
            i10 += charAt;
        }
        int i12 = 10 - (i10 % 10);
        if (i12 == 10) {
            i12 = 0;
        }
        sb2.append(i12);
        s[] a10 = dVar.d().a();
        s[] a11 = dVar2.d().a();
        return new q(sb2.toString(), null, new s[]{a10[0], a10[1], a11[0], a11[1]}, h6.a.RSS_14);
    }

    private b v(o6.a aVar, c cVar, boolean z10) {
        int[] i10 = i();
        Arrays.fill(i10, 0);
        int[] b10 = cVar.b();
        if (z10) {
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
        int i13 = z10 ? 16 : 15;
        float d10 = p6.a.d(i10) / i13;
        int[] m10 = m();
        int[] k10 = k();
        float[] n10 = n();
        float[] l10 = l();
        for (int i14 = 0; i14 < i10.length; i14++) {
            float f10 = i10[i14] / d10;
            int i15 = (int) (0.5f + f10);
            if (i15 <= 0) {
                i15 = 1;
            } else if (i15 > 8) {
                i15 = 8;
            }
            int i16 = i14 / 2;
            if ((i14 & 1) == 0) {
                m10[i16] = i15;
                n10[i16] = f10 - i15;
            } else {
                k10[i16] = i15;
                l10[i16] = f10 - i15;
            }
        }
        s(z10, i13);
        int i17 = 0;
        int i18 = 0;
        for (int length2 = m10.length - 1; length2 >= 0; length2--) {
            i17 = (i17 * 9) + m10[length2];
            i18 += m10[length2];
        }
        int i19 = 0;
        int i20 = 0;
        for (int length3 = k10.length - 1; length3 >= 0; length3--) {
            i19 = (i19 * 9) + k10[length3];
            i20 += k10[length3];
        }
        int i21 = i17 + (i19 * 3);
        if (!z10) {
            if ((i20 & 1) != 0 || i20 > 10 || i20 < 4) {
                throw m.b();
            }
            int i22 = (10 - i20) / 2;
            int i23 = f25862n[i22];
            return new b((f.b(k10, 9 - i23, false) * f25858j[i22]) + f.b(m10, i23, true) + f25860l[i22], i21);
        } else if ((i18 & 1) != 0 || i18 > 12 || i18 < 4) {
            throw m.b();
        } else {
            int i24 = (12 - i18) / 2;
            int i25 = f25861m[i24];
            return new b((f.b(m10, i25, false) * f25857i[i24]) + f.b(k10, 9 - i25, true) + f25859k[i24], i21);
        }
    }

    private d w(o6.a aVar, boolean z10, int i10, Map<h6.e, ?> map) {
        try {
            c y10 = y(aVar, i10, z10, x(aVar, z10));
            t tVar = map == null ? null : (t) map.get(h6.e.NEED_RESULT_POINT_CALLBACK);
            if (tVar != null) {
                int[] b10 = y10.b();
                float f10 = ((b10[0] + b10[1]) - 1) / 2.0f;
                if (z10) {
                    f10 = (aVar.l() - 1) - f10;
                }
                tVar.a(new s(f10, i10));
            }
            b v10 = v(aVar, y10, true);
            b v11 = v(aVar, y10, false);
            return new d((v10.b() * 1597) + v11.b(), v10.a() + (v11.a() * 4), y10);
        } catch (m unused) {
            return null;
        }
    }

    private int[] x(o6.a aVar, boolean z10) {
        int[] j10 = j();
        j10[0] = 0;
        j10[1] = 0;
        j10[2] = 0;
        j10[3] = 0;
        int l10 = aVar.l();
        int i10 = 0;
        boolean z11 = false;
        while (i10 < l10) {
            z11 = !aVar.h(i10);
            if (z10 == z11) {
                break;
            }
            i10++;
        }
        int i11 = 0;
        int i12 = i10;
        while (i10 < l10) {
            if (aVar.h(i10) != z11) {
                j10[i11] = j10[i11] + 1;
            } else {
                if (i11 != 3) {
                    i11++;
                } else if (a.p(j10)) {
                    return new int[]{i12, i10};
                } else {
                    i12 += j10[0] + j10[1];
                    j10[0] = j10[2];
                    j10[1] = j10[3];
                    j10[2] = 0;
                    j10[3] = 0;
                    i11--;
                }
                j10[i11] = 1;
                z11 = !z11;
            }
            i10++;
        }
        throw m.b();
    }

    private c y(o6.a aVar, int i10, boolean z10, int[] iArr) {
        int i11;
        int i12;
        boolean h10 = aVar.h(iArr[0]);
        int i13 = iArr[0] - 1;
        while (i13 >= 0 && h10 != aVar.h(i13)) {
            i13--;
        }
        int i14 = i13 + 1;
        int[] j10 = j();
        System.arraycopy(j10, 0, j10, 1, j10.length - 1);
        j10[0] = iArr[0] - i14;
        int q10 = a.q(j10, f25863o);
        int i15 = iArr[1];
        if (z10) {
            i11 = (aVar.l() - 1) - i15;
            i12 = (aVar.l() - 1) - i14;
        } else {
            i11 = i15;
            i12 = i14;
        }
        return new c(q10, new int[]{i14, iArr[1]}, i12, i11, i10);
    }

    @Override // x6.r
    public q c(int i10, o6.a aVar, Map<h6.e, ?> map) {
        r(this.f25864g, w(aVar, false, i10, map));
        aVar.q();
        r(this.f25865h, w(aVar, true, i10, map));
        aVar.q();
        for (d dVar : this.f25864g) {
            if (dVar.c() > 1) {
                for (d dVar2 : this.f25865h) {
                    if (dVar2.c() > 1 && t(dVar, dVar2)) {
                        return u(dVar, dVar2);
                    }
                }
                continue;
            }
        }
        throw m.b();
    }

    @Override // x6.r, h6.o
    public void reset() {
        this.f25864g.clear();
        this.f25865h.clear();
    }
}
