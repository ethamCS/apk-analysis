package j$.util.stream;

import j$.util.AbstractC0511j;
import j$.util.C0509h;
import j$.util.C0512k;
import j$.util.C0514m;
import j$.util.C0641v;
import j$.util.function.BiConsumer;
import j$.util.function.C0500b;
import j$.util.stream.Stream;
import java.util.Iterator;
import java.util.LongSummaryStatistics;
import java.util.Objects;
import java.util.OptionalDouble;
import java.util.OptionalLong;
import java.util.function.BiConsumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongPredicate;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.LongUnaryOperator;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;
/* renamed from: j$.util.stream.t0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0612t0 implements LongStream {

    /* renamed from: a */
    final /* synthetic */ AbstractC0616u0 f13792a;

    private /* synthetic */ C0612t0(AbstractC0616u0 abstractC0616u0) {
        this.f13792a = abstractC0616u0;
    }

    public static /* synthetic */ LongStream I(AbstractC0616u0 abstractC0616u0) {
        if (abstractC0616u0 == null) {
            return null;
        }
        return new C0612t0(abstractC0616u0);
    }

    @Override // java.util.stream.LongStream
    public final boolean allMatch(LongPredicate longPredicate) {
        AbstractC0616u0 abstractC0616u0 = this.f13792a;
        j$.util.function.z x10 = C0500b.x(longPredicate);
        AbstractC0608s0 abstractC0608s0 = (AbstractC0608s0) abstractC0616u0;
        Objects.requireNonNull(abstractC0608s0);
        return ((Boolean) abstractC0608s0.X0(D0.O0(x10, A0.ALL))).booleanValue();
    }

    @Override // java.util.stream.LongStream
    public final boolean anyMatch(LongPredicate longPredicate) {
        AbstractC0616u0 abstractC0616u0 = this.f13792a;
        j$.util.function.z x10 = C0500b.x(longPredicate);
        AbstractC0608s0 abstractC0608s0 = (AbstractC0608s0) abstractC0616u0;
        Objects.requireNonNull(abstractC0608s0);
        return ((Boolean) abstractC0608s0.X0(D0.O0(x10, A0.ANY))).booleanValue();
    }

    @Override // java.util.stream.LongStream
    public final DoubleStream asDoubleStream() {
        AbstractC0608s0 abstractC0608s0 = (AbstractC0608s0) this.f13792a;
        Objects.requireNonNull(abstractC0608s0);
        return H.I(new C(abstractC0608s0, 3, EnumC0539d3.f13663p | EnumC0539d3.f13661n, 2));
    }

    @Override // java.util.stream.LongStream
    public final OptionalDouble average() {
        long[] jArr = (long[]) ((AbstractC0608s0) this.f13792a).n1(C0581m0.f13745a, C0575l.f13726i, M.f13498b);
        return AbstractC0511j.b(jArr[0] > 0 ? C0512k.d(jArr[1] / jArr[0]) : C0512k.a());
    }

    @Override // java.util.stream.LongStream
    public final java.util.stream.Stream boxed() {
        return Stream.Wrapper.convert(((AbstractC0608s0) this.f13792a).p1(C0520a.f13608s));
    }

    @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        ((AbstractC0530c) this.f13792a).close();
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer) {
        return ((AbstractC0608s0) this.f13792a).n1(C0500b.y(supplier), objLongConsumer == null ? null : new C0500b(objLongConsumer), BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    @Override // java.util.stream.LongStream
    public final long count() {
        return ((AbstractC0608s0) ((AbstractC0608s0) this.f13792a).o1(C0520a.f13609t)).sum();
    }

    @Override // java.util.stream.LongStream
    public final LongStream distinct() {
        return I(((AbstractC0563i2) ((AbstractC0563i2) ((AbstractC0608s0) this.f13792a).p1(C0520a.f13608s)).distinct()).E(C0520a.f13606q));
    }

    @Override // java.util.stream.LongStream
    public final LongStream filter(LongPredicate longPredicate) {
        AbstractC0616u0 abstractC0616u0 = this.f13792a;
        j$.util.function.z x10 = C0500b.x(longPredicate);
        AbstractC0608s0 abstractC0608s0 = (AbstractC0608s0) abstractC0616u0;
        Objects.requireNonNull(abstractC0608s0);
        Objects.requireNonNull(x10);
        return I(new B(abstractC0608s0, 3, EnumC0539d3.f13667t, x10, 4));
    }

    @Override // java.util.stream.LongStream
    public final OptionalLong findAny() {
        AbstractC0608s0 abstractC0608s0 = (AbstractC0608s0) this.f13792a;
        Objects.requireNonNull(abstractC0608s0);
        return AbstractC0511j.d((C0514m) abstractC0608s0.X0(new N(false, 3, C0514m.a(), C0595p.f13764c, L.f13486a)));
    }

    @Override // java.util.stream.LongStream
    public final OptionalLong findFirst() {
        AbstractC0608s0 abstractC0608s0 = (AbstractC0608s0) this.f13792a;
        Objects.requireNonNull(abstractC0608s0);
        return AbstractC0511j.d((C0514m) abstractC0608s0.X0(new N(true, 3, C0514m.a(), C0595p.f13764c, L.f13486a)));
    }

    @Override // java.util.stream.LongStream
    public final LongStream flatMap(LongFunction longFunction) {
        AbstractC0616u0 abstractC0616u0 = this.f13792a;
        C0500b c0500b = longFunction == null ? null : new C0500b(longFunction);
        AbstractC0608s0 abstractC0608s0 = (AbstractC0608s0) abstractC0616u0;
        Objects.requireNonNull(abstractC0608s0);
        return I(new B(abstractC0608s0, 3, EnumC0539d3.f13663p | EnumC0539d3.f13661n | EnumC0539d3.f13667t, c0500b, 3));
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ void forEach(LongConsumer longConsumer) {
        this.f13792a.d(j$.util.function.w.b(longConsumer));
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ void forEachOrdered(LongConsumer longConsumer) {
        this.f13792a.A(j$.util.function.w.b(longConsumer));
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return ((AbstractC0530c) this.f13792a).isParallel();
    }

    @Override // java.util.stream.LongStream, java.util.stream.BaseStream
    /* renamed from: iterator */
    public final Iterator<Long> iterator2() {
        return C0641v.a(j$.util.U.h(((AbstractC0608s0) this.f13792a).spliterator()));
    }

    @Override // java.util.stream.LongStream
    public final LongStream limit(long j10) {
        AbstractC0608s0 abstractC0608s0 = (AbstractC0608s0) this.f13792a;
        Objects.requireNonNull(abstractC0608s0);
        if (j10 >= 0) {
            return I(D0.N0(abstractC0608s0, 0L, j10));
        }
        throw new IllegalArgumentException(Long.toString(j10));
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ LongStream map(LongUnaryOperator longUnaryOperator) {
        return I(((AbstractC0608s0) this.f13792a).o1(longUnaryOperator == null ? null : new C0500b(longUnaryOperator)));
    }

    @Override // java.util.stream.LongStream
    public final DoubleStream mapToDouble(LongToDoubleFunction longToDoubleFunction) {
        AbstractC0616u0 abstractC0616u0 = this.f13792a;
        C0500b c0500b = longToDoubleFunction == null ? null : new C0500b(longToDoubleFunction);
        AbstractC0608s0 abstractC0608s0 = (AbstractC0608s0) abstractC0616u0;
        Objects.requireNonNull(abstractC0608s0);
        Objects.requireNonNull(c0500b);
        return H.I(new C0631y(abstractC0608s0, 3, EnumC0539d3.f13663p | EnumC0539d3.f13661n, c0500b, 5));
    }

    @Override // java.util.stream.LongStream
    public final java.util.stream.IntStream mapToInt(LongToIntFunction longToIntFunction) {
        AbstractC0616u0 abstractC0616u0 = this.f13792a;
        C0500b c0500b = longToIntFunction == null ? null : new C0500b(longToIntFunction);
        AbstractC0608s0 abstractC0608s0 = (AbstractC0608s0) abstractC0616u0;
        Objects.requireNonNull(abstractC0608s0);
        Objects.requireNonNull(c0500b);
        return C0576l0.I(new A(abstractC0608s0, 3, EnumC0539d3.f13663p | EnumC0539d3.f13661n, c0500b, 5));
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ java.util.stream.Stream mapToObj(LongFunction longFunction) {
        return Stream.Wrapper.convert(((AbstractC0608s0) this.f13792a).p1(longFunction == null ? null : new C0500b(longFunction)));
    }

    @Override // java.util.stream.LongStream
    public final OptionalLong max() {
        return AbstractC0511j.d(((AbstractC0608s0) this.f13792a).r1(C0575l.f13727j));
    }

    @Override // java.util.stream.LongStream
    public final OptionalLong min() {
        return AbstractC0511j.d(((AbstractC0608s0) this.f13792a).r1(C0580m.f13741g));
    }

    @Override // java.util.stream.LongStream
    public final boolean noneMatch(LongPredicate longPredicate) {
        AbstractC0616u0 abstractC0616u0 = this.f13792a;
        j$.util.function.z x10 = C0500b.x(longPredicate);
        AbstractC0608s0 abstractC0608s0 = (AbstractC0608s0) abstractC0616u0;
        Objects.requireNonNull(abstractC0608s0);
        return ((Boolean) abstractC0608s0.X0(D0.O0(x10, A0.NONE))).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.stream.LongStream, java.util.stream.BaseStream] */
    @Override // java.util.stream.BaseStream
    public final /* synthetic */ LongStream onClose(Runnable runnable) {
        AbstractC0530c abstractC0530c = (AbstractC0530c) this.f13792a;
        abstractC0530c.onClose(runnable);
        return C0550g.I(abstractC0530c);
    }

    @Override // java.util.stream.LongStream
    public final LongStream peek(LongConsumer longConsumer) {
        AbstractC0616u0 abstractC0616u0 = this.f13792a;
        j$.util.function.x b10 = j$.util.function.w.b(longConsumer);
        AbstractC0608s0 abstractC0608s0 = (AbstractC0608s0) abstractC0616u0;
        Objects.requireNonNull(abstractC0608s0);
        Objects.requireNonNull(b10);
        return I(new B(abstractC0608s0, 3, 0, b10, 5));
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ long reduce(long j10, LongBinaryOperator longBinaryOperator) {
        return ((AbstractC0608s0) this.f13792a).q1(j10, longBinaryOperator == null ? null : new C0500b(longBinaryOperator));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [j$.util.stream.u0] */
    @Override // java.util.stream.LongStream
    public final LongStream skip(long j10) {
        AbstractC0608s0 abstractC0608s0 = (AbstractC0608s0) this.f13792a;
        Objects.requireNonNull(abstractC0608s0);
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        AbstractC0608s0 abstractC0608s02 = abstractC0608s0;
        if (i10 >= 0) {
            if (i10 != 0) {
                abstractC0608s02 = D0.N0(abstractC0608s0, j10, -1L);
            }
            return I(abstractC0608s02);
        }
        throw new IllegalArgumentException(Long.toString(j10));
    }

    @Override // java.util.stream.LongStream
    public final LongStream sorted() {
        AbstractC0608s0 abstractC0608s0 = (AbstractC0608s0) this.f13792a;
        Objects.requireNonNull(abstractC0608s0);
        return I(new K2(abstractC0608s0));
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ long sum() {
        return ((AbstractC0608s0) this.f13792a).sum();
    }

    @Override // java.util.stream.LongStream
    public final LongSummaryStatistics summaryStatistics() {
        C0509h c0509h = (C0509h) ((AbstractC0608s0) this.f13792a).n1(C0580m.f13735a, C0520a.f13605p, L.f13487b);
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert to java.util.LongSummaryStatistics");
    }

    @Override // java.util.stream.LongStream
    public final long[] toArray() {
        return (long[]) D0.C0((N0) ((AbstractC0608s0) this.f13792a).Y0(C0615u.f13801c)).i();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.stream.LongStream, java.util.stream.BaseStream] */
    @Override // java.util.stream.BaseStream
    public final /* synthetic */ LongStream unordered() {
        return C0550g.I(((AbstractC0608s0) this.f13792a).unordered());
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ OptionalLong reduce(LongBinaryOperator longBinaryOperator) {
        return AbstractC0511j.d(((AbstractC0608s0) this.f13792a).r1(longBinaryOperator == null ? null : new C0500b(longBinaryOperator)));
    }
}
