package pd;

import xc.b1;
/* loaded from: classes.dex */
public final class s implements me.f {

    /* renamed from: b */
    private final q f19135b;

    /* renamed from: c */
    private final ke.t<vd.e> f19136c;

    /* renamed from: d */
    private final boolean f19137d;

    /* renamed from: e */
    private final me.e f19138e;

    public s(q qVar, ke.t<vd.e> tVar, boolean z10, me.e eVar) {
        hc.t.e(qVar, "binaryClass");
        hc.t.e(eVar, "abiStability");
        this.f19135b = qVar;
        this.f19136c = tVar;
        this.f19137d = z10;
        this.f19138e = eVar;
    }

    @Override // xc.a1
    public b1 a() {
        b1 b1Var = b1.f25526a;
        hc.t.d(b1Var, "NO_SOURCE_FILE");
        return b1Var;
    }

    @Override // me.f
    public String c() {
        return "Class '" + this.f19135b.i().b().b() + '\'';
    }

    public final q d() {
        return this.f19135b;
    }

    public String toString() {
        return s.class.getSimpleName() + ": " + this.f19135b;
    }
}
