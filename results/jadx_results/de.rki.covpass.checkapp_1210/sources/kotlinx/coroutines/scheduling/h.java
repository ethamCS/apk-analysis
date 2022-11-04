package kotlinx.coroutines.scheduling;

import kotlin.Metadata;
import kotlinx.coroutines.q1;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0010\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001b¢\u0006\u0004\b\"\u0010#J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u001c\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016J\u001c\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016J+\u0010\u000f\u001a\u00020\t2\n\u0010\b\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lkotlinx/coroutines/scheduling/h;", "Lkotlinx/coroutines/q1;", "Lkotlinx/coroutines/scheduling/a;", "h1", "Lxb/g;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Ltb/e0;", "u0", "O0", "Lkotlinx/coroutines/scheduling/k;", BuildConfig.FLAVOR, "tailDispatch", "i1", "(Ljava/lang/Runnable;Lkotlinx/coroutines/scheduling/k;Z)V", BuildConfig.FLAVOR, "x", "I", "corePoolSize", "y", "maxPoolSize", BuildConfig.FLAVOR, "U3", "J", "idleWorkerKeepAliveNs", BuildConfig.FLAVOR, "V3", "Ljava/lang/String;", "schedulerName", "W3", "Lkotlinx/coroutines/scheduling/a;", "coroutineScheduler", "<init>", "(IIJLjava/lang/String;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public class h extends q1 {
    private final long U3;
    private final String V3;
    private a W3 = h1();

    /* renamed from: x */
    private final int f15536x;

    /* renamed from: y */
    private final int f15537y;

    public h(int i10, int i11, long j10, String str) {
        this.f15536x = i10;
        this.f15537y = i11;
        this.U3 = j10;
        this.V3 = str;
    }

    private final a h1() {
        return new a(this.f15536x, this.f15537y, this.U3, this.V3);
    }

    @Override // kotlinx.coroutines.l0
    public void O0(xb.g gVar, Runnable runnable) {
        a.j(this.W3, runnable, null, true, 2, null);
    }

    public final void i1(Runnable runnable, k kVar, boolean z10) {
        this.W3.i(runnable, kVar, z10);
    }

    @Override // kotlinx.coroutines.l0
    public void u0(xb.g gVar, Runnable runnable) {
        a.j(this.W3, runnable, null, false, 6, null);
    }
}
