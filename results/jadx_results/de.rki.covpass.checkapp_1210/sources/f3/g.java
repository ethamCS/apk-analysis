package f3;

import c4.q;
import h2.e;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
/* loaded from: classes.dex */
public class g<T extends q<T>> {

    /* renamed from: a */
    private x3.b f9750a;

    /* renamed from: b */
    private int f9751b;

    /* renamed from: c */
    private double f9752c;

    /* renamed from: d */
    private h2.a f9753d;

    /* renamed from: e */
    private e.a f9754e;

    /* renamed from: f */
    int f9755f;

    /* renamed from: g */
    int f9756g;

    /* renamed from: h */
    private k2.d f9757h;

    /* renamed from: j */
    private c<T> f9759j;

    /* renamed from: l */
    private boolean f9761l;

    /* renamed from: m */
    private la.a f9762m;

    /* renamed from: o */
    private boolean f9764o;

    /* renamed from: p */
    protected a4.a<ka.a> f9765p;

    /* renamed from: r */
    double f9767r;

    /* renamed from: s */
    private h f9768s;

    /* renamed from: u */
    private Class<T> f9770u;

    /* renamed from: i */
    private final ok.g f9758i = new ok.g();

    /* renamed from: k */
    ok.b<a> f9760k = new ok.b<>(e.f9748a);

    /* renamed from: n */
    private final la.a f9763n = new la.a();

    /* renamed from: q */
    protected ka.a f9766q = new ka.a();

    /* renamed from: t */
    private final ok.b<ka.c> f9769t = new ok.b<>(f.f9749a);

    /* renamed from: v */
    private final ok.d f9771v = new ok.d();

    /* renamed from: w */
    private final ok.b<ka.c> f9772w = new ok.b<>(f.f9749a);

    /* renamed from: x */
    List<ka.c> f9773x = new ArrayList();

    /* renamed from: y */
    v3.c f9774y = new v3.c(0.8d);

    /* renamed from: z */
    v3.c f9775z = new v3.c(0.8d);
    PrintStream A = null;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public boolean f9776a;

        /* renamed from: b */
        public double f9777b;

        /* renamed from: c */
        public double f9778c;

        /* renamed from: d */
        public boolean f9779d;

        /* renamed from: e */
        public ok.d f9780e = new ok.d();

        /* renamed from: f */
        public la.a f9781f = new la.a();

        /* renamed from: g */
        public la.a f9782g = new la.a();

        /* renamed from: h */
        public ok.g f9783h = new ok.g();

        /* renamed from: i */
        public q2.b f9784i;

