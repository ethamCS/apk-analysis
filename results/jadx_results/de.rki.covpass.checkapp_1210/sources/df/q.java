package df;

import kotlin.Metadata;
import kotlinx.coroutines.internal.o;
import kotlinx.coroutines.u0;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u000e\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0011\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J!\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0014\u0010\u0010\u001a\u00020\b2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016R\u0011\u0010\u0016\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0018\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001a¨\u0006!"}, d2 = {"Ldf/q;", "E", "Ldf/d0;", "Ldf/b0;", "Lkotlinx/coroutines/internal/o$b;", "otherOp", "Lkotlinx/coroutines/internal/b0;", "J", "Ltb/e0;", "G", "value", "e", "(Ljava/lang/Object;Lkotlinx/coroutines/internal/o$b;)Lkotlinx/coroutines/internal/b0;", "b", "(Ljava/lang/Object;)V", "closed", "I", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "P", "()Ljava/lang/Throwable;", "sendException", "O", "receiveException", "L", "()Ldf/q;", "offerResult", "N", "pollResult", "closeCause", "<init>", "(Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class q<E> extends d0 implements b0<E> {

    /* renamed from: x */
    public final Throwable f8931x;

    public q(Throwable th2) {
        this.f8931x = th2;
    }

    @Override // df.d0
    public void G() {
    }

    @Override // df.d0
    public void I(q<?> qVar) {
    }

    @Override // df.d0
    public kotlinx.coroutines.internal.b0 J(o.b bVar) {
        return kotlinx.coroutines.r.f15503a;
    }

    /* renamed from: L */
    public q<E> c() {
        return this;
    }

    /* renamed from: N */
    public q<E> H() {
        return this;
    }

    public final Throwable O() {
        Throwable th2 = this.f8931x;
        return th2 == null ? new r("Channel was closed") : th2;
    }

    public final Throwable P() {
        Throwable th2 = this.f8931x;
        return th2 == null ? new s("Channel was closed") : th2;
    }

    @Override // df.b0
    public void b(E e10) {
    }

    @Override // df.b0
    public kotlinx.coroutines.internal.b0 e(E e10, o.b bVar) {
        return kotlinx.coroutines.r.f15503a;
    }

    @Override // kotlinx.coroutines.internal.o
    public String toString() {
        return "Closed@" + u0.b(this) + '[' + this.f8931x + ']';
    }
}
