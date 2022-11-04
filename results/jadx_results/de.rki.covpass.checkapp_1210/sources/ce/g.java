package ce;

import oe.e0;
import xc.h0;
/* loaded from: classes3.dex */
public abstract class g<T> {

    /* renamed from: a */
    private final T f6449a;

    public g(T t10) {
        this.f6449a = t10;
    }

    public abstract e0 a(h0 h0Var);

    public T b() {
        return this.f6449a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            T b10 = b();
            Object obj2 = null;
            g gVar = obj instanceof g ? (g) obj : null;
            if (gVar != null) {
                obj2 = gVar.b();
            }
            if (!hc.t.a(b10, obj2)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        T b10 = b();
        if (b10 != null) {
            return b10.hashCode();
        }
        return 0;
    }

    public String toString() {
        return String.valueOf(b());
    }
}
