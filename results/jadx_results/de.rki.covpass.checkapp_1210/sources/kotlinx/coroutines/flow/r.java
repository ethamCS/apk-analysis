package kotlinx.coroutines.flow;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import tb.e0;
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B4\u0012(\u0010\u000b\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\bø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/flow/r;", "T", "Lkotlinx/coroutines/flow/a;", "Lkotlinx/coroutines/flow/e;", "collector", "Ltb/e0;", "i", "(Lkotlinx/coroutines/flow/e;Lxb/d;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lxb/d;", BuildConfig.FLAVOR, "block", "<init>", "(Lgc/p;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
final class r<T> extends a<T> {

    /* renamed from: c */
    private final gc.p<e<? super T>, xb.d<? super e0>, Object> f15371c;

    /* JADX WARN: Multi-variable type inference failed */
    public r(gc.p<? super e<? super T>, ? super xb.d<? super e0>, ? extends Object> pVar) {
        this.f15371c = pVar;
    }

    @Override // kotlinx.coroutines.flow.a
    public Object i(e<? super T> eVar, xb.d<? super e0> dVar) {
        Object c10;
        Object u10 = this.f15371c.u(eVar, dVar);
        c10 = yb.d.c();
        return u10 == c10 ? u10 : e0.f22152a;
    }
}
