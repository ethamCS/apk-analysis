package s4;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlinx.coroutines.a2;
import kotlinx.coroutines.h1;
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0014\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0005H\u0016¨\u0006\r"}, d2 = {"Ls4/s;", "Ls4/r;", "Lkotlinx/coroutines/h1;", "Lcom/ensody/reactivestate/Disposable;", "disposable", "Ltb/e0;", "a", "Lkotlinx/coroutines/a2;", "job", "b", "g", "<init>", "()V", "reactivestate_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
final class s implements r {

    /* renamed from: c */
    private final Set<h1> f21441c = new LinkedHashSet();

    /* renamed from: d */
    private final Set<a2> f21442d = new LinkedHashSet();

    @Override // s4.r
    public void a(h1 h1Var) {
        hc.t.e(h1Var, "disposable");
        if (h1Var instanceof e0) {
            b(((e0) h1Var).b());
        } else {
            this.f21441c.add(h1Var);
        }
    }

    public void b(a2 a2Var) {
        hc.t.e(a2Var, "job");
        this.f21442d.add(a2Var);
    }

    @Override // kotlinx.coroutines.h1
    public void g() {
        for (a2 a2Var : this.f21442d) {
            a2.a.a(a2Var, null, 1, null);
        }
        this.f21442d.clear();
        for (h1 h1Var : this.f21441c) {
            h1Var.g();
        }
        this.f21441c.clear();
    }
}
