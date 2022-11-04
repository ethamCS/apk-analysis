package e3;

import c4.q;
/* loaded from: classes.dex */
public class c<T extends q<T>> extends a<T> {

    /* renamed from: d */
    int f9360d;

    /* renamed from: e */
    int f9361e;

    /* renamed from: f */
    double f9362f;

    /* renamed from: g */
    double f9363g;

    public c(int i10, Class<T> cls) {
        super(cls);
        this.f9360d = i10;
    }

    @Override // e3.a
    public void a(T t10) {
        this.f9352c.c(t10);
        this.f9351b.c(this.f9352c);
    }

    public double b(ka.b bVar, ka.b bVar2, double d10, double d11) {
        int i10;
        int i11 = 0;
        this.f9361e = 0;
        this.f9363g = 0.0d;
        this.f9362f = 0.0d;
        while (true) {
            if (i11 >= this.f9360d) {
                break;
            }
            double d12 = bVar2.f10622c;
            double d13 = bVar.f10622c;
            double d14 = i11;
            double d15 = (((d12 - d13) * d14) / (i10 - 1)) + d13;
            double d16 = bVar2.f10623d;
            double d17 = bVar.f10623d;
            double d18 = (((d16 - d17) * d14) / (i10 - 1)) + d17;
            double d19 = d15 + d10;
            double d20 = d18 + d11;
            if (v3.a.e(this.f9352c.d(), this.f9352c.a(), d19, d20)) {
                double d21 = d15 - d10;
                double d22 = d18 - d11;
                if (v3.a.e(this.f9352c.d(), this.f9352c.a(), d21, d22)) {
                    this.f9361e++;
                    double a10 = this.f9351b.a(d15, d18, d19, d20);
                    double a11 = this.f9351b.a(d15, d18, d21, d22);
                    this.f9362f += a10;
                    this.f9363g += a11;
                }
            }
            i11++;
        }
        int i12 = this.f9361e;
        if (i12 == 0) {
            return 0.0d;
        }
        double d23 = this.f9362f / i12;
        this.f9362f = d23;
        double d24 = this.f9363g / i12;
        this.f9363g = d24;
        return d23 - d24;
    }

    public double c() {
        return this.f9363g;
    }

    public double d() {
        return this.f9362f;
    }

    public int e() {
        return this.f9361e;
    }
}
