package androidx.savedstate;

import android.annotation.SuppressLint;
import androidx.lifecycle.e;
import androidx.lifecycle.g;
import androidx.lifecycle.i;
@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
final class Recreator implements g {

    /* renamed from: a */
    private final b f297a;

    @Override // androidx.lifecycle.g
    public void g(i iVar, e.a aVar) {
        if (aVar != e.a.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        iVar.a().b(this);
        this.f297a.j().a("androidx.savedstate.Restarter");
        throw null;
    }
}
