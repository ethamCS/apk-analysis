package pd;

import java.util.Collection;
import oe.e0;
import pd.y;
import ub.c0;
/* loaded from: classes.dex */
public final class z implements y<l> {

    /* renamed from: a */
    public static final z f19143a = new z();

    private z() {
    }

    @Override // pd.y
    public String a(xc.e eVar) {
        return y.a.a(this, eVar);
    }

    @Override // pd.y
    public void b(e0 e0Var, xc.e eVar) {
        hc.t.e(e0Var, "kotlinType");
        hc.t.e(eVar, "descriptor");
    }

    @Override // pd.y
    public e0 c(e0 e0Var) {
        return y.a.b(this, e0Var);
    }

    @Override // pd.y
    public e0 d(Collection<? extends e0> collection) {
        String e02;
        hc.t.e(collection, "types");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("There should be no intersection type in existing descriptors, but found: ");
        e02 = c0.e0(collection, null, null, null, 0, null, null, 63, null);
        sb2.append(e02);
        throw new AssertionError(sb2.toString());
    }

    @Override // pd.y
    public String f(xc.e eVar) {
        hc.t.e(eVar, "classDescriptor");
        return null;
    }

    /* renamed from: g */
    public l e(xc.e eVar) {
        hc.t.e(eVar, "classDescriptor");
        return null;
    }
}
