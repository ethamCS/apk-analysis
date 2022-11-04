package f3;

import c4.q;
import f3.g;
import java.util.List;
/* loaded from: classes.dex */
public class d<T extends q<T>> {

    /* renamed from: a */
    g<T> f9739a;

    /* renamed from: b */
    b f9740b;

    /* renamed from: c */
    private final j f9741c;

    /* renamed from: d */
    private final k<T> f9742d;

    /* renamed from: e */
    private final e3.b<T> f9743e;

    /* renamed from: g */
    a f9745g;

    /* renamed from: h */
    double f9746h;

    /* renamed from: f */
    private final la.a f9744f = new la.a();

    /* renamed from: i */
    v3.c f9747i = new v3.c(0.8d);

    /* loaded from: classes.dex */
    public interface a {
        void a(g.a aVar, boolean z10);
    }

    public d(g<T> gVar, j jVar, k<T> kVar, double d10, boolean z10) {
        this.f9739a = gVar;
        this.f9741c = jVar;
        this.f9742d = kVar;
        this.f9746h = d10;
        if (z10) {
            this.f9740b = new b();
        }
        this.f9743e = new e3.b<>(1.0d, 1.5d, 15, gVar.h());
    }

    public g<T> a() {
        return this.f9739a;
    }

    public Class<T> b() {
        return this.f9739a.h();
    }

    public double c() {
        return this.f9747i.a();
    }

    public int d() {
        return this.f9739a.k();
    }

    public List<g.a> e() {
        return this.f9739a.g().t();
    }

    public void f(T t10, c4.l lVar) {
        this.f9739a.m(t10, lVar);
        k<T> kVar = this.f9742d;
        if (kVar != null) {
            kVar.b(t10);
        }
        this.f9743e.d(t10);
        long nanoTime = System.nanoTime();
        ok.b<g.a> g10 = this.f9739a.g();
        if (this.f9740b != null) {
            int d10 = d();
            for (int g11 = g10.g() - 1; g11 >= 0; g11--) {
                la.a aVar = g10.c(g11).f9781f;
                this.f9740b.a(aVar, this.f9739a.l());
                if (aVar.f() < d10) {
                    g10.k(g11);
                }
            }
        }
        this.f9747i.d((System.nanoTime() - nanoTime) * 1.0E-6d);
    }

    public boolean g(g.a aVar) {
        boolean z10 = false;
        if (this.f9743e.a(aVar.f9781f, !this.f9739a.l())) {
            double c10 = this.f9743e.c() - this.f9743e.b();
            if (this.f9741c != null) {
                this.f9741c.a(this.f9739a.e(aVar), aVar.f9783h, this.f9744f);
                b bVar = this.f9740b;
                if (bVar != null) {
                    bVar.a(this.f9744f, this.f9739a.l());
                }
                if (this.f9743e.a(this.f9744f, !this.f9739a.l())) {
                    double c11 = this.f9743e.c() - this.f9743e.b();
                    if (c11 > c10) {
                        aVar.f9777b = this.f9743e.b();
                        aVar.f9778c = this.f9743e.c();
                        aVar.f9781f.e(this.f9744f);
                        z10 = true;
                        c10 = c11;
                    }
                }
            }
            a aVar2 = this.f9745g;
            if (aVar2 != null) {
                aVar2.a(aVar, this.f9739a.l());
            }
            if (this.f9742d != null) {
                this.f9744f.f15915c.s(aVar.f9781f.f());
                if (this.f9742d.a(aVar.f9781f, this.f9744f) && this.f9743e.a(this.f9744f, !this.f9739a.l()) && (this.f9743e.c() - this.f9743e.b()) * 1.5d > c10) {
                    aVar.f9777b = this.f9743e.b();
                    aVar.f9778c = this.f9743e.c();
                    aVar.f9781f.e(this.f9744f);
                    return true;
                }
            }
            return z10;
        }
        return false;
    }
}
