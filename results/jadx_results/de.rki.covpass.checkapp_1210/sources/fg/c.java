package fg;

import eg.x;
import hc.t;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a$\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0000\u001a\u0014\u0010\b\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0001H\u0000¨\u0006\t"}, d2 = {BuildConfig.FLAVOR, BuildConfig.FLAVOR, "value", "fromIndex", "toIndex", "a", "Leg/x;", "pos", "b", "okio"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class c {
    public static final int a(int[] iArr, int i10, int i11, int i12) {
        t.e(iArr, "<this>");
        int i13 = i12 - 1;
        while (i11 <= i13) {
            int i14 = (i11 + i13) >>> 1;
            int i15 = iArr[i14];
            if (i15 < i10) {
                i11 = i14 + 1;
            } else if (i15 <= i10) {
                return i14;
            } else {
                i13 = i14 - 1;
            }
        }
        return (-i11) - 1;
    }

    public static final int b(x xVar, int i10) {
        t.e(xVar, "<this>");
        int a10 = a(xVar.g0(), i10 + 1, 0, xVar.h0().length);
        return a10 >= 0 ? a10 : ~a10;
    }
}
