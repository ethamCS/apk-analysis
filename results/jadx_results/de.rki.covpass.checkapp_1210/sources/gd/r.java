package gd;

import java.util.HashMap;
import java.util.Map;
import xc.l0;
import xc.n1;
/* loaded from: classes.dex */
public class r {

    /* renamed from: a */
    public static final xc.u f10745a;

    /* renamed from: b */
    public static final xc.u f10746b;

    /* renamed from: c */
    public static final xc.u f10747c;

    /* renamed from: d */
    private static final Map<n1, xc.u> f10748d = new HashMap();

    /* loaded from: classes.dex */
    static class a extends xc.r {
        a(n1 n1Var) {
            super(n1Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$1";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // xc.u
        public boolean e(ie.f fVar, xc.q qVar, xc.m mVar, boolean z10) {
            if (qVar == null) {
                g(0);
            }
            if (mVar == null) {
                g(1);
            }
            return r.d(qVar, mVar);
        }
    }

    /* loaded from: classes.dex */
    static class b extends xc.r {
        b(n1 n1Var) {
            super(n1Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$2";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // xc.u
        public boolean e(ie.f fVar, xc.q qVar, xc.m mVar, boolean z10) {
            if (qVar == null) {
                g(0);
            }
            if (mVar == null) {
                g(1);
            }
            return r.e(fVar, qVar, mVar);
        }
    }

    /* loaded from: classes.dex */
    static class c extends xc.r {
        c(n1 n1Var) {
            super(n1Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$3";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // xc.u
        public boolean e(ie.f fVar, xc.q qVar, xc.m mVar, boolean z10) {
            if (qVar == null) {
                g(0);
            }
            if (mVar == null) {
                g(1);
            }
            return r.e(fVar, qVar, mVar);
        }
    }

    static {
        a aVar = new a(bd.a.f5973c);
        f10745a = aVar;
        b bVar = new b(bd.c.f5975c);
        f10746b = bVar;
        c cVar = new c(bd.b.f5974c);
        f10747c = cVar;
        f(aVar);
        f(bVar);
        f(cVar);
    }

    private static /* synthetic */ void a(int i10) {
        String str = (i10 == 5 || i10 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 5 || i10 == 6) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "from";
                break;
            case 2:
                objArr[0] = "first";
                break;
            case 3:
                objArr[0] = "second";
                break;
            case 4:
                objArr[0] = "visibility";
                break;
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
                break;
            default:
                objArr[0] = "what";
                break;
        }
        if (i10 == 5 || i10 == 6) {
            objArr[1] = "toDescriptorVisibility";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
        }
        if (i10 == 2 || i10 == 3) {
            objArr[2] = "areInSamePackage";
        } else if (i10 == 4) {
            objArr[2] = "toDescriptorVisibility";
        } else if (i10 != 5 && i10 != 6) {
            objArr[2] = "isVisibleForProtectedAndPackage";
        }
        String format = String.format(str, objArr);
        if (i10 == 5 || i10 == 6) {
            throw new IllegalStateException(format);
        }
    }

    public static boolean d(xc.m mVar, xc.m mVar2) {
        if (mVar == null) {
            a(2);
        }
        if (mVar2 == null) {
            a(3);
        }
        l0 l0Var = (l0) ae.d.r(mVar, l0.class, false);
        l0 l0Var2 = (l0) ae.d.r(mVar2, l0.class, false);
        return (l0Var2 == null || l0Var == null || !l0Var.d().equals(l0Var2.d())) ? false : true;
    }

    public static boolean e(ie.f fVar, xc.q qVar, xc.m mVar) {
        if (qVar == null) {
            a(0);
        }
        if (mVar == null) {
            a(1);
        }
        if (d(ae.d.M(qVar), mVar)) {
            return true;
        }
        return xc.t.f25579c.e(fVar, qVar, mVar, false);
    }

    private static void f(xc.u uVar) {
        f10748d.put(uVar.b(), uVar);
    }

    public static xc.u g(n1 n1Var) {
        if (n1Var == null) {
            a(4);
        }
        xc.u uVar = f10748d.get(n1Var);
        if (uVar == null) {
            xc.u j10 = xc.t.j(n1Var);
            if (j10 == null) {
                a(5);
            }
            return j10;
        }
        return uVar;
    }
}
