package ue;

import hc.t;
/* loaded from: classes3.dex */
public final class a<T> {

    /* renamed from: a */
    private final T f23596a;

    /* renamed from: b */
    private final T f23597b;

    public a(T t10, T t11) {
        this.f23596a = t10;
        this.f23597b = t11;
    }

    public final T a() {
        return this.f23596a;
    }

    public final T b() {
        return this.f23597b;
    }

    public final T c() {
        return this.f23596a;
    }

    public final T d() {
        return this.f23597b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return t.a(this.f23596a, aVar.f23596a) && t.a(this.f23597b, aVar.f23597b);
    }

    public int hashCode() {
        T t10 = this.f23596a;
        int i10 = 0;
        int hashCode = (t10 == null ? 0 : t10.hashCode()) * 31;
        T t11 = this.f23597b;
        if (t11 != null) {
            i10 = t11.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        return "ApproximationBounds(lower=" + this.f23596a + ", upper=" + this.f23597b + ')';
    }
}
