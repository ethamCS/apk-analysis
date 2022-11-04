package c.b.b.x;

import c.b.b.w.b;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
/* loaded from: classes.dex */
public class a<T> {

    /* renamed from: a */
    final Class<? super T> f590a;

    /* renamed from: b */
    final Type f591b;

    /* renamed from: c */
    final int f592c;

    protected a() {
        Type d2 = d(a.class);
        this.f591b = d2;
        this.f590a = (Class<? super T>) b.k(d2);
        this.f592c = d2.hashCode();
    }

    a(Type type) {
        c.b.b.w.a.b(type);
        Type b2 = b.b(type);
        this.f591b = b2;
        this.f590a = (Class<? super T>) b.k(b2);
        this.f592c = b2.hashCode();
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
        return this.f590a;
    }

    public final Type e() {
        return this.f591b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a) && b.f(this.f591b, ((a) obj).f591b);
    }

    public final int hashCode() {
        return this.f592c;
    }

    public final String toString() {
        return b.u(this.f591b);
    }
}
