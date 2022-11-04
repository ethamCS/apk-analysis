package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u001a\u0006\u0010\u0001\u001a\u00020\u0000\u001aJ\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003H\u0086@ø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t\u001a\u001c\u0010\u0010\u001a\u00020\u000f*\u00020\u00002\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r\u001a\u001e\u0010\u0014\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lkotlinx/coroutines/q0;", "b", "R", "Lkotlin/Function2;", "Lxb/d;", BuildConfig.FLAVOR, "block", "f", "(Lgc/p;Lxb/d;)Ljava/lang/Object;", "Lxb/g;", "context", "a", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "Ltb/e0;", "d", BuildConfig.FLAVOR, "message", BuildConfig.FLAVOR, "c", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class r0 {
    public static final q0 a(xb.g gVar) {
        b0 b10;
        if (gVar.i(a2.W0) == null) {
            b10 = g2.b(null, 1, null);
            gVar = gVar.B(b10);
        }
        return new kotlinx.coroutines.internal.e(gVar);
    }

    public static final q0 b() {
        return new kotlinx.coroutines.internal.e(y2.b(null, 1, null).B(g1.c()));
    }

    public static final void c(q0 q0Var, String str, Throwable th2) {
        d(q0Var, p1.a(str, th2));
    }

    public static final void d(q0 q0Var, CancellationException cancellationException) {
        a2 a2Var = (a2) q0Var.h().i(a2.W0);
        if (a2Var != null) {
            a2Var.r(cancellationException);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + q0Var).toString());
    }

    public static /* synthetic */ void e(q0 q0Var, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        d(q0Var, cancellationException);
    }

    public static final <R> Object f(gc.p<? super q0, ? super xb.d<? super R>, ? extends Object> pVar, xb.d<? super R> dVar) {
        Object c10;
        kotlinx.coroutines.internal.z zVar = new kotlinx.coroutines.internal.z(dVar.b(), dVar);
        Object b10 = ff.b.b(zVar, zVar, pVar);
        c10 = yb.d.c();
        if (b10 == c10) {
            zb.h.c(dVar);
        }
        return b10;
    }
}
