package h6;
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a */
    private final int f11334a;

    /* renamed from: b */
    private final int f11335b;

    public int a() {
        return this.f11335b;
    }

    public int b() {
        return this.f11334a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f11334a == fVar.f11334a && this.f11335b == fVar.f11335b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f11334a * 32713) + this.f11335b;
    }

    public String toString() {
        return this.f11334a + "x" + this.f11335b;
    }
}
