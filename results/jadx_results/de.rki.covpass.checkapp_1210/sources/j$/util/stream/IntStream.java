package j$.util.stream;

import j$.util.AbstractC0639t;
import j$.util.C0508g;
import j$.util.C0512k;
import j$.util.C0513l;
import j$.util.function.BiConsumer;
import j$.util.function.IntConsumer;
/* loaded from: classes2.dex */
public interface IntStream extends AbstractC0555h {

    /* renamed from: j$.util.stream.IntStream$-CC */
    /* loaded from: classes2.dex */
    public final /* synthetic */ class CC {
        public static IntStream range(int i10, int i11) {
            if (i10 >= i11) {
                return D0.G0(j$.util.U.c());
            }
            return D0.G0(new L3(i10, i11));
        }
    }

    C0513l B(j$.util.function.m mVar);

    IntStream C(IntConsumer intConsumer);

    Object G(j$.util.function.I i10, j$.util.function.E e10, BiConsumer biConsumer);

    I asDoubleStream();

    AbstractC0616u0 asLongStream();

    C0512k average();

    boolean b(j$.util.function.r rVar);

    Stream boxed();

    long count();

    IntStream distinct();

    AbstractC0616u0 f(j$.util.function.t tVar);

    C0513l findAny();

    C0513l findFirst();

    void forEach(IntConsumer intConsumer);

    @Override // j$.util.stream.AbstractC0555h
    /* renamed from: iterator */
    AbstractC0639t mo17iterator();

    IntStream l(j$.util.function.u uVar);

    IntStream limit(long j10);

    C0513l max();

    C0513l min();

    void o(IntConsumer intConsumer);

    Stream p(j$.util.function.q qVar);

    @Override // j$.util.stream.AbstractC0555h, j$.util.stream.I
    IntStream parallel();

    int q(int i10, j$.util.function.m mVar);

    boolean r(j$.util.function.r rVar);

    IntStream s(j$.util.function.q qVar);

    @Override // j$.util.stream.AbstractC0555h, j$.util.stream.I
    IntStream sequential();

    IntStream skip(long j10);

    IntStream sorted();

    @Override // j$.util.stream.AbstractC0555h
    j$.util.B spliterator();

    int sum();

    C0508g summaryStatistics();

    int[] toArray();

    boolean u(j$.util.function.r rVar);

    I w(j$.util.function.s sVar);

    IntStream z(j$.util.function.r rVar);
}
