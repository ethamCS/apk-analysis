package fb;

import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J5\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0016¢\u0006\u0004\b\b\u0010\tR,\u0010\u000b\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00020\n8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lfb/r;", "Lfb/c;", BuildConfig.FLAVOR, "T", "Lfb/a;", "key", "Lkotlin/Function0;", "block", "d", "(Lfb/a;Lgc/a;)Ljava/lang/Object;", BuildConfig.FLAVOR, "map", "Ljava/util/Map;", "g", "()Ljava/util/Map;", "<init>", "()V", "ktor-utils"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
final class r extends c {

    /* renamed from: a */
    private final Map<a<?>, Object> f10135a = new HashMap();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fb.b
    public <T> T d(a<T> aVar, gc.a<? extends T> aVar2) {
        hc.t.e(aVar, "key");
        hc.t.e(aVar2, "block");
        T t10 = (T) g().get(aVar);
        if (t10 == null) {
            T invoke = aVar2.invoke();
            T t11 = (T) g().put(aVar, invoke);
            return t11 == null ? invoke : t11;
        }
        return t10;
    }

    @Override // fb.c
    protected Map<a<?>, Object> g() {
        return this.f10135a;
    }
}
