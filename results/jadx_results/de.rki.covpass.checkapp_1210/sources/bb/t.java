package bb;

import java.nio.charset.Charset;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u001a\f\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000\u001a\f\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0003\u001a\u0012\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006*\u00020\u0003\u001a\f\u0010\t\u001a\u0004\u0018\u00010\b*\u00020\u0003\u001a\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n*\u00020\u0003¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lbb/s;", "Lbb/c;", "d", "Lbb/r;", "c", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", "a", BuildConfig.FLAVOR, "e", BuildConfig.FLAVOR, "b", "(Lbb/r;)Ljava/lang/Long;", "ktor-http"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class t {
    public static final Charset a(r rVar) {
        hc.t.e(rVar, "<this>");
        c c10 = c(rVar);
        if (c10 == null) {
            return null;
        }
        return e.a(c10);
    }

    public static final Long b(r rVar) {
        hc.t.e(rVar, "<this>");
        String e10 = rVar.a().e(p.f5855a.f());
        if (e10 == null) {
            return null;
        }
        return Long.valueOf(Long.parseLong(e10));
    }

    public static final c c(r rVar) {
        hc.t.e(rVar, "<this>");
        String e10 = rVar.a().e(p.f5855a.g());
        if (e10 == null) {
            return null;
        }
        return c.Companion.b(e10);
    }

    public static final c d(s sVar) {
        hc.t.e(sVar, "<this>");
        String g10 = sVar.a().g(p.f5855a.g());
        if (g10 == null) {
            return null;
        }
        return c.Companion.b(g10);
    }

    public static final String e(r rVar) {
        hc.t.e(rVar, "<this>");
        return rVar.a().e(p.f5855a.h());
    }
}
