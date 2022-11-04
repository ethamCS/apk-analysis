package xc;
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a */
    private static final g0<c0> f25525a = new g0<>("InvalidModuleNotifier");

    public static final void a(h0 h0Var) {
        tb.e0 e0Var;
        hc.t.e(h0Var, "<this>");
        c0 c0Var = (c0) h0Var.o0(f25525a);
        if (c0Var != null) {
            c0Var.a(h0Var);
            e0Var = tb.e0.f22152a;
        } else {
            e0Var = null;
        }
        if (e0Var != null) {
            return;
        }
        throw new a0("Accessing invalid module descriptor " + h0Var);
    }
}
