package se;

import hc.k0;
import java.util.Collection;
import java.util.List;
import oe.d1;
/* loaded from: classes3.dex */
public interface p extends s {

    /* loaded from: classes3.dex */
    public static final class a {
        public static List<k> a(p pVar, k kVar, n nVar) {
            hc.t.e(kVar, "$receiver");
            hc.t.e(nVar, "constructor");
            return null;
        }

        public static m b(p pVar, l lVar, int i10) {
            hc.t.e(lVar, "$receiver");
            if (lVar instanceof k) {
                return pVar.X((i) lVar, i10);
            }
            if (lVar instanceof se.a) {
                m mVar = ((se.a) lVar).get(i10);
                hc.t.d(mVar, "get(index)");
                return mVar;
            }
            throw new IllegalStateException(("unknown type argument list type: " + lVar + ", " + k0.b(lVar.getClass())).toString());
        }

        public static m c(p pVar, k kVar, int i10) {
            hc.t.e(kVar, "$receiver");
            boolean z10 = false;
            if (i10 >= 0 && i10 < pVar.t0(kVar)) {
                z10 = true;
            }
            if (z10) {
                return pVar.X(kVar, i10);
            }
            return null;
        }

        public static boolean d(p pVar, i iVar) {
            hc.t.e(iVar, "$receiver");
            return pVar.l(pVar.x0(iVar)) != pVar.l(pVar.x(iVar));
        }

        public static boolean e(p pVar, i iVar) {
            hc.t.e(iVar, "$receiver");
            k d10 = pVar.d(iVar);
            return (d10 != null ? pVar.g(d10) : null) != null;
        }

        public static boolean f(p pVar, k kVar) {
            hc.t.e(kVar, "$receiver");
            return pVar.A(pVar.c(kVar));
        }

        public static boolean g(p pVar, i iVar) {
            hc.t.e(iVar, "$receiver");
            k d10 = pVar.d(iVar);
            return (d10 != null ? pVar.C(d10) : null) != null;
        }

        public static boolean h(p pVar, i iVar) {
            hc.t.e(iVar, "$receiver");
            g q02 = pVar.q0(iVar);
            return (q02 != null ? pVar.h(q02) : null) != null;
        }

        public static boolean i(p pVar, k kVar) {
            hc.t.e(kVar, "$receiver");
            return pVar.e0(pVar.c(kVar));
        }

        public static boolean j(p pVar, i iVar) {
            hc.t.e(iVar, "$receiver");
            return (iVar instanceof k) && pVar.l((k) iVar);
        }

        public static boolean k(p pVar, i iVar) {
            hc.t.e(iVar, "$receiver");
            return pVar.U(pVar.D0(iVar)) && !pVar.V(iVar);
        }

        public static k l(p pVar, i iVar) {
            k e10;
            hc.t.e(iVar, "$receiver");
            g q02 = pVar.q0(iVar);
            if (q02 == null || (e10 = pVar.e(q02)) == null) {
                k d10 = pVar.d(iVar);
                hc.t.b(d10);
                return d10;
            }
            return e10;
        }

        public static int m(p pVar, l lVar) {
            hc.t.e(lVar, "$receiver");
            if (lVar instanceof k) {
                return pVar.t0((i) lVar);
            }
            if (lVar instanceof se.a) {
                return ((se.a) lVar).size();
            }
            throw new IllegalStateException(("unknown type argument list type: " + lVar + ", " + k0.b(lVar.getClass())).toString());
        }

        public static n n(p pVar, i iVar) {
            hc.t.e(iVar, "$receiver");
            k d10 = pVar.d(iVar);
            if (d10 == null) {
                d10 = pVar.x0(iVar);
            }
            return pVar.c(d10);
        }

        public static k o(p pVar, i iVar) {
            k b10;
            hc.t.e(iVar, "$receiver");
            g q02 = pVar.q0(iVar);
            if (q02 == null || (b10 = pVar.b(q02)) == null) {
                k d10 = pVar.d(iVar);
                hc.t.b(d10);
                return d10;
            }
            return b10;
        }
    }

    boolean A(n nVar);

    k A0(e eVar);

    boolean B(i iVar);

    m B0(i iVar);

    e C(k kVar);

    n D0(i iVar);

    boolean E0(n nVar);

    boolean F(n nVar, n nVar2);

    List<m> G(i iVar);

    m H(k kVar, int i10);

    u I(m mVar);

    o J(n nVar, int i10);

    int K(n nVar);

    o L(t tVar);

    i M(d dVar);

    List<i> O(o oVar);

    boolean P(k kVar);

    boolean Q(i iVar);

    List<o> R(n nVar);

    boolean S(o oVar, n nVar);

    boolean U(n nVar);

    boolean V(i iVar);

    m X(i iVar, int i10);

    boolean Y(k kVar);

    List<k> Z(k kVar, n nVar);

    boolean a(k kVar);

    boolean a0(i iVar);

    k b(g gVar);

    m b0(l lVar, int i10);

    n c(k kVar);

    boolean c0(i iVar);

    k d(i iVar);

    c d0(d dVar);

    k e(g gVar);

    boolean e0(n nVar);

    k f(k kVar, boolean z10);

    boolean f0(i iVar);

    d g(k kVar);

    f h(g gVar);

    boolean h0(k kVar);

    boolean i(m mVar);

    d1.c i0(k kVar);

    boolean j(n nVar);

    b j0(d dVar);

    boolean k(n nVar);

    boolean k0(i iVar);

    boolean l(k kVar);

    boolean l0(i iVar);

    boolean m(i iVar);

    Collection<i> m0(n nVar);

    boolean n0(d dVar);

    u o(o oVar);

    i o0(i iVar, boolean z10);

    i p0(List<? extends i> list);

    i q(m mVar);

    g q0(i iVar);

    i r(i iVar);

    boolean r0(n nVar);

    m s(c cVar);

    boolean t(k kVar);

    int t0(i iVar);

    boolean u(k kVar);

    l u0(k kVar);

    o v(n nVar);

    j v0(g gVar);

    k w(k kVar, b bVar);

    Collection<i> w0(k kVar);

    k x(i iVar);

    k x0(i iVar);

    boolean y(d dVar);

    int z(l lVar);

    boolean z0(i iVar);
}
