package j0;

import j0.i;
import java.util.Arrays;
import java.util.HashMap;
import m0.d;
/* loaded from: classes.dex */
public class d {

    /* renamed from: r */
    public static boolean f13871r = false;

    /* renamed from: s */
    public static boolean f13872s = true;

    /* renamed from: t */
    public static boolean f13873t = true;

    /* renamed from: u */
    public static boolean f13874u = true;

    /* renamed from: v */
    public static boolean f13875v = false;

    /* renamed from: w */
    private static int f13876w = 1000;

    /* renamed from: x */
    public static long f13877x;

    /* renamed from: y */
    public static long f13878y;

    /* renamed from: d */
    private a f13882d;

    /* renamed from: g */
    j0.b[] f13885g;

    /* renamed from: n */
    final c f13892n;

    /* renamed from: q */
    private a f13895q;

    /* renamed from: a */
    public boolean f13879a = false;

    /* renamed from: b */
    int f13880b = 0;

    /* renamed from: c */
    private HashMap<String, i> f13881c = null;

    /* renamed from: e */
    private int f13883e = 32;

    /* renamed from: f */
    private int f13884f = 32;

    /* renamed from: h */
    public boolean f13886h = false;

    /* renamed from: i */
    public boolean f13887i = false;

    /* renamed from: j */
    private boolean[] f13888j = new boolean[32];

    /* renamed from: k */
    int f13889k = 1;

    /* renamed from: l */
    int f13890l = 0;

    /* renamed from: m */
    private int f13891m = 32;

    /* renamed from: o */
    private i[] f13893o = new i[f13876w];

    /* renamed from: p */
    private int f13894p = 0;

    /* loaded from: classes.dex */
    public interface a {
        void a(i iVar);

        void b(a aVar);

        i c(d dVar, boolean[] zArr);

        void clear();

        i getKey();

        boolean isEmpty();
    }

    /* loaded from: classes.dex */
    public class b extends j0.b {
        public b(c cVar) {
            d.this = r1;
            this.f13865e = new j(this, cVar);
        }
    }

    public d() {
        this.f13885g = null;
        this.f13885g = new j0.b[32];
        C();
        c cVar = new c();
        this.f13892n = cVar;
        this.f13882d = new h(cVar);
        this.f13895q = f13875v ? new b(cVar) : new j0.b(cVar);
    }

    private final int B(a aVar, boolean z10) {
        for (int i10 = 0; i10 < this.f13889k; i10++) {
            this.f13888j[i10] = false;
        }
        boolean z11 = false;
        int i11 = 0;
        while (!z11) {
            i11++;
            if (i11 >= this.f13889k * 2) {
                return i11;
            }
            if (aVar.getKey() != null) {
                this.f13888j[aVar.getKey().f13918q] = true;
            }
            i c10 = aVar.c(this, this.f13888j);
            if (c10 != null) {
                boolean[] zArr = this.f13888j;
                int i12 = c10.f13918q;
                if (zArr[i12]) {
                    return i11;
                }
                zArr[i12] = true;
            }
            if (c10 != null) {
                float f10 = Float.MAX_VALUE;
                int i13 = -1;
                for (int i14 = 0; i14 < this.f13890l; i14++) {
                    j0.b bVar = this.f13885g[i14];
                    if (bVar.f13861a.Y3 != i.a.UNRESTRICTED && !bVar.f13866f && bVar.t(c10)) {
                        float g10 = bVar.f13865e.g(c10);
                        if (g10 < 0.0f) {
                            float f11 = (-bVar.f13862b) / g10;
                            if (f11 < f10) {
                                i13 = i14;
                                f10 = f11;
                            }
                        }
                    }
                }
                if (i13 > -1) {
                    j0.b bVar2 = this.f13885g[i13];
                    bVar2.f13861a.f13919x = -1;
                    bVar2.x(c10);
                    i iVar = bVar2.f13861a;
                    iVar.f13919x = i13;
                    iVar.m(this, bVar2);
                }
            } else {
                z11 = true;
            }
        }
        return i11;
    }

    private void C() {
        int i10 = 0;
        if (f13875v) {
            while (i10 < this.f13890l) {
                j0.b bVar = this.f13885g[i10];
                if (bVar != null) {
                    this.f13892n.f13867a.a(bVar);
                }
                this.f13885g[i10] = null;
                i10++;
            }
            return;
        }
        while (i10 < this.f13890l) {
            j0.b bVar2 = this.f13885g[i10];
            if (bVar2 != null) {
                this.f13892n.f13868b.a(bVar2);
            }
            this.f13885g[i10] = null;
            i10++;
        }
    }

