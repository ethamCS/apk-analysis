package hh;

import gg.x1;
/* loaded from: classes3.dex */
public class x extends gg.t {

    /* renamed from: c */
    private final w[] f12108c;

    private x(gg.d0 d0Var) {
        this.f12108c = new w[d0Var.size()];
        for (int i10 = 0; i10 != d0Var.size(); i10++) {
            this.f12108c[i10] = w.n(d0Var.G(i10));
        }
    }

    public x(w wVar) {
        this.f12108c = new w[]{wVar};
    }

    private static w[] l(w[] wVarArr) {
        w[] wVarArr2 = new w[wVarArr.length];
        System.arraycopy(wVarArr, 0, wVarArr2, 0, wVarArr.length);
        return wVarArr2;
    }

    public static x m(gg.j0 j0Var, boolean z10) {
        return new x(gg.d0.E(j0Var, z10));
    }

    public static x n(Object obj) {
        if (obj instanceof x) {
            return (x) obj;
        }
        if (obj == null) {
            return null;
        }
        return new x(gg.d0.F(obj));
    }

    @Override // gg.t, gg.g
    public gg.a0 b() {
        return new x1(this.f12108c);
    }

    public w[] o() {
        return l(this.f12108c);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String d10 = ak.q.d();
        stringBuffer.append("GeneralNames:");
        stringBuffer.append(d10);
        for (int i10 = 0; i10 != this.f12108c.length; i10++) {
            stringBuffer.append("    ");
            stringBuffer.append(this.f12108c[i10]);
            stringBuffer.append(d10);
        }
        return stringBuffer.toString();
    }
}
