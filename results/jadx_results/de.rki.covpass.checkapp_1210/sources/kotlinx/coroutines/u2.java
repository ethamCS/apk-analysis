package kotlinx.coroutines;

import kotlin.Metadata;
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001d\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\t¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0004\u001a\u00020\u0003H\u0016R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lkotlinx/coroutines/u2;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "Ltb/e0;", "run", "Lkotlinx/coroutines/l0;", "c", "Lkotlinx/coroutines/l0;", "dispatcher", "Lkotlinx/coroutines/p;", "d", "Lkotlinx/coroutines/p;", "continuation", "<init>", "(Lkotlinx/coroutines/l0;Lkotlinx/coroutines/p;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
final class u2 implements Runnable {

    /* renamed from: c */
    private final l0 f15575c;

    /* renamed from: d */
    private final p<tb.e0> f15576d;

    /* JADX WARN: Multi-variable type inference failed */
    public u2(l0 l0Var, p<? super tb.e0> pVar) {
        this.f15575c = l0Var;
        this.f15576d = pVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f15576d.v(this.f15575c, tb.e0.f22152a);
    }
}
