package wk;

import rk.f;
/* loaded from: classes3.dex */
public class a {

    /* renamed from: a */
    public f f25318a = new f();

    /* renamed from: b */
    public f f25319b = new f();

    public void a(double d10, double d11, double d12) {
        double d13 = (d10 + d12) * 0.5d;
        double d14 = (d10 - d12) * 0.5d;
        double sqrt = Math.sqrt((d14 * d14) + (d11 * d11));
        this.f25318a.f21284a = d13 + sqrt;
        this.f25319b.f21284a = d13 - sqrt;
    }
}
