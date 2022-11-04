package bd;

import hc.t;
import xc.m1;
import xc.n1;
/* loaded from: classes.dex */
public final class a extends n1 {

    /* renamed from: c */
    public static final a f5973c = new a();

    private a() {
        super("package", false);
    }

    @Override // xc.n1
    public Integer a(n1 n1Var) {
        t.e(n1Var, "visibility");
        return Integer.valueOf(this == n1Var ? 0 : m1.f25556a.b(n1Var) ? 1 : -1);
    }

    @Override // xc.n1
    public String b() {
        return "public/*package*/";
    }

    @Override // xc.n1
    public n1 d() {
        return m1.g.f25565c;
    }
}
