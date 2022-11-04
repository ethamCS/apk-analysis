package d.a.b.w.n;

import d.a.b.t;
import d.a.b.u;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class a<E> extends t<Object> {

    /* renamed from: c */
    public static final u f3813c = new C0110a();

    /* renamed from: a */
    private final Class<E> f3814a;

    /* renamed from: b */
    private final t<E> f3815b;

    /* renamed from: d.a.b.w.n.a$a */
    /* loaded from: classes.dex */
    static class C0110a implements u {
        C0110a() {
        }

        @Override // d.a.b.u
        public <T> t<T> b(d.a.b.e eVar, d.a.b.x.a<T> aVar) {
            Type e2 = aVar.e();
            if ((e2 instanceof GenericArrayType) || ((e2 instanceof Class) && ((Class) e2).isArray())) {
                Type g2 = d.a.b.w.b.g(e2);
                return new a(eVar, eVar.k(d.a.b.x.a.b(g2)), d.a.b.w.b.k(g2));
            }
            return null;
        }
    }

    public a(d.a.b.e eVar, t<E> tVar, Class<E> cls) {
        this.f3815b = new m(eVar, tVar, cls);
        this.f3814a = cls;
    }

    @Override // d.a.b.t
    public Object b(d.a.b.y.a aVar) {
        if (aVar.w0() == d.a.b.y.b.NULL) {
            aVar.s0();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.a();
        while (aVar.i0()) {
            arrayList.add(this.f3815b.b(aVar));
        }
        aVar.f0();
        int size = arrayList.size();
        Object newInstance = Array.newInstance((Class<?>) this.f3814a, size);
        for (int i = 0; i < size; i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // d.a.b.t
    public void d(d.a.b.y.c cVar, Object obj) {
        if (obj == null) {
            cVar.m0();
            return;
        }
        cVar.k();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f3815b.d(cVar, Array.get(obj, i));
        }
        cVar.f0();
    }
}
