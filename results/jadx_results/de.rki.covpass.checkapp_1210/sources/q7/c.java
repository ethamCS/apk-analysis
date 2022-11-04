package q7;

import hc.t;
import java.util.List;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import s7.j;
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\\\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000bH\u0007¨\u0006\u0014"}, d2 = {"Lq7/c;", BuildConfig.FLAVOR, "Lq7/b;", "localClock", "Lq7/h;", "syncResponseCache", "Lq7/g;", "syncListener", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "ntpHosts", BuildConfig.FLAVOR, "requestTimeoutMs", "minWaitTimeBetweenSyncMs", "cacheExpirationMs", "maxNtpResponseTimeMs", "Lq7/e;", "a", "<init>", "()V", "kronos-java"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a */
    public static final c f19694a = new c();

    private c() {
    }

    @fc.c
    public static final e a(b bVar, h hVar, g gVar, List<String> list, long j10, long j11, long j12, long j13) {
        t.e(bVar, "localClock");
        t.e(hVar, "syncResponseCache");
        t.e(list, "ntpHosts");
        if (!(bVar instanceof e)) {
            return new r7.b(new j(new s7.f(bVar, new s7.d(), new s7.b()), bVar, new s7.h(hVar, bVar), gVar, list, j10, j11, j12, j13), bVar);
        }
        throw new IllegalArgumentException("Local clock should implement Clock instead of KronosClock");
    }
}
