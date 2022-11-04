package e3;

import c4.q;
/* loaded from: classes.dex */
public class b<T extends q<T>> {

    /* renamed from: a */
    private double f9353a;

    /* renamed from: b */
    private double f9354b;

    /* renamed from: c */
    private final ka.b f9355c = new ka.b();

    /* renamed from: d */
    private final ka.b f9356d = new ka.b();

    /* renamed from: e */
    private double f9357e;

    /* renamed from: f */
    private double f9358f;

    /* renamed from: g */
    c<T> f9359g;

    public b(double d10, double d11, int i10, Class<T> cls) {
        this.f9353a = d10;
        this.f9354b = d11;
        this.f9359g = new c<>(i10, cls);
    }

    public boolean a(la.a aVar, boolean z10) {
        double d10;
        this.f9357e = 0.0d;
        this.f9358f = 0.0d;
        double d11 = z10 ? 1.0d : -1.0d;
        int f10 = aVar.f() - 1;
        int i10 = 0;
        for (int i11 = 0; i11 < aVar.f(); i11++) {
            ka.b b10 = aVar.b(f10);
            ka.b b11 = aVar.b(i11);
            double d12 = b11.f10622c - b10.f10622c;
            double d13 = b11.f10623d - b10.f10623d;
            double sqrt = Math.sqrt((d12 * d12) + (d13 * d13));
            double d14 = d12 / sqrt;
            double d15 = d13 / sqrt;
            double d16 = this.f9353a;
            if (sqrt < 3.0d * d16) {
                this.f9355c.k(b10);
                this.f9356d.k(b11);
                d10 = d11;
            } else {
                ka.b bVar = this.f9355c;
                d10 = d11;
                bVar.f10622c = b10.f10622c + (d16 * d14);
                bVar.f10623d = b10.f10623d + (d16 * d15);
                ka.b bVar2 = this.f9356d;
                bVar2.f10622c = b11.f10622c - (d16 * d14);
                bVar2.f10623d = b11.f10623d - (d16 * d15);
            }
            double d17 = this.f9354b;
            this.f9359g.b(this.f9355c, this.f9356d, (-d15) * d17 * d10, d14 * d17 * d10);
            if (this.f9359g.e() > 0) {
                i10++;
                this.f9357e += this.f9359g.d() / this.f9354b;
                this.f9358f += this.f9359g.c() / this.f9354b;
            }
            f10 = i11;
            d11 = d10;
        }
        if (i10 <= 0) {
            this.f9358f = 0.0d;
            this.f9357e = 0.0d;
            return false;
        }
        double d18 = i10;
        this.f9357e /= d18;
        this.f9358f /= d18;
        return true;
    }

    public double b() {
        return this.f9357e;
    }

    public double c() {
        return this.f9358f;
    }

    public void d(T t10) {
        this.f9359g.a(t10);
    }
}
