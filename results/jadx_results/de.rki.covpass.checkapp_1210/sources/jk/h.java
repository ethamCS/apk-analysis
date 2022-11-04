package jk;

import java.util.ArrayList;
import java.util.List;
import jk.e;
/* loaded from: classes3.dex */
public class h<P> {

    /* renamed from: a */
    protected List<e.a> f14469a = new ArrayList();

    /* renamed from: b */
    protected List<e> f14470b = new ArrayList();

    /* renamed from: c */
    protected List<e.a> f14471c = new ArrayList();

    public void a(e.a aVar) {
        aVar.f14462a = null;
        aVar.f14465d = null;
        aVar.f14466e = null;
        this.f14469a.add(aVar);
    }

    public void b(e eVar) {
        e.a aVar = eVar.f14461b;
        if (aVar != null) {
            this.f14471c.add(aVar);
            while (!this.f14471c.isEmpty()) {
                List<e.a> list = this.f14471c;
                e.a remove = list.remove(list.size() - 1);
                e.a aVar2 = remove.f14465d;
                if (aVar2 != null) {
                    this.f14471c.add(aVar2);
                }
                e.a aVar3 = remove.f14466e;
                if (aVar3 != null) {
                    this.f14471c.add(aVar3);
                }
                a(remove);
            }
            eVar.f14461b = null;
        }
        this.f14470b.add(eVar);
    }

    public e.a c() {
        if (this.f14469a.isEmpty()) {
            return new e.a();
        }
        List<e.a> list = this.f14469a;
        return list.remove(list.size() - 1);
    }

    public e.a d(P p10, int i10) {
        e.a c10 = c();
        c10.f14462a = p10;
        c10.f14463b = i10;
        c10.f14464c = -1;
        return c10;
    }

    public e e(int i10) {
        if (this.f14470b.isEmpty()) {
            return new e(i10);
        }
        List<e> list = this.f14470b;
        e remove = list.remove(list.size() - 1);
        remove.f14460a = i10;
        return remove;
    }
}
