package oe;

import he.h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe.x0;
/* loaded from: classes3.dex */
public final class v0 {
    public static final a Companion = new a(null);

    /* renamed from: c */
    private static final v0 f18051c = new v0(x0.a.f18058a, false);

    /* renamed from: a */
    private final x0 f18052a;

    /* renamed from: b */
    private final boolean f18053b;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void b(int i10, xc.e1 e1Var) {
            if (i10 <= 100) {
                return;
            }
            throw new AssertionError("Too deep recursion while expanding type alias " + e1Var.getName());
        }
    }

    public v0(x0 x0Var, boolean z10) {
        hc.t.e(x0Var, "reportStrategy");
        this.f18052a = x0Var;
        this.f18053b = z10;
    }

    private final void a(yc.g gVar, yc.g gVar2) {
        HashSet hashSet = new HashSet();
        Iterator<yc.c> it = gVar.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().d());
        }
        for (yc.c cVar : gVar2) {
            if (hashSet.contains(cVar.d())) {
                this.f18052a.a(cVar);
            }
        }
    }

    private final void b(e0 e0Var, e0 e0Var2) {
        l1 f10 = l1.f(e0Var2);
        hc.t.d(f10, "create(substitutedType)");
        int i10 = 0;
        for (Object obj : e0Var2.U0()) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                ub.u.r();
            }
            g1 g1Var = (g1) obj;
            if (!g1Var.c()) {
                e0 type = g1Var.getType();
                hc.t.d(type, "substitutedArgument.type");
                if (!te.a.d(type)) {
                    g1 g1Var2 = e0Var.U0().get(i10);
                    xc.f1 f1Var = e0Var.W0().getParameters().get(i10);
                    if (this.f18053b) {
                        x0 x0Var = this.f18052a;
                        e0 type2 = g1Var2.getType();
                        hc.t.d(type2, "unsubstitutedArgument.type");
                        e0 type3 = g1Var.getType();
                        hc.t.d(type3, "substitutedArgument.type");
                        hc.t.d(f1Var, "typeParameter");
                        x0Var.b(f10, type2, type3, f1Var);
                    }
                }
            }
            i10 = i11;
        }
    }

    private final v c(v vVar, a1 a1Var) {
        return vVar.c1(h(vVar, a1Var));
    }

    private final m0 d(m0 m0Var, a1 a1Var) {
        return g0.a(m0Var) ? m0Var : k1.f(m0Var, null, h(m0Var, a1Var), 1, null);
    }

    private final m0 e(m0 m0Var, e0 e0Var) {
        m0 r10 = n1.r(m0Var, e0Var.X0());
        hc.t.d(r10, "makeNullableIfNeeded(thi…romType.isMarkedNullable)");
        return r10;
    }

    private final m0 f(m0 m0Var, e0 e0Var) {
        return d(e(m0Var, e0Var), e0Var.V0());
    }

    private final m0 g(w0 w0Var, a1 a1Var, boolean z10) {
        e1 r10 = w0Var.b().r();
        hc.t.d(r10, "descriptor.typeConstructor");
        return f0.j(a1Var, r10, w0Var.a(), z10, h.b.f11873a);
    }

    private final a1 h(e0 e0Var, a1 a1Var) {
        boolean a10 = g0.a(e0Var);
        a1 V0 = e0Var.V0();
        return a10 ? V0 : a1Var.f(V0);
    }

    private final g1 j(g1 g1Var, w0 w0Var, int i10) {
        int s10;
        q1 Z0 = g1Var.getType().Z0();
        if (w.a(Z0)) {
            return g1Var;
        }
        m0 a10 = k1.a(Z0);
        if (g0.a(a10) || !te.a.x(a10)) {
            return g1Var;
        }
        e1 W0 = a10.W0();
        xc.h z10 = W0.z();
        W0.getParameters().size();
        a10.U0().size();
        if (z10 instanceof xc.f1) {
            return g1Var;
        }
        if (!(z10 instanceof xc.e1)) {
            m0 m10 = m(a10, w0Var, i10);
            b(a10, m10);
            return new i1(g1Var.b(), m10);
        }
        xc.e1 e1Var = (xc.e1) z10;
        int i11 = 0;
        if (w0Var.d(e1Var)) {
            this.f18052a.c(e1Var);
            r1 r1Var = r1.INVARIANT;
            qe.j jVar = qe.j.RECURSIVE_TYPE_ALIAS;
            String fVar = e1Var.getName().toString();
            hc.t.d(fVar, "typeDescriptor.name.toString()");
            return new i1(r1Var, qe.k.d(jVar, fVar));
        }
        List<g1> U0 = a10.U0();
        s10 = ub.v.s(U0, 10);
        ArrayList arrayList = new ArrayList(s10);
        for (Object obj : U0) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                ub.u.r();
            }
            arrayList.add(l((g1) obj, w0Var, W0.getParameters().get(i11), i10 + 1));
            i11 = i12;
        }
        m0 k10 = k(w0.Companion.a(w0Var, e1Var, arrayList), a10.V0(), a10.X0(), i10 + 1, false);
        m0 m11 = m(a10, w0Var, i10);
        if (!w.a(k10)) {
            k10 = q0.j(k10, m11);
        }
        return new i1(g1Var.b(), k10);
    }

    private final m0 k(w0 w0Var, a1 a1Var, boolean z10, int i10, boolean z11) {
        g1 l10 = l(new i1(r1.INVARIANT, w0Var.b().L()), w0Var, null, i10);
        e0 type = l10.getType();
        hc.t.d(type, "expandedProjection.type");
        m0 a10 = k1.a(type);
        if (g0.a(a10)) {
            return a10;
        }
        l10.b();
        a(a10.j(), k.a(a1Var));
        m0 r10 = n1.r(d(a10, a1Var), z10);
        hc.t.d(r10, "expandedType.combineAttr…fNeeded(it, isNullable) }");
        return z11 ? q0.j(r10, g(w0Var, a1Var, z10)) : r10;
    }

    private final g1 l(g1 g1Var, w0 w0Var, xc.f1 f1Var, int i10) {
        r1 r1Var;
        r1 r1Var2;
        r1 r1Var3;
        Companion.b(i10, w0Var.b());
        if (!g1Var.c()) {
            e0 type = g1Var.getType();
            hc.t.d(type, "underlyingProjection.type");
            g1 c10 = w0Var.c(type.W0());
            if (c10 == null) {
                return j(g1Var, w0Var, i10);
            }
            if (!c10.c()) {
                q1 Z0 = c10.getType().Z0();
                r1 b10 = c10.b();
                hc.t.d(b10, "argument.projectionKind");
                r1 b11 = g1Var.b();
                hc.t.d(b11, "underlyingProjection.projectionKind");
                if (b11 != b10 && b11 != (r1Var3 = r1.INVARIANT)) {
                    if (b10 == r1Var3) {
                        b10 = b11;
                    } else {
                        this.f18052a.d(w0Var.b(), f1Var, Z0);
                    }
                }
                if (f1Var == null || (r1Var = f1Var.w()) == null) {
                    r1Var = r1.INVARIANT;
                }
                hc.t.d(r1Var, "typeParameterDescriptor?…nce ?: Variance.INVARIANT");
                if (r1Var != b10 && r1Var != (r1Var2 = r1.INVARIANT)) {
                    if (b10 == r1Var2) {
                        b10 = r1Var2;
                    } else {
                        this.f18052a.d(w0Var.b(), f1Var, Z0);
                    }
                }
                a(type.j(), Z0.j());
                return new i1(b10, Z0 instanceof v ? c((v) Z0, type.V0()) : f(k1.a(Z0), type));
            }
        }
        hc.t.b(f1Var);
        g1 s10 = n1.s(f1Var);
        hc.t.d(s10, "makeStarProjection(typeParameterDescriptor!!)");
        return s10;
    }

    private final m0 m(m0 m0Var, w0 w0Var, int i10) {
        int s10;
        e1 W0 = m0Var.W0();
        List<g1> U0 = m0Var.U0();
        s10 = ub.v.s(U0, 10);
        ArrayList arrayList = new ArrayList(s10);
        int i11 = 0;
        for (Object obj : U0) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                ub.u.r();
            }
            g1 g1Var = (g1) obj;
            g1 l10 = l(g1Var, w0Var, W0.getParameters().get(i11), i10 + 1);
            if (!l10.c()) {
                l10 = new i1(l10.b(), n1.q(l10.getType(), g1Var.getType().X0()));
            }
            arrayList.add(l10);
            i11 = i12;
        }
        return k1.f(m0Var, arrayList, null, 2, null);
    }

    public final m0 i(w0 w0Var, a1 a1Var) {
        hc.t.e(w0Var, "typeAliasExpansion");
        hc.t.e(a1Var, "attributes");
        return k(w0Var, a1Var, false, 0, true);
    }
}
