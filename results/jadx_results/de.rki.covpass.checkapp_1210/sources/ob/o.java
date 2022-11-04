package ob;

import java.nio.ByteBuffer;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u001a\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000\u0001H\u0001\u001a\u001c\u0010\u0006\u001a\u00020\u0003*\u0004\u0018\u00010\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001H\u0000\u001a\r\u0010\u0007\u001a\u00020\u0005*\u00020\u0005H\u0080\u0010\u001a\f\u0010\t\u001a\u00020\b*\u00020\u0005H\u0007\u001a\u0015\u0010\u000b\u001a\u00020\b*\u00020\u00052\u0006\u0010\n\u001a\u00020\bH\u0082\u0010\u001a>\u0010\u0013\u001a\u00020\b*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\bH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lob/f0;", "Lrb/f;", "pool", "Ltb/e0;", "d", "Lpb/a;", "c", "a", BuildConfig.FLAVOR, "e", "n", "f", "Lob/e;", "Llb/c;", "destination", "destinationOffset", "offset", "min", "max", "b", "(Lob/e;Ljava/nio/ByteBuffer;JJJJ)J", "ktor-io"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class o {
    public static final pb.a a(pb.a aVar) {
        hc.t.e(aVar, "<this>");
        while (true) {
            pb.a M0 = aVar.M0();
            if (M0 == null) {
                return aVar;
            }
            aVar = M0;
        }
    }

    public static final long b(e eVar, ByteBuffer byteBuffer, long j10, long j11, long j12, long j13) {
        hc.t.e(eVar, "$this$peekTo");
        hc.t.e(byteBuffer, "destination");
        long min = Math.min(byteBuffer.limit() - j10, Math.min(j13, eVar.s() - eVar.p()));
        lb.c.d(eVar.n(), byteBuffer, eVar.p() + j11, min, j10);
        return min;
    }

    public static final void c(pb.a aVar, rb.f<pb.a> fVar) {
        hc.t.e(fVar, "pool");
        while (aVar != null) {
            pb.a K0 = aVar.K0();
            aVar.c1(fVar);
            aVar = K0;
        }
    }

    public static final void d(f0 f0Var, rb.f<f0> fVar) {
        hc.t.e(f0Var, "<this>");
        hc.t.e(fVar, "pool");
        if (!f0Var.e1()) {
            return;
        }
        pb.a O0 = f0Var.O0();
        rb.f<pb.a> R0 = f0Var.R0();
        if (R0 == null) {
            R0 = fVar;
        }
        if (!(O0 instanceof f0)) {
            R0.B0(f0Var);
            return;
        }
        f0Var.i1();
        ((f0) O0).c1(fVar);
    }

    public static final long e(pb.a aVar) {
        hc.t.e(aVar, "<this>");
        return f(aVar, 0L);
    }

    private static final long f(pb.a aVar, long j10) {
        do {
            j10 += aVar.s() - aVar.p();
            aVar = aVar.M0();
        } while (aVar != null);
        return j10;
    }
}
