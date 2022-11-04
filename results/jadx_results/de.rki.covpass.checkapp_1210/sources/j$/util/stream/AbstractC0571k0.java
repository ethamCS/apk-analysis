package j$.util.stream;

import j$.util.AbstractC0639t;
import j$.util.C0508g;
import j$.util.C0512k;
import j$.util.C0513l;
import j$.util.Spliterator;
import j$.util.function.BiConsumer;
import j$.util.function.IntConsumer;
import java.util.Iterator;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.k0 */
/* loaded from: classes2.dex */
public abstract class AbstractC0571k0 extends AbstractC0530c implements IntStream {

    /* renamed from: t */
    public static final /* synthetic */ int f13713t = 0;

    public AbstractC0571k0(Spliterator spliterator, int i10) {
        super(spliterator, i10, false);
    }

    public AbstractC0571k0(AbstractC0530c abstractC0530c, int i10) {
        super(abstractC0530c, i10);
    }

    public static j$.util.B m1(Spliterator spliterator) {
        if (spliterator instanceof j$.util.B) {
            return (j$.util.B) spliterator;
        }
        if (!P3.f13527a) {
            throw new UnsupportedOperationException("IntStream.adapt(Spliterator<Integer> s)");
        }
        P3.a(AbstractC0530c.class, "using IntStream.adapt(Spliterator<Integer> s)");
        throw null;
    }

    @Override // j$.util.stream.IntStream
    public final C0513l B(j$.util.function.m mVar) {
        Objects.requireNonNull(mVar);
        return (C0513l) X0(new J1(2, mVar, 2));
    }

    @Override // j$.util.stream.IntStream
    public final IntStream C(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        return new A(this, 2, 0, intConsumer, 1);
    }

    @Override // j$.util.stream.IntStream
    public final Object G(j$.util.function.I i10, j$.util.function.E e10, BiConsumer biConsumer) {
        C0619v c0619v = new C0619v(biConsumer, 1);
        Objects.requireNonNull(i10);
        Objects.requireNonNull(e10);
        return X0(new F1(2, c0619v, e10, i10, 4));
    }

    @Override // j$.util.stream.D0
    public final H0 P0(long j10, j$.util.function.q qVar) {
        return D0.F0(j10);
    }

    @Override // j$.util.stream.AbstractC0530c
    final P0 Z0(D0 d02, Spliterator spliterator, boolean z10, j$.util.function.q qVar) {
        return D0.o0(d02, spliterator, z10);
    }

    @Override // j$.util.stream.AbstractC0530c
    final void a1(Spliterator spliterator, AbstractC0603q2 abstractC0603q2) {
        IntConsumer intConsumer;
        j$.util.B m12 = m1(spliterator);
        if (abstractC0603q2 instanceof IntConsumer) {
            intConsumer = (IntConsumer) abstractC0603q2;
        } else if (!P3.f13527a) {
            Objects.requireNonNull(abstractC0603q2);
            intConsumer = new C0536d0(abstractC0603q2, 0);
        } else {
            P3.a(AbstractC0530c.class, "using IntStream.adapt(Sink<Integer> s)");
            throw null;
        }
        while (!abstractC0603q2.x() && m12.e(intConsumer)) {
        }
    }

    @Override // j$.util.stream.IntStream
    public final I asDoubleStream() {
        return new C(this, 2, EnumC0539d3.f13663p | EnumC0539d3.f13661n, 1);
    }

    @Override // j$.util.stream.IntStream
    public final AbstractC0616u0 asLongStream() {
        return new C0546f0(this, 2, EnumC0539d3.f13663p | EnumC0539d3.f13661n, 0);
    }

    @Override // j$.util.stream.IntStream
    public final C0512k average() {
        long[] jArr = (long[]) G(C0531c0.f13644a, C0575l.f13724g, K.f13478b);
        return jArr[0] > 0 ? C0512k.d(jArr[1] / jArr[0]) : C0512k.a();
    }

    @Override // j$.util.stream.IntStream
    public final boolean b(j$.util.function.r rVar) {
        return ((Boolean) X0(D0.M0(rVar, A0.ANY))).booleanValue();
    }

    @Override // j$.util.stream.AbstractC0530c
    public final int b1() {
        return 2;
    }

    @Override // j$.util.stream.IntStream
    public final Stream boxed() {
        return p(C0595p.f13765d);
    }

    @Override // j$.util.stream.IntStream
    public final long count() {
        return ((AbstractC0608s0) f(C0520a.f13604o)).sum();
    }

    @Override // j$.util.stream.IntStream
    public final IntStream distinct() {
        return ((AbstractC0563i2) ((AbstractC0563i2) p(C0595p.f13765d)).distinct()).i(C0520a.f13602m);
    }

