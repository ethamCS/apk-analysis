package j$.util.concurrent;

import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.Function;
import java.util.Objects;
import java.util.concurrent.ConcurrentMap;
/* loaded from: classes2.dex */
public final /* synthetic */ class u implements BiConsumer, BiFunction {

    /* renamed from: a */
    public final /* synthetic */ BiFunction f13340a;

    /* renamed from: b */
    public final /* synthetic */ Object f13341b;

    public /* synthetic */ u(BiFunction biFunction, Function function) {
        this.f13340a = biFunction;
        this.f13341b = function;
    }

    public /* synthetic */ u(ConcurrentMap concurrentMap, BiFunction biFunction) {
        this.f13341b = concurrentMap;
        this.f13340a = biFunction;
    }

    @Override // j$.util.function.BiFunction
    public final /* synthetic */ BiFunction andThen(Function function) {
        return Objects.requireNonNull(function);
    }

    @Override // j$.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        return ((Function) this.f13341b).apply(this.f13340a.apply(obj, obj2));
    }

    @Override // j$.util.function.BiConsumer
    public final void w(Object obj, Object obj2) {
        ConcurrentMap concurrentMap = (ConcurrentMap) this.f13341b;
        BiFunction biFunction = this.f13340a;
        while (!concurrentMap.replace(obj, obj2, biFunction.apply(obj, obj2)) && (obj2 = concurrentMap.get(obj)) != null) {
        }
    }
}
