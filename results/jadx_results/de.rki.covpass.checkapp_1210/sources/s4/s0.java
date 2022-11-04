package s4;

import kotlin.Metadata;
import kotlinx.coroutines.a2;
import org.conscrypt.BuildConfig;
import s4.m;
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Ls4/s0;", "Ls4/m;", "Lkotlinx/coroutines/q0;", "launcherScope", "Lkotlinx/coroutines/q0;", "d", "()Lkotlinx/coroutines/q0;", "Ls4/l0;", BuildConfig.FLAVOR, "loading", "Ls4/l0;", "b", "()Ls4/l0;", "<init>", "(Lkotlinx/coroutines/q0;)V", "reactivestate_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public class s0 implements m {

    /* renamed from: a */
    private final kotlinx.coroutines.q0 f21443a;

    /* renamed from: b */
    private final l0<Integer> f21444b = b1.b(0, null, 2, null);

    public s0(kotlinx.coroutines.q0 q0Var) {
        hc.t.e(q0Var, "launcherScope");
        this.f21443a = q0Var;
    }

    @Override // s4.m
    public void a(Throwable th2) {
        m.a.c(this, th2);
    }

    @Override // s4.m
    public final l0<Integer> b() {
        return this.f21444b;
    }

    @Override // s4.m
    public Object c(l0<Integer> l0Var, gc.p<? super Throwable, ? super xb.d<? super tb.e0>, ? extends Object> pVar, gc.l<? super xb.d<? super tb.e0>, ? extends Object> lVar, xb.d<? super tb.e0> dVar) {
        return m.a.e(this, l0Var, pVar, lVar, dVar);
    }

    @Override // s4.m
    public final kotlinx.coroutines.q0 d() {
        return this.f21443a;
    }

    @Override // s4.m
    public a2 e(xb.g gVar, kotlinx.coroutines.s0 s0Var, l0<Integer> l0Var, gc.p<? super Throwable, ? super xb.d<? super tb.e0>, ? extends Object> pVar, gc.p<? super kotlinx.coroutines.q0, ? super xb.d<? super tb.e0>, ? extends Object> pVar2) {
        return m.a.a(this, gVar, s0Var, l0Var, pVar, pVar2);
    }

    @Override // s4.m
    public a2 g(xb.g gVar, kotlinx.coroutines.s0 s0Var, gc.p<? super kotlinx.coroutines.q0, ? super xb.d<? super tb.e0>, ? extends Object> pVar) {
        return m.a.d(this, gVar, s0Var, pVar);
    }
}