        public void a() {
            this.f9776a = false;
            this.f9778c = -1.0d;
            this.f9777b = -1.0d;
            this.f9779d = true;
            this.f9780e.d();
            this.f9783h.h();
            this.f9781f.f15915c.r();
            this.f9782g.f15915c.r();
            this.f9784i = null;
        }
    }

    public g(k2.d dVar, x3.b bVar, boolean z10, boolean z11, double d10, double d11, h2.a aVar, Class<T> cls) {
        this.f9762m = new la.a();
        this.f9750a = bVar.f();
        this.f9757h = dVar;
        this.f9764o = z10;
        this.f9761l = z11;
        this.f9767r = d10;
        this.f9753d = aVar;
        this.f9770u = cls;
        if (aVar instanceof e.a) {
            this.f9754e = (e.a) aVar;
        }
        if (dVar.d()) {
            if (d10 > 0.0d) {
                this.f9759j = new c<>(30, 1, d11, cls);
            }
            this.f9762m = new la.a(1);
            return;
        }
        throw new IllegalArgumentException("ContourToPolygon must be configured for loops");
    }

    private void a(int i10, int i11) {
        this.f9755f = i10;
        this.f9756g = i11;
        int e10 = this.f9750a.e(Math.min(i10, i11));
        this.f9751b = e10;
        int max = Math.max(4, e10);
        this.f9751b = max;
        this.f9752c = Math.pow(max / 4.0d, 2.0d);
        this.f9753d.h(this.f9751b);
        h hVar = this.f9768s;
        if (hVar != null) {
            hVar.d(i10, i11);
        }
    }

    private void c() {
        float f10;
        List<ka.c> list;
        PrintStream printStream;
        String str;
        List<q2.b> f11 = this.f9753d.f();
        for (int i10 = 0; i10 < f11.size(); i10++) {
            q2.b bVar = f11.get(i10);
            this.f9772w.r();
            this.f9753d.d(bVar.f19494b, this.f9772w);
            if (this.f9772w.g() >= this.f9751b) {
                boolean r10 = r(this.f9772w.t());
                if (this.f9761l || !r10) {
                    h hVar = this.f9768s;
                    if (hVar == null || hVar.c(this.f9772w.t(), r10, true)) {
                        c<T> cVar = this.f9759j;
                        float f12 = -1.0f;
                        if (cVar != null) {
                            cVar.c(this.f9772w.t(), true);
                            f12 = this.f9759j.a();
                            f10 = this.f9759j.b();
                            if (Math.abs(f10 - f12) < this.f9767r) {
                                printStream = this.A;
                                if (printStream != null) {
                                    str = "rejected polygon. contour edge intensity";
                                    printStream.println(str);
                                }
                            }
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.f9765p != null) {
                            list = this.f9769t.t();
                            n(this.f9772w.t(), this.f9769t);
                            h hVar2 = this.f9768s;
                            if (hVar2 != null && !hVar2.c(this.f9769t.t(), r10, false)) {
                            }
                        } else {
                            list = this.f9772w.t();
                        }
                        h hVar3 = this.f9768s;
                        if (hVar3 != null) {
                            hVar3.a(this.f9757h, r10);
                        }
                        if (!this.f9757h.f(list, this.f9758i)) {
                            printStream = this.A;
                            if (printStream != null) {
                                str = "rejected polygon initial fit failed. contour size = " + this.f9772w.g();
                                printStream.println(str);
                            }
                        } else {
                            this.f9773x.clear();
                            int i11 = 0;
                            while (true) {
                                ok.g gVar = this.f9758i;
                                if (i11 >= gVar.f18610b) {
                                    break;
                                }
                                this.f9773x.add(list.get(gVar.d(i11)));
                                i11++;
                            }
                            boolean a10 = da.g.a(this.f9773x);
                            if (this.f9759j != null) {
                                if (!a10) {
                                    float f13 = f12;
                                    f12 = f10;
                                    f10 = f13;
                                }
                                if (f12 > f10) {
                                    printStream = this.A;
                                    if (printStream != null) {
                                        str = "White blob. Rejected";
                                        printStream.println(str);
                                    }
                                }
                            }
                            if (this.f9764o == a10) {
                                ok.g gVar2 = this.f9758i;
                                d(gVar2.f18609a, gVar2.f18610b);
                            }
                            this.f9762m.f15915c.s(this.f9758i.l());
                            this.f9763n.f15915c.s(this.f9758i.l());
                            int i12 = 0;
                            while (i12 < this.f9758i.l()) {
                                ka.c cVar2 = list.get(this.f9758i.d(i12));
                                ka.c c10 = this.f9772w.c(this.f9758i.d(i12));
                                this.f9762m.b(i12).i(cVar2.f14865c, cVar2.f14866d);
                                this.f9763n.b(i12).i(c10.f14865c, c10.f14866d);
                                i12++;
                                f12 = f12;
                            }
                            float f14 = f12;
                            if (r10) {
                                b(this.f9763n, this.f9771v);
                            } else {
                                this.f9771v.e(0);
                            }
                            h hVar4 = this.f9768s;
                            if (hVar4 != null && !hVar4.b(this.f9762m, this.f9763n, this.f9771v, r10)) {
                                printStream = this.A;
                                if (printStream != null) {
                                    str = "rejected by helper.filterPixelPolygon()";
                                    printStream.println(str);
                                }
                            } else if (ea.a.a(this.f9762m) < this.f9752c) {
                                printStream = this.A;
                                if (printStream != null) {
                                    str = "Rejected area";
                                    printStream.println(str);
                                }
                            } else {
                                a i13 = this.f9760k.i();
                                if (this.f9765p != null) {
                                    this.f9753d.a(bVar.f19494b, list);
                                }
                                i13.f9783h.k(this.f9758i);
                                i13.f9779d = r10;
                                i13.f9776a = true;
                                i13.f9777b = f14;
                                i13.f9778c = f10;
                                i13.f9784i = bVar;
                                i13.f9781f.e(this.f9762m);
                                i13.f9782g.e(this.f9763n);
                                i13.f9780e.f(this.f9771v);
                            }
                        }
                    }
                } else {
                    printStream = this.A;
                    if (printStream != null) {
                        str = "rejected polygon, touched border";
                        printStream.println(str);
                    }
                }
            }
        }
    }

    public static void d(int[] iArr, int i10) {
        int i11 = i10 / 2;
        for (int i12 = 1; i12 <= i11; i12++) {
            int i13 = i10 - i12;
            int i14 = iArr[i12];
            iArr[i12] = iArr[i13];
            iArr[i13] = i14;
        }
    }

    private void n(List<ka.c> list, ok.b<ka.c> bVar) {
        Objects.requireNonNull(this.f9765p);
        bVar.r();
        for (int i10 = 0; i10 < list.size(); i10++) {
            ka.c cVar = list.get(i10);
            ka.c i11 = bVar.i();
            this.f9765p.a(cVar.f14865c, cVar.f14866d, this.f9766q);
            i11.f14865c = Math.round(this.f9766q.f10620c);
            i11.f14866d = Math.round(this.f9766q.f10621d);
        }
    }

    void b(la.a aVar, ok.d dVar) {
        boolean z10;
        dVar.d();
        for (int i10 = 0; i10 < aVar.f(); i10++) {
            ka.b b10 = aVar.b(i10);
            double d10 = b10.f10622c;
            if (d10 > 1.0d) {
                double d11 = b10.f10623d;
                if (d11 > 1.0d && d10 < this.f9755f - 2 && d11 < this.f9756g - 2) {
                    z10 = false;
                    dVar.a(z10);
                }
            }
            z10 = true;
            dVar.a(z10);
        }
    }

    public List<ka.c> e(a aVar) {
        this.f9772w.r();
        this.f9753d.d(aVar.f9784i.f19494b, this.f9772w);
        return this.f9772w.t();
    }

    public h2.a f() {
        return this.f9753d;
    }

    public ok.b<a> g() {
        return this.f9760k;
    }

    public Class<T> h() {
        return this.f9770u;
    }

    public double i() {
        return this.f9774y.a();
    }

    public double j() {
        return this.f9775z.a();
    }

    public int k() {
        return this.f9757h.b();
    }

    public boolean l() {
        return this.f9764o;
    }

    public void m(T t10, c4.l lVar) {
        ok.b<a> bVar;
        PrintStream printStream = this.A;
        if (printStream != null) {
            printStream.println("ENTER  DetectPolygonFromContour.process()");
        }
        e.a aVar = this.f9754e;
        if (aVar == null || aVar.g()) {
            l2.a.a(lVar, t10);
        } else if (t10.f6220q + 2 != lVar.f6220q || t10.f6221x + 2 != lVar.f6221x) {
            throw new IllegalArgumentException("Including padding, expected a binary image with shape " + (t10.f6220q + 2) + "x" + (t10.f6221x + 2));
        }
        int i10 = this.f9755f;
        int i11 = t10.f6220q;
        if (i10 != i11 || this.f9756g != t10.f6221x) {
            a(i11, t10.f6221x);
        }
        int i12 = 0;
        while (true) {
            bVar = this.f9760k;
            if (i12 >= bVar.f18623d) {
                break;
            }
            bVar.c(i12).a();
            i12++;
        }
        bVar.r();
        c<T> cVar = this.f9759j;
        if (cVar != null) {
            cVar.d(t10);
        }
        long nanoTime = System.nanoTime();
        this.f9753d.b(lVar);
        long nanoTime2 = System.nanoTime();
        c();
        this.f9774y.d((nanoTime2 - nanoTime) * 1.0E-6d);
        this.f9775z.d((System.nanoTime() - nanoTime2) * 1.0E-6d);
        PrintStream printStream2 = this.A;
        if (printStream2 != null) {
            printStream2.println("EXIT  DetectPolygonFromContour.process()");
        }
    }

    public void o(boolean z10) {
        this.f9757h.c(z10);
    }

    public void p(int i10, int i11) {
        if (i10 >= 3) {
            if (i11 < i10) {
                throw new IllegalArgumentException("The max must be >= the min");
            }
            this.f9757h.a(i10);
            this.f9757h.e(i11);
            return;
        }
        throw new IllegalArgumentException("The min must be >= 3");
    }

    public void q(boolean z10) {
        this.f9764o = z10;
    }

    protected final boolean r(List<ka.c> list) {
        int i10;
        int i11 = this.f9755f - 1;
        int i12 = this.f9756g - 1;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ka.c cVar = list.get(i13);
            int i14 = cVar.f14865c;
            if (i14 == 0 || (i10 = cVar.f14866d) == 0 || i14 == i11 || i10 == i12) {
                return true;
            }
        }
        return false;
    }
}
