package hc;
/* loaded from: classes.dex */
public abstract class f0 extends h implements oc.k {
    public f0() {
    }

    public f0(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, (i10 & 1) != 1 ? false : true);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0) {
            f0 f0Var = (f0) obj;
            return e0().equals(f0Var.e0()) && getName().equals(f0Var.getName()) && g0().equals(f0Var.g0()) && t.a(d0(), f0Var.d0());
        } else if (!(obj instanceof oc.k)) {
            return false;
        } else {
            return obj.equals(b0());
        }
    }

    /* renamed from: h0 */
    public oc.k f0() {
        return (oc.k) super.f0();
    }

    public int hashCode() {
        return (((e0().hashCode() * 31) + getName().hashCode()) * 31) + g0().hashCode();
    }

    public String toString() {
        oc.c b02 = b0();
        if (b02 != this) {
            return b02.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }
}
