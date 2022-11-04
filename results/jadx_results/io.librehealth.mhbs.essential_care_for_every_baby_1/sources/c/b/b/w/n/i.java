package c.b.b.w.n;

import c.b.b.r;
import c.b.b.t;
import c.b.b.u;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class i implements u {

    /* renamed from: a */
    private final c.b.b.w.c f540a;

    /* renamed from: b */
    private final c.b.b.d f541b;

    /* renamed from: c */
    private final c.b.b.w.d f542c;

    /* renamed from: d */
    private final d f543d;

    /* renamed from: e */
    private final c.b.b.w.o.b f544e = c.b.b.w.o.b.a();

    /* loaded from: classes.dex */
    public class a extends c {

        /* renamed from: d */
        final /* synthetic */ Field f545d;

        /* renamed from: e */
        final /* synthetic */ boolean f546e;
        final /* synthetic */ t f;
        final /* synthetic */ c.b.b.e g;
        final /* synthetic */ c.b.b.x.a h;
        final /* synthetic */ boolean i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(i iVar, String str, boolean z, boolean z2, Field field, boolean z3, t tVar, c.b.b.e eVar, c.b.b.x.a aVar, boolean z4) {
            super(str, z, z2);
            this.f545d = field;
            this.f546e = z3;
            this.f = tVar;
            this.g = eVar;
            this.h = aVar;
            this.i = z4;
        }

        @Override // c.b.b.w.n.i.c
        void a(c.b.b.y.a aVar, Object obj) {
            Object b2 = this.f.b(aVar);
            if (b2 != null || !this.i) {
                this.f545d.set(obj, b2);
            }
        }

        @Override // c.b.b.w.n.i.c
        void b(c.b.b.y.c cVar, Object obj) {
            (this.f546e ? this.f : new m(this.g, this.f, this.h.e())).d(cVar, this.f545d.get(obj));
        }

        @Override // c.b.b.w.n.i.c
        public boolean c(Object obj) {
            return this.f550b && this.f545d.get(obj) != obj;
        }
    }

    /* loaded from: classes.dex */
    public static final class b<T> extends t<T> {

        /* renamed from: a */
        private final c.b.b.w.i<T> f547a;

        /* renamed from: b */
        private final Map<String, c> f548b;

        b(c.b.b.w.i<T> iVar, Map<String, c> map) {
            this.f547a = iVar;
            this.f548b = map;
        }

        @Override // c.b.b.t
        public T b(c.b.b.y.a aVar) {
            if (aVar.x() == c.b.b.y.b.NULL) {
                aVar.t();
                return null;
            }
            T a2 = this.f547a.a();
            try {
                aVar.b();
                while (aVar.j()) {
                    c cVar = this.f548b.get(aVar.r());
                    if (cVar != null && cVar.f551c) {
                        cVar.a(aVar, a2);
                    }
                    aVar.H();
                }
                aVar.g();
                return a2;
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            } catch (IllegalStateException e3) {
                throw new r(e3);
            }
        }

        @Override // c.b.b.t
        public void d(c.b.b.y.c cVar, T t) {
            if (t == null) {
                cVar.m();
                return;
            }
            cVar.d();
            try {
                for (c cVar2 : this.f548b.values()) {
                    if (cVar2.c(t)) {
                        cVar.k(cVar2.f549a);
                        cVar2.b(cVar, t);
                    }
                }
                cVar.g();
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c {

        /* renamed from: a */
        final String f549a;

        /* renamed from: b */
        final boolean f550b;

        /* renamed from: c */
        final boolean f551c;

        protected c(String str, boolean z, boolean z2) {
            this.f549a = str;
            this.f550b = z;
            this.f551c = z2;
        }

        abstract void a(c.b.b.y.a aVar, Object obj);

        abstract void b(c.b.b.y.c cVar, Object obj);

        abstract boolean c(Object obj);
    }

    public i(c.b.b.w.c cVar, c.b.b.d dVar, c.b.b.w.d dVar2, d dVar3) {
        this.f540a = cVar;
        this.f541b = dVar;
        this.f542c = dVar2;
        this.f543d = dVar3;
    }

    private c b(c.b.b.e eVar, Field field, String str, c.b.b.x.a<?> aVar, boolean z, boolean z2) {
        boolean b2 = c.b.b.w.k.b(aVar.c());
        c.b.b.v.b bVar = (c.b.b.v.b) field.getAnnotation(c.b.b.v.b.class);
        t<?> b3 = bVar != null ? this.f543d.b(this.f540a, eVar, aVar, bVar) : null;
        boolean z3 = b3 != null;
        if (b3 == null) {
            b3 = eVar.j(aVar);
        }
        return new a(this, str, z, z2, field, z3, b3, eVar, aVar, b2);
    }

    static boolean d(Field field, boolean z, c.b.b.w.d dVar) {
        return !dVar.c(field.getType(), z) && !dVar.f(field, z);
    }

    private Map<String, c> e(c.b.b.e eVar, c.b.b.x.a<?> aVar, Class<?> cls) {
        c cVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        Type e2 = aVar.e();
        c.b.b.x.a<?> aVar2 = aVar;
        Class<?> cls2 = cls;
        while (cls2 != Object.class) {
            Field[] declaredFields = cls2.getDeclaredFields();
            int length = declaredFields.length;
            boolean z = false;
            int i = 0;
            while (i < length) {
                Field field = declaredFields[i];
                boolean c2 = c(field, true);
                boolean c3 = c(field, z);
                if (c2 || c3) {
                    this.f544e.b(field);
                    Type p = c.b.b.w.b.p(aVar2.e(), cls2, field.getGenericType());
                    List<String> f = f(field);
                    int size = f.size();
                    c cVar2 = null;
                    int i2 = 0;
                    while (i2 < size) {
                        String str = f.get(i2);
                        boolean z2 = i2 != 0 ? false : c2;
                        int i3 = i2;
                        c cVar3 = cVar2;
                        int i4 = size;
                        List<String> list = f;
                        Field field2 = field;
                        cVar2 = cVar3 == null ? (c) linkedHashMap.put(str, b(eVar, field, str, c.b.b.x.a.b(p), z2, c3)) : cVar3;
                        i2 = i3 + 1;
                        c2 = z2;
                        f = list;
                        size = i4;
                        field = field2;
                    }
                    if (cVar2 != null) {
                        throw new IllegalArgumentException(e2 + " declares multiple JSON fields named " + cVar.f549a);
                    }
                }
                i++;
                z = false;
            }
            aVar2 = c.b.b.x.a.b(c.b.b.w.b.p(aVar2.e(), cls2, cls2.getGenericSuperclass()));
            cls2 = aVar2.c();
        }
        return linkedHashMap;
    }

    private List<String> f(Field field) {
        c.b.b.v.c cVar = (c.b.b.v.c) field.getAnnotation(c.b.b.v.c.class);
        if (cVar == null) {
            return Collections.singletonList(this.f541b.a(field));
        }
        String value = cVar.value();
        String[] alternate = cVar.alternate();
        if (alternate.length == 0) {
            return Collections.singletonList(value);
        }
        ArrayList arrayList = new ArrayList(alternate.length + 1);
        arrayList.add(value);
        for (String str : alternate) {
            arrayList.add(str);
        }
        return arrayList;
    }

    @Override // c.b.b.u
    public <T> t<T> a(c.b.b.e eVar, c.b.b.x.a<T> aVar) {
        Class<? super T> c2 = aVar.c();
        if (!Object.class.isAssignableFrom(c2)) {
            return null;
        }
        return new b(this.f540a.a(aVar), e(eVar, aVar, c2));
    }

    public boolean c(Field field, boolean z) {
        return d(field, z, this.f542c);
    }
}
