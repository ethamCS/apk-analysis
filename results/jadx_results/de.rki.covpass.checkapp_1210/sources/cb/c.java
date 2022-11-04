package cb;

import cb.b;
import hc.t;
import kotlin.Metadata;
import ob.d0;
import ob.i0;
import ob.k0;
import ob.r;
import ob.u;
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¨\u0006\u0003"}, d2 = {"Lcb/b$b;", "Lcb/a;", "a", "ktor-http-cio"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class c {
    public static final a a(b.C0088b c0088b) {
        t.e(c0088b, "<this>");
        if (c0088b.b().length < 2) {
            return null;
        }
        r a10 = k0.a(0);
        try {
            i0.d(a10, c0088b.b(), 0, 0, 6, null);
            u q12 = a10.q1();
            return new a(d0.a(q12), ob.a.l1(q12, 0, 0, 3, null));
        } catch (Throwable th2) {
            a10.z0();
            throw th2;
        }
    }
}
