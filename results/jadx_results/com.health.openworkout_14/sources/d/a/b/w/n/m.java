package d.a.b.w.n;

import d.a.b.t;
import d.a.b.w.n.i;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
/* loaded from: classes.dex */
public final class m<T> extends t<T> {

    /* renamed from: a */
    private final d.a.b.e f3857a;

    /* renamed from: b */
    private final t<T> f3858b;

    /* renamed from: c */
    private final Type f3859c;

    public m(d.a.b.e eVar, t<T> tVar, Type type) {
        this.f3857a = eVar;
        this.f3858b = tVar;
        this.f3859c = type;
    }

    private Type e(Type type, Object obj) {
        return obj != null ? (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class)) ? obj.getClass() : type : type;
    }

    @Override // d.a.b.t
    public T b(d.a.b.y.a aVar) {
        return this.f3858b.b(aVar);
    }

    @Override // d.a.b.t
    public void d(d.a.b.y.c cVar, T t) {
        t<T> tVar = this.f3858b;
        Type e2 = e(this.f3859c, t);
        if (e2 != this.f3859c) {
            tVar = this.f3857a.k(d.a.b.x.a.b(e2));
            if (tVar instanceof i.b) {
                t<T> tVar2 = this.f3858b;
                if (!(tVar2 instanceof i.b)) {
                    tVar = tVar2;
                }
            }
        }
        tVar.d(cVar, t);
    }
}
