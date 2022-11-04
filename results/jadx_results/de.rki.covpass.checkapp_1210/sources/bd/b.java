package bd;

import hc.t;
import xc.m1;
import xc.n1;
/* loaded from: classes.dex */
public final class b extends n1 {

    /* renamed from: c */
    public static final b f5974c = new b();

    private b() {
        super("protected_and_package", true);
    }

    @Override // xc.n1
    public Integer a(n1 n1Var) {
        t.e(n1Var, "visibility");
        if (t.a(this, n1Var)) {
            return 0;
        }
        if (n1Var == m1.b.f25560c) {
            return null;
        }
        return Integer.valueOf(m1.f25556a.b(n1Var) ? 1 : -1);
    }

    @Override // xc.n1
    public String b() {
        return "protected/*protected and package*/";
    }

    @Override // xc.n1
    public n1 d() {
        return m1.g.f25565c;
    }
}
