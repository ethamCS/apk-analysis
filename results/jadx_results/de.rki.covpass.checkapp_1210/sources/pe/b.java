package pe;

import hc.k0;
import java.util.Collection;
import java.util.List;
import oe.d0;
import oe.d1;
import oe.e0;
import oe.e1;
import oe.g0;
import oe.g1;
import oe.j0;
import oe.l0;
import oe.l1;
import oe.m0;
import oe.m1;
import oe.n1;
import oe.p0;
import oe.q1;
import oe.r1;
import se.r;
import uc.k;
import xc.f0;
import xc.f1;
import xc.h1;
import xc.z;
/* loaded from: classes3.dex */
public interface b extends m1, se.r {

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: pe.b$a$a */
        /* loaded from: classes3.dex */
        public static final class C0309a extends d1.c.a {

            /* renamed from: a */
            final /* synthetic */ b f19144a;

            /* renamed from: b */
            final /* synthetic */ l1 f19145b;

            C0309a(b bVar, l1 l1Var) {
                this.f19144a = bVar;
                this.f19145b = l1Var;
            }

            @Override // oe.d1.c
            public se.k a(d1 d1Var, se.i iVar) {
                hc.t.e(d1Var, "state");
                hc.t.e(iVar, "type");
                b bVar = this.f19144a;
                l1 l1Var = this.f19145b;
                se.k x02 = bVar.x0(iVar);
                hc.t.c(x02, "null cannot be cast to non-null type org.jetbrains.kotlin.types.KotlinType");
                e0 n10 = l1Var.n((e0) x02, r1.INVARIANT);
                hc.t.d(n10, "substitutor.safeSubstitu…VARIANT\n                )");
                se.k d10 = bVar.d(n10);
                hc.t.b(d10);
                return d10;
            }
        }

