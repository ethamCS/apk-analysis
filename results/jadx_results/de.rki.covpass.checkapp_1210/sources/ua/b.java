package ua;

import bb.c;
import bf.x;
import hc.t;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lua/b;", "Lbb/d;", "Lbb/c;", "contentType", BuildConfig.FLAVOR, "a", "<init>", "()V", "ktor-client-json"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class b implements bb.d {
    @Override // bb.d
    public boolean a(bb.c cVar) {
        boolean I;
        boolean u10;
        t.e(cVar, "contentType");
        if (c.a.f5792a.a().g(cVar)) {
            return true;
        }
        String jVar = cVar.i().toString();
        I = x.I(jVar, "application/", false, 2, null);
        if (I) {
            u10 = x.u(jVar, "+json", false, 2, null);
            if (u10) {
                return true;
            }
        }
        return false;
    }
}
