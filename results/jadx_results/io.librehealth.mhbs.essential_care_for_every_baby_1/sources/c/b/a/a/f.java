package c.b.a.a;

import java.io.Serializable;
/* loaded from: classes.dex */
public abstract class f<T> implements Serializable {
    public static <T> f<T> a() {
        return b.e();
    }

    public static <T> f<T> b(T t) {
        i.h(t);
        return new j(t);
    }

    public abstract T c(T t);

    public abstract T d();
}
