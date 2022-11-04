package com.ensody.reactivestate.android;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.l0;
import androidx.lifecycle.s0;
import androidx.lifecycle.v0;
import hc.t;
import hc.v;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/s0;", "T", "Landroidx/lifecycle/v0$b;", "b", "()Landroidx/lifecycle/v0$b;"}, k = 3, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class g extends v implements gc.a<v0.b> {

    /* renamed from: c */
    final /* synthetic */ Fragment f6783c;

    @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J7\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"com/ensody/reactivestate/android/g$a", "Landroidx/lifecycle/a;", "Landroidx/lifecycle/s0;", "T", BuildConfig.FLAVOR, "key", "Ljava/lang/Class;", "modelClass", "Landroidx/lifecycle/l0;", "handle", "e", "(Ljava/lang/String;Ljava/lang/Class;Landroidx/lifecycle/l0;)Landroidx/lifecycle/s0;", "reactivestate_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a extends androidx.lifecycle.a {
        public a(Fragment fragment) {
            super(fragment, null);
        }

        @Override // androidx.lifecycle.a
        protected <T extends s0> T e(String str, Class<T> cls, l0 l0Var) {
            t.e(str, "key");
            t.e(cls, "modelClass");
            t.e(l0Var, "handle");
            return new l(new h(l0Var));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Fragment fragment) {
        super(0);
        this.f6783c = fragment;
    }

    /* renamed from: b */
    public final v0.b invoke() {
        return new a(this.f6783c);
    }
}
