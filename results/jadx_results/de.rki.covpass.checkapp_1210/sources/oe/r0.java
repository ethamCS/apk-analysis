package oe;
/* loaded from: classes3.dex */
public final class r0 extends h1 {

    /* renamed from: a */
    private final e0 f18036a;

    public r0(uc.h hVar) {
        hc.t.e(hVar, "kotlinBuiltIns");
        m0 I = hVar.I();
        hc.t.d(I, "kotlinBuiltIns.nullableAnyType");
        this.f18036a = I;
    }

    @Override // oe.g1
    public g1 a(pe.g gVar) {
        hc.t.e(gVar, "kotlinTypeRefiner");
        return this;
    }

    @Override // oe.g1
    public r1 b() {
        return r1.OUT_VARIANCE;
    }

    @Override // oe.g1
    public boolean c() {
        return true;
    }

    @Override // oe.g1
    public e0 getType() {
        return this.f18036a;
    }
}
