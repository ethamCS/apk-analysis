package qa;

import java.io.Closeable;
import kotlin.Metadata;
import kotlinx.coroutines.l0;
import tb.e0;
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/l0;", "Ltb/e0;", "b", "(Lkotlinx/coroutines/l0;)Ltb/e0;", "ktor-client-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class d {
    public static final e0 b(l0 l0Var) {
        try {
            Closeable closeable = l0Var instanceof Closeable ? (Closeable) l0Var : null;
            if (closeable == null) {
                return null;
            }
            closeable.close();
            return e0.f22152a;
        } catch (Throwable unused) {
            return e0.f22152a;
        }
    }
}
