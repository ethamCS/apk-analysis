package b.e.b;

import b.e.b.i;
import b.e.b.k.d;
import java.util.Arrays;
import java.util.HashMap;
/* loaded from: classes.dex */
public class d {
    public static boolean r = false;
    public static boolean s = true;
    public static boolean t = true;
    public static boolean u = true;
    public static boolean v = false;
    private static int w = 1000;
    public static e x;
    public static long y;
    public static long z;

    /* renamed from: d */
    private a f2194d;

    /* renamed from: g */
    b.e.b.b[] f2197g;
    final c n;
    private a q;

    /* renamed from: a */
    public boolean f2191a = false;

    /* renamed from: b */
    int f2192b = 0;

    /* renamed from: c */
    private HashMap<String, i> f2193c = null;

    /* renamed from: e */
    private int f2195e = 32;

    /* renamed from: f */
    private int f2196f = 32;

    /* renamed from: h */
    public boolean f2198h = false;
    public boolean i = false;
    private boolean[] j = new boolean[32];
    int k = 1;
    int l = 0;
    private int m = 32;
    private i[] o = new i[w];
    private int p = 0;

    /* loaded from: classes.dex */
    public interface a {
        void a(a aVar);

        void b(i iVar);

        i c(d dVar, boolean[] zArr);

        void clear();

        i getKey();

        boolean isEmpty();
    }

    /* loaded from: classes.dex */
    public class b extends b.e.b.b {
        public b(d dVar, c cVar) {
            this.f2185e = new j(this, cVar);
        }
    }

    public d() {
        this.f2197g = null;
        this.f2197g = new b.e.b.b[32];
        C();
        c cVar = new c();
        this.n = cVar;
        this.f2194d = new h(cVar);
        this.q = v ? new b(this, cVar) : new b.e.b.b(cVar);
    }

