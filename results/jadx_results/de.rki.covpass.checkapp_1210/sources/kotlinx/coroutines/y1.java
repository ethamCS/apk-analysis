package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B!\u0012\u0018\u0010\t\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00040\u0007j\u0002`\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/y1;", "Lkotlinx/coroutines/c2;", BuildConfig.FLAVOR, "cause", "Ltb/e0;", "G", "(Ljava/lang/Throwable;)V", "Lkotlin/Function1;", "Lkotlinx/coroutines/CompletionHandler;", "handler", "<init>", "(Lgc/l;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
final class y1 extends c2 {
    private static final /* synthetic */ AtomicIntegerFieldUpdater U3 = AtomicIntegerFieldUpdater.newUpdater(y1.class, "_invoked");
    private volatile /* synthetic */ int _invoked = 0;

    /* renamed from: y */
    private final gc.l<Throwable, tb.e0> f15582y;

    /* JADX WARN: Multi-variable type inference failed */
    public y1(gc.l<? super Throwable, tb.e0> lVar) {
        this.f15582y = lVar;
    }

    @Override // kotlinx.coroutines.f0
    public void G(Throwable th2) {
        if (U3.compareAndSet(this, 0, 1)) {
            this.f15582y.invoke(th2);
        }
    }

    @Override // gc.l
    public /* bridge */ /* synthetic */ tb.e0 invoke(Throwable th2) {
        G(th2);
        return tb.e0.f22152a;
    }
}
