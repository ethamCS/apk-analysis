package s4;

import kotlin.Metadata;
import kotlinx.coroutines.a2;
import s4.m;
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016R\u0014\u0010\b\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Ls4/t0;", "T", "Ls4/f;", "Ltb/e0;", "b", "a", "getValue", "()Ljava/lang/Object;", "value", "Lkotlinx/coroutines/flow/w;", "data", "Ls4/g;", "autoRunner", "<init>", "(Lkotlinx/coroutines/flow/w;Ls4/g;)V", "reactivestate_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class t0<T> implements f<T> {

    /* renamed from: a */
    private final kotlinx.coroutines.flow.w<T> f21447a;

    /* renamed from: b */
    private final g f21448b;

    /* renamed from: c */
    private a2 f21449c;

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/q0;", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @zb.f(c = "com.ensody.reactivestate.StateFlowObservable$addObserver$1", f = "AutoRunStateFlow.kt", l = {24}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class a extends zb.l implements gc.p<kotlinx.coroutines.q0, xb.d<? super tb.e0>, Object> {
        final /* synthetic */ t0<T> U3;
        final /* synthetic */ hc.j0<d1<T>> V3;

        /* renamed from: y */
        int f21450y;

        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "value", "Ltb/e0;", "c", "(Ljava/lang/Object;Lxb/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
        /* renamed from: s4.t0$a$a */
        /* loaded from: classes.dex */
        public static final class C0357a<T> implements kotlinx.coroutines.flow.e {

            /* renamed from: c */
            final /* synthetic */ hc.j0<d1<T>> f21451c;

            /* renamed from: d */
            final /* synthetic */ t0<T> f21452d;

            C0357a(hc.j0<d1<T>> j0Var, t0<T> t0Var) {
                this.f21451c = j0Var;
                this.f21452d = t0Var;
            }

            @Override // kotlinx.coroutines.flow.e
            public final Object c(T t10, xb.d<? super tb.e0> dVar) {
                d1<T> d1Var;
                boolean z10 = true;
                if (this.f21451c.f11764c == null || (!hc.t.a(d1Var.a(), t10))) {
                    z10 = false;
                }
                if (!z10) {
                    ((t0) this.f21452d).f21448b.f();
                }
                this.f21451c.f11764c = null;
                return tb.e0.f22152a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(t0<T> t0Var, hc.j0<d1<T>> j0Var, xb.d<? super a> dVar) {
            super(2, dVar);
            this.U3 = t0Var;
            this.V3 = j0Var;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            Object c10;
            c10 = yb.d.c();
            int i10 = this.f21450y;
            if (i10 == 0) {
                tb.t.b(obj);
                kotlinx.coroutines.flow.w wVar = ((t0) this.U3).f21447a;
                C0357a c0357a = new C0357a(this.V3, this.U3);
                this.f21450y = 1;
                if (wVar.a(c0357a, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                tb.t.b(obj);
            }
            throw new tb.i();
        }

        /* renamed from: d0 */
        public final Object u(kotlinx.coroutines.q0 q0Var, xb.d<? super tb.e0> dVar) {
            return ((a) j(q0Var, dVar)).B(tb.e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<tb.e0> j(Object obj, xb.d<?> dVar) {
            return new a(this.U3, this.V3, dVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t0(kotlinx.coroutines.flow.w<? extends T> wVar, g gVar) {
        hc.t.e(wVar, "data");
        hc.t.e(gVar, "autoRunner");
        this.f21447a = wVar;
        this.f21448b = gVar;
    }

    @Override // s4.f
    public void a() {
        a2 a2Var = this.f21449c;
        if (a2Var != null) {
            a2.a.a(a2Var, null, 1, null);
        }
        this.f21449c = null;
    }

    @Override // s4.f
    public void b() {
        if (this.f21449c == null) {
            hc.j0 j0Var = new hc.j0();
            j0Var.f11764c = (T) new d1(this.f21447a.getValue());
            this.f21449c = m.a.b(this.f21448b.b(), null, null, null, null, new a(this, j0Var, null), 11, null);
        }
    }

    @Override // s4.f
    public T getValue() {
        return this.f21447a.getValue();
    }
}
