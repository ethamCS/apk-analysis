package c.b.b.w.n;

import c.b.b.t;
import c.b.b.u;
import java.lang.reflect.Type;
import java.util.Collection;
/* loaded from: classes.dex */
public final class b implements u {

    /* renamed from: a */
    private final c.b.b.w.c f525a;

    /* loaded from: classes.dex */
    private static final class a<E> extends t<Collection<E>> {

        /* renamed from: a */
        private final t<E> f526a;

        /* renamed from: b */
        private final c.b.b.w.i<? extends Collection<E>> f527b;

        public a(c.b.b.e eVar, Type type, t<E> tVar, c.b.b.w.i<? extends Collection<E>> iVar) {
            this.f526a = new m(eVar, tVar, type);
            this.f527b = iVar;
        }

        /* renamed from: e */
        public Collection<E> b(c.b.b.y.a aVar) {
            if (aVar.x() == c.b.b.y.b.NULL) {
                aVar.t();
                return null;
            }
            Collection<E> a2 = this.f527b.a();
            aVar.a();
            while (aVar.j()) {
                a2.add(this.f526a.b(aVar));
            }
            aVar.f();
            return a2;
        }

        /* renamed from: f */
        public void d(c.b.b.y.c cVar, Collection<E> collection) {
            if (collection == null) {
                cVar.m();
                return;
            }
            cVar.c();
            for (E e2 : collection) {
                this.f526a.d(cVar, e2);
            }
            cVar.f();
        }
    }

    public b(c.b.b.w.c cVar) {
        this.f525a = cVar;
    }

    @Override // c.b.b.u
    public <T> t<T> a(c.b.b.e eVar, c.b.b.x.a<T> aVar) {
        Type e2 = aVar.e();
        Class<? super T> c2 = aVar.c();
        if (!Collection.class.isAssignableFrom(c2)) {
            return null;
        }
        Type h = c.b.b.w.b.h(e2, c2);
        return new a(eVar, h, eVar.j(c.b.b.x.a.b(h)), this.f525a.a(aVar));
    }
}
