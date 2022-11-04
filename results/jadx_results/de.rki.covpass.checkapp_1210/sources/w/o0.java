package w;

import java.util.Set;
/* loaded from: classes.dex */
public interface o0 {

    /* loaded from: classes.dex */
    public static abstract class a<T> {
        public static <T> a<T> a(String str, Class<?> cls) {
            return b(str, cls, null);
        }

        public static <T> a<T> b(String str, Class<?> cls, Object obj) {
            return new w.b(str, cls, obj);
        }

        public abstract String c();

        public abstract Object d();

        public abstract Class<T> e();
    }

    /* loaded from: classes.dex */
    public interface b {
        boolean a(a<?> aVar);
    }

    /* loaded from: classes.dex */
    public enum c {
        ALWAYS_OVERRIDE,
        REQUIRED,
        OPTIONAL
    }

    <ValueT> ValueT a(a<ValueT> aVar, ValueT valuet);

    <ValueT> ValueT b(a<ValueT> aVar);

    Set<a<?>> c();

    c d(a<?> aVar);

    boolean e(a<?> aVar);

    <ValueT> ValueT t(a<ValueT> aVar, c cVar);

    void v(String str, b bVar);

    Set<c> x(a<?> aVar);
}
