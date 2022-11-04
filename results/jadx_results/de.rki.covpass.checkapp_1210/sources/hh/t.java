package hh;

import gg.a2;
/* loaded from: classes3.dex */
public class t extends gg.t implements gg.f {

    /* renamed from: c */
    gg.g f12042c;

    /* renamed from: d */
    int f12043d;

    public t(int i10, gg.g gVar) {
        this.f12043d = i10;
        this.f12042c = gVar;
    }

    public t(gg.j0 j0Var) {
        int Q = j0Var.Q();
        this.f12043d = Q;
        this.f12042c = Q == 0 ? x.m(j0Var, false) : gg.e0.D(j0Var, false);
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

    public static t m(gg.j0 j0Var, boolean z10) {
        return n(gg.j0.M(j0Var, true));
    }

    public static t n(Object obj) {
        if (obj == null || (obj instanceof t)) {
            return (t) obj;
        }
        if (obj instanceof gg.j0) {
            return new t((gg.j0) obj);
        }
        throw new IllegalArgumentException("unknown object in factory: " + obj.getClass().getName());
    }

    @Override // gg.t, gg.g
    public gg.a0 b() {
        return new a2(false, this.f12043d, this.f12042c);
    }

    public gg.g o() {
        return this.f12042c;
    }

    public int q() {
        return this.f12043d;
    }

    public String toString() {
        String str;
        String str2;
        String d10 = ak.q.d();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("DistributionPointName: [");
        stringBuffer.append(d10);
        if (this.f12043d == 0) {
            str2 = this.f12042c.toString();
            str = "fullName";
        } else {
            str2 = this.f12042c.toString();
            str = "nameRelativeToCRLIssuer";
        }
        l(stringBuffer, d10, str, str2);
        stringBuffer.append("]");
        stringBuffer.append(d10);
        return stringBuffer.toString();
    }
}
