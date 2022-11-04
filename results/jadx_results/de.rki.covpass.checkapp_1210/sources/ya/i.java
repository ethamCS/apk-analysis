package ya;

import bb.p;
import hc.t;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import tb.e0;
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u001c\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u001a\u0012\u0010\t\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007\"(\u0010\u000e\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lya/c;", BuildConfig.FLAVOR, "key", BuildConfig.FLAVOR, "value", "Ltb/e0;", "b", "Lbb/c;", "contentType", "a", "getHost", "(Lya/c;)Ljava/lang/String;", "c", "(Lya/c;Ljava/lang/String;)V", "host", "ktor-client-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class i {
    public static final void a(c cVar, bb.c cVar2) {
        t.e(cVar, "<this>");
        t.e(cVar2, "contentType");
        cVar.a().a(p.f5855a.c(), cVar2.toString());
    }

    public static final void b(c cVar, String str, Object obj) {
        t.e(cVar, "<this>");
        t.e(str, "key");
        if (obj == null) {
            return;
        }
        cVar.a().a(str, obj.toString());
        e0 e0Var = e0.f22152a;
    }

    public static final void c(c cVar, String str) {
        t.e(cVar, "<this>");
        t.e(str, "value");
        cVar.g().o(str);
    }
}
