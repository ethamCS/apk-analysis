package androidx.appcompat.app;
/* loaded from: classes.dex */
class l {
    private static l d;

    /* renamed from: a */
    public long f533a;

    /* renamed from: b */
    public long f534b;

    /* renamed from: c */
    public int f535c;

    l() {
    }

    public static l a() {
        if (d == null) {
            d = new l();
        }
        return d;
    }

    public void a(long j, double d2, double d3) {
        float f;
        float f2 = ((float) (j - 946728000000L)) / 8.64E7f;
        double d4 = (0.01720197f * f2) + 6.24006f;
        Double.isNaN(d4);
        double sin = (Math.sin(d4) * 0.03341960161924362d) + d4 + (Math.sin(2.0f * f) * 3.4906598739326E-4d) + (Math.sin(f * 3.0f) * 5.236000106378924E-6d) + 1.796593063d + 3.141592653589793d;
        double d5 = (-d3) / 360.0d;
        double d6 = f2 - 9.0E-4f;
        Double.isNaN(d6);
        double round = ((float) Math.round(d6 - d5)) + 9.0E-4f;
        Double.isNaN(round);
        double sin2 = round + d5 + (Math.sin(d4) * 0.0053d) + (Math.sin(2.0d * sin) * (-0.0069d));
        double asin = Math.asin(Math.sin(sin) * Math.sin(0.4092797040939331d));
        double d7 = 0.01745329238474369d * d2;
        double sin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(d7) * Math.sin(asin))) / (Math.cos(d7) * Math.cos(asin));
        if (sin3 >= 1.0d) {
            this.f535c = 1;
        } else if (sin3 > -1.0d) {
            double acos = (float) (Math.acos(sin3) / 6.283185307179586d);
            Double.isNaN(acos);
            this.f533a = Math.round((sin2 + acos) * 8.64E7d) + 946728000000L;
            Double.isNaN(acos);
            long round2 = Math.round((sin2 - acos) * 8.64E7d) + 946728000000L;
            this.f534b = round2;
            if (round2 >= j || this.f533a <= j) {
                this.f535c = 1;
                return;
            } else {
                this.f535c = 0;
                return;
            }
        } else {
            this.f535c = 0;
        }
        this.f533a = -1L;
        this.f534b = -1L;
    }
}
