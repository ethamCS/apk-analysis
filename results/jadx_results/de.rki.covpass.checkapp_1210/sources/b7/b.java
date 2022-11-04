package b7;

import c7.j;
import h6.e;
import h6.m;
import h6.o;
import h6.q;
import h6.r;
import h6.s;
import java.util.ArrayList;
import java.util.Map;
/* loaded from: classes.dex */
public final class b implements o {

    /* renamed from: a */
    private static final q[] f5748a = new q[0];

    private static q[] c(h6.c cVar, Map<e, ?> map, boolean z10) {
        ArrayList arrayList = new ArrayList();
        e7.b b10 = e7.a.b(cVar, map, z10);
        for (s[] sVarArr : b10.b()) {
            o6.e i10 = j.i(b10.a(), sVarArr[4], sVarArr[5], sVarArr[6], sVarArr[7], f(sVarArr), d(sVarArr));
            q qVar = new q(i10.h(), i10.e(), sVarArr, h6.a.PDF_417);
            qVar.h(r.ERROR_CORRECTION_LEVEL, i10.b());
            c cVar2 = (c) i10.d();
            if (cVar2 != null) {
                qVar.h(r.PDF417_EXTRA_METADATA, cVar2);
            }
            arrayList.add(qVar);
        }
        return (q[]) arrayList.toArray(f5748a);
    }

    private static int d(s[] sVarArr) {
        return Math.max(Math.max(e(sVarArr[0], sVarArr[4]), (e(sVarArr[6], sVarArr[2]) * 17) / 18), Math.max(e(sVarArr[1], sVarArr[5]), (e(sVarArr[7], sVarArr[3]) * 17) / 18));
    }

    private static int e(s sVar, s sVar2) {
        if (sVar == null || sVar2 == null) {
            return 0;
        }
        return (int) Math.abs(sVar.c() - sVar2.c());
    }

    private static int f(s[] sVarArr) {
        return Math.min(Math.min(g(sVarArr[0], sVarArr[4]), (g(sVarArr[6], sVarArr[2]) * 17) / 18), Math.min(g(sVarArr[1], sVarArr[5]), (g(sVarArr[7], sVarArr[3]) * 17) / 18));
    }

    private static int g(s sVar, s sVar2) {
        if (sVar == null || sVar2 == null) {
            return Integer.MAX_VALUE;
        }
        return (int) Math.abs(sVar.c() - sVar2.c());
    }

    @Override // h6.o
    public q a(h6.c cVar) {
        return b(cVar, null);
    }

    @Override // h6.o
    public q b(h6.c cVar, Map<e, ?> map) {
        q[] c10 = c(cVar, map, false);
        if (c10.length == 0 || c10[0] == null) {
            throw m.b();
        }
        return c10[0];
    }

    @Override // h6.o
    public void reset() {
    }
}
