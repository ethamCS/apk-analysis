package jd;

import hc.t;
/* loaded from: classes.dex */
public final class j implements i {

    /* renamed from: a */
    public fe.c f14334a;

    @Override // jd.i
    public xc.e a(nd.g gVar) {
        t.e(gVar, "javaClass");
        return b().b(gVar);
    }

    public final fe.c b() {
        fe.c cVar = this.f14334a;
        if (cVar != null) {
            return cVar;
        }
        t.s("resolver");
        return null;
    }

    public final void c(fe.c cVar) {
        t.e(cVar, "<set-?>");
        this.f14334a = cVar;
    }
}
