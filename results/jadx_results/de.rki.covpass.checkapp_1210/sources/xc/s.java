package xc;
/* loaded from: classes.dex */
public final class s {
    public static final h a(m mVar) {
        hc.t.e(mVar, "<this>");
        m b10 = mVar.b();
        if (b10 == null || (mVar instanceof l0)) {
            return null;
        }
        if (!b(b10)) {
            return a(b10);
        }
        if (!(b10 instanceof h)) {
            return null;
        }
        return (h) b10;
    }

    public static final boolean b(m mVar) {
        hc.t.e(mVar, "<this>");
        return mVar.b() instanceof l0;
    }

    public static final e c(h0 h0Var, wd.c cVar, fd.b bVar) {
        h hVar;
        he.h w02;
        hc.t.e(h0Var, "<this>");
        hc.t.e(cVar, "fqName");
        hc.t.e(bVar, "lookupLocation");
        if (cVar.d()) {
            return null;
        }
        wd.c e10 = cVar.e();
        hc.t.d(e10, "fqName.parent()");
        he.h z10 = h0Var.F(e10).z();
        wd.f g10 = cVar.g();
        hc.t.d(g10, "fqName.shortName()");
        h f10 = z10.f(g10, bVar);
        e eVar = f10 instanceof e ? (e) f10 : null;
        if (eVar != null) {
            return eVar;
        }
        wd.c e11 = cVar.e();
        hc.t.d(e11, "fqName.parent()");
        e c10 = c(h0Var, e11, bVar);
        if (c10 == null || (w02 = c10.w0()) == null) {
            hVar = null;
        } else {
            wd.f g11 = cVar.g();
            hc.t.d(g11, "fqName.shortName()");
            hVar = w02.f(g11, bVar);
        }
        if (!(hVar instanceof e)) {
            return null;
        }
        return (e) hVar;
    }
}
