package s4;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¨\u0006\u0007"}, d2 = {"T", BuildConfig.FLAVOR, "capacity", "Ldf/h;", "onBufferOverflow", "Ls4/i0;", "a", "reactivestate_release"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class k0 {
    public static final <T> i0<T> a(int i10, df.h hVar) {
        hc.t.e(hVar, "onBufferOverflow");
        return new j0(df.l.b(i10, hVar, null, 4, null));
    }

    public static /* synthetic */ i0 b(int i10, df.h hVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        if ((i11 & 2) != 0) {
            hVar = df.h.SUSPEND;
        }
        return a(i10, hVar);
    }
}
