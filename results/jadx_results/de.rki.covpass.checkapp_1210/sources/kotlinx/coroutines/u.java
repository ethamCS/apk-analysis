package kotlinx.coroutines;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002R\u0018\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/u;", "Lkotlinx/coroutines/c2;", BuildConfig.FLAVOR, "cause", "Ltb/e0;", "G", "Lkotlinx/coroutines/q;", "y", "Lkotlinx/coroutines/q;", "child", "<init>", "(Lkotlinx/coroutines/q;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class u extends c2 {

    /* renamed from: y */
    public final q<?> f15573y;

    public u(q<?> qVar) {
        this.f15573y = qVar;
    }

    @Override // kotlinx.coroutines.f0
    public void G(Throwable th2) {
        q<?> qVar = this.f15573y;
        qVar.G(qVar.r(H()));
    }

    @Override // gc.l
    public /* bridge */ /* synthetic */ tb.e0 invoke(Throwable th2) {
        G(th2);
        return tb.e0.f22152a;
    }
}
