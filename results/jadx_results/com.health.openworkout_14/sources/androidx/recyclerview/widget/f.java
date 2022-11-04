package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
/* loaded from: classes.dex */
public class f {

    /* renamed from: a */
    private static final Comparator<C0029f> f1713a = new a();

    /* loaded from: classes.dex */
    static class a implements Comparator<C0029f> {
        a() {
        }

        /* renamed from: a */
        public int compare(C0029f c0029f, C0029f c0029f2) {
            int i = c0029f.f1728a - c0029f2.f1728a;
            return i == 0 ? c0029f.f1729b - c0029f2.f1729b : i;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b {
        public abstract boolean a(int i, int i2);

        public abstract boolean b(int i, int i2);

        public Object c(int i, int i2) {
            return null;
        }

        public abstract int d();

        public abstract int e();
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        private final List<C0029f> f1714a;

        /* renamed from: b */
        private final int[] f1715b;

        /* renamed from: c */
        private final int[] f1716c;

        /* renamed from: d */
        private final b f1717d;

        /* renamed from: e */
        private final int f1718e;

        /* renamed from: f */
        private final int f1719f;

        /* renamed from: g */
        private final boolean f1720g;

        c(b bVar, List<C0029f> list, int[] iArr, int[] iArr2, boolean z) {
            this.f1714a = list;
            this.f1715b = iArr;
            this.f1716c = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.f1717d = bVar;
            this.f1718e = bVar.e();
            this.f1719f = bVar.d();
            this.f1720g = z;
            a();
            h();
        }

        private void a() {
            C0029f c0029f = this.f1714a.isEmpty() ? null : this.f1714a.get(0);
            if (c0029f != null && c0029f.f1728a == 0 && c0029f.f1729b == 0) {
                return;
            }
            C0029f c0029f2 = new C0029f();
            c0029f2.f1728a = 0;
            c0029f2.f1729b = 0;
            c0029f2.f1731d = false;
            c0029f2.f1730c = 0;
            c0029f2.f1732e = false;
            this.f1714a.add(0, c0029f2);
        }

        private void b(List<d> list, o oVar, int i, int i2, int i3) {
            if (!this.f1720g) {
                oVar.b(i, i2);
                return;
            }
            for (int i4 = i2 - 1; i4 >= 0; i4--) {
                int[] iArr = this.f1716c;
                int i5 = i3 + i4;
                int i6 = iArr[i5] & 31;
                if (i6 == 0) {
                    oVar.b(i, 1);
                    for (d dVar : list) {
                        dVar.f1722b++;
                    }
                } else if (i6 == 4 || i6 == 8) {
                    int i7 = iArr[i5] >> 5;
                    oVar.c(j(list, i7, true).f1722b, i);
                    if (i6 == 4) {
                        oVar.d(i, 1, this.f1717d.c(i7, i5));
                    }
                } else if (i6 != 16) {
                    throw new IllegalStateException("unknown flag for pos " + i5 + " " + Long.toBinaryString(i6));
                } else {
                    list.add(new d(i5, i, false));
                }
            }
        }

        private void c(List<d> list, o oVar, int i, int i2, int i3) {
            if (!this.f1720g) {
                oVar.a(i, i2);
                return;
            }
            for (int i4 = i2 - 1; i4 >= 0; i4--) {
                int[] iArr = this.f1715b;
                int i5 = i3 + i4;
                int i6 = iArr[i5] & 31;
                if (i6 == 0) {
                    oVar.a(i + i4, 1);
                    for (d dVar : list) {
                        dVar.f1722b--;
                    }
                } else if (i6 == 4 || i6 == 8) {
                    int i7 = iArr[i5] >> 5;
                    d j = j(list, i7, false);
                    oVar.c(i + i4, j.f1722b - 1);
                    if (i6 == 4) {
                        oVar.d(j.f1722b - 1, 1, this.f1717d.c(i5, i7));
                    }
                } else if (i6 != 16) {
                    throw new IllegalStateException("unknown flag for pos " + i5 + " " + Long.toBinaryString(i6));
                } else {
                    list.add(new d(i5, i + i4, true));
                }
            }
        }

        private void f(int i, int i2, int i3) {
            if (this.f1715b[i - 1] != 0) {
                return;
            }
            g(i, i2, i3, false);
        }

        private boolean g(int i, int i2, int i3, boolean z) {
            int i4;
            int i5;
            if (z) {
                i2--;
                i4 = i;
                i5 = i2;
            } else {
                i5 = i - 1;
                i4 = i5;
            }
            while (i3 >= 0) {
                C0029f c0029f = this.f1714a.get(i3);
                int i6 = c0029f.f1728a;
                int i7 = c0029f.f1730c;
                int i8 = i6 + i7;
                int i9 = c0029f.f1729b + i7;
                int i10 = 8;
                if (z) {
                    for (int i11 = i4 - 1; i11 >= i8; i11--) {
                        if (this.f1717d.b(i11, i5)) {
                            if (!this.f1717d.a(i11, i5)) {
                                i10 = 4;
                            }
                            this.f1716c[i5] = (i11 << 5) | 16;
                            this.f1715b[i11] = (i5 << 5) | i10;
                            return true;
                        }
                    }
                    continue;
                } else {
                    for (int i12 = i2 - 1; i12 >= i9; i12--) {
                        if (this.f1717d.b(i5, i12)) {
                            if (!this.f1717d.a(i5, i12)) {
                                i10 = 4;
                            }
                            int i13 = i - 1;
                            this.f1715b[i13] = (i12 << 5) | 16;
                            this.f1716c[i12] = (i13 << 5) | i10;
                            return true;
                        }
                    }
                    continue;
                }
                i4 = c0029f.f1728a;
                i2 = c0029f.f1729b;
                i3--;
            }
            return false;
        }

        private void h() {
            int i = this.f1718e;
            int i2 = this.f1719f;
            for (int size = this.f1714a.size() - 1; size >= 0; size--) {
                C0029f c0029f = this.f1714a.get(size);
                int i3 = c0029f.f1728a;
                int i4 = c0029f.f1730c;
                int i5 = i3 + i4;
                int i6 = c0029f.f1729b + i4;
                if (this.f1720g) {
                    while (i > i5) {
                        f(i, i2, size);
                        i--;
                    }
                    while (i2 > i6) {
                        i(i, i2, size);
                        i2--;
                    }
                }
                for (int i7 = 0; i7 < c0029f.f1730c; i7++) {
                    int i8 = c0029f.f1728a + i7;
                    int i9 = c0029f.f1729b + i7;
                    int i10 = this.f1717d.a(i8, i9) ? 1 : 2;
                    this.f1715b[i8] = (i9 << 5) | i10;
                    this.f1716c[i9] = (i8 << 5) | i10;
                }
                i = c0029f.f1728a;
                i2 = c0029f.f1729b;
            }
        }

        private void i(int i, int i2, int i3) {
            if (this.f1716c[i2 - 1] != 0) {
                return;
            }
            g(i, i2, i3, true);
        }

        private static d j(List<d> list, int i, boolean z) {
            int size = list.size() - 1;
            while (size >= 0) {
                d dVar = list.get(size);
                if (dVar.f1721a == i && dVar.f1723c == z) {
                    list.remove(size);
                    while (size < list.size()) {
                        list.get(size).f1722b += z ? 1 : -1;
                        size++;
                    }
                    return dVar;
                }
                size--;
            }
            return null;
        }

        public void d(o oVar) {
            androidx.recyclerview.widget.c cVar = oVar instanceof androidx.recyclerview.widget.c ? (androidx.recyclerview.widget.c) oVar : new androidx.recyclerview.widget.c(oVar);
            ArrayList arrayList = new ArrayList();
            int i = this.f1718e;
            int i2 = this.f1719f;
            for (int size = this.f1714a.size() - 1; size >= 0; size--) {
                C0029f c0029f = this.f1714a.get(size);
                int i3 = c0029f.f1730c;
                int i4 = c0029f.f1728a + i3;
                int i5 = c0029f.f1729b + i3;
                if (i4 < i) {
                    c(arrayList, cVar, i4, i - i4, i4);
                }
                if (i5 < i2) {
                    b(arrayList, cVar, i4, i2 - i5, i5);
                }
                for (int i6 = i3 - 1; i6 >= 0; i6--) {
                    int[] iArr = this.f1715b;
                    int i7 = c0029f.f1728a;
                    if ((iArr[i7 + i6] & 31) == 2) {
                        cVar.d(i7 + i6, 1, this.f1717d.c(i7 + i6, c0029f.f1729b + i6));
                    }
                }
                i = c0029f.f1728a;
                i2 = c0029f.f1729b;
            }
            cVar.e();
        }

        public void e(RecyclerView.g gVar) {
            d(new androidx.recyclerview.widget.b(gVar));
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a */
        int f1721a;

        /* renamed from: b */
        int f1722b;

        /* renamed from: c */
        boolean f1723c;

        public d(int i, int i2, boolean z) {
            this.f1721a = i;
            this.f1722b = i2;
            this.f1723c = z;
        }
    }

    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a */
        int f1724a;

        /* renamed from: b */
        int f1725b;

        /* renamed from: c */
        int f1726c;

        /* renamed from: d */
        int f1727d;

        public e() {
        }

        public e(int i, int i2, int i3, int i4) {
            this.f1724a = i;
            this.f1725b = i2;
            this.f1726c = i3;
            this.f1727d = i4;
        }
    }

    /* renamed from: androidx.recyclerview.widget.f$f */
    /* loaded from: classes.dex */
    public static class C0029f {

        /* renamed from: a */
        int f1728a;

        /* renamed from: b */
        int f1729b;

        /* renamed from: c */
        int f1730c;

        /* renamed from: d */
        boolean f1731d;

        /* renamed from: e */
        boolean f1732e;

        C0029f() {
        }
    }

    public static c a(b bVar) {
        return b(bVar, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.recyclerview.widget.f.c b(androidx.recyclerview.widget.f.b r15, boolean r16) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.f.b(androidx.recyclerview.widget.f$b, boolean):androidx.recyclerview.widget.f$c");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
        if (r24[r13 - 1] < r24[r13 + r5]) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b8, code lost:
        if (r25[r12 - 1] < r25[r12 + 1]) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e1 A[LOOP:4: B:49:0x00cd->B:53:0x00e1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ec A[EDGE_INSN: B:85:0x00ec->B:55:0x00ec ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static androidx.recyclerview.widget.f.C0029f c(androidx.recyclerview.widget.f.b r19, int r20, int r21, int r22, int r23, int[] r24, int[] r25, int r26) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.f.c(androidx.recyclerview.widget.f$b, int, int, int, int, int[], int[], int):androidx.recyclerview.widget.f$f");
    }
}
