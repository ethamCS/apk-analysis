package tf;

import hc.t;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import of.d0;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0002¨\u0006\f"}, d2 = {"Ltf/h;", BuildConfig.FLAVOR, "Lof/d0;", "failedRoute", "Ltb/e0;", "b", "route", "a", BuildConfig.FLAVOR, "c", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a */
    private final Set<d0> f22305a = new LinkedHashSet();

    public final synchronized void a(d0 d0Var) {
        t.e(d0Var, "route");
        this.f22305a.remove(d0Var);
    }

    public final synchronized void b(d0 d0Var) {
        t.e(d0Var, "failedRoute");
        this.f22305a.add(d0Var);
    }

    public final synchronized boolean c(d0 d0Var) {
        t.e(d0Var, "route");
        return this.f22305a.contains(d0Var);
    }
}
