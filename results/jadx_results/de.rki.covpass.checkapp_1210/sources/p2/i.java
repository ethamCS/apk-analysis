package p2;

import c4.q;
/* loaded from: classes.dex */
public class i<T extends c4.q<T>> {

    /* renamed from: b */
    a3.d<T> f18799b;

    /* renamed from: d */
    int f18801d;

    /* renamed from: e */
    int f18802e;

    /* renamed from: f */
    float f18803f;

    /* renamed from: g */
    g f18804g;

    /* renamed from: a */
    l f18798a = new l();

    /* renamed from: c */
    ka.a f18800c = new ka.a();

    public i(Class<T> cls) {
        a3.d<T> b10 = t3.a.b(cls);
        this.f18799b = b10;
        b10.a(n3.g.a(y3.b.EXTENDED, cls));
    }

    public l a() {
        return this.f18798a;
    }

    public void b(double d10, double d11, ka.b bVar) {
        this.f18798a.c((float) d10, (float) d11, this.f18800c);
        ka.a aVar = this.f18800c;
        bVar.f10622c = aVar.f10620c;
        bVar.f10623d = aVar.f10621d;
    }

    public void c(ka.b bVar, ka.b bVar2) {
        this.f18798a.d(bVar.f10622c, bVar.f10623d, bVar2);
    }

    public float d(float f10, float f11) {
        this.f18798a.c(f10, f11, this.f18800c);
        a3.d<T> dVar = this.f18799b;
        ka.a aVar = this.f18800c;
        return dVar.b(aVar.f10620c, aVar.f10621d);
    }

    public int e(int i10, int i11) {
        float f10 = i10 + 0.5f;
        float f11 = i11 + 0.5f;
        this.f18798a.c(f10 - 0.2f, f11, this.f18800c);
        a3.d<T> dVar = this.f18799b;
        ka.a aVar = this.f18800c;
        float b10 = dVar.b(aVar.f10620c, aVar.f10621d);
        this.f18798a.c(f10 + 0.2f, f11, this.f18800c);
        a3.d<T> dVar2 = this.f18799b;
        ka.a aVar2 = this.f18800c;
        float b11 = dVar2.b(aVar2.f10620c, aVar2.f10621d);
        this.f18798a.c(f10, f11 - 0.2f, this.f18800c);
        a3.d<T> dVar3 = this.f18799b;
        ka.a aVar3 = this.f18800c;
        float b12 = dVar3.b(aVar3.f10620c, aVar3.f10621d);
        this.f18798a.c(f10, 0.2f + f11, this.f18800c);
        a3.d<T> dVar4 = this.f18799b;
        ka.a aVar4 = this.f18800c;
        float b13 = dVar4.b(aVar4.f10620c, aVar4.f10621d);
        this.f18798a.c(f10, f11, this.f18800c);
        a3.d<T> dVar5 = this.f18799b;
        ka.a aVar5 = this.f18800c;
        float b14 = dVar5.b(aVar5.f10620c, aVar5.f10621d);
        float f12 = this.f18803f;
        int i12 = b10 < f12 ? 1 : 0;
        if (b11 < f12) {
            i12++;
        }
        if (b12 < f12) {
            i12++;
        }
        if (b13 < f12) {
            i12++;
        }
        if (b14 < f12) {
            i12++;
        }
        return i12 >= 3 ? 1 : 0;
    }

    public void f(int i10, int i11, ok.e eVar) {
        float f10 = i10 + 0.5f;
        float f11 = i11 + 0.5f;
        this.f18798a.c(f10 - 0.2f, f11, this.f18800c);
        a3.d<T> dVar = this.f18799b;
        ka.a aVar = this.f18800c;
        eVar.a(dVar.b(aVar.f10620c, aVar.f10621d));
        this.f18798a.c(f10 + 0.2f, f11, this.f18800c);
        a3.d<T> dVar2 = this.f18799b;
        ka.a aVar2 = this.f18800c;
        eVar.a(dVar2.b(aVar2.f10620c, aVar2.f10621d));
        this.f18798a.c(f10, f11 - 0.2f, this.f18800c);
        a3.d<T> dVar3 = this.f18799b;
        ka.a aVar3 = this.f18800c;
        eVar.a(dVar3.b(aVar3.f10620c, aVar3.f10621d));
        this.f18798a.c(f10, 0.2f + f11, this.f18800c);
        a3.d<T> dVar4 = this.f18799b;
        ka.a aVar4 = this.f18800c;
        eVar.a(dVar4.b(aVar4.f10620c, aVar4.f10621d));
        this.f18798a.c(f10, f11, this.f18800c);
        a3.d<T> dVar5 = this.f18799b;
        ka.a aVar5 = this.f18800c;
        eVar.a(dVar5.b(aVar5.f10620c, aVar5.f10621d));
    }

    public void g(T t10) {
        this.f18799b.c(t10);
        this.f18801d = t10.f6220q;
        this.f18802e = t10.f6221x;
    }

    public void h(g gVar) {
        this.f18804g = gVar;
        this.f18798a.a(gVar);
        this.f18798a.f();
        this.f18798a.b();
        this.f18803f = ((float) ((gVar.f18762y + gVar.U3) + gVar.f18761x)) / 3.0f;
    }

    public void i(g gVar, float f10) {
        this.f18804g = null;
        this.f18798a.i(gVar);
        this.f18803f = f10;
    }

    public void j(la.a aVar, float f10) {
        this.f18804g = null;
        this.f18798a.j(aVar);
        this.f18803f = f10;
    }
}
