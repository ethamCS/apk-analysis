package ja;

import java.io.Serializable;
/* loaded from: classes.dex */
public class b implements Serializable {

    /* renamed from: c */
    public double f14233c;

    /* renamed from: d */
    public double f14234d;

    /* renamed from: q */
    public double f14235q;

    public void b() {
        double d10 = this.f14233c;
        double d11 = this.f14234d;
        double sqrt = Math.sqrt((d10 * d10) + (d11 * d11));
        this.f14233c /= sqrt;
        this.f14234d /= sqrt;
        this.f14235q /= sqrt;
    }

    public void c(b bVar) {
        this.f14233c = bVar.f14233c;
        this.f14234d = bVar.f14234d;
        this.f14235q = bVar.f14235q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f14233c == bVar.f14233c && this.f14234d == bVar.f14234d && this.f14235q == bVar.f14235q;
    }

    public int hashCode() {
        return Double.doubleToLongBits(this.f14233c + this.f14234d + this.f14235q);
    }

    public String toString() {
        pk.b bVar = new pk.b();
        return getClass().getSimpleName() + "{ A=" + bVar.b(this.f14233c) + " B=" + bVar.b(this.f14234d) + " C=" + bVar.b(this.f14235q) + " }";
    }
}