    private i a(i.a aVar, String str) {
        i b10 = this.f13892n.f13869c.b();
        if (b10 == null) {
            b10 = new i(aVar, str);
        } else {
            b10.h();
        }
        b10.l(aVar, str);
        int i10 = this.f13894p;
        int i11 = f13876w;
        if (i10 >= i11) {
            int i12 = i11 * 2;
            f13876w = i12;
            this.f13893o = (i[]) Arrays.copyOf(this.f13893o, i12);
        }
        i[] iVarArr = this.f13893o;
        int i13 = this.f13894p;
        this.f13894p = i13 + 1;
        iVarArr[i13] = b10;
        return b10;
    }

    private final void l(j0.b bVar) {
        int i10;
        if (!f13873t || !bVar.f13866f) {
            j0.b[] bVarArr = this.f13885g;
            int i11 = this.f13890l;
            bVarArr[i11] = bVar;
            i iVar = bVar.f13861a;
            iVar.f13919x = i11;
            this.f13890l = i11 + 1;
            iVar.m(this, bVar);
        } else {
            bVar.f13861a.j(this, bVar.f13862b);
        }
        if (!f13873t || !this.f13879a) {
            return;
        }
        int i12 = 0;
        while (i12 < this.f13890l) {
            if (this.f13885g[i12] == null) {
                System.out.println("WTF");
            }
            j0.b[] bVarArr2 = this.f13885g;
            if (bVarArr2[i12] != null && bVarArr2[i12].f13866f) {
                j0.b bVar2 = bVarArr2[i12];
                bVar2.f13861a.j(this, bVar2.f13862b);
                (f13875v ? this.f13892n.f13867a : this.f13892n.f13868b).a(bVar2);
                this.f13885g[i12] = null;
                int i13 = i12 + 1;
                int i14 = i13;
                while (true) {
                    i10 = this.f13890l;
                    if (i13 >= i10) {
                        break;
                    }
                    j0.b[] bVarArr3 = this.f13885g;
                    int i15 = i13 - 1;
                    bVarArr3[i15] = bVarArr3[i13];
                    if (bVarArr3[i15].f13861a.f13919x == i13) {
                        bVarArr3[i15].f13861a.f13919x = i15;
                    }
                    i14 = i13;
                    i13++;
                }
                if (i14 < i10) {
                    this.f13885g[i14] = null;
                }
                this.f13890l = i10 - 1;
                i12--;
            }
            i12++;
        }
        this.f13879a = false;
    }

    private void n() {
        for (int i10 = 0; i10 < this.f13890l; i10++) {
            j0.b bVar = this.f13885g[i10];
            bVar.f13861a.U3 = bVar.f13862b;
        }
    }

    public static j0.b s(d dVar, i iVar, i iVar2, float f10) {
        return dVar.r().j(iVar, iVar2, f10);
    }

