package kotlinx.coroutines.flow;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import tb.e0;
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u0000\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0014\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016J)\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u000e\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/flow/v;", "Lef/c;", "Lkotlinx/coroutines/flow/t;", "flow", BuildConfig.FLAVOR, "c", BuildConfig.FLAVOR, "Lxb/d;", "Ltb/e0;", "d", "(Lkotlinx/coroutines/flow/t;)[Lxb/d;", BuildConfig.FLAVOR, "a", "J", "index", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class v extends ef.c<t<?>> {

    /* renamed from: a */
    public long f15382a = -1;

    /* renamed from: b */
    public xb.d<? super e0> f15383b;

    /* renamed from: c */
    public boolean a(t<?> tVar) {
        if (this.f15382a >= 0) {
            return false;
        }
        this.f15382a = tVar.Z();
        return true;
    }

    /* renamed from: d */
    public xb.d<e0>[] b(t<?> tVar) {
        long j10 = this.f15382a;
        this.f15382a = -1L;
        this.f15383b = null;
        return tVar.Y(j10);
    }
}
