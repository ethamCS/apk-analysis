package hh;

import gg.a2;
import gg.k1;
import gg.x1;
/* loaded from: classes3.dex */
public class s extends gg.t {

    /* renamed from: c */
    t f12038c;

    /* renamed from: d */
    l0 f12039d;

    /* renamed from: q */
    x f12040q;

    public s(gg.d0 d0Var) {
        for (int i10 = 0; i10 != d0Var.size(); i10++) {
            gg.j0 N = gg.j0.N(d0Var.G(i10));
            int Q = N.Q();
            if (Q == 0) {
                this.f12038c = t.m(N, true);
            } else if (Q == 1) {
                this.f12039d = new l0(k1.L(N, false));
            } else if (Q != 2) {
                throw new IllegalArgumentException("Unknown tag encountered in structure: " + N.Q());
            } else {
                this.f12040q = x.m(N, false);
            }
        }
    }

    public s(t tVar, l0 l0Var, x xVar) {
        this.f12038c = tVar;
        this.f12039d = l0Var;
        this.f12040q = xVar;
    }

    private void l(StringBuffer stringBuffer, String str, String str2, String str3) {
        stringBuffer.append("    ");
        stringBuffer.append(str2);
        stringBuffer.append(":");
        stringBuffer.append(str);
        stringBuffer.append("    ");
        stringBuffer.append("    ");
        stringBuffer.append(str3);
        stringBuffer.append(str);
    }

    public static s o(Object obj) {
        if (obj == null || (obj instanceof s)) {
            return (s) obj;
        }
        if (obj instanceof gg.d0) {
            return new s((gg.d0) obj);
        }
        throw new IllegalArgumentException("Invalid DistributionPoint: " + obj.getClass().getName());
    }

    @Override // gg.t, gg.g
    public gg.a0 b() {
        gg.h hVar = new gg.h(3);
        t tVar = this.f12038c;
        if (tVar != null) {
            hVar.a(new a2(0, tVar));
        }
        l0 l0Var = this.f12039d;
        if (l0Var != null) {
            hVar.a(new a2(false, 1, l0Var));
        }
        x xVar = this.f12040q;
        if (xVar != null) {
            hVar.a(new a2(false, 2, xVar));
        }
        return new x1(hVar);
    }

    public x m() {
        return this.f12040q;
    }

    public t n() {
        return this.f12038c;
    }

    public l0 q() {
        return this.f12039d;
    }

    public String toString() {
        String d10 = ak.q.d();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("DistributionPoint: [");
        stringBuffer.append(d10);
        t tVar = this.f12038c;
        if (tVar != null) {
            l(stringBuffer, d10, "distributionPoint", tVar.toString());
        }
        l0 l0Var = this.f12039d;
        if (l0Var != null) {
            l(stringBuffer, d10, "reasons", l0Var.toString());
        }
        x xVar = this.f12040q;
        if (xVar != null) {
            l(stringBuffer, d10, "cRLIssuer", xVar.toString());
        }
        stringBuffer.append("]");
        stringBuffer.append(d10);
        return stringBuffer.toString();
    }
}
