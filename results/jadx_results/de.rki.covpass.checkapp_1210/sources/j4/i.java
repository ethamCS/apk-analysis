package j4;
/* loaded from: classes.dex */
public class i<T> {

    /* renamed from: a */
    T f14010a;

    /* renamed from: b */
    T f14011b;

    private static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public void b(T t10, T t11) {
        this.f14010a = t10;
        this.f14011b = t11;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof androidx.core.util.d)) {
            return false;
        }
        androidx.core.util.d dVar = (androidx.core.util.d) obj;
        return a(dVar.f3596a, this.f14010a) && a(dVar.f3597b, this.f14011b);
    }

    public int hashCode() {
        T t10 = this.f14010a;
        int i10 = 0;
        int hashCode = t10 == null ? 0 : t10.hashCode();
        T t11 = this.f14011b;
        if (t11 != null) {
            i10 = t11.hashCode();
        }
        return hashCode ^ i10;
    }

    public String toString() {
        return "Pair{" + this.f14010a + " " + this.f14011b + "}";
    }
}
