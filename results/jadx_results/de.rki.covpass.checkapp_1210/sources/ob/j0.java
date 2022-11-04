package ob;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0014\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¨\u0006\u0006"}, d2 = {"Lob/h0;", BuildConfig.FLAVOR, "value", "Ltb/e0;", "a", "b", "ktor-io"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class j0 {
    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(ob.h0 r4, short r5) {
        /*
            java.lang.String r0 = "<this>"
            hc.t.e(r4, r0)
            boolean r0 = r4 instanceof ob.c
            if (r0 == 0) goto L26
            r0 = r4
            ob.c r0 = (ob.c) r0
            int r1 = r0.h0()
            int r2 = r0.W()
            int r2 = r2 - r1
            r3 = 2
            if (r2 <= r3) goto L26
            int r2 = r1 + 2
            r0.R0(r2)
            java.nio.ByteBuffer r0 = r0.f0()
            r0.putShort(r1, r5)
            r0 = 1
            goto L27
        L26:
            r0 = 0
        L27:
            if (r0 != 0) goto L2c
            b(r4, r5)
        L2c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ob.j0.a(ob.h0, short):void");
    }

    private static final void b(h0 h0Var, short s10) {
        boolean z10;
        if (h0Var instanceof c) {
            c cVar = (c) h0Var;
            m.f(cVar.w0(2), s10);
            cVar.e();
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            h0Var.q0((byte) (s10 >>> 8));
            h0Var.q0((byte) (s10 & 255));
        }
    }
}
