package k7;

import kotlin.Metadata;
import kotlinx.coroutines.q0;
import org.conscrypt.BuildConfig;
import s4.c1;
import s4.l0;
import s4.o0;
import tb.e0;
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lk7/o;", "Ls4/o0;", BuildConfig.FLAVOR, "isLoading", "Ltb/e0;", "G", "Ls4/l0;", BuildConfig.FLAVOR, "b", "()Ls4/l0;", "loading", "android-utils_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public interface o extends o0 {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class a {

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @zb.f(c = "com.ibm.health.common.android.utils.LoadingStateHook$onReactiveStateAttached$1", f = "LoadingStateHook.kt", l = {32}, m = "invokeSuspend")
        /* renamed from: k7.o$a$a */
        /* loaded from: classes.dex */
        public static final class C0215a extends zb.l implements gc.p<q0, xb.d<? super e0>, Object> {
            final /* synthetic */ o U3;
            final /* synthetic */ s4.q0<? extends s4.v> V3;

            /* renamed from: y */
            int f14667y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0215a(o oVar, s4.q0<? extends s4.v> q0Var, xb.d<? super C0215a> dVar) {
                super(2, dVar);
                this.U3 = oVar;
                this.V3 = q0Var;
            }

            @Override // zb.a
            public final Object B(Object obj) {
                Object c10;
                c10 = yb.d.c();
                int i10 = this.f14667y;
                if (i10 == 0) {
                    tb.t.b(obj);
                    l0<Integer> b10 = this.U3.b();
                    l0<Integer> b11 = this.V3.b();
                    this.f14667y = 1;
                    if (c1.e(b10, b11, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    tb.t.b(obj);
                }
                return e0.f22152a;
            }

            /* renamed from: d0 */
            public final Object u(q0 q0Var, xb.d<? super e0> dVar) {
                return ((C0215a) j(q0Var, dVar)).B(e0.f22152a);
            }

            @Override // zb.a
            public final xb.d<e0> j(Object obj, xb.d<?> dVar) {
                return new C0215a(this.U3, this.V3, dVar);
            }
        }

        public static void a(o oVar, s4.q0<? extends s4.v> q0Var) {
            androidx.lifecycle.p a10;
            hc.t.e(q0Var, "reactiveState");
            androidx.lifecycle.v vVar = oVar instanceof androidx.lifecycle.v ? (androidx.lifecycle.v) oVar : null;
            if (vVar == null || (a10 = androidx.lifecycle.w.a(vVar)) == null) {
                return;
            }
            a10.g(new C0215a(oVar, q0Var, null));
        }
    }

    void G(boolean z10);

    l0<Integer> b();
}
