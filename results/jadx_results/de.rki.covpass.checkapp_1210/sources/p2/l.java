package p2;

import java.util.ArrayList;
import java.util.List;
import p2.g;
/* loaded from: classes.dex */
public class l {

    /* renamed from: a */
    final hk.a<ia.b, b4.b> f18807a = new z2.a(true);

    /* renamed from: b */
    final y2.b f18808b = new y2.b(true);

    /* renamed from: c */
    final ok.b<b4.b> f18809c = new ok.b<>(k.f18806a);

    /* renamed from: d */
    final ok.b<b4.a> f18810d = new ok.b<>(j.f18805a);

    /* renamed from: e */
    final List<b4.b> f18811e = new ArrayList();

    /* renamed from: f */
    final ok.b<ka.b> f18812f = new ok.b<>(e3.d.f9364a);

    /* renamed from: g */
    final ia.b f18813g = new ia.b();

    /* renamed from: h */
    public final ia.b f18814h = new ia.b();

    /* renamed from: i */
    final ia.a f18815i = new ia.a();

    /* renamed from: j */
    final ia.a f18816j = new ia.a();

    /* renamed from: k */
    final ka.b f18817k = new ka.b();

    /* renamed from: l */
    boolean f18818l;

    private void g(float f10, float f11, la.a aVar, int i10) {
        b4.b i11 = this.f18809c.i();
        ka.b b10 = aVar.b(i10);
        i11.a(b10.f10622c, b10.f10623d, f11, f10);
        this.f18811e.add(i11);
    }

    private void h(float f10, float f11, float f12, float f13, la.a aVar, int i10, la.a aVar2, int i11) {
        b4.a i12 = this.f18810d.i();
        ka.b b10 = aVar.b(i10);
        ka.b b11 = aVar2.b(i11);
        i12.a(b11.f10622c - b10.f10622c, b11.f10623d - b10.f10623d, 0.0d, f13 - f11, f12 - f10, 0.0d);
        ka.d dVar = i12.f5450a;
        dVar.c(dVar.e());
        ka.d dVar2 = i12.f5451b;
        dVar2.c(dVar2.e());
    }

    public void a(g gVar) {
        int i10 = 0;
        this.f18818l = false;
        this.f18809c.r();
        this.f18811e.clear();
        int c10 = gVar.c();
        g(0.0f, 0.0f, gVar.f18752d, 0);
        g(0.0f, 7.0f, gVar.f18752d, 1);
        g(7.0f, 7.0f, gVar.f18752d, 2);
        g(7.0f, 0.0f, gVar.f18752d, 3);
        float f10 = c10 - 7;
        g(0.0f, f10, gVar.f18750c, 0);
        float f11 = c10;
        g(0.0f, f11, gVar.f18750c, 1);
        g(7.0f, f11, gVar.f18750c, 2);
        g(7.0f, f10, gVar.f18750c, 3);
        g(f10, 0.0f, gVar.f18760q, 0);
        g(f10, 7.0f, gVar.f18760q, 1);
        g(f11, 7.0f, gVar.f18760q, 2);
        g(f11, 0.0f, gVar.f18760q, 3);
        while (true) {
            ok.b<g.a> bVar = gVar.Z3;
            if (i10 < bVar.f18623d) {
                g.a c11 = bVar.c(i10);
                b4.b i11 = this.f18809c.i();
                ka.b bVar2 = c11.f18763a;
                i11.a(bVar2.f10622c, bVar2.f10623d, c11.f18764b + 0.5f, c11.f18765c + 0.5f);
                this.f18811e.add(i11);
                i10++;
            } else {
                return;
            }
        }
    }

