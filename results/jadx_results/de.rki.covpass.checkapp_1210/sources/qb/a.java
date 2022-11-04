package qb;

import hc.t;
import kotlin.Metadata;
import ob.e;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a(\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0000¨\u0006\b"}, d2 = {"Lob/e;", "destination", BuildConfig.FLAVOR, "offset", "min", "max", "Ltb/e0;", "a", "ktor-io"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class a {
    public static final void a(e eVar, int i10, int i11, int i12) {
        t.e(eVar, "destination");
        boolean z10 = true;
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("offset shouldn't be negative: " + i10 + '.').toString());
        }
        if (!(i11 >= 0)) {
            throw new IllegalArgumentException(("min shouldn't be negative: " + i11 + '.').toString());
        }
        if (!(i12 >= i11)) {
            throw new IllegalArgumentException(("max should't be less than min: max = " + i12 + ", min = " + i11 + '.').toString());
        }
        if (i11 > eVar.j() - eVar.s()) {
            z10 = false;
        }
        if (z10) {
            return;
        }
        throw new IllegalArgumentException(("Not enough free space in the destination buffer to write the specified minimum number of bytes: min = " + i11 + ", free = " + (eVar.j() - eVar.s()) + '.').toString());
    }
}
