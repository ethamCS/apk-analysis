package ga;

import ga.d;
import java.text.DecimalFormat;
import java.util.Objects;
/* loaded from: classes.dex */
public abstract class d<T extends d> extends g<T> {

    /* renamed from: c */
    public double f10624c;

    /* renamed from: d */
    public double f10625d;

    /* renamed from: q */
    public double f10626q;

    public void b(d dVar) {
        this.f10624c = dVar.f10624c;
        this.f10625d = dVar.f10625d;
        this.f10626q = dVar.f10626q;
    }

    public void c(double d10) {
        this.f10624c /= d10;
        this.f10625d /= d10;
        this.f10626q /= d10;
    }

    public double e() {
        double d10 = this.f10624c;
        double d11 = this.f10625d;
        double d12 = (d10 * d10) + (d11 * d11);
        double d13 = this.f10626q;
        return Math.sqrt(d12 + (d13 * d13));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return Double.compare(this.f10624c, dVar.f10624c) == 0 && Double.compare(this.f10625d, dVar.f10625d) == 0 && Double.compare(this.f10626q, dVar.f10626q) == 0;
    }

    public void f(double d10, double d11, double d12) {
        this.f10624c = d10;
        this.f10625d = d11;
        this.f10626q = d12;
    }

    public String g(String str) {
        DecimalFormat decimalFormat = new DecimalFormat("#");
        String l10 = pk.d.l(this.f10624c, decimalFormat, 11, 4);
        String l11 = pk.d.l(this.f10625d, decimalFormat, 11, 4);
        String l12 = pk.d.l(this.f10626q, decimalFormat, 11, 4);
        return str + "( " + l10 + " , " + l11 + " , " + l12 + " )";
    }

    public int hashCode() {
        return Objects.hash(Double.valueOf(this.f10624c), Double.valueOf(this.f10625d), Double.valueOf(this.f10626q));
    }
}
