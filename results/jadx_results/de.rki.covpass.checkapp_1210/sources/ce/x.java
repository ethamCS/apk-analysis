package ce;

import oe.e0;
import oe.m0;
import uc.k;
import xc.h0;
/* loaded from: classes3.dex */
public final class x extends a0<Integer> {
    public x(int i10) {
        super(Integer.valueOf(i10));
    }

    @Override // ce.g
    public e0 a(h0 h0Var) {
        hc.t.e(h0Var, "module");
        xc.e a10 = xc.x.a(h0Var, k.a.A0);
        m0 u10 = a10 != null ? a10.u() : null;
        return u10 == null ? qe.k.d(qe.j.NOT_FOUND_UNSIGNED_TYPE, "UInt") : u10;
    }

    @Override // ce.g
    public String toString() {
        return b().intValue() + ".toUInt()";
    }
}
