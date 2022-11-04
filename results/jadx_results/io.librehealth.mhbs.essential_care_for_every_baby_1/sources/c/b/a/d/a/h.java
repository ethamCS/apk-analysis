package c.b.a.d.a;

import java.lang.Thread;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a */
    private String f434a = null;

    /* renamed from: b */
    private Boolean f435b = null;

    /* renamed from: c */
    private Integer f436c = null;

    /* renamed from: d */
    private Thread.UncaughtExceptionHandler f437d = null;

    /* renamed from: e */
    private ThreadFactory f438e = null;

    /* loaded from: classes.dex */
    public class a implements ThreadFactory {

        /* renamed from: a */
        final /* synthetic */ ThreadFactory f439a;

        /* renamed from: b */
        final /* synthetic */ String f440b;

        /* renamed from: c */
        final /* synthetic */ AtomicLong f441c;

        /* renamed from: d */
        final /* synthetic */ Boolean f442d;

        /* renamed from: e */
        final /* synthetic */ Integer f443e;
        final /* synthetic */ Thread.UncaughtExceptionHandler f;

        a(ThreadFactory threadFactory, String str, AtomicLong atomicLong, Boolean bool, Integer num, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f439a = threadFactory;
            this.f440b = str;
            this.f441c = atomicLong;
            this.f442d = bool;
            this.f443e = num;
            this.f = uncaughtExceptionHandler;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = this.f439a.newThread(runnable);
            String str = this.f440b;
            if (str != null) {
                newThread.setName(h.d(str, Long.valueOf(this.f441c.getAndIncrement())));
            }
            Boolean bool = this.f442d;
            if (bool != null) {
                newThread.setDaemon(bool.booleanValue());
            }
            Integer num = this.f443e;
            if (num != null) {
                newThread.setPriority(num.intValue());
            }
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f;
            if (uncaughtExceptionHandler != null) {
                newThread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
            }
            return newThread;
        }
    }

    private static ThreadFactory c(h hVar) {
        String str = hVar.f434a;
        Boolean bool = hVar.f435b;
        Integer num = hVar.f436c;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = hVar.f437d;
        ThreadFactory threadFactory = hVar.f438e;
        if (threadFactory == null) {
            threadFactory = Executors.defaultThreadFactory();
        }
        return new a(threadFactory, str, str != null ? new AtomicLong(0L) : null, bool, num, uncaughtExceptionHandler);
    }

    public static String d(String str, Object... objArr) {
        return String.format(Locale.ROOT, str, objArr);
    }

    public ThreadFactory b() {
        return c(this);
    }

    public h e(String str) {
        d(str, 0);
        this.f434a = str;
        return this;
    }

    public h f(int i) {
        boolean z = false;
        c.b.a.a.i.d(i >= 1, "Thread priority (%s) must be >= %s", i, 1);
        if (i <= 10) {
            z = true;
        }
        c.b.a.a.i.d(z, "Thread priority (%s) must be <= %s", i, 10);
        this.f436c = Integer.valueOf(i);
        return this;
    }
}
