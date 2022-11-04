package g2;

import c4.q;
import h2.d;
import h2.h;
import java.util.List;
import p2.e;
import p2.g;
import p2.r;
import p2.x;
import p2.z;
import v3.c;
/* loaded from: classes.dex */
public class a<T extends q<T>> {

    /* renamed from: a */
    x<T> f10345a;

    /* renamed from: c */
    r<T> f10347c;

    /* renamed from: d */
    h<T> f10348d;

    /* renamed from: e */
    Class<T> f10349e;

    /* renamed from: f */
    d f10350f;

    /* renamed from: b */
    z f10346b = new z();

    /* renamed from: g */
    boolean f10351g = false;

    /* renamed from: h */
    protected c f10352h = new c(0.8d);

    /* renamed from: i */
    protected c f10353i = new c(0.8d);

    public a(h<T> hVar, x<T> xVar, String str, String str2, boolean z10, Class<T> cls) {
        this.f10348d = hVar;
        this.f10345a = xVar;
        this.f10347c = new r<>(str, str2, cls);
        this.f10349e = cls;
        this.f10350f = new d(xVar.f().a().f(), z10);
    }

    public r<T> a() {
        return this.f10347c;
    }

    public List<g> b() {
        return this.f10347c.h();
    }

    public z c() {
        return this.f10346b;
    }

    public void d(T t10) {
        long nanoTime = System.nanoTime();
        this.f10350f.b(t10.f6220q, t10.f6221x);
        this.f10348d.a(t10, this.f10350f.c());
        this.f10352h.d((System.nanoTime() - nanoTime) * 1.0E-6d);
        if (this.f10351g) {
            System.out.printf("qrcode: binary %5.2f ", Double.valueOf(this.f10352h.a()));
        }
        this.f10345a.g(t10, this.f10350f.a());
        List<e> t11 = this.f10345a.d().t();
        this.f10346b.b(t11);
        if (this.f10351g) {
            f3.g<T> a10 = this.f10345a.f().a();
            System.out.printf(" contour %5.1f shapes %5.1f adjust_bias %5.2f PosPat %6.2f", Double.valueOf(a10.i()), Double.valueOf(a10.j()), Double.valueOf(this.f10345a.f().c()), Double.valueOf(this.f10345a.e().a()));
        }
        long nanoTime2 = System.nanoTime();
        this.f10347c.i(t11, t10);
        this.f10353i.d((System.nanoTime() - nanoTime2) * 1.0E-6d);
        if (this.f10351g) {
            System.out.printf(" decoding %5.1f\n", Double.valueOf(this.f10353i.a()));
        }
    }
}
