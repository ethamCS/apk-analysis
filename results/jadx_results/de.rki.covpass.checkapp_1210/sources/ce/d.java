package ce;

import oe.m0;
import xc.h0;
/* loaded from: classes3.dex */
public final class d extends o<Byte> {
    public d(byte b10) {
        super(Byte.valueOf(b10));
    }

    /* renamed from: c */
    public m0 a(h0 h0Var) {
        hc.t.e(h0Var, "module");
        m0 t10 = h0Var.x().t();
        hc.t.d(t10, "module.builtIns.byteType");
        return t10;
    }

    @Override // ce.g
    public String toString() {
        return b().intValue() + ".toByte()";
    }
}
