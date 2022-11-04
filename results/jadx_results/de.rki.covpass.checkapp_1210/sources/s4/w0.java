package s4;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B6\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0094@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Ls4/w0;", "T", "Ls4/j;", "value", "Ltb/e0;", "i", "(Ljava/lang/Object;Lxb/d;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lxb/d;", BuildConfig.FLAVOR, "setter", "<init>", "(Ljava/lang/Object;Lgc/p;)V", "reactivestate_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
final class w0<T> extends j<T> {

    /* renamed from: d */
    private final gc.p<T, xb.d<? super tb.e0>, Object> f21459d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public w0(T t10, gc.p<? super T, ? super xb.d<? super tb.e0>, ? extends Object> pVar) {
        super(t10);
        hc.t.e(pVar, "setter");
        this.f21459d = pVar;
    }

    @Override // s4.j
    protected Object i(T t10, xb.d<? super tb.e0> dVar) {
        Object c10;
        Object u10 = this.f21459d.u(t10, dVar);
        c10 = yb.d.c();
        return u10 == c10 ? u10 : tb.e0.f22152a;
    }
}
