package g.z.a;

import d.a.b.e;
import d.a.b.k;
import d.a.b.t;
import e.j0;
import g.h;
/* loaded from: classes.dex */
final class c<T> implements h<j0, T> {

    /* renamed from: a */
    private final e f4656a;

    /* renamed from: b */
    private final t<T> f4657b;

    public c(e eVar, t<T> tVar) {
        this.f4656a = eVar;
        this.f4657b = tVar;
    }

    /* renamed from: b */
    public T a(j0 j0Var) {
        d.a.b.y.a o = this.f4656a.o(j0Var.c());
        try {
            T b2 = this.f4657b.b(o);
            if (o.w0() == d.a.b.y.b.END_DOCUMENT) {
                return b2;
            }
            throw new k("JSON document was not fully consumed.");
        } finally {
            j0Var.close();
        }
    }
}
