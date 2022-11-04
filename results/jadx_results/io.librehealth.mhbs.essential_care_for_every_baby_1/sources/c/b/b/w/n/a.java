package c.b.b.w.n;

import c.b.b.t;
import c.b.b.u;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class a<E> extends t<Object> {

    /* renamed from: c */
    public static final u f522c = new C0030a();

    /* renamed from: a */
    private final Class<E> f523a;

    /* renamed from: b */
    private final t<E> f524b;

    /* renamed from: c.b.b.w.n.a$a */
    /* loaded from: classes.dex */
    static class C0030a implements u {
        C0030a() {
        }

        @Override // c.b.b.u
        public <T> t<T> a(c.b.b.e eVar, c.b.b.x.a<T> aVar) {
            Type e2 = aVar.e();
            if ((e2 instanceof GenericArrayType) || ((e2 instanceof Class) && ((Class) e2).isArray())) {
                Type g = c.b.b.w.b.g(e2);
                return new a(eVar, eVar.j(c.b.b.x.a.b(g)), c.b.b.w.b.k(g));
            }
            return null;
        }
    }

    public a(c.b.b.e eVar, t<E> tVar, Class<E> cls) {
        this.f524b = new m(eVar, tVar, cls);
        this.f523a = cls;
    }

    @Override // c.b.b.t
    public Object b(c.b.b.y.a aVar) {
        if (aVar.x() == c.b.b.y.b.NULL) {
            aVar.t();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.a();
        while (aVar.j()) {
            arrayList.add(this.f524b.b(aVar));
        }
        aVar.f();
        int size = arrayList.size();
        Object newInstance = Array.newInstance((Class<?>) this.f523a, size);
        for (int i = 0; i < size; i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // c.b.b.t
    public void d(c.b.b.y.c cVar, Object obj) {
        if (obj == null) {
            cVar.m();
            return;
        }
        cVar.c();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f524b.d(cVar, Array.get(obj, i));
        }
        cVar.f();
    }
}
