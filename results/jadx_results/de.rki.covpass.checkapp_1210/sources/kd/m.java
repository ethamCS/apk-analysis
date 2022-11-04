package kd;

import hc.t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import nd.y;
import oe.e0;
import oe.f0;
import oe.m0;
import oe.r1;
import ub.v;
import xc.a1;
/* loaded from: classes.dex */
public final class m extends ad.b {
    private final jd.g Z3;

    /* renamed from: a4 */
    private final y f15002a4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(jd.g gVar, y yVar, int i10, xc.m mVar) {
        super(gVar.e(), mVar, new jd.d(gVar, yVar, false, 4, null), yVar.getName(), r1.INVARIANT, false, i10, a1.f25519a, gVar.a().v());
        t.e(gVar, "c");
        t.e(yVar, "javaTypeParameter");
        t.e(mVar, "containingDeclaration");
        this.Z3 = gVar;
        this.f15002a4 = yVar;
    }

    private final List<e0> V0() {
        int s10;
        List<e0> d10;
        Collection<nd.j> upperBounds = this.f15002a4.getUpperBounds();
        if (upperBounds.isEmpty()) {
            m0 i10 = this.Z3.d().x().i();
            t.d(i10, "c.module.builtIns.anyType");
            m0 I = this.Z3.d().x().I();
            t.d(I, "c.module.builtIns.nullableAnyType");
            d10 = ub.t.d(f0.d(i10, I));
            return d10;
        }
        s10 = v.s(upperBounds, 10);
        ArrayList arrayList = new ArrayList(s10);
        for (nd.j jVar : upperBounds) {
            arrayList.add(this.Z3.g().o(jVar, ld.d.d(hd.k.COMMON, false, this, 1, null)));
        }
        return arrayList;
    }

    @Override // ad.e
    protected List<e0> M0(List<? extends e0> list) {
        t.e(list, "bounds");
        return this.Z3.a().r().i(this, list, this.Z3);
    }

    @Override // ad.e
    protected void T0(e0 e0Var) {
        t.e(e0Var, "type");
    }

    @Override // ad.e
    protected List<e0> U0() {
        return V0();
    }
}
