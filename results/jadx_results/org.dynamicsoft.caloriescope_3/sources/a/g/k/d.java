package a.g.k;
/* loaded from: classes.dex */
public class d<F, S> {

    /* renamed from: a */
    public final F f245a;

    /* renamed from: b */
    public final S f246b;

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return c.a(dVar.f245a, this.f245a) && c.a(dVar.f246b, this.f246b);
    }

    public int hashCode() {
        F f = this.f245a;
        int i = 0;
        int hashCode = f == null ? 0 : f.hashCode();
        S s = this.f246b;
        if (s != null) {
            i = s.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "Pair{" + String.valueOf(this.f245a) + " " + String.valueOf(this.f246b) + "}";
    }
}
