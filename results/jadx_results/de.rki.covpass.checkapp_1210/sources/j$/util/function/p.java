package j$.util.function;
/* loaded from: classes2.dex */
public final /* synthetic */ class p implements java.util.function.IntConsumer {

    /* renamed from: a */
    final /* synthetic */ IntConsumer f13380a;

    private /* synthetic */ p(IntConsumer intConsumer) {
        this.f13380a = intConsumer;
    }

    public static /* synthetic */ java.util.function.IntConsumer a(IntConsumer intConsumer) {
        if (intConsumer == null) {
            return null;
        }
        return intConsumer instanceof o ? ((o) intConsumer).f13379a : new p(intConsumer);
    }

    @Override // java.util.function.IntConsumer
    public final /* synthetic */ void accept(int i10) {
        this.f13380a.accept(i10);
    }

    @Override // java.util.function.IntConsumer
    public final /* synthetic */ java.util.function.IntConsumer andThen(java.util.function.IntConsumer intConsumer) {
        IntConsumer andThen = this.f13380a.andThen(o.b(intConsumer));
        if (andThen == null) {
            return null;
        }
        return andThen instanceof o ? ((o) andThen).f13379a : new p(andThen);
    }
}
