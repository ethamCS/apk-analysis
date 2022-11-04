package hc;

import java.util.List;
/* loaded from: classes.dex */
public class l0 {
    public oc.g a(p pVar) {
        return pVar;
    }

    public oc.d b(Class cls) {
        return new k(cls);
    }

    public oc.f c(Class cls, String str) {
        return new a0(cls, str);
    }

    public oc.i d(x xVar) {
        return xVar;
    }

    public oc.l e(b0 b0Var) {
        return b0Var;
    }

    public oc.m f(d0 d0Var) {
        return d0Var;
    }

    public String g(o oVar) {
        String obj = oVar.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }

    public String h(v vVar) {
        return g(vVar);
    }

    public oc.n i(oc.e eVar, List<oc.p> list, boolean z10) {
        return new s0(eVar, list, z10);
    }
}
