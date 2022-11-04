package w;

import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public interface s1<T> {

    /* loaded from: classes.dex */
    public interface a<T> {
        void a(Throwable th2);

        void b(T t10);
    }

    void a(Executor executor, a<? super T> aVar);

    void b(a<? super T> aVar);
}
