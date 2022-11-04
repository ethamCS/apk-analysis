package jk;

import java.util.ArrayList;
import java.util.List;
import jk.e;
/* loaded from: classes3.dex */
public class f<P> {

    /* renamed from: a */
    c<P> f14467a;

    /* renamed from: b */
    h<P> f14468b;

    public f(h<P> hVar, c<P> cVar) {
        this.f14468b = hVar;
        this.f14467a = cVar;
    }

    private e.a d(List<P> list, ok.g gVar) {
        return this.f14468b.d(list.get(0), gVar == null ? -1 : gVar.d(0));
    }

    protected e.a a(List<P> list, ok.g gVar) {
        ok.g gVar2;
        ok.g gVar3;
        ArrayList arrayList = new ArrayList(list.size() / 2);
        ArrayList arrayList2 = new ArrayList(list.size() / 2);
        if (gVar == null) {
            gVar3 = null;
            gVar2 = null;
        } else {
            gVar3 = new ok.g(list.size() / 2);
            gVar2 = new ok.g(list.size() / 2);
        }
        this.f14467a.b(list, gVar, arrayList, gVar3, arrayList2, gVar2);
        e.a c10 = this.f14468b.c();
        c10.f14464c = this.f14467a.d();
        c10.f14462a = this.f14467a.e();
        c10.f14463b = this.f14467a.a();
        c10.f14465d = b(arrayList, gVar3);
        c10.f14466e = b(arrayList2, gVar2);
        return c10;
    }

    protected e.a b(List<P> list, ok.g gVar) {
        if (list.size() == 0) {
            return null;
        }
        return list.size() == 1 ? d(list, gVar) : a(list, gVar);
    }

    public e c(List<P> list, boolean z10) {
        ok.g gVar;
        e.a a10;
        if (z10) {
            gVar = new ok.g();
            gVar.i(list.size());
            for (int i10 = 0; i10 < gVar.f18610b; i10++) {
                gVar.f18609a[i10] = i10;
            }
        } else {
            gVar = null;
        }
        e e10 = this.f14468b.e(this.f14467a.c());
        if (list.size() != 1) {
            if (list.size() > 1) {
                a10 = a(list, gVar);
            }
            return e10;
        }
        a10 = d(list, gVar);
        e10.f14461b = a10;
        return e10;
    }
}
