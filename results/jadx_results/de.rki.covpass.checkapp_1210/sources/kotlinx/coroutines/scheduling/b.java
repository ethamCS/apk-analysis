package kotlinx.coroutines.scheduling;

import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlinx.coroutines.internal.c0;
import kotlinx.coroutines.internal.e0;
import kotlinx.coroutines.l0;
import kotlinx.coroutines.q1;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001c\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\n\u0010\n\u001a\u00060\u0003j\u0002`\tH\u0016J\u001c\u0010\f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\n\u0010\n\u001a\u00060\u0003j\u0002`\tH\u0017J\b\u0010\r\u001a\u00020\u0005H\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lkotlinx/coroutines/scheduling/b;", "Lkotlinx/coroutines/q1;", "Ljava/util/concurrent/Executor;", "Ljava/lang/Runnable;", "command", "Ltb/e0;", "execute", "Lxb/g;", "context", "Lkotlinx/coroutines/Runnable;", "block", "u0", "O0", "close", BuildConfig.FLAVOR, "toString", "Lkotlinx/coroutines/l0;", "y", "Lkotlinx/coroutines/l0;", "default", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class b extends q1 implements Executor {

    /* renamed from: x */
    public static final b f15529x = new b();

    /* renamed from: y */
    private static final l0 f15530y;

    static {
        int b10;
        int d10;
        o oVar = o.f15549q;
        b10 = nc.m.b(64, c0.a());
        d10 = e0.d("kotlinx.coroutines.io.parallelism", b10, 0, 0, 12, null);
        f15530y = oVar.c1(d10);
    }

    private b() {
    }

    @Override // kotlinx.coroutines.l0
    public void O0(xb.g gVar, Runnable runnable) {
        f15530y.O0(gVar, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        u0(xb.h.f25516c, runnable);
    }

    @Override // kotlinx.coroutines.l0
    public String toString() {
        return "Dispatchers.IO";
    }

    @Override // kotlinx.coroutines.l0
    public void u0(xb.g gVar, Runnable runnable) {
        f15530y.u0(gVar, runnable);
    }
}
