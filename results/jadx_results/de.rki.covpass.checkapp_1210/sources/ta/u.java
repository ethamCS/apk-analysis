package ta;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import ta.t;
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u001a\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u001a\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u001a\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0007\u001a\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0007¨\u0006\r"}, d2 = {"Lya/d;", "request", BuildConfig.FLAVOR, "cause", "Leb/a;", "a", "Leb/b;", "b", BuildConfig.FLAVOR, "timeout", BuildConfig.FLAVOR, "c", "d", "ktor-client-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class u {
    public static final eb.a a(ya.d dVar, Throwable th2) {
        Long c10;
        hc.t.e(dVar, "request");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Connect timeout has expired [url=");
        sb2.append(dVar.h());
        sb2.append(", connect_timeout=");
        t.b bVar = (t.b) dVar.c(t.f22120d);
        Object obj = "unknown";
        if (bVar != null && (c10 = bVar.c()) != null) {
            obj = c10;
        }
        sb2.append(obj);
        sb2.append(" ms]");
        return new eb.a(sb2.toString(), th2);
    }

    public static final eb.b b(ya.d dVar, Throwable th2) {
        Long e10;
        hc.t.e(dVar, "request");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Socket timeout has expired [url=");
        sb2.append(dVar.h());
        sb2.append(", socket_timeout=");
        t.b bVar = (t.b) dVar.c(t.f22120d);
        Object obj = "unknown";
        if (bVar != null && (e10 = bVar.e()) != null) {
            obj = e10;
        }
        sb2.append(obj);
        sb2.append("] ms");
        return new eb.b(sb2.toString(), th2);
    }

    public static final int c(long j10) {
        if (j10 == Long.MAX_VALUE) {
            return 0;
        }
        if (j10 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        if (j10 <= 2147483647L) {
            return (int) j10;
        }
        return Integer.MAX_VALUE;
    }

    public static final long d(long j10) {
        if (j10 == Long.MAX_VALUE) {
            return 0L;
        }
        return j10;
    }
}
