package j$.util.stream;

import j$.util.C0512k;
import j$.util.Spliterator;
import j$.util.function.AbstractC0501c;
import j$.util.function.AbstractC0503e;
import j$.util.function.AbstractC0504f;
import j$.util.function.AbstractC0507i;
import j$.util.function.BiConsumer;
import java.util.Iterator;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class G extends AbstractC0530c implements I {

    /* renamed from: t */
    public static final /* synthetic */ int f13452t = 0;

    public G(Spliterator spliterator, int i10) {
        super(spliterator, i10, false);
    }

    public G(AbstractC0530c abstractC0530c, int i10) {
        super(abstractC0530c, i10);
    }

    public static j$.util.z m1(Spliterator spliterator) {
        if (spliterator instanceof j$.util.z) {
            return (j$.util.z) spliterator;
        }
        if (!P3.f13527a) {
            throw new UnsupportedOperationException("DoubleStream.adapt(Spliterator<Double> s)");
        }
        P3.a(AbstractC0530c.class, "using DoubleStream.adapt(Spliterator<Double> s)");
        throw null;
    }

    public void H(AbstractC0503e abstractC0503e) {
        Objects.requireNonNull(abstractC0503e);
        X0(new V(abstractC0503e, true));
    }

    @Override // j$.util.stream.D0
    public final H0 P0(long j10, j$.util.function.q qVar) {
        return D0.t0(j10);
    }

    @Override // j$.util.stream.AbstractC0530c
    final P0 Z0(D0 d02, Spliterator spliterator, boolean z10, j$.util.function.q qVar) {
        return D0.n0(d02, spliterator, z10);
    }

    @Override // j$.util.stream.AbstractC0530c
    final void a1(Spliterator spliterator, AbstractC0603q2 abstractC0603q2) {
        AbstractC0503e abstractC0503e;
        j$.util.z m12 = m1(spliterator);
        if (abstractC0603q2 instanceof AbstractC0503e) {
            abstractC0503e = (AbstractC0503e) abstractC0603q2;
        } else if (!P3.f13527a) {
            Objects.requireNonNull(abstractC0603q2);
            abstractC0503e = new C0623w(abstractC0603q2, 0);
        } else {
            P3.a(AbstractC0530c.class, "using DoubleStream.adapt(Sink<Double> s)");
            throw null;
        }
        while (!abstractC0603q2.x() && m12.j(abstractC0503e)) {
        }
    }

    @Override // j$.util.stream.AbstractC0530c
    public final int b1() {
        return 4;
    }

    public void h(AbstractC0503e abstractC0503e) {
        Objects.requireNonNull(abstractC0503e);
        X0(new V(abstractC0503e, false));
    }

    @Override // j$.util.stream.AbstractC0555h
    /* renamed from: iterator */
    public final Iterator mo17iterator() {
        return j$.util.U.f(spliterator());
    }

    @Override // j$.util.stream.AbstractC0530c
    final Spliterator k1(D0 d02, j$.util.function.I i10, boolean z10) {
        return new C0594o3(d02, i10, z10);
    }

    public final Object n1(j$.util.function.I i10, j$.util.function.D d10, BiConsumer biConsumer) {
        C0619v c0619v = new C0619v(biConsumer, 0);
        Objects.requireNonNull(i10);
        Objects.requireNonNull(d10);
        return X0(new F1(4, c0619v, d10, i10, 1));
    }

    public final AbstractC0616u0 o1(AbstractC0507i abstractC0507i) {
        Objects.requireNonNull(abstractC0507i);
        return new B(this, 4, EnumC0539d3.f13663p | EnumC0539d3.f13661n, abstractC0507i, 0);
    }

    public final Stream p1(AbstractC0504f abstractC0504f) {
        Objects.requireNonNull(abstractC0504f);
        return new C0635z(this, 4, EnumC0539d3.f13663p | EnumC0539d3.f13661n, abstractC0504f, 0);
    }

    public final C0512k q1(AbstractC0501c abstractC0501c) {
        Objects.requireNonNull(abstractC0501c);
        return (C0512k) X0(new J1(4, abstractC0501c, 0));
    }

    /* renamed from: r1 */
    public final j$.util.z spliterator() {
        return m1(super.spliterator());
    }

    @Override // j$.util.stream.AbstractC0555h
    public final AbstractC0555h unordered() {
        return !c1() ? this : new C(this, 4, EnumC0539d3.f13665r, 0);
    }
}
