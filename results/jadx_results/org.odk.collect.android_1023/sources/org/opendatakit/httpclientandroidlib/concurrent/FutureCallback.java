package org.opendatakit.httpclientandroidlib.concurrent;
/* loaded from: classes.dex */
public interface FutureCallback<T> {
    void cancelled();

    void completed(T t);

    void failed(Exception exc);
}
