package j$.util.function;
/* loaded from: classes2.dex */
public final /* synthetic */ class o implements IntConsumer {

    /* renamed from: a */
    final /* synthetic */ java.util.function.IntConsumer f13379a;

    private /* synthetic */ o(java.util.function.IntConsumer intConsumer) {
        this.f13379a = intConsumer;
    }

    public static /* synthetic */ IntConsumer b(java.util.function.IntConsumer intConsumer) {
        if (intConsumer == null) {
            return null;
        }
        return intConsumer instanceof p ? ((p) intConsumer).f13380a : new o(intConsumer);
    }

    @Override // j$.util.function.IntConsumer
    public final /* synthetic */ void accept(int i10) {
        this.f13379a.accept(i10);
    }

    @Override // j$.util.function.IntConsumer
    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return b(this.f13379a.andThen(p.a(intConsumer)));
    }
}
