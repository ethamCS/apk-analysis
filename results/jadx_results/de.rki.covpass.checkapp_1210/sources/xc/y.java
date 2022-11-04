package xc;

import java.util.Collection;
import java.util.List;
import xc.a;
import xc.b;
/* loaded from: classes.dex */
public interface y extends b {

    /* loaded from: classes.dex */
    public interface a<D extends y> {
        a<D> a();

        D b();

        a<D> c(yc.g gVar);

        <V> a<D> d(a.AbstractC0451a<V> abstractC0451a, V v10);

        a<D> e(b.a aVar);

        a<D> f(List<j1> list);

        a<D> g(m mVar);

        a<D> h(List<f1> list);

        a<D> i(oe.j1 j1Var);

        a<D> j();

        a<D> k(b bVar);

        a<D> l();

        a<D> m(x0 x0Var);

        a<D> n(wd.f fVar);

        a<D> o(u uVar);

        a<D> p();

        a<D> q(boolean z10);

        a<D> r(oe.e0 e0Var);

        a<D> s(x0 x0Var);

        a<D> t(e0 e0Var);

        a<D> u();
    }

    y G();

    boolean G0();

    boolean P0();

    @Override // xc.b, xc.a, xc.m, xc.h
    y a();

    @Override // xc.l
    m b();

    y c(oe.l1 l1Var);

    @Override // xc.b, xc.a
    Collection<? extends y> f();

    boolean isInline();

    boolean r0();

    boolean s0();

    boolean u0();

    boolean v0();

    a<? extends y> y();
}
