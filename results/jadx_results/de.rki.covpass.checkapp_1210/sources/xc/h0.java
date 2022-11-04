package xc;

import java.util.Collection;
import java.util.List;
/* loaded from: classes.dex */
public interface h0 extends m {

    /* loaded from: classes.dex */
    public static final class a {
        public static <R, D> R a(h0 h0Var, o<R, D> oVar, D d10) {
            hc.t.e(oVar, "visitor");
            return oVar.l(h0Var, d10);
        }

        public static m b(h0 h0Var) {
            return null;
        }
    }

    q0 F(wd.c cVar);

    boolean O(h0 h0Var);

    List<h0> i0();

    <T> T o0(g0<T> g0Var);

    Collection<wd.c> t(wd.c cVar, gc.l<? super wd.f, Boolean> lVar);

    uc.h x();
}
