package m;

import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class a extends c {

    /* renamed from: c */
    private static volatile a f16122c;

    /* renamed from: d */
    private static final Executor f16123d = new ExecutorC0243a();

    /* renamed from: e */
    private static final Executor f16124e = new b();

    /* renamed from: a */
    private c f16125a;

    /* renamed from: b */
    private c f16126b;

    /* renamed from: m.a$a */
    /* loaded from: classes.dex */
    static class ExecutorC0243a implements Executor {
        ExecutorC0243a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            a.e().c(runnable);
        }
    }

    /* loaded from: classes.dex */
    static class b implements Executor {
        b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            a.e().a(runnable);
        }
    }

    private a() {
        m.b bVar = new m.b();
        this.f16126b = bVar;
        this.f16125a = bVar;
    }

    public static Executor d() {
        return f16124e;
    }

    public static a e() {
        if (f16122c != null) {
            return f16122c;
        }
        synchronized (a.class) {
            if (f16122c == null) {
                f16122c = new a();
            }
        }
        return f16122c;
    }

    @Override // m.c
    public void a(Runnable runnable) {
        this.f16125a.a(runnable);
    }

    @Override // m.c
    public boolean b() {
        return this.f16125a.b();
    }

    @Override // m.c
    public void c(Runnable runnable) {
        this.f16125a.c(runnable);
    }
}
