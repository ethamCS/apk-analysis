package s4;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\n\u001a\u00020\u0001\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J+\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Ls4/m0;", "Ls4/u0;", BuildConfig.FLAVOR, "key", "b", "T", "default", "Ls4/l0;", "a", "(Ljava/lang/String;Ljava/lang/Object;)Ls4/l0;", "store", "namespace", "<init>", "(Ls4/u0;Ljava/lang/String;)V", "reactivestate_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class m0 implements u0 {

    /* renamed from: a */
    private final u0 f21421a;

    /* renamed from: b */
    private final String f21422b;

    public m0(u0 u0Var, String str) {
        hc.t.e(u0Var, "store");
        hc.t.e(str, "namespace");
        this.f21421a = u0Var;
        this.f21422b = str;
    }

    private final String b(String str) {
        String str2 = this.f21422b;
        return str2 + "<<" + str;
    }

    @Override // s4.u0
    public <T> l0<T> a(String str, T t10) {
        hc.t.e(str, "key");
        return this.f21421a.a(b(str), t10);
    }
}
