package ce;

import oe.m0;
import xc.h0;
/* loaded from: classes3.dex */
public final class u extends o<Short> {
    public u(short s10) {
        super(Short.valueOf(s10));
    }

    /* renamed from: c */
    public m0 a(h0 h0Var) {
        hc.t.e(h0Var, "module");
        m0 T = h0Var.x().T();
        hc.t.d(T, "module.builtIns.shortType");
        return T;
    }

    @Override // ce.g
    public String toString() {
        return b().intValue() + ".toShort()";
    }
}
