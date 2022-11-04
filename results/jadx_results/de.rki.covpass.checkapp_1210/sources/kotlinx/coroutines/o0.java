package kotlinx.coroutines;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u001a\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0000¨\u0006\t"}, d2 = {"Lxb/g;", "context", BuildConfig.FLAVOR, "exception", "Ltb/e0;", "a", "originalException", "thrownException", "b", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class o0 {
    public static final void a(xb.g gVar, Throwable th2) {
        try {
            m0 m0Var = (m0) gVar.i(m0.V0);
            if (m0Var != null) {
                m0Var.j0(gVar, th2);
            } else {
                n0.a(gVar, th2);
            }
        } catch (Throwable th3) {
            n0.a(gVar, b(th2, th3));
        }
    }

    public static final Throwable b(Throwable th2, Throwable th3) {
        if (th2 == th3) {
            return th2;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
        tb.f.a(runtimeException, th2);
        return runtimeException;
    }
}
