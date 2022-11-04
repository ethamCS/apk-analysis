package androidx.activity;

import androidx.lifecycle.e;
import androidx.lifecycle.g;
import androidx.lifecycle.i;
/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {

    /* loaded from: classes.dex */
    private class LifecycleOnBackPressedCancellable implements g, a {

        /* renamed from: a */
        private final e f151a;

        /* renamed from: b */
        private final c f152b;

        /* renamed from: c */
        private a f153c;

        /* renamed from: d */
        final /* synthetic */ OnBackPressedDispatcher f154d;

        @Override // androidx.activity.a
        public void cancel() {
            this.f151a.b(this);
            this.f152b.a(this);
            a aVar = this.f153c;
            if (aVar != null) {
                aVar.cancel();
                this.f153c = null;
            }
        }

        @Override // androidx.lifecycle.g
        public void g(i iVar, e.a aVar) {
            if (aVar == e.a.ON_START) {
                this.f154d.a(this.f152b);
                throw null;
            } else if (aVar != e.a.ON_STOP) {
                if (aVar != e.a.ON_DESTROY) {
                    return;
                }
                cancel();
            } else {
                a aVar2 = this.f153c;
                if (aVar2 == null) {
                    return;
                }
                aVar2.cancel();
            }
        }
    }

    a a(c cVar) {
        throw null;
    }

    public void b() {
        throw null;
    }
}
