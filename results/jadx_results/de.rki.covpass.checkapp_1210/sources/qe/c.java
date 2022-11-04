package qe;

import ad.g0;
import ad.p;
import hc.t;
import java.util.Collection;
import java.util.List;
import oe.e0;
import xc.a;
import xc.a1;
import xc.b;
import xc.f1;
import xc.j1;
import xc.m;
import xc.u;
import xc.x0;
import xc.y;
import xc.z0;
/* loaded from: classes3.dex */
public final class c extends g0 {

    /* loaded from: classes3.dex */
    public static final class a implements y.a<z0> {
        a() {
            c.this = r1;
        }

        @Override // xc.y.a
        public y.a<z0> a() {
            return this;
        }

        @Override // xc.y.a
        public y.a<z0> c(yc.g gVar) {
            t.e(gVar, "additionalAnnotations");
            return this;
        }

        @Override // xc.y.a
        public <V> y.a<z0> d(a.AbstractC0451a<V> abstractC0451a, V v10) {
            t.e(abstractC0451a, "userDataKey");
            return this;
        }

        @Override // xc.y.a
        public y.a<z0> e(b.a aVar) {
            t.e(aVar, "kind");
            return this;
        }

        @Override // xc.y.a
        public y.a<z0> f(List<? extends j1> list) {
            t.e(list, "parameters");
            return this;
        }

        @Override // xc.y.a
        public y.a<z0> g(m mVar) {
            t.e(mVar, "owner");
            return this;
        }

        @Override // xc.y.a
        public y.a<z0> h(List<? extends f1> list) {
            t.e(list, "parameters");
            return this;
        }

        @Override // xc.y.a
        public y.a<z0> i(oe.j1 j1Var) {
            t.e(j1Var, "substitution");
            return this;
        }

        @Override // xc.y.a
        public y.a<z0> j() {
            return this;
        }

        @Override // xc.y.a
        public y.a<z0> k(xc.b bVar) {
            return this;
        }

        @Override // xc.y.a
        public y.a<z0> l() {
            return this;
        }

        @Override // xc.y.a
        public y.a<z0> m(x0 x0Var) {
            return this;
        }

        @Override // xc.y.a
        public y.a<z0> n(wd.f fVar) {
            t.e(fVar, "name");
            return this;
        }

        @Override // xc.y.a
        public y.a<z0> o(u uVar) {
            t.e(uVar, "visibility");
            return this;
        }

        @Override // xc.y.a
        public y.a<z0> p() {
            return this;
        }

        @Override // xc.y.a
        public y.a<z0> q(boolean z10) {
            return this;
        }

        @Override // xc.y.a
        public y.a<z0> r(e0 e0Var) {
            t.e(e0Var, "type");
            return this;
        }

        @Override // xc.y.a
        public y.a<z0> s(x0 x0Var) {
            return this;
        }

        @Override // xc.y.a
        public y.a<z0> t(xc.e0 e0Var) {
            t.e(e0Var, "modality");
            return this;
        }

        @Override // xc.y.a
        public y.a<z0> u() {
            return this;
        }

        /* renamed from: v */
        public z0 b() {
            return c.this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(xc.e eVar) {
        super(eVar, null, yc.g.Companion.b(), wd.f.o(b.ERROR_FUNCTION.g()), b.a.DECLARATION, a1.f25519a);
        List<x0> h10;
        List<? extends f1> h11;
        List<j1> h12;
        t.e(eVar, "containingDeclaration");
        h10 = ub.u.h();
        h11 = ub.u.h();
        h12 = ub.u.h();
        a1(null, null, h10, h11, h12, k.d(j.RETURN_TYPE_FOR_FUNCTION, new String[0]), xc.e0.OPEN, xc.t.f25581e);
    }

    @Override // ad.p, xc.a
    public <V> V D(a.AbstractC0451a<V> abstractC0451a) {
        t.e(abstractC0451a, "key");
        return null;
    }

    @Override // ad.g0, ad.p
    protected p U0(m mVar, y yVar, b.a aVar, wd.f fVar, yc.g gVar, a1 a1Var) {
        t.e(mVar, "newOwner");
        t.e(aVar, "kind");
        t.e(gVar, "annotations");
        t.e(a1Var, "source");
        return this;
    }

    @Override // ad.p, xc.y
    public boolean s0() {
        return false;
    }

    @Override // ad.p, xc.b
    public void t0(Collection<? extends xc.b> collection) {
        t.e(collection, "overriddenDescriptors");
    }

    @Override // ad.g0
    /* renamed from: t1 */
    public z0 n0(m mVar, xc.e0 e0Var, u uVar, b.a aVar, boolean z10) {
        t.e(mVar, "newOwner");
        t.e(e0Var, "modality");
        t.e(uVar, "visibility");
        t.e(aVar, "kind");
        return this;
    }

    @Override // ad.g0, ad.p, xc.y, xc.z0
    public y.a<z0> y() {
        return new a();
    }
}
