package j$.util.stream;

import j$.util.AbstractC0511j;
import j$.util.C0498f;
import j$.util.C0512k;
import j$.util.C0517p;
import j$.util.function.AbstractC0503e;
import j$.util.function.AbstractC0505g;
import j$.util.function.BiConsumer;
import j$.util.function.C0500b;
import j$.util.function.C0502d;
import j$.util.stream.Stream;
import java.util.DoubleSummaryStatistics;
import java.util.Iterator;
import java.util.Objects;
import java.util.OptionalDouble;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoublePredicate;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;
/* loaded from: classes2.dex */
public final /* synthetic */ class H implements DoubleStream {

    /* renamed from: a */
    final /* synthetic */ I f13458a;

    private /* synthetic */ H(I i10) {
        this.f13458a = i10;
    }

    public static /* synthetic */ DoubleStream I(I i10) {
        if (i10 == null) {
            return null;
        }
        return new H(i10);
    }

    @Override // java.util.stream.DoubleStream
    public final boolean allMatch(DoublePredicate doublePredicate) {
        I i10 = this.f13458a;
        AbstractC0505g u10 = C0500b.u(doublePredicate);
        G g10 = (G) i10;
        Objects.requireNonNull(g10);
        return ((Boolean) g10.X0(D0.K0(u10, A0.ALL))).booleanValue();
    }

    @Override // java.util.stream.DoubleStream
    public final boolean anyMatch(DoublePredicate doublePredicate) {
        I i10 = this.f13458a;
        AbstractC0505g u10 = C0500b.u(doublePredicate);
        G g10 = (G) i10;
        Objects.requireNonNull(g10);
        return ((Boolean) g10.X0(D0.K0(u10, A0.ANY))).booleanValue();
    }

    @Override // java.util.stream.DoubleStream
    public final OptionalDouble average() {
        double[] dArr = (double[]) ((G) this.f13458a).n1(C0611t.f13788a, C0575l.f13720c, C0611t.f13789b);
        return AbstractC0511j.b(dArr[2] > 0.0d ? C0512k.d(Collectors.a(dArr) / dArr[2]) : C0512k.a());
    }

    @Override // java.util.stream.DoubleStream
    public final java.util.stream.Stream boxed() {
        return Stream.Wrapper.convert(((G) this.f13458a).p1(C0520a.f13598i));
    }

    @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        ((AbstractC0530c) this.f13458a).close();
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        return ((G) this.f13458a).n1(C0500b.y(supplier), objDoubleConsumer == null ? null : new C0500b(objDoubleConsumer), BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    @Override // java.util.stream.DoubleStream
    public final long count() {
        return ((AbstractC0608s0) ((G) this.f13458a).o1(C0520a.f13599j)).sum();
    }

    @Override // java.util.stream.DoubleStream
    public final DoubleStream distinct() {
        return I(((AbstractC0563i2) ((AbstractC0563i2) ((G) this.f13458a).p1(C0520a.f13598i)).distinct()).F(C0520a.f13596g));
    }

    @Override // java.util.stream.DoubleStream
    public final DoubleStream filter(DoublePredicate doublePredicate) {
        I i10 = this.f13458a;
        AbstractC0505g u10 = C0500b.u(doublePredicate);
        G g10 = (G) i10;
        Objects.requireNonNull(g10);
        Objects.requireNonNull(u10);
        return I(new C0631y(g10, 4, EnumC0539d3.f13667t, u10, 2));
    }

    @Override // java.util.stream.DoubleStream
    public final OptionalDouble findAny() {
        G g10 = (G) this.f13458a;
        Objects.requireNonNull(g10);
        return AbstractC0511j.b((C0512k) g10.X0(new N(false, 4, C0512k.a(), C0575l.f13723f, J.f13472a)));
    }

    @Override // java.util.stream.DoubleStream
    public final OptionalDouble findFirst() {
        G g10 = (G) this.f13458a;
        Objects.requireNonNull(g10);
        return AbstractC0511j.b((C0512k) g10.X0(new N(true, 4, C0512k.a(), C0575l.f13723f, J.f13472a)));
    }

    @Override // java.util.stream.DoubleStream
    public final DoubleStream flatMap(DoubleFunction doubleFunction) {
        I i10 = this.f13458a;
        C0500b c0500b = doubleFunction == null ? null : new C0500b(doubleFunction);
        G g10 = (G) i10;
        Objects.requireNonNull(g10);
        return I(new C0631y(g10, 4, EnumC0539d3.f13663p | EnumC0539d3.f13661n | EnumC0539d3.f13667t, c0500b, 1));
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ void forEach(DoubleConsumer doubleConsumer) {
        this.f13458a.h(C0502d.b(doubleConsumer));
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ void forEachOrdered(DoubleConsumer doubleConsumer) {
        this.f13458a.H(C0502d.b(doubleConsumer));
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return ((AbstractC0530c) this.f13458a).isParallel();
    }

    @Override // java.util.stream.DoubleStream, java.util.stream.BaseStream
    /* renamed from: iterator */
    public final Iterator<Double> iterator2() {
        return C0517p.a(j$.util.U.f(((G) this.f13458a).spliterator()));
    }

    @Override // java.util.stream.DoubleStream
    public final DoubleStream limit(long j10) {
        G g10 = (G) this.f13458a;
        Objects.requireNonNull(g10);
        if (j10 >= 0) {
            return I(D0.J0(g10, 0L, j10));
        }
        throw new IllegalArgumentException(Long.toString(j10));
    }

    @Override // java.util.stream.DoubleStream
    public final DoubleStream map(DoubleUnaryOperator doubleUnaryOperator) {
        I i10 = this.f13458a;
        C0500b c0500b = doubleUnaryOperator == null ? null : new C0500b(doubleUnaryOperator);
        G g10 = (G) i10;
        Objects.requireNonNull(g10);
        Objects.requireNonNull(c0500b);
        return I(new C0631y(g10, 4, EnumC0539d3.f13663p | EnumC0539d3.f13661n, c0500b, 0));
    }

    @Override // java.util.stream.DoubleStream
    public final java.util.stream.IntStream mapToInt(DoubleToIntFunction doubleToIntFunction) {
        I i10 = this.f13458a;
        C0500b c0500b = doubleToIntFunction == null ? null : new C0500b(doubleToIntFunction);
        G g10 = (G) i10;
        Objects.requireNonNull(g10);
        Objects.requireNonNull(c0500b);
        return C0576l0.I(new A(g10, 4, EnumC0539d3.f13663p | EnumC0539d3.f13661n, c0500b, 0));
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ LongStream mapToLong(DoubleToLongFunction doubleToLongFunction) {
        return C0612t0.I(((G) this.f13458a).o1(doubleToLongFunction == null ? null : new C0500b(doubleToLongFunction)));
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ java.util.stream.Stream mapToObj(DoubleFunction doubleFunction) {
        return Stream.Wrapper.convert(((G) this.f13458a).p1(doubleFunction == null ? null : new C0500b(doubleFunction)));
    }

    @Override // java.util.stream.DoubleStream
    public final OptionalDouble max() {
        return AbstractC0511j.b(((G) this.f13458a).q1(C0520a.f13597h));
    }

    @Override // java.util.stream.DoubleStream
    public final OptionalDouble min() {
        return AbstractC0511j.b(((G) this.f13458a).q1(C0575l.f13721d));
    }

    @Override // java.util.stream.DoubleStream
    public final boolean noneMatch(DoublePredicate doublePredicate) {
        I i10 = this.f13458a;
        AbstractC0505g u10 = C0500b.u(doublePredicate);
        G g10 = (G) i10;
        Objects.requireNonNull(g10);
        return ((Boolean) g10.X0(D0.K0(u10, A0.NONE))).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.stream.BaseStream, java.util.stream.DoubleStream] */
    @Override // java.util.stream.BaseStream
    public final /* synthetic */ DoubleStream onClose(Runnable runnable) {
        AbstractC0530c abstractC0530c = (AbstractC0530c) this.f13458a;
        abstractC0530c.onClose(runnable);
        return C0550g.I(abstractC0530c);
    }

    @Override // java.util.stream.DoubleStream
    public final DoubleStream peek(DoubleConsumer doubleConsumer) {
        I i10 = this.f13458a;
        AbstractC0503e b10 = C0502d.b(doubleConsumer);
        G g10 = (G) i10;
        Objects.requireNonNull(g10);
        Objects.requireNonNull(b10);
        return I(new C0631y(g10, 4, 0, b10, 3));
    }

    @Override // java.util.stream.DoubleStream
    public final double reduce(double d10, DoubleBinaryOperator doubleBinaryOperator) {
        I i10 = this.f13458a;
        C0500b c0500b = doubleBinaryOperator == null ? null : new C0500b(doubleBinaryOperator);
        G g10 = (G) i10;
        Objects.requireNonNull(g10);
        Objects.requireNonNull(c0500b);
        return ((Double) g10.X0(new H1(4, c0500b, d10))).doubleValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [j$.util.stream.I] */
    @Override // java.util.stream.DoubleStream
    public final DoubleStream skip(long j10) {
        G g10 = (G) this.f13458a;
        Objects.requireNonNull(g10);
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        G g11 = g10;
        if (i10 >= 0) {
            if (i10 != 0) {
                g11 = D0.J0(g10, j10, -1L);
            }
            return I(g11);
        }
        throw new IllegalArgumentException(Long.toString(j10));
    }

    @Override // java.util.stream.DoubleStream
    public final DoubleStream sorted() {
        G g10 = (G) this.f13458a;
        Objects.requireNonNull(g10);
        return I(new I2(g10));
    }

    @Override // java.util.stream.DoubleStream
    public final double sum() {
        return Collectors.a((double[]) ((G) this.f13458a).n1(C0615u.f13799a, C0580m.f13737c, C0615u.f13800b));
    }

    @Override // java.util.stream.DoubleStream
    public final DoubleSummaryStatistics summaryStatistics() {
        C0498f c0498f = (C0498f) ((G) this.f13458a).n1(C0520a.f13594e, C0520a.f13595f, C0595p.f13763b);
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert to java.util.DoubleSummaryStatistics");
    }

    @Override // java.util.stream.DoubleStream
    public final double[] toArray() {
        return (double[]) D0.A0((J0) ((G) this.f13458a).Y0(C0575l.f13722e)).i();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.stream.BaseStream, java.util.stream.DoubleStream] */
    @Override // java.util.stream.BaseStream
    public final /* synthetic */ DoubleStream unordered() {
        return C0550g.I(((G) this.f13458a).unordered());
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ OptionalDouble reduce(DoubleBinaryOperator doubleBinaryOperator) {
        return AbstractC0511j.b(((G) this.f13458a).q1(doubleBinaryOperator == null ? null : new C0500b(doubleBinaryOperator)));
    }
}
