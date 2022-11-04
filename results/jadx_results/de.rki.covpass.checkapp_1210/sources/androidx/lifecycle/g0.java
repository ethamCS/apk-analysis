package androidx.lifecycle;

import kotlin.Metadata;
import kotlinx.coroutines.g1;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001c\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016R\u0014\u0010\u000e\u001a\u00020\u000b8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Landroidx/lifecycle/g0;", "Lkotlinx/coroutines/l0;", "Lxb/g;", "context", BuildConfig.FLAVOR, "R0", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Ltb/e0;", "u0", "Landroidx/lifecycle/h;", "q", "Landroidx/lifecycle/h;", "dispatchQueue", "<init>", "()V", "lifecycle-runtime-ktx_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class g0 extends kotlinx.coroutines.l0 {

    /* renamed from: q */
    public final h f4314q = new h();

    @Override // kotlinx.coroutines.l0
    public boolean R0(xb.g gVar) {
        hc.t.e(gVar, "context");
        if (g1.c().h1().R0(gVar)) {
            return true;
        }
        return !this.f4314q.b();
    }

    @Override // kotlinx.coroutines.l0
    public void u0(xb.g gVar, Runnable runnable) {
        hc.t.e(gVar, "context");
        hc.t.e(runnable, "block");
        this.f4314q.c(gVar, runnable);
    }
}
