package q2;
/* loaded from: classes.dex */
public class a {

    /* renamed from: a */
    private boolean f19487a;

    /* renamed from: b */
    public double f19488b;

    /* renamed from: c */
    public double f19489c;

    /* renamed from: d */
    private double f19490d;

    /* renamed from: e */
    public boolean f19491e;

    /* renamed from: f */
    private double f19492f;

    public a(boolean z10, double d10, boolean z11, double d11) {
        this.f19487a = z10;
        this.f19490d = d10;
        this.f19491e = z11;
        this.f19492f = d11;
    }

    public void a(int[] iArr, int i10, int i11) {
        if (this.f19487a) {
            c(iArr, i10, i11);
        } else {
            b(iArr, i10, i11);
        }
        double d10 = this.f19489c + 0.001d;
        this.f19489c = d10;
        double d11 = this.f19490d;
        double d12 = this.f19488b;
        int i12 = (int) (((((d11 * d12) * d11) * d12) / d10) + 0.5d);
        if (this.f19491e) {
            i12 = -i12;
        }
        double d13 = d12 + i12;
        this.f19488b = d13;
        this.f19488b = (int) ((this.f19492f * Math.max(d13, 0.0d)) + 0.5d);
    }

    protected void b(int[] iArr, int i10, int i11) {
        double d10;
        int i12;
        int i13 = i10;
        double d11 = i13;
        int i14 = 0;
        double d12 = 0.0d;
        for (int i15 = 0; i15 < i13; i15++) {
            d12 += (i15 / d11) * iArr[i15];
        }
        this.f19489c = 0.0d;
        this.f19488b = 0.0d;
        double d13 = 0.0d;
        int i16 = 0;
        while (i14 < i13) {
            int i17 = i16 + iArr[i14];
            if (i17 == 0) {
                d10 = d11;
                i12 = i17;
            } else {
                int i18 = i11 - i17;
                if (i18 == 0) {
                    return;
                }
                double d14 = i14;
                d10 = d11;
                double d15 = d13 + ((d14 / d11) * iArr[i14]);
                double d16 = i17;
                i12 = i17;
                double d17 = i18;
                double d18 = (d15 / d16) - ((d12 - d15) / d17);
                double d19 = d16 * d17 * d18 * d18;
                if (d19 > this.f19489c) {
                    this.f19489c = d19;
                    this.f19488b = d14;
                }
                d13 = d15;
            }
            i14++;
            i13 = i10;
            i16 = i12;
            d11 = d10;
        }
    }

    protected void c(int[] iArr, int i10, int i11) {
        double d10;
        int i12;
        int i13 = i10;
        double d11 = i13;
        int i14 = 0;
        double d12 = 0.0d;
        for (int i15 = 0; i15 < i13; i15++) {
            d12 += (i15 / d11) * iArr[i15];
        }
        this.f19489c = 0.0d;
        this.f19488b = 0.0d;
        double d13 = 0.0d;
        double d14 = 0.0d;
        int i16 = 0;
        double d15 = 0.0d;
        while (i14 < i13) {
            int i17 = i16 + iArr[i14];
            if (i17 == 0) {
                d10 = d11;
                i12 = i17;
            } else {
                int i18 = i11 - i17;
                if (i18 == 0) {
                    break;
                }
                double d16 = d13;
                d10 = d11;
                double d17 = d15 + ((i14 / d11) * iArr[i14]);
                double d18 = i17;
                d13 = d17 / d18;
                i12 = i17;
                double d19 = i18;
                double d20 = (d12 - d17) / d19;
                double d21 = d18 * d19;
                double d22 = d13 - d20;
                double d23 = d21 * d22 * d22;
                if (d23 > this.f19489c) {
                    this.f19489c = d23;
                    d14 = d20;
                } else {
                    d13 = d16;
                }
                d15 = d17;
            }
            i14++;
            i13 = i10;
            i16 = i12;
            d11 = d10;
        }
        this.f19488b = (d11 * (d13 + d14)) / 2.0d;
    }

    public double d() {
        return this.f19492f;
    }

    public double e() {
        return this.f19490d;
    }

    public boolean f() {
        return this.f19487a;
    }
}
