package me;

import hc.t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import xc.a1;
import xc.b;
import xc.y;
/* loaded from: classes3.dex */
public final class c extends ad.f implements b {

    /* renamed from: u4 */
    private final rd.d f16461u4;

    /* renamed from: v4 */
    private final td.c f16462v4;

    /* renamed from: w4 */
    private final td.g f16463w4;

    /* renamed from: x4 */
    private final td.h f16464x4;

    /* renamed from: y4 */
    private final f f16465y4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(xc.e eVar, xc.l lVar, yc.g gVar, boolean z10, b.a aVar, rd.d dVar, td.c cVar, td.g gVar2, td.h hVar, f fVar, a1 a1Var) {
        super(eVar, lVar, gVar, z10, aVar, a1Var == null ? a1.f25519a : a1Var);
        t.e(eVar, "containingDeclaration");
        t.e(gVar, "annotations");
        t.e(aVar, "kind");
        t.e(dVar, "proto");
        t.e(cVar, "nameResolver");
        t.e(gVar2, "typeTable");
        t.e(hVar, "versionRequirementTable");
        this.f16461u4 = dVar;
        this.f16462v4 = cVar;
        this.f16463w4 = gVar2;
        this.f16464x4 = hVar;
        this.f16465y4 = fVar;
    }

    public /* synthetic */ c(xc.e eVar, xc.l lVar, yc.g gVar, boolean z10, b.a aVar, rd.d dVar, td.c cVar, td.g gVar2, td.h hVar, f fVar, a1 a1Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(eVar, lVar, gVar, z10, aVar, dVar, cVar, gVar2, hVar, fVar, (i10 & 1024) != 0 ? null : a1Var);
    }

    /* renamed from: B1 */
    public c x1(xc.m mVar, y yVar, b.a aVar, wd.f fVar, yc.g gVar, a1 a1Var) {
        t.e(mVar, "newOwner");
        t.e(aVar, "kind");
        t.e(gVar, "annotations");
        t.e(a1Var, "source");
        c cVar = new c((xc.e) mVar, (xc.l) yVar, gVar, this.f306t4, aVar, X(), Q0(), D0(), D1(), E(), a1Var);
        cVar.h1(Z0());
        return cVar;
    }

    /* renamed from: C1 */
    public rd.d X() {
        return this.f16461u4;
    }

    @Override // me.g
    public td.g D0() {
        return this.f16463w4;
    }

    public td.h D1() {
        return this.f16464x4;
    }

    @Override // me.g
    public f E() {
        return this.f16465y4;
    }

    @Override // ad.p, xc.d0
    public boolean H() {
        return false;
    }

    @Override // me.g
    public td.c Q0() {
        return this.f16462v4;
    }

    @Override // ad.p, xc.y
    public boolean isInline() {
        return false;
    }

    @Override // ad.p, xc.y
    public boolean s0() {
        return false;
    }

    @Override // ad.p, xc.y
    public boolean u0() {
        return false;
    }
}
