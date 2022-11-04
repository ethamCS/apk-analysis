package kotlinx.coroutines;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lkotlinx/coroutines/h2;", "Lkotlinx/coroutines/f0;", "Lkotlinx/coroutines/h1;", "Lkotlinx/coroutines/v1;", "Ltb/e0;", "g", BuildConfig.FLAVOR, "toString", "Lkotlinx/coroutines/i2;", "x", "Lkotlinx/coroutines/i2;", "H", "()Lkotlinx/coroutines/i2;", "I", "(Lkotlinx/coroutines/i2;)V", "job", BuildConfig.FLAVOR, "j", "()Z", "isActive", "Lkotlinx/coroutines/n2;", "k", "()Lkotlinx/coroutines/n2;", "list", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public abstract class h2 extends f0 implements h1, v1 {

    /* renamed from: x */
    public i2 f15396x;

    public final i2 H() {
        i2 i2Var = this.f15396x;
        if (i2Var != null) {
            return i2Var;
        }
        hc.t.s("job");
        return null;
    }

    public final void I(i2 i2Var) {
        this.f15396x = i2Var;
    }

    @Override // kotlinx.coroutines.h1
    public void g() {
        H().P0(this);
    }

    @Override // kotlinx.coroutines.v1
    public boolean j() {
        return true;
    }

    @Override // kotlinx.coroutines.v1
    public n2 k() {
        return null;
    }

    @Override // kotlinx.coroutines.internal.o
    public String toString() {
        return u0.a(this) + '@' + u0.b(this) + "[job@" + u0.b(H()) + ']';
    }
}
