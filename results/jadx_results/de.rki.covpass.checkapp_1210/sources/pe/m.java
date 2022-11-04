package pe;

import kotlin.jvm.internal.DefaultConstructorMarker;
import oe.d1;
import oe.e0;
import oe.q1;
import pe.f;
/* loaded from: classes3.dex */
public final class m implements l {

    /* renamed from: b */
    private final g f19167b;

    /* renamed from: c */
    private final f f19168c;

    /* renamed from: d */
    private final ae.j f19169d;

    public m(g gVar, f fVar) {
        hc.t.e(gVar, "kotlinTypeRefiner");
        hc.t.e(fVar, "kotlinTypePreparator");
        this.f19167b = gVar;
        this.f19168c = fVar;
        ae.j m10 = ae.j.m(c());
        hc.t.d(m10, "createWithTypeRefiner(kotlinTypeRefiner)");
        this.f19169d = m10;
    }

    public /* synthetic */ m(g gVar, f fVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(gVar, (i10 & 2) != 0 ? f.a.f19147a : fVar);
    }

    @Override // pe.l
    public ae.j a() {
        return this.f19169d;
    }

    @Override // pe.e
    public boolean b(e0 e0Var, e0 e0Var2) {
        hc.t.e(e0Var, "a");
        hc.t.e(e0Var2, "b");
        return e(a.b(false, false, null, f(), c(), 6, null), e0Var.Z0(), e0Var2.Z0());
    }

    @Override // pe.l
    public g c() {
        return this.f19167b;
    }

    @Override // pe.e
    public boolean d(e0 e0Var, e0 e0Var2) {
        hc.t.e(e0Var, "subtype");
        hc.t.e(e0Var2, "supertype");
        return g(a.b(true, false, null, f(), c(), 6, null), e0Var.Z0(), e0Var2.Z0());
    }

    public final boolean e(d1 d1Var, q1 q1Var, q1 q1Var2) {
        hc.t.e(d1Var, "<this>");
        hc.t.e(q1Var, "a");
        hc.t.e(q1Var2, "b");
        return oe.f.f17953a.k(d1Var, q1Var, q1Var2);
    }

    public f f() {
        return this.f19168c;
    }

    public final boolean g(d1 d1Var, q1 q1Var, q1 q1Var2) {
        hc.t.e(d1Var, "<this>");
        hc.t.e(q1Var, "subType");
        hc.t.e(q1Var2, "superType");
        return oe.f.t(oe.f.f17953a, d1Var, q1Var, q1Var2, false, 8, null);
    }
}
