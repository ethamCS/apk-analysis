package ob;

import java.nio.ByteBuffer;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0004\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u001a\u0014\u0010\u0005\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u001a\u0014\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0002H\u0002¨\u0006\t"}, d2 = {"Lob/e;", "other", BuildConfig.FLAVOR, "maxSize", "a", "c", "writeSize", "Ltb/e0;", "b", "ktor-io"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class f {
    public static final int a(e eVar, e eVar2, int i10) {
        hc.t.e(eVar, "<this>");
        hc.t.e(eVar2, "other");
        int min = Math.min(eVar2.s() - eVar2.p(), i10);
        if (eVar.j() - eVar.s() <= min) {
            b(eVar, min);
        }
        ByteBuffer n10 = eVar.n();
        int s10 = eVar.s();
        eVar.j();
        ByteBuffer n11 = eVar2.n();
        int p10 = eVar2.p();
        eVar2.s();
        lb.c.c(n11, n10, p10, min, s10);
        eVar2.f(min);
        eVar.b(min);
        return min;
    }

    private static final void b(e eVar, int i10) {
        if ((eVar.j() - eVar.s()) + (eVar.i() - eVar.j()) >= i10) {
            if ((eVar.s() + i10) - eVar.j() <= 0) {
                return;
            }
            eVar.u();
            return;
        }
        throw new IllegalArgumentException("Can't append buffer: not enough free space at the end");
    }

    public static final int c(e eVar, e eVar2) {
        hc.t.e(eVar, "<this>");
        hc.t.e(eVar2, "other");
        int s10 = eVar2.s() - eVar2.p();
        int p10 = eVar.p();
        if (p10 >= s10) {
            int i10 = p10 - s10;
            lb.c.c(eVar2.n(), eVar.n(), eVar2.p(), s10, i10);
            eVar2.f(s10);
            eVar.B(i10);
            return s10;
        }
        throw new IllegalArgumentException("Not enough space in the beginning to prepend bytes");
    }
}
