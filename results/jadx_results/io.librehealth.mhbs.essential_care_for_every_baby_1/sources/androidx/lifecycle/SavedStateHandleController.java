package androidx.lifecycle;

import androidx.lifecycle.e;
/* loaded from: classes.dex */
final class SavedStateHandleController implements g {

    /* renamed from: a */
    private boolean f249a;

    /* renamed from: androidx.lifecycle.SavedStateHandleController$1 */
    /* loaded from: classes.dex */
    final class AnonymousClass1 implements g {

        /* renamed from: a */
        final /* synthetic */ e f250a;

        /* renamed from: b */
        final /* synthetic */ androidx.savedstate.a f251b;

        @Override // androidx.lifecycle.g
        public void g(i iVar, e.a aVar) {
            if (aVar != e.a.ON_START) {
                return;
            }
            this.f250a.b(this);
            this.f251b.b(a.class);
            throw null;
        }
    }

    /* loaded from: classes.dex */
    static final class a {
        a() {
        }
    }

    @Override // androidx.lifecycle.g
    public void g(i iVar, e.a aVar) {
        if (aVar == e.a.ON_DESTROY) {
            this.f249a = false;
            iVar.a().b(this);
        }
    }
}
