package ve;

import java.util.Collection;
import java.util.List;
import ve.f;
import xc.j1;
import xc.y;
/* loaded from: classes3.dex */
final class m implements f {

    /* renamed from: a */
    public static final m f24046a = new m();

    /* renamed from: b */
    private static final String f24047b = "should not have varargs or parameters with default values";

    private m() {
    }

    @Override // ve.f
    public String a() {
        return f24047b;
    }

    @Override // ve.f
    public boolean b(y yVar) {
        boolean z10;
        hc.t.e(yVar, "functionDescriptor");
        List<j1> o10 = yVar.o();
        hc.t.d(o10, "functionDescriptor.valueParameters");
        if (!(o10 instanceof Collection) || !o10.isEmpty()) {
            for (j1 j1Var : o10) {
                hc.t.d(j1Var, "it");
                if (ee.a.a(j1Var) || j1Var.R() != null) {
                    z10 = false;
                    continue;
                } else {
                    z10 = true;
                    continue;
                }
                if (!z10) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // ve.f
    public String c(y yVar) {
        return f.a.a(this, yVar);
    }
}
