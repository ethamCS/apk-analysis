package d.a.b.w.n;

import d.a.b.p;
import d.a.b.q;
import d.a.b.t;
import d.a.b.u;
/* loaded from: classes.dex */
public final class l<T> extends t<T> {

    /* renamed from: a */
    private final q<T> f3850a;

    /* renamed from: b */
    private final d.a.b.i<T> f3851b;

    /* renamed from: c */
    final d.a.b.e f3852c;

    /* renamed from: d */
    private final d.a.b.x.a<T> f3853d;

    /* renamed from: e */
    private final u f3854e;

    /* renamed from: f */
    private final l<T>.b f3855f = new b();

    /* renamed from: g */
    private t<T> f3856g;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class b implements p, d.a.b.h {
        private b(l lVar) {
        }
    }

    public l(q<T> qVar, d.a.b.i<T> iVar, d.a.b.e eVar, d.a.b.x.a<T> aVar, u uVar) {
        this.f3850a = qVar;
        this.f3851b = iVar;
        this.f3852c = eVar;
        this.f3853d = aVar;
        this.f3854e = uVar;
    }

    private t<T> e() {
        t<T> tVar = this.f3856g;
        if (tVar != null) {
            return tVar;
        }
        t<T> m = this.f3852c.m(this.f3854e, this.f3853d);
        this.f3856g = m;
        return m;
    }

    @Override // d.a.b.t
    public T b(d.a.b.y.a aVar) {
        if (this.f3851b == null) {
            return e().b(aVar);
        }
        d.a.b.j a2 = d.a.b.w.l.a(aVar);
        if (!a2.e()) {
            return this.f3851b.a(a2, this.f3853d.e(), this.f3855f);
        }
        return null;
    }

    @Override // d.a.b.t
    public void d(d.a.b.y.c cVar, T t) {
        q<T> qVar = this.f3850a;
        if (qVar == null) {
            e().d(cVar, t);
        } else if (t == null) {
            cVar.m0();
        } else {
            d.a.b.w.l.b(qVar.a(t, this.f3853d.e(), this.f3855f), cVar);
        }
    }
}
