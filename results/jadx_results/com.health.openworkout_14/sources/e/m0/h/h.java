package e.m0.h;

import e.k0;
import java.util.LinkedHashSet;
import java.util.Set;
/* loaded from: classes.dex */
final class h {

    /* renamed from: a */
    private final Set<k0> f4128a = new LinkedHashSet();

    public synchronized void a(k0 k0Var) {
        this.f4128a.remove(k0Var);
    }

    public synchronized void b(k0 k0Var) {
        this.f4128a.add(k0Var);
    }

    public synchronized boolean c(k0 k0Var) {
        return this.f4128a.contains(k0Var);
    }
}
