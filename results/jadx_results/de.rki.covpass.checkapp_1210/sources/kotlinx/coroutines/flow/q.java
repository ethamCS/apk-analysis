package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlinx.coroutines.a2;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u001f\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096Aø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ&\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00028\u00008\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lkotlinx/coroutines/flow/q;", "T", "Lkotlinx/coroutines/flow/w;", BuildConfig.FLAVOR, "Lef/i;", "Lkotlinx/coroutines/flow/e;", "collector", BuildConfig.FLAVOR, "a", "(Lkotlinx/coroutines/flow/e;Lxb/d;)Ljava/lang/Object;", "Lxb/g;", "context", BuildConfig.FLAVOR, "capacity", "Ldf/h;", "onBufferOverflow", "Lkotlinx/coroutines/flow/d;", "g", "Lkotlinx/coroutines/a2;", "c", "Lkotlinx/coroutines/a2;", "job", "getValue", "()Ljava/lang/Object;", "value", "flow", "<init>", "(Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/a2;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
final class q<T> implements w<T>, d, ef.i<T> {

    /* renamed from: c */
    private final a2 f15369c;

    /* renamed from: d */
    private final /* synthetic */ w<T> f15370d;

    /* JADX WARN: Multi-variable type inference failed */
    public q(w<? extends T> wVar, a2 a2Var) {
        this.f15369c = a2Var;
        this.f15370d = wVar;
    }

    @Override // kotlinx.coroutines.flow.s, kotlinx.coroutines.flow.d
    public Object a(e<? super T> eVar, xb.d<?> dVar) {
        return this.f15370d.a(eVar, dVar);
    }

    @Override // ef.i
    public d<T> g(xb.g gVar, int i10, df.h hVar) {
        return y.d(this, gVar, i10, hVar);
    }

    @Override // kotlinx.coroutines.flow.w
    public T getValue() {
        return this.f15370d.getValue();
    }
}