    private final int B(a aVar, boolean z2) {
        e eVar = x;
        if (eVar != null) {
            eVar.f2206h++;
        }
        for (int i = 0; i < this.k; i++) {
            this.j[i] = false;
        }
        boolean z3 = false;
        int i2 = 0;
        while (!z3) {
            e eVar2 = x;
            if (eVar2 != null) {
                eVar2.i++;
            }
            i2++;
            if (i2 >= this.k * 2) {
                return i2;
            }
            if (aVar.getKey() != null) {
                this.j[aVar.getKey().f2215c] = true;
            }
            i c2 = aVar.c(this, this.j);
            if (c2 != null) {
                boolean[] zArr = this.j;
                int i3 = c2.f2215c;
                if (zArr[i3]) {
                    return i2;
                }
                zArr[i3] = true;
            }
            if (c2 != null) {
                float f2 = Float.MAX_VALUE;
                int i4 = -1;
                for (int i5 = 0; i5 < this.l; i5++) {
                    b.e.b.b bVar = this.f2197g[i5];
                    if (bVar.f2181a.j != i.a.UNRESTRICTED && !bVar.f2186f && bVar.t(c2)) {
                        float g2 = bVar.f2185e.g(c2);
                        if (g2 < 0.0f) {
                            float f3 = (-bVar.f2182b) / g2;
                            if (f3 < f2) {
                                i4 = i5;
                                f2 = f3;
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    b.e.b.b bVar2 = this.f2197g[i4];
                    bVar2.f2181a.f2216d = -1;
                    e eVar3 = x;
                    if (eVar3 != null) {
                        eVar3.j++;
                    }
                    bVar2.x(c2);
                    i iVar = bVar2.f2181a;
                    iVar.f2216d = i4;
                    iVar.g(this, bVar2);
                }
            } else {
                z3 = true;
            }
        }
        return i2;
    }

    private void C() {
        int i = 0;
        if (v) {
            while (i < this.l) {
                b.e.b.b bVar = this.f2197g[i];
                if (bVar != null) {
                    this.n.f2187a.a(bVar);
                }
                this.f2197g[i] = null;
                i++;
            }
            return;
        }
        while (i < this.l) {
            b.e.b.b bVar2 = this.f2197g[i];
            if (bVar2 != null) {
                this.n.f2188b.a(bVar2);
            }
            this.f2197g[i] = null;
            i++;
        }
    }

    private i a(i.a aVar, String str) {
        i b2 = this.n.f2189c.b();
        if (b2 == null) {
            b2 = new i(aVar, str);
        } else {
            b2.d();
        }
        b2.f(aVar, str);
        int i = this.p;
        int i2 = w;
        if (i >= i2) {
            int i3 = i2 * 2;
            w = i3;
            this.o = (i[]) Arrays.copyOf(this.o, i3);
        }
        i[] iVarArr = this.o;
        int i4 = this.p;
        this.p = i4 + 1;
        iVarArr[i4] = b2;
        return b2;
    }

    private final void l(b.e.b.b bVar) {
        int i;
        if (!t || !bVar.f2186f) {
            b.e.b.b[] bVarArr = this.f2197g;
            int i2 = this.l;
            bVarArr[i2] = bVar;
            i iVar = bVar.f2181a;
            iVar.f2216d = i2;
            this.l = i2 + 1;
            iVar.g(this, bVar);
        } else {
            bVar.f2181a.e(this, bVar.f2182b);
        }
        if (!t || !this.f2191a) {
            return;
        }
        int i3 = 0;
        while (i3 < this.l) {
            if (this.f2197g[i3] == null) {
                System.out.println("WTF");
            }
            b.e.b.b[] bVarArr2 = this.f2197g;
            if (bVarArr2[i3] != null && bVarArr2[i3].f2186f) {
                b.e.b.b bVar2 = bVarArr2[i3];
                bVar2.f2181a.e(this, bVar2.f2182b);
                (v ? this.n.f2187a : this.n.f2188b).a(bVar2);
                this.f2197g[i3] = null;
                int i4 = i3 + 1;
                int i5 = i4;
                while (true) {
                    i = this.l;
                    if (i4 >= i) {
                        break;
                    }
                    b.e.b.b[] bVarArr3 = this.f2197g;
                    int i6 = i4 - 1;
                    bVarArr3[i6] = bVarArr3[i4];
                    if (bVarArr3[i6].f2181a.f2216d == i4) {
                        bVarArr3[i6].f2181a.f2216d = i6;
                    }
                    i5 = i4;
                    i4++;
                }
                if (i5 < i) {
                    this.f2197g[i5] = null;
                }
                this.l = i - 1;
                i3--;
            }
            i3++;
        }
        this.f2191a = false;
    }

    private void n() {
        for (int i = 0; i < this.l; i++) {
            b.e.b.b bVar = this.f2197g[i];
            bVar.f2181a.f2218f = bVar.f2182b;
        }
    }

    public static b.e.b.b s(d dVar, i iVar, i iVar2, float f2) {
        b.e.b.b r2 = dVar.r();
        r2.j(iVar, iVar2, f2);
        return r2;
    }

    private int u(a aVar) {
        boolean z2;
        int i = 0;
        while (true) {
            if (i >= this.l) {
                z2 = false;
                break;
            }
            b.e.b.b[] bVarArr = this.f2197g;
            if (bVarArr[i].f2181a.j != i.a.UNRESTRICTED && bVarArr[i].f2182b < 0.0f) {
                z2 = true;
                break;
            }
            i++;
        }
        if (z2) {
            boolean z3 = false;
            int i2 = 0;
            while (!z3) {
                e eVar = x;
                if (eVar != null) {
                    eVar.k++;
                }
                i2++;
                float f2 = Float.MAX_VALUE;
                int i3 = -1;
                int i4 = -1;
                int i5 = 0;
                for (int i6 = 0; i6 < this.l; i6++) {
                    b.e.b.b bVar = this.f2197g[i6];
                    if (bVar.f2181a.j != i.a.UNRESTRICTED && !bVar.f2186f && bVar.f2182b < 0.0f) {
                        int i7 = 9;
                        if (u) {
                            int k = bVar.f2185e.k();
                            int i8 = 0;
                            while (i8 < k) {
                                i f3 = bVar.f2185e.f(i8);
                                float g2 = bVar.f2185e.g(f3);
                                if (g2 > 0.0f) {
                                    int i9 = 0;
                                    while (i9 < i7) {
                                        float f4 = f3.f2220h[i9] / g2;
                                        if ((f4 < f2 && i9 == i5) || i9 > i5) {
                                            i4 = f3.f2215c;
                                            i5 = i9;
                                            i3 = i6;
                                            f2 = f4;
                                        }
                                        i9++;
                                        i7 = 9;
                                    }
                                }
                                i8++;
                                i7 = 9;
                            }
                        } else {
                            for (int i10 = 1; i10 < this.k; i10++) {
                                i iVar = this.n.f2190d[i10];
                                float g3 = bVar.f2185e.g(iVar);
                                if (g3 > 0.0f) {
                                    for (int i11 = 0; i11 < 9; i11++) {
                                        float f5 = iVar.f2220h[i11] / g3;
                                        if ((f5 < f2 && i11 == i5) || i11 > i5) {
                                            i4 = i10;
                                            i5 = i11;
                                            i3 = i6;
                                            f2 = f5;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (i3 != -1) {
                    b.e.b.b bVar2 = this.f2197g[i3];
                    bVar2.f2181a.f2216d = -1;
                    e eVar2 = x;
                    if (eVar2 != null) {
                        eVar2.j++;
                    }
                    bVar2.x(this.n.f2190d[i4]);
                    i iVar2 = bVar2.f2181a;
                    iVar2.f2216d = i3;
                    iVar2.g(this, bVar2);
                } else {
                    z3 = true;
                }
                if (i2 > this.k / 2) {
                    z3 = true;
                }
            }
            return i2;
        }
        return 0;
    }

    public static e w() {
        return x;
    }

    private void y() {
        int i = this.f2195e * 2;
        this.f2195e = i;
        this.f2197g = (b.e.b.b[]) Arrays.copyOf(this.f2197g, i);
        c cVar = this.n;
        cVar.f2190d = (i[]) Arrays.copyOf(cVar.f2190d, this.f2195e);
        int i2 = this.f2195e;
        this.j = new boolean[i2];
        this.f2196f = i2;
        this.m = i2;
        e eVar = x;
        if (eVar != null) {
            eVar.f2202d++;
            eVar.o = Math.max(eVar.o, i2);
            e eVar2 = x;
            eVar2.x = eVar2.o;
        }
    }

    void A(a aVar) {
        e eVar = x;
        if (eVar != null) {
            eVar.t++;
            eVar.u = Math.max(eVar.u, this.k);
            e eVar2 = x;
            eVar2.v = Math.max(eVar2.v, this.l);
        }
        u(aVar);
        B(aVar, false);
        n();
    }

    public void D() {
        c cVar;
        int i = 0;
        while (true) {
            cVar = this.n;
            i[] iVarArr = cVar.f2190d;
            if (i >= iVarArr.length) {
                break;
            }
            i iVar = iVarArr[i];
            if (iVar != null) {
                iVar.d();
            }
            i++;
        }
        cVar.f2189c.c(this.o, this.p);
        this.p = 0;
        Arrays.fill(this.n.f2190d, (Object) null);
        HashMap<String, i> hashMap = this.f2193c;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f2192b = 0;
        this.f2194d.clear();
        this.k = 1;
        for (int i2 = 0; i2 < this.l; i2++) {
            b.e.b.b[] bVarArr = this.f2197g;
            if (bVarArr[i2] != null) {
                bVarArr[i2].f2183c = false;
            }
        }
        C();
        this.l = 0;
        this.q = v ? new b(this, this.n) : new b.e.b.b(this.n);
    }

    public void b(b.e.b.k.e eVar, b.e.b.k.e eVar2, float f2, int i) {
        d.b bVar = d.b.LEFT;
        i q = q(eVar.m(bVar));
        d.b bVar2 = d.b.TOP;
        i q2 = q(eVar.m(bVar2));
        d.b bVar3 = d.b.RIGHT;
        i q3 = q(eVar.m(bVar3));
        d.b bVar4 = d.b.BOTTOM;
        i q4 = q(eVar.m(bVar4));
        i q5 = q(eVar2.m(bVar));
        i q6 = q(eVar2.m(bVar2));
        i q7 = q(eVar2.m(bVar3));
        i q8 = q(eVar2.m(bVar4));
        b.e.b.b r2 = r();
        double d2 = f2;
        double d3 = i;
        r2.q(q2, q4, q6, q8, (float) (Math.sin(d2) * d3));
        d(r2);
        b.e.b.b r3 = r();
        r3.q(q, q3, q5, q7, (float) (Math.cos(d2) * d3));
        d(r3);
    }

    public void c(i iVar, i iVar2, int i, float f2, i iVar3, i iVar4, int i2, int i3) {
        b.e.b.b r2 = r();
        r2.h(iVar, iVar2, i, f2, iVar3, iVar4, i2);
        if (i3 != 8) {
            r2.d(this, i3);
        }
        d(r2);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x009c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(b.e.b.b r8) {
        /*
            r7 = this;
            if (r8 != 0) goto L3
            return
        L3:
            b.e.b.e r0 = b.e.b.d.x
            r1 = 1
            if (r0 == 0) goto L17
            long r3 = r0.f2204f
            long r3 = r3 + r1
            r0.f2204f = r3
            boolean r3 = r8.f2186f
            if (r3 == 0) goto L17
            long r3 = r0.f2205g
            long r3 = r3 + r1
            r0.f2205g = r3
        L17:
            int r0 = r7.l
            r3 = 1
            int r0 = r0 + r3
            int r4 = r7.m
            if (r0 >= r4) goto L26
            int r0 = r7.k
            int r0 = r0 + r3
            int r4 = r7.f2196f
            if (r0 < r4) goto L29
        L26:
            r7.y()
        L29:
            r0 = 0
            boolean r4 = r8.f2186f
            if (r4 != 0) goto L9e
            r8.D(r7)
            boolean r4 = r8.isEmpty()
            if (r4 == 0) goto L38
            return
        L38:
            r8.r()
            boolean r4 = r8.f(r7)
            if (r4 == 0) goto L95
            b.e.b.i r4 = r7.p()
            r8.f2181a = r4
            int r5 = r7.l
            r7.l(r8)
            int r6 = r7.l
            int r5 = r5 + r3
            if (r6 != r5) goto L95
            b.e.b.d$a r0 = r7.q
            r0.a(r8)
            b.e.b.d$a r0 = r7.q
            r7.B(r0, r3)
            int r0 = r4.f2216d
            r5 = -1
            if (r0 != r5) goto L96
            b.e.b.i r0 = r8.f2181a
            if (r0 != r4) goto L76
            b.e.b.i r0 = r8.v(r4)
            if (r0 == 0) goto L76
            b.e.b.e r4 = b.e.b.d.x
            if (r4 == 0) goto L73
            long r5 = r4.j
            long r5 = r5 + r1
            r4.j = r5
        L73:
            r8.x(r0)
        L76:
            boolean r0 = r8.f2186f
            if (r0 != 0) goto L7f
            b.e.b.i r0 = r8.f2181a
            r0.g(r7, r8)
        L7f:
            boolean r0 = b.e.b.d.v
            if (r0 == 0) goto L88
            b.e.b.c r0 = r7.n
            b.e.b.f<b.e.b.b> r0 = r0.f2187a
            goto L8c
        L88:
            b.e.b.c r0 = r7.n
            b.e.b.f<b.e.b.b> r0 = r0.f2188b
        L8c:
            r0.a(r8)
            int r0 = r7.l
            int r0 = r0 - r3
            r7.l = r0
            goto L96
        L95:
            r3 = 0
        L96:
            boolean r0 = r8.s()
            if (r0 != 0) goto L9d
            return
        L9d:
            r0 = r3
        L9e:
            if (r0 != 0) goto La3
            r7.l(r8)
        La3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.e.b.d.d(b.e.b.b):void");
    }

    public b.e.b.b e(i iVar, i iVar2, int i, int i2) {
        if (s && i2 == 8 && iVar2.f2219g && iVar.f2216d == -1) {
            iVar.e(this, iVar2.f2218f + i);
            return null;
        }
        b.e.b.b r2 = r();
        r2.n(iVar, iVar2, i);
        if (i2 != 8) {
            r2.d(this, i2);
        }
        d(r2);
        return r2;
    }

    public void f(i iVar, int i) {
        b.e.b.b bVar;
        if (s && iVar.f2216d == -1) {
            float f2 = i;
            iVar.e(this, f2);
            for (int i2 = 0; i2 < this.f2192b + 1; i2++) {
                i iVar2 = this.n.f2190d[i2];
                if (iVar2 != null && iVar2.n && iVar2.o == iVar.f2215c) {
                    iVar2.e(this, iVar2.p + f2);
                }
            }
            return;
        }
        int i3 = iVar.f2216d;
        if (i3 != -1) {
            b.e.b.b bVar2 = this.f2197g[i3];
            if (!bVar2.f2186f) {
                if (bVar2.f2185e.k() == 0) {
                    bVar2.f2186f = true;
                } else {
                    bVar = r();
                    bVar.m(iVar, i);
                }
            }
            bVar2.f2182b = i;
            return;
        }
        bVar = r();
        bVar.i(iVar, i);
        d(bVar);
    }

    public void g(i iVar, i iVar2, int i, boolean z2) {
        b.e.b.b r2 = r();
        i t2 = t();
        t2.f2217e = 0;
        r2.o(iVar, iVar2, t2, i);
        d(r2);
    }

    public void h(i iVar, i iVar2, int i, int i2) {
        b.e.b.b r2 = r();
        i t2 = t();
        t2.f2217e = 0;
        r2.o(iVar, iVar2, t2, i);
        if (i2 != 8) {
            m(r2, (int) (r2.f2185e.g(t2) * (-1.0f)), i2);
        }
        d(r2);
    }

    public void i(i iVar, i iVar2, int i, boolean z2) {
        b.e.b.b r2 = r();
        i t2 = t();
        t2.f2217e = 0;
        r2.p(iVar, iVar2, t2, i);
        d(r2);
    }

    public void j(i iVar, i iVar2, int i, int i2) {
        b.e.b.b r2 = r();
        i t2 = t();
        t2.f2217e = 0;
        r2.p(iVar, iVar2, t2, i);
        if (i2 != 8) {
            m(r2, (int) (r2.f2185e.g(t2) * (-1.0f)), i2);
        }
        d(r2);
    }

    public void k(i iVar, i iVar2, i iVar3, i iVar4, float f2, int i) {
        b.e.b.b r2 = r();
        r2.k(iVar, iVar2, iVar3, iVar4, f2);
        if (i != 8) {
            r2.d(this, i);
        }
        d(r2);
    }

    void m(b.e.b.b bVar, int i, int i2) {
        bVar.e(o(i2, null), i);
    }

    public i o(int i, String str) {
        e eVar = x;
        if (eVar != null) {
            eVar.l++;
        }
        if (this.k + 1 >= this.f2196f) {
            y();
        }
        i a2 = a(i.a.ERROR, str);
        int i2 = this.f2192b + 1;
        this.f2192b = i2;
        this.k++;
        a2.f2215c = i2;
        a2.f2217e = i;
        this.n.f2190d[i2] = a2;
        this.f2194d.b(a2);
        return a2;
    }

    public i p() {
        e eVar = x;
        if (eVar != null) {
            eVar.n++;
        }
        if (this.k + 1 >= this.f2196f) {
            y();
        }
        i a2 = a(i.a.SLACK, null);
        int i = this.f2192b + 1;
        this.f2192b = i;
        this.k++;
        a2.f2215c = i;
        this.n.f2190d[i] = a2;
        return a2;
    }

    public i q(Object obj) {
        i iVar = null;
        if (obj == null) {
            return null;
        }
        if (this.k + 1 >= this.f2196f) {
            y();
        }
        if (obj instanceof b.e.b.k.d) {
            b.e.b.k.d dVar = (b.e.b.k.d) obj;
            iVar = dVar.h();
            if (iVar == null) {
                dVar.r(this.n);
                iVar = dVar.h();
            }
            int i = iVar.f2215c;
            if (i == -1 || i > this.f2192b || this.n.f2190d[i] == null) {
                if (i != -1) {
                    iVar.d();
                }
                int i2 = this.f2192b + 1;
                this.f2192b = i2;
                this.k++;
                iVar.f2215c = i2;
                iVar.j = i.a.UNRESTRICTED;
                this.n.f2190d[i2] = iVar;
            }
        }
        return iVar;
    }

    public b.e.b.b r() {
        b.e.b.b bVar;
        if (v) {
            bVar = this.n.f2187a.b();
            if (bVar == null) {
                bVar = new b(this, this.n);
                z++;
            }
            bVar.y();
        } else {
            bVar = this.n.f2188b.b();
            if (bVar == null) {
                bVar = new b.e.b.b(this.n);
                y++;
            }
            bVar.y();
        }
        i.b();
        return bVar;
    }

    public i t() {
        e eVar = x;
        if (eVar != null) {
            eVar.m++;
        }
        if (this.k + 1 >= this.f2196f) {
            y();
        }
        i a2 = a(i.a.SLACK, null);
        int i = this.f2192b + 1;
        this.f2192b = i;
        this.k++;
        a2.f2215c = i;
        this.n.f2190d[i] = a2;
        return a2;
    }

    public c v() {
        return this.n;
    }

    public int x(Object obj) {
        i h2 = ((b.e.b.k.d) obj).h();
        if (h2 != null) {
            return (int) (h2.f2218f + 0.5f);
        }
        return 0;
    }

    public void z() {
        e eVar = x;
        if (eVar != null) {
            eVar.f2203e++;
        }
        if (this.f2194d.isEmpty()) {
            n();
            return;
        }
        if (this.f2198h || this.i) {
            e eVar2 = x;
            if (eVar2 != null) {
                eVar2.q++;
            }
            boolean z2 = false;
            int i = 0;
            while (true) {
                if (i >= this.l) {
                    z2 = true;
                    break;
                } else if (!this.f2197g[i].f2186f) {
                    break;
                } else {
                    i++;
                }
            }
            if (z2) {
                e eVar3 = x;
                if (eVar3 != null) {
                    eVar3.p++;
                }
                n();
                return;
            }
        }
        A(this.f2194d);
    }
}
