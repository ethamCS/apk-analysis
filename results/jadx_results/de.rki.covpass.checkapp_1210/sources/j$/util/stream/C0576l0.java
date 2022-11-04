package j$.util.stream;

import j$.util.AbstractC0511j;
import j$.util.function.BiConsumer;
import j$.util.function.C0500b;
import j$.util.stream.Stream;
import java.util.IntSummaryStatistics;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.function.BiConsumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;
/* renamed from: j$.util.stream.l0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0576l0 implements java.util.stream.IntStream {

    /* renamed from: a */
    final /* synthetic */ IntStream f13732a;

    private /* synthetic */ C0576l0(IntStream intStream) {
        this.f13732a = intStream;
    }

    public static /* synthetic */ java.util.stream.IntStream I(IntStream intStream) {
        if (intStream == null) {
            return null;
        }
        return new C0576l0(intStream);
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ boolean allMatch(IntPredicate intPredicate) {
        return this.f13732a.r(C0500b.w(intPredicate));
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ boolean anyMatch(IntPredicate intPredicate) {
        return this.f13732a.b(C0500b.w(intPredicate));
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ DoubleStream asDoubleStream() {
        return H.I(this.f13732a.asDoubleStream());
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ LongStream asLongStream() {
        return C0612t0.I(this.f13732a.asLongStream());
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ OptionalDouble average() {
        return AbstractC0511j.b(this.f13732a.average());
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ java.util.stream.Stream boxed() {
        return Stream.Wrapper.convert(this.f13732a.boxed());
    }

    @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f13732a.close();
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ Object collect(Supplier supplier, ObjIntConsumer objIntConsumer, BiConsumer biConsumer) {
        return this.f13732a.G(C0500b.y(supplier), objIntConsumer == null ? null : new C0500b(objIntConsumer), BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ long count() {
        return this.f13732a.count();
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ java.util.stream.IntStream distinct() {
        return I(this.f13732a.distinct());
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ java.util.stream.IntStream filter(IntPredicate intPredicate) {
        return I(this.f13732a.z(C0500b.w(intPredicate)));
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ OptionalInt findAny() {
        return AbstractC0511j.c(this.f13732a.findAny());
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ OptionalInt findFirst() {
        return AbstractC0511j.c(this.f13732a.findFirst());
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ java.util.stream.IntStream flatMap(IntFunction intFunction) {
        return I(this.f13732a.s(C0500b.v(intFunction)));
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ void forEach(IntConsumer intConsumer) {
        this.f13732a.forEach(j$.util.function.o.b(intConsumer));
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ void forEachOrdered(IntConsumer intConsumer) {
        this.f13732a.o(j$.util.function.o.b(intConsumer));
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return this.f13732a.isParallel();
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ java.util.stream.IntStream limit(long j10) {
        return I(this.f13732a.limit(j10));
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ java.util.stream.IntStream map(IntUnaryOperator intUnaryOperator) {
        return I(this.f13732a.l(intUnaryOperator == null ? null : new C0500b(intUnaryOperator)));
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ DoubleStream mapToDouble(IntToDoubleFunction intToDoubleFunction) {
        return H.I(this.f13732a.w(intToDoubleFunction == null ? null : new C0500b(intToDoubleFunction)));
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ LongStream mapToLong(IntToLongFunction intToLongFunction) {
        return C0612t0.I(this.f13732a.f(intToLongFunction == null ? null : new C0500b(intToLongFunction)));
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ java.util.stream.Stream mapToObj(IntFunction intFunction) {
        return Stream.Wrapper.convert(this.f13732a.p(C0500b.v(intFunction)));
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ OptionalInt max() {
        return AbstractC0511j.c(this.f13732a.max());
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ OptionalInt min() {
        return AbstractC0511j.c(this.f13732a.min());
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ boolean noneMatch(IntPredicate intPredicate) {
        return this.f13732a.u(C0500b.w(intPredicate));
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.stream.IntStream, java.util.stream.BaseStream] */
    @Override // java.util.stream.BaseStream
    public final /* synthetic */ java.util.stream.IntStream onClose(Runnable runnable) {
        return C0550g.I(this.f13732a.onClose(runnable));
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ java.util.stream.IntStream peek(IntConsumer intConsumer) {
        return I(this.f13732a.C(j$.util.function.o.b(intConsumer)));
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ int reduce(int i10, IntBinaryOperator intBinaryOperator) {
        return this.f13732a.q(i10, intBinaryOperator == null ? null : new C0500b(intBinaryOperator));
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ java.util.stream.IntStream skip(long j10) {
        return I(this.f13732a.skip(j10));
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ java.util.stream.IntStream sorted() {
        return I(this.f13732a.sorted());
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ int sum() {
        return this.f13732a.sum();
    }

    @Override // java.util.stream.IntStream
    public final IntSummaryStatistics summaryStatistics() {
        this.f13732a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert to java.util.IntSummaryStatistics");
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ int[] toArray() {
        return this.f13732a.toArray();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.stream.IntStream, java.util.stream.BaseStream] */
    @Override // java.util.stream.BaseStream
    public final /* synthetic */ java.util.stream.IntStream unordered() {
        return C0550g.I(this.f13732a.unordered());
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ OptionalInt reduce(IntBinaryOperator intBinaryOperator) {
        return AbstractC0511j.c(this.f13732a.B(intBinaryOperator == null ? null : new C0500b(intBinaryOperator)));
    }
}
