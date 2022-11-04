package androidx.work;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.impl.utils.futures.c;
import gc.p;
import kotlin.Metadata;
import kotlinx.coroutines.a2;
import kotlinx.coroutines.b0;
import kotlinx.coroutines.g1;
import kotlinx.coroutines.g2;
import kotlinx.coroutines.l0;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.r0;
import tb.e0;
import tb.t;
import xb.d;
import zb.f;
import zb.l;
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0013\u0010\u0005\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\b\u001a\u00020\u0007R\u001a\u0010\u000e\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R \u0010\u001c\u001a\u00020\u00158\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006#"}, d2 = {"Landroidx/work/CoroutineWorker;", "Landroidx/work/ListenableWorker;", "Lx5/a;", "Landroidx/work/ListenableWorker$a;", "n", "p", "(Lxb/d;)Ljava/lang/Object;", "Ltb/e0;", "l", "Lkotlinx/coroutines/b0;", "U3", "Lkotlinx/coroutines/b0;", "s", "()Lkotlinx/coroutines/b0;", "job", "Landroidx/work/impl/utils/futures/c;", "V3", "Landroidx/work/impl/utils/futures/c;", "r", "()Landroidx/work/impl/utils/futures/c;", "future", "Lkotlinx/coroutines/l0;", "W3", "Lkotlinx/coroutines/l0;", "q", "()Lkotlinx/coroutines/l0;", "getCoroutineContext$annotations", "()V", "coroutineContext", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime-ktx_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes.dex */
public abstract class CoroutineWorker extends ListenableWorker {
    private final b0 U3;
    private final c<ListenableWorker.a> V3;
    private final l0 W3 = g1.a();

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/e0;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes.dex */
    static final class a implements Runnable {
        a() {
            CoroutineWorker.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (CoroutineWorker.this.r().isCancelled()) {
                a2.a.a(CoroutineWorker.this.s(), null, 1, null);
            }
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/q0;", "Ltb/e0;", "u", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 1})
    @f(c = "androidx.work.CoroutineWorker$startWork$1", f = "CoroutineWorker.kt", l = {69}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class b extends l implements p<q0, d<? super e0>, Object> {

        /* renamed from: y */
        int f5279y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(d dVar) {
            super(2, dVar);
            CoroutineWorker.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            Object c10;
            c10 = yb.d.c();
            int i10 = this.f5279y;
            try {
                if (i10 == 0) {
                    t.b(obj);
                    CoroutineWorker coroutineWorker = CoroutineWorker.this;
                    this.f5279y = 1;
                    obj = coroutineWorker.p(this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    t.b(obj);
                }
                CoroutineWorker.this.r().p((ListenableWorker.a) obj);
            } catch (Throwable th2) {
                CoroutineWorker.this.r().q(th2);
            }
            return e0.f22152a;
        }

        @Override // zb.a
        public final d<e0> j(Object obj, d<?> dVar) {
            hc.t.e(dVar, "completion");
            return new b(dVar);
        }

        @Override // gc.p
        public final Object u(q0 q0Var, d<? super e0> dVar) {
            return ((b) j(q0Var, dVar)).B(e0.f22152a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        b0 b10;
        hc.t.e(context, "appContext");
        hc.t.e(workerParameters, "params");
        b10 = g2.b(null, 1, null);
        this.U3 = b10;
        c<ListenableWorker.a> t10 = c.t();
        hc.t.d(t10, "SettableFuture.create()");
        this.V3 = t10;
        a aVar = new a();
        e2.a g10 = g();
        hc.t.d(g10, "taskExecutor");
        t10.b(aVar, g10.c());
    }

    @Override // androidx.work.ListenableWorker
    public final void l() {
        super.l();
        this.V3.cancel(false);
    }

    @Override // androidx.work.ListenableWorker
    public final x5.a<ListenableWorker.a> n() {
        kotlinx.coroutines.l.d(r0.a(q().B(this.U3)), null, null, new b(null), 3, null);
        return this.V3;
    }

    public abstract Object p(d<? super ListenableWorker.a> dVar);

    public l0 q() {
        return this.W3;
    }

    public final c<ListenableWorker.a> r() {
        return this.V3;
    }

    public final b0 s() {
        return this.U3;
    }
}
