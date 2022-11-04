package td;

import java.util.ArrayList;
import java.util.List;
import rd.q;
import rd.t;
import ub.u;
import ub.v;
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a */
    private final List<q> f22224a;

    public g(t tVar) {
        int s10;
        hc.t.e(tVar, "typeTable");
        List<q> c02 = tVar.c0();
        if (tVar.d0()) {
            int V = tVar.V();
            List<q> c03 = tVar.c0();
            hc.t.d(c03, "typeTable.typeList");
            s10 = v.s(c03, 10);
            ArrayList arrayList = new ArrayList(s10);
            int i10 = 0;
            for (Object obj : c03) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    u.r();
                }
                q qVar = (q) obj;
                if (i10 >= V) {
                    qVar = qVar.g().P(true).b();
                }
                arrayList.add(qVar);
                i10 = i11;
            }
            c02 = arrayList;
        }
        hc.t.d(c02, "run {\n        val origin… else originalTypes\n    }");
        this.f22224a = c02;
    }

    public final q a(int i10) {
        return this.f22224a.get(i10);
    }
}
