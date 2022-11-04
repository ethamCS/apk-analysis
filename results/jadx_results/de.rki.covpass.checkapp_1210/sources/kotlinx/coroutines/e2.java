package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import kotlin.Metadata;
@Metadata(bv = {}, d1 = {"kotlinx/coroutines/f2", "kotlinx/coroutines/g2"}, d2 = {}, k = 4, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class e2 {
    public static final b0 a(a2 a2Var) {
        return g2.a(a2Var);
    }

    public static final void c(a2 a2Var, String str, Throwable th2) {
        g2.c(a2Var, str, th2);
    }

    public static final void d(xb.g gVar, CancellationException cancellationException) {
        g2.d(gVar, cancellationException);
    }

    public static final void f(p<?> pVar, Future<?> future) {
        f2.a(pVar, future);
    }

    public static final void g(a2 a2Var) {
        g2.f(a2Var);
    }

    public static final void h(xb.g gVar) {
        g2.g(gVar);
    }

    public static final boolean i(xb.g gVar) {
        return g2.h(gVar);
    }
}
