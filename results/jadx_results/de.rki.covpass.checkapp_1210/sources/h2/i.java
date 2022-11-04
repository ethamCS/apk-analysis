package h2;

import c4.l;
import c4.q;
import c4.t;
/* loaded from: classes.dex */
public class i<T extends q<T>> implements h<T> {

    /* renamed from: a */
    t<T> f11183a;

    /* renamed from: b */
    h f11184b;

    /* renamed from: c */
    q f11185c;

    public i(h hVar, Class<T> cls) {
        this.f11184b = hVar;
        this.f11183a = t.n(cls);
        if (!hVar.getInputType().j(this.f11183a)) {
            this.f11185c = (q) hVar.getInputType().b(1, 1);
        }
    }

    /* renamed from: b */
    public void a(T t10, l lVar) {
        q qVar = this.f11185c;
        if (qVar == null) {
            this.f11184b.a(t10, lVar);
            return;
        }
        qVar.U(t10.f6220q, t10.f6221x);
        m3.c.c(t10, this.f11185c);
        this.f11184b.a(this.f11185c, lVar);
    }

    @Override // h2.h
    public t<T> getInputType() {
        return this.f11183a;
    }
}
