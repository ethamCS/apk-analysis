package ce;

import oe.e0;
import oe.m0;
import xc.h0;
/* loaded from: classes3.dex */
public final class j extends g<tb.r<? extends wd.b, ? extends wd.f>> {

    /* renamed from: b */
    private final wd.b f6453b;

    /* renamed from: c */
    private final wd.f f6454c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(wd.b bVar, wd.f fVar) {
        super(tb.x.a(bVar, fVar));
        hc.t.e(bVar, "enumClassId");
        hc.t.e(fVar, "enumEntryName");
        this.f6453b = bVar;
        this.f6454c = fVar;
    }

    @Override // ce.g
    public e0 a(h0 h0Var) {
        hc.t.e(h0Var, "module");
        xc.e a10 = xc.x.a(h0Var, this.f6453b);
        m0 m0Var = null;
        if (a10 != null) {
            if (!ae.d.A(a10)) {
                a10 = null;
            }
            if (a10 != null) {
                m0Var = a10.u();
            }
        }
        if (m0Var == null) {
            qe.j jVar = qe.j.ERROR_ENUM_TYPE;
            String bVar = this.f6453b.toString();
            hc.t.d(bVar, "enumClassId.toString()");
            String fVar = this.f6454c.toString();
            hc.t.d(fVar, "enumEntryName.toString()");
            return qe.k.d(jVar, bVar, fVar);
        }
        return m0Var;
    }

    public final wd.f c() {
        return this.f6454c;
    }

    @Override // ce.g
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f6453b.j());
        sb2.append('.');
        sb2.append(this.f6454c);
        return sb2.toString();
    }
}
