package kotlinx.coroutines.scheduling;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlinx.coroutines.q1;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B)\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010(\u001a\u00020\u001e¢\u0006\u0004\b-\u0010.J#\u0010\n\u001a\u00020\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\r\u001a\u00020\t2\n\u0010\f\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0019\u0010\u0010R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u0004\u0018\u00010\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010(\u001a\u00020\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b&\u0010'R\u001e\u0010,\u001a\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006/"}, d2 = {"Lkotlinx/coroutines/scheduling/f;", "Lkotlinx/coroutines/q1;", "Lkotlinx/coroutines/scheduling/k;", "Ljava/util/concurrent/Executor;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", BuildConfig.FLAVOR, "tailDispatch", "Ltb/e0;", "h1", "(Ljava/lang/Runnable;Z)V", "command", "execute", "(Ljava/lang/Runnable;)V", "close", "()V", "Lxb/g;", "context", "u0", "(Lxb/g;Ljava/lang/Runnable;)V", "O0", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "h", "Lkotlinx/coroutines/scheduling/d;", "x", "Lkotlinx/coroutines/scheduling/d;", "dispatcher", BuildConfig.FLAVOR, "y", "I", "parallelism", "U3", "Ljava/lang/String;", "name", "V3", "f0", "()I", "taskMode", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "W3", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "queue", "<init>", "(Lkotlinx/coroutines/scheduling/d;ILjava/lang/String;I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class f extends q1 implements k, Executor {
    private static final /* synthetic */ AtomicIntegerFieldUpdater X3 = AtomicIntegerFieldUpdater.newUpdater(f.class, "inFlightTasks");
    private final String U3;
    private final int V3;
    private final ConcurrentLinkedQueue<Runnable> W3 = new ConcurrentLinkedQueue<>();
    private volatile /* synthetic */ int inFlightTasks = 0;

    /* renamed from: x */
    private final d f15533x;

    /* renamed from: y */
    private final int f15534y;

    public f(d dVar, int i10, String str, int i11) {
        this.f15533x = dVar;
        this.f15534y = i10;
        this.U3 = str;
        this.V3 = i11;
    }

    private final void h1(Runnable runnable, boolean z10) {
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = X3;
            if (atomicIntegerFieldUpdater.incrementAndGet(this) <= this.f15534y) {
                this.f15533x.j1(runnable, this, z10);
                return;
            }
            this.W3.add(runnable);
            if (atomicIntegerFieldUpdater.decrementAndGet(this) >= this.f15534y) {
                return;
            }
            runnable = this.W3.poll();
        } while (runnable != null);
    }

    @Override // kotlinx.coroutines.l0
    public void O0(xb.g gVar, Runnable runnable) {
        h1(runnable, true);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Close cannot be invoked on LimitingBlockingDispatcher".toString());
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        h1(runnable, false);
    }

    @Override // kotlinx.coroutines.scheduling.k
    public int f0() {
        return this.V3;
    }

    @Override // kotlinx.coroutines.scheduling.k
    public void h() {
        Runnable poll = this.W3.poll();
        if (poll != null) {
            this.f15533x.j1(poll, this, true);
            return;
        }
        X3.decrementAndGet(this);
        Runnable poll2 = this.W3.poll();
        if (poll2 == null) {
            return;
        }
        h1(poll2, true);
    }

    @Override // kotlinx.coroutines.l0
    public String toString() {
        String str = this.U3;
        if (str == null) {
            return super.toString() + "[dispatcher = " + this.f15533x + ']';
        }
        return str;
    }

    @Override // kotlinx.coroutines.l0
    public void u0(xb.g gVar, Runnable runnable) {
        h1(runnable, false);
    }
}
