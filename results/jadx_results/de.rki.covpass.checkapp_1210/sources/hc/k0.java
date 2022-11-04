package hc;

import java.util.Arrays;
import java.util.Collections;
import org.conscrypt.BuildConfig;
/* loaded from: classes.dex */
public class k0 {

    /* renamed from: a */
    private static final l0 f11770a;

    /* renamed from: b */
    private static final oc.d[] f11771b;

    static {
        l0 l0Var = null;
        try {
            l0Var = (l0) rc.e0.class.newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (l0Var == null) {
            l0Var = new l0();
        }
        f11770a = l0Var;
        f11771b = new oc.d[0];
    }

    public static oc.g a(p pVar) {
        return f11770a.a(pVar);
    }

    public static oc.d b(Class cls) {
        return f11770a.b(cls);
    }

    public static oc.f c(Class cls) {
        return f11770a.c(cls, BuildConfig.FLAVOR);
    }

    public static oc.f d(Class cls, String str) {
        return f11770a.c(cls, str);
    }

    public static oc.i e(x xVar) {
        return f11770a.d(xVar);
    }

    public static oc.l f(b0 b0Var) {
        return f11770a.e(b0Var);
    }

    public static oc.m g(d0 d0Var) {
        return f11770a.f(d0Var);
    }

    public static String h(o oVar) {
        return f11770a.g(oVar);
    }

    public static String i(v vVar) {
        return f11770a.h(vVar);
    }

    public static oc.n j(Class cls) {
        return f11770a.i(b(cls), Collections.emptyList(), false);
    }

    public static oc.n k(Class cls, oc.p pVar) {
        return f11770a.i(b(cls), Collections.singletonList(pVar), false);
    }

    public static oc.n l(Class cls, oc.p pVar, oc.p pVar2) {
        return f11770a.i(b(cls), Arrays.asList(pVar, pVar2), false);
    }
}
