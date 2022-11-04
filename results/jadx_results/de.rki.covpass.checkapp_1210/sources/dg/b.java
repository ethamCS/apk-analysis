package dg;

import eg.c;
import hc.t;
import java.io.EOFException;
import kotlin.Metadata;
import nc.m;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¨\u0006\u0003"}, d2 = {"Leg/c;", BuildConfig.FLAVOR, "a", "okhttp-logging-interceptor"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class b {
    public static final boolean a(c cVar) {
        long e10;
        t.e(cVar, "<this>");
        try {
            c cVar2 = new c();
            e10 = m.e(cVar.e1(), 64L);
            cVar.j(cVar2, 0L, e10);
            int i10 = 0;
            while (i10 < 16) {
                i10++;
                if (cVar2.g0()) {
                    return true;
                }
                int V0 = cVar2.V0();
                if (Character.isISOControl(V0) && !Character.isWhitespace(V0)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
