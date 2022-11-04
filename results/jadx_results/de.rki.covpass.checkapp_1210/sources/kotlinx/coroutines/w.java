package kotlinx.coroutines;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u0014\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/w;", "Lkotlinx/coroutines/c2;", "Lkotlinx/coroutines/v;", BuildConfig.FLAVOR, "cause", "Ltb/e0;", "G", BuildConfig.FLAVOR, "h", "Lkotlinx/coroutines/x;", "y", "Lkotlinx/coroutines/x;", "childJob", "Lkotlinx/coroutines/a2;", "getParent", "()Lkotlinx/coroutines/a2;", "parent", "<init>", "(Lkotlinx/coroutines/x;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class w extends c2 implements v {

    /* renamed from: y */
    public final x f15577y;

    public w(x xVar) {
        this.f15577y = xVar;
    }

    @Override // kotlinx.coroutines.f0
    public void G(Throwable th2) {
        this.f15577y.M0(H());
    }

    @Override // kotlinx.coroutines.v
    public a2 getParent() {
        return H();
    }

    @Override // kotlinx.coroutines.v
    public boolean h(Throwable th2) {
        return H().P(th2);
    }

    @Override // gc.l
    public /* bridge */ /* synthetic */ tb.e0 invoke(Throwable th2) {
        G(th2);
        return tb.e0.f22152a;
    }
}
