package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public abstract class e {

    /* loaded from: classes.dex */
    public enum a {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY
    }

    /* loaded from: classes.dex */
    public enum b {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        public boolean a(b bVar) {
            return compareTo(bVar) >= 0;
        }
    }

    public e() {
        new AtomicReference();
    }

    public abstract void a(h hVar);

    public abstract b b();

    public abstract void c(h hVar);
}
