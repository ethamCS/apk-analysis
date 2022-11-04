package h2;

import c4.l;
import h2.e;
import java.util.List;
/* loaded from: classes.dex */
public class c implements a, e.a {

    /* renamed from: c */
    int f11168c;

    /* renamed from: d */
    int f11169d;

    /* renamed from: b */
    boolean f11167b = true;

    /* renamed from: e */
    l f11170e = new l(1, 1);

    /* renamed from: f */
    ok.b<q2.b> f11171f = new ok.b<>(b.f11165a);

    /* renamed from: a */
    q2.e f11166a = new q2.e(x3.c.FOUR);

    @Override // h2.e
    public void a(int i10, List<ka.c> list) {
        this.f11166a.g().j(i10, list);
    }

    @Override // h2.a
    public void b(l lVar) {
        if (this.f11167b) {
            this.f11170e.U(lVar.f6220q + 2, lVar.f6221x + 2);
            c3.d.a(0, 0, 1, 1, lVar.f6220q, lVar.f6221x, lVar, this.f11170e);
            this.f11166a.h(this.f11170e, 1, 1);
        } else {
            this.f11166a.h(lVar, this.f11168c, this.f11169d);
        }
        this.f11171f.r();
        x3.g g10 = this.f11166a.g();
        for (int i10 = 0; i10 < g10.h(); i10++) {
            q2.b i11 = this.f11171f.i();
            i11.f19494b = i10;
            i11.f19493a = i10;
        }
    }

    @Override // h2.e.a
    public void c(boolean z10) {
        this.f11167b = z10;
    }

    @Override // h2.e
    public void d(int i10, ok.b<ka.c> bVar) {
        this.f11166a.g().c(i10, bVar);
    }

    @Override // h2.e
    public void e(int i10) {
        this.f11166a.j(i10);
    }

    @Override // h2.e
    public List<q2.b> f() {
        return this.f11171f.t();
    }

    @Override // h2.e.a
    public boolean g() {
        return this.f11167b;
    }

    @Override // h2.e
    public void h(int i10) {
        this.f11166a.k(i10);
    }

    @Override // h2.e
    public void i(x3.c cVar) {
        this.f11166a.i(cVar);
    }

    @Override // h2.e
    public void j(boolean z10) {
    }

    @Override // h2.e.a
    public void k(int i10, int i11) {
        this.f11168c = i10;
        this.f11169d = i11;
    }
}
