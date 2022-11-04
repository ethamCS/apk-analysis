package gd;

import java.util.Map;
import xc.z0;
/* loaded from: classes.dex */
public final class e extends h0 {

    /* renamed from: m */
    public static final e f10688m = new e();

    /* loaded from: classes.dex */
    public static final class a extends hc.v implements gc.l<xc.b, Boolean> {

        /* renamed from: c */
        final /* synthetic */ z0 f10689c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(z0 z0Var) {
            super(1);
            this.f10689c = z0Var;
        }

        /* renamed from: b */
        public final Boolean invoke(xc.b bVar) {
            hc.t.e(bVar, "it");
            return Boolean.valueOf(h0.Companion.j().containsKey(pd.v.d(this.f10689c)));
        }
    }

    private e() {
    }

    public final wd.f i(z0 z0Var) {
        hc.t.e(z0Var, "functionDescriptor");
        Map<String, wd.f> j10 = h0.Companion.j();
        String d10 = pd.v.d(z0Var);
        if (d10 == null) {
            return null;
        }
        return j10.get(d10);
    }

    public final boolean j(z0 z0Var) {
        hc.t.e(z0Var, "functionDescriptor");
        return uc.h.f0(z0Var) && ee.a.c(z0Var, false, new a(z0Var), 1, null) != null;
    }

    public final boolean k(z0 z0Var) {
        hc.t.e(z0Var, "<this>");
        return hc.t.a(z0Var.getName().b(), "removeAt") && hc.t.a(pd.v.d(z0Var), h0.Companion.h().b());
    }
}
