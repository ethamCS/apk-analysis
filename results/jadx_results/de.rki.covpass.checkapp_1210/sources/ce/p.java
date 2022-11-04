package ce;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import oe.e0;
import oe.e1;
import xc.f1;
import xc.h0;
/* loaded from: classes3.dex */
public final class p implements e1 {

    /* renamed from: a */
    private final long f6467a;

    /* renamed from: b */
    private final h0 f6468b;

    /* renamed from: c */
    private final ArrayList<e0> f6469c;

    @Override // oe.e1
    public e1 a(pe.g gVar) {
        hc.t.e(gVar, "kotlinTypeRefiner");
        return this;
    }

    public Void d() {
        return null;
    }

    @Override // oe.e1
    public List<f1> getParameters() {
        List<f1> h10;
        h10 = ub.u.h();
        return h10;
    }

    @Override // oe.e1
    public Collection<e0> l() {
        return this.f6469c;
    }

    public String toString() {
        return "IntegerValueType(" + this.f6467a + ')';
    }

    @Override // oe.e1
    public uc.h x() {
        return this.f6468b.x();
    }

    @Override // oe.e1
    public boolean y() {
        return false;
    }

    @Override // oe.e1
    public /* bridge */ /* synthetic */ xc.h z() {
        return (xc.h) d();
    }
}
