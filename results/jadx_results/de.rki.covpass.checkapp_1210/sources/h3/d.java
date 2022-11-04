package h3;

import java.util.List;
import java.util.Objects;
import ok.j;
/* loaded from: classes.dex */
public class d {

    /* renamed from: s */
    private a f11220s;

    /* renamed from: t */
    private boolean f11221t;

    /* renamed from: a */
    private boolean f11202a = true;

    /* renamed from: b */
    private boolean f11203b = false;

    /* renamed from: c */
    private int f11204c = Integer.MAX_VALUE;

    /* renamed from: d */
    private int f11205d = 3;

    /* renamed from: e */
    private int f11206e = 10;

    /* renamed from: f */
    private x3.b f11207f = x3.b.i(1.0d, 0.0d);

    /* renamed from: g */
    private double f11208g = 0.25d;

    /* renamed from: h */
    private double f11209h = 0.0d;

    /* renamed from: i */
    int f11210i = 50;

    /* renamed from: j */
    double f11211j = 2.5d;

    /* renamed from: k */
    x3.b f11212k = x3.b.i(0.1d, 3.0d);

    /* renamed from: l */
    private final ja.e f11213l = new ja.e();

    /* renamed from: m */
    j<b> f11214m = new j<>();

    /* renamed from: n */
    ok.b<b> f11215n = new ok.b<>(h3.c.f11201a);

    /* renamed from: o */
    private h f11216o = new h3.a();

    /* renamed from: p */
    private final C0166d f11217p = new C0166d();

    /* renamed from: q */
    private final C0166d f11218q = new C0166d();

    /* renamed from: r */
    private final ok.b<a> f11219r = new ok.b<>(h3.b.f11200a);

    /* renamed from: u */
    c f11222u = new c();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: b */
        public double f11224b;

        /* renamed from: c */
        public double f11225c;

        /* renamed from: a */
        public ok.g f11223a = new ok.g();

        /* renamed from: d */
        public ok.f f11226d = new ok.f();

