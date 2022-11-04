package k7;

import kotlin.Metadata;
import kotlinx.coroutines.q0;
import org.conscrypt.BuildConfig;
import tb.e0;
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a,\u0010\b\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¨\u0006\t"}, d2 = {"Landroidx/lifecycle/v;", "Lkotlinx/coroutines/flow/w;", BuildConfig.FLAVOR, "isLoading", "Lkotlin/Function1;", BuildConfig.FLAVOR, "Ltb/e0;", "setLoading", "a", "android-utils_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class p {

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @zb.f(c = "com.ibm.health.common.android.utils.LoadingStateHookKt$watchLoading$1", f = "LoadingStateHook.kt", l = {43}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends zb.l implements gc.p<q0, xb.d<? super e0>, Object> {
        final /* synthetic */ kotlinx.coroutines.flow.w<Integer> U3;
        final /* synthetic */ androidx.lifecycle.v V3;
        final /* synthetic */ gc.l<Boolean, e0> W3;

        /* renamed from: y */
        int f14668y;

        @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {BuildConfig.FLAVOR, "it", "Ltb/e0;", "a", "(ILxb/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 7, 1})
        /* renamed from: k7.p$a$a */
        /* loaded from: classes.dex */
        public static final class C0216a<T> implements kotlinx.coroutines.flow.e {

            /* renamed from: c */
            final /* synthetic */ androidx.lifecycle.v f14669c;

            /* renamed from: d */
            final /* synthetic */ gc.l<Boolean, e0> f14670d;

            /* renamed from: q */
            final /* synthetic */ kotlinx.coroutines.flow.w<Integer> f14671q;

            @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
            @zb.f(c = "com.ibm.health.common.android.utils.LoadingStateHookKt$watchLoading$1$1$1", f = "LoadingStateHook.kt", l = {}, m = "invokeSuspend")
            /* renamed from: k7.p$a$a$a */
            /* loaded from: classes.dex */
            public static final class C0217a extends zb.l implements gc.p<q0, xb.d<? super e0>, Object> {
                final /* synthetic */ gc.l<Boolean, e0> U3;
                final /* synthetic */ kotlinx.coroutines.flow.w<Integer> V3;

                /* renamed from: y */
                int f14672y;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0217a(gc.l<? super Boolean, e0> lVar, kotlinx.coroutines.flow.w<Integer> wVar, xb.d<? super C0217a> dVar) {
                    super(2, dVar);
                    this.U3 = lVar;
                    this.V3 = wVar;
                }

                @Override // zb.a
                public final Object B(Object obj) {
                    yb.d.c();
                    if (this.f14672y == 0) {
                        tb.t.b(obj);
                        this.U3.invoke(zb.b.a(this.V3.getValue().intValue() > 0));
                        return e0.f22152a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                /* renamed from: d0 */
                public final Object u(q0 q0Var, xb.d<? super e0> dVar) {
                    return ((C0217a) j(q0Var, dVar)).B(e0.f22152a);
                }

                @Override // zb.a
                public final xb.d<e0> j(Object obj, xb.d<?> dVar) {
                    return new C0217a(this.U3, this.V3, dVar);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            C0216a(androidx.lifecycle.v vVar, gc.l<? super Boolean, e0> lVar, kotlinx.coroutines.flow.w<Integer> wVar) {
                this.f14669c = vVar;
                this.f14670d = lVar;
                this.f14671q = wVar;
            }

            public final Object a(int i10, xb.d<? super e0> dVar) {
                if (i10 > 0) {
                    androidx.lifecycle.w.a(this.f14669c).g(new C0217a(this.f14670d, this.f14671q, null));
                } else {
                    this.f14670d.invoke(zb.b.a(i10 > 0));
                }
                return e0.f22152a;
            }

            @Override // kotlinx.coroutines.flow.e
            public /* bridge */ /* synthetic */ Object c(Object obj, xb.d dVar) {
                return a(((Number) obj).intValue(), dVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(kotlinx.coroutines.flow.w<Integer> wVar, androidx.lifecycle.v vVar, gc.l<? super Boolean, e0> lVar, xb.d<? super a> dVar) {
            super(2, dVar);
            this.U3 = wVar;
            this.V3 = vVar;
            this.W3 = lVar;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            Object c10;
            c10 = yb.d.c();
            int i10 = this.f14668y;
            if (i10 == 0) {
                tb.t.b(obj);
                kotlinx.coroutines.flow.w<Integer> wVar = this.U3;
                C0216a c0216a = new C0216a(this.V3, this.W3, wVar);
                this.f14668y = 1;
                if (wVar.a(c0216a, this) == c10) {
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
        public final Object u(q0 q0Var, xb.d<? super e0> dVar) {
            return ((a) j(q0Var, dVar)).B(e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<e0> j(Object obj, xb.d<?> dVar) {
            return new a(this.U3, this.V3, this.W3, dVar);
        }
    }

    public static final void a(androidx.lifecycle.v vVar, kotlinx.coroutines.flow.w<Integer> wVar, gc.l<? super Boolean, e0> lVar) {
        hc.t.e(vVar, "<this>");
        hc.t.e(wVar, "isLoading");
        hc.t.e(lVar, "setLoading");
        kotlinx.coroutines.l.d(androidx.lifecycle.w.a(vVar), null, null, new a(wVar, vVar, lVar, null), 3, null);
    }
}
