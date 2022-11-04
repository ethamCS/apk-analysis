package ef;

import df.e0;
import kotlin.Metadata;
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lef/p;", "T", "Lkotlinx/coroutines/flow/e;", "value", "Ltb/e0;", "c", "(Ljava/lang/Object;Lxb/d;)Ljava/lang/Object;", "Ldf/e0;", "channel", "<init>", "(Ldf/e0;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class p<T> implements kotlinx.coroutines.flow.e<T> {

    /* renamed from: c */
    private final e0<T> f9579c;

    /* JADX WARN: Multi-variable type inference failed */
    public p(e0<? super T> e0Var) {
        this.f9579c = e0Var;
    }

    @Override // kotlinx.coroutines.flow.e
    public Object c(T t10, xb.d<? super tb.e0> dVar) {
        Object c10;
        Object c11 = this.f9579c.c(t10, dVar);
        c10 = yb.d.c();
        return c11 == c10 ? c11 : tb.e0.f22152a;
    }
}
