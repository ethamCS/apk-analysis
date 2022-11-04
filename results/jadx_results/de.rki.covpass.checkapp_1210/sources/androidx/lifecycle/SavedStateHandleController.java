package androidx.lifecycle;

import androidx.lifecycle.m;
/* loaded from: classes.dex */
final class SavedStateHandleController implements s {

    /* renamed from: c */
    private final String f4286c;

    /* renamed from: d */
    private boolean f4287d = false;

    /* renamed from: q */
    private final l0 f4288q;

    public SavedStateHandleController(String str, l0 l0Var) {
        this.f4286c = str;
        this.f4288q = l0Var;
    }

    public void a(k1.c cVar, m mVar) {
        if (!this.f4287d) {
            this.f4287d = true;
            mVar.a(this);
            cVar.h(this.f4286c, this.f4288q.h());
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner");
    }

    public l0 b() {
        return this.f4288q;
    }

    public boolean d() {
        return this.f4287d;
    }

    @Override // androidx.lifecycle.s
    public void f(v vVar, m.b bVar) {
        if (bVar == m.b.ON_DESTROY) {
            this.f4287d = false;
            vVar.c().c(this);
        }
    }
}
