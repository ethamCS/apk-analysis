package oe;
/* loaded from: classes3.dex */
public interface z0 {

    /* loaded from: classes3.dex */
    public static final class a {
        public static /* synthetic */ a1 a(z0 z0Var, yc.g gVar, e1 e1Var, xc.m mVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    e1Var = null;
                }
                if ((i10 & 4) != 0) {
                    mVar = null;
                }
                return z0Var.a(gVar, e1Var, mVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toAttributes");
        }
    }

    a1 a(yc.g gVar, e1 e1Var, xc.m mVar);
}
