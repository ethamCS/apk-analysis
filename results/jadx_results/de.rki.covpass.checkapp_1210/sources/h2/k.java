package h2;

import c4.l;
import c4.q;
import c4.t;
/* loaded from: classes.dex */
public class k<T extends q<T>> implements h<T> {

    /* renamed from: a */
    t<T> f11192a;

    /* renamed from: b */
    T f11193b;

    /* renamed from: c */
    q f11194c;

    /* renamed from: d */
    ll.d f11195d;

    /* renamed from: e */
    x3.b f11196e;

    /* renamed from: f */
    double f11197f;

    /* renamed from: g */
    boolean f11198g;

    public k(x3.b bVar, double d10, boolean z10, t<T> tVar) {
        this.f11196e = bVar;
        this.f11197f = d10;
        this.f11198g = z10;
        this.f11192a = tVar;
        this.f11193b = tVar.b(1, 1);
        this.f11194c = tVar.b(1, 1);
        this.f11195d = m3.i.b(tVar);
    }

    /* renamed from: b */
    public void a(T t10, l lVar) {
        this.f11193b.U(t10.f6220q, t10.f6221x);
        this.f11194c.U(t10.f6220q, t10.f6221x);
        q2.d.j(t10, lVar, this.f11196e, this.f11197f, this.f11198g, this.f11193b, this.f11194c, this.f11195d);
    }

    @Override // h2.h
    public t<T> getInputType() {
        return this.f11192a;
    }
}
