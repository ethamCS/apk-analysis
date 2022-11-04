package ob;

import java.io.EOFException;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000\u001a\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000H\u0000\u001a\u0014\u0010\t\u001a\u00020\u0003*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0000H\u0000\u001a\u0014\u0010\n\u001a\u00020\u0003*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0000H\u0000\u001a\u0014\u0010\r\u001a\u00020\f*\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0000H\u0000\u001a\u0014\u0010\u000e\u001a\u00020\f*\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0000H\u0000\u001a\u0014\u0010\u000f\u001a\u00020\f*\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0000H\u0000\u001a\u0014\u0010\u0011\u001a\u00020\f*\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0000H\u0000¨\u0006\u0012"}, d2 = {BuildConfig.FLAVOR, "count", "readRemaining", BuildConfig.FLAVOR, "b", "writeRemaining", "a", "Lob/e;", "startGap", "h", "g", "endGap", "Ltb/e0;", "c", "e", "d", "size", "f", "ktor-io"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class i {
    public static final Void a(int i10, int i11) {
        throw new EOFException("Unable to discard " + i10 + " bytes: only " + i11 + " available for writing");
    }

    public static final Void b(int i10, int i11) {
        throw new EOFException("Unable to discard " + i10 + " bytes: only " + i11 + " available for reading");
    }

    public static final void c(e eVar, int i10) {
        hc.t.e(eVar, "<this>");
        throw new IllegalArgumentException("End gap " + i10 + " is too big: capacity is " + eVar.i());
    }

    public static final void d(e eVar, int i10) {
        hc.t.e(eVar, "<this>");
        throw new IllegalArgumentException("Unable to reserve end gap " + i10 + ": there are already " + (eVar.s() - eVar.p()) + " content bytes at offset " + eVar.p());
    }

    public static final void e(e eVar, int i10) {
        hc.t.e(eVar, "<this>");
        throw new IllegalArgumentException("End gap " + i10 + " is too big: there are already " + eVar.r() + " bytes reserved in the beginning");
    }

    public static final void f(e eVar, int i10) {
        hc.t.e(eVar, "<this>");
        eVar.B(eVar.p() - i10);
    }

    public static final Void g(e eVar, int i10) {
        hc.t.e(eVar, "<this>");
        throw new IllegalStateException("Unable to reserve " + i10 + " start gap: there are already " + (eVar.s() - eVar.p()) + " content bytes starting at offset " + eVar.p());
    }

    public static final Void h(e eVar, int i10) {
        hc.t.e(eVar, "<this>");
        if (i10 > eVar.i()) {
            throw new IllegalArgumentException("Start gap " + i10 + " is bigger than the capacity " + eVar.i());
        }
        throw new IllegalStateException("Unable to reserve " + i10 + " start gap: there are already " + (eVar.i() - eVar.j()) + " bytes reserved in the end");
    }
}
