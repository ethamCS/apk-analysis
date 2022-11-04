package j$.util;

import j$.util.function.AbstractC0503e;
/* renamed from: j$.util.f */
/* loaded from: classes2.dex */
public final class C0498f implements AbstractC0503e {

    /* renamed from: a */
    private double f13353a;

    /* renamed from: b */
    private double f13354b;
    private long count;
    private double sum;
    private double min = Double.POSITIVE_INFINITY;
    private double max = Double.NEGATIVE_INFINITY;

    private void e(double d10) {
        double d11 = d10 - this.f13353a;
        double d12 = this.sum;
        double d13 = d12 + d11;
        this.f13353a = (d13 - d12) - d11;
        this.sum = d13;
    }

    public final void b(C0498f c0498f) {
        this.count += c0498f.count;
        this.f13354b += c0498f.f13354b;
        e(c0498f.sum);
        e(c0498f.f13353a);
        this.min = Math.min(this.min, c0498f.min);
        this.max = Math.max(this.max, c0498f.max);
    }

    @Override // j$.util.function.AbstractC0503e
    public final void c(double d10) {
        this.count++;
        this.f13354b += d10;
        e(d10);
        this.min = Math.min(this.min, d10);
        this.max = Math.max(this.max, d10);
    }

    public final double d() {
        double d10 = this.sum + this.f13353a;
        return (!Double.isNaN(d10) || !Double.isInfinite(this.f13354b)) ? d10 : this.f13354b;
    }

    public final String toString() {
        Object[] objArr = new Object[6];
        objArr[0] = C0498f.class.getSimpleName();
        objArr[1] = Long.valueOf(this.count);
        objArr[2] = Double.valueOf(d());
        objArr[3] = Double.valueOf(this.min);
        objArr[4] = Double.valueOf(this.count > 0 ? d() / this.count : 0.0d);
        objArr[5] = Double.valueOf(this.max);
        return String.format("%s{count=%d, sum=%f, min=%f, average=%f, max=%f}", objArr);
    }
}