    private int u(a aVar) {
        boolean z10;
        int i10 = 0;
        while (true) {
            if (i10 >= this.f13890l) {
                z10 = false;
                break;
            }
            j0.b[] bVarArr = this.f13885g;
            if (bVarArr[i10].f13861a.Y3 != i.a.UNRESTRICTED && bVarArr[i10].f13862b < 0.0f) {
                z10 = true;
                break;
            }
            i10++;
        }
        if (z10) {
            boolean z11 = false;
            int i11 = 0;
            while (!z11) {
                i11++;
                float f10 = Float.MAX_VALUE;
                int i12 = -1;
                int i13 = -1;
                int i14 = 0;
                for (int i15 = 0; i15 < this.f13890l; i15++) {
                    j0.b bVar = this.f13885g[i15];
                    if (bVar.f13861a.Y3 != i.a.UNRESTRICTED && !bVar.f13866f && bVar.f13862b < 0.0f) {
                        int i16 = 9;
                        if (f13874u) {
                            int e10 = bVar.f13865e.e();
                            int i17 = 0;
                            while (i17 < e10) {
                                i h10 = bVar.f13865e.h(i17);
                                float g10 = bVar.f13865e.g(h10);
                                if (g10 > 0.0f) {
                                    int i18 = 0;
                                    while (i18 < i16) {
                                        float f11 = h10.W3[i18] / g10;
                                        if ((f11 < f10 && i18 == i14) || i18 > i14) {
                                            i13 = h10.f13918q;
                                            i14 = i18;
                                            i12 = i15;
                                            f10 = f11;
                                        }
                                        i18++;
                                        i16 = 9;
                                    }
                                }
                                i17++;
                                i16 = 9;
                            }
                        } else {
                            for (int i19 = 1; i19 < this.f13889k; i19++) {
                                i iVar = this.f13892n.f13870d[i19];
                                float g11 = bVar.f13865e.g(iVar);
                                if (g11 > 0.0f) {
                                    for (int i20 = 0; i20 < 9; i20++) {
                                        float f12 = iVar.W3[i20] / g11;
                                        if ((f12 < f10 && i20 == i14) || i20 > i14) {
                                            i13 = i19;
                                            i12 = i15;
                                            i14 = i20;
                                            f10 = f12;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (i12 != -1) {
                    j0.b bVar2 = this.f13885g[i12];
                    bVar2.f13861a.f13919x = -1;
                    bVar2.x(this.f13892n.f13870d[i13]);
                    i iVar2 = bVar2.f13861a;
                    iVar2.f13919x = i12;
                    iVar2.m(this, bVar2);
                } else {
                    z11 = true;
                }
                if (i11 > this.f13889k / 2) {
                    z11 = true;
                }
            }
            return i11;
        }
        return 0;
    }

    public static e w() {
        return null;
    }

    private void y() {
        int i10 = this.f13883e * 2;
        this.f13883e = i10;
        this.f13885g = (j0.b[]) Arrays.copyOf(this.f13885g, i10);
        c cVar = this.f13892n;
        cVar.f13870d = (i[]) Arrays.copyOf(cVar.f13870d, this.f13883e);
        int i11 = this.f13883e;
        this.f13888j = new boolean[i11];
        this.f13884f = i11;
        this.f13891m = i11;
    }

    void A(a aVar) {
        u(aVar);
        B(aVar, false);
        n();
    }

    public void D() {
        c cVar;
        int i10 = 0;
        while (true) {
            cVar = this.f13892n;
            i[] iVarArr = cVar.f13870d;
            if (i10 >= iVarArr.length) {
                break;
            }
            i iVar = iVarArr[i10];
            if (iVar != null) {
                iVar.h();
            }
            i10++;
        }
        cVar.f13869c.c(this.f13893o, this.f13894p);
        this.f13894p = 0;
        Arrays.fill(this.f13892n.f13870d, (Object) null);
        HashMap<String, i> hashMap = this.f13881c;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f13880b = 0;
        this.f13882d.clear();
        this.f13889k = 1;
        for (int i11 = 0; i11 < this.f13890l; i11++) {
            j0.b[] bVarArr = this.f13885g;
            if (bVarArr[i11] != null) {
                bVarArr[i11].f13863c = false;
            }
        }
        C();
        this.f13890l = 0;
        this.f13895q = f13875v ? new b(this.f13892n) : new j0.b(this.f13892n);
    }

    public void b(m0.e eVar, m0.e eVar2, float f10, int i10) {
        d.b bVar = d.b.LEFT;
        i q10 = q(eVar.m(bVar));
        d.b bVar2 = d.b.TOP;
        i q11 = q(eVar.m(bVar2));
        d.b bVar3 = d.b.RIGHT;
        i q12 = q(eVar.m(bVar3));
        d.b bVar4 = d.b.BOTTOM;
        i q13 = q(eVar.m(bVar4));
        i q14 = q(eVar2.m(bVar));
        i q15 = q(eVar2.m(bVar2));
        i q16 = q(eVar2.m(bVar3));
        i q17 = q(eVar2.m(bVar4));
        j0.b r10 = r();
        double d10 = f10;
        double d11 = i10;
        r10.q(q11, q13, q15, q17, (float) (Math.sin(d10) * d11));
        d(r10);
        j0.b r11 = r();
        r11.q(q10, q12, q14, q16, (float) (Math.cos(d10) * d11));
        d(r11);
    }

    public void c(i iVar, i iVar2, int i10, float f10, i iVar3, i iVar4, int i11, int i12) {
        j0.b r10 = r();
        r10.h(iVar, iVar2, i10, f10, iVar3, iVar4, i11);
        if (i12 != 8) {
            r10.d(this, i12);
        }
        d(r10);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(j0.b r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L3
            return
        L3:
            int r0 = r5.f13890l
            r1 = 1
            int r0 = r0 + r1
            int r2 = r5.f13891m
            if (r0 >= r2) goto L12
            int r0 = r5.f13889k
            int r0 = r0 + r1
            int r2 = r5.f13884f
            if (r0 < r2) goto L15
        L12:
            r5.y()
        L15:
            r0 = 0
            boolean r2 = r6.f13866f
            if (r2 != 0) goto L81
            r6.D(r5)
            boolean r2 = r6.isEmpty()
            if (r2 == 0) goto L24
            return
        L24:
            r6.r()
            boolean r2 = r6.f(r5)
            if (r2 == 0) goto L78
            j0.i r2 = r5.p()
            r6.f13861a = r2
            int r3 = r5.f13890l
            r5.l(r6)
            int r4 = r5.f13890l
            int r3 = r3 + r1
            if (r4 != r3) goto L78
            j0.d$a r0 = r5.f13895q
            r0.b(r6)
            j0.d$a r0 = r5.f13895q
            r5.B(r0, r1)
            int r0 = r2.f13919x
            r3 = -1
            if (r0 != r3) goto L79
            j0.i r0 = r6.f13861a
            if (r0 != r2) goto L59
            j0.i r0 = r6.v(r2)
            if (r0 == 0) goto L59
            r6.x(r0)
        L59:
            boolean r0 = r6.f13866f
            if (r0 != 0) goto L62
            j0.i r0 = r6.f13861a
            r0.m(r5, r6)
        L62:
            boolean r0 = j0.d.f13875v
            if (r0 == 0) goto L6b
            j0.c r0 = r5.f13892n
            j0.f<j0.b> r0 = r0.f13867a
            goto L6f
        L6b:
            j0.c r0 = r5.f13892n
            j0.f<j0.b> r0 = r0.f13868b
        L6f:
            r0.a(r6)
            int r0 = r5.f13890l
            int r0 = r0 - r1
            r5.f13890l = r0
            goto L79
        L78:
            r1 = r0
        L79:
            boolean r0 = r6.s()
            if (r0 != 0) goto L80
            return
        L80:
            r0 = r1
        L81:
            if (r0 != 0) goto L86
            r5.l(r6)
        L86:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.d.d(j0.b):void");
    }

    public j0.b e(i iVar, i iVar2, int i10, int i11) {
        if (f13872s && i11 == 8 && iVar2.V3 && iVar.f13919x == -1) {
            iVar.j(this, iVar2.U3 + i10);
            return null;
        }
        j0.b r10 = r();
        r10.n(iVar, iVar2, i10);
        if (i11 != 8) {
            r10.d(this, i11);
        }
        d(r10);
        return r10;
    }

    public void f(i iVar, int i10) {
        j0.b bVar;
        if (f13872s && iVar.f13919x == -1) {
            float f10 = i10;
            iVar.j(this, f10);
            for (int i11 = 0; i11 < this.f13880b + 1; i11++) {
                i iVar2 = this.f13892n.f13870d[i11];
                if (iVar2 != null && iVar2.f13913c4 && iVar2.f13915d4 == iVar.f13918q) {
                    iVar2.j(this, iVar2.f13916e4 + f10);
                }
            }
            return;
        }
        int i12 = iVar.f13919x;
        if (i12 != -1) {
            j0.b bVar2 = this.f13885g[i12];
            if (!bVar2.f13866f) {
                if (bVar2.f13865e.e() == 0) {
                    bVar2.f13866f = true;
                } else {
                    bVar = r();
                    bVar.m(iVar, i10);
                }
            }
            bVar2.f13862b = i10;
            return;
        }
        bVar = r();
        bVar.i(iVar, i10);
        d(bVar);
    }

    public void g(i iVar, i iVar2, int i10, boolean z10) {
        j0.b r10 = r();
        i t10 = t();
        t10.f13920y = 0;
        r10.o(iVar, iVar2, t10, i10);
        d(r10);
    }

    public void h(i iVar, i iVar2, int i10, int i11) {
        j0.b r10 = r();
        i t10 = t();
        t10.f13920y = 0;
        r10.o(iVar, iVar2, t10, i10);
        if (i11 != 8) {
            m(r10, (int) (r10.f13865e.g(t10) * (-1.0f)), i11);
        }
        d(r10);
    }

    public void i(i iVar, i iVar2, int i10, boolean z10) {
        j0.b r10 = r();
        i t10 = t();
        t10.f13920y = 0;
        r10.p(iVar, iVar2, t10, i10);
        d(r10);
    }

    public void j(i iVar, i iVar2, int i10, int i11) {
        j0.b r10 = r();
        i t10 = t();
        t10.f13920y = 0;
        r10.p(iVar, iVar2, t10, i10);
        if (i11 != 8) {
            m(r10, (int) (r10.f13865e.g(t10) * (-1.0f)), i11);
        }
        d(r10);
    }

    public void k(i iVar, i iVar2, i iVar3, i iVar4, float f10, int i10) {
        j0.b r10 = r();
        r10.k(iVar, iVar2, iVar3, iVar4, f10);
        if (i10 != 8) {
            r10.d(this, i10);
        }
        d(r10);
    }

    void m(j0.b bVar, int i10, int i11) {
        bVar.e(o(i11, null), i10);
    }

    public i o(int i10, String str) {
        if (this.f13889k + 1 >= this.f13884f) {
            y();
        }
        i a10 = a(i.a.ERROR, str);
        int i11 = this.f13880b + 1;
        this.f13880b = i11;
        this.f13889k++;
        a10.f13918q = i11;
        a10.f13920y = i10;
        this.f13892n.f13870d[i11] = a10;
        this.f13882d.a(a10);
        return a10;
    }

    public i p() {
        if (this.f13889k + 1 >= this.f13884f) {
            y();
        }
        i a10 = a(i.a.SLACK, null);
        int i10 = this.f13880b + 1;
        this.f13880b = i10;
        this.f13889k++;
        a10.f13918q = i10;
        this.f13892n.f13870d[i10] = a10;
        return a10;
    }

    public i q(Object obj) {
        i iVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f13889k + 1 >= this.f13884f) {
            y();
        }
        if (obj instanceof m0.d) {
            m0.d dVar = (m0.d) obj;
            iVar = dVar.h();
            if (iVar == null) {
                dVar.r(this.f13892n);
                iVar = dVar.h();
            }
            int i10 = iVar.f13918q;
            if (i10 == -1 || i10 > this.f13880b || this.f13892n.f13870d[i10] == null) {
                if (i10 != -1) {
                    iVar.h();
                }
                int i11 = this.f13880b + 1;
                this.f13880b = i11;
                this.f13889k++;
                iVar.f13918q = i11;
                iVar.Y3 = i.a.UNRESTRICTED;
                this.f13892n.f13870d[i11] = iVar;
            }
        }
        return iVar;
    }

    public j0.b r() {
        j0.b bVar;
        if (f13875v) {
            bVar = this.f13892n.f13867a.b();
            if (bVar == null) {
                bVar = new b(this.f13892n);
                f13878y++;
            }
            bVar.y();
        } else {
            bVar = this.f13892n.f13868b.b();
            if (bVar == null) {
                bVar = new j0.b(this.f13892n);
                f13877x++;
            }
            bVar.y();
        }
        i.d();
        return bVar;
    }

    public i t() {
        if (this.f13889k + 1 >= this.f13884f) {
            y();
        }
        i a10 = a(i.a.SLACK, null);
        int i10 = this.f13880b + 1;
        this.f13880b = i10;
        this.f13889k++;
        a10.f13918q = i10;
        this.f13892n.f13870d[i10] = a10;
        return a10;
    }

    public c v() {
        return this.f13892n;
    }

    public int x(Object obj) {
        i h10 = ((m0.d) obj).h();
        if (h10 != null) {
            return (int) (h10.U3 + 0.5f);
        }
        return 0;
    }

    public void z() {
        if (this.f13882d.isEmpty()) {
            n();
            return;
        }
        if (this.f13886h || this.f13887i) {
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                if (i10 >= this.f13890l) {
                    z10 = true;
                    break;
                } else if (!this.f13885g[i10].f13866f) {
                    break;
                } else {
                    i10++;
                }
            }
            if (z10) {
                n();
                return;
            }
        }
        A(this.f13882d);
    }
}
