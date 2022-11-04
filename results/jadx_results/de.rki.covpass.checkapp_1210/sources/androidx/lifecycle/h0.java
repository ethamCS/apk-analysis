package androidx.lifecycle;

import androidx.lifecycle.m;
import kotlin.Metadata;
import kotlinx.coroutines.a2;
import kotlinx.coroutines.g1;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aA\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001aA\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\t2\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001aA\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\b\u001aI\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u000e\u001a\u00020\r2\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"T", "Landroidx/lifecycle/m;", "Lkotlin/Function2;", "Lkotlinx/coroutines/q0;", "Lxb/d;", BuildConfig.FLAVOR, "block", "a", "(Landroidx/lifecycle/m;Lgc/p;Lxb/d;)Ljava/lang/Object;", "Landroidx/lifecycle/v;", "c", "(Landroidx/lifecycle/v;Lgc/p;Lxb/d;)Ljava/lang/Object;", "b", "Landroidx/lifecycle/m$c;", "minState", "d", "(Landroidx/lifecycle/m;Landroidx/lifecycle/m$c;Lgc/p;Lxb/d;)Ljava/lang/Object;", "lifecycle-runtime-ktx_release"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class h0 {

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/q0;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @zb.f(c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", f = "PausingDispatcher.kt", l = {162}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends zb.l implements gc.p<kotlinx.coroutines.q0, xb.d<? super T>, Object> {
        private /* synthetic */ Object U3;
        final /* synthetic */ m V3;
        final /* synthetic */ m.c W3;
        final /* synthetic */ gc.p<kotlinx.coroutines.q0, xb.d<? super T>, Object> X3;

        /* renamed from: y */
        int f4319y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(m mVar, m.c cVar, gc.p<? super kotlinx.coroutines.q0, ? super xb.d<? super T>, ? extends Object> pVar, xb.d<? super a> dVar) {
            super(2, dVar);
            this.V3 = mVar;
            this.W3 = cVar;
            this.X3 = pVar;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            Object c10;
            Throwable th2;
            o oVar;
            c10 = yb.d.c();
            int i10 = this.f4319y;
            if (i10 == 0) {
                tb.t.b(obj);
                a2 a2Var = (a2) ((kotlinx.coroutines.q0) this.U3).h().i(a2.W0);
                if (a2Var == null) {
                    throw new IllegalStateException("when[State] methods should have a parent job".toString());
                }
                g0 g0Var = new g0();
                o oVar2 = new o(this.V3, this.W3, g0Var.f4314q, a2Var);
                try {
                    gc.p<kotlinx.coroutines.q0, xb.d<? super T>, Object> pVar = this.X3;
                    this.U3 = oVar2;
                    this.f4319y = 1;
                    obj = kotlinx.coroutines.j.g(g0Var, pVar, this);
                    if (obj == c10) {
                        return c10;
                    }
                    oVar = oVar2;
                } catch (Throwable th3) {
                    th2 = th3;
                    oVar = oVar2;
                    oVar.b();
                    throw th2;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                oVar = (o) this.U3;
                try {
                    tb.t.b(obj);
                } catch (Throwable th4) {
                    th2 = th4;
                    oVar.b();
                    throw th2;
                }
            }
            oVar.b();
            return obj;
        }

        /* renamed from: d0 */
        public final Object u(kotlinx.coroutines.q0 q0Var, xb.d<? super T> dVar) {
            return ((a) j(q0Var, dVar)).B(tb.e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<tb.e0> j(Object obj, xb.d<?> dVar) {
            a aVar = new a(this.V3, this.W3, this.X3, dVar);
            aVar.U3 = obj;
            return aVar;
        }
    }

    public static final <T> Object a(m mVar, gc.p<? super kotlinx.coroutines.q0, ? super xb.d<? super T>, ? extends Object> pVar, xb.d<? super T> dVar) {
        return d(mVar, m.c.CREATED, pVar, dVar);
    }

    public static final <T> Object b(m mVar, gc.p<? super kotlinx.coroutines.q0, ? super xb.d<? super T>, ? extends Object> pVar, xb.d<? super T> dVar) {
        return d(mVar, m.c.STARTED, pVar, dVar);
    }

    public static final <T> Object c(v vVar, gc.p<? super kotlinx.coroutines.q0, ? super xb.d<? super T>, ? extends Object> pVar, xb.d<? super T> dVar) {
        m c10 = vVar.c();
        hc.t.d(c10, "lifecycle");
        return b(c10, pVar, dVar);
    }

    public static final <T> Object d(m mVar, m.c cVar, gc.p<? super kotlinx.coroutines.q0, ? super xb.d<? super T>, ? extends Object> pVar, xb.d<? super T> dVar) {
        return kotlinx.coroutines.j.g(g1.c().h1(), new a(mVar, cVar, pVar, null), dVar);
    }
}
