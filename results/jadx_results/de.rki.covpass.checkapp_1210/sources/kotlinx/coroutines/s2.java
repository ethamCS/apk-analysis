package kotlinx.coroutines;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import tb.s;
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0015\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0002R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/s2;", "T", "Lkotlinx/coroutines/h2;", BuildConfig.FLAVOR, "cause", "Ltb/e0;", "G", "Lkotlinx/coroutines/q;", "y", "Lkotlinx/coroutines/q;", "continuation", "<init>", "(Lkotlinx/coroutines/q;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class s2<T> extends h2 {

    /* renamed from: y */
    private final q<T> f15512y;

    /* JADX WARN: Multi-variable type inference failed */
    public s2(q<? super T> qVar) {
        this.f15512y = qVar;
    }

    @Override // kotlinx.coroutines.f0
    public void G(Throwable th2) {
        Object obj;
        q<T> qVar;
        Object k02 = H().k0();
        if (k02 instanceof d0) {
            qVar = this.f15512y;
            s.a aVar = tb.s.Companion;
            obj = tb.t.a(((d0) k02).f15325a);
        } else {
            qVar = this.f15512y;
            s.a aVar2 = tb.s.Companion;
            obj = j2.h(k02);
        }
        qVar.y(tb.s.c(obj));
    }

    @Override // gc.l
    public /* bridge */ /* synthetic */ tb.e0 invoke(Throwable th2) {
        G(th2);
        return tb.e0.f22152a;
    }
}
