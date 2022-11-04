package androidx.lifecycle;

import kotlin.Metadata;
import kotlinx.coroutines.a2;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u000f\u0010\u0010J4\u0010\b\u001a\u00020\u00072\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ4\u0010\n\u001a\u00020\u00072\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8 X \u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Landroidx/lifecycle/p;", "Lkotlinx/coroutines/q0;", "Lkotlin/Function2;", "Lxb/d;", "Ltb/e0;", BuildConfig.FLAVOR, "block", "Lkotlinx/coroutines/a2;", "d", "(Lgc/p;)Lkotlinx/coroutines/a2;", "g", "Landroidx/lifecycle/m;", "a", "()Landroidx/lifecycle/m;", "lifecycle", "<init>", "()V", "lifecycle-runtime-ktx_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public abstract class p implements kotlinx.coroutines.q0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @zb.f(c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenCreated$1", f = "Lifecycle.kt", l = {79}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends zb.l implements gc.p<kotlinx.coroutines.q0, xb.d<? super tb.e0>, Object> {
        final /* synthetic */ gc.p<kotlinx.coroutines.q0, xb.d<? super tb.e0>, Object> V3;

        /* renamed from: y */
        int f4361y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(gc.p<? super kotlinx.coroutines.q0, ? super xb.d<? super tb.e0>, ? extends Object> pVar, xb.d<? super a> dVar) {
            super(2, dVar);
            p.this = r1;
            this.V3 = pVar;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            Object c10;
            c10 = yb.d.c();
            int i10 = this.f4361y;
            if (i10 == 0) {
                tb.t.b(obj);
                m a10 = p.this.a();
                gc.p<kotlinx.coroutines.q0, xb.d<? super tb.e0>, Object> pVar = this.V3;
                this.f4361y = 1;
                if (h0.a(a10, pVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                tb.t.b(obj);
            }
            return tb.e0.f22152a;
        }

        /* renamed from: d0 */
        public final Object u(kotlinx.coroutines.q0 q0Var, xb.d<? super tb.e0> dVar) {
            return ((a) j(q0Var, dVar)).B(tb.e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<tb.e0> j(Object obj, xb.d<?> dVar) {
            return new a(this.V3, dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @zb.f(c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenStarted$1", f = "Lifecycle.kt", l = {97}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends zb.l implements gc.p<kotlinx.coroutines.q0, xb.d<? super tb.e0>, Object> {
        final /* synthetic */ gc.p<kotlinx.coroutines.q0, xb.d<? super tb.e0>, Object> V3;

        /* renamed from: y */
        int f4362y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(gc.p<? super kotlinx.coroutines.q0, ? super xb.d<? super tb.e0>, ? extends Object> pVar, xb.d<? super b> dVar) {
            super(2, dVar);
            p.this = r1;
            this.V3 = pVar;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            Object c10;
            c10 = yb.d.c();
            int i10 = this.f4362y;
            if (i10 == 0) {
                tb.t.b(obj);
                m a10 = p.this.a();
                gc.p<kotlinx.coroutines.q0, xb.d<? super tb.e0>, Object> pVar = this.V3;
                this.f4362y = 1;
                if (h0.b(a10, pVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                tb.t.b(obj);
            }
            return tb.e0.f22152a;
        }

        /* renamed from: d0 */
        public final Object u(kotlinx.coroutines.q0 q0Var, xb.d<? super tb.e0> dVar) {
            return ((b) j(q0Var, dVar)).B(tb.e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<tb.e0> j(Object obj, xb.d<?> dVar) {
            return new b(this.V3, dVar);
        }
    }

    public abstract m a();

    public final a2 d(gc.p<? super kotlinx.coroutines.q0, ? super xb.d<? super tb.e0>, ? extends Object> pVar) {
        a2 d10;
        hc.t.e(pVar, "block");
        d10 = kotlinx.coroutines.l.d(this, null, null, new a(pVar, null), 3, null);
        return d10;
    }

    public final a2 g(gc.p<? super kotlinx.coroutines.q0, ? super xb.d<? super tb.e0>, ? extends Object> pVar) {
        a2 d10;
        hc.t.e(pVar, "block");
        d10 = kotlinx.coroutines.l.d(this, null, null, new b(pVar, null), 3, null);
        return d10;
    }
}
