package kotlinx.coroutines;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016R\u0014\u0010\u0012\u001a\u00020\n8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lkotlinx/coroutines/z;", "T", "Lkotlinx/coroutines/i2;", "Lkotlinx/coroutines/y;", BuildConfig.FLAVOR, "z", "()Ljava/lang/Object;", "G", "(Lxb/d;)Ljava/lang/Object;", "value", BuildConfig.FLAVOR, "h0", "(Ljava/lang/Object;)Z", BuildConfig.FLAVOR, "exception", "n", "d0", "()Z", "onCancelComplete", "Lkotlinx/coroutines/a2;", "parent", "<init>", "(Lkotlinx/coroutines/a2;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
final class z<T> extends i2 implements y<T> {
    public z(a2 a2Var) {
        super(true);
        n0(a2Var);
    }

    @Override // kotlinx.coroutines.x0
    public Object G(xb.d<? super T> dVar) {
        Object D = D(dVar);
        yb.d.c();
        return D;
    }

    @Override // kotlinx.coroutines.i2
    public boolean d0() {
        return true;
    }

    @Override // kotlinx.coroutines.y
    public boolean h0(T t10) {
        return v0(t10);
    }

    @Override // kotlinx.coroutines.y
    public boolean n(Throwable th2) {
        return v0(new d0(th2, false, 2, null));
    }

    @Override // kotlinx.coroutines.x0
    public T z() {
        return (T) X();
    }
}
