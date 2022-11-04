package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u0012\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000\u001a\u001c\u0010\t\u001a\u00020\b*\u00020\u00042\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u001a\n\u0010\n\u001a\u00020\b*\u00020\u0000\u001a\n\u0010\u000b\u001a\u00020\b*\u00020\u0004\u001a\u001e\u0010\u000f\u001a\u00020\b*\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u000e\"\u0015\u0010\u0013\u001a\u00020\u0010*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/a2;", "parent", "Lkotlinx/coroutines/b0;", "a", "Lxb/g;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "Ltb/e0;", "d", "f", "g", BuildConfig.FLAVOR, "message", BuildConfig.FLAVOR, "c", BuildConfig.FLAVOR, "h", "(Lxb/g;)Z", "isActive", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/JobKt")
/* loaded from: classes3.dex */
public final /* synthetic */ class g2 {
    public static final b0 a(a2 a2Var) {
        return new d2(a2Var);
    }

    public static /* synthetic */ b0 b(a2 a2Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            a2Var = null;
        }
        return e2.a(a2Var);
    }

    public static final void c(a2 a2Var, String str, Throwable th2) {
        a2Var.r(p1.a(str, th2));
    }

    public static final void d(xb.g gVar, CancellationException cancellationException) {
        a2 a2Var = (a2) gVar.i(a2.W0);
        if (a2Var != null) {
            a2Var.r(cancellationException);
        }
    }

    public static /* synthetic */ void e(xb.g gVar, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        e2.d(gVar, cancellationException);
    }

    public static final void f(a2 a2Var) {
        if (a2Var.j()) {
            return;
        }
        throw a2Var.w0();
    }

    public static final void g(xb.g gVar) {
        a2 a2Var = (a2) gVar.i(a2.W0);
        if (a2Var != null) {
            e2.g(a2Var);
        }
    }

    public static final boolean h(xb.g gVar) {
        a2 a2Var = (a2) gVar.i(a2.W0);
        return a2Var != null && a2Var.j();
    }
}
