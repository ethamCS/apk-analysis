package ke;

import xc.l0;
import xc.m0;
import xc.o0;
/* loaded from: classes3.dex */
public final class o implements h {

    /* renamed from: a */
    private final m0 f15093a;

    public o(m0 m0Var) {
        hc.t.e(m0Var, "packageFragmentProvider");
        this.f15093a = m0Var;
    }

    @Override // ke.h
    public g a(wd.b bVar) {
        g a10;
        hc.t.e(bVar, "classId");
        m0 m0Var = this.f15093a;
        wd.c h10 = bVar.h();
        hc.t.d(h10, "classId.packageFqName");
        for (l0 l0Var : o0.c(m0Var, h10)) {
            if ((l0Var instanceof p) && (a10 = ((p) l0Var).M0().a(bVar)) != null) {
                return a10;
            }
        }
        return null;
    }
}
