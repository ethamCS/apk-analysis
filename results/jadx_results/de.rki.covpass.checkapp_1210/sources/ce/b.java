package ce;

import java.util.List;
import oe.e0;
import xc.h0;
/* loaded from: classes3.dex */
public class b extends g<List<? extends g<?>>> {

    /* renamed from: b */
    private final gc.l<h0, e0> f6446b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(List<? extends g<?>> list, gc.l<? super h0, ? extends e0> lVar) {
        super(list);
        hc.t.e(list, "value");
        hc.t.e(lVar, "computeType");
        this.f6446b = lVar;
    }

    @Override // ce.g
    public e0 a(h0 h0Var) {
        hc.t.e(h0Var, "module");
        e0 invoke = this.f6446b.invoke(h0Var);
        if (!uc.h.c0(invoke) && !uc.h.p0(invoke)) {
            uc.h.C0(invoke);
        }
        return invoke;
    }
}
