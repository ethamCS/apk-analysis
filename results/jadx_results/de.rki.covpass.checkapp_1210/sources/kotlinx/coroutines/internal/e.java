package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlinx.coroutines.q0;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/internal/e;", "Lkotlinx/coroutines/q0;", BuildConfig.FLAVOR, "toString", "Lxb/g;", "coroutineContext", "Lxb/g;", "h", "()Lxb/g;", "context", "<init>", "(Lxb/g;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class e implements q0 {

    /* renamed from: c */
    private final xb.g f15414c;

    public e(xb.g gVar) {
        this.f15414c = gVar;
    }

    @Override // kotlinx.coroutines.q0
    public xb.g h() {
        return this.f15414c;
    }

    public String toString() {
        return "CoroutineScope(coroutineContext=" + h() + ')';
    }
}
