package bb;

import java.nio.charset.Charset;
import kotlin.Metadata;
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002\u001a\u0012\u0010\u0006\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0002*\u00020\u0005¨\u0006\u0007"}, d2 = {"Lbb/c;", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", "charset", "b", "Lbb/j;", "a", "ktor-http"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class e {
    public static final Charset a(j jVar) {
        hc.t.e(jVar, "<this>");
        String c10 = jVar.c("charset");
        if (c10 != null) {
            try {
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        return Charset.forName(c10);
    }

    public static final c b(c cVar, Charset charset) {
        hc.t.e(cVar, "<this>");
        hc.t.e(charset, "charset");
        return cVar.h("charset", mb.a.i(charset));
    }
}
