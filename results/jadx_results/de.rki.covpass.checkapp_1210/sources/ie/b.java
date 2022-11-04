package ie;

import hc.t;
import oe.e0;
/* loaded from: classes3.dex */
public final class b extends a {

    /* renamed from: c */
    private final xc.e f12506c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(xc.e eVar, e0 e0Var, f fVar) {
        super(e0Var, fVar);
        t.e(eVar, "classDescriptor");
        t.e(e0Var, "receiverType");
        this.f12506c = eVar;
    }

    public String toString() {
        return getType() + ": Ctx { " + this.f12506c + " }";
    }
}
