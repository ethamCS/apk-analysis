package com.ensody.reactivestate.android;

import androidx.lifecycle.s0;
import hc.t;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import s4.u0;
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010R'\u0010\t\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/ensody/reactivestate/android/l;", "Landroidx/lifecycle/s0;", BuildConfig.FLAVOR, "Loc/d;", BuildConfig.FLAVOR, "e", "Ljava/util/Map;", "f", "()Ljava/util/Map;", "registry", "Ls4/u0;", "stateFlowStore", "Ls4/u0;", "g", "()Ls4/u0;", "<init>", "(Ls4/u0;)V", "reactivestate_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class l extends s0 {

    /* renamed from: d */
    private final u0 f6795d;

    /* renamed from: e */
    private final Map<oc.d<?>, Object> f6796e = new LinkedHashMap();

    public l(u0 u0Var) {
        t.e(u0Var, "stateFlowStore");
        this.f6795d = u0Var;
    }

    public final Map<oc.d<?>, Object> f() {
        return this.f6796e;
    }

    public final u0 g() {
        return this.f6795d;
    }
}
