package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.e;
import androidx.lifecycle.g;
import androidx.lifecycle.i;
import androidx.savedstate.Recreator;
import java.util.Map;
@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public final class SavedStateRegistry {

    /* renamed from: b */
    private Bundle f1965b;

    /* renamed from: c */
    private boolean f1966c;

    /* renamed from: d */
    private Recreator.a f1967d;

    /* renamed from: a */
    private b.b.a.b.b<String, b> f1964a = new b.b.a.b.b<>();

    /* renamed from: e */
    boolean f1968e = true;

    /* loaded from: classes.dex */
    public interface a {
        void a(androidx.savedstate.b bVar);
    }

    /* loaded from: classes.dex */
    public interface b {
        Bundle a();
    }

    public Bundle a(String str) {
        if (this.f1966c) {
            Bundle bundle = this.f1965b;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(str);
            this.f1965b.remove(str);
            if (this.f1965b.isEmpty()) {
                this.f1965b = null;
            }
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }

    public void b(e eVar, Bundle bundle) {
        if (!this.f1966c) {
            if (bundle != null) {
                this.f1965b = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            }
            eVar.a(new g() { // from class: androidx.savedstate.SavedStateRegistry.1
                @Override // androidx.lifecycle.g
                public void d(i iVar, e.a aVar) {
                    SavedStateRegistry savedStateRegistry;
                    boolean z;
                    if (aVar == e.a.ON_START) {
                        savedStateRegistry = SavedStateRegistry.this;
                        z = true;
                    } else if (aVar != e.a.ON_STOP) {
                        return;
                    } else {
                        savedStateRegistry = SavedStateRegistry.this;
                        z = false;
                    }
                    savedStateRegistry.f1968e = z;
                }
            });
            this.f1966c = true;
            return;
        }
        throw new IllegalStateException("SavedStateRegistry was already restored.");
    }

    public void c(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f1965b;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        b.b.a.b.b<String, b>.d d2 = this.f1964a.d();
        while (d2.hasNext()) {
            Map.Entry next = d2.next();
            bundle2.putBundle((String) next.getKey(), ((b) next.getValue()).a());
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    public void d(String str, b bVar) {
        if (this.f1964a.g(str, bVar) == null) {
            return;
        }
        throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
    }

    public void e(Class<? extends a> cls) {
        if (this.f1968e) {
            if (this.f1967d == null) {
                this.f1967d = new Recreator.a(this);
            }
            try {
                cls.getDeclaredConstructor(new Class[0]);
                this.f1967d.b(cls.getName());
                return;
            } catch (NoSuchMethodException e2) {
                throw new IllegalArgumentException("Class" + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
            }
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
    }
}
