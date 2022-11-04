package s4;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J%\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00028\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Ls4/v0;", "T", BuildConfig.FLAVOR, "value", BuildConfig.FLAVOR, "force", "Ltb/e0;", "d", "(Ljava/lang/Object;ZLxb/d;)Ljava/lang/Object;", "reactivestate_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public interface v0<T> extends kotlinx.coroutines.flow.w {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class a {
        public static /* synthetic */ Object a(v0 v0Var, Object obj, boolean z10, xb.d dVar, int i10, Object obj2) {
            if (obj2 == null) {
                if ((i10 & 2) != 0) {
                    z10 = false;
                }
                return v0Var.d(obj, z10, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: set");
        }
    }

    Object d(T t10, boolean z10, xb.d<? super tb.e0> dVar);
}
