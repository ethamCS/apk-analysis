package ce;

import oe.m0;
import xc.h0;
/* loaded from: classes3.dex */
public final class i extends g<Double> {
    public i(double d10) {
        super(Double.valueOf(d10));
    }

    /* renamed from: c */
    public m0 a(h0 h0Var) {
        hc.t.e(h0Var, "module");
        m0 z10 = h0Var.x().z();
        hc.t.d(z10, "module.builtIns.doubleType");
        return z10;
    }

    @Override // ce.g
    public String toString() {
        return b().doubleValue() + ".toDouble()";
    }
}
