package i7;

import h6.s;
import h6.t;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class e {

    /* renamed from: f */
    private static final b f12333f = new b();

    /* renamed from: a */
    private final o6.b f12334a;

    /* renamed from: c */
    private boolean f12336c;

    /* renamed from: e */
    private final t f12338e;

    /* renamed from: b */
    private final List<d> f12335b = new ArrayList();

    /* renamed from: d */
    private final int[] f12337d = new int[5];

    /* loaded from: classes.dex */
    public static final class b implements Serializable, Comparator<d> {
        private b() {
        }

        /* renamed from: b */
        public int compare(d dVar, d dVar2) {
            return Float.compare(dVar.i(), dVar2.i());
        }
    }

    public e(o6.b bVar, t tVar) {
        this.f12334a = bVar;
        this.f12338e = tVar;
    }

    private static float a(int[] iArr, int i10) {
        return ((i10 - iArr[4]) - iArr[3]) - (iArr[2] / 2.0f);
    }

    private boolean b(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int[] k10 = k();
        int i15 = 0;
        while (i10 >= i15 && i11 >= i15 && this.f12334a.f(i11 - i15, i10 - i15)) {
            k10[2] = k10[2] + 1;
            i15++;
        }
        if (k10[2] == 0) {
            return false;
        }
        while (i10 >= i15 && i11 >= i15 && !this.f12334a.f(i11 - i15, i10 - i15)) {
            k10[1] = k10[1] + 1;
            i15++;
        }
        if (k10[1] == 0) {
            return false;
        }
        while (i10 >= i15 && i11 >= i15 && this.f12334a.f(i11 - i15, i10 - i15)) {
            k10[0] = k10[0] + 1;
            i15++;
        }
        if (k10[0] == 0) {
            return false;
        }
        int i16 = this.f12334a.i();
        int l10 = this.f12334a.l();
        int i17 = 1;
        while (true) {
            int i18 = i10 + i17;
            if (i18 >= i16 || (i14 = i11 + i17) >= l10 || !this.f12334a.f(i14, i18)) {
                break;
            }
            k10[2] = k10[2] + 1;
            i17++;
        }
        while (true) {
            int i19 = i10 + i17;
            if (i19 >= i16 || (i13 = i11 + i17) >= l10 || this.f12334a.f(i13, i19)) {
                break;
            }
            k10[3] = k10[3] + 1;
            i17++;
        }
        if (k10[3] == 0) {
            return false;
        }
        while (true) {
            int i20 = i10 + i17;
            if (i20 >= i16 || (i12 = i11 + i17) >= l10 || !this.f12334a.f(i12, i20)) {
                break;
            }
            k10[4] = k10[4] + 1;
            i17++;
        }
        if (k10[4] != 0) {
            return j(k10);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
        if (r2[1] <= r13) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003f, code lost:
        if (r3 < 0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0045, code lost:
        if (r0.f(r3, r12) == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0049, code lost:
        if (r2[0] > r13) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004b, code lost:
        r2[0] = r2[0] + 1;
        r3 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0055, code lost:
        if (r2[0] <= r13) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0057, code lost:
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0058, code lost:
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0059, code lost:
        if (r11 >= r1) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005f, code lost:
        if (r0.f(r11, r12) == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0061, code lost:
        r2[2] = r2[2] + 1;
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0069, code lost:
        if (r11 != r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006b, code lost:
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006d, code lost:
        if (r11 >= r1) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0073, code lost:
        if (r0.f(r11, r12) != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0077, code lost:
        if (r2[3] >= r13) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0079, code lost:
        r2[3] = r2[3] + 1;
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0081, code lost:
        if (r11 == r1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0085, code lost:
        if (r2[3] < r13) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0089, code lost:
        if (r11 >= r1) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008f, code lost:
        if (r0.f(r11, r12) == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0093, code lost:
        if (r2[4] >= r13) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0095, code lost:
        r2[4] = r2[4] + 1;
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x009f, code lost:
        if (r2[4] < r13) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00a1, code lost:
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b7, code lost:
        if ((java.lang.Math.abs(((((r2[0] + r2[1]) + r2[2]) + r2[3]) + r2[4]) - r14) * 5) < r14) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b9, code lost:
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00be, code lost:
        if (i(r2) == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00c4, code lost:
        return a(r2, r11);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private float c(int r11, int r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 198
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i7.e.c(int, int, int, int):float");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
        if (r2[1] <= r13) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003f, code lost:
        if (r3 < 0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0045, code lost:
        if (r0.f(r12, r3) == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0049, code lost:
        if (r2[0] > r13) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004b, code lost:
        r2[0] = r2[0] + 1;
        r3 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0055, code lost:
        if (r2[0] <= r13) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0057, code lost:
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0058, code lost:
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0059, code lost:
        if (r11 >= r1) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005f, code lost:
        if (r0.f(r12, r11) == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0061, code lost:
        r2[2] = r2[2] + 1;
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0069, code lost:
        if (r11 != r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006b, code lost:
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006d, code lost:
        if (r11 >= r1) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0073, code lost:
        if (r0.f(r12, r11) != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0077, code lost:
        if (r2[3] >= r13) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0079, code lost:
        r2[3] = r2[3] + 1;
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0081, code lost:
        if (r11 == r1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0085, code lost:
        if (r2[3] < r13) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0089, code lost:
        if (r11 >= r1) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008f, code lost:
        if (r0.f(r12, r11) == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0093, code lost:
        if (r2[4] >= r13) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0095, code lost:
        r2[4] = r2[4] + 1;
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x009f, code lost:
        if (r2[4] < r13) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00a1, code lost:
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b8, code lost:
        if ((java.lang.Math.abs(((((r2[0] + r2[1]) + r2[2]) + r2[3]) + r2[4]) - r14) * 5) < (r14 * 2)) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ba, code lost:
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00bf, code lost:
        if (i(r2) == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00c5, code lost:
        return a(r2, r11);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private float d(int r11, int r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 199
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i7.e.d(int, int, int, int):float");
    }

    protected static void e(int[] iArr) {
        Arrays.fill(iArr, 0);
    }

    protected static void f(int[] iArr) {
        iArr[0] = iArr[2];
        iArr[1] = iArr[3];
        iArr[2] = iArr[4];
        iArr[3] = 1;
        iArr[4] = 0;
    }

    private int h() {
        if (this.f12335b.size() <= 1) {
            return 0;
        }
        d dVar = null;
        for (d dVar2 : this.f12335b) {
            if (dVar2.h() >= 2) {
                if (dVar != null) {
                    this.f12336c = true;
                    return ((int) (Math.abs(dVar.c() - dVar2.c()) - Math.abs(dVar.d() - dVar2.d()))) / 2;
                }
                dVar = dVar2;
            }
        }
        return 0;
    }

    protected static boolean i(int[] iArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < 5; i11++) {
            int i12 = iArr[i11];
            if (i12 == 0) {
                return false;
            }
            i10 += i12;
        }
        if (i10 < 7) {
            return false;
        }
        float f10 = i10 / 7.0f;
        float f11 = f10 / 2.0f;
        return Math.abs(f10 - ((float) iArr[0])) < f11 && Math.abs(f10 - ((float) iArr[1])) < f11 && Math.abs((f10 * 3.0f) - ((float) iArr[2])) < 3.0f * f11 && Math.abs(f10 - ((float) iArr[3])) < f11 && Math.abs(f10 - ((float) iArr[4])) < f11;
    }

    protected static boolean j(int[] iArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < 5; i11++) {
            int i12 = iArr[i11];
            if (i12 == 0) {
                return false;
            }
            i10 += i12;
        }
        if (i10 < 7) {
            return false;
        }
        float f10 = i10 / 7.0f;
        float f11 = f10 / 1.333f;
        return Math.abs(f10 - ((float) iArr[0])) < f11 && Math.abs(f10 - ((float) iArr[1])) < f11 && Math.abs((f10 * 3.0f) - ((float) iArr[2])) < 3.0f * f11 && Math.abs(f10 - ((float) iArr[3])) < f11 && Math.abs(f10 - ((float) iArr[4])) < f11;
    }

    private int[] k() {
        e(this.f12337d);
        return this.f12337d;
    }

    private boolean m() {
        int size = this.f12335b.size();
        float f10 = 0.0f;
        float f11 = 0.0f;
        int i10 = 0;
        for (d dVar : this.f12335b) {
            if (dVar.h() >= 2) {
                i10++;
                f11 += dVar.i();
            }
        }
        if (i10 < 3) {
            return false;
        }
        float f12 = f11 / size;
        for (d dVar2 : this.f12335b) {
            f10 += Math.abs(dVar2.i() - f12);
        }
        return f10 <= f11 * 0.05f;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c5 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private i7.d[] n() {
        /*
            r26 = this;
            r0 = r26
            java.util.List<i7.d> r1 = r0.f12335b
            int r1 = r1.size()
            r2 = 3
            if (r1 < r2) goto Ld7
            java.util.List<i7.d> r1 = r0.f12335b
            i7.e$b r3 = i7.e.f12333f
            j$.util.List.EL.sort(r1, r3)
            i7.d[] r1 = new i7.d[r2]
            r2 = 0
            r5 = r2
            r6 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
        L1b:
            java.util.List<i7.d> r8 = r0.f12335b
            int r8 = r8.size()
            r9 = 2
            int r8 = r8 - r9
            if (r5 >= r8) goto Lc8
            java.util.List<i7.d> r8 = r0.f12335b
            java.lang.Object r8 = r8.get(r5)
            i7.d r8 = (i7.d) r8
            float r10 = r8.i()
            int r5 = r5 + 1
            r11 = r5
        L34:
            java.util.List<i7.d> r12 = r0.f12335b
            int r12 = r12.size()
            r13 = 1
            int r12 = r12 - r13
            if (r11 >= r12) goto L1b
            java.util.List<i7.d> r12 = r0.f12335b
            java.lang.Object r12 = r12.get(r11)
            i7.d r12 = (i7.d) r12
            double r14 = o(r8, r12)
            int r11 = r11 + 1
            r3 = r11
        L4d:
            java.util.List<i7.d> r4 = r0.f12335b
            int r4 = r4.size()
            if (r3 >= r4) goto L34
            java.util.List<i7.d> r4 = r0.f12335b
            java.lang.Object r4 = r4.get(r3)
            i7.d r4 = (i7.d) r4
            float r16 = r4.i()
            r17 = 1068708659(0x3fb33333, float:1.4)
            float r17 = r17 * r10
            int r16 = (r16 > r17 ? 1 : (r16 == r17 ? 0 : -1))
            if (r16 > 0) goto Lc5
            double r16 = o(r12, r4)
            double r18 = o(r8, r4)
            int r20 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r20 >= 0) goto L8d
            int r20 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r20 <= 0) goto L84
            int r20 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
            if (r20 >= 0) goto L81
            r20 = r14
            goto La5
        L81:
            r20 = r18
            goto L99
        L84:
            r20 = r14
            r24 = r16
            r16 = r18
            r18 = r24
            goto La5
        L8d:
            int r20 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r20 >= 0) goto L9f
            int r20 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
            if (r20 >= 0) goto L9c
            r20 = r16
            r16 = r18
        L99:
            r18 = r14
            goto La5
        L9c:
            r20 = r16
            goto La3
        L9f:
            r20 = r18
            r18 = r16
        La3:
            r16 = r14
        La5:
            r22 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r18 = r18 * r22
            double r18 = r16 - r18
            double r18 = java.lang.Math.abs(r18)
            double r20 = r20 * r22
            double r16 = r16 - r20
            double r16 = java.lang.Math.abs(r16)
            double r18 = r18 + r16
            int r16 = (r18 > r6 ? 1 : (r18 == r6 ? 0 : -1))
            if (r16 >= 0) goto Lc5
            r1[r2] = r8
            r1[r13] = r12
            r1[r9] = r4
            r6 = r18
        Lc5:
            int r3 = r3 + 1
            goto L4d
        Lc8:
            r3 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            int r2 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r2 == 0) goto Ld2
            return r1
        Ld2:
            h6.m r1 = h6.m.b()
            throw r1
        Ld7:
            h6.m r1 = h6.m.b()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i7.e.n():i7.d[]");
    }

    private static double o(d dVar, d dVar2) {
        double c10 = dVar.c() - dVar2.c();
        double d10 = dVar.d() - dVar2.d();
        return (c10 * c10) + (d10 * d10);
    }

    public final f g(Map<h6.e, ?> map) {
        boolean z10 = map != null && map.containsKey(h6.e.TRY_HARDER);
        int i10 = this.f12334a.i();
        int l10 = this.f12334a.l();
        int i11 = (i10 * 3) / 388;
        if (i11 < 3 || z10) {
            i11 = 3;
        }
        int[] iArr = new int[5];
        int i12 = i11 - 1;
        boolean z11 = false;
        while (i12 < i10 && !z11) {
            e(iArr);
            int i13 = 0;
            int i14 = 0;
            while (i13 < l10) {
                if (this.f12334a.f(i13, i12)) {
                    if ((i14 & 1) == 1) {
                        i14++;
                    }
                    iArr[i14] = iArr[i14] + 1;
                } else if ((i14 & 1) != 0) {
                    iArr[i14] = iArr[i14] + 1;
                } else if (i14 != 4) {
                    i14++;
                    iArr[i14] = iArr[i14] + 1;
                } else if (!i(iArr) || !l(iArr, i12, i13)) {
                    f(iArr);
                    i14 = 3;
                } else {
                    if (this.f12336c) {
                        z11 = m();
                    } else {
                        int h10 = h();
                        if (h10 > iArr[2]) {
                            i12 += (h10 - iArr[2]) - 2;
                            i13 = l10 - 1;
                        }
                    }
                    e(iArr);
                    i14 = 0;
                    i11 = 2;
                }
                i13++;
            }
            if (i(iArr) && l(iArr, i12, l10)) {
                i11 = iArr[0];
                if (this.f12336c) {
                    z11 = m();
                }
            }
            i12 += i11;
        }
        d[] n10 = n();
        s.e(n10);
        return new f(n10);
    }

    protected final boolean l(int[] iArr, int i10, int i11) {
        boolean z10 = false;
        int i12 = iArr[0] + iArr[1] + iArr[2] + iArr[3] + iArr[4];
        int a10 = (int) a(iArr, i11);
        float d10 = d(i10, a10, iArr[2], i12);
        if (!Float.isNaN(d10)) {
            int i13 = (int) d10;
            float c10 = c(a10, i13, iArr[2], i12);
            if (!Float.isNaN(c10) && b(i13, (int) c10)) {
                float f10 = i12 / 7.0f;
                int i14 = 0;
                while (true) {
                    if (i14 >= this.f12335b.size()) {
                        break;
                    }
                    d dVar = this.f12335b.get(i14);
                    if (dVar.f(f10, d10, c10)) {
                        this.f12335b.set(i14, dVar.g(d10, c10, f10));
                        z10 = true;
                        break;
                    }
                    i14++;
                }
                if (!z10) {
                    d dVar2 = new d(c10, d10, f10);
                    this.f12335b.add(dVar2);
                    t tVar = this.f12338e;
                    if (tVar != null) {
                        tVar.a(dVar2);
                    }
                }
                return true;
            }
        }
        return false;
    }
}
