package a.b.a.a;

import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class a extends c {

    /* renamed from: c */
    private static volatile a f50c;

    /* renamed from: a */
    private c f51a;

    /* renamed from: b */
    private c f52b;

    /* renamed from: a.b.a.a.a$a */
    /* loaded from: classes.dex */
    static class ExecutorC0003a implements Executor {
        ExecutorC0003a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            a.b().b(runnable);
        }
    }

    /* loaded from: classes.dex */
    static class b implements Executor {
        b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            a.b().a(runnable);
        }
    }

    static {
        new ExecutorC0003a();
        new b();
    }

    private a() {
        a.b.a.a.b bVar = new a.b.a.a.b();
        this.f52b = bVar;
        this.f51a = bVar;
    }

    public static a b() {
        if (f50c != null) {
            return f50c;
        }
        synchronized (a.class) {
            if (f50c == null) {
                f50c = new a();
            }
        }
        return f50c;
    }

    @Override // a.b.a.a.c
    public void a(Runnable runnable) {
        this.f51a.a(runnable);
    }

    @Override // a.b.a.a.c
    public boolean a() {
        return this.f51a.a();
    }

    @Override // a.b.a.a.c
    public void b(Runnable runnable) {
        this.f51a.b(runnable);
    }
}
