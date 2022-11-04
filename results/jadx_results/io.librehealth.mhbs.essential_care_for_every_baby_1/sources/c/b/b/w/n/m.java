package c.b.b.w.n;

import c.b.b.t;
import c.b.b.w.n.i;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
/* loaded from: classes.dex */
public final class m<T> extends t<T> {

    /* renamed from: a */
    private final c.b.b.e f561a;

    /* renamed from: b */
    private final t<T> f562b;

    /* renamed from: c */
    private final Type f563c;

    public m(c.b.b.e eVar, t<T> tVar, Type type) {
        this.f561a = eVar;
        this.f562b = tVar;
        this.f563c = type;
    }

    private Type e(Type type, Object obj) {
        return obj != null ? (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class)) ? obj.getClass() : type : type;
    }

    @Override // c.b.b.t
    public T b(c.b.b.y.a aVar) {
        return this.f562b.b(aVar);
    }

    @Override // c.b.b.t
    public void d(c.b.b.y.c cVar, T t) {
        t<T> tVar = this.f562b;
        Type e2 = e(this.f563c, t);
        if (e2 != this.f563c) {
            tVar = this.f561a.j(c.b.b.x.a.b(e2));
            if (tVar instanceof i.b) {
                t<T> tVar2 = this.f562b;
                if (!(tVar2 instanceof i.b)) {
                    tVar = tVar2;
                }
            }
        }
        tVar.d(cVar, t);
    }
}
