package androidx.lifecycle;

import androidx.lifecycle.e;
import androidx.savedstate.SavedStateRegistry;
/* loaded from: classes.dex */
final class SavedStateHandleController implements g {

    /* renamed from: a */
    private boolean f1217a;

    /* renamed from: b */
    private final s f1218b;

    /* renamed from: androidx.lifecycle.SavedStateHandleController$1 */
    /* loaded from: classes.dex */
    final class AnonymousClass1 implements g {

        /* renamed from: a */
        final /* synthetic */ e f1219a;

        /* renamed from: b */
        final /* synthetic */ SavedStateRegistry f1220b;

        @Override // androidx.lifecycle.g
        public void d(i iVar, e.a aVar) {
            if (aVar == e.a.ON_START) {
                this.f1219a.c(this);
                this.f1220b.e(a.class);
            }
        }
    }

    /* loaded from: classes.dex */
    static final class a implements SavedStateRegistry.a {
        a() {
        }

        @Override // androidx.savedstate.SavedStateRegistry.a
        public void a(androidx.savedstate.b bVar) {
            if (bVar instanceof w) {
                v h2 = ((w) bVar).h();
                SavedStateRegistry d2 = bVar.d();
                for (String str : h2.c()) {
                    SavedStateHandleController.h(h2.b(str), d2, bVar.a());
                }
                if (h2.c().isEmpty()) {
                    return;
                }
                d2.e(a.class);
                return;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on componentsthat implement ViewModelStoreOwner");
        }
    }

    static void h(t tVar, SavedStateRegistry savedStateRegistry, e eVar) {
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) tVar.c("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController == null || savedStateHandleController.j()) {
            return;
        }
        savedStateHandleController.i(savedStateRegistry, eVar);
        throw null;
    }

    @Override // androidx.lifecycle.g
    public void d(i iVar, e.a aVar) {
        if (aVar == e.a.ON_DESTROY) {
            this.f1217a = false;
            iVar.a().c(this);
        }
    }

    void i(SavedStateRegistry savedStateRegistry, e eVar) {
        if (this.f1217a) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f1217a = true;
        eVar.a(this);
        this.f1218b.a();
        throw null;
    }

    boolean j() {
        return this.f1217a;
    }
}
