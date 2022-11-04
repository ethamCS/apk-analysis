package com.ensody.reactivestate.android;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.m;
import androidx.lifecycle.w;
import hc.j0;
import hc.t;
import hc.v;
import kotlin.Metadata;
import kotlinx.coroutines.h1;
import kotlinx.coroutines.q0;
import org.conscrypt.BuildConfig;
import s4.n0;
import s4.r0;
import tb.e0;
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u0018\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a:\u0010\r\u001a\u00060\u0003j\u0002`\u0004*\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u0000\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u000bH\u0002\u001a\u001c\u0010\u0011\u001a\u00060\u0003j\u0002`\u0004*\u00020\u00002\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u001a\u001c\u0010\u0012\u001a\u00060\u0003j\u0002`\u0004*\u00020\u00002\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u001a\u001c\u0010\u0013\u001a\u00060\u0003j\u0002`\u0004*\u00020\u00002\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u001a\u001c\u0010\u0014\u001a\u00060\u0003j\u0002`\u0004*\u00020\u00002\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u001a\u001c\u0010\u0015\u001a\u00060\u0003j\u0002`\u0004*\u00020\u00002\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u001a\u001c\u0010\u0016\u001a\u00060\u0003j\u0002`\u0004*\u00020\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u001a&\u0010\u0017\u001a\u00060\u0003j\u0002`\u0004*\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0000\u001a\u001c\u0010\u0018\u001a\u00060\u0003j\u0002`\u0004*\u00020\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u001a&\u0010\u0019\u001a\u00060\u0003j\u0002`\u0004*\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0000¨\u0006\u001a"}, d2 = {"Landroidx/lifecycle/v;", "Lcom/ensody/reactivestate/android/DisposableObserver;", "observer", "Lkotlinx/coroutines/h1;", "Lcom/ensody/reactivestate/Disposable;", "a", "Landroidx/fragment/app/Fragment;", BuildConfig.FLAVOR, "once", "Lkotlinx/coroutines/q0;", "scope", "Lkotlin/Function1;", "create", "b", "Lkotlin/Function0;", "Ltb/e0;", "block", "j", "k", "l", "d", "e", "f", "g", "h", "i", "reactivestate_release"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class e {

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/e0;", "b", "()V"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a extends v implements gc.a<e0> {

        /* renamed from: c */
        final /* synthetic */ j0<h1> f6769c;

        /* renamed from: d */
        final /* synthetic */ s4.e<e0> f6770d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(j0<h1> j0Var, s4.e<e0> eVar) {
            super(0);
            this.f6769c = j0Var;
            this.f6770d = eVar;
        }

        public final void b() {
            h1 h1Var = this.f6769c.f11764c;
            if (h1Var != null) {
                h1Var.g();
            }
            this.f6770d.g();
        }

        @Override // gc.a
        public /* bridge */ /* synthetic */ e0 invoke() {
            b();
            return e0.f22152a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ls4/r0;", "Ltb/e0;", "b", "(Ls4/r0;)V"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class b extends v implements gc.l<r0, e0> {

        /* renamed from: c */
        final /* synthetic */ Fragment f6771c;

        /* renamed from: d */
        final /* synthetic */ j0<h1> f6772d;

        /* renamed from: q */
        final /* synthetic */ gc.l<androidx.lifecycle.v, h1> f6773q;

        /* renamed from: x */
        final /* synthetic */ boolean f6774x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Fragment fragment, j0<h1> j0Var, gc.l<? super androidx.lifecycle.v, ? extends h1> lVar, boolean z10) {
            super(1);
            this.f6771c = fragment;
            this.f6772d = j0Var;
            this.f6773q = lVar;
            this.f6774x = z10;
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [T, java.lang.Object] */
        public final void b(r0 r0Var) {
            t.e(r0Var, "$this$autoRun");
            LiveData<androidx.lifecycle.v> y02 = this.f6771c.y0();
            t.d(y02, "viewLifecycleOwnerLiveData");
            androidx.lifecycle.v vVar = (androidx.lifecycle.v) s4.c.a(r0Var, y02);
            if (vVar != null) {
                j0<h1> j0Var = this.f6772d;
                gc.l<androidx.lifecycle.v, h1> lVar = this.f6773q;
                boolean z10 = this.f6774x;
                j0Var.f11764c = lVar.invoke(vVar);
                if (!z10) {
                    return;
                }
                r0Var.a().g();
            }
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ e0 invoke(r0 r0Var) {
            b(r0Var);
            return e0.f22152a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/lifecycle/v;", "it", "Lkotlinx/coroutines/h1;", "Lcom/ensody/reactivestate/Disposable;", "b", "(Landroidx/lifecycle/v;)Lkotlinx/coroutines/h1;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class c extends v implements gc.l<androidx.lifecycle.v, h1> {

        /* renamed from: c */
        final /* synthetic */ gc.a<e0> f6775c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(gc.a<e0> aVar) {
            super(1);
            this.f6775c = aVar;
        }

        /* renamed from: b */
        public final h1 invoke(androidx.lifecycle.v vVar) {
            t.e(vVar, "it");
            return e.d(vVar, this.f6775c);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/lifecycle/v;", "it", "Lkotlinx/coroutines/h1;", "Lcom/ensody/reactivestate/Disposable;", "b", "(Landroidx/lifecycle/v;)Lkotlinx/coroutines/h1;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class d extends v implements gc.l<androidx.lifecycle.v, h1> {

        /* renamed from: c */
        final /* synthetic */ gc.a<e0> f6776c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(gc.a<e0> aVar) {
            super(1);
            this.f6776c = aVar;
        }

        /* renamed from: b */
        public final h1 invoke(androidx.lifecycle.v vVar) {
            t.e(vVar, "it");
            return e.e(vVar, this.f6776c);
        }
    }

    private static final h1 a(androidx.lifecycle.v vVar, DisposableObserver disposableObserver) {
        vVar.c().a(disposableObserver);
        return disposableObserver;
    }

    private static final h1 b(Fragment fragment, boolean z10, q0 q0Var, gc.l<? super androidx.lifecycle.v, ? extends h1> lVar) {
        j0 j0Var = new j0();
        return new n0(new a(j0Var, s4.b.c(q0Var, null, null, new b(fragment, j0Var, lVar, z10), 3, null)));
    }

    static /* synthetic */ h1 c(Fragment fragment, boolean z10, q0 q0Var, gc.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return b(fragment, z10, q0Var, lVar);
    }

    public static final h1 d(androidx.lifecycle.v vVar, gc.a<e0> aVar) {
        t.e(vVar, "<this>");
        t.e(aVar, "block");
        m c10 = vVar.c();
        t.d(c10, "lifecycle");
        return a(vVar, new OnDestroyObserver(c10, false, aVar));
    }

    public static final h1 e(androidx.lifecycle.v vVar, gc.a<e0> aVar) {
        t.e(vVar, "<this>");
        t.e(aVar, "block");
        m c10 = vVar.c();
        t.d(c10, "lifecycle");
        return a(vVar, new OnDestroyObserver(c10, true, aVar));
    }

    public static final h1 f(Fragment fragment, gc.a<e0> aVar) {
        t.e(fragment, "<this>");
        t.e(aVar, "block");
        return g(fragment, w.a(fragment), aVar);
    }

    public static final h1 g(Fragment fragment, q0 q0Var, gc.a<e0> aVar) {
        t.e(fragment, "<this>");
        t.e(q0Var, "scope");
        t.e(aVar, "block");
        return c(fragment, false, q0Var, new c(aVar), 1, null);
    }

    public static final h1 h(Fragment fragment, gc.a<e0> aVar) {
        t.e(fragment, "<this>");
        t.e(aVar, "block");
        return i(fragment, w.a(fragment), aVar);
    }

    public static final h1 i(Fragment fragment, q0 q0Var, gc.a<e0> aVar) {
        t.e(fragment, "<this>");
        t.e(q0Var, "scope");
        t.e(aVar, "block");
        return b(fragment, true, q0Var, new d(aVar));
    }

    public static final h1 j(androidx.lifecycle.v vVar, gc.a<e0> aVar) {
        t.e(vVar, "<this>");
        t.e(aVar, "block");
        m c10 = vVar.c();
        t.d(c10, "lifecycle");
        return a(vVar, new OnStartObserver(c10, false, aVar));
    }

    public static final h1 k(androidx.lifecycle.v vVar, gc.a<e0> aVar) {
        t.e(vVar, "<this>");
        t.e(aVar, "block");
        m c10 = vVar.c();
        t.d(c10, "lifecycle");
        return a(vVar, new OnStartObserver(c10, true, aVar));
    }

    public static final h1 l(androidx.lifecycle.v vVar, gc.a<e0> aVar) {
        t.e(vVar, "<this>");
        t.e(aVar, "block");
        m c10 = vVar.c();
        t.d(c10, "lifecycle");
        return a(vVar, new OnStopObserver(c10, true, aVar));
    }
}
