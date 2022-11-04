package me;

import ad.c0;
import hc.t;
import xc.a1;
import xc.b;
import xc.e0;
import xc.u;
import xc.u0;
/* loaded from: classes3.dex */
public final class j extends c0 implements b {

    /* renamed from: r4 */
    private final rd.n f16567r4;

    /* renamed from: s4 */
    private final td.c f16568s4;

    /* renamed from: t4 */
    private final td.g f16569t4;

    /* renamed from: u4 */
    private final td.h f16570u4;

    /* renamed from: v4 */
    private final f f16571v4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(xc.m mVar, u0 u0Var, yc.g gVar, e0 e0Var, u uVar, boolean z10, wd.f fVar, b.a aVar, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, rd.n nVar, td.c cVar, td.g gVar2, td.h hVar, f fVar2) {
        super(mVar, u0Var, gVar, e0Var, uVar, z10, fVar, aVar, a1.f25519a, z11, z12, z15, false, z13, z14);
        t.e(mVar, "containingDeclaration");
        t.e(gVar, "annotations");
        t.e(e0Var, "modality");
        t.e(uVar, "visibility");
        t.e(fVar, "name");
        t.e(aVar, "kind");
        t.e(nVar, "proto");
        t.e(cVar, "nameResolver");
        t.e(gVar2, "typeTable");
        t.e(hVar, "versionRequirementTable");
        this.f16567r4 = nVar;
        this.f16568s4 = cVar;
        this.f16569t4 = gVar2;
        this.f16570u4 = hVar;
        this.f16571v4 = fVar2;
    }

    @Override // me.g
    public td.g D0() {
        return this.f16569t4;
    }

    @Override // me.g
    public f E() {
        return this.f16571v4;
    }

    @Override // ad.c0, xc.d0
    public boolean H() {
        Boolean d10 = td.b.D.d(X().C0());
        t.d(d10, "IS_EXTERNAL_PROPERTY.get(proto.flags)");
        return d10.booleanValue();
    }

    @Override // me.g
    public td.c Q0() {
        return this.f16568s4;
    }

    @Override // ad.c0
    protected c0 Y0(xc.m mVar, e0 e0Var, u uVar, u0 u0Var, b.a aVar, wd.f fVar, a1 a1Var) {
        t.e(mVar, "newOwner");
        t.e(e0Var, "newModality");
        t.e(uVar, "newVisibility");
        t.e(aVar, "kind");
        t.e(fVar, "newName");
        t.e(a1Var, "source");
        return new j(mVar, u0Var, j(), e0Var, uVar, Q(), fVar, aVar, h0(), P(), H(), q0(), l0(), X(), Q0(), D0(), p1(), E());
    }

    /* renamed from: o1 */
    public rd.n X() {
        return this.f16567r4;
    }

    public td.h p1() {
        return this.f16570u4;
    }
}
