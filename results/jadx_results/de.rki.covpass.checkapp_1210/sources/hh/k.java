package hh;
/* loaded from: classes3.dex */
public class k extends gg.t {

    /* renamed from: c */
    gg.d0 f11988c;

    private k(gg.d0 d0Var) {
        this.f11988c = d0Var;
    }

    public static k m(Object obj) {
        if (obj instanceof k) {
            return (k) obj;
        }
        if (obj == null) {
            return null;
        }
        return new k(gg.d0.F(obj));
    }

    @Override // gg.t, gg.g
    public gg.a0 b() {
        return this.f11988c;
    }

    public s[] l() {
        s[] sVarArr = new s[this.f11988c.size()];
        for (int i10 = 0; i10 != this.f11988c.size(); i10++) {
            sVarArr[i10] = s.o(this.f11988c.G(i10));
        }
        return sVarArr;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String d10 = ak.q.d();
        stringBuffer.append("CRLDistPoint:");
        stringBuffer.append(d10);
        s[] l10 = l();
        for (int i10 = 0; i10 != l10.length; i10++) {
            stringBuffer.append("    ");
            stringBuffer.append(l10[i10]);
            stringBuffer.append(d10);
        }
        return stringBuffer.toString();
    }
}
