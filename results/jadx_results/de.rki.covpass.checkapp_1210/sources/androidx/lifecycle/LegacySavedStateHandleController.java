package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.m;
import k1.c;
/* loaded from: classes.dex */
public class LegacySavedStateHandleController {

    /* loaded from: classes.dex */
    public static final class a implements c.a {
        a() {
        }

        @Override // k1.c.a
        public void a(k1.e eVar) {
            if (eVar instanceof z0) {
                y0 I = ((z0) eVar).I();
                k1.c g10 = eVar.g();
                for (String str : I.c()) {
                    LegacySavedStateHandleController.a(I.b(str), g10, eVar.c());
                }
                if (I.c().isEmpty()) {
                    return;
                }
                g10.i(a.class);
                return;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
        }
    }

    public static void a(s0 s0Var, k1.c cVar, m mVar) {
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) s0Var.c("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController == null || savedStateHandleController.d()) {
            return;
        }
        savedStateHandleController.a(cVar, mVar);
        c(cVar, mVar);
    }

    public static SavedStateHandleController b(k1.c cVar, m mVar, String str, Bundle bundle) {
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, l0.e(cVar.b(str), bundle));
        savedStateHandleController.a(cVar, mVar);
        c(cVar, mVar);
        return savedStateHandleController;
    }

    private static void c(final k1.c cVar, final m mVar) {
        m.c b10 = mVar.b();
        if (b10 == m.c.INITIALIZED || b10.b(m.c.STARTED)) {
            cVar.i(a.class);
        } else {
            mVar.a(new s() { // from class: androidx.lifecycle.LegacySavedStateHandleController.1
                @Override // androidx.lifecycle.s
                public void f(v vVar, m.b bVar) {
                    if (bVar == m.b.ON_START) {
                        mVar.c(this);
                        cVar.i(a.class);
                    }
                }
            });
        }
    }
}
