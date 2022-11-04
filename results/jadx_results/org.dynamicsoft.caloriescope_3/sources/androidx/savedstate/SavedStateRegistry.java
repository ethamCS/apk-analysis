package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.d;
import androidx.lifecycle.e;
import androidx.lifecycle.h;
import java.util.Map;
@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public final class SavedStateRegistry {

    /* renamed from: a */
    private a.b.a.b.b<String, b> f1151a = new a.b.a.b.b<>();

    /* renamed from: b */
    private Bundle f1152b;

    /* renamed from: c */
    private boolean f1153c;
    boolean d;

    /* loaded from: classes.dex */
    public interface a {
        void a(androidx.savedstate.b bVar);
    }

    /* loaded from: classes.dex */
    public interface b {
        Bundle a();
    }

    public Bundle a(String str) {
        if (this.f1153c) {
            Bundle bundle = this.f1152b;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(str);
            this.f1152b.remove(str);
            if (this.f1152b.isEmpty()) {
                this.f1152b = null;
            }
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }

    public void a(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f1152b;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        a.b.a.b.b<String, b>.d c2 = this.f1151a.c();
        while (c2.hasNext()) {
            Map.Entry next = c2.next();
            bundle2.putBundle((String) next.getKey(), ((b) next.getValue()).a());
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    public void a(e eVar, Bundle bundle) {
        if (!this.f1153c) {
            if (bundle != null) {
                this.f1152b = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            }
            eVar.a(new d() { // from class: androidx.savedstate.SavedStateRegistry.1
                @Override // androidx.lifecycle.f
                public void a(h hVar, e.a aVar) {
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
                    savedStateRegistry.d = z;
                }
            });
            this.f1153c = true;
            return;
        }
        throw new IllegalStateException("SavedStateRegistry was already restored.");
    }
}
