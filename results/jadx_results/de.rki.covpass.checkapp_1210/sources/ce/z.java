package ce;

import oe.e0;
import oe.m0;
import uc.k;
import xc.h0;
/* loaded from: classes3.dex */
public final class z extends a0<Short> {
    public z(short s10) {
        super(Short.valueOf(s10));
    }

    @Override // ce.g
    public e0 a(h0 h0Var) {
        hc.t.e(h0Var, "module");
        xc.e a10 = xc.x.a(h0Var, k.a.f23516z0);
        m0 u10 = a10 != null ? a10.u() : null;
        return u10 == null ? qe.k.d(qe.j.NOT_FOUND_UNSIGNED_TYPE, "UShort") : u10;
    }

    @Override // ce.g
    public String toString() {
        return b().intValue() + ".toUShort()";
    }
}
