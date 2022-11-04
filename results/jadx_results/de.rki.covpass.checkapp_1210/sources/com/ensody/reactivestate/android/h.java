package com.ensody.reactivestate.android;

import androidx.lifecycle.d0;
import androidx.lifecycle.l0;
import hc.t;
import hc.v;
import kotlin.Metadata;
import kotlinx.coroutines.q0;
import org.conscrypt.BuildConfig;
import s4.c0;
import s4.r0;
import s4.u0;
import tb.e0;
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011B\u0011\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0012J+\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/ensody/reactivestate/android/h;", "Ls4/u0;", "T", BuildConfig.FLAVOR, "key", "default", "Ls4/l0;", "a", "(Ljava/lang/String;Ljava/lang/Object;)Ls4/l0;", "Lkotlinx/coroutines/q0;", "Lkotlinx/coroutines/q0;", "scope", "Landroidx/lifecycle/l0;", "b", "Landroidx/lifecycle/l0;", "savedStateHandle", "<init>", "(Lkotlinx/coroutines/q0;Landroidx/lifecycle/l0;)V", "(Landroidx/lifecycle/l0;)V", "reactivestate_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class h implements u0 {

    /* renamed from: a */
    private final q0 f6784a;

    /* renamed from: b */
    private final l0 f6785b;

    /* renamed from: c */
    private final c0 f6786c;

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Ls4/r0;", "Ltb/e0;", "b", "(Ls4/r0;)V"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    static final class a extends v implements gc.l<r0, e0> {

        /* renamed from: c */
        final /* synthetic */ s4.l0<T> f6787c;

        /* renamed from: d */
        final /* synthetic */ d0<T> f6788d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(s4.l0<T> l0Var, d0<T> d0Var) {
            super(1);
            this.f6787c = l0Var;
            this.f6788d = d0Var;
        }

        public final void b(r0 r0Var) {
            t.e(r0Var, "$this$autoRun");
            this.f6787c.setValue(s4.c.a(r0Var, this.f6788d));
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ e0 invoke(r0 r0Var) {
            b(r0Var);
            return e0.f22152a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "Ltb/e0;", "b", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    static final class b extends v implements gc.l<T, e0> {

        /* renamed from: c */
        final /* synthetic */ d0<T> f6789c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(d0<T> d0Var) {
            super(1);
            this.f6789c = d0Var;
        }

        public final void b(T t10) {
            this.f6789c.k(t10);
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ e0 invoke(Object obj) {
            b(obj);
            return e0.f22152a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(l0 l0Var) {
        this(null, l0Var);
        t.e(l0Var, "savedStateHandle");
    }

    public h(q0 q0Var, l0 l0Var) {
        t.e(l0Var, "savedStateHandle");
        this.f6784a = q0Var;
        this.f6785b = l0Var;
        this.f6786c = new c0(null, 1, null);
    }

    @Override // s4.u0
    public <T> s4.l0<T> a(String str, T t10) {
        t.e(str, "key");
        if (this.f6786c.b(str)) {
            return this.f6786c.a(str, t10);
        }
        d0<T> f10 = this.f6785b.f(str, t10);
        t.d(f10, "savedStateHandle.getLiveData(key, default)");
        s4.l0<T> c10 = this.f6786c.c(str, f10.e(), new b(f10));
        q0 q0Var = this.f6784a;
        if (q0Var != null) {
            s4.b.c(q0Var, null, null, new a(c10, f10), 3, null);
        }
        return c10;
    }
}
