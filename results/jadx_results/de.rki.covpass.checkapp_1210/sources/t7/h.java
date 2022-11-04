package t7;
/* loaded from: classes.dex */
public final class h extends RuntimeException {
    public h(String str) {
        super(str);
    }

    public h(String str, Throwable th2) {
        super(str);
        initCause(th2);
    }
}