        public void a() {
            this.f11223a.h();
            this.f11226d.d();
            this.f11224b = Double.NaN;
            this.f11225c = Double.NaN;
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public int f11227a;

        /* renamed from: b */
        public double f11228b;

        /* renamed from: c */
        public int f11229c;

        /* renamed from: d */
        public double f11230d;

        /* renamed from: e */
        public double f11231e;

        /* renamed from: f */
        public boolean f11232f;

        public void a() {
            this.f11227a = -1;
            this.f11228b = -1.0d;
            this.f11229c = -1;
            this.f11231e = -1.0d;
            this.f11230d = -1.0d;
            this.f11232f = true;
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        public double f11233a;

        c() {
        }
    }

    /* renamed from: h3.d$d */
    /* loaded from: classes.dex */
    public static class C0166d {

        /* renamed from: a */
        public int f11234a;

        /* renamed from: b */
        public double f11235b;

        C0166d() {
        }
    }

    private void C(List<ka.c> list, boolean z10) {
        j.a<b> A;
        int i10 = this.f11204c;
        int e10 = i10 + this.f11207f.e(i10);
        if (e10 <= 0) {
            e10 = list.size();
        }
        while (this.f11214m.h() < e10 && !this.f11221t && o(list, z10)) {
        }
        while (!this.f11221t && (A = A(list, this.f11222u, z10)) != null) {
            x(A, this.f11222u.f11233a);
        }
    }

    public static void b(List<ka.c> list, int i10, int i11, ja.c cVar) {
        ka.c cVar2 = list.get(i10);
        ka.c cVar3 = list.get(i11);
        ka.b bVar = cVar.f14236c;
        int i12 = cVar2.f14865c;
        bVar.f10622c = i12;
        int i13 = cVar2.f14866d;
        bVar.f10623d = i13;
        ka.e eVar = cVar.f14237d;
        eVar.f10622c = cVar3.f14865c - i12;
        eVar.f10623d = cVar3.f14866d - i13;
    }

    public static void c(List<ka.c> list, int i10, int i11, ja.e eVar) {
        ka.c cVar = list.get(i10);
        ka.c cVar2 = list.get(i11);
        eVar.f14240c.i(cVar.f14865c, cVar.f14866d);
        eVar.f14241d.i(cVar2.f14865c, cVar2.f14866d);
    }

    static double f(j<b> jVar, double d10, boolean z10) {
        j.a<b> b10 = z10 ? null : jVar.b();
        double d11 = 0.0d;
        for (j.a a10 = jVar.a(); a10 != b10; a10 = a10.f18619a) {
            d11 += ((b) a10.f18621c).f11228b;
        }
        int h10 = jVar.h();
        if (!z10) {
            h10--;
        }
        double d12 = h10;
        return (d11 / d12) + (d10 * d12);
    }

    static double h(ka.c cVar, ka.c cVar2) {
        return Math.abs(cVar2.f14865c - cVar.f14865c) + Math.abs(cVar2.f14866d - cVar.f14866d);
    }

    static double i(ka.c cVar, ka.c cVar2) {
        double d10 = cVar2.f14865c - cVar.f14865c;
        double d11 = cVar2.f14866d - cVar.f14866d;
        return (d10 * d10) + (d11 * d11);
    }

    static int k(List<ka.c> list) {
        ka.c cVar = list.get(0);
        int i10 = -1;
        double d10 = -1.7976931348623157E308d;
        for (int i11 = 1; i11 < list.size(); i11++) {
            double i12 = i(cVar, list.get(i11));
            if (i12 > d10) {
                i10 = i11;
                d10 = i12;
            }
        }
        return i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean p(List<ka.c> list, boolean z10) {
        j.a<b> a10 = this.f11214m.a();
        j.a<b> b10 = z10 ? null : this.f11214m.b();
        while (a10 != b10) {
            if (this.f11203b && !s(list, a10)) {
                return false;
            }
            j.a<b> aVar = a10.f18619a;
            a10.f18621c.f11228b = g(list, a10.f18621c.f11227a, (aVar == null ? this.f11214m.a().f18621c : aVar.f18621c).f11227a);
            a10 = aVar;
        }
        j.a a11 = this.f11214m.a();
        while (true) {
            boolean z11 = true;
            if (a11 != b10) {
                if (this.f11214m.h() >= this.f11205d) {
                    z11 = false;
                }
                e(list, a11, z11);
                a11 = a11.f18619a;
            } else {
                return true;
            }
        }
    }

    static boolean q(List<ka.c> list, int i10, int i11) {
        int sqrt = (int) ((Math.sqrt(i(list.get(i10), list.get(i11))) * 4.141592653589793d) + 0.5d);
        return v3.b.b(i10, i11, list.size()) <= sqrt && v3.b.b(i11, i10, list.size()) <= sqrt;
    }

    static int t(List<ka.c> list, int i10, int i11) {
        ka.c cVar = list.get(i10);
        ka.c cVar2 = list.get(i11);
        int i12 = -1;
        double d10 = -1.7976931348623157E308d;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ka.c cVar3 = list.get(i13);
            double h10 = h(cVar, cVar3) + h(cVar2, cVar3);
            if (h10 > d10) {
                i12 = i13;
                d10 = h10;
            }
        }
        return i12;
    }

    private void y() {
        this.f11214m.g();
        this.f11215n.r();
        this.f11219r.r();
        this.f11220s = null;
        this.f11221t = false;
    }

    j.a<b> A(List<ka.c> list, c cVar, boolean z10) {
        j.a<b> aVar;
        j.a<b> aVar2;
        j.a<b> aVar3 = null;
        if (this.f11214m.h() <= 3) {
            return null;
        }
        if (z10) {
            aVar2 = null;
            aVar = this.f11214m.a();
        } else {
            j.a<b> aVar4 = this.f11214m.a().f18619a;
            aVar2 = this.f11214m.b();
            aVar = aVar4;
        }
        double d10 = -1.7976931348623157E308d;
        for (j.a<b> aVar5 = aVar; aVar5 != aVar2; aVar5 = aVar5.f18619a) {
            j.a<b> v10 = v(aVar5);
            j.a<b> u10 = u(aVar5);
            b bVar = v10.f18621c;
            double g10 = g(list, bVar.f11227a, u10.f18621c.f11227a);
            double d11 = (((bVar.f11228b + aVar5.f18621c.f11228b) / 2.0d) + this.f11208g) - g10;
            if (d11 > d10) {
                cVar.f11233a = g10;
                aVar3 = aVar5;
                d10 = d11;
            }
        }
        Objects.requireNonNull(aVar3);
        return aVar3;
    }

    j.a<b> B(boolean z10) {
        double d10 = this.f11203b ? 0.0d : -1.7976931348623157E308d;
        j.a aVar = null;
        j.a b10 = z10 ? null : this.f11214m.b();
        for (j.a a10 = this.f11214m.a(); a10 != b10; a10 = a10.f18619a) {
            b bVar = (b) a10.f18621c;
            if (bVar.f11232f) {
                double d11 = ((bVar.f11228b * 2.0d) - bVar.f11230d) - bVar.f11231e;
                if (d11 < 0.0d) {
                    d11 = -d11;
                }
                if (d11 > d10) {
                    aVar = a10;
                    d10 = d11;
                }
            }
        }
        return aVar;
    }

    public void D(boolean z10) {
        this.f11203b = z10;
    }

    public void E(double d10) {
        this.f11211j = d10;
    }

    public void F(double d10) {
        this.f11208g = d10;
    }

    public void G(x3.b bVar) {
        this.f11207f = bVar;
    }

    public void H(boolean z10) {
        this.f11202a = z10;
    }

    public void I(int i10) {
        this.f11210i = i10;
    }

    public void J(x3.b bVar) {
        this.f11212k = bVar;
    }

    public void K(int i10) {
        this.f11204c = i10;
    }

    public void L(int i10) {
        this.f11205d = i10;
    }

    public void M(int i10) {
        if (i10 > 0) {
            this.f11206e = i10;
            return;
        }
        throw new IllegalArgumentException("Minimum length must be at least 1");
    }

    void N(List<ka.c> list, j.a<b> aVar, j.a<b> aVar2) {
        this.f11216o.b(list, v3.b.d(aVar.f18621c.f11227a, this.f11206e, list.size()), v3.b.c(aVar2.f18621c.f11227a, this.f11206e, list.size()), this.f11217p);
        if (this.f11203b && da.g.b(list.get(aVar.f18621c.f11227a), list.get(this.f11217p.f11234a), list.get(u(aVar).f18621c.f11227a))) {
            aVar.f18621c.f11232f = false;
            return;
        }
        int b10 = v3.b.b(aVar.f18621c.f11227a, this.f11217p.f11234a, list.size());
        if (b10 < this.f11206e || list.size() - b10 < this.f11206e) {
            throw new RuntimeException("Should be impossible");
        }
        b bVar = aVar.f18621c;
        int i10 = this.f11217p.f11234a;
        bVar.f11229c = i10;
        bVar.f11230d = g(list, bVar.f11227a, i10);
        aVar.f18621c.f11231e = g(list, this.f11217p.f11234a, aVar2.f18621c.f11227a);
        if (aVar.f18621c.f11229c >= list.size()) {
            throw new RuntimeException("Egads");
        }
    }

    public void O(double d10) {
        this.f11209h = d10;
    }

    j.a<b> a(int i10) {
        b i11 = this.f11215n.i();
        i11.a();
        i11.f11227a = i10;
        this.f11214m.d(i11);
        return this.f11214m.b();
    }

    boolean d(List<ka.c> list, j.a<b> aVar, boolean z10) {
        if (v3.b.b(aVar.f18621c.f11227a, u(aVar).f18621c.f11227a, list.size()) <= this.f11206e * 2) {
            return false;
        }
        return z10 || aVar.f18621c.f11228b > this.f11209h;
    }

    void e(List<ka.c> list, j.a<b> aVar, boolean z10) {
        j.a<b> u10 = u(aVar);
        aVar.f18621c.f11232f = d(list, aVar, z10);
        if (aVar.f18621c.f11232f) {
            N(list, aVar, u10);
        }
    }

    double g(List<ka.c> list, int i10, int i11) {
        double d10;
        int i12;
        c(list, i10, i11, this.f11213l);
        int i13 = 0;
        if (i11 >= i10) {
            int i14 = (i11 - i10) - 1;
            i12 = Math.min(i14, this.f11210i);
            double d11 = 0.0d;
            while (i13 < i12) {
                ka.c cVar = list.get(i10 + 1 + ((i14 * i13) / i12));
                d11 += ea.c.c(this.f11213l, cVar.f14865c, cVar.f14866d);
                i13++;
            }
            d10 = d11 / i12;
        } else {
            int size = ((list.size() - i10) - 1) + i11;
            int min = Math.min(size, this.f11210i);
            double d12 = 0.0d;
            while (i13 < min) {
                ka.c cVar2 = list.get(((i10 + 1) + ((size * i13) / min)) % list.size());
                d12 += ea.c.c(this.f11213l, cVar2.f14865c, cVar2.f14866d);
                i13++;
            }
            d10 = d12 / min;
            i12 = min;
        }
        if (i12 > 0) {
            return d10;
        }
        return 0.0d;
    }

    void j(List<ka.c> list) {
        j.a<b> a10 = this.f11214m.a();
        b bVar = a10.f18621c;
        j.a<b> aVar = a10.f18619a;
        b bVar2 = aVar.f18621c;
        b bVar3 = aVar.f18619a.f18621c;
        if (v3.b.b(bVar.f11227a, bVar2.f11227a, list.size()) > v3.b.b(bVar.f11227a, bVar3.f11227a, list.size())) {
            this.f11214m.g();
            this.f11214m.d(bVar);
            this.f11214m.d(bVar3);
            this.f11214m.d(bVar2);
        }
    }

    boolean l(List<ka.c> list) {
        int k10 = k(list);
        if (!this.f11203b || q(list, 0, k10)) {
            this.f11216o.b(list, 0, k10, this.f11217p);
            this.f11216o.b(list, k10, 0, this.f11218q);
            if (this.f11216o.a(this.f11217p.f11235b, this.f11218q.f11235b) >= 0) {
                a(this.f11217p.f11234a);
            } else {
                a(k10);
                k10 = this.f11218q.f11234a;
            }
            a(k10);
            a(t(list, this.f11214m.a().f18621c.f11227a, this.f11214m.a().f18619a.f18621c.f11227a));
            j(list);
            return p(list, true);
        }
        return false;
    }

    public a m() {
        return this.f11220s;
    }

    public int n() {
        return this.f11205d;
    }

    boolean o(List<ka.c> list, boolean z10) {
        j.a<b> B = B(z10);
        boolean z11 = false;
        if (B == null) {
            return false;
        }
        b bVar = B.f18621c;
        bVar.f11228b = bVar.f11230d;
        b i10 = this.f11215n.i();
        i10.a();
        b bVar2 = B.f18621c;
        i10.f11227a = bVar2.f11229c;
        i10.f11228b = bVar2.f11231e;
        j.a<b> c10 = this.f11214m.c(B, i10);
        if (this.f11203b && !s(list, B)) {
            return false;
        }
        e(list, c10, this.f11214m.h() < this.f11205d);
        if (this.f11214m.h() < this.f11205d) {
            z11 = true;
        }
        e(list, B, z11);
        z();
        return true;
    }

    public boolean r() {
        return this.f11202a;
    }

    boolean s(List<ka.c> list, j.a<b> aVar) {
        j.a<b> u10 = u(aVar);
        return ((double) v3.b.b(aVar.f18621c.f11227a, u10.f18621c.f11227a, list.size())) < list.get(aVar.f18621c.f11227a).b(list.get(u10.f18621c.f11227a)) * this.f11211j;
    }

    j.a<b> u(j.a<b> aVar) {
        j.a<b> aVar2 = aVar.f18619a;
        return aVar2 == null ? this.f11214m.a() : aVar2;
    }

    j.a<b> v(j.a<b> aVar) {
        j.a<b> aVar2 = aVar.f18620b;
        return aVar2 == null ? this.f11214m.b() : aVar2;
    }

    public boolean w(List<ka.c> list) {
        y();
        int i10 = 3;
        if (this.f11202a) {
            if (list.size() < 3 || !l(list)) {
                return false;
            }
        } else if (list.size() < 2) {
            return false;
        } else {
            a(0);
            a(list.size() - 1);
            p(list, false);
        }
        z();
        C(list, this.f11202a);
        if (this.f11221t) {
            return false;
        }
        if (!this.f11202a) {
            i10 = 2;
        }
        double d10 = Double.MAX_VALUE;
        int i11 = -1;
        for (int i12 = 0; i12 < Math.min(this.f11204c - (i10 - 1), this.f11219r.f18623d); i12++) {
            if (this.f11219r.c(i12).f11224b < d10) {
                a c10 = this.f11219r.c(i12);
                this.f11220s = c10;
                d10 = c10.f11224b;
                i11 = i12 + i10;
            }
        }
        if (i11 < this.f11205d || this.f11220s == null) {
            return false;
        }
        int i13 = i11 - 1;
        for (int i14 = 0; i14 < i11; i14++) {
            double c11 = this.f11212k.c(list.get(this.f11220s.f11223a.d(i14)).b(list.get(this.f11220s.f11223a.d(i13))));
            if (this.f11220s.f11226d.b(i14) >= c11 * c11) {
                this.f11220s = null;
                return false;
            }
            i13 = i14;
        }
        return true;
    }

    boolean x(j.a<b> aVar, double d10) {
        v(aVar).f18621c.f11228b = d10;
        this.f11214m.e(aVar);
        return z();
    }

    boolean z() {
        a aVar;
        int i10 = this.f11202a ? 3 : 2;
        int h10 = this.f11214m.h();
        ok.b<a> bVar = this.f11219r;
        if (h10 <= (bVar.f18623d + i10) - 1) {
            aVar = bVar.c(this.f11214m.h() - i10);
            if (aVar.f11223a.f18610b != this.f11214m.h()) {
                throw new RuntimeException("Egads saved polylines aren't in the expected order");
            }
        } else {
            aVar = bVar.i();
            aVar.a();
            aVar.f11224b = Double.MAX_VALUE;
        }
        double f10 = f(this.f11214m, this.f11208g, this.f11202a);
        if (aVar.f11224b > f10) {
            aVar.f11224b = f10;
            aVar.f11223a.h();
            aVar.f11226d.d();
            double d10 = 0.0d;
            for (j.a a10 = this.f11214m.a(); a10 != null; a10 = a10.f18619a) {
                d10 = Math.max(d10, ((b) a10.f18621c).f11228b);
                aVar.f11223a.a(((b) a10.f18621c).f11227a);
                aVar.f11226d.a(((b) a10.f18621c).f11228b);
            }
            aVar.f11225c = d10;
            return true;
        }
        return false;
    }
}
