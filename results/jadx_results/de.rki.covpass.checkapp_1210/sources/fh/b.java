package fh;

import gg.a0;
import gg.e0;
import gg.g;
import gg.h;
import gg.t;
import gg.v;
import gg.x1;
import gg.y1;
/* loaded from: classes3.dex */
public class b extends t {

    /* renamed from: c */
    private e0 f10202c;

    private b(e0 e0Var) {
        this.f10202c = e0Var;
    }

    public b(v vVar, g gVar) {
        h hVar = new h(2);
        hVar.a(vVar);
        hVar.a(gVar);
        this.f10202c = new y1(new x1(hVar));
    }

    public b(a[] aVarArr) {
        this.f10202c = new y1(aVarArr);
    }

    public static b n(Object obj) {
        if (obj instanceof b) {
            return (b) obj;
        }
        if (obj == null) {
            return null;
        }
        return new b(e0.E(obj));
    }

    @Override // gg.t, gg.g
    public a0 b() {
        return this.f10202c;
    }

    public boolean l(v vVar) {
        int size = this.f10202c.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (a.l(this.f10202c.F(i10)).m().s(vVar)) {
                return true;
            }
        }
        return false;
    }

    public a m() {
        if (this.f10202c.size() == 0) {
            return null;
        }
        return a.l(this.f10202c.F(0));
    }

    public a[] o() {
        int size = this.f10202c.size();
        a[] aVarArr = new a[size];
        for (int i10 = 0; i10 != size; i10++) {
            aVarArr[i10] = a.l(this.f10202c.F(i10));
        }
        return aVarArr;
    }

    public boolean q() {
        return this.f10202c.size() > 1;
    }

    public int size() {
        return this.f10202c.size();
    }
}
