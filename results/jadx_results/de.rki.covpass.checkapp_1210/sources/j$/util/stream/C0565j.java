package j$.util.stream;

import j$.util.function.BiConsumer;
import j$.util.function.BinaryOperator;
import j$.util.function.C0500b;
import j$.util.function.Function;
import java.util.Set;
/* renamed from: j$.util.stream.j */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0565j implements Collector {

    /* renamed from: a */
    final /* synthetic */ java.util.stream.Collector f13707a;

    private /* synthetic */ C0565j(java.util.stream.Collector collector) {
        this.f13707a = collector;
    }

    public static /* synthetic */ Collector e(java.util.stream.Collector collector) {
        if (collector == null) {
            return null;
        }
        return new C0565j(collector);
    }

    @Override // j$.util.stream.Collector
    public final /* synthetic */ BiConsumer a() {
        return BiConsumer.VivifiedWrapper.convert(this.f13707a.accumulator());
    }

    @Override // j$.util.stream.Collector
    public final /* synthetic */ BinaryOperator b() {
        return C0500b.t(this.f13707a.combiner());
    }

    @Override // j$.util.stream.Collector
    public final /* synthetic */ j$.util.function.I c() {
        return C0500b.y(this.f13707a.supplier());
    }

    @Override // j$.util.stream.Collector
    public final /* synthetic */ Set characteristics() {
        return this.f13707a.characteristics();
    }

    @Override // j$.util.stream.Collector
    public final /* synthetic */ Function d() {
        return Function.VivifiedWrapper.convert(this.f13707a.finisher());
    }
}
