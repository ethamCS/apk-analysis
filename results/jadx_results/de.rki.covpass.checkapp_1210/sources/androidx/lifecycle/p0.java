package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.v0;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B%\b\u0017\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b!\u0010\"J/\u0010\t\u001a\u00028\u0000\"\b\b\u0000\u0010\u0004*\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ-\u0010\r\u001a\u00028\u0000\"\b\b\u0000\u0010\u0004*\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u000f\u001a\u00028\u0000\"\b\b\u0000\u0010\u0004*\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0003H\u0017R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0017R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001aR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001d¨\u0006#"}, d2 = {"Landroidx/lifecycle/p0;", "Landroidx/lifecycle/v0$d;", "Landroidx/lifecycle/v0$b;", "Landroidx/lifecycle/s0;", "T", "Ljava/lang/Class;", "modelClass", "Le1/a;", "extras", "b", "(Ljava/lang/Class;Le1/a;)Landroidx/lifecycle/s0;", BuildConfig.FLAVOR, "key", "d", "(Ljava/lang/String;Ljava/lang/Class;)Landroidx/lifecycle/s0;", "a", "(Ljava/lang/Class;)Landroidx/lifecycle/s0;", "viewModel", "Ltb/e0;", "c", "Landroid/app/Application;", "Landroid/app/Application;", "application", "Landroidx/lifecycle/v0$b;", "factory", "Landroid/os/Bundle;", "Landroid/os/Bundle;", "defaultArgs", "Landroidx/lifecycle/m;", "Landroidx/lifecycle/m;", "lifecycle", "Lk1/e;", "owner", "<init>", "(Landroid/app/Application;Lk1/e;Landroid/os/Bundle;)V", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class p0 extends v0.d implements v0.b {

    /* renamed from: a */
    private Application f4363a;

    /* renamed from: b */
    private final v0.b f4364b;

    /* renamed from: c */
    private Bundle f4365c;

    /* renamed from: d */
    private m f4366d;

    /* renamed from: e */
    private k1.c f4367e;

    @SuppressLint({"LambdaLast"})
    public p0(Application application, k1.e eVar, Bundle bundle) {
        hc.t.e(eVar, "owner");
        this.f4367e = eVar.g();
        this.f4366d = eVar.c();
        this.f4365c = bundle;
        this.f4363a = application;
        this.f4364b = application != null ? v0.a.Companion.a(application) : new v0.a();
    }

    @Override // androidx.lifecycle.v0.b
    public <T extends s0> T a(Class<T> cls) {
        hc.t.e(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) d(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.v0.b
    public <T extends s0> T b(Class<T> cls, e1.a aVar) {
        hc.t.e(cls, "modelClass");
        hc.t.e(aVar, "extras");
        String str = (String) aVar.a(v0.c.f4395b);
        if (str != null) {
            if (aVar.a(m0.f4345a) == null || aVar.a(m0.f4346b) == null) {
                if (this.f4366d == null) {
                    throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
                }
                return (T) d(str, cls);
            }
            Application application = (Application) aVar.a(v0.a.f4390e);
            boolean isAssignableFrom = b.class.isAssignableFrom(cls);
            Constructor c10 = q0.c(cls, (!isAssignableFrom || application == null) ? q0.f4369b : q0.f4368a);
            return c10 == null ? (T) this.f4364b.b(cls, aVar) : (!isAssignableFrom || application == null) ? (T) q0.d(cls, c10, m0.a(aVar)) : (T) q0.d(cls, c10, application, m0.a(aVar));
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    @Override // androidx.lifecycle.v0.d
    public void c(s0 s0Var) {
        hc.t.e(s0Var, "viewModel");
        m mVar = this.f4366d;
        if (mVar != null) {
            LegacySavedStateHandleController.a(s0Var, this.f4367e, mVar);
        }
    }

    public final <T extends s0> T d(String str, Class<T> cls) {
        T t10;
        Application application;
        hc.t.e(str, "key");
        hc.t.e(cls, "modelClass");
        if (this.f4366d != null) {
            boolean isAssignableFrom = b.class.isAssignableFrom(cls);
            Constructor c10 = q0.c(cls, (!isAssignableFrom || this.f4363a == null) ? q0.f4369b : q0.f4368a);
            if (c10 == null) {
                return this.f4363a != null ? (T) this.f4364b.a(cls) : (T) v0.c.Companion.a().a(cls);
            }
            SavedStateHandleController b10 = LegacySavedStateHandleController.b(this.f4367e, this.f4366d, str, this.f4365c);
            if (!isAssignableFrom || (application = this.f4363a) == null) {
                l0 b11 = b10.b();
                hc.t.d(b11, "controller.handle");
                t10 = (T) q0.d(cls, c10, b11);
            } else {
                hc.t.b(application);
                l0 b12 = b10.b();
                hc.t.d(b12, "controller.handle");
                t10 = (T) q0.d(cls, c10, application, b12);
            }
            t10.e("androidx.lifecycle.savedstate.vm.tag", b10);
            return t10;
        }
        throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
    }
}
