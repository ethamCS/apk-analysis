package kotlinx.coroutines;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import tb.s;
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¨\u0006\n"}, d2 = {"Lkotlinx/coroutines/t2;", "Lkotlinx/coroutines/h2;", BuildConfig.FLAVOR, "cause", "Ltb/e0;", "G", "Lxb/d;", "continuation", "<init>", "(Lxb/d;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class t2 extends h2 {

    /* renamed from: y */
    private final xb.d<tb.e0> f15572y;

    /* JADX WARN: Multi-variable type inference failed */
    public t2(xb.d<? super tb.e0> dVar) {
        this.f15572y = dVar;
    }

    @Override // kotlinx.coroutines.f0
    public void G(Throwable th2) {
        xb.d<tb.e0> dVar = this.f15572y;
        s.a aVar = tb.s.Companion;
        dVar.y(tb.s.c(tb.e0.f22152a));
    }

    @Override // gc.l
    public /* bridge */ /* synthetic */ tb.e0 invoke(Throwable th2) {
        G(th2);
        return tb.e0.f22152a;
    }
}
