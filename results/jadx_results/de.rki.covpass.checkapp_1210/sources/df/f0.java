package df;

import kotlin.Metadata;
import kotlinx.coroutines.internal.o;
import kotlinx.coroutines.u0;
import org.conscrypt.BuildConfig;
import tb.s;
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u000e\u001a\u00028\u0000\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0014\u0010\u000b\u001a\u00020\u00072\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u001a\u0010\u000e\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Ldf/f0;", "E", "Ldf/d0;", "Lkotlinx/coroutines/internal/o$b;", "otherOp", "Lkotlinx/coroutines/internal/b0;", "J", "Ltb/e0;", "G", "Ldf/q;", "closed", "I", BuildConfig.FLAVOR, "toString", "pollResult", "Ljava/lang/Object;", "H", "()Ljava/lang/Object;", "Lkotlinx/coroutines/p;", "cont", "<init>", "(Ljava/lang/Object;Lkotlinx/coroutines/p;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public class f0<E> extends d0 {

    /* renamed from: x */
    private final E f8914x;

    /* renamed from: y */
    public final kotlinx.coroutines.p<tb.e0> f8915y;

    /* JADX WARN: Multi-variable type inference failed */
    public f0(E e10, kotlinx.coroutines.p<? super tb.e0> pVar) {
        this.f8914x = e10;
        this.f8915y = pVar;
    }

    @Override // df.d0
    public void G() {
        this.f8915y.c0(kotlinx.coroutines.r.f15503a);
    }

    @Override // df.d0
    public E H() {
        return this.f8914x;
    }

    @Override // df.d0
    public void I(q<?> qVar) {
        kotlinx.coroutines.p<tb.e0> pVar = this.f8915y;
        s.a aVar = tb.s.Companion;
        pVar.y(tb.s.c(tb.t.a(qVar.P())));
    }

    @Override // df.d0
    public kotlinx.coroutines.internal.b0 J(o.b bVar) {
        if (this.f8915y.t(tb.e0.f22152a, null) == null) {
            return null;
        }
        return kotlinx.coroutines.r.f15503a;
    }

    @Override // kotlinx.coroutines.internal.o
    public String toString() {
        return u0.a(this) + '@' + u0.b(this) + '(' + H() + ')';
    }
}
