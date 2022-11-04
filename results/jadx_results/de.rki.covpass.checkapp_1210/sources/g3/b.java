package g3;

import java.util.List;
import ok.g;
/* loaded from: classes.dex */
public class b {

    /* renamed from: a */
    double f10367a;

    /* renamed from: d */
    List<ka.c> f10370d;

    /* renamed from: b */
    ja.c f10368b = new ja.c();

    /* renamed from: c */
    ka.b f10369c = new ka.b();

    /* renamed from: e */
    double[] f10371e = new double[1];

    /* renamed from: f */
    g f10372f = new g();

    /* renamed from: g */
    g f10373g = new g();

    /* renamed from: h */
    g f10374h = new g();

    public b(double d10) {
        this.f10367a = d10;
    }

    protected int a(int i10, int i11) {
        return v3.b.b(i10, i11, this.f10370d.size());
    }

    protected double b(g gVar, int i10, int i11) {
        int i12;
        int i13;
        int d10 = gVar.d(i10);
        int d11 = gVar.d(i11);
        if (d10 == d11) {
            return 100000.0d;
        }
        ka.c cVar = this.f10370d.get(d10);
        ka.c cVar2 = this.f10370d.get(d11);
        ja.c cVar3 = this.f10368b;
        ka.b bVar = cVar3.f14236c;
        bVar.f10622c = cVar.f14865c;
        bVar.f10623d = cVar.f14866d;
        cVar3.f14237d.i(cVar2.f14865c - i12, cVar2.f14866d - i13);
        double d12 = 0.0d;
        int a10 = a(d10, d11);
        for (int i14 = 1; i14 < a10; i14++) {
            ka.c d13 = d(d10 + 1 + i14);
            this.f10369c.i(d13.f14865c, d13.f14866d);
            d12 += ea.c.b(this.f10368b, this.f10369c);
        }
        return (d12 + this.f10367a) / cVar.c(cVar2);
    }

    void c(g gVar) {
        if (this.f10371e.length < gVar.l()) {
            this.f10371e = new double[gVar.l()];
        }
        int l10 = gVar.l() - 1;
        for (int i10 = 0; i10 < gVar.l(); i10++) {
            this.f10371e[l10] = b(gVar, l10, i10);
            l10 = i10;
        }
    }

    protected ka.c d(int i10) {
        List<ka.c> list = this.f10370d;
        return list.get(i10 % list.size());
    }

    public boolean e(List<ka.c> list, g gVar, g gVar2) {
        this.f10370d = list;
        gVar2.k(gVar);
        f(gVar2);
        int i10 = 3;
        if (gVar2.l() <= 3) {
            return false;
        }
        c(gVar2);
        double d10 = 0.0d;
        for (int i11 = 0; i11 < gVar2.l(); i11++) {
            d10 += this.f10371e[i11];
        }
        a aVar = new a();
        aVar.g(list);
        int i12 = 1;
        boolean z10 = false;
        while (gVar2.l() > i10) {
            this.f10372f.h();
            int i13 = 0;
            boolean z11 = false;
            while (i13 < gVar2.l()) {
                this.f10373g.h();
                for (int i14 = 0; i14 < gVar2.l(); i14++) {
                    if (i13 != i14) {
                        this.f10373g.a(gVar2.d(i14));
                    }
                }
                f(this.f10373g);
                if (this.f10373g.l() > i10 && aVar.b(v3.b.a(i13, -2, this.f10373g.l()), v3.b.a(i13, i12, this.f10373g.l()), this.f10373g, this.f10374h)) {
                    int l10 = this.f10374h.l() - i12;
                    double d11 = 0.0d;
                    for (int i15 = 0; i15 < this.f10374h.l(); i15++) {
                        d11 += b(this.f10374h, l10, i15);
                        l10 = i15;
                    }
                    if (d11 < d10) {
                        this.f10372f.h();
                        this.f10372f.b(this.f10374h);
                        d10 = d11;
                        z11 = true;
                    }
                }
                i13++;
                i12 = 1;
                i10 = 3;
            }
            if (!z11) {
                break;
            }
            gVar2.k(this.f10372f);
            i12 = 1;
            i10 = 3;
            z10 = true;
        }
        return z10;
    }

    void f(g gVar) {
        for (int i10 = 0; i10 < gVar.l(); i10++) {
            ka.c cVar = this.f10370d.get(gVar.d(i10));
            for (int l10 = gVar.l() - 1; l10 > i10; l10--) {
                ka.c cVar2 = this.f10370d.get(gVar.d(l10));
                if (cVar.f14865c == cVar2.f14865c && cVar.f14866d == cVar2.f14866d) {
                    gVar.f(l10);
                }
            }
        }
    }
}
