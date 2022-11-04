package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import xb.g;
@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\bf\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fJ\f\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H'J\b\u0010\u0006\u001a\u00020\u0005H&J\u001a\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003H&J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH'J\u0013\u0010\u000e\u001a\u00020\bH¦@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\"\u0010\u0015\u001a\u00020\u00142\u0018\u0010\u0013\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\b0\u0010j\u0002`\u0012H&J6\u0010\u0018\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00052\u0018\u0010\u0013\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\b0\u0010j\u0002`\u0012H'R\u0014\u0010\u001b\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"Lkotlinx/coroutines/a2;", "Lxb/g$b;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "w0", BuildConfig.FLAVOR, "start", "cause", "Ltb/e0;", "r", "Lkotlinx/coroutines/x;", "child", "Lkotlinx/coroutines/v;", "e1", "V0", "(Lxb/d;)Ljava/lang/Object;", "Lkotlin/Function1;", BuildConfig.FLAVOR, "Lkotlinx/coroutines/CompletionHandler;", "handler", "Lkotlinx/coroutines/h1;", "D0", "onCancelling", "invokeImmediately", "K0", "j", "()Z", "isActive", "p", "isCompleted", "W0", "b", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public interface a2 extends g.b {
    public static final b W0 = b.f15311c;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public static /* synthetic */ void a(a2 a2Var, CancellationException cancellationException, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    cancellationException = null;
                }
                a2Var.r(cancellationException);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        public static <R> R b(a2 a2Var, R r10, gc.p<? super R, ? super g.b, ? extends R> pVar) {
            return (R) g.b.a.a(a2Var, r10, pVar);
        }

        public static <E extends g.b> E c(a2 a2Var, g.c<E> cVar) {
            return (E) g.b.a.b(a2Var, cVar);
        }

        public static /* synthetic */ h1 d(a2 a2Var, boolean z10, boolean z11, gc.l lVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    z10 = false;
                }
                if ((i10 & 2) != 0) {
                    z11 = true;
                }
                return a2Var.K0(z10, z11, lVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
        }

        public static xb.g e(a2 a2Var, g.c<?> cVar) {
            return g.b.a.c(a2Var, cVar);
        }

        public static xb.g f(a2 a2Var, xb.g gVar) {
            return g.b.a.d(a2Var, gVar);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/a2$b;", "Lxb/g$c;", "Lkotlinx/coroutines/a2;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class b implements g.c<a2> {

        /* renamed from: c */
        static final /* synthetic */ b f15311c = new b();

        private b() {
        }
    }

    h1 D0(gc.l<? super Throwable, tb.e0> lVar);

    h1 K0(boolean z10, boolean z11, gc.l<? super Throwable, tb.e0> lVar);

    Object V0(xb.d<? super tb.e0> dVar);

    v e1(x xVar);

    boolean j();

    boolean p();

    void r(CancellationException cancellationException);

    boolean start();

    CancellationException w0();
}
