package d.a.b.w.n;

import d.a.b.r;
import d.a.b.t;
import d.a.b.u;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class i implements u {

    /* renamed from: b */
    private final d.a.b.w.c f3831b;

    /* renamed from: c */
    private final d.a.b.d f3832c;

    /* renamed from: d */
    private final d.a.b.w.d f3833d;

    /* renamed from: e */
    private final d f3834e;

    /* renamed from: f */
    private final d.a.b.w.o.b f3835f = d.a.b.w.o.b.a();

    /* loaded from: classes.dex */
    public class a extends c {

        /* renamed from: d */
        final /* synthetic */ Field f3836d;

        /* renamed from: e */
        final /* synthetic */ boolean f3837e;

        /* renamed from: f */
        final /* synthetic */ t f3838f;

        /* renamed from: g */
        final /* synthetic */ d.a.b.e f3839g;

        /* renamed from: h */
        final /* synthetic */ d.a.b.x.a f3840h;
        final /* synthetic */ boolean i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(i iVar, String str, boolean z, boolean z2, Field field, boolean z3, t tVar, d.a.b.e eVar, d.a.b.x.a aVar, boolean z4) {
            super(str, z, z2);
            this.f3836d = field;
            this.f3837e = z3;
            this.f3838f = tVar;
            this.f3839g = eVar;
            this.f3840h = aVar;
            this.i = z4;
        }

        @Override // d.a.b.w.n.i.c
        void a(d.a.b.y.a aVar, Object obj) {
            Object b2 = this.f3838f.b(aVar);
            if (b2 != null || !this.i) {
                this.f3836d.set(obj, b2);
            }
        }

        @Override // d.a.b.w.n.i.c
        void b(d.a.b.y.c cVar, Object obj) {
            (this.f3837e ? this.f3838f : new m(this.f3839g, this.f3838f, this.f3840h.e())).d(cVar, this.f3836d.get(obj));
        }

        @Override // d.a.b.w.n.i.c
        public boolean c(Object obj) {
            return this.f3844b && this.f3836d.get(obj) != obj;
        }
    }

    /* loaded from: classes.dex */
    public static final class b<T> extends t<T> {

        /* renamed from: a */
        private final d.a.b.w.i<T> f3841a;

        /* renamed from: b */
        private final Map<String, c> f3842b;

        b(d.a.b.w.i<T> iVar, Map<String, c> map) {
            this.f3841a = iVar;
            this.f3842b = map;
        }

        @Override // d.a.b.t
        public T b(d.a.b.y.a aVar) {
            if (aVar.w0() == d.a.b.y.b.NULL) {
                aVar.s0();
                return null;
            }
            T a2 = this.f3841a.a();
            try {
                aVar.c();
                while (aVar.i0()) {
                    c cVar = this.f3842b.get(aVar.q0());
                    if (cVar != null && cVar.f3845c) {
                        cVar.a(aVar, a2);
                    }
                    aVar.G0();
                }
                aVar.g0();
                return a2;
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            } catch (IllegalStateException e3) {
                throw new r(e3);
            }
        }

        @Override // d.a.b.t
        public void d(d.a.b.y.c cVar, T t) {
            if (t == null) {
                cVar.m0();
                return;
            }
            cVar.I();
            try {
                for (c cVar2 : this.f3842b.values()) {
                    if (cVar2.c(t)) {
                        cVar.k0(cVar2.f3843a);
                        cVar2.b(cVar, t);
                    }
                }
                cVar.g0();
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c {

        /* renamed from: a */
        final String f3843a;

        /* renamed from: b */
        final boolean f3844b;

        /* renamed from: c */
        final boolean f3845c;

        protected c(String str, boolean z, boolean z2) {
            this.f3843a = str;
            this.f3844b = z;
            this.f3845c = z2;
        }

        abstract void a(d.a.b.y.a aVar, Object obj);

        abstract void b(d.a.b.y.c cVar, Object obj);

        abstract boolean c(Object obj);
    }

    public i(d.a.b.w.c cVar, d.a.b.d dVar, d.a.b.w.d dVar2, d dVar3) {
        this.f3831b = cVar;
        this.f3832c = dVar;
        this.f3833d = dVar2;
        this.f3834e = dVar3;
    }

    private c a(d.a.b.e eVar, Field field, String str, d.a.b.x.a<?> aVar, boolean z, boolean z2) {
        boolean b2 = d.a.b.w.k.b(aVar.c());
        d.a.b.v.b bVar = (d.a.b.v.b) field.getAnnotation(d.a.b.v.b.class);
        t<?> a2 = bVar != null ? this.f3834e.a(this.f3831b, eVar, aVar, bVar) : null;
        boolean z3 = a2 != null;
        if (a2 == null) {
            a2 = eVar.k(aVar);
        }
        return new a(this, str, z, z2, field, z3, a2, eVar, aVar, b2);
    }

    static boolean d(Field field, boolean z, d.a.b.w.d dVar) {
        return !dVar.e(field.getType(), z) && !dVar.h(field, z);
    }

    private Map<String, c> e(d.a.b.e eVar, d.a.b.x.a<?> aVar, Class<?> cls) {
        c cVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        Type e2 = aVar.e();
        d.a.b.x.a<?> aVar2 = aVar;
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
                    this.f3835f.b(field);
                    Type p = d.a.b.w.b.p(aVar2.e(), cls2, field.getGenericType());
                    List<String> f2 = f(field);
                    int size = f2.size();
                    c cVar2 = null;
                    int i2 = 0;
                    while (i2 < size) {
                        String str = f2.get(i2);
                        boolean z2 = i2 != 0 ? false : c2;
                        int i3 = i2;
                        c cVar3 = cVar2;
                        int i4 = size;
                        List<String> list = f2;
                        Field field2 = field;
                        cVar2 = cVar3 == null ? (c) linkedHashMap.put(str, a(eVar, field, str, d.a.b.x.a.b(p), z2, c3)) : cVar3;
                        i2 = i3 + 1;
                        c2 = z2;
                        f2 = list;
                        size = i4;
                        field = field2;
                    }
                    if (cVar2 != null) {
                        throw new IllegalArgumentException(e2 + " declares multiple JSON fields named " + cVar.f3843a);
                    }
                }
                i++;
                z = false;
            }
            aVar2 = d.a.b.x.a.b(d.a.b.w.b.p(aVar2.e(), cls2, cls2.getGenericSuperclass()));
            cls2 = aVar2.c();
        }
        return linkedHashMap;
    }

    private List<String> f(Field field) {
        d.a.b.v.c cVar = (d.a.b.v.c) field.getAnnotation(d.a.b.v.c.class);
        if (cVar == null) {
            return Collections.singletonList(this.f3832c.a(field));
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

    @Override // d.a.b.u
    public <T> t<T> b(d.a.b.e eVar, d.a.b.x.a<T> aVar) {
        Class<? super T> c2 = aVar.c();
        if (!Object.class.isAssignableFrom(c2)) {
            return null;
        }
        return new b(this.f3831b.a(aVar), e(eVar, aVar, c2));
    }

    public boolean c(Field field, boolean z) {
        return d(field, z, this.f3833d);
    }
}
