package h3;

import java.util.List;
/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a */
    protected int f11236a;

    /* renamed from: b */
    protected double f11237b;

    /* renamed from: c */
    protected x3.b f11238c;

    /* renamed from: d */
    protected int f11239d;

    /* renamed from: e */
    protected List<ka.c> f11240e;

    /* renamed from: f */
    protected ja.c f11241f = new ja.c();

    /* renamed from: g */
    protected ka.b f11242g = new ka.b();

    /* renamed from: h */
    protected ok.g f11243h = new ok.g();

    /* renamed from: i */
    ok.g f11244i = new ok.g();

    /* renamed from: j */
    protected ok.d f11245j = new ok.d();

    /* renamed from: k */
    protected int f11246k = Integer.MAX_VALUE;

    public e(double d10, x3.b bVar, int i10) {
        e(d10);
        this.f11238c = bVar;
        d(i10);
    }

    protected abstract boolean a(List<ka.c> list);

    public boolean b(List<ka.c> list, ok.g gVar) {
        this.f11240e = list;
        this.f11239d = this.f11238c.e(list.size());
        this.f11243h.h();
        boolean a10 = a(list);
        this.f11240e = null;
        gVar.k(this.f11243h);
        return a10;
    }

    public void c(int i10) {
        this.f11246k = i10;
    }

    public void d(int i10) {
        this.f11236a = i10;
    }

    public void e(double d10) {
        this.f11237b = d10 * d10;
    }

    public double f(ka.c cVar, ka.c cVar2) {
        return Math.max(2.0d, cVar.c(cVar2) * this.f11237b);
    }
}
