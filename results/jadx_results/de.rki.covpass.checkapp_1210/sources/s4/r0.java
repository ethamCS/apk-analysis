package s4;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0019\u0010\u001aJC\u0010\t\u001a\u00028\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0001\"\u000e\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0002\u0010\u00052\u0006\u0010\u0006\u001a\u00028\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R*\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u00148\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Ls4/r0;", BuildConfig.FLAVOR, "S", "Ls4/f;", "T", "V", "underlyingObservable", "Lkotlin/Function0;", "getObservable", "d", "(Ljava/lang/Object;Lgc/a;)Ls4/f;", "next", "Ltb/e0;", "c", "(Ls4/r0;)V", "Ls4/g;", "autoRunner", "Ls4/g;", "a", "()Ls4/g;", BuildConfig.FLAVOR, "observables", "Ljava/util/Map;", "b", "()Ljava/util/Map;", "<init>", "(Ls4/g;)V", "reactivestate_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: a */
    private final g f21439a;

    /* renamed from: b */
    private final Map<Object, f<?>> f21440b = new LinkedHashMap();

    public r0(g gVar) {
        hc.t.e(gVar, "autoRunner");
        this.f21439a = gVar;
    }

    public final g a() {
        return this.f21439a;
    }

    public final Map<Object, f<?>> b() {
        return this.f21440b;
    }

    public final void c(r0 r0Var) {
        hc.t.e(r0Var, "next");
        for (Map.Entry<Object, f<?>> entry : this.f21440b.entrySet()) {
            Object key = entry.getKey();
            f<?> value = entry.getValue();
            if (!hc.t.a(value, r0Var.f21440b.get(key))) {
                value.a();
            }
        }
    }

    public final <S, T extends f<V>, V> T d(S s10, gc.a<? extends T> aVar) {
        hc.t.e(s10, "underlyingObservable");
        hc.t.e(aVar, "getObservable");
        f<?> fVar = this.f21439a.c().f21440b.get(s10);
        f<?> fVar2 = fVar == null ? null : fVar;
        T invoke = fVar2 == null ? aVar.invoke() : (T) fVar2;
        this.f21440b.put(s10, invoke);
        if (this.f21439a.e() && fVar2 == null) {
            invoke.b();
            if (fVar != null) {
                fVar.a();
            }
        }
        return invoke;
    }
}
