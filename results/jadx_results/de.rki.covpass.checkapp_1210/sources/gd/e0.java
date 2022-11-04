package gd;

import java.util.List;
/* loaded from: classes.dex */
public final class e0 {
    public static final List<wd.f> a(wd.f fVar) {
        List<wd.f> l10;
        hc.t.e(fVar, "name");
        String b10 = fVar.b();
        hc.t.d(b10, "name.asString()");
        if (!z.c(b10)) {
            return z.d(b10) ? f(fVar) : g.f10698a.b(fVar);
        }
        l10 = ub.u.l(b(fVar));
        return l10;
    }

    public static final wd.f b(wd.f fVar) {
        hc.t.e(fVar, "methodName");
        wd.f e10 = e(fVar, "get", false, null, 12, null);
        return e10 == null ? e(fVar, "is", false, null, 8, null) : e10;
    }

    public static final wd.f c(wd.f fVar, boolean z10) {
        hc.t.e(fVar, "methodName");
        return e(fVar, "set", false, z10 ? "is" : null, 4, null);
    }

    private static final wd.f d(wd.f fVar, String str, boolean z10, String str2) {
        boolean I;
        String p02;
        String p03;
        if (fVar.l()) {
            return null;
        }
        String g10 = fVar.g();
        hc.t.d(g10, "methodName.identifier");
        boolean z11 = false;
        I = bf.x.I(g10, str, false, 2, null);
        if (!I || g10.length() == str.length()) {
            return null;
        }
        char charAt = g10.charAt(str.length());
        if ('a' <= charAt && charAt < '{') {
            z11 = true;
        }
        if (z11) {
            return null;
        }
        if (str2 != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            p03 = bf.y.p0(g10, str);
            sb2.append(p03);
            return wd.f.j(sb2.toString());
        } else if (!z10) {
            return fVar;
        } else {
            p02 = bf.y.p0(g10, str);
            String c10 = we.a.c(p02, true);
            if (wd.f.m(c10)) {
                return wd.f.j(c10);
            }
            return null;
        }
    }

    static /* synthetic */ wd.f e(wd.f fVar, String str, boolean z10, String str2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            str2 = null;
        }
        return d(fVar, str, z10, str2);
    }

    public static final List<wd.f> f(wd.f fVar) {
        List<wd.f> m10;
        hc.t.e(fVar, "methodName");
        m10 = ub.u.m(c(fVar, false), c(fVar, true));
        return m10;
    }
}
