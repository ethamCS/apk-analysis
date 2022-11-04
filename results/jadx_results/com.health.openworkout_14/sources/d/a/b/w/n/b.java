package d.a.b.w.n;

import d.a.b.t;
import d.a.b.u;
import java.lang.reflect.Type;
import java.util.Collection;
/* loaded from: classes.dex */
public final class b implements u {

    /* renamed from: b */
    private final d.a.b.w.c f3816b;

    /* loaded from: classes.dex */
    private static final class a<E> extends t<Collection<E>> {

        /* renamed from: a */
        private final t<E> f3817a;

        /* renamed from: b */
        private final d.a.b.w.i<? extends Collection<E>> f3818b;

        public a(d.a.b.e eVar, Type type, t<E> tVar, d.a.b.w.i<? extends Collection<E>> iVar) {
            this.f3817a = new m(eVar, tVar, type);
            this.f3818b = iVar;
        }

        /* renamed from: e */
        public Collection<E> b(d.a.b.y.a aVar) {
            if (aVar.w0() == d.a.b.y.b.NULL) {
                aVar.s0();
                return null;
            }
            Collection<E> a2 = this.f3818b.a();
            aVar.a();
            while (aVar.i0()) {
                a2.add(this.f3817a.b(aVar));
            }
            aVar.f0();
            return a2;
        }

        /* renamed from: f */
        public void d(d.a.b.y.c cVar, Collection<E> collection) {
            if (collection == null) {
                cVar.m0();
                return;
            }
            cVar.k();
            for (E e2 : collection) {
                this.f3817a.d(cVar, e2);
            }
            cVar.f0();
        }
    }

    public b(d.a.b.w.c cVar) {
        this.f3816b = cVar;
    }

    @Override // d.a.b.u
    public <T> t<T> b(d.a.b.e eVar, d.a.b.x.a<T> aVar) {
        Type e2 = aVar.e();
        Class<? super T> c2 = aVar.c();
        if (!Collection.class.isAssignableFrom(c2)) {
            return null;
        }
        Type h2 = d.a.b.w.b.h(e2, c2);
        return new a(eVar, h2, eVar.k(d.a.b.x.a.b(h2)), this.f3816b.a(aVar));
    }
}
