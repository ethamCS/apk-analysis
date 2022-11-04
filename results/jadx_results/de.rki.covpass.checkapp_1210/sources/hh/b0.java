package hh;
/* loaded from: classes3.dex */
public class b0 extends gg.t {
    private boolean U3;
    private gg.d0 V3;

    /* renamed from: c */
    private t f11920c;

    /* renamed from: d */
    private boolean f11921d;

    /* renamed from: q */
    private boolean f11922q;

    /* renamed from: x */
    private l0 f11923x;

    /* renamed from: y */
    private boolean f11924y;

    private b0(gg.d0 d0Var) {
        this.V3 = d0Var;
        for (int i10 = 0; i10 != d0Var.size(); i10++) {
            gg.j0 N = gg.j0.N(d0Var.G(i10));
            int Q = N.Q();
            if (Q == 0) {
                this.f11920c = t.m(N, true);
            } else if (Q == 1) {
                this.f11921d = gg.e.D(N, false).G();
            } else if (Q == 2) {
                this.f11922q = gg.e.D(N, false).G();
            } else if (Q == 3) {
                this.f11923x = new l0(gg.c.E(N, false));
            } else if (Q == 4) {
                this.f11924y = gg.e.D(N, false).G();
            } else if (Q != 5) {
                throw new IllegalArgumentException("unknown tag in IssuingDistributionPoint");
            } else {
                this.U3 = gg.e.D(N, false).G();
            }
        }
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

    private String m(boolean z10) {
        return z10 ? "true" : "false";
    }

    public static b0 o(Object obj) {
        if (obj instanceof b0) {
            return (b0) obj;
        }
        if (obj == null) {
            return null;
        }
        return new b0(gg.d0.F(obj));
    }

    @Override // gg.t, gg.g
    public gg.a0 b() {
        return this.V3;
    }

    public t n() {
        return this.f11920c;
    }

    public l0 q() {
        return this.f11923x;
    }

    public boolean r() {
        return this.f11924y;
    }

    public boolean s() {
        return this.U3;
    }

    public String toString() {
        String d10 = ak.q.d();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("IssuingDistributionPoint: [");
        stringBuffer.append(d10);
        t tVar = this.f11920c;
        if (tVar != null) {
            l(stringBuffer, d10, "distributionPoint", tVar.toString());
        }
        boolean z10 = this.f11921d;
        if (z10) {
            l(stringBuffer, d10, "onlyContainsUserCerts", m(z10));
        }
        boolean z11 = this.f11922q;
        if (z11) {
            l(stringBuffer, d10, "onlyContainsCACerts", m(z11));
        }
        l0 l0Var = this.f11923x;
        if (l0Var != null) {
            l(stringBuffer, d10, "onlySomeReasons", l0Var.toString());
        }
        boolean z12 = this.U3;
        if (z12) {
            l(stringBuffer, d10, "onlyContainsAttributeCerts", m(z12));
        }
        boolean z13 = this.f11924y;
        if (z13) {
            l(stringBuffer, d10, "indirectCRL", m(z13));
        }
        stringBuffer.append("]");
        stringBuffer.append(d10);
        return stringBuffer.toString();
    }

    public boolean u() {
        return this.f11922q;
    }

    public boolean w() {
        return this.f11921d;
    }
}
