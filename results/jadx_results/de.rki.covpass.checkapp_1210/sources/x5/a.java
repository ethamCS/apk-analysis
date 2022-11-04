package x5;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;
/* loaded from: classes.dex */
public interface a<V> extends Future<V> {
    void b(Runnable runnable, Executor executor);
}
