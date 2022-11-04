package androidx.core.util;
/* loaded from: classes.dex */
public class d<F, S> {

    /* renamed from: a */
    public final F f3596a;

    /* renamed from: b */
    public final S f3597b;

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return c.a(dVar.f3596a, this.f3596a) && c.a(dVar.f3597b, this.f3597b);
    }

    public int hashCode() {
        F f10 = this.f3596a;
        int i10 = 0;
        int hashCode = f10 == null ? 0 : f10.hashCode();
        S s10 = this.f3597b;
        if (s10 != null) {
            i10 = s10.hashCode();
        }
        return hashCode ^ i10;
    }

    public String toString() {
        return "Pair{" + this.f3596a + " " + this.f3597b + "}";
    }
}
