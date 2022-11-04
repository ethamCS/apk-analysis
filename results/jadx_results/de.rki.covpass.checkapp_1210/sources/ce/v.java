package ce;

import oe.m0;
import xc.h0;
/* loaded from: classes3.dex */
public final class v extends g<String> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(String str) {
        super(str);
        hc.t.e(str, "value");
    }

    /* renamed from: c */
    public m0 a(h0 h0Var) {
        hc.t.e(h0Var, "module");
        m0 W = h0Var.x().W();
        hc.t.d(W, "module.builtIns.stringType");
        return W;
    }

    @Override // ce.g
    public String toString() {
        return '\"' + b() + '\"';
    }
}
