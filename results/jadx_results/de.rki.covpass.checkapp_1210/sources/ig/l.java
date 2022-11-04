package ig;

import gg.a0;
import gg.a2;
import gg.d0;
import gg.j0;
import gg.k1;
import gg.t;
import gg.x1;
import hh.n;
/* loaded from: classes3.dex */
public class l extends t {

    /* renamed from: c */
    private final hh.b f12617c;

    /* renamed from: d */
    private final d0 f12618d;

    /* renamed from: q */
    private final gg.c f12619q;

    private l(d0 d0Var) {
        this.f12617c = hh.b.n(d0Var.G(0));
        int i10 = 1;
        if (d0Var.G(1) instanceof j0) {
            this.f12618d = d0.F(j0.N(d0Var.G(1)).O());
            i10 = 2;
        } else {
            this.f12618d = null;
        }
        this.f12619q = k1.M(d0Var.G(i10));
    }

    public l(hh.b bVar, byte[] bArr) {
        this.f12617c = bVar;
        this.f12618d = null;
        this.f12619q = new k1(ak.a.h(bArr));
    }

    public l(hh.b bVar, n[] nVarArr, byte[] bArr) {
        this.f12617c = bVar;
        this.f12618d = new x1(nVarArr);
        this.f12619q = new k1(ak.a.h(bArr));
    }

    public static l m(Object obj) {
        if (obj instanceof l) {
            return (l) obj;
        }
        if (obj == null) {
            return null;
        }
        return new l(d0.F(obj));
    }

    @Override // gg.t, gg.g
    public a0 b() {
        gg.h hVar = new gg.h(3);
        hVar.a(this.f12617c);
        d0 d0Var = this.f12618d;
        if (d0Var != null) {
            hVar.a(new a2(0, d0Var));
        }
        hVar.a(this.f12619q);
        return new x1(hVar);
    }

    public n[] l() {
        d0 d0Var = this.f12618d;
        if (d0Var == null) {
            return null;
        }
        int size = d0Var.size();
        n[] nVarArr = new n[size];
        for (int i10 = 0; i10 != size; i10++) {
            nVarArr[i10] = n.n(this.f12618d.G(i10));
        }
        return nVarArr;
    }

    public gg.c n() {
        return new k1(this.f12619q.D(), this.f12619q.d());
    }

    public hh.b o() {
        return this.f12617c;
    }
}
