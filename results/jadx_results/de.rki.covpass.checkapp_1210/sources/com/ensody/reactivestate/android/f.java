package com.ensody.reactivestate.android;

import androidx.lifecycle.t0;
import androidx.lifecycle.w;
import gc.p;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlinx.coroutines.q0;
import org.conscrypt.BuildConfig;
import s4.m0;
import s4.p0;
import s4.u0;
import s4.v;
import tb.e0;
import tb.m;
import tb.t;
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a9\u0010\b\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00022\b\u0010\u0004\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t\u001aZ\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u000b*\u00020\n*\b\u0012\u0004\u0012\u00020\f0\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\u0016\u0010\u0010\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000f2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00028\u00000\u000f¨\u0006\u0014"}, d2 = {"Ls4/v;", "E", "Lkotlin/Lazy;", "Ls4/q0;", "handler", "Landroidx/lifecycle/v;", "owner", "Ltb/e0;", "a", "(Lkotlin/Lazy;Ls4/v;Landroidx/lifecycle/v;)V", BuildConfig.FLAVOR, "T", "Lcom/ensody/reactivestate/android/l;", "Loc/d;", "klass", "Lkotlin/Function1;", "caster", "Lcom/ensody/reactivestate/android/b;", "provider", "b", "reactivestate_release"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class f {

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@"}, d2 = {"Ls4/v;", "E", "Lkotlinx/coroutines/q0;", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @zb.f(c = "com.ensody.reactivestate.android.ReactiveViewModelExtKt$attachLazyReactiveState$1", f = "ReactiveViewModelExt.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends zb.l implements p<q0, xb.d<? super e0>, Object> {
        final /* synthetic */ Lazy<s4.q0<E>> U3;
        final /* synthetic */ v V3;
        final /* synthetic */ androidx.lifecycle.v W3;

        /* renamed from: y */
        int f6777y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Lazy lazy, v vVar, androidx.lifecycle.v vVar2, xb.d dVar) {
            super(2, dVar);
            this.U3 = lazy;
            this.V3 = vVar;
            this.W3 = vVar2;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            yb.d.c();
            if (this.f6777y == 0) {
                t.b(obj);
                com.ensody.reactivestate.android.c.a(((s4.q0) this.U3.getValue()).f(), this.V3, this.W3);
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
            return new a(this.U3, this.V3, this.W3, dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@"}, d2 = {"Ls4/v;", "E", "Lkotlinx/coroutines/q0;", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @zb.f(c = "com.ensody.reactivestate.android.ReactiveViewModelExtKt$attachLazyReactiveState$2", f = "ReactiveViewModelExt.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends zb.l implements p<q0, xb.d<? super e0>, Object> {
        final /* synthetic */ Lazy<s4.q0<E>> U3;
        final /* synthetic */ androidx.lifecycle.v V3;

        /* renamed from: y */
        int f6778y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Lazy<? extends s4.q0<E>> lazy, androidx.lifecycle.v vVar, xb.d<? super b> dVar) {
            super(2, dVar);
            this.U3 = lazy;
            this.V3 = vVar;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            yb.d.c();
            if (this.f6778y == 0) {
                t.b(obj);
                p0.a((s4.q0) this.U3.getValue(), this.V3);
                return e0.f22152a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* renamed from: d0 */
        public final Object u(q0 q0Var, xb.d<? super e0> dVar) {
            return ((b) j(q0Var, dVar)).B(e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<e0> j(Object obj, xb.d<?> dVar) {
            return new b(this.U3, this.V3, dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "T", BuildConfig.FLAVOR, "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class c extends hc.v implements gc.a<T> {

        /* renamed from: c */
        final /* synthetic */ Lazy<l> f6779c;

        /* renamed from: d */
        final /* synthetic */ oc.d<T> f6780d;

        /* renamed from: q */
        final /* synthetic */ gc.l<Object, T> f6781q;

        /* renamed from: x */
        final /* synthetic */ gc.l<com.ensody.reactivestate.android.b, T> f6782x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(Lazy<l> lazy, oc.d<T> dVar, gc.l<Object, ? extends T> lVar, gc.l<? super com.ensody.reactivestate.android.b, ? extends T> lVar2) {
            super(0);
            this.f6779c = lazy;
            this.f6780d = dVar;
            this.f6781q = lVar;
            this.f6782x = lVar2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // gc.a
        public final T invoke() {
            u0 g10 = this.f6779c.getValue().g();
            String y10 = this.f6780d.y();
            if (y10 != null) {
                m0 m0Var = new m0(g10, y10);
                Object invoke = this.f6781q.invoke(this.f6779c.getValue().f().get(this.f6780d));
                T t10 = invoke;
                if (invoke == null) {
                    t10 = this.f6782x.invoke(new com.ensody.reactivestate.android.b(t0.a(this.f6779c.getValue()), m0Var));
                }
                this.f6779c.getValue().f().put(this.f6780d, t10);
                return t10;
            }
            throw new IllegalArgumentException("The class must have a qualifiedName");
        }
    }

    public static final <E extends v> void a(Lazy<? extends s4.q0<E>> lazy, E e10, androidx.lifecycle.v vVar) {
        hc.t.e(lazy, "<this>");
        hc.t.e(vVar, "owner");
        if (e10 != null) {
            w.a(vVar).d(new a(lazy, e10, vVar, null));
            w.a(vVar).d(new b(lazy, vVar, null));
            return;
        }
        throw new IllegalStateException("You have to implement the ViewModel's events interface.");
    }

    public static final <T> Lazy<T> b(Lazy<l> lazy, oc.d<T> dVar, gc.l<Object, ? extends T> lVar, gc.l<? super com.ensody.reactivestate.android.b, ? extends T> lVar2) {
        Lazy<T> a10;
        hc.t.e(lazy, "<this>");
        hc.t.e(dVar, "klass");
        hc.t.e(lVar, "caster");
        hc.t.e(lVar2, "provider");
        a10 = m.a(new c(lazy, dVar, lVar, lVar2));
        return a10;
    }
}
