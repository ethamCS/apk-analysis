package hc;
/* loaded from: classes.dex */
public class p extends h implements o, oc.g {
    private final int W3;
    private final int X3;

    public p(int i10) {
        this(i10, h.V3, null, null, null, 0);
    }

    public p(int i10, Object obj) {
        this(i10, obj, null, null, null, 0);
    }

    public p(int i10, Object obj, Class cls, String str, String str2, int i11) {
        super(obj, cls, str, str2, (i11 & 1) == 1);
        this.W3 = i10;
        this.X3 = i11 >> 1;
    }

    @Override // hc.h
    protected oc.c c0() {
        return k0.a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            return getName().equals(pVar.getName()) && g0().equals(pVar.g0()) && this.X3 == pVar.X3 && this.W3 == pVar.W3 && t.a(d0(), pVar.d0()) && t.a(e0(), pVar.e0());
        } else if (!(obj instanceof oc.g)) {
            return false;
        } else {
            return obj.equals(b0());
        }
    }

    @Override // hc.o
    public int getArity() {
        return this.W3;
    }

    /* renamed from: h0 */
    public oc.g f0() {
        return (oc.g) super.f0();
    }

    public int hashCode() {
        return (((e0() == null ? 0 : e0().hashCode() * 31) + getName().hashCode()) * 31) + g0().hashCode();
    }

    public String toString() {
        oc.c b02 = b0();
        if (b02 != this) {
            return b02.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }
}
