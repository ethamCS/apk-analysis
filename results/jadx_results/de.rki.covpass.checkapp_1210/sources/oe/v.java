package oe;
/* loaded from: classes3.dex */
public final class v extends y implements se.f {

    /* renamed from: x */
    private final a1 f18050x;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public v(uc.h r3, oe.a1 r4) {
        /*
            r2 = this;
            java.lang.String r0 = "builtIns"
            hc.t.e(r3, r0)
            java.lang.String r0 = "attributes"
            hc.t.e(r4, r0)
            oe.m0 r0 = r3.H()
            java.lang.String r1 = "builtIns.nothingType"
            hc.t.d(r0, r1)
            oe.m0 r3 = r3.I()
            java.lang.String r1 = "builtIns.nullableAnyType"
            hc.t.d(r3, r1)
            r2.<init>(r0, r3)
            r2.f18050x = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: oe.v.<init>(uc.h, oe.a1):void");
    }

    @Override // oe.y, oe.e0
    public a1 V0() {
        return this.f18050x;
    }

    @Override // oe.y, oe.e0
    public boolean X0() {
        return false;
    }

    @Override // oe.y
    public m0 d1() {
        return f1();
    }

    @Override // oe.y
    public String g1(zd.c cVar, zd.f fVar) {
        hc.t.e(cVar, "renderer");
        hc.t.e(fVar, "options");
        return "dynamic";
    }

    /* renamed from: h1 */
    public v a1(boolean z10) {
        return this;
    }

    /* renamed from: i1 */
    public v b1(pe.g gVar) {
        hc.t.e(gVar, "kotlinTypeRefiner");
        return this;
    }

    /* renamed from: j1 */
    public v c1(a1 a1Var) {
        hc.t.e(a1Var, "newAttributes");
        return new v(te.a.h(d1()), a1Var);
    }
}
