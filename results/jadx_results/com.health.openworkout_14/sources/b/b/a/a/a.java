package b.b.a.a;

import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class a extends c {

    /* renamed from: c */
    private static volatile a f2091c;

    /* renamed from: d */
    private static final Executor f2092d = new ExecutorC0038a();

    /* renamed from: a */
    private c f2093a;

    /* renamed from: b */
    private c f2094b;

    /* renamed from: b.b.a.a.a$a */
    /* loaded from: classes.dex */
    static class ExecutorC0038a implements Executor {
        ExecutorC0038a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            a.d().a(runnable);
        }
    }

    private a() {
        b bVar = new b();
        this.f2094b = bVar;
        this.f2093a = bVar;
    }

    public static Executor c() {
        return f2092d;
    }

    public static a d() {
        if (f2091c != null) {
            return f2091c;
        }
        synchronized (a.class) {
            if (f2091c == null) {
                f2091c = new a();
            }
        }
        return f2091c;
    }

    @Override // b.b.a.a.c
    public void a(Runnable runnable) {
        this.f2093a.a(runnable);
    }

    @Override // b.b.a.a.c
    public boolean b() {
        return this.f2093a.b();
    }
}
