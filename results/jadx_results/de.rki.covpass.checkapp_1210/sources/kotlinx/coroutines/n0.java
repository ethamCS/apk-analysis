package kotlinx.coroutines;

import java.util.List;
import java.util.ServiceLoader;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import tb.s;
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\"\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\b¨\u0006\n"}, d2 = {"Lxb/g;", "context", BuildConfig.FLAVOR, "exception", "Ltb/e0;", "a", BuildConfig.FLAVOR, "Lkotlinx/coroutines/m0;", "Ljava/util/List;", "handlers", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class n0 {

    /* renamed from: a */
    private static final List<m0> f15493a;

    static {
        af.h c10;
        List<m0> F;
        c10 = af.n.c(ServiceLoader.load(m0.class, m0.class.getClassLoader()).iterator());
        F = af.p.F(c10);
        f15493a = F;
    }

    public static final void a(xb.g gVar, Throwable th2) {
        for (m0 m0Var : f15493a) {
            try {
                m0Var.j0(gVar, th2);
            } catch (Throwable th3) {
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, o0.b(th2, th3));
            }
        }
        Thread currentThread2 = Thread.currentThread();
        try {
            s.a aVar = tb.s.Companion;
            tb.f.a(th2, new b1(gVar));
            tb.s.c(tb.e0.f22152a);
        } catch (Throwable th4) {
            s.a aVar2 = tb.s.Companion;
            tb.s.c(tb.t.a(th4));
        }
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th2);
    }
}
