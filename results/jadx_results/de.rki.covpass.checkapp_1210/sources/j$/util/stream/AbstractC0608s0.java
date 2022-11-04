package j$.util.stream;

import j$.util.C0514m;
import j$.util.Spliterator;
import j$.util.function.BiConsumer;
import java.util.Iterator;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.s0 */
/* loaded from: classes2.dex */
public abstract class AbstractC0608s0 extends AbstractC0530c implements AbstractC0616u0 {

    /* renamed from: t */
    public static final /* synthetic */ int f13780t = 0;

    public AbstractC0608s0(Spliterator spliterator, int i10) {
        super(spliterator, i10, false);
    }

    public AbstractC0608s0(AbstractC0530c abstractC0530c, int i10) {
        super(abstractC0530c, i10);
    }

    public static j$.util.D m1(Spliterator spliterator) {
        if (spliterator instanceof j$.util.D) {
            return (j$.util.D) spliterator;
        }
        if (!P3.f13527a) {
            throw new UnsupportedOperationException("LongStream.adapt(Spliterator<Long> s)");
        }
        P3.a(AbstractC0530c.class, "using LongStream.adapt(Spliterator<Long> s)");
        throw null;
    }

    public void A(j$.util.function.x xVar) {
        Objects.requireNonNull(xVar);
        X0(new X(xVar, true));
    }

    @Override // j$.util.stream.D0
    public final H0 P0(long j10, j$.util.function.q qVar) {
        return D0.H0(j10);
    }

    @Override // j$.util.stream.AbstractC0530c
    final P0 Z0(D0 d02, Spliterator spliterator, boolean z10, j$.util.function.q qVar) {
        return D0.p0(d02, spliterator, z10);
    }

    @Override // j$.util.stream.AbstractC0530c
    final void a1(Spliterator spliterator, AbstractC0603q2 abstractC0603q2) {
        j$.util.function.x xVar;
        j$.util.D m12 = m1(spliterator);
        if (abstractC0603q2 instanceof j$.util.function.x) {
            xVar = (j$.util.function.x) abstractC0603q2;
        } else if (!P3.f13527a) {
            Objects.requireNonNull(abstractC0603q2);
            xVar = new C0586n0(abstractC0603q2, 0);
        } else {
            P3.a(AbstractC0530c.class, "using LongStream.adapt(Sink<Long> s)");
            throw null;
        }
        while (!abstractC0603q2.x() && m12.i(xVar)) {
        }
    }

    @Override // j$.util.stream.AbstractC0530c
    public final int b1() {
        return 3;
    }

    public void d(j$.util.function.x xVar) {
        Objects.requireNonNull(xVar);
        X0(new X(xVar, false));
    }

    @Override // j$.util.stream.AbstractC0555h
    /* renamed from: iterator */
    public final Iterator mo17iterator() {
        return j$.util.U.h(spliterator());
    }

    @Override // j$.util.stream.AbstractC0530c
    final Spliterator k1(D0 d02, j$.util.function.I i10, boolean z10) {
        return new s3(d02, i10, z10);
    }

    public final Object n1(j$.util.function.I i10, j$.util.function.F f10, BiConsumer biConsumer) {
        C0619v c0619v = new C0619v(biConsumer, 2);
        Objects.requireNonNull(i10);
        Objects.requireNonNull(f10);
        return X0(new F1(3, c0619v, f10, i10, 0));
    }

    public final AbstractC0616u0 o1(j$.util.function.C c10) {
        Objects.requireNonNull(c10);
        return new B(this, 3, EnumC0539d3.f13663p | EnumC0539d3.f13661n, c10, 2);
    }

    public final Stream p1(j$.util.function.y yVar) {
        Objects.requireNonNull(yVar);
        return new C0635z(this, 3, EnumC0539d3.f13663p | EnumC0539d3.f13661n, yVar, 2);
    }

    public final long q1(long j10, j$.util.function.v vVar) {
        Objects.requireNonNull(vVar);
        return ((Long) X0(new V1(3, vVar, j10))).longValue();
    }

    public final C0514m r1(j$.util.function.v vVar) {
        Objects.requireNonNull(vVar);
        return (C0514m) X0(new J1(3, vVar, 3));
    }

    /* renamed from: s1 */
    public final j$.util.D spliterator() {
        return m1(super.spliterator());
    }

    public final long sum() {
        return q1(0L, C0520a.f13607r);
    }

    @Override // j$.util.stream.AbstractC0555h
    public final AbstractC0555h unordered() {
        return !c1() ? this : new C0546f0(this, 3, EnumC0539d3.f13665r, 1);
    }
}
