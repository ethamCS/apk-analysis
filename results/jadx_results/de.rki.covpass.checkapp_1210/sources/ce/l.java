package ce;

import oe.m0;
import xc.h0;
/* loaded from: classes3.dex */
public final class l extends g<Float> {
    public l(float f10) {
        super(Float.valueOf(f10));
    }

    /* renamed from: c */
    public m0 a(h0 h0Var) {
        hc.t.e(h0Var, "module");
        m0 B = h0Var.x().B();
        hc.t.d(B, "module.builtIns.floatType");
        return B;
    }

    @Override // ce.g
    public String toString() {
        return b().floatValue() + ".toFloat()";
    }
}
