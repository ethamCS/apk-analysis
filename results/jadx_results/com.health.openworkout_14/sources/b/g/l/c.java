package b.g.l;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a */
    private final Object f2519a;

    private c(Object obj) {
        this.f2519a = obj;
    }

    public static c a(Object obj) {
        if (obj == null) {
            return null;
        }
        return new c(obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        Object obj2 = this.f2519a;
        Object obj3 = ((c) obj).f2519a;
        return obj2 == null ? obj3 == null : obj2.equals(obj3);
    }

    public int hashCode() {
        Object obj = this.f2519a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        return "DisplayCutoutCompat{" + this.f2519a + "}";
    }
}
