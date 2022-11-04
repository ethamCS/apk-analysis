package ae;

import hc.t;
import oe.e0;
import oe.m0;
import xc.k1;
import xc.u0;
import xc.v0;
import xc.z;
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a */
    private static final wd.c f440a;

    /* renamed from: b */
    private static final wd.b f441b;

    static {
        wd.c cVar = new wd.c("kotlin.jvm.JvmInline");
        f440a = cVar;
        wd.b m10 = wd.b.m(cVar);
        t.d(m10, "topLevel(JVM_INLINE_ANNOTATION_FQ_NAME)");
        f441b = m10;
    }

    public static final boolean a(xc.a aVar) {
        t.e(aVar, "<this>");
        if (aVar instanceof v0) {
            u0 C0 = ((v0) aVar).C0();
            t.d(C0, "correspondingProperty");
            if (d(C0)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean b(xc.m mVar) {
        t.e(mVar, "<this>");
        return (mVar instanceof xc.e) && (((xc.e) mVar).x0() instanceof z);
    }

    public static final boolean c(e0 e0Var) {
        t.e(e0Var, "<this>");
        xc.h z10 = e0Var.W0().z();
        if (z10 != null) {
            return b(z10);
        }
        return false;
    }

    public static final boolean d(k1 k1Var) {
        z<m0> j10;
        t.e(k1Var, "<this>");
        if (k1Var.U() == null) {
            xc.m b10 = k1Var.b();
            wd.f fVar = null;
            xc.e eVar = b10 instanceof xc.e ? (xc.e) b10 : null;
            if (eVar != null && (j10 = ee.a.j(eVar)) != null) {
                fVar = j10.c();
            }
            if (t.a(fVar, k1Var.getName())) {
                return true;
            }
        }
        return false;
    }

    public static final e0 e(e0 e0Var) {
        z<m0> j10;
        t.e(e0Var, "<this>");
        xc.h z10 = e0Var.W0().z();
        if (!(z10 instanceof xc.e)) {
            z10 = null;
        }
        xc.e eVar = (xc.e) z10;
        if (eVar == null || (j10 = ee.a.j(eVar)) == null) {
            return null;
        }
        return j10.d();
    }
}
