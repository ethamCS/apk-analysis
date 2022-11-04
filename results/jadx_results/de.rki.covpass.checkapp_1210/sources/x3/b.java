package x3;

import java.io.Serializable;
/* loaded from: classes.dex */
public class b implements Serializable {

    /* renamed from: c */
    public double f25374c;

    /* renamed from: d */
    public double f25375d;

    public b() {
        this.f25374c = -1.0d;
        this.f25375d = -1.0d;
    }

    public b(double d10, double d11) {
        this.f25374c = d10;
        this.f25375d = d11;
    }

    public static b g(double d10) {
        return new b(d10, -1.0d);
    }

    public static b i(double d10, double d11) {
        return new b(d11, d10);
    }

    public void b() {
        if (this.f25374c >= 0.0d || this.f25375d >= 0.0d) {
            if (!h()) {
                return;
            }
            double d10 = this.f25375d;
            if (d10 >= 0.0d && d10 <= 1.0d) {
                return;
            }
            throw new IllegalArgumentException("Fractional value must be from 0.0maxFeatures to 1.0, inclusive");
        }
        throw new IllegalArgumentException("length and/or fraction must be >= 0");
    }

    public double c(double d10) {
        double d11 = this.f25375d;
        return d11 >= 0.0d ? Math.max(d11 * d10, this.f25374c) : this.f25374c;
    }

    public int e(double d10) {
        double c10 = c(d10);
        if (c10 >= 0.0d) {
            return (int) Math.round(c10);
        }
        return -1;
    }

    public b f() {
        return new b().j(this);
    }

    public boolean h() {
        return this.f25375d >= 0.0d;
    }

    public b j(b bVar) {
        this.f25374c = bVar.f25374c;
        this.f25375d = bVar.f25375d;
        return this;
    }

    public String toString() {
        StringBuilder sb2;
        double d10 = this.f25375d;
        if (d10 >= 0.0d) {
            double d11 = this.f25374c;
            sb2 = new StringBuilder();
            sb2.append("ConfigLength{");
            sb2.append("fraction=");
            sb2.append(d10);
            sb2.append(", minimum=");
            sb2.append(d11);
        } else {
            double d12 = this.f25374c;
            sb2 = new StringBuilder();
            sb2.append("ConfigLength{");
            sb2.append(", length=");
            sb2.append(d12);
        }
        String sb3 = sb2.toString();
        return sb3 + "}";
    }
}
