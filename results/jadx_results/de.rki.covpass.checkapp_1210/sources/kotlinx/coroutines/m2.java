package kotlinx.coroutines;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0005R\u0014\u0010\u0007\u001a\u00020\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lkotlinx/coroutines/m2;", "Lkotlinx/coroutines/l0;", BuildConfig.FLAVOR, "toString", "i1", "h1", "()Lkotlinx/coroutines/m2;", "immediate", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public abstract class m2 extends l0 {
    public abstract m2 h1();

    public final String i1() {
        m2 m2Var;
        m2 c10 = g1.c();
        if (this == c10) {
            return "Dispatchers.Main";
        }
        try {
            m2Var = c10.h1();
        } catch (UnsupportedOperationException unused) {
            m2Var = null;
        }
        if (this != m2Var) {
            return null;
        }
        return "Dispatchers.Main.immediate";
    }

    @Override // kotlinx.coroutines.l0
    public String toString() {
        String i12 = i1();
        if (i12 == null) {
            return u0.a(this) + '@' + u0.b(this);
        }
        return i12;
    }
}
