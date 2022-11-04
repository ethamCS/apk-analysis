package kotlinx.coroutines.scheduling;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b \u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fB\t\b\u0016¢\u0006\u0004\b\u000b\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\n\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/scheduling/j;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", BuildConfig.FLAVOR, "c", "J", "submissionTime", "Lkotlinx/coroutines/scheduling/k;", "d", "Lkotlinx/coroutines/scheduling/k;", "taskContext", "<init>", "(JLkotlinx/coroutines/scheduling/k;)V", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public abstract class j implements Runnable {

    /* renamed from: c */
    public long f15538c;

    /* renamed from: d */
    public k f15539d;

    public j() {
        this(0L, n.f15547f);
    }

    public j(long j10, k kVar) {
        this.f15538c = j10;
        this.f15539d = kVar;
    }
}
