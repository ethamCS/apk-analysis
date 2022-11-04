package ia;

import ga.j;
import java.io.Serializable;
/* loaded from: classes.dex */
public class b extends j implements Serializable {
    public b() {
        g();
    }

    public b(b bVar) {
        h(bVar);
    }

    /* renamed from: e */
    public b a() {
        return new b(this);
    }

    public b f(b bVar) {
        b bVar2 = bVar == null ? new b() : bVar;
        double d10 = this.f21295y;
        double d11 = this.X3;
        double d12 = this.U3;
        double d13 = this.W3;
        double d14 = (d10 * d11) - (d12 * d13);
        double d15 = this.f21294x;
        double d16 = this.V3;
        double d17 = -((d15 * d11) - (d12 * d16));
        double d18 = (d15 * d13) - (d10 * d16);
        double d19 = this.f21292d;
        double d20 = this.f21293q;
        b bVar3 = bVar2;
        double d21 = -((d19 * d11) - (d20 * d13));
        double d22 = this.f21291c;
        double d23 = (d11 * d22) - (d20 * d16);
        double d24 = -((d13 * d22) - (d16 * d19));
        double d25 = (d22 * d14) + (d19 * d17) + (d20 * d18);
        bVar3.f21291c = d14 / d25;
        bVar3.f21292d = d21 / d25;
        bVar3.f21293q = ((d19 * d12) - (d20 * d10)) / d25;
        bVar3.f21294x = d17 / d25;
        bVar3.f21295y = d23 / d25;
        bVar3.U3 = (-((d12 * d22) - (d20 * d15))) / d25;
        bVar3.V3 = d18 / d25;
        bVar3.W3 = d24 / d25;
        bVar3.X3 = ((d22 * d10) - (d15 * d19)) / d25;
        return bVar3;
    }

    public void g() {
        this.X3 = 1.0d;
        this.f21295y = 1.0d;
        this.f21291c = 1.0d;
        this.W3 = 0.0d;
        this.V3 = 0.0d;
        this.U3 = 0.0d;
        this.f21294x = 0.0d;
        this.f21293q = 0.0d;
        this.f21292d = 0.0d;
    }

    public void h(b bVar) {
        super.c(bVar);
    }

    public String toString() {
        return getClass().getSimpleName() + String.format("[ %5.2e %5.2e %5.2e ; %5.2e %5.2e %5.2e ; %5.2e %5.2e %5.2e ]", Double.valueOf(this.f21291c), Double.valueOf(this.f21292d), Double.valueOf(this.f21293q), Double.valueOf(this.f21294x), Double.valueOf(this.f21295y), Double.valueOf(this.U3), Double.valueOf(this.V3), Double.valueOf(this.W3), Double.valueOf(this.X3));
    }
}
