package b.c.a;

import android.content.Context;
import android.net.Uri;
import android.net.http.HttpResponseCache;
import android.os.Build;
import b.c.a.j;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
/* loaded from: classes.dex */
public class c0 implements j {

    /* renamed from: b */
    static volatile Object f1283b;

    /* renamed from: c */
    private static final Object f1284c = new Object();
    private static final ThreadLocal<StringBuilder> d = new a();

    /* renamed from: a */
    private final Context f1285a;

    /* loaded from: classes.dex */
    static class a extends ThreadLocal<StringBuilder> {
        a() {
        }

        @Override // java.lang.ThreadLocal
        public StringBuilder initialValue() {
            return new StringBuilder();
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        static Object a(Context context) {
            File b2 = d0.b(context);
            HttpResponseCache installed = HttpResponseCache.getInstalled();
            return installed == null ? HttpResponseCache.install(b2, d0.a(b2)) : installed;
        }
    }

    public c0(Context context) {
        this.f1285a = context.getApplicationContext();
    }

    private static void a(Context context) {
        if (f1283b == null) {
            try {
                synchronized (f1284c) {
                    if (f1283b == null) {
                        f1283b = b.a(context);
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    @Override // b.c.a.j
    public j.a a(Uri uri, int i) {
        String str;
        if (Build.VERSION.SDK_INT >= 14) {
            a(this.f1285a);
        }
        HttpURLConnection a2 = a(uri);
        a2.setUseCaches(true);
        if (i != 0) {
            if (q.a(i)) {
                str = "only-if-cached,max-age=2147483647";
            } else {
                StringBuilder sb = d.get();
                sb.setLength(0);
                if (!q.b(i)) {
                    sb.append("no-cache");
                }
                if (!q.c(i)) {
                    if (sb.length() > 0) {
                        sb.append(',');
                    }
                    sb.append("no-store");
                }
                str = sb.toString();
            }
            a2.setRequestProperty("Cache-Control", str);
        }
        int responseCode = a2.getResponseCode();
        if (responseCode < 300) {
            return new j.a(a2.getInputStream(), d0.a(a2.getHeaderField("X-Android-Response-Source")), a2.getHeaderFieldInt("Content-Length", -1));
        }
        a2.disconnect();
        throw new j.b(responseCode + " " + a2.getResponseMessage(), i, responseCode);
    }

    protected HttpURLConnection a(Uri uri) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri.toString()).openConnection();
        httpURLConnection.setConnectTimeout(15000);
        httpURLConnection.setReadTimeout(20000);
        return httpURLConnection;
    }
}
