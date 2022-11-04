package s4;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import s4.v;
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R \u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Ls4/i;", "Ls4/v;", "E", "Ls4/q0;", "Ls4/s0;", BuildConfig.FLAVOR, "error", "Ltb/e0;", "a", "Ls4/x;", "eventNotifier", "Ls4/x;", "f", "()Ls4/x;", "Lkotlinx/coroutines/q0;", "scope", "<init>", "(Lkotlinx/coroutines/q0;)V", "reactivestate_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public class i<E extends v> extends s0 implements q0<E> {

    /* renamed from: c */
    private final x<E> f21409c = z.b(0, 1, null);

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00028\u0000H\u008a@"}, d2 = {"Ls4/v;", "E", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @zb.f(c = "com.ensody.reactivestate.BaseReactiveState$onError$1", f = "ReactiveState.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class a extends zb.l implements gc.p<E, xb.d<? super tb.e0>, Object> {
        private /* synthetic */ Object U3;
        final /* synthetic */ Throwable V3;

        /* renamed from: y */
        int f21410y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Throwable th2, xb.d<? super a> dVar) {
            super(2, dVar);
            this.V3 = th2;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            yb.d.c();
            if (this.f21410y == 0) {
                tb.t.b(obj);
                ((v) this.U3).a(this.V3);
                return tb.e0.f22152a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* renamed from: d0 */
        public final Object u(E e10, xb.d<? super tb.e0> dVar) {
            return ((a) j(e10, dVar)).B(tb.e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<tb.e0> j(Object obj, xb.d<?> dVar) {
            a aVar = new a(this.V3, dVar);
            aVar.U3 = obj;
            return aVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(kotlinx.coroutines.q0 q0Var) {
        super(q0Var);
        hc.t.e(q0Var, "scope");
    }

    @Override // s4.s0, s4.m
    public void a(Throwable th2) {
        hc.t.e(th2, "error");
        f().f(new a(th2, null));
    }

    @Override // s4.q0
    public x<E> f() {
        return this.f21409c;
    }
}
