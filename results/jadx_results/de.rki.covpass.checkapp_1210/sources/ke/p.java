package ke;

import xc.h0;
/* loaded from: classes3.dex */
public abstract class p extends ad.z {
    private final ne.n V3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(wd.c cVar, ne.n nVar, h0 h0Var) {
        super(h0Var, cVar);
        hc.t.e(cVar, "fqName");
        hc.t.e(nVar, "storageManager");
        hc.t.e(h0Var, "module");
        this.V3 = nVar;
    }

    public abstract h M0();

    public boolean T0(wd.f fVar) {
        hc.t.e(fVar, "name");
        he.h z10 = z();
        return (z10 instanceof me.h) && ((me.h) z10).q().contains(fVar);
    }

    public abstract void U0(k kVar);
}
