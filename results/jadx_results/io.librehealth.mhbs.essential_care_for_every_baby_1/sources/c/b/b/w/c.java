package c.b.b.w;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a */
    private final Map<Type, c.b.b.f<?>> f473a;

    /* renamed from: b */
    private final c.b.b.w.o.b f474b = c.b.b.w.o.b.a();

    /* loaded from: classes.dex */
    public class a implements c.b.b.w.i<T> {
        a(c cVar) {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.concurrent.ConcurrentHashMap] */
        @Override // c.b.b.w.i
        public T a() {
            return new ConcurrentHashMap();
        }
    }

    /* loaded from: classes.dex */
    public class b implements c.b.b.w.i<T> {
        b(c cVar) {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.TreeMap, T] */
        @Override // c.b.b.w.i
        public T a() {
            return new TreeMap();
        }
    }

    /* renamed from: c.b.b.w.c$c */
    /* loaded from: classes.dex */
    public class C0028c implements c.b.b.w.i<T> {
        C0028c(c cVar) {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.LinkedHashMap, T] */
        @Override // c.b.b.w.i
        public T a() {
            return new LinkedHashMap();
        }
    }

    /* loaded from: classes.dex */
    public class d implements c.b.b.w.i<T> {
        d(c cVar) {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [c.b.b.w.h, T] */
        @Override // c.b.b.w.i
        public T a() {
            return new c.b.b.w.h();
        }
    }

    /* loaded from: classes.dex */
    public class e implements c.b.b.w.i<T> {

        /* renamed from: a */
        private final c.b.b.w.m f475a = c.b.b.w.m.b();

        /* renamed from: b */
        final /* synthetic */ Class f476b;

        /* renamed from: c */
        final /* synthetic */ Type f477c;

        e(c cVar, Class cls, Type type) {
            this.f476b = cls;
            this.f477c = type;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
        @Override // c.b.b.w.i
        public T a() {
            try {
                return this.f475a.c(this.f476b);
            } catch (Exception e2) {
                throw new RuntimeException("Unable to invoke no-args constructor for " + this.f477c + ". Registering an InstanceCreator with Gson for this type may fix this problem.", e2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class f implements c.b.b.w.i<T> {

        /* renamed from: a */
        final /* synthetic */ c.b.b.f f478a;

        /* renamed from: b */
        final /* synthetic */ Type f479b;

        f(c cVar, c.b.b.f fVar, Type type) {
            this.f478a = fVar;
            this.f479b = type;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
        @Override // c.b.b.w.i
        public T a() {
            return this.f478a.a(this.f479b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class g implements c.b.b.w.i<T> {

        /* renamed from: a */
        final /* synthetic */ c.b.b.f f480a;

        /* renamed from: b */
        final /* synthetic */ Type f481b;

        g(c cVar, c.b.b.f fVar, Type type) {
            this.f480a = fVar;
            this.f481b = type;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
        @Override // c.b.b.w.i
        public T a() {
            return this.f480a.a(this.f481b);
        }
    }

    /* loaded from: classes.dex */
    public class h implements c.b.b.w.i<T> {

        /* renamed from: a */
        final /* synthetic */ Constructor f482a;

        h(c cVar, Constructor constructor) {
            this.f482a = constructor;
        }

        /* JADX WARN: Type inference failed for: r0v6, types: [T, java.lang.Object] */
        @Override // c.b.b.w.i
        public T a() {
            try {
                return this.f482a.newInstance(null);
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            } catch (InstantiationException e3) {
                throw new RuntimeException("Failed to invoke " + this.f482a + " with no args", e3);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException("Failed to invoke " + this.f482a + " with no args", e4.getTargetException());
            }
        }
    }

    /* loaded from: classes.dex */
    public class i implements c.b.b.w.i<T> {
        i(c cVar) {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.TreeSet] */
        @Override // c.b.b.w.i
        public T a() {
            return new TreeSet();
        }
    }

    /* loaded from: classes.dex */
    public class j implements c.b.b.w.i<T> {

        /* renamed from: a */
        final /* synthetic */ Type f483a;

        j(c cVar, Type type) {
            this.f483a = type;
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [T, java.util.EnumSet] */
        @Override // c.b.b.w.i
        public T a() {
            Type type = this.f483a;
            if (!(type instanceof ParameterizedType)) {
                throw new c.b.b.k("Invalid EnumSet type: " + this.f483a.toString());
            }
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return EnumSet.noneOf((Class) type2);
            }
            throw new c.b.b.k("Invalid EnumSet type: " + this.f483a.toString());
        }
    }

    /* loaded from: classes.dex */
    public class k implements c.b.b.w.i<T> {
        k(c cVar) {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.LinkedHashSet] */
        @Override // c.b.b.w.i
        public T a() {
            return new LinkedHashSet();
        }
    }

    /* loaded from: classes.dex */
    public class l implements c.b.b.w.i<T> {
        l(c cVar) {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.ArrayDeque] */
        @Override // c.b.b.w.i
        public T a() {
            return new ArrayDeque();
        }
    }

    /* loaded from: classes.dex */
    public class m implements c.b.b.w.i<T> {
        m(c cVar) {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.ArrayList] */
        @Override // c.b.b.w.i
        public T a() {
            return new ArrayList();
        }
    }

    /* loaded from: classes.dex */
    public class n implements c.b.b.w.i<T> {
        n(c cVar) {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.concurrent.ConcurrentSkipListMap, T] */
        @Override // c.b.b.w.i
        public T a() {
            return new ConcurrentSkipListMap();
        }
    }

    public c(Map<Type, c.b.b.f<?>> map) {
        this.f473a = map;
    }

    private <T> c.b.b.w.i<T> b(Class<? super T> cls) {
        try {
            Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                this.f474b.b(declaredConstructor);
            }
            return new h(this, declaredConstructor);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private <T> c.b.b.w.i<T> c(Type type, Class<? super T> cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            return SortedSet.class.isAssignableFrom(cls) ? new i(this) : EnumSet.class.isAssignableFrom(cls) ? new j(this, type) : Set.class.isAssignableFrom(cls) ? new k(this) : Queue.class.isAssignableFrom(cls) ? new l(this) : new m(this);
        } else if (!Map.class.isAssignableFrom(cls)) {
            return null;
        } else {
            return ConcurrentNavigableMap.class.isAssignableFrom(cls) ? new n(this) : ConcurrentMap.class.isAssignableFrom(cls) ? new a(this) : SortedMap.class.isAssignableFrom(cls) ? new b(this) : (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(c.b.b.x.a.b(((ParameterizedType) type).getActualTypeArguments()[0]).c())) ? new d(this) : new C0028c(this);
        }
    }

    private <T> c.b.b.w.i<T> d(Type type, Class<? super T> cls) {
        return new e(this, cls, type);
    }

    public <T> c.b.b.w.i<T> a(c.b.b.x.a<T> aVar) {
        Type e2 = aVar.e();
        Class<? super T> c2 = aVar.c();
        c.b.b.f<?> fVar = this.f473a.get(e2);
        if (fVar != null) {
            return new f(this, fVar, e2);
        }
        c.b.b.f<?> fVar2 = this.f473a.get(c2);
        if (fVar2 != null) {
            return new g(this, fVar2, e2);
        }
        c.b.b.w.i<T> b2 = b(c2);
        if (b2 != null) {
            return b2;
        }
        c.b.b.w.i<T> c3 = c(e2, c2);
        return c3 != null ? c3 : d(e2, c2);
    }

    public String toString() {
        return this.f473a.toString();
    }
}
