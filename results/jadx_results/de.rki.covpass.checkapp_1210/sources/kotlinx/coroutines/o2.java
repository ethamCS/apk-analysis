package kotlinx.coroutines;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/o2;", "Lkotlinx/coroutines/h1;", "Lkotlinx/coroutines/v;", "Ltb/e0;", "g", BuildConfig.FLAVOR, "cause", BuildConfig.FLAVOR, "h", BuildConfig.FLAVOR, "toString", "Lkotlinx/coroutines/a2;", "getParent", "()Lkotlinx/coroutines/a2;", "parent", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class o2 implements h1, v {

    /* renamed from: c */
    public static final o2 f15496c = new o2();

    private o2() {
    }

    @Override // kotlinx.coroutines.h1
    public void g() {
    }

    @Override // kotlinx.coroutines.v
    public a2 getParent() {
        return null;
    }

    @Override // kotlinx.coroutines.v
    public boolean h(Throwable th2) {
        return false;
    }

    public String toString() {
        return "NonDisposableHandle";
    }
}
