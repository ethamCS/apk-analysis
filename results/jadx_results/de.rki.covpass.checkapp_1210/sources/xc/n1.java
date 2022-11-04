package xc;
/* loaded from: classes.dex */
public abstract class n1 {

    /* renamed from: a */
    private final String f25571a;

    /* renamed from: b */
    private final boolean f25572b;

    public n1(String str, boolean z10) {
        hc.t.e(str, "name");
        this.f25571a = str;
        this.f25572b = z10;
    }

    public Integer a(n1 n1Var) {
        hc.t.e(n1Var, "visibility");
        return m1.f25556a.a(this, n1Var);
    }

    public String b() {
        return this.f25571a;
    }

    public final boolean c() {
        return this.f25572b;
    }

    public n1 d() {
        return this;
    }

    public final String toString() {
        return b();
    }
}
