package com.ensody.reactivestate.android;

import hc.t;
import kotlin.Metadata;
import kotlinx.coroutines.q0;
import org.conscrypt.BuildConfig;
import s4.u0;
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/ensody/reactivestate/android/b;", BuildConfig.FLAVOR, "Lkotlinx/coroutines/q0;", "a", "Lkotlinx/coroutines/q0;", "()Lkotlinx/coroutines/q0;", "scope", "Ls4/u0;", "stateFlowStore", "Ls4/u0;", "b", "()Ls4/u0;", "<init>", "(Lkotlinx/coroutines/q0;Ls4/u0;)V", "reactivestate_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    private final q0 f6759a;

    /* renamed from: b */
    private final u0 f6760b;

    public b(q0 q0Var, u0 u0Var) {
        t.e(q0Var, "scope");
        t.e(u0Var, "stateFlowStore");
        this.f6759a = q0Var;
        this.f6760b = u0Var;
    }

    public final q0 a() {
        return this.f6759a;
    }

    public final u0 b() {
        return this.f6760b;
    }
}
