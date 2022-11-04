package androidx.room;
/* loaded from: classes.dex */
public abstract class c<T> extends p {
    public c(j jVar) {
        super(jVar);
    }

    protected abstract void g(b.o.a.f fVar, T t);

    public final void h(Iterable<? extends T> iterable) {
        b.o.a.f a2 = a();
        try {
            for (T t : iterable) {
                g(a2, t);
                a2.T();
            }
        } finally {
            f(a2);
        }
    }

    public final long i(T t) {
        b.o.a.f a2 = a();
        try {
            g(a2, t);
            return a2.T();
        } finally {
            f(a2);
        }
    }
}
