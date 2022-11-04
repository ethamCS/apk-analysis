package androidx.lifecycle;

import androidx.lifecycle.m;
import kotlin.Metadata;
import kotlinx.coroutines.g1;
import kotlinx.coroutines.g2;
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0006\u0010\u0004\u001a\u00020\u0003J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u001a\u0010\u000f\u001a\u00020\n8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Landroidx/lifecycle/LifecycleCoroutineScopeImpl;", "Landroidx/lifecycle/p;", "Landroidx/lifecycle/s;", "Ltb/e0;", "i", "Landroidx/lifecycle/v;", "source", "Landroidx/lifecycle/m$b;", "event", "f", "Landroidx/lifecycle/m;", "c", "Landroidx/lifecycle/m;", "a", "()Landroidx/lifecycle/m;", "lifecycle", "Lxb/g;", "coroutineContext", "Lxb/g;", "h", "()Lxb/g;", "<init>", "(Landroidx/lifecycle/m;Lxb/g;)V", "lifecycle-runtime-ktx_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class LifecycleCoroutineScopeImpl extends p implements s {

    /* renamed from: c */
    private final m f4254c;

    /* renamed from: d */
    private final xb.g f4255d;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @zb.f(c = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1", f = "Lifecycle.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends zb.l implements gc.p<kotlinx.coroutines.q0, xb.d<? super tb.e0>, Object> {
        private /* synthetic */ Object U3;

        /* renamed from: y */
        int f4256y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(xb.d<? super a> dVar) {
            super(2, dVar);
            LifecycleCoroutineScopeImpl.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            yb.d.c();
            if (this.f4256y == 0) {
                tb.t.b(obj);
                kotlinx.coroutines.q0 q0Var = (kotlinx.coroutines.q0) this.U3;
                if (LifecycleCoroutineScopeImpl.this.a().b().compareTo(m.c.INITIALIZED) >= 0) {
                    LifecycleCoroutineScopeImpl.this.a().a(LifecycleCoroutineScopeImpl.this);
                } else {
                    g2.e(q0Var.h(), null, 1, null);
                }
                return tb.e0.f22152a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* renamed from: d0 */
        public final Object u(kotlinx.coroutines.q0 q0Var, xb.d<? super tb.e0> dVar) {
            return ((a) j(q0Var, dVar)).B(tb.e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<tb.e0> j(Object obj, xb.d<?> dVar) {
            a aVar = new a(dVar);
            aVar.U3 = obj;
            return aVar;
        }
    }

    public LifecycleCoroutineScopeImpl(m mVar, xb.g gVar) {
        hc.t.e(mVar, "lifecycle");
        hc.t.e(gVar, "coroutineContext");
        this.f4254c = mVar;
        this.f4255d = gVar;
        if (a().b() == m.c.DESTROYED) {
            g2.e(h(), null, 1, null);
        }
    }

    @Override // androidx.lifecycle.p
    public m a() {
        return this.f4254c;
    }

    @Override // androidx.lifecycle.s
    public void f(v vVar, m.b bVar) {
        hc.t.e(vVar, "source");
        hc.t.e(bVar, "event");
        if (a().b().compareTo(m.c.DESTROYED) <= 0) {
            a().c(this);
            g2.e(h(), null, 1, null);
        }
    }

    @Override // kotlinx.coroutines.q0
    public xb.g h() {
        return this.f4255d;
    }

    public final void i() {
        kotlinx.coroutines.l.d(this, g1.c().h1(), null, new a(null), 2, null);
    }
}
