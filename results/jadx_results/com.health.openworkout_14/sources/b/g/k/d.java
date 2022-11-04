package b.g.k;
/* loaded from: classes.dex */
public class d<F, S> {

    /* renamed from: a */
    public final F f2493a;

    /* renamed from: b */
    public final S f2494b;

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return c.a(dVar.f2493a, this.f2493a) && c.a(dVar.f2494b, this.f2494b);
    }

    public int hashCode() {
        F f2 = this.f2493a;
        int i = 0;
        int hashCode = f2 == null ? 0 : f2.hashCode();
        S s = this.f2494b;
        if (s != null) {
            i = s.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "Pair{" + String.valueOf(this.f2493a) + " " + String.valueOf(this.f2494b) + "}";
    }
}
