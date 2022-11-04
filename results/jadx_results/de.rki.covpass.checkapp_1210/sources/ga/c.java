package ga;

import ga.c;
import java.text.DecimalFormat;
import java.util.Objects;
/* loaded from: classes.dex */
public abstract class c<T extends c> extends g<T> {

    /* renamed from: c */
    public double f10622c;

    /* renamed from: d */
    public double f10623d;

    public void b(c cVar) {
        this.f10622c = cVar.f10622c;
        this.f10623d = cVar.f10623d;
    }

    public double c(T t10) {
        double d10 = t10.f10622c - this.f10622c;
        double d11 = t10.f10623d - this.f10623d;
        return Math.sqrt((d10 * d10) + (d11 * d11));
    }

    public double e(double d10, double d11) {
        double d12 = d10 - this.f10622c;
        double d13 = d11 - this.f10623d;
        return (d12 * d12) + (d13 * d13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return Double.compare(this.f10622c, cVar.f10622c) == 0 && Double.compare(this.f10623d, cVar.f10623d) == 0;
    }

    public double f(T t10) {
        double d10 = t10.f10622c - this.f10622c;
        double d11 = t10.f10623d - this.f10623d;
        return (d10 * d10) + (d11 * d11);
    }

    public boolean g(T t10, double d10) {
        return Math.abs(this.f10622c - t10.f10622c) <= d10 && Math.abs(this.f10623d - t10.f10623d) <= d10;
    }

    public double h() {
        double d10 = this.f10622c;
        double d11 = this.f10623d;
        return Math.sqrt((d10 * d10) + (d11 * d11));
    }

    public int hashCode() {
        return Objects.hash(Double.valueOf(this.f10622c), Double.valueOf(this.f10623d));
    }

    public void i(double d10, double d11) {
        this.f10622c = d10;
        this.f10623d = d11;
    }

    public String j(String str) {
        DecimalFormat decimalFormat = new DecimalFormat("#");
        String l10 = pk.d.l(this.f10622c, decimalFormat, 11, 4);
        String l11 = pk.d.l(this.f10623d, decimalFormat, 11, 4);
        return str + "( " + l10 + " " + l11 + " )";
    }
}
