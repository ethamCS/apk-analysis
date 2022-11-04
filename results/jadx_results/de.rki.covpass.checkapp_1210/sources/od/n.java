package od;

import gd.x;
import hc.t;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe.e0;
import oe.n1;
import oe.p1;
import ub.u;
import xc.j1;
/* loaded from: classes.dex */
public final class n extends a<yc.c> {

    /* renamed from: a */
    private final yc.a f17901a;

    /* renamed from: b */
    private final boolean f17902b;

    /* renamed from: c */
    private final jd.g f17903c;

    /* renamed from: d */
    private final gd.b f17904d;

    /* renamed from: e */
    private final boolean f17905e;

    public n(yc.a aVar, boolean z10, jd.g gVar, gd.b bVar, boolean z11) {
        t.e(gVar, "containerContext");
        t.e(bVar, "containerApplicabilityType");
        this.f17901a = aVar;
        this.f17902b = z10;
        this.f17903c = gVar;
        this.f17904d = bVar;
        this.f17905e = z11;
    }

    public /* synthetic */ n(yc.a aVar, boolean z10, jd.g gVar, gd.b bVar, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, z10, gVar, bVar, (i10 & 16) != 0 ? false : z11);
    }

    @Override // od.a
    public boolean A(se.i iVar) {
        t.e(iVar, "<this>");
        return ((e0) iVar).Z0() instanceof g;
    }

    /* renamed from: D */
    public gd.d h() {
        return this.f17903c.a().a();
    }

    /* renamed from: E */
    public e0 p(se.i iVar) {
        t.e(iVar, "<this>");
        return p1.a((e0) iVar);
    }

    /* renamed from: F */
    public boolean r(yc.c cVar) {
        t.e(cVar, "<this>");
        return ((cVar instanceof id.g) && ((id.g) cVar).a()) || ((cVar instanceof kd.e) && !o() && (((kd.e) cVar).k() || l() == gd.b.TYPE_PARAMETER_BOUNDS));
    }

    /* renamed from: G */
    public se.r v() {
        return pe.q.f19172a;
    }

    @Override // od.a
    public Iterable<yc.c> i(se.i iVar) {
        t.e(iVar, "<this>");
        return ((e0) iVar).j();
    }

    @Override // od.a
    public Iterable<yc.c> k() {
        List h10;
        yc.g j10;
        yc.a aVar = this.f17901a;
        if (aVar == null || (j10 = aVar.j()) == null) {
            h10 = u.h();
            return h10;
        }
        return j10;
    }

    @Override // od.a
    public gd.b l() {
        return this.f17904d;
    }

    @Override // od.a
    public x m() {
        return this.f17903c.b();
    }

    @Override // od.a
    public boolean n() {
        yc.a aVar = this.f17901a;
        return (aVar instanceof j1) && ((j1) aVar).R() != null;
    }

    @Override // od.a
    public boolean o() {
        return this.f17903c.a().q().c();
    }

    @Override // od.a
    public wd.d s(se.i iVar) {
        t.e(iVar, "<this>");
        xc.e f10 = n1.f((e0) iVar);
        if (f10 != null) {
            return ae.d.m(f10);
        }
        return null;
    }

    @Override // od.a
    public boolean u() {
        return this.f17905e;
    }

    @Override // od.a
    public boolean w(se.i iVar) {
        t.e(iVar, "<this>");
        return uc.h.d0((e0) iVar);
    }

    @Override // od.a
    public boolean x() {
        return this.f17902b;
    }

    @Override // od.a
    public boolean y(se.i iVar, se.i iVar2) {
        t.e(iVar, "<this>");
        t.e(iVar2, "other");
        return this.f17903c.a().k().b((e0) iVar, (e0) iVar2);
    }

    @Override // od.a
    public boolean z(se.o oVar) {
        t.e(oVar, "<this>");
        return oVar instanceof kd.m;
    }
}
