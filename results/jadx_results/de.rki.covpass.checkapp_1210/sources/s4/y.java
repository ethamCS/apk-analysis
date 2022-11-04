package s4;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022$\u0012 \u0012\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00040\u0003B\u0011\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J=\u0010\n\u001a\u00020\u00062(\u0010\t\u001a$\u0012 \u0012\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00040\bH\u0096Aø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\r\u001a\u00020\u00062\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004H\u0096Aø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ7\u0010\u0010\u001a\u00020\u000f2\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J7\u0010\u0013\u001a\u00020\u00062\"\u0010\u0012\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Ls4/y;", "T", "Ls4/x;", "Ls4/i0;", "Lkotlin/Function2;", "Lxb/d;", "Ltb/e0;", BuildConfig.FLAVOR, "Lkotlinx/coroutines/flow/e;", "collector", "a", "(Lkotlinx/coroutines/flow/e;Lxb/d;)Ljava/lang/Object;", "value", "i", "(Lgc/p;Lxb/d;)Ljava/lang/Object;", BuildConfig.FLAVOR, "j", "(Lgc/p;)Z", "block", "f", "(Lgc/p;)V", BuildConfig.FLAVOR, "capacity", "<init>", "(I)V", "reactivestate_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
final class y<T> implements x<T>, i0<gc.p<? super T, ? super xb.d<? super tb.e0>, ? extends Object>> {

    /* renamed from: c */
    private final /* synthetic */ i0<gc.p<T, xb.d<? super tb.e0>, Object>> f21460c;

    public y(int i10) {
        this.f21460c = k0.a(i10, df.h.DROP_OLDEST);
    }

    @Override // kotlinx.coroutines.flow.d
    public Object a(kotlinx.coroutines.flow.e<? super gc.p<? super T, ? super xb.d<? super tb.e0>, ? extends Object>> eVar, xb.d<? super tb.e0> dVar) {
        return this.f21460c.a(eVar, dVar);
    }

    @Override // s4.x
    public void f(gc.p<? super T, ? super xb.d<? super tb.e0>, ? extends Object> pVar) {
        hc.t.e(pVar, "block");
        e(pVar);
    }

    /* renamed from: i */
    public Object c(gc.p<? super T, ? super xb.d<? super tb.e0>, ? extends Object> pVar, xb.d<? super tb.e0> dVar) {
        return this.f21460c.c(pVar, dVar);
    }

    /* renamed from: j */
    public boolean e(gc.p<? super T, ? super xb.d<? super tb.e0>, ? extends Object> pVar) {
        hc.t.e(pVar, "value");
        return this.f21460c.e(pVar);
    }
}
