package d.a.b.x;

import d.a.b.w.b;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
/* loaded from: classes.dex */
public class a<T> {

    /* renamed from: a */
    final Class<? super T> f3889a;

    /* renamed from: b */
    final Type f3890b;

    /* renamed from: c */
    final int f3891c;

    protected a() {
        Type d2 = d(a.class);
        this.f3890b = d2;
        this.f3889a = (Class<? super T>) b.k(d2);
        this.f3891c = d2.hashCode();
    }

    a(Type type) {
        d.a.b.w.a.b(type);
        Type b2 = b.b(type);
        this.f3890b = b2;
        this.f3889a = (Class<? super T>) b.k(b2);
        this.f3891c = b2.hashCode();
    }

    public static <T> a<T> a(Class<T> cls) {
        return new a<>(cls);
    }

    public static a<?> b(Type type) {
        return new a<>(type);
    }

    static Type d(Class<?> cls) {
        Type genericSuperclass = cls.getGenericSuperclass();
        if (!(genericSuperclass instanceof Class)) {
            return b.b(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
        }
        throw new RuntimeException("Missing type parameter.");
    }

    public final Class<? super T> c() {
        return this.f3889a;
    }

    public final Type e() {
        return this.f3890b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a) && b.f(this.f3890b, ((a) obj).f3890b);
    }

    public final int hashCode() {
        return this.f3891c;
    }

    public final String toString() {
        return b.u(this.f3890b);
    }
}
