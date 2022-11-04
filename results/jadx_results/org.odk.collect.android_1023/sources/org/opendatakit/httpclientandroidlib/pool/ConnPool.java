package org.opendatakit.httpclientandroidlib.pool;

import java.util.concurrent.Future;
import org.opendatakit.httpclientandroidlib.concurrent.FutureCallback;
/* loaded from: classes.dex */
public interface ConnPool<T, E> {
    Future<E> lease(T t, Object obj, FutureCallback<E> futureCallback);

    void release(E e, boolean z);
}
