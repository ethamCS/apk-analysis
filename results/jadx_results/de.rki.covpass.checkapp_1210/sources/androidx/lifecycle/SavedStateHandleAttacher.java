package androidx.lifecycle;

import androidx.lifecycle.m;
import kotlin.Metadata;
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Landroidx/lifecycle/SavedStateHandleAttacher;", "Landroidx/lifecycle/s;", "Landroidx/lifecycle/v;", "source", "Landroidx/lifecycle/m$b;", "event", "Ltb/e0;", "f", "Landroidx/lifecycle/n0;", "c", "Landroidx/lifecycle/n0;", "provider", "<init>", "(Landroidx/lifecycle/n0;)V", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class SavedStateHandleAttacher implements s {

    /* renamed from: c */
    private final n0 f4285c;

    public SavedStateHandleAttacher(n0 n0Var) {
        hc.t.e(n0Var, "provider");
        this.f4285c = n0Var;
    }

    @Override // androidx.lifecycle.s
    public void f(v vVar, m.b bVar) {
        hc.t.e(vVar, "source");
        hc.t.e(bVar, "event");
        if (bVar == m.b.ON_CREATE) {
            vVar.c().c(this);
            this.f4285c.d();
            return;
        }
        throw new IllegalStateException(("Next event must be ON_CREATE, it was " + bVar).toString());
    }
}
