package s7;

import hc.t;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import s7.f;
@Metadata(bv = {}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0001\tBa\b\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u001c\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0010\u0012\b\b\u0002\u0010 \u001a\u00020\u0010\u0012\b\b\u0002\u0010!\u001a\u00020\u0010¢\u0006\u0004\b\"\u0010#J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\n\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\n\u001a\u00020\u0002H\u0016J\b\u0010\u000b\u001a\u00020\u0006H\u0016R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006$"}, d2 = {"Ls7/j;", "Ls7/i;", "Ltb/e0;", "b", BuildConfig.FLAVOR, "host", BuildConfig.FLAVOR, "g", "Lq7/f;", "a", "c", "f", "Ls7/f$b;", "e", "()Ls7/f$b;", "response", BuildConfig.FLAVOR, "d", "()J", "cacheSyncAge", "Ls7/f;", "sntpClient", "Lq7/b;", "deviceClock", "Ls7/g;", "responseCache", "Lq7/g;", "ntpSyncListener", BuildConfig.FLAVOR, "ntpHosts", "requestTimeoutMs", "minWaitTimeBetweenSyncMs", "cacheExpirationMs", "maxNtpResponseTimeMs", "<init>", "(Ls7/f;Lq7/b;Ls7/g;Lq7/g;Ljava/util/List;JJJJ)V", "kronos-java"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class j implements i {

    /* renamed from: a */
    private final AtomicReference<a> f21511a = new AtomicReference<>(a.IDLE);

    /* renamed from: b */
    private final AtomicLong f21512b = new AtomicLong(0);

    /* renamed from: c */
    private final ExecutorService f21513c = Executors.newSingleThreadExecutor(b.f21527a);

    /* renamed from: d */
    private final f f21514d;

    /* renamed from: e */
    private final q7.b f21515e;

    /* renamed from: f */
    private final g f21516f;

    /* renamed from: g */
    private final q7.g f21517g;

    /* renamed from: h */
    private final List<String> f21518h;

    /* renamed from: i */
    private final long f21519i;

    /* renamed from: j */
    private final long f21520j;

    /* renamed from: k */
    private final long f21521k;

    /* renamed from: l */
    private final long f21522l;

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Ls7/j$a;", BuildConfig.FLAVOR, "<init>", "(Ljava/lang/String;I)V", "IDLE", "SYNCING", "STOPPED", "kronos-java"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes.dex */
    public enum a {
        IDLE,
        SYNCING,
        STOPPED
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Ljava/lang/Thread;", "kotlin.jvm.PlatformType", "it", "Ljava/lang/Runnable;", "newThread"}, k = 3, mv = {1, 4, 0})
    /* loaded from: classes.dex */
    public static final class b implements ThreadFactory {

        /* renamed from: a */
        public static final b f21527a = new b();

        b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable, "kronos-android");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/e0;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: classes.dex */
    public static final class c implements Runnable {
        c() {
            j.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            j.this.f();
        }
    }

    public j(f fVar, q7.b bVar, g gVar, q7.g gVar2, List<String> list, long j10, long j11, long j12, long j13) {
        t.e(fVar, "sntpClient");
        t.e(bVar, "deviceClock");
        t.e(gVar, "responseCache");
        t.e(list, "ntpHosts");
        this.f21514d = fVar;
        this.f21515e = bVar;
        this.f21516f = gVar;
        this.f21517g = gVar2;
        this.f21518h = list;
        this.f21519i = j10;
        this.f21520j = j11;
        this.f21521k = j12;
        this.f21522l = j13;
    }

    private final void b() {
        if (this.f21511a.get() != a.STOPPED) {
            return;
        }
        throw new IllegalStateException("Service already shutdown");
    }

    private final long d() {
        return this.f21515e.d() - this.f21512b.get();
    }

    private final f.b e() {
        f.b bVar = this.f21516f.get();
        if (this.f21511a.get() == a.IDLE && bVar != null && !bVar.f()) {
            this.f21516f.clear();
            return null;
        }
        return bVar;
    }

    private final boolean g(String str) {
        AtomicReference<a> atomicReference = this.f21511a;
        a aVar = a.SYNCING;
        if (atomicReference.getAndSet(aVar) != aVar) {
            long d10 = this.f21515e.d();
            q7.g gVar = this.f21517g;
            if (gVar != null) {
                gVar.b(str);
            }
            try {
                f.b d11 = this.f21514d.d(str, Long.valueOf(this.f21519i));
                t.d(d11, "response");
                if (d11.a() < 0) {
                    throw new e("Invalid time " + d11.a() + " received from " + str);
                }
                long d12 = this.f21515e.d() - d10;
                if (d12 <= this.f21522l) {
                    this.f21516f.a(d11);
                    long d13 = d11.d();
                    q7.g gVar2 = this.f21517g;
                    if (gVar2 != null) {
                        gVar2.c(d13, d12);
                    }
                    return true;
                }
                throw new e("Ignoring response from " + str + " because the network latency (" + d12 + " ms) is longer than the required value (" + this.f21522l + " ms");
            } catch (Throwable th2) {
                try {
                    q7.g gVar3 = this.f21517g;
                    if (gVar3 != null) {
                        gVar3.a(str, th2);
                    }
                    return false;
                } finally {
                    this.f21511a.set(a.IDLE);
                    this.f21512b.set(this.f21515e.d());
                }
            }
        }
        return false;
    }

    @Override // s7.i
    public q7.f a() {
        b();
        f.b e10 = e();
        if (e10 == null) {
            if (d() < this.f21520j) {
                return null;
            }
            c();
            return null;
        }
        long e11 = e10.e();
        if (e11 >= this.f21521k && d() >= this.f21520j) {
            c();
        }
        return new q7.f(e10.a(), Long.valueOf(e11));
    }

    @Override // s7.i
    public void c() {
        b();
        if (this.f21511a.get() != a.SYNCING) {
            this.f21513c.submit(new c());
        }
    }

    public boolean f() {
        b();
        for (String str : this.f21518h) {
            if (g(str)) {
                return true;
            }
        }
        return false;
    }
}
