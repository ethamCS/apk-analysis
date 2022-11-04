package j$.util.stream;

import j$.util.function.BiConsumer;
import j$.util.function.BinaryOperator;
/* loaded from: classes2.dex */
final class O1 extends AbstractC0523a2 {

    /* renamed from: b */
    final /* synthetic */ BinaryOperator f13515b;

    /* renamed from: c */
    final /* synthetic */ BiConsumer f13516c;

    /* renamed from: d */
    final /* synthetic */ j$.util.function.I f13517d;

    /* renamed from: e */
    final /* synthetic */ Collector f13518e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O1(int i10, BinaryOperator binaryOperator, BiConsumer biConsumer, j$.util.function.I i11, Collector collector) {
        super(i10);
        this.f13515b = binaryOperator;
        this.f13516c = biConsumer;
        this.f13517d = i11;
        this.f13518e = collector;
    }

    @Override // j$.util.stream.AbstractC0523a2
    public final Y1 a() {
        return new P1(this.f13517d, this.f13516c, this.f13515b);
    }

    @Override // j$.util.stream.AbstractC0523a2, j$.util.stream.M3
    public final int b() {
        if (this.f13518e.characteristics().contains(EnumC0560i.UNORDERED)) {
            return EnumC0539d3.f13665r;
        }
        return 0;
    }
}
