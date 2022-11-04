package j$.util.stream;

import j$.util.function.BiConsumer;
import j$.util.function.BinaryOperator;
import j$.util.function.Function;
import java.util.Set;
/* loaded from: classes2.dex */
public interface Collector<T, A, R> {
    BiConsumer a();

    BinaryOperator b();

    j$.util.function.I c();

    Set characteristics();

    Function d();
}
