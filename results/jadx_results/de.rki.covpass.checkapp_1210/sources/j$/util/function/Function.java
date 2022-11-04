package j$.util.function;
/* loaded from: classes2.dex */
public interface Function<T, R> {

    /* renamed from: j$.util.function.Function$-CC */
    /* loaded from: classes2.dex */
    public final /* synthetic */ class CC<T, R> {
    }

    /* loaded from: classes2.dex */
    public final /* synthetic */ class VivifiedWrapper implements Function {

        /* renamed from: a */
        final /* synthetic */ java.util.function.Function f13359a;

        private /* synthetic */ VivifiedWrapper(java.util.function.Function function) {
            this.f13359a = function;
        }

        public static /* synthetic */ Function convert(java.util.function.Function function) {
            if (function == null) {
                return null;
            }
            return function instanceof l ? ((l) function).f13376a : new VivifiedWrapper(function);
        }

        @Override // j$.util.function.Function
        public final /* synthetic */ Function andThen(Function function) {
            return convert(this.f13359a.andThen(l.a(function)));
        }

        @Override // j$.util.function.Function
        public final /* synthetic */ Object apply(Object obj) {
            return this.f13359a.apply(obj);
        }

        @Override // j$.util.function.Function
        public final /* synthetic */ Function compose(Function function) {
            return convert(this.f13359a.compose(l.a(function)));
        }
    }

    <V> Function<T, V> andThen(Function<? super R, ? extends V> function);

    R apply(T t10);

    <V> Function<V, R> compose(Function<? super V, ? extends T> function);
}
