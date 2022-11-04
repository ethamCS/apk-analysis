package a3;
/* loaded from: classes.dex */
public class b {

    /* renamed from: a */
    m3.d f184a;

    /* renamed from: b */
    double f185b;

    public double a(double d10, double d11, double d12, double d13) {
        double d14;
        double d15;
        int i10;
        int i11;
        int i12;
        double d16;
        b bVar = this;
        double d17 = d12 - d10;
        double d18 = d13 - d11;
        bVar.f185b = Math.sqrt((d17 * d17) + (d18 * d18));
        int signum = (int) Math.signum(d17);
        int signum2 = (int) Math.signum(d18);
        int i13 = (int) d10;
        int i14 = (int) d11;
        int i15 = (d17 > 0.0d ? 1 : (d17 == 0.0d ? 0 : -1));
        if (i15 != 0 && d18 != 0.0d) {
            double d19 = (i15 > 0 ? i13 + 1 : i13) - d10;
            if (i10 > 0) {
                i12 = signum;
                i11 = signum2;
                d16 = i14 + 1;
            } else {
                i12 = signum;
                i11 = signum2;
                d16 = i14;
            }
            double min = Math.min(d19 / d17, (d16 - d11) / d18);
            if (min > 1.0d) {
                min = 1.0d;
            }
            double b10 = min > 0.0d ? 0.0d + (bVar.f184a.b(i13, i14) * min) : 0.0d;
            double d20 = (min * d17) + d10;
            double d21 = min;
            double d22 = d11 + (min * d18);
            d14 = b10;
            int i16 = ((int) d20) + i12;
            double d23 = d20;
            int i17 = ((int) d22) + i11;
            double d24 = d22;
            double d25 = d21;
            while (d25 < 1.0d) {
                double d26 = (i16 - d23) / d17;
                double d27 = (i17 - d24) / d18;
                double min2 = Math.min(d26, d27);
                if (min2 <= pk.d.f19271j) {
                    min2 = Math.max(d26, d27);
                }
                if (d25 + min2 > 1.0d) {
                    min2 = 1.0d - d25;
                }
                double d28 = (0.5d * min2) + d25;
                d14 += this.f184a.b((int) ((d28 * d17) + d10), (int) (d11 + (d28 * d18))) * min2;
                d25 += min2;
                d23 = d10 + (d25 * d17);
                d24 = d11 + (d25 * d18);
                i17 = ((int) d24) + i11;
                i16 = ((int) d23) + i12;
            }
            bVar = this;
        } else if (d17 == d18) {
            return 0.0d;
        } else {
            if (i15 == 0) {
                d15 = (d18 > 0.0d ? i14 + 1 : i14) - d11;
            } else {
                d15 = (i15 > 0 ? i13 + 1 : i13) - d10;
            }
            double d29 = d17 + d18;
            double d30 = d15 / d29;
            if (d30 > 1.0d) {
                d30 = 1.0d;
            }
            double d31 = (signum + signum2) / d29;
            d14 = d30 > 0.0d ? (bVar.f184a.b(i13, i14) * d30) + 0.0d : 0.0d;
            while (d30 < 1.0d) {
                i13 += signum;
                i14 += signum2;
                double d32 = d30 + d31;
                d14 += (d32 > 1.0d ? 1.0d - d30 : d31) * bVar.f184a.b(i13, i14);
                d30 = d32;
            }
        }
        return d14 * bVar.f185b;
    }

    public boolean b(double d10, double d11) {
        return v3.a.e(this.f184a.d(), this.f184a.a(), d10, d11);
    }

    public void c(m3.d dVar) {
        this.f184a = dVar;
    }
}
