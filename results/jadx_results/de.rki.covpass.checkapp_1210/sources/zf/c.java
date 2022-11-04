package zf;

import android.util.Log;
import bf.a0;
import bf.y;
import hc.t;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import of.x;
import org.conscrypt.BuildConfig;
import ub.q0;
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J1\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u0010\u001a\u00020\u0007¨\u0006\u0013"}, d2 = {"Lzf/c;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "loggerName", "d", "logger", "tag", "Ltb/e0;", "c", BuildConfig.FLAVOR, "logLevel", "message", BuildConfig.FLAVOR, "t", "a", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;)V", "b", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a */
    public static final c f26729a = new c();

    /* renamed from: b */
    private static final CopyOnWriteArraySet<Logger> f26730b = new CopyOnWriteArraySet<>();

    /* renamed from: c */
    private static final Map<String, String> f26731c;

    static {
        Map<String, String> s10;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r12 = x.class.getPackage();
        String name = r12 == null ? null : r12.getName();
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        String name2 = x.class.getName();
        t.d(name2, "OkHttpClient::class.java.name");
        linkedHashMap.put(name2, "okhttp.OkHttpClient");
        String name3 = wf.e.class.getName();
        t.d(name3, "Http2::class.java.name");
        linkedHashMap.put(name3, "okhttp.Http2");
        String name4 = sf.e.class.getName();
        t.d(name4, "TaskRunner::class.java.name");
        linkedHashMap.put(name4, "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        s10 = q0.s(linkedHashMap);
        f26731c = s10;
    }

    private c() {
    }

    private final void c(String str, String str2) {
        Logger logger = Logger.getLogger(str);
        if (f26730b.add(logger)) {
            logger.setUseParentHandlers(false);
            logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
            logger.addHandler(d.f26732a);
        }
    }

    private final String d(String str) {
        String Y0;
        String str2 = f26731c.get(str);
        if (str2 == null) {
            Y0 = a0.Y0(str, 23);
            return Y0;
        }
        return str2;
    }

    public final void a(String str, int i10, String str2, Throwable th2) {
        int Z;
        int min;
        t.e(str, "loggerName");
        t.e(str2, "message");
        String d10 = d(str);
        if (Log.isLoggable(d10, i10)) {
            if (th2 != null) {
                str2 = str2 + '\n' + ((Object) Log.getStackTraceString(th2));
            }
            int i11 = 0;
            int length = str2.length();
            while (i11 < length) {
                Z = y.Z(str2, '\n', i11, false, 4, null);
                if (Z == -1) {
                    Z = length;
                }
                while (true) {
                    min = Math.min(Z, i11 + 4000);
                    String substring = str2.substring(i11, min);
                    t.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(i10, d10, substring);
                    if (min >= Z) {
                        break;
                    }
                    i11 = min;
                }
                i11 = min + 1;
            }
        }
    }

    public final void b() {
        for (Map.Entry<String, String> entry : f26731c.entrySet()) {
            c(entry.getKey(), entry.getValue());
        }
    }
}
