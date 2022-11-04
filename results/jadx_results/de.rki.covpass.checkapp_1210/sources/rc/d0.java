package rc;

import java.lang.ref.SoftReference;
/* loaded from: classes.dex */
public class d0 {

    /* loaded from: classes.dex */
    public static class a<T> extends c<T> implements gc.a<T> {

        /* renamed from: d */
        private final gc.a<T> f20598d;

        /* renamed from: q */
        private volatile SoftReference<Object> f20599q;

        public a(T t10, gc.a<T> aVar) {
            if (aVar == null) {
                d(0);
            }
            this.f20599q = null;
            this.f20598d = aVar;
            if (t10 != null) {
                this.f20599q = new SoftReference<>(a(t10));
            }
        }

        private static /* synthetic */ void d(int i10) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal", "<init>"));
        }

        @Override // rc.d0.c, gc.a
        public T invoke() {
            Object obj;
            SoftReference<Object> softReference = this.f20599q;
            if (softReference == null || (obj = softReference.get()) == null) {
                T invoke = this.f20598d.invoke();
                this.f20599q = new SoftReference<>(a(invoke));
                return invoke;
            }
            return c(obj);
        }
    }

    /* loaded from: classes.dex */
    public static class b<T> extends c<T> {

        /* renamed from: d */
        private final gc.a<T> f20600d;

        /* renamed from: q */
        private volatile Object f20601q;

        public b(gc.a<T> aVar) {
            if (aVar == null) {
                d(0);
            }
            this.f20601q = null;
            this.f20600d = aVar;
        }

        private static /* synthetic */ void d(int i10) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties$LazyVal", "<init>"));
        }

        @Override // rc.d0.c, gc.a
        public T invoke() {
            Object obj = this.f20601q;
            if (obj != null) {
                return c(obj);
            }
            T invoke = this.f20600d.invoke();
            this.f20601q = a(invoke);
            return invoke;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c<T> {

        /* renamed from: c */
        private static final Object f20602c = new a();

        /* loaded from: classes.dex */
        static class a {
            a() {
            }
        }

        protected Object a(T t10) {
            return t10 == null ? f20602c : t10;
        }

        public final T b(Object obj, Object obj2) {
            return invoke();
        }

        /* JADX WARN: Multi-variable type inference failed */
        protected T c(Object obj) {
            if (obj == f20602c) {
                return null;
            }
            return obj;
        }

        public abstract T invoke();
    }

    private static /* synthetic */ void a(int i10) {
        Object[] objArr = new Object[3];
        objArr[0] = "initializer";
        objArr[1] = "kotlin/reflect/jvm/internal/ReflectProperties";
        if (i10 == 1 || i10 == 2) {
            objArr[2] = "lazySoft";
        } else {
            objArr[2] = "lazy";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static <T> b<T> b(gc.a<T> aVar) {
        if (aVar == null) {
            a(0);
        }
        return new b<>(aVar);
    }

    public static <T> a<T> c(gc.a<T> aVar) {
        if (aVar == null) {
            a(2);
        }
        return d(null, aVar);
    }

    public static <T> a<T> d(T t10, gc.a<T> aVar) {
        if (aVar == null) {
            a(1);
        }
        return new a<>(t10, aVar);
    }
}
