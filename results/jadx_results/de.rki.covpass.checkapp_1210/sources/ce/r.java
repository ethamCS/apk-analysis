package ce;

import oe.m0;
import xc.h0;
/* loaded from: classes3.dex */
public final class r extends o<Long> {
    public r(long j10) {
        super(Long.valueOf(j10));
    }

    /* renamed from: c */
    public m0 a(h0 h0Var) {
        hc.t.e(h0Var, "module");
        m0 F = h0Var.x().F();
        hc.t.d(F, "module.builtIns.longType");
        return F;
    }

    @Override // ce.g
    public String toString() {
        return b().longValue() + ".toLong()";
    }
}
