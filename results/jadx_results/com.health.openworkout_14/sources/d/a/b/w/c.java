package d.a.b.w;

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
    private final Map<Type, d.a.b.f<?>> f3757a;

    /* renamed from: b */
    private final d.a.b.w.o.b f3758b = d.a.b.w.o.b.a();

    /* loaded from: classes.dex */
    public class a implements d.a.b.w.i<T> {
        a(c cVar) {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.concurrent.ConcurrentHashMap] */
        @Override // d.a.b.w.i
        public T a() {
            return new ConcurrentHashMap();
        }
    }

    /* loaded from: classes.dex */
    public class b implements d.a.b.w.i<T> {
        b(c cVar) {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.TreeMap, T] */
        @Override // d.a.b.w.i
        public T a() {
            return new TreeMap();
        }
    }

    /* renamed from: d.a.b.w.c$c */
    /* loaded from: classes.dex */
    public class C0108c implements d.a.b.w.i<T> {
        C0108c(c cVar) {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.LinkedHashMap, T] */
        @Override // d.a.b.w.i
        public T a() {
            return new LinkedHashMap();
        }
    }

    /* loaded from: classes.dex */
    public class d implements d.a.b.w.i<T> {
        d(c cVar) {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [T, d.a.b.w.h] */
        @Override // d.a.b.w.i
        public T a() {
            return new d.a.b.w.h();
        }
    }

    /* loaded from: classes.dex */
    public class e implements d.a.b.w.i<T> {

        /* renamed from: a */
        private final d.a.b.w.m f3759a = d.a.b.w.m.b();

        /* renamed from: b */
        final /* synthetic */ Class f3760b;

        /* renamed from: c */
        final /* synthetic */ Type f3761c;

        e(c cVar, Class cls, Type type) {
            this.f3760b = cls;
            this.f3761c = type;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
        @Override // d.a.b.w.i
        public T a() {
            try {
                return this.f3759a.c(this.f3760b);
            } catch (Exception e2) {
                throw new RuntimeException("Unable to invoke no-args constructor for " + this.f3761c + ". Registering an InstanceCreator with Gson for this type may fix this problem.", e2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class f implements d.a.b.w.i<T> {

        /* renamed from: a */
        final /* synthetic */ d.a.b.f f3762a;

        /* renamed from: b */
        final /* synthetic */ Type f3763b;

        f(c cVar, d.a.b.f fVar, Type type) {
            this.f3762a = fVar;
            this.f3763b = type;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
        @Override // d.a.b.w.i
        public T a() {
            return this.f3762a.a(this.f3763b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class g implements d.a.b.w.i<T> {

        /* renamed from: a */
        final /* synthetic */ d.a.b.f f3764a;

        /* renamed from: b */
        final /* synthetic */ Type f3765b;

        g(c cVar, d.a.b.f fVar, Type type) {
            this.f3764a = fVar;
            this.f3765b = type;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
        @Override // d.a.b.w.i
        public T a() {
            return this.f3764a.a(this.f3765b);
        }
    }

    /* loaded from: classes.dex */
    public class h implements d.a.b.w.i<T> {

        /* renamed from: a */
        final /* synthetic */ Constructor f3766a;

        h(c cVar, Constructor constructor) {
            this.f3766a = constructor;
        }

        /* JADX WARN: Type inference failed for: r0v6, types: [T, java.lang.Object] */
        @Override // d.a.b.w.i
        public T a() {
            try {
                return this.f3766a.newInstance(null);
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            } catch (InstantiationException e3) {
                throw new RuntimeException("Failed to invoke " + this.f3766a + " with no args", e3);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException("Failed to invoke " + this.f3766a + " with no args", e4.getTargetException());
            }
        }
    }

    /* loaded from: classes.dex */
    public class i implements d.a.b.w.i<T> {
        i(c cVar) {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.TreeSet] */
        @Override // d.a.b.w.i
        public T a() {
            return new TreeSet();
        }
    }

    /* loaded from: classes.dex */
    public class j implements d.a.b.w.i<T> {

        /* renamed from: a */
        final /* synthetic */ Type f3767a;

        j(c cVar, Type type) {
            this.f3767a = type;
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [T, java.util.EnumSet] */
        @Override // d.a.b.w.i
        public T a() {
            Type type = this.f3767a;
            if (!(type instanceof ParameterizedType)) {
                throw new d.a.b.k("Invalid EnumSet type: " + this.f3767a.toString());
            }
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return EnumSet.noneOf((Class) type2);
            }
            throw new d.a.b.k("Invalid EnumSet type: " + this.f3767a.toString());
        }
    }

    /* loaded from: classes.dex */
    public class k implements d.a.b.w.i<T> {
        k(c cVar) {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.LinkedHashSet] */
        @Override // d.a.b.w.i
        public T a() {
            return new LinkedHashSet();
        }
    }

    /* loaded from: classes.dex */
    public class l implements d.a.b.w.i<T> {
        l(c cVar) {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.ArrayDeque] */
        @Override // d.a.b.w.i
        public T a() {
            return new ArrayDeque();
        }
    }

    /* loaded from: classes.dex */
    public class m implements d.a.b.w.i<T> {
        m(c cVar) {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.ArrayList] */
        @Override // d.a.b.w.i
        public T a() {
            return new ArrayList();
        }
    }

    /* loaded from: classes.dex */
    public class n implements d.a.b.w.i<T> {
        n(c cVar) {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.concurrent.ConcurrentSkipListMap, T] */
        @Override // d.a.b.w.i
        public T a() {
            return new ConcurrentSkipListMap();
        }
    }

    public c(Map<Type, d.a.b.f<?>> map) {
        this.f3757a = map;
    }

    private <T> d.a.b.w.i<T> b(Class<? super T> cls) {
        try {
            Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                this.f3758b.b(declaredConstructor);
            }
            return new h(this, declaredConstructor);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private <T> d.a.b.w.i<T> c(Type type, Class<? super T> cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            return SortedSet.class.isAssignableFrom(cls) ? new i(this) : EnumSet.class.isAssignableFrom(cls) ? new j(this, type) : Set.class.isAssignableFrom(cls) ? new k(this) : Queue.class.isAssignableFrom(cls) ? new l(this) : new m(this);
        } else if (!Map.class.isAssignableFrom(cls)) {
            return null;
        } else {
            return ConcurrentNavigableMap.class.isAssignableFrom(cls) ? new n(this) : ConcurrentMap.class.isAssignableFrom(cls) ? new a(this) : SortedMap.class.isAssignableFrom(cls) ? new b(this) : (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(d.a.b.x.a.b(((ParameterizedType) type).getActualTypeArguments()[0]).c())) ? new d(this) : new C0108c(this);
        }
    }

    private <T> d.a.b.w.i<T> d(Type type, Class<? super T> cls) {
        return new e(this, cls, type);
    }

    public <T> d.a.b.w.i<T> a(d.a.b.x.a<T> aVar) {
        Type e2 = aVar.e();
        Class<? super T> c2 = aVar.c();
        d.a.b.f<?> fVar = this.f3757a.get(e2);
        if (fVar != null) {
            return new f(this, fVar, e2);
        }
        d.a.b.f<?> fVar2 = this.f3757a.get(c2);
        if (fVar2 != null) {
            return new g(this, fVar2, e2);
        }
        d.a.b.w.i<T> b2 = b(c2);
        if (b2 != null) {
            return b2;
        }
        d.a.b.w.i<T> c3 = c(e2, c2);
        return c3 != null ? c3 : d(e2, c2);
    }

    public String toString() {
        return this.f3757a.toString();
    }
}
