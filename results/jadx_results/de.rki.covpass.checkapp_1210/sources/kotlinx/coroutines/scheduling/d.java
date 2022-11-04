package kotlinx.coroutines.scheduling;

import java.util.concurrent.RejectedExecutionException;
import kotlin.Metadata;
import kotlinx.coroutines.l0;
import kotlinx.coroutines.q1;
import kotlinx.coroutines.v0;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\r\b\u0011\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u001a\u001a\u00020\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u000f\u0012\u0006\u0010 \u001a\u00020\u001d\u0012\b\b\u0002\u0010#\u001a\u00020\r¢\u0006\u0004\b'\u0010(B'\b\u0016\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u000f\u0012\b\b\u0002\u0010#\u001a\u00020\r¢\u0006\u0004\b'\u0010)J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u001c\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016J\u001c\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016J\b\u0010\f\u001a\u00020\tH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0010\u001a\u00020\u000fJ+\u0010\u0016\u001a\u00020\t2\n\u0010\b\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\u0005\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010&\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006*"}, d2 = {"Lkotlinx/coroutines/scheduling/d;", "Lkotlinx/coroutines/q1;", "Lkotlinx/coroutines/scheduling/a;", "i1", "Lxb/g;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Ltb/e0;", "u0", "O0", "close", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "parallelism", "Lkotlinx/coroutines/l0;", "h1", "Lkotlinx/coroutines/scheduling/k;", BuildConfig.FLAVOR, "tailDispatch", "j1", "(Ljava/lang/Runnable;Lkotlinx/coroutines/scheduling/k;Z)V", "x", "I", "corePoolSize", "y", "maxPoolSize", BuildConfig.FLAVOR, "U3", "J", "idleWorkerKeepAliveNs", "V3", "Ljava/lang/String;", "schedulerName", "W3", "Lkotlinx/coroutines/scheduling/a;", "coroutineScheduler", "<init>", "(IIJLjava/lang/String;)V", "(IILjava/lang/String;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public class d extends q1 {
    private final long U3;
    private final String V3;
    private a W3;

    /* renamed from: x */
    private final int f15531x;

    /* renamed from: y */
    private final int f15532y;

    public d(int i10, int i11, long j10, String str) {
        this.f15531x = i10;
        this.f15532y = i11;
        this.U3 = j10;
        this.V3 = str;
        this.W3 = i1();
    }

    public d(int i10, int i11, String str) {
        this(i10, i11, n.f15545d, str);
    }

    private final a i1() {
        return new a(this.f15531x, this.f15532y, this.U3, this.V3);
    }

    @Override // kotlinx.coroutines.l0
    public void O0(xb.g gVar, Runnable runnable) {
        try {
            a.j(this.W3, runnable, null, true, 2, null);
        } catch (RejectedExecutionException unused) {
            v0.W3.O0(gVar, runnable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.W3.close();
    }

    public final l0 h1(int i10) {
        if (i10 > 0) {
            return new f(this, i10, null, 1);
        }
        throw new IllegalArgumentException(("Expected positive parallelism level, but have " + i10).toString());
    }

    public final void j1(Runnable runnable, k kVar, boolean z10) {
        try {
            this.W3.i(runnable, kVar, z10);
        } catch (RejectedExecutionException unused) {
            v0.W3.z1(this.W3.f(runnable, kVar));
        }
    }

    @Override // kotlinx.coroutines.l0
    public String toString() {
        return super.toString() + "[scheduler = " + this.W3 + ']';
    }

    @Override // kotlinx.coroutines.l0
    public void u0(xb.g gVar, Runnable runnable) {
        try {
            a.j(this.W3, runnable, null, false, 6, null);
        } catch (RejectedExecutionException unused) {
            v0.W3.u0(gVar, runnable);
        }
    }
}
