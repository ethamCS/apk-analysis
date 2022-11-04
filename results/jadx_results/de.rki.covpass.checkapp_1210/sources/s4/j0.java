package s4;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0096Aø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\r\u001a\u00020\u00062\u0006\u0010\t\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Ls4/j0;", "T", "Ls4/i0;", "Lkotlinx/coroutines/flow/d;", "Lkotlinx/coroutines/flow/e;", "collector", "Ltb/e0;", "a", "(Lkotlinx/coroutines/flow/e;Lxb/d;)Ljava/lang/Object;", "value", BuildConfig.FLAVOR, "e", "(Ljava/lang/Object;)Z", "c", "(Ljava/lang/Object;Lxb/d;)Ljava/lang/Object;", "Ldf/i;", "flow", "<init>", "(Ldf/i;)V", "reactivestate_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class j0<T> implements i0<T>, kotlinx.coroutines.flow.d<T> {

    /* renamed from: c */
    private final df.i<T> f21414c;

    /* renamed from: d */
    private final /* synthetic */ kotlinx.coroutines.flow.d<T> f21415d;

    public j0(df.i<T> iVar) {
        hc.t.e(iVar, "flow");
        this.f21414c = iVar;
        this.f21415d = kotlinx.coroutines.flow.f.k(iVar);
    }

    @Override // kotlinx.coroutines.flow.d
    public Object a(kotlinx.coroutines.flow.e<? super T> eVar, xb.d<? super tb.e0> dVar) {
        return this.f21415d.a(eVar, dVar);
    }

    @Override // kotlinx.coroutines.flow.e
    public Object c(T t10, xb.d<? super tb.e0> dVar) {
        Object c10;
        Object c11 = this.f21414c.c(t10, dVar);
        c10 = yb.d.c();
        return c11 == c10 ? c11 : tb.e0.f22152a;
    }

    @Override // s4.i0
    public boolean e(T t10) {
        return df.m.i(this.f21414c.d(t10));
    }
}
