package ig;

import gg.a0;
import gg.d0;
import gg.t;
import gg.x1;
import hh.n;
/* loaded from: classes3.dex */
public class c extends t {

    /* renamed from: c */
    private final zg.i f12593c;

    /* renamed from: d */
    private final n[] f12594d;

    private c(d0 d0Var) {
        int i10 = 0;
        this.f12593c = zg.i.n(d0Var.G(0));
        d0 F = d0.F(d0Var.G(1));
        this.f12594d = new n[F.size()];
        while (true) {
            n[] nVarArr = this.f12594d;
            if (i10 != nVarArr.length) {
                nVarArr[i10] = n.n(F.G(i10));
                i10++;
            } else {
                return;
            }
        }
    }

    public c(zg.i iVar, n[] nVarArr) {
        this.f12593c = iVar;
        n[] nVarArr2 = new n[nVarArr.length];
        this.f12594d = nVarArr2;
        System.arraycopy(nVarArr, 0, nVarArr2, 0, nVarArr.length);
    }

    public static c n(Object obj) {
        if (obj instanceof c) {
            return (c) obj;
        }
        if (obj == null) {
            return null;
        }
        return new c(d0.F(obj));
    }

    @Override // gg.t, gg.g
    public a0 b() {
        gg.h hVar = new gg.h(2);
        hVar.a(this.f12593c);
        hVar.a(new x1(this.f12594d));
        return new x1(hVar);
    }

    public n[] l() {
        n[] nVarArr = this.f12594d;
        n[] nVarArr2 = new n[nVarArr.length];
        System.arraycopy(nVarArr, 0, nVarArr2, 0, nVarArr.length);
        return nVarArr2;
    }

    public zg.i m() {
        return this.f12593c;
    }
}
