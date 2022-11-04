package oe;
/* loaded from: classes3.dex */
public abstract class h1 implements g1 {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        return c() == g1Var.c() && b() == g1Var.b() && getType().equals(g1Var.getType());
    }

    public int hashCode() {
        int hashCode = b().hashCode() * 31;
        if (n1.v(getType())) {
            return hashCode + 19;
        }
        return hashCode + (c() ? 17 : getType().hashCode());
    }

    public String toString() {
        if (c()) {
            return "*";
        }
        if (b() == r1.INVARIANT) {
            return getType().toString();
        }
        return b() + " " + getType();
    }
}
