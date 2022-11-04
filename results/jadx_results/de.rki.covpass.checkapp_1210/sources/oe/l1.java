package oe;

import java.util.ArrayList;
import java.util.List;
import uc.k;
/* loaded from: classes3.dex */
public class l1 {

    /* renamed from: b */
    public static final l1 f18012b = g(j1.f18005a);

    /* renamed from: a */
    private final j1 f18013a;

    /* loaded from: classes3.dex */
    public static class a implements gc.l<wd.c, Boolean> {
        a() {
        }

        private static /* synthetic */ void a(int i10) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "name", "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1", "invoke"));
        }

        /* renamed from: b */
        public Boolean invoke(wd.c cVar) {
            if (cVar == null) {
                a(0);
            }
            return Boolean.valueOf(!cVar.equals(k.a.Q));
        }
    }

    /* loaded from: classes3.dex */
    public static /* synthetic */ class b {

        /* renamed from: a */
        static final /* synthetic */ int[] f18014a;

        static {
            int[] iArr = new int[d.values().length];
            f18014a = iArr;
            try {
                iArr[d.OUT_IN_IN_POSITION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18014a[d.IN_IN_OUT_POSITION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18014a[d.NO_CONFLICT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class c extends Exception {
        public c(String str) {
            super(str);
        }
    }

    /* loaded from: classes3.dex */
    public enum d {
        NO_CONFLICT,
        IN_IN_OUT_POSITION,
        OUT_IN_IN_POSITION
    }

    protected l1(j1 j1Var) {
        if (j1Var == null) {
            a(7);
        }
        this.f18013a = j1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00fc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ void a(int r13) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oe.l1.a(int):void");
    }

    private static void b(int i10, g1 g1Var, j1 j1Var) {
        if (i10 <= 100) {
            return;
        }
        throw new IllegalStateException("Recursion too deep. Most likely infinite loop while substituting " + o(g1Var) + "; substitution: " + o(j1Var));
    }

    public static r1 c(r1 r1Var, g1 g1Var) {
        if (r1Var == null) {
            a(35);
        }
        if (g1Var == null) {
            a(36);
        }
        if (g1Var.c()) {
            r1 r1Var2 = r1.OUT_VARIANCE;
            if (r1Var2 == null) {
                a(37);
            }
            return r1Var2;
        }
        return d(r1Var, g1Var.b());
    }

    public static r1 d(r1 r1Var, r1 r1Var2) {
        if (r1Var == null) {
            a(38);
        }
        if (r1Var2 == null) {
            a(39);
        }
        r1 r1Var3 = r1.INVARIANT;
        if (r1Var == r1Var3) {
            if (r1Var2 == null) {
                a(40);
            }
            return r1Var2;
        } else if (r1Var2 == r1Var3) {
            if (r1Var == null) {
                a(41);
            }
            return r1Var;
        } else if (r1Var == r1Var2) {
            if (r1Var2 == null) {
                a(42);
            }
            return r1Var2;
        } else {
            throw new AssertionError("Variance conflict: type parameter variance '" + r1Var + "' and projection kind '" + r1Var2 + "' cannot be combined");
        }
    }

    private static d e(r1 r1Var, r1 r1Var2) {
        r1 r1Var3 = r1.IN_VARIANCE;
        return (r1Var == r1Var3 && r1Var2 == r1.OUT_VARIANCE) ? d.OUT_IN_IN_POSITION : (r1Var == r1.OUT_VARIANCE && r1Var2 == r1Var3) ? d.IN_IN_OUT_POSITION : d.NO_CONFLICT;
    }

    public static l1 f(e0 e0Var) {
        if (e0Var == null) {
            a(6);
        }
        return g(f1.i(e0Var.W0(), e0Var.U0()));
    }

    public static l1 g(j1 j1Var) {
        if (j1Var == null) {
            a(0);
        }
        return new l1(j1Var);
    }

    public static l1 h(j1 j1Var, j1 j1Var2) {
        if (j1Var == null) {
            a(3);
        }
        if (j1Var2 == null) {
            a(4);
        }
        return g(u.i(j1Var, j1Var2));
    }

    private static yc.g i(yc.g gVar) {
        if (gVar == null) {
            a(33);
        }
        return !gVar.B(k.a.Q) ? gVar : new yc.l(gVar, new a());
    }

    private static g1 l(e0 e0Var, g1 g1Var, xc.f1 f1Var, g1 g1Var2) {
        if (e0Var == null) {
            a(26);
        }
        if (g1Var == null) {
            a(27);
        }
        if (g1Var2 == null) {
            a(28);
        }
        if (!e0Var.j().B(k.a.Q)) {
            if (g1Var == null) {
                a(29);
            }
            return g1Var;
        }
        e1 W0 = g1Var.getType().W0();
        if (!(W0 instanceof pe.j)) {
            return g1Var;
        }
        g1 b10 = ((pe.j) W0).b();
        r1 b11 = b10.b();
        d e10 = e(g1Var2.b(), b11);
        d dVar = d.OUT_IN_IN_POSITION;
        return e10 == dVar ? new i1(b10.getType()) : (f1Var != null && e(f1Var.w(), b11) == dVar) ? new i1(b10.getType()) : g1Var;
    }

    private static String o(Object obj) {
        try {
            return obj.toString();
        } catch (Throwable th2) {
            if (ye.c.a(th2)) {
                throw th2;
            }
            return "[Exception while computing toString(): " + th2 + "]";
        }
    }

    private g1 r(g1 g1Var, int i10) {
        e0 type = g1Var.getType();
        r1 b10 = g1Var.b();
        if (type.W0().z() instanceof xc.f1) {
            return g1Var;
        }
        e0 e0Var = null;
        m0 b11 = q0.b(type);
        if (b11 != null) {
            e0Var = m().p(b11, r1.INVARIANT);
        }
        e0 b12 = k1.b(type, s(type.W0().getParameters(), type.U0(), i10), this.f18013a.d(type.j()));
        if ((b12 instanceof m0) && (e0Var instanceof m0)) {
            b12 = q0.j((m0) b12, (m0) e0Var);
        }
        return new i1(b10, b12);
    }

    private List<g1> s(List<xc.f1> list, List<g1> list2, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        boolean z10 = false;
        for (int i11 = 0; i11 < list.size(); i11++) {
            xc.f1 f1Var = list.get(i11);
            g1 g1Var = list2.get(i11);
            g1 u10 = u(g1Var, f1Var, i10 + 1);
            int i12 = b.f18014a[e(f1Var.w(), u10.b()).ordinal()];
            if (i12 == 1 || i12 == 2) {
                u10 = n1.s(f1Var);
            } else if (i12 == 3) {
                r1 w9 = f1Var.w();
                r1 r1Var = r1.INVARIANT;
                if (w9 != r1Var && !u10.c()) {
                    u10 = new i1(r1Var, u10.getType());
                }
            }
            if (u10 != g1Var) {
                z10 = true;
            }
            arrayList.add(u10);
        }
        return !z10 ? list2 : arrayList;
    }

    private g1 u(g1 g1Var, xc.f1 f1Var, int i10) {
        if (g1Var == null) {
            a(18);
        }
        b(i10, g1Var, this.f18013a);
        if (g1Var.c()) {
            return g1Var;
        }
        e0 type = g1Var.getType();
        if (type instanceof o1) {
            o1 o1Var = (o1) type;
            q1 M0 = o1Var.M0();
            e0 e02 = o1Var.e0();
            g1 u10 = u(new i1(g1Var.b(), M0), f1Var, i10 + 1);
            return u10.c() ? u10 : new i1(u10.b(), p1.d(u10.getType().Z0(), p(e02, g1Var.b())));
        }
        if (!w.a(type) && !(type.Z0() instanceof l0)) {
            g1 e10 = this.f18013a.e(type);
            g1 l10 = e10 != null ? l(type, e10, f1Var, g1Var) : null;
            r1 b10 = g1Var.b();
            if (l10 == null && b0.b(type) && !c1.b(type)) {
                y a10 = b0.a(type);
                int i11 = i10 + 1;
                g1 u11 = u(new i1(b10, a10.e1()), f1Var, i11);
                g1 u12 = u(new i1(b10, a10.f1()), f1Var, i11);
                return (u11.getType() == a10.e1() && u12.getType() == a10.f1()) ? g1Var : new i1(u11.b(), f0.d(k1.a(u11.getType()), k1.a(u12.getType())));
            } else if (!uc.h.m0(type) && !g0.a(type)) {
                if (l10 != null) {
                    d e11 = e(b10, l10.b());
                    if (!be.d.d(type)) {
                        int i12 = b.f18014a[e11.ordinal()];
                        if (i12 == 1) {
                            throw new c("Out-projection in in-position");
                        }
                        if (i12 == 2) {
                            return new i1(r1.OUT_VARIANCE, type.W0().x().I());
                        }
                    }
                    n a11 = c1.a(type);
                    if (l10.c()) {
                        return l10;
                    }
                    e0 y02 = a11 != null ? a11.y0(l10.getType()) : n1.q(l10.getType(), type.X0());
                    if (!type.j().isEmpty()) {
                        y02 = te.a.u(y02, new yc.k(y02.j(), i(this.f18013a.d(type.j()))));
                    }
                    if (e11 == d.NO_CONFLICT) {
                        b10 = d(b10, l10.b());
                    }
                    return new i1(b10, y02);
                }
                g1Var = r(g1Var, i10);
                if (g1Var == null) {
                    a(25);
                }
            }
        }
        return g1Var;
    }

    public j1 j() {
        j1 j1Var = this.f18013a;
        if (j1Var == null) {
            a(8);
        }
        return j1Var;
    }

    public boolean k() {
        return this.f18013a.f();
    }

    public l1 m() {
        j1 j1Var = this.f18013a;
        return (!(j1Var instanceof c0) || !j1Var.b()) ? this : new l1(new c0(((c0) this.f18013a).j(), ((c0) this.f18013a).i(), false));
    }

    public e0 n(e0 e0Var, r1 r1Var) {
        if (e0Var == null) {
            a(9);
        }
        if (r1Var == null) {
            a(10);
        }
        if (k()) {
            if (e0Var == null) {
                a(11);
            }
            return e0Var;
        }
        try {
            e0 type = u(new i1(r1Var, e0Var), null, 0).getType();
            if (type == null) {
                a(12);
            }
            return type;
        } catch (c e10) {
            qe.h d10 = qe.k.d(qe.j.UNABLE_TO_SUBSTITUTE_TYPE, e10.getMessage());
            if (d10 == null) {
                a(13);
            }
            return d10;
        }
    }

    public e0 p(e0 e0Var, r1 r1Var) {
        if (e0Var == null) {
            a(14);
        }
        if (r1Var == null) {
            a(15);
        }
        g1 q10 = q(new i1(r1Var, j().g(e0Var, r1Var)));
        if (q10 == null) {
            return null;
        }
        return q10.getType();
    }

    public g1 q(g1 g1Var) {
        if (g1Var == null) {
            a(16);
        }
        g1 t10 = t(g1Var);
        return (this.f18013a.a() || this.f18013a.b()) ? ue.b.c(t10, this.f18013a.b()) : t10;
    }

    public g1 t(g1 g1Var) {
        if (g1Var == null) {
            a(17);
        }
        if (k()) {
            return g1Var;
        }
        try {
            return u(g1Var, null, 0);
        } catch (c unused) {
            return null;
        }
    }
}
