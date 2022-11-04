package c.b.b.w.n;

import c.b.b.p;
import c.b.b.q;
import c.b.b.t;
import c.b.b.u;
/* loaded from: classes.dex */
public final class l<T> extends t<T> {

    /* renamed from: a */
    private final q<T> f556a;

    /* renamed from: b */
    private final c.b.b.i<T> f557b;

    /* renamed from: c */
    final c.b.b.e f558c;

    /* renamed from: d */
    private final c.b.b.x.a<T> f559d;

    /* renamed from: e */
    private final u f560e;
    private final l<T>.b f = new b();
    private t<T> g;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class b implements p, c.b.b.h {
        private b(l lVar) {
        }
    }

    public l(q<T> qVar, c.b.b.i<T> iVar, c.b.b.e eVar, c.b.b.x.a<T> aVar, u uVar) {
        this.f556a = qVar;
        this.f557b = iVar;
        this.f558c = eVar;
        this.f559d = aVar;
        this.f560e = uVar;
    }

    private t<T> e() {
        t<T> tVar = this.g;
        if (tVar != null) {
            return tVar;
        }
        t<T> l = this.f558c.l(this.f560e, this.f559d);
        this.g = l;
        return l;
    }

    @Override // c.b.b.t
    public T b(c.b.b.y.a aVar) {
        if (this.f557b == null) {
            return e().b(aVar);
        }
        c.b.b.j a2 = c.b.b.w.l.a(aVar);
        if (!a2.e()) {
            return this.f557b.a(a2, this.f559d.e(), this.f);
        }
        return null;
    }

    @Override // c.b.b.t
    public void d(c.b.b.y.c cVar, T t) {
        q<T> qVar = this.f556a;
        if (qVar == null) {
            e().d(cVar, t);
        } else if (t == null) {
            cVar.m();
        } else {
            c.b.b.w.l.b(qVar.a(t, this.f559d.e(), this.f), cVar);
        }
    }
}
