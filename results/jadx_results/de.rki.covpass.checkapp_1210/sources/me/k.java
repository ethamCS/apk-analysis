package me;

import ad.g0;
import ad.p;
import hc.t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import xc.a1;
import xc.b;
import xc.y;
import xc.z0;
/* loaded from: classes3.dex */
public final class k extends g0 implements b {

    /* renamed from: t4 */
    private final rd.i f16572t4;

    /* renamed from: u4 */
    private final td.c f16573u4;

    /* renamed from: v4 */
    private final td.g f16574v4;

    /* renamed from: w4 */
    private final td.h f16575w4;

    /* renamed from: x4 */
    private final f f16576x4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(xc.m mVar, z0 z0Var, yc.g gVar, wd.f fVar, b.a aVar, rd.i iVar, td.c cVar, td.g gVar2, td.h hVar, f fVar2, a1 a1Var) {
        super(mVar, z0Var, gVar, fVar, aVar, a1Var == null ? a1.f25519a : a1Var);
        t.e(mVar, "containingDeclaration");
        t.e(gVar, "annotations");
        t.e(fVar, "name");
        t.e(aVar, "kind");
        t.e(iVar, "proto");
        t.e(cVar, "nameResolver");
        t.e(gVar2, "typeTable");
        t.e(hVar, "versionRequirementTable");
        this.f16572t4 = iVar;
        this.f16573u4 = cVar;
        this.f16574v4 = gVar2;
        this.f16575w4 = hVar;
        this.f16576x4 = fVar2;
    }

    public /* synthetic */ k(xc.m mVar, z0 z0Var, yc.g gVar, wd.f fVar, b.a aVar, rd.i iVar, td.c cVar, td.g gVar2, td.h hVar, f fVar2, a1 a1Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(mVar, z0Var, gVar, fVar, aVar, iVar, cVar, gVar2, hVar, fVar2, (i10 & 1024) != 0 ? null : a1Var);
    }

    @Override // me.g
    public td.g D0() {
        return this.f16574v4;
    }

    @Override // me.g
    public f E() {
        return this.f16576x4;
    }

    @Override // me.g
    public td.c Q0() {
        return this.f16573u4;
    }

    @Override // ad.g0, ad.p
    protected p U0(xc.m mVar, y yVar, b.a aVar, wd.f fVar, yc.g gVar, a1 a1Var) {
        wd.f fVar2;
        t.e(mVar, "newOwner");
        t.e(aVar, "kind");
        t.e(gVar, "annotations");
        t.e(a1Var, "source");
        z0 z0Var = (z0) yVar;
        if (fVar == null) {
            wd.f name = getName();
            t.d(name, "name");
            fVar2 = name;
        } else {
            fVar2 = fVar;
        }
        k kVar = new k(mVar, z0Var, gVar, fVar2, aVar, X(), Q0(), D0(), z1(), E(), a1Var);
        kVar.h1(Z0());
        return kVar;
    }

    /* renamed from: y1 */
    public rd.i X() {
        return this.f16572t4;
    }

    public td.h z1() {
        return this.f16575w4;
    }
}
