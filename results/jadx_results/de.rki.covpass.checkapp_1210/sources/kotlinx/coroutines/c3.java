package kotlinx.coroutines;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001c\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016¨\u0006\u000f"}, d2 = {"Lkotlinx/coroutines/c3;", "Lkotlinx/coroutines/l0;", "Lxb/g;", "context", BuildConfig.FLAVOR, "R0", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Ltb/e0;", "u0", BuildConfig.FLAVOR, "toString", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class c3 extends l0 {

    /* renamed from: q */
    public static final c3 f15322q = new c3();

    private c3() {
    }

    @Override // kotlinx.coroutines.l0
    public boolean R0(xb.g gVar) {
        return false;
    }

    @Override // kotlinx.coroutines.l0
    public String toString() {
        return "Dispatchers.Unconfined";
    }

    @Override // kotlinx.coroutines.l0
    public void u0(xb.g gVar, Runnable runnable) {
        f3 f3Var = (f3) gVar.i(f3.f15338q);
        if (f3Var != null) {
            f3Var.f15339d = true;
            return;
        }
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }
}
