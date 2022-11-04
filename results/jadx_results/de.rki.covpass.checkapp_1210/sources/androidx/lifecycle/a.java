package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.v0;
/* loaded from: classes.dex */
public abstract class a extends v0.d implements v0.b {

    /* renamed from: a */
    private k1.c f4294a;

    /* renamed from: b */
    private m f4295b;

    /* renamed from: c */
    private Bundle f4296c;

    @SuppressLint({"LambdaLast"})
    public a(k1.e eVar, Bundle bundle) {
        this.f4294a = eVar.g();
        this.f4295b = eVar.c();
        this.f4296c = bundle;
    }

    private <T extends s0> T d(String str, Class<T> cls) {
        SavedStateHandleController b10 = LegacySavedStateHandleController.b(this.f4294a, this.f4295b, str, this.f4296c);
        T t10 = (T) e(str, cls, b10.b());
        t10.e("androidx.lifecycle.savedstate.vm.tag", b10);
        return t10;
    }

    @Override // androidx.lifecycle.v0.b
    public final <T extends s0> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            if (this.f4295b == null) {
                throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
            }
            return (T) d(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.v0.b
    public final <T extends s0> T b(Class<T> cls, e1.a aVar) {
        String str = (String) aVar.a(v0.c.f4395b);
        if (str != null) {
            return this.f4294a != null ? (T) d(str, cls) : (T) e(str, cls, m0.a(aVar));
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    @Override // androidx.lifecycle.v0.d
    public void c(s0 s0Var) {
        k1.c cVar = this.f4294a;
        if (cVar != null) {
            LegacySavedStateHandleController.a(s0Var, cVar, this.f4295b);
        }
    }

    protected abstract <T extends s0> T e(String str, Class<T> cls, l0 l0Var);
}
