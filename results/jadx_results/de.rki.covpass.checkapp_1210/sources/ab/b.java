package ab;

import hc.t;
import java.io.Closeable;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlinx.coroutines.l0;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\f\u0010\rJ#\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\nJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0017"}, d2 = {"Lab/b;", "Lkotlinx/coroutines/l0;", "Ljava/io/Closeable;", "Lxb/g;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Ltb/e0;", "u0", "(Lxb/g;Ljava/lang/Runnable;)V", BuildConfig.FLAVOR, "R0", "(Lxb/g;)Z", "O0", "close", "()V", BuildConfig.FLAVOR, "threadCount", BuildConfig.FLAVOR, "dispatcherName", "<init>", "(ILjava/lang/String;)V", "ktor-client-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class b extends l0 implements Closeable {

    /* renamed from: y */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f237y = AtomicIntegerFieldUpdater.newUpdater(b.class, "_closed");
    private volatile /* synthetic */ int _closed = 0;

    /* renamed from: q */
    private final kotlinx.coroutines.scheduling.d f238q;

    /* renamed from: x */
    private final l0 f239x;

    public b(int i10, String str) {
        t.e(str, "dispatcherName");
        kotlinx.coroutines.scheduling.d dVar = new kotlinx.coroutines.scheduling.d(i10, i10, str);
        this.f238q = dVar;
        this.f239x = dVar.h1(i10);
    }

    @Override // kotlinx.coroutines.l0
    public void O0(xb.g gVar, Runnable runnable) {
        t.e(gVar, "context");
        t.e(runnable, "block");
        this.f239x.O0(gVar, runnable);
    }

    @Override // kotlinx.coroutines.l0
    public boolean R0(xb.g gVar) {
        t.e(gVar, "context");
        return this.f239x.R0(gVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!f237y.compareAndSet(this, 0, 1)) {
            return;
        }
        this.f238q.close();
    }

    @Override // kotlinx.coroutines.l0
    public void u0(xb.g gVar, Runnable runnable) {
        t.e(gVar, "context");
        t.e(runnable, "block");
        this.f239x.u0(gVar, runnable);
    }
}
