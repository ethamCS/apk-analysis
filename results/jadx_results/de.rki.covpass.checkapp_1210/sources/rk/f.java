package rk;

import org.conscrypt.BuildConfig;
/* loaded from: classes3.dex */
public class f {

    /* renamed from: a */
    public double f21284a;

    /* renamed from: b */
    public double f21285b;

    protected boolean a(Object obj) {
        return obj instanceof f;
    }

    public double b() {
        return this.f21285b;
    }

    public double c() {
        return this.f21284a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return fVar.a(this) && Double.compare(c(), fVar.c()) == 0 && Double.compare(b(), fVar.b()) == 0;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(c());
        long doubleToLongBits2 = Double.doubleToLongBits(b());
        return ((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 59) * 59) + ((int) ((doubleToLongBits2 >>> 32) ^ doubleToLongBits2));
    }

    public String toString() {
        StringBuilder sb2;
        if (this.f21285b == 0.0d) {
            sb2 = new StringBuilder();
            sb2.append(BuildConfig.FLAVOR);
            sb2.append(this.f21284a);
        } else {
            sb2 = new StringBuilder();
            sb2.append(this.f21284a);
            sb2.append(" ");
            sb2.append(this.f21285b);
            sb2.append("i");
        }
        return sb2.toString();
    }
}
