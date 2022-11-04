package fe;

import hc.t;
import hd.g;
import he.h;
import nd.d0;
import ub.c0;
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a */
    private final jd.f f10181a;

    /* renamed from: b */
    private final g f10182b;

    public c(jd.f fVar, g gVar) {
        t.e(fVar, "packageFragmentProvider");
        t.e(gVar, "javaResolverCache");
        this.f10181a = fVar;
        this.f10182b = gVar;
    }

    public final jd.f a() {
        return this.f10181a;
    }

    public final xc.e b(nd.g gVar) {
        Object X;
        t.e(gVar, "javaClass");
        wd.c d10 = gVar.d();
        if (d10 == null || gVar.J() != d0.SOURCE) {
            nd.g q10 = gVar.q();
            if (q10 != null) {
                xc.e b10 = b(q10);
                h w02 = b10 != null ? b10.w0() : null;
                xc.h f10 = w02 != null ? w02.f(gVar.getName(), fd.d.FROM_JAVA_LOADER) : null;
                if (!(f10 instanceof xc.e)) {
                    return null;
                }
                return (xc.e) f10;
            } else if (d10 == null) {
                return null;
            } else {
                jd.f fVar = this.f10181a;
                wd.c e10 = d10.e();
                t.d(e10, "fqName.parent()");
                X = c0.X(fVar.a(e10));
                kd.h hVar = (kd.h) X;
                if (hVar == null) {
                    return null;
                }
                return hVar.U0(gVar);
            }
        }
        return this.f10182b.e(d10);
    }
}
