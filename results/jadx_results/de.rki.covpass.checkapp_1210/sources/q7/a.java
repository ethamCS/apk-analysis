package q7;

import android.content.Context;
import android.content.SharedPreferences;
import hc.t;
import java.util.List;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0007JT\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000bH\u0007¨\u0006\u0014"}, d2 = {"Lq7/a;", BuildConfig.FLAVOR, "Lq7/b;", "a", "Landroid/content/Context;", "context", "Lq7/g;", "syncListener", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "ntpHosts", BuildConfig.FLAVOR, "requestTimeoutMs", "minWaitTimeBetweenSyncMs", "cacheExpirationMs", "maxNtpResponseTimeMs", "Lq7/e;", "b", "<init>", "()V", "kronos-android_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public static final a f19693a = new a();

    private a() {
    }

    @fc.c
    public static final b a() {
        return new r7.a();
    }

    @fc.c
    public static final e b(Context context, g gVar, List<String> list, long j10, long j11, long j12, long j13) {
        t.e(context, "context");
        t.e(list, "ntpHosts");
        b a10 = a();
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.lyft.kronos.shared_preferences", 0);
        t.d(sharedPreferences, "context.getSharedPrefere…ME, Context.MODE_PRIVATE)");
        return c.a(a10, new r7.c(sharedPreferences), gVar, list, j10, j11, j12, j13);
    }
}
