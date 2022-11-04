package v3;
/* loaded from: classes.dex */
public class c {

    /* renamed from: a */
    double f23905a;

    /* renamed from: b */
    double f23906b;

    /* renamed from: c */
    boolean f23907c;

    public c(double d10) {
        c(d10);
        this.f23905a = d10;
        b();
    }

    public double a() {
        return this.f23906b;
    }

    public void b() {
        this.f23907c = true;
        this.f23906b = 0.0d;
    }

    public void c(double d10) {
        if (d10 < 0.0d || d10 > 1.0d) {
            throw new IllegalArgumentException("Decay must be from 0 to 1, inclusive");
        }
        this.f23905a = d10;
    }

    public double d(double d10) {
        if (this.f23907c) {
            this.f23907c = false;
            this.f23906b = d10;
        } else {
            double d11 = this.f23906b;
            double d12 = this.f23905a;
            this.f23906b = (d11 * d12) + ((1.0d - d12) * d10);
        }
        return this.f23906b;
    }
}
