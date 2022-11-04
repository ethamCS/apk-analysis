package x;

import java.util.concurrent.Executor;
/* loaded from: classes.dex */
final class b implements Executor {

    /* renamed from: c */
    private static volatile b f25320c;

    b() {
    }

    public static Executor a() {
        if (f25320c != null) {
            return f25320c;
        }
        synchronized (b.class) {
            if (f25320c == null) {
                f25320c = new b();
            }
        }
        return f25320c;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
