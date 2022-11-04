package y5;

import f6.c0;
import f6.d0;
import f6.i0;
import f6.y;
import f6.z;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public class s {

    /* renamed from: a */
    public static final Charset f25843a = Charset.forName("UTF-8");

    public static d0.c a(c0.c cVar) {
        return d0.c.T().E(cVar.S().T()).D(cVar.V()).C(cVar.U()).B(cVar.T()).b();
    }

    public static d0 b(c0 c0Var) {
        d0.b C = d0.T().C(c0Var.V());
        for (c0.c cVar : c0Var.U()) {
            C.B(a(cVar));
        }
        return C.b();
    }

    public static void c(c0.c cVar) {
        if (cVar.W()) {
            if (cVar.U() == i0.UNKNOWN_PREFIX) {
                throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(cVar.T())));
            }
            if (cVar.V() == z.UNKNOWN_STATUS) {
                throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(cVar.T())));
            }
            return;
        }
        throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(cVar.T())));
    }

    public static void d(c0 c0Var) {
        int V = c0Var.V();
        boolean z10 = true;
        int i10 = 0;
        boolean z11 = false;
        for (c0.c cVar : c0Var.U()) {
            if (cVar.V() == z.ENABLED) {
                c(cVar);
                if (cVar.T() == V) {
                    if (z11) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z11 = true;
                }
                if (cVar.S().S() != y.c.ASYMMETRIC_PUBLIC) {
                    z10 = false;
                }
                i10++;
            }
        }
        if (i10 != 0) {
            if (!z11 && !z10) {
                throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
            }
            return;
        }
        throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
    }
}
