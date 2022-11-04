package yc;

import hc.t;
import hc.v;
import java.util.List;
import java.util.Map;
import oe.e0;
import oe.m0;
import oe.r1;
import org.conscrypt.BuildConfig;
import tb.x;
import ub.q0;
import ub.u;
import uc.k;
import xc.h0;
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a */
    private static final wd.f f26033a;

    /* renamed from: b */
    private static final wd.f f26034b;

    /* renamed from: c */
    private static final wd.f f26035c;

    /* renamed from: d */
    private static final wd.f f26036d;

    /* renamed from: e */
    private static final wd.f f26037e;

    /* loaded from: classes.dex */
    public static final class a extends v implements gc.l<h0, e0> {

        /* renamed from: c */
        final /* synthetic */ uc.h f26038c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(uc.h hVar) {
            super(1);
            this.f26038c = hVar;
        }

        /* renamed from: b */
        public final e0 invoke(h0 h0Var) {
            t.e(h0Var, "module");
            m0 l10 = h0Var.x().l(r1.INVARIANT, this.f26038c.W());
            t.d(l10, "module.builtIns.getArray…ce.INVARIANT, stringType)");
            return l10;
        }
    }

    static {
        wd.f j10 = wd.f.j("message");
        t.d(j10, "identifier(\"message\")");
        f26033a = j10;
        wd.f j11 = wd.f.j("replaceWith");
        t.d(j11, "identifier(\"replaceWith\")");
        f26034b = j11;
        wd.f j12 = wd.f.j("level");
        t.d(j12, "identifier(\"level\")");
        f26035c = j12;
        wd.f j13 = wd.f.j("expression");
        t.d(j13, "identifier(\"expression\")");
        f26036d = j13;
        wd.f j14 = wd.f.j("imports");
        t.d(j14, "identifier(\"imports\")");
        f26037e = j14;
    }

    public static final c a(uc.h hVar, String str, String str2, String str3) {
        List h10;
        Map k10;
        Map k11;
        t.e(hVar, "<this>");
        t.e(str, "message");
        t.e(str2, "replaceWith");
        t.e(str3, "level");
        wd.c cVar = k.a.B;
        wd.f fVar = f26037e;
        h10 = u.h();
        k10 = q0.k(x.a(f26036d, new ce.v(str2)), x.a(fVar, new ce.b(h10, new a(hVar))));
        j jVar = new j(hVar, cVar, k10);
        wd.c cVar2 = k.a.f23513y;
        wd.f fVar2 = f26035c;
        wd.b m10 = wd.b.m(k.a.A);
        t.d(m10, "topLevel(StandardNames.FqNames.deprecationLevel)");
        wd.f j10 = wd.f.j(str3);
        t.d(j10, "identifier(level)");
        k11 = q0.k(x.a(f26033a, new ce.v(str)), x.a(f26034b, new ce.a(jVar)), x.a(fVar2, new ce.j(m10, j10)));
        return new j(hVar, cVar2, k11);
    }

    public static /* synthetic */ c b(uc.h hVar, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = BuildConfig.FLAVOR;
        }
        if ((i10 & 4) != 0) {
            str3 = "WARNING";
        }
        return a(hVar, str, str2, str3);
    }
}
