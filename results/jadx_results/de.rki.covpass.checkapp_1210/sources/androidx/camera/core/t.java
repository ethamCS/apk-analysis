package androidx.camera.core;
/* loaded from: classes.dex */
public abstract class t {

    /* loaded from: classes.dex */
    public static abstract class a {
        public static a a(int i10) {
            return b(i10, null);
        }

        public static a b(int i10, Throwable th2) {
            return new g(i10, th2);
        }

        public abstract Throwable c();

        public abstract int d();
    }

    /* loaded from: classes.dex */
    public enum b {
        PENDING_OPEN,
        OPENING,
        OPEN,
        CLOSING,
        CLOSED
    }

    public static t a(b bVar) {
        return b(bVar, null);
    }

    public static t b(b bVar, a aVar) {
        return new f(bVar, aVar);
    }

    public abstract a c();

    public abstract b d();
}
