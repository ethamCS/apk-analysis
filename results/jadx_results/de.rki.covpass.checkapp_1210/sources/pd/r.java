package pd;

import xc.a1;
import xc.b1;
/* loaded from: classes.dex */
public final class r implements a1 {

    /* renamed from: b */
    private final kd.h f19134b;

    public r(kd.h hVar) {
        hc.t.e(hVar, "packageFragment");
        this.f19134b = hVar;
    }

    @Override // xc.a1
    public b1 a() {
        b1 b1Var = b1.f25526a;
        hc.t.d(b1Var, "NO_SOURCE_FILE");
        return b1Var;
    }

    public String toString() {
        return this.f19134b + ": " + this.f19134b.V0().keySet();
    }
}
