package com.ensody.reactivestate.android;

import androidx.lifecycle.h0;
import androidx.lifecycle.v;
import androidx.lifecycle.w;
import gc.p;
import kotlin.Metadata;
import kotlinx.coroutines.a2;
import kotlinx.coroutines.q0;
import org.conscrypt.BuildConfig;
import s4.s0;
import tb.e0;
import tb.t;
@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u0018\u0010\u0019JF\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\"\u0010\u000b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016R\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lcom/ensody/reactivestate/android/d;", "Ls4/s0;", "Lxb/g;", "context", "Lkotlinx/coroutines/s0;", "start", "Lkotlin/Function2;", "Lkotlinx/coroutines/q0;", "Lxb/d;", "Ltb/e0;", BuildConfig.FLAVOR, "block", "Lkotlinx/coroutines/a2;", "g", "(Lxb/g;Lkotlinx/coroutines/s0;Lgc/p;)Lkotlinx/coroutines/a2;", BuildConfig.FLAVOR, "error", "a", "Landroidx/lifecycle/v;", "c", "Landroidx/lifecycle/v;", "h", "()Landroidx/lifecycle/v;", "owner", "<init>", "(Landroidx/lifecycle/v;)V", "reactivestate_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class d extends s0 {

    /* renamed from: c */
    private final v f6766c;

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @zb.f(c = "com.ensody.reactivestate.android.LifecycleCoroutineLauncher$onError$1", f = "LifecycleCoroutineLauncher.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class a extends zb.l implements p<q0, xb.d<? super e0>, Object> {
        final /* synthetic */ Throwable V3;

        /* renamed from: y */
        int f6767y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Throwable th2, xb.d<? super a> dVar) {
            super(2, dVar);
            d.this = r1;
            this.V3 = th2;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            yb.d.c();
            if (this.f6767y == 0) {
                t.b(obj);
                ((s4.v) d.this.h()).a(this.V3);
                return e0.f22152a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* renamed from: d0 */
        public final Object u(q0 q0Var, xb.d<? super e0> dVar) {
            return ((a) j(q0Var, dVar)).B(e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<e0> j(Object obj, xb.d<?> dVar) {
            return new a(this.V3, dVar);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @zb.f(c = "com.ensody.reactivestate.android.LifecycleCoroutineLauncher$rawLaunch$1", f = "LifecycleCoroutineLauncher.kt", l = {25}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class b extends zb.l implements p<q0, xb.d<? super e0>, Object> {
        final /* synthetic */ p<q0, xb.d<? super e0>, Object> V3;

        /* renamed from: y */
        int f6768y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(p<? super q0, ? super xb.d<? super e0>, ? extends Object> pVar, xb.d<? super b> dVar) {
            super(2, dVar);
            d.this = r1;
            this.V3 = pVar;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            Object c10;
            c10 = yb.d.c();
            int i10 = this.f6768y;
            if (i10 == 0) {
                t.b(obj);
                v h10 = d.this.h();
                p<q0, xb.d<? super e0>, Object> pVar = this.V3;
                this.f6768y = 1;
                if (h0.c(h10, pVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                t.b(obj);
            }
            return e0.f22152a;
        }

        /* renamed from: d0 */
        public final Object u(q0 q0Var, xb.d<? super e0> dVar) {
            return ((b) j(q0Var, dVar)).B(e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<e0> j(Object obj, xb.d<?> dVar) {
            return new b(this.V3, dVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(v vVar) {
        super(w.a(vVar));
        hc.t.e(vVar, "owner");
        this.f6766c = vVar;
    }

    @Override // s4.s0, s4.m
    public void a(Throwable th2) {
        hc.t.e(th2, "error");
        v vVar = this.f6766c;
        if (vVar instanceof s4.v) {
            w.a(vVar).g(new a(th2, null));
        } else {
            super.a(th2);
        }
    }

    @Override // s4.s0, s4.m
    public a2 g(xb.g gVar, kotlinx.coroutines.s0 s0Var, p<? super q0, ? super xb.d<? super e0>, ? extends Object> pVar) {
        hc.t.e(gVar, "context");
        hc.t.e(s0Var, "start");
        hc.t.e(pVar, "block");
        return kotlinx.coroutines.j.c(w.a(this.f6766c), gVar, s0Var, new b(pVar, null));
    }

    public final v h() {
        return this.f6766c;
    }
}
