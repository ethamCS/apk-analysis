package j$.util.stream;

import j$.util.C0510i;
import j$.util.Spliterator;
import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.BinaryOperator;
import j$.util.function.C0499a;
import j$.util.function.Consumer;
import j$.util.function.Function;
import j$.util.function.Predicate;
import j$.util.function.ToDoubleFunction;
import j$.util.function.ToIntFunction;
import j$.util.function.ToLongFunction;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.i2 */
/* loaded from: classes2.dex */
public abstract class AbstractC0563i2 extends AbstractC0530c implements Stream {

    /* renamed from: t */
    public static final /* synthetic */ int f13705t = 0;

    public AbstractC0563i2(Spliterator spliterator, int i10, boolean z10) {
        super(spliterator, i10, z10);
    }

    public AbstractC0563i2(AbstractC0530c abstractC0530c, int i10) {
        super(abstractC0530c, i10);
    }

    @Override // j$.util.stream.Stream
    public final boolean D(Predicate predicate) {
        return ((Boolean) X0(D0.R0(predicate, A0.NONE))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final AbstractC0616u0 E(ToLongFunction toLongFunction) {
        Objects.requireNonNull(toLongFunction);
        return new B(this, 1, EnumC0539d3.f13663p | EnumC0539d3.f13661n, toLongFunction, 7);
    }

    @Override // j$.util.stream.Stream
    public final I F(ToDoubleFunction toDoubleFunction) {
        Objects.requireNonNull(toDoubleFunction);
        return new C0631y(this, 1, EnumC0539d3.f13663p | EnumC0539d3.f13661n, toDoubleFunction, 6);
    }

    @Override // j$.util.stream.D0
    public final H0 P0(long j10, j$.util.function.q qVar) {
        return D0.l0(j10, qVar);
    }

    @Override // j$.util.stream.AbstractC0530c
    final P0 Z0(D0 d02, Spliterator spliterator, boolean z10, j$.util.function.q qVar) {
        return D0.m0(d02, spliterator, z10, qVar);
    }

    @Override // j$.util.stream.Stream
    public final boolean a(Predicate predicate) {
        return ((Boolean) X0(D0.R0(predicate, A0.ANY))).booleanValue();
    }

    @Override // j$.util.stream.AbstractC0530c
    final void a1(Spliterator spliterator, AbstractC0603q2 abstractC0603q2) {
        while (!abstractC0603q2.x() && spliterator.b(abstractC0603q2)) {
        }
    }

    @Override // j$.util.stream.AbstractC0530c
    public final int b1() {
        return 1;
    }

    @Override // j$.util.stream.Stream
    public final IntStream c(Function function) {
        Objects.requireNonNull(function);
        return new A(this, 1, EnumC0539d3.f13663p | EnumC0539d3.f13661n | EnumC0539d3.f13667t, function, 7);
    }

    @Override // j$.util.stream.Stream
    public final Object collect(Collector collector) {
        Object obj;
        if (!isParallel() || !collector.characteristics().contains(EnumC0560i.CONCURRENT) || (c1() && !collector.characteristics().contains(EnumC0560i.UNORDERED))) {
            Objects.requireNonNull(collector);
            obj = X0(new O1(1, collector.b(), collector.a(), collector.c(), collector));
        } else {
            obj = collector.c().get();
            forEach(new C0590o(collector.a(), obj, 5));
        }
        return collector.characteristics().contains(EnumC0560i.IDENTITY_FINISH) ? obj : collector.d().apply(obj);
    }

    @Override // j$.util.stream.Stream
    public final long count() {
        return ((AbstractC0608s0) E(C0575l.f13730m)).sum();
    }

    @Override // j$.util.stream.Stream
    public final Stream distinct() {
        return new C0607s(this, 1, EnumC0539d3.f13660m | EnumC0539d3.f13667t);
    }

    public void e(Consumer consumer) {
        Objects.requireNonNull(consumer);
        X0(new Y(consumer, true));
    }

    @Override // j$.util.stream.Stream
    public final C0510i findAny() {
        return (C0510i) X0(new N(false, 1, C0510i.a(), C0520a.f13600k, M.f13497a));
    }

    @Override // j$.util.stream.Stream
    public final C0510i findFirst() {
        return (C0510i) X0(new N(true, 1, C0510i.a(), C0520a.f13600k, M.f13497a));
    }

    public void forEach(Consumer consumer) {
        Objects.requireNonNull(consumer);
        X0(new Y(consumer, false));
    }

    @Override // j$.util.stream.Stream
    public final Object g(j$.util.function.I i10, BiConsumer biConsumer, BiConsumer biConsumer2) {
        return X0(D0.S0(i10, biConsumer, biConsumer2));
    }

    @Override // j$.util.stream.Stream
    public final IntStream i(ToIntFunction toIntFunction) {
        Objects.requireNonNull(toIntFunction);
        return new A(this, 1, EnumC0539d3.f13663p | EnumC0539d3.f13661n, toIntFunction, 6);
    }

    @Override // j$.util.stream.AbstractC0555h
    /* renamed from: iterator */
    public final Iterator mo17iterator() {
        return j$.util.U.i(spliterator());
    }

    @Override // j$.util.stream.Stream
    public final Stream j(Function function) {
        Objects.requireNonNull(function);
        return new C0543e2(this, 1, EnumC0539d3.f13663p | EnumC0539d3.f13661n | EnumC0539d3.f13667t, function, 1);
    }

    @Override // j$.util.stream.Stream
    public final C0510i k(BinaryOperator binaryOperator) {
        Objects.requireNonNull(binaryOperator);
        return (C0510i) X0(new J1(1, binaryOperator, 1));
    }

    @Override // j$.util.stream.AbstractC0530c
    final Spliterator k1(D0 d02, j$.util.function.I i10, boolean z10) {
        return new J3(d02, i10, z10);
    }

    @Override // j$.util.stream.Stream
    public final Stream limit(long j10) {
        if (j10 >= 0) {
            return D0.Q0(this, 0L, j10);
        }
        throw new IllegalArgumentException(Long.toString(j10));
    }

    @Override // j$.util.stream.Stream
    public final Object m(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        Objects.requireNonNull(biFunction);
        Objects.requireNonNull(binaryOperator);
        return X0(new F1(1, binaryOperator, biFunction, obj, 2));
    }

    @Override // j$.util.stream.Stream
    public final Stream map(Function function) {
        Objects.requireNonNull(function);
        return new C0543e2(this, 1, EnumC0539d3.f13663p | EnumC0539d3.f13661n, function, 0);
    }

    @Override // j$.util.stream.Stream
    public final C0510i max(Comparator comparator) {
        Objects.requireNonNull(comparator);
        return k(new C0499a(comparator, 0));
    }

    @Override // j$.util.stream.Stream
    public final C0510i min(Comparator comparator) {
        Objects.requireNonNull(comparator);
        return k(new C0499a(comparator, 1));
    }

    @Override // j$.util.stream.Stream
    public final I n(Function function) {
        Objects.requireNonNull(function);
        return new C0631y(this, 1, EnumC0539d3.f13663p | EnumC0539d3.f13661n | EnumC0539d3.f13667t, function, 7);
    }

    @Override // j$.util.stream.Stream
    public final Object reduce(Object obj, BinaryOperator binaryOperator) {
        Objects.requireNonNull(binaryOperator);
        return X0(new F1(1, binaryOperator, binaryOperator, obj, 2));
    }

    @Override // j$.util.stream.Stream
    public final Stream skip(long j10) {
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i10 >= 0) {
            return i10 == 0 ? this : D0.Q0(this, j10, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j10));
    }

    @Override // j$.util.stream.Stream
    public final Stream sorted() {
        return new L2(this);
    }

    @Override // j$.util.stream.Stream
    public final Stream t(Predicate predicate) {
        Objects.requireNonNull(predicate);
        return new C0635z(this, 1, EnumC0539d3.f13667t, predicate, 4);
    }

    @Override // j$.util.stream.Stream
    public final Object[] toArray() {
        J j10 = J.f13474c;
        return D0.z0(Y0(j10), j10).q(j10);
    }

    @Override // j$.util.stream.Stream
    public final Object[] toArray(j$.util.function.q qVar) {
        return D0.z0(Y0(qVar), qVar).q(qVar);
    }

    @Override // j$.util.stream.AbstractC0555h
    public final AbstractC0555h unordered() {
        return !c1() ? this : new C0538d2(this, 1, EnumC0539d3.f13665r);
    }

    @Override // j$.util.stream.Stream
    public final Stream v(Consumer consumer) {
        Objects.requireNonNull(consumer);
        return new C0635z(this, 1, 0, consumer, 3);
    }

    @Override // j$.util.stream.Stream
    public final boolean x(Predicate predicate) {
        return ((Boolean) X0(D0.R0(predicate, A0.ALL))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final AbstractC0616u0 y(Function function) {
        Objects.requireNonNull(function);
        return new B(this, 1, EnumC0539d3.f13663p | EnumC0539d3.f13661n | EnumC0539d3.f13667t, function, 6);
    }

    @Override // j$.util.stream.Stream
    public final Stream sorted(Comparator comparator) {
        return new L2(this, comparator);
    }
}
