package p2;

import c4.q;
import java.util.ArrayList;
import java.util.List;
import p2.g;
/* loaded from: classes.dex */
public class r<T extends c4.q<T>> {

    /* renamed from: a */
    o f18837a;

    /* renamed from: i */
    h<T> f18845i;

    /* renamed from: j */
    i<T> f18846j;

    /* renamed from: b */
    public boolean f18838b = true;

    /* renamed from: c */
    ok.b<g> f18839c = new ok.b<>(q.f18836a, p.f18835c);

    /* renamed from: d */
    List<g> f18840d = new ArrayList();

    /* renamed from: e */
    List<g> f18841e = new ArrayList();

    /* renamed from: f */
    d f18842f = new d();

    /* renamed from: g */
    ka.b f18843g = new ka.b();

    /* renamed from: h */
    la.a f18844h = new la.a();

    /* renamed from: k */
    ok.e f18847k = new ok.e();

    public r(String str, String str2, Class<T> cls) {
        this.f18837a = new o(str, str2);
        this.f18846j = new i<>(cls);
        this.f18845i = new h<>(cls);
    }

    private void a(g gVar, List<ka.c> list) {
        float f10 = 1.0f;
        float c10 = gVar.c() - 1.0f;
        float f11 = (float) gVar.f18762y;
        float f12 = (float) gVar.f18761x;
        float f13 = (float) gVar.U3;
        float f14 = (float) gVar.V3;
        int i10 = 0;
        while (i10 < this.f18847k.f18606b) {
            int i11 = i10 / 5;
            ka.c cVar = list.get(i11);
            int i12 = cVar.f14865c;
            float f15 = i12 / c10;
            int i13 = cVar.f14866d;
            float f16 = i13 / c10;
            float f17 = f10 - f15;
            float f18 = f10 - f16;
            float f19 = (f17 * f18 * f11) + 0.0f + (f18 * f15 * f12) + (f15 * f16 * f14) + (f17 * f16 * f13);
            float[] fArr = this.f18847k.f18605a;
            int i14 = i10 + 1;
            int i15 = i14 + 1;
            int i16 = (fArr[i10] < f19 ? 1 : 0) + 0 + (fArr[i14] < f19 ? 1 : 0);
            int i17 = i15 + 1;
            int i18 = i16 + (fArr[i15] < f19 ? 1 : 0);
            int i19 = i17 + 1;
            int i20 = i18 + (fArr[i17] < f19 ? 1 : 0);
            int i21 = i19 + 1;
            this.f18842f.e(i11, gVar.Y3.a(i13, i12, i20 + ((fArr[i19] > f19 ? 1 : (fArr[i19] == f19 ? 0 : -1)) < 0 ? 1 : 0) >= 3 ? 1 : 0));
            i10 = i21;
            f10 = 1.0f;
        }
    }

    static void b(g gVar) {
        gVar.f18756g4.b(0).k(gVar.f18752d.b(0));
        gVar.f18756g4.b(1).k(gVar.f18750c.b(1));
        ea.d.c(gVar.f18750c.b(1), gVar.f18750c.b(2), gVar.f18760q.b(3), gVar.f18760q.b(2), gVar.f18756g4.b(2));
        gVar.f18756g4.b(3).k(gVar.f18760q.b(3));
    }

    private boolean c(T t10, g gVar) {
        boolean z10;
        g.d dVar;
        boolean z11 = false;
        if (!f(gVar)) {
            gVar.f18755f4 = g.d.FORMAT;
            return false;
        } else if (!g(gVar)) {
            gVar.f18755f4 = g.d.VERSION;
            return false;
        } else if (!this.f18845i.e(t10, gVar)) {
            gVar.f18755f4 = g.d.ALIGNMENT;
            return false;
        } else {
            this.f18846j.h(gVar);
            this.f18846j.a().a(gVar);
            for (int i10 = 0; i10 < 6 && (i10 <= 0 || this.f18846j.a().e()); i10++) {
                this.f18846j.a().b();
                gVar.f18755f4 = g.d.NONE;
                if (n(gVar)) {
                    if (this.f18837a.b(gVar)) {
                        z10 = true;
                        break;
                    }
                    dVar = g.d.ERROR_CORRECTION;
                } else {
                    dVar = g.d.READING_BITS;
                }
                gVar.f18755f4 = dVar;
            }
            z10 = false;
            if (!z10 || this.f18837a.j(gVar)) {
                z11 = z10;
            }
            gVar.f18757h4.h(this.f18846j.a().f18814h);
            return z11;
        }
    }