    public void b() {
        this.f18807a.a(this.f18811e, this.f18813g);
        this.f18813g.f(this.f18814h);
        ga.a.a(this.f18814h, this.f18815i);
        ga.a.a(this.f18813g, this.f18816j);
        this.f18812f.r();
        if (this.f18818l) {
            for (int i10 = 0; i10 < this.f18811e.size(); i10++) {
                b4.b bVar = this.f18811e.get(i10);
                ka.b i11 = this.f18812f.i();
                ia.b bVar2 = this.f18814h;
                ka.b bVar3 = bVar.f5453b;
                ma.b.a(bVar2, bVar3.f10622c, bVar3.f10623d, this.f18817k);
                ka.b bVar4 = bVar.f5452a;
                double d10 = bVar4.f10622c;
                ka.b bVar5 = this.f18817k;
                i11.f10622c = d10 - bVar5.f10622c;
                i11.f10623d = bVar4.f10623d - bVar5.f10623d;
            }
        }
    }

    public final void c(float f10, float f11, ka.a aVar) {
        ma.a.a(this.f18815i, f11, f10, aVar);
        if (this.f18818l) {
            int i10 = -1;
            double d10 = Double.MAX_VALUE;
            for (int i11 = 0; i11 < this.f18811e.size(); i11++) {
                double e10 = this.f18811e.get(i11).f5453b.e(f11, f10);
                if (e10 < d10) {
                    i10 = i11;
                    d10 = e10;
                }
            }
            ka.b c10 = this.f18812f.c(i10);
            aVar.f10620c += (float) c10.f10622c;
            aVar.f10621d += (float) c10.f10623d;
        }
    }

    public final void d(double d10, double d11, ka.b bVar) {
        ma.b.a(this.f18813g, d10, d11, bVar);
    }

    public boolean e() {
        double d10 = 0.0d;
        int i10 = -1;
        for (int i11 = 0; i11 < this.f18811e.size(); i11++) {
            b4.b bVar = this.f18811e.get(i11);
            ia.b bVar2 = this.f18814h;
            ka.b bVar3 = bVar.f5453b;
            ma.b.a(bVar2, bVar3.f10622c, bVar3.f10623d, this.f18817k);
            ka.b bVar4 = this.f18817k;
            double d11 = bVar4.f10622c;
            ka.b bVar5 = bVar.f5452a;
            double d12 = d11 - bVar5.f10622c;
            double d13 = bVar4.f10623d - bVar5.f10623d;
            double d14 = (d12 * d12) + (d13 * d13);
            if (d14 > d10) {
                i10 = i11;
                d10 = d14;
            }
        }
        if (i10 == -1 || d10 <= 4.0d) {
            return false;
        }
        this.f18811e.remove(i10);
        return true;
    }

    public void f() {
        if (this.f18811e.size() == this.f18809c.f18623d) {
            this.f18811e.remove(11);
            this.f18811e.remove(5);
            this.f18811e.remove(0);
            return;
        }
        throw new RuntimeException("This can only be called when all the features have been added");
    }

    public void i(g gVar) {
        this.f18809c.r();
        this.f18810d.r();
        g(0.0f, 7.0f, gVar.f18752d, 1);
        g(7.0f, 7.0f, gVar.f18752d, 2);
        g(7.0f, 0.0f, gVar.f18752d, 3);
        h(0.0f, 7.0f, 0.0f, 14.0f, gVar.f18752d, 1, gVar.f18750c, 0);
        h(7.0f, 7.0f, 7.0f, 14.0f, gVar.f18752d, 2, gVar.f18750c, 3);
        h(7.0f, 7.0f, 14.0f, 7.0f, gVar.f18752d, 2, gVar.f18760q, 1);
        h(7.0f, 0.0f, 14.0f, 0.0f, gVar.f18752d, 3, gVar.f18760q, 0);
        rk.n nVar = new rk.n(3, 3);
        this.f18808b.i(this.f18809c.t(), this.f18810d.t(), null, nVar);
        this.f18813g.b(nVar);
        this.f18813g.f(this.f18814h);
        ga.a.a(this.f18814h, this.f18815i);
        ga.a.a(this.f18813g, this.f18816j);
    }

    public void j(la.a aVar) {
        this.f18818l = false;
        this.f18809c.r();
        this.f18811e.clear();
        g(0.0f, 0.0f, aVar, 0);
        g(0.0f, 7.0f, aVar, 1);
        g(7.0f, 7.0f, aVar, 2);
        g(7.0f, 0.0f, aVar, 3);
        b();
    }
}
