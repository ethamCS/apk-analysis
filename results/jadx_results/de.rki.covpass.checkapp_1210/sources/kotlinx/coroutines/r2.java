package kotlinx.coroutines;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/r2;", "Lkotlinx/coroutines/g;", BuildConfig.FLAVOR, "cause", "Ltb/e0;", "a", BuildConfig.FLAVOR, "toString", "Lkotlinx/coroutines/internal/o;", "c", "Lkotlinx/coroutines/internal/o;", "node", "<init>", "(Lkotlinx/coroutines/internal/o;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
final class r2 extends g {

    /* renamed from: c */
    private final kotlinx.coroutines.internal.o f15505c;

    public r2(kotlinx.coroutines.internal.o oVar) {
        this.f15505c = oVar;
    }

    @Override // kotlinx.coroutines.o
    public void a(Throwable th2) {
        this.f15505c.B();
    }

    @Override // gc.l
    public /* bridge */ /* synthetic */ tb.e0 invoke(Throwable th2) {
        a(th2);
        return tb.e0.f22152a;
    }

    public String toString() {
        return "RemoveOnCancel[" + this.f15505c + ']';
    }
}
