package j$.util.function;

import j$.util.function.Function;
import java.util.Objects;
/* loaded from: classes2.dex */
public interface BiFunction<T, U, R> {

    /* renamed from: j$.util.function.BiFunction$-CC */
    /* loaded from: classes2.dex */
    public final /* synthetic */ class CC<T, U, R> {
        public static BiFunction $default$andThen(BiFunction biFunction, Function function) {
            Objects.requireNonNull(function);
            return new j$.util.concurrent.u(biFunction, function);
        }
    }

    /* loaded from: classes2.dex */
    public final /* synthetic */ class VivifiedWrapper implements BiFunction {

        /* renamed from: a */
        final /* synthetic */ java.util.function.BiFunction f13356a;

        private /* synthetic */ VivifiedWrapper(java.util.function.BiFunction biFunction) {
            this.f13356a = biFunction;
        }

        public static /* synthetic */ BiFunction convert(java.util.function.BiFunction biFunction) {
            if (biFunction == null) {
                return null;
            }
            return biFunction instanceof Wrapper ? BiFunction.this : new VivifiedWrapper(biFunction);
        }

        @Override // j$.util.function.BiFunction
        public final /* synthetic */ BiFunction andThen(Function function) {
            return convert(this.f13356a.andThen(l.a(function)));
        }

        @Override // j$.util.function.BiFunction
        public final /* synthetic */ Object apply(Object obj, Object obj2) {
            return this.f13356a.apply(obj, obj2);
        }
    }

    /* loaded from: classes2.dex */
    public final /* synthetic */ class Wrapper implements java.util.function.BiFunction {
        private /* synthetic */ Wrapper() {
            BiFunction.this = r1;
        }

        public static /* synthetic */ java.util.function.BiFunction convert(BiFunction biFunction) {
            if (biFunction == null) {
                return null;
            }
            return biFunction instanceof VivifiedWrapper ? ((VivifiedWrapper) biFunction).f13356a : new Wrapper();
        }

        @Override // java.util.function.BiFunction
        public final /* synthetic */ java.util.function.BiFunction andThen(java.util.function.Function function) {
            return convert(BiFunction.this.andThen(Function.VivifiedWrapper.convert(function)));
        }

        @Override // java.util.function.BiFunction
        public final /* synthetic */ Object apply(Object obj, Object obj2) {
            return BiFunction.this.apply(obj, obj2);
        }
    }

    <V> BiFunction<T, U, V> andThen(Function<? super R, ? extends V> function);

    R apply(T t10, U u10);
}
