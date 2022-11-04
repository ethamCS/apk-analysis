package ie;

import hc.t;
import oe.e0;
/* loaded from: classes3.dex */
public final class c extends a {

    /* renamed from: c */
    private final xc.a f12507c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(xc.a aVar, e0 e0Var, f fVar) {
        super(e0Var, fVar);
        t.e(aVar, "declarationDescriptor");
        t.e(e0Var, "receiverType");
        this.f12507c = aVar;
    }

    public xc.a c() {
        return this.f12507c;
    }

    public String toString() {
        return "Cxt { " + c() + " }";
    }
}
