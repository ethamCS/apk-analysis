package zh;
/* loaded from: classes3.dex */
public class m0 extends b {

    /* renamed from: d */
    private n0 f26961d;

    public m0(boolean z10, n0 n0Var) {
        super(z10);
        this.f26961d = n0Var;
    }

    public n0 b() {
        return this.f26961d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof m0)) {
            return false;
        }
        n0 n0Var = this.f26961d;
        n0 b10 = ((m0) obj).b();
        return n0Var == null ? b10 == null : n0Var.equals(b10);
    }

    public int hashCode() {
        n0 n0Var = this.f26961d;
        if (n0Var != null) {
            return n0Var.hashCode();
        }
        return 0;
    }
}
