package ef;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
import tb.e0;
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0002B3\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0013J&\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0014J!\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0094@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lef/g;", "T", "Lef/f;", "Lxb/g;", "context", BuildConfig.FLAVOR, "capacity", "Ldf/h;", "onBufferOverflow", "Lef/d;", "l", "Lkotlinx/coroutines/flow/e;", "collector", "Ltb/e0;", "s", "(Lkotlinx/coroutines/flow/e;Lxb/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/d;", "flow", "<init>", "(Lkotlinx/coroutines/flow/d;Lxb/g;ILdf/h;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class g<T> extends f<T, T> {
    public g(kotlinx.coroutines.flow.d<? extends T> dVar, xb.g gVar, int i10, df.h hVar) {
        super(dVar, gVar, i10, hVar);
    }

    public /* synthetic */ g(kotlinx.coroutines.flow.d dVar, xb.g gVar, int i10, df.h hVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, (i11 & 2) != 0 ? xb.h.f25516c : gVar, (i11 & 4) != 0 ? -3 : i10, (i11 & 8) != 0 ? df.h.SUSPEND : hVar);
    }

    @Override // ef.d
    protected d<T> l(xb.g gVar, int i10, df.h hVar) {
        return new g(this.f9564x, gVar, i10, hVar);
    }

    @Override // ef.f
    protected Object s(kotlinx.coroutines.flow.e<? super T> eVar, xb.d<? super e0> dVar) {
        Object c10;
        Object a10 = this.f9564x.a(eVar, dVar);
        c10 = yb.d.c();
        return a10 == c10 ? a10 : e0.f22152a;
    }
}