        public static se.o A(b bVar, se.n nVar) {
            hc.t.e(nVar, "$receiver");
            if (nVar instanceof e1) {
                xc.h z10 = ((e1) nVar).z();
                if (!(z10 instanceof f1)) {
                    return null;
                }
                return (f1) z10;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nVar + ", " + k0.b(nVar.getClass())).toString());
        }

        public static se.c A0(b bVar, se.d dVar) {
            hc.t.e(dVar, "$receiver");
            if (dVar instanceof i) {
                return ((i) dVar).W0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + dVar + ", " + k0.b(dVar.getClass())).toString());
        }

        public static se.i B(b bVar, se.i iVar) {
            hc.t.e(iVar, "$receiver");
            if (iVar instanceof e0) {
                return ae.f.e((e0) iVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + k0.b(iVar.getClass())).toString());
        }

        public static se.n B0(b bVar, se.i iVar) {
            hc.t.e(iVar, "$receiver");
            return r.a.n(bVar, iVar);
        }

        public static List<se.i> C(b bVar, se.o oVar) {
            hc.t.e(oVar, "$receiver");
            if (oVar instanceof f1) {
                List<e0> upperBounds = ((f1) oVar).getUpperBounds();
                hc.t.d(upperBounds, "this.upperBounds");
                return upperBounds;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + oVar + ", " + k0.b(oVar.getClass())).toString());
        }

        public static se.n C0(b bVar, se.k kVar) {
            hc.t.e(kVar, "$receiver");
            if (kVar instanceof m0) {
                return ((m0) kVar).W0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + kVar + ", " + k0.b(kVar.getClass())).toString());
        }

        public static se.u D(b bVar, se.m mVar) {
            hc.t.e(mVar, "$receiver");
            if (mVar instanceof g1) {
                r1 b10 = ((g1) mVar).b();
                hc.t.d(b10, "this.projectionKind");
                return se.q.a(b10);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + mVar + ", " + k0.b(mVar.getClass())).toString());
        }

        public static se.k D0(b bVar, se.g gVar) {
            hc.t.e(gVar, "$receiver");
            if (gVar instanceof oe.y) {
                return ((oe.y) gVar).f1();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + gVar + ", " + k0.b(gVar.getClass())).toString());
        }

        public static se.u E(b bVar, se.o oVar) {
            hc.t.e(oVar, "$receiver");
            if (oVar instanceof f1) {
                r1 w9 = ((f1) oVar).w();
                hc.t.d(w9, "this.variance");
                return se.q.a(w9);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + oVar + ", " + k0.b(oVar.getClass())).toString());
        }

        public static se.k E0(b bVar, se.i iVar) {
            hc.t.e(iVar, "$receiver");
            return r.a.o(bVar, iVar);
        }

        public static boolean F(b bVar, se.i iVar, wd.c cVar) {
            hc.t.e(iVar, "$receiver");
            hc.t.e(cVar, "fqName");
            if (iVar instanceof e0) {
                return ((e0) iVar).j().B(cVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + k0.b(iVar.getClass())).toString());
        }

        public static se.i F0(b bVar, se.i iVar, boolean z10) {
            hc.t.e(iVar, "$receiver");
            if (iVar instanceof se.k) {
                return bVar.f((se.k) iVar, z10);
            }
            if (!(iVar instanceof se.g)) {
                throw new IllegalStateException("sealed".toString());
            }
            se.g gVar = (se.g) iVar;
            return bVar.N(bVar.f(bVar.e(gVar), z10), bVar.f(bVar.b(gVar), z10));
        }

        public static boolean G(b bVar, se.i iVar) {
            hc.t.e(iVar, "$receiver");
            return r.a.d(bVar, iVar);
        }

        public static se.k G0(b bVar, se.k kVar, boolean z10) {
            hc.t.e(kVar, "$receiver");
            if (kVar instanceof m0) {
                return ((m0) kVar).d1(z10);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + kVar + ", " + k0.b(kVar.getClass())).toString());
        }

        public static boolean H(b bVar, se.o oVar, se.n nVar) {
            hc.t.e(oVar, "$receiver");
            if (!(oVar instanceof f1)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + oVar + ", " + k0.b(oVar.getClass())).toString());
            }
            if (nVar == null ? true : nVar instanceof e1) {
                return te.a.l((f1) oVar, (e1) nVar, null, 4, null);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + oVar + ", " + k0.b(oVar.getClass())).toString());
        }

        public static boolean I(b bVar, se.k kVar, se.k kVar2) {
            hc.t.e(kVar, "a");
            hc.t.e(kVar2, "b");
            if (!(kVar instanceof m0)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + kVar + ", " + k0.b(kVar.getClass())).toString());
            } else if (kVar2 instanceof m0) {
                return ((m0) kVar).U0() == ((m0) kVar2).U0();
            } else {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + kVar2 + ", " + k0.b(kVar2.getClass())).toString());
            }
        }

        public static se.i J(b bVar, List<? extends se.i> list) {
            hc.t.e(list, "types");
            return d.a(list);
        }

        public static boolean K(b bVar, se.n nVar) {
            hc.t.e(nVar, "$receiver");
            if (nVar instanceof e1) {
                return uc.h.v0((e1) nVar, k.a.f23467b);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nVar + ", " + k0.b(nVar.getClass())).toString());
        }

        public static boolean L(b bVar, se.i iVar) {
            hc.t.e(iVar, "$receiver");
            return r.a.e(bVar, iVar);
        }

        public static boolean M(b bVar, se.k kVar) {
            hc.t.e(kVar, "$receiver");
            return r.a.f(bVar, kVar);
        }

        public static boolean N(b bVar, se.n nVar) {
            hc.t.e(nVar, "$receiver");
            if (nVar instanceof e1) {
                return ((e1) nVar).z() instanceof xc.e;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nVar + ", " + k0.b(nVar.getClass())).toString());
        }

        public static boolean O(b bVar, se.n nVar) {
            hc.t.e(nVar, "$receiver");
            if (nVar instanceof e1) {
                xc.h z10 = ((e1) nVar).z();
                xc.e eVar = z10 instanceof xc.e ? (xc.e) z10 : null;
                return (eVar == null || !f0.a(eVar) || eVar.h() == xc.f.ENUM_ENTRY || eVar.h() == xc.f.ANNOTATION_CLASS) ? false : true;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nVar + ", " + k0.b(nVar.getClass())).toString());
        }

        public static boolean P(b bVar, se.i iVar) {
            hc.t.e(iVar, "$receiver");
            return r.a.g(bVar, iVar);
        }

        public static boolean Q(b bVar, se.n nVar) {
            hc.t.e(nVar, "$receiver");
            if (nVar instanceof e1) {
                return ((e1) nVar).y();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nVar + ", " + k0.b(nVar.getClass())).toString());
        }

        public static boolean R(b bVar, se.i iVar) {
            hc.t.e(iVar, "$receiver");
            return r.a.h(bVar, iVar);
        }

        public static boolean S(b bVar, se.i iVar) {
            hc.t.e(iVar, "$receiver");
            if (iVar instanceof e0) {
                return g0.a((e0) iVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + k0.b(iVar.getClass())).toString());
        }

        public static boolean T(b bVar, se.n nVar) {
            hc.t.e(nVar, "$receiver");
            if (nVar instanceof e1) {
                xc.h z10 = ((e1) nVar).z();
                h1<m0> h1Var = null;
                xc.e eVar = z10 instanceof xc.e ? (xc.e) z10 : null;
                if (eVar != null) {
                    h1Var = eVar.x0();
                }
                return h1Var instanceof z;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nVar + ", " + k0.b(nVar.getClass())).toString());
        }

        public static boolean U(b bVar, se.k kVar) {
            hc.t.e(kVar, "$receiver");
            return r.a.i(bVar, kVar);
        }

        public static boolean V(b bVar, se.n nVar) {
            hc.t.e(nVar, "$receiver");
            if (nVar instanceof e1) {
                return nVar instanceof ce.n;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nVar + ", " + k0.b(nVar.getClass())).toString());
        }

        public static boolean W(b bVar, se.n nVar) {
            hc.t.e(nVar, "$receiver");
            if (nVar instanceof e1) {
                return nVar instanceof d0;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nVar + ", " + k0.b(nVar.getClass())).toString());
        }

        public static boolean X(b bVar, se.i iVar) {
            hc.t.e(iVar, "$receiver");
            return r.a.j(bVar, iVar);
        }

        public static boolean Y(b bVar, se.k kVar) {
            hc.t.e(kVar, "$receiver");
            if (kVar instanceof m0) {
                return ((m0) kVar).X0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + kVar + ", " + k0.b(kVar.getClass())).toString());
        }

        public static boolean Z(b bVar, se.i iVar) {
            hc.t.e(iVar, "$receiver");
            return iVar instanceof j0;
        }

        public static boolean a(b bVar, se.n nVar, se.n nVar2) {
            hc.t.e(nVar, "c1");
            hc.t.e(nVar2, "c2");
            if (!(nVar instanceof e1)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nVar + ", " + k0.b(nVar.getClass())).toString());
            } else if (nVar2 instanceof e1) {
                return hc.t.a(nVar, nVar2);
            } else {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nVar2 + ", " + k0.b(nVar2.getClass())).toString());
            }
        }

        public static boolean a0(b bVar, se.i iVar) {
            hc.t.e(iVar, "$receiver");
            return r.a.k(bVar, iVar);
        }

        public static int b(b bVar, se.i iVar) {
            hc.t.e(iVar, "$receiver");
            if (iVar instanceof e0) {
                return ((e0) iVar).U0().size();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + k0.b(iVar.getClass())).toString());
        }

        public static boolean b0(b bVar, se.n nVar) {
            hc.t.e(nVar, "$receiver");
            if (nVar instanceof e1) {
                return uc.h.v0((e1) nVar, k.a.f23469c);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nVar + ", " + k0.b(nVar.getClass())).toString());
        }

        public static se.l c(b bVar, se.k kVar) {
            hc.t.e(kVar, "$receiver");
            if (kVar instanceof m0) {
                return (se.l) kVar;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + kVar + ", " + k0.b(kVar.getClass())).toString());
        }

        public static boolean c0(b bVar, se.i iVar) {
            hc.t.e(iVar, "$receiver");
            if (iVar instanceof e0) {
                return n1.l((e0) iVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + k0.b(iVar.getClass())).toString());
        }

        public static se.d d(b bVar, se.k kVar) {
            hc.t.e(kVar, "$receiver");
            if (kVar instanceof m0) {
                if (kVar instanceof p0) {
                    return bVar.g(((p0) kVar).M0());
                }
                if (!(kVar instanceof i)) {
                    return null;
                }
                return (i) kVar;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + kVar + ", " + k0.b(kVar.getClass())).toString());
        }

        public static boolean d0(b bVar, se.d dVar) {
            hc.t.e(dVar, "$receiver");
            return dVar instanceof be.a;
        }

        public static se.e e(b bVar, se.k kVar) {
            hc.t.e(kVar, "$receiver");
            if (kVar instanceof m0) {
                if (!(kVar instanceof oe.p)) {
                    return null;
                }
                return (oe.p) kVar;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + kVar + ", " + k0.b(kVar.getClass())).toString());
        }

        public static boolean e0(b bVar, se.k kVar) {
            hc.t.e(kVar, "$receiver");
            if (kVar instanceof e0) {
                return uc.h.r0((e0) kVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + kVar + ", " + k0.b(kVar.getClass())).toString());
        }

        public static se.f f(b bVar, se.g gVar) {
            hc.t.e(gVar, "$receiver");
            if (gVar instanceof oe.y) {
                if (!(gVar instanceof oe.v)) {
                    return null;
                }
                return (oe.v) gVar;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + gVar + ", " + k0.b(gVar.getClass())).toString());
        }

        public static boolean f0(b bVar, se.d dVar) {
            hc.t.e(dVar, "$receiver");
            if (dVar instanceof i) {
                return ((i) dVar).i1();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + dVar + ", " + k0.b(dVar.getClass())).toString());
        }

        public static se.g g(b bVar, se.i iVar) {
            hc.t.e(iVar, "$receiver");
            if (iVar instanceof e0) {
                q1 Z0 = ((e0) iVar).Z0();
                if (!(Z0 instanceof oe.y)) {
                    return null;
                }
                return (oe.y) Z0;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + k0.b(iVar.getClass())).toString());
        }

        public static boolean g0(b bVar, se.k kVar) {
            hc.t.e(kVar, "$receiver");
            if (!(kVar instanceof m0)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + kVar + ", " + k0.b(kVar.getClass())).toString());
            }
            if (!g0.a((e0) kVar)) {
                m0 m0Var = (m0) kVar;
                if (!(m0Var.W0().z() instanceof xc.e1) && (m0Var.W0().z() != null || (kVar instanceof be.a) || (kVar instanceof i) || (kVar instanceof oe.p) || (m0Var.W0() instanceof ce.n) || h0(bVar, kVar))) {
                    return true;
                }
            }
            return false;
        }

        public static se.j h(b bVar, se.g gVar) {
            hc.t.e(gVar, "$receiver");
            if (gVar instanceof oe.y) {
                if (!(gVar instanceof l0)) {
                    return null;
                }
                return (l0) gVar;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + gVar + ", " + k0.b(gVar.getClass())).toString());
        }

        private static boolean h0(b bVar, se.k kVar) {
            return (kVar instanceof p0) && bVar.a(((p0) kVar).M0());
        }

        public static se.k i(b bVar, se.i iVar) {
            hc.t.e(iVar, "$receiver");
            if (iVar instanceof e0) {
                q1 Z0 = ((e0) iVar).Z0();
                if (!(Z0 instanceof m0)) {
                    return null;
                }
                return (m0) Z0;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + k0.b(iVar.getClass())).toString());
        }

        public static boolean i0(b bVar, se.m mVar) {
            hc.t.e(mVar, "$receiver");
            if (mVar instanceof g1) {
                return ((g1) mVar).c();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + mVar + ", " + k0.b(mVar.getClass())).toString());
        }

        public static se.m j(b bVar, se.i iVar) {
            hc.t.e(iVar, "$receiver");
            if (iVar instanceof e0) {
                return te.a.a((e0) iVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + k0.b(iVar.getClass())).toString());
        }

        public static boolean j0(b bVar, se.k kVar) {
            hc.t.e(kVar, "$receiver");
            if (kVar instanceof m0) {
                return te.a.m((e0) kVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + kVar + ", " + k0.b(kVar.getClass())).toString());
        }

        public static se.k k(b bVar, se.k kVar, se.b bVar2) {
            hc.t.e(kVar, "type");
            hc.t.e(bVar2, "status");
            if (kVar instanceof m0) {
                return k.b((m0) kVar, bVar2);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + kVar + ", " + k0.b(kVar.getClass())).toString());
        }

        public static boolean k0(b bVar, se.k kVar) {
            hc.t.e(kVar, "$receiver");
            if (kVar instanceof m0) {
                return te.a.n((e0) kVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + kVar + ", " + k0.b(kVar.getClass())).toString());
        }

        public static se.b l(b bVar, se.d dVar) {
            hc.t.e(dVar, "$receiver");
            if (dVar instanceof i) {
                return ((i) dVar).f1();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + dVar + ", " + k0.b(dVar.getClass())).toString());
        }

        public static boolean l0(b bVar, se.i iVar) {
            hc.t.e(iVar, "$receiver");
            return (iVar instanceof q1) && (((q1) iVar).W0() instanceof n);
        }

        public static se.i m(b bVar, se.k kVar, se.k kVar2) {
            hc.t.e(kVar, "lowerBound");
            hc.t.e(kVar2, "upperBound");
            if (!(kVar instanceof m0)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + bVar + ", " + k0.b(bVar.getClass())).toString());
            } else if (kVar2 instanceof m0) {
                return oe.f0.d((m0) kVar, (m0) kVar2);
            } else {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + bVar + ", " + k0.b(bVar.getClass())).toString());
            }
        }

        public static boolean m0(b bVar, se.n nVar) {
            hc.t.e(nVar, "$receiver");
            if (nVar instanceof e1) {
                xc.h z10 = ((e1) nVar).z();
                return z10 != null && uc.h.A0(z10);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nVar + ", " + k0.b(nVar.getClass())).toString());
        }

        public static List<se.k> n(b bVar, se.k kVar, se.n nVar) {
            hc.t.e(kVar, "$receiver");
            hc.t.e(nVar, "constructor");
            return r.a.a(bVar, kVar, nVar);
        }

        public static se.k n0(b bVar, se.g gVar) {
            hc.t.e(gVar, "$receiver");
            if (gVar instanceof oe.y) {
                return ((oe.y) gVar).e1();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + gVar + ", " + k0.b(gVar.getClass())).toString());
        }

        public static se.m o(b bVar, se.l lVar, int i10) {
            hc.t.e(lVar, "$receiver");
            return r.a.b(bVar, lVar, i10);
        }

        public static se.k o0(b bVar, se.i iVar) {
            hc.t.e(iVar, "$receiver");
            return r.a.l(bVar, iVar);
        }

        public static se.m p(b bVar, se.i iVar, int i10) {
            hc.t.e(iVar, "$receiver");
            if (iVar instanceof e0) {
                return ((e0) iVar).U0().get(i10);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + k0.b(iVar.getClass())).toString());
        }

        public static se.i p0(b bVar, se.d dVar) {
            hc.t.e(dVar, "$receiver");
            if (dVar instanceof i) {
                return ((i) dVar).h1();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + dVar + ", " + k0.b(dVar.getClass())).toString());
        }

        public static se.m q(b bVar, se.k kVar, int i10) {
            hc.t.e(kVar, "$receiver");
            return r.a.c(bVar, kVar, i10);
        }

        public static se.i q0(b bVar, se.i iVar) {
            q1 b10;
            hc.t.e(iVar, "$receiver");
            if (iVar instanceof q1) {
                b10 = c.b((q1) iVar);
                return b10;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + k0.b(iVar.getClass())).toString());
        }

        public static List<se.m> r(b bVar, se.i iVar) {
            hc.t.e(iVar, "$receiver");
            if (iVar instanceof e0) {
                return ((e0) iVar).U0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + k0.b(iVar.getClass())).toString());
        }

        public static se.i r0(b bVar, se.i iVar) {
            hc.t.e(iVar, "$receiver");
            return m1.a.a(bVar, iVar);
        }

        public static wd.d s(b bVar, se.n nVar) {
            hc.t.e(nVar, "$receiver");
            if (nVar instanceof e1) {
                xc.h z10 = ((e1) nVar).z();
                hc.t.c(z10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return ee.a.i((xc.e) z10);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nVar + ", " + k0.b(nVar.getClass())).toString());
        }

        public static d1 s0(b bVar, boolean z10, boolean z11) {
            return pe.a.b(z10, z11, bVar, null, null, 24, null);
        }

        public static se.o t(b bVar, se.n nVar, int i10) {
            hc.t.e(nVar, "$receiver");
            if (nVar instanceof e1) {
                f1 f1Var = ((e1) nVar).getParameters().get(i10);
                hc.t.d(f1Var, "this.parameters[index]");
                return f1Var;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nVar + ", " + k0.b(nVar.getClass())).toString());
        }

        public static se.k t0(b bVar, se.e eVar) {
            hc.t.e(eVar, "$receiver");
            if (eVar instanceof oe.p) {
                return ((oe.p) eVar).i1();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + eVar + ", " + k0.b(eVar.getClass())).toString());
        }

        public static List<se.o> u(b bVar, se.n nVar) {
            hc.t.e(nVar, "$receiver");
            if (nVar instanceof e1) {
                List<f1> parameters = ((e1) nVar).getParameters();
                hc.t.d(parameters, "this.parameters");
                return parameters;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nVar + ", " + k0.b(nVar.getClass())).toString());
        }

        public static int u0(b bVar, se.n nVar) {
            hc.t.e(nVar, "$receiver");
            if (nVar instanceof e1) {
                return ((e1) nVar).getParameters().size();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nVar + ", " + k0.b(nVar.getClass())).toString());
        }

        public static uc.i v(b bVar, se.n nVar) {
            hc.t.e(nVar, "$receiver");
            if (nVar instanceof e1) {
                xc.h z10 = ((e1) nVar).z();
                hc.t.c(z10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return uc.h.P((xc.e) z10);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nVar + ", " + k0.b(nVar.getClass())).toString());
        }

        public static Collection<se.i> v0(b bVar, se.k kVar) {
            hc.t.e(kVar, "$receiver");
            se.n c10 = bVar.c(kVar);
            if (c10 instanceof ce.n) {
                return ((ce.n) c10).h();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + kVar + ", " + k0.b(kVar.getClass())).toString());
        }

        public static uc.i w(b bVar, se.n nVar) {
            hc.t.e(nVar, "$receiver");
            if (nVar instanceof e1) {
                xc.h z10 = ((e1) nVar).z();
                hc.t.c(z10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return uc.h.S((xc.e) z10);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nVar + ", " + k0.b(nVar.getClass())).toString());
        }

        public static se.m w0(b bVar, se.c cVar) {
            hc.t.e(cVar, "$receiver");
            if (cVar instanceof j) {
                return ((j) cVar).b();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + cVar + ", " + k0.b(cVar.getClass())).toString());
        }

        public static se.i x(b bVar, se.o oVar) {
            hc.t.e(oVar, "$receiver");
            if (oVar instanceof f1) {
                return te.a.i((f1) oVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + oVar + ", " + k0.b(oVar.getClass())).toString());
        }

        public static int x0(b bVar, se.l lVar) {
            hc.t.e(lVar, "$receiver");
            return r.a.m(bVar, lVar);
        }

        public static se.i y(b bVar, se.m mVar) {
            hc.t.e(mVar, "$receiver");
            if (mVar instanceof g1) {
                return ((g1) mVar).getType().Z0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + mVar + ", " + k0.b(mVar.getClass())).toString());
        }

        public static d1.c y0(b bVar, se.k kVar) {
            hc.t.e(kVar, "type");
            if (kVar instanceof m0) {
                return new C0309a(bVar, oe.f1.Companion.a((e0) kVar).c());
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + kVar + ", " + k0.b(kVar.getClass())).toString());
        }

        public static se.o z(b bVar, se.t tVar) {
            hc.t.e(tVar, "$receiver");
            if (tVar instanceof n) {
                return ((n) tVar).c();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + tVar + ", " + k0.b(tVar.getClass())).toString());
        }

        public static Collection<se.i> z0(b bVar, se.n nVar) {
            hc.t.e(nVar, "$receiver");
            if (nVar instanceof e1) {
                Collection<e0> l10 = ((e1) nVar).l();
                hc.t.d(l10, "this.supertypes");
                return l10;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nVar + ", " + k0.b(nVar.getClass())).toString());
        }
    }

    se.i N(se.k kVar, se.k kVar2);

    @Override // se.p
    boolean a(se.k kVar);

    @Override // se.p
    se.k b(se.g gVar);

    @Override // se.p
    se.n c(se.k kVar);

    @Override // se.p
    se.k d(se.i iVar);

    @Override // se.p
    se.k e(se.g gVar);

    @Override // se.p
    se.k f(se.k kVar, boolean z10);

    @Override // se.p
    se.d g(se.k kVar);
}
