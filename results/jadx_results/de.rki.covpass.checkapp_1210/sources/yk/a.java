package yk;

import fl.h;
import rk.n;
/* loaded from: classes3.dex */
public class a implements h<n> {

    /* renamed from: a */
    h<n> f26315a;

    /* renamed from: b */
    n f26316b = new n(1, 1);

    public a(h<n> hVar) {
        this.f26315a = hVar;
    }

    @Override // fl.c
    public boolean b() {
        return false;
    }

    @Override // fl.g
    public int f() {
        return this.f26315a.f();
    }

    @Override // fl.h
    public double[] h() {
        return this.f26315a.h();
    }

    /* renamed from: l */
    public boolean d(n nVar) {
        if (this.f26315a.b()) {
            this.f26316b.U(nVar.f21297d, nVar.f21298q);
            this.f26316b.g(nVar);
            return this.f26315a.d(this.f26316b);
        }
        return this.f26315a.d(nVar);
    }

    /* renamed from: m */
    public n i(n nVar, boolean z10) {
        return this.f26315a.i(nVar, z10);
    }
}