    @Override // j$.util.stream.IntStream
    public final AbstractC0616u0 f(j$.util.function.t tVar) {
        Objects.requireNonNull(tVar);
        return new B(this, 2, EnumC0539d3.f13663p | EnumC0539d3.f13661n, tVar, 1);
    }

    @Override // j$.util.stream.IntStream
    public final C0513l findAny() {
        return (C0513l) X0(new N(false, 2, C0513l.a(), C0580m.f13738d, K.f13477a));
    }

    @Override // j$.util.stream.IntStream
    public final C0513l findFirst() {
        return (C0513l) X0(new N(true, 2, C0513l.a(), C0580m.f13738d, K.f13477a));
    }

    public void forEach(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        X0(new W(intConsumer, false));
    }

    @Override // j$.util.stream.AbstractC0555h
    /* renamed from: iterator */
    public final AbstractC0639t mo17iterator() {
        return j$.util.U.g(spliterator());
    }

    @Override // j$.util.stream.AbstractC0555h
    /* renamed from: iterator */
    public final Iterator mo17iterator() {
        return j$.util.U.g(spliterator());
    }

    @Override // j$.util.stream.AbstractC0530c
    final Spliterator k1(D0 d02, j$.util.function.I i10, boolean z10) {
        return new q3(d02, i10, z10);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream l(j$.util.function.u uVar) {
        Objects.requireNonNull(uVar);
        return new A(this, 2, EnumC0539d3.f13663p | EnumC0539d3.f13661n, uVar, 2);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream limit(long j10) {
        if (j10 >= 0) {
            return D0.L0(this, 0L, j10);
        }
        throw new IllegalArgumentException(Long.toString(j10));
    }

    @Override // j$.util.stream.IntStream
    public final C0513l max() {
        return B(C0575l.f13725h);
    }

    @Override // j$.util.stream.IntStream
    public final C0513l min() {
        return B(C0580m.f13740f);
    }

    public void o(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        X0(new W(intConsumer, true));
    }

    @Override // j$.util.stream.IntStream
    public final Stream p(j$.util.function.q qVar) {
        Objects.requireNonNull(qVar);
        return new C0635z(this, 2, EnumC0539d3.f13663p | EnumC0539d3.f13661n, qVar, 1);
    }

    @Override // j$.util.stream.IntStream
    public final int q(int i10, j$.util.function.m mVar) {
        Objects.requireNonNull(mVar);
        return ((Integer) X0(new R1(2, mVar, i10))).intValue();
    }

    @Override // j$.util.stream.IntStream
    public final boolean r(j$.util.function.r rVar) {
        return ((Boolean) X0(D0.M0(rVar, A0.ALL))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final IntStream s(j$.util.function.q qVar) {
        return new A(this, 2, EnumC0539d3.f13663p | EnumC0539d3.f13661n | EnumC0539d3.f13667t, qVar, 3);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream skip(long j10) {
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i10 >= 0) {
            return i10 == 0 ? this : D0.L0(this, j10, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j10));
    }

    @Override // j$.util.stream.IntStream
    public final IntStream sorted() {
        return new J2(this);
    }

    @Override // j$.util.stream.AbstractC0530c, j$.util.stream.AbstractC0555h
    public final j$.util.B spliterator() {
        return m1(super.spliterator());
    }

    @Override // j$.util.stream.IntStream
    public final int sum() {
        return q(0, C0520a.f13603n);
    }

    @Override // j$.util.stream.IntStream
    public final C0508g summaryStatistics() {
        return (C0508g) G(C0575l.f13718a, C0520a.f13601l, J.f13473b);
    }

    @Override // j$.util.stream.IntStream
    public final int[] toArray() {
        return (int[]) D0.B0((L0) Y0(C0611t.f13790c)).i();
    }

    @Override // j$.util.stream.IntStream
    public final boolean u(j$.util.function.r rVar) {
        return ((Boolean) X0(D0.M0(rVar, A0.NONE))).booleanValue();
    }

    @Override // j$.util.stream.AbstractC0555h
    public final AbstractC0555h unordered() {
        return !c1() ? this : new C0551g0(this, 2, EnumC0539d3.f13665r);
    }

    @Override // j$.util.stream.IntStream
    public final I w(j$.util.function.s sVar) {
        Objects.requireNonNull(sVar);
        return new C0631y(this, 2, EnumC0539d3.f13663p | EnumC0539d3.f13661n, sVar, 4);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream z(j$.util.function.r rVar) {
        Objects.requireNonNull(rVar);
        return new A(this, 2, EnumC0539d3.f13667t, rVar, 4);
    }
}
