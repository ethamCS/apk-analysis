package tb;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import tb.s;
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001\u001a\u001a\u0010\u0006\u001a\u00020\u0005*\u0006\u0012\u0002\b\u00030\u0004H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {BuildConfig.FLAVOR, "exception", BuildConfig.FLAVOR, "a", "Ltb/s;", "Ltb/e0;", "b", "(Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class t {
    public static final Object a(Throwable th2) {
        hc.t.e(th2, "exception");
        return new s.b(th2);
    }

    public static final void b(Object obj) {
        if (!(obj instanceof s.b)) {
            return;
        }
        throw ((s.b) obj).f22170c;
    }
}
