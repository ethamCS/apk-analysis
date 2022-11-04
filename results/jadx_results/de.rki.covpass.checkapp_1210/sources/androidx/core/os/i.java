package androidx.core.os;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;
@Deprecated
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a */
    private static long f3500a;

    /* renamed from: b */
    private static Method f3501b;

    /* renamed from: c */
    private static Method f3502c;

    /* renamed from: d */
    private static Method f3503d;

    /* renamed from: e */
    private static Method f3504e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {
        static void a(String str) {
            Trace.beginSection(str);
        }

        static void b() {
            Trace.endSection();
        }
    }

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f3500a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                f3501b = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                f3502c = Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                f3503d = Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                f3504e = Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception e10) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e10);
            }
        }
    }

    public static void a(String str) {
        a.a(str);
    }

    public static void b() {
        a.b();
    }
}
