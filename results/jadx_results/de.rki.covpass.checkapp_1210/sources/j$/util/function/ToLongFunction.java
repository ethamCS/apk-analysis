package j$.util.function;
/* loaded from: classes2.dex */
public interface ToLongFunction<T> {

    /* loaded from: classes2.dex */
    public final /* synthetic */ class VivifiedWrapper implements ToLongFunction {

        /* renamed from: a */
        final /* synthetic */ java.util.function.ToLongFunction f13367a;

        private /* synthetic */ VivifiedWrapper(java.util.function.ToLongFunction toLongFunction) {
            this.f13367a = toLongFunction;
        }

        public static /* synthetic */ ToLongFunction convert(java.util.function.ToLongFunction toLongFunction) {
            if (toLongFunction == null) {
                return null;
            }
            return new VivifiedWrapper(toLongFunction);
        }

        @Override // j$.util.function.ToLongFunction
        public final /* synthetic */ long applyAsLong(Object obj) {
            return this.f13367a.applyAsLong(obj);
        }
    }

    long applyAsLong(T t10);
}
