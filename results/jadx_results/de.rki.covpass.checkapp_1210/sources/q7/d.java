package q7;

import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import ub.u;
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u000f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\fR\u0017\u0010\u0011\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\f¨\u0006\u0015"}, d2 = {"Lq7/d;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, "NTP_HOSTS", "Ljava/util/List;", "d", "()Ljava/util/List;", BuildConfig.FLAVOR, "CACHE_EXPIRATION_MS", "J", "a", "()J", "MIN_WAIT_TIME_BETWEEN_SYNC_MS", "c", "TIMEOUT_MS", "e", "MAX_NTP_RESPONSE_TIME_MS", "b", "<init>", "()V", "kronos-java"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a */
    private static final List<String> f19695a;

    /* renamed from: b */
    private static final long f19696b;

    /* renamed from: c */
    private static final long f19697c;

    /* renamed from: d */
    private static final long f19698d;

    /* renamed from: e */
    private static final long f19699e;

    /* renamed from: f */
    public static final d f19700f = new d();

    static {
        List<String> k10;
        k10 = u.k("0.pool.ntp.org", "1.pool.ntp.org", "2.pool.ntp.org", "3.pool.ntp.org");
        f19695a = k10;
        TimeUnit timeUnit = TimeUnit.MINUTES;
        f19696b = timeUnit.toMillis(1L);
        f19697c = timeUnit.toMillis(1L);
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        f19698d = timeUnit2.toMillis(6L);
        f19699e = timeUnit2.toMillis(5L);
    }

    private d() {
    }

    public final long a() {
        return f19696b;
    }

    public final long b() {
        return f19699e;
    }

    public final long c() {
        return f19697c;
    }

    public final List<String> d() {
        return f19695a;
    }

    public final long e() {
        return f19698d;
    }
}
