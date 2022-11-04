package hh;

import gg.x1;
/* loaded from: classes3.dex */
public class j0 extends gg.t {

    /* renamed from: c */
    private gg.v f11986c;

    /* renamed from: d */
    private gg.d0 f11987d;

    private j0(gg.d0 d0Var) {
        if (d0Var.size() < 1 || d0Var.size() > 2) {
            throw new IllegalArgumentException("Bad sequence size: " + d0Var.size());
        }
        this.f11986c = gg.v.K(d0Var.G(0));
        if (d0Var.size() <= 1) {
            return;
        }
        this.f11987d = gg.d0.F(d0Var.G(1));
    }

    public static j0 l(Object obj) {
        return (obj == null || (obj instanceof j0)) ? (j0) obj : new j0(gg.d0.F(obj));
    }

    @Override // gg.t, gg.g
    public gg.a0 b() {
        gg.h hVar = new gg.h(2);
        hVar.a(this.f11986c);
        gg.d0 d0Var = this.f11987d;
        if (d0Var != null) {
            hVar.a(d0Var);
        }
        return new x1(hVar);
    }

    public gg.v m() {
        return this.f11986c;
    }

    public gg.d0 n() {
        return this.f11987d;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Policy information: ");
        stringBuffer.append(this.f11986c);
        if (this.f11987d != null) {
            StringBuffer stringBuffer2 = new StringBuffer();
            for (int i10 = 0; i10 < this.f11987d.size(); i10++) {
                if (stringBuffer2.length() != 0) {
                    stringBuffer2.append(", ");
                }
                stringBuffer2.append(k0.l(this.f11987d.G(i10)));
            }
            stringBuffer.append("[");
            stringBuffer.append(stringBuffer2);
            stringBuffer.append("]");
        }
        return stringBuffer.toString();
    }
}
