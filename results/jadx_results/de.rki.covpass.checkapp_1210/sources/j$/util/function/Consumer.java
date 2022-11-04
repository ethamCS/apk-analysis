package j$.util.function;
/* loaded from: classes2.dex */
public interface Consumer<T> {

    /* loaded from: classes2.dex */
    public final /* synthetic */ class VivifiedWrapper implements Consumer {

        /* renamed from: a */
        final /* synthetic */ java.util.function.Consumer f13358a;

        private /* synthetic */ VivifiedWrapper(java.util.function.Consumer consumer) {
            this.f13358a = consumer;
        }

        public static /* synthetic */ Consumer convert(java.util.function.Consumer consumer) {
            if (consumer == null) {
                return null;
            }
            return new VivifiedWrapper(consumer);
        }

        @Override // j$.util.function.Consumer
        public final /* synthetic */ void h(Object obj) {
            this.f13358a.accept(obj);
        }
    }

    void h(Object obj);
}