    private boolean f(g gVar) {
        for (int i10 = 0; i10 < 2; i10++) {
            if (i10 == 0) {
                l(gVar);
            } else {
                m(gVar);
            }
            int c10 = this.f18842f.c(0, 15, false) ^ 21522;
            int e10 = u.b(c10) ? c10 >> 10 : u.e(c10);
            if (e10 >= 0) {
                u.g(e10, gVar);
                return true;
            }
        }
        return false;
    }

    private void j(int i10, int i11, int i12) {
        int e10 = this.f18846j.e(i11, i12);
        if (e10 == -1) {
            e10 = 0;
        }
        this.f18842f.e(i10, e10);
    }

    private float k(g gVar, List<ka.c> list) {
        int c10 = gVar.c();
        this.f18847k.d(list.size() * 5);
        this.f18847k.e();
        int max = Math.max(8, c10 - 10);
        float f10 = 0.0f;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f18842f.f18743b; i11++) {
            ka.c cVar = list.get(i11);
            this.f18846j.f(cVar.f14866d, cVar.f14865c, this.f18847k);
            if (cVar.f14865c >= max || cVar.f14866d >= max) {
                i10 += 5;
                int i12 = this.f18847k.f18606b - 5;
                while (true) {
                    ok.e eVar = this.f18847k;
                    if (i12 < eVar.f18606b) {
                        f10 += eVar.f18605a[i12];
                        i12++;
                    }
                }
            }
        }
        return f10 / i10;
    }

    private boolean n(g gVar) {
        int i10 = g.f18746k4[gVar.W3].f18788a;
        gVar.f18751c4 = new byte[i10];
        this.f18842f.d(i10 * 8);
        List<ka.c> list = g.f18747l4[gVar.W3];
        gVar.V3 = k(gVar, list);
        a(gVar, list);
        byte[] bArr = this.f18842f.f18742a;
        byte[] bArr2 = gVar.f18751c4;
        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        return true;
    }

    private boolean o(g gVar) {
        this.f18846j.j(gVar.f18750c, (float) gVar.f18761x);
        this.f18842f.d(18);
        this.f18842f.f();
        for (int i10 = 0; i10 < 18; i10++) {
            j(i10, i10 / 3, (i10 % 3) - 4);
        }
        return true;
    }

    private boolean p(g gVar) {
        this.f18846j.j(gVar.f18760q, (float) gVar.U3);
        this.f18842f.d(18);
        this.f18842f.f();
        for (int i10 = 0; i10 < 18; i10++) {
            j(i10, (i10 % 3) - 4, i10 / 3);
        }
        return true;
    }

    static void q(la.a aVar, int i10, int i11) {
        while (i10 != i11) {
            da.f.c(aVar);
            i10 = (i10 + 1) % 4;
        }
    }

    static void r(e eVar, int i10, int i11, g gVar) {
        e eVar2 = (e) eVar.f17359h[i10].a(eVar);
        e eVar3 = (e) eVar.f17359h[i11].a(eVar);
        gVar.f18750c.e(eVar2.f17352a);
        gVar.f18752d.e(eVar.f17352a);
        gVar.f18760q.e(eVar3.f17352a);
        gVar.f18761x = eVar2.f18744i;
        gVar.f18762y = eVar.f18744i;
        gVar.U3 = eVar3.f18744i;
        int a10 = eVar2.a(eVar);
        int a11 = eVar3.a(eVar);
        q(gVar.f18750c, a10, 3);
        q(gVar.f18752d, i10, 1);
        q(gVar.f18760q, a11, 0);
    }

    public static void s(la.a aVar) {
        double d10 = aVar.b(1).f10622c;
        double d11 = aVar.b(1).f10623d;
        aVar.b(1).k(aVar.b(3));
        aVar.b(3).i(d10, d11);
    }

    int d() {
        int c10 = this.f18842f.c(0, 18, false);
        int f10 = u.c(c10) ? c10 >> 12 : u.f(c10);
        if (f10 > 40 || f10 < 7) {
            return -1;
        }
        return f10;
    }

    int e(g gVar) {
        this.f18846j.i(gVar, 0.0f);
        this.f18846j.c(gVar.f18750c.b(0), this.f18843g);
        ka.b bVar = this.f18843g;
        if (Math.abs(bVar.f10623d / bVar.f10622c) >= 0.3d) {
            return -1;
        }
        double d10 = ((this.f18843g.f10622c + 7.0d) - 17.0d) / 4.0d;
        this.f18846j.c(gVar.f18760q.b(0), this.f18843g);
        ka.b bVar2 = this.f18843g;
        if (Math.abs(bVar2.f10622c / bVar2.f10623d) >= 0.3d) {
            return -1;
        }
        double d11 = ((this.f18843g.f10623d + 7.0d) - 17.0d) / 4.0d;
        if (Math.abs(d10 - d11) / Math.max(d10, d11) <= 0.4d) {
            return (int) (((d10 + d11) / 2.0d) + 0.5d);
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
        if (r0 == r3) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
        if (r0 <= 0) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    boolean g(p2.g r5) {
        /*
            r4 = this;
            int r0 = r4.e(r5)
            r1 = -1
            r2 = 1
            r3 = 7
            if (r0 < r3) goto L26
            r4.o(r5)
            int r0 = r4.d()
            r4.p(r5)
            int r3 = r4.d()
            if (r0 >= r2) goto L1c
            if (r3 >= r2) goto L1c
            goto L28
        L1c:
            if (r0 >= r2) goto L20
            r0 = r3
            goto L29
        L20:
            if (r3 >= r2) goto L23
            goto L29
        L23:
            if (r0 == r3) goto L29
            goto L28
        L26:
            if (r0 > 0) goto L29
        L28:
            r0 = r1
        L29:
            r5.W3 = r0
            if (r0 < r2) goto L32
            r5 = 40
            if (r0 > r5) goto L32
            goto L33
        L32:
            r2 = 0
        L33:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.r.g(p2.g):boolean");
    }

    public List<g> h() {
        return this.f18840d;
    }

    public void i(List<e> list, T t10) {
        boolean z10;
        List<g> list2;
        this.f18846j.g(t10);
        this.f18839c.r();
        this.f18840d.clear();
        this.f18841e.clear();
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar = list.get(i10);
            int i11 = 3;
            for (int i12 = 0; i12 < 4; i12++) {
                o2.a[] aVarArr = eVar.f17359h;
                if (aVarArr[i11] != null && aVarArr[i12] != null) {
                    g i13 = this.f18839c.i();
                    r(eVar, i11, i12, i13);
                    b(i13);
                    if (!c(t10, i13)) {
                        if (this.f18838b) {
                            t(i13);
                            z10 = c(t10, i13);
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            i13.f18759j4 = true;
                        } else {
                            list2 = this.f18841e;
                            list2.add(i13);
                        }
                    }
                    list2 = this.f18840d;
                    list2.add(i13);
                }
                i11 = i12;
            }
        }
    }

    final boolean l(g gVar) {
        this.f18846j.j(gVar.f18752d, (float) gVar.f18762y);
        this.f18842f.d(15);
        this.f18842f.f();
        for (int i10 = 0; i10 < 6; i10++) {
            j(i10, i10, 8);
        }
        j(6, 7, 8);
        j(7, 8, 8);
        j(8, 8, 7);
        for (int i11 = 0; i11 < 6; i11++) {
            j(i11 + 9, 8, 5 - i11);
        }
        return true;
    }

    final boolean m(g gVar) {
        this.f18846j.j(gVar.f18750c, (float) gVar.f18761x);
        this.f18842f.d(15);
        this.f18842f.f();
        for (int i10 = 0; i10 < 8; i10++) {
            j(i10, 8, 6 - i10);
        }
        this.f18846j.j(gVar.f18760q, (float) gVar.U3);
        for (int i11 = 0; i11 < 7; i11++) {
            j(i11 + 8, i11, 8);
        }
        return true;
    }

    void t(g gVar) {
        this.f18844h.e(gVar.f18760q);
        gVar.f18760q.e(gVar.f18750c);
        gVar.f18750c.e(this.f18844h);
        s(gVar.f18752d);
        s(gVar.f18750c);
        s(gVar.f18760q);
    }
}
