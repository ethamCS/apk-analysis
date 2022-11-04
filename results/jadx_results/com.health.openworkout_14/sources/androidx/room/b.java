package androidx.room;
/* loaded from: classes.dex */
public abstract class b<T> extends p {
    public b(j jVar) {
        super(jVar);
    }

    protected abstract void g(b.o.a.f fVar, T t);

    public final int h(T t) {
        b.o.a.f a2 = a();
        try {
            g(a2, t);
            return a2.C();
        } finally {
            f(a2);
        }
    }
}
