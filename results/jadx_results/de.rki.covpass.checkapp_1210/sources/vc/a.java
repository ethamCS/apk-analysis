package vc;

import bf.x;
import bf.y;
import hc.t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import ne.n;
import ub.c0;
import ub.y0;
import uc.f;
import vc.c;
import xc.h0;
import xc.l0;
/* loaded from: classes.dex */
public final class a implements zc.b {

    /* renamed from: a */
    private final n f23979a;

    /* renamed from: b */
    private final h0 f23980b;

    public a(n nVar, h0 h0Var) {
        t.e(nVar, "storageManager");
        t.e(h0Var, "module");
        this.f23979a = nVar;
        this.f23980b = h0Var;
    }

    @Override // zc.b
    public xc.e a(wd.b bVar) {
        boolean N;
        Object X;
        Object V;
        t.e(bVar, "classId");
        if (bVar.k() || bVar.l()) {
            return null;
        }
        String b10 = bVar.i().b();
        t.d(b10, "classId.relativeClassName.asString()");
        N = y.N(b10, "Function", false, 2, null);
        if (!N) {
            return null;
        }
        wd.c h10 = bVar.h();
        t.d(h10, "classId.packageFqName");
        c.a.C0428a c10 = c.Companion.c(b10, h10);
        if (c10 == null) {
            return null;
        }
        c a10 = c10.a();
        int b11 = c10.b();
        List<l0> f02 = this.f23980b.F(h10).f0();
        ArrayList arrayList = new ArrayList();
        for (Object obj : f02) {
            if (obj instanceof uc.b) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (obj2 instanceof f) {
                arrayList2.add(obj2);
            }
        }
        X = c0.X(arrayList2);
        l0 l0Var = (f) X;
        if (l0Var == null) {
            V = c0.V(arrayList);
            l0Var = (uc.b) V;
        }
        return new b(this.f23979a, l0Var, a10, b11);
    }

    @Override // zc.b
    public Collection<xc.e> b(wd.c cVar) {
        Set b10;
        t.e(cVar, "packageFqName");
        b10 = y0.b();
        return b10;
    }

    @Override // zc.b
    public boolean c(wd.c cVar, wd.f fVar) {
        boolean I;
        boolean I2;
        boolean I3;
        boolean I4;
        t.e(cVar, "packageFqName");
        t.e(fVar, "name");
        String b10 = fVar.b();
        t.d(b10, "name.asString()");
        I = x.I(b10, "Function", false, 2, null);
        if (!I) {
            I2 = x.I(b10, "KFunction", false, 2, null);
            if (!I2) {
                I3 = x.I(b10, "SuspendFunction", false, 2, null);
                if (!I3) {
                    I4 = x.I(b10, "KSuspendFunction", false, 2, null);
                    if (!I4) {
                        return false;
                    }
                }
            }
        }
        return c.Companion.c(b10, cVar) != null;
    }
}
