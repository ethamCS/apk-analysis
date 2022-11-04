package fb;

import fb.b;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import ub.c0;
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\b\"\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0006\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\b2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0086\u0002J-\u0010\f\u001a\u00020\u000b\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\rR&\u0010\u0011\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000e8$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0015\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lfb/c;", "Lfb/b;", BuildConfig.FLAVOR, "T", "Lfb/a;", "key", "e", "(Lfb/a;)Ljava/lang/Object;", BuildConfig.FLAVOR, "b", "value", "Ltb/e0;", "a", "(Lfb/a;Ljava/lang/Object;)V", BuildConfig.FLAVOR, "g", "()Ljava/util/Map;", "map", BuildConfig.FLAVOR, "f", "()Ljava/util/List;", "allKeys", "<init>", "()V", "ktor-utils"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
abstract class c implements b {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // fb.b
    public final <T> void a(a<T> aVar, T t10) {
        hc.t.e(aVar, "key");
        hc.t.e(t10, "value");
        g().put(aVar, t10);
    }

    @Override // fb.b
    public final boolean b(a<?> aVar) {
        hc.t.e(aVar, "key");
        return g().containsKey(aVar);
    }

    @Override // fb.b
    public <T> T c(a<T> aVar) {
        return (T) b.a.a(this, aVar);
    }

    @Override // fb.b
    public final <T> T e(a<T> aVar) {
        hc.t.e(aVar, "key");
        return (T) g().get(aVar);
    }

    @Override // fb.b
    public final List<a<?>> f() {
        List<a<?>> F0;
        F0 = c0.F0(g().keySet());
        return F0;
    }

    protected abstract Map<a<?>, Object> g();
}
