package j$.util.function;
/* loaded from: classes2.dex */
public interface ToDoubleFunction<T> {

    /* loaded from: classes2.dex */
    public final /* synthetic */ class VivifiedWrapper implements ToDoubleFunction {

        /* renamed from: a */
        final /* synthetic */ java.util.function.ToDoubleFunction f13365a;

        private /* synthetic */ VivifiedWrapper(java.util.function.ToDoubleFunction toDoubleFunction) {
            this.f13365a = toDoubleFunction;
        }

        public static /* synthetic */ ToDoubleFunction convert(java.util.function.ToDoubleFunction toDoubleFunction) {
            if (toDoubleFunction == null) {
                return null;
            }
            return new VivifiedWrapper(toDoubleFunction);
        }

        @Override // j$.util.function.ToDoubleFunction
        public final /* synthetic */ double m(Object obj) {
            return this.f13365a.applyAsDouble(obj);
        }
    }

    double m(Object obj);
}
