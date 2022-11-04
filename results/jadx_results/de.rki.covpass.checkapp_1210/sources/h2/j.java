package h2;

import c4.l;
import c4.q;
import c4.t;
/* loaded from: classes.dex */
public class j<T extends q<T>> implements h<T> {

    /* renamed from: a */
    t<T> f11186a;

    /* renamed from: b */
    T f11187b;

    /* renamed from: c */
    q f11188c;

    /* renamed from: d */
    x3.b f11189d;

    /* renamed from: e */
    double f11190e;

    /* renamed from: f */
    boolean f11191f;

    public j(x3.b bVar, double d10, boolean z10, t<T> tVar) {
        this.f11189d = bVar;
        this.f11190e = d10;
        this.f11191f = z10;
        this.f11186a = tVar;
        this.f11187b = tVar.b(1, 1);
        this.f11188c = tVar.b(1, 1);
    }

    /* renamed from: b */
    public void a(T t10, l lVar) {
        this.f11187b.U(t10.f6220q, t10.f6221x);
        this.f11188c.U(t10.f6220q, t10.f6221x);
        q2.d.i(t10, lVar, this.f11189d, this.f11190e, this.f11191f, this.f11187b, this.f11188c);
    }

    @Override // h2.h
    public t<T> getInputType() {
        return this.f11186a;
    }
}
