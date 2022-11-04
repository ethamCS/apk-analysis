package j$.util.stream;

import j$.util.function.BiConsumer;
import j$.util.function.BinaryOperator;
import j$.util.function.Function;
import java.util.Set;
/* renamed from: j$.util.stream.n */
/* loaded from: classes2.dex */
final class C0585n implements Collector {

    /* renamed from: a */
    private final j$.util.function.I f13751a;

    /* renamed from: b */
    private final Set f13752b;

    public C0585n(j$.util.function.I i10, Set set) {
        this.f13751a = i10;
        this.f13752b = set;
    }

    @Override // j$.util.stream.Collector
    public final BiConsumer a() {
        return C0520a.f13591b;
    }

    @Override // j$.util.stream.Collector
    public final BinaryOperator b() {
        return C0520a.f13592c;
    }

    @Override // j$.util.stream.Collector
    public final j$.util.function.I c() {
        return this.f13751a;
    }

    @Override // j$.util.stream.Collector
    public final Set characteristics() {
        return this.f13752b;
    }

    @Override // j$.util.stream.Collector
    public final Function d() {
        return C0520a.f13593d;
    }
}
